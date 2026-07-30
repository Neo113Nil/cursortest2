package defpackage;

import android.content.SharedPreferences;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mc implements tw, yj {
    public final Object d;
    public Object e;
    public final Object g;
    public Object h;
    public Object i;

    public mc(mj mjVar, yj yjVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<qr> set = mjVar.c;
        Set set2 = mjVar.g;
        for (qr qrVar : set) {
            int i = qrVar.c;
            int i2 = qrVar.b;
            boolean z = i == 0;
            v01 v01Var = qrVar.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(v01Var);
                } else {
                    hashSet.add(v01Var);
                }
            } else if (i == 2) {
                hashSet3.add(v01Var);
            } else if (i2 == 2) {
                hashSet5.add(v01Var);
            } else {
                hashSet2.add(v01Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(v01.a(s01.class));
        }
        this.d = Collections.unmodifiableSet(hashSet);
        this.e = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.g = Collections.unmodifiableSet(hashSet4);
        this.h = Collections.unmodifiableSet(hashSet5);
        this.i = yjVar;
    }

    public static mc h(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        mc mcVar = new mc(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) mcVar.h)) {
            try {
                ((ArrayDeque) mcVar.h).clear();
                String string = ((SharedPreferences) mcVar.d).getString((String) mcVar.e, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) mcVar.g)) {
                    String[] split = string.split((String) mcVar.g, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) mcVar.h).add(str);
                        }
                    }
                    return mcVar;
                }
                return mcVar;
            } finally {
            }
        }
    }

    @Override // defpackage.yj
    public Object a(Class cls) {
        if (!((Set) this.d).contains(v01.a(cls))) {
            dd0.h("Attempting to request an undeclared dependency ", cls, ".");
            return null;
        }
        Object a = ((yj) this.i).a(cls);
        if (!cls.equals(s01.class)) {
            return a;
        }
        return new f31();
    }

    @Override // defpackage.yj
    public p01 b(v01 v01Var) {
        if (((Set) this.h).contains(v01Var)) {
            return ((yj) this.i).b(v01Var);
        }
        dd0.h("Attempting to request an undeclared dependency Provider<Set<", v01Var, ">>.");
        return null;
    }

    @Override // defpackage.yj
    public Set c(v01 v01Var) {
        if (((Set) this.g).contains(v01Var)) {
            return ((yj) this.i).c(v01Var);
        }
        dd0.h("Attempting to request an undeclared dependency Set<", v01Var, ">.");
        return null;
    }

    @Override // defpackage.yj
    public p01 d(Class cls) {
        return e(v01.a(cls));
    }

    @Override // defpackage.yj
    public p01 e(v01 v01Var) {
        if (((Set) this.e).contains(v01Var)) {
            return ((yj) this.i).e(v01Var);
        }
        dd0.h("Attempting to request an undeclared dependency Provider<", v01Var, ">.");
        return null;
    }

    @Override // defpackage.yj
    public Object f(v01 v01Var) {
        if (((Set) this.d).contains(v01Var)) {
            return ((yj) this.i).f(v01Var);
        }
        dd0.h("Attempting to request an undeclared dependency ", v01Var, ".");
        return null;
    }

    public uf g(lc lcVar, Function0 function0) {
        int i;
        int i2;
        int i3;
        x11 x11Var = new x11();
        x11Var.d = -1;
        synchronized (this.d) {
            Throwable th = (Throwable) this.e;
            if (th != null) {
                lcVar.b(th);
                return a60.e;
            }
            ha haVar = (ha) this.g;
            do {
                i = haVar.get();
                i2 = i + 1;
            } while (!haVar.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            x11Var.d = (i2 >>> 27) & 15;
            ((mn0) this.h).a(lcVar);
            if (z && function0 != null) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    synchronized (this.d) {
                        try {
                            if (((Throwable) this.e) == null) {
                                this.e = th2;
                                mn0 mn0Var = (mn0) this.h;
                                Object[] objArr = mn0Var.a;
                                int i5 = mn0Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((lc) objArr[i6]).b(th2);
                                }
                                ((mn0) this.h).d();
                                ha haVar2 = (ha) this.g;
                                do {
                                    i3 = haVar2.get();
                                } while (!haVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new yw(new kc(lcVar, this, x11Var, i4));
        }
    }

    @Override // defpackage.o01
    public Object get() {
        return new oq((Executor) ((o01) this.d).get(), (ql0) ((o01) this.e).get(), (i8) ((i8) this.g).get(), (b51) ((o01) this.h).get(), (b51) ((o01) this.i).get());
    }

    public void i(Function1 function1) {
        int i;
        synchronized (this.d) {
            try {
                mn0 mn0Var = (mn0) this.h;
                this.h = (mn0) this.i;
                this.i = mn0Var;
                ha haVar = (ha) this.g;
                do {
                    i = haVar.get();
                } while (!haVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = mn0Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    function1.invoke(mn0Var.f(i3));
                }
                mn0Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float j(int i, boolean z) {
        Layout layout = (Layout) this.d;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float k(int i, boolean z, boolean z2) {
        int lineForOffset;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        Bidi bidi;
        boolean z4;
        ArrayList arrayList = (ArrayList) this.e;
        Layout layout = (Layout) this.d;
        if (!z2) {
            return j(i, z);
        }
        if (i <= 0) {
            lineForOffset = 0;
        } else if (i >= layout.getText().length()) {
            lineForOffset = layout.getLineCount() - 1;
        } else {
            lineForOffset = layout.getLineForOffset(i);
            int lineStart = layout.getLineStart(lineForOffset);
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (lineStart == i || lineEnd == i) {
                if (lineStart == i) {
                    if (z2) {
                        lineForOffset--;
                    }
                } else if (!z2) {
                    lineForOffset++;
                }
            }
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (i != lineStart2 && i != lineEnd2) {
            return j(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return j(i, z);
        }
        Integer valueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i6 = size - 1;
        int i7 = 0;
        while (true) {
            if (i7 > i6) {
                i2 = -(i7 + 1);
                break;
            }
            i2 = (i7 + i6) >>> 1;
            int a = dj.a((Comparable) arrayList.get(i2), valueOf);
            if (a >= 0) {
                if (a <= 0) {
                    break;
                }
                i6 = i2 - 1;
            } else {
                i7 = i2 + 1;
            }
        }
        int i8 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z2 && i8 > 0) {
            int i9 = i8 - 1;
            if (i == ((Number) arrayList.get(i9)).intValue()) {
                i8 = i9;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i8 == 0 ? 0 : ((Number) arrayList.get(i8 + (-1))).intValue())) == -1;
        int l = l(lineEnd2, lineStart2);
        int intValue = i8 == 0 ? 0 : ((Number) arrayList.get(i8 - 1)).intValue();
        int i10 = lineStart2 - intValue;
        int i11 = l - intValue;
        ArrayList arrayList2 = (ArrayList) this.g;
        boolean[] zArr = (boolean[]) this.h;
        if (zArr[i8]) {
            bidi = (Bidi) arrayList2.get(i8);
            i4 = lineForOffset;
            i3 = l;
            i5 = -1;
        } else {
            int intValue2 = i8 == 0 ? 0 : ((Number) arrayList.get(i8 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i8)).intValue();
            int i12 = intValue3 - intValue2;
            char[] cArr = (char[]) this.i;
            i3 = l;
            if (cArr == null || cArr.length < i12) {
                cArr = new char[i12];
            }
            i4 = lineForOffset;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i12)) {
                i5 = -1;
                Bidi bidi2 = new Bidi(cArr, 0, null, 0, i12, layout.getParagraphDirection(layout.getLineForOffset(i8 == 0 ? 0 : ((Number) arrayList.get(i8 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                    arrayList2.set(i8, bidi);
                    zArr[i8] = z3;
                    if (bidi != null) {
                        char[] cArr2 = (char[]) this.i;
                        cArr = cArr == cArr2 ? null : cArr2;
                    }
                    this.i = cArr;
                }
            } else {
                z3 = true;
                i5 = -1;
            }
            bidi = null;
            arrayList2.set(i8, bidi);
            zArr[i8] = z3;
            if (bidi != null) {
            }
            this.i = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i10, i11) : null;
        if (createLineBidi == null) {
            z4 = true;
        } else {
            if (createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                xc0[] xc0VarArr = new xc0[runCount];
                for (int i13 = 0; i13 < runCount; i13++) {
                    xc0VarArr[i13] = new xc0(createLineBidi.getRunStart(i13) + lineStart2, createLineBidi.getRunLimit(i13) + lineStart2, createLineBidi.getRunLevel(i13) % 2 == 1);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i14 = 0; i14 < runCount2; i14++) {
                    bArr[i14] = (byte) createLineBidi.getRunLevel(i14);
                }
                Bidi.reorderVisually(bArr, 0, xc0VarArr, 0, runCount);
                if (i != lineStart2) {
                    int i15 = i4;
                    int l2 = i > i3 ? l(i, lineStart2) : i;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= runCount) {
                            i16 = i5;
                            break;
                        }
                        if (xc0VarArr[i16].b == l2) {
                            break;
                        }
                        i16++;
                    }
                    xc0 xc0Var = xc0VarArr[i16];
                    if (!z && z5 != xc0Var.c) {
                        z5 = !z5;
                    }
                    return (i16 == 0 && z5) ? layout.getLineLeft(i15) : (i16 != runCount + (-1) || z5) ? z5 ? layout.getPrimaryHorizontal(xc0VarArr[i16 - 1].b) : layout.getPrimaryHorizontal(xc0VarArr[i16 + 1].b) : layout.getLineRight(i15);
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= runCount) {
                        i17 = i5;
                        break;
                    }
                    if (xc0VarArr[i17].a == i) {
                        break;
                    }
                    i17++;
                }
                xc0 xc0Var2 = xc0VarArr[i17];
                if (z || z5 == xc0Var2.c) {
                    z5 = !z5;
                }
                if (i17 == 0 && z5) {
                    return layout.getLineLeft(i4);
                }
                return (i17 != runCount + (-1) || z5) ? z5 ? layout.getPrimaryHorizontal(xc0VarArr[i17 - 1].a) : layout.getPrimaryHorizontal(xc0VarArr[i17 + 1].a) : layout.getLineRight(i4);
            }
            z4 = true;
        }
        int i18 = i4;
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart2);
        if (z || z5 == isRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return i == lineStart2 ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i18) : layout.getLineRight(i18);
    }

    public int l(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.d).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.b(charAt, 8192) < 0 || Intrinsics.b(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void m(Object obj, String str) {
        fv fvVar = op.l;
        str.getClass();
        ((LinkedHashMap) this.d).put(str, obj);
        be1 be1Var = (be1) ((LinkedHashMap) this.g).get(str);
        if (be1Var != null) {
            be1Var.j(null, obj == null ? fvVar : obj);
        }
        be1 be1Var2 = (be1) ((LinkedHashMap) this.h).get(str);
        if (be1Var2 != null) {
            if (obj == null) {
                obj = fvVar;
            }
            be1Var2.j(null, obj);
        }
    }

    public mc(o01 o01Var, o01 o01Var2, i8 i8Var, o01 o01Var3, o01 o01Var4) {
        this.d = o01Var;
        this.e = o01Var2;
        this.g = i8Var;
        this.h = o01Var3;
        this.i = o01Var4;
    }

    public mc() {
        this.d = new Object();
        this.g = new ha(0);
        this.h = new mn0();
        this.i = new mn0();
    }

    public mc(Layout layout) {
        this.d = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int m = StringsKt.m(((Layout) this.d).getText(), '\n', i, 4);
            i = m < 0 ? ((Layout) this.d).getText().length() : m + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.d).getText().length());
        this.e = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.g = arrayList2;
        this.h = new boolean[((ArrayList) this.e).size()];
        ((ArrayList) this.e).size();
    }

    public mc(Map map) {
        map.getClass();
        this.d = new LinkedHashMap(map);
        this.e = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new oj(2, this);
    }

    public mc(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.h = new ArrayDeque();
        this.d = sharedPreferences;
        this.e = "topic_operation_queue";
        this.g = ",";
        this.i = scheduledThreadPoolExecutor;
    }
}
