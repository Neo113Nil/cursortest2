package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class k70 {
    public static final j70 Companion = new j70();
    public static final l70 PxuCJdSBwIXG = new l70(new hl2((m70) null, (sj0) null, (LinkedHashMap) null, 127));
    public static final l70 lS5Rgt96tfkO = new l70(new hl2((m70) null, (sj0) null, (LinkedHashMap) null, 95));

    public final boolean equals(Object obj) {
        return (obj instanceof k70) && ((l70) ((k70) obj)).TSizfFm2Yiuu.equals(((l70) this).TSizfFm2Yiuu);
    }

    public final int hashCode() {
        return ((l70) this).TSizfFm2Yiuu.hashCode();
    }

    public final String toString() {
        if (equals(PxuCJdSBwIXG)) {
            return "ExitTransition.None";
        }
        if (equals(lS5Rgt96tfkO)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        hl2 hl2Var = ((l70) this).TSizfFm2Yiuu;
        m70 m70Var = hl2Var.PxuCJdSBwIXG;
        sb.append(m70Var != null ? m70Var.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(hl2Var.lS5Rgt96tfkO);
        return sb.toString();
    }
}
