package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsm {
    public static final gsm a;
    public static final gsm b;
    public static final gsm c;
    private static final /* synthetic */ gsm[] d;

    static {
        gsm gsmVar = new gsm("DISABLED", 0);
        a = gsmVar;
        gsm gsmVar2 = new gsm("THROW_ON_FAILURE", 1);
        b = gsmVar2;
        gsm gsmVar3 = new gsm("LOG_ON_FAILURE", 2);
        c = gsmVar3;
        d = new gsm[]{gsmVar, gsmVar2, gsmVar3};
    }

    public static gsm[] values() {
        return (gsm[]) d.clone();
    }
}
