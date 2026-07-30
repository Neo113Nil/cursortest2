package defpackage;

import android.R;
import android.os.Build;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ze2 {
    public static final ze2 dgRBjINgWbAK;
    public static final /* synthetic */ ze2[] x50lh2ztY7Y5;
    public final int OPXfSBeufaJ8;
    public final Object rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    /* JADX INFO: Fake field, exist only in values array */
    ze2 EF0;

    static {
        Object obj = mm2.EpkonXwzFgDB;
        vs.Companion.getClass();
        qs.Companion.getClass();
        ze2 ze2Var = new ze2("Cut", 0, obj, R.string.cut, R.attr.actionModeCutDrawable);
        ze2 ze2Var2 = new ze2("Copy", 1, mm2.xfACYKDMU6Dj, R.string.copy, R.attr.actionModeCopyDrawable);
        ze2 ze2Var3 = new ze2("Paste", 2, mm2.nLZGh9p8gVSu, R.string.paste, R.attr.actionModePasteDrawable);
        ze2 ze2Var4 = new ze2("SelectAll", 3, mm2.ryVscX7ZL4Ux, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        ze2 ze2Var5 = new ze2("Autofill", 4, mm2.amuv7NJvPxHu, Build.VERSION.SDK_INT <= 26 ? com.ice.fishing.grenza.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);
        dgRBjINgWbAK = ze2Var5;
        x50lh2ztY7Y5 = new ze2[]{ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5};
    }

    public ze2(String str, int i, Object obj, int i2, int i3) {
        this.rtx2ld2ELZv4 = obj;
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = i3;
    }

    public static ze2 valueOf(String str) {
        return (ze2) Enum.valueOf(ze2.class, str);
    }

    public static ze2[] values() {
        return (ze2[]) x50lh2ztY7Y5.clone();
    }
}
