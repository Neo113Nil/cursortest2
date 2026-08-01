package U0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f860a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f861b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f862c;
    public static final /* synthetic */ a[] d;

    static {
        a aVar = new a("EASY", 0);
        f860a = aVar;
        a aVar2 = new a("MEDIUM", 1);
        f861b = aVar2;
        a aVar3 = new a("HARD", 2);
        f862c = aVar3;
        d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
