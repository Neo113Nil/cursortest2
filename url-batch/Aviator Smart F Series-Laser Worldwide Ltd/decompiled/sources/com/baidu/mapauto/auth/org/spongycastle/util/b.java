package com.baidu.mapauto.auth.org.spongycastle.util;

import java.security.PrivilegedAction;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7862a = "org.spongycastle.asn1.allow_unsafe_integer";

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Map map = (Map) c.f7863a.get();
        return map != null ? map.get(this.f7862a) : System.getProperty(this.f7862a);
    }
}
