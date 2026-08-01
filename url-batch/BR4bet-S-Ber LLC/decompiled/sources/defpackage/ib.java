package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ib {
    public final int a;
    public final Method b;

    public ib(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return this.a == ibVar.a && this.b.getName().equals(ibVar.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
