package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zp0 extends jh1 {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f35653d;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0.intValue() >= 9) goto L11;
     */
    static {
        boolean z4;
        String property = System.getProperty("java.specification.version");
        Integer intOrNull = property != null ? StringsKt.toIntOrNull(property) : null;
        if (intOrNull == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
                z4 = false;
                f35653d = z4;
            }
        }
        z4 = true;
        f35653d = z4;
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    public final void a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<gm1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((gm1) obj) != gm1.f26228d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((gm1) obj2).toString());
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    @Nullable
    public final String b(@NotNull SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!Intrinsics.areEqual(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
