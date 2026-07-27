package d3;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f6099d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f6100e;

    /* renamed from: i, reason: collision with root package name */
    public static final b f6101i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f6102j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f6103k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f6104l;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f6099d = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f6100e = bVar2;
        b bVar3 = new b("PARKING", 2);
        f6101i = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f6102j = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f6103k = bVar5;
        b[] entries = {bVar, bVar2, bVar3, bVar4, bVar5};
        f6104l = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6104l.clone();
    }
}
