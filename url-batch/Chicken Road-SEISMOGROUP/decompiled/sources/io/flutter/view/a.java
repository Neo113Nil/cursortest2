package io.flutter.view;

import E.AbstractC0008i;
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
public final class a implements F.l, F.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f748a;

    public /* synthetic */ a(Object obj) {
        this.f748a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i2;
        io.flutter.plugin.platform.h hVar;
        ArrayList arrayList;
        Iterator it;
        f fVar;
        int i3;
        int i4;
        f fVar2;
        String str;
        float f2;
        float f3;
        Integer num;
        g gVar;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        g gVar2 = (g) this.f748a;
        gVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            i2 = 14;
            hVar = gVar2.f834e;
            if (!hasRemaining) {
                break;
            }
            f b2 = gVar2.b(byteBuffer.getInt());
            b2.f785E = true;
            b2.f790K = b2.f822r;
            b2.L = b2.f820p;
            b2.f786F = b2.f807c;
            b2.f787G = b2.f808d;
            b2.f788H = b2.f811g;
            b2.f789I = b2.f812h;
            b2.J = b2.f816l;
            b2.f807c = byteBuffer.getLong();
            b2.f808d = byteBuffer.getInt();
            b2.f809e = byteBuffer.getInt();
            b2.f810f = byteBuffer.getInt();
            b2.f811g = byteBuffer.getInt();
            b2.f812h = byteBuffer.getInt();
            b2.f813i = byteBuffer.getInt();
            b2.f814j = byteBuffer.getInt();
            b2.f815k = byteBuffer.getInt();
            b2.f816l = byteBuffer.getFloat();
            b2.f817m = byteBuffer.getFloat();
            b2.f818n = byteBuffer.getFloat();
            b2.f819o = g.c(byteBuffer, strArr);
            b2.f820p = g.c(byteBuffer, strArr);
            b2.f821q = f.C(byteBuffer, byteBufferArr);
            b2.f822r = g.c(byteBuffer, strArr);
            b2.f823s = f.C(byteBuffer, byteBufferArr);
            b2.t = g.c(byteBuffer, strArr);
            b2.f824u = f.C(byteBuffer, byteBufferArr);
            b2.f825v = g.c(byteBuffer, strArr);
            b2.f826w = f.C(byteBuffer, byteBufferArr);
            b2.f827x = g.c(byteBuffer, strArr);
            b2.f828y = f.C(byteBuffer, byteBufferArr);
            b2.z = g.c(byteBuffer, strArr);
            b2.f781A = g.c(byteBuffer, strArr);
            b2.f782B = g.c(byteBuffer, strArr);
            b2.f783C = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f791M = byteBuffer.getFloat();
            b2.f792N = byteBuffer.getFloat();
            b2.f793O = byteBuffer.getFloat();
            b2.P = byteBuffer.getFloat();
            if (b2.f794Q == null) {
                b2.f794Q = new float[16];
            }
            for (int i5 = 0; i5 < 16; i5++) {
                b2.f794Q[i5] = byteBuffer.getFloat();
            }
            b2.f800X = true;
            b2.f802Z = true;
            int i6 = byteBuffer.getInt();
            ArrayList arrayList3 = b2.f795S;
            arrayList3.clear();
            ArrayList arrayList4 = b2.f796T;
            arrayList4.clear();
            int i7 = 0;
            while (true) {
                gVar = b2.f803a;
                if (i7 >= i6) {
                    break;
                }
                f b3 = gVar.b(byteBuffer.getInt());
                b3.R = b2;
                arrayList3.add(b3);
                i7++;
            }
            for (int i8 = 0; i8 < i6; i8++) {
                f b4 = gVar.b(byteBuffer.getInt());
                b4.R = b2;
                arrayList4.add(b4);
            }
            int i9 = byteBuffer.getInt();
            if (i9 == 0) {
                b2.f797U = null;
            } else {
                ArrayList arrayList5 = b2.f797U;
                if (arrayList5 == null) {
                    b2.f797U = new ArrayList(i9);
                } else {
                    arrayList5.clear();
                }
                for (int i10 = 0; i10 < i9; i10++) {
                    e a2 = gVar.a(byteBuffer.getInt());
                    int i11 = a2.f778c;
                    if (i11 == 1) {
                        b2.f798V = a2;
                    } else if (i11 == 2) {
                        b2.f799W = a2;
                    } else {
                        b2.f797U.add(a2);
                    }
                    b2.f797U.add(a2);
                }
            }
            if (!b2.D(14)) {
                if (b2.D(6)) {
                    gVar2.f842m = b2;
                }
                if (b2.f785E) {
                    arrayList2.add(b2);
                }
                int i12 = b2.f813i;
                if (i12 != -1 && !hVar.h(i12)) {
                    hVar.f(b2.f813i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = gVar2.f836g;
        f fVar3 = (f) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (fVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            fVar3.H(fArr, hashSet, false);
            fVar3.z(arrayList6);
        }
        Iterator it2 = arrayList6.iterator();
        f fVar4 = null;
        while (true) {
            boolean hasNext = it2.hasNext();
            arrayList = gVar2.f845p;
            if (!hasNext) {
                break;
            }
            f fVar5 = (f) it2.next();
            if (!arrayList.contains(Integer.valueOf(fVar5.f805b))) {
                fVar4 = fVar5;
            }
        }
        if (fVar4 == null && !arrayList6.isEmpty()) {
            fVar4 = (f) arrayList6.get(arrayList6.size() - 1);
        }
        if (fVar4 != null && (fVar4.f805b != gVar2.f846q || arrayList6.size() != arrayList.size())) {
            gVar2.f846q = fVar4.f805b;
            String B2 = fVar4.B();
            if (B2 == null) {
                B2 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                gVar2.f830a.setAccessibilityPaneTitle(B2);
            } else {
                AccessibilityEvent d2 = gVar2.d(fVar4.f805b, 32);
                d2.getText().add(B2);
                gVar2.h(d2);
            }
        }
        arrayList.clear();
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(((f) it3.next()).f805b));
        }
        Iterator it4 = hashMap.entrySet().iterator();
        while (it4.hasNext()) {
            f fVar6 = (f) ((Map.Entry) it4.next()).getValue();
            if (!hashSet.contains(fVar6)) {
                fVar6.R = null;
                if (fVar6.f813i != -1 && (num = gVar2.f839j) != null) {
                    View platformViewOfNode = gVar2.f833d.platformViewOfNode(num.intValue());
                    hVar.f(fVar6.f813i);
                    if (platformViewOfNode == null) {
                        gVar2.g(gVar2.f839j.intValue(), 65536);
                        gVar2.f839j = null;
                    }
                }
                int i13 = fVar6.f813i;
                if (i13 != -1) {
                    hVar.f(i13);
                }
                f fVar7 = gVar2.f838i;
                if (fVar7 == fVar6) {
                    gVar2.g(fVar7.f805b, 65536);
                    gVar2.f838i = null;
                }
                if (gVar2.f842m == fVar6) {
                    gVar2.f842m = null;
                }
                if (gVar2.f844o == fVar6) {
                    gVar2.f844o = null;
                }
                it4.remove();
            }
        }
        int i14 = 2048;
        int i15 = 0;
        AccessibilityEvent d3 = gVar2.d(0, 2048);
        d3.setContentChangeTypes(1);
        gVar2.h(d3);
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            f fVar8 = (f) it5.next();
            if (!Float.isNaN(fVar8.f816l) && !Float.isNaN(fVar8.J) && fVar8.J != fVar8.f816l) {
                AccessibilityEvent d4 = gVar2.d(fVar8.f805b, 4096);
                float f4 = fVar8.f816l;
                float f5 = fVar8.f817m;
                if (Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(fVar8.f818n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = fVar8.f818n;
                    f2 = f5 - f6;
                    f3 = f4 - f6;
                }
                if (f.y(fVar8, d.SCROLL_UP) || f.y(fVar8, d.SCROLL_DOWN)) {
                    d4.setScrollY((int) f3);
                    d4.setMaxScrollY((int) f2);
                } else if (f.y(fVar8, d.SCROLL_LEFT) || f.y(fVar8, d.SCROLL_RIGHT)) {
                    d4.setScrollX((int) f3);
                    d4.setMaxScrollX((int) f2);
                }
                int i16 = fVar8.f814j;
                if (i16 > 0) {
                    d4.setItemCount(i16);
                    d4.setFromIndex(fVar8.f815k);
                    Iterator it6 = fVar8.f796T.iterator();
                    int i17 = i15;
                    while (it6.hasNext()) {
                        if (!((f) it6.next()).D(i2)) {
                            i17++;
                        }
                    }
                    d4.setToIndex((fVar8.f815k + i17) - 1);
                }
                gVar2.h(d4);
            }
            if (fVar8.D(16) && (((str = fVar8.f820p) != null || fVar8.L != null) && (str == null || !str.equals(fVar8.L)))) {
                AccessibilityEvent d5 = gVar2.d(fVar8.f805b, i14);
                d5.setContentChangeTypes(1);
                gVar2.h(d5);
            }
            f fVar9 = gVar2.f838i;
            if (fVar9 == null || fVar9.f805b != fVar8.f805b) {
                it = it5;
            } else {
                it = it5;
                if ((fVar8.f786F & AbstractC0008i.d(3)) == 0 && fVar8.D(3)) {
                    AccessibilityEvent d6 = gVar2.d(fVar8.f805b, 4);
                    d6.getText().add(fVar8.f820p);
                    gVar2.h(d6);
                }
            }
            f fVar10 = gVar2.f842m;
            if (fVar10 != null && (i3 = fVar10.f805b) == (i4 = fVar8.f805b) && ((fVar2 = gVar2.f843n) == null || fVar2.f805b != i3)) {
                gVar2.f843n = fVar10;
                gVar2.h(gVar2.d(i4, 8));
            } else if (fVar10 == null) {
                gVar2.f843n = null;
            }
            f fVar11 = gVar2.f842m;
            if (fVar11 != null && fVar11.f805b == fVar8.f805b && (fVar8.f786F & AbstractC0008i.d(5)) != 0 && fVar8.D(5) && ((fVar = gVar2.f838i) == null || fVar.f805b == gVar2.f842m.f805b)) {
                String str2 = fVar8.f790K;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = fVar8.f822r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent d7 = gVar2.d(fVar8.f805b, 16);
                d7.setBeforeText(str2);
                d7.getText().add(str4);
                int i18 = 0;
                while (i18 < str2.length() && i18 < str4.length() && str2.charAt(i18) == str4.charAt(i18)) {
                    i18++;
                }
                if (i18 < str2.length() || i18 < str4.length()) {
                    d7.setFromIndex(i18);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i18 && length2 >= i18 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d7.setRemovedCount((length - i18) + 1);
                    d7.setAddedCount((length2 - i18) + 1);
                } else {
                    d7 = null;
                }
                if (d7 != null) {
                    gVar2.h(d7);
                }
                if (fVar8.f788H != fVar8.f811g || fVar8.f789I != fVar8.f812h) {
                    AccessibilityEvent d8 = gVar2.d(fVar8.f805b, 8192);
                    d8.getText().add(str4);
                    d8.setFromIndex(fVar8.f811g);
                    d8.setToIndex(fVar8.f812h);
                    d8.setItemCount(str4.length());
                    gVar2.h(d8);
                }
            }
            it5 = it;
            i14 = 2048;
            i15 = 0;
            i2 = 14;
        }
    }
}
