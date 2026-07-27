package U2;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f4130e;

    /* renamed from: i, reason: collision with root package name */
    public static final b f4131i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f4132j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f4133k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f4134l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f4135m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b[] f4136n;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f4137d;

    static {
        b bVar = new b("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f4130e = bVar;
        b bVar2 = new b("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b bVar3 = new b("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f4131i = bVar3;
        b bVar4 = new b("SECONDS", 3, TimeUnit.SECONDS);
        f4132j = bVar4;
        b bVar5 = new b("MINUTES", 4, TimeUnit.MINUTES);
        f4133k = bVar5;
        b bVar6 = new b("HOURS", 5, TimeUnit.HOURS);
        f4134l = bVar6;
        b bVar7 = new b("DAYS", 6, TimeUnit.DAYS);
        f4135m = bVar7;
        b[] entries = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        f4136n = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public b(String str, int i2, TimeUnit timeUnit) {
        this.f4137d = timeUnit;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4136n.clone();
    }
}
