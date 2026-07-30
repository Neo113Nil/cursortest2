package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kx0 {
    public static final /* synthetic */ kx0[] OPXfSBeufaJ8;
    public static final kx0 rtx2ld2ELZv4;

    static {
        kx0 kx0Var = new kx0("Horizontal", 0);
        rtx2ld2ELZv4 = kx0Var;
        OPXfSBeufaJ8 = new kx0[]{kx0Var, new kx0("Vertical", 1)};
    }

    public static kx0 valueOf(String str) {
        return (kx0) Enum.valueOf(kx0.class, str);
    }

    public static kx0[] values() {
        return (kx0[]) OPXfSBeufaJ8.clone();
    }
}
