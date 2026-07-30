package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f01 {
    public static final f01 OPXfSBeufaJ8;
    public static final /* synthetic */ f01[] cpQdD2nAriOS;
    public static final f01 dgRBjINgWbAK;
    public static final f01 rtx2ld2ELZv4;
    public static final f01 wdg6QnbFHrFF;
    public static final f01 x50lh2ztY7Y5;

    static {
        f01 f01Var = new f01("DESTROYED", 0);
        rtx2ld2ELZv4 = f01Var;
        f01 f01Var2 = new f01("INITIALIZED", 1);
        OPXfSBeufaJ8 = f01Var2;
        f01 f01Var3 = new f01("CREATED", 2);
        wdg6QnbFHrFF = f01Var3;
        f01 f01Var4 = new f01("STARTED", 3);
        dgRBjINgWbAK = f01Var4;
        f01 f01Var5 = new f01("RESUMED", 4);
        x50lh2ztY7Y5 = f01Var5;
        cpQdD2nAriOS = new f01[]{f01Var, f01Var2, f01Var3, f01Var4, f01Var5};
    }

    public static f01 valueOf(String str) {
        return (f01) Enum.valueOf(f01.class, str);
    }

    public static f01[] values() {
        return (f01[]) cpQdD2nAriOS.clone();
    }
}
