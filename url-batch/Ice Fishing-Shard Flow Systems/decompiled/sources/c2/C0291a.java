package c2;

import java.util.ArrayList;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4174a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4175b;

    public C0291a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f4174a = str;
        this.f4175b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0291a)) {
            return false;
        }
        C0291a c0291a = (C0291a) obj;
        return this.f4174a.equals(c0291a.f4174a) && this.f4175b.equals(c0291a.f4175b);
    }

    public final int hashCode() {
        return ((this.f4174a.hashCode() ^ 1000003) * 1000003) ^ this.f4175b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f4174a + ", usedDates=" + this.f4175b + "}";
    }
}
