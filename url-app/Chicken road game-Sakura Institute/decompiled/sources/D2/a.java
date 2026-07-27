package D2;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2163d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2164e;

    /* renamed from: i, reason: collision with root package name */
    public static final a f2165i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f2166j;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f2163d = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f2164e = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f2165i = aVar3;
        a[] entries = {aVar, aVar2, aVar3};
        f2166j = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2166j.clone();
    }
}
