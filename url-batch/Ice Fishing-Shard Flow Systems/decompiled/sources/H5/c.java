package H5;

import D5.d;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1005a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public int f1006b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1007c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1008d;

    /* renamed from: e, reason: collision with root package name */
    public final d f1009e;

    /* renamed from: f, reason: collision with root package name */
    public final b f1010f;

    public c(String str, String str2, d dVar, b bVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f1007c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f1008d = str2;
        this.f1009e = dVar;
        this.f1010f = bVar;
    }

    public static c a(d dVar, G5.b bVar, b bVar2) {
        c cVar = new c(bVar2.f999b, bVar2.f1000c, dVar, bVar2);
        cVar.f1005a.set(bVar);
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f1007c.equalsIgnoreCase(cVar.f1007c) && this.f1008d.equals(cVar.f1008d) && this.f1009e.equals(cVar.f1009e) && this.f1010f.equals(cVar.f1010f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f1006b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((((this.f1007c.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f1008d.hashCode()) * 1000003) ^ this.f1009e.hashCode()) * 1000003) ^ this.f1010f.hashCode();
        this.f1006b = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "MetricDescriptor{name=" + this.f1007c + ", description=" + this.f1008d + ", view=" + this.f1009e + ", sourceInstrument=" + this.f1010f + "}";
    }
}
