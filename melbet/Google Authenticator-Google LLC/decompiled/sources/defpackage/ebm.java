package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebm {
    public static final ebm a;
    public static final ebm b;
    public static final ebm c;
    public static final ebm d;
    public static final ebm e;
    public static final ebm f;
    public static final ebm g;
    public static final ebm h;
    private static final /* synthetic */ ebm[] i;

    static {
        ebm ebmVar = new ebm("NON_EXTENDED_DEFAULT", 0);
        a = ebmVar;
        ebm ebmVar2 = new ebm("DEFAULT", 1);
        b = ebmVar2;
        ebm ebmVar3 = new ebm("LOW_STORAGE_MINOR", 2);
        c = ebmVar3;
        ebm ebmVar4 = new ebm("LOW_STORAGE_MODERATE", 3);
        d = ebmVar4;
        ebm ebmVar5 = new ebm("LOW_STORAGE_SEVERE", 4);
        e = ebmVar5;
        ebm ebmVar6 = new ebm("OUT_OF_STORAGE", 5);
        f = ebmVar6;
        ebm ebmVar7 = new ebm("UNAVAILABLE", 6);
        g = ebmVar7;
        ebm ebmVar8 = new ebm("UNLIMITED", 7);
        h = ebmVar8;
        i = new ebm[]{ebmVar, ebmVar2, ebmVar3, ebmVar4, ebmVar5, ebmVar6, ebmVar7, ebmVar8};
    }

    public static ebm[] values() {
        return (ebm[]) i.clone();
    }
}
