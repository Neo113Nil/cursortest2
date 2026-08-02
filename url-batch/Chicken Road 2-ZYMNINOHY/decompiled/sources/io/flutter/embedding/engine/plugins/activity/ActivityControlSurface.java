package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0231j;
import io.flutter.embedding.android.ExclusiveAppComponent;

/* loaded from: classes.dex */
public interface ActivityControlSurface {
    void attachToActivity(ExclusiveAppComponent<Activity> exclusiveAppComponent, AbstractC0231j abstractC0231j);

    void detachFromActivity();

    void detachFromActivityForConfigChanges();

    boolean onActivityResult(int i4, int i5, Intent intent);

    void onNewIntent(Intent intent);

    boolean onRequestPermissionsResult(int i4, String[] strArr, int[] iArr);

    void onRestoreInstanceState(Bundle bundle);

    void onSaveInstanceState(Bundle bundle);

    void onUserLeaveHint();
}
