package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504a4 {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f7814a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f7815b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f7816c;

    /* renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f7817d;

    /* renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f7818e;

    /* renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f7819f;

    /* renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f7820g;

    /* renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f7821h;

    /* renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f7822i;

    /* renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f7823j;

    /* renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f7824k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7825l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7826m;

    /* renamed from: n, reason: collision with root package name */
    public final C0562ca f7827n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f7828o;

    public C0504a4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j2, long j6, C0562ca c0562ca, Bundle bundle) {
        this.f7814a = identifiersResult;
        this.f7815b = identifiersResult2;
        this.f7816c = identifiersResult3;
        this.f7817d = identifiersResult4;
        this.f7818e = identifiersResult5;
        this.f7819f = identifiersResult6;
        this.f7820g = identifiersResult7;
        this.f7821h = identifiersResult8;
        this.f7822i = identifiersResult9;
        this.f7823j = identifiersResult10;
        this.f7824k = identifiersResult11;
        this.f7825l = j2;
        this.f7826m = j6;
        this.f7827n = c0562ca;
        this.f7828o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f7814a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f7815b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f7816c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f7817d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f7818e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f7819f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f7820g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f7821h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.f7822i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f7823j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f7824k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f7825l);
        bundle.putLong("NextStartupTime", this.f7826m);
        C0562ca c0562ca = this.f7827n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c0562ca);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C1027ua.f9366H.p().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f7814a + ", mDeviceIdData=" + this.f7815b + ", mDeviceIdHashData=" + this.f7816c + ", mReportAdUrlData=" + this.f7817d + ", mGetAdUrlData=" + this.f7818e + ", mResponseClidsData=" + this.f7819f + ", mClientClidsForRequestData=" + this.f7820g + ", mGaidData=" + this.f7821h + ", mHoaidData=" + this.f7822i + ", yandexAdvIdData=" + this.f7823j + ", customSdkHostsData=" + this.f7824k + ", mServerTimeOffset=" + this.f7825l + ", nextStartupTime=" + this.f7826m + ", features=" + this.f7827n + ", modulesConfig=" + this.f7828o + '}';
    }

    public static C0562ca a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C0562ca.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C0562ca c0562ca = (C0562ca) parcelable;
        return c0562ca == null ? new C0562ca(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c0562ca;
    }

    public static IdentifiersResult a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, isEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, isEmpty ? "no identifier in startup state" : null);
    }

    public static C0562ca a(Boolean bool) {
        boolean z = bool != null;
        return new C0562ca(bool, z ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z ? null : "no identifier in startup state");
    }
}
