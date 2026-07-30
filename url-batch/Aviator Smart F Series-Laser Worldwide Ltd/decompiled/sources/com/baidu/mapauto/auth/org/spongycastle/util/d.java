package com.baidu.mapauto.auth.org.spongycastle.util;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7864a = 0;

    public class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        public final String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
        } catch (Exception unused) {
            try {
                String.format("%n", new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i8 = 0; i8 != length; i8++) {
            cArr[i8] = (char) (bArr[i8] & 255);
        }
        return new String(cArr);
    }
}
