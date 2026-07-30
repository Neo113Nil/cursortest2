package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class th1 implements fl1 {
    public fl1[] a;

    @Override // defpackage.fl1
    public final f62 a(Class cls) {
        for (fl1 fl1Var : this.a) {
            if (fl1Var.b(cls)) {
                return fl1Var.a(cls);
            }
        }
        ch2.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.fl1
    public final boolean b(Class cls) {
        for (fl1 fl1Var : this.a) {
            if (fl1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
