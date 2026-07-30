package com.baidu.ar.baidumap;

import android.opengl.EGLContext;
import com.baidu.ar.obr.OBRConfig;

/* loaded from: classes.dex */
public class MapDuMixParams {

    /* renamed from: a, reason: collision with root package name */
    public String f1817a;

    /* renamed from: b, reason: collision with root package name */
    public double[] f1818b;

    /* renamed from: c, reason: collision with root package name */
    public String f1819c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1820d = false;

    /* renamed from: e, reason: collision with root package name */
    public EGLContext f1821e = null;

    /* renamed from: f, reason: collision with root package name */
    public OBRConfig f1822f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f1823g;

    /* renamed from: h, reason: collision with root package name */
    public int f1824h;

    public String getBuildingId() {
        return this.f1819c;
    }

    public String getCuid() {
        return this.f1817a;
    }

    public int getHeight() {
        return this.f1824h;
    }

    public double[] getInitGPSInfo() {
        return this.f1818b;
    }

    public OBRConfig getOBRConfig() {
        return this.f1822f;
    }

    public EGLContext getShareContext() {
        return this.f1821e;
    }

    public int getWidth() {
        return this.f1823g;
    }

    public boolean isUseTextureIO() {
        return this.f1820d;
    }

    public void setBuildingId(String str) {
        this.f1819c = str;
    }

    public void setCuid(String str) {
        this.f1817a = str;
    }

    public void setHeight(int i8) {
        this.f1824h = i8;
    }

    public void setInitGPSInfo(double[] dArr) {
        this.f1818b = dArr;
    }

    public void setOBRConfig(OBRConfig oBRConfig) {
        this.f1822f = oBRConfig;
    }

    public void setShareContext(EGLContext eGLContext) {
        this.f1821e = eGLContext;
    }

    public void setUseTextureIO(boolean z7) {
        this.f1820d = z7;
    }

    public void setWidth(int i8) {
        this.f1823g = i8;
    }
}
