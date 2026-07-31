package S;

import S.b;
import android.os.Looper;
import android.util.AndroidRuntimeException;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: A, reason: collision with root package name */
    private e f9221A;

    /* renamed from: B, reason: collision with root package name */
    private float f9222B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f9223C;

    public d(Object obj, c cVar) {
        super(obj, cVar);
        this.f9221A = null;
        this.f9222B = Float.MAX_VALUE;
        this.f9223C = false;
    }

    private void o() {
        e eVar = this.f9221A;
        if (eVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double a4 = eVar.a();
        if (a4 > this.f9213g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (a4 < this.f9214h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // S.b
    public void i() {
        o();
        this.f9221A.g(d());
        super.i();
    }

    @Override // S.b
    boolean k(long j4) {
        if (this.f9223C) {
            float f4 = this.f9222B;
            if (f4 != Float.MAX_VALUE) {
                this.f9221A.e(f4);
                this.f9222B = Float.MAX_VALUE;
            }
            this.f9208b = this.f9221A.a();
            this.f9207a = 0.0f;
            this.f9223C = false;
            return true;
        }
        if (this.f9222B != Float.MAX_VALUE) {
            this.f9221A.a();
            long j5 = j4 / 2;
            b.o h4 = this.f9221A.h(this.f9208b, this.f9207a, j5);
            this.f9221A.e(this.f9222B);
            this.f9222B = Float.MAX_VALUE;
            b.o h5 = this.f9221A.h(h4.f9219a, h4.f9220b, j5);
            this.f9208b = h5.f9219a;
            this.f9207a = h5.f9220b;
        } else {
            b.o h6 = this.f9221A.h(this.f9208b, this.f9207a, j4);
            this.f9208b = h6.f9219a;
            this.f9207a = h6.f9220b;
        }
        float max = Math.max(this.f9208b, this.f9214h);
        this.f9208b = max;
        float min = Math.min(max, this.f9213g);
        this.f9208b = min;
        if (!n(min, this.f9207a)) {
            return false;
        }
        this.f9208b = this.f9221A.a();
        this.f9207a = 0.0f;
        return true;
    }

    public void l(float f4) {
        if (e()) {
            this.f9222B = f4;
            return;
        }
        if (this.f9221A == null) {
            this.f9221A = new e(f4);
        }
        this.f9221A.e(f4);
        i();
    }

    public boolean m() {
        return this.f9221A.f9225b > 0.0d;
    }

    boolean n(float f4, float f5) {
        return this.f9221A.c(f4, f5);
    }

    public d p(e eVar) {
        this.f9221A = eVar;
        return this;
    }

    public void q() {
        if (!m()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f9212f) {
            this.f9223C = true;
        }
    }
}
