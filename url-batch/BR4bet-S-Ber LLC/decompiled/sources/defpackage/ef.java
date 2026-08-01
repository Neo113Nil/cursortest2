package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ef {
    public static final ef f;
    public static final ef g;
    public static final ef h;
    public static final ef i;
    public static final ef j;
    public static final /* synthetic */ ef[] k;

    static {
        ef efVar = new ef("CPU_ACQUIRED", 0);
        f = efVar;
        ef efVar2 = new ef("BLOCKING", 1);
        g = efVar2;
        ef efVar3 = new ef("PARKING", 2);
        h = efVar3;
        ef efVar4 = new ef("DORMANT", 3);
        i = efVar4;
        ef efVar5 = new ef("TERMINATED", 4);
        j = efVar5;
        k = new ef[]{efVar, efVar2, efVar3, efVar4, efVar5};
    }

    public static ef valueOf(String str) {
        return (ef) Enum.valueOf(ef.class, str);
    }

    public static ef[] values() {
        return (ef[]) k.clone();
    }
}
