package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class art {
    public static final art a;
    public static final art b;
    private static final /* synthetic */ art[] c;

    static {
        art artVar = new art("EXPONENTIAL", 0);
        a = artVar;
        art artVar2 = new art("LINEAR", 1);
        b = artVar2;
        art[] artVarArr = {artVar, artVar2};
        c = artVarArr;
        ixf.k(artVarArr);
    }

    public static art[] values() {
        return (art[]) c.clone();
    }
}
