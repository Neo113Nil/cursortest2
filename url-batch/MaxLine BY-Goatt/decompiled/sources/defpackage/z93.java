package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z93 implements zm {
    public final /* synthetic */ wv0 a;

    public z93(wv0 wv0Var) {
        this.a = wv0Var;
    }

    @Override // defpackage.zm
    public final void onBackgroundStateChanged(boolean z) {
        bb3 bb3Var = this.a.y;
        bb3Var.sendMessage(bb3Var.obtainMessage(1, Boolean.valueOf(z)));
    }
}
