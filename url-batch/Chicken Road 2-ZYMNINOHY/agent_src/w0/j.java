package w0;

import T.e0;
import W.J;
import a0.C0146l;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import io.flutter.embedding.android.KeyboardMap;

/* loaded from: classes.dex */
public final class j implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f15810b;

    public j(k kVar, j0.l lVar) {
        this.f15810b = kVar;
        Handler o = J.o(this);
        this.f15809a = o;
        lVar.A(this, o);
    }

    public final void a(long j4) {
        Surface surface;
        k kVar = this.f15810b;
        c0.q qVar = kVar.f15820Q0;
        if (this != kVar.f15814A1 || kVar.f13814N == null) {
            return;
        }
        if (j4 == Long.MAX_VALUE) {
            kVar.f13792B0 = true;
            return;
        }
        try {
            kVar.C0(j4);
            e0 e0Var = kVar.f15849v1;
            if (!e0Var.equals(e0.f2775d) && !e0Var.equals(kVar.f15850w1)) {
                kVar.f15850w1 = e0Var;
                qVar.b(e0Var);
            }
            kVar.f13796D0.f4070e++;
            u uVar = kVar.f15823T0;
            boolean z = uVar.f15900e != 3;
            uVar.f15900e = 3;
            uVar.f15907l.getClass();
            uVar.f15902g = J.M(SystemClock.elapsedRealtime());
            if (z && (surface = kVar.f15834f1) != null) {
                Handler handler = qVar.f5600a;
                if (handler != null) {
                    handler.post(new RunnableC1489D(qVar, surface, SystemClock.elapsedRealtime()));
                }
                kVar.f15836i1 = true;
            }
            kVar.h0(j4);
        } catch (C0146l e4) {
            kVar.f13794C0 = e4;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i4 = message.arg1;
        int i5 = message.arg2;
        String str = J.f3263a;
        a(((i4 & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & i5));
        return true;
    }
}
