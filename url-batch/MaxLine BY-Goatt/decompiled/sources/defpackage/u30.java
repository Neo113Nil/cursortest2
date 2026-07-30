package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import defpackage.aa2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.coroutines.g;
import kotlin.ranges.c;
import kotlin.ranges.d;
import org.json.JSONArray;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class u30 implements g, k93, ih0, vr1, ek0, ix0 {
    public static u30 n;
    public final /* synthetic */ int m;

    public /* synthetic */ u30(int i) {
        this.m = i;
    }

    public static final float d(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    public static String g(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 128;
            int i7 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || up2.p(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !m(str, i5, length)))) || (codePointAt == 43 && z3)))) {
                fq fqVar = new fq();
                fqVar.R(str, i4, i5);
                fq fqVar2 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            fqVar.Q(z ? "+" : "%2B");
                        } else if (codePointAt2 < i7 || codePointAt2 == 127 || ((codePointAt2 >= i6 && !z4) || up2.p(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z || (z2 && !m(str, i5, length)))))) {
                            if (fqVar2 == null) {
                                fqVar2 = new fq();
                            }
                            fqVar2.S(codePointAt2);
                            while (!fqVar2.m()) {
                                byte readByte = fqVar2.readByte();
                                fqVar.L(37);
                                char[] cArr = kz0.j;
                                fqVar.L(cArr[((readByte & 255) >> 4) & 15]);
                                fqVar.L(cArr[readByte & 15]);
                            }
                        } else {
                            fqVar.S(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 128;
                    i7 = 32;
                }
                return fqVar.y(fqVar.n, yt.b);
            }
            i5 += Character.charCount(codePointAt);
        }
        return str.substring(i4, length);
    }

    public static String h(StringBuilder sb) {
        int length = sb.length();
        if (length == 0) {
            lh.g("StringBuilder must not be empty");
            return null;
        }
        int charAt = (sb.charAt(0) << 18) + ((length >= 2 ? sb.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb.charAt(3) : (char) 0);
        char c = (char) ((charAt >> 16) & 255);
        char c2 = (char) ((charAt >> 8) & 255);
        char c3 = (char) (charAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c);
        if (length >= 2) {
            sb2.append(c2);
        }
        if (length >= 3) {
            sb2.append(c3);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(hg0 hg0Var, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                f13[] f13VarArr = (f13[]) editable.getSpans(selectionStart, min, f13.class);
                if (f13VarArr != null && f13VarArr.length > 0) {
                    for (f13 f13Var : f13VarArr) {
                        int spanStart = editable.getSpanStart(f13Var);
                        int spanEnd = editable.getSpanEnd(f13Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    hg0Var.beginBatchEdit();
                    editable.delete(max3, min2);
                    hg0Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && n33.o(str.charAt(i + 1)) != -1 && n33.o(str.charAt(i3)) != -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ba2] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public static List n(String str) {
        ?? ba2Var;
        if (str == null || up2.y(str)) {
            return ah0.m;
        }
        try {
            aa2.a aVar = aa2.m;
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ba2Var = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                ba2Var.add(jSONArray.getString(i));
            }
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            ba2Var = new ba2(th);
        }
        ah0 ah0Var = ah0.m;
        aa2.a aVar3 = aa2.m;
        boolean z = ba2Var instanceof ba2;
        ah0 ah0Var2 = ba2Var;
        if (z) {
            ah0Var2 = ah0Var;
        }
        return ah0Var2;
    }

    public static String o(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        String jSONArray2 = jSONArray.toString();
        jSONArray2.getClass();
        return jSONArray2;
    }

    public static String q(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                fq fqVar = new fq();
                fqVar.R(str, i, i5);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            fqVar.L(32);
                            i5++;
                        }
                        fqVar.S(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int o = n33.o(str.charAt(i5 + 1));
                        int o2 = n33.o(str.charAt(i4));
                        if (o != -1 && o2 != -1) {
                            fqVar.L((o << 4) + o2);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        fqVar.S(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return fqVar.y(fqVar.n, yt.b);
            }
            i5++;
        }
        return str.substring(i, i2);
    }

    public static jk r(String str) {
        Object ba2Var;
        str.getClass();
        try {
            aa2.a aVar = aa2.m;
            ba2Var = jk.valueOf(str);
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            ba2Var = new ba2(th);
        }
        Object obj = jk.m;
        if (ba2Var instanceof ba2) {
            ba2Var = obj;
        }
        return (jk) ba2Var;
    }

    public static ArrayList s(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int v = up2.v(str, '&', i, 4);
            if (v == -1) {
                v = str.length();
            }
            int v2 = up2.v(str, '=', i, 4);
            if (v2 == -1 || v2 > v) {
                arrayList.add(str.substring(i, v));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, v2));
                arrayList.add(str.substring(v2 + 1, v));
            }
            i = v + 1;
        }
        return arrayList;
    }

    public static void t(List list, StringBuilder sb) {
        list.getClass();
        c e = d.e(d.f(0, list.size()), 2);
        int i = e.m;
        int i2 = e.n;
        int i3 = e.o;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    @Override // defpackage.ix0
    public boolean a() {
        boolean z;
        synchronized (tk0.a) {
            try {
                int i = tk0.c;
                tk0.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > tk0.d + 30000) {
                    tk0.c = 0;
                    tk0.d = SystemClock.uptimeMillis();
                    String[] list = tk0.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    tk0.e = list.length < 800;
                }
                z = tk0.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ix0
    public boolean b(pl2 pl2Var) {
        zm3 zm3Var = pl2Var.a;
        if ((zm3Var instanceof gb0 ? ((gb0) zm3Var).o : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        zm3 zm3Var2 = pl2Var.b;
        return (zm3Var2 instanceof gb0 ? ((gb0) zm3Var2).o : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.vr1
    public boolean c() {
        return true;
    }

    public void e(uc2 uc2Var, Object obj) {
        a61 a61Var = (a61) obj;
        uc2Var.getClass();
        a61Var.getClass();
        long j = a61Var.a;
        uc2Var.d(j, 1);
        uc2Var.w(2, a61Var.b);
        uc2Var.w(3, a61Var.c);
        uc2Var.w(4, a61Var.d);
        String str = a61Var.e;
        if (str == null) {
            uc2Var.c(5);
        } else {
            uc2Var.w(5, str);
        }
        Double d = a61Var.f;
        if (d == null) {
            uc2Var.c(6);
        } else {
            uc2Var.a(d.doubleValue(), 6);
        }
        Long l = a61Var.g;
        if (l == null) {
            uc2Var.c(7);
        } else {
            uc2Var.d(l.longValue(), 7);
        }
        String str2 = a61Var.h;
        if (str2 == null) {
            uc2Var.c(8);
        } else {
            uc2Var.w(8, str2);
        }
        Double d2 = a61Var.i;
        if (d2 == null) {
            uc2Var.c(9);
        } else {
            uc2Var.a(d2.doubleValue(), 9);
        }
        String str3 = a61Var.j;
        if (str3 == null) {
            uc2Var.c(10);
        } else {
            uc2Var.w(10, str3);
        }
        String str4 = a61Var.k;
        if (str4 == null) {
            uc2Var.c(11);
        } else {
            uc2Var.w(11, str4);
        }
        uc2Var.d(a61Var.l ? 1L : 0L, 12);
        uc2Var.d(a61Var.m, 13);
        uc2Var.d(j, 14);
    }

    @Override // defpackage.k93
    public eo f(String str, int i, EnumMap enumMap) {
        int i2;
        int i3;
        int i4;
        eo eoVar;
        int i5;
        int i6;
        if (str.isEmpty()) {
            lh.e("Found empty contents");
            return null;
        }
        if (i != 6) {
            lh.e("Can only encode DATA_MATRIX, but got ".concat(q40.v(i)));
            return null;
        }
        as2 as2Var = (as2) enumMap.get(gh0.o);
        if (as2Var == null) {
            as2Var = as2.m;
        }
        if (enumMap.get(gh0.p) != null) {
            b71.o();
            return null;
        }
        if (enumMap.get(gh0.q) != null) {
            b71.o();
            return null;
        }
        int i7 = 0;
        int i8 = 1;
        ih0[] ih0VarArr = {new by1(21), new nj(9), new cu2(i7), new cu2(i8), new u30(4), new nj(3)};
        jh0 jh0Var = new jh0(str);
        jh0Var.b = as2Var;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            jh0Var.d((char) 236);
            jh0Var.g = 2;
            jh0Var.d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            jh0Var.d((char) 237);
            jh0Var.g = 2;
            jh0Var.d += 7;
        }
        int i9 = 0;
        while (jh0Var.b()) {
            ih0VarArr[i9].k(jh0Var);
            int i10 = jh0Var.e;
            if (i10 >= 0) {
                jh0Var.e = -1;
                i9 = i10;
            }
        }
        StringBuilder sb = jh0Var.c;
        int length = sb.length();
        jh0Var.c(sb.length());
        int i11 = jh0Var.f.b;
        if (length < i11 && i9 != 0 && i9 != 5 && i9 != 4) {
            jh0Var.d((char) 254);
        }
        if (sb.length() < i11) {
            sb.append((char) 129);
        }
        while (sb.length() < i11) {
            int length2 = ((sb.length() + 1) * 149) % 253;
            int i12 = length2 + 130;
            if (i12 > 254) {
                i12 = length2 - 124;
            }
            sb.append((char) i12);
        }
        String sb2 = sb.toString();
        zr2 e = zr2.e(sb2.length(), as2Var);
        int i13 = e.e;
        int i14 = e.d;
        int[] iArr = ji0.a;
        int length3 = sb2.length();
        int i15 = e.b;
        int i16 = e.c;
        if (length3 != i15) {
            lh.e("The number of codewords does not match the selected symbol");
            return null;
        }
        StringBuilder sb3 = new StringBuilder(i15 + i16);
        sb3.append(sb2);
        int c = e.c();
        if (c == 1) {
            sb3.append(ji0.a(i16, sb2));
        } else {
            sb3.setLength(sb3.capacity());
            int[] iArr2 = new int[c];
            int[] iArr3 = new int[c];
            int[] iArr4 = new int[c];
            int i17 = 0;
            while (i17 < c) {
                int i18 = i17 + 1;
                iArr2[i17] = e.a(i18);
                iArr3[i17] = e.h;
                iArr4[i17] = 0;
                if (i17 > 0) {
                    iArr4[i17] = iArr4[i17 - 1] + iArr2[i17];
                }
                i17 = i18;
            }
            for (int i19 = 0; i19 < c; i19++) {
                StringBuilder sb4 = new StringBuilder(iArr2[i19]);
                for (int i20 = i19; i20 < i15; i20 += c) {
                    sb4.append(sb2.charAt(i20));
                }
                String a = ji0.a(iArr3[i19], sb4.toString());
                int i21 = i19;
                int i22 = 0;
                while (i21 < iArr3[i19] * c) {
                    sb3.setCharAt(i15 + i21, a.charAt(i22));
                    i21 += c;
                    i22++;
                }
            }
        }
        String sb5 = sb3.toString();
        int b = e.b() * i14;
        int d = e.d() * i13;
        sg sgVar = new sg(sb5, b, d);
        int i23 = sgVar.c;
        byte[] bArr = (byte[]) sgVar.e;
        int i24 = 0;
        int i25 = 0;
        int i26 = 4;
        while (true) {
            if (i26 == d && i24 == 0) {
                int i27 = d - 1;
                sgVar.j(i27, i7, i25, i8);
                sgVar.j(i27, i8, i25, 2);
                sgVar.j(i27, 2, i25, 3);
                sgVar.j(i7, b - 2, i25, 4);
                int i28 = b - 1;
                sgVar.j(i7, i28, i25, 5);
                sgVar.j(1, i28, i25, 6);
                sgVar.j(2, i28, i25, 7);
                sgVar.j(3, i28, i25, 8);
                i25++;
            }
            i2 = d - 2;
            if (i26 == i2 && i24 == 0 && b % 4 != 0) {
                sgVar.j(d - 3, 0, i25, 1);
                sgVar.j(i2, 0, i25, 2);
                sgVar.j(d - 1, 0, i25, 3);
                sgVar.j(0, b - 4, i25, 4);
                sgVar.j(0, b - 3, i25, 5);
                sgVar.j(0, b - 2, i25, 6);
                int i29 = b - 1;
                sgVar.j(0, i29, i25, 7);
                sgVar.j(1, i29, i25, 8);
                i25++;
            }
            if (i26 == i2 && i24 == 0 && b % 8 == 4) {
                sgVar.j(d - 3, 0, i25, 1);
                sgVar.j(i2, 0, i25, 2);
                sgVar.j(d - 1, 0, i25, 3);
                sgVar.j(0, b - 2, i25, 4);
                int i30 = b - 1;
                sgVar.j(0, i30, i25, 5);
                sgVar.j(1, i30, i25, 6);
                sgVar.j(2, i30, i25, 7);
                sgVar.j(3, i30, i25, 8);
                i25++;
            }
            if (i26 == d + 4 && i24 == 2 && b % 8 == 0) {
                int i31 = d - 1;
                sgVar.j(i31, 0, i25, 1);
                int i32 = b - 1;
                sgVar.j(i31, i32, i25, 2);
                int i33 = b - 3;
                i3 = i23;
                sgVar.j(0, i33, i25, 3);
                int i34 = b - 2;
                i4 = i26;
                sgVar.j(0, i34, i25, 4);
                sgVar.j(0, i32, i25, 5);
                sgVar.j(1, i33, i25, 6);
                sgVar.j(1, i34, i25, 7);
                sgVar.j(1, i32, i25, 8);
                i25++;
            } else {
                i3 = i23;
                i4 = i26;
            }
            int i35 = i4;
            while (true) {
                if (i35 < d && i24 >= 0 && bArr[(i35 * i3) + i24] < 0) {
                    sgVar.p(i35, i24, i25);
                    i25++;
                }
                int i36 = i35 - 2;
                int i37 = i24 + 2;
                if (i36 < 0 || i37 >= b) {
                    break;
                }
                i35 = i36;
                i24 = i37;
            }
            int i38 = i35 - 1;
            int i39 = i24 + 5;
            while (true) {
                if (i38 >= 0 && i39 < b && bArr[(i38 * i3) + i39] < 0) {
                    sgVar.p(i38, i39, i25);
                    i25++;
                }
                int i40 = i38 + 2;
                int i41 = i39 - 2;
                if (i40 >= d || i41 < 0) {
                    break;
                }
                i38 = i40;
                i39 = i41;
            }
            i26 = i38 + 5;
            i24 = i39 - 1;
            if (i26 >= d && i24 >= b) {
                break;
            }
            i8 = 1;
            i23 = i3;
            i7 = 0;
        }
        int i42 = b - 1;
        boolean z = true;
        int i43 = d - 1;
        if (bArr[(i43 * i3) + i42] < 0) {
            bArr[(i43 * i3) + i42] = 1;
            bArr[(i2 * i3) + (b - 2)] = 1;
        }
        int b2 = e.b() * i14;
        int d2 = e.d() * i13;
        yq yqVar = new yq((e.b() * i14) + (e.b() << 1), (e.d() * i13) + (e.d() << 1), 0);
        int i44 = 0;
        int i45 = 0;
        while (i45 < d2) {
            int i46 = i45 % i13;
            if (i46 == 0) {
                int i47 = 0;
                int i48 = 0;
                while (i47 < (e.b() * i14) + (e.b() << 1)) {
                    yqVar.t(i48, i44, i47 % 2 == 0 ? z : false);
                    i48++;
                    i47++;
                    z = true;
                }
                i44++;
            }
            int i49 = 0;
            for (int i50 = 0; i50 < b2; i50++) {
                int i51 = i50 % i14;
                if (i51 == 0) {
                    yqVar.t(i49, i44, true);
                    i49++;
                }
                yqVar.t(i49, i44, bArr[(i45 * i3) + i50] == 1);
                int i52 = i49 + 1;
                if (i51 == i14 - 1) {
                    yqVar.t(i52, i44, i45 % 2 == 0);
                    i49 += 2;
                } else {
                    i49 = i52;
                }
            }
            int i53 = i44 + 1;
            if (i46 == i13 - 1) {
                int i54 = 0;
                for (int i55 = 0; i55 < (e.b() * i14) + (e.b() << 1); i55++) {
                    yqVar.t(i54, i53, true);
                    i54++;
                }
                i44 += 2;
            } else {
                i44 = i53;
            }
            i45++;
            z = true;
        }
        int i56 = yqVar.n;
        int i57 = yqVar.o;
        int max = Math.max(200, i56);
        int max2 = Math.max(200, i57);
        int min = Math.min(max / i56, max2 / i57);
        int i58 = (max - (i56 * min)) / 2;
        int i59 = (max2 - (i57 * min)) / 2;
        if (200 < i57 || 200 < i56) {
            eoVar = new eo(i56, i57);
            i5 = 0;
            i6 = 0;
        } else {
            eoVar = new eo(200, 200);
            i5 = i58;
            i6 = i59;
        }
        int[] iArr5 = eoVar.p;
        int length4 = iArr5.length;
        for (int i60 = 0; i60 < length4; i60++) {
            iArr5[i60] = 0;
        }
        int i61 = i6;
        int i62 = 0;
        while (i62 < i57) {
            int i63 = i5;
            int i64 = 0;
            while (i64 < i56) {
                if (yqVar.r(i64, i62) == 1) {
                    eoVar.c(i63, i61, min, min);
                }
                i64++;
                i63 += min;
            }
            i62++;
            i61 += min;
        }
        return eoVar;
    }

    @Override // defpackage.w52
    public Object get() {
        return new e92(1, Executors.newSingleThreadExecutor());
    }

    public ij1 i(Context context) {
        ij1 ij1Var;
        context.getClass();
        ij1 ij1Var2 = ij1.e;
        if (ij1Var2 != null) {
            return ij1Var2;
        }
        synchronized (this) {
            ij1Var = ij1.e;
            if (ij1Var == null) {
                ij1Var = new ij1(context);
                ij1.e = ij1Var;
            }
        }
        return ij1Var;
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0051, code lost:
    
        defpackage.iv1.G(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0054, code lost:
    
        throw null;
     */
    @Override // defpackage.ih0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(jh0 jh0Var) {
        boolean z;
        String str = jh0Var.a;
        StringBuilder sb = jh0Var.c;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            z = true;
            if (!jh0Var.b()) {
                break;
            }
            char a = jh0Var.a();
            if (a >= ' ' && a <= '?') {
                sb2.append(a);
            } else if (a < '@' || a > '^') {
                break;
            } else {
                sb2.append((char) (a - '@'));
            }
            jh0Var.d++;
            if (sb2.length() >= 4) {
                sb.append(h(sb2));
                sb2.delete(0, 4);
                if (iv1.M(str, jh0Var.d, 4) != 4) {
                    jh0Var.e = 0;
                    break;
                }
            }
        }
        sb2.append((char) 31);
        try {
            int length = sb2.length();
            if (length == 0) {
                return;
            }
            if (length == 1) {
                jh0Var.c(sb.length());
                int length2 = jh0Var.f.b - sb.length();
                int length3 = (str.length() - jh0Var.g) - jh0Var.d;
                if (length3 > length2) {
                    jh0Var.c(sb.length() + 1);
                    length2 = jh0Var.f.b - sb.length();
                }
                if (length3 <= length2 && length2 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String h = h(sb2);
            if (jh0Var.b() || i > 2) {
                z = false;
            }
            if (i <= 2) {
                jh0Var.c(sb.length() + i);
                if (jh0Var.f.b - sb.length() >= 3) {
                    jh0Var.c(sb.length() + h.length());
                    z = false;
                }
            }
            if (z) {
                jh0Var.f = null;
                jh0Var.d -= i;
            } else {
                sb.append(h);
            }
        } finally {
            jh0Var.e = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b1, code lost:
    
        if (defpackage.w71.a(defpackage.s93.l(r9.getKeyCode()), defpackage.ji1.g) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0293, code lost:
    
        if (defpackage.w71.a(r8, defpackage.ji1.q) != false) goto L197;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int p(KeyEvent keyEvent) {
        int i;
        int i2 = 20;
        switch (this.m) {
            case 23:
                d81 d81Var = d81.m;
                if (!((Boolean) d81Var.invoke(new x71(keyEvent))).booleanValue() || !keyEvent.isShiftPressed()) {
                    if (((Boolean) d81Var.invoke(new x71(keyEvent))).booleanValue()) {
                        long x = z71.x(keyEvent);
                        if (!(w71.a(x, ji1.b) ? true : w71.a(x, ji1.q))) {
                            if (!w71.a(x, ji1.d)) {
                                if (!w71.a(x, ji1.f)) {
                                    if (w71.a(x, ji1.a)) {
                                        return 26;
                                    }
                                    if (!w71.a(x, ji1.e)) {
                                        if (w71.a(x, ji1.g)) {
                                            return 46;
                                        }
                                        return 0;
                                    }
                                    return 47;
                                }
                                return 19;
                            }
                            return 18;
                        }
                        return 17;
                    }
                    if (!keyEvent.isCtrlPressed()) {
                        if (!keyEvent.isShiftPressed()) {
                            long l = s93.l(keyEvent.getKeyCode());
                            if (w71.a(l, ji1.i)) {
                                return 1;
                            }
                            if (w71.a(l, ji1.j)) {
                                return 2;
                            }
                            if (w71.a(l, ji1.k)) {
                                return 11;
                            }
                            if (w71.a(l, ji1.l)) {
                                return 12;
                            }
                            if (w71.a(l, ji1.m)) {
                                return 13;
                            }
                            if (w71.a(l, ji1.n)) {
                                return 14;
                            }
                            if (w71.a(l, ji1.o)) {
                                return 7;
                            }
                            if (w71.a(l, ji1.p)) {
                                return 8;
                            }
                            if (w71.a(l, ji1.r)) {
                                return 44;
                            }
                            if (w71.a(l, ji1.s)) {
                                return 20;
                            }
                            if (w71.a(l, ji1.t)) {
                                return 21;
                            }
                            if (!w71.a(l, ji1.u)) {
                                if (!w71.a(l, ji1.v)) {
                                    if (!w71.a(l, ji1.w)) {
                                        if (w71.a(l, ji1.x)) {
                                            return 45;
                                        }
                                    }
                                    return 17;
                                }
                                return 19;
                            }
                            return 18;
                        }
                        long l2 = s93.l(keyEvent.getKeyCode());
                        if (!w71.a(l2, ji1.i)) {
                            if (!w71.a(l2, ji1.j)) {
                                if (!w71.a(l2, ji1.k)) {
                                    if (!w71.a(l2, ji1.l)) {
                                        if (!w71.a(l2, ji1.m)) {
                                            if (!w71.a(l2, ji1.n)) {
                                                if (!w71.a(l2, ji1.o)) {
                                                    if (!w71.a(l2, ji1.p)) {
                                                        break;
                                                    } else {
                                                        return 40;
                                                    }
                                                } else {
                                                    return 39;
                                                }
                                            } else {
                                                return 32;
                                            }
                                        } else {
                                            return 31;
                                        }
                                    } else {
                                        return 30;
                                    }
                                } else {
                                    return 29;
                                }
                            } else {
                                return 28;
                            }
                        } else {
                            return 27;
                        }
                    }
                    return 0;
                }
                break;
                break;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long l3 = s93.l(keyEvent.getKeyCode());
                    if (w71.a(l3, ji1.i)) {
                        i = 41;
                    } else if (w71.a(l3, ji1.j)) {
                        i = 42;
                    } else if (w71.a(l3, ji1.k)) {
                        i = 33;
                    } else {
                        if (w71.a(l3, ji1.l)) {
                            i = 34;
                        }
                        i = 0;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long l4 = s93.l(keyEvent.getKeyCode());
                        if (w71.a(l4, ji1.i)) {
                            i = 9;
                        } else if (w71.a(l4, ji1.j)) {
                            i = 10;
                        } else if (w71.a(l4, ji1.k)) {
                            i = 15;
                        } else if (w71.a(l4, ji1.l)) {
                            i = 16;
                        }
                    }
                    i = 0;
                }
                if (i != 0) {
                    return i;
                }
                at0 at0Var = e81.a;
                at0Var.getClass();
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long l5 = s93.l(keyEvent.getKeyCode());
                    if (w71.a(l5, ji1.i)) {
                        i2 = 35;
                    } else if (w71.a(l5, ji1.j)) {
                        i2 = 36;
                    } else if (w71.a(l5, ji1.k)) {
                        i2 = 38;
                    } else {
                        if (w71.a(l5, ji1.l)) {
                            i2 = 37;
                        }
                        i2 = 0;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long l6 = s93.l(keyEvent.getKeyCode());
                    if (w71.a(l6, ji1.i)) {
                        i2 = 4;
                    } else if (w71.a(l6, ji1.j)) {
                        i2 = 3;
                    } else if (w71.a(l6, ji1.k)) {
                        i2 = 6;
                    } else if (w71.a(l6, ji1.l)) {
                        i2 = 5;
                    } else if (!w71.a(l6, ji1.c)) {
                        if (w71.a(l6, ji1.t)) {
                            i2 = 23;
                        } else if (w71.a(l6, ji1.s)) {
                            i2 = 22;
                        } else {
                            if (w71.a(l6, ji1.h)) {
                                i2 = 43;
                            }
                            i2 = 0;
                        }
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long l7 = s93.l(keyEvent.getKeyCode());
                    if (w71.a(l7, ji1.o)) {
                        i2 = 41;
                    } else {
                        if (w71.a(l7, ji1.p)) {
                            i2 = 42;
                        }
                        i2 = 0;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long l8 = s93.l(keyEvent.getKeyCode());
                        if (w71.a(l8, ji1.s)) {
                            i2 = 24;
                        } else if (w71.a(l8, ji1.t)) {
                            i2 = 25;
                        }
                    }
                    i2 = 0;
                }
                return i2 == 0 ? ((u30) at0Var.m).p(keyEvent) : i2;
        }
    }

    @Override // defpackage.vr1
    public void shutdown() {
    }
}
