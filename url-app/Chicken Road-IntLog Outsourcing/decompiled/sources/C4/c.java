package C4;

import java.util.concurrent.TimeUnit;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f395b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f396c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f397d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f398e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f399f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f400g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c[] f401h;

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f402a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f395b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f396c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        f397d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f398e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f399f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        f400g = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f401h = cVarArr;
        AbstractC1477a.n(cVarArr);
    }

    public c(String str, int i2, TimeUnit timeUnit) {
        this.f402a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f401h.clone();
    }
}
