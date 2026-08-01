package wd;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class m extends d implements l, ce.a, hd.c {

    /* renamed from: u, reason: collision with root package name */
    private final int f10159u;

    public m(int i3, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f10159u = i3;
    }

    @Override // wd.d
    public final ce.a b() {
        c0.f10143a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return d().equals(mVar.d()) && f().equals(mVar.f()) && Intrinsics.a(this.f10145e, mVar.f10145e) && Intrinsics.a(e(), mVar.e());
        }
        if (!(obj instanceof m)) {
            return false;
        }
        ce.a aVar = this.f10144d;
        if (aVar == null) {
            b();
            this.f10144d = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // wd.l
    public final int getArity() {
        return this.f10159u;
    }

    public final int hashCode() {
        return f().hashCode() + ((d().hashCode() + (e() == null ? 0 : e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        ce.a aVar = this.f10144d;
        if (aVar == null) {
            b();
            this.f10144d = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        if ("<init>".equals(d())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + d() + " (Kotlin reflection is not available)";
    }
}
