package y0;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC1332g;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1317a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11535a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1332g f11536b;

    public C1317a(String str, InterfaceC1332g interfaceC1332g) {
        this.f11535a = str;
        this.f11536b = interfaceC1332g;
    }

    public final String a() {
        return this.f11535a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1317a)) {
            return false;
        }
        C1317a c1317a = (C1317a) obj;
        return Intrinsics.a(this.f11535a, c1317a.f11535a) && Intrinsics.a(this.f11536b, c1317a.f11536b);
    }

    public final int hashCode() {
        String str = this.f11535a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC1332g interfaceC1332g = this.f11536b;
        return hashCode + (interfaceC1332g != null ? interfaceC1332g.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f11535a + ", action=" + this.f11536b + ')';
    }
}
