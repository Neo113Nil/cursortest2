package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adm {
    public static final adm a;
    public static final adm b;
    public static final adm c;
    public static final adm d;
    public static final adm e;
    public static final adm f;
    public static final adm g;
    public static final adm h;
    public static final adm i;
    private static final /* synthetic */ adm[] j;

    static {
        adm admVar = new adm("PENALTY_LOG", 0);
        a = admVar;
        adm admVar2 = new adm("PENALTY_DEATH", 1);
        b = admVar2;
        adm admVar3 = new adm("DETECT_FRAGMENT_REUSE", 2);
        c = admVar3;
        adm admVar4 = new adm("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = admVar4;
        adm admVar5 = new adm("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = admVar5;
        adm admVar6 = new adm("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = admVar6;
        adm admVar7 = new adm("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = admVar7;
        adm admVar8 = new adm("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = admVar8;
        adm admVar9 = new adm("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = admVar9;
        adm[] admVarArr = {admVar, admVar2, admVar3, admVar4, admVar5, admVar6, admVar7, admVar8, admVar9};
        j = admVarArr;
        ixf.k(admVarArr);
    }

    public static adm[] values() {
        return (adm[]) j.clone();
    }
}
