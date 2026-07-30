package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ml2 {
    public static final ml2 OPXfSBeufaJ8;
    public static final /* synthetic */ ml2[] dgRBjINgWbAK;
    public static final ml2 rtx2ld2ELZv4;
    public static final ml2 wdg6QnbFHrFF;

    static {
        ml2 ml2Var = new ml2("ContinueTraversal", 0);
        rtx2ld2ELZv4 = ml2Var;
        ml2 ml2Var2 = new ml2("SkipSubtreeAndContinueTraversal", 1);
        OPXfSBeufaJ8 = ml2Var2;
        ml2 ml2Var3 = new ml2("CancelTraversal", 2);
        wdg6QnbFHrFF = ml2Var3;
        dgRBjINgWbAK = new ml2[]{ml2Var, ml2Var2, ml2Var3};
    }

    public static ml2 valueOf(String str) {
        return (ml2) Enum.valueOf(ml2.class, str);
    }

    public static ml2[] values() {
        return (ml2[]) dgRBjINgWbAK.clone();
    }
}
