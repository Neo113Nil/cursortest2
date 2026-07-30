package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static final z f9467f;

    /* renamed from: g, reason: collision with root package name */
    public static final z f9468g;

    /* renamed from: h, reason: collision with root package name */
    public static final z f9469h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ z[] f9470i;

    static {
        z zVar = new z("Cursor", 0);
        f9467f = zVar;
        z zVar2 = new z("SelectionStart", 1);
        f9468g = zVar2;
        z zVar3 = new z("SelectionEnd", 2);
        f9469h = zVar3;
        f9470i = new z[]{zVar, zVar2, zVar3};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f9470i.clone();
    }
}
