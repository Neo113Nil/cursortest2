package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class zu {
    public static final wu Companion = new wu();
    public final LinkedHashMap PxuCJdSBwIXG = new LinkedHashMap();

    public abstract Object PxuCJdSBwIXG(yu yuVar);

    public final boolean equals(Object obj) {
        if (obj instanceof zu) {
            return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ((zu) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.PxuCJdSBwIXG + ")";
    }
}
