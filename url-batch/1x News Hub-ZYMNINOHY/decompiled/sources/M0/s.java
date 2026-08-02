package M0;

import N0.C0064c;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class s implements d1.b {

    /* renamed from: a, reason: collision with root package name */
    public final c f952a;

    /* renamed from: b, reason: collision with root package name */
    public final int f953b;

    /* renamed from: c, reason: collision with root package name */
    public final a f954c;

    /* renamed from: d, reason: collision with root package name */
    public final long f955d;

    /* renamed from: e, reason: collision with root package name */
    public final long f956e;

    public s(c cVar, int i3, a aVar, long j3, long j4) {
        this.f952a = cVar;
        this.f953b = i3;
        this.f954c = aVar;
        this.f955d = j3;
        this.f956e = j4;
    }

    public static C0064c a(m mVar, com.google.android.gms.common.internal.a aVar, int i3) {
        N0.x xVar = aVar.f2700u;
        C0064c c0064c = xVar == null ? null : xVar.f1069d;
        if (c0064c != null && c0064c.f998b) {
            int[] iArr = c0064c.f1000d;
            int i4 = 0;
            if (iArr == null) {
                int[] iArr2 = c0064c.f;
                if (iArr2 != null) {
                    while (i4 < iArr2.length) {
                        if (iArr2[i4] == i3) {
                            return null;
                        }
                        i4++;
                    }
                }
            } else {
                while (i4 < iArr.length) {
                    if (iArr[i4] != i3) {
                        i4++;
                    }
                }
            }
            if (mVar.f940m < c0064c.f1001e) {
                return c0064c;
            }
        }
        return null;
    }

    @Override // d1.b
    public final void onComplete(Task task) {
        int i3;
        int i4;
        int i5;
        int i6;
        long j3;
        long j4;
        if (this.f952a.a()) {
            N0.h hVar = (N0.h) N0.g.b().f1026a;
            if (hVar == null || hVar.f1028b) {
                m mVar = (m) this.f952a.f920j.get(this.f954c);
                if (mVar != null) {
                    L0.c cVar = mVar.f931c;
                    if (cVar instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                        int i7 = 0;
                        boolean z = this.f955d > 0;
                        int i8 = aVar.f2695p;
                        int i9 = 100;
                        if (hVar != null) {
                            z &= hVar.f1029c;
                            int i10 = hVar.f1030d;
                            int i11 = hVar.f1031e;
                            i3 = hVar.f1027a;
                            if (aVar.f2700u != null && !aVar.h()) {
                                C0064c a3 = a(mVar, aVar, this.f953b);
                                if (a3 == null) {
                                    return;
                                }
                                boolean z2 = a3.f999c && this.f955d > 0;
                                i11 = a3.f1001e;
                                z = z2;
                            }
                            i5 = i10;
                            i4 = i11;
                        } else {
                            i3 = 0;
                            i4 = 100;
                            i5 = 5000;
                        }
                        c cVar2 = this.f952a;
                        int i12 = -1;
                        if (task.c()) {
                            i6 = 0;
                        } else {
                            if (!((d1.k) task).f4945d) {
                                Exception a4 = task.a();
                                if (a4 instanceof L0.d) {
                                    Status status = ((L0.d) a4).f876a;
                                    i9 = status.f2677a;
                                    K0.b bVar = status.f2680d;
                                    if (bVar != null) {
                                        i7 = bVar.f836b;
                                        i6 = i9;
                                    }
                                } else {
                                    i6 = 101;
                                    i7 = -1;
                                }
                            }
                            i6 = i9;
                            i7 = -1;
                        }
                        if (z) {
                            long j5 = this.f955d;
                            long j6 = this.f956e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i12 = (int) (SystemClock.elapsedRealtime() - j6);
                            j4 = currentTimeMillis;
                            j3 = j5;
                        } else {
                            j3 = 0;
                            j4 = 0;
                        }
                        int i13 = i12;
                        cVar2.getClass();
                        t tVar = new t(new N0.f(this.f953b, i6, i7, j3, j4, null, null, i8, i13), i3, i5, i4);
                        W0.e eVar = cVar2.f923m;
                        eVar.sendMessage(eVar.obtainMessage(18, tVar));
                    }
                }
            }
        }
    }
}
