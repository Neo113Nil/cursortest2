package n1;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import m1.InterfaceC1276c;
import o1.C1356A;
import o1.C1367e;
import o1.C1370h;
import o1.C1371i;
import o1.C1372j;

/* renamed from: n1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1309M implements I1.c {

    /* renamed from: a, reason: collision with root package name */
    public final C1318e f11320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11321b;

    /* renamed from: c, reason: collision with root package name */
    public final C1314a f11322c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11323d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11324e;

    public C1309M(C1318e c1318e, int i2, C1314a c1314a, long j2, long j6) {
        this.f11320a = c1318e;
        this.f11321b = i2;
        this.f11322c = c1314a;
        this.f11323d = j2;
        this.f11324e = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1367e a(C1300D c1300d, com.google.android.gms.common.internal.a aVar, int i2) {
        C1356A c1356a = aVar.z;
        C1367e c1367e = c1356a == null ? null : c1356a.f11501d;
        if (c1367e != null && c1367e.f11530b) {
            int[] iArr = c1367e.f11532d;
            int i3 = 0;
            if (iArr == null) {
                int[] iArr2 = c1367e.f11534f;
                if (iArr2 != null) {
                    while (i3 < iArr2.length) {
                        if (iArr2[i3] != i2) {
                            i3++;
                        }
                    }
                }
                if (c1300d.f11304o >= c1367e.f11533e) {
                    return c1367e;
                }
                return null;
            }
            while (i3 < iArr.length) {
                if (iArr[i3] != i2) {
                    i3++;
                } else if (c1300d.f11304o >= c1367e.f11533e) {
                }
            }
        }
        return null;
    }

    @Override // I1.c
    public final void onComplete(Task task) {
        int i2;
        int i3;
        int i6;
        int i7;
        int i8;
        int i9;
        long j2;
        int i10;
        if (this.f11320a.a()) {
            C1372j c1372j = (C1372j) C1371i.a().f11562a;
            if (c1372j == null || c1372j.f11564b) {
                C1300D c1300d = (C1300D) this.f11320a.f11380j.get(this.f11322c);
                if (c1300d != null) {
                    InterfaceC1276c interfaceC1276c = c1300d.f11294e;
                    if (interfaceC1276c instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) interfaceC1276c;
                        long j6 = 0;
                        boolean z = this.f11323d > 0;
                        int i11 = aVar.f5013u;
                        if (c1372j != null) {
                            z &= c1372j.f11565c;
                            int i12 = c1372j.f11566d;
                            int i13 = c1372j.f11567e;
                            i2 = c1372j.f11563a;
                            if (aVar.z != null && !aVar.g()) {
                                C1367e a6 = a(c1300d, aVar, this.f11321b);
                                if (a6 == null) {
                                    return;
                                }
                                boolean z5 = a6.f11531c && this.f11323d > 0;
                                i13 = a6.f11533e;
                                z = z5;
                            }
                            i6 = i12;
                            i3 = i13;
                        } else {
                            i2 = 0;
                            i3 = 100;
                            i6 = 5000;
                        }
                        C1318e c1318e = this.f11320a;
                        if (task.e()) {
                            i8 = 0;
                            i9 = 0;
                        } else {
                            if (((I1.o) task).f1266d) {
                                i8 = 100;
                            } else {
                                Exception b6 = task.b();
                                if (b6 instanceof m1.f) {
                                    Status status = ((m1.f) b6).f11126a;
                                    i7 = status.f4977a;
                                    l1.b bVar = status.f4980d;
                                    if (bVar != null) {
                                        i9 = bVar.f11000b;
                                        i8 = i7;
                                    }
                                } else {
                                    i7 = 101;
                                }
                                i8 = i7;
                            }
                            i9 = -1;
                        }
                        if (z) {
                            long j7 = this.f11323d;
                            long j8 = this.f11324e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i10 = (int) (SystemClock.elapsedRealtime() - j8);
                            j2 = j7;
                            j6 = currentTimeMillis;
                        } else {
                            j2 = 0;
                            i10 = -1;
                        }
                        c1318e.getClass();
                        C1310N c1310n = new C1310N(new C1370h(this.f11321b, i8, i9, j2, j6, null, null, i11, i10), i2, i6, i3);
                        A1.c cVar = c1318e.f11383m;
                        cVar.sendMessage(cVar.obtainMessage(18, c1310n));
                    }
                }
            }
        }
    }
}
