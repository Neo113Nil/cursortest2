package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0230i {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0230i f5041a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0230i f5042b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0230i f5043c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0230i f5044d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0230i f5045e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0230i[] f5046f;

    static {
        EnumC0230i enumC0230i = new EnumC0230i("DESTROYED", 0);
        f5041a = enumC0230i;
        EnumC0230i enumC0230i2 = new EnumC0230i("INITIALIZED", 1);
        f5042b = enumC0230i2;
        EnumC0230i enumC0230i3 = new EnumC0230i("CREATED", 2);
        f5043c = enumC0230i3;
        EnumC0230i enumC0230i4 = new EnumC0230i("STARTED", 3);
        f5044d = enumC0230i4;
        EnumC0230i enumC0230i5 = new EnumC0230i("RESUMED", 4);
        f5045e = enumC0230i5;
        f5046f = new EnumC0230i[]{enumC0230i, enumC0230i2, enumC0230i3, enumC0230i4, enumC0230i5};
    }

    public static EnumC0230i valueOf(String str) {
        return (EnumC0230i) Enum.valueOf(EnumC0230i.class, str);
    }

    public static EnumC0230i[] values() {
        return (EnumC0230i[]) f5046f.clone();
    }
}
