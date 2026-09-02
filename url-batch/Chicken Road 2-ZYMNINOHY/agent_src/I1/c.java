package I1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1126a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f1127b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f1128c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f1129d;

    static {
        c cVar = new c("DEFAULT", 0);
        f1126a = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        f1127b = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f1128c = cVar3;
        f1129d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f1129d.clone();
    }
}
