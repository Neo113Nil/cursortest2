package org.apache.a.c;

import java.net.ConnectException;

/* compiled from: HttpHostConnectException.java */
/* loaded from: classes2.dex */
public class l extends ConnectException {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.m f9696a;

    public l(org.apache.a.m mVar, ConnectException connectException) {
        super("Connection to " + mVar + " refused");
        this.f9696a = mVar;
        initCause(connectException);
    }
}
