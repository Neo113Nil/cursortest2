package com.aiming.mdt.mediation;

import android.app.Activity;

/* loaded from: classes.dex */
public abstract class CustomInteractiveEvent extends CustomAdEvent {
    public abstract boolean isReady();

    public abstract boolean show(Activity activity);
}
