package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f10295a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f10296b;

    /* renamed from: c, reason: collision with root package name */
    public char[] f10297c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f10298d;

    public c(char[] cArr, int[] iArr) {
        this.f10297c = cArr;
        this.f10298d = iArr;
        this.f10295a = new int[cArr.length];
        this.f10296b = new int[cArr.length];
    }

    public static c b(c cVar, int i8) {
        int length = cVar.f10297c.length - i8;
        com.baidu.platform.comapi.h.g.a.a("yang11", "getTail originLen:" + cVar.f10297c.length);
        com.baidu.platform.comapi.h.g.a.a("yang11", "getTail tailLen:" + length);
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        char[] cArr = new char[length];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i8 + i9;
            iArr[i9] = cVar.f10295a[i10];
            iArr2[i9] = cVar.f10296b[i10];
            cArr[i9] = cVar.f10297c[i10];
        }
        return new c(cArr, iArr, iArr2);
    }

    public c a() {
        int[] iArr = this.f10295a;
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        char[] cArr = new char[iArr.length];
        int[] iArr4 = new int[this.f10297c.length];
        int[] iArr5 = (int[]) iArr.clone();
        int[] iArr6 = (int[]) this.f10296b.clone();
        char[] cArr2 = (char[]) this.f10297c.clone();
        this.f10298d.clone();
        return new c(cArr2, iArr5, iArr6);
    }

    public c(char[] cArr, int[] iArr, int[] iArr2) {
        this.f10295a = iArr;
        this.f10296b = iArr2;
        this.f10297c = cArr;
        this.f10298d = new int[cArr.length];
    }

    public static c a(c cVar, c cVar2) {
        int[] iArr = cVar.f10295a;
        int length = iArr.length;
        int[] iArr2 = cVar2.f10295a;
        int[] iArr3 = new int[length + iArr2.length];
        int[] iArr4 = new int[iArr.length + iArr2.length];
        char[] cArr = new char[iArr.length + iArr2.length];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr5 = cVar.f10295a;
            if (i9 >= iArr5.length) {
                break;
            }
            iArr3[i9] = iArr5[i9];
            iArr4[i9] = cVar.f10296b[i9];
            cArr[i9] = cVar.f10297c[i9];
            i9++;
        }
        while (true) {
            int[] iArr6 = cVar2.f10295a;
            if (i8 < iArr6.length) {
                int[] iArr7 = cVar.f10295a;
                iArr3[iArr7.length + i8] = iArr6[i8];
                iArr4[iArr7.length + i8] = cVar2.f10296b[i8];
                cArr[iArr7.length + i8] = cVar2.f10297c[i8];
                i8++;
            } else {
                return new c(cArr, iArr3, iArr4);
            }
        }
    }

    public static c a(c cVar, int i8) {
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        char[] cArr = new char[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = cVar.f10295a[i9];
            iArr2[i9] = cVar.f10296b[i9];
            cArr[i9] = cVar.f10297c[i9];
        }
        return new c(cArr, iArr, iArr2);
    }
}
