package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class of implements f10 {
    public static final of a = new of();
    public static Boolean b;

    @Override // defpackage.f10
    public final boolean c() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw qy0.g("canFocus is read before it is written");
    }

    @Override // defpackage.f10
    public final void d(boolean z) {
        b = Boolean.valueOf(z);
    }
}
