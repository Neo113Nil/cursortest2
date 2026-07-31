package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1427a3 implements Parcelable {
    public static final Parcelable.Creator<C1427a3> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f14990a;

    /* renamed from: b, reason: collision with root package name */
    private String f14991b;

    /* renamed from: c, reason: collision with root package name */
    private String f14992c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14993d;

    /* renamed from: e, reason: collision with root package name */
    private int f14994e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<String> f14995f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f14996g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<String> f14997h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<String> f14998i;

    /* renamed from: j, reason: collision with root package name */
    private String f14999j;

    /* renamed from: k, reason: collision with root package name */
    private String f15000k;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, String> f15001l;

    /* renamed from: com.ironsource.a3$a */
    class a implements Parcelable.Creator<C1427a3> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1427a3 createFromParcel(Parcel parcel) {
            return new C1427a3(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1427a3[] newArray(int i4) {
            return new C1427a3[i4];
        }
    }

    public C1427a3() {
        i();
    }

    private Map<String, String> a(String str) {
        IronLog ironLog;
        String th;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e4) {
            o9.d().a(e4);
            ironLog = IronLog.INTERNAL;
            th = e4.toString();
            ironLog.error(th);
            return hashMap;
        } catch (Throwable th2) {
            o9.d().a(th2);
            ironLog = IronLog.INTERNAL;
            th = th2.toString();
            ironLog.error(th);
            return hashMap;
        }
        return hashMap;
    }

    private void i() {
        this.f14993d = false;
        this.f14994e = -1;
        this.f14995f = new ArrayList<>();
        this.f14996g = new ArrayList<>();
        this.f14997h = new ArrayList<>();
        this.f14998i = new ArrayList<>();
        this.f15000k = "";
        this.f14999j = "";
        this.f15001l = new HashMap();
    }

    public String b() {
        return this.f14992c;
    }

    public int c() {
        return this.f14994e;
    }

    public String d() {
        return this.f14999j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.f15001l;
    }

    public String f() {
        return this.f15000k;
    }

    public String g() {
        return this.f14990a;
    }

    public String h() {
        return this.f14991b;
    }

    public void j(String str) {
        this.f14991b = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f14993d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f14994e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f14995f);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f14996g);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f14999j);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f15000k);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f15001l);
            sb.append(", ");
        } catch (Throwable th) {
            o9.d().a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        try {
            parcel.writeByte(this.f14993d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f14994e);
            parcel.writeString(this.f14990a);
            parcel.writeString(this.f14991b);
            parcel.writeString(this.f14992c);
            parcel.writeString(this.f14999j);
            parcel.writeString(this.f15000k);
            parcel.writeString(new JSONObject(this.f15001l).toString());
        } catch (Throwable th) {
            o9.d().a(th);
        }
    }

    private C1427a3(Parcel parcel) {
        i();
        try {
            this.f14993d = parcel.readByte() != 0;
            this.f14994e = parcel.readInt();
            this.f14990a = parcel.readString();
            this.f14991b = parcel.readString();
            this.f14992c = parcel.readString();
            this.f14999j = parcel.readString();
            this.f15000k = parcel.readString();
            this.f15001l = a(parcel.readString());
        } catch (Throwable th) {
            o9.d().a(th);
            i();
        }
    }

    public void a() {
        this.f14994e = -1;
    }

    public void b(String str, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z4) {
            this.f14998i.remove(str);
        } else if (this.f14998i.indexOf(str) == -1) {
            this.f14998i.add(str);
        }
    }

    public void c(String str, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z4) {
            this.f14995f.remove(str);
        } else if (this.f14995f.indexOf(str) == -1) {
            this.f14995f.add(str);
        }
    }

    public void d(String str, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z4) {
            this.f14997h.remove(str);
        } else if (this.f14997h.indexOf(str) == -1) {
            this.f14997h.add(str);
        }
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.f14997h.indexOf(str) > -1;
    }

    public void f(String str) {
        this.f14992c = str;
    }

    public void g(String str) {
        this.f14999j = str;
    }

    public void h(String str) {
        this.f15000k = str;
    }

    public void i(String str) {
        this.f14990a = str;
    }

    public boolean j() {
        return this.f14993d;
    }

    /* synthetic */ C1427a3(Parcel parcel, a aVar) {
        this(parcel);
    }

    public void a(int i4) {
        this.f14994e = i4;
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.f14996g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.f14998i.indexOf(str) > -1;
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f14995f.indexOf(str) > -1;
    }

    public void a(String str, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z4) {
            this.f14996g.remove(str);
        } else if (this.f14996g.indexOf(str) == -1) {
            this.f14996g.add(str);
        }
    }

    public void a(Map<String, String> map) {
        this.f15001l = map;
    }

    public void a(boolean z4) {
        this.f14993d = z4;
    }
}
