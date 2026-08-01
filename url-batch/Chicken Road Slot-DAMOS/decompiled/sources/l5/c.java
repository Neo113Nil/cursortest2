package l5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f5863d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f5864e;

    /* renamed from: i, reason: collision with root package name */
    public static final c f5865i;

    /* renamed from: r, reason: collision with root package name */
    public static final c f5866r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f5867s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c[] f5868t;

    static {
        c cVar = new c("END", 0);
        f5863d = cVar;
        c cVar2 = new c("ROLLBACK", 1);
        f5864e = cVar2;
        c cVar3 = new c("BEGIN_EXCLUSIVE", 2);
        f5865i = cVar3;
        c cVar4 = new c("BEGIN_IMMEDIATE", 3);
        f5866r = cVar4;
        c cVar5 = new c("BEGIN_DEFERRED", 4);
        f5867s = cVar5;
        f5868t = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5868t.clone();
    }
}
