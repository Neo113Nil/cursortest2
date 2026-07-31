package com.huawei.hms.common.internal;

/* loaded from: classes.dex */
public class ResolveClientBean {

    /* renamed from: a, reason: collision with root package name */
    private final int f14092a;

    /* renamed from: b, reason: collision with root package name */
    private final AnyClient f14093b;

    /* renamed from: c, reason: collision with root package name */
    private int f14094c;

    public ResolveClientBean(AnyClient anyClient, int i4) {
        this.f14093b = anyClient;
        this.f14092a = Objects.hashCode(anyClient);
        this.f14094c = i4;
    }

    public void clientReconnect() {
        this.f14093b.connect(this.f14094c, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResolveClientBean)) {
            return false;
        }
        return this.f14093b.equals(((ResolveClientBean) obj).f14093b);
    }

    public AnyClient getClient() {
        return this.f14093b;
    }

    public int hashCode() {
        return this.f14092a;
    }
}
