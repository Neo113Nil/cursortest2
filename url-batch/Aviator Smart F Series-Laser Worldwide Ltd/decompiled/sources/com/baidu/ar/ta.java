package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelType;

/* loaded from: classes.dex */
public class ta extends o4 {

    /* renamed from: l, reason: collision with root package name */
    public static final String f3313l = "ta";

    /* renamed from: i, reason: collision with root package name */
    public sa f3314i;

    /* renamed from: j, reason: collision with root package name */
    public xa f3315j;

    /* renamed from: k, reason: collision with root package name */
    public HandlerThread f3316k;

    public class a implements ra {
        public a() {
        }

        @Override // com.baidu.ar.ra
        public void a(wa waVar) {
            if (ta.this.f2181b == null || waVar == null) {
                return;
            }
            ta.this.f2181b.a(new ya(ta.this.getName(), waVar));
        }

        @Override // com.baidu.ar.ra
        public void onRelease(boolean z7) {
            if (ta.this.f2181b != null) {
                ta.this.f2181b.b(new kb(ta.this.getName(), z7));
            }
        }

        @Override // com.baidu.ar.ra
        public void onSetup(boolean z7) {
            if (ta.this.f2181b != null) {
                ta.this.f2181b.a(new kb(ta.this.getName(), z7));
            }
        }
    }

    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Runnable runnable = (Runnable) message.obj;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ta() {
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.NV21);
        this.f2878e = pixelReadParams;
        pixelReadParams.setOutputWidth(1280);
        this.f2878e.setOutputHeight(720);
    }

    public final ra g() {
        return new a();
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return f3313l;
    }

    public void a(xa xaVar) {
        this.f3315j = xaVar;
    }

    public final void b(FramePixels framePixels) {
        if (this.f3314i != null) {
            ua uaVar = new ua(framePixels.getPixelsAddress(), framePixels.getTimestamp());
            PixelReadParams pixelReadParams = this.f2878e;
            if (pixelReadParams != null) {
                uaVar.b(pixelReadParams.getAlgoWidth());
                uaVar.a(this.f2878e.getAlgoHeight());
            }
            this.f3314i.b(uaVar);
        }
    }

    @Override // com.baidu.ar.o4
    public void e() {
        sa saVar = this.f3314i;
        if (saVar != null) {
            saVar.c();
            this.f3314i = null;
        }
        this.f3315j = null;
    }

    @Override // com.baidu.ar.o4
    public void f() {
        if (this.f2878e == null) {
            h.b(f3313l, "setupFrameDetector mRecgParams is NULLLL");
            return;
        }
        if (this.f3314i == null) {
            this.f3314i = sa.a();
        }
        this.f3314i.a(this.f3315j, g());
        HandlerThread handlerThread = new HandlerThread(f3313l);
        this.f3316k = handlerThread;
        handlerThread.start();
        new b(this.f3316k.getLooper());
    }

    @Override // com.baidu.ar.o4
    public boolean a(FramePixels framePixels) {
        b(framePixels);
        return true;
    }
}
