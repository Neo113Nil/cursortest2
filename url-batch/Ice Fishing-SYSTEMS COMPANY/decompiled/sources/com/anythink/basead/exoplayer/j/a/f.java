package com.anythink.basead.exoplayer.j.a;

import android.net.Uri;
import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.v;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8223a = 131072;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public volatile long f8224a;

        /* renamed from: b, reason: collision with root package name */
        public volatile long f8225b;

        /* renamed from: c, reason: collision with root package name */
        public volatile long f8226c = -1;

        private long a() {
            return this.f8224a + this.f8225b;
        }
    }

    private f() {
    }

    private static String a(Uri uri) {
        return uri.toString();
    }

    public static String a(com.anythink.basead.exoplayer.j.k kVar) {
        String str = kVar.f8299h;
        return str != null ? str : kVar.f8294c.toString();
    }

    private static void a(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.a.a aVar, a aVar2) {
        String a9 = a(kVar);
        long j9 = kVar.f8296e;
        long j10 = kVar.f8298g;
        com.anythink.basead.exoplayer.j.a.a aVar3 = aVar;
        if (j10 == -1) {
            j10 = aVar3.b(a9);
        }
        aVar2.f8226c = j10;
        aVar2.f8224a = 0L;
        aVar2.f8225b = 0L;
        long j11 = j10;
        while (j11 != 0) {
            long b9 = aVar3.b(a9, j9, j11 != -1 ? j11 : Long.MAX_VALUE);
            if (b9 > 0) {
                aVar2.f8224a += b9;
            } else {
                b9 = -b9;
                if (b9 == Long.MAX_VALUE) {
                    return;
                }
            }
            j9 += b9;
            if (j11 == -1) {
                b9 = 0;
            }
            j11 -= b9;
            aVar3 = aVar;
        }
    }

    private static void a(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar, a aVar2, AtomicBoolean atomicBoolean) {
        long j9;
        long j10;
        c cVar;
        byte[] bArr;
        a aVar3;
        com.anythink.basead.exoplayer.j.k kVar2 = kVar;
        com.anythink.basead.exoplayer.j.a.a aVar4 = aVar;
        a aVar5 = aVar2;
        c cVar2 = new c(aVar4, hVar);
        byte[] bArr2 = new byte[131072];
        C0544a.a(cVar2);
        C0544a.a(bArr2);
        if (aVar5 != null) {
            String a9 = a(kVar2);
            long j11 = kVar2.f8296e;
            long j12 = kVar2.f8298g;
            if (j12 == -1) {
                j12 = aVar4.b(a9);
            }
            aVar5.f8226c = j12;
            aVar5.f8224a = 0L;
            aVar5.f8225b = 0L;
            long j13 = j12;
            while (true) {
                if (j13 == 0) {
                    j9 = Long.MAX_VALUE;
                    break;
                }
                long b9 = aVar4.b(a9, j11, j13 != -1 ? j13 : Long.MAX_VALUE);
                if (b9 <= 0) {
                    j9 = Long.MAX_VALUE;
                    b9 = -b9;
                    if (b9 == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar5.f8224a += b9;
                }
                j11 += b9;
                if (j13 == -1) {
                    b9 = 0;
                }
                j13 -= b9;
            }
        } else {
            j9 = Long.MAX_VALUE;
            aVar5 = new a();
        }
        String a10 = a(kVar2);
        long j14 = kVar2.f8296e;
        long j15 = kVar2.f8298g;
        if (j15 == -1) {
            j15 = aVar4.b(a10);
        }
        long j16 = j15;
        while (j16 != 0) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long b10 = aVar4.b(a10, j14, j16 != -1 ? j16 : j9);
            String str = a10;
            long j17 = j14;
            if (b10 <= 0) {
                long j18 = -b10;
                c cVar3 = cVar2;
                aVar3 = aVar5;
                byte[] bArr3 = bArr2;
                long a11 = a(kVar2, j17, j18, cVar3, bArr3, (v) null, aVar3);
                j10 = j17;
                cVar = cVar3;
                bArr = bArr3;
                if (a11 < j18) {
                    return;
                } else {
                    b10 = j18;
                }
            } else {
                j10 = j17;
                cVar = cVar2;
                bArr = bArr2;
                aVar3 = aVar5;
            }
            j14 = j10 + b10;
            if (j16 == -1) {
                b10 = 0;
            }
            j16 -= b10;
            bArr2 = bArr;
            aVar5 = aVar3;
            a10 = str;
            aVar4 = aVar;
            cVar2 = cVar;
            kVar2 = kVar;
        }
    }

    private static void a(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.a.a aVar, c cVar, byte[] bArr, v vVar, a aVar2, AtomicBoolean atomicBoolean) {
        long j9;
        a aVar3;
        com.anythink.basead.exoplayer.j.k kVar2 = kVar;
        com.anythink.basead.exoplayer.j.a.a aVar4 = aVar;
        C0544a.a(cVar);
        C0544a.a(bArr);
        if (aVar2 != null) {
            String a9 = a(kVar2);
            long j10 = kVar2.f8296e;
            long j11 = kVar2.f8298g;
            if (j11 == -1) {
                j11 = aVar4.b(a9);
            }
            aVar2.f8226c = j11;
            aVar2.f8224a = 0L;
            aVar2.f8225b = 0L;
            long j12 = j11;
            while (true) {
                if (j12 == 0) {
                    j9 = Long.MAX_VALUE;
                    break;
                }
                long b9 = aVar4.b(a9, j10, j12 != -1 ? j12 : Long.MAX_VALUE);
                if (b9 <= 0) {
                    j9 = Long.MAX_VALUE;
                    b9 = -b9;
                    if (b9 == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar2.f8224a += b9;
                }
                j10 += b9;
                if (j12 == -1) {
                    b9 = 0;
                }
                j12 -= b9;
            }
            aVar3 = aVar2;
        } else {
            j9 = Long.MAX_VALUE;
            aVar3 = new a();
        }
        String a10 = a(kVar2);
        long j13 = kVar2.f8296e;
        long j14 = kVar2.f8298g;
        if (j14 == -1) {
            j14 = aVar4.b(a10);
        }
        long j15 = j14;
        while (j15 != 0) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long b10 = aVar4.b(a10, j13, j15 != -1 ? j15 : j9);
            String str = a10;
            long j16 = j13;
            if (b10 <= 0) {
                long j17 = -b10;
                if (a(kVar2, j16, j17, cVar, bArr, vVar, aVar3) < j17) {
                    return;
                } else {
                    b10 = j17;
                }
            }
            j13 = j16 + b10;
            if (j15 == -1) {
                b10 = 0;
            }
            j15 -= b10;
            kVar2 = kVar;
            aVar4 = aVar;
            a10 = str;
        }
    }

    private static long a(com.anythink.basead.exoplayer.j.k kVar, long j9, long j10, com.anythink.basead.exoplayer.j.h hVar, byte[] bArr, v vVar, a aVar) {
        int length;
        com.anythink.basead.exoplayer.j.k kVar2 = kVar;
        while (true) {
            if (vVar != null) {
                vVar.b();
            }
            try {
                try {
                    if (!Thread.interrupted()) {
                        com.anythink.basead.exoplayer.j.k kVar3 = new com.anythink.basead.exoplayer.j.k(kVar2.f8294c, kVar2.f8295d, j9, (kVar2.f8297f + j9) - kVar2.f8296e, -1L, kVar2.f8299h, kVar2.i | 2);
                        try {
                            long a9 = hVar.a(kVar3);
                            if (aVar.f8226c == -1 && a9 != -1) {
                                aVar.f8226c = kVar3.f8296e + a9;
                            }
                            long j11 = 0;
                            while (true) {
                                if (j11 == j10) {
                                    break;
                                }
                                if (!Thread.interrupted()) {
                                    if (j10 != -1) {
                                        length = (int) Math.min(bArr.length, j10 - j11);
                                    } else {
                                        length = bArr.length;
                                    }
                                    int a10 = hVar.a(bArr, 0, length);
                                    if (a10 != -1) {
                                        long j12 = a10;
                                        j11 += j12;
                                        aVar.f8225b += j12;
                                    } else if (aVar.f8226c == -1) {
                                        aVar.f8226c = kVar3.f8296e + j11;
                                    }
                                } else {
                                    throw new InterruptedException();
                                }
                            }
                            af.a(hVar);
                            return j11;
                        } catch (v.a unused) {
                            kVar2 = kVar3;
                        }
                    } else {
                        throw new InterruptedException();
                    }
                } catch (Throwable th) {
                    af.a(hVar);
                    throw th;
                }
            } catch (v.a unused2) {
            }
            af.a(hVar);
        }
    }

    private static void a(com.anythink.basead.exoplayer.j.a.a aVar, String str) {
        Iterator<e> it = aVar.a(str).iterator();
        while (it.hasNext()) {
            try {
                aVar.b(it.next());
            } catch (a.C0033a unused) {
            }
        }
    }
}
