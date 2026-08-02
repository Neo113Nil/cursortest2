package io.flutter.view;

import a.AbstractC0132a;
import android.app.Activity;
import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements n0.l, n0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2703a;

    public /* synthetic */ b(Object obj) {
        this.f2703a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x022b, code lost:
    
        r6 = r6.getWindow().getAttributes().layoutInDisplayCutoutMode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x023e, code lost:
    
        r6 = r14.getRootWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        io.flutter.plugin.platform.o oVar;
        ArrayList arrayList;
        int i2;
        h hVar;
        int i3;
        int i4;
        h hVar2;
        String str;
        String str2;
        float f2;
        float f3;
        View g2;
        Integer num;
        boolean z2;
        WindowInsets rootWindowInsets;
        Activity r2;
        int i5;
        k kVar;
        View g3;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        k kVar2 = (k) this.f2703a;
        kVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            oVar = kVar2.f2793e;
            if (!hasRemaining) {
                break;
            }
            h c2 = kVar2.c(byteBuffer.getInt());
            c2.f2737B = true;
            c2.f2743H = c2.f2777r;
            c2.f2744I = c2.f2775p;
            c2.f2738C = c2.f2762c;
            c2.f2739D = c2.f2763d;
            c2.f2740E = c2.f2766g;
            c2.f2741F = c2.f2767h;
            c2.f2742G = c2.f2771l;
            c2.f2762c = byteBuffer.getInt();
            c2.f2763d = byteBuffer.getInt();
            c2.f2764e = byteBuffer.getInt();
            c2.f2765f = byteBuffer.getInt();
            c2.f2766g = byteBuffer.getInt();
            c2.f2767h = byteBuffer.getInt();
            c2.f2768i = byteBuffer.getInt();
            c2.f2769j = byteBuffer.getInt();
            c2.f2770k = byteBuffer.getInt();
            c2.f2771l = byteBuffer.getFloat();
            c2.f2772m = byteBuffer.getFloat();
            c2.f2773n = byteBuffer.getFloat();
            int i6 = byteBuffer.getInt();
            c2.f2774o = i6 == -1 ? null : strArr[i6];
            int i7 = byteBuffer.getInt();
            c2.f2775p = i7 == -1 ? null : strArr[i7];
            c2.f2776q = h.g(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            c2.f2777r = i8 == -1 ? null : strArr[i8];
            c2.f2778s = h.g(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            c2.f2779t = i9 == -1 ? null : strArr[i9];
            c2.f2780u = h.g(byteBuffer, byteBufferArr);
            int i10 = byteBuffer.getInt();
            c2.v = i10 == -1 ? null : strArr[i10];
            c2.f2781w = h.g(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            c2.f2782x = i11 == -1 ? null : strArr[i11];
            c2.f2783y = h.g(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            c2.f2784z = i12 == -1 ? null : strArr[i12];
            byteBuffer.getInt();
            c2.J = byteBuffer.getFloat();
            c2.f2745K = byteBuffer.getFloat();
            c2.f2746L = byteBuffer.getFloat();
            c2.f2747M = byteBuffer.getFloat();
            if (c2.f2748N == null) {
                c2.f2748N = new float[16];
            }
            for (int i13 = 0; i13 < 16; i13++) {
                c2.f2748N[i13] = byteBuffer.getFloat();
            }
            c2.f2755U = true;
            c2.f2757W = true;
            int i14 = byteBuffer.getInt();
            ArrayList arrayList3 = c2.f2750P;
            arrayList3.clear();
            ArrayList arrayList4 = c2.f2751Q;
            arrayList4.clear();
            int i15 = 0;
            while (true) {
                kVar = c2.f2760a;
                if (i15 >= i14) {
                    break;
                }
                h c3 = kVar.c(byteBuffer.getInt());
                c3.f2749O = c2;
                arrayList3.add(c3);
                i15++;
            }
            for (int i16 = 0; i16 < i14; i16++) {
                h c4 = kVar.c(byteBuffer.getInt());
                c4.f2749O = c2;
                arrayList4.add(c4);
            }
            int i17 = byteBuffer.getInt();
            if (i17 == 0) {
                c2.f2752R = null;
            } else {
                ArrayList arrayList5 = c2.f2752R;
                if (arrayList5 == null) {
                    c2.f2752R = new ArrayList(i17);
                } else {
                    arrayList5.clear();
                }
                for (int i18 = 0; i18 < i17; i18++) {
                    f b2 = kVar.b(byteBuffer.getInt());
                    int i19 = b2.f2732c;
                    if (i19 == 1) {
                        c2.f2753S = b2;
                    } else if (i19 == 2) {
                        c2.f2754T = b2;
                    } else {
                        c2.f2752R.add(b2);
                    }
                    c2.f2752R.add(b2);
                }
            }
            if (!c2.h(14)) {
                if (c2.h(6)) {
                    kVar2.f2801m = c2;
                }
                if (c2.f2737B) {
                    arrayList2.add(c2);
                }
                int i20 = c2.f2768i;
                if (i20 != -1 && !oVar.m(i20) && (g3 = oVar.g(c2.f2768i)) != null) {
                    g3.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = kVar2.f2795g;
        h hVar3 = (h) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        View view = kVar2.f2789a;
        if (hVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int i21 = Build.VERSION.SDK_INT;
            if (i21 < 23 || ((i21 >= 28 && ((r2 = AbstractC0132a.r(view.getContext())) == null || r2.getWindow() == null || !(i5 == 2 || i5 == 0))) || rootWindowInsets == null)) {
                z2 = false;
            } else {
                if (!kVar2.f2806r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    hVar3.f2757W = true;
                    hVar3.f2755U = true;
                }
                int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                kVar2.f2806r = Integer.valueOf(systemWindowInsetLeft);
                z2 = false;
                Matrix.translateM(fArr, 0, systemWindowInsetLeft, 0.0f, 0.0f);
            }
            hVar3.l(fArr, hashSet, z2);
            hVar3.d(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        h hVar4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = kVar2.f2804p;
            if (!hasNext) {
                break;
            }
            h hVar5 = (h) it.next();
            if (!arrayList.contains(Integer.valueOf(hVar5.f2761b))) {
                hVar4 = hVar5;
            }
        }
        if (hVar4 == null && arrayList6.size() > 0) {
            hVar4 = (h) arrayList6.get(arrayList6.size() - 1);
        }
        if (hVar4 != null && (hVar4.f2761b != kVar2.f2805q || arrayList6.size() != arrayList.size())) {
            kVar2.f2805q = hVar4.f2761b;
            String f4 = hVar4.f();
            if (f4 == null) {
                f4 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                view.setAccessibilityPaneTitle(f4);
            } else {
                AccessibilityEvent d2 = kVar2.d(hVar4.f2761b, 32);
                d2.getText().add(f4);
                kVar2.h(d2);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((h) it2.next()).f2761b));
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (true) {
            i2 = 4;
            if (!it3.hasNext()) {
                break;
            }
            h hVar6 = (h) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(hVar6)) {
                hVar6.f2749O = null;
                if (hVar6.f2768i != -1 && (num = kVar2.f2798j) != null && kVar2.f2792d.platformViewOfNode(num.intValue()) == oVar.g(hVar6.f2768i)) {
                    kVar2.g(kVar2.f2798j.intValue(), 65536);
                    kVar2.f2798j = null;
                }
                int i22 = hVar6.f2768i;
                if (i22 != -1 && (g2 = oVar.g(i22)) != null) {
                    g2.setImportantForAccessibility(4);
                }
                h hVar7 = kVar2.f2797i;
                if (hVar7 == hVar6) {
                    kVar2.g(hVar7.f2761b, 65536);
                    kVar2.f2797i = null;
                }
                if (kVar2.f2801m == hVar6) {
                    kVar2.f2801m = null;
                }
                if (kVar2.f2803o == hVar6) {
                    kVar2.f2803o = null;
                }
                it3.remove();
            }
        }
        int i23 = 2048;
        AccessibilityEvent d3 = kVar2.d(0, 2048);
        d3.setContentChangeTypes(1);
        kVar2.h(d3);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            h hVar8 = (h) it4.next();
            if (!Float.isNaN(hVar8.f2771l) && !Float.isNaN(hVar8.f2742G) && hVar8.f2742G != hVar8.f2771l) {
                AccessibilityEvent d4 = kVar2.d(hVar8.f2761b, 4096);
                float f5 = hVar8.f2771l;
                float f6 = hVar8.f2772m;
                if (Float.isInfinite(f6)) {
                    if (f5 > 70000.0f) {
                        f5 = 70000.0f;
                    }
                    f6 = 100000.0f;
                }
                if (Float.isInfinite(hVar8.f2773n)) {
                    f2 = f6 + 100000.0f;
                    if (f5 < -70000.0f) {
                        f5 = -70000.0f;
                    }
                    f3 = f5 + 100000.0f;
                } else {
                    float f7 = hVar8.f2773n;
                    f2 = f6 - f7;
                    f3 = f5 - f7;
                }
                if (h.c(hVar8, e.f2713j) || h.c(hVar8, e.f2714k)) {
                    d4.setScrollY((int) f3);
                    d4.setMaxScrollY((int) f2);
                } else if (h.c(hVar8, e.f2711h) || h.c(hVar8, e.f2712i)) {
                    d4.setScrollX((int) f3);
                    d4.setMaxScrollX((int) f2);
                }
                int i24 = hVar8.f2769j;
                if (i24 > 0) {
                    d4.setItemCount(i24);
                    d4.setFromIndex(hVar8.f2770k);
                    Iterator it5 = hVar8.f2751Q.iterator();
                    int i25 = 0;
                    while (it5.hasNext()) {
                        if (!((h) it5.next()).h(14)) {
                            i25++;
                        }
                    }
                    d4.setToIndex((hVar8.f2770k + i25) - 1);
                }
                kVar2.h(d4);
            }
            if (hVar8.h(16) && (((str = hVar8.f2775p) != null || hVar8.f2744I != null) && (str == null || (str2 = hVar8.f2744I) == null || !str.equals(str2)))) {
                AccessibilityEvent d5 = kVar2.d(hVar8.f2761b, i23);
                d5.setContentChangeTypes(1);
                kVar2.h(d5);
            }
            h hVar9 = kVar2.f2797i;
            if (hVar9 != null && hVar9.f2761b == hVar8.f2761b && (hVar8.f2738C & A0.b.d(3)) == 0 && hVar8.h(3)) {
                AccessibilityEvent d6 = kVar2.d(hVar8.f2761b, i2);
                d6.getText().add(hVar8.f2775p);
                kVar2.h(d6);
            }
            h hVar10 = kVar2.f2801m;
            if (hVar10 != null && (i3 = hVar10.f2761b) == (i4 = hVar8.f2761b) && ((hVar2 = kVar2.f2802n) == null || hVar2.f2761b != i3)) {
                kVar2.f2802n = hVar10;
                kVar2.h(kVar2.d(i4, 8));
            } else if (hVar10 == null) {
                kVar2.f2802n = null;
            }
            h hVar11 = kVar2.f2801m;
            if (hVar11 != null && hVar11.f2761b == hVar8.f2761b && (hVar8.f2738C & A0.b.d(5)) != 0 && hVar8.h(5) && ((hVar = kVar2.f2797i) == null || hVar.f2761b == kVar2.f2801m.f2761b)) {
                String str3 = hVar8.f2743H;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = hVar8.f2777r;
                String str5 = str4 != null ? str4 : "";
                AccessibilityEvent d7 = kVar2.d(hVar8.f2761b, 16);
                d7.setBeforeText(str3);
                d7.getText().add(str5);
                int i26 = 0;
                while (i26 < str3.length() && i26 < str5.length() && str3.charAt(i26) == str5.charAt(i26)) {
                    i26++;
                }
                if (i26 < str3.length() || i26 < str5.length()) {
                    d7.setFromIndex(i26);
                    int length = str3.length() - 1;
                    int length2 = str5.length() - 1;
                    while (length >= i26 && length2 >= i26 && str3.charAt(length) == str5.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d7.setRemovedCount((length - i26) + 1);
                    d7.setAddedCount((length2 - i26) + 1);
                } else {
                    d7 = null;
                }
                if (d7 != null) {
                    kVar2.h(d7);
                }
                if (hVar8.f2740E != hVar8.f2766g || hVar8.f2741F != hVar8.f2767h) {
                    AccessibilityEvent d8 = kVar2.d(hVar8.f2761b, 8192);
                    d8.getText().add(str5);
                    d8.setFromIndex(hVar8.f2766g);
                    d8.setToIndex(hVar8.f2767h);
                    d8.setItemCount(str5.length());
                    kVar2.h(d8);
                }
            }
            i23 = 2048;
            i2 = 4;
        }
    }
}
