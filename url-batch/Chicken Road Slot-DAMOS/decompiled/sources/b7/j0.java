package b7;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.z5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 implements OnCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final d f1298d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1299e;

    /* renamed from: i, reason: collision with root package name */
    public final a f1300i;

    /* renamed from: r, reason: collision with root package name */
    public final long f1301r;

    /* renamed from: s, reason: collision with root package name */
    public final long f1302s;

    public j0(d dVar, int i3, a aVar, long j, long j3) {
        this.f1298d = dVar;
        this.f1299e = i3;
        this.f1300i = aVar;
        this.f1301r = j;
        this.f1302s = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c7.g a(b0 b0Var, c7.f fVar, int i3) {
        c7.k0 k0Var = fVar.B;
        c7.g gVar = k0Var == null ? null : k0Var.f1938r;
        if (gVar != null && gVar.f1904e) {
            int[] iArr = gVar.f1906r;
            int i10 = 0;
            if (iArr == null) {
                int[] iArr2 = gVar.f1908t;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] == i3) {
                            break;
                        }
                        i10++;
                    }
                }
                if (b0Var.f1250o >= gVar.f1907s) {
                    return gVar;
                }
            } else {
                while (i10 < iArr.length) {
                    if (iArr[i10] != i3) {
                        i10++;
                    } else if (b0Var.f1250o >= gVar.f1907s) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        long j3;
        d dVar = this.f1298d;
        if (dVar.e()) {
            c7.m mVar = (c7.m) c7.l.b().f1941a;
            if (mVar == null || mVar.f1946e) {
                b0 b0Var = (b0) dVar.j.get(this.f1300i);
                if (b0Var != null) {
                    c7.i iVar = b0Var.f1242e;
                    if (iVar instanceof c7.f) {
                        c7.i iVar2 = iVar;
                        long j10 = this.f1301r;
                        int i14 = 0;
                        boolean z10 = j10 > 0;
                        int i15 = iVar2.f1897v;
                        if (mVar != null) {
                            z10 &= mVar.f1947i;
                            i3 = mVar.f1948r;
                            i11 = mVar.f1949s;
                            i10 = mVar.f1945d;
                            if (iVar2.B != null && !iVar2.r()) {
                                c7.g a9 = a(b0Var, iVar2, this.f1299e);
                                if (a9 == null) {
                                    return;
                                }
                                boolean z11 = a9.f1905i && j10 > 0;
                                i11 = a9.f1907s;
                                z10 = z11;
                            }
                        } else {
                            i3 = 5000;
                            i10 = 0;
                            i11 = 100;
                        }
                        int i16 = i3;
                        int i17 = -1;
                        if (task.isSuccessful()) {
                            i13 = 0;
                        } else if (task.i()) {
                            i14 = -1;
                            i13 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof a7.e) {
                                Status status = ((a7.e) exception).f316d;
                                i12 = status.f2119d;
                                z6.b bVar = status.f2122r;
                                if (bVar != null) {
                                    i13 = i12;
                                    i14 = bVar.f10867e;
                                }
                            } else {
                                i12 = 101;
                            }
                            i13 = i12;
                            i14 = -1;
                        }
                        if (z10) {
                            long j11 = this.f1302s;
                            long currentTimeMillis = System.currentTimeMillis();
                            i17 = (int) (SystemClock.elapsedRealtime() - j11);
                            j3 = currentTimeMillis;
                            j = j10;
                        } else {
                            j = 0;
                            j3 = 0;
                        }
                        k0 k0Var = new k0(new c7.k(this.f1299e, i13, i14, j, j3, null, null, i15, i17), i10, i16, i11);
                        z5 z5Var = dVar.f1273m;
                        z5Var.sendMessage(z5Var.obtainMessage(18, k0Var));
                    }
                }
            }
        }
    }
}
