package io.appmetrica.analytics.networkokhttp.impl;

import G3.q;
import G3.r;
import G3.s;
import G3.t;
import O3.n;
import d3.i;
import d3.j;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkokhttp.internal.InterceptorSupplier;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public abstract class d {
    public static s a(NetworkClientSettings networkClientSettings) {
        q qVar;
        r rVar = new r();
        t tVar = t.HTTP_2;
        t tVar2 = t.HTTP_1_1;
        ArrayList o02 = i.o0(j.W(tVar, tVar2));
        t tVar3 = t.H2_PRIOR_KNOWLEDGE;
        if (!o02.contains(tVar3) && !o02.contains(tVar2)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(o02, "protocols must contain h2_prior_knowledge or http/1.1: ").toString());
        }
        if (o02.contains(tVar3) && o02.size() > 1) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(o02, "protocols containing h2_prior_knowledge cannot use other protocols: ").toString());
        }
        if (o02.contains(t.HTTP_1_0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(o02, "protocols must not contain http/1.0: ").toString());
        }
        if (o02.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        o02.remove(t.SPDY_3);
        o02.equals(rVar.f970q);
        List unmodifiableList = Collections.unmodifiableList(o02);
        kotlin.jvm.internal.i.d(unmodifiableList, "unmodifiableList(protocolsCopy)");
        rVar.f970q = unmodifiableList;
        Integer readTimeout = networkClientSettings.getReadTimeout();
        if (readTimeout != null) {
            long intValue = readTimeout.intValue();
            TimeUnit unit = TimeUnit.MILLISECONDS;
            kotlin.jvm.internal.i.e(unit, "unit");
            rVar.v = H3.b.b(intValue);
        }
        Integer connectTimeout = networkClientSettings.getConnectTimeout();
        if (connectTimeout != null) {
            long intValue2 = connectTimeout.intValue();
            TimeUnit unit2 = TimeUnit.MILLISECONDS;
            kotlin.jvm.internal.i.e(unit2, "unit");
            rVar.f974u = H3.b.b(intValue2);
        }
        Boolean instanceFollowRedirects = networkClientSettings.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            rVar.f963h = instanceFollowRedirects.booleanValue();
        }
        try {
            String readSystemProperty = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.okhttp.mock");
            InterceptorSupplier interceptorSupplier = AbstractC1510g.j0(readSystemProperty) ? null : (InterceptorSupplier) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(readSystemProperty, InterceptorSupplier.class);
            if (interceptorSupplier != null && (qVar = interceptorSupplier.get()) != null) {
                rVar.f958c.add(qVar);
            }
        } catch (Throwable unused) {
        }
        SSLSocketFactory sslSocketFactory = networkClientSettings.getSslSocketFactory();
        if (sslSocketFactory != null) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                ArrayList arrayList = new ArrayList();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        arrayList.add(trustManager);
                    }
                }
                X509TrustManager x509TrustManager = (X509TrustManager) i.d0(arrayList);
                if (x509TrustManager != null) {
                    if (sslSocketFactory.equals(rVar.n)) {
                        x509TrustManager.equals(rVar.o);
                    }
                    rVar.n = sslSocketFactory;
                    n nVar = n.f2081a;
                    rVar.f973t = n.f2081a.b(x509TrustManager);
                    rVar.o = x509TrustManager;
                }
            } catch (Throwable unused2) {
            }
        }
        networkClientSettings.getUseCaches();
        return new s(rVar);
    }
}
