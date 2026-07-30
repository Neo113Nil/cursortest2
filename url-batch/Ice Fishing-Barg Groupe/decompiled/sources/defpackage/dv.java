package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dv {
    public static final dv OPXfSBeufaJ8;
    public static final /* synthetic */ dv[] dgRBjINgWbAK;
    public static final dv rtx2ld2ELZv4;
    public static final dv wdg6QnbFHrFF;

    static {
        dv dvVar = new dv("CROSSED", 0);
        rtx2ld2ELZv4 = dvVar;
        dv dvVar2 = new dv("NOT_CROSSED", 1);
        OPXfSBeufaJ8 = dvVar2;
        dv dvVar3 = new dv("COLLAPSED", 2);
        wdg6QnbFHrFF = dvVar3;
        dgRBjINgWbAK = new dv[]{dvVar, dvVar2, dvVar3};
    }

    public static dv valueOf(String str) {
        return (dv) Enum.valueOf(dv.class, str);
    }

    public static dv[] values() {
        return (dv[]) dgRBjINgWbAK.clone();
    }
}
