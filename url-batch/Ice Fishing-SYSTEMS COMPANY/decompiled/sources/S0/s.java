package S0;

import O.A0;
import O.C0357t;
import O.InterfaceC0358u;
import O.y0;
import O2.w;
import android.animation.Animator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase_Impl;
import b6.C0530a;
import c7.u;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.internal.ads.T4;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.icefishing.icefishingliveapp.C5284R;
import com.icefishing.icefishingliveapp.GzopPuzzleLogicActivity;
import h7.C4570a;
import i1.AbstractC4574a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import k4.InterfaceC4657l;
import l1.C4684a;
import l7.C4707a;
import m1.C4774a;
import m1.C4776c;
import m7.C4793g;
import m7.C4794h;
import n6.C4814a;
import t0.C5037V;
import t2.D;
import t2.G;
import t2.v;
import u0.C5098i;
import u2.InterfaceC5109c;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes.dex */
public class s implements B5.b, h3.c, i6.r, InterfaceC4657l, InterfaceC5109c, InterfaceC0358u {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2951n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2952u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2953v;

    public /* synthetic */ s(int i, Object obj) {
        this.f2951n = i;
        this.f2953v = null;
        this.f2952u = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005b), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s i(String... strArr) {
        String str;
        try {
            u8.h[] hVarArr = new u8.h[strArr.length];
            u8.e eVar = new u8.e();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = AbstractC4574a.f38276x;
                eVar.X(34);
                int length = str2.length();
                int i4 = 0;
                for (int i9 = 0; i9 < length; i9++) {
                    char charAt = str2.charAt(i9);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                        if (i4 < i9) {
                            eVar.c0(i4, i9, str2);
                        }
                        eVar.d0(str);
                        i4 = i9 + 1;
                    } else {
                        if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i4 < i9) {
                        }
                        eVar.d0(str);
                        i4 = i9 + 1;
                    }
                }
                if (i4 < length) {
                    eVar.c0(i4, length, str2);
                }
                eVar.X(34);
                eVar.z();
                hVarArr[i] = eVar.B(eVar.f41277u);
            }
            return new s(12, (String[]) strArr.clone(), u8.b.e(hVarArr));
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // k4.InterfaceC4657l
    public void OnCall() {
        ((GzopPuzzleLogicActivity) this.f2953v).startActivity((Intent) this.f2952u);
    }

    public T6.d a() {
        Logger logger = C4793g.f39591w;
        C4794h c4794h = new C4794h();
        C4793g c4793g = new C4793g(c4794h.f39597b, c4794h.f39598c, c4794h.f39599d, c4794h.f39600e, c4794h.f39601f, c4794h.f39596a, c4794h.f39602g.d());
        Logger logger2 = u.f5750A;
        C4707a c4707a = C4707a.f39080c;
        u uVar = new u(new ArrayList(), new IdentityHashMap(), new ArrayList(), c4707a, C4570a.f38247a, new I1.b(1).d());
        X6.n nVar = (X6.n) this.f2953v;
        if (nVar == null) {
            Logger logger3 = X6.n.f3871x;
            ArrayList arrayList = new ArrayList();
            C4707a c4707a2 = C4707a.f39080c;
            D5.a aVar = new D5.a(12);
            ArrayList arrayList2 = new ArrayList();
            W6.e.h();
            nVar = new X6.n(c4707a2, aVar, arrayList, new W6.h(arrayList2));
        }
        return new T6.d(c4793g, uVar, nVar, (C4814a) this.f2952u);
    }

    public void b(int i) {
        int[] iArr = (int[]) this.f2952u;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f2952u = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2952u = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f2952u;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // i6.r
    /* renamed from: build */
    public i6.q mo50build() {
        return (i6.q) ((i) this.f2952u).h(C0530a.f5557w, (String) this.f2953v);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory c(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f2953v) == null) {
            Context context = (Context) this.f2952u;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f2953v = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f2953v = map;
        }
        String str4 = (String) ((Map) this.f2953v).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e6) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e6);
            return null;
        } catch (IllegalAccessException e9) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + com.anythink.core.common.d.j.f12535z, e9);
            return null;
        } catch (InstantiationException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + com.anythink.core.common.d.j.f12535z, e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        }
    }

    @Override // u2.InterfaceC5109c
    public u2.k d(String str) {
        u2.k kVar = u2.k.f41244n;
        switch (this.f2951n) {
            case 17:
                D d2 = G.f40858l;
                G g9 = p2.j.f39798C.f39803c;
                new v((Context) this.f2952u, (String) this.f2953v, str, null).l();
                break;
            default:
                new com.facebook.ads.internal.dynamicloading.a((u2.d) this.f2952u, (Context) this.f2953v, str).start();
                break;
        }
        return kVar;
    }

    public String e(String str) {
        String str2 = (String) this.f2953v;
        Resources resources = (Resources) this.f2952u;
        int identifier = resources.getIdentifier(str, com.anythink.expressad.foundation.h.k.f19794g, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public ArrayList f(String str) {
        C5098i a9 = C5098i.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2952u;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m8.getCount());
            while (m8.moveToNext()) {
                arrayList.add(m8.isNull(0) ? null : m8.getString(0));
            }
            return arrayList;
        } finally {
            m8.close();
            a9.j();
        }
    }

    public Object g(C3.u uVar) {
        return (X0.G) this.f2953v;
    }

    public Object h(float f6, float f9, Object obj, Object obj2, float f10, float f11, float f12) {
        C3.u uVar = (C3.u) this.f2952u;
        uVar.f474a = f6;
        uVar.f475b = f9;
        uVar.f479f = obj;
        uVar.f480g = obj2;
        uVar.f476c = f10;
        uVar.f477d = f11;
        uVar.f478e = f12;
        return g(uVar);
    }

    public void j(int i, int i4) {
        int[] iArr = (int[]) this.f2952u;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i9 = i + i4;
        b(i9);
        int[] iArr2 = (int[]) this.f2952u;
        System.arraycopy(iArr2, i, iArr2, i9, (iArr2.length - i) - i4);
        Arrays.fill((int[]) this.f2952u, i, i9, -1);
        ArrayList arrayList = (ArrayList) this.f2953v;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5037V c5037v = (C5037V) ((ArrayList) this.f2953v).get(size);
            int i10 = c5037v.f40644n;
            if (i10 >= i) {
                c5037v.f40644n = i10 + i4;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // O.InterfaceC0358u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A0 k(View view, A0 a02) {
        boolean z8;
        boolean z9;
        W2.b bVar = (W2.b) this.f2953v;
        int i = bVar.f3423a;
        M.h hVar = (M.h) this.f2952u;
        y0 y0Var = a02.f2213a;
        G.e f6 = y0Var.f(7);
        G.e f9 = y0Var.f(32);
        int i4 = f6.f1152b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f1828u;
        bottomSheetBehavior.f36042w = i4;
        boolean e6 = w3.k.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z10 = bottomSheetBehavior.f36034o;
        if (z10) {
            int a9 = a02.a();
            bottomSheetBehavior.f36041v = a9;
            paddingBottom = a9 + bVar.f3425c;
        }
        int i9 = bVar.f3424b;
        boolean z11 = bottomSheetBehavior.f36035p;
        int i10 = f6.f1151a;
        if (z11) {
            paddingLeft = (e6 ? i9 : i) + i10;
        }
        boolean z12 = bottomSheetBehavior.f36036q;
        int i11 = f6.f1153c;
        if (z12) {
            if (!e6) {
                i = i9;
            }
            paddingRight = i + i11;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z13 = true;
        if (!bottomSheetBehavior.f36038s || marginLayoutParams.leftMargin == i10) {
            z8 = false;
        } else {
            marginLayoutParams.leftMargin = i10;
            z8 = true;
        }
        if (bottomSheetBehavior.f36039t && marginLayoutParams.rightMargin != i11) {
            marginLayoutParams.rightMargin = i11;
            z8 = true;
        }
        if (bottomSheetBehavior.f36040u) {
            int i12 = marginLayoutParams.topMargin;
            int i13 = f6.f1152b;
            if (i12 != i13) {
                marginLayoutParams.topMargin = i13;
                if (z13) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z9 = hVar.f1827n;
                if (z9) {
                    bottomSheetBehavior.f36032m = f9.f1154d;
                }
                if (z10 && !z9) {
                    return a02;
                }
                bottomSheetBehavior.I();
                return a02;
            }
        }
        z13 = z8;
        if (z13) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z9 = hVar.f1827n;
        if (z9) {
        }
        if (z10) {
        }
        bottomSheetBehavior.I();
        return a02;
    }

    public void l(int i, int i4) {
        int[] iArr = (int[]) this.f2952u;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i9 = i + i4;
        b(i9);
        int[] iArr2 = (int[]) this.f2952u;
        System.arraycopy(iArr2, i9, iArr2, i, (iArr2.length - i) - i4);
        int[] iArr3 = (int[]) this.f2952u;
        Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f2953v;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5037V c5037v = (C5037V) ((ArrayList) this.f2953v).get(size);
            int i10 = c5037v.f40644n;
            if (i10 >= i) {
                if (i10 < i9) {
                    ((ArrayList) this.f2953v).remove(size);
                } else {
                    c5037v.f40644n = i10 - i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f A[LOOP:0: B:2:0x0004->B:57:0x018f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bumptech.glide.manager.n m(C4776c c4776c) {
        Object obj;
        c cVar;
        String str;
        int i;
        int i4;
        Map map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            C4774a c4774a = null;
            try {
                T4 t42 = c4776c.f39558D;
                if (t42 == null) {
                    try {
                        map = Collections.EMPTY_MAP;
                    } catch (IOException e6) {
                        e = e6;
                        e = e;
                        obj = null;
                        if (e instanceof SocketTimeoutException) {
                        }
                        str = (String) cVar.f2886u;
                        C0357t c0357t = c4776c.f39557C;
                        i = c0357t.f2319a;
                        try {
                            l1.g gVar = (l1.g) cVar.f2887v;
                            i4 = c0357t.f2320b + 1;
                            c0357t.f2320b = i4;
                            c0357t.f2319a = ((int) (i * 1.0f)) + i;
                            if (i4 > 1) {
                            }
                        } catch (l1.g e9) {
                            c4776c.a(str + "-timeout-giveup [timeout=" + i + "]");
                            throw e9;
                        }
                    }
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = t42.f27710b;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j9 = t42.f27712d;
                    if (j9 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j9)));
                    }
                    map = hashMap;
                }
            } catch (IOException e10) {
                e = e10;
            }
            try {
                C4774a p6 = ((L2.i) this.f2952u).p(c4776c, map);
                try {
                    int i9 = p6.f39543a;
                    List unmodifiableList = Collections.unmodifiableList(p6.f39544b);
                    if (i9 == 304) {
                        SystemClock.elapsedRealtime();
                        return W2.e.e(c4776c, unmodifiableList);
                    }
                    InputStream inputStream = (InputStream) p6.f39546d;
                    if (inputStream == null) {
                        inputStream = null;
                    }
                    byte[] g9 = inputStream != null ? W2.e.g(inputStream, p6.f39545c, (C4774a) this.f2953v) : new byte[0];
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (l1.j.f39043a || elapsedRealtime2 > com.anythink.expressad.video.module.a.a.m.ai) {
                        l1.j.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", c4776c, Long.valueOf(elapsedRealtime2), g9 != null ? Integer.valueOf(g9.length) : "null", Integer.valueOf(i9), Integer.valueOf(c4776c.f39557C.f2320b));
                    }
                    if (i9 < 200 || i9 > 299) {
                        throw new IOException();
                    }
                    SystemClock.elapsedRealtime();
                    return new com.bumptech.glide.manager.n(g9, false, unmodifiableList);
                } catch (IOException e11) {
                    e = e11;
                    obj = null;
                    c4774a = p6;
                    if (e instanceof SocketTimeoutException) {
                        cVar = new c(15, "socket", new C4684a());
                    } else {
                        boolean z8 = e instanceof MalformedURLException;
                        String str3 = c4776c.f39563u;
                        if (z8) {
                            throw new RuntimeException("Bad URL " + str3, e);
                        }
                        if (c4774a == null) {
                            throw new l1.f(e);
                        }
                        int i10 = c4774a.f39543a;
                        l1.j.c("Unexpected response code %d for %s", Integer.valueOf(i10), str3);
                        if (obj != null) {
                            List<l1.d> unmodifiableList2 = Collections.unmodifiableList(c4774a.f39544b);
                            SystemClock.elapsedRealtime();
                            if (unmodifiableList2 != null) {
                                if (unmodifiableList2.isEmpty()) {
                                    Map map2 = Collections.EMPTY_MAP;
                                } else {
                                    TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                    for (l1.d dVar : unmodifiableList2) {
                                        treeMap.put(dVar.f39030a, dVar.f39031b);
                                    }
                                }
                            }
                            if (unmodifiableList2 != null) {
                                Collections.unmodifiableList(unmodifiableList2);
                            }
                            if (i10 != 401 && i10 != 403) {
                                if (i10 < 400 || i10 > 499) {
                                    throw new C4684a();
                                }
                                throw new l1.c();
                            }
                            cVar = new c(15, "auth", new C4684a());
                        } else {
                            cVar = new c(15, "network", new C4684a());
                        }
                    }
                    str = (String) cVar.f2886u;
                    C0357t c0357t2 = c4776c.f39557C;
                    i = c0357t2.f2319a;
                    l1.g gVar2 = (l1.g) cVar.f2887v;
                    i4 = c0357t2.f2320b + 1;
                    c0357t2.f2320b = i4;
                    c0357t2.f2319a = ((int) (i * 1.0f)) + i;
                    if (i4 > 1) {
                        throw gVar2;
                    }
                    c4776c.a(str + "-retry [timeout=" + i + "]");
                }
            } catch (IOException e12) {
                e = e12;
                e = e;
                obj = null;
                if (e instanceof SocketTimeoutException) {
                }
                str = (String) cVar.f2886u;
                C0357t c0357t22 = c4776c.f39557C;
                i = c0357t22.f2319a;
                l1.g gVar22 = (l1.g) cVar.f2887v;
                i4 = c0357t22.f2320b + 1;
                c0357t22.f2320b = i4;
                c0357t22.f2319a = ((int) (i * 1.0f)) + i;
                if (i4 > 1) {
                }
            }
            c4776c.a(str + "-retry [timeout=" + i + "]");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Thread thread, Throwable th, AbstractC5219c abstractC5219c) {
        E5.d dVar;
        EnumC5179a enumC5179a;
        int i;
        s sVar;
        C0530a b9;
        s sVar2;
        Instant now;
        Object obj;
        B5.c cVar = (B5.c) this.f2953v;
        if (abstractC5219c instanceof E5.d) {
            dVar = (E5.d) abstractC5219c;
            int i4 = dVar.f838x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.f838x = i4 - Integer.MIN_VALUE;
                Object obj2 = dVar.f836v;
                enumC5179a = EnumC5179a.f41704n;
                i = dVar.f838x;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj2);
                    try {
                        cVar.info("OtelCrashReporter: Starting to save crash report for ".concat(th.getClass().getSimpleName()));
                        try {
                            I1.f fVar = new I1.f(2);
                            String message = th.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.e("exception.message", message);
                            fVar.e("exception.stacktrace", com.bumptech.glide.d.y(th));
                            fVar.e("exception.type", th.getClass().getName());
                            fVar.e("ossdk.exception.thread.name", thread.getName());
                            b9 = fVar.b();
                            cVar.debug("OtelCrashReporter: Creating log record with attributes...");
                            try {
                                Object obj3 = (B5.d) this.f2952u;
                                dVar.f834n = this;
                                dVar.f835u = b9;
                                dVar.f838x = 1;
                                try {
                                    obj2 = B5.j.b((B5.j) obj3, dVar);
                                    if (obj2 != enumC5179a) {
                                        sVar2 = this;
                                    }
                                    return enumC5179a;
                                } catch (IOException e6) {
                                    e = e6;
                                    e = e;
                                    sVar = this;
                                    ((B5.c) sVar.f2953v).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                                    throw e;
                                } catch (RuntimeException e9) {
                                    e = e9;
                                    e = e;
                                    sVar = this;
                                    ((B5.c) sVar.f2953v).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                                    throw e;
                                }
                            } catch (IOException e10) {
                                e = e10;
                            } catch (RuntimeException e11) {
                                e = e11;
                            }
                        } catch (IOException e12) {
                            e = e12;
                        } catch (RuntimeException e13) {
                            e = e13;
                        }
                    } catch (IOException e14) {
                        e = e14;
                    } catch (RuntimeException e15) {
                        e = e15;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar = dVar.f834n;
                        try {
                            com.bumptech.glide.f.r(obj2);
                            ((B5.c) sVar.f2953v).info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                            return q7.v.f40183a;
                        } catch (IOException e16) {
                            e = e16;
                            ((B5.c) sVar.f2953v).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                            throw e;
                        } catch (RuntimeException e17) {
                            e = e17;
                            ((B5.c) sVar.f2953v).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                            throw e;
                        }
                    }
                    b9 = dVar.f835u;
                    sVar2 = dVar.f834n;
                    try {
                        com.bumptech.glide.f.r(obj2);
                    } catch (IOException e18) {
                        s sVar3 = sVar2;
                        e = e18;
                        sVar = sVar3;
                        ((B5.c) sVar.f2953v).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (RuntimeException e19) {
                        s sVar4 = sVar2;
                        e = e19;
                        sVar = sVar4;
                        ((B5.c) sVar.f2953v).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                        throw e;
                    }
                }
                h6.e c4 = ((h6.e) obj2).d(b9).c(h6.i.FATAL);
                now = Instant.now();
                c4.f(now).b();
                ((B5.c) sVar2.f2953v).debug("OtelCrashReporter: Flushing crash report to disk...");
                obj = (B5.d) sVar2.f2952u;
                dVar.f834n = sVar2;
                dVar.f835u = null;
                dVar.f838x = 2;
                if (B5.j.a((B5.j) obj, dVar) != enumC5179a) {
                    sVar = sVar2;
                    ((B5.c) sVar.f2953v).info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                    return q7.v.f40183a;
                }
                return enumC5179a;
            }
        }
        dVar = new E5.d(this, abstractC5219c);
        Object obj22 = dVar.f836v;
        enumC5179a = EnumC5179a.f41704n;
        i = dVar.f838x;
        if (i != 0) {
        }
        h6.e c42 = ((h6.e) obj22).d(b9).c(h6.i.FATAL);
        now = Instant.now();
        c42.f(now).b();
        ((B5.c) sVar2.f2953v).debug("OtelCrashReporter: Flushing crash report to disk...");
        obj = (B5.d) sVar2.f2952u;
        dVar.f834n = sVar2;
        dVar.f835u = null;
        dVar.f838x = 2;
        if (B5.j.a((B5.j) obj, dVar) != enumC5179a) {
        }
        return enumC5179a;
    }

    @Override // h3.c
    public void o(h3.n nVar) {
        ((Map) ((c) this.f2953v).f2887v).remove((h3.h) this.f2952u);
    }

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.f2951n = i;
        this.f2952u = obj;
        this.f2953v = obj2;
    }

    public /* synthetic */ s(int i, boolean z8) {
        this.f2951n = i;
    }

    public /* synthetic */ s(Object obj, Object obj2, int i, boolean z8) {
        this.f2951n = i;
        this.f2953v = obj;
        this.f2952u = obj2;
    }

    public s(Context context) {
        this.f2951n = 5;
        w.h(context);
        Resources resources = context.getResources();
        this.f2952u = resources;
        this.f2953v = resources.getResourcePackageName(C5284R.string.common_google_play_services_unknown_issue);
    }

    public s(IBinder iBinder) {
        this.f2951n = 3;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f2952u = new Messenger(iBinder);
            this.f2953v = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f2953v = new K2.g(iBinder);
            this.f2952u = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public s(int i) {
        this.f2951n = i;
        switch (i) {
            case 13:
                this.f2952u = new C3.u();
                this.f2953v = null;
                break;
            default:
                this.f2952u = new AtomicReference();
                this.f2953v = new s.b();
                break;
        }
    }

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f2951n = 0;
        this.f2952u = workDatabase_Impl;
        this.f2953v = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 16);
    }

    public s(X0.G g9) {
        this.f2951n = 13;
        this.f2952u = new C3.u();
        this.f2953v = g9;
    }

    public s(L2.i iVar) {
        this.f2951n = 14;
        C4774a c4774a = new C4774a();
        this.f2952u = iVar;
        this.f2953v = c4774a;
    }

    public s(Animator animator) {
        this.f2951n = 8;
        this.f2952u = null;
        this.f2953v = animator;
    }
}
