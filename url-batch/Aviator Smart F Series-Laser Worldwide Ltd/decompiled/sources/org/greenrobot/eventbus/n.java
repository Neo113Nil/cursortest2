package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class n {
    final Class<?> eventType;
    final Method method;
    String methodString;
    final int priority;
    final boolean sticky;
    final ThreadMode threadMode;

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i8, boolean z7) {
        this.method = method;
        this.threadMode = threadMode;
        this.eventType = cls;
        this.priority = i8;
        this.sticky = z7;
    }

    private synchronized void checkMethodString() {
        if (this.methodString == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.method.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.method.getName());
            sb.append('(');
            sb.append(this.eventType.getName());
            this.methodString = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        checkMethodString();
        n nVar = (n) obj;
        nVar.checkMethodString();
        return this.methodString.equals(nVar.methodString);
    }

    public int hashCode() {
        return this.method.hashCode();
    }
}
