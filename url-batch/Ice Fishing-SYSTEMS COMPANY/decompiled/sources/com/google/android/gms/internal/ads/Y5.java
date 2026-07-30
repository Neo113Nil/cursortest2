package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class Y5 {

    /* renamed from: a, reason: collision with root package name */
    public final V5 f28787a;

    /* renamed from: b, reason: collision with root package name */
    public final C3761pr f28788b = new C3761pr(6);

    /* renamed from: c, reason: collision with root package name */
    public final O5 f28789c;

    public Y5(V5 v52, O5 o52) {
        this.f28787a = v52;
        this.f28789c = o52;
    }

    public final Optional a() {
        EnumC4261z5 enumC4261z5;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f28788b.f33523u;
            if (arrayDeque.isEmpty()) {
                throw new S5();
            }
            Q5 q52 = (Q5) arrayDeque.pop();
            long j9 = q52.f27115a;
            long j10 = q52.f27116b;
            long j11 = q52.f27117c;
            V5 v52 = this.f28787a;
            if (v52.f28211b < j10) {
                return Optional.of(EnumC4261z5.f35468n0);
            }
            this.f28789c.a(j9);
            if (j11 == 0) {
                while (v52.f28211b > j10) {
                    v52.c();
                }
            }
            return Optional.empty();
        } catch (M5 e6) {
            e = e6;
            throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
        } catch (N5 e9) {
            e = e9;
            throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e);
        } catch (S5 unused) {
            enumC4261z5 = EnumC4261z5.f35459Q;
            return Optional.of(enumC4261z5);
        } catch (T5 unused2) {
            enumC4261z5 = EnumC4261z5.f35468n0;
            return Optional.of(enumC4261z5);
        }
    }
}
