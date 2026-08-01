package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i1 implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final k1 f2388d;

    /* renamed from: e, reason: collision with root package name */
    public k1 f2389e;

    public i1(k1 k1Var) {
        this.f2388d = k1Var;
        if (k1Var.g()) {
            te.a1.e("Default instance must be immutable.");
            throw null;
        }
        this.f2389e = k1Var.i();
    }

    public static void a(int i3, List list) {
        int size = list.size() - i3;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String sb3 = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i3) {
                throw new NullPointerException(sb3);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.f2389e.g()) {
            return;
        }
        k1 i3 = this.f2388d.i();
        l2.f2493c.a(i3.getClass()).d(i3, this.f2389e);
        this.f2389e = i3;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i1 clone() {
        i1 i1Var = (i1) this.f2388d.s(5);
        boolean g = this.f2389e.g();
        k1 k1Var = this.f2389e;
        if (g) {
            k1Var.getClass();
            l2.f2493c.a(k1Var.getClass()).h(k1Var);
            k1Var.h();
            k1Var = this.f2389e;
        }
        i1Var.f2389e = k1Var;
        return i1Var;
    }

    public final k1 d() {
        boolean g = this.f2389e.g();
        k1 k1Var = this.f2389e;
        if (g) {
            k1Var.getClass();
            l2.f2493c.a(k1Var.getClass()).h(k1Var);
            k1Var.h();
            k1Var = this.f2389e;
        }
        k1Var.getClass();
        if (k1.q(k1Var, true)) {
            return k1Var;
        }
        throw new s2();
    }

    public final void e(k1 k1Var) {
        k1 k1Var2 = this.f2388d;
        if (k1Var2.equals(k1Var)) {
            return;
        }
        if (!this.f2389e.g()) {
            k1 i3 = k1Var2.i();
            l2.f2493c.a(i3.getClass()).d(i3, this.f2389e);
            this.f2389e = i3;
        }
        k1 k1Var3 = this.f2389e;
        l2.f2493c.a(k1Var3.getClass()).d(k1Var3, k1Var);
    }

    public final void f(byte[] bArr, int i3, c1 c1Var) {
        if (!this.f2389e.g()) {
            k1 i10 = this.f2388d.i();
            l2.f2493c.a(i10.getClass()).d(i10, this.f2389e);
            this.f2389e = i10;
        }
        try {
            l2.f2493c.a(this.f2389e.getClass()).c(this.f2389e, bArr, 0, i3, new r0(c1Var));
        } catch (v1 e2) {
            throw e2;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
