package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class ClientSettings {

    /* renamed from: a, reason: collision with root package name */
    private String f14066a;

    /* renamed from: b, reason: collision with root package name */
    private String f14067b;

    /* renamed from: c, reason: collision with root package name */
    private List<Scope> f14068c;

    /* renamed from: d, reason: collision with root package name */
    private String f14069d;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f14070e;

    /* renamed from: f, reason: collision with root package name */
    private String f14071f;

    /* renamed from: g, reason: collision with root package name */
    private SubAppInfo f14072g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f14073h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14074i;

    /* renamed from: j, reason: collision with root package name */
    private String f14075j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14076k;

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2) {
        this.f14066a = str;
        this.f14067b = str2;
        this.f14068c = list;
        this.f14069d = str3;
        this.f14070e = list2;
    }

    public List<String> getApiName() {
        return this.f14070e;
    }

    public String getAppID() {
        return this.f14069d;
    }

    public String getClientClassName() {
        return this.f14067b;
    }

    public String getClientPackageName() {
        return this.f14066a;
    }

    public Activity getCpActivity() {
        WeakReference<Activity> weakReference = this.f14073h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getCpID() {
        return this.f14071f;
    }

    public String getInnerHmsPkg() {
        return this.f14075j;
    }

    public List<Scope> getScopes() {
        return this.f14068c;
    }

    public SubAppInfo getSubAppID() {
        return this.f14072g;
    }

    public boolean isHasActivity() {
        return this.f14074i;
    }

    public boolean isUseInnerHms() {
        return this.f14076k;
    }

    public void setApiName(List<String> list) {
        this.f14070e = list;
    }

    public void setAppID(String str) {
        this.f14069d = str;
    }

    public void setClientClassName(String str) {
        this.f14067b = str;
    }

    public void setClientPackageName(String str) {
        this.f14066a = str;
    }

    public void setCpActivity(Activity activity) {
        this.f14073h = new WeakReference<>(activity);
        this.f14074i = true;
    }

    public void setCpID(String str) {
        this.f14071f = str;
    }

    public void setInnerHmsPkg(String str) {
        this.f14075j = str;
    }

    public void setScopes(List<Scope> list) {
        this.f14068c = list;
    }

    public void setSubAppId(SubAppInfo subAppInfo) {
        this.f14072g = subAppInfo;
    }

    public void setUseInnerHms(boolean z4) {
        this.f14076k = z4;
    }

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2, SubAppInfo subAppInfo) {
        this(str, str2, list, str3, list2);
        this.f14072g = subAppInfo;
    }
}
