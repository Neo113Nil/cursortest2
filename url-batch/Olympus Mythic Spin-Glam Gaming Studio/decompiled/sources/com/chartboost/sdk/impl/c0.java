package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Networking.EndpointRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class c0 {
    public final String a;
    public final EndpointRepository.EndPoint b;
    public final EndpointRepository.EndPoint c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public c0(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z, boolean z2) {
        this.a = str;
        this.b = endPoint;
        this.c = endPoint2;
        this.d = z;
        this.e = z2;
        this.f = !z;
    }

    public final String b() {
        return this.a;
    }

    public final EndpointRepository.EndPoint a() {
        return this.b;
    }

    public final EndpointRepository.EndPoint d() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean e() {
        return this.f;
    }

    public static final class b extends c0 {
        public static final b g = new b();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 743805773;
        }

        public String toString() {
            return "Interstitial";
        }

        public b() {
            super("Interstitial", EndpointRepository.EndPoint.INTERSTITIAL_GET, EndpointRepository.EndPoint.INTERSTITIAL_SHOW, false, false, 24, null);
        }
    }

    public /* synthetic */ c0(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, endPoint, endPoint2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, null);
    }

    public /* synthetic */ c0(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, endPoint, endPoint2, z, z2);
    }

    public static final class c extends c0 {
        public static final c g = new c();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1735897263;
        }

        public String toString() {
            return "Rewarded";
        }

        public c() {
            super("Rewarded", EndpointRepository.EndPoint.REWARDED_GET, EndpointRepository.EndPoint.REWARDED_SHOW, false, false, 8, null);
        }
    }

    public static final class a extends c0 {
        public static final a g = new a();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 312973325;
        }

        public String toString() {
            return "Banner";
        }

        public a() {
            super("Banner", EndpointRepository.EndPoint.BANNER_GET, EndpointRepository.EndPoint.BANNER_SHOW, true, false, 16, null);
        }
    }
}
