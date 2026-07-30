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
public final class a implements i4.k, i4.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5787a;

    public /* synthetic */ a(Object obj) {
        this.f5787a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i2;
        int i5;
        f fVar;
        f fVar2;
        int i7;
        int i8;
        f fVar3;
        String str;
        float f7;
        float f8;
        View m2;
        Integer num;
        View m7;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        g gVar = (g) this.f5787a;
        HashMap hashMap = gVar.f5885g;
        io.flutter.plugin.platform.m mVar = gVar.f5883e;
        ArrayList arrayList = gVar.f5894q;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            i2 = 16;
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            f c7 = gVar.c(byteBuffer.getInt());
            ArrayList arrayList3 = c7.f5844X;
            g gVar2 = c7.f5847a;
            c7.f5829H = true;
            c7.f5835N = c7.f5869r;
            c7.f5836O = c7.f5867p;
            c7.f5830I = c7.f5851c;
            c7.f5831J = c7.f5853d;
            c7.f5832K = c7.f5859g;
            c7.f5833L = c7.f5860h;
            c7.f5834M = c7.f5863l;
            c7.f5851c = byteBuffer.getLong();
            c7.f5853d = byteBuffer.getInt();
            c7.f5855e = byteBuffer.getInt();
            c7.f5857f = byteBuffer.getInt();
            c7.f5859g = byteBuffer.getInt();
            c7.f5860h = byteBuffer.getInt();
            c7.f5861i = byteBuffer.getInt();
            c7.j = byteBuffer.getInt();
            c7.f5862k = byteBuffer.getInt();
            byteBuffer.getInt();
            c7.f5863l = byteBuffer.getFloat();
            c7.f5864m = byteBuffer.getFloat();
            c7.f5865n = byteBuffer.getFloat();
            c7.f5826E = byteBuffer.getInt();
            c7.f5866o = g.d(byteBuffer, strArr);
            c7.f5867p = g.d(byteBuffer, strArr);
            c7.f5868q = f.f(byteBuffer, byteBufferArr);
            c7.f5869r = g.d(byteBuffer, strArr);
            c7.f5870s = f.f(byteBuffer, byteBufferArr);
            c7.f5871t = g.d(byteBuffer, strArr);
            c7.f5872u = f.f(byteBuffer, byteBufferArr);
            c7.f5873v = g.d(byteBuffer, strArr);
            c7.f5874w = f.f(byteBuffer, byteBufferArr);
            c7.f5875x = g.d(byteBuffer, strArr);
            c7.f5876y = f.f(byteBuffer, byteBufferArr);
            c7.f5877z = g.d(byteBuffer, strArr);
            c7.f5822A = g.d(byteBuffer, strArr);
            c7.f5823B = g.d(byteBuffer, strArr);
            c7.f5824C = g.d(byteBuffer, strArr);
            c7.f5825D = g.d(byteBuffer, strArr);
            c7.f5827F = byteBuffer.getInt();
            byteBuffer.getInt();
            c7.f5837P = byteBuffer.getFloat();
            c7.Q = byteBuffer.getFloat();
            c7.f5838R = byteBuffer.getFloat();
            c7.f5839S = byteBuffer.getFloat();
            float[] fArr = c7.f5840T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i9 = 0; i9 < 16; i9++) {
                fArr[i9] = byteBuffer.getFloat();
            }
            c7.f5840T = fArr;
            float[] fArr2 = c7.f5841U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i10 = 0; i10 < 16; i10++) {
                fArr2[i10] = byteBuffer.getFloat();
            }
            c7.f5841U = fArr2;
            c7.f5850b0 = true;
            c7.f5854d0 = true;
            int i11 = byteBuffer.getInt();
            ArrayList arrayList4 = c7.f5843W;
            arrayList4.clear();
            for (int i12 = 0; i12 < i11; i12++) {
                f c8 = gVar2.c(byteBuffer.getInt());
                c8.f5842V = c7;
                arrayList4.add(c8);
            }
            int i13 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i14 = 0; i14 < i13; i14++) {
                f c9 = gVar2.c(byteBuffer.getInt());
                c9.f5842V = c7;
                arrayList3.add(c9);
            }
            int i15 = byteBuffer.getInt();
            if (i15 == 0) {
                c7.f5845Y = null;
            } else {
                ArrayList arrayList5 = c7.f5845Y;
                if (arrayList5 == null) {
                    c7.f5845Y = new ArrayList(i15);
                } else {
                    arrayList5.clear();
                }
                for (int i16 = 0; i16 < i15; i16++) {
                    e b7 = gVar2.b(byteBuffer.getInt());
                    int i17 = b7.f5819c;
                    if (i17 == 1) {
                        c7.f5846Z = b7;
                    } else if (i17 == 2) {
                        c7.f5848a0 = b7;
                    } else {
                        c7.f5845Y.add(b7);
                    }
                    c7.f5845Y.add(b7);
                }
            }
            if (!c7.h(14)) {
                if (c7.h(6)) {
                    gVar.f5891n = c7;
                }
                if (c7.f5829H) {
                    arrayList2.add(c7);
                }
                int i18 = c7.f5861i;
                if (i18 != -1 && !mVar.j(i18) && (m7 = mVar.m(c7.f5861i)) != null) {
                    m7.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        f fVar4 = (f) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (fVar4 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            fVar4.l(fArr3, hashSet, false);
            fVar4.c(arrayList6);
        }
        int size = arrayList6.size();
        f fVar5 = null;
        int i19 = 0;
        while (i19 < size) {
            Object obj = arrayList6.get(i19);
            i19++;
            f fVar6 = (f) obj;
            if (!arrayList.contains(Integer.valueOf(fVar6.f5849b))) {
                fVar5 = fVar6;
            }
        }
        if (fVar5 == null && !arrayList6.isEmpty()) {
            fVar5 = (f) arrayList6.get(arrayList6.size() - 1);
        }
        if (fVar5 != null && (fVar5.f5849b != gVar.f5895r || arrayList6.size() != arrayList.size())) {
            gVar.f5895r = fVar5.f5849b;
            String e7 = fVar5.e();
            if (e7 == null) {
                e7 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                gVar.f5879a.setAccessibilityPaneTitle(e7);
            } else {
                AccessibilityEvent e8 = gVar.e(fVar5.f5849b, 32);
                e8.getText().add(e7);
                gVar.i(e8);
            }
        }
        arrayList.clear();
        int size2 = arrayList6.size();
        int i20 = 0;
        while (i20 < size2) {
            Object obj2 = arrayList6.get(i20);
            i20++;
            arrayList.add(Integer.valueOf(((f) obj2).f5849b));
        }
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            i5 = 4;
            if (!it.hasNext()) {
                break;
            }
            f fVar7 = (f) ((Map.Entry) it.next()).getValue();
            if (!hashSet.contains(fVar7)) {
                fVar7.f5842V = null;
                if (fVar7.f5861i != -1 && (num = gVar.j) != null && gVar.f5882d.platformViewOfNode(num.intValue()) == mVar.m(fVar7.f5861i)) {
                    gVar.h(gVar.j.intValue(), 65536);
                    gVar.j = null;
                }
                int i21 = fVar7.f5861i;
                if (i21 != -1 && (m2 = mVar.m(i21)) != null) {
                    m2.setImportantForAccessibility(4);
                }
                f fVar8 = gVar.f5887i;
                if (fVar8 == fVar7) {
                    gVar.h(fVar8.f5849b, 65536);
                    gVar.f5887i = null;
                }
                if (gVar.f5891n == fVar7) {
                    gVar.f5891n = null;
                }
                if (gVar.f5893p == fVar7) {
                    gVar.f5893p = null;
                }
                it.remove();
            }
        }
        int i22 = 2048;
        int i23 = 0;
        AccessibilityEvent e9 = gVar.e(0, 2048);
        e9.setContentChangeTypes(1);
        gVar.i(e9);
        int size3 = arrayList2.size();
        int i24 = 0;
        while (i24 < size3) {
            Object obj3 = arrayList2.get(i24);
            i24++;
            f fVar9 = (f) obj3;
            if (!Float.isNaN(fVar9.f5863l) && !Float.isNaN(fVar9.f5834M) && fVar9.f5834M != fVar9.f5863l) {
                AccessibilityEvent e10 = gVar.e(fVar9.f5849b, 4096);
                float f9 = fVar9.f5863l;
                float f10 = fVar9.f5864m;
                if (Float.isInfinite(f10)) {
                    if (f9 > 70000.0f) {
                        f9 = 70000.0f;
                    }
                    f10 = 100000.0f;
                }
                if (Float.isInfinite(fVar9.f5865n)) {
                    f7 = f10 + 100000.0f;
                    if (f9 < -70000.0f) {
                        f9 = -70000.0f;
                    }
                    f8 = f9 + 100000.0f;
                } else {
                    float f11 = fVar9.f5865n;
                    f7 = f10 - f11;
                    f8 = f9 - f11;
                }
                int i25 = fVar9.f5831J;
                if ((i25 & 16) != 0 || (i25 & 32) != 0) {
                    e10.setScrollY((int) f8);
                    e10.setMaxScrollY((int) f7);
                } else if ((i25 & 4) != 0 || (i25 & 8) != 0) {
                    e10.setScrollX((int) f8);
                    e10.setMaxScrollX((int) f7);
                }
                int i26 = fVar9.j;
                if (i26 > 0) {
                    e10.setItemCount(i26);
                    e10.setFromIndex(fVar9.f5862k);
                    ArrayList arrayList7 = fVar9.f5844X;
                    int size4 = arrayList7.size();
                    int i27 = i23;
                    int i28 = i27;
                    while (i28 < size4) {
                        Object obj4 = arrayList7.get(i28);
                        i28++;
                        if (!((f) obj4).h(14)) {
                            i27++;
                        }
                    }
                    e10.setToIndex((fVar9.f5862k + i27) - 1);
                }
                gVar.i(e10);
            }
            if (fVar9.h(i2) && (((str = fVar9.f5867p) != null || fVar9.f5836O != null) && (str == null || !str.equals(fVar9.f5836O)))) {
                AccessibilityEvent e11 = gVar.e(fVar9.f5849b, i22);
                e11.setContentChangeTypes(1);
                gVar.i(e11);
            }
            if (Build.VERSION.SDK_INT >= 36 && fVar9.f5829H) {
                if (fVar9.h(2) != fVar9.g(2) || fVar9.h(26) != fVar9.g(26) || fVar9.h(18) != fVar9.g(18)) {
                    AccessibilityEvent e12 = gVar.e(fVar9.f5849b, i22);
                    e12.setContentChangeTypes(8192);
                    gVar.i(e12);
                }
            }
            f fVar10 = gVar.f5887i;
            if (fVar10 != null && fVar10.f5849b == fVar9.f5849b && !fVar9.g(3) && fVar9.h(3)) {
                AccessibilityEvent e13 = gVar.e(fVar9.f5849b, i5);
                e13.getText().add(fVar9.f5867p);
                gVar.i(e13);
            }
            f fVar11 = gVar.f5891n;
            if (fVar11 != null && (i7 = fVar11.f5849b) == (i8 = fVar9.f5849b) && ((fVar3 = gVar.f5892o) == null || fVar3.f5849b != i7)) {
                gVar.f5892o = fVar11;
                gVar.i(gVar.e(i8, 8));
            } else if (fVar11 == null) {
                gVar.f5892o = null;
                fVar = gVar.f5891n;
                if (fVar == null && fVar.f5849b == fVar9.f5849b && fVar9.g(5) && fVar9.h(5) && ((fVar2 = gVar.f5887i) == null || fVar2.f5849b == gVar.f5891n.f5849b)) {
                    String str2 = fVar9.f5835N;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = fVar9.f5869r;
                    String str4 = str3 != null ? str3 : "";
                    AccessibilityEvent e14 = gVar.e(fVar9.f5849b, i2);
                    e14.setBeforeText(str2);
                    e14.getText().add(str4);
                    int i29 = 0;
                    while (i29 < str2.length() && i29 < str4.length() && str2.charAt(i29) == str4.charAt(i29)) {
                        i29++;
                    }
                    if (i29 < str2.length() || i29 < str4.length()) {
                        e14.setFromIndex(i29);
                        int length = str2.length() - 1;
                        int length2 = str4.length() - 1;
                        while (length >= i29 && length2 >= i29 && str2.charAt(length) == str4.charAt(length2)) {
                            length--;
                            length2--;
                        }
                        e14.setRemovedCount((length - i29) + 1);
                        e14.setAddedCount((length2 - i29) + 1);
                    } else {
                        e14 = null;
                    }
                    if (e14 != null) {
                        gVar.i(e14);
                    }
                    if (fVar9.f5832K != fVar9.f5859g || fVar9.f5833L != fVar9.f5860h) {
                        AccessibilityEvent e15 = gVar.e(fVar9.f5849b, 8192);
                        e15.getText().add(str4);
                        e15.setFromIndex(fVar9.f5859g);
                        e15.setToIndex(fVar9.f5860h);
                        e15.setItemCount(str4.length());
                        gVar.i(e15);
                    }
                }
                i22 = 2048;
                i5 = 4;
                i23 = 0;
                i2 = 16;
            }
            fVar = gVar.f5891n;
            if (fVar == null) {
            }
            i22 = 2048;
            i5 = 4;
            i23 = 0;
            i2 = 16;
        }
    }
}
