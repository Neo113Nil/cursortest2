package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f24b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f25c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f26d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f27e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f28f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e[] f29g;

    static {
        e eVar = new e("DESTROYED", 0);
        f24b = eVar;
        e eVar2 = new e("INITIALIZED", 1);
        f25c = eVar2;
        e eVar3 = new e("CREATED", 2);
        f26d = eVar3;
        e eVar4 = new e("STARTED", 3);
        f27e = eVar4;
        e eVar5 = new e("RESUMED", 4);
        f28f = eVar5;
        f29g = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f29g.clone();
    }
}
