package com.squareup.util.android;

import android.content.Intent;

/* loaded from: classes6.dex */
public final class ActivityResult {
    public final Intent intent;
    public final int requestCode;
    public final int resultCode;

    public ActivityResult(int i, int i2, Intent intent) {
        this.requestCode = i;
        this.resultCode = i2;
        this.intent = intent;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }
}
