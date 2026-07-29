package org.apache.a.c.b;

import java.net.InetAddress;
import org.apache.a.m;

/* compiled from: RouteInfo.java */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: RouteInfo.java */
    public enum a {
        PLAIN,
        LAYERED
    }

    /* compiled from: RouteInfo.java */
    public enum b {
        PLAIN,
        TUNNELLED
    }

    m a();

    m a(int i);

    InetAddress b();

    int c();

    boolean e();

    boolean f();

    boolean g();
}
