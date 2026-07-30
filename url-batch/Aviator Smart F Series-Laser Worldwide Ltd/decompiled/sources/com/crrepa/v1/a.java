package com.crrepa.v1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f13862a = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f13863b = {71, 73, 70, 56, 55, a4.a.X0};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f13864c = {71, 73, 70, 56, 57, a4.a.X0};

    public static boolean a(ArrayList<byte[]> arrayList) {
        Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!b(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(byte[] bArr) {
        if (bArr == null || bArr.length < f13862a.length) {
            return false;
        }
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f13862a;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    public static boolean a(byte[] bArr) {
        if (bArr == null || bArr.length < f13863b.length) {
            return false;
        }
        int i8 = 0;
        boolean z7 = true;
        boolean z8 = true;
        while (true) {
            byte[] bArr2 = f13863b;
            if (i8 >= bArr2.length) {
                return z7 || z8;
            }
            byte b8 = bArr[i8];
            if (b8 != bArr2[i8]) {
                z7 = false;
            }
            if (b8 != f13864c[i8]) {
                z8 = false;
            }
            if (!z7 && !z8) {
                return false;
            }
            i8++;
        }
    }
}
