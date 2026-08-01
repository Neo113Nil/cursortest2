package wd;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class y extends d implements ce.a {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f10163u;

    public y(int i3, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f10163u = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return e().equals(yVar.e()) && d().equals(yVar.d()) && f().equals(yVar.f()) && Intrinsics.a(this.f10145e, yVar.f10145e);
        }
        if (obj instanceof y) {
            return obj.equals(g());
        }
        return false;
    }

    public final ce.a g() {
        if (this.f10163u) {
            return this;
        }
        ce.a aVar = this.f10144d;
        if (aVar != null) {
            return aVar;
        }
        ce.a b10 = b();
        this.f10144d = b10;
        return b10;
    }

    public final int hashCode() {
        return f().hashCode() + ((d().hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        ce.a g = g();
        if (g != this) {
            return g.toString();
        }
        return "property " + d() + " (Kotlin reflection is not available)";
    }

    public y() {
        this.f10163u = false;
    }
}
