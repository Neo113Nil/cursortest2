package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class gat {
    public static final gat a;
    public static final gat b;
    public static final gat c;
    private static final /* synthetic */ gat[] d;

    static {
        gat gatVar = new gat("STOPPED", 0);
        a = gatVar;
        gat gatVar2 = new gat("STARTING", 1);
        b = gatVar2;
        gat gatVar3 = new gat("STARTED", 2);
        c = gatVar3;
        d = new gat[]{gatVar, gatVar2, gatVar3};
    }

    public static gat[] values() {
        return (gat[]) d.clone();
    }
}
