package s1;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import r1.InterfaceC0844c;
import t1.C0906C;
import t1.C0917d;
import t1.C0920g;
import t1.C0921h;
import t1.C0922i;

/* renamed from: s1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0860B implements OnCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final C0873d f7598d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7599e;

    /* renamed from: i, reason: collision with root package name */
    public final C0870a f7600i;

    /* renamed from: l, reason: collision with root package name */
    public final long f7601l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7602m;

    public C0860B(C0873d c0873d, int i2, C0870a c0870a, long j, long j7) {
        this.f7598d = c0873d;
        this.f7599e = i2;
        this.f7600i = c0870a;
        this.f7601l = j;
        this.f7602m = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0917d a(v vVar, com.google.android.gms.common.internal.a aVar, int i2) {
        C0906C c0906c = aVar.f4374A;
        C0917d c0917d = c0906c == null ? null : c0906c.f7900l;
        if (c0917d != null && c0917d.f7926e) {
            int[] iArr = c0917d.f7928l;
            int i5 = 0;
            if (iArr == null) {
                int[] iArr2 = c0917d.f7930n;
                if (iArr2 != null) {
                    while (i5 < iArr2.length) {
                        if (iArr2[i5] == i2) {
                            break;
                        }
                        i5++;
                    }
                }
                if (vVar.f7745p >= c0917d.f7929m) {
                    return c0917d;
                }
            } else {
                while (i5 < iArr.length) {
                    if (iArr[i5] != i2) {
                        i5++;
                    } else if (vVar.f7745p >= c0917d.f7929m) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i2;
        int i5;
        int i7;
        int i8;
        int i9;
        long j;
        long j7;
        C0873d c0873d = this.f7598d;
        if (c0873d.d()) {
            C0922i c0922i = (C0922i) C0921h.a().f7958a;
            if (c0922i == null || c0922i.f7960e) {
                v vVar = (v) c0873d.j.get(this.f7600i);
                if (vVar != null) {
                    InterfaceC0844c interfaceC0844c = vVar.f7736f;
                    if (interfaceC0844c instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) interfaceC0844c;
                        long j8 = this.f7601l;
                        int i10 = 0;
                        boolean z7 = j8 > 0;
                        int i11 = aVar.f4396u;
                        if (c0922i != null) {
                            z7 &= c0922i.f7961i;
                            i2 = c0922i.f7962l;
                            i7 = c0922i.f7963m;
                            i5 = c0922i.f7959d;
                            if (aVar.f4374A != null && !aVar.n()) {
                                C0917d a7 = a(vVar, aVar, this.f7599e);
                                if (a7 == null) {
                                    return;
                                }
                                boolean z8 = a7.f7927i && j8 > 0;
                                i7 = a7.f7929m;
                                z7 = z8;
                            }
                        } else {
                            i2 = 5000;
                            i5 = 0;
                            i7 = 100;
                        }
                        int i12 = i2;
                        int i13 = -1;
                        if (task.isSuccessful()) {
                            i9 = 0;
                        } else if (task.i()) {
                            i10 = -1;
                            i9 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof r1.f) {
                                Status status = ((r1.f) exception).f7438d;
                                i8 = status.f4369d;
                                q1.b bVar = status.f4372l;
                                if (bVar != null) {
                                    i9 = i8;
                                    i10 = bVar.f7311e;
                                }
                            } else {
                                i8 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                            }
                            i9 = i8;
                            i10 = -1;
                        }
                        if (z7) {
                            long j9 = this.f7602m;
                            long currentTimeMillis = System.currentTimeMillis();
                            i13 = (int) (SystemClock.elapsedRealtime() - j9);
                            j7 = currentTimeMillis;
                            j = j8;
                        } else {
                            j = 0;
                            j7 = 0;
                        }
                        C0861C c0861c = new C0861C(new C0920g(this.f7599e, i9, i10, j, j7, null, null, i11, i13), i5, i12, i7);
                        C1.e eVar = c0873d.f7658m;
                        eVar.sendMessage(eVar.obtainMessage(18, c0861c));
                    }
                }
            }
        }
    }
}
