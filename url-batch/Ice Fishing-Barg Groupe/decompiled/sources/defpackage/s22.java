package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s22 {
    public static final s22 OPXfSBeufaJ8;
    public static final /* synthetic */ s22[] dgRBjINgWbAK;
    public static final s22 rtx2ld2ELZv4;
    public static final s22 wdg6QnbFHrFF;

    static {
        s22 s22Var = new s22("Left", 0);
        rtx2ld2ELZv4 = s22Var;
        s22 s22Var2 = new s22("Middle", 1);
        OPXfSBeufaJ8 = s22Var2;
        s22 s22Var3 = new s22("Right", 2);
        wdg6QnbFHrFF = s22Var3;
        dgRBjINgWbAK = new s22[]{s22Var, s22Var2, s22Var3};
    }

    public static s22 valueOf(String str) {
        return (s22) Enum.valueOf(s22.class, str);
    }

    public static s22[] values() {
        return (s22[]) dgRBjINgWbAK.clone();
    }
}
