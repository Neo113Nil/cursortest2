package com.baidu.ar;

import android.opengl.EGLContext;
import com.baidu.ar.obr.OBRConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DefaultParams {

    /* renamed from: a, reason: collision with root package name */
    public String f1454a;

    /* renamed from: b, reason: collision with root package name */
    public String f1455b;

    /* renamed from: n, reason: collision with root package name */
    public String f1467n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1468o;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1456c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1457d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1458e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1459f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1460g = false;

    /* renamed from: h, reason: collision with root package name */
    public EGLContext f1461h = null;

    /* renamed from: i, reason: collision with root package name */
    public String f1462i = null;

    /* renamed from: j, reason: collision with root package name */
    public JSONObject f1463j = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1464k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1465l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1466m = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1469p = true;

    /* renamed from: q, reason: collision with root package name */
    public String f1470q = "wss://dusee.baidu.com/digitalhuman-ws";

    /* renamed from: r, reason: collision with root package name */
    public String f1471r = "i-kgqiz7g0gv22a";

    /* renamed from: s, reason: collision with root package name */
    public String f1472s = "app_key";

    /* renamed from: t, reason: collision with root package name */
    public OBRConfig f1473t = null;

    public void enableLog(boolean z7) {
        this.f1464k = z7;
    }

    public String get3dShaderDBPath() {
        return this.f1467n;
    }

    public String getDigitalSocketUrl() {
        return this.f1470q;
    }

    public String getDigitalUnitAppId() {
        return this.f1471r;
    }

    public String getDigitalUnitAppKey() {
        return this.f1472s;
    }

    public String getFaceAlgoModelPath() {
        return this.f1454a;
    }

    public JSONObject getGradingConfig() {
        return this.f1463j;
    }

    public String getMdlAlgoModelPath() {
        return this.f1455b;
    }

    public OBRConfig getOBRConfig() {
        return this.f1473t;
    }

    public String getRenderPipeline() {
        return this.f1462i;
    }

    public EGLContext getShareContext() {
        return this.f1461h;
    }

    public boolean isDigitalArEnable() {
        return this.f1468o;
    }

    public boolean isDigitalSocketEnable() {
        return this.f1469p;
    }

    public boolean isLogEnable() {
        return this.f1464k;
    }

    public boolean isRecordAutoCrop() {
        return this.f1466m;
    }

    public boolean isUseBeautyFilter() {
        return this.f1457d;
    }

    public boolean isUseFaceFilter() {
        return this.f1458e;
    }

    public boolean isUseInputSizeInEngine() {
        return this.f1456c;
    }

    public boolean isUseMakeupFilter() {
        return this.f1459f;
    }

    public boolean isUseTextureIO() {
        return this.f1460g;
    }

    public boolean isUserPlayAudio() {
        return this.f1465l;
    }

    public void set3dShaderPath(String str) {
        this.f1467n = str;
    }

    public void setDigitalArEnable(boolean z7) {
        this.f1468o = z7;
    }

    public void setDigitalSocketEnable(boolean z7) {
        this.f1469p = z7;
    }

    public void setDigitalSocketUrl(String str) {
        this.f1470q = str;
    }

    public void setDigitalUnitAppId(String str) {
        this.f1471r = str;
    }

    public void setDigitalUnitAppKey(String str) {
        this.f1472s = str;
    }

    public void setFaceAlgoModelPath(String str) {
        this.f1454a = str;
    }

    public void setGradingConfig(JSONObject jSONObject) {
        this.f1463j = jSONObject;
    }

    public void setMdlAlgoModelPath(String str) {
        this.f1455b = str;
    }

    public void setOBRConfig(OBRConfig oBRConfig) {
        this.f1473t = oBRConfig;
    }

    public void setRecordAutoCrop(boolean z7) {
        this.f1466m = z7;
    }

    public void setRenderPipeline(String str) {
        this.f1462i = str;
    }

    public void setShareContext(EGLContext eGLContext) {
        this.f1461h = eGLContext;
    }

    public void setUseBeautyFilter(boolean z7) {
        this.f1457d = z7;
    }

    public void setUseFaceFilter(boolean z7) {
        this.f1458e = z7;
    }

    public void setUseInputSizeInEngine(boolean z7) {
        this.f1456c = z7;
    }

    public void setUseMakeupFilter(boolean z7) {
        this.f1459f = z7;
    }

    public void setUseTextureIO(boolean z7) {
        this.f1460g = z7;
    }

    public void setUserPlayAudio(boolean z7) {
        this.f1465l = z7;
    }
}
