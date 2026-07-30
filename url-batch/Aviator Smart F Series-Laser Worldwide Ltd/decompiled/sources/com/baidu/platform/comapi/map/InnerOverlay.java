package com.baidu.platform.comapi.map;

import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;

/* loaded from: classes2.dex */
public abstract class InnerOverlay extends Overlay {

    /* renamed from: a, reason: collision with root package name */
    protected String f9433a;

    /* renamed from: b, reason: collision with root package name */
    protected Bundle f9434b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9435c;
    public AppBaseMap mBaseMap;

    public InnerOverlay() {
        this.mBaseMap = null;
        this.f9433a = null;
        this.f9434b = null;
        this.f9435c = true;
    }

    public boolean IsOverlayShow() {
        AppBaseMap appBaseMap;
        return (this.mLayerID == 0 || (appBaseMap = this.mBaseMap) == null || appBaseMap.GetId() == 0 || !this.mBaseMap.LayersIsShow(this.mLayerID)) ? false : true;
    }

    public void SetMapParam(long j8, AppBaseMap appBaseMap) {
        this.mLayerID = j8;
        this.mBaseMap = appBaseMap;
    }

    public void SetOverlayShow(boolean z7) {
        AppBaseMap appBaseMap;
        if (this.mLayerID == 0 || (appBaseMap = this.mBaseMap) == null || appBaseMap.GetId() == 0) {
            return;
        }
        long currentTimeMillis = l.f9781a ? System.currentTimeMillis() : 0L;
        this.mBaseMap.ShowLayers(this.mLayerID, z7);
        if (l.f9781a) {
            l.a("InnerOverlay", "ShowLayer:" + this.mLayerID + ":" + z7 + " tag:" + getLayerTag() + " [" + (System.currentTimeMillis() - currentTimeMillis) + "ms]");
        }
    }

    public void UpdateOverlay() {
        AppBaseMap appBaseMap;
        if (this.mLayerID == 0 || (appBaseMap = this.mBaseMap) == null || appBaseMap.GetId() == 0) {
            return;
        }
        long currentTimeMillis = l.f9781a ? System.currentTimeMillis() : 0L;
        this.mBaseMap.UpdateLayers(this.mLayerID);
        if (l.f9781a) {
            l.a("InnerOverlay", "UpdateLayer:" + this.mLayerID + " tag:" + getLayerTag() + " [" + (System.currentTimeMillis() - currentTimeMillis) + "ms]");
        }
    }

    public boolean addedToMapView() {
        AppBaseMap appBaseMap = this.mBaseMap;
        if (appBaseMap != null && appBaseMap.GetId() != 0) {
            long currentTimeMillis = l.f9781a ? System.currentTimeMillis() : 0L;
            this.mLayerID = this.mBaseMap.AddLayer(getUpdateType(), getUpdateTimeInterval(), getLayerTag());
            if (l.f9781a) {
                l.a("InnerOverlay", "AddLayer:" + this.mLayerID + " type:" + this.mType + " tag:" + getLayerTag() + " [" + (System.currentTimeMillis() - currentTimeMillis) + "ms]");
            }
            long j8 = this.mLayerID;
            if (j8 != 0) {
                this.mBaseMap.SetLayersClickable(j8, this.f9435c);
                SetOverlayShow(getDefaultShowStatus());
                return true;
            }
        }
        return false;
    }

    public void clear() {
        long currentTimeMillis = l.f9781a ? System.currentTimeMillis() : 0L;
        if (!TextUtils.isEmpty(this.f9433a)) {
            this.f9433a = null;
            AppBaseMap appBaseMap = this.mBaseMap;
            if (appBaseMap != null) {
                appBaseMap.ClearLayer(this.mLayerID);
            }
        }
        if (l.f9781a) {
            l.a("InnerOverlay", "ClearLayer:" + this.mLayerID + " tag:" + getLayerTag() + " [" + (System.currentTimeMillis() - currentTimeMillis) + "ms]");
        }
    }

    public String getData() {
        return this.f9433a;
    }

    public boolean getDefaultShowStatus() {
        return false;
    }

    public String getLayerTag() {
        return MapController.DEFAULT_LAYER_TAG;
    }

    public Bundle getParam() {
        return this.f9434b;
    }

    public int getType() {
        return this.mType;
    }

    public int getUpdateTimeInterval() {
        return 0;
    }

    public int getUpdateType() {
        return 0;
    }

    public void setClickAble(boolean z7) {
        this.f9435c = z7;
        AppBaseMap appBaseMap = this.mBaseMap;
        if (appBaseMap == null || appBaseMap.GetId() == 0) {
            return;
        }
        long j8 = this.mLayerID;
        if (j8 != 0) {
            this.mBaseMap.SetLayersClickable(j8, z7);
        }
    }

    public void setData(String str) {
        if (str != null) {
            this.f9433a = str;
        }
    }

    public void setFocus(int i8, boolean z7, String str) {
        AppBaseMap appBaseMap = this.mBaseMap;
        if (appBaseMap == null || appBaseMap.GetId() == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("uid", str);
        }
        this.mBaseMap.SetFocus(this.mLayerID, i8, z7, bundle);
    }

    public void setParam(Bundle bundle) {
        this.f9434b = bundle;
    }

    public void setType(int i8) {
        this.mType = i8;
    }

    public InnerOverlay(int i8) {
        this.mBaseMap = null;
        this.f9433a = null;
        this.f9434b = null;
        this.f9435c = true;
        setType(i8);
    }

    public InnerOverlay(int i8, AppBaseMap appBaseMap) {
        this.mBaseMap = null;
        this.f9433a = null;
        this.f9434b = null;
        this.f9435c = true;
        setType(i8);
        this.mBaseMap = appBaseMap;
    }

    public void setFocus(int i8, boolean z7) {
        setFocus(i8, z7, null);
    }
}
