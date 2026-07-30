package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class be {
    public static final be m;
    public static final be n;
    public static final be o;
    public static final be p;
    public static final be q;
    public static final be r;
    public static final be s;
    public static final /* synthetic */ be[] t;

    static {
        be beVar = new be("Paragraph", 0);
        m = beVar;
        be beVar2 = new be("Span", 1);
        n = beVar2;
        be beVar3 = new be("VerbatimTts", 2);
        o = beVar3;
        be beVar4 = new be("Url", 3);
        p = beVar4;
        be beVar5 = new be("Link", 4);
        q = beVar5;
        be beVar6 = new be("Clickable", 5);
        r = beVar6;
        be beVar7 = new be("String", 6);
        s = beVar7;
        t = new be[]{beVar, beVar2, beVar3, beVar4, beVar5, beVar6, beVar7};
    }

    public static be valueOf(String str) {
        return (be) Enum.valueOf(be.class, str);
    }

    public static be[] values() {
        return (be[]) t.clone();
    }
}
