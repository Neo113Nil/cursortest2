package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class e60 {
    public static final d60 Companion = new d60();
    public static final f60 PxuCJdSBwIXG = new f60(new hl2((m70) null, (sj0) null, (LinkedHashMap) null, 127));

    public final boolean equals(Object obj) {
        return (obj instanceof e60) && ((f60) ((e60) obj)).lS5Rgt96tfkO.equals(((f60) this).lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return ((f60) this).lS5Rgt96tfkO.hashCode();
    }

    public final String toString() {
        if (equals(PxuCJdSBwIXG)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        m70 m70Var = ((f60) this).lS5Rgt96tfkO.PxuCJdSBwIXG;
        sb.append(m70Var != null ? m70Var.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
