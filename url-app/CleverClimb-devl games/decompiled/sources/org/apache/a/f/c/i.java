package org.apache.a.f.c;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/* compiled from: HttpInetSocketAddress.java */
/* loaded from: classes2.dex */
class i extends InetSocketAddress {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.m f9838a;

    public i(org.apache.a.m mVar, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        if (mVar == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        this.f9838a = mVar;
    }

    @Override // java.net.InetSocketAddress
    public String toString() {
        return this.f9838a.a() + ":" + getPort();
    }
}
