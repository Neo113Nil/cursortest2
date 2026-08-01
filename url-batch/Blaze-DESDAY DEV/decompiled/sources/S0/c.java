package S0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f768a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f769b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f770c;
    public static final c d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f771e;

    static {
        c cVar = new c("PLAYING", 0);
        f768a = cVar;
        c cVar2 = new c("PAUSED", 1);
        f769b = cVar2;
        c cVar3 = new c("GAME_OVER", 2);
        f770c = cVar3;
        c cVar4 = new c("VICTORY", 3);
        d = cVar4;
        f771e = new c[]{cVar, cVar2, cVar3, cVar4};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f771e.clone();
    }
}
