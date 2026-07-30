package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ZB extends PB {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f28971d;

    /* renamed from: e, reason: collision with root package name */
    public int f28972e;

    @Override // com.google.android.gms.internal.ads.PB
    public final /* bridge */ /* synthetic */ PB c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.f28971d != null) {
            int j9 = AbstractC2917aC.j(this.f26877b);
            Object[] objArr = this.f28971d;
            if (j9 <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int n9 = AbstractC3194fG.n(hashCode);
                while (true) {
                    int i = n9 & length;
                    Object[] objArr2 = this.f28971d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f28972e += hashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        n9 = i + 1;
                    }
                }
            }
        }
        this.f28971d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.f28971d == null) {
            b(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final AbstractC2917aC h() {
        AbstractC2917aC o9;
        int i = this.f26877b;
        if (i == 0) {
            return C3998uC.f34563C;
        }
        if (i == 1) {
            Object obj = this.f26876a[0];
            Objects.requireNonNull(obj);
            return new C2972bC(obj);
        }
        if (this.f28971d == null || AbstractC2917aC.j(i) != this.f28971d.length) {
            o9 = AbstractC2917aC.o(this.f26876a, this.f26877b);
            this.f26877b = o9.size();
        } else {
            int i4 = this.f26877b;
            Object[] objArr = this.f26876a;
            int length = objArr.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            o9 = new C3998uC(this.f28972e, r8.length - 1, this.f26877b, objArr, this.f28971d);
        }
        this.f26878c = true;
        this.f28971d = null;
        return o9;
    }
}
