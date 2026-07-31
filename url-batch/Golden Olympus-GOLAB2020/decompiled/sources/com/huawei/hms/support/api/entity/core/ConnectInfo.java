package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* loaded from: classes.dex */
public class ConnectInfo implements IMessageEntity {

    /* renamed from: a, reason: collision with root package name */
    @Packed
    private List<String> f14303a;

    /* renamed from: b, reason: collision with root package name */
    @Packed
    private List<Scope> f14304b;

    /* renamed from: c, reason: collision with root package name */
    @Packed
    private String f14305c;

    /* renamed from: d, reason: collision with root package name */
    @Packed
    private String f14306d;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.f14303a;
    }

    public String getFingerprint() {
        return this.f14305c;
    }

    public List<Scope> getScopeList() {
        return this.f14304b;
    }

    public String getSubAppID() {
        return this.f14306d;
    }

    public void setApiNameList(List<String> list) {
        this.f14303a = list;
    }

    public void setFingerprint(String str) {
        this.f14305c = str;
    }

    public void setScopeList(List<Scope> list) {
        this.f14304b = list;
    }

    public void setSubAppID(String str) {
        this.f14306d = str;
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
        this.f14303a = list;
        this.f14304b = list2;
        this.f14305c = str;
        this.f14306d = str2;
    }
}
