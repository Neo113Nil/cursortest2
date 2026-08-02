package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kno {
    public static final kno a;
    public static final kno b;
    public static final kno c;
    private static final /* synthetic */ kno[] d;

    static {
        kno knoVar = new kno("BLOCKING", 0);
        a = knoVar;
        kno knoVar2 = new kno("FUTURE", 1);
        b = knoVar2;
        kno knoVar3 = new kno("ASYNC", 2);
        c = knoVar3;
        d = new kno[]{knoVar, knoVar2, knoVar3};
    }

    public static kno[] values() {
        return (kno[]) d.clone();
    }
}
