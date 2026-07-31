package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.sg;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class a implements EndpointRepository {
    public final sg a;

    /* renamed from: com.chartboost.sdk.internal.Networking.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0235a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.INTERSTITIAL_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EndpointRepository.EndPoint.REWARDED_GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EndpointRepository.EndPoint.PREFETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public a(sg sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.a = sdkConfiguration;
    }

    public final URL a(EndpointRepository.EndPoint endPoint) {
        int i = C0235a.a[endPoint.ordinal()];
        if (i == 1) {
            String format = String.format("webview/%s/interstitial/get", Arrays.copyOf(new Object[]{this.a.y}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return a(endPoint, format);
        }
        if (i == 2) {
            String format2 = String.format("webview/%s/reward/get", Arrays.copyOf(new Object[]{this.a.y}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return a(endPoint, format2);
        }
        if (i != 3) {
            return null;
        }
        String webviewPrefetchEndpoint = this.a.z;
        Intrinsics.checkNotNullExpressionValue(webviewPrefetchEndpoint, "webviewPrefetchEndpoint");
        return a(endPoint, webviewPrefetchEndpoint);
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public URL getEndPointUrl(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        URL a = a(endPoint);
        return a == null ? b.b(endPoint) : a;
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void restoreDefaults() {
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void setEndpoint(EndpointRepository.EndPoint endPoint, String host, String path) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IllegalStateException("Cannot set endpoint");
    }

    public final URL a(EndpointRepository.EndPoint endPoint, String str) {
        return new URL("https", b.a(endPoint), "/" + str);
    }
}
