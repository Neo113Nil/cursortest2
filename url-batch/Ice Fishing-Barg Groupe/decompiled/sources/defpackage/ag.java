package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ag {
    public static final ag OPXfSBeufaJ8;
    public static final /* synthetic */ ag[] dgRBjINgWbAK;
    public static final ag rtx2ld2ELZv4;
    public static final ag wdg6QnbFHrFF;

    static {
        ag agVar = new ag("SUSPEND", 0);
        rtx2ld2ELZv4 = agVar;
        ag agVar2 = new ag("DROP_OLDEST", 1);
        OPXfSBeufaJ8 = agVar2;
        ag agVar3 = new ag("DROP_LATEST", 2);
        wdg6QnbFHrFF = agVar3;
        dgRBjINgWbAK = new ag[]{agVar, agVar2, agVar3};
    }

    public static ag valueOf(String str) {
        return (ag) Enum.valueOf(ag.class, str);
    }

    public static ag[] values() {
        return (ag[]) dgRBjINgWbAK.clone();
    }
}
