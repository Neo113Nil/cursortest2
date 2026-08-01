package com.google.firebase.messaging;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.se;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f3190b;

    /* renamed from: a, reason: collision with root package name */
    public se f3191a;

    public final synchronized y a() {
        String str;
        y yVar;
        se seVar = this.f3191a;
        synchronized (((ArrayDeque) seVar.f2801r)) {
            str = (String) ((ArrayDeque) seVar.f2801r).peek();
        }
        Pattern pattern = y.f3186d;
        yVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                yVar = new y(split[0], split[1]);
            }
        }
        return yVar;
    }
}
