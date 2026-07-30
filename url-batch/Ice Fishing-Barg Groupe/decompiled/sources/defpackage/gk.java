package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gk {
    public final int PxuCJdSBwIXG;
    public final Method lS5Rgt96tfkO;

    public gk(int i, Method method) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return this.PxuCJdSBwIXG == gkVar.PxuCJdSBwIXG && this.lS5Rgt96tfkO.getName().equals(gkVar.lS5Rgt96tfkO.getName());
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.getName().hashCode() + (this.PxuCJdSBwIXG * 31);
    }
}
