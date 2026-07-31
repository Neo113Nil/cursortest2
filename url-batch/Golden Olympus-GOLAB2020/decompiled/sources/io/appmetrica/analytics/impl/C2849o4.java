package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2849o4 {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f39539a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f39540b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f39541c;

    /* renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f39542d;

    /* renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f39543e;

    /* renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f39544f;

    /* renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f39545g;

    /* renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f39546h;

    /* renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f39547i;

    /* renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f39548j;

    /* renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f39549k;

    /* renamed from: l, reason: collision with root package name */
    public final long f39550l;

    /* renamed from: m, reason: collision with root package name */
    public final long f39551m;

    /* renamed from: n, reason: collision with root package name */
    public final C2907qa f39552n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f39553o;

    public C2849o4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j4, long j5, C2907qa c2907qa, Bundle bundle) {
        this.f39539a = identifiersResult;
        this.f39540b = identifiersResult2;
        this.f39541c = identifiersResult3;
        this.f39542d = identifiersResult4;
        this.f39543e = identifiersResult5;
        this.f39544f = identifiersResult6;
        this.f39545g = identifiersResult7;
        this.f39546h = identifiersResult8;
        this.f39547i = identifiersResult9;
        this.f39548j = identifiersResult10;
        this.f39549k = identifiersResult11;
        this.f39550l = j4;
        this.f39551m = j5;
        this.f39552n = c2907qa;
        this.f39553o = bundle;
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
        IdentifiersResult identifiersResult = this.f39539a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f39540b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f39541c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f39542d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f39543e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f39544f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f39545g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f39546h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle(IronSourceConstants.TYPE_GAID, bundle9);
        IdentifiersResult identifiersResult9 = this.f39547i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f39548j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f39549k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f39550l);
        bundle.putLong("NextStartupTime", this.f39551m);
        C2907qa c2907qa = this.f39552n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c2907qa);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", Ia.f37730F.o().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f39539a + ", mDeviceIdData=" + this.f39540b + ", mDeviceIdHashData=" + this.f39541c + ", mReportAdUrlData=" + this.f39542d + ", mGetAdUrlData=" + this.f39543e + ", mResponseClidsData=" + this.f39544f + ", mClientClidsForRequestData=" + this.f39545g + ", mGaidData=" + this.f39546h + ", mHoaidData=" + this.f39547i + ", yandexAdvIdData=" + this.f39548j + ", customSdkHostsData=" + this.f39549k + ", mServerTimeOffset=" + this.f39550l + ", nextStartupTime=" + this.f39551m + ", features=" + this.f39552n + ", modulesConfig=" + this.f39553o + '}';
    }

    public static C2907qa a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C2907qa.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C2907qa c2907qa = (C2907qa) parcelable;
        return c2907qa == null ? new C2907qa(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c2907qa;
    }

    public static IdentifiersResult a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, isEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, isEmpty ? "no identifier in startup state" : null);
    }

    public static C2907qa a(Boolean bool) {
        boolean z4 = bool != null;
        return new C2907qa(bool, z4 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z4 ? null : "no identifier in startup state");
    }
}
