package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class su0 implements fl1 {
    public static final su0 b = new su0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ su0(int i) {
        this.a = i;
    }

    @Override // defpackage.fl1
    public final f62 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!vu0.class.isAssignableFrom(cls)) {
                    lh.e("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (f62) vu0.d(cls.asSubclass(vu0.class)).c(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.fl1
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return vu0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
