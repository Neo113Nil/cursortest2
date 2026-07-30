package defpackage;

import com.facebook.internal.AnalyticsEvents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p02 {
    public static final p02 m;
    public static final p02 n;
    public static final p02 o;
    public static final /* synthetic */ p02[] p;

    /* JADX INFO: Fake field, exist only in values array */
    p02 EF0;

    static {
        p02 p02Var = new p02("Invalid", 0);
        p02 p02Var2 = new p02(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED, 1);
        m = p02Var2;
        p02 p02Var3 = new p02("InitialPending", 2);
        p02 p02Var4 = new p02("RecomposePending", 3);
        p02 p02Var5 = new p02("Recomposing", 4);
        n = p02Var5;
        p02 p02Var6 = new p02("ApplyPending", 5);
        o = p02Var6;
        p = new p02[]{p02Var, p02Var2, p02Var3, p02Var4, p02Var5, p02Var6, new p02("Applied", 6)};
    }

    public static p02 valueOf(String str) {
        return (p02) Enum.valueOf(p02.class, str);
    }

    public static p02[] values() {
        return (p02[]) p.clone();
    }
}
