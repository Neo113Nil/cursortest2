package org.apache.a.f.c;

import com.mopub.common.Constants;

/* compiled from: SchemeRegistryFactory.java */
/* loaded from: classes2.dex */
public final class m {
    public static org.apache.a.c.c.g a() {
        org.apache.a.c.c.g gVar = new org.apache.a.c.c.g();
        gVar.a(new org.apache.a.c.c.f(Constants.HTTP, 80, org.apache.a.c.c.e.a()));
        gVar.a(new org.apache.a.c.c.f(Constants.HTTPS, 443, org.apache.a.c.d.d.getSocketFactory()));
        return gVar;
    }
}
