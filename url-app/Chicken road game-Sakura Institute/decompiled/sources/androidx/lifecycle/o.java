package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final o f1007f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f1008g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f1009h;

    /* renamed from: i, reason: collision with root package name */
    public static final o f1010i;

    /* renamed from: j, reason: collision with root package name */
    public static final o f1011j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ o[] f1012k;

    static {
        o oVar = new o("DESTROYED", 0);
        f1007f = oVar;
        o oVar2 = new o("INITIALIZED", 1);
        f1008g = oVar2;
        o oVar3 = new o("CREATED", 2);
        f1009h = oVar3;
        o oVar4 = new o("STARTED", 3);
        f1010i = oVar4;
        o oVar5 = new o("RESUMED", 4);
        f1011j = oVar5;
        f1012k = new o[]{oVar, oVar2, oVar3, oVar4, oVar5};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f1012k.clone();
    }
}
