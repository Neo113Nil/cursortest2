package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pu {
    public static final pu OPXfSBeufaJ8;
    public static final /* synthetic */ pu[] cpQdD2nAriOS;
    public static final pu dgRBjINgWbAK;
    public static final pu rtx2ld2ELZv4;
    public static final pu wdg6QnbFHrFF;
    public static final pu x50lh2ztY7Y5;

    static {
        pu puVar = new pu("CPU_ACQUIRED", 0);
        rtx2ld2ELZv4 = puVar;
        pu puVar2 = new pu("BLOCKING", 1);
        OPXfSBeufaJ8 = puVar2;
        pu puVar3 = new pu("PARKING", 2);
        wdg6QnbFHrFF = puVar3;
        pu puVar4 = new pu("DORMANT", 3);
        dgRBjINgWbAK = puVar4;
        pu puVar5 = new pu("TERMINATED", 4);
        x50lh2ztY7Y5 = puVar5;
        cpQdD2nAriOS = new pu[]{puVar, puVar2, puVar3, puVar4, puVar5};
    }

    public static pu valueOf(String str) {
        return (pu) Enum.valueOf(pu.class, str);
    }

    public static pu[] values() {
        return (pu[]) cpQdD2nAriOS.clone();
    }
}
