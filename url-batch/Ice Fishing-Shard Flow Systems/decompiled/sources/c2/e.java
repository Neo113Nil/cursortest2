package c2;

import B6.p;
import O6.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.appsflyer.attribution.RequestError;
import com.icefishing.icefish.ice.fishing.s294s.R;
import d0.InterfaceC0352a;
import j1.InterfaceC0568a;
import j4.C0578g;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC0655b;
import l0.InterfaceC0656c;
import p1.C0820c;
import s4.o;
import s4.x;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public class e implements O6.l, InterfaceC0352a, e0.d, InterfaceC0568a, s4.d, InterfaceC0655b, K1.g, o {

    /* renamed from: d, reason: collision with root package name */
    public static e f4185d;

    /* renamed from: e, reason: collision with root package name */
    public static e f4186e;

    /* renamed from: i, reason: collision with root package name */
    public static e f4187i;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ e f4188l = new e();

    public /* synthetic */ e(Object obj) {
    }

    public static final void h(T6.d node, long j, boolean z7) {
        p pVar = T6.d.f2604h;
        if (T6.d.f2605i == null) {
            T6.d.f2605i = new T6.d();
            T6.c cVar = new T6.c("Okio Watchdog");
            cVar.setDaemon(true);
            cVar.start();
        }
        long nanoTime = System.nanoTime();
        if (j != 0 && z7) {
            node.f2611g = Math.min(j, node.c() - nanoTime) + nanoTime;
        } else if (j != 0) {
            node.f2611g = nanoTime + j;
        } else {
            if (!z7) {
                throw new AssertionError();
            }
            node.f2611g = node.c();
        }
        p pVar2 = T6.d.f2604h;
        Intrinsics.checkNotNullParameter(node, "node");
        int i2 = pVar2.f233b + 1;
        pVar2.f233b = i2;
        T6.d[] dVarArr = (T6.d[]) pVar2.f234c;
        if (i2 == dVarArr.length) {
            T6.d[] dVarArr2 = new T6.d[i2 * 2];
            kotlin.collections.o.f(dVarArr, dVarArr2, 0, 0, 14);
            pVar2.f234c = dVarArr2;
        }
        pVar2.d(i2, node);
        if (node.f2610f == 1) {
            T6.d.f2606k.signal();
        }
    }

    public static T6.d i() {
        p pVar = T6.d.f2604h;
        T6.d dVar = ((T6.d[]) pVar.f234c)[1];
        if (dVar == null) {
            long nanoTime = System.nanoTime();
            T6.d.f2606k.await(T6.d.f2607l, TimeUnit.MILLISECONDS);
            if (((T6.d[]) pVar.f234c)[1] != null || System.nanoTime() - nanoTime < T6.d.f2608m) {
                return null;
            }
            return T6.d.f2605i;
        }
        long nanoTime2 = dVar.f2611g - System.nanoTime();
        if (nanoTime2 > 0) {
            T6.d.f2606k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        pVar.i(dVar);
        dVar.f2609e = 2;
        return dVar;
    }

    @Override // O6.l
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return kotlin.text.p.l(name, "com.google.android.gms.org.conscrypt.");
    }

    @Override // O6.l
    public n b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        e eVar = O6.e.f1936e;
        Class<?> cls = sslSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new O6.e(cls2);
    }

    @Override // l0.InterfaceC0655b
    public InterfaceC0656c c(H6.h configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new m0.h((Context) configuration.f1052c, (String) configuration.f1053d, (B6.o) configuration.f1054e, configuration.f1050a, configuration.f1051b);
    }

    @Override // j1.InterfaceC0568a
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // d0.InterfaceC0352a
    public CharSequence e(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f3932d.getString(R.string.not_set);
        }
        return null;
    }

    @Override // K1.g
    public K1.p f(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = C0820c.f7160h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? AbstractC1053a.w(bundle) : AbstractC1053a.w(null);
    }

    @Override // s4.d
    public void g(ByteBuffer byteBuffer, C0578g c0578g) {
        x.f7777b.getClass();
        x.c(byteBuffer);
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // e0.d
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // e0.d
    public void m(int i2, Object obj) {
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
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
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
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // s4.o
    public void onMethodCall(s4.n nVar, s4.p pVar) {
        ((r4.l) pVar).success(null);
    }
}
