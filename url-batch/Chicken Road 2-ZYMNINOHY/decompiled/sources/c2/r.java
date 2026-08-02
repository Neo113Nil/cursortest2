package c2;

import E.AbstractC0005f;
import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import a2.C0162b;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import d2.C0385c;
import d2.C0388f;
import d2.y;
import java.util.Locale;
import m0.C1295h;
import m0.C1298k;
import m2.HandlerC1312d;
import t2.InterfaceC1440a;
import y0.F;

/* loaded from: classes.dex */
public final class r implements InterfaceC1440a, n0.i {

    /* renamed from: a, reason: collision with root package name */
    public long f5700a;

    /* renamed from: b, reason: collision with root package name */
    public long f5701b;

    /* renamed from: c, reason: collision with root package name */
    public int f5702c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5703d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5704e;

    public r(C0286c c0286c, int i4, C0284a c0284a, long j4, long j5) {
        this.f5703d = c0286c;
        this.f5702c = i4;
        this.f5704e = c0284a;
        this.f5700a = j4;
        this.f5701b = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0385c e(m mVar, com.google.android.gms.common.internal.a aVar, int i4) {
        y yVar = aVar.f5796u;
        C0385c c0385c = yVar == null ? null : yVar.f8312d;
        if (c0385c != null && c0385c.f8235b) {
            int[] iArr = c0385c.f8237d;
            int i5 = 0;
            if (iArr == null) {
                int[] iArr2 = c0385c.f8239f;
                if (iArr2 != null) {
                    while (i5 < iArr2.length) {
                        if (iArr2[i5] == i4) {
                            break;
                        }
                        i5++;
                    }
                }
                if (mVar.f5693l >= c0385c.f8238e) {
                    return c0385c;
                }
            } else {
                while (i5 < iArr.length) {
                    if (iArr[i5] != i4) {
                        i5++;
                    } else if (mVar.f5693l >= c0385c.f8238e) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // n0.i
    public void a(long j4, long j5) {
        this.f5700a = j4;
        this.f5701b = j5;
    }

    @Override // n0.i
    public void b(long j4) {
        this.f5700a = j4;
    }

    @Override // n0.i
    public void c(y0.p pVar, int i4) {
        F z = pVar.z(i4, 1);
        this.f5704e = z;
        z.d(((C1298k) this.f5703d).f14397c);
    }

    @Override // n0.i
    public void d(W.u uVar, long j4, int i4, boolean z) {
        int a3;
        ((F) this.f5704e).getClass();
        int i5 = this.f5702c;
        if (i5 != -1 && i4 != (a3 = C1295h.a(i5))) {
            String str = J.f3263a;
            Locale locale = Locale.US;
            AbstractC0108a.s("RtpPcmReader", AbstractC0005f.l("Received RTP packet with unexpected sequence number. Expected: ", a3, "; received: ", i4, "."));
        }
        long R3 = AbstractC0124a.R(this.f5701b, j4, this.f5700a, ((C1298k) this.f5703d).f14396b);
        int a4 = uVar.a();
        ((F) this.f5704e).a(a4, uVar);
        ((F) this.f5704e).e(R3, 1, a4, 0, null);
        this.f5702c = i4;
    }

    @Override // t2.InterfaceC1440a
    public void onComplete(Task task) {
        int i4;
        int i5;
        int i6;
        int i7;
        long j4;
        long j5;
        if (((C0286c) this.f5703d).a()) {
            d2.i iVar = (d2.i) d2.h.b().f8268a;
            if (iVar == null || iVar.f8270b) {
                m mVar = (m) ((C0286c) this.f5703d).f5671j.get((C0284a) this.f5704e);
                if (mVar != null) {
                    b2.c cVar = mVar.f5683b;
                    if (cVar instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                        int i8 = 0;
                        boolean z = this.f5700a > 0;
                        int i9 = aVar.f5791p;
                        int i10 = 100;
                        if (iVar != null) {
                            z &= iVar.f8271c;
                            int i11 = iVar.f8272d;
                            int i12 = iVar.f8273e;
                            i4 = iVar.f8269a;
                            if (aVar.f5796u != null && !aVar.c()) {
                                C0385c e4 = e(mVar, aVar, this.f5702c);
                                if (e4 == null) {
                                    return;
                                }
                                boolean z4 = e4.f8236c && this.f5700a > 0;
                                i12 = e4.f8238e;
                                z = z4;
                            }
                            i6 = i11;
                            i5 = i12;
                        } else {
                            i4 = 0;
                            i5 = 100;
                            i6 = 5000;
                        }
                        C0286c c0286c = (C0286c) this.f5703d;
                        int i13 = -1;
                        if (task.c()) {
                            i7 = 0;
                        } else {
                            if (!((t2.j) task).f15421d) {
                                Exception a3 = task.a();
                                if (a3 instanceof b2.d) {
                                    Status status = ((b2.d) a3).f5384a;
                                    i10 = status.f5773a;
                                    C0162b c0162b = status.f5776d;
                                    if (c0162b != null) {
                                        i8 = c0162b.f4265b;
                                        i7 = i10;
                                    }
                                } else {
                                    i7 = 101;
                                    i8 = -1;
                                }
                            }
                            i7 = i10;
                            i8 = -1;
                        }
                        if (z) {
                            long j6 = this.f5700a;
                            long j7 = this.f5701b;
                            long currentTimeMillis = System.currentTimeMillis();
                            i13 = (int) (SystemClock.elapsedRealtime() - j7);
                            j5 = currentTimeMillis;
                            j4 = j6;
                        } else {
                            j4 = 0;
                            j5 = 0;
                        }
                        int i14 = i13;
                        c0286c.getClass();
                        s sVar = new s(new C0388f(this.f5702c, i7, i8, j4, j5, null, null, i9, i14), i4, i6, i5);
                        HandlerC1312d handlerC1312d = c0286c.f5674m;
                        handlerC1312d.sendMessage(handlerC1312d.obtainMessage(18, sVar));
                    }
                }
            }
        }
    }

    public r(C1298k c1298k) {
        this.f5703d = c1298k;
        this.f5700a = -9223372036854775807L;
        this.f5701b = 0L;
        this.f5702c = -1;
    }
}
