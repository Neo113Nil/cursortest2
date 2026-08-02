package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
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
    protected String f6815a;

    /* renamed from: b, reason: collision with root package name */
    protected String f6816b;

    /* renamed from: c, reason: collision with root package name */
    public String f6817c;

    /* renamed from: d, reason: collision with root package name */
    public int f6818d;

    /* renamed from: e, reason: collision with root package name */
    public int f6819e;
    public Pair f;

    /* renamed from: g, reason: collision with root package name */
    public int f6820g;

    /* renamed from: h, reason: collision with root package name */
    public String f6821h;

    /* renamed from: i, reason: collision with root package name */
    public long f6822i;

    /* renamed from: j, reason: collision with root package name */
    public long f6823j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0617ka f6824k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC0849t9 f6825l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f6826m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f6827n;
    public Integer o;

    /* renamed from: p, reason: collision with root package name */
    public Map f6828p;

    public W5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f == null) {
            this.f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f;
    }

    public final void c(Bundle bundle) {
        this.f6826m = bundle;
    }

    public final long d() {
        return this.f6822i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f6823j;
    }

    public final String f() {
        return this.f6817c;
    }

    public final EnumC0617ka g() {
        return this.f6824k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f6820g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f6819e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.f6828p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f6815a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f6818d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f6816b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f6816b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.o;
    }

    public final Bundle i() {
        return this.f6826m;
    }

    public final String j() {
        return this.f6821h;
    }

    public final EnumC0849t9 k() {
        return this.f6825l;
    }

    public final boolean l() {
        return this.f6815a == null;
    }

    public final boolean m() {
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        return -1 == this.f6818d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i3) {
        this.f6820g = i3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i3) {
        this.f6819e = i3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.f6828p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f6815a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i3) {
        this.f6818d = i3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f6816b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f6816b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f6815a;
        String str2 = EnumC0567ib.a(this.f6818d).f7561b;
        String str3 = this.f6816b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        StringBuilder sb = new StringBuilder("[event: ");
        sb.append(str);
        sb.append(", type: ");
        sb.append(str2);
        sb.append(", value: ");
        return AbstractC0033i.m(sb, str3, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f6815a);
        bundle.putString("CounterReport.Value", this.f6816b);
        bundle.putInt("CounterReport.Type", this.f6818d);
        bundle.putInt("CounterReport.CustomType", this.f6819e);
        bundle.putInt("CounterReport.TRUNCATED", this.f6820g);
        bundle.putString("CounterReport.ProfileID", this.f6821h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f6824k.f7718a);
        Bundle bundle2 = this.f6826m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f6817c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f6822i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f6823j);
        EnumC0849t9 enumC0849t9 = this.f6825l;
        if (enumC0849t9 != null) {
            bundle.putInt("CounterReport.Source", enumC0849t9.f8364a);
        }
        Boolean bool = this.f6827n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f6828p));
        parcel.writeBundle(bundle);
    }

    public W5(String str, int i3) {
        this("", str, i3);
    }

    public static W5 e(W5 w5) {
        return a(w5, EnumC0567ib.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f6817c = str;
    }

    public void c(String str) {
        this.f6821h = str;
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public W5(String str, String str2, int i3) {
        this(str, str2, i3, new SystemTimeProvider());
    }

    public final void a(long j3) {
        this.f6822i = j3;
    }

    public final void b(long j3) {
        this.f6823j = j3;
    }

    public final Boolean c() {
        return this.f6827n;
    }

    public W5(String str, String str2, int i3, SystemTimeProvider systemTimeProvider) {
        this.f6824k = EnumC0617ka.UNKNOWN;
        this.f6828p = new HashMap();
        this.f6815a = str2;
        this.f6818d = i3;
        this.f6816b = str;
        this.f6822i = systemTimeProvider.elapsedRealtime();
        this.f6823j = systemTimeProvider.currentTimeMillis();
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
        return a(w5, EnumC0567ib.EVENT_TYPE_INIT);
    }

    public static W5 d(W5 w5) {
        W5 w52 = new W5("", 0);
        w52.f6823j = w5.f6823j;
        w52.f6822i = w5.f6822i;
        w52.f = w5.f;
        w52.f6817c = w5.f6817c;
        w52.f6826m = w5.f6826m;
        w52.f6828p = w5.f6828p;
        w52.f6821h = w5.f6821h;
        return w52;
    }

    public final void a(EnumC0617ka enumC0617ka) {
        this.f6824k = enumC0617ka;
    }

    public final void a(EnumC0849t9 enumC0849t9) {
        this.f6825l = enumC0849t9;
    }

    public final void a(Boolean bool) {
        this.f6827n = bool;
    }

    public final void a(Integer num) {
        this.o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static W5 b(W5 w5) {
        return a(w5, EnumC0567ib.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static W5 a(W5 w5, EnumC0567ib enumC0567ib) {
        W5 d3 = d(w5);
        d3.f6818d = enumC0567ib.f7560a;
        return d3;
    }

    public static W5 a(W5 w5) {
        return a(w5, EnumC0567ib.EVENT_TYPE_ALIVE);
    }

    public static W5 a(W5 w5, T9 t9) {
        W5 a3 = a(w5, EnumC0567ib.EVENT_TYPE_START);
        a3.setValueBytes(MessageNano.toByteArray(new C0927w9().fromModel(new C0901v9((String) t9.f6696b.a()))));
        a3.f6823j = w5.f6823j;
        a3.f6822i = w5.f6822i;
        return a3;
    }

    public static W5 a(W5 w5, Collection<PermissionState> collection, F2 f22, C0635l2 c0635l2, List<String> list) {
        String str;
        String str2;
        W5 d3 = d(w5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (f22 != null) {
                jSONObject.put("background_restricted", f22.f5980b);
                E2 e22 = f22.f5979a;
                c0635l2.getClass();
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
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        d3.f6818d = 12288;
        d3.setValue(str);
        return d3;
    }

    public static W5 a(W5 w5, String str) {
        W5 d3 = d(w5);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        d3.f6818d = 12289;
        d3.setValue(str);
        return d3;
    }

    public static W5 a() {
        W5 w5 = new W5("", 0);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        w5.f6818d = 16384;
        return w5;
    }

    public static W5 a(String str) {
        W5 w5 = new W5("", 0);
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        w5.f6818d = 12320;
        w5.f6816b = str;
        w5.f6825l = EnumC0849t9.JS;
        return w5;
    }
}
