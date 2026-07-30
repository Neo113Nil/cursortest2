package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: org.bouncycastle.jcajce.provider.symmetric.util.a$a, reason: collision with other inner class name */
    static class C0390a implements PrivilegedAction {
        final /* synthetic */ String val$className;

        C0390a(String str) {
            this.val$className = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.val$className);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class loadClass(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C0390a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
