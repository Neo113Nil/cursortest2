package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kug {
    public static final kug a;
    public static final kug b;
    public static final kug c;
    public static final kug d;
    public static final kug e;
    public static final kug f;
    public static final kug g;
    private static final /* synthetic */ kug[] i;
    public final TimeUnit h;

    static {
        kug kugVar = new kug("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        a = kugVar;
        kug kugVar2 = new kug("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b = kugVar2;
        kug kugVar3 = new kug("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = kugVar3;
        kug kugVar4 = new kug("SECONDS", 3, TimeUnit.SECONDS);
        d = kugVar4;
        kug kugVar5 = new kug("MINUTES", 4, TimeUnit.MINUTES);
        e = kugVar5;
        kug kugVar6 = new kug("HOURS", 5, TimeUnit.HOURS);
        f = kugVar6;
        kug kugVar7 = new kug("DAYS", 6, TimeUnit.DAYS);
        g = kugVar7;
        kug[] kugVarArr = {kugVar, kugVar2, kugVar3, kugVar4, kugVar5, kugVar6, kugVar7};
        i = kugVarArr;
        ixf.k(kugVarArr);
    }

    private kug(String str, int i2, TimeUnit timeUnit) {
        this.h = timeUnit;
    }

    public static kug[] values() {
        return (kug[]) i.clone();
    }
}
