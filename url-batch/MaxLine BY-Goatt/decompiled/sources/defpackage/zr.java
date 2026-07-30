package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zr implements qo0 {
    public static final zr a = new zr();
    public static Boolean b;

    @Override // defpackage.qo0
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw q40.f("canFocus is read before it is written");
    }

    @Override // defpackage.qo0
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }
}
