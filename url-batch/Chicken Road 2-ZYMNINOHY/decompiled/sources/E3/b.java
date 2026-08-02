package E3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f692a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f693b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f694c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f695d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f696e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f697f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f692a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f693b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f694c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f695d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f696e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f697f = bVarArr;
        O3.d.m(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f697f.clone();
    }
}
