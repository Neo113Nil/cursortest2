package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxn {
    private gvy a;
    private SparseArray b;
    private boolean c;
    private float d;
    private boolean e;
    private hel f;
    private byte g;

    public final gxo a() {
        gvy gvyVar;
        SparseArray sparseArray;
        hel helVar;
        if (this.g == 7 && (gvyVar = this.a) != null && (sparseArray = this.b) != null && (helVar = this.f) != null) {
            return new gxo(gvyVar, sparseArray, this.c, this.d, this.e, helVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" traceRecord");
        }
        if (this.b == null) {
            sb.append(" spanExtras");
        }
        if ((this.g & 1) == 0) {
            sb.append(" isPartialTrace");
        }
        if ((this.g & 2) == 0) {
            sb.append(" traceSamplingRate");
        }
        if ((this.g & 4) == 0) {
            sb.append(" enableTiktokTraceEmptyCheckFix");
        }
        if (this.f == null) {
            sb.append(" cuiMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(hel helVar) {
        if (helVar == null) {
            throw new NullPointerException("Null cuiMetadata");
        }
        this.f = helVar;
    }

    public final void c(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 4);
    }

    public final void d(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 1);
    }

    public final void e(SparseArray sparseArray) {
        if (sparseArray == null) {
            throw new NullPointerException("Null spanExtras");
        }
        this.b = sparseArray;
    }

    public final void f(gvy gvyVar) {
        if (gvyVar == null) {
            throw new NullPointerException("Null traceRecord");
        }
        this.a = gvyVar;
    }

    public final void g(float f) {
        this.d = f;
        this.g = (byte) (this.g | 2);
    }
}
