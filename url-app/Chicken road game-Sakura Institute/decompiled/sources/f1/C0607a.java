package f1;

import G.W0;
import Z2.InterfaceC0330f;
import a3.AbstractC0425c;
import android.os.Parcel;
import android.util.Log;
import android.view.KeyEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.appsflyer.attribution.RequestError;
import g2.C0638a;
import g2.C0639b;
import j.AbstractC0705a;
import j0.C0706a;
import j1.C0709c;
import j2.AbstractC0720j;
import j2.InterfaceC0714d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k.C0734J;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l.AbstractC0792s;
import l.C0757B;
import l.InterfaceC0756A;
import l.InterfaceC0793t;
import l.z0;
import l2.C0823c;
import m2.InterfaceC0860b;
import m2.InterfaceC0861c;
import o2.C0924c;
import q.AbstractC1024c;
import s0.C1166s;
import u1.InterfaceC1220d;
import w.InterfaceC1260I;
import y2.C1338m;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607a implements InterfaceC0714d, InterfaceC0615i, InterfaceC0793t, z0, InterfaceC0861c, InterfaceC1220d, InterfaceC1260I {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6560d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6561e;

    public /* synthetic */ C0607a(int i2, Object obj) {
        this.f6560d = i2;
        this.f6561e = obj;
    }

    @Override // l.z0, l.x0
    public boolean a() {
        ((Y0.b) this.f6561e).getClass();
        return false;
    }

    @Override // l.x0
    public long b(AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        return ((Y0.b) this.f6561e).b(abstractC0792s, abstractC0792s2, abstractC0792s3);
    }

    @Override // l.x0
    public AbstractC0792s c(AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        return ((Y0.b) this.f6561e).c(abstractC0792s, abstractC0792s2, abstractC0792s3);
    }

    @Override // f1.InterfaceC0615i
    public Object d(Function2 function2, E2.c cVar) {
        return ((InterfaceC0615i) this.f6561e).d(new C0709c(function2, null), cVar);
    }

    @Override // u1.InterfaceC1220d
    public void e(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case AbstractC1024c.f9242c /* 9 */:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6561e).setResultCode(i2);
    }

    @Override // l.x0
    public AbstractC0792s f(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        return ((Y0.b) this.f6561e).f(j4, abstractC0792s, abstractC0792s2, abstractC0792s3);
    }

    @Override // l.x0
    public AbstractC0792s g(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        return ((Y0.b) this.f6561e).g(j4, abstractC0792s, abstractC0792s2, abstractC0792s3);
    }

    @Override // l.InterfaceC0793t
    public InterfaceC0756A get(int i2) {
        switch (this.f6560d) {
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                return (C0757B) this.f6561e;
            default:
                return (InterfaceC0756A) this.f6561e;
        }
    }

    @Override // m2.InterfaceC0861c
    public o2.l getIndex() {
        return (o2.l) this.f6561e;
    }

    @Override // u1.InterfaceC1220d
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // m2.InterfaceC0861c
    public C0607a j() {
        return this;
    }

    @Override // j2.InterfaceC0714d
    public Object k(g2.e eVar, Object obj, Object obj2) {
        switch (this.f6560d) {
            case 2:
                return ((C0639b) obj2).e(((g2.e) this.f6561e).h(eVar), (o2.s) obj);
            default:
                g2.l lVar = (g2.l) obj;
                boolean isEmpty = eVar.isEmpty();
                g2.s sVar = (g2.s) this.f6561e;
                if (!isEmpty && lVar.f()) {
                    l2.i iVar = lVar.d().f7986a;
                    g2.g gVar = (g2.g) sVar.f6756f;
                    l2.i n2 = g2.s.n(iVar);
                    sVar.p(iVar);
                    gVar.b(n2);
                    return null;
                }
                Iterator it = lVar.e().iterator();
                while (it.hasNext()) {
                    l2.i iVar2 = ((l2.j) it.next()).f7986a;
                    g2.g gVar2 = (g2.g) sVar.f6756f;
                    l2.i n4 = g2.s.n(iVar2);
                    sVar.p(iVar2);
                    gVar2.b(n4);
                }
                return null;
        }
    }

    @Override // m2.InterfaceC0861c
    public o2.m l(o2.m mVar, C0924c c0924c, o2.s sVar, g2.e eVar, InterfaceC0860b interfaceC0860b, C0638a c0638a) {
        AbstractC0720j.b("The index must match the filter", mVar.f8943i == ((o2.l) this.f6561e));
        o2.s sVar2 = mVar.f8941d;
        o2.s b4 = sVar2.b(c0924c);
        if (b4.p(eVar).equals(sVar.p(eVar)) && b4.isEmpty() == sVar.isEmpty()) {
            return mVar;
        }
        if (c0638a != null) {
            boolean isEmpty = sVar.isEmpty();
            o2.t tVar = o2.t.f8953a;
            if (isEmpty) {
                if (sVar2.i(c0924c)) {
                    c0638a.a(new C0823c(1, new o2.m(b4, tVar), c0924c, null));
                } else {
                    AbstractC0720j.b("A child remove without an old child only makes sense on a leaf node", sVar2.y());
                }
            } else if (b4.isEmpty()) {
                c0638a.a(new C0823c(2, new o2.m(sVar, tVar), c0924c, null));
            } else {
                c0638a.a(new C0823c(4, new o2.m(sVar, tVar), c0924c, new o2.m(b4, tVar)));
            }
        }
        return (sVar2.y() && sVar.isEmpty()) ? mVar : mVar.h(c0924c, sVar);
    }

    @Override // m2.InterfaceC0861c
    public o2.m m(o2.m mVar, o2.m mVar2, C0638a c0638a) {
        o2.t tVar;
        o2.s<o2.q> sVar;
        AbstractC0720j.b("Can't use IndexedNode that doesn't have filter's index", mVar2.f8943i == ((o2.l) this.f6561e));
        if (c0638a != null) {
            Iterator it = mVar.f8941d.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                tVar = o2.t.f8953a;
                sVar = mVar2.f8941d;
                if (!hasNext) {
                    break;
                }
                o2.q qVar = (o2.q) it.next();
                if (!sVar.i(qVar.f8950a)) {
                    c0638a.a(new C0823c(1, new o2.m(qVar.f8951b, tVar), qVar.f8950a, null));
                }
            }
            if (!sVar.y()) {
                for (o2.q qVar2 : sVar) {
                    C0924c c0924c = qVar2.f8950a;
                    o2.s sVar2 = mVar.f8941d;
                    boolean i2 = sVar2.i(c0924c);
                    o2.s sVar3 = qVar2.f8951b;
                    C0924c c0924c2 = qVar2.f8950a;
                    if (i2) {
                        o2.s b4 = sVar2.b(c0924c2);
                        if (!b4.equals(sVar3)) {
                            c0638a.a(new C0823c(4, new o2.m(sVar3, tVar), c0924c2, new o2.m(b4, tVar)));
                        }
                    } else {
                        c0638a.a(new C0823c(2, new o2.m(sVar3, tVar), c0924c2, null));
                    }
                }
            }
        }
        return mVar2;
    }

    @Override // f1.InterfaceC0615i
    public InterfaceC0330f n() {
        return ((InterfaceC0615i) this.f6561e).n();
    }

    @Override // m2.InterfaceC0861c
    public o2.m o(o2.m mVar, o2.s sVar) {
        return mVar.f8941d.isEmpty() ? mVar : new o2.m(mVar.f8941d.f(sVar), mVar.f8943i, mVar.f8942e);
    }

    @Override // m2.InterfaceC0861c
    public boolean p() {
        return false;
    }

    @Override // w.InterfaceC1260I
    public int r(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
            long d4 = u3.d.d(keyEvent.getKeyCode());
            if (C0706a.a(d4, w.W.f11102i)) {
                i2 = 35;
            } else if (C0706a.a(d4, w.W.f11103j)) {
                i2 = 36;
            } else if (C0706a.a(d4, w.W.f11104k)) {
                i2 = 38;
            } else if (C0706a.a(d4, w.W.f11105l)) {
                i2 = 37;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long d5 = u3.d.d(keyEvent.getKeyCode());
            if (C0706a.a(d5, w.W.f11102i)) {
                i2 = 4;
            } else if (C0706a.a(d5, w.W.f11103j)) {
                i2 = 3;
            } else if (C0706a.a(d5, w.W.f11104k)) {
                i2 = 6;
            } else if (C0706a.a(d5, w.W.f11105l)) {
                i2 = 5;
            } else if (C0706a.a(d5, w.W.f11096c)) {
                i2 = 20;
            } else if (C0706a.a(d5, w.W.f11113t)) {
                i2 = 23;
            } else if (C0706a.a(d5, w.W.f11112s)) {
                i2 = 22;
            } else if (C0706a.a(d5, w.W.f11101h)) {
                i2 = 43;
            }
        } else if (keyEvent.isShiftPressed()) {
            long d6 = u3.d.d(keyEvent.getKeyCode());
            if (C0706a.a(d6, w.W.f11108o)) {
                i2 = 41;
            } else if (C0706a.a(d6, w.W.f11109p)) {
                i2 = 42;
            }
        } else if (keyEvent.isAltPressed()) {
            long d7 = u3.d.d(keyEvent.getKeyCode());
            if (C0706a.a(d7, w.W.f11112s)) {
                i2 = 24;
            } else if (C0706a.a(d7, w.W.f11113t)) {
                i2 = 25;
            }
        }
        return i2 == 0 ? ((w.J) this.f6561e).r(keyEvent) : i2;
    }

    public void s(byte b4) {
        ((Parcel) this.f6561e).writeByte(b4);
    }

    public void t(float f4) {
        ((Parcel) this.f6561e).writeFloat(f4);
    }

    public void u(long j4) {
        long b4 = M0.m.b(j4);
        byte b5 = 0;
        if (!M0.n.a(b4, 0L)) {
            if (M0.n.a(b4, 4294967296L)) {
                b5 = 1;
            } else if (M0.n.a(b4, 8589934592L)) {
                b5 = 2;
            }
        }
        s(b5);
        if (M0.n.a(M0.m.b(j4), 0L)) {
            return;
        }
        t(M0.m.c(j4));
    }

    public Object v(SerialDescriptor descriptor) {
        k3.i key = k3.h.f7440a;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) ((ConcurrentHashMap) this.f6561e).get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public Y w() {
        return (Y) ((Z2.S) this.f6561e).getValue();
    }

    public y.t x(y.t tVar, C1166s c1166s) {
        Object obj;
        boolean z4;
        long j4;
        long j5;
        int i2;
        ArrayList arrayList = (ArrayList) tVar.f11494e;
        i.m mVar = new i.m(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            l0.u uVar = (l0.u) arrayList.get(i4);
            long j6 = uVar.f7939a;
            i.m mVar2 = (i.m) this.f6561e;
            int b4 = AbstractC0705a.b(mVar2.f6926e, mVar2.f6928j, j6);
            Object obj2 = i.n.f6929a;
            if (b4 < 0 || (obj = mVar2.f6927i[b4]) == obj2) {
                obj = null;
            }
            l0.t tVar2 = (l0.t) obj;
            if (tVar2 == null) {
                j5 = uVar.f7940b;
                j4 = uVar.f7942d;
                z4 = false;
            } else {
                long D3 = c1166s.D(tVar2.f7937b);
                long j7 = tVar2.f7936a;
                z4 = tVar2.f7938c;
                j4 = D3;
                j5 = j7;
            }
            ArrayList arrayList2 = uVar.f7947i;
            long j8 = uVar.f7948j;
            long j9 = uVar.f7949k;
            long j10 = uVar.f7939a;
            mVar.b(j10, new l0.s(j10, uVar.f7940b, uVar.f7942d, uVar.f7943e, uVar.f7944f, j5, j4, z4, uVar.f7945g, arrayList2, j8, j9));
            long j11 = uVar.f7939a;
            boolean z5 = uVar.f7943e;
            if (z5) {
                i2 = i4;
                mVar2.b(j11, new l0.t(uVar.f7940b, uVar.f7941c, z5));
            } else {
                i2 = i4;
                int b5 = AbstractC0705a.b(mVar2.f6926e, mVar2.f6928j, j11);
                if (b5 >= 0) {
                    Object[] objArr = mVar2.f6927i;
                    if (objArr[b5] != obj2) {
                        objArr[b5] = obj2;
                        mVar2.f6925d = true;
                    }
                }
            }
            i4 = i2 + 1;
        }
        return new y.t(mVar, 27, tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.f6557a > r2.f6557a) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r3v4, types: [b3.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(Y newState) {
        Z2.S s4;
        Object value;
        Y y4;
        Intrinsics.checkNotNullParameter(newState, "newState");
        do {
            s4 = (Z2.S) this.f6561e;
            value = s4.getValue();
            y4 = (Y) value;
            if (!(y4 instanceof Q ? true : Intrinsics.a(y4, a0.f6562b))) {
                if (!(y4 instanceof C0610d)) {
                    if (!(y4 instanceof O)) {
                        throw new C1338m();
                    }
                }
                ?? r32 = AbstractC0425c.f4947b;
                if (value == null) {
                    value = r32;
                }
                if (y4 == null) {
                    y4 = r32;
                }
            }
            y4 = newState;
            ?? r322 = AbstractC0425c.f4947b;
            if (value == null) {
            }
            if (y4 == null) {
            }
        } while (!s4.l(value, y4));
    }

    public /* synthetic */ C0607a(int i2, boolean z4) {
        this.f6560d = i2;
    }

    public C0607a(M0.b bVar) {
        this.f6560d = 6;
        this.f6561e = new C0734J(k.N.f7267a, bVar);
    }

    public C0607a(int i2) {
        this.f6560d = i2;
        switch (i2) {
            case 1:
                this.f6561e = Z2.H.c(a0.f6562b);
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f6561e = new ConcurrentHashMap(16);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                this.f6561e = new i.m(10);
                break;
            case 13:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
                q3.j delegate = new q3.j(p3.d.f9128h, timeUnit);
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                this.f6561e = delegate;
                break;
            case AbstractC1024c.f9246g /* 15 */:
                this.f6561e = new LinkedHashSet();
                break;
            default:
                this.f6561e = new AtomicInteger(0);
                break;
        }
    }

    public C0607a(InterfaceC0615i delegate) {
        this.f6560d = 5;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6561e = delegate;
    }

    public C0607a(n3.a threadFactory) {
        this.f6560d = 14;
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.f6561e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public C0607a(float f4, float f5, AbstractC0792s abstractC0792s) {
        Object c0607a;
        this.f6560d = 10;
        if (abstractC0792s != null) {
            c0607a = new W0(f4, f5, abstractC0792s);
        } else {
            c0607a = new C0607a(f4, f5);
        }
        this.f6561e = new Y0.b(5, c0607a);
    }

    public C0607a(float f4, float f5) {
        this.f6560d = 8;
        this.f6561e = new C0757B(f4, f5, 0.01f);
    }
}
