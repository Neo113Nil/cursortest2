package ge;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4384a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4385b;

    /* renamed from: c, reason: collision with root package name */
    public final vd.n f4386c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4387d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f4388e;

    public /* synthetic */ p(Object obj, e eVar, vd.n nVar, Throwable th, int i3) {
        this(obj, (i3 & 2) != 0 ? null : eVar, (i3 & 4) != 0 ? null : nVar, (Object) null, (i3 & 16) != 0 ? null : th);
    }

    public static p a(p pVar, e eVar, Throwable th, int i3) {
        Object obj = pVar.f4384a;
        if ((i3 & 2) != 0) {
            eVar = pVar.f4385b;
        }
        e eVar2 = eVar;
        vd.n nVar = pVar.f4386c;
        Object obj2 = pVar.f4387d;
        if ((i3 & 16) != 0) {
            th = pVar.f4388e;
        }
        return new p(obj, eVar2, nVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.a(this.f4384a, pVar.f4384a) && Intrinsics.a(this.f4385b, pVar.f4385b) && Intrinsics.a(this.f4386c, pVar.f4386c) && Intrinsics.a(this.f4387d, pVar.f4387d) && Intrinsics.a(this.f4388e, pVar.f4388e);
    }

    public final int hashCode() {
        Object obj = this.f4384a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        e eVar = this.f4385b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        vd.n nVar = this.f4386c;
        int hashCode3 = (hashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj2 = this.f4387d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4388e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4384a + ", cancelHandler=" + this.f4385b + ", onCancellation=" + this.f4386c + ", idempotentResume=" + this.f4387d + ", cancelCause=" + this.f4388e + ')';
    }

    public p(Object obj, e eVar, vd.n nVar, Object obj2, Throwable th) {
        this.f4384a = obj;
        this.f4385b = eVar;
        this.f4386c = nVar;
        this.f4387d = obj2;
        this.f4388e = th;
    }
}
