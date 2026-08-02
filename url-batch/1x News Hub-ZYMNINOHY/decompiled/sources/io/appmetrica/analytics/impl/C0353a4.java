package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353a4 {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f6973a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f6974b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f6975c;

    /* renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f6976d;

    /* renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f6977e;
    public final IdentifiersResult f;

    /* renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f6978g;

    /* renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f6979h;

    /* renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f6980i;

    /* renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f6981j;

    /* renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f6982k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6983l;

    /* renamed from: m, reason: collision with root package name */
    public final long f6984m;

    /* renamed from: n, reason: collision with root package name */
    public final C0411ca f6985n;
    public final Bundle o;

    public C0353a4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j3, long j4, C0411ca c0411ca, Bundle bundle) {
        this.f6973a = identifiersResult;
        this.f6974b = identifiersResult2;
        this.f6975c = identifiersResult3;
        this.f6976d = identifiersResult4;
        this.f6977e = identifiersResult5;
        this.f = identifiersResult6;
        this.f6978g = identifiersResult7;
        this.f6979h = identifiersResult8;
        this.f6980i = identifiersResult9;
        this.f6981j = identifiersResult10;
        this.f6982k = identifiersResult11;
        this.f6983l = j3;
        this.f6984m = j4;
        this.f6985n = c0411ca;
        this.o = bundle;
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
        IdentifiersResult identifiersResult = this.f6973a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f6974b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f6975c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f6976d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f6977e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f6978g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f6979h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.f6980i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f6981j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f6982k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f6983l);
        bundle.putLong("NextStartupTime", this.f6984m);
        C0411ca c0411ca = this.f6985n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c0411ca);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C0876ua.f8420H.p().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f6973a + ", mDeviceIdData=" + this.f6974b + ", mDeviceIdHashData=" + this.f6975c + ", mReportAdUrlData=" + this.f6976d + ", mGetAdUrlData=" + this.f6977e + ", mResponseClidsData=" + this.f + ", mClientClidsForRequestData=" + this.f6978g + ", mGaidData=" + this.f6979h + ", mHoaidData=" + this.f6980i + ", yandexAdvIdData=" + this.f6981j + ", customSdkHostsData=" + this.f6982k + ", mServerTimeOffset=" + this.f6983l + ", nextStartupTime=" + this.f6984m + ", features=" + this.f6985n + ", modulesConfig=" + this.o + '}';
    }

    public static C0411ca a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C0411ca.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C0411ca c0411ca = (C0411ca) parcelable;
        return c0411ca == null ? new C0411ca(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c0411ca;
    }

    public static IdentifiersResult a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, isEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, isEmpty ? "no identifier in startup state" : null);
    }

    public static C0411ca a(Boolean bool) {
        boolean z = bool != null;
        return new C0411ca(bool, z ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z ? null : "no identifier in startup state");
    }
}
