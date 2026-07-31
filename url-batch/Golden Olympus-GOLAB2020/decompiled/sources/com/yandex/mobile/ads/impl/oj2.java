package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import com.yandex.mobile.ads.impl.ew1;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oj2 implements nj2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W1.h f30062a = W1.i.b(a.f30063b);

    static final class a extends kotlin.jvm.internal.s implements Function0<CertificateFactory> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30063b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CertificateFactory.getInstance("X.509");
        }
    }

    @Override // com.yandex.mobile.ads.impl.nj2
    public final boolean a(@NotNull Context context, @NotNull SslError sslError) {
        X509Certificate a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sslError, "sslError");
        int i4 = ew1.f25476l;
        du1 a5 = ew1.a.a().a(context);
        if (a5 != null && a5.n0()) {
            if (Build.VERSION.SDK_INT >= 29) {
                a4 = sslError.getCertificate().getX509Certificate();
            } else {
                SslCertificate certificate = sslError.getCertificate();
                Intrinsics.checkNotNullExpressionValue(certificate, "getCertificate(...)");
                Object value = this.f30062a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                a4 = vs1.a(certificate, (CertificateFactory) value);
            }
            if (a4 == null) {
                return false;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                xq0.a(new cu1(context)).checkServerTrusted(new X509Certificate[]{a4}, "RSA");
                return true;
            } catch (Exception unused) {
                Object[] args = new Object[0];
                int i5 = ap0.f23396b;
                Intrinsics.checkNotNullParameter(args, "args");
            }
        }
        return false;
    }
}
