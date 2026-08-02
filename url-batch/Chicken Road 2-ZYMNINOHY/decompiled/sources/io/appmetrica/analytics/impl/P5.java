package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
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
public class P5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<P5> CREATOR = new O5();

    /* renamed from: a, reason: collision with root package name */
    protected String f10794a;

    /* renamed from: b, reason: collision with root package name */
    protected String f10795b;

    /* renamed from: c, reason: collision with root package name */
    public String f10796c;

    /* renamed from: d, reason: collision with root package name */
    public int f10797d;

    /* renamed from: e, reason: collision with root package name */
    public int f10798e;

    /* renamed from: f, reason: collision with root package name */
    public Pair f10799f;

    /* renamed from: g, reason: collision with root package name */
    public int f10800g;

    /* renamed from: h, reason: collision with root package name */
    public String f10801h;

    /* renamed from: i, reason: collision with root package name */
    public long f10802i;

    /* renamed from: j, reason: collision with root package name */
    public long f10803j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0559da f10804k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC0790m9 f10805l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f10806m;
    public Boolean n;
    public Integer o;

    /* renamed from: p, reason: collision with root package name */
    public Map f10807p;

    public P5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f10799f == null) {
            this.f10799f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f10799f;
    }

    public final void c(Bundle bundle) {
        this.f10806m = bundle;
    }

    public final long d() {
        return this.f10802i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f10803j;
    }

    public final String f() {
        return this.f10796c;
    }

    public final EnumC0559da g() {
        return this.f10804k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f10800g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f10798e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.f10807p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f10794a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f10797d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f10795b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f10795b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.o;
    }

    public final Bundle i() {
        return this.f10806m;
    }

    public final String j() {
        return this.f10801h;
    }

    public final EnumC0790m9 k() {
        return this.f10805l;
    }

    public final boolean l() {
        return this.f10794a == null;
    }

    public final boolean m() {
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f10797d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i4) {
        this.f10800g = i4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i4) {
        this.f10798e = i4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.f10807p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f10794a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i4) {
        this.f10797d = i4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f10795b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f10795b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f10794a;
        String str2 = EnumC0508bb.a(this.f10797d).f11532b;
        String str3 = this.f10795b;
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
        return AbstractC0005f.q(sb, str3, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f10794a);
        bundle.putString("CounterReport.Value", this.f10795b);
        bundle.putInt("CounterReport.Type", this.f10797d);
        bundle.putInt("CounterReport.CustomType", this.f10798e);
        bundle.putInt("CounterReport.TRUNCATED", this.f10800g);
        bundle.putString("CounterReport.ProfileID", this.f10801h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f10804k.f11678a);
        Bundle bundle2 = this.f10806m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f10796c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f10799f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f10802i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f10803j);
        EnumC0790m9 enumC0790m9 = this.f10805l;
        if (enumC0790m9 != null) {
            bundle.putInt("CounterReport.Source", enumC0790m9.f12352a);
        }
        Boolean bool = this.n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f10807p));
        parcel.writeBundle(bundle);
    }

    public P5(String str, int i4) {
        this("", str, i4);
    }

    public static P5 e(P5 p5) {
        return a(p5, EnumC0508bb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f10796c = str;
    }

    public void c(String str) {
        this.f10801h = str;
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public P5(String str, String str2, int i4) {
        this(str, str2, i4, new SystemTimeProvider());
    }

    public final void a(long j4) {
        this.f10802i = j4;
    }

    public final void b(long j4) {
        this.f10803j = j4;
    }

    public final Boolean c() {
        return this.n;
    }

    public P5(String str, String str2, int i4, SystemTimeProvider systemTimeProvider) {
        this.f10804k = EnumC0559da.UNKNOWN;
        this.f10807p = new HashMap();
        this.f10794a = str2;
        this.f10797d = i4;
        this.f10795b = str;
        this.f10802i = systemTimeProvider.elapsedRealtime();
        this.f10803j = systemTimeProvider.currentTimeMillis();
    }

    public static P5 b(Bundle bundle) {
        if (bundle != null) {
            try {
                P5 p5 = (P5) bundle.getParcelable("CounterReport.Object");
                if (p5 != null) {
                    return p5;
                }
            } catch (Throwable unused) {
                return new P5("", 0);
            }
        }
        return new P5("", 0);
    }

    public static P5 c(P5 p5) {
        return a(p5, EnumC0508bb.EVENT_TYPE_INIT);
    }

    public static P5 d(P5 p5) {
        P5 p52 = new P5("", 0);
        p52.f10803j = p5.f10803j;
        p52.f10802i = p5.f10802i;
        p52.f10799f = p5.f10799f;
        p52.f10796c = p5.f10796c;
        p52.f10806m = p5.f10806m;
        p52.f10807p = p5.f10807p;
        p52.f10801h = p5.f10801h;
        return p52;
    }

    public final void a(EnumC0559da enumC0559da) {
        this.f10804k = enumC0559da;
    }

    public final void a(EnumC0790m9 enumC0790m9) {
        this.f10805l = enumC0790m9;
    }

    public final void a(Boolean bool) {
        this.n = bool;
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

    public static P5 b(P5 p5) {
        return a(p5, EnumC0508bb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static P5 a(P5 p5, EnumC0508bb enumC0508bb) {
        P5 d4 = d(p5);
        d4.f10797d = enumC0508bb.f11531a;
        return d4;
    }

    public static P5 a(P5 p5) {
        return a(p5, EnumC0508bb.EVENT_TYPE_ALIVE);
    }

    public static P5 a(P5 p5, M9 m9) {
        P5 a3 = a(p5, EnumC0508bb.EVENT_TYPE_START);
        a3.setValueBytes(MessageNano.toByteArray(new C0868p9().fromModel(new C0842o9((String) m9.f10638b.a()))));
        a3.f10803j = p5.f10803j;
        a3.f10802i = p5.f10802i;
        return a3;
    }

    public static P5 a(P5 p5, Collection<PermissionState> collection, C1068x2 c1068x2, C0525c2 c0525c2, List<String> list) {
        String str;
        String str2;
        P5 d4 = d(p5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c1068x2 != null) {
                jSONObject.put("background_restricted", c1068x2.f12991b);
                EnumC1042w2 enumC1042w2 = c1068x2.f12990a;
                c0525c2.getClass();
                if (enumC1042w2 != null) {
                    int ordinal = enumC1042w2.ordinal();
                    if (ordinal == 0) {
                        str2 = "EXEMPTED";
                    } else if (ordinal == 1) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 2) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 3) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 4) {
                        str2 = "RARE";
                    } else if (ordinal == 5) {
                        str2 = "RESTRICTED";
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
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        d4.f10797d = 12288;
        d4.setValue(str);
        return d4;
    }

    public static P5 a(P5 p5, String str) {
        P5 d4 = d(p5);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        d4.f10797d = 12289;
        d4.setValue(str);
        return d4;
    }

    public static P5 a() {
        P5 p5 = new P5("", 0);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        p5.f10797d = 16384;
        return p5;
    }

    public static P5 a(String str) {
        P5 p5 = new P5("", 0);
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        p5.f10797d = 12320;
        p5.f10795b = str;
        p5.f10805l = EnumC0790m9.JS;
        return p5;
    }
}
