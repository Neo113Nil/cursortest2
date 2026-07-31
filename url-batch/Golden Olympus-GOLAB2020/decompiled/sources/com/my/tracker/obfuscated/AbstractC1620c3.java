package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.my.tracker.obfuscated.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1620c3 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f21162a;

    public static String a(Context context) {
        String str;
        String str2 = f21162a;
        if (str2 != null) {
            return str2;
        }
        synchronized (AbstractC1620c3.class) {
            try {
                str = f21162a;
                if (str == null) {
                    str = C1676q1.a(context).k();
                    if (TextUtils.isEmpty(str)) {
                        str = UUID.randomUUID().toString();
                        C1676q1.a(context).k(str);
                        f21162a = str;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
