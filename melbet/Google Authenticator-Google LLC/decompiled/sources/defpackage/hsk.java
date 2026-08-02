package defpackage;

import j$.time.Instant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsk implements hsl {
    public static final hsk a;
    private static final /* synthetic */ hsk[] b;

    static {
        hsk hskVar = new hsk();
        a = hskVar;
        b = new hsk[]{hskVar};
    }

    private hsk() {
    }

    public static hsk[] values() {
        return (hsk[]) b.clone();
    }

    @Override // defpackage.hsl
    public final Instant a() {
        return Instant.now();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
