package s1;

import android.text.TextUtils;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final C3.e f40421e = new C3.e();

    /* renamed from: a, reason: collision with root package name */
    public final Object f40422a;

    /* renamed from: b, reason: collision with root package name */
    public final f f40423b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40424c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f40425d;

    public g(String str, Object obj, f fVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f40424c = str;
        this.f40422a = obj;
        this.f40423b = fVar;
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f40421e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f40424c.equals(((g) obj).f40424c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40424c.hashCode();
    }

    public final String toString() {
        return AbstractC5051n.g(new StringBuilder("Option{key='"), this.f40424c, "'}");
    }
}
