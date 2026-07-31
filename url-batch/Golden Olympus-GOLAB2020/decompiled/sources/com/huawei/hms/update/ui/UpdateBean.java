package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class UpdateBean implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private boolean f14416b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14417c;

    /* renamed from: d, reason: collision with root package name */
    private String f14418d;

    /* renamed from: e, reason: collision with root package name */
    private int f14419e;

    /* renamed from: f, reason: collision with root package name */
    private String f14420f;

    /* renamed from: g, reason: collision with root package name */
    private String f14421g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f14422h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14423i = true;

    private static Object a(Object obj) {
        return obj;
    }

    public String getClientAppId() {
        return (String) a(this.f14420f);
    }

    public String getClientAppName() {
        return (String) a(this.f14421g);
    }

    public String getClientPackageName() {
        return (String) a(this.f14418d);
    }

    public int getClientVersionCode() {
        return ((Integer) a(Integer.valueOf(this.f14419e))).intValue();
    }

    public boolean getResolutionInstallHMS() {
        return this.f14417c;
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.f14422h);
    }

    public boolean isHmsOrApkUpgrade() {
        return ((Boolean) a(Boolean.valueOf(this.f14416b))).booleanValue();
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.f14423i))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.f14420f = str;
    }

    public void setClientAppName(String str) {
        this.f14421g = str;
    }

    public void setClientPackageName(String str) {
        this.f14418d = str;
    }

    public void setClientVersionCode(int i4) {
        this.f14419e = i4;
    }

    public void setHmsOrApkUpgrade(boolean z4) {
        this.f14416b = z4;
    }

    public void setNeedConfirm(boolean z4) {
        this.f14423i = z4;
    }

    public void setResolutionInstallHMS(boolean z4) {
        this.f14417c = z4;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f14422h = arrayList;
    }
}
