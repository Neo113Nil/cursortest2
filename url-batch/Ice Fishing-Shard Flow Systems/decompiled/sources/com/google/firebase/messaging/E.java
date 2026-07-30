package com.google.firebase.messaging;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f4426b;

    /* renamed from: a, reason: collision with root package name */
    public D6.y f4427a;

    public final synchronized D a() {
        String str;
        D d7;
        D6.y yVar = this.f4427a;
        synchronized (((ArrayDeque) yVar.f636l)) {
            str = (String) ((ArrayDeque) yVar.f636l).peek();
        }
        Pattern pattern = D.f4422d;
        d7 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                d7 = new D(split[0], split[1]);
            }
        }
        return d7;
    }
}
