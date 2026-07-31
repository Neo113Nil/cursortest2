package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: d, reason: collision with root package name */
    public static final J f6443d;

    /* renamed from: e, reason: collision with root package name */
    public static final J f6444e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ J[] f6445f;

    static {
        J j3 = new J("Vertical", 0);
        f6443d = j3;
        J j4 = new J("Horizontal", 1);
        f6444e = j4;
        f6445f = new J[]{j3, j4};
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f6445f.clone();
    }
}
