package com.facebook.login;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface StartActivityDelegate {
    Activity getActivityContext();

    void startActivityForResult(Intent intent, int i);
}
