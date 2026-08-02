package org.chromium.net;

import defpackage.jay;
import defpackage.jkj;
import defpackage.jkp;
import defpackage.jkx;
import defpackage.lke;
import defpackage.lkf;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VersionSafeProxyOptions {
    private static final int SET_PROXY_OPTIONS_API_LEVEL = 49;
    private final ProxyOptions mBackend;

    public VersionSafeProxyOptions(ProxyOptions proxyOptions) {
        if (!apiContainsProxyOptionsClass()) {
            throw new AssertionError(String.format("This should have not been created: the Cronet API being used has an ApiLevel of %s, but setProxyOptions was added in ApiLevel %s", Integer.valueOf(jay.g()), Integer.valueOf(SET_PROXY_OPTIONS_API_LEVEL)));
        }
        proxyOptions.getClass();
        this.mBackend = proxyOptions;
        if (proxyOptions.getProxyList().isEmpty()) {
            throw new AssertionError("The list of proxies should never be empty, this is checked in the API layer");
        }
    }

    private static boolean apiContainsProxyOptionsClass() {
        return jay.g() >= SET_PROXY_OPTIONS_API_LEVEL;
    }

    public List createProxyCallbackList() {
        ArrayList arrayList = new ArrayList();
        for (Proxy proxy : this.mBackend.getProxyList()) {
            arrayList.add(proxy == null ? null : new jay(proxy.getExecutor(), proxy.getCallback()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public lkf createProxyOptionsProto() {
        jkj k = lkf.a.k();
        for (Proxy proxy : this.mBackend.getProxyList()) {
            jkj k2 = lke.a.k();
            if (proxy == null) {
                if (!k2.b.M()) {
                    k2.t();
                }
                lke lkeVar = (lke) k2.b;
                lkeVar.c = 0;
                lkeVar.b |= 1;
            } else {
                String host = proxy.getHost();
                if (!k2.b.M()) {
                    k2.t();
                }
                jkp jkpVar = k2.b;
                lke lkeVar2 = (lke) jkpVar;
                host.getClass();
                lkeVar2.b |= 2;
                lkeVar2.d = host;
                int port = proxy.getPort();
                if (!jkpVar.M()) {
                    k2.t();
                }
                jkp jkpVar2 = k2.b;
                lke lkeVar3 = (lke) jkpVar2;
                lkeVar3.b |= 4;
                lkeVar3.e = port;
                int scheme = proxy.getScheme();
                if (scheme == 0) {
                    if (!jkpVar2.M()) {
                        k2.t();
                    }
                    lke lkeVar4 = (lke) k2.b;
                    lkeVar4.c = 1;
                    lkeVar4.b |= 1;
                } else {
                    if (scheme != 1) {
                        throw new AssertionError(String.format("Unknown Proxy.Scheme: %s. This should have been caught by the API layer", Integer.valueOf(scheme)));
                    }
                    if (!jkpVar2.M()) {
                        k2.t();
                    }
                    lke lkeVar5 = (lke) k2.b;
                    lkeVar5.c = 2;
                    lkeVar5.b |= 1;
                }
            }
            lke lkeVar6 = (lke) k2.q();
            if (!k.b.M()) {
                k.t();
            }
            lkf lkfVar = (lkf) k.b;
            lkeVar6.getClass();
            jkx jkxVar = lkfVar.b;
            if (!jkxVar.c()) {
                lkfVar.b = jkp.A(jkxVar);
            }
            lkfVar.b.add(lkeVar6);
        }
        return (lkf) k.q();
    }
}
