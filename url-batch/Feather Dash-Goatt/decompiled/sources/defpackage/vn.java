package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vn {
    public static final vn d;
    public static final vn e;
    public static final vn g;
    public static final vn h;
    public static final /* synthetic */ vn[] i;

    static {
        vn vnVar = new vn("DEFAULT", 0);
        d = vnVar;
        vn vnVar2 = new vn("LAZY", 1);
        e = vnVar2;
        vn vnVar3 = new vn("ATOMIC", 2);
        g = vnVar3;
        vn vnVar4 = new vn("UNDISPATCHED", 3);
        h = vnVar4;
        i = new vn[]{vnVar, vnVar2, vnVar3, vnVar4};
    }

    public static vn valueOf(String str) {
        return (vn) Enum.valueOf(vn.class, str);
    }

    public static vn[] values() {
        return (vn[]) i.clone();
    }
}
