package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gj implements at2, sl2 {
    public final /* synthetic */ kj a;

    public /* synthetic */ gj(kj kjVar) {
        this.a = kjVar;
    }

    @Override // defpackage.at2
    public void a(Drawable drawable) {
        kj kjVar = this.a;
        kjVar.k(new aj(drawable != null ? kjVar.j(drawable) : null));
    }

    @Override // defpackage.sl2
    public Object i(a72 a72Var) {
        return iv1.z(new jj(this.a.s, 0), a72Var);
    }
}
