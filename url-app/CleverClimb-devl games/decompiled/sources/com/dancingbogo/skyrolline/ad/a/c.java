package com.dancingbogo.skyrolline.ad.a;

import android.app.Activity;
import android.content.Intent;

/* compiled from: IAds.java */
/* loaded from: classes2.dex */
public interface c {
    boolean activityResult(int i, int i2, Intent intent);

    boolean canShow(int i);

    boolean onBackPressed();

    void onCreate(Activity activity);

    void onDestroy(Activity activity);

    void onPaused(Activity activity);

    void onResume(Activity activity);

    void onStart(Activity activity);

    void onStop(Activity activity);

    void prepare();

    void setListener(b bVar);

    boolean show(int i);
}
