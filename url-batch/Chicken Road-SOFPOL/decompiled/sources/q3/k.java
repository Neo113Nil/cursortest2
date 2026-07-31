package q3;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import r.s1;
import r.u1;
import r.v1;
import w1.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class k implements v1, u4.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6118d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6119e;

    public /* synthetic */ k(int i, Object obj) {
        this.f6118d = i;
        this.f6119e = obj;
    }

    public static int j(int i, int i8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i9++;
            if (i9 == i8) {
                i10++;
                i9 = 0;
            } else if (i9 > i8) {
                i10++;
                i9 = 1;
            }
        }
        return i9 + 1 > i8 ? i10 + 1 : i10;
    }

    public static a0.m0 r(k kVar, int i) {
        z.p pVar = (z.p) kVar.f6119e;
        w0.f e8 = w0.q.e();
        p6.c e9 = e8 != null ? e8.e() : null;
        w0.f h8 = w0.q.h(e8);
        try {
            z.k kVar2 = (z.k) pVar.f9082f.getValue();
            w0.q.k(e8, h8, e9);
            a0.n0 n0Var = pVar.f9091p;
            long j7 = kVar2.f9048j;
            boolean z3 = pVar.f9080d;
            s1 s1Var = new s1(i, kVar2);
            a0.f1 f1Var = n0Var.f119c;
            if (f1Var == null) {
                return a0.i.f90a;
            }
            a0.g1 g1Var = n0Var.f118b;
            a0.h1 h1Var = (a0.h1) f1Var.f81d;
            boolean z7 = h1Var instanceof a0.c;
            a0.e1 e1Var = new a0.e1(f1Var, i, g1Var, s1Var);
            e1Var.f60d = new r2.a(j7);
            if (!z7) {
                h1Var.a(e1Var);
            } else if (z3) {
                a0.c cVar = (a0.c) h1Var;
                cVar.f27e.add(new a0.k1(1, e1Var));
                if (!cVar.f28f) {
                    cVar.f28f = true;
                    cVar.f26d.post(cVar);
                }
            } else {
                a0.c cVar2 = (a0.c) h1Var;
                cVar2.f27e.add(new a0.k1(0, e1Var));
                if (!cVar2.f28f) {
                    cVar2.f28f = true;
                    cVar2.f26d.post(cVar2);
                }
            }
            r2.o.s0("compose:lazy:schedule_prefetch:index", i);
            return e1Var;
        } catch (Throwable th) {
            w0.q.k(e8, h8, e9);
            throw th;
        }
    }

    @Override // r.v1, r.t1
    public boolean a() {
        ((c5.x) this.f6119e).getClass();
        return false;
    }

    @Override // u4.d
    public void b() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // u4.d
    public void c(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case x.v0.f8304b /* 9 */:
            default:
                str = "";
                break;
            case x.v0.f8306d /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6119e).setResultCode(i);
    }

    public void d(w1.f0 f0Var) {
        if (!f0Var.G()) {
            t1.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((t1) this.f6119e).add(f0Var);
    }

    public r3.f f(int i) {
        return null;
    }

    public r3.f g(int i) {
        return null;
    }

    public r.w h(int i) {
        switch (this.f6118d) {
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((r.x[]) this.f6119e)[i];
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return (r.x) this.f6119e;
            default:
                return (r.w) this.f6119e;
        }
    }

    public y3.s0 i() {
        return (y3.s0) ((d7.n0) this.f6119e).getValue();
    }

    @Override // r.t1
    public r.p k(long j7, r.p pVar, r.p pVar2, r.p pVar3) {
        return ((c5.x) this.f6119e).k(j7, pVar, pVar2, pVar3);
    }

    @Override // r.t1
    public r.p l(long j7, r.p pVar, r.p pVar2, r.p pVar3) {
        return ((c5.x) this.f6119e).l(j7, pVar, pVar2, pVar3);
    }

    @Override // r.t1
    public long m(r.p pVar, r.p pVar2, r.p pVar3) {
        return ((c5.x) this.f6119e).m(pVar, pVar2, pVar3);
    }

    public void n(View view, int i, boolean z3) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f6119e).notifyViewVisibilityChanged(view, i, z3);
        }
    }

    @Override // r.t1
    public r.p o(r.p pVar, r.p pVar2, r.p pVar3) {
        return ((c5.x) this.f6119e).o(pVar, pVar2, pVar3);
    }

    public boolean p(int i, int i8, Bundle bundle) {
        return false;
    }

    public boolean q(w1.f0 f0Var) {
        if (!f0Var.G()) {
            t1.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((t1) this.f6119e).remove(f0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r6.f8939a > ((y3.c) r2).f8939a) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(y3.s0 s0Var) {
        Object value;
        Object obj;
        q6.i.e(s0Var, "newState");
        d7.n0 n0Var = (d7.n0) this.f6119e;
        do {
            value = n0Var.getValue();
            obj = (y3.s0) value;
            if (!(obj instanceof y3.n0) && !q6.i.a(obj, y3.t0.f8943b)) {
                if (!(obj instanceof y3.c)) {
                    if (!(obj instanceof y3.k0)) {
                        if (!(obj instanceof y3.m0)) {
                            throw new a5.c();
                        }
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                }
                Object obj2 = e7.c.f2544b;
                if (value == null) {
                    value = obj2;
                }
                if (obj == null) {
                    obj = obj2;
                }
            }
            obj = s0Var;
            Object obj22 = e7.c.f2544b;
            if (value == null) {
            }
            if (obj == null) {
            }
        } while (!n0Var.j(value, obj));
    }

    public String toString() {
        switch (this.f6118d) {
            case 13:
                return ((t1) this.f6119e).toString();
            default:
                return super.toString();
        }
    }

    public k(v0.c cVar) {
        this.f6118d = 1;
        this.f6119e = new WeakReference(cVar);
    }

    public k(Runnable runnable) {
        this.f6118d = 0;
        this.f6119e = new CopyOnWriteArrayList();
        new HashMap();
    }

    public k(int i) {
        this.f6118d = i;
        switch (i) {
            case 13:
                this.f6119e = new t1(w1.f.f7638b);
                break;
            case 14:
                this.f6119e = new SparseIntArray();
                new SparseIntArray();
                break;
            case x.v0.f8308f /* 15 */:
                break;
            case 16:
                this.f6119e = new AtomicInteger(0);
                break;
            case 17:
                this.f6119e = d7.e0.b(y3.t0.f8943b);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f6119e = new r3.h(this);
                    break;
                } else {
                    this.f6119e = new r3.g(this);
                    break;
                }
        }
    }

    public k(long[] jArr) {
        o.z zVar;
        this.f6118d = 12;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            zVar = new o.z(copyOf.length);
            int i = zVar.f5570b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = zVar.f5569a;
                    if (jArr2.length < length) {
                        long[] copyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        q6.i.d(copyOf2, "copyOf(...)");
                        zVar.f5569a = copyOf2;
                    }
                    long[] jArr3 = zVar.f5569a;
                    int i8 = zVar.f5570b;
                    if (i != i8) {
                        d6.l.G(jArr3, jArr3, copyOf.length + i, i, i8);
                    }
                    d6.l.G(copyOf, jArr3, i, 0, copyOf.length);
                    zVar.f5570b += copyOf.length;
                }
            } else {
                p.a.d("");
                throw null;
            }
        } else {
            zVar = new o.z(16);
        }
        this.f6119e = zVar;
    }

    public k(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f6118d = 8;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f6119e = new s3.f(uri, clipDescription, uri2);
        } else {
            this.f6119e = new a0.g1(uri, clipDescription, uri2, 9);
        }
    }

    public k(float f6, float f8, r.p pVar) {
        k kVar;
        this.f6118d = 5;
        int i = u1.f6442a;
        if (pVar != null) {
            kVar = new k(pVar, f6, f8);
        } else {
            kVar = new k(f6, f8);
        }
        this.f6119e = new c5.x(kVar);
    }

    public k(r.p pVar, float f6, float f8) {
        this.f6118d = 2;
        int b8 = pVar.b();
        r.x[] xVarArr = new r.x[b8];
        for (int i = 0; i < b8; i++) {
            xVarArr[i] = new r.x(f6, f8, pVar.a(i));
        }
        this.f6119e = xVarArr;
    }

    public k(float f6, float f8) {
        this.f6118d = 3;
        this.f6119e = new r.x(f6, f8, 0.01f);
    }

    public void e(int i, r3.f fVar, String str, Bundle bundle) {
    }
}
