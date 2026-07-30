package com.baidu.mapapi.search.poi.v3;

/* loaded from: classes2.dex */
public class DetailOption {

    /* renamed from: a, reason: collision with root package name */
    private String f6960a;

    /* renamed from: b, reason: collision with root package name */
    private String f6961b;

    /* renamed from: d, reason: collision with root package name */
    private String f6963d;

    /* renamed from: f, reason: collision with root package name */
    private String f6965f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6962c = false;

    /* renamed from: e, reason: collision with root package name */
    private int f6964e = 1;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6966g = false;

    public String getLanguage() {
        return this.f6965f;
    }

    public String getRetCoordType() {
        return this.f6963d;
    }

    public int getScope() {
        return this.f6964e;
    }

    public String getUid() {
        return this.f6960a;
    }

    public String getUids() {
        return this.f6961b;
    }

    public boolean isExtensionsAdcode() {
        return this.f6962c;
    }

    public boolean isPhotoShow() {
        return this.f6966g;
    }

    public DetailOption setExtensionsAdcode(boolean z7) {
        this.f6962c = z7;
        return this;
    }

    public DetailOption setLanguage(String str) {
        this.f6965f = str;
        return this;
    }

    public DetailOption setPhotoShow(boolean z7) {
        this.f6966g = z7;
        return this;
    }

    public DetailOption setRetCoordType(String str) {
        this.f6963d = str;
        return this;
    }

    public DetailOption setScope(int i8) {
        this.f6964e = i8;
        return this;
    }

    public DetailOption setUid(String str) {
        this.f6960a = str;
        return this;
    }

    public DetailOption setUids(String str) {
        this.f6961b = str;
        return this;
    }
}
