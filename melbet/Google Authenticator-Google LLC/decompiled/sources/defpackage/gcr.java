package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcr {
    public static final gcr a;
    public static final gcr b;
    public static final gcr c;
    private static final /* synthetic */ gcr[] d;

    static {
        gcr gcrVar = new gcr("NONE", 0);
        a = gcrVar;
        gcr gcrVar2 = new gcr("WARN_AT_STARTUP", 1);
        b = gcrVar2;
        gcr gcrVar3 = new gcr("CRASH_AT_STARTUP", 2);
        c = gcrVar3;
        d = new gcr[]{gcrVar, gcrVar2, gcrVar3};
    }

    public static gcr[] values() {
        return (gcr[]) d.clone();
    }
}
