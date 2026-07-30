package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gt {
    public static final gt d;
    public static final gt e;
    public static final gt g;
    public static final /* synthetic */ gt[] h;

    static {
        gt gtVar = new gt("Yes", 0);
        d = gtVar;
        gt gtVar2 = new gt("No", 1);
        e = gtVar2;
        gt gtVar3 = new gt("NotInitialized", 2);
        g = gtVar3;
        h = new gt[]{gtVar, gtVar2, gtVar3};
    }

    public static gt valueOf(String str) {
        return (gt) Enum.valueOf(gt.class, str);
    }

    public static gt[] values() {
        return (gt[]) h.clone();
    }
}
