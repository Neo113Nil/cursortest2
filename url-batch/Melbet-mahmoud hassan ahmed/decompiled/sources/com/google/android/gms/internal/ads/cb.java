package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public interface cb {
    void a(MotionEvent motionEvent);

    void b(View view);

    String c(Context context, View view, Activity activity);

    String d(Context context);

    @Deprecated
    void e(int i7, int i8, int i9);

    String f(Context context, String str, View view);

    String g(Context context, String str, View view, Activity activity);
}
