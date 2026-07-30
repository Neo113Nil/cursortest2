package g7;

import c7.n;
import f7.AbstractC4516a;
import java.util.Locale;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f37939a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37940b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37941c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37942d;

    /* renamed from: e, reason: collision with root package name */
    public final n f37943e;

    /* renamed from: f, reason: collision with root package name */
    public final int f37944f;

    /* renamed from: g, reason: collision with root package name */
    public final a f37945g;

    public b(String str, String str2, String str3, n nVar, int i, a aVar) {
        if (AbstractC4516a.f37808a) {
            Thread.currentThread().getStackTrace();
        }
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f37940b = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f37941c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f37942d = str3;
        this.f37943e = nVar;
        if (i == 0) {
            throw new NullPointerException("Null valueType");
        }
        this.f37944f = i;
        this.f37945g = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f37940b.equalsIgnoreCase(bVar.f37940b) && this.f37941c.equals(bVar.f37941c) && this.f37942d.equals(bVar.f37942d) && this.f37943e.equals(bVar.f37943e) && AbstractC5088e.a(this.f37944f, bVar.f37944f);
    }

    public final int hashCode() {
        int i = this.f37939a;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((this.f37940b.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f37941c.hashCode()) * 1000003) ^ this.f37942d.hashCode()) * 1000003) ^ this.f37943e.hashCode()) * 1000003) ^ AbstractC5088e.d(this.f37944f);
        this.f37939a = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentDescriptor{name=");
        sb.append(this.f37940b);
        sb.append(", description=");
        sb.append(this.f37941c);
        sb.append(", unit=");
        sb.append(this.f37942d);
        sb.append(", type=");
        sb.append(this.f37943e);
        sb.append(", valueType=");
        int i = this.f37944f;
        sb.append(i != 1 ? i != 2 ? "null" : "DOUBLE" : "LONG");
        sb.append(", advice=");
        sb.append(this.f37945g);
        sb.append("}");
        return sb.toString();
    }
}
