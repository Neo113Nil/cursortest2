package com.baidu.mapapi.walknavi.model;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class BaseNpcModel {

    /* renamed from: a, reason: collision with root package name */
    private String f7624a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f7625b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f7626c = "";

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f7627d = null;

    /* renamed from: e, reason: collision with root package name */
    private String f7628e = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f7629f = false;

    public String getDownLoadKey() {
        return this.f7624a;
    }

    public Bitmap getIcon() {
        return this.f7627d;
    }

    public String getLocalPath() {
        return this.f7628e;
    }

    public String getModelSize() {
        return this.f7626c;
    }

    public String getOriginTitle() {
        return this.f7625b;
    }

    public boolean isLoadFromLocal() {
        return this.f7629f;
    }

    public void setDownLoadKey(String str) {
        this.f7624a = str;
    }

    public void setIcon(Bitmap bitmap) {
        this.f7627d = bitmap;
    }

    public void setLoadFromLocal(boolean z7) {
        this.f7629f = z7;
    }

    public void setLocalPath(String str) {
        this.f7628e = str;
    }

    public void setModelSize(String str) {
        this.f7626c = str;
    }

    public void setOriginTitle(String str) {
        this.f7625b = str;
    }
}
