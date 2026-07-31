package a7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final v f303d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f304e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f305f;

    /* renamed from: g, reason: collision with root package name */
    public static final v f306g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ v[] f307h;

    static {
        v vVar = new v("DEFAULT", 0);
        f303d = vVar;
        v vVar2 = new v("LAZY", 1);
        f304e = vVar2;
        v vVar3 = new v("ATOMIC", 2);
        f305f = vVar3;
        v vVar4 = new v("UNDISPATCHED", 3);
        f306g = vVar4;
        f307h = new v[]{vVar, vVar2, vVar3, vVar4};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f307h.clone();
    }
}
