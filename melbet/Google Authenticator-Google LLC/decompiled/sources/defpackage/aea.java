package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class aea {
    public final int a;
    public final Method b;

    public aea(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aea)) {
            return false;
        }
        aea aeaVar = (aea) obj;
        return this.a == aeaVar.a && this.b.getName().equals(aeaVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
