package c8;

import D.H;
import b8.AbstractC0534c;
import q7.C4944m;
import q7.C4946o;
import q7.C4948q;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class g extends com.bumptech.glide.g {

    /* renamed from: b, reason: collision with root package name */
    public final H f5771b;

    public g(H h9, AbstractC0534c json) {
        kotlin.jvm.internal.h.e(json, "json");
        this.f5771b = h9;
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final int h() {
        H h9 = this.f5771b;
        String k6 = h9.k();
        try {
            kotlin.jvm.internal.h.e(k6, "<this>");
            C4946o D8 = K3.b.D(k6);
            if (D8 != null) {
                return D8.f40176n;
            }
            M7.q.D(k6);
            throw null;
        } catch (IllegalArgumentException unused) {
            H.n(h9, AbstractC5051n.b('\'', "Failed to parse type 'UInt' for input '", k6), 0, 6);
            throw null;
        }
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final long m() {
        H h9 = this.f5771b;
        String k6 = h9.k();
        try {
            kotlin.jvm.internal.h.e(k6, "<this>");
            C4948q E8 = K3.b.E(k6);
            if (E8 != null) {
                return E8.f40178n;
            }
            M7.q.D(k6);
            throw null;
        } catch (IllegalArgumentException unused) {
            H.n(h9, AbstractC5051n.b('\'', "Failed to parse type 'ULong' for input '", k6), 0, 6);
            throw null;
        }
    }

    @Override // Z7.a
    public final int o(Y7.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // com.bumptech.glide.g, Z7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte u() {
        C4944m c4944m;
        H h9 = this.f5771b;
        String k6 = h9.k();
        try {
            kotlin.jvm.internal.h.e(k6, "<this>");
            C4946o D8 = K3.b.D(k6);
            if (D8 != null) {
                int i = D8.f40176n;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) <= 0) {
                    c4944m = new C4944m((byte) i);
                    if (c4944m == null) {
                        return c4944m.f40174n;
                    }
                    M7.q.D(k6);
                    throw null;
                }
            }
            c4944m = null;
            if (c4944m == null) {
            }
        } catch (IllegalArgumentException unused) {
            H.n(h9, AbstractC5051n.b('\'', "Failed to parse type 'UByte' for input '", k6), 0, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // com.bumptech.glide.g, Z7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short v() {
        q7.t tVar;
        H h9 = this.f5771b;
        String k6 = h9.k();
        try {
            kotlin.jvm.internal.h.e(k6, "<this>");
            C4946o D8 = K3.b.D(k6);
            if (D8 != null) {
                int i = D8.f40176n;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) <= 0) {
                    tVar = new q7.t((short) i);
                    if (tVar == null) {
                        return tVar.f40181n;
                    }
                    M7.q.D(k6);
                    throw null;
                }
            }
            tVar = null;
            if (tVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            H.n(h9, AbstractC5051n.b('\'', "Failed to parse type 'UShort' for input '", k6), 0, 6);
            throw null;
        }
    }
}
