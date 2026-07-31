package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes11.dex */
public final class AsyncLayoutInflater {
    Handler mHandler;
    InflateThread mInflateThread;
    LayoutInflater mInflater;

    private static class InflateRequest {
        OnInflateFinishedListener callback;
        AsyncLayoutInflater inflater;
        ViewGroup parent;
        int resid;
        View view;
    }

    public interface OnInflateFinishedListener {
        void onInflateFinished(View view, int i, ViewGroup viewGroup);
    }

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$1, reason: invalid class name */
    class AnonymousClass1 implements Handler.Callback {
        final /* synthetic */ AsyncLayoutInflater this$0;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            InflateRequest inflateRequest = (InflateRequest) message.obj;
            if (inflateRequest.view == null) {
                inflateRequest.view = this.this$0.mInflater.inflate(inflateRequest.resid, inflateRequest.parent, false);
            }
            inflateRequest.callback.onInflateFinished(inflateRequest.view, inflateRequest.resid, inflateRequest.parent);
            this.this$0.mInflateThread.releaseRequest(inflateRequest);
            return true;
        }
    }

    private static class BasicInflater extends LayoutInflater {
        private static final String[] sClassPrefixList = {"android.widget.", "android.webkit.", "android.app."};

        BasicInflater(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new BasicInflater(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) {
            View createView;
            for (String str2 : sClassPrefixList) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    private static class InflateThread extends Thread {
        private static final InflateThread sInstance;
        private ArrayBlockingQueue mQueue = new ArrayBlockingQueue(10);
        private Pools.SynchronizedPool mRequestPool = new Pools.SynchronizedPool(10);

        private InflateThread() {
        }

        static {
            InflateThread inflateThread = new InflateThread();
            sInstance = inflateThread;
            inflateThread.start();
        }

        public void runInner() {
            try {
                InflateRequest inflateRequest = (InflateRequest) this.mQueue.take();
                try {
                    inflateRequest.view = inflateRequest.inflater.mInflater.inflate(inflateRequest.resid, inflateRequest.parent, false);
                } catch (RuntimeException e) {
                    Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message.obtain(inflateRequest.inflater.mHandler, 0, inflateRequest).sendToTarget();
            } catch (InterruptedException e2) {
                Log.w("AsyncLayoutInflater", e2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                runInner();
            }
        }

        public void releaseRequest(InflateRequest inflateRequest) {
            inflateRequest.callback = null;
            inflateRequest.inflater = null;
            inflateRequest.parent = null;
            inflateRequest.resid = 0;
            inflateRequest.view = null;
            this.mRequestPool.release(inflateRequest);
        }
    }
}
