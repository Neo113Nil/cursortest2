package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ej implements ym0, eu0 {
    public final /* synthetic */ kj m;

    public ej(kj kjVar) {
        this.m = kjVar;
    }

    @Override // defpackage.eu0
    public final tt0 b() {
        return new s4(2, 4, kj.class, this.m, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    @Override // defpackage.ym0
    public final Object d(Object obj, o30 o30Var) {
        this.m.k((cj) obj);
        Unit unit = Unit.a;
        b50 b50Var = b50.m;
        return unit;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ym0) && (obj instanceof eu0)) {
            return b().equals(((eu0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
