package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.td1;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ud1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap<vd1, td1> f33039a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final y62 f33040b = new y62();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33041c = 0;

    @NotNull
    public static td1 a(int i4, int i5, @Nullable SSLSocketFactory sSLSocketFactory) {
        f33040b.getClass();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        SSLSocketFactory sSLSocketFactory2 = null;
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        ArrayList arrayList = new ArrayList();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                arrayList.add(trustManager);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) CollectionsKt.firstOrNull((List) arrayList);
        if (sSLSocketFactory != null && x509TrustManager != null) {
            sSLSocketFactory2 = sSLSocketFactory;
        }
        vd1 vd1Var = new vd1(i4, i5, sSLSocketFactory2);
        ConcurrentHashMap<vd1, td1> concurrentHashMap = f33039a;
        if (!concurrentHashMap.containsKey(vd1Var)) {
            td1.a aVar = new td1.a();
            long j4 = i4;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            td1.a a4 = aVar.a(j4, timeUnit).b(i5, timeUnit).a();
            if (sSLSocketFactory != null && x509TrustManager != null) {
                a4 = a4.a(sSLSocketFactory, x509TrustManager);
            }
            concurrentHashMap.put(vd1Var, new td1(a4));
        }
        td1 td1Var = concurrentHashMap.get(vd1Var);
        if (td1Var != null) {
            return td1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
