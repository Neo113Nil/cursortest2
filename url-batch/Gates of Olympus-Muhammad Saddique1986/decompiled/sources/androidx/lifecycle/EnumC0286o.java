package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0286o {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0286o f5226d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0286o f5227e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0286o f5228f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0286o f5229g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0286o f5230h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0286o[] f5231i;

    static {
        EnumC0286o enumC0286o = new EnumC0286o("DESTROYED", 0);
        f5226d = enumC0286o;
        EnumC0286o enumC0286o2 = new EnumC0286o("INITIALIZED", 1);
        f5227e = enumC0286o2;
        EnumC0286o enumC0286o3 = new EnumC0286o("CREATED", 2);
        f5228f = enumC0286o3;
        EnumC0286o enumC0286o4 = new EnumC0286o("STARTED", 3);
        f5229g = enumC0286o4;
        EnumC0286o enumC0286o5 = new EnumC0286o("RESUMED", 4);
        f5230h = enumC0286o5;
        f5231i = new EnumC0286o[]{enumC0286o, enumC0286o2, enumC0286o3, enumC0286o4, enumC0286o5};
    }

    public static EnumC0286o valueOf(String str) {
        return (EnumC0286o) Enum.valueOf(EnumC0286o.class, str);
    }

    public static EnumC0286o[] values() {
        return (EnumC0286o[]) f5231i.clone();
    }
}
