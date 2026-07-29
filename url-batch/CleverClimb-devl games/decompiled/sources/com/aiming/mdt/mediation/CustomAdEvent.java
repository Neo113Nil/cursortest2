package com.aiming.mdt.mediation;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class CustomAdEvent {
    protected boolean isDestroyed;
    private String mInsId;
    protected String mInstancesKey;
    protected String mPlacementId;

    protected void callbackInsRewarded() {
        CallbackManager.getInstance().onInsRewarded(this.mPlacementId, getMediation(), this.mInstancesKey, this.mInsId);
    }

    protected boolean check(Activity activity, Map<String, String> map) {
        String str;
        this.mPlacementId = map.get("PlacementId");
        if (TextUtils.isEmpty(this.mPlacementId)) {
            str = "PlacementId is empty";
        } else {
            this.mInstancesKey = map.get("InstanceKey");
            if (TextUtils.isEmpty(this.mInstancesKey)) {
                str = "Mediation PlacementId is empty";
            } else {
                this.mInsId = map.get("InstanceId");
                if (!TextUtils.isEmpty(this.mInsId)) {
                    return true;
                }
                str = "Mediation InstanceId is empty";
            }
        }
        onInsError(str);
        return false;
    }

    public abstract void destroy(Activity activity);

    public abstract int getMediation();

    public void loadAd(Activity activity, Map<String, String> map) {
        this.isDestroyed = false;
    }

    protected void onInsClicked() {
        CallbackManager.getInstance().onInsClick(this.mPlacementId, this.mInstancesKey, this.mInsId);
    }

    protected void onInsClose(boolean z) {
        CallbackManager.getInstance().onInsClose(this.mPlacementId, this.mInstancesKey, this.mInsId, z);
    }

    protected synchronized void onInsError(String str) {
        CallbackManager.getInstance().onInsError(this.mPlacementId, this.mInstancesKey, this.mInsId, str);
    }

    protected synchronized void onInsReady(Object obj) {
        CallbackManager.getInstance().onInsReady(this.mPlacementId, this.mInstancesKey, this.mInsId, obj);
    }

    protected void onInsShow(Object obj) {
        CallbackManager.getInstance().onInsShow(this.mPlacementId, this.mInstancesKey, this.mInsId, obj);
    }
}
