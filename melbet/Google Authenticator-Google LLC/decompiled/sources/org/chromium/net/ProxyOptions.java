package org.chromium.net;

import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProxyOptions {
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_ALLOW_DIRECT = 1;
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_DISALLOW_DIRECT = 0;
    private final List mProxyList;

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AllProxiesFailedBehavior {
    }

    private ProxyOptions(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ProxyList cannot be empty");
        }
        int indexOf = list.indexOf(null);
        if (indexOf != -1 && indexOf != list.size() - 1) {
            throw new IllegalArgumentException("Null is allowed only as the last element in the proxy list");
        }
        this.mProxyList = DesugarCollections.unmodifiableList(list);
    }

    public static ProxyOptions fromProxyList(List list, int i) {
        list.getClass();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("proxyList cannot be empty");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("proxyList cannot contain null");
        }
        ArrayList arrayList = new ArrayList(list);
        if (i == 1) {
            arrayList.add(null);
        }
        return new ProxyOptions(arrayList);
    }

    public List getProxyList() {
        return this.mProxyList;
    }
}
