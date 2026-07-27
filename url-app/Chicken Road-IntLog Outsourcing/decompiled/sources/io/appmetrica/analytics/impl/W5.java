package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import b2.AbstractC0279e;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class W5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<W5> CREATOR = new V5();

    /* renamed from: a, reason: collision with root package name */
    protected String f7648a;

    /* renamed from: b, reason: collision with root package name */
    protected String f7649b;

    /* renamed from: c, reason: collision with root package name */
    public String f7650c;

    /* renamed from: d, reason: collision with root package name */
    public int f7651d;

    /* renamed from: e, reason: collision with root package name */
    public int f7652e;

    /* renamed from: f, reason: collision with root package name */
    public Pair f7653f;

    /* renamed from: g, reason: collision with root package name */
    public int f7654g;

    /* renamed from: h, reason: collision with root package name */
    public String f7655h;

    /* renamed from: i, reason: collision with root package name */
    public long f7656i;

    /* renamed from: j, reason: collision with root package name */
    public long f7657j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0768ka f7658k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC1000t9 f7659l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f7660m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f7661n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f7662o;

    /* renamed from: p, reason: collision with root package name */
    public Map f7663p;

    public W5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f7653f == null) {
            this.f7653f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f7653f;
    }

    public final void c(Bundle bundle) {
        this.f7660m = bundle;
    }

    public final long d() {
        return this.f7656i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f7657j;
    }

    public final String f() {
        return this.f7650c;
    }

    public final EnumC0768ka g() {
        return this.f7658k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f7654g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f7652e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.f7663p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f7648a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f7651d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f7649b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f7649b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.f7662o;
    }

    public final Bundle i() {
        return this.f7660m;
    }

    public final String j() {
        return this.f7655h;
    }

    public final EnumC1000t9 k() {
        return this.f7659l;
    }

    public final boolean l() {
        return this.f7648a == null;
    }

    public final boolean m() {
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        return -1 == this.f7651d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i2) {
        this.f7654g = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i2) {
        this.f7652e = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.f7663p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f7648a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i2) {
        this.f7651d = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f7649b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f7649b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f7648a;
        String str2 = EnumC0718ib.a(this.f7651d).f8450b;
        String str3 = this.f7649b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, PermissionsViewModel.DELAY_TIME_CALLBACK_CALL);
        }
        StringBuilder sb = new StringBuilder("[event: ");
        sb.append(str);
        sb.append(", type: ");
        sb.append(str2);
        sb.append(", value: ");
        return AbstractC0279e.h(sb, str3, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f7648a);
        bundle.putString("CounterReport.Value", this.f7649b);
        bundle.putInt("CounterReport.Type", this.f7651d);
        bundle.putInt("CounterReport.CustomType", this.f7652e);
        bundle.putInt("CounterReport.TRUNCATED", this.f7654g);
        bundle.putString("CounterReport.ProfileID", this.f7655h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f7658k.f8618a);
        Bundle bundle2 = this.f7660m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f7650c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f7653f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f7656i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f7657j);
        EnumC1000t9 enumC1000t9 = this.f7659l;
        if (enumC1000t9 != null) {
            bundle.putInt("CounterReport.Source", enumC1000t9.f9307a);
        }
        Boolean bool = this.f7661n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f7662o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f7663p));
        parcel.writeBundle(bundle);
    }

    public W5(String str, int i2) {
        this("", str, i2);
    }

    public static W5 e(W5 w5) {
        return a(w5, EnumC0718ib.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f7650c = str;
    }

    public void c(String str) {
        this.f7655h = str;
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public W5(String str, String str2, int i2) {
        this(str, str2, i2, new SystemTimeProvider());
    }

    public final void a(long j2) {
        this.f7656i = j2;
    }

    public final void b(long j2) {
        this.f7657j = j2;
    }

    public final Boolean c() {
        return this.f7661n;
    }

    public W5(String str, String str2, int i2, SystemTimeProvider systemTimeProvider) {
        this.f7658k = EnumC0768ka.UNKNOWN;
        this.f7663p = new HashMap();
        this.f7648a = str2;
        this.f7651d = i2;
        this.f7649b = str;
        this.f7656i = systemTimeProvider.elapsedRealtime();
        this.f7657j = systemTimeProvider.currentTimeMillis();
    }

    public static W5 b(Bundle bundle) {
        if (bundle != null) {
            try {
                W5 w5 = (W5) bundle.getParcelable("CounterReport.Object");
                if (w5 != null) {
                    return w5;
                }
            } catch (Throwable unused) {
                return new W5("", 0);
            }
        }
        return new W5("", 0);
    }

    public static W5 c(W5 w5) {
        return a(w5, EnumC0718ib.EVENT_TYPE_INIT);
    }

    public static W5 d(W5 w5) {
        W5 w52 = new W5("", 0);
        w52.f7657j = w5.f7657j;
        w52.f7656i = w5.f7656i;
        w52.f7653f = w5.f7653f;
        w52.f7650c = w5.f7650c;
        w52.f7660m = w5.f7660m;
        w52.f7663p = w5.f7663p;
        w52.f7655h = w5.f7655h;
        return w52;
    }

    public final void a(EnumC0768ka enumC0768ka) {
        this.f7658k = enumC0768ka;
    }

    public final void a(EnumC1000t9 enumC1000t9) {
        this.f7659l = enumC1000t9;
    }

    public final void a(Boolean bool) {
        this.f7661n = bool;
    }

    public final void a(Integer num) {
        this.f7662o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static W5 b(W5 w5) {
        return a(w5, EnumC0718ib.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static W5 a(W5 w5, EnumC0718ib enumC0718ib) {
        W5 d6 = d(w5);
        d6.f7651d = enumC0718ib.f8449a;
        return d6;
    }

    public static W5 a(W5 w5) {
        return a(w5, EnumC0718ib.EVENT_TYPE_ALIVE);
    }

    public static W5 a(W5 w5, T9 t9) {
        W5 a6 = a(w5, EnumC0718ib.EVENT_TYPE_START);
        a6.setValueBytes(MessageNano.toByteArray(new C1078w9().fromModel(new C1052v9((String) t9.f7524b.a()))));
        a6.f7657j = w5.f7657j;
        a6.f7656i = w5.f7656i;
        return a6;
    }

    public static W5 a(W5 w5, Collection<PermissionState> collection, F2 f22, C0786l2 c0786l2, List<String> list) {
        String str;
        String str2;
        W5 d6 = d(w5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (f22 != null) {
                jSONObject.put("background_restricted", f22.f6770b);
                E2 e22 = f22.f6769a;
                c0786l2.getClass();
                if (e22 != null) {
                    switch (e22) {
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
                            str2 = "UNKNOWN";
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
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        d6.f7651d = 12288;
        d6.setValue(str);
        return d6;
    }

    public static W5 a(W5 w5, String str) {
        W5 d6 = d(w5);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        d6.f7651d = 12289;
        d6.setValue(str);
        return d6;
    }

    public static W5 a() {
        W5 w5 = new W5("", 0);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        w5.f7651d = 16384;
        return w5;
    }

    public static W5 a(String str) {
        W5 w5 = new W5("", 0);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        w5.f7651d = 12320;
        w5.f7649b = str;
        w5.f7659l = EnumC1000t9.JS;
        return w5;
    }
}
