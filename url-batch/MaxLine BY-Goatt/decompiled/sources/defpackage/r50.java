package defpackage;

import com.facebook.internal.AnalyticsEvents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r50 {
    public static final r50 m;
    public static final r50 n;
    public static final r50 o;
    public static final /* synthetic */ r50[] p;

    static {
        r50 r50Var = new r50("None", 0);
        m = r50Var;
        r50 r50Var2 = new r50(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED, 1);
        n = r50Var2;
        r50 r50Var3 = new r50("Redirected", 2);
        o = r50Var3;
        p = new r50[]{r50Var, r50Var2, r50Var3, new r50("RedirectCancelled", 3)};
    }

    public static r50 valueOf(String str) {
        return (r50) Enum.valueOf(r50.class, str);
    }

    public static r50[] values() {
        return (r50[]) p.clone();
    }
}
