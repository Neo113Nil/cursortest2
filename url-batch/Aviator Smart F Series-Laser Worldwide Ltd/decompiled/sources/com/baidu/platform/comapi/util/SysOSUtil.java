package com.baidu.platform.comapi.util;

import com.baidu.vi.VIContext;

/* loaded from: classes2.dex */
public class SysOSUtil {

    /* renamed from: a, reason: collision with root package name */
    private static SysOSUtil f9815a = new SysOSUtil();

    /* renamed from: b, reason: collision with root package name */
    private com.baidu.platform.comapi.util.l.b f9816b = null;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.util.l.a f9817c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9818d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f9819e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f9820f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f9821g = "";

    private SysOSUtil() {
    }

    public static SysOSUtil getInstance() {
        return f9815a;
    }

    public String getCompatibleSdcardPath() {
        com.baidu.platform.comapi.util.l.b bVar = this.f9816b;
        return bVar != null ? bVar.a() : "";
    }

    public float getDensity() {
        com.baidu.platform.comapi.util.l.a aVar = this.f9817c;
        if (aVar != null) {
            return aVar.a();
        }
        return 1.0f;
    }

    public int getDensityDPI() {
        com.baidu.platform.comapi.util.l.a aVar = this.f9817c;
        if (aVar != null) {
            return aVar.b();
        }
        return 1;
    }

    public String getExternalFilesDir() {
        com.baidu.platform.comapi.util.l.b bVar = this.f9816b;
        return bVar != null ? bVar.b() : "";
    }

    public String getGLRenderer() {
        return this.f9821g;
    }

    public String getGLVersion() {
        return this.f9820f;
    }

    public String getNetType() {
        return this.f9819e;
    }

    public String getOutputCache() {
        com.baidu.platform.comapi.util.l.b bVar = this.f9816b;
        return bVar != null ? bVar.c() : "";
    }

    public String getOutputDirPath() {
        com.baidu.platform.comapi.util.l.b bVar = this.f9816b;
        return bVar != null ? bVar.d() : "";
    }

    public int getScreenHeight() {
        com.baidu.platform.comapi.util.l.a aVar = this.f9817c;
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    public int getScreenWidth() {
        com.baidu.platform.comapi.util.l.a aVar = this.f9817c;
        if (aVar != null) {
            return aVar.d();
        }
        return 0;
    }

    public String getSdcardPath() {
        com.baidu.platform.comapi.util.l.b bVar = this.f9816b;
        return bVar != null ? bVar.e() : "";
    }

    public void init(com.baidu.platform.comapi.util.l.b bVar, com.baidu.platform.comapi.util.l.a aVar) {
        if (this.f9818d) {
            return;
        }
        this.f9816b = bVar;
        this.f9817c = aVar;
        if (bVar == null) {
            this.f9816b = new com.baidu.platform.comapi.util.l.b();
        }
        if (this.f9817c == null) {
            this.f9817c = new com.baidu.platform.comapi.util.l.a();
        }
        this.f9816b.a(VIContext.getContext());
        this.f9817c.a(VIContext.getContext());
        try {
            NetworkUtil.registerNetwork(VIContext.getContext());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.f9818d = true;
    }

    public void setGLInfo(String str, String str2) {
        if (this.f9821g.equals(str2) && this.f9820f.equals(str)) {
            return;
        }
        this.f9820f = str;
        this.f9821g = str2;
    }

    public void updateNetType(String str) {
        this.f9819e = str;
    }
}
