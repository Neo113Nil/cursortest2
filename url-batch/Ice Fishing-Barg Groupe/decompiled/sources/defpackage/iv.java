package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class iv {
    public static final iv OPXfSBeufaJ8;
    public static final /* synthetic */ iv[] dgRBjINgWbAK;
    public static final iv rtx2ld2ELZv4;
    public static final iv wdg6QnbFHrFF;

    static {
        iv ivVar = new iv("None", 0);
        rtx2ld2ELZv4 = ivVar;
        iv ivVar2 = new iv("Cancelled", 1);
        OPXfSBeufaJ8 = ivVar2;
        iv ivVar3 = new iv("Redirected", 2);
        wdg6QnbFHrFF = ivVar3;
        dgRBjINgWbAK = new iv[]{ivVar, ivVar2, ivVar3, new iv("RedirectCancelled", 3)};
    }

    public static iv valueOf(String str) {
        return (iv) Enum.valueOf(iv.class, str);
    }

    public static iv[] values() {
        return (iv[]) dgRBjINgWbAK.clone();
    }
}
