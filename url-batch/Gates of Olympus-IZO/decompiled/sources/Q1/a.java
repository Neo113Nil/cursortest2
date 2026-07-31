package Q1;

import M1.B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3113d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3114e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f3115f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f3116g;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f3113d = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f3114e = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f3115f = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f3116g = aVarArr;
        B.x(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3116g.clone();
    }
}
