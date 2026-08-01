package s7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.f6;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p4 extends x1 {

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f8918w = {"firebase_", "google_", "ga_"};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f8919x = {"_err"};

    /* renamed from: i, reason: collision with root package name */
    public SecureRandom f8920i;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicLong f8921r;

    /* renamed from: s, reason: collision with root package name */
    public int f8922s;

    /* renamed from: t, reason: collision with root package name */
    public w4.a f8923t;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f8924u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f8925v;

    public p4(q1 q1Var) {
        super(q1Var);
        this.f8925v = null;
        this.f8921r = new AtomicLong(0L);
    }

    public static boolean E0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void K(o4 o4Var, String str, int i3, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        Q(bundle, i3);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i3 == 6 || i3 == 7 || i3 == 2) {
            bundle.putLong("_el", i10);
        }
        o4Var.a(str, "_err", bundle);
    }

    public static MessageDigest L() {
        MessageDigest messageDigest;
        for (int i3 = 0; i3 < 2; i3++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long M(byte[] bArr) {
        c7.c0.g(bArr);
        int length = bArr.length;
        int i3 = 0;
        c7.c0.j(length > 0);
        long j = 0;
        for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
            j += (bArr[i10] & 255) << i3;
            i3 += 8;
        }
        return j;
    }

    public static boolean N(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static final boolean Q(Bundle bundle, int i3) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i3);
        return true;
    }

    public static boolean T(String str, String[] strArr) {
        c7.c0.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean U(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean W(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] b0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList m0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", eVar.f8594d);
            bundle.putString("origin", eVar.f8595e);
            bundle.putLong("creation_timestamp", eVar.f8597r);
            bundle.putString("name", eVar.f8596i.f8852e);
            Object b10 = eVar.f8596i.b();
            c7.c0.g(b10);
            d2.c(bundle, b10);
            bundle.putBoolean("active", eVar.f8598s);
            String str = eVar.f8599t;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            u uVar = eVar.f8600u;
            if (uVar != null) {
                bundle.putString("timed_out_event_name", uVar.f9035d);
                t tVar = uVar.f9036e;
                if (tVar != null) {
                    bundle.putBundle("timed_out_event_params", tVar.f());
                }
            }
            bundle.putLong("trigger_timeout", eVar.f8601v);
            u uVar2 = eVar.f8602w;
            if (uVar2 != null) {
                bundle.putString("triggered_event_name", uVar2.f9035d);
                t tVar2 = uVar2.f9036e;
                if (tVar2 != null) {
                    bundle.putBundle("triggered_event_params", tVar2.f());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.f8596i.f8853i);
            bundle.putLong("time_to_live", eVar.f8603x);
            u uVar3 = eVar.f8604y;
            if (uVar3 != null) {
                bundle.putString("expired_event_name", uVar3.f9035d);
                t tVar3 = uVar3.f9036e;
                if (tVar3 != null) {
                    bundle.putBundle("expired_event_params", tVar3.f());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean n0(Context context) {
        ActivityInfo receiverInfo;
        c7.c0.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void o0(y2 y2Var, Bundle bundle, boolean z10) {
        if (bundle != null && y2Var != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = y2Var.f9126a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = y2Var.f9127b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", y2Var.f9128c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && y2Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean s0(String str) {
        c7.c0.d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean u0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String z(String str, boolean z10, int i3) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i3) {
                return str;
            }
            if (z10) {
                return str.substring(0, str.offsetByCodePoints(0, i3)).concat("...");
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A(String str, String str2, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i3;
        boolean W;
        int i10;
        int size;
        q1 q1Var = (q1) this.f1478d;
        s();
        int i11 = 0;
        if (E0(obj)) {
            if (!z11) {
                return 21;
            }
            if (!T(str2, d2.j)) {
                return 20;
            }
            l3 o6 = q1Var.o();
            o6.s();
            o6.t();
            if (o6.z()) {
                p4 p4Var = ((q1) o6.f1478d).f8940w;
                q1.j(p4Var);
                if (p4Var.d0() < 200900) {
                    return 25;
                }
            }
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9055y.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i3 = 17;
                if (z12) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                W = W(str);
                i10 = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
                if (!W || W(str2)) {
                    q1Var.f8935r.getClass();
                    i10 = Math.max(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 256);
                } else {
                    q1Var.f8935r.getClass();
                }
                if (!w("param", str2, i10, obj)) {
                    if (!z11) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        x(str, str2, (Bundle) obj, list, z10);
                        return i3;
                    }
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        int length = parcelableArr2.length;
                        while (i11 < length) {
                            Parcelable parcelable = parcelableArr2[i11];
                            if (!(parcelable instanceof Bundle)) {
                                v0 v0Var2 = q1Var.f8937t;
                                q1.l(v0Var2);
                                v0Var2.f9055y.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            x(str, str2, (Bundle) parcelable, list, z10);
                            i11++;
                        }
                    } else {
                        if (!(obj instanceof ArrayList)) {
                            return 4;
                        }
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            if (!(obj2 instanceof Bundle)) {
                                v0 v0Var3 = q1Var.f8937t;
                                q1.l(v0Var3);
                                v0Var3.f9055y.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            x(str, str2, (Bundle) obj2, list, z10);
                            i11++;
                        }
                    }
                }
                return i3;
            }
        }
        i3 = 0;
        W = W(str);
        i10 = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        if (W) {
        }
        q1Var.f8935r.getClass();
        i10 = Math.max(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 256);
        if (!w("param", str2, i10, obj)) {
        }
        return i3;
    }

    public final boolean A0(String str) {
        return ((q1) this.f1478d).f8935r.D(null, e0.f8622f1) ? T(str, d2.f8584e) : T(str, d2.f8583d);
    }

    public final Object B(Object obj, String str) {
        q1 q1Var = (q1) this.f1478d;
        boolean equals = "_ev".equals(str);
        int i3 = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        if (equals) {
            q1Var.f8935r.getClass();
            return R(Math.max(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 256), obj, true, true);
        }
        if (W(str)) {
            q1Var.f8935r.getClass();
            i3 = Math.max(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 256);
        } else {
            q1Var.f8935r.getClass();
        }
        return R(i3, obj, false, true);
    }

    public final int B0(String str) {
        if (!w0("user property", str)) {
            return 6;
        }
        if (!x0("user property", d2.f8589l, null, str)) {
            return 15;
        }
        ((q1) this.f1478d).getClass();
        return !y0(24, "user property", str) ? 6 : 0;
    }

    public final Bundle C(String str, Bundle bundle, List list, boolean z10) {
        int C0;
        List list2 = list;
        boolean T = T(str, d2.g);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        q1 q1Var = (q1) this.f1478d;
        g gVar = q1Var.f8935r;
        p0 p0Var = q1Var.f8941x;
        p4 p4Var = ((q1) gVar.f1478d).f8940w;
        q1.j(p4Var);
        int i3 = p4Var.c0(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                C0 = !z10 ? C0(str2) : 0;
                if (C0 == 0) {
                    C0 = D0(str2);
                }
            } else {
                C0 = 0;
            }
            if (C0 != 0) {
                G(bundle2, C0, str2, C0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int A = A(str, str2, bundle.get(str2), bundle2, list2, z10, T);
                if (A == 17) {
                    G(bundle2, 17, str2, Boolean.FALSE);
                } else if (A != 0 && !"_ev".equals(str2)) {
                    G(bundle2, A, A == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (s0(str2)) {
                    i10++;
                    if (i10 > i3) {
                        if (!z11) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i3);
                            sb2.append(" params");
                            String sb3 = sb2.toString();
                            v0 v0Var = q1Var.f8937t;
                            q1.l(v0Var);
                            v0Var.f9052v.c(p0Var.a(str), p0Var.e(bundle), sb3);
                        }
                        Q(bundle2, 5);
                        bundle2.remove(str2);
                        z11 = true;
                    }
                    list2 = list;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final int C0(String str) {
        if (!v0("event param", str)) {
            return 3;
        }
        if (!x0("event param", null, null, str)) {
            return 14;
        }
        ((q1) this.f1478d).getClass();
        return !y0(40, "event param", str) ? 3 : 0;
    }

    public final void D(w0 w0Var, int i3) {
        Bundle bundle = w0Var.f9081e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (s0(str) && (i10 = i10 + 1) > i3) {
                if (!z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i3);
                    sb2.append(" params");
                    String sb3 = sb2.toString();
                    q1 q1Var = (q1) this.f1478d;
                    v0 v0Var = q1Var.f8937t;
                    p0 p0Var = q1Var.f8941x;
                    q1.l(v0Var);
                    v0Var.f9052v.c(p0Var.a(w0Var.f9077a), p0Var.e(bundle), sb3);
                    Q(bundle, 5);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    public final int D0(String str) {
        if (!w0("event param", str)) {
            return 3;
        }
        if (!x0("event param", null, null, str)) {
            return 14;
        }
        ((q1) this.f1478d).getClass();
        return !y0(40, "event param", str) ? 3 : 0;
    }

    public final void E(Parcelable[] parcelableArr, int i3) {
        c7.c0.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            boolean z10 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (s0(str) && !T(str, d2.f8588k) && (i10 = i10 + 1) > i3) {
                    if (!z10) {
                        q1 q1Var = (q1) this.f1478d;
                        v0 v0Var = q1Var.f8937t;
                        p0 p0Var = q1Var.f8941x;
                        q1.l(v0Var);
                        t0 t0Var = v0Var.f9052v;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i3);
                        sb2.append(" item-scoped custom parameters");
                        t0Var.c(p0Var.b(str), p0Var.e(bundle), sb2.toString());
                    }
                    Q(bundle, 28);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    public final void F(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                p4 p4Var = ((q1) this.f1478d).f8940w;
                q1.j(p4Var);
                p4Var.J(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void G(Bundle bundle, int i3, String str, Object obj) {
        if (Q(bundle, i3)) {
            ((q1) this.f1478d).getClass();
            bundle.putString("_ev", z(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int H(Object obj, String str) {
        return "_ldl".equals(str) ? w("user property referrer", str, S(str), obj) : w("user property", str, S(str), obj) ? 0 : 7;
    }

    public final Object I(Object obj, String str) {
        return "_ldl".equals(str) ? R(S(str), obj, true, false) : R(S(str), obj, false, false);
    }

    public final void J(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            q1 q1Var = (q1) this.f1478d;
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9055y.c(q1Var.f8941x.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final w4.a O() {
        x4.c cVar;
        Object obj;
        if (this.f8923t == null) {
            Context context = ((q1) this.f1478d).f8932d;
            context.getClass();
            StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
            int i3 = Build.VERSION.SDK_INT;
            u4.b bVar = u4.b.f9610a;
            sb2.append(i3 >= 33 ? bVar.a() : 0);
            Log.d("MeasurementManager", sb2.toString());
            if ((i3 >= 33 ? bVar.a() : 0) >= 5) {
                Object systemService = context.getSystemService((Class<Object>) com.appsflyer.internal.l.j());
                systemService.getClass();
                cVar = new x4.b(com.appsflyer.internal.l.e(systemService));
            } else {
                u4.a aVar = u4.a.f9609a;
                if (((i3 == 31 || i3 == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        obj = new a3.e(24, context).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i10 = Build.VERSION.SDK_INT;
                        sb3.append((i10 == 31 || i10 == 32) ? aVar.a() : 0);
                        Log.d("MeasurementManager", sb3.toString());
                        obj = null;
                    }
                    cVar = (x4.c) obj;
                } else {
                    cVar = null;
                }
            }
            this.f8923t = cVar != null ? new w4.a(cVar) : null;
        }
        return this.f8923t;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long P() {
        int extensionVersion;
        int i3;
        long j;
        int extensionVersion2;
        Object e2;
        Integer num;
        s();
        q1 q1Var = (q1) this.f1478d;
        m0 q3 = q1Var.q();
        v0 v0Var = q1Var.f8937t;
        Integer num2 = null;
        if (!U((String) e0.f8645q0.a(null), q3.y())) {
            return 0L;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 30) {
            j = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j = 8;
            } else {
                if (i10 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion2 > 3) {
                        i3 = SdkExtensions.getExtensionVersion(1000000);
                        j = i3 >= ((Integer) e0.f8633k0.a(null)).intValue() ? 16L : 0L;
                    }
                }
                i3 = 0;
                if (i3 >= ((Integer) e0.f8633k0.a(null)).intValue()) {
                }
            }
        }
        if (!V("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.f8924u == null) {
                w4.a O = O();
                if (O != null) {
                    try {
                        num = (Integer) O.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    z10 = true;
                                }
                            } catch (InterruptedException e9) {
                                e2 = e9;
                                num2 = num;
                                q1.l(v0Var);
                                v0Var.f9053w.b(e2, "Measurement manager api exception");
                                this.f8924u = Boolean.FALSE;
                                num = num2;
                                q1.l(v0Var);
                                v0Var.B.b(num, "Measurement manager api status result");
                                z10 = this.f8924u.booleanValue();
                                if (!z10) {
                                }
                                if (j == 0) {
                                }
                            } catch (CancellationException e10) {
                                e2 = e10;
                                num2 = num;
                                q1.l(v0Var);
                                v0Var.f9053w.b(e2, "Measurement manager api exception");
                                this.f8924u = Boolean.FALSE;
                                num = num2;
                                q1.l(v0Var);
                                v0Var.B.b(num, "Measurement manager api status result");
                                z10 = this.f8924u.booleanValue();
                                if (!z10) {
                                }
                                if (j == 0) {
                                }
                            } catch (ExecutionException e11) {
                                e2 = e11;
                                num2 = num;
                                q1.l(v0Var);
                                v0Var.f9053w.b(e2, "Measurement manager api exception");
                                this.f8924u = Boolean.FALSE;
                                num = num2;
                                q1.l(v0Var);
                                v0Var.B.b(num, "Measurement manager api status result");
                                z10 = this.f8924u.booleanValue();
                                if (!z10) {
                                }
                                if (j == 0) {
                                }
                            } catch (TimeoutException e12) {
                                e2 = e12;
                                num2 = num;
                                q1.l(v0Var);
                                v0Var.f9053w.b(e2, "Measurement manager api exception");
                                this.f8924u = Boolean.FALSE;
                                num = num2;
                                q1.l(v0Var);
                                v0Var.B.b(num, "Measurement manager api status result");
                                z10 = this.f8924u.booleanValue();
                                if (!z10) {
                                }
                                if (j == 0) {
                                }
                            }
                        }
                        this.f8924u = Boolean.valueOf(z10);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e13) {
                        e2 = e13;
                    }
                    q1.l(v0Var);
                    v0Var.B.b(num, "Measurement manager api status result");
                }
                if (!z10) {
                    j = 64;
                }
            }
            z10 = this.f8924u.booleanValue();
            if (!z10) {
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final Object R(int i3, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return obj;
        }
        if (obj instanceof Double) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return z(obj.toString(), z10, i3);
        }
        if (!z11) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle Y = Y((Bundle) parcelable);
                if (!Y.isEmpty()) {
                    arrayList.add(Y);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int S(String str) {
        q1 q1Var = (q1) this.f1478d;
        if ("_ldl".equals(str)) {
            q1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            q1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            q1Var.getClass();
            return 100;
        }
        q1Var.getClass();
        return 36;
    }

    public final boolean V(String str) {
        s();
        q1 q1Var = (q1) this.f1478d;
        if (i7.b.a(q1Var.f8932d).f1772d.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        v0Var.A.b(str, "Permission not granted");
        return false;
    }

    public final boolean X(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((q1) this.f1478d).f8935r.w("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle Y(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object B = B(bundle.get(str), str);
                if (B == null) {
                    q1 q1Var = (q1) this.f1478d;
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.f9055y.b(q1Var.f8941x.b(str), "Param value can't be null");
                } else {
                    J(bundle2, str, B);
                }
            }
        }
        return bundle2;
    }

    public final u Z(String str, Bundle bundle, String str2, long j, long j3, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z0(str) != 0) {
            q1 q1Var = (q1) this.f1478d;
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(q1Var.f8941x.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle C = C(str, bundle2, Collections.singletonList("_o"), true);
        if (z10) {
            C = Y(C);
        }
        c7.c0.g(C);
        return new u(str, new t(C), str2, j, j3);
    }

    public final boolean a0(Context context, String str) {
        Signature[] signatureArr;
        q1 q1Var = (q1) this.f1478d;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e2 = i7.b.a(context).e(64, str);
            if (e2 == null || (signatureArr = e2.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e9) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(e9, "Package name not found");
            return true;
        } catch (CertificateException e10) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.b(e10, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean c0(int i3) {
        Boolean bool = ((q1) this.f1478d).o().f8814s;
        if (d0() < i3 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int d0() {
        if (this.f8925v == null) {
            q1 q1Var = (q1) this.f1478d;
            z6.g gVar = z6.g.f10882b;
            Context context = q1Var.f8932d;
            gVar.getClass();
            int i3 = z6.i.f10887e;
            int i10 = 0;
            try {
                i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f8925v = Integer.valueOf(i10 / 1000);
        }
        return this.f8925v.intValue();
    }

    public final void e0(Bundle bundle, long j) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(Long.valueOf(j3), "Params already contained engagement");
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j + j3);
    }

    public final void f0(String str, f6 f6Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            f6Var.j(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(e2, "Error returning string value to wrapper");
        }
    }

    public final void g0(f6 f6Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            f6Var.j(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(e2, "Error returning long value to wrapper");
        }
    }

    public final void h0(f6 f6Var, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i3);
        try {
            f6Var.j(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(e2, "Error returning int value to wrapper");
        }
    }

    public final void i0(f6 f6Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            f6Var.j(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(e2, "Error returning byte array to wrapper");
        }
    }

    public final void j0(f6 f6Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            f6Var.j(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(e2, "Error returning boolean value to wrapper");
        }
    }

    public final void k0(f6 f6Var, Bundle bundle) {
        try {
            f6Var.j(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(e2, "Error returning bundle value to wrapper");
        }
    }

    public final void l0(f6 f6Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            f6Var.j(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(e2, "Error returning bundle list to wrapper");
        }
    }

    public final String p0() {
        byte[] bArr = new byte[16];
        r0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long q0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f8921r;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f8921r;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((q1) this.f1478d).f8942y.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i3 = this.f8922s + 1;
            this.f8922s = i3;
            j = nextLong + i3;
        }
        return j;
    }

    public final SecureRandom r0() {
        s();
        if (this.f8920i == null) {
            this.f8920i = new SecureRandom();
        }
        return this.f8920i;
    }

    @Override // s7.x1
    public final boolean t() {
        return true;
    }

    public final Bundle t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        q1 q1Var = (q1) this.f1478d;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("gbraid");
                    str6 = uri.getQueryParameter("utm_id");
                    str7 = uri.getQueryParameter("dclid");
                    str8 = uri.getQueryParameter("srsltid");
                    str9 = uri.getQueryParameter("sfmc_id");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                    str9 = null;
                }
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str7) || !TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str9)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putString("campaign", str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        bundle.putString("source", str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("medium", str3);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        bundle.putString("gclid", str4);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        bundle.putString("gbraid", str5);
                    }
                    String queryParameter = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("gad_source", queryParameter);
                    }
                    String queryParameter2 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("term", queryParameter2);
                    }
                    String queryParameter3 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("content", queryParameter3);
                    }
                    String queryParameter4 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    String queryParameter5 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("cp1", queryParameter5);
                    }
                    String queryParameter6 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("anid", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("campaign_id", str6);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        bundle.putString("dclid", str7);
                    }
                    String queryParameter7 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("source_platform", queryParameter7);
                    }
                    String queryParameter8 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("creative_format", queryParameter8);
                    }
                    String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("marketing_tactic", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(str8)) {
                        bundle.putString("srsltid", str8);
                    }
                    if (!TextUtils.isEmpty(str9)) {
                        bundle.putString("sfmc_id", str9);
                    }
                    for (String str10 : uri.getQueryParameterNames()) {
                        if (str10.startsWith("gad_")) {
                            String queryParameter10 = uri.getQueryParameter(str10);
                            if (!TextUtils.isEmpty(queryParameter10)) {
                                bundle.putString(str10, queryParameter10);
                            }
                        }
                    }
                    if (q1Var.f8935r.D(null, e0.f8607a1)) {
                        String uri2 = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        q1Var.f8935r.getClass();
                        int max = Math.max(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 256);
                        if (uri2.length() > max) {
                            uri2 = z(uri2, true, max - 3);
                        }
                        if (!TextUtils.isEmpty(uri2)) {
                            bundle.putString("deep_link_url", uri2);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e2) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9053w.b(e2, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean v0(String str, String str2) {
        q1 q1Var = (q1) this.f1478d;
        if (str2 == null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9052v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9052v.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            v0 v0Var3 = q1Var.f8937t;
            q1.l(v0Var3);
            v0Var3.f9052v.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                v0 v0Var4 = q1Var.f8937t;
                q1.l(v0Var4);
                v0Var4.f9052v.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean w(String str, String str2, int i3, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i3) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9055y.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
            return false;
        }
        return true;
    }

    public final boolean w0(String str, String str2) {
        q1 q1Var = (q1) this.f1478d;
        if (str2 == null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9052v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9052v.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                v0 v0Var3 = q1Var.f8937t;
                q1.l(v0Var3);
                v0Var3.f9052v.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                v0 v0Var4 = q1Var.f8937t;
                q1.l(v0Var4);
                v0Var4.f9052v.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final void x(String str, String str2, Bundle bundle, List list, boolean z10) {
        int C0;
        int A;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        q1 q1Var = (q1) this.f1478d;
        g gVar = q1Var.f8935r;
        v0 v0Var = q1Var.f8937t;
        p0 p0Var = q1Var.f8941x;
        p4 p4Var = ((q1) gVar.f1478d).f8940w;
        q1.j(p4Var);
        int i3 = true != p4Var.c0(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list2 == null || !list2.contains(str3)) {
                C0 = !z10 ? C0(str3) : 0;
                if (C0 == 0) {
                    C0 = D0(str3);
                }
            } else {
                C0 = 0;
            }
            if (C0 != 0) {
                G(bundle, C0, str3, C0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (E0(bundle.get(str3))) {
                    q1.l(v0Var);
                    v0Var.f9055y.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    A = 22;
                } else {
                    A = A(str, str3, bundle.get(str3), bundle, list2, z10, false);
                }
                if (A != 0 && !"_ev".equals(str3)) {
                    G(bundle, A, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (s0(str3) && !T(str3, d2.f8588k)) {
                    i10++;
                    if (!c0(231100000)) {
                        q1.l(v0Var);
                        v0Var.f9052v.c(p0Var.a(str), p0Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        Q(bundle, 23);
                        bundle.remove(str3);
                    } else if (i10 > i3) {
                        if (!z11) {
                            q1.l(v0Var);
                            t0 t0Var = v0Var.f9052v;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i3);
                            sb2.append(" item-scoped custom params");
                            t0Var.c(p0Var.a(str), p0Var.e(bundle), sb2.toString());
                        }
                        Q(bundle, 28);
                        bundle.remove(str3);
                        list2 = list;
                        z11 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean x0(String str, String[] strArr, String[] strArr2, String str2) {
        q1 q1Var = (q1) this.f1478d;
        if (str2 == null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9052v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i3 = 0; i3 < 3; i3++) {
            if (str2.startsWith(f8918w[i3])) {
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                v0Var2.f9052v.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !T(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && T(str2, strArr2)) {
            return true;
        }
        v0 v0Var3 = q1Var.f8937t;
        q1.l(v0Var3);
        v0Var3.f9052v.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean y(String str) {
        q1 q1Var = (q1) this.f1478d;
        if (TextUtils.isEmpty(str)) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9052v.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        c7.c0.g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        v0 v0Var2 = q1Var.f8937t;
        q1.l(v0Var2);
        v0Var2.f9052v.b(v0.A(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean y0(int i3, String str, String str2) {
        q1 q1Var = (q1) this.f1478d;
        if (str2 == null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9052v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i3) {
            return true;
        }
        v0 v0Var2 = q1Var.f8937t;
        q1.l(v0Var2);
        v0Var2.f9052v.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i3), str2);
        return false;
    }

    public final int z0(String str) {
        if (!w0("event", str)) {
            return 2;
        }
        if (x0("event", d2.f8580a, ((q1) this.f1478d).f8935r.D(null, e0.f8622f1) ? d2.f8582c : d2.f8581b, str)) {
            return !y0(40, "event", str) ? 2 : 0;
        }
        return 13;
    }
}
