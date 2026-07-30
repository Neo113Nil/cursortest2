package e0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final c f2669f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f2670g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f2671h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c[] f2672i;

    static {
        c cVar = new c("Focused", 0);
        f2669f = cVar;
        c cVar2 = new c("UnfocusedEmpty", 1);
        f2670g = cVar2;
        c cVar3 = new c("UnfocusedNotEmpty", 2);
        f2671h = cVar3;
        f2672i = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2672i.clone();
    }
}
