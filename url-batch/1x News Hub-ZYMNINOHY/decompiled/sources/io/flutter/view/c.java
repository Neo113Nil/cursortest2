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
public final class c implements F1.k, F1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9337a;

    public /* synthetic */ c(Object obj) {
        this.f9337a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i3;
        io.flutter.plugin.platform.k kVar;
        ArrayList arrayList;
        int i4;
        h hVar;
        int i5;
        int i6;
        h hVar2;
        String str;
        float f;
        float f3;
        View j3;
        Integer num;
        i iVar;
        View j4;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        i iVar2 = (i) this.f9337a;
        iVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            i3 = 16;
            kVar = iVar2.f9426e;
            if (!hasRemaining) {
                break;
            }
            h c3 = iVar2.c(byteBuffer.getInt());
            c3.f9375H = true;
            c3.f9380N = c3.f9414r;
            c3.f9381O = c3.f9412p;
            c3.f9376I = c3.f9397c;
            c3.f9377J = c3.f9399d;
            c3.f9378K = c3.f9404g;
            c3.L = c3.f9405h;
            c3.f9379M = c3.f9409l;
            c3.f9397c = byteBuffer.getLong();
            c3.f9399d = byteBuffer.getInt();
            c3.f9401e = byteBuffer.getInt();
            c3.f = byteBuffer.getInt();
            c3.f9404g = byteBuffer.getInt();
            c3.f9405h = byteBuffer.getInt();
            c3.f9406i = byteBuffer.getInt();
            c3.f9407j = byteBuffer.getInt();
            c3.f9408k = byteBuffer.getInt();
            byteBuffer.getInt();
            c3.f9409l = byteBuffer.getFloat();
            c3.f9410m = byteBuffer.getFloat();
            c3.f9411n = byteBuffer.getFloat();
            c3.f9372E = byteBuffer.getInt();
            c3.o = i.d(byteBuffer, strArr);
            c3.f9412p = i.d(byteBuffer, strArr);
            c3.f9413q = h.f(byteBuffer, byteBufferArr);
            c3.f9414r = i.d(byteBuffer, strArr);
            c3.f9415s = h.f(byteBuffer, byteBufferArr);
            c3.f9416t = i.d(byteBuffer, strArr);
            c3.f9417u = h.f(byteBuffer, byteBufferArr);
            c3.v = i.d(byteBuffer, strArr);
            c3.f9418w = h.f(byteBuffer, byteBufferArr);
            c3.f9419x = i.d(byteBuffer, strArr);
            c3.f9420y = h.f(byteBuffer, byteBufferArr);
            c3.z = i.d(byteBuffer, strArr);
            c3.f9368A = i.d(byteBuffer, strArr);
            c3.f9369B = i.d(byteBuffer, strArr);
            c3.f9370C = i.d(byteBuffer, strArr);
            c3.f9371D = i.d(byteBuffer, strArr);
            c3.f9373F = byteBuffer.getInt();
            byteBuffer.getInt();
            c3.f9382P = byteBuffer.getFloat();
            c3.f9383Q = byteBuffer.getFloat();
            c3.f9384R = byteBuffer.getFloat();
            c3.f9385S = byteBuffer.getFloat();
            float[] fArr = c3.f9386T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                fArr[i7] = byteBuffer.getFloat();
            }
            c3.f9386T = fArr;
            float[] fArr2 = c3.f9387U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                fArr2[i8] = byteBuffer.getFloat();
            }
            c3.f9387U = fArr2;
            c3.f9396b0 = true;
            c3.f9400d0 = true;
            int i9 = byteBuffer.getInt();
            ArrayList arrayList3 = c3.f9389W;
            arrayList3.clear();
            int i10 = 0;
            while (true) {
                iVar = c3.f9393a;
                if (i10 >= i9) {
                    break;
                }
                h c4 = iVar.c(byteBuffer.getInt());
                c4.f9388V = c3;
                arrayList3.add(c4);
                i10++;
            }
            int i11 = byteBuffer.getInt();
            ArrayList arrayList4 = c3.f9390X;
            arrayList4.clear();
            for (int i12 = 0; i12 < i11; i12++) {
                h c5 = iVar.c(byteBuffer.getInt());
                c5.f9388V = c3;
                arrayList4.add(c5);
            }
            int i13 = byteBuffer.getInt();
            if (i13 == 0) {
                c3.f9391Y = null;
            } else {
                ArrayList arrayList5 = c3.f9391Y;
                if (arrayList5 == null) {
                    c3.f9391Y = new ArrayList(i13);
                } else {
                    arrayList5.clear();
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    g b3 = iVar.b(byteBuffer.getInt());
                    int i15 = b3.f9365c;
                    if (i15 == 1) {
                        c3.f9392Z = b3;
                    } else if (i15 == 2) {
                        c3.f9394a0 = b3;
                    } else {
                        c3.f9391Y.add(b3);
                    }
                    c3.f9391Y.add(b3);
                }
            }
            if (!c3.h(14)) {
                if (c3.h(6)) {
                    iVar2.f9434n = c3;
                }
                if (c3.f9375H) {
                    arrayList2.add(c3);
                }
                int i16 = c3.f9406i;
                if (i16 != -1 && !kVar.f(i16) && (j4 = kVar.j(c3.f9406i)) != null) {
                    j4.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = iVar2.f9427g;
        h hVar3 = (h) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (hVar3 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            hVar3.l(fArr3, hashSet, false);
            hVar3.c(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        h hVar4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = iVar2.f9436q;
            if (!hasNext) {
                break;
            }
            h hVar5 = (h) it.next();
            if (!arrayList.contains(Integer.valueOf(hVar5.f9395b))) {
                hVar4 = hVar5;
            }
        }
        if (hVar4 == null && !arrayList6.isEmpty()) {
            hVar4 = (h) arrayList6.get(arrayList6.size() - 1);
        }
        if (hVar4 != null && (hVar4.f9395b != iVar2.f9437r || arrayList6.size() != arrayList.size())) {
            iVar2.f9437r = hVar4.f9395b;
            String e3 = hVar4.e();
            if (e3 == null) {
                e3 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                iVar2.f9422a.setAccessibilityPaneTitle(e3);
            } else {
                AccessibilityEvent e4 = iVar2.e(hVar4.f9395b, 32);
                e4.getText().add(e3);
                iVar2.i(e4);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((h) it2.next()).f9395b));
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (true) {
            i4 = 4;
            if (!it3.hasNext()) {
                break;
            }
            h hVar6 = (h) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(hVar6)) {
                hVar6.f9388V = null;
                if (hVar6.f9406i != -1 && (num = iVar2.f9430j) != null && iVar2.f9425d.platformViewOfNode(num.intValue()) == kVar.j(hVar6.f9406i)) {
                    iVar2.h(iVar2.f9430j.intValue(), 65536);
                    iVar2.f9430j = null;
                }
                int i17 = hVar6.f9406i;
                if (i17 != -1 && (j3 = kVar.j(i17)) != null) {
                    j3.setImportantForAccessibility(4);
                }
                h hVar7 = iVar2.f9429i;
                if (hVar7 == hVar6) {
                    iVar2.h(hVar7.f9395b, 65536);
                    iVar2.f9429i = null;
                }
                if (iVar2.f9434n == hVar6) {
                    iVar2.f9434n = null;
                }
                if (iVar2.f9435p == hVar6) {
                    iVar2.f9435p = null;
                }
                it3.remove();
            }
        }
        int i18 = 2048;
        int i19 = 0;
        AccessibilityEvent e5 = iVar2.e(0, 2048);
        e5.setContentChangeTypes(1);
        iVar2.i(e5);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            h hVar8 = (h) it4.next();
            if (!Float.isNaN(hVar8.f9409l) && !Float.isNaN(hVar8.f9379M) && hVar8.f9379M != hVar8.f9409l) {
                AccessibilityEvent e6 = iVar2.e(hVar8.f9395b, 4096);
                float f4 = hVar8.f9409l;
                float f5 = hVar8.f9410m;
                if (Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(hVar8.f9411n)) {
                    f = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = hVar8.f9411n;
                    f = f5 - f6;
                    f3 = f4 - f6;
                }
                int i20 = hVar8.f9377J;
                if ((i20 & 16) != 0 || (i20 & 32) != 0) {
                    e6.setScrollY((int) f3);
                    e6.setMaxScrollY((int) f);
                } else if ((i20 & 4) != 0 || (i20 & 8) != 0) {
                    e6.setScrollX((int) f3);
                    e6.setMaxScrollX((int) f);
                }
                int i21 = hVar8.f9407j;
                if (i21 > 0) {
                    e6.setItemCount(i21);
                    e6.setFromIndex(hVar8.f9408k);
                    Iterator it5 = hVar8.f9390X.iterator();
                    int i22 = i19;
                    while (it5.hasNext()) {
                        if (!((h) it5.next()).h(14)) {
                            i22++;
                        }
                    }
                    e6.setToIndex((hVar8.f9408k + i22) - 1);
                }
                iVar2.i(e6);
            }
            if (hVar8.h(i3) && (((str = hVar8.f9412p) != null || hVar8.f9381O != null) && (str == null || !str.equals(hVar8.f9381O)))) {
                AccessibilityEvent e7 = iVar2.e(hVar8.f9395b, i18);
                e7.setContentChangeTypes(1);
                iVar2.i(e7);
            }
            if (Build.VERSION.SDK_INT >= 36 && hVar8.f9375H) {
                if (hVar8.h(2) != hVar8.g(2) || hVar8.h(26) != hVar8.g(26) || hVar8.h(18) != hVar8.g(18)) {
                    AccessibilityEvent e8 = iVar2.e(hVar8.f9395b, i18);
                    e8.setContentChangeTypes(8192);
                    iVar2.i(e8);
                }
            }
            h hVar9 = iVar2.f9429i;
            if (hVar9 != null && hVar9.f9395b == hVar8.f9395b && !hVar8.g(3) && hVar8.h(3)) {
                AccessibilityEvent e9 = iVar2.e(hVar8.f9395b, i4);
                e9.getText().add(hVar8.f9412p);
                iVar2.i(e9);
            }
            h hVar10 = iVar2.f9434n;
            if (hVar10 != null && (i5 = hVar10.f9395b) == (i6 = hVar8.f9395b) && ((hVar2 = iVar2.o) == null || hVar2.f9395b != i5)) {
                iVar2.o = hVar10;
                iVar2.i(iVar2.e(i6, 8));
            } else if (hVar10 == null) {
                iVar2.o = null;
            }
            h hVar11 = iVar2.f9434n;
            if (hVar11 != null && hVar11.f9395b == hVar8.f9395b && hVar8.g(5) && hVar8.h(5) && ((hVar = iVar2.f9429i) == null || hVar.f9395b == iVar2.f9434n.f9395b)) {
                String str2 = hVar8.f9380N;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = hVar8.f9414r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent e10 = iVar2.e(hVar8.f9395b, i3);
                e10.setBeforeText(str2);
                e10.getText().add(str4);
                int i23 = i19;
                while (i23 < str2.length() && i23 < str4.length() && str2.charAt(i23) == str4.charAt(i23)) {
                    i23++;
                }
                if (i23 < str2.length() || i23 < str4.length()) {
                    e10.setFromIndex(i23);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i23 && length2 >= i23 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    e10.setRemovedCount((length - i23) + 1);
                    e10.setAddedCount((length2 - i23) + 1);
                } else {
                    e10 = null;
                }
                if (e10 != null) {
                    iVar2.i(e10);
                }
                if (hVar8.f9378K != hVar8.f9404g || hVar8.L != hVar8.f9405h) {
                    AccessibilityEvent e11 = iVar2.e(hVar8.f9395b, 8192);
                    e11.getText().add(str4);
                    e11.setFromIndex(hVar8.f9404g);
                    e11.setToIndex(hVar8.f9405h);
                    e11.setItemCount(str4.length());
                    iVar2.i(e11);
                }
            }
            i18 = 2048;
            i19 = 0;
            i4 = 4;
            i3 = 16;
        }
    }
}
