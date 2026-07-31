package G5;

import a.AbstractC0219a;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final c f867g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f868h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f869i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f870j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f871k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f872l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ c[] f873m;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f874f;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f867g = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f868h = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        f869i = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f870j = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f871k = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        f872l = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f873m = cVarArr;
        AbstractC0219a.n(cVarArr);
    }

    public c(String str, int i7, TimeUnit timeUnit) {
        this.f874f = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f873m.clone();
    }
}
