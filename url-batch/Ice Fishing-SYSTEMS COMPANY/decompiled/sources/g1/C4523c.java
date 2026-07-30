package g1;

import B1.k;
import B2.BinderC0278l;
import C3.e;
import D.y;
import K0.l;
import O.C0344f;
import O.C0357t;
import O.InterfaceC0338c;
import O.X;
import P.u;
import S0.i;
import a2.C0425d;
import a7.C0433a;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.K;
import androidx.fragment.app.N;
import androidx.recyclerview.widget.RecyclerView;
import b2.InterfaceC0525b;
import b6.C0530a;
import c7.m;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.LD;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.icefishing.icefishingliveapp.AgeSelection;
import com.icefishing.icefishingliveapp.GameCategoriesActivity;
import com.icefishing.icefishingliveapp.MainActivity;
import com.icefishing.icefishingliveapp.ViewOnClickListenerC4412a;
import com.icefishing.icefishingliveapp.ViewOnClickListenerC4415d;
import com.icefishing.icefishingliveapp.q;
import com.icefishing.icefishingliveapp.w;
import e.InterfaceC4463b;
import f7.EnumC4517b;
import i6.n;
import i6.t;
import i7.C4585a;
import j7.AbstractC4610a;
import j7.C4612c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import k4.InterfaceC4657l;
import k7.C4660a;
import k7.C4663d;
import m.W;
import p2.j;
import q2.r;
import q7.v;
import t0.AbstractC5019C;
import t0.AbstractC5032P;
import t0.C5020D;
import t0.C5045h;
import t0.Y;
import t2.C;
import u.AbstractC5088e;
import u8.f;
import u8.h;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4523c implements k, LD, InterfaceC0338c, R7.b, InterfaceC0525b, InterfaceC4463b, n, InterfaceC4657l, u, W, Y {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37855n;

    /* renamed from: u, reason: collision with root package name */
    public Object f37856u;

    public /* synthetic */ C4523c(int i) {
        this.f37855n = i;
    }

    public static String r(String str, EnumC4522b enumC4522b, boolean z8) {
        String str2 = enumC4522b.f37854n;
        if (z8) {
            str2 = ".temp".concat(str2);
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b9 : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b9)));
                }
                replaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return y.k("lottie_cache_", replaceAll, str2);
    }

    @Override // t0.Y
    public int A(View view) {
        C5020D c5020d = (C5020D) view.getLayoutParams();
        ((AbstractC5019C) this.f37856u).getClass();
        return view.getRight() + ((C5020D) view.getLayoutParams()).f40577b.right + ((ViewGroup.MarginLayoutParams) c5020d).rightMargin;
    }

    public void B(AbstractC5032P abstractC5032P, C0357t c0357t, C0357t c0357t2) {
        boolean z8;
        RecyclerView recyclerView = (RecyclerView) this.f37856u;
        recyclerView.f5376u.j(abstractC5032P);
        recyclerView.f(abstractC5032P);
        abstractC5032P.n(false);
        C5045h c5045h = (C5045h) recyclerView.f5372q0;
        c5045h.getClass();
        int i = c0357t.f2319a;
        int i4 = c0357t.f2320b;
        View view = abstractC5032P.f40615a;
        int left = c0357t2 == null ? view.getLeft() : c0357t2.f2319a;
        int top = c0357t2 == null ? view.getTop() : c0357t2.f2320b;
        if (abstractC5032P.h() || (i == left && i4 == top)) {
            c5045h.l(abstractC5032P);
            c5045h.f40702h.add(abstractC5032P);
            z8 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z8 = c5045h.g(abstractC5032P, i, i4, left, top);
        }
        if (z8) {
            recyclerView.S();
        }
    }

    public void C(h value) {
        kotlin.jvm.internal.h.e(value, "value");
        ((f) this.f37856u).v(value);
    }

    public void D(int i, Y5.d fieldEncoding) {
        kotlin.jvm.internal.h.e(fieldEncoding, "fieldEncoding");
        F((i << 3) | fieldEncoding.f3988n);
    }

    public File E(String str, InputStream inputStream, EnumC4522b enumC4522b) {
        File file = new File(w(), r(str, enumC4522b, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public void F(int i) {
        while (true) {
            int i4 = i & (-128);
            f fVar = (f) this.f37856u;
            if (i4 == 0) {
                fVar.t(i);
                return;
            } else {
                fVar.t((i & com.anythink.expressad.video.module.a.a.f21886R) | 128);
                i >>>= 7;
            }
        }
    }

    public void G(long j9) {
        while (true) {
            long j10 = (-128) & j9;
            f fVar = (f) this.f37856u;
            if (j10 == 0) {
                fVar.t((int) j9);
                return;
            } else {
                fVar.t((((int) j9) & com.anythink.expressad.video.module.a.a.f21886R) | 128);
                j9 >>>= 7;
            }
        }
    }

    @Override // k4.InterfaceC4657l
    public void OnCall() {
        switch (this.f37855n) {
            case 18:
                ViewOnClickListenerC4412a viewOnClickListenerC4412a = (ViewOnClickListenerC4412a) this.f37856u;
                viewOnClickListenerC4412a.f37061u.startActivity(new Intent(viewOnClickListenerC4412a.f37061u, (Class<?>) GameCategoriesActivity.class));
                break;
            case 19:
                ViewOnClickListenerC4415d viewOnClickListenerC4415d = (ViewOnClickListenerC4415d) this.f37856u;
                viewOnClickListenerC4415d.f37069u.startActivity(new Intent(viewOnClickListenerC4415d.f37069u, (Class<?>) AgeSelection.class));
                break;
            case 20:
                q qVar = (q) this.f37856u;
                qVar.f37095v.f36969v.stopLoading();
                qVar.f37095v.f36969v.destroy();
                qVar.f37095v.f36969v.removeAllViews();
                qVar.f37094u.dismiss();
                qVar.f37095v.finish();
                break;
            default:
                MainActivity mainActivity = ((w) this.f37856u).f37107u.f37110c;
                mainActivity.startActivity(mainActivity.f37005S);
                break;
        }
    }

    @Override // i6.n
    public n a() {
        ((m) this.f37856u).f5721d = "The number of items queued";
        return this;
    }

    @Override // i6.n
    public n b() {
        ((m) this.f37856u).f5722e = "1";
        return this;
    }

    @Override // O.InterfaceC0338c
    public C0344f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f37856u).build();
        return new C0344f(new C4524d(build));
    }

    @Override // O.InterfaceC0338c
    public void e(Bundle bundle) {
        ((ContentInfo.Builder) this.f37856u).setExtras(bundle);
    }

    @Override // P.u
    public boolean f(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f37856u;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = X.f2240a;
        boolean z8 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f35989d;
        view.offsetLeftAndRight((!(i == 0 && z8) && (i != 1 || z8)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // e.InterfaceC4463b
    public void g(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        N n9 = (N) this.f37856u;
        K k6 = (K) n9.f4952C.pollFirst();
        if (k6 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        i iVar = n9.f4964c;
        String str = k6.f4946n;
        if (iVar.g(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override // p7.InterfaceC4864a
    public Object get() {
        switch (this.f37855n) {
            case 13:
                return new C0425d((Context) ((C4523c) this.f37856u).f37856u, new L2.i(19), new e());
            default:
                return this.f37856u;
        }
    }

    @Override // O.InterfaceC0338c
    public void h(Uri uri) {
        ((ContentInfo.Builder) this.f37856u).setLinkUri(uri);
    }

    @Override // O.InterfaceC0338c
    public void i(int i) {
        ((ContentInfo.Builder) this.f37856u).setFlags(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // R7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(R7.c cVar, InterfaceC5133d interfaceC5133d) {
        R7.a aVar;
        int i;
        Throwable th;
        S7.q qVar;
        if (interfaceC5133d instanceof R7.a) {
            aVar = (R7.a) interfaceC5133d;
            int i4 = aVar.f2842w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.f2842w = i4 - Integer.MIN_VALUE;
                Object obj = aVar.f2840u;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.f2842w;
                v vVar = v.f40183a;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    S7.q qVar2 = new S7.q(cVar, aVar.getContext());
                    try {
                        aVar.f2839n = qVar2;
                        aVar.f2842w = 1;
                        Object invoke = ((X.q) this.f37856u).invoke(qVar2, aVar);
                        if (invoke != enumC5179a) {
                            invoke = vVar;
                        }
                        if (invoke == enumC5179a) {
                            return enumC5179a;
                        }
                        qVar = qVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        qVar = qVar2;
                        qVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = aVar.f2839n;
                    try {
                        com.bumptech.glide.f.r(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        qVar.releaseIntercepted();
                        throw th;
                    }
                }
                qVar.releaseIntercepted();
                return vVar;
            }
        }
        aVar = new R7.a(this, interfaceC5133d);
        Object obj2 = aVar.f2840u;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.f2842w;
        v vVar2 = v.f40183a;
        if (i != 0) {
        }
        qVar.releaseIntercepted();
        return vVar2;
    }

    @Override // t0.Y
    public int k(View view) {
        C5020D c5020d = (C5020D) view.getLayoutParams();
        ((AbstractC5019C) this.f37856u).getClass();
        return (view.getLeft() - ((C5020D) view.getLayoutParams()).f40577b.left) - ((ViewGroup.MarginLayoutParams) c5020d).leftMargin;
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        int i = C.f40822b;
        u2.i.a("Initialized webview successfully for SDKCore.");
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.eb)).booleanValue()) {
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", "true");
            BinderC0278l binderC0278l = (BinderC0278l) this.f37856u;
            K3.b.L(binderC0278l.f249E, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(binderC0278l.f266W.get())));
            binderC0278l.f265V.set(true);
        }
    }

    @Override // B1.k
    public int m() {
        return (u() << 8) | u();
    }

    @Override // i6.n
    public t n(C0433a c0433a) {
        m mVar = (m) this.f37856u;
        mVar.f5724g = c7.n.f5729w;
        g7.b c4 = mVar.c();
        c7.t tVar = (c7.t) mVar.f5723f;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = tVar.f5749e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            U6.a aVar = tVar.f5748d;
            if (!hasNext) {
                j7.e eVar = new j7.e(c4, arrayList);
                C4612c c4612c = new C4612c(Collections.singletonList(eVar), new D5.b(13, c0433a, eVar));
                c7.t tVar2 = (c7.t) mVar.f5723f;
                synchronized (tVar2.f5745a) {
                    tVar2.f5746b.add(c4612c);
                }
                return new c7.v((c7.t) mVar.f5723f, c4612c);
            }
            Map.Entry entry = (Map.Entry) it.next();
            C4585a c4585a = (C4585a) entry.getKey();
            for (C4660a c4660a : c4585a.f38331b.a(c4, aVar)) {
                C4663d c4663d = C4663d.f38820a;
                c7.d dVar = c4660a.f38814b;
                if (c4663d != dVar.f5715a) {
                    int i = AbstractC4610a.f38579a;
                    g7.c.a(dVar, EnumC4517b.f37809n, c4);
                    throw null;
                }
            }
        }
    }

    @Override // t0.Y
    public int p() {
        return ((AbstractC5019C) this.f37856u).E();
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        j.f39798C.f39808h.d("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        BinderC0278l binderC0278l = (BinderC0278l) this.f37856u;
        K3.b.L(binderC0278l.f249E, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(binderC0278l.f266W.get())));
        int i = C.f40822b;
        u2.i.d("Failed to initialize webview for loading SDKCore. ", th);
        C3151ea c3151ea = AbstractC3368ia.eb;
        r rVar = r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() || binderC0278l.f265V.get()) {
            return;
        }
        if (binderC0278l.f266W.getAndIncrement() < ((Integer) rVar.f40119c.a(AbstractC3368ia.fb)).intValue()) {
            binderC0278l.J3();
        }
    }

    @Override // B1.k
    public long s(long j9) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f37856u;
        int min = (int) Math.min(byteBuffer.remaining(), j9);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // t0.Y
    public int t() {
        AbstractC5019C abstractC5019C = (AbstractC5019C) this.f37856u;
        return abstractC5019C.f40574n - abstractC5019C.F();
    }

    public String toString() {
        switch (this.f37855n) {
            case 16:
                return ((m) this.f37856u).d(getClass().getSimpleName());
            case 24:
                return "ServiceLoaderComponentLoader{classLoader=" + ((ClassLoader) this.f37856u) + "}";
            default:
                return super.toString();
        }
    }

    @Override // B1.k
    public short u() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f37856u;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new B1.j();
    }

    public File v(String str) {
        File file = new File(w(), r(str, EnumC4522b.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(w(), r(str, EnumC4522b.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(w(), r(str, EnumC4522b.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public File w() {
        l lVar = (l) this.f37856u;
        lVar.getClass();
        File file = new File(lVar.f1523a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // B1.k
    public int x(int i, byte[] bArr) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f37856u;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(AbstractC5032P abstractC5032P, C0357t c0357t, C0357t c0357t2) {
        boolean z8;
        RecyclerView recyclerView = (RecyclerView) this.f37856u;
        recyclerView.getClass();
        abstractC5032P.n(false);
        C5045h c5045h = (C5045h) recyclerView.f5372q0;
        if (c0357t != null) {
            c5045h.getClass();
            int i = c0357t.f2319a;
            int i4 = c0357t2.f2319a;
            if (i != i4 || c0357t.f2320b != c0357t2.f2320b) {
                z8 = c5045h.g(abstractC5032P, i, c0357t.f2320b, i4, c0357t2.f2320b);
                if (z8) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        c5045h.l(abstractC5032P);
        abstractC5032P.f40615a.setAlpha(0.0f);
        c5045h.i.add(abstractC5032P);
        z8 = true;
        if (z8) {
        }
    }

    @Override // t0.Y
    public View z(int i) {
        return ((AbstractC5019C) this.f37856u).u(i);
    }

    public /* synthetic */ C4523c(int i, Object obj) {
        this.f37855n = i;
        this.f37856u = obj;
    }

    public C4523c(BinderC0278l binderC0278l) {
        this.f37855n = 2;
        Objects.requireNonNull(binderC0278l);
        this.f37856u = binderC0278l;
    }

    public C4523c(I0.j jVar) {
        this.f37855n = 17;
        this.f37856u = Collections.unmodifiableMap(new HashMap((HashMap) jVar.f1233u));
    }

    public C4523c() {
        this.f37855n = 23;
        this.f37856u = new LinkedHashSet();
    }

    public C4523c(int i, D5.a aVar, W6.k kVar, String str) {
        C0530a c0530a;
        this.f37855n = 6;
        W6.j jVar = kVar.f3490c;
        int i4 = jVar.f3486u;
        int d2 = AbstractC5088e.d(i);
        Object obj = K6.f.f1655a;
        if (d2 == 0) {
            g6.e eVar = K6.d.i;
            switch (jVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    obj = new K6.d(aVar, jVar);
                    break;
            }
            this.f37856u = obj;
            return;
        }
        if (d2 != 1) {
            throw new IllegalStateException("Unhandled case: ".concat(y.u(i)));
        }
        if (i4 != 4) {
            try {
                URI uri = new URI(str);
                I1.f fVar = new I1.f(2);
                String host = uri.getHost();
                if (host != null) {
                    fVar.d(W6.i.f3480d, host);
                }
                int port = uri.getPort();
                if (port == -1) {
                    String scheme = uri.getScheme();
                    if ("https".equals(scheme)) {
                        port = 443;
                    } else if ("http".equals(scheme)) {
                        port = 80;
                    }
                }
                if (port != -1) {
                    fVar.d(W6.i.f3481e, Long.valueOf(port));
                }
                c0530a = fVar.b();
            } catch (URISyntaxException unused) {
                c0530a = C0530a.f5557w;
            }
            obj = new K6.h(aVar, i4, kVar, c0530a);
        }
        this.f37856u = obj;
    }

    public C4523c(c7.t tVar, String str, String str2, String str3, e8.k kVar) {
        this.f37855n = 16;
        m mVar = new m(str, c7.n.f5730x, 1, tVar);
        mVar.f5721d = str2;
        mVar.f5722e = str3;
        mVar.f5725h = kVar;
        this.f37856u = mVar;
    }

    @Override // m.W
    public void c(int i) {
    }

    @Override // m.W
    public void d(int i) {
    }

    public C4523c(f sink) {
        this.f37855n = 12;
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f37856u = sink;
    }

    public C4523c(ByteBuffer byteBuffer) {
        this.f37855n = 1;
        this.f37856u = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public C4523c(ClipData clipData, int i) {
        this.f37855n = 8;
        this.f37856u = N0.a.n(clipData, i);
    }

    @Override // m.W
    public void o(int i, float f6) {
    }
}
