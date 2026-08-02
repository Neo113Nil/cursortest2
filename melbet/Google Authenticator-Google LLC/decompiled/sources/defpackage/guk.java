package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class guk {
    public static final guk a;
    public static final guk b;
    public static final guk c;
    public static final guk d;
    public static final guk e;
    public static final guk f;
    public static final guk g;
    public static final guk h;
    private static final /* synthetic */ guk[] i;

    static {
        guk gukVar = new guk("APPLICATION_CREATE", 0);
        a = gukVar;
        guk gukVar2 = new guk("ACTIVITY_CREATE", 1);
        b = gukVar2;
        guk gukVar3 = new guk("ACTIVITY_START", 2);
        c = gukVar3;
        guk gukVar4 = new guk("ACTIVITY_RESUME", 3);
        d = gukVar4;
        guk gukVar5 = new guk("ACTIVITY_PAUSE", 4);
        e = gukVar5;
        guk gukVar6 = new guk("ACTIVITY_STOP", 5);
        f = gukVar6;
        guk gukVar7 = new guk("ACTIVITY_DESTROY", 6);
        g = gukVar7;
        guk gukVar8 = new guk("INTENT_TO_ACTIVITY", 7);
        h = gukVar8;
        i = new guk[]{gukVar, gukVar2, gukVar3, gukVar4, gukVar5, gukVar6, gukVar7, gukVar8};
    }

    public static guk[] values() {
        return (guk[]) i.clone();
    }
}
