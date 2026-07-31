package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2773l6 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C2773l6> CREATOR = new C2747k6();

    /* renamed from: a, reason: collision with root package name */
    protected String f39376a;

    /* renamed from: b, reason: collision with root package name */
    protected String f39377b;

    /* renamed from: c, reason: collision with root package name */
    public String f39378c;

    /* renamed from: d, reason: collision with root package name */
    public int f39379d;

    /* renamed from: e, reason: collision with root package name */
    public int f39380e;

    /* renamed from: f, reason: collision with root package name */
    public Pair f39381f;

    /* renamed from: g, reason: collision with root package name */
    public int f39382g;

    /* renamed from: h, reason: collision with root package name */
    public String f39383h;

    /* renamed from: i, reason: collision with root package name */
    public long f39384i;

    /* renamed from: j, reason: collision with root package name */
    public long f39385j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC3114ya f39386k;

    /* renamed from: l, reason: collision with root package name */
    public H9 f39387l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f39388m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f39389n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f39390o;

    /* renamed from: p, reason: collision with root package name */
    public Map f39391p;

    public C2773l6() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f39381f == null) {
            this.f39381f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f39381f;
    }

    public final void c(Bundle bundle) {
        this.f39388m = bundle;
    }

    public final long d() {
        return this.f39384i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f39385j;
    }

    public final String f() {
        return this.f39378c;
    }

    @NonNull
    public final EnumC3114ya g() {
        return this.f39386k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f39382g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f39380e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.f39391p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f39376a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f39379d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f39377b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f39377b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.f39390o;
    }

    public final Bundle i() {
        return this.f39388m;
    }

    public final String j() {
        return this.f39383h;
    }

    public final H9 k() {
        return this.f39387l;
    }

    public final boolean l() {
        return this.f39376a == null;
    }

    public final boolean m() {
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f39379d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i4) {
        this.f39382g = i4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i4) {
        this.f39380e = i4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.f39391p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f39376a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i4) {
        this.f39379d = i4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f39377b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f39377b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f39376a;
        String str2 = EnumC3063wb.a(this.f39379d).f40074b;
        String str3 = this.f39377b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        return String.format(locale, "[event: %s, type: %s, value: %s]", str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f39376a);
        bundle.putString("CounterReport.Value", this.f39377b);
        bundle.putInt("CounterReport.Type", this.f39379d);
        bundle.putInt("CounterReport.CustomType", this.f39380e);
        bundle.putInt("CounterReport.TRUNCATED", this.f39382g);
        bundle.putString("CounterReport.ProfileID", this.f39383h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f39386k.f40274a);
        Bundle bundle2 = this.f39388m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f39378c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f39381f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f39384i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f39385j);
        H9 h9 = this.f39387l;
        if (h9 != null) {
            bundle.putInt("CounterReport.Source", h9.f37634a);
        }
        Boolean bool = this.f39389n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f39390o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f39391p));
        parcel.writeBundle(bundle);
    }

    public C2773l6(String str, int i4) {
        this("", str, i4);
    }

    @NonNull
    public static C2773l6 e(@NonNull C2773l6 c2773l6) {
        return a(c2773l6, EnumC3063wb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f39378c = str;
    }

    public void c(String str) {
        this.f39383h = str;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C2773l6(String str, String str2, int i4) {
        this(str, str2, i4, new SystemTimeProvider());
    }

    public final void a(long j4) {
        this.f39384i = j4;
    }

    public final void b(long j4) {
        this.f39385j = j4;
    }

    public final Boolean c() {
        return this.f39389n;
    }

    public C2773l6(String str, String str2, int i4, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f39386k = EnumC3114ya.UNKNOWN;
        this.f39391p = new HashMap();
        this.f39376a = str2;
        this.f39379d = i4;
        this.f39377b = str;
        this.f39384i = systemTimeProvider.elapsedRealtime();
        this.f39385j = systemTimeProvider.currentTimeMillis();
    }

    @NonNull
    public static C2773l6 b(Bundle bundle) {
        if (bundle != null) {
            try {
                C2773l6 c2773l6 = (C2773l6) bundle.getParcelable("CounterReport.Object");
                if (c2773l6 != null) {
                    return c2773l6;
                }
            } catch (Throwable unused) {
                return new C2773l6("", 0);
            }
        }
        return new C2773l6("", 0);
    }

    @NonNull
    public static C2773l6 c(@NonNull C2773l6 c2773l6) {
        return a(c2773l6, EnumC3063wb.EVENT_TYPE_INIT);
    }

    @NonNull
    public static C2773l6 d(@NonNull C2773l6 c2773l6) {
        C2773l6 c2773l62 = new C2773l6("", 0);
        c2773l62.f39385j = c2773l6.f39385j;
        c2773l62.f39384i = c2773l6.f39384i;
        c2773l62.f39381f = c2773l6.f39381f;
        c2773l62.f39378c = c2773l6.f39378c;
        c2773l62.f39388m = c2773l6.f39388m;
        c2773l62.f39391p = c2773l6.f39391p;
        c2773l62.f39383h = c2773l6.f39383h;
        return c2773l62;
    }

    public final void a(@NonNull EnumC3114ya enumC3114ya) {
        this.f39386k = enumC3114ya;
    }

    public final void a(H9 h9) {
        this.f39387l = h9;
    }

    public final void a(Boolean bool) {
        this.f39389n = bool;
    }

    public final void a(Integer num) {
        this.f39390o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    @NonNull
    public static C2773l6 b(@NonNull C2773l6 c2773l6) {
        return a(c2773l6, EnumC3063wb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static C2773l6 a(C2773l6 c2773l6, EnumC3063wb enumC3063wb) {
        C2773l6 d4 = d(c2773l6);
        d4.f39379d = enumC3063wb.f40073a;
        return d4;
    }

    @NonNull
    public static C2773l6 a(@NonNull C2773l6 c2773l6) {
        return a(c2773l6, EnumC3063wb.EVENT_TYPE_ALIVE);
    }

    @NonNull
    public static C2773l6 a(@NonNull C2773l6 c2773l6, @NonNull C2674ha c2674ha) {
        C2773l6 a4 = a(c2773l6, EnumC3063wb.EVENT_TYPE_START);
        a4.setValueBytes(MessageNano.toByteArray(new K9().fromModel(new J9((String) c2674ha.f39136b.a()))));
        a4.f39385j = c2773l6.f39385j;
        a4.f39384i = c2773l6.f39384i;
        return a4;
    }

    @NonNull
    public static C2773l6 a(@NonNull C2773l6 c2773l6, @NonNull Collection<PermissionState> collection, J2 j22, @NonNull C2692i2 c2692i2, @NonNull List<String> list) {
        String str;
        String str2;
        C2773l6 d4 = d(c2773l6);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (j22 != null) {
                jSONObject.put("background_restricted", j22.f37788b);
                I2 i22 = j22.f37787a;
                c2692i2.getClass();
                if (i22 != null) {
                    switch (i22) {
                        case EXEMPTED:
                            str2 = "EXEMPTED";
                            break;
                        case ACTIVE:
                            str2 = "ACTIVE";
                            break;
                        case WORKING_SET:
                            str2 = "WORKING_SET";
                            break;
                        case FREQUENT:
                            str2 = "FREQUENT";
                            break;
                        case RARE:
                            str2 = "RARE";
                            break;
                        case RESTRICTED:
                            str2 = "RESTRICTED";
                            break;
                        case UNKNOWN:
                            str2 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                            break;
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        d4.f39379d = 12288;
        d4.setValue(str);
        return d4;
    }

    @NonNull
    public static C2773l6 a(@NonNull C2773l6 c2773l6, String str) {
        C2773l6 d4 = d(c2773l6);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        d4.f39379d = 12289;
        d4.setValue(str);
        return d4;
    }

    @NonNull
    public static C2773l6 a() {
        C2773l6 c2773l6 = new C2773l6("", 0);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2773l6.f39379d = 16384;
        return c2773l6;
    }

    @NonNull
    public static C2773l6 a(@NonNull Tf tf) {
        String str = "";
        int i4 = 0;
        C2773l6 c2773l6 = new C2773l6("", "", 0);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2773l6.f39379d = 40976;
        ProductInfo productInfo = tf.f38321a;
        Zi zi = new Zi();
        zi.f38632a = productInfo.quantity;
        zi.f38637f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
        }
        zi.f38633b = str.getBytes();
        zi.f38634c = productInfo.sku.getBytes();
        Ui ui = new Ui();
        ui.f38375a = productInfo.purchaseOriginalJson.getBytes();
        ui.f38376b = productInfo.signature.getBytes();
        zi.f38636e = ui;
        zi.f38638g = true;
        zi.f38639h = 1;
        zi.f38640i = Sf.f38254a[productInfo.type.ordinal()] != 2 ? 1 : 2;
        Yi yi = new Yi();
        yi.f38567a = productInfo.purchaseToken.getBytes();
        yi.f38568b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zi.f38641j = yi;
        if (productInfo.type == ProductType.SUBS) {
            Xi xi = new Xi();
            xi.f38529a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                Wi wi = new Wi();
                wi.f38480a = period.number;
                int i5 = Sf.f38255b[period.timeUnit.ordinal()];
                wi.f38481b = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? 0 : 4 : 3 : 2 : 1;
                xi.f38530b = wi;
            }
            Vi vi = new Vi();
            vi.f38431a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                Wi wi2 = new Wi();
                wi2.f38480a = period2.number;
                int i6 = Sf.f38255b[period2.timeUnit.ordinal()];
                if (i6 == 1) {
                    i4 = 1;
                } else if (i6 == 2) {
                    i4 = 2;
                } else if (i6 == 3) {
                    i4 = 3;
                } else if (i6 == 4) {
                    i4 = 4;
                }
                wi2.f38481b = i4;
                vi.f38432b = wi2;
            }
            vi.f38433c = productInfo.introductoryPriceCycles;
            xi.f38531c = vi;
            zi.f38642k = xi;
        }
        c2773l6.setValueBytes(MessageNano.toByteArray(zi));
        return c2773l6;
    }

    @NonNull
    public static C2773l6 a(@NonNull String str) {
        C2773l6 c2773l6 = new C2773l6("", 0);
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2773l6.f39379d = 12320;
        c2773l6.f39377b = str;
        c2773l6.f39387l = H9.JS;
        return c2773l6;
    }
}
