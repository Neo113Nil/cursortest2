package r2;

import M1.B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7304d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f7305e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f7306f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f7307g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f7308h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f7309i;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f7304d = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f7305e = bVar2;
        b bVar3 = new b("PARKING", 2);
        f7306f = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f7307g = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f7308h = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f7309i = bVarArr;
        B.x(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7309i.clone();
    }
}
