package defpackage;

import android.content.ComponentName;
import android.content.Context;
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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.ServiceStarter;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zq3 extends ok3 {
    public static final String[] u = {"firebase_", "google_", "ga_"};
    public static final String[] v = {"_err"};
    public SecureRandom o;
    public final AtomicLong p;
    public int q;
    public uj1 r;
    public Boolean s;
    public Integer t;

    public zq3(pj3 pj3Var) {
        super(pj3Var);
        this.t = null;
        this.p = new AtomicLong(0L);
    }

    public static String B(String str, int i, boolean z) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
            }
        }
        return null;
    }

    public static boolean F0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void M(xq3 xq3Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        q0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        xq3Var.zza(str, "_err", bundle);
    }

    public static MessageDigest N() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
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

    public static long O(byte[] bArr) {
        ll3.v(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i = 0;
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean P(Context context) {
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

    public static int R() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static boolean T(String str) {
        String str2 = (String) ug3.r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean W(String str, String[] strArr) {
        ll3.v(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
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
            yb3 yb3Var = (yb3) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", yb3Var.m);
            bundle.putString(FirebaseAnalytics.Param.ORIGIN, yb3Var.n);
            bundle.putLong("creation_timestamp", yb3Var.p);
            bundle.putString("name", yb3Var.o.n);
            Object a = yb3Var.o.a();
            ll3.v(a);
            hl2.q(bundle, a);
            bundle.putBoolean("active", yb3Var.q);
            String str = yb3Var.r;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            kd3 kd3Var = yb3Var.s;
            if (kd3Var != null) {
                bundle.putString("timed_out_event_name", kd3Var.m);
                jd3 jd3Var = kd3Var.n;
                if (jd3Var != null) {
                    bundle.putBundle("timed_out_event_params", jd3Var.d());
                }
            }
            bundle.putLong("trigger_timeout", yb3Var.t);
            kd3 kd3Var2 = yb3Var.u;
            if (kd3Var2 != null) {
                bundle.putString("triggered_event_name", kd3Var2.m);
                jd3 jd3Var2 = kd3Var2.n;
                if (jd3Var2 != null) {
                    bundle.putBundle("triggered_event_params", jd3Var2.d());
                }
            }
            bundle.putLong("triggered_timestamp", yb3Var.o.o);
            bundle.putLong("time_to_live", yb3Var.v);
            kd3 kd3Var3 = yb3Var.w;
            if (kd3Var3 != null) {
                bundle.putString("expired_event_name", kd3Var3.m);
                jd3 jd3Var3 = kd3Var3.n;
                if (jd3Var3 != null) {
                    bundle.putBundle("expired_event_params", jd3Var3.d());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean n0(Context context) {
        ActivityInfo receiverInfo;
        ll3.v(context);
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

    public static void o0(tm3 tm3Var, Bundle bundle, boolean z) {
        if (bundle != null && tm3Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = tm3Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = tm3Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", tm3Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && tm3Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean q0(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean v0(String str) {
        ll3.s(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final boolean A(String str) {
        pj3 pj3Var = (pj3) this.m;
        if (TextUtils.isEmpty(str)) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.t.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        ll3.v(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        vh3 vh3Var2 = pj3Var.r;
        pj3.m(vh3Var2);
        vh3Var2.t.c(vh3.E(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean A0(int i, String str, String str2) {
        pj3 pj3Var = (pj3) this.m;
        if (str2 == null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.t.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        vh3 vh3Var2 = pj3Var.r;
        pj3.m(vh3Var2);
        vh3Var2.t.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final int B0(String str) {
        if (!y0("event", str)) {
            return 2;
        }
        if (!z0("event", s93.n, s93.o, str)) {
            return 13;
        }
        ((pj3) this.m).getClass();
        return !A0(40, "event", str) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        boolean V;
        int i2;
        int size;
        pj3 pj3Var = (pj3) this.m;
        v();
        int i3 = 0;
        if (F0(obj)) {
            if (!z2) {
                return 21;
            }
            if (!W(str2, bd3.j)) {
                return 20;
            }
            jo3 p = pj3Var.p();
            p.v();
            p.x();
            if (p.D()) {
                zq3 zq3Var = ((pj3) p.m).u;
                pj3.k(zq3Var);
                if (zq3Var.d0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.w.e("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
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
                V = V(str);
                i2 = ServiceStarter.ERROR_UNKNOWN;
                if (!V || V(str2)) {
                    pj3Var.p.getClass();
                    i2 = Math.max(ServiceStarter.ERROR_UNKNOWN, 256);
                } else {
                    pj3Var.p.getClass();
                }
                if (!G0("param", str2, i2, obj)) {
                    if (!z2) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        H0(str, str2, (Bundle) obj, list, z);
                        return i;
                    }
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        int length = parcelableArr2.length;
                        while (i3 < length) {
                            Parcelable parcelable = parcelableArr2[i3];
                            if (!(parcelable instanceof Bundle)) {
                                vh3 vh3Var2 = pj3Var.r;
                                pj3.m(vh3Var2);
                                vh3Var2.w.d(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            H0(str, str2, (Bundle) parcelable, list, z);
                            i3++;
                        }
                    } else {
                        if (!(obj instanceof ArrayList)) {
                            return 4;
                        }
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size2 = arrayList2.size();
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            if (!(obj2 instanceof Bundle)) {
                                vh3 vh3Var3 = pj3Var.r;
                                pj3.m(vh3Var3);
                                vh3Var3.w.d(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            H0(str, str2, (Bundle) obj2, list, z);
                            i3++;
                        }
                    }
                }
                return i;
            }
        }
        i = 0;
        V = V(str);
        i2 = ServiceStarter.ERROR_UNKNOWN;
        if (V) {
        }
        pj3Var.p.getClass();
        i2 = Math.max(ServiceStarter.ERROR_UNKNOWN, 256);
        if (!G0("param", str2, i2, obj)) {
        }
        return i;
    }

    public final int C0(String str) {
        if (!y0("user property", str)) {
            return 6;
        }
        if (!z0("user property", tk3.k, null, str)) {
            return 15;
        }
        ((pj3) this.m).getClass();
        return !A0(24, "user property", str) ? 6 : 0;
    }

    public final Object D(Object obj, String str) {
        pj3 pj3Var = (pj3) this.m;
        boolean equals = "_ev".equals(str);
        int i = ServiceStarter.ERROR_UNKNOWN;
        if (equals) {
            pj3Var.p.getClass();
            return r0(Math.max(ServiceStarter.ERROR_UNKNOWN, 256), obj, true, true);
        }
        if (V(str)) {
            pj3Var.p.getClass();
            i = Math.max(ServiceStarter.ERROR_UNKNOWN, 256);
        } else {
            pj3Var.p.getClass();
        }
        return r0(i, obj, false, true);
    }

    public final int D0(String str) {
        if (!x0("event param", str)) {
            return 3;
        }
        if (!z0("event param", null, null, str)) {
            return 14;
        }
        ((pj3) this.m).getClass();
        return !A0(40, "event param", str) ? 3 : 0;
    }

    public final Bundle E(String str, Bundle bundle, List list, boolean z) {
        int D0;
        String str2;
        List list2 = list;
        boolean W = W(str, s93.q);
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        pj3 pj3Var = (pj3) this.m;
        ec3 ec3Var = pj3Var.p;
        nh3 nh3Var = pj3Var.v;
        zq3 zq3Var = ((pj3) ec3Var.m).u;
        pj3.k(zq3Var);
        int i = zq3Var.c0(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                D0 = !z ? D0(str4) : 0;
                if (D0 == 0) {
                    D0 = E0(str4);
                }
            } else {
                D0 = 0;
            }
            if (D0 != 0) {
                I(bundle2, D0, str4, D0 == 3 ? str4 : str3);
                bundle2.remove(str4);
            } else {
                int C = C(str, str4, bundle.get(str4), bundle2, list2, z, W);
                if (C == 17) {
                    I(bundle2, 17, str4, Boolean.FALSE);
                } else if (C != 0 && !"_ev".equals(str4)) {
                    I(bundle2, C, C == 21 ? str : str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (v0(str4)) {
                    i2++;
                    if (i2 > i) {
                        if (pj3Var.p.G(str3, ug3.e1) && z2) {
                            str2 = str3;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String sb2 = sb.toString();
                            vh3 vh3Var = pj3Var.r;
                            pj3.m(vh3Var);
                            str2 = str3;
                            vh3Var.t.d(nh3Var.a(str), nh3Var.e(bundle), sb2);
                        }
                        q0(5, bundle2);
                        bundle2.remove(str4);
                        z2 = true;
                        list2 = list;
                        str3 = str2;
                    } else {
                        list2 = list;
                    }
                }
            }
            str2 = str3;
            list2 = list;
            str3 = str2;
        }
        return bundle2;
    }

    public final int E0(String str) {
        if (!y0("event param", str)) {
            return 3;
        }
        if (!z0("event param", null, null, str)) {
            return 14;
        }
        ((pj3) this.m).getClass();
        return !A0(40, "event param", str) ? 3 : 0;
    }

    public final void F(w62 w62Var, int i) {
        Bundle bundle = (Bundle) w62Var.e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (v0(str) && (i2 = i2 + 1) > i) {
                pj3 pj3Var = (pj3) this.m;
                ec3 ec3Var = pj3Var.p;
                nh3 nh3Var = pj3Var.v;
                if (!ec3Var.G(null, ug3.e1) || !z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String sb2 = sb.toString();
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.t.d(nh3Var.a((String) w62Var.c), nh3Var.e(bundle), sb2);
                    q0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void G(Parcelable[] parcelableArr, int i) {
        ll3.v(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (v0(str) && !W(str, bd3.k) && (i2 = i2 + 1) > i) {
                    pj3 pj3Var = (pj3) this.m;
                    ec3 ec3Var = pj3Var.p;
                    nh3 nh3Var = pj3Var.v;
                    if (!ec3Var.G(null, ug3.e1) || !z) {
                        vh3 vh3Var = pj3Var.r;
                        pj3.m(vh3Var);
                        g10 g10Var = vh3Var.t;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        g10Var.d(nh3Var.b(str), nh3Var.e(bundle), sb.toString());
                    }
                    q0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final boolean G0(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) <= i) {
            return true;
        }
        vh3 vh3Var = ((pj3) this.m).r;
        pj3.m(vh3Var);
        vh3Var.w.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
        return false;
    }

    public final void H(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                zq3 zq3Var = ((pj3) this.m).u;
                pj3.k(zq3Var);
                zq3Var.L(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void H0(String str, String str2, Bundle bundle, List list, boolean z) {
        int D0;
        String str3;
        int C;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        pj3 pj3Var = (pj3) this.m;
        ec3 ec3Var = pj3Var.p;
        vh3 vh3Var = pj3Var.r;
        nh3 nh3Var = pj3Var.v;
        zq3 zq3Var = ((pj3) ec3Var.m).u;
        pj3.k(zq3Var);
        int i = true != zq3Var.c0(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                D0 = !z ? D0(str4) : 0;
                if (D0 == 0) {
                    D0 = E0(str4);
                }
            } else {
                D0 = 0;
            }
            if (D0 != 0) {
                I(bundle, D0, str4, D0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (F0(bundle.get(str4))) {
                    pj3.m(vh3Var);
                    vh3Var.w.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    C = 22;
                    str3 = null;
                } else {
                    str3 = null;
                    C = C(str, str4, bundle.get(str4), bundle, list2, z, false);
                }
                if (C != 0 && !"_ev".equals(str4)) {
                    I(bundle, C, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (v0(str4) && !W(str4, bd3.k)) {
                    int i3 = i2 + 1;
                    if (!c0(231100000)) {
                        pj3.m(vh3Var);
                        vh3Var.t.d(nh3Var.a(str), nh3Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        q0(23, bundle);
                        bundle.remove(str4);
                    } else if (i3 > i) {
                        if (!pj3Var.p.G(str3, ug3.e1) || !z2) {
                            pj3.m(vh3Var);
                            g10 g10Var = vh3Var.t;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            g10Var.d(nh3Var.a(str), nh3Var.e(bundle), sb.toString());
                        }
                        q0(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        i2 = i3;
                        z2 = true;
                    }
                    list2 = list;
                    i2 = i3;
                }
            }
            list2 = list;
        }
    }

    public final void I(Bundle bundle, int i, String str, Object obj) {
        if (q0(i, bundle)) {
            ((pj3) this.m).getClass();
            bundle.putString("_ev", B(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int J(Object obj, String str) {
        return "_ldl".equals(str) ? G0("user property referrer", str, s0(str), obj) : G0("user property", str, s0(str), obj) ? 0 : 7;
    }

    public final Object K(Object obj, String str) {
        return "_ldl".equals(str) ? r0(s0(str), obj, true, false) : r0(s0(str), obj, false, false);
    }

    public final void L(Bundle bundle, String str, Object obj) {
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
            pj3 pj3Var = (pj3) this.m;
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.w.d(pj3Var.v.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final uj1 Q() {
        j8 j8Var;
        Object obj;
        if (this.r == null) {
            Context context = ((pj3) this.m).m;
            context.getClass();
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i = Build.VERSION.SDK_INT;
            q4 q4Var = q4.a;
            sb.append(i >= 33 ? q4Var.a() : 0);
            Log.d("MeasurementManager", sb.toString());
            if ((i >= 33 ? q4Var.a() : 0) >= 5) {
                j8Var = new tj1(context, 1);
            } else {
                p4 p4Var = p4.a;
                if (((i == 31 || i == 32) ? p4Var.a() : 0) >= 9) {
                    try {
                        obj = new sj1(context, r3).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i2 = Build.VERSION.SDK_INT;
                        sb2.append((i2 == 31 || i2 == 32) ? p4Var.a() : 0);
                        Log.d("MeasurementManager", sb2.toString());
                        obj = null;
                    }
                    j8Var = (j8) obj;
                } else {
                    j8Var = null;
                }
            }
            this.r = j8Var != null ? new uj1(j8Var) : null;
        }
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long S() {
        boolean booleanValue;
        Object e;
        Integer num;
        v();
        pj3 pj3Var = (pj3) this.m;
        gh3 r = pj3Var.r();
        vh3 vh3Var = pj3Var.r;
        if (!T(r.C())) {
            return 0L;
        }
        long j = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : R() < ((Integer) ug3.l0.a(null)).intValue() ? 16L : 0L;
        if (!U("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.s == null) {
                uj1 Q = Q();
                booleanValue = false;
                if (Q != null) {
                    try {
                        num = (Integer) Q.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    booleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                pj3.m(vh3Var);
                                vh3Var.u.c(e, "Measurement manager api exception");
                                this.s = Boolean.FALSE;
                                pj3.m(vh3Var);
                                vh3Var.z.c(num, "Measurement manager api status result");
                                booleanValue = this.s.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j == 0) {
                                }
                            } catch (CancellationException e3) {
                                e = e3;
                                pj3.m(vh3Var);
                                vh3Var.u.c(e, "Measurement manager api exception");
                                this.s = Boolean.FALSE;
                                pj3.m(vh3Var);
                                vh3Var.z.c(num, "Measurement manager api status result");
                                booleanValue = this.s.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j == 0) {
                                }
                            } catch (ExecutionException e4) {
                                e = e4;
                                pj3.m(vh3Var);
                                vh3Var.u.c(e, "Measurement manager api exception");
                                this.s = Boolean.FALSE;
                                pj3.m(vh3Var);
                                vh3Var.z.c(num, "Measurement manager api status result");
                                booleanValue = this.s.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j == 0) {
                                }
                            } catch (TimeoutException e5) {
                                e = e5;
                                pj3.m(vh3Var);
                                vh3Var.u.c(e, "Measurement manager api exception");
                                this.s = Boolean.FALSE;
                                pj3.m(vh3Var);
                                vh3Var.z.c(num, "Measurement manager api status result");
                                booleanValue = this.s.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j == 0) {
                                }
                            }
                        }
                        this.s = Boolean.valueOf(booleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        e = e6;
                        num = null;
                    }
                    pj3.m(vh3Var);
                    vh3Var.z.c(num, "Measurement manager api status result");
                }
                if (!booleanValue) {
                    j = 64;
                }
            }
            booleanValue = this.s.booleanValue();
            if (!booleanValue) {
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final boolean U(String str) {
        v();
        pj3 pj3Var = (pj3) this.m;
        if (((Context) i93.a(pj3Var.m).a).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        vh3Var.y.c(str, "Permission not granted");
        return false;
    }

    public final boolean X(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((pj3) this.m).p.A("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle Y(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object D = D(bundle.get(str), str);
                if (D == null) {
                    pj3 pj3Var = (pj3) this.m;
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.w.c(pj3Var.v.b(str), "Param value can't be null");
                } else {
                    L(bundle2, str, D);
                }
            }
        }
        return bundle2;
    }

    public final kd3 Z(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (B0(str) != 0) {
            pj3 pj3Var = (pj3) this.m;
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.c(pj3Var.v.c(str), "Invalid conditional property event name");
            b71.t();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle E = E(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            E = Y(E);
        }
        ll3.v(E);
        return new kd3(str, new jd3(E), str2, j);
    }

    public final boolean a0(Context context, String str) {
        Signature[] signatureArr;
        pj3 pj3Var = (pj3) this.m;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo c = i93.a(context).c(64, str);
            if (c == null || (signatureArr = c.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.c(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.c(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean c0(int i) {
        Boolean bool = ((pj3) this.m).p().q;
        if (d0() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int d0() {
        if (this.t == null) {
            pj3 pj3Var = (pj3) this.m;
            tv0 tv0Var = tv0.b;
            Context context = pj3Var.m;
            tv0Var.getClass();
            int i = xv0.e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.t = Integer.valueOf(i2 / 1000);
        }
        return this.t.intValue();
    }

    public final void e0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.c(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void f0(String str, je3 je3Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            je3Var.m(bundle);
        } catch (RemoteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.c(e, "Error returning string value to wrapper");
        }
    }

    public final void g0(je3 je3Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            je3Var.m(bundle);
        } catch (RemoteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.c(e, "Error returning long value to wrapper");
        }
    }

    public final void h0(je3 je3Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            je3Var.m(bundle);
        } catch (RemoteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.c(e, "Error returning int value to wrapper");
        }
    }

    public final void i0(je3 je3Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            je3Var.m(bundle);
        } catch (RemoteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.c(e, "Error returning byte array to wrapper");
        }
    }

    public final void j0(je3 je3Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            je3Var.m(bundle);
        } catch (RemoteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.c(e, "Error returning boolean value to wrapper");
        }
    }

    public final void k0(je3 je3Var, Bundle bundle) {
        try {
            je3Var.m(bundle);
        } catch (RemoteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.c(e, "Error returning bundle value to wrapper");
        }
    }

    public final void l0(je3 je3Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            je3Var.m(bundle);
        } catch (RemoteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.c(e, "Error returning bundle list to wrapper");
        }
    }

    public final String p0() {
        byte[] bArr = new byte[16];
        u0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object r0(int i, Object obj, boolean z, boolean z2) {
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
            return B(obj.toString(), i, z);
        }
        if (!z2) {
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

    public final int s0(String str) {
        pj3 pj3Var = (pj3) this.m;
        if ("_ldl".equals(str)) {
            pj3Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            pj3Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            pj3Var.getClass();
            return 100;
        }
        pj3Var.getClass();
        return 36;
    }

    public final long t0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.p;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.p;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((pj3) this.m).w.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.q + 1;
            this.q = i;
            j = nextLong + i;
        }
        return j;
    }

    public final SecureRandom u0() {
        v();
        if (this.o == null) {
            this.o = new SecureRandom();
        }
        return this.o;
    }

    public final Bundle w0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
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
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (TextUtils.isEmpty(str)) {
                    str10 = "sfmc_id";
                } else {
                    str10 = "sfmc_id";
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
                    bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter5);
                }
                String queryParameter6 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("anid", queryParameter6);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str6);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("dclid", str7);
                }
                String queryParameter7 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter9);
                }
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("srsltid", str8);
                }
                if (!TextUtils.isEmpty(str9)) {
                    bundle.putString(str10, str9);
                }
                for (String str11 : uri.getQueryParameterNames()) {
                    if (str11.startsWith("gad_")) {
                        String queryParameter10 = uri.getQueryParameter(str11);
                        if (!TextUtils.isEmpty(queryParameter10)) {
                            bundle.putString(str11, queryParameter10);
                        }
                    }
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                vh3 vh3Var = ((pj3) this.m).r;
                pj3.m(vh3Var);
                vh3Var.u.c(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    @Override // defpackage.ok3
    public final boolean x() {
        return true;
    }

    public final boolean x0(String str, String str2) {
        pj3 pj3Var = (pj3) this.m;
        if (str2 == null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.t.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.t.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            vh3 vh3Var3 = pj3Var.r;
            pj3.m(vh3Var3);
            vh3Var3.t.d(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                vh3 vh3Var4 = pj3Var.r;
                pj3.m(vh3Var4);
                vh3Var4.t.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean y0(String str, String str2) {
        pj3 pj3Var = (pj3) this.m;
        if (str2 == null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.t.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.t.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                vh3 vh3Var3 = pj3Var.r;
                pj3.m(vh3Var3);
                vh3Var3.t.d(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                vh3 vh3Var4 = pj3Var.r;
                pj3.m(vh3Var4);
                vh3Var4.t.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean z0(String str, String[] strArr, String[] strArr2, String str2) {
        pj3 pj3Var = (pj3) this.m;
        if (str2 == null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.t.c(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(u[i])) {
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                vh3Var2.t.d(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !W(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && W(str2, strArr2)) {
            return true;
        }
        vh3 vh3Var3 = pj3Var.r;
        pj3.m(vh3Var3);
        vh3Var3.t.d(str, str2, "Name is reserved. Type, name");
        return false;
    }
}
