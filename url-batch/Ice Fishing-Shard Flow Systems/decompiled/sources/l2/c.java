package l2;

import I.C0110f;
import I.InterfaceC0107c;
import K1.d;
import K1.e;
import L1.f;
import N1.h;
import P.C0137b;
import P.C0154t;
import P.InterfaceC0138c;
import P.InterfaceC0144i;
import T6.g;
import T6.i;
import X5.j;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC0228t;
import androidx.fragment.app.M;
import androidx.fragment.app.Q;
import androidx.profileinstaller.ProfileInstallReceiver;
import c1.InterfaceC0289b;
import c4.EnumC0298d;
import com.appsflyer.attribution.RequestError;
import f.C0382a;
import f.InterfaceC0383b;
import g0.AbstractC0440t;
import g0.C0441u;
import g0.InterfaceC0419L;
import i.C0508J;
import i0.AbstractC0540a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.k;
import m.m;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class c implements InterfaceC0107c, e, d, K1.c, h, q6.d, InterfaceC0138c, InterfaceC0144i, InterfaceC0383b, e0.d, InterfaceC0419L, InterfaceC0289b, k {

    /* renamed from: e, reason: collision with root package name */
    public static volatile c f6268e;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6269d;

    public /* synthetic */ c(Object obj) {
        this.f6269d = obj;
    }

    public static boolean B(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String E(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static ArrayList w(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (Build.VERSION.SDK_INT >= 35 && networkCapabilities.hasTransport(10)) {
            arrayList.add("satellite");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }

    public String A(String str) {
        Bundle bundle = (Bundle) this.f6269d;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle C() {
        Bundle bundle = (Bundle) this.f6269d;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void D(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f6269d;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i2 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = G0.h.f808b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i2 < zArr.length) {
                            boolArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = G0.h.f808b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i2 < bArr.length) {
                            bArr2[i2] = Byte.valueOf(bArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = G0.h.f808b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i2 < iArr.length) {
                            numArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = G0.h.f808b;
                        Long[] lArr = new Long[jArr.length];
                        while (i2 < jArr.length) {
                            lArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = G0.h.f808b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i2 < fArr.length) {
                            fArr2[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = G0.h.f808b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i2 < dArr.length) {
                            dArr2[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public void F(i value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((g) this.f6269d).z(value);
    }

    public void G(int i2, EnumC0298d fieldEncoding) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        H((i2 << 3) | fieldEncoding.f4217d);
    }

    public void H(int i2) {
        g gVar = (g) this.f6269d;
        while ((i2 & (-128)) != 0) {
            gVar.writeByte((i2 & 127) | 128);
            i2 >>>= 7;
        }
        gVar.writeByte(i2);
    }

    public void I(long j) {
        g gVar = (g) this.f6269d;
        while (((-128) & j) != 0) {
            gVar.writeByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        gVar.writeByte((int) j);
    }

    @Override // P.InterfaceC0144i
    public Object a(Function2 function2, j jVar) {
        return ((InterfaceC0144i) this.f6269d).a(new T.c(function2, null), jVar);
    }

    @Override // N1.j
    public /* bridge */ /* synthetic */ Object b() {
        return new L1.b((f) ((N1.j) this.f6269d).b());
    }

    @Override // I.InterfaceC0107c
    public C0110f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f6269d).build();
        return new C0110f(new B.f(build));
    }

    @Override // f.InterfaceC0383b
    public void c(Object obj) {
        C0382a c0382a = (C0382a) obj;
        Q q4 = (Q) this.f6269d;
        M m2 = (M) q4.f3602E.pollLast();
        if (m2 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = m2.f3593d;
        int i2 = m2.f3594e;
        ComponentCallbacksC0228t d7 = q4.f3615c.d(str);
        if (d7 != null) {
            d7.l(i2, c0382a.f4737d, c0382a.f4738e);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // m.k
    public boolean d(m mVar, MenuItem menuItem) {
        return false;
    }

    @Override // q6.d
    public Object e(q6.e eVar, V5.b bVar) {
        Object e7 = ((P0.e) this.f6269d).e(new C0154t(eVar, 0), bVar);
        return e7 == W5.a.f2787d ? e7 : Unit.f6114a;
    }

    @Override // P.InterfaceC0138c
    public Object f(C0137b c0137b) {
        return ((U1.a) this.f6269d).invoke(c0137b);
    }

    @Override // g0.InterfaceC0419L
    public int g() {
        AbstractC0440t abstractC0440t = (AbstractC0440t) this.f6269d;
        return abstractC0440t.f4968g - abstractC0440t.r();
    }

    @Override // Q5.a
    public Object get() {
        return new h1.j(Integer.valueOf(h1.j.f5143l).intValue(), (Context) ((Q5.a) this.f6269d).get(), "com.google.android.datatransport.events");
    }

    @Override // P.InterfaceC0144i
    public q6.d getData() {
        return ((InterfaceC0144i) this.f6269d).getData();
    }

    @Override // g0.InterfaceC0419L
    public int h(View view) {
        return (view.getTop() - ((C0441u) view.getLayoutParams()).f4969a.top) - ((ViewGroup.MarginLayoutParams) ((C0441u) view.getLayoutParams())).topMargin;
    }

    @Override // K1.c
    public void i() {
        ((CountDownLatch) this.f6269d).countDown();
    }

    @Override // m.k
    public void j(m mVar) {
        C0508J c0508j = (C0508J) this.f6269d;
        Window.Callback callback = c0508j.f5370b;
        if (c0508j.f5369a.f6886a.o()) {
            callback.onPanelClosed(108, mVar);
        } else if (callback.onPreparePanel(0, null, mVar)) {
            callback.onMenuOpened(108, mVar);
        }
    }

    @Override // K1.e
    public void k(Object obj) {
        ((CountDownLatch) this.f6269d).countDown();
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
        ((ProfileInstallReceiver) this.f6269d).setResultCode(i2);
    }

    @Override // g0.InterfaceC0419L
    public View n(int i2) {
        return ((AbstractC0440t) this.f6269d).o(i2);
    }

    @Override // g0.InterfaceC0419L
    public int p() {
        return ((AbstractC0440t) this.f6269d).u();
    }

    @Override // I.InterfaceC0107c
    public void q(Uri uri) {
        ((ContentInfo.Builder) this.f6269d).setLinkUri(uri);
    }

    @Override // g0.InterfaceC0419L
    public int r(View view) {
        return view.getBottom() + ((C0441u) view.getLayoutParams()).f4969a.bottom + ((ViewGroup.MarginLayoutParams) ((C0441u) view.getLayoutParams())).bottomMargin;
    }

    @Override // K1.d
    public void s(Exception exc) {
        ((CountDownLatch) this.f6269d).countDown();
    }

    @Override // I.InterfaceC0107c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f6269d).setExtras(bundle);
    }

    @Override // I.InterfaceC0107c
    public void t(int i2) {
        ((ContentInfo.Builder) this.f6269d).setFlags(i2);
    }

    public void u(AbstractC0540a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        for (AbstractC0540a abstractC0540a : migrations) {
            int i2 = abstractC0540a.f5496a;
            int i5 = abstractC0540a.f5497b;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6269d;
            Integer valueOf = Integer.valueOf(i2);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i5))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i5)) + " with " + abstractC0540a);
            }
            treeMap.put(Integer.valueOf(i5), abstractC0540a);
        }
    }

    public boolean v(String str) {
        String A7 = A(str);
        return "1".equals(A7) || Boolean.parseBoolean(A7);
    }

    public Integer x(String str) {
        String A7 = A(str);
        if (TextUtils.isEmpty(A7)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A7));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + E(str) + "(" + A7 + ") into an int");
            return null;
        }
    }

    public JSONArray y(String str) {
        String A7 = A(str);
        if (TextUtils.isEmpty(A7)) {
            return null;
        }
        try {
            return new JSONArray(A7);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + E(str) + ": " + A7 + ", falling back to default");
            return null;
        }
    }

    public String z(Resources resources, String str, String str2) {
        String[] strArr;
        String A7 = A(str2);
        if (!TextUtils.isEmpty(A7)) {
            return A7;
        }
        String A8 = A(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(A8)) {
            return null;
        }
        int identifier = resources.getIdentifier(A8, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", E(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray y7 = y(str2.concat("_loc_args"));
        if (y7 == null) {
            strArr = null;
        } else {
            int length = y7.length();
            strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = y7.optString(i2);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e7) {
            Log.w("NotificationParams", "Missing format argument for " + E(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e7);
            return null;
        }
    }

    public c(E3.f platformProvider) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        this.f6269d = platformProvider;
    }

    public c(int i2) {
        Handler handler;
        Handler handler2;
        switch (i2) {
            case 1:
                this.f6269d = new ConcurrentHashMap(16);
                return;
            case 4:
                this.f6269d = new HashMap();
                return;
            case 5:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = C.b.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f6269d = handler2;
                        return;
                    } catch (InstantiationException e8) {
                        e = e8;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f6269d = handler2;
                        return;
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f6269d = handler2;
                        return;
                    } catch (InvocationTargetException e10) {
                        Throwable cause = e10.getCause();
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
                this.f6269d = handler2;
                return;
            case 6:
                this.f6269d = new LinkedHashSet();
                return;
            case 9:
                this.f6269d = new CountDownLatch(1);
                return;
            case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                this.f6269d = new LinkedHashMap();
                return;
            default:
                this.f6269d = new HashSet();
                return;
        }
    }

    public c(U1.a produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f6269d = produceNewData;
    }

    public c(Bundle bundle) {
        this.f6269d = new Bundle(bundle);
    }

    public c(g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f6269d = sink;
    }

    public c(InterfaceC0144i delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6269d = delegate;
    }

    public c(TextView textView) {
        this.f6269d = new W.g(textView);
    }

    public c(ClipData clipData, int i2) {
        this.f6269d = B.e.j(clipData, i2);
    }
}
