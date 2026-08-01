package b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final r f1090d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r[] f1091e;

    static {
        r rVar = new r("Inherit", 0);
        f1090d = rVar;
        f1091e = new r[]{rVar, new r("SecureOn", 1), new r("SecureOff", 2)};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f1091e.clone();
    }
}
