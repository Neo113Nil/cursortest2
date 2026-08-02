package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;

/* loaded from: classes8.dex */
public final class ActivityHost {
    public final ComponentActivity activity;
    public final ComponentActivity lifecycleOwner;
    public final Integer statusBarColor;

    public ActivityHost(ComponentActivity componentActivity, Integer num) {
        this.activity = componentActivity;
        this.statusBarColor = num;
        this.lifecycleOwner = componentActivity;
    }

    public final void startActivityForResult(Class cls, Bundle bundle, int i) {
        ComponentActivity componentActivity = this.activity;
        Intent putExtras = new Intent(componentActivity, (Class<?>) cls).putExtras(bundle);
        putExtras.getClass();
        componentActivity.startActivityForResult(putExtras, i);
    }
}
