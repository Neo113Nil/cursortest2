package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.dx1;
import com.yandex.mobile.ads.impl.hx1;
import com.yandex.mobile.ads.impl.ua0;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yt1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f35315a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zw1 f35316b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final s22 f35317c;

    public /* synthetic */ yt1(C2105n4 c2105n4) {
        this(c2105n4, new zw1(), new s22());
    }

    @Nullable
    public final String a(@NotNull Context context, @NotNull C1803ac advertisingConfiguration, @NotNull d50 environmentConfiguration, @Nullable C2074lk c2074lk, @Nullable bu1 bu1Var) {
        String str;
        int i4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        C2105n4 c2105n4 = this.f35315a;
        EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28868y;
        c2105n4.getClass();
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        c2105n4.a(adLoadingPhaseType, null);
        hq configuration = new hq(advertisingConfiguration, environmentConfiguration);
        hx1.f26979a.getClass();
        String a4 = ((ix1) hx1.a.a(context)).a();
        String a5 = C2182qc.a().a();
        dx1.f24990a.getClass();
        String a6 = dx1.a.a(context).a();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces(...)");
            Iterator it = CollectionsKt.iterator(networkInterfaces);
            loop0: while (it.hasNext()) {
                Enumeration<InetAddress> inetAddresses = ((NetworkInterface) it.next()).getInetAddresses();
                Intrinsics.checkNotNullExpressionValue(inetAddresses, "getInetAddresses(...)");
                Iterator it2 = CollectionsKt.iterator(inetAddresses);
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    if (inetAddress instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) inetAddress;
                        Intrinsics.checkNotNullParameter(inet6Address, "<this>");
                        byte[] address = inet6Address.getAddress();
                        if (address != null && ((i4 = address[0] & 240) == 32 || i4 == 48)) {
                            str = ((Inet6Address) inetAddress).getHostAddress();
                            break loop0;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        str = null;
        zw1 sensitiveModeChecker = this.f35316b;
        nq1 resourceUtils = new nq1();
        ye1 optOutRepository = new ye1(context, zr0.a(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(resourceUtils, "resourceUtils");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        String a7 = this.f35317c.a(context, new ua0(ua0.b.a(context, sensitiveModeChecker, configuration, resourceUtils, optOutRepository).a(c2074lk != null ? c2074lk.a() : null).a(context, c2074lk != null ? c2074lk.c() : null).g(a4).h(a5).f(a6).c(str).a(bu1Var).a(c2074lk != null ? c2074lk.b() : null), 0).toString());
        c2105n4.a(adLoadingPhaseType);
        return a7;
    }

    public yt1(@NotNull C2105n4 adLoadingPhasesManager, @NotNull zw1 sensitiveModeChecker, @NotNull s22 stringEncryptor) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.checkNotNullParameter(stringEncryptor, "stringEncryptor");
        this.f35315a = adLoadingPhasesManager;
        this.f35316b = sensitiveModeChecker;
        this.f35317c = stringEncryptor;
    }
}
