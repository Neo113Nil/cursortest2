package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class kdc {
    public static final kdc a;
    public static final kdc b;
    public static final kdc c;
    public static final kdc d;
    public static final kdc e;
    public static final kdc f;
    private static final /* synthetic */ kdc[] g;

    static {
        kdc kdcVar = new kdc("UNINITIALIZED", 0);
        a = kdcVar;
        kdc kdcVar2 = new kdc("INITIALIZED", 1);
        b = kdcVar2;
        kdc kdcVar3 = new kdc("PREFIX_DELIVERED", 2);
        c = kdcVar3;
        kdc kdcVar4 = new kdc("ALL_MESSAGES_DELIVERED", 3);
        d = kdcVar4;
        kdc kdcVar5 = new kdc("SUFFIX_DELIVERED", 4);
        e = kdcVar5;
        kdc kdcVar6 = new kdc("CLOSED", 5);
        f = kdcVar6;
        g = new kdc[]{kdcVar, kdcVar2, kdcVar3, kdcVar4, kdcVar5, kdcVar6};
    }

    public static kdc[] values() {
        return (kdc[]) g.clone();
    }
}
