package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bi3 extends vp3 {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi3(oq3 oq3Var, int i) {
        super(oq3Var);
        this.p = i;
    }

    public static kd3 A(jb3 jb3Var) {
        Object obj;
        Bundle B = B(jb3Var.c, true);
        String obj2 = (!B.containsKey("_o") || (obj = B.get("_o")) == null) ? "app" : obj.toString();
        String p = th2.p(jb3Var.a, s93.n, s93.p);
        if (p == null) {
            p = jb3Var.a;
        }
        return new kd3(p, new jd3(B), obj2, jb3Var.b);
    }

    public static Bundle B(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(B((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void C(bj3 bj3Var, String str, Long l) {
        List g = bj3Var.g();
        int i = 0;
        while (true) {
            if (i >= g.size()) {
                i = -1;
                break;
            } else if (str.equals(((hj3) g.get(i)).q())) {
                break;
            } else {
                i++;
            }
        }
        fj3 B = hj3.B();
        B.g(str);
        B.i(l.longValue());
        if (i < 0) {
            bj3Var.k(B);
        } else {
            bj3Var.b();
            ((cj3) bj3Var.n).A(i, (hj3) B.d());
        }
    }

    public static final Bundle D(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hj3 hj3Var = (hj3) it.next();
            String q = hj3Var.q();
            if (hj3Var.x()) {
                bundle.putDouble(q, hj3Var.y());
            } else if (hj3Var.v()) {
                bundle.putFloat(q, hj3Var.w());
            } else if (hj3Var.r()) {
                bundle.putString(q, hj3Var.s());
            } else if (hj3Var.t()) {
                bundle.putLong(q, hj3Var.u());
            }
        }
        return bundle;
    }

    public static final hj3 E(String str, cj3 cj3Var) {
        for (hj3 hj3Var : cj3Var.p()) {
            if (hj3Var.q().equals(str)) {
                return hj3Var;
            }
        }
        return null;
    }

    public static final Serializable F(String str, cj3 cj3Var) {
        hj3 E = E(str, cj3Var);
        if (E == null) {
            return null;
        }
        return L(E);
    }

    public static final void I(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void J(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String K(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable L(hj3 hj3Var) {
        if (hj3Var.r()) {
            return hj3Var.s();
        }
        if (hj3Var.t()) {
            return Long.valueOf(hj3Var.u());
        }
        if (hj3Var.x()) {
            return Double.valueOf(hj3Var.y());
        }
        if (hj3Var.A() > 0) {
            return l0((rn3) hj3Var.z());
        }
        return null;
    }

    public static final void M(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                J(builder, str3, string, set);
            }
        }
    }

    public static final void N(StringBuilder sb, String str, xj3 xj3Var) {
        if (xj3Var == null) {
            return;
        }
        I(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (xj3Var.s() != 0) {
            I(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : xj3Var.r()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (xj3Var.q() != 0) {
            I(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : xj3Var.p()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (xj3Var.u() != 0) {
            I(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (aj3 aj3Var : xj3Var.t()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(aj3Var.p() ? Integer.valueOf(aj3Var.q()) : null);
                sb.append(":");
                sb.append(aj3Var.r() ? Long.valueOf(aj3Var.s()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (xj3Var.w() != 0) {
            I(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (ak3 ak3Var : xj3Var.v()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(ak3Var.p() ? Integer.valueOf(ak3Var.q()) : null);
                sb.append(": [");
                Iterator it = ak3Var.r().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        I(3, sb);
        sb.append("}\n");
    }

    public static final void O(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        I(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void P(StringBuilder sb, int i, String str, ng3 ng3Var) {
        if (ng3Var == null) {
            return;
        }
        I(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (ng3Var.p()) {
            int z = ng3Var.z();
            O(sb, i, "comparison_type", z != 1 ? z != 2 ? z != 3 ? z != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (ng3Var.q()) {
            O(sb, i, "match_as_float", Boolean.valueOf(ng3Var.r()));
        }
        if (ng3Var.s()) {
            O(sb, i, "comparison_value", ng3Var.t());
        }
        if (ng3Var.u()) {
            O(sb, i, "min_comparison_value", ng3Var.v());
        }
        if (ng3Var.w()) {
            O(sb, i, "max_comparison_value", ng3Var.x());
        }
        I(i, sb);
        sb.append("}\n");
    }

    public static boolean c0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean d0(qn3 qn3Var, int i) {
        if (i < ((co3) qn3Var).o * 64) {
            return ((1 << (i % 64)) & ((Long) ((co3) qn3Var).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList e0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static en3 j0(en3 en3Var, byte[] bArr) {
        rm3 rm3Var;
        rm3 rm3Var2 = rm3.a;
        if (rm3Var2 == null) {
            synchronized (rm3.class) {
                try {
                    rm3Var = rm3.a;
                    if (rm3Var == null) {
                        uo3 uo3Var = uo3.c;
                        rm3Var = zm3.W();
                        rm3.a = rm3Var;
                    }
                } finally {
                }
            }
            rm3Var2 = rm3Var;
        }
        if (rm3Var2 != null) {
            en3Var.getClass();
            en3Var.f(bArr, bArr.length, rm3Var2);
            return en3Var;
        }
        en3Var.getClass();
        int length = bArr.length;
        rm3 rm3Var3 = rm3.a;
        uo3 uo3Var2 = uo3.c;
        en3Var.f(bArr, length, rm3.b);
        return en3Var;
    }

    public static int k0(String str, qj3 qj3Var) {
        for (int i = 0; i < ((sj3) qj3Var.n).V1(); i++) {
            if (str.equals(((sj3) qj3Var.n).W1(i).r())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] l0(rn3 rn3Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = rn3Var.iterator();
        while (it.hasNext()) {
            hj3 hj3Var = (hj3) it.next();
            if (hj3Var != null) {
                Bundle bundle = new Bundle();
                for (hj3 hj3Var2 : hj3Var.z()) {
                    if (hj3Var2.r()) {
                        bundle.putString(hj3Var2.q(), hj3Var2.s());
                    } else if (hj3Var2.t()) {
                        bundle.putLong(hj3Var2.q(), hj3Var2.u());
                    } else if (hj3Var2.x()) {
                        bundle.putDouble(hj3Var2.q(), hj3Var2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(m0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(m0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(m0((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap m0(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public void G(StringBuilder sb, int i, rn3 rn3Var) {
        if (rn3Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = rn3Var.iterator();
        while (it.hasNext()) {
            hj3 hj3Var = (hj3) it.next();
            if (hj3Var != null) {
                I(i2, sb);
                sb.append("param {\n");
                O(sb, i2, "name", hj3Var.p() ? ((pj3) this.m).v.b(hj3Var.q()) : null);
                O(sb, i2, "string_value", hj3Var.r() ? hj3Var.s() : null);
                O(sb, i2, "int_value", hj3Var.t() ? Long.valueOf(hj3Var.u()) : null);
                O(sb, i2, "double_value", hj3Var.x() ? Double.valueOf(hj3Var.y()) : null);
                if (hj3Var.A() > 0) {
                    G(sb, i2, (rn3) hj3Var.z());
                }
                I(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public void H(StringBuilder sb, int i, kg3 kg3Var) {
        String str;
        if (kg3Var == null) {
            return;
        }
        I(i, sb);
        sb.append("filter {\n");
        if (kg3Var.t()) {
            O(sb, i, "complement", Boolean.valueOf(kg3Var.u()));
        }
        if (kg3Var.v()) {
            O(sb, i, "param_name", ((pj3) this.m).v.b(kg3Var.w()));
        }
        if (kg3Var.p()) {
            int i2 = i + 1;
            qg3 q = kg3Var.q();
            if (q != null) {
                I(i2, sb);
                sb.append("string_filter {\n");
                if (q.p()) {
                    switch (q.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    O(sb, i2, "match_type", str);
                }
                if (q.q()) {
                    O(sb, i2, "expression", q.r());
                }
                if (q.s()) {
                    O(sb, i2, "case_sensitive", Boolean.valueOf(q.t()));
                }
                if (q.v() > 0) {
                    I(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : q.u()) {
                        I(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                I(i2, sb);
                sb.append("}\n");
            }
        }
        if (kg3Var.r()) {
            P(sb, i + 1, "number_filter", kg3Var.s());
        }
        I(i, sb);
        sb.append("}\n");
    }

    public boolean Q() {
        x();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((pj3) this.m).m.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public void U(String str, xp3 xp3Var, oj3 oj3Var, xh3 xh3Var) {
        String str2;
        URL url;
        byte[] a;
        lj3 lj3Var;
        Map map;
        String str3 = xp3Var.a;
        pj3 pj3Var = (pj3) this.m;
        v();
        x();
        try {
            url = new URI(str3).toURL();
            this.n.j0();
            a = oj3Var.a();
            lj3Var = pj3Var.s;
            pj3.m(lj3Var);
            map = xp3Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            lj3Var.I(new zh3(this, str2, url, a, map, xh3Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.d(vh3.E(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    public void V(dk3 dk3Var, Object obj) {
        ll3.v(obj);
        dk3Var.b();
        ((ek3) dk3Var.n).E();
        dk3Var.b();
        ((ek3) dk3Var.n).G();
        dk3Var.b();
        ((ek3) dk3Var.n).I();
        if (obj instanceof String) {
            dk3Var.b();
            ((ek3) dk3Var.n).D((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            dk3Var.b();
            ((ek3) dk3Var.n).F(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            dk3Var.b();
            ((ek3) dk3Var.n).H(doubleValue);
        } else {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.r.c(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void W(fj3 fj3Var, Object obj) {
        fj3Var.b();
        ((hj3) fj3Var.n).E();
        fj3Var.b();
        ((hj3) fj3Var.n).G();
        fj3Var.b();
        ((hj3) fj3Var.n).I();
        fj3Var.b();
        ((hj3) fj3Var.n).L();
        if (obj instanceof String) {
            fj3Var.h((String) obj);
            return;
        }
        if (obj instanceof Long) {
            fj3Var.i(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            fj3Var.b();
            ((hj3) fj3Var.n).H(doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.r.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                fj3 B = hj3.B();
                for (String str : bundle.keySet()) {
                    fj3 B2 = hj3.B();
                    B2.g(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        B2.i(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        B2.h((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        B2.b();
                        ((hj3) B2.n).H(doubleValue2);
                    }
                    B.b();
                    ((hj3) B.n).J((hj3) B2.d());
                }
                if (((hj3) B.n).A() > 0) {
                    arrayList.add((hj3) B.d());
                }
            }
        }
        fj3Var.b();
        ((hj3) fj3Var.n).K(arrayList);
    }

    public ip3 X(String str, qj3 qj3Var, bj3 bj3Var, String str2) {
        int indexOf;
        vr3.a();
        pj3 pj3Var = (pj3) this.m;
        ec3 ec3Var = pj3Var.p;
        if (!ec3Var.G(str, ug3.P0)) {
            return null;
        }
        pj3Var.w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String[] split = ec3Var.C(str, ug3.u0).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                b71.j(str3, "duplicate element: ");
                return null;
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        oq3 oq3Var = this.n;
        zp3 zp3Var = oq3Var.v;
        dj3 dj3Var = oq3Var.m;
        dj3 dj3Var2 = zp3Var.n.m;
        oq3.U(dj3Var2);
        String J = dj3Var2.J(str);
        Uri.Builder builder = new Uri.Builder();
        ec3 ec3Var2 = ((pj3) zp3Var.m).p;
        builder.scheme(ec3Var2.C(str, ug3.n0));
        if (TextUtils.isEmpty(J)) {
            builder.authority(ec3Var2.C(str, ug3.o0));
        } else {
            String C = ec3Var2.C(str, ug3.o0);
            StringBuilder sb = new StringBuilder(String.valueOf(J).length() + 1 + String.valueOf(C).length());
            sb.append(J);
            sb.append(".");
            sb.append(C);
            builder.authority(sb.toString());
        }
        builder.path(ec3Var2.C(str, ug3.p0));
        J(builder, "gmp_app_id", ((sj3) qj3Var.n).E(), unmodifiableSet);
        ec3Var.B();
        J(builder, "gmp_version", String.valueOf(133005L), unmodifiableSet);
        String y = ((sj3) qj3Var.n).y();
        tg3 tg3Var = ug3.S0;
        if (ec3Var.G(str, tg3Var)) {
            oq3.U(dj3Var);
            if (dj3Var.P(str)) {
                y = BuildConfig.FLAVOR;
            }
        }
        J(builder, "app_instance_id", y, unmodifiableSet);
        J(builder, "rdid", ((sj3) qj3Var.n).v(), unmodifiableSet);
        J(builder, "bundle_id", qj3Var.n(), unmodifiableSet);
        String m = bj3Var.m();
        String p = th2.p(m, s93.p, s93.n);
        if (true != TextUtils.isEmpty(p)) {
            m = p;
        }
        J(builder, "app_event_name", m, unmodifiableSet);
        J(builder, "app_version", String.valueOf(((sj3) qj3Var.n).K()), unmodifiableSet);
        String i2 = ((sj3) qj3Var.n).i2();
        if (ec3Var.G(str, tg3Var)) {
            oq3.U(dj3Var);
            if (dj3Var.O(str) && !TextUtils.isEmpty(i2) && (indexOf = i2.indexOf(".")) != -1) {
                i2 = i2.substring(0, indexOf);
            }
        }
        J(builder, "os_version", i2, unmodifiableSet);
        J(builder, SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, String.valueOf(bj3Var.n()), unmodifiableSet);
        boolean x = ((sj3) qj3Var.n).x();
        String str4 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        if (x) {
            J(builder, "lat", AppEventsConstants.EVENT_PARAM_VALUE_YES, unmodifiableSet);
        }
        J(builder, "privacy_sandbox_version", String.valueOf(((sj3) qj3Var.n).G0()), unmodifiableSet);
        J(builder, "trigger_uri_source", AppEventsConstants.EVENT_PARAM_VALUE_YES, unmodifiableSet);
        J(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
        J(builder, "request_uuid", str2, unmodifiableSet);
        List<hj3> g = bj3Var.g();
        Bundle bundle = new Bundle();
        for (hj3 hj3Var : g) {
            String q = hj3Var.q();
            if (hj3Var.x()) {
                bundle.putString(q, String.valueOf(hj3Var.y()));
            } else if (hj3Var.v()) {
                bundle.putString(q, String.valueOf(hj3Var.w()));
            } else if (hj3Var.r()) {
                bundle.putString(q, hj3Var.s());
            } else if (hj3Var.t()) {
                bundle.putString(q, String.valueOf(hj3Var.u()));
            }
        }
        M(builder, ec3Var.C(str, ug3.t0).split("\\|"), bundle, unmodifiableSet);
        List<ek3> unmodifiableList = Collections.unmodifiableList(((sj3) qj3Var.n).U1());
        Bundle bundle2 = new Bundle();
        for (ek3 ek3Var : unmodifiableList) {
            String r = ek3Var.r();
            if (ek3Var.y()) {
                bundle2.putString(r, String.valueOf(ek3Var.z()));
            } else if (ek3Var.w()) {
                bundle2.putString(r, String.valueOf(ek3Var.x()));
            } else if (ek3Var.s()) {
                bundle2.putString(r, ek3Var.t());
            } else if (ek3Var.u()) {
                bundle2.putString(r, String.valueOf(ek3Var.v()));
            }
        }
        M(builder, ec3Var.C(str, ug3.s0).split("\\|"), bundle2, unmodifiableSet);
        if (true != ((sj3) qj3Var.n).D0()) {
            str4 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        J(builder, "dma", str4, unmodifiableSet);
        if (!((sj3) qj3Var.n).F0().isEmpty()) {
            J(builder, "dma_cps", ((sj3) qj3Var.n).F0(), unmodifiableSet);
        }
        if (((sj3) qj3Var.n).L0()) {
            gi3 M0 = ((sj3) qj3Var.n).M0();
            if (!M0.z().isEmpty()) {
                J(builder, "dl_gclid", M0.z(), unmodifiableSet);
            }
            if (!M0.B().isEmpty()) {
                J(builder, "dl_gbraid", M0.B(), unmodifiableSet);
            }
            if (!M0.D().isEmpty()) {
                J(builder, "dl_gs", M0.D(), unmodifiableSet);
            }
            if (M0.F() > 0) {
                J(builder, "dl_ss_ts", String.valueOf(M0.F()), unmodifiableSet);
            }
            if (!M0.H().isEmpty()) {
                J(builder, "mr_gclid", M0.H(), unmodifiableSet);
            }
            if (!M0.J().isEmpty()) {
                J(builder, "mr_gbraid", M0.J(), unmodifiableSet);
            }
            if (!M0.L().isEmpty()) {
                J(builder, "mr_gs", M0.L(), unmodifiableSet);
            }
            if (M0.N() > 0) {
                J(builder, "mr_click_ts", String.valueOf(M0.N()), unmodifiableSet);
            }
        }
        return new ip3(builder.build().toString(), 1, currentTimeMillis);
    }

    public cj3 Y(fd3 fd3Var) {
        bj3 z = cj3.z();
        long j = fd3Var.e;
        z.b();
        ((cj3) z.n).H(j);
        jd3 jd3Var = fd3Var.f;
        Objects.requireNonNull(jd3Var);
        Bundle bundle = jd3Var.m;
        for (String str : bundle.keySet()) {
            fj3 B = hj3.B();
            B.g(str);
            Object obj = bundle.get(str);
            ll3.v(obj);
            W(B, obj);
            z.k(B);
        }
        String str2 = fd3Var.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            fj3 B2 = hj3.B();
            B2.g("_o");
            B2.h(str2);
            z.j((hj3) B2.d());
        }
        return (cj3) z.d();
    }

    public String Z(oj3 oj3Var) {
        mi3 I0;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (oj3Var.u()) {
            O(sb, 0, "upload_subdomain", oj3Var.v());
        }
        if (oj3Var.s()) {
            O(sb, 0, "sgtm_join_id", oj3Var.t());
        }
        for (sj3 sj3Var : oj3Var.p()) {
            if (sj3Var != null) {
                I(1, sb);
                sb.append("bundle {\n");
                if (sj3Var.P()) {
                    O(sb, 1, "protocol_version", Integer.valueOf(sj3Var.P0()));
                }
                pj3 pj3Var = (pj3) this.m;
                ec3 ec3Var = pj3Var.p;
                nh3 nh3Var = pj3Var.v;
                if (ec3Var.G(sj3Var.p(), ug3.M0) && sj3Var.v0()) {
                    O(sb, 1, "session_stitching_token", sj3Var.w0());
                }
                O(sb, 1, "platform", sj3Var.h2());
                if (sj3Var.r()) {
                    O(sb, 1, "gmp_version", Long.valueOf(sj3Var.s()));
                }
                if (sj3Var.t()) {
                    O(sb, 1, "uploading_gmp_version", Long.valueOf(sj3Var.u()));
                }
                if (sj3Var.r0()) {
                    O(sb, 1, "dynamite_version", Long.valueOf(sj3Var.s0()));
                }
                if (sj3Var.L()) {
                    O(sb, 1, "config_version", Long.valueOf(sj3Var.M()));
                }
                O(sb, 1, "gmp_app_id", sj3Var.E());
                O(sb, 1, "app_id", sj3Var.p());
                O(sb, 1, "app_version", sj3Var.q());
                if (sj3Var.J()) {
                    O(sb, 1, "app_version_major", Integer.valueOf(sj3Var.K()));
                }
                O(sb, 1, "firebase_instance_id", sj3Var.I());
                if (sj3Var.z()) {
                    O(sb, 1, "dev_cert_hash", Long.valueOf(sj3Var.A()));
                }
                O(sb, 1, "app_store", sj3Var.n2());
                if (sj3Var.X1()) {
                    O(sb, 1, "upload_timestamp_millis", Long.valueOf(sj3Var.Y1()));
                }
                if (sj3Var.Z1()) {
                    O(sb, 1, "start_timestamp_millis", Long.valueOf(sj3Var.a2()));
                }
                if (sj3Var.b2()) {
                    O(sb, 1, "end_timestamp_millis", Long.valueOf(sj3Var.c2()));
                }
                if (sj3Var.d2()) {
                    O(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(sj3Var.e2()));
                }
                if (sj3Var.f2()) {
                    O(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(sj3Var.g2()));
                }
                O(sb, 1, "app_instance_id", sj3Var.y());
                O(sb, 1, "resettable_device_id", sj3Var.v());
                O(sb, 1, "ds_id", sj3Var.O());
                if (sj3Var.w()) {
                    O(sb, 1, "limited_ad_tracking", Boolean.valueOf(sj3Var.x()));
                }
                O(sb, 1, "os_version", sj3Var.i2());
                O(sb, 1, "device_model", sj3Var.j2());
                O(sb, 1, "user_default_language", sj3Var.k2());
                if (sj3Var.l2()) {
                    O(sb, 1, "time_zone_offset_minutes", Integer.valueOf(sj3Var.m2()));
                }
                if (sj3Var.B()) {
                    O(sb, 1, "bundle_sequential_index", Integer.valueOf(sj3Var.C()));
                }
                if (sj3Var.J0()) {
                    O(sb, 1, "delivery_index", Integer.valueOf(sj3Var.K0()));
                }
                if (sj3Var.F()) {
                    O(sb, 1, "service_upload", Boolean.valueOf(sj3Var.G()));
                }
                O(sb, 1, "health_monitor", sj3Var.D());
                if (sj3Var.p0()) {
                    O(sb, 1, "retry_counter", Integer.valueOf(sj3Var.q0()));
                }
                if (sj3Var.t0()) {
                    O(sb, 1, "consent_signals", sj3Var.u0());
                }
                if (sj3Var.C0()) {
                    O(sb, 1, "is_dma_region", Boolean.valueOf(sj3Var.D0()));
                }
                if (sj3Var.E0()) {
                    O(sb, 1, "core_platform_services", sj3Var.F0());
                }
                if (sj3Var.A0()) {
                    O(sb, 1, "consent_diagnostics", sj3Var.B0());
                }
                if (sj3Var.x0()) {
                    O(sb, 1, "target_os_version", Long.valueOf(sj3Var.y0()));
                }
                vr3.a();
                if (pj3Var.p.G(sj3Var.p(), ug3.P0)) {
                    O(sb, 1, "ad_services_version", Integer.valueOf(sj3Var.G0()));
                    if (sj3Var.H0() && (I0 = sj3Var.I0()) != null) {
                        I(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        O(sb, 2, "eligible", Boolean.valueOf(I0.p()));
                        O(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(I0.q()));
                        O(sb, 2, "pre_r", Boolean.valueOf(I0.r()));
                        O(sb, 2, "r_extensions_too_old", Boolean.valueOf(I0.s()));
                        O(sb, 2, "adservices_extension_too_old", Boolean.valueOf(I0.t()));
                        O(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(I0.u()));
                        O(sb, 2, "measurement_manager_disabled", Boolean.valueOf(I0.v()));
                        I(2, sb);
                        sb.append("}\n");
                    }
                }
                if (sj3Var.L0()) {
                    gi3 M0 = sj3Var.M0();
                    I(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (M0.y()) {
                        O(sb, 2, "deep_link_gclid", M0.z());
                    }
                    if (M0.A()) {
                        O(sb, 2, "deep_link_gbraid", M0.B());
                    }
                    if (M0.C()) {
                        O(sb, 2, "deep_link_gad_source", M0.D());
                    }
                    if (M0.E()) {
                        O(sb, 2, "deep_link_session_millis", Long.valueOf(M0.F()));
                    }
                    if (M0.G()) {
                        O(sb, 2, "market_referrer_gclid", M0.H());
                    }
                    if (M0.I()) {
                        O(sb, 2, "market_referrer_gbraid", M0.J());
                    }
                    if (M0.K()) {
                        O(sb, 2, "market_referrer_gad_source", M0.L());
                    }
                    if (M0.M()) {
                        O(sb, 2, "market_referrer_click_millis", Long.valueOf(M0.N()));
                    }
                    I(2, sb);
                    sb.append("}\n");
                }
                if (sj3Var.Q()) {
                    O(sb, 1, "batching_timestamp_millis", Long.valueOf(sj3Var.R()));
                }
                if (sj3Var.N0()) {
                    ck3 O0 = sj3Var.O0();
                    I(2, sb);
                    sb.append("sgtm_diagnostics {\n");
                    int t = O0.t();
                    O(sb, 2, "upload_type", t != 1 ? t != 2 ? t != 3 ? t != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    O(sb, 2, "client_upload_eligibility", in1.q(O0.p()));
                    int u = O0.u();
                    O(sb, 2, "service_upload_eligibility", u != 1 ? u != 2 ? u != 3 ? u != 4 ? u != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    I(2, sb);
                    sb.append("}\n");
                }
                if (sj3Var.S()) {
                    wi3 T = sj3Var.T();
                    I(2, sb);
                    sb.append("consent_info_extra {\n");
                    for (vi3 vi3Var : T.p()) {
                        I(3, sb);
                        sb.append("limited_data_modes {\n");
                        int q = vi3Var.q();
                        O(sb, 3, "type", q != 1 ? q != 2 ? q != 3 ? q != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int r = vi3Var.r();
                        O(sb, 3, "mode", r != 1 ? r != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        I(3, sb);
                        sb.append("}\n");
                    }
                    I(2, sb);
                    sb.append("}\n");
                }
                rn3<ek3> U1 = sj3Var.U1();
                if (U1 != null) {
                    for (ek3 ek3Var : U1) {
                        if (ek3Var != null) {
                            I(2, sb);
                            sb.append("user_property {\n");
                            O(sb, 2, "set_timestamp_millis", ek3Var.p() ? Long.valueOf(ek3Var.q()) : null);
                            O(sb, 2, "name", nh3Var.c(ek3Var.r()));
                            O(sb, 2, "string_value", ek3Var.t());
                            O(sb, 2, "int_value", ek3Var.u() ? Long.valueOf(ek3Var.v()) : null);
                            O(sb, 2, "double_value", ek3Var.y() ? Double.valueOf(ek3Var.z()) : null);
                            I(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                rn3<pi3> H = sj3Var.H();
                if (H != null) {
                    for (pi3 pi3Var : H) {
                        if (pi3Var != null) {
                            I(2, sb);
                            sb.append("audience_membership {\n");
                            if (pi3Var.p()) {
                                O(sb, 2, "audience_id", Integer.valueOf(pi3Var.q()));
                            }
                            if (pi3Var.u()) {
                                O(sb, 2, "new_audience", Boolean.valueOf(pi3Var.v()));
                            }
                            N(sb, "current_data", pi3Var.r());
                            if (pi3Var.s()) {
                                N(sb, "previous_data", pi3Var.t());
                            }
                            I(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                List<cj3> P1 = sj3Var.P1();
                if (P1 != null) {
                    for (cj3 cj3Var : P1) {
                        if (cj3Var != null) {
                            I(2, sb);
                            sb.append("event {\n");
                            O(sb, 2, "name", nh3Var.a(cj3Var.s()));
                            if (cj3Var.t()) {
                                O(sb, 2, "timestamp_millis", Long.valueOf(cj3Var.u()));
                            }
                            if (cj3Var.v()) {
                                O(sb, 2, "previous_timestamp_millis", Long.valueOf(cj3Var.w()));
                            }
                            if (cj3Var.x()) {
                                O(sb, 2, "count", Integer.valueOf(cj3Var.y()));
                            }
                            if (cj3Var.q() != 0) {
                                G(sb, 2, (rn3) cj3Var.p());
                            }
                            I(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                I(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public String a0(pg3 pg3Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (pg3Var.p()) {
            O(sb, 0, "filter_id", Integer.valueOf(pg3Var.q()));
        }
        O(sb, 0, "property_name", ((pj3) this.m).v.c(pg3Var.r()));
        String K = K(pg3Var.t(), pg3Var.u(), pg3Var.w());
        if (!K.isEmpty()) {
            O(sb, 0, "filter_type", K);
        }
        H(sb, 1, pg3Var.s());
        sb.append("}\n");
        return sb.toString();
    }

    public Parcelable b0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (fd2 unused) {
                vh3 vh3Var = ((pj3) this.m).r;
                pj3.m(vh3Var);
                vh3Var.r.b("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public List f0(qn3 qn3Var, List list) {
        int i;
        pj3 pj3Var = (pj3) this.m;
        ArrayList arrayList = new ArrayList(qn3Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.u.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.u.d(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public boolean g0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((pj3) this.m).w.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public long h0(byte[] bArr) {
        ll3.v(bArr);
        pj3 pj3Var = (pj3) this.m;
        zq3 zq3Var = pj3Var.u;
        pj3.k(zq3Var);
        zq3Var.v();
        MessageDigest N = zq3.N();
        if (N != null) {
            return zq3.O(N.digest(bArr));
        }
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        vh3Var.r.b("Failed to get MD5");
        return 0L;
    }

    public byte[] i0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.r.c(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // defpackage.vp3
    public final void z() {
        int i = this.p;
    }

    private final void R() {
    }

    private final void S() {
    }

    private final void T() {
    }
}
