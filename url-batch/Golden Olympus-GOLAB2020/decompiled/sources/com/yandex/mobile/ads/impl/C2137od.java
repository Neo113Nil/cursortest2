package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jh1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.od, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2137od implements a12 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C2114nd f29979f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f29980g = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? super SSLSocket> f29981a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Method f29982b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f29983c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f29984d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f29985e;

    /* renamed from: com.yandex.mobile.ads.impl.od$a */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C2137od b(Class cls) {
            Class cls2 = cls;
            while (!Intrinsics.areEqual(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(cls2);
            return new C2137od(cls2);
        }

        public /* synthetic */ a(int i4) {
            this();
        }

        @NotNull
        public static C2114nd a() {
            return C2137od.f29979f;
        }
    }

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f29979f = new C2114nd();
    }

    public C2137od(@NotNull Class<? super SSLSocket> sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f29981a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.f29982b = declaredMethod;
        this.f29983c = sslSocketClass.getMethod("setHostname", String.class);
        this.f29984d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f29985e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.yandex.mobile.ads.impl.a12
    public final void a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends gm1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f29981a.isInstance(sslSocket)) {
            try {
                this.f29982b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f29983c.invoke(sslSocket, str);
                }
                Method method = this.f29985e;
                int i4 = jh1.f27657c;
                method.invoke(sslSocket, jh1.a.b(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.a12
    @Nullable
    public final String b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!this.f29981a.isInstance(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f29984d.invoke(sslSocket, null);
            if (bArr != null) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                return new String(bArr, UTF_8);
            }
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (NullPointerException e5) {
            if (!Intrinsics.areEqual(e5.getMessage(), "ssl == null")) {
                throw e5;
            }
        } catch (InvocationTargetException e6) {
            throw new AssertionError(e6);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.a12
    public final boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f29981a.isInstance(sslSocket);
    }

    @Override // com.yandex.mobile.ads.impl.a12
    public final boolean a() {
        boolean z4;
        z4 = C2043kd.f28175f;
        return z4;
    }
}
