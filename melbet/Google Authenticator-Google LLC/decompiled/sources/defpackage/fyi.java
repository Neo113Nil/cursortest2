package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyi {
    public static final fyi a;
    public static final fyi b;
    private static final /* synthetic */ fyi[] c;

    static {
        fyi fyiVar = new fyi("ELIGIBLE", 0);
        a = fyiVar;
        fyi fyiVar2 = new fyi("INELIGIBLE", 1);
        b = fyiVar2;
        c = new fyi[]{fyiVar, fyiVar2};
    }

    public static fyi[] values() {
        return (fyi[]) c.clone();
    }
}
