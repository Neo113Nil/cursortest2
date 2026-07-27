package E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f2177d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f2178e;

    /* renamed from: i, reason: collision with root package name */
    public static final c f2179i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ c[] f2180j;

    static {
        c cVar = new c("Focused", 0);
        f2177d = cVar;
        c cVar2 = new c("UnfocusedEmpty", 1);
        f2178e = cVar2;
        c cVar3 = new c("UnfocusedNotEmpty", 2);
        f2179i = cVar3;
        f2180j = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2180j.clone();
    }
}
