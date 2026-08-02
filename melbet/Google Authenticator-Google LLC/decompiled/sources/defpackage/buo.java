package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class buo extends CountDownTimer {
    final /* synthetic */ bvm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buo(bvm bvmVar) {
        super(30000L, 1000L);
        this.a = bvmVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        start();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        bvm bvmVar = this.a;
        boolean a = bvmVar.h.a();
        bvmVar.Q = a;
        if (a) {
            bvmVar.r();
        }
    }
}
