package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfh {
    public static final kfh a;
    public static final kfh b;
    public static final kfh c;
    public static final kfh d;
    private static final /* synthetic */ kfh[] e;

    static {
        kfh kfhVar = new kfh("PROCESSED", 0);
        a = kfhVar;
        kfh kfhVar2 = new kfh("REFUSED", 1);
        b = kfhVar2;
        kfh kfhVar3 = new kfh("DROPPED", 2);
        c = kfhVar3;
        kfh kfhVar4 = new kfh("MISCARRIED", 3);
        d = kfhVar4;
        e = new kfh[]{kfhVar, kfhVar2, kfhVar3, kfhVar4};
    }

    public static kfh[] values() {
        return (kfh[]) e.clone();
    }
}
