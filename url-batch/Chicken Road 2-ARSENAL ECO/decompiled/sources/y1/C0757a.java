package y1;

import java.util.ArrayList;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6225a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6226b;

    public C0757a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f6225a = str;
        this.f6226b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0757a)) {
            return false;
        }
        C0757a c0757a = (C0757a) obj;
        return this.f6225a.equals(c0757a.f6225a) && this.f6226b.equals(c0757a.f6226b);
    }

    public final int hashCode() {
        return ((this.f6225a.hashCode() ^ 1000003) * 1000003) ^ this.f6226b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f6225a + ", usedDates=" + this.f6226b + "}";
    }
}
