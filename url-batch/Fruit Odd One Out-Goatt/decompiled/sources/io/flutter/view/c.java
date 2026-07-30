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

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c implements f0.n, f0.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f541a;

    public /* synthetic */ c(Object obj) {
        this.f541a = obj;
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
        i iVar = (i) this.f541a;
        HashMap hashMap = iVar.f607g;
        io.flutter.plugin.platform.h hVar3 = iVar.f605e;
        ArrayList arrayList = iVar.f615p;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            i2 = 16;
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            h b2 = iVar.b(byteBuffer.getInt());
            ArrayList arrayList3 = b2.X;
            i iVar2 = b2.f572a;
            b2.H = true;
            b2.N = b2.f593r;
            b2.O = b2.f591p;
            b2.I = b2.f575c;
            b2.J = b2.f577d;
            b2.K = b2.f583g;
            b2.L = b2.f584h;
            b2.M = b2.f588l;
            b2.f575c = byteBuffer.getLong();
            b2.f577d = byteBuffer.getInt();
            b2.f579e = byteBuffer.getInt();
            b2.f581f = byteBuffer.getInt();
            b2.f583g = byteBuffer.getInt();
            b2.f584h = byteBuffer.getInt();
            b2.f585i = byteBuffer.getInt();
            b2.f586j = byteBuffer.getInt();
            b2.f587k = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f588l = byteBuffer.getFloat();
            b2.m = byteBuffer.getFloat();
            b2.f589n = byteBuffer.getFloat();
            b2.E = byteBuffer.getInt();
            b2.f590o = i.c(byteBuffer, strArr);
            b2.f591p = i.c(byteBuffer, strArr);
            b2.f592q = h.f(byteBuffer, byteBufferArr);
            b2.f593r = i.c(byteBuffer, strArr);
            b2.f594s = h.f(byteBuffer, byteBufferArr);
            b2.f595t = i.c(byteBuffer, strArr);
            b2.u = h.f(byteBuffer, byteBufferArr);
            b2.v = i.c(byteBuffer, strArr);
            b2.f596w = h.f(byteBuffer, byteBufferArr);
            b2.f597x = i.c(byteBuffer, strArr);
            b2.f598y = h.f(byteBuffer, byteBufferArr);
            b2.f599z = i.c(byteBuffer, strArr);
            b2.A = i.c(byteBuffer, strArr);
            b2.B = i.c(byteBuffer, strArr);
            b2.C = i.c(byteBuffer, strArr);
            b2.D = i.c(byteBuffer, strArr);
            b2.F = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.P = byteBuffer.getFloat();
            b2.Q = byteBuffer.getFloat();
            b2.R = byteBuffer.getFloat();
            b2.S = byteBuffer.getFloat();
            float[] fArr = b2.T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i5 = 0; i5 < 16; i5++) {
                fArr[i5] = byteBuffer.getFloat();
            }
            b2.T = fArr;
            float[] fArr2 = b2.U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i6 = 0; i6 < 16; i6++) {
                fArr2[i6] = byteBuffer.getFloat();
            }
            b2.U = fArr2;
            b2.b0 = true;
            b2.f578d0 = true;
            int i7 = byteBuffer.getInt();
            ArrayList arrayList4 = b2.W;
            arrayList4.clear();
            for (int i8 = 0; i8 < i7; i8++) {
                h b3 = iVar2.b(byteBuffer.getInt());
                b3.V = b2;
                arrayList4.add(b3);
            }
            int i9 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i10 = 0; i10 < i9; i10++) {
                h b4 = iVar2.b(byteBuffer.getInt());
                b4.V = b2;
                arrayList3.add(b4);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                b2.Y = null;
            } else {
                ArrayList arrayList5 = b2.Y;
                if (arrayList5 == null) {
                    b2.Y = new ArrayList(i11);
                } else {
                    arrayList5.clear();
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    g a2 = iVar2.a(byteBuffer.getInt());
                    int i13 = a2.f569c;
                    if (i13 == 1) {
                        b2.Z = a2;
                    } else if (i13 == 2) {
                        b2.f573a0 = a2;
                    } else {
                        b2.Y.add(a2);
                    }
                    b2.Y.add(a2);
                }
            }
            if (!b2.h(14)) {
                if (b2.h(6)) {
                    iVar.m = b2;
                }
                if (b2.H) {
                    arrayList2.add(b2);
                }
                int i14 = b2.f585i;
                if (i14 != -1 && !hVar3.k(i14)) {
                    hVar3.q(b2.f585i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        h hVar4 = (h) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (hVar4 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            hVar4.l(fArr3, hashSet, false);
            hVar4.c(arrayList6);
        }
        int size = arrayList6.size();
        h hVar5 = null;
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList6.get(i15);
            i15++;
            h hVar6 = (h) obj;
            if (!arrayList.contains(Integer.valueOf(hVar6.f574b))) {
                hVar5 = hVar6;
            }
        }
        if (hVar5 == null && !arrayList6.isEmpty()) {
            hVar5 = (h) arrayList6.get(arrayList6.size() - 1);
        }
        if (hVar5 != null && (hVar5.f574b != iVar.f616q || arrayList6.size() != arrayList.size())) {
            iVar.f616q = hVar5.f574b;
            String e2 = hVar5.e();
            if (e2 == null) {
                e2 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                iVar.f601a.setAccessibilityPaneTitle(e2);
            } else {
                AccessibilityEvent d2 = iVar.d(hVar5.f574b, 32);
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
            arrayList.add(Integer.valueOf(((h) obj2).f574b));
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            h hVar7 = (h) ((Map.Entry) it.next()).getValue();
            if (!hashSet.contains(hVar7)) {
                hVar7.V = null;
                if (hVar7.f585i != -1 && (num = iVar.f610j) != null) {
                    View platformViewOfNode = iVar.f604d.platformViewOfNode(num.intValue());
                    hVar3.q(hVar7.f585i);
                    if (platformViewOfNode == null) {
                        iVar.g(iVar.f610j.intValue(), 65536);
                        iVar.f610j = null;
                    }
                }
                int i17 = hVar7.f585i;
                if (i17 != -1) {
                    hVar3.q(i17);
                }
                h hVar8 = iVar.f609i;
                if (hVar8 == hVar7) {
                    iVar.g(hVar8.f574b, 65536);
                    iVar.f609i = null;
                }
                if (iVar.m == hVar7) {
                    iVar.m = null;
                }
                if (iVar.f614o == hVar7) {
                    iVar.f614o = null;
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
            if (!Float.isNaN(hVar9.f588l) && !Float.isNaN(hVar9.M) && hVar9.M != hVar9.f588l) {
                AccessibilityEvent d4 = iVar.d(hVar9.f574b, 4096);
                float f4 = hVar9.f588l;
                float f5 = hVar9.m;
                if (Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(hVar9.f589n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = hVar9.f589n;
                    f2 = f5 - f6;
                    f3 = f4 - f6;
                }
                int i21 = hVar9.J;
                if ((i21 & 16) != 0 || (i21 & 32) != 0) {
                    d4.setScrollY((int) f3);
                    d4.setMaxScrollY((int) f2);
                } else if ((i21 & 4) != 0 || (i21 & 8) != 0) {
                    d4.setScrollX((int) f3);
                    d4.setMaxScrollX((int) f2);
                }
                int i22 = hVar9.f586j;
                if (i22 > 0) {
                    d4.setItemCount(i22);
                    d4.setFromIndex(hVar9.f587k);
                    ArrayList arrayList7 = hVar9.X;
                    int size4 = arrayList7.size();
                    int i23 = i19;
                    int i24 = i23;
                    while (i24 < size4) {
                        Object obj4 = arrayList7.get(i24);
                        i24++;
                        if (!((h) obj4).h(14)) {
                            i23++;
                        }
                    }
                    d4.setToIndex((hVar9.f587k + i23) - 1);
                }
                iVar.h(d4);
            }
            if (hVar9.h(i2) && (((str = hVar9.f591p) != null || hVar9.O != null) && (str == null || !str.equals(hVar9.O)))) {
                AccessibilityEvent d5 = iVar.d(hVar9.f574b, i18);
                d5.setContentChangeTypes(1);
                iVar.h(d5);
            }
            if (Build.VERSION.SDK_INT >= 36 && hVar9.H) {
                if (hVar9.h(2) != hVar9.g(2) || hVar9.h(26) != hVar9.g(26) || hVar9.h(18) != hVar9.g(18)) {
                    AccessibilityEvent d6 = iVar.d(hVar9.f574b, i18);
                    d6.setContentChangeTypes(8192);
                    iVar.h(d6);
                }
            }
            h hVar10 = iVar.f609i;
            if (hVar10 != null && hVar10.f574b == hVar9.f574b && !hVar9.g(3) && hVar9.h(3)) {
                AccessibilityEvent d7 = iVar.d(hVar9.f574b, 4);
                d7.getText().add(hVar9.f591p);
                iVar.h(d7);
            }
            h hVar11 = iVar.m;
            if (hVar11 != null && (i3 = hVar11.f574b) == (i4 = hVar9.f574b) && ((hVar2 = iVar.f613n) == null || hVar2.f574b != i3)) {
                iVar.f613n = hVar11;
                iVar.h(iVar.d(i4, 8));
            } else if (hVar11 == null) {
                iVar.f613n = null;
            }
            h hVar12 = iVar.m;
            if (hVar12 != null && hVar12.f574b == hVar9.f574b && hVar9.g(5) && hVar9.h(5) && ((hVar = iVar.f609i) == null || hVar.f574b == iVar.m.f574b)) {
                String str2 = hVar9.N;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = hVar9.f593r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent d8 = iVar.d(hVar9.f574b, i2);
                d8.setBeforeText(str2);
                d8.getText().add(str4);
                int i25 = 0;
                while (i25 < str2.length() && i25 < str4.length() && str2.charAt(i25) == str4.charAt(i25)) {
                    i25++;
                }
                if (i25 < str2.length() || i25 < str4.length()) {
                    d8.setFromIndex(i25);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i25 && length2 >= i25 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d8.setRemovedCount((length - i25) + 1);
                    d8.setAddedCount((length2 - i25) + 1);
                } else {
                    d8 = null;
                }
                if (d8 != null) {
                    iVar.h(d8);
                }
                if (hVar9.K != hVar9.f583g || hVar9.L != hVar9.f584h) {
                    AccessibilityEvent d9 = iVar.d(hVar9.f574b, 8192);
                    d9.getText().add(str4);
                    d9.setFromIndex(hVar9.f583g);
                    d9.setToIndex(hVar9.f584h);
                    d9.setItemCount(str4.length());
                    iVar.h(d9);
                }
            }
            i18 = 2048;
            i19 = 0;
            i2 = 16;
        }
    }
}
