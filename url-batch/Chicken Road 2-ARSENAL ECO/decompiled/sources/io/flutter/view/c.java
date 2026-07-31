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
public final class c implements E3.l, E3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4605a;

    public /* synthetic */ c(Object obj) {
        this.f4605a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i7;
        h hVar;
        int i8;
        int i9;
        h hVar2;
        String str;
        float f7;
        float f8;
        Integer num;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        i iVar = (i) this.f4605a;
        HashMap hashMap = iVar.f4702g;
        io.flutter.plugin.platform.i iVar2 = iVar.f4700e;
        ArrayList arrayList = iVar.f4711p;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            i7 = 16;
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            h b7 = iVar.b(byteBuffer.getInt());
            ArrayList arrayList3 = b7.f4662X;
            i iVar3 = b7.f4665a;
            b7.f4646H = true;
            b7.f4652N = b7.f4687r;
            b7.f4653O = b7.f4685p;
            b7.f4647I = b7.f4669c;
            b7.f4648J = b7.f4671d;
            b7.f4649K = b7.f4676g;
            b7.f4650L = b7.f4677h;
            b7.f4651M = b7.f4681l;
            b7.f4669c = byteBuffer.getLong();
            b7.f4671d = byteBuffer.getInt();
            b7.f4673e = byteBuffer.getInt();
            b7.f4674f = byteBuffer.getInt();
            b7.f4676g = byteBuffer.getInt();
            b7.f4677h = byteBuffer.getInt();
            b7.f4678i = byteBuffer.getInt();
            b7.f4679j = byteBuffer.getInt();
            b7.f4680k = byteBuffer.getInt();
            byteBuffer.getInt();
            b7.f4681l = byteBuffer.getFloat();
            b7.f4682m = byteBuffer.getFloat();
            b7.f4683n = byteBuffer.getFloat();
            b7.f4643E = byteBuffer.getInt();
            b7.f4684o = i.c(byteBuffer, strArr);
            b7.f4685p = i.c(byteBuffer, strArr);
            b7.f4686q = h.f(byteBuffer, byteBufferArr);
            b7.f4687r = i.c(byteBuffer, strArr);
            b7.f4688s = h.f(byteBuffer, byteBufferArr);
            b7.f4689t = i.c(byteBuffer, strArr);
            b7.f4690u = h.f(byteBuffer, byteBufferArr);
            b7.f4691v = i.c(byteBuffer, strArr);
            b7.f4692w = h.f(byteBuffer, byteBufferArr);
            b7.f4693x = i.c(byteBuffer, strArr);
            b7.y = h.f(byteBuffer, byteBufferArr);
            b7.f4694z = i.c(byteBuffer, strArr);
            b7.f4639A = i.c(byteBuffer, strArr);
            b7.f4640B = i.c(byteBuffer, strArr);
            b7.f4641C = i.c(byteBuffer, strArr);
            b7.f4642D = i.c(byteBuffer, strArr);
            b7.f4644F = byteBuffer.getInt();
            byteBuffer.getInt();
            b7.f4654P = byteBuffer.getFloat();
            b7.f4655Q = byteBuffer.getFloat();
            b7.f4656R = byteBuffer.getFloat();
            b7.f4657S = byteBuffer.getFloat();
            float[] fArr = b7.f4658T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i10 = 0; i10 < 16; i10++) {
                fArr[i10] = byteBuffer.getFloat();
            }
            b7.f4658T = fArr;
            float[] fArr2 = b7.f4659U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i11 = 0; i11 < 16; i11++) {
                fArr2[i11] = byteBuffer.getFloat();
            }
            b7.f4659U = fArr2;
            b7.f4668b0 = true;
            b7.f4672d0 = true;
            int i12 = byteBuffer.getInt();
            ArrayList arrayList4 = b7.f4661W;
            arrayList4.clear();
            for (int i13 = 0; i13 < i12; i13++) {
                h b8 = iVar3.b(byteBuffer.getInt());
                b8.f4660V = b7;
                arrayList4.add(b8);
            }
            int i14 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i15 = 0; i15 < i14; i15++) {
                h b9 = iVar3.b(byteBuffer.getInt());
                b9.f4660V = b7;
                arrayList3.add(b9);
            }
            int i16 = byteBuffer.getInt();
            if (i16 == 0) {
                b7.f4663Y = null;
            } else {
                ArrayList arrayList5 = b7.f4663Y;
                if (arrayList5 == null) {
                    b7.f4663Y = new ArrayList(i16);
                } else {
                    arrayList5.clear();
                }
                for (int i17 = 0; i17 < i16; i17++) {
                    g a7 = iVar3.a(byteBuffer.getInt());
                    int i18 = a7.f4636c;
                    if (i18 == 1) {
                        b7.f4664Z = a7;
                    } else if (i18 == 2) {
                        b7.f4666a0 = a7;
                    } else {
                        b7.f4663Y.add(a7);
                    }
                    b7.f4663Y.add(a7);
                }
            }
            if (!b7.h(14)) {
                if (b7.h(6)) {
                    iVar.f4708m = b7;
                }
                if (b7.f4646H) {
                    arrayList2.add(b7);
                }
                int i19 = b7.f4678i;
                if (i19 != -1 && !iVar2.g(i19)) {
                    iVar2.i(b7.f4678i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        h hVar3 = (h) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (hVar3 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            hVar3.l(fArr3, hashSet, false);
            hVar3.c(arrayList6);
        }
        int size = arrayList6.size();
        h hVar4 = null;
        int i20 = 0;
        while (i20 < size) {
            Object obj = arrayList6.get(i20);
            i20++;
            h hVar5 = (h) obj;
            if (!arrayList.contains(Integer.valueOf(hVar5.f4667b))) {
                hVar4 = hVar5;
            }
        }
        if (hVar4 == null && !arrayList6.isEmpty()) {
            hVar4 = (h) arrayList6.get(arrayList6.size() - 1);
        }
        if (hVar4 != null && (hVar4.f4667b != iVar.f4712q || arrayList6.size() != arrayList.size())) {
            iVar.f4712q = hVar4.f4667b;
            String e4 = hVar4.e();
            if (e4 == null) {
                e4 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                iVar.f4696a.setAccessibilityPaneTitle(e4);
            } else {
                AccessibilityEvent d7 = iVar.d(hVar4.f4667b, 32);
                d7.getText().add(e4);
                iVar.h(d7);
            }
        }
        arrayList.clear();
        int size2 = arrayList6.size();
        int i21 = 0;
        while (i21 < size2) {
            Object obj2 = arrayList6.get(i21);
            i21++;
            arrayList.add(Integer.valueOf(((h) obj2).f4667b));
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            h hVar6 = (h) ((Map.Entry) it.next()).getValue();
            if (!hashSet.contains(hVar6)) {
                hVar6.f4660V = null;
                if (hVar6.f4678i != -1 && (num = iVar.f4705j) != null) {
                    View platformViewOfNode = iVar.f4699d.platformViewOfNode(num.intValue());
                    iVar2.i(hVar6.f4678i);
                    if (platformViewOfNode == null) {
                        iVar.g(iVar.f4705j.intValue(), 65536);
                        iVar.f4705j = null;
                    }
                }
                int i22 = hVar6.f4678i;
                if (i22 != -1) {
                    iVar2.i(i22);
                }
                h hVar7 = iVar.f4704i;
                if (hVar7 == hVar6) {
                    iVar.g(hVar7.f4667b, 65536);
                    iVar.f4704i = null;
                }
                if (iVar.f4708m == hVar6) {
                    iVar.f4708m = null;
                }
                if (iVar.f4710o == hVar6) {
                    iVar.f4710o = null;
                }
                it.remove();
            }
        }
        int i23 = 2048;
        int i24 = 0;
        AccessibilityEvent d8 = iVar.d(0, 2048);
        d8.setContentChangeTypes(1);
        iVar.h(d8);
        int size3 = arrayList2.size();
        int i25 = 0;
        while (i25 < size3) {
            Object obj3 = arrayList2.get(i25);
            i25++;
            h hVar8 = (h) obj3;
            if (!Float.isNaN(hVar8.f4681l) && !Float.isNaN(hVar8.f4651M) && hVar8.f4651M != hVar8.f4681l) {
                AccessibilityEvent d9 = iVar.d(hVar8.f4667b, 4096);
                float f9 = hVar8.f4681l;
                float f10 = hVar8.f4682m;
                if (Float.isInfinite(f10)) {
                    if (f9 > 70000.0f) {
                        f9 = 70000.0f;
                    }
                    f10 = 100000.0f;
                }
                if (Float.isInfinite(hVar8.f4683n)) {
                    f7 = f10 + 100000.0f;
                    if (f9 < -70000.0f) {
                        f9 = -70000.0f;
                    }
                    f8 = f9 + 100000.0f;
                } else {
                    float f11 = hVar8.f4683n;
                    f7 = f10 - f11;
                    f8 = f9 - f11;
                }
                int i26 = hVar8.f4648J;
                if ((i26 & 16) != 0 || (i26 & 32) != 0) {
                    d9.setScrollY((int) f8);
                    d9.setMaxScrollY((int) f7);
                } else if ((i26 & 4) != 0 || (i26 & 8) != 0) {
                    d9.setScrollX((int) f8);
                    d9.setMaxScrollX((int) f7);
                }
                int i27 = hVar8.f4679j;
                if (i27 > 0) {
                    d9.setItemCount(i27);
                    d9.setFromIndex(hVar8.f4680k);
                    ArrayList arrayList7 = hVar8.f4662X;
                    int size4 = arrayList7.size();
                    int i28 = i24;
                    int i29 = i28;
                    while (i29 < size4) {
                        Object obj4 = arrayList7.get(i29);
                        i29++;
                        if (!((h) obj4).h(14)) {
                            i28++;
                        }
                    }
                    d9.setToIndex((hVar8.f4680k + i28) - 1);
                }
                iVar.h(d9);
            }
            if (hVar8.h(i7) && (((str = hVar8.f4685p) != null || hVar8.f4653O != null) && (str == null || !str.equals(hVar8.f4653O)))) {
                AccessibilityEvent d10 = iVar.d(hVar8.f4667b, i23);
                d10.setContentChangeTypes(1);
                iVar.h(d10);
            }
            if (Build.VERSION.SDK_INT >= 36 && hVar8.f4646H) {
                if (hVar8.h(2) != hVar8.g(2) || hVar8.h(26) != hVar8.g(26) || hVar8.h(18) != hVar8.g(18)) {
                    AccessibilityEvent d11 = iVar.d(hVar8.f4667b, i23);
                    d11.setContentChangeTypes(8192);
                    iVar.h(d11);
                }
            }
            h hVar9 = iVar.f4704i;
            if (hVar9 != null && hVar9.f4667b == hVar8.f4667b && !hVar8.g(3) && hVar8.h(3)) {
                AccessibilityEvent d12 = iVar.d(hVar8.f4667b, 4);
                d12.getText().add(hVar8.f4685p);
                iVar.h(d12);
            }
            h hVar10 = iVar.f4708m;
            if (hVar10 != null && (i8 = hVar10.f4667b) == (i9 = hVar8.f4667b) && ((hVar2 = iVar.f4709n) == null || hVar2.f4667b != i8)) {
                iVar.f4709n = hVar10;
                iVar.h(iVar.d(i9, 8));
            } else if (hVar10 == null) {
                iVar.f4709n = null;
            }
            h hVar11 = iVar.f4708m;
            if (hVar11 != null && hVar11.f4667b == hVar8.f4667b && hVar8.g(5) && hVar8.h(5) && ((hVar = iVar.f4704i) == null || hVar.f4667b == iVar.f4708m.f4667b)) {
                String str2 = hVar8.f4652N;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = hVar8.f4687r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent d13 = iVar.d(hVar8.f4667b, i7);
                d13.setBeforeText(str2);
                d13.getText().add(str4);
                int i30 = 0;
                while (i30 < str2.length() && i30 < str4.length() && str2.charAt(i30) == str4.charAt(i30)) {
                    i30++;
                }
                if (i30 < str2.length() || i30 < str4.length()) {
                    d13.setFromIndex(i30);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i30 && length2 >= i30 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d13.setRemovedCount((length - i30) + 1);
                    d13.setAddedCount((length2 - i30) + 1);
                } else {
                    d13 = null;
                }
                if (d13 != null) {
                    iVar.h(d13);
                }
                if (hVar8.f4649K != hVar8.f4676g || hVar8.f4650L != hVar8.f4677h) {
                    AccessibilityEvent d14 = iVar.d(hVar8.f4667b, 8192);
                    d14.getText().add(str4);
                    d14.setFromIndex(hVar8.f4676g);
                    d14.setToIndex(hVar8.f4677h);
                    d14.setItemCount(str4.length());
                    iVar.h(d14);
                }
            }
            i23 = 2048;
            i24 = 0;
            i7 = 16;
        }
    }
}
