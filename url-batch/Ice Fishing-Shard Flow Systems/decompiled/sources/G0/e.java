package G0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public static final e f793i = new e(t.f825d, false, false, false, false, -1, -1, kotlin.collections.C.f6117d);

    /* renamed from: a, reason: collision with root package name */
    public final t f794a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f795b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f796c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f797d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f798e;

    /* renamed from: f, reason: collision with root package name */
    public final long f799f;

    /* renamed from: g, reason: collision with root package name */
    public final long f800g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f801h;

    public e(t requiredNetworkType, boolean z7, boolean z8, boolean z9, boolean z10, long j, long j7, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f794a = requiredNetworkType;
        this.f795b = z7;
        this.f796c = z8;
        this.f797d = z9;
        this.f798e = z10;
        this.f799f = j;
        this.f800g = j7;
        this.f801h = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e.class.equals(obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f795b == eVar.f795b && this.f796c == eVar.f796c && this.f797d == eVar.f797d && this.f798e == eVar.f798e && this.f799f == eVar.f799f && this.f800g == eVar.f800g && this.f794a == eVar.f794a) {
            return Intrinsics.a(this.f801h, eVar.f801h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f794a.hashCode() * 31) + (this.f795b ? 1 : 0)) * 31) + (this.f796c ? 1 : 0)) * 31) + (this.f797d ? 1 : 0)) * 31) + (this.f798e ? 1 : 0)) * 31;
        long j = this.f799f;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j7 = this.f800g;
        return this.f801h.hashCode() + ((i2 + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }
}
