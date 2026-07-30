package g1;

import B1.k;
import B2.BinderC0278l;
import B2.J;
import O.InterfaceC0342e;
import X0.A;
import X0.m;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0485s;
import androidx.fragment.app.K;
import androidx.fragment.app.N;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import b2.InterfaceC0525b;
import com.anythink.core.common.d.j;
import com.bumptech.glide.load.data.f;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C3686oN;
import com.google.android.gms.internal.ads.Ow;
import com.icefishing.icefishingliveapp.IntroActivity;
import com.icefishing.icefishingliveapp.LanguageActivity;
import com.icefishing.icefishingliveapp.MainActivity;
import com.icefishing.icefishingliveapp.SplashActivity;
import com.icefishing.icefishingliveapp.ViewOnClickListenerC4413b;
import com.icefishing.icefishingliveapp.n;
import com.icefishing.icefishingliveapp.w;
import e.C4462a;
import e.InterfaceC4463b;
import h3.e;
import i8.i;
import i8.r;
import i8.v;
import i8.x;
import j1.AbstractC4591d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import k4.InterfaceC4657l;
import kotlin.jvm.internal.h;
import l.C4677e;
import l.ViewOnKeyListenerC4678f;
import l.l;
import m.C0;
import m.InterfaceC4736g0;
import m.InterfaceC4749n;
import m.V0;
import q7.C4938g;
import r0.InterfaceC4954c;
import r7.t;
import t0.AbstractC5019C;
import t0.C5020D;
import t0.Y;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4524d implements k, BD, f, InterfaceC0342e, InterfaceC4463b, InterfaceC4657l, InterfaceC0525b, InterfaceC4736g0, V0, e, h3.d, h3.b, i, C0, InterfaceC4749n, Ow, InterfaceC4954c, Y {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37857n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f37858u;

    public /* synthetic */ C4524d(int i, Object obj) {
        this.f37857n = i;
        this.f37858u = obj;
    }

    @Override // t0.Y
    public int A(View view) {
        C5020D c5020d = (C5020D) view.getLayoutParams();
        ((AbstractC5019C) this.f37858u).getClass();
        return view.getBottom() + ((C5020D) view.getLayoutParams()).f40577b.bottom + ((ViewGroup.MarginLayoutParams) c5020d).bottomMargin;
    }

    @Override // h3.d
    public void B(Exception exc) {
        ((CountDownLatch) this.f37858u).countDown();
    }

    public P.k C(int i) {
        return null;
    }

    public P.k D(int i) {
        return null;
    }

    public A E(Context context, String str, InputStream inputStream, String str2, String str3) {
        A g9;
        EnumC4522b enumC4522b;
        if (str2 == null) {
            str2 = com.anythink.core.common.m.a.f14561q;
        }
        boolean contains = str2.contains("application/zip");
        C4523c c4523c = (C4523c) this.f37858u;
        if (contains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC4591d.a();
            EnumC4522b enumC4522b2 = EnumC4522b.ZIP;
            g9 = str3 != null ? m.g(context, new ZipInputStream(new FileInputStream(c4523c.E(str, inputStream, enumC4522b2))), str) : m.g(context, new ZipInputStream(inputStream), null);
            enumC4522b = enumC4522b2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            AbstractC4591d.a();
            enumC4522b = EnumC4522b.GZIP;
            g9 = str3 != null ? m.d(str, new GZIPInputStream(new FileInputStream(c4523c.E(str, inputStream, enumC4522b)))) : m.d(null, new GZIPInputStream(inputStream));
        } else {
            AbstractC4591d.a();
            enumC4522b = EnumC4522b.JSON;
            g9 = str3 != null ? m.d(str, new FileInputStream(c4523c.E(str, inputStream, enumC4522b).getAbsolutePath())) : m.d(null, inputStream);
        }
        if (str3 != null && g9.f3631a != null) {
            File file = new File(c4523c.w(), C4523c.r(str, enumC4522b, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            AbstractC4591d.a();
            if (!renameTo) {
                AbstractC4591d.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + j.f12535z);
            }
        }
        return g9;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object F(AbstractC5219c abstractC5219c) {
        C5.a aVar;
        int i;
        C4938g[] c4938gArr;
        String str;
        C4938g[] c4938gArr2;
        C4524d c4524d;
        if (abstractC5219c instanceof C5.a) {
            aVar = (C5.a) abstractC5219c;
            int i4 = aVar.f487z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.f487z = i4 - Integer.MIN_VALUE;
                Object obj = aVar.f485x;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.f487z;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    c4938gArr = new C4938g[10];
                    aVar.f481n = this;
                    aVar.f482u = c4938gArr;
                    aVar.f483v = c4938gArr;
                    aVar.f484w = "ossdk.install_id";
                    aVar.f487z = 1;
                    Object installId = ((B5.f) this.f37858u).getInstallId(aVar);
                    if (installId == enumC5179a) {
                        return enumC5179a;
                    }
                    str = "ossdk.install_id";
                    obj = installId;
                    c4938gArr2 = c4938gArr;
                    c4524d = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = aVar.f484w;
                    c4938gArr = aVar.f483v;
                    c4938gArr2 = aVar.f482u;
                    c4524d = aVar.f481n;
                    com.bumptech.glide.f.r(obj);
                }
                c4938gArr[0] = new C4938g(str, obj);
                c4938gArr2[1] = new C4938g("ossdk.sdk_base", ((B5.f) c4524d.f37858u).getSdkBase());
                B5.f fVar = (B5.f) c4524d.f37858u;
                c4938gArr2[2] = new C4938g("ossdk.sdk_base_version", fVar.getSdkBaseVersion());
                c4938gArr2[3] = new C4938g("ossdk.app_package_id", fVar.getAppPackageId());
                c4938gArr2[4] = new C4938g("ossdk.app_version", fVar.getAppVersion());
                c4938gArr2[5] = new C4938g("device.manufacturer", fVar.getDeviceManufacturer());
                c4938gArr2[6] = new C4938g("device.model.identifier", fVar.getDeviceModel());
                c4938gArr2[7] = new C4938g("os.name", fVar.getOsName());
                c4938gArr2[8] = new C4938g("os.version", fVar.getOsVersion());
                c4938gArr2[9] = new C4938g("os.build_id", fVar.getOsBuildId());
                LinkedHashMap linkedHashMap = new LinkedHashMap(t.z(c4938gArr2.length));
                t.B(linkedHashMap, c4938gArr2);
                Z5.c.m(linkedHashMap, "ossdk.sdk_wrapper", fVar.getSdkWrapper());
                Z5.c.m(linkedHashMap, "ossdk.sdk_wrapper_version", fVar.getSdkWrapperVersion());
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                h.d(unmodifiableMap, "unmodifiableMap(...)");
                return unmodifiableMap;
            }
        }
        aVar = new C5.a(this, abstractC5219c);
        Object obj2 = aVar.f485x;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.f487z;
        if (i != 0) {
        }
        c4938gArr[0] = new C4938g(str, obj2);
        c4938gArr2[1] = new C4938g("ossdk.sdk_base", ((B5.f) c4524d.f37858u).getSdkBase());
        B5.f fVar2 = (B5.f) c4524d.f37858u;
        c4938gArr2[2] = new C4938g("ossdk.sdk_base_version", fVar2.getSdkBaseVersion());
        c4938gArr2[3] = new C4938g("ossdk.app_package_id", fVar2.getAppPackageId());
        c4938gArr2[4] = new C4938g("ossdk.app_version", fVar2.getAppVersion());
        c4938gArr2[5] = new C4938g("device.manufacturer", fVar2.getDeviceManufacturer());
        c4938gArr2[6] = new C4938g("device.model.identifier", fVar2.getDeviceModel());
        c4938gArr2[7] = new C4938g("os.name", fVar2.getOsName());
        c4938gArr2[8] = new C4938g("os.version", fVar2.getOsVersion());
        c4938gArr2[9] = new C4938g("os.build_id", fVar2.getOsBuildId());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.z(c4938gArr2.length));
        t.B(linkedHashMap2, c4938gArr2);
        Z5.c.m(linkedHashMap2, "ossdk.sdk_wrapper", fVar2.getSdkWrapper());
        Z5.c.m(linkedHashMap2, "ossdk.sdk_wrapper_version", fVar2.getSdkWrapperVersion());
        Map unmodifiableMap2 = Collections.unmodifiableMap(linkedHashMap2);
        h.d(unmodifiableMap2, "unmodifiableMap(...)");
        return unmodifiableMap2;
    }

    public boolean G(int i, int i4, Bundle bundle) {
        return false;
    }

    public void H(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f37858u;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // k4.InterfaceC4657l
    public void OnCall() {
        switch (this.f37857n) {
            case 12:
                ViewOnClickListenerC4413b viewOnClickListenerC4413b = (ViewOnClickListenerC4413b) this.f37858u;
                viewOnClickListenerC4413b.f37065u.startActivity(new Intent(viewOnClickListenerC4413b.f37065u, (Class<?>) LanguageActivity.class));
                break;
            case 13:
                IntroActivity introActivity = ((n) this.f37858u).f37089u;
                introActivity.startActivity(introActivity.f36940x);
                break;
            case 14:
                MainActivity mainActivity = ((w) this.f37858u).f37107u.f37110c;
                mainActivity.startActivity(mainActivity.f36997O);
                break;
            case 15:
                MainActivity mainActivity2 = ((w) this.f37858u).f37107u.f37110c;
                mainActivity2.startActivity(mainActivity2.f37007T);
                break;
            default:
                SplashActivity splashActivity = (SplashActivity) ((h4.c) this.f37858u).f38233u;
                Intent intent = splashActivity.f37048v;
                splashActivity.getClass();
                try {
                    if (splashActivity.f() && intent != null) {
                        splashActivity.startActivity(intent);
                        splashActivity.finish();
                        break;
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.BD, com.google.android.gms.internal.ads.InterfaceC3404jB
    public J3.a a() {
        BinderC0278l binderC0278l = (BinderC0278l) this.f37858u;
        binderC0278l.getClass();
        try {
            return (J3.a) binderC0278l.L3(binderC0278l.f270v, null, "BANNER", null, null, new Bundle()).f34072W.d();
        } catch (NullPointerException e6) {
            return C3686oN.l(e6);
        }
    }

    @Override // O.InterfaceC0342e
    public int c() {
        int source;
        source = ((ContentInfo) this.f37858u).getSource();
        return source;
    }

    @Override // O.InterfaceC0342e
    public ClipData d() {
        ClipData clip;
        clip = ((ContentInfo) this.f37858u).getClip();
        return clip;
    }

    @Override // r0.InterfaceC4954c
    public void e(int i, Serializable serializable) {
        String str;
        switch (i) {
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
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f37858u).setResultCode(i);
    }

    @Override // i8.i
    public r f() {
        i8.w g9;
        IOException iOException = null;
        while (true) {
            i8.t tVar = (i8.t) this.f37858u;
            if (!tVar.f38432D.k()) {
                try {
                    g9 = tVar.g();
                } catch (IOException e6) {
                    if (iOException == null) {
                        iOException = e6;
                    } else {
                        com.bumptech.glide.d.b(iOException, e6);
                    }
                    if (!tVar.a(null)) {
                        throw iOException;
                    }
                }
                if (g9.isReady()) {
                    break;
                }
                v c4 = g9.c();
                if (c4.f38446b == null && c4.f38447c == null) {
                    c4 = g9.f();
                }
                i8.e eVar = c4.f38446b;
                Throwable th = c4.f38447c;
                if (th != null) {
                    throw th;
                }
                if (eVar == null) {
                    break;
                }
                tVar.f38436H.addFirst(eVar);
            } else {
                throw new IOException("Canceled");
            }
        }
        return g9.b();
    }

    @Override // e.InterfaceC4463b
    public void g(Object obj) {
        C4462a c4462a = (C4462a) obj;
        N n9 = (N) this.f37858u;
        K k6 = (K) n9.f4952C.pollLast();
        if (k6 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        S0.i iVar = n9.f4964c;
        String str = k6.f4946n;
        AbstractComponentCallbacksC0485s g9 = iVar.g(str);
        if (g9 != null) {
            g9.m(k6.f4947u, c4462a.f37209n, c4462a.f37210u);
        } else {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    @Override // p7.InterfaceC4864a
    public Object get() {
        String packageName = ((Context) ((C4523c) this.f37858u).f37856u).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // m.C0
    public void h(l lVar, l.n nVar) {
        ((ViewOnKeyListenerC4678f) this.f37858u).f38929y.removeCallbacksAndMessages(lVar);
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public void i(int i, long j9, String str) {
        ((p2.e) this.f37858u).f39766A.e(i, System.currentTimeMillis() - j9, null, null, str);
    }

    @Override // i8.i
    public x j() {
        return (i8.t) this.f37858u;
    }

    @Override // t0.Y
    public int k(View view) {
        C5020D c5020d = (C5020D) view.getLayoutParams();
        ((AbstractC5019C) this.f37858u).getClass();
        return (view.getTop() - ((C5020D) view.getLayoutParams()).f40577b.top) - ((ViewGroup.MarginLayoutParams) c5020d).topMargin;
    }

    @Override // h3.e
    public void l(Object obj) {
        ((CountDownLatch) this.f37858u).countDown();
    }

    @Override // B1.k
    public int m() {
        return (u() << 8) | u();
    }

    @Override // com.bumptech.glide.load.data.f
    public Object n() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f37858u;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // r0.InterfaceC4954c
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // t0.Y
    public int p() {
        return ((AbstractC5019C) this.f37858u).G();
    }

    @Override // h3.b
    public void q() {
        ((CountDownLatch) this.f37858u).countDown();
    }

    @Override // com.google.android.gms.internal.ads.Ow
    public void r(int i, long j9) {
        ((p2.e) this.f37858u).f39766A.b(i, System.currentTimeMillis() - j9);
    }

    @Override // B1.k
    public long s(long j9) {
        if (j9 < 0) {
            return 0L;
        }
        long j10 = j9;
        while (j10 > 0) {
            InputStream inputStream = (InputStream) this.f37858u;
            long skip = inputStream.skip(j10);
            if (skip > 0) {
                j10 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j10--;
            }
        }
        return j9 - j10;
    }

    @Override // t0.Y
    public int t() {
        AbstractC5019C abstractC5019C = (AbstractC5019C) this.f37858u;
        return abstractC5019C.f40575o - abstractC5019C.D();
    }

    public String toString() {
        switch (this.f37857n) {
            case 7:
                return "ContentInfoCompat{" + ((ContentInfo) this.f37858u) + "}";
            default:
                return super.toString();
        }
    }

    @Override // B1.k
    public short u() {
        int read = ((InputStream) this.f37858u).read();
        if (read != -1) {
            return (short) read;
        }
        throw new B1.j();
    }

    @Override // m.C0
    public void v(l lVar, l.n nVar) {
        ViewOnKeyListenerC4678f viewOnKeyListenerC4678f = (ViewOnKeyListenerC4678f) this.f37858u;
        viewOnKeyListenerC4678f.f38929y.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC4678f.f38907A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == ((C4677e) arrayList.get(i)).f38905b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i4 = i + 1;
        viewOnKeyListenerC4678f.f38929y.postAtTime(new J(this, i4 < arrayList.size() ? (C4677e) arrayList.get(i4) : null, nVar, lVar, 6, false), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // O.InterfaceC0342e
    public int w() {
        int flags;
        flags = ((ContentInfo) this.f37858u).getFlags();
        return flags;
    }

    @Override // B1.k
    public int x(int i, byte[] bArr) {
        int i4 = 0;
        int i9 = 0;
        while (i4 < i && (i9 = ((InputStream) this.f37858u).read(bArr, i4, i - i4)) != -1) {
            i4 += i9;
        }
        if (i4 == 0 && i9 == -1) {
            throw new B1.j();
        }
        return i4;
    }

    @Override // O.InterfaceC0342e
    public ContentInfo y() {
        return (ContentInfo) this.f37858u;
    }

    @Override // t0.Y
    public View z(int i) {
        return ((AbstractC5019C) this.f37858u).u(i);
    }

    public C4524d(p2.e eVar) {
        this.f37857n = 26;
        Objects.requireNonNull(eVar);
        this.f37858u = eVar;
    }

    public C4524d(C4523c c4523c, W3.e eVar) {
        this.f37857n = 0;
        this.f37858u = c4523c;
    }

    public C4524d(int i) {
        Handler handler;
        Handler handler2;
        this.f37857n = i;
        switch (i) {
            case 8:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f37858u = new P.m(this);
                    return;
                } else {
                    this.f37858u = new P.l(this);
                    return;
                }
            case 10:
                this.f37858u = new HashSet();
                return;
            case 22:
                this.f37858u = new CountDownLatch(1);
                return;
            default:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = K.i.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e6) {
                        e = e6;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f37858u = handler2;
                        return;
                    } catch (InstantiationException e9) {
                        e = e9;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f37858u = handler2;
                        return;
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f37858u = handler2;
                        return;
                    } catch (InvocationTargetException e11) {
                        Throwable cause = e11.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handler2 = handler;
                }
                this.f37858u = handler2;
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
    }

    public C4524d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f37857n = 9;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f37858u = new T.f(uri, clipDescription, uri2);
        } else {
            this.f37858u = new Y2.e(uri, clipDescription, uri2, 13);
        }
    }

    public C4524d(ContentInfo contentInfo) {
        this.f37857n = 7;
        contentInfo.getClass();
        this.f37858u = N0.a.p(contentInfo);
    }
}
