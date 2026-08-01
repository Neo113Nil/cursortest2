package com.google.firebase.messaging;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f3128a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i3) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!ac.a.v(resources.getDrawable(i3, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i3);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i3 + ", treating it as an invalid icon");
            return false;
        }
    }
}
