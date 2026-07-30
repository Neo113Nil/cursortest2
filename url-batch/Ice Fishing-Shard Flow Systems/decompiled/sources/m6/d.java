package m6;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f6590e;

    /* renamed from: i, reason: collision with root package name */
    public static final d f6591i;

    /* renamed from: l, reason: collision with root package name */
    public static final d f6592l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f6593m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f6594n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f6595o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ d[] f6596p;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f6597d;

    static {
        d dVar = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f6590e = dVar;
        d dVar2 = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        d dVar3 = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f6591i = dVar3;
        d dVar4 = new d("SECONDS", 3, TimeUnit.SECONDS);
        f6592l = dVar4;
        d dVar5 = new d("MINUTES", 4, TimeUnit.MINUTES);
        f6593m = dVar5;
        d dVar6 = new d("HOURS", 5, TimeUnit.HOURS);
        f6594n = dVar6;
        d dVar7 = new d("DAYS", 6, TimeUnit.DAYS);
        f6595o = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        f6596p = dVarArr;
        d4.c.o(dVarArr);
    }

    public d(String str, int i2, TimeUnit timeUnit) {
        this.f6597d = timeUnit;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f6596p.clone();
    }
}
