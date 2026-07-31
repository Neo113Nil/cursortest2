package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.yandex.mobile.ads.impl.C1948gd;
import com.yandex.mobile.ads.impl.C1972hd;
import com.yandex.mobile.ads.impl.C2137od;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1924fd extends jh1 {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f25753e;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f25754d;

    static {
        f25753e = Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
    }

    public C1924fd() {
        C1948gd a4 = C1948gd.a.a();
        int i4 = C2137od.f29980g;
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new a12[]{a4, new m00(C2137od.a.a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((a12) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f25754d = arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    @NotNull
    public final nn a(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        C1972hd a4 = C1972hd.a.a(trustManager);
        if (a4 != null) {
            return a4;
        }
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C1907ek(b(trustManager));
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    @Nullable
    public final String b(@NotNull SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        ArrayList arrayList = this.f25754d;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((a12) obj).a(sslSocket)) {
                break;
            }
        }
        a12 a12Var = (a12) obj;
        if (a12Var != null) {
            return a12Var.b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    public final void a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends gm1> protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = this.f25754d;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((a12) obj).a(sslSocket)) {
                break;
            }
        }
        a12 a12Var = (a12) obj;
        if (a12Var != null) {
            a12Var.a(sslSocket, str, protocols);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    @SuppressLint({"NewApi"})
    public final boolean a(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
