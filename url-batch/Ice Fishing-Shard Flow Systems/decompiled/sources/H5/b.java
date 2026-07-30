package H5;

import D5.n;
import S.i;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f998a;

    /* renamed from: b, reason: collision with root package name */
    public final String f999b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1000c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1001d;

    /* renamed from: e, reason: collision with root package name */
    public final n f1002e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1003f;

    /* renamed from: g, reason: collision with root package name */
    public final a f1004g;

    public b(String str, String str2, String str3, n nVar, int i2, a aVar) {
        if (G5.a.f843a) {
            Thread.currentThread().getStackTrace();
        }
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f999b = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f1000c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f1001d = str3;
        this.f1002e = nVar;
        if (i2 == 0) {
            throw new NullPointerException("Null valueType");
        }
        this.f1003f = i2;
        this.f1004g = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f999b.equalsIgnoreCase(bVar.f999b) && this.f1000c.equals(bVar.f1000c) && this.f1001d.equals(bVar.f1001d) && this.f1002e.equals(bVar.f1002e) && i.a(this.f1003f, bVar.f1003f);
    }

    public final int hashCode() {
        int i2 = this.f998a;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((((((this.f999b.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f1000c.hashCode()) * 1000003) ^ this.f1001d.hashCode()) * 1000003) ^ this.f1002e.hashCode()) * 1000003) ^ i.b(this.f1003f);
        this.f998a = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentDescriptor{name=");
        sb.append(this.f999b);
        sb.append(", description=");
        sb.append(this.f1000c);
        sb.append(", unit=");
        sb.append(this.f1001d);
        sb.append(", type=");
        sb.append(this.f1002e);
        sb.append(", valueType=");
        int i2 = this.f1003f;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "DOUBLE" : "LONG");
        sb.append(", advice=");
        sb.append(this.f1004g);
        sb.append("}");
        return sb.toString();
    }
}
