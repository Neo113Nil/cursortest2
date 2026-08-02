package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kem implements kmn {
    public static final Logger t = Logger.getLogger(kem.class.getName());

    public abstract kel b();

    @Override // defpackage.kmn
    public final void e() {
        kjj u;
        ikk ikkVar;
        if (u().g || (ikkVar = (u = u()).k) == null || ikkVar.x() <= 0) {
            return;
        }
        u.a(false, true);
    }

    @Override // defpackage.kmn
    public final void f() {
        kel b = b();
        kjf kjfVar = b.c;
        kjfVar.a = b;
        b.m = kjfVar;
    }

    @Override // defpackage.kmn
    public final void g(int i) {
        kel b = b();
        kjf kjfVar = b.m;
        int i2 = kob.a;
        vz vzVar = new vz(b, i, 9, null);
        synchronized (((khg) b).s) {
            vzVar.run();
        }
    }

    @Override // defpackage.kmn
    public final void h(jxe jxeVar) {
        u().c = jxeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kmn
    public final void j(InputStream inputStream) {
        int a;
        try {
            if (!u().g) {
                kjj u = u();
                if (u.g) {
                    throw new IllegalStateException("Framer already closed");
                }
                u.h++;
                u.i++;
                u.j = 0L;
                kmm.d(u.f);
                jxe jxeVar = u.c;
                jxd jxdVar = jxc.a;
                try {
                    try {
                        int available = inputStream.available();
                        if (available != 0 && jxeVar != jxdVar) {
                            kjg kjgVar = new kjg();
                            try {
                                a = inputStream.a(kjgVar);
                                kjgVar.close();
                                int i = u.a;
                                if (i >= 0 && a > i) {
                                    throw new kbt(kbq.h.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(a), Integer.valueOf(u.a))), null);
                                }
                                u.b(kjgVar, true);
                            } catch (Throwable th) {
                                kjgVar.close();
                                throw th;
                            }
                        } else if (available != -1) {
                            u.j = available;
                            int i2 = u.a;
                            if (i2 >= 0 && available > i2) {
                                throw new kbt(kbq.h.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(available), Integer.valueOf(u.a))), null);
                            }
                            ByteBuffer byteBuffer = u.e;
                            byteBuffer.clear();
                            byteBuffer.put((byte) 0).putInt(available);
                            u.b = available + 5;
                            u.c(byteBuffer.array(), 0, byteBuffer.position());
                            a = inputStream.a(u.d);
                        } else {
                            kjg kjgVar2 = new kjg();
                            a = inputStream.a(kjgVar2);
                            u.b(kjgVar2, false);
                        }
                        if (available != -1 && a != available) {
                            throw new kbt(kbq.k.e(String.format("Message length inaccurate %s != %s", Integer.valueOf(a), Integer.valueOf(available))), null);
                        }
                        kmm kmmVar = u.f;
                        kmm.d(kmmVar);
                        kmmVar.b(u.j);
                        kmm.d(kmmVar);
                    } catch (kbt e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    throw new kbt(kbq.k.e("Failed to frame message").d(e2), null);
                } catch (RuntimeException e3) {
                    throw new kbt(kbq.k.e("Failed to frame message").d(e3), null);
                }
            }
        } finally {
            khd.f(inputStream);
        }
    }

    @Override // defpackage.kmn
    public boolean k() {
        throw null;
    }

    protected abstract kjj u();
}
