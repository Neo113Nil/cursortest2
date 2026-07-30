package com.baidu.mapauto.auth.org.spongycastle.util;

import java.security.AccessControlException;
import java.security.AccessController;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f7863a = new ThreadLocal();

    public static boolean a() {
        try {
            String str = (String) AccessController.doPrivileged(new b());
            if (str == null) {
                return false;
            }
            int i8 = d.f7864a;
            char[] charArray = str.toCharArray();
            boolean z7 = false;
            for (int i9 = 0; i9 != charArray.length; i9++) {
                char c8 = charArray[i9];
                if ('A' <= c8 && 'Z' >= c8) {
                    charArray[i9] = (char) (c8 + ' ');
                    z7 = true;
                }
            }
            if (z7) {
                str = new String(charArray);
            }
            return "true".equals(str);
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
