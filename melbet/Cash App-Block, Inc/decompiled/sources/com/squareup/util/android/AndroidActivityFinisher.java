package com.squareup.util.android;

import android.app.Activity;

/* loaded from: classes.dex */
public final class AndroidActivityFinisher {
    public final Activity activity;

    public AndroidActivityFinisher(Activity activity) {
        this.activity = activity;
    }

    public final void finish() {
        this.activity.finish();
    }
}
