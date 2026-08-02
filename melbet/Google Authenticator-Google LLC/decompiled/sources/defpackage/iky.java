package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iky {
    public static final iky a;
    public static final iky b;
    public static final iky c;
    public static final iky d;
    public static final iky e;
    public static final iky f;
    private static final /* synthetic */ iky[] g;

    static {
        iky ikyVar = new iky("FACE_DETECTION", 0);
        a = ikyVar;
        iky ikyVar2 = new iky("SMART_REPLY", 1);
        b = ikyVar2;
        iky ikyVar3 = new iky("TRANSLATE", 2);
        c = ikyVar3;
        iky ikyVar4 = new iky("ENTITY_EXTRACTION", 3);
        d = ikyVar4;
        iky ikyVar5 = new iky("TOXICITY_DETECTION", 4);
        e = ikyVar5;
        iky ikyVar6 = new iky("IMAGE_CAPTIONING", 5);
        f = ikyVar6;
        g = new iky[]{ikyVar, ikyVar2, ikyVar3, ikyVar4, ikyVar5, ikyVar6};
    }

    public static iky[] values() {
        return (iky[]) g.clone();
    }
}
