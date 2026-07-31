package o2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o2.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3307A {

    /* renamed from: a, reason: collision with root package name */
    public final Object f41956a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3341m f41957b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f41958c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f41959d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f41960e;

    public C3307A(Object obj, InterfaceC3341m interfaceC3341m, Function1 function1, Object obj2, Throwable th) {
        this.f41956a = obj;
        this.f41957b = interfaceC3341m;
        this.f41958c = function1;
        this.f41959d = obj2;
        this.f41960e = th;
    }

    public static /* synthetic */ C3307A b(C3307A c3307a, Object obj, InterfaceC3341m interfaceC3341m, Function1 function1, Object obj2, Throwable th, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = c3307a.f41956a;
        }
        if ((i4 & 2) != 0) {
            interfaceC3341m = c3307a.f41957b;
        }
        if ((i4 & 4) != 0) {
            function1 = c3307a.f41958c;
        }
        if ((i4 & 8) != 0) {
            obj2 = c3307a.f41959d;
        }
        if ((i4 & 16) != 0) {
            th = c3307a.f41960e;
        }
        Throwable th2 = th;
        Function1 function12 = function1;
        return c3307a.a(obj, interfaceC3341m, function12, obj2, th2);
    }

    public final C3307A a(Object obj, InterfaceC3341m interfaceC3341m, Function1 function1, Object obj2, Throwable th) {
        return new C3307A(obj, interfaceC3341m, function1, obj2, th);
    }

    public final boolean c() {
        return this.f41960e != null;
    }

    public final void d(C3345o c3345o, Throwable th) {
        InterfaceC3341m interfaceC3341m = this.f41957b;
        if (interfaceC3341m != null) {
            c3345o.m(interfaceC3341m, th);
        }
        Function1 function1 = this.f41958c;
        if (function1 != null) {
            c3345o.n(function1, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3307A)) {
            return false;
        }
        C3307A c3307a = (C3307A) obj;
        return Intrinsics.areEqual(this.f41956a, c3307a.f41956a) && Intrinsics.areEqual(this.f41957b, c3307a.f41957b) && Intrinsics.areEqual(this.f41958c, c3307a.f41958c) && Intrinsics.areEqual(this.f41959d, c3307a.f41959d) && Intrinsics.areEqual(this.f41960e, c3307a.f41960e);
    }

    public int hashCode() {
        Object obj = this.f41956a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC3341m interfaceC3341m = this.f41957b;
        int hashCode2 = (hashCode + (interfaceC3341m == null ? 0 : interfaceC3341m.hashCode())) * 31;
        Function1 function1 = this.f41958c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f41959d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f41960e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f41956a + ", cancelHandler=" + this.f41957b + ", onCancellation=" + this.f41958c + ", idempotentResume=" + this.f41959d + ", cancelCause=" + this.f41960e + ')';
    }

    public /* synthetic */ C3307A(Object obj, InterfaceC3341m interfaceC3341m, Function1 function1, Object obj2, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i4 & 2) != 0 ? null : interfaceC3341m, (i4 & 4) != 0 ? null : function1, (i4 & 8) != 0 ? null : obj2, (i4 & 16) != 0 ? null : th);
    }
}
