package com.baidu.ar;

import android.graphics.SurfaceTexture;

/* loaded from: classes.dex */
public class DuMixSource {

    /* renamed from: a, reason: collision with root package name */
    public String f1535a;

    /* renamed from: b, reason: collision with root package name */
    public int f1536b;

    /* renamed from: c, reason: collision with root package name */
    public String f1537c;

    /* renamed from: d, reason: collision with root package name */
    public double[] f1538d;

    /* renamed from: e, reason: collision with root package name */
    public String f1539e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1540f;

    /* renamed from: g, reason: collision with root package name */
    public SurfaceTexture f1541g;

    /* renamed from: h, reason: collision with root package name */
    public int f1542h;

    /* renamed from: i, reason: collision with root package name */
    public int f1543i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1544j;

    /* renamed from: k, reason: collision with root package name */
    public BusinessType f1545k;

    public DuMixSource(SurfaceTexture surfaceTexture, int i8, int i9) {
        this(surfaceTexture, i8, i9, BusinessType.CAMEXP);
    }

    public String getArKey() {
        return this.f1535a;
    }

    public int getArType() {
        return this.f1536b;
    }

    public String getBaiduMapCuid() {
        return this.f1539e;
    }

    public BusinessType getBusinessType() {
        return this.f1545k;
    }

    public SurfaceTexture getCameraSource() {
        return this.f1541g;
    }

    public double[] getGPSInfo() {
        return this.f1538d;
    }

    public String getResFilePath() {
        return this.f1537c;
    }

    public int getSourceHeight() {
        return this.f1543i;
    }

    public int getSourceWidth() {
        return this.f1542h;
    }

    public boolean isFrontCamera() {
        return this.f1540f;
    }

    public boolean isNeedDrawBackground() {
        return this.f1544j;
    }

    public void setArKey(String str) {
        this.f1535a = str;
    }

    public void setArType(int i8) {
        this.f1536b = i8;
    }

    public void setBaiduMapCuid(String str) {
        this.f1539e = str;
    }

    public void setCameraSource(SurfaceTexture surfaceTexture) {
        this.f1541g = surfaceTexture;
    }

    public void setFrontCamera(boolean z7) {
        this.f1540f = z7;
    }

    public void setGPSInfo(double[] dArr) {
        this.f1538d = dArr;
    }

    public void setNeedDrawBackground(boolean z7) {
        this.f1544j = z7;
    }

    public void setResFilePath(String str) {
        this.f1537c = str;
    }

    public void setSourceHeight(int i8) {
        this.f1543i = i8;
    }

    public void setSourceWidth(int i8) {
        this.f1542h = i8;
    }

    public DuMixSource(SurfaceTexture surfaceTexture, int i8, int i9, BusinessType businessType) {
        this.f1536b = -1;
        this.f1537c = "";
        this.f1540f = false;
        this.f1542h = 0;
        this.f1543i = 0;
        this.f1544j = true;
        BusinessType businessType2 = BusinessType.NPC;
        this.f1541g = surfaceTexture;
        this.f1542h = i8;
        this.f1543i = i9;
        this.f1545k = businessType;
    }

    public DuMixSource(DuMixSource duMixSource) {
        this.f1536b = -1;
        this.f1537c = "";
        this.f1540f = false;
        this.f1542h = 0;
        this.f1543i = 0;
        this.f1544j = true;
        this.f1545k = BusinessType.CAMEXP;
        this.f1535a = duMixSource.getArKey();
        this.f1536b = duMixSource.getArType();
        this.f1537c = duMixSource.getResFilePath();
        this.f1541g = duMixSource.getCameraSource();
        this.f1542h = duMixSource.getSourceWidth();
        this.f1543i = duMixSource.getSourceHeight();
        this.f1538d = duMixSource.getGPSInfo();
        this.f1544j = duMixSource.isNeedDrawBackground();
        this.f1545k = duMixSource.f1545k;
    }
}
