package w;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: g, reason: collision with root package name */
    public static final N f11040g = new N();

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f11041a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f11042b = null;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f11043c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f11044d = null;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f11045e = null;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f11046f = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n2 = (N) obj;
        return this.f11041a == n2.f11041a && this.f11042b == n2.f11042b && this.f11043c == n2.f11043c && this.f11044d == n2.f11044d && this.f11045e == n2.f11045e && this.f11046f == n2.f11046f;
    }

    public final int hashCode() {
        Function1 function1 = this.f11041a;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f11042b;
        int hashCode2 = (hashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1 function13 = this.f11043c;
        int hashCode3 = (hashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1 function14 = this.f11044d;
        int hashCode4 = (hashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1 function15 = this.f11045e;
        int hashCode5 = (hashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1 function16 = this.f11046f;
        return hashCode5 + (function16 != null ? function16.hashCode() : 0);
    }
}
