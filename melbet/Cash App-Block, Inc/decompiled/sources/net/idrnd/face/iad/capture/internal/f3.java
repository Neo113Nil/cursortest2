package net.idrnd.face.iad.capture.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.NativeImageProcessor;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes9.dex */
public final class f3 implements AutoCloseable, Comparable {
    public final d3 a;
    public final int b;
    public final int c;
    public final MatchResult.Destructured d;
    public boolean f;
    public final Object e = new Object();
    public final Lazy g = LazyKt.lazy(new e3(this, 0));

    public f3(d3 d3Var, int i, int i2, MatchResult.Destructured destructured) {
        this.a = d3Var;
        this.b = i;
        this.c = i2;
        this.d = destructured;
    }

    public final f3 a() {
        synchronized (this.e) {
            d3 d3Var = null;
            if (c()) {
                return null;
            }
            d3 d3Var2 = this.a;
            synchronized (d3Var2.d) {
                if (!d3Var2.c) {
                    d3Var = new d3(NativeImageProcessor.a.copyNativeByteArray(d3Var2.a, d3Var2.b), d3Var2.b);
                }
            }
            d3Var.getClass();
            return new f3(d3Var, this.b, this.c, this.d);
        }
    }

    public final long b() {
        return ((Number) this.g.getValue()).longValue();
    }

    public final boolean c() {
        boolean z;
        synchronized (this.e) {
            z = this.f;
        }
        return z;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (c()) {
                return;
            }
            this.a.close();
            this.f = true;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f3 f3Var = (f3) obj;
        f3Var.getClass();
        long j = ((IadFrame) this.d.match).b - ((IadFrame) f3Var.d.match).b;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (f3.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            f3 f3Var = (f3) obj;
            if (this.b == f3Var.b && this.c == f3Var.c && this.a.equals(f3Var.a) && this.d == f3Var.d && this.e == f3Var.e && ((Number) this.g.getValue()).longValue() == ((Number) f3Var.g.getValue()).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(((Number) this.g.getValue()).longValue()) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.a.hashCode() + (((this.b * 31) + this.c) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = this.a.b;
        boolean c = c();
        MatchResult.Destructured destructured = this.d;
        long j = ((IadFrame) destructured.match).b;
        long b = b();
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, this.b, "NativeYuvImage(yuvBytes.size=", ", width=", ", height=");
        m107m.append(this.c);
        m107m.append(", imageInfo=");
        m107m.append(destructured);
        m107m.append(", isClosed=");
        m107m.append(c);
        m107m.append(", timestampNs=");
        m107m.append(j);
        return Boxes$$ExternalSyntheticOutline1.m(b, ", timestampMs=", ")", m107m);
    }
}
