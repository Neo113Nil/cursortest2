package U0;

import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import l5.AbstractC0505i;
import u0.C0675e;

/* loaded from: classes.dex */
public final class h implements F0.b, O3.c, M0.a, O3.i, i6.l {

    /* renamed from: g, reason: collision with root package name */
    public static h f2540g;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2541f;

    public /* synthetic */ h(int i7) {
        this.f2541f = i7;
    }

    public static final String e(n6.i iVar, n6.i[] iVarArr, int i7) {
        int i8;
        boolean z5;
        int i9;
        int i10;
        n6.i iVar2 = k6.a.f5222b;
        int a7 = iVar.a();
        int i11 = 0;
        while (i11 < a7) {
            int i12 = (i11 + a7) / 2;
            while (i12 > -1 && iVar.d(i12) != 10) {
                i12--;
            }
            int i13 = i12 + 1;
            int i14 = 1;
            while (true) {
                i8 = i13 + i14;
                if (iVar.d(i8) == 10) {
                    break;
                }
                i14++;
            }
            int i15 = i8 - i13;
            int i16 = i7;
            boolean z6 = false;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (z6) {
                    i9 = 46;
                    z5 = false;
                } else {
                    byte d7 = iVarArr[i16].d(i17);
                    byte[] bArr = Y5.c.f3099a;
                    int i19 = d7 & 255;
                    z5 = z6;
                    i9 = i19;
                }
                byte d8 = iVar.d(i13 + i18);
                byte[] bArr2 = Y5.c.f3099a;
                i10 = i9 - (d8 & 255);
                if (i10 != 0) {
                    break;
                }
                i18++;
                i17++;
                if (i18 == i15) {
                    break;
                }
                if (iVarArr[i16].a() != i17) {
                    z6 = z5;
                } else {
                    if (i16 == iVarArr.length - 1) {
                        break;
                    }
                    i16++;
                    i17 = -1;
                    z6 = true;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i20 = i15 - i18;
                    int a8 = iVarArr[i16].a() - i17;
                    int length = iVarArr.length;
                    for (int i21 = i16 + 1; i21 < length; i21++) {
                        a8 += iVarArr[i21].a();
                    }
                    if (a8 >= i20) {
                        if (a8 <= i20) {
                            return iVar.h(i13, i15 + i13).g(F5.a.f785a);
                        }
                    }
                }
                i11 = i8 + 1;
            }
            a7 = i12;
        }
        return null;
    }

    public static final void f(n6.d dVar, long j4, boolean z5) {
        A.j jVar = n6.d.f5510h;
        if (n6.d.f5511i == null) {
            n6.d.f5511i = new n6.d();
            n6.c cVar = new n6.c("Okio Watchdog");
            cVar.setDaemon(true);
            cVar.start();
        }
        long nanoTime = System.nanoTime();
        if (j4 != 0 && z5) {
            dVar.f5518g = Math.min(j4, dVar.c() - nanoTime) + nanoTime;
        } else if (j4 != 0) {
            dVar.f5518g = nanoTime + j4;
        } else {
            if (!z5) {
                throw new AssertionError();
            }
            dVar.f5518g = dVar.c();
        }
        A.j jVar2 = n6.d.f5510h;
        int i7 = jVar2.f26b + 1;
        jVar2.f26b = i7;
        n6.d[] dVarArr = (n6.d[]) jVar2.f27c;
        if (i7 == dVarArr.length) {
            n6.d[] dVarArr2 = new n6.d[i7 * 2];
            AbstractC0505i.G(dVarArr, dVarArr2, 0, 0, dVarArr.length);
            jVar2.f27c = dVarArr2;
        }
        jVar2.c(i7, dVar);
        if (dVar.f5517f == 1) {
            n6.d.f5513k.signal();
        }
    }

    public static n6.d h() {
        A.j jVar = n6.d.f5510h;
        n6.d dVar = ((n6.d[]) jVar.f27c)[1];
        if (dVar == null) {
            long nanoTime = System.nanoTime();
            n6.d.f5513k.await(n6.d.f5514l, TimeUnit.MILLISECONDS);
            if (((n6.d[]) jVar.f27c)[1] != null || System.nanoTime() - nanoTime < n6.d.f5515m) {
                return null;
            }
            return n6.d.f5511i;
        }
        long nanoTime2 = dVar.f5518g - System.nanoTime();
        if (nanoTime2 > 0) {
            n6.d.f5513k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        jVar.h(dVar);
        dVar.f5516e = 2;
        return dVar;
    }

    @Override // i6.l
    public boolean a(SSLSocket sSLSocket) {
        return F5.q.I(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.");
    }

    @Override // i6.l
    public i6.n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new i6.e(cls2);
    }

    @Override // M0.a
    public long c() {
        return System.currentTimeMillis();
    }

    @Override // O3.c
    public void d(ByteBuffer byteBuffer, F3.f fVar) {
        O3.n.f1776b.getClass();
        O3.n.a(byteBuffer);
    }

    @Override // O3.i
    public void g(C0675e c0675e, N3.j jVar) {
        switch (this.f2541f) {
            case 5:
                jVar.d(null);
                break;
            default:
                jVar.d(null);
                break;
        }
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        return new D0.q(0, Executors.newSingleThreadExecutor());
    }

    public h(F3.b bVar) {
        this.f2541f = 2;
    }
}
