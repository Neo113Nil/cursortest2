package com.aiming.mdt.mediation;

/* loaded from: classes.dex */
public abstract class Callback {
    protected void onInsClose(String str, String str2, boolean z) {
    }

    protected void onInsError(String str, String str2, String str3) {
    }

    protected void onInsReady(String str, String str2, Object obj) {
    }

    protected void onInsRewarded(int i, String str, String str2, String str3) {
    }

    protected void onInsShow(String str, String str2, Object obj) {
    }

    protected abstract void onInstanceClick(String str, String str2);
}
