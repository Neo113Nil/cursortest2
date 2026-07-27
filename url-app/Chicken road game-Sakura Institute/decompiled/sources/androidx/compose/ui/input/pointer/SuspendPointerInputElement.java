package androidx.compose.ui.input.pointer;

import S.n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.C0802C;
import r0.T;
import w.Y;

@Metadata
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5204a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5205b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5206c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f5207d;

    public SuspendPointerInputElement(Object obj, Y y4, Function2 function2, int i2) {
        y4 = (i2 & 2) != 0 ? null : y4;
        this.f5204a = obj;
        this.f5205b = y4;
        this.f5206c = null;
        this.f5207d = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!Intrinsics.a(this.f5204a, suspendPointerInputElement.f5204a) || !Intrinsics.a(this.f5205b, suspendPointerInputElement.f5205b)) {
            return false;
        }
        Object[] objArr = this.f5206c;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f5206c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f5206c != null) {
            return false;
        }
        return this.f5207d == suspendPointerInputElement.f5207d;
    }

    public final int hashCode() {
        Object obj = this.f5204a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f5205b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f5206c;
        return this.f5207d.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // r0.T
    public final n l() {
        return new C0802C(this.f5204a, this.f5205b, this.f5206c, this.f5207d);
    }

    @Override // r0.T
    public final void m(n nVar) {
        C0802C c0802c = (C0802C) nVar;
        Object obj = c0802c.f7877t;
        Object obj2 = this.f5204a;
        boolean z4 = !Intrinsics.a(obj, obj2);
        c0802c.f7877t = obj2;
        Object obj3 = c0802c.f7878u;
        Object obj4 = this.f5205b;
        if (!Intrinsics.a(obj3, obj4)) {
            z4 = true;
        }
        c0802c.f7878u = obj4;
        Object[] objArr = c0802c.f7879v;
        Object[] objArr2 = this.f5206c;
        if (objArr != null && objArr2 == null) {
            z4 = true;
        }
        if (objArr == null && objArr2 != null) {
            z4 = true;
        }
        boolean z5 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z4 : true;
        c0802c.f7879v = objArr2;
        if (z5) {
            c0802c.D0();
        }
        c0802c.f7880w = this.f5207d;
    }
}
