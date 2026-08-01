package s7;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.c9;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.h9;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.m9;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.y8;
import com.google.android.gms.internal.measurement.z8;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l4 extends d4 {

    /* renamed from: r, reason: collision with root package name */
    public long f8820r;

    /* renamed from: s, reason: collision with root package name */
    public long f8821s;

    public static final void A(v8 v8Var, String str, Long l10) {
        List g = v8Var.g();
        int i3 = 0;
        while (true) {
            if (i3 >= g.size()) {
                i3 = -1;
                break;
            } else if (str.equals(((z8) g.get(i3)).u())) {
                break;
            } else {
                i3++;
            }
        }
        y8 F = z8.F();
        F.g(str);
        F.i(l10.longValue());
        if (i3 < 0) {
            v8Var.k(F);
        } else {
            v8Var.b();
            ((w8) v8Var.f2389e).K(i3, (z8) F.d());
        }
    }

    public static final Bundle B(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z8 z8Var = (z8) it.next();
            String u2 = z8Var.u();
            if (z8Var.B()) {
                bundle.putDouble(u2, z8Var.C());
            } else if (z8Var.z()) {
                bundle.putFloat(u2, z8Var.A());
            } else if (z8Var.v()) {
                bundle.putString(u2, z8Var.w());
            } else if (z8Var.x()) {
                bundle.putLong(u2, z8Var.y());
            }
        }
        return bundle;
    }

    public static final z8 C(w8 w8Var, String str) {
        for (z8 z8Var : w8Var.v()) {
            if (z8Var.u().equals(str)) {
                return z8Var;
            }
        }
        return null;
    }

    public static final String D(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable E(w8 w8Var, String str) {
        z8 C = C(w8Var, str);
        if (C == null) {
            return null;
        }
        return K(C);
    }

    public static final void H(int i3, StringBuilder sb2) {
        for (int i10 = 0; i10 < i3; i10++) {
            sb2.append("  ");
        }
    }

    public static final void I(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String J(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable K(z8 z8Var) {
        if (z8Var.v()) {
            return z8Var.w();
        }
        if (z8Var.x()) {
            return Long.valueOf(z8Var.y());
        }
        if (z8Var.B()) {
            return Double.valueOf(z8Var.C());
        }
        if (z8Var.E() > 0) {
            return f0(z8Var.D());
        }
        return null;
    }

    public static final void L(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                I(builder, str3, string, hashSet);
            }
        }
    }

    public static final void M(StringBuilder sb2, String str, h9 h9Var) {
        if (h9Var == null) {
            return;
        }
        H(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (h9Var.w() != 0) {
            H(4, sb2);
            sb2.append("results: ");
            int i3 = 0;
            for (Long l10 : h9Var.v()) {
                int i10 = i3 + 1;
                if (i3 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i3 = i10;
            }
            sb2.append('\n');
        }
        if (h9Var.u() != 0) {
            H(4, sb2);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l11 : h9Var.t()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (h9Var.y() != 0) {
            H(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (u8 u8Var : h9Var.x()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(u8Var.t() ? Integer.valueOf(u8Var.u()) : null);
                sb2.append(":");
                sb2.append(u8Var.v() ? Long.valueOf(u8Var.w()) : null);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (h9Var.A() != 0) {
            H(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (j9 j9Var : h9Var.z()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(j9Var.t() ? Integer.valueOf(j9Var.u()) : null);
                sb2.append(": [");
                Iterator it = j9Var.v().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        H(3, sb2);
        sb2.append("}\n");
    }

    public static final void N(StringBuilder sb2, int i3, String str, Object obj) {
        if (obj == null) {
            return;
        }
        H(i3 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void O(StringBuilder sb2, int i3, String str, o7 o7Var) {
        if (o7Var == null) {
            return;
        }
        H(i3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (o7Var.t()) {
            int D = o7Var.D();
            N(sb2, i3, "comparison_type", D != 1 ? D != 2 ? D != 3 ? D != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (o7Var.u()) {
            N(sb2, i3, "match_as_float", Boolean.valueOf(o7Var.v()));
        }
        if (o7Var.w()) {
            N(sb2, i3, "comparison_value", o7Var.x());
        }
        if (o7Var.y()) {
            N(sb2, i3, "min_comparison_value", o7Var.z());
        }
        if (o7Var.A()) {
            N(sb2, i3, "max_comparison_value", o7Var.B());
        }
        H(i3, sb2);
        sb2.append("}\n");
    }

    public static boolean W(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean X(com.google.android.gms.internal.measurement.s1 s1Var, int i3) {
        if (i3 < ((com.google.android.gms.internal.measurement.z1) s1Var).f3032i * 64) {
            return ((1 << (i3 % 64)) & ((Long) ((com.google.android.gms.internal.measurement.z1) s1Var).get(i3 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList Y(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i3 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static com.google.android.gms.internal.measurement.i1 d0(com.google.android.gms.internal.measurement.i1 i1Var, byte[] bArr) {
        com.google.android.gms.internal.measurement.c1 a9 = com.google.android.gms.internal.measurement.c1.a();
        if (a9 != null) {
            i1Var.getClass();
            i1Var.f(bArr, bArr.length, a9);
            return i1Var;
        }
        i1Var.getClass();
        int length = bArr.length;
        int i3 = com.google.android.gms.internal.measurement.q0.f2690a;
        i1Var.f(bArr, length, com.google.android.gms.internal.measurement.c1.f2181b);
        return i1Var;
    }

    public static int e0(d9 d9Var, String str) {
        for (int i3 = 0; i3 < ((e9) d9Var.f2389e).a2(); i3++) {
            if (str.equals(((e9) d9Var.f2389e).b2(i3).v())) {
                return i3;
            }
        }
        return -1;
    }

    public static Bundle[] f0(com.google.android.gms.internal.measurement.t1 t1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = t1Var.iterator();
        while (it.hasNext()) {
            z8 z8Var = (z8) it.next();
            if (z8Var != null) {
                Bundle bundle = new Bundle();
                for (z8 z8Var2 : z8Var.D()) {
                    if (z8Var2.v()) {
                        bundle.putString(z8Var2.u(), z8Var2.w());
                    } else if (z8Var2.x()) {
                        bundle.putLong(z8Var2.u(), z8Var2.y());
                    } else if (z8Var2.B()) {
                        bundle.putDouble(z8Var2.u(), z8Var2.C());
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
    
        r5.add(g0((android.os.Bundle) r8, false));
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
    
        r5.add(g0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(g0((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap g0(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z11 = obj instanceof Parcelable[];
            if (!z11 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public static u w(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle x10 = x(bVar.f2156c, true);
        String obj2 = (!x10.containsKey("_o") || (obj = x10.get("_o")) == null) ? "app" : obj.toString();
        String g = d2.g(bVar.f2154a, d2.f8580a, d2.f8585f);
        if (g == null) {
            g = bVar.f2154a;
        }
        return new u(g, new t(x10), obj2, bVar.f2155b, 0L);
    }

    public static Bundle x(Map map, boolean z10) {
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
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add(x((Map) arrayList.get(i3), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final void F(StringBuilder sb2, int i3, com.google.android.gms.internal.measurement.t1 t1Var) {
        if (t1Var == null) {
            return;
        }
        int i10 = i3 + 1;
        Iterator it = t1Var.iterator();
        while (it.hasNext()) {
            z8 z8Var = (z8) it.next();
            if (z8Var != null) {
                H(i10, sb2);
                sb2.append("param {\n");
                N(sb2, i10, "name", z8Var.t() ? ((q1) this.f1478d).f8941x.b(z8Var.u()) : null);
                N(sb2, i10, "string_value", z8Var.v() ? z8Var.w() : null);
                N(sb2, i10, "int_value", z8Var.x() ? Long.valueOf(z8Var.y()) : null);
                N(sb2, i10, "double_value", z8Var.B() ? Double.valueOf(z8Var.C()) : null);
                if (z8Var.E() > 0) {
                    F(sb2, i10, z8Var.D());
                }
                H(i10, sb2);
                sb2.append("}\n");
            }
        }
    }

    public final void G(StringBuilder sb2, int i3, m7 m7Var) {
        String str;
        if (m7Var == null) {
            return;
        }
        H(i3, sb2);
        sb2.append("filter {\n");
        if (m7Var.x()) {
            N(sb2, i3, "complement", Boolean.valueOf(m7Var.y()));
        }
        if (m7Var.z()) {
            N(sb2, i3, "param_name", ((q1) this.f1478d).f8941x.b(m7Var.A()));
        }
        if (m7Var.t()) {
            int i10 = i3 + 1;
            r7 u2 = m7Var.u();
            if (u2 != null) {
                H(i10, sb2);
                sb2.append("string_filter {\n");
                if (u2.t()) {
                    switch (u2.B()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            str = "BEGINS_WITH";
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            str = "ENDS_WITH";
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            str = "PARTIAL";
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    N(sb2, i10, "match_type", str);
                }
                if (u2.u()) {
                    N(sb2, i10, "expression", u2.v());
                }
                if (u2.w()) {
                    N(sb2, i10, "case_sensitive", Boolean.valueOf(u2.x()));
                }
                if (u2.z() > 0) {
                    H(i3 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : u2.y()) {
                        H(i3 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                H(i10, sb2);
                sb2.append("}\n");
            }
        }
        if (m7Var.v()) {
            O(sb2, i3 + 1, "number_filter", m7Var.w());
        }
        H(i3, sb2);
        sb2.append("}\n");
    }

    public final void P(m9 m9Var, Object obj) {
        c7.c0.g(obj);
        m9Var.b();
        ((n9) m9Var.f2389e).I();
        m9Var.b();
        ((n9) m9Var.f2389e).K();
        m9Var.b();
        ((n9) m9Var.f2389e).M();
        if (obj instanceof String) {
            m9Var.b();
            ((n9) m9Var.f2389e).H((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            m9Var.b();
            ((n9) m9Var.f2389e).J(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            m9Var.b();
            ((n9) m9Var.f2389e).L(doubleValue);
        } else {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void Q(y8 y8Var, Object obj) {
        y8Var.b();
        ((z8) y8Var.f2389e).I();
        y8Var.b();
        ((z8) y8Var.f2389e).K();
        y8Var.b();
        ((z8) y8Var.f2389e).M();
        y8Var.b();
        ((z8) y8Var.f2389e).P();
        if (obj instanceof String) {
            y8Var.h((String) obj);
            return;
        }
        if (obj instanceof Long) {
            y8Var.i(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            y8Var.b();
            ((z8) y8Var.f2389e).L(doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                y8 F = z8.F();
                for (String str : bundle.keySet()) {
                    y8 F2 = z8.F();
                    F2.g(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        F2.i(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        F2.h((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        F2.b();
                        ((z8) F2.f2389e).L(doubleValue2);
                    }
                    F.b();
                    ((z8) F.f2389e).N((z8) F2.d());
                }
                if (((z8) F.f2389e).E() > 0) {
                    arrayList.add((z8) F.d());
                }
            }
        }
        y8Var.b();
        ((z8) y8Var.f2389e).O(arrayList);
    }

    public final x3 R(String str, d9 d9Var, v8 v8Var, String str2) {
        int indexOf;
        com.google.android.gms.internal.measurement.i4.a();
        q1 q1Var = (q1) this.f1478d;
        g gVar = q1Var.f8935r;
        if (!gVar.D(str, e0.O0)) {
            return null;
        }
        q1Var.f8942y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(gVar.z(str, e0.f8651t0).split(",")));
        j4 j4Var = this.f9150e;
        f4 f4Var = j4Var.f8769x;
        k1 k1Var = j4Var.f8760d;
        k1 k1Var2 = f4Var.f9150e.f8760d;
        j4.T(k1Var2);
        String F = k1Var2.F(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = ((q1) f4Var.f1478d).f8935r;
        builder.scheme(gVar2.z(str, e0.f8637m0));
        if (TextUtils.isEmpty(F)) {
            builder.authority(gVar2.z(str, e0.f8639n0));
        } else {
            String z10 = gVar2.z(str, e0.f8639n0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(F).length() + 1 + String.valueOf(z10).length());
            sb2.append(F);
            sb2.append(".");
            sb2.append(z10);
            builder.authority(sb2.toString());
        }
        builder.path(gVar2.z(str, e0.f8641o0));
        I(builder, "gmp_app_id", ((e9) d9Var.f2389e).I(), hashSet);
        gVar.y();
        I(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String C = ((e9) d9Var.f2389e).C();
        d0 d0Var = e0.R0;
        if (gVar.D(str, d0Var)) {
            j4.T(k1Var);
            if (k1Var.M(str)) {
                C = "";
            }
        }
        I(builder, "app_instance_id", C, hashSet);
        I(builder, "rdid", ((e9) d9Var.f2389e).z(), hashSet);
        I(builder, "bundle_id", d9Var.n(), hashSet);
        String m10 = v8Var.m();
        String g = d2.g(m10, d2.f8585f, d2.f8580a);
        if (true != TextUtils.isEmpty(g)) {
            m10 = g;
        }
        I(builder, "app_event_name", m10, hashSet);
        I(builder, "app_version", String.valueOf(((e9) d9Var.f2389e).O()), hashSet);
        String n22 = ((e9) d9Var.f2389e).n2();
        if (gVar.D(str, d0Var)) {
            j4.T(k1Var);
            if (k1Var.L(str) && !TextUtils.isEmpty(n22) && (indexOf = n22.indexOf(".")) != -1) {
                n22 = n22.substring(0, indexOf);
            }
        }
        I(builder, "os_version", n22, hashSet);
        I(builder, "timestamp", String.valueOf(v8Var.o()), hashSet);
        if (((e9) d9Var.f2389e).B()) {
            I(builder, "lat", "1", hashSet);
        }
        I(builder, "privacy_sandbox_version", String.valueOf(((e9) d9Var.f2389e).K0()), hashSet);
        I(builder, "trigger_uri_source", "1", hashSet);
        I(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), hashSet);
        I(builder, "request_uuid", str2, hashSet);
        List<z8> g2 = v8Var.g();
        Bundle bundle = new Bundle();
        for (z8 z8Var : g2) {
            String u2 = z8Var.u();
            if (z8Var.B()) {
                bundle.putString(u2, String.valueOf(z8Var.C()));
            } else if (z8Var.z()) {
                bundle.putString(u2, String.valueOf(z8Var.A()));
            } else if (z8Var.v()) {
                bundle.putString(u2, z8Var.w());
            } else if (z8Var.x()) {
                bundle.putString(u2, String.valueOf(z8Var.y()));
            }
        }
        L(builder, gVar.z(str, e0.f8649s0).split("\\|"), bundle, hashSet);
        List<n9> unmodifiableList = Collections.unmodifiableList(((e9) d9Var.f2389e).Z1());
        Bundle bundle2 = new Bundle();
        for (n9 n9Var : unmodifiableList) {
            String v10 = n9Var.v();
            if (n9Var.C()) {
                bundle2.putString(v10, String.valueOf(n9Var.D()));
            } else if (n9Var.A()) {
                bundle2.putString(v10, String.valueOf(n9Var.B()));
            } else if (n9Var.w()) {
                bundle2.putString(v10, n9Var.x());
            } else if (n9Var.y()) {
                bundle2.putString(v10, String.valueOf(n9Var.z()));
            }
        }
        L(builder, gVar.z(str, e0.f8647r0).split("\\|"), bundle2, hashSet);
        I(builder, "dma", true != ((e9) d9Var.f2389e).H0() ? "0" : "1", hashSet);
        if (!((e9) d9Var.f2389e).J0().isEmpty()) {
            I(builder, "dma_cps", ((e9) d9Var.f2389e).J0(), hashSet);
        }
        if (((e9) d9Var.f2389e).P0()) {
            j8 Q0 = ((e9) d9Var.f2389e).Q0();
            if (!Q0.H().isEmpty()) {
                I(builder, "dl_gclid", Q0.H(), hashSet);
            }
            if (!Q0.J().isEmpty()) {
                I(builder, "dl_gbraid", Q0.J(), hashSet);
            }
            if (!Q0.L().isEmpty()) {
                I(builder, "dl_gs", Q0.L(), hashSet);
            }
            if (Q0.N() > 0) {
                I(builder, "dl_ss_ts", String.valueOf(Q0.N()), hashSet);
            }
            if (!Q0.P().isEmpty()) {
                I(builder, "mr_gclid", Q0.P(), hashSet);
            }
            if (!Q0.R().isEmpty()) {
                I(builder, "mr_gbraid", Q0.R(), hashSet);
            }
            if (!Q0.T().isEmpty()) {
                I(builder, "mr_gs", Q0.T(), hashSet);
            }
            if (Q0.V() > 0) {
                I(builder, "mr_click_ts", String.valueOf(Q0.V()), hashSet);
            }
        }
        return new x3(1, currentTimeMillis, builder.build().toString());
    }

    public final w8 S(q qVar) {
        v8 J = w8.J();
        long j = qVar.f8931f;
        J.b();
        ((w8) J.f2389e).R(j);
        long j3 = qVar.f8930e;
        J.b();
        ((w8) J.f2389e).t(j3);
        t tVar = qVar.g;
        Objects.requireNonNull(tVar);
        Bundle bundle = tVar.f9010d;
        for (String str : bundle.keySet()) {
            y8 F = z8.F();
            F.g(str);
            Object obj = bundle.get(str);
            c7.c0.g(obj);
            Q(F, obj);
            J.k(F);
        }
        String str2 = qVar.f8928c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            y8 F2 = z8.F();
            F2.g("_o");
            F2.h(str2);
            J.j((z8) F2.d());
        }
        return (w8) J.d();
    }

    public final String T(c9 c9Var) {
        m8 M0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (c9Var.y()) {
            N(sb2, 0, "upload_subdomain", c9Var.z());
        }
        if (c9Var.w()) {
            N(sb2, 0, "sgtm_join_id", c9Var.x());
        }
        for (e9 e9Var : c9Var.t()) {
            if (e9Var != null) {
                H(1, sb2);
                sb2.append("bundle {\n");
                if (e9Var.T()) {
                    N(sb2, 1, "protocol_version", Integer.valueOf(e9Var.T0()));
                }
                q1 q1Var = (q1) this.f1478d;
                g gVar = q1Var.f8935r;
                p0 p0Var = q1Var.f8941x;
                if (gVar.D(e9Var.t(), e0.M0) && e9Var.z0()) {
                    N(sb2, 1, "session_stitching_token", e9Var.A0());
                }
                N(sb2, 1, "platform", e9Var.m2());
                if (e9Var.v()) {
                    N(sb2, 1, "gmp_version", Long.valueOf(e9Var.w()));
                }
                if (e9Var.x()) {
                    N(sb2, 1, "uploading_gmp_version", Long.valueOf(e9Var.y()));
                }
                if (e9Var.v0()) {
                    N(sb2, 1, "dynamite_version", Long.valueOf(e9Var.w0()));
                }
                if (e9Var.P()) {
                    N(sb2, 1, "config_version", Long.valueOf(e9Var.Q()));
                }
                N(sb2, 1, "gmp_app_id", e9Var.I());
                N(sb2, 1, "app_id", e9Var.t());
                N(sb2, 1, "app_version", e9Var.u());
                if (e9Var.N()) {
                    N(sb2, 1, "app_version_major", Integer.valueOf(e9Var.O()));
                }
                N(sb2, 1, "firebase_instance_id", e9Var.M());
                if (e9Var.D()) {
                    N(sb2, 1, "dev_cert_hash", Long.valueOf(e9Var.E()));
                }
                N(sb2, 1, "app_store", e9Var.s2());
                if (e9Var.c2()) {
                    N(sb2, 1, "upload_timestamp_millis", Long.valueOf(e9Var.d2()));
                }
                if (e9Var.e2()) {
                    N(sb2, 1, "start_timestamp_millis", Long.valueOf(e9Var.f2()));
                }
                if (e9Var.g2()) {
                    N(sb2, 1, "end_timestamp_millis", Long.valueOf(e9Var.h2()));
                }
                if (e9Var.i2()) {
                    N(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(e9Var.j2()));
                }
                if (e9Var.k2()) {
                    N(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(e9Var.l2()));
                }
                N(sb2, 1, "app_instance_id", e9Var.C());
                N(sb2, 1, "resettable_device_id", e9Var.z());
                N(sb2, 1, "ds_id", e9Var.S());
                if (e9Var.A()) {
                    N(sb2, 1, "limited_ad_tracking", Boolean.valueOf(e9Var.B()));
                }
                N(sb2, 1, "os_version", e9Var.n2());
                N(sb2, 1, "device_model", e9Var.o2());
                N(sb2, 1, "user_default_language", e9Var.p2());
                if (e9Var.q2()) {
                    N(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(e9Var.r2()));
                }
                if (e9Var.F()) {
                    N(sb2, 1, "bundle_sequential_index", Integer.valueOf(e9Var.G()));
                }
                if (e9Var.N0()) {
                    N(sb2, 1, "delivery_index", Integer.valueOf(e9Var.O0()));
                }
                if (e9Var.J()) {
                    N(sb2, 1, "service_upload", Boolean.valueOf(e9Var.K()));
                }
                N(sb2, 1, "health_monitor", e9Var.H());
                if (e9Var.t0()) {
                    N(sb2, 1, "retry_counter", Integer.valueOf(e9Var.u0()));
                }
                if (e9Var.x0()) {
                    N(sb2, 1, "consent_signals", e9Var.y0());
                }
                if (e9Var.G0()) {
                    N(sb2, 1, "is_dma_region", Boolean.valueOf(e9Var.H0()));
                }
                if (e9Var.I0()) {
                    N(sb2, 1, "core_platform_services", e9Var.J0());
                }
                if (e9Var.E0()) {
                    N(sb2, 1, "consent_diagnostics", e9Var.F0());
                }
                if (e9Var.B0()) {
                    N(sb2, 1, "target_os_version", Long.valueOf(e9Var.C0()));
                }
                com.google.android.gms.internal.measurement.i4.a();
                if (gVar.D(e9Var.t(), e0.O0)) {
                    N(sb2, 1, "ad_services_version", Integer.valueOf(e9Var.K0()));
                    if (e9Var.L0() && (M0 = e9Var.M0()) != null) {
                        H(2, sb2);
                        sb2.append("attribution_eligibility_status {\n");
                        N(sb2, 2, "eligible", Boolean.valueOf(M0.t()));
                        N(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(M0.u()));
                        N(sb2, 2, "pre_r", Boolean.valueOf(M0.v()));
                        N(sb2, 2, "r_extensions_too_old", Boolean.valueOf(M0.w()));
                        N(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(M0.x()));
                        N(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(M0.y()));
                        N(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(M0.z()));
                        H(2, sb2);
                        sb2.append("}\n");
                    }
                }
                if (e9Var.P0()) {
                    j8 Q0 = e9Var.Q0();
                    H(2, sb2);
                    sb2.append("ad_campaign_info {\n");
                    if (Q0.G()) {
                        N(sb2, 2, "deep_link_gclid", Q0.H());
                    }
                    if (Q0.I()) {
                        N(sb2, 2, "deep_link_gbraid", Q0.J());
                    }
                    if (Q0.K()) {
                        N(sb2, 2, "deep_link_gad_source", Q0.L());
                    }
                    if (Q0.W()) {
                        N(sb2, 2, "deep_link_url", Q0.X());
                    }
                    if (Q0.M()) {
                        N(sb2, 2, "deep_link_session_millis", Long.valueOf(Q0.N()));
                    }
                    if (Q0.O()) {
                        N(sb2, 2, "market_referrer_gclid", Q0.P());
                    }
                    if (Q0.Q()) {
                        N(sb2, 2, "market_referrer_gbraid", Q0.R());
                    }
                    if (Q0.S()) {
                        N(sb2, 2, "market_referrer_gad_source", Q0.T());
                    }
                    if (Q0.U()) {
                        N(sb2, 2, "market_referrer_click_millis", Long.valueOf(Q0.V()));
                    }
                    H(2, sb2);
                    sb2.append("}\n");
                }
                if (e9Var.U()) {
                    N(sb2, 1, "batching_timestamp_millis", Long.valueOf(e9Var.V()));
                }
                if (e9Var.R0()) {
                    l9 S0 = e9Var.S0();
                    H(2, sb2);
                    sb2.append("sgtm_diagnostics {\n");
                    int x10 = S0.x();
                    N(sb2, 2, "upload_type", x10 != 1 ? x10 != 2 ? x10 != 3 ? x10 != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    N(sb2, 2, "client_upload_eligibility", v4.a.y(S0.t()));
                    int y3 = S0.y();
                    N(sb2, 2, "service_upload_eligibility", y3 != 1 ? y3 != 2 ? y3 != 3 ? y3 != 4 ? y3 != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    H(2, sb2);
                    sb2.append("}\n");
                }
                if (e9Var.W()) {
                    s8 X = e9Var.X();
                    H(2, sb2);
                    sb2.append("consent_info_extra {\n");
                    for (r8 r8Var : X.t()) {
                        H(3, sb2);
                        sb2.append("limited_data_modes {\n");
                        int u2 = r8Var.u();
                        N(sb2, 3, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, u2 != 1 ? u2 != 2 ? u2 != 3 ? u2 != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int v10 = r8Var.v();
                        N(sb2, 3, "mode", v10 != 1 ? v10 != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        H(3, sb2);
                        sb2.append("}\n");
                    }
                    H(2, sb2);
                    sb2.append("}\n");
                }
                com.google.android.gms.internal.measurement.t1<n9> Z1 = e9Var.Z1();
                if (Z1 != null) {
                    for (n9 n9Var : Z1) {
                        if (n9Var != null) {
                            H(2, sb2);
                            sb2.append("user_property {\n");
                            N(sb2, 2, "set_timestamp_millis", n9Var.t() ? Long.valueOf(n9Var.u()) : null);
                            N(sb2, 2, "name", p0Var.c(n9Var.v()));
                            N(sb2, 2, "string_value", n9Var.x());
                            N(sb2, 2, "int_value", n9Var.y() ? Long.valueOf(n9Var.z()) : null);
                            N(sb2, 2, "double_value", n9Var.C() ? Double.valueOf(n9Var.D()) : null);
                            H(2, sb2);
                            sb2.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.t1<o8> L = e9Var.L();
                if (L != null) {
                    for (o8 o8Var : L) {
                        if (o8Var != null) {
                            H(2, sb2);
                            sb2.append("audience_membership {\n");
                            if (o8Var.t()) {
                                N(sb2, 2, "audience_id", Integer.valueOf(o8Var.u()));
                            }
                            if (o8Var.y()) {
                                N(sb2, 2, "new_audience", Boolean.valueOf(o8Var.z()));
                            }
                            M(sb2, "current_data", o8Var.v());
                            if (o8Var.w()) {
                                M(sb2, "previous_data", o8Var.x());
                            }
                            H(2, sb2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<w8> T1 = e9Var.T1();
                if (T1 != null) {
                    for (w8 w8Var : T1) {
                        if (w8Var != null) {
                            H(2, sb2);
                            sb2.append("event {\n");
                            N(sb2, 2, "name", p0Var.a(w8Var.y()));
                            if (w8Var.z()) {
                                N(sb2, 2, "timestamp_millis", Long.valueOf(w8Var.A()));
                            }
                            if (gVar.D(null, e0.f8619e1) && w8Var.F()) {
                                N(sb2, 2, "corrected_timestamp_millis", Long.valueOf(w8Var.G()));
                            }
                            if (w8Var.B()) {
                                N(sb2, 2, "previous_timestamp_millis", Long.valueOf(w8Var.C()));
                            }
                            if (w8Var.D()) {
                                N(sb2, 2, NewHtcHomeBadger.COUNT, Integer.valueOf(w8Var.E()));
                            }
                            if (w8Var.w() != 0) {
                                F(sb2, 2, (com.google.android.gms.internal.measurement.t1) w8Var.v());
                            }
                            H(2, sb2);
                            sb2.append("}\n");
                        }
                    }
                }
                H(1, sb2);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    public final String U(q7 q7Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (q7Var.t()) {
            N(sb2, 0, "filter_id", Integer.valueOf(q7Var.u()));
        }
        N(sb2, 0, "property_name", ((q1) this.f1478d).f8941x.c(q7Var.v()));
        String J = J(q7Var.x(), q7Var.y(), q7Var.A());
        if (!J.isEmpty()) {
            N(sb2, 0, "filter_type", J);
        }
        G(sb2, 1, q7Var.w());
        sb2.append("}\n");
        return sb2.toString();
    }

    public final Parcelable V(byte[] bArr, Parcelable.Creator creator) {
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
            } catch (d7.b unused) {
                v0 v0Var = ((q1) this.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9050t.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public final List Z(com.google.android.gms.internal.measurement.s1 s1Var, List list) {
        int i3;
        q1 q1Var = (q1) this.f1478d;
        ArrayList arrayList = new ArrayList(s1Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9053w.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9053w.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i3 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i3);
    }

    public final boolean a0(long j, long j3) {
        if (j == 0 || j3 <= 0) {
            return true;
        }
        ((q1) this.f1478d).f8942y.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j3;
    }

    public final long b0(byte[] bArr) {
        c7.c0.g(bArr);
        q1 q1Var = (q1) this.f1478d;
        p4 p4Var = q1Var.f8940w;
        q1.j(p4Var);
        p4Var.s();
        MessageDigest L = p4.L();
        if (L != null) {
            return p4.M(L.digest(bArr));
        }
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        v0Var.f9050t.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] c0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(e2, "Failed to gzip content");
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(Map map) {
        long epochMilli;
        q1 q1Var = (q1) this.f1478d;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return;
        }
        String D = D("Date", map);
        if (TextUtils.isEmpty(D)) {
            return;
        }
        if (i3 >= 26) {
            try {
                epochMilli = ZonedDateTime.parse(D, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
            } catch (DateTimeParseException unused) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9053w.b(D, "Unable to parse header time, time");
            }
            if (epochMilli <= 0) {
                q1Var.f8942y.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                s();
                if (this.f8821s == 0) {
                    this.f8820r = elapsedRealtime;
                    this.f8821s = epochMilli;
                    return;
                }
                return;
            }
            return;
        }
        epochMilli = 0;
        if (epochMilli <= 0) {
        }
    }

    public final long z(long j) {
        s();
        long j3 = this.f8821s;
        if (j3 == 0 || j == 0) {
            return 0L;
        }
        return (j3 - this.f8820r) + j;
    }

    @Override // s7.d4
    public final void v() {
    }
}
