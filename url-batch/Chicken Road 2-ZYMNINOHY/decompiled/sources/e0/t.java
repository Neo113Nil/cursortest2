package e0;

import T.AbstractC0088f;
import T.G;
import T.U;
import W.J;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.tasks.Task;
import d2.C0389g;
import f2.C0419a;
import f2.C0422d;
import g0.C0436d;
import io.appmetrica.analytics.impl.C0583e9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import k.C1218i;
import k.InterfaceC1186J;
import k.InterfaceC1224l;
import m0.C1301n;
import m2.AbstractC1309a;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q0.c0;
import q0.d0;
import q0.j0;
import s0.InterfaceC1408d;
import v2.C;
import v2.C1474v;
import v2.F;
import v2.I;

/* loaded from: classes.dex */
public final class t implements d0.i, c2.h, c0, InterfaceC1186J, j0.m, j1.d, j.o, InterfaceC1224l, u0.p, InterfaceC1408d, t1.n {

    /* renamed from: a, reason: collision with root package name */
    public Object f8416a;

    public /* synthetic */ t(Object obj) {
        this.f8416a = obj;
    }

    public static int E(int i4, int i5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            i6++;
            if (i6 == i5) {
                i7++;
                i6 = 0;
            } else if (i6 > i5) {
                i7++;
                i6 = 1;
            }
        }
        return i6 + 1 > i5 ? i7 + 1 : i7;
    }

    @Override // d0.i
    public long A() {
        return 0L;
    }

    public UUID B() {
        return AbstractC0088f.f2779a;
    }

    @Override // d0.i
    public long C(long j4) {
        return 1L;
    }

    @Override // d0.i
    public long D(long j4, long j5) {
        return 1L;
    }

    public int F() {
        return 1;
    }

    public void G() {
        g0.l lVar = (g0.l) this.f8416a;
        int i4 = lVar.f8901r - 1;
        lVar.f8901r = i4;
        if (i4 > 0) {
            return;
        }
        int i5 = 0;
        for (g0.s sVar : lVar.f8903t) {
            sVar.k();
            i5 += sVar.f8942I.f15034a;
        }
        U[] uArr = new U[i5];
        int i6 = 0;
        for (g0.s sVar2 : lVar.f8903t) {
            sVar2.k();
            int i7 = sVar2.f8942I.f15034a;
            int i8 = 0;
            while (i8 < i7) {
                sVar2.k();
                uArr[i6] = sVar2.f8942I.a(i8);
                i8++;
                i6++;
            }
        }
        lVar.f8902s = new j0(uArr);
        lVar.f8900q.m(lVar);
    }

    public boolean I(String str) {
        return false;
    }

    public Task J(Task task) {
        C0389g c0389g = (C0389g) this.f8416a;
        if (task.c() || ((t2.j) task).f15421d) {
            return task;
        }
        Exception a3 = task.a();
        if (!(a3 instanceof b2.d)) {
            return task;
        }
        int i4 = ((b2.d) a3).f5384a.f5773a;
        if (i4 == 43001 || i4 == 43002 || i4 == 43003 || i4 == 17) {
            l2.e eVar = (l2.e) c0389g.f8265c;
            eVar.getClass();
            t2.d dVar = new t2.d();
            ((ExecutorService) eVar.f14271c).execute(new B.a(eVar, 17, dVar));
            return dVar.f15407a;
        }
        if (i4 == 43000) {
            Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
            t2.j jVar = new t2.j();
            jVar.d(exc);
            return jVar;
        }
        if (i4 != 15) {
            return task;
        }
        Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
        t2.j jVar2 = new t2.j();
        jVar2.d(exc2);
        return jVar2;
    }

    @Override // d0.i
    public long a(long j4) {
        return 0L;
    }

    @Override // c2.h
    public void accept(Object obj, Object obj2) {
        t2.d dVar = (t2.d) obj2;
        C0419a c0419a = (C0419a) ((C0422d) obj).q();
        d2.j jVar = (d2.j) this.f8416a;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c0419a.f5942c);
        int i4 = AbstractC1309a.f14497a;
        if (jVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
        }
        try {
            c0419a.f5941b.transact(1, obtain, null, 1);
            obtain.recycle();
            dVar.f15407a.e(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // j0.m
    public void b(Bundle bundle) {
        ((MediaCodec) this.f8416a).setParameters(bundle);
    }

    @Override // j0.m
    public void c(int i4, Z.b bVar, long j4, int i5) {
        ((MediaCodec) this.f8416a).queueSecureInputBuffer(i4, 0, bVar.f3777i, j4, i5);
    }

    @Override // t1.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) V3.b.j(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8416a).createWebView(webView));
    }

    @Override // j.o
    public void d(j.j jVar, boolean z) {
        if (jVar instanceof j.t) {
            ((j.t) jVar).f13720w.j().c(false);
        }
        j.o oVar = ((C1218i) this.f8416a).f14016e;
        if (oVar != null) {
            oVar.d(jVar, z);
        }
    }

    @Override // j0.m
    public void e(int i4, int i5, long j4, int i6) {
        ((MediaCodec) this.f8416a).queueInputBuffer(i4, 0, i5, j4, i6);
    }

    @Override // d0.i
    public long g(long j4, long j5) {
        return 0L;
    }

    @Override // t1.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) V3.b.j(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8416a).getStatics());
    }

    @Override // d0.i
    public long h(long j4, long j5) {
        return -9223372036854775807L;
    }

    @Override // d0.i
    public j i(long j4) {
        return (j) this.f8416a;
    }

    @Override // k.InterfaceC1186J
    public void j(j.j jVar, j.k kVar) {
        j.g gVar = (j.g) this.f8416a;
        Handler handler = gVar.f13624f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f13626h;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (jVar == ((j.f) arrayList.get(i4)).f13618b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            return;
        }
        int i5 = i4 + 1;
        handler.postAtTime(new j.e(this, i5 < arrayList.size() ? (j.f) arrayList.get(i5) : null, kVar, jVar), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // j1.d
    public void k() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // j1.d
    public void l(int i4, Object obj) {
        String str;
        switch (i4) {
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
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f8416a).setResultCode(i4);
    }

    @Override // k.InterfaceC1186J
    public void n(j.j jVar, MenuItem menuItem) {
        ((j.g) this.f8416a).f13624f.removeCallbacksAndMessages(jVar);
    }

    @Override // t1.n
    public String[] o() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f8416a).getSupportedFeatures();
    }

    @Override // d0.i
    public long p(long j4, long j5) {
        return 0L;
    }

    @Override // j.o
    public boolean r(j.j jVar) {
        C1218i c1218i = (C1218i) this.f8416a;
        if (jVar == null) {
            return false;
        }
        ((j.t) jVar).f13721x.getClass();
        c1218i.getClass();
        j.o oVar = c1218i.f14016e;
        if (oVar != null) {
            return oVar.r(jVar);
        }
        return false;
    }

    @Override // q0.c0
    public void s(d0 d0Var) {
        g0.l lVar = (g0.l) this.f8416a;
        lVar.f8900q.s(lVar);
    }

    @Override // u0.p
    public Object u(Uri uri, Y.j jVar) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.f8416a).newPullParser();
            newPullParser.setInput(jVar, null);
            return (p0.c) new p0.g(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e4) {
            if (e4.getDetail() instanceof IOException) {
                throw ((IOException) e4.getDetail());
            }
            throw G.b(null, e4);
        }
    }

    public void v(String str, String str2) {
        t tVar = (t) this.f8416a;
        String a3 = C1301n.a(str.trim());
        String trim = str2.trim();
        tVar.getClass();
        v2.r.c(a3, trim);
        C1474v c1474v = (C1474v) tVar.f8416a;
        if (c1474v == null) {
            c1474v = C1474v.a();
            tVar.f8416a = c1474v;
        }
        C c4 = (C) c1474v.get(a3);
        if (c4 == null) {
            v2.G g4 = I.f15571b;
            v2.r.d(4, "expectedSize");
            c4 = new F(4);
            C1474v c1474v2 = (C1474v) tVar.f8416a;
            if (c1474v2 == null) {
                c1474v2 = C1474v.a();
                tVar.f8416a = c1474v2;
            }
            c1474v2.put(a3, c4);
        }
        c4.a(trim);
    }

    @Override // d0.i
    public boolean w() {
        return true;
    }

    public void x(List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = (String) list.get(i4);
            String str2 = J.f3263a;
            String[] split = str.split(":\\s?", 2);
            if (split.length == 2) {
                v(split[0], split[1]);
            }
        }
    }

    public Z.a y() {
        return null;
    }

    public f0.c z() {
        return (f0.c) this.f8416a;
    }

    public t(int i4) {
        switch (i4) {
            case 6:
                this.f8416a = new SparseArray();
                return;
            case 14:
                this.f8416a = new SparseIntArray();
                return;
            case 17:
                this.f8416a = new t();
                return;
            case C0583e9.f11743C /* 19 */:
                try {
                    this.f8416a = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e4) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
                }
            case 21:
                this.f8416a = new a2.i(28);
                return;
            case 24:
                this.f8416a = new CopyOnWriteArrayList();
                return;
            default:
                this.f8416a = new C0436d(5, 1.0f, false);
                return;
        }
    }

    public t(String str, String str2, int i4) {
        this(17);
        v("User-Agent", str);
        v("CSeq", String.valueOf(i4));
        if (str2 != null) {
            v("Session", str2);
        }
    }

    @Override // j0.m
    public void flush() {
    }

    @Override // j0.m
    public void q() {
    }

    @Override // j0.m
    public void shutdown() {
    }

    @Override // j0.m
    public void start() {
    }

    public void H(f0.e eVar) {
    }

    public void t(f0.e eVar) {
    }

    @Override // d0.i
    public long f(long j4, long j5) {
        return j5;
    }
}
