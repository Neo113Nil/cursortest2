package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class elp {
    public static final elp a;
    public static final elp b;
    public static final elp c;
    public static final elp d;
    public static final elp e;
    private static final /* synthetic */ elp[] f;

    static {
        elp elpVar = new elp("WAKELOCK", 0);
        a = elpVar;
        elp elpVar2 = new elp("SYNC", 1);
        b = elpVar2;
        elp elpVar3 = new elp("JOB", 2);
        c = elpVar3;
        elp elpVar4 = new elp("PROCESS", 3);
        d = elpVar4;
        elp elpVar5 = new elp("SENSOR", 4);
        e = elpVar5;
        f = new elp[]{elpVar, elpVar2, elpVar3, elpVar4, elpVar5};
    }

    public static elp[] values() {
        return (elp[]) f.clone();
    }
}
