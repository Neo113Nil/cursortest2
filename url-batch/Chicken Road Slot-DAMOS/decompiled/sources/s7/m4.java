package s7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m4 extends d7.a {
    public static final Parcelable.Creator<m4> CREATOR = new c7.p(21);

    /* renamed from: d, reason: collision with root package name */
    public final int f8851d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8852e;

    /* renamed from: i, reason: collision with root package name */
    public final long f8853i;

    /* renamed from: r, reason: collision with root package name */
    public final Long f8854r;

    /* renamed from: s, reason: collision with root package name */
    public final String f8855s;

    /* renamed from: t, reason: collision with root package name */
    public final String f8856t;

    /* renamed from: u, reason: collision with root package name */
    public final Double f8857u;

    public m4(long j, Object obj, String str, String str2) {
        c7.c0.d(str);
        this.f8851d = 2;
        this.f8852e = str;
        this.f8853i = j;
        this.f8856t = str2;
        if (obj == null) {
            this.f8854r = null;
            this.f8857u = null;
            this.f8855s = null;
            return;
        }
        if (obj instanceof Long) {
            this.f8854r = (Long) obj;
            this.f8857u = null;
            this.f8855s = null;
        } else if (obj instanceof String) {
            this.f8854r = null;
            this.f8857u = null;
            this.f8855s = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                te.a1.e("User attribute given of un-supported type");
                throw null;
            }
            this.f8854r = null;
            this.f8857u = (Double) obj;
            this.f8855s = null;
        }
    }

    public final Object b() {
        Long l10 = this.f8854r;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f8857u;
        if (d10 != null) {
            return d10;
        }
        String str = this.f8855s;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        c7.p.c(this, parcel);
    }

    public m4(int i3, String str, long j, Long l10, Float f3, String str2, String str3, Double d10) {
        this.f8851d = i3;
        this.f8852e = str;
        this.f8853i = j;
        this.f8854r = l10;
        this.f8857u = i3 == 1 ? f3 != null ? Double.valueOf(f3.doubleValue()) : null : d10;
        this.f8855s = str2;
        this.f8856t = str3;
    }

    public m4(n4 n4Var) {
        this(n4Var.f8884d, n4Var.f8885e, n4Var.f8883c, n4Var.f8882b);
    }
}
