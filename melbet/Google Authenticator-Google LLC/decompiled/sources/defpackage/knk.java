package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knk implements kac {
    private static final ThreadLocal b = new ThreadLocal();
    public final jll a;
    private final jlr c;

    public knk(jll jllVar) {
        jllVar.getClass();
        this.a = jllVar;
        this.c = jllVar.E();
    }

    @Override // defpackage.kac
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new knj((jll) obj, this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    @Override // defpackage.kac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        jju jjuVar;
        byte[] bArr;
        if (inputStream instanceof knj) {
            knj knjVar = (knj) inputStream;
            if (knjVar.b == this.c) {
                try {
                    jll jllVar = knjVar.a;
                    if (jllVar != null) {
                        return jllVar;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            try {
                try {
                    if (inputStream instanceof jyw) {
                        int available = inputStream.available();
                        if (available > 0 && available <= 4194304) {
                            ThreadLocal threadLocal = b;
                            Reference reference = (Reference) threadLocal.get();
                            if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < available) {
                                bArr = new byte[available];
                                threadLocal.set(new WeakReference(bArr));
                            }
                            int i = available;
                            while (i > 0) {
                                int read = inputStream.read(bArr, available - i, i);
                                if (read == -1) {
                                    break;
                                }
                                i -= read;
                            }
                            if (i != 0) {
                                throw new RuntimeException("size inaccurate: " + available + " != " + (available - i));
                            }
                            jjuVar = jju.Q(bArr, 0, available);
                            if (jjuVar == null) {
                                jjuVar = jju.L(inputStream, 4096);
                            }
                            jjuVar.d = Integer.MAX_VALUE;
                            Object f = this.c.f(jjuVar, knl.a);
                            jjuVar.D(0);
                            return f;
                        }
                        if (available == 0) {
                            return this.a;
                        }
                    }
                    jjuVar.D(0);
                    return f;
                } catch (jld e) {
                    throw e;
                }
                Object f2 = this.c.f(jjuVar, knl.a);
            } catch (jld e2) {
                throw new kbt(kbq.k.e("Invalid protobuf byte sequence").d(e2), null);
            }
            jjuVar = null;
            if (jjuVar == null) {
            }
            jjuVar.d = Integer.MAX_VALUE;
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
