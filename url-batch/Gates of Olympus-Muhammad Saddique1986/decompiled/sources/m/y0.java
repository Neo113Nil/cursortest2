package m;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import android.view.KeyEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import j.AbstractC0539m;
import j.C0538l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.AbstractC0561a;
import l0.C0591a;
import m.y0;
import m1.InterfaceC0650h;
import m1.ThreadFactoryC0643a;
import r.AbstractC0856c;
import u0.C1123s;
import v1.InterfaceC1161c;
import z.C1256t;

/* loaded from: classes.dex */
public final class y0 implements InterfaceC0633s, x0, InterfaceC0650h, InterfaceC1161c, x.J {

    /* renamed from: d, reason: collision with root package name */
    public Object f6913d;

    public /* synthetic */ y0(Object obj) {
        this.f6913d = obj;
    }

    @Override // m.x0, m.w0
    public boolean a() {
        ((G1.g) this.f6913d).getClass();
        return false;
    }

    @Override // m1.InterfaceC0650h
    public void b(final O2.l lVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0643a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: m1.k
            @Override // java.lang.Runnable
            public final void run() {
                y0 y0Var = y0.this;
                O2.l lVar2 = lVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                y0Var.getClass();
                try {
                    s F3 = O2.d.F((Context) y0Var.f6913d);
                    if (F3 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) F3.f6976a;
                    synchronized (rVar.f6970g) {
                        rVar.f6972i = threadPoolExecutor2;
                    }
                    F3.f6976a.b(new l(lVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    lVar2.o0(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // v1.InterfaceC1161c
    public void c(int i3, Serializable serializable) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case AbstractC0856c.f8037c /* 9 */:
            default:
                str = "";
                break;
            case AbstractC0856c.f8039e /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6913d).setResultCode(i3);
    }

    @Override // m.w0
    public r d(long j3, r rVar, r rVar2, r rVar3) {
        return ((G1.g) this.f6913d).d(j3, rVar, rVar2, rVar3);
    }

    @Override // v1.InterfaceC1161c
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // m.w0
    public r f(long j3, r rVar, r rVar2, r rVar3) {
        return ((G1.g) this.f6913d).f(j3, rVar, rVar2, rVar3);
    }

    @Override // m.w0
    public long g(r rVar, r rVar2, r rVar3) {
        return ((G1.g) this.f6913d).g(rVar, rVar2, rVar3);
    }

    @Override // m.InterfaceC0633s
    public InterfaceC0605A get(int i3) {
        return (InterfaceC0605A) this.f6913d;
    }

    @Override // m.w0
    public r h(r rVar, r rVar2, r rVar3) {
        return ((G1.g) this.f6913d).h(rVar, rVar2, rVar3);
    }

    @Override // x.J
    public int i(KeyEvent keyEvent) {
        int i3 = 0;
        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
            long d3 = l0.c.d(keyEvent.getKeyCode());
            if (C0591a.a(d3, x.X.f10023i)) {
                i3 = 35;
            } else if (C0591a.a(d3, x.X.f10024j)) {
                i3 = 36;
            } else if (C0591a.a(d3, x.X.f10025k)) {
                i3 = 38;
            } else if (C0591a.a(d3, x.X.f10026l)) {
                i3 = 37;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long d4 = l0.c.d(keyEvent.getKeyCode());
            if (C0591a.a(d4, x.X.f10023i)) {
                i3 = 4;
            } else if (C0591a.a(d4, x.X.f10024j)) {
                i3 = 3;
            } else if (C0591a.a(d4, x.X.f10025k)) {
                i3 = 6;
            } else if (C0591a.a(d4, x.X.f10026l)) {
                i3 = 5;
            } else if (C0591a.a(d4, x.X.f10017c)) {
                i3 = 20;
            } else if (C0591a.a(d4, x.X.f10034t)) {
                i3 = 23;
            } else if (C0591a.a(d4, x.X.f10033s)) {
                i3 = 22;
            } else if (C0591a.a(d4, x.X.f10022h)) {
                i3 = 43;
            }
        } else if (keyEvent.isShiftPressed()) {
            long d5 = l0.c.d(keyEvent.getKeyCode());
            if (C0591a.a(d5, x.X.f10029o)) {
                i3 = 41;
            } else if (C0591a.a(d5, x.X.f10030p)) {
                i3 = 42;
            }
        } else if (keyEvent.isAltPressed()) {
            long d6 = l0.c.d(keyEvent.getKeyCode());
            if (C0591a.a(d6, x.X.f10033s)) {
                i3 = 24;
            } else if (C0591a.a(d6, x.X.f10034t)) {
                i3 = 25;
            }
        }
        return i3 == 0 ? ((x.K) this.f6913d).i(keyEvent) : i3;
    }

    public void j(byte b3) {
        ((Parcel) this.f6913d).writeByte(b3);
    }

    public void k(float f3) {
        ((Parcel) this.f6913d).writeFloat(f3);
    }

    public void l(long j3) {
        long b3 = O0.m.b(j3);
        byte b4 = 0;
        if (!O0.n.a(b3, 0L)) {
            if (O0.n.a(b3, 4294967296L)) {
                b4 = 1;
            } else if (O0.n.a(b3, 8589934592L)) {
                b4 = 2;
            }
        }
        j(b4);
        if (O0.n.a(O0.m.b(j3), 0L)) {
            return;
        }
        k(O0.m.c(j3));
    }

    public C1256t m(C1256t c1256t, C1123s c1123s) {
        Object obj;
        boolean z3;
        long j3;
        long j4;
        int i3;
        ArrayList arrayList = (ArrayList) c1256t.f10466e;
        C0538l c0538l = new C0538l(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            n0.u uVar = (n0.u) arrayList.get(i4);
            long j5 = uVar.f7324a;
            C0538l c0538l2 = (C0538l) this.f6913d;
            int b3 = AbstractC0561a.b(c0538l2.f6288e, c0538l2.f6290g, j5);
            Object obj2 = AbstractC0539m.f6291a;
            if (b3 < 0 || (obj = c0538l2.f6289f[b3]) == obj2) {
                obj = null;
            }
            n0.t tVar = (n0.t) obj;
            if (tVar == null) {
                j4 = uVar.f7325b;
                j3 = uVar.f7327d;
                z3 = false;
            } else {
                long E3 = c1123s.E(tVar.f7322b);
                long j6 = tVar.f7321a;
                z3 = tVar.f7323c;
                j3 = E3;
                j4 = j6;
            }
            ArrayList arrayList2 = uVar.f7332i;
            long j7 = uVar.f7333j;
            long j8 = uVar.f7334k;
            long j9 = uVar.f7324a;
            c0538l.b(j9, new n0.s(j9, uVar.f7325b, uVar.f7327d, uVar.f7328e, uVar.f7329f, j4, j3, z3, uVar.f7330g, arrayList2, j7, j8));
            long j10 = uVar.f7324a;
            boolean z4 = uVar.f7328e;
            if (z4) {
                i3 = i4;
                c0538l2.b(j10, new n0.t(uVar.f7325b, uVar.f7326c, z4));
            } else {
                i3 = i4;
                int b4 = AbstractC0561a.b(c0538l2.f6288e, c0538l2.f6290g, j10);
                if (b4 >= 0) {
                    Object[] objArr = c0538l2.f6289f;
                    if (objArr[b4] != obj2) {
                        objArr[b4] = obj2;
                        c0538l2.f6287d = true;
                    }
                }
            }
            i4 = i3 + 1;
        }
        return new C1256t(c0538l, 9, c1256t);
    }

    public y0(int i3) {
        switch (i3) {
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f6913d = new LinkedHashMap();
                break;
            default:
                this.f6913d = new C0538l(10);
                break;
        }
    }

    public y0(float f3, float f4, r rVar) {
        InterfaceC0633s interfaceC0633s;
        if (rVar != null) {
            interfaceC0633s = new G2.k(f3, f4, rVar);
        } else {
            B.Y y3 = new B.Y();
            y3.f334d = new C0606B(f3, f4, 0.01f);
            interfaceC0633s = y3;
        }
        this.f6913d = new G1.g(6, interfaceC0633s);
    }
}
