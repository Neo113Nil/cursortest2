package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pp1;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vp0 implements InterfaceC2164ph {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33721a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f33721a = iArr;
        }
    }

    public vp0(@NotNull f30 defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2164ph
    @Nullable
    public final pp1 a(@Nullable ps1 ps1Var, @NotNull oq1 response) {
        Proxy proxy;
        f30 f30Var;
        InetAddress address;
        PasswordAuthentication requestPasswordAuthentication;
        InetAddress address2;
        C2202ra a4;
        Intrinsics.checkNotNullParameter(response, "response");
        List<pn> c4 = response.c();
        pp1 o4 = response.o();
        mh0 g4 = o4.g();
        boolean z4 = response.d() == 407;
        if (ps1Var == null || (proxy = ps1Var.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (pn pnVar : c4) {
            if (StringsKt.w("Basic", pnVar.c(), true)) {
                if (ps1Var == null || (a4 = ps1Var.a()) == null || (f30Var = a4.c()) == null) {
                    f30Var = f30.f25600a;
                }
                if (z4) {
                    SocketAddress address3 = proxy.address();
                    Intrinsics.checkNotNull(address3, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address3;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNull(proxy);
                    Proxy.Type type = proxy.type();
                    if (type != null && a.f33721a[type.ordinal()] == 1) {
                        address2 = (InetAddress) CollectionsKt.first((List) f30Var.a(g4.g()));
                    } else {
                        SocketAddress address4 = proxy.address();
                        Intrinsics.checkNotNull(address4, "null cannot be cast to non-null type java.net.InetSocketAddress");
                        address2 = ((InetSocketAddress) address4).getAddress();
                        Intrinsics.checkNotNullExpressionValue(address2, "getAddress(...)");
                    }
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, address2, inetSocketAddress.getPort(), g4.k(), pnVar.b(), pnVar.c(), g4.m(), Authenticator.RequestorType.PROXY);
                } else {
                    String g5 = g4.g();
                    Intrinsics.checkNotNull(proxy);
                    Proxy.Type type2 = proxy.type();
                    if (type2 != null && a.f33721a[type2.ordinal()] == 1) {
                        address = (InetAddress) CollectionsKt.first((List) f30Var.a(g4.g()));
                    } else {
                        SocketAddress address5 = proxy.address();
                        Intrinsics.checkNotNull(address5, "null cannot be cast to non-null type java.net.InetSocketAddress");
                        address = ((InetSocketAddress) address5).getAddress();
                        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
                    }
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(g5, address, g4.i(), g4.k(), pnVar.b(), pnVar.c(), g4.m(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z4 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "getUserName(...)");
                    char[] password = requestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "getPassword(...)");
                    return new pp1.a(o4).b(str, ru.a(userName, new String(password), pnVar.a())).a();
                }
            }
        }
        return null;
    }
}
