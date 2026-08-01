package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class ff implements bg {

    /* renamed from: d, reason: collision with root package name */
    public final ff f2295d;

    /* renamed from: e, reason: collision with root package name */
    public final UUID f2296e;

    /* renamed from: i, reason: collision with root package name */
    public final String f2297i;

    /* renamed from: r, reason: collision with root package name */
    public final String f2298r;

    /* renamed from: s, reason: collision with root package name */
    public Thread f2299s;

    public ff(String str, ff ffVar, ag agVar) {
        this.f2298r = str;
        this.f2295d = ffVar;
        this.f2296e = ffVar.f2296e;
        this.f2297i = ffVar.f2297i;
        this.f2299s = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ag c10 = mf.c();
        bg bgVar = c10.f2149b;
        String str = this.f2298r;
        if (bgVar == null) {
            throw new lf(v4.a.p(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == bgVar) {
            mf.b(c10, ((ff) bgVar).f2295d);
            this.f2299s = null;
            return;
        }
        String str2 = ((ff) bgVar).f2298r;
        StringBuilder sb2 = new StringBuilder(str.length() + 79 + str2.length() + 1);
        n0.l.l(sb2, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb2.append(".");
        throw new lf(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b3, code lost:
    
        r4 = r4.f3021d;
        r10 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
    
        if (r4.containsKey(r10) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bf, code lost:
    
        ((com.google.android.gms.internal.measurement.yf) r1.g).f3021d.put(r10, new com.google.android.gms.internal.measurement.yf(r8, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cd, code lost:
    
        if (r15 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cf, code lost:
    
        r15.f3020c = (com.google.android.gms.internal.measurement.yf) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e1, code lost:
    
        if (r15 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e3, code lost:
    
        r15.f3020c = (com.google.android.gms.internal.measurement.yf) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e9, code lost:
    
        r1.f1774b = r8;
        r1.f1775c++;
        r1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f1, code lost:
    
        if (r1.g(r13, r14, r15, (r15 + r14) - r13) != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i3;
        int i10;
        zf zfVar;
        Iterator it;
        xf xfVar;
        int i11;
        String str;
        AtomicReference atomicReference = mf.f2542a;
        ff ffVar = this;
        int i12 = 0;
        int i13 = 0;
        while (ffVar != null) {
            i12++;
            i13 += ffVar.f2298r.length();
            ffVar = ffVar.f2295d;
            if (ffVar != null) {
                i13 += 4;
            }
        }
        if (i12 > 250) {
            String[] strArr = new String[i12];
            ff ffVar2 = this;
            for (int i14 = i12 - 1; i14 >= 0; i14--) {
                strArr[i14] = ffVar2.f2298r;
                ffVar2 = ffVar2.f2295d;
            }
            b1.c0 c0Var = new b1.c0(4);
            int i15 = 1;
            b8.b0 it2 = (i12 != 0 ? i12 != 1 ? b8.i.m(i12, (Object[]) strArr.clone()) : new b8.a0(strArr[0]) : b8.y.f1460x).iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                c0Var.g(it2.next(), Integer.valueOf(i16));
                i16++;
            }
            b8.x b10 = c0Var.b(true);
            int i17 = b10.f1458t;
            int i18 = i12 >> 2;
            if (i17 <= i18) {
                int i19 = i12 + 1;
                int[] iArr = new int[i19];
                for (int i20 = 0; i20 < i12; i20++) {
                    iArr[i20] = ((Integer) b10.get(strArr[i20])).intValue();
                }
                iArr[i12] = i17;
                c4.r rVar = new c4.r(iArr);
                int i21 = 0;
                while (true) {
                    int i22 = -1;
                    if (i21 >= i19) {
                        break;
                    }
                    rVar.f1776d += i15;
                    int i23 = iArr[i21];
                    while (true) {
                        yf yfVar = null;
                        while (true) {
                            if (rVar.f1776d <= 0) {
                                i11 = i15;
                                break;
                            }
                            int i24 = rVar.f1775c;
                            yf yfVar2 = (yf) rVar.g;
                            i11 = i15;
                            if (i24 == 0) {
                                break;
                            }
                            int i25 = ((yf) yfVar2.f3021d.get(Integer.valueOf(iArr[rVar.f1774b]))).f3018a;
                            int i26 = rVar.f1775c;
                            if (iArr[i25 + i26] == i23) {
                                if (yfVar != null) {
                                    yfVar.f3020c = (yf) rVar.g;
                                }
                                rVar.f1775c = i26 + 1;
                                rVar.c();
                            } else {
                                yf yfVar3 = (yf) ((yf) rVar.g).f3021d.get(Integer.valueOf(iArr[rVar.f1774b]));
                                int i27 = i22;
                                yf yfVar4 = new yf(yfVar3.f3018a, (rVar.f1775c + r0) - 1);
                                ((yf) rVar.g).f3021d.put(Integer.valueOf(iArr[rVar.f1774b]), yfVar4);
                                int i28 = yfVar4.f3019b + 1;
                                Integer valueOf = Integer.valueOf(iArr[i28]);
                                HashMap hashMap = yfVar4.f3021d;
                                hashMap.put(valueOf, yfVar3);
                                yfVar3.f3018a = i28;
                                if (yfVar != null) {
                                    yfVar.f3020c = yfVar4;
                                }
                                hashMap.put(Integer.valueOf(i23), new yf(i21, 1073741824));
                                rVar.f1776d--;
                                rVar.d();
                                yfVar = yfVar4;
                                i15 = i11;
                                i22 = i27;
                            }
                        }
                        rVar.f1776d += i22;
                        rVar.d();
                        i15 = i11;
                    }
                    i21++;
                    i15 = i11;
                }
                int i29 = i15;
                ArrayDeque arrayDeque = new ArrayDeque();
                yf yfVar5 = (yf) rVar.f1778f;
                xf xfVar2 = new xf(yfVar5, 0, -1, -1);
                arrayDeque.push(xfVar2);
                while (!arrayDeque.isEmpty()) {
                    xf xfVar3 = (xf) arrayDeque.pop();
                    Iterator it3 = xfVar3.f2993d.f3021d.values().iterator();
                    while (it3.hasNext()) {
                        yf yfVar6 = (yf) it3.next();
                        int i30 = xfVar3.f2991b;
                        int i31 = xfVar3.f2992c;
                        int i32 = yfVar6.f3018a;
                        yf yfVar7 = yfVar5;
                        int i33 = yfVar6.f3019b;
                        if (rVar.g(i30, i31, i32, i33)) {
                            it = it3;
                        } else {
                            if (yfVar6.f3021d.isEmpty()) {
                                int i34 = yfVar6.f3018a;
                                it = it3;
                            } else {
                                it = it3;
                            }
                            xfVar = new xf(yfVar6, i29, yfVar6.f3018a, i33);
                            if (xfVar2.f2990a >= xfVar.f2990a) {
                                xfVar2 = xfVar;
                            }
                            arrayDeque.push(xfVar);
                            yfVar5 = yfVar7;
                            it3 = it;
                            i29 = 1;
                        }
                        xfVar = new xf(yfVar6, xfVar3.f2990a + i29, i30, i31);
                        if (xfVar2.f2990a >= xfVar.f2990a) {
                        }
                        arrayDeque.push(xfVar);
                        yfVar5 = yfVar7;
                        it3 = it;
                        i29 = 1;
                    }
                    i29 = 1;
                }
                int min = Math.min(iArr.length, xfVar2.f2992c + 1);
                int i35 = 0;
                loop9: while (true) {
                    i3 = xfVar2.f2991b;
                    i10 = min - i3;
                    yfVar5 = (yf) yfVar5.f3021d.get(Integer.valueOf(iArr[(i35 % i10) + i3]));
                    if (yfVar5 == null) {
                        break;
                    }
                    for (int i36 = yfVar5.f3018a; i36 < yfVar5.f3019b + 1 && i36 < iArr.length; i36++) {
                        if (iArr[(i35 % i10) + i3] != iArr[i36]) {
                            break loop9;
                        }
                        i35++;
                    }
                }
                int i37 = i35 / i10;
                zf zfVar2 = new zf();
                zfVar2.f3051a = i3;
                zfVar2.f3052b = min;
                zfVar2.f3053c = i37;
                if (i10 * i37 >= i18) {
                    zfVar = zfVar2;
                    str = "";
                    if (zfVar != null) {
                        int i38 = zfVar.f3051a;
                        String concat = i38 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i38))).concat(" -> ") : "";
                        int i39 = zfVar.f3052b;
                        int i40 = zfVar.f3053c;
                        int i41 = ((i39 - i38) * i40) + i38;
                        str = i41 < i12 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i41, i12)))) : "";
                        String join = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i38, i39));
                        Locale locale = Locale.US;
                        str = concat + "{" + join + "}x" + i40 + str;
                    }
                    if (!str.isEmpty()) {
                        return str;
                    }
                }
            }
            zfVar = null;
            str = "";
            if (zfVar != null) {
            }
            if (!str.isEmpty()) {
            }
        }
        char[] cArr = new char[i13];
        ff ffVar3 = this;
        while (ffVar3 != null) {
            String str2 = ffVar3.f2298r;
            i13 -= str2.length();
            str2.getChars(0, str2.length(), cArr, i13);
            ffVar3 = ffVar3.f2295d;
            if (ffVar3 != null) {
                i13 -= 4;
                " -> ".getChars(0, 4, cArr, i13);
            }
        }
        return new String(cArr);
    }

    public ff(String str, UUID uuid, String str2, ag agVar) {
        this.f2298r = str;
        this.f2295d = null;
        this.f2296e = uuid;
        this.f2297i = str2;
        agVar.getClass();
        this.f2299s = Thread.currentThread();
    }
}
