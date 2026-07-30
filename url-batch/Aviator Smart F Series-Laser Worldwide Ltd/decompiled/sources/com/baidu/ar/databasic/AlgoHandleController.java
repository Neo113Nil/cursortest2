package com.baidu.ar.databasic;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AlgoHandleController {

    /* renamed from: a, reason: collision with root package name */
    public final List<Long> f2047a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public boolean f2048b = true;

    /* renamed from: c, reason: collision with root package name */
    public int f2049c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f2050d = 0;

    /* renamed from: e, reason: collision with root package name */
    public HandlerThread f2051e;

    /* renamed from: f, reason: collision with root package name */
    public e f2052f;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IARRenderer f2053a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f2054b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f2055c;

        public a(AlgoHandleController algoHandleController, IARRenderer iARRenderer, long j8, String str) {
            this.f2053a = iARRenderer;
            this.f2054b = j8;
            this.f2055c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IARRenderer iARRenderer = this.f2053a;
            if (iARRenderer != null) {
                iARRenderer.setAlgoHandleData(this.f2054b, this.f2055c);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlgoHandleController.this.a();
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f2057a;

        public c(long j8) {
            this.f2057a = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlgoHandleController.this.f2047a.add(Long.valueOf(this.f2057a));
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f2059a;

        public d(long j8) {
            this.f2059a = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlgoHandleController.this.a(this.f2059a);
        }
    }

    public static final class e extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2061a;

        public e(Looper looper) {
            super(looper);
            this.f2061a = false;
        }

        public void a(int i8, Runnable runnable) {
            if (this.f2061a) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = i8;
            obtain.obj = runnable;
            sendMessage(obtain);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1004) {
                this.f2061a = true;
            }
            Runnable runnable = (Runnable) message.obj;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public AlgoHandleController() {
        if (this.f2051e == null) {
            HandlerThread handlerThread = new HandlerThread("HandleHandlerThread");
            this.f2051e = handlerThread;
            handlerThread.start();
        }
        if (this.f2052f == null) {
            this.f2052f = new e(this.f2051e.getLooper());
        }
    }

    public final int a(long j8) {
        b(j8);
        return AlgoHandleAdapter.destroyHandle(j8);
    }

    public long createHandle() {
        e eVar;
        if (!this.f2048b) {
            return 0L;
        }
        long createHandle = AlgoHandleAdapter.createHandle();
        HandlerThread handlerThread = this.f2051e;
        if (handlerThread != null && handlerThread.isAlive() && (eVar = this.f2052f) != null) {
            eVar.a(1001, new c(createHandle));
        }
        return createHandle;
    }

    public int destroyHandle(long j8) {
        e eVar;
        HandlerThread handlerThread = this.f2051e;
        if (handlerThread == null || !handlerThread.isAlive() || (eVar = this.f2052f) == null) {
            return -1;
        }
        eVar.a(1003, new d(j8));
        return 0;
    }

    public byte[] getHandleMaskData(long j8) {
        return AlgoHandleAdapter.getHandleMaskData(j8);
    }

    public int getHandleReserveData(long j8, ReserveHandleData reserveHandleData) {
        return AlgoHandleAdapter.getHandleReserveData(j8, reserveHandleData);
    }

    public int getHandleType(long j8) {
        return AlgoHandleAdapter.getHandleType(j8);
    }

    public int increaseHandleReference(long j8) {
        return AlgoHandleAdapter.increaseHandleReference(j8);
    }

    public void release() {
        e eVar;
        this.f2048b = false;
        HandlerThread handlerThread = this.f2051e;
        if (handlerThread == null || !handlerThread.isAlive() || (eVar = this.f2052f) == null) {
            return;
        }
        eVar.a(1004, new b());
    }

    public void sendHandleToRenderer(long j8, IARRenderer iARRenderer, String str) {
        e eVar;
        HandlerThread handlerThread = this.f2051e;
        if (handlerThread == null || !handlerThread.isAlive() || (eVar = this.f2052f) == null) {
            return;
        }
        eVar.a(1002, new a(this, iARRenderer, j8, str));
    }

    public int setHandleFaceHandle(long j8, long j9) {
        return AlgoHandleAdapter.setHandleFaceHandle(j8, j9);
    }

    public int setHandleInput(long j8, int i8, long j9, int i9, int i10, int i11, boolean z7, int i12, boolean z8, ByteBuffer byteBuffer) {
        this.f2049c = i8;
        return AlgoHandleAdapter.setHandleInput(j8, i8, j9, i9, i10, i11, z7, i12, z8, byteBuffer);
    }

    public int setHandleMaskThreshold(long j8, float f8) {
        return AlgoHandleAdapter.setHandleMaskThreshold(j8, f8);
    }

    public void setUsingHandle(long j8) {
        this.f2050d = j8;
    }

    public final void b(long j8) {
        try {
            if (this.f2047a.contains(Long.valueOf(j8))) {
                int indexOf = this.f2047a.indexOf(Long.valueOf(j8));
                if (indexOf >= 0) {
                    this.f2047a.remove(indexOf);
                    if (indexOf >= 1) {
                        a(indexOf);
                    }
                } else {
                    h.b("removeHandle cant find:" + j8);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            h.b("removeHandle Exception:" + e8.getMessage());
        }
    }

    public final void a() {
        this.f2048b = false;
        if (this.f2047a.size() > 0) {
            try {
                Iterator<Long> it = this.f2047a.iterator();
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    if (longValue <= 0 || longValue != this.f2050d) {
                        AlgoHandleAdapter.destroyHandle(longValue);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                h.b("release Exception:" + e8.getMessage());
            }
        }
        if (this.f2052f != null) {
            this.f2052f = null;
        }
        HandlerThread handlerThread = this.f2051e;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f2051e = null;
        }
    }

    public final void a(int i8) {
        if (i8 > 5) {
            h.c("type:" + this.f2049c + " destroyIgnoreHandles current size:" + i8);
            for (int i9 = 0; i9 < i8; i9++) {
                long longValue = this.f2047a.get(0).longValue();
                this.f2047a.remove(0);
                AlgoHandleAdapter.destroyHandle(longValue);
            }
        }
    }
}
