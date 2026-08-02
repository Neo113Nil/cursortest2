package defpackage;

import android.os.Parcel;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kdp {
    public final kcs a;
    public final int b;
    public final kmm c;
    public kaa d;
    public kbq e;
    public kaa f;
    private boolean g;
    private InputStream h;
    private Queue i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n = 1;

    public kdp(kcs kcsVar, int i, kmm kmmVar) {
        this.a = kcsVar;
        this.b = i;
        this.c = kmmVar;
    }

    private final void g(int i) {
        int i2 = this.n;
        int i3 = i - 1;
        if (i3 == 1) {
            hoq.H(i2 == 1);
        } else if (i3 == 2) {
            hoq.H(i2 == 2);
        } else if (i3 == 3) {
            hoq.H(i2 == 3);
        }
        this.n = i;
    }

    final void a(InputStream inputStream) {
        b();
        Queue queue = this.i;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.h == null) {
                this.h = inputStream;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.i = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    protected final void b() {
        this.g = true;
    }

    protected final void c() {
        this.j = true;
    }

    final void d() {
        int i;
        int i2;
        while (true) {
            int i3 = this.n;
            int i4 = i3 - 1;
            InputStream inputStream = null;
            if (i3 == 0) {
                throw null;
            }
            int i5 = 1;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2 || !this.j) {
                        return;
                    }
                } else if (!f() && !this.j) {
                    return;
                }
            } else if (!this.g) {
                return;
            }
            if (!e()) {
                return;
            }
            try {
                try {
                    kdq c = kdq.c();
                    try {
                        int i6 = 0;
                        c.a().writeInt(0);
                        Parcel a = c.a();
                        int i7 = this.k;
                        this.k = i7 + 1;
                        a.writeInt(i7);
                        int i8 = this.n;
                        int i9 = i8 - 1;
                        if (i8 == 0) {
                            throw null;
                        }
                        if (i9 == 0) {
                            kdk.b(c.a(), this.d);
                            g(2);
                            if (f() || this.j) {
                                i = 1;
                            } else {
                                ixa.c(c.a(), i5);
                                int dataSize = c.a().dataSize();
                                this.a.i(this.b, c);
                                kmm kmmVar = this.c;
                                kmmVar.b(dataSize);
                                kmm.d(kmmVar);
                                c.close();
                            }
                        } else if (i9 == 1) {
                            i = 0;
                        } else {
                            if (i9 != 2) {
                                throw new AssertionError();
                            }
                            Parcel a2 = c.a();
                            int b = ixa.b(a2, this.e);
                            kdk.b(a2, this.f);
                            this.a.k(this.b);
                            i5 = i6 | 4 | b;
                            g(4);
                            ixa.c(c.a(), i5);
                            int dataSize2 = c.a().dataSize();
                            this.a.i(this.b, c);
                            kmm kmmVar2 = this.c;
                            kmmVar2.b(dataSize2);
                            kmm.d(kmmVar2);
                            c.close();
                        }
                        if (this.l == 0) {
                            inputStream = this.h;
                        } else {
                            Queue queue = this.i;
                            if (queue != null) {
                                inputStream = (InputStream) queue.peek();
                            }
                        }
                        if (inputStream != null) {
                            int i10 = i | 2;
                            Parcel a3 = c.a();
                            if (inputStream instanceof kdr) {
                                this.m = ((kdr) inputStream).a(a3);
                                i2 = 64;
                                i5 = 0;
                            } else {
                                byte[] b2 = kcy.b();
                                try {
                                    int read = inputStream.read(b2);
                                    if (read <= 0) {
                                        a3.writeInt(0);
                                    } else {
                                        a3.writeInt(read);
                                        a3.writeByteArray(b2, 0, read);
                                        this.m += read;
                                        if (read == b2.length) {
                                            i2 = 128;
                                        }
                                    }
                                    i5 = 0;
                                    i2 = 0;
                                } finally {
                                    kcy.a(b2);
                                }
                            }
                            if (i5 == 0) {
                                inputStream.close();
                                int i11 = this.l;
                                this.l = i11 + 1;
                                if (i11 > 0) {
                                    Queue queue2 = this.i;
                                    queue2.getClass();
                                    queue2.poll();
                                }
                                kmm kmmVar3 = this.c;
                                kmm.d(kmmVar3);
                                kmm.d(kmmVar3);
                                this.m = 0;
                            }
                            i = i10 | i2;
                        } else {
                            hoq.H(this.j);
                        }
                        i5 = i;
                        if (this.j && !f()) {
                            g(3);
                            i6 = i5;
                            Parcel a22 = c.a();
                            int b3 = ixa.b(a22, this.e);
                            kdk.b(a22, this.f);
                            this.a.k(this.b);
                            i5 = i6 | 4 | b3;
                            g(4);
                        }
                        ixa.c(c.a(), i5);
                        int dataSize22 = c.a().dataSize();
                        this.a.i(this.b, c);
                        kmm kmmVar22 = this.c;
                        kmmVar22.b(dataSize22);
                        kmm.d(kmmVar22);
                        c.close();
                    } catch (Throwable th) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (kbr e) {
                    g(5);
                    throw e;
                }
            } catch (IOException e2) {
                throw new kbr(kbq.k.d(e2));
            }
        }
    }

    final boolean e() {
        return this.a.l();
    }

    protected final boolean f() {
        Queue queue = this.i;
        return queue != null ? !queue.isEmpty() : this.h != null && this.l == 0;
    }

    public final synchronized String toString() {
        String simpleName;
        int i;
        simpleName = getClass().getSimpleName();
        i = this.n;
        return simpleName + "[S=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL") + "/NDM=" + this.l + "]";
    }
}
