package io.flutter.view;

import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements l0.k, l0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2510a;

    public /* synthetic */ c(Object obj) {
        this.f2510a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i2;
        h hVar;
        int i3;
        int i4;
        h hVar2;
        String str;
        float f2;
        float f3;
        Integer num;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        i iVar = (i) this.f2510a;
        HashMap hashMap = iVar.f2602g;
        io.flutter.plugin.platform.h hVar3 = iVar.f2600e;
        ArrayList arrayList = iVar.f2611p;
        ArrayList arrayList2 = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            h b2 = iVar.b(byteBuffer.getInt());
            ArrayList arrayList3 = b2.f2563U;
            i iVar2 = b2.f2568a;
            b2.f2548E = true;
            b2.f2553K = b2.f2587r;
            b2.f2554L = b2.f2585p;
            b2.f2549F = b2.f2571c;
            b2.G = b2.f2573d;
            b2.f2550H = b2.f2576g;
            b2.f2551I = b2.f2577h;
            b2.f2552J = b2.f2581l;
            b2.f2571c = byteBuffer.getLong();
            b2.f2573d = byteBuffer.getInt();
            b2.f2574e = byteBuffer.getInt();
            b2.f2575f = byteBuffer.getInt();
            b2.f2576g = byteBuffer.getInt();
            b2.f2577h = byteBuffer.getInt();
            b2.f2578i = byteBuffer.getInt();
            b2.f2579j = byteBuffer.getInt();
            b2.f2580k = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f2581l = byteBuffer.getFloat();
            b2.f2582m = byteBuffer.getFloat();
            b2.f2583n = byteBuffer.getFloat();
            b2.f2584o = i.c(byteBuffer, strArr);
            b2.f2585p = i.c(byteBuffer, strArr);
            b2.f2586q = h.f(byteBuffer, byteBufferArr);
            b2.f2587r = i.c(byteBuffer, strArr);
            b2.f2588s = h.f(byteBuffer, byteBufferArr);
            b2.t = i.c(byteBuffer, strArr);
            b2.f2589u = h.f(byteBuffer, byteBufferArr);
            b2.f2590v = i.c(byteBuffer, strArr);
            b2.f2591w = h.f(byteBuffer, byteBufferArr);
            b2.f2592x = i.c(byteBuffer, strArr);
            b2.f2593y = h.f(byteBuffer, byteBufferArr);
            b2.f2594z = i.c(byteBuffer, strArr);
            b2.f2544A = i.c(byteBuffer, strArr);
            b2.f2545B = i.c(byteBuffer, strArr);
            b2.f2546C = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f2555M = byteBuffer.getFloat();
            b2.f2556N = byteBuffer.getFloat();
            b2.f2557O = byteBuffer.getFloat();
            b2.f2558P = byteBuffer.getFloat();
            float[] fArr = b2.f2559Q;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i5 = 0; i5 < 16; i5++) {
                fArr[i5] = byteBuffer.getFloat();
            }
            b2.f2559Q = fArr;
            float[] fArr2 = b2.f2560R;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i6 = 0; i6 < 16; i6++) {
                fArr2[i6] = byteBuffer.getFloat();
            }
            b2.f2560R = fArr2;
            b2.f2566Y = true;
            b2.f2569a0 = true;
            int i7 = byteBuffer.getInt();
            ArrayList arrayList4 = b2.f2562T;
            arrayList4.clear();
            for (int i8 = 0; i8 < i7; i8++) {
                h b3 = iVar2.b(byteBuffer.getInt());
                b3.f2561S = b2;
                arrayList4.add(b3);
            }
            int i9 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i10 = 0; i10 < i9; i10++) {
                h b4 = iVar2.b(byteBuffer.getInt());
                b4.f2561S = b2;
                arrayList3.add(b4);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                b2.V = null;
            } else {
                ArrayList arrayList5 = b2.V;
                if (arrayList5 == null) {
                    b2.V = new ArrayList(i11);
                } else {
                    arrayList5.clear();
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    g a2 = iVar2.a(byteBuffer.getInt());
                    int i13 = a2.f2541c;
                    if (i13 == 1) {
                        b2.f2564W = a2;
                    } else if (i13 == 2) {
                        b2.f2565X = a2;
                    } else {
                        b2.V.add(a2);
                    }
                    b2.V.add(a2);
                }
            }
            if (!b2.g(14)) {
                if (b2.g(6)) {
                    iVar.f2608m = b2;
                }
                if (b2.f2548E) {
                    arrayList2.add(b2);
                }
                int i14 = b2.f2578i;
                if (i14 != -1 && !hVar3.e(i14)) {
                    hVar3.f(b2.f2578i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        h hVar4 = (h) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (hVar4 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            hVar4.k(fArr3, hashSet, false);
            hVar4.c(arrayList6);
        }
        int size = arrayList6.size();
        h hVar5 = null;
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList6.get(i15);
            i15++;
            h hVar6 = (h) obj;
            if (!arrayList.contains(Integer.valueOf(hVar6.f2570b))) {
                hVar5 = hVar6;
            }
        }
        if (hVar5 == null && !arrayList6.isEmpty()) {
            hVar5 = (h) arrayList6.get(arrayList6.size() - 1);
        }
        if (hVar5 != null && (hVar5.f2570b != iVar.f2612q || arrayList6.size() != arrayList.size())) {
            iVar.f2612q = hVar5.f2570b;
            String e2 = hVar5.e();
            if (e2 == null) {
                e2 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                iVar.f2596a.setAccessibilityPaneTitle(e2);
            } else {
                AccessibilityEvent d2 = iVar.d(hVar5.f2570b, 32);
                d2.getText().add(e2);
                iVar.h(d2);
            }
        }
        arrayList.clear();
        int size2 = arrayList6.size();
        int i16 = 0;
        while (i16 < size2) {
            Object obj2 = arrayList6.get(i16);
            i16++;
            arrayList.add(Integer.valueOf(((h) obj2).f2570b));
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            h hVar7 = (h) ((Map.Entry) it.next()).getValue();
            if (!hashSet.contains(hVar7)) {
                hVar7.f2561S = null;
                if (hVar7.f2578i != -1 && (num = iVar.f2605j) != null) {
                    View platformViewOfNode = iVar.f2599d.platformViewOfNode(num.intValue());
                    hVar3.f(hVar7.f2578i);
                    if (platformViewOfNode == null) {
                        iVar.g(iVar.f2605j.intValue(), 65536);
                        iVar.f2605j = null;
                    }
                }
                int i17 = hVar7.f2578i;
                if (i17 != -1) {
                    hVar3.f(i17);
                }
                h hVar8 = iVar.f2604i;
                if (hVar8 == hVar7) {
                    iVar.g(hVar8.f2570b, 65536);
                    iVar.f2604i = null;
                }
                if (iVar.f2608m == hVar7) {
                    iVar.f2608m = null;
                }
                if (iVar.f2610o == hVar7) {
                    iVar.f2610o = null;
                }
                it.remove();
            }
        }
        int i18 = 2048;
        int i19 = 0;
        AccessibilityEvent d3 = iVar.d(0, 2048);
        d3.setContentChangeTypes(1);
        iVar.h(d3);
        int size3 = arrayList2.size();
        int i20 = 0;
        while (i20 < size3) {
            Object obj3 = arrayList2.get(i20);
            i20++;
            h hVar9 = (h) obj3;
            if (!Float.isNaN(hVar9.f2581l) && !Float.isNaN(hVar9.f2552J) && hVar9.f2552J != hVar9.f2581l) {
                AccessibilityEvent d4 = iVar.d(hVar9.f2570b, 4096);
                float f4 = hVar9.f2581l;
                float f5 = hVar9.f2582m;
                if (Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(hVar9.f2583n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = hVar9.f2583n;
                    f2 = f5 - f6;
                    f3 = f4 - f6;
                }
                int i21 = hVar9.G;
                if ((i21 & 16) != 0 || (i21 & 32) != 0) {
                    d4.setScrollY((int) f3);
                    d4.setMaxScrollY((int) f2);
                } else if ((i21 & 4) != 0 || (i21 & 8) != 0) {
                    d4.setScrollX((int) f3);
                    d4.setMaxScrollX((int) f2);
                }
                int i22 = hVar9.f2579j;
                if (i22 > 0) {
                    d4.setItemCount(i22);
                    d4.setFromIndex(hVar9.f2580k);
                    ArrayList arrayList7 = hVar9.f2563U;
                    int size4 = arrayList7.size();
                    int i23 = i19;
                    int i24 = i23;
                    while (i24 < size4) {
                        Object obj4 = arrayList7.get(i24);
                        i24++;
                        if (!((h) obj4).g(14)) {
                            i23++;
                        }
                    }
                    d4.setToIndex((hVar9.f2580k + i23) - 1);
                }
                iVar.h(d4);
            }
            if (hVar9.g(16) && (((str = hVar9.f2585p) != null || hVar9.f2554L != null) && (str == null || !str.equals(hVar9.f2554L)))) {
                AccessibilityEvent d5 = iVar.d(hVar9.f2570b, i18);
                d5.setContentChangeTypes(1);
                iVar.h(d5);
            }
            h hVar10 = iVar.f2604i;
            if (hVar10 == null || hVar10.f2570b != hVar9.f2570b) {
                i2 = size3;
            } else {
                i2 = size3;
                if ((L.d.d(3) & hVar9.f2549F) == 0 && hVar9.g(3)) {
                    AccessibilityEvent d6 = iVar.d(hVar9.f2570b, 4);
                    d6.getText().add(hVar9.f2585p);
                    iVar.h(d6);
                }
            }
            h hVar11 = iVar.f2608m;
            if (hVar11 != null && (i3 = hVar11.f2570b) == (i4 = hVar9.f2570b) && ((hVar2 = iVar.f2609n) == null || hVar2.f2570b != i3)) {
                iVar.f2609n = hVar11;
                iVar.h(iVar.d(i4, 8));
            } else if (hVar11 == null) {
                iVar.f2609n = null;
            }
            h hVar12 = iVar.f2608m;
            if (hVar12 != null && hVar12.f2570b == hVar9.f2570b && (hVar9.f2549F & L.d.d(5)) != 0 && hVar9.g(5) && ((hVar = iVar.f2604i) == null || hVar.f2570b == iVar.f2608m.f2570b)) {
                String str2 = hVar9.f2553K;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = hVar9.f2587r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent d7 = iVar.d(hVar9.f2570b, 16);
                d7.setBeforeText(str2);
                d7.getText().add(str4);
                int i25 = 0;
                while (i25 < str2.length() && i25 < str4.length() && str2.charAt(i25) == str4.charAt(i25)) {
                    i25++;
                }
                if (i25 < str2.length() || i25 < str4.length()) {
                    d7.setFromIndex(i25);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i25 && length2 >= i25 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d7.setRemovedCount((length - i25) + 1);
                    d7.setAddedCount((length2 - i25) + 1);
                } else {
                    d7 = null;
                }
                if (d7 != null) {
                    iVar.h(d7);
                }
                if (hVar9.f2550H != hVar9.f2576g || hVar9.f2551I != hVar9.f2577h) {
                    AccessibilityEvent d8 = iVar.d(hVar9.f2570b, 8192);
                    d8.getText().add(str4);
                    d8.setFromIndex(hVar9.f2576g);
                    d8.setToIndex(hVar9.f2577h);
                    d8.setItemCount(str4.length());
                    iVar.h(d8);
                }
            }
            size3 = i2;
            i18 = 2048;
            i19 = 0;
        }
    }
}
