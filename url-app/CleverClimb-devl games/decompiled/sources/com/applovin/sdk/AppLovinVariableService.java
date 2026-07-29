package com.applovin.sdk;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface AppLovinVariableService {

    public interface OnVariablesUpdateListener {
        void onVariablesUpdate(Bundle bundle);
    }

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z);

    void setOnVariablesUpdateListener(OnVariablesUpdateListener onVariablesUpdateListener);
}
