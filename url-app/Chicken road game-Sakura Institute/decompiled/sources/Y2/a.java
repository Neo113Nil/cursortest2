package Y2;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4398d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4399e;

    /* renamed from: i, reason: collision with root package name */
    public static final a f4400i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f4401j;

    static {
        a aVar = new a("SUSPEND", 0);
        f4398d = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f4399e = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f4400i = aVar3;
        a[] entries = {aVar, aVar2, aVar3};
        f4401j = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4401j.clone();
    }
}
