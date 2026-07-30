package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class A2 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f23802a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f23803b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (A2.class) {
            if (f23802a.add(str)) {
                String str2 = f23803b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                f23803b = sb.toString();
            }
        }
    }
}
