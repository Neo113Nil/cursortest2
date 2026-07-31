package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0230o {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0230o f4025d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0230o f4026e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0230o f4027f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0230o f4028g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0230o f4029h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0230o[] f4030i;

    static {
        EnumC0230o enumC0230o = new EnumC0230o("DESTROYED", 0);
        f4025d = enumC0230o;
        EnumC0230o enumC0230o2 = new EnumC0230o("INITIALIZED", 1);
        f4026e = enumC0230o2;
        EnumC0230o enumC0230o3 = new EnumC0230o("CREATED", 2);
        f4027f = enumC0230o3;
        EnumC0230o enumC0230o4 = new EnumC0230o("STARTED", 3);
        f4028g = enumC0230o4;
        EnumC0230o enumC0230o5 = new EnumC0230o("RESUMED", 4);
        f4029h = enumC0230o5;
        f4030i = new EnumC0230o[]{enumC0230o, enumC0230o2, enumC0230o3, enumC0230o4, enumC0230o5};
    }

    public static EnumC0230o valueOf(String str) {
        return (EnumC0230o) Enum.valueOf(EnumC0230o.class, str);
    }

    public static EnumC0230o[] values() {
        return (EnumC0230o[]) f4030i.clone();
    }
}
