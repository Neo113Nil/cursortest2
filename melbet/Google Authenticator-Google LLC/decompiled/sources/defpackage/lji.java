package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lji implements ljr {
    public final /* synthetic */ ljj a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ lji(ljj ljjVar, boolean z, int i) {
        this.c = i;
        this.a = ljjVar;
        this.b = z;
    }

    @Override // defpackage.ljr
    public final void a() {
        int i = this.c;
        ljj ljjVar = this.a;
        if (i != 0) {
            lkb lkbVar = ljjVar.c;
            long length = lkbVar.getLength();
            ljjVar.e = length;
            if (length == 0) {
                ljjVar.f();
                return;
            }
            if (length <= 0 || length >= 8192) {
                ljjVar.d = ByteBuffer.allocateDirect(8192);
            } else {
                ljjVar.d = ByteBuffer.allocateDirect(((int) length) + 1);
            }
            long j = ljjVar.e;
            if (j > 0) {
                ljjVar.h.setFixedLengthStreamingMode(j);
            } else {
                ljjVar.h.setChunkedStreamingMode(8192);
            }
            if (this.b) {
                ljjVar.c();
                return;
            } else {
                ljjVar.a.set(1);
                lkbVar.rewind(ljjVar);
                return;
            }
        }
        long j2 = ljjVar.e;
        if (j2 != -1 && j2 - ljjVar.f < ljjVar.d.remaining()) {
            ljjVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(ljjVar.f + ljjVar.d.remaining()), Long.valueOf(ljjVar.e))));
            return;
        }
        boolean z = this.b;
        if (ljjVar.d.remaining() == 0 && !z) {
            ljjVar.g(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
            return;
        }
        long j3 = ljjVar.f;
        ByteBuffer byteBuffer = ljjVar.d;
        int i2 = 0;
        while (byteBuffer.hasRemaining()) {
            i2 += ljjVar.i.write(byteBuffer);
        }
        ljjVar.j.flush();
        long j4 = j3 + i2;
        ljjVar.f = j4;
        long j5 = ljjVar.e;
        if (j4 >= j5) {
            if (j5 == -1) {
                if (z) {
                    j5 = -1;
                }
            }
            if (j5 == -1) {
                ljjVar.f();
                return;
            } else if (j5 == j4) {
                ljjVar.f();
                return;
            } else {
                ljjVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(ljjVar.f), Long.valueOf(ljjVar.e))));
                return;
            }
        }
        ljjVar.a.set(0);
        ljjVar.b();
    }
}
