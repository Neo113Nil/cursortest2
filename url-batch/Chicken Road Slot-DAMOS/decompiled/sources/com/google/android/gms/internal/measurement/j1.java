package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j1 implements j2 {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f2424a;

    static {
        c1 c1Var = c1.f2180a;
        int i3 = q0.f2690a;
    }

    public j1(k1 k1Var) {
        this.f2424a = k1Var;
    }

    public final k1 a(InputStream inputStream, c1 c1Var) {
        y0 h10 = y0.h(inputStream, 4096);
        int i3 = k1.zzd;
        k1 i10 = this.f2424a.i();
        try {
            o2 a9 = l2.f2493c.a(i10.getClass());
            androidx.datastore.preferences.protobuf.j jVar = h10.f3001c;
            if (jVar == null) {
                jVar = new androidx.datastore.preferences.protobuf.j(h10);
            }
            a9.f(i10, jVar, c1Var);
            a9.h(i10);
            h10.m(0);
            if (k1.q(i10, true)) {
                return i10;
            }
            throw new s2().a();
        } catch (s2 e2) {
            throw e2.a();
        } catch (v1 e9) {
            if (e9.f2862d) {
                throw new v1(e9.getMessage(), e9);
            }
            throw e9;
        } catch (IOException e10) {
            if (e10.getCause() instanceof v1) {
                throw ((v1) e10.getCause());
            }
            throw new v1(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof v1) {
                throw ((v1) e11.getCause());
            }
            throw e11;
        }
    }
}
