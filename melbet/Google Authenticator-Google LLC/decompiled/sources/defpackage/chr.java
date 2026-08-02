package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chr {
    public static final chr a;
    public static final chr b;
    public static final chr c;
    private static final /* synthetic */ chr[] d;

    static {
        chr chrVar = new chr("LEGACY", 0);
        a = chrVar;
        chr chrVar2 = new chr("AUTH_INSTANTIATION", 1);
        b = chrVar2;
        chr chrVar3 = new chr("CALLER_INSTANTIATION", 2);
        c = chrVar3;
        d = new chr[]{chrVar, chrVar2, chrVar3};
    }

    public static chr[] values() {
        return (chr[]) d.clone();
    }
}
