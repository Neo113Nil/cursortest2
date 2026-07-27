package z3;

import A.AbstractC0017m;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements F {

    /* renamed from: d, reason: collision with root package name */
    public final z f12024d;

    /* renamed from: e, reason: collision with root package name */
    public final Inflater f12025e;

    /* renamed from: i, reason: collision with root package name */
    public int f12026i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12027j;

    public p(z source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f12024d = source;
        this.f12025e = inflater;
    }

    @Override // z3.F
    public final H c() {
        return this.f12024d.f12044d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12027j) {
            return;
        }
        this.f12025e.end();
        this.f12027j = true;
        this.f12024d.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[SYNTHETIC] */
    @Override // z3.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l(C1448f sink, long j4) {
        z zVar;
        long j5;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
            }
            if (this.f12027j) {
                throw new IllegalStateException("closed");
            }
            zVar = this.f12024d;
            Inflater inflater = this.f12025e;
            if (j4 != 0) {
                try {
                    A u4 = sink.u(1);
                    int min = (int) Math.min(j4, 8192 - u4.f11964c);
                    if (inflater.needsInput() && !zVar.a()) {
                        A a4 = zVar.f12045e.f11998d;
                        Intrinsics.c(a4);
                        int i2 = a4.f11964c;
                        int i4 = a4.f11963b;
                        int i5 = i2 - i4;
                        this.f12026i = i5;
                        inflater.setInput(a4.f11962a, i4, i5);
                    }
                    int inflate = inflater.inflate(u4.f11962a, u4.f11964c, min);
                    int i6 = this.f12026i;
                    if (i6 != 0) {
                        int remaining = i6 - inflater.getRemaining();
                        this.f12026i -= remaining;
                        zVar.u(remaining);
                    }
                    if (inflate > 0) {
                        u4.f11964c += inflate;
                        j5 = inflate;
                        sink.f11999e += j5;
                        if (j5 <= 0) {
                            return j5;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                    } else if (u4.f11963b == u4.f11964c) {
                        sink.f11998d = u4.a();
                        B.a(u4);
                    }
                } catch (DataFormatException e4) {
                    throw new IOException(e4);
                }
            }
            j5 = 0;
            if (j5 <= 0) {
            }
        } while (!zVar.a());
        throw new EOFException("source exhausted prematurely");
    }
}
