package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w6 implements Choreographer.FrameCallback {
    public final /* synthetic */ le0 OPXfSBeufaJ8;
    public final /* synthetic */ bi rtx2ld2ELZv4;

    public w6(bi biVar, x6 x6Var, le0 le0Var) {
        this.rtx2ld2ELZv4 = biVar;
        this.OPXfSBeufaJ8 = le0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object uv1Var;
        try {
            uv1Var = this.OPXfSBeufaJ8.OPXfSBeufaJ8(Long.valueOf(j));
        } catch (Throwable th) {
            uv1Var = new uv1(th);
        }
        this.rtx2ld2ELZv4.RAsUl2FVSrh6(uv1Var);
    }
}
