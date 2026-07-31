package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo
@Deprecated
/* loaded from: classes13.dex */
public class SelfDestructiveThread {
    private final int mDestructAfterMillisec;
    private Handler mHandler;
    private final Object mLock;
    private HandlerThread mThread;

    public interface ReplyCallback<T> {
        void onReply(Object obj);
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$1, reason: invalid class name */
    class AnonymousClass1 implements Handler.Callback {
        final /* synthetic */ SelfDestructiveThread this$0;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.this$0.onDestruction();
                return true;
            }
            if (i != 1) {
                return true;
            }
            this.this$0.onInvokeRunnable((Runnable) message.obj);
            return true;
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ Callable val$callable;
        final /* synthetic */ Handler val$calleeHandler;
        final /* synthetic */ ReplyCallback val$reply;

        @Override // java.lang.Runnable
        public void run() {
            final Object obj;
            try {
                obj = this.val$callable.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.val$calleeHandler.post(new Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2.1
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass2.this.val$reply.onReply(obj);
                }
            });
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$3, reason: invalid class name */
    /* loaded from: classes5.dex */
    class AnonymousClass3 implements Runnable {
        final /* synthetic */ Callable val$callable;
        final /* synthetic */ Condition val$cond;
        final /* synthetic */ AtomicReference val$holder;
        final /* synthetic */ ReentrantLock val$lock;
        final /* synthetic */ AtomicBoolean val$running;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.val$holder.set(this.val$callable.call());
            } catch (Exception unused) {
            }
            this.val$lock.lock();
            try {
                this.val$running.set(false);
                this.val$cond.signal();
            } finally {
                this.val$lock.unlock();
            }
        }
    }

    void onInvokeRunnable(Runnable runnable) {
        runnable.run();
        synchronized (this.mLock) {
            this.mHandler.removeMessages(0);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.mDestructAfterMillisec);
        }
    }

    void onDestruction() {
        synchronized (this.mLock) {
            try {
                if (this.mHandler.hasMessages(1)) {
                    return;
                }
                this.mThread.quit();
                this.mThread = null;
                this.mHandler = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
