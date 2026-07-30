package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m12 {
    public static final m12 OPXfSBeufaJ8;
    public static final m12 rtx2ld2ELZv4;
    public static final /* synthetic */ m12[] wdg6QnbFHrFF;

    static {
        m12 m12Var = new m12("Inherit", 0);
        rtx2ld2ELZv4 = m12Var;
        m12 m12Var2 = new m12("SecureOn", 1);
        OPXfSBeufaJ8 = m12Var2;
        wdg6QnbFHrFF = new m12[]{m12Var, m12Var2, new m12("SecureOff", 2)};
    }

    public static m12 valueOf(String str) {
        return (m12) Enum.valueOf(m12.class, str);
    }

    public static m12[] values() {
        return (m12[]) wdg6QnbFHrFF.clone();
    }
}
