package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yh0;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class ai0 {

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f23281a = new sf1(10);

    public final wz0 a(lz lzVar, yh0.a aVar) {
        wz0 wz0Var = null;
        int i4 = 0;
        while (true) {
            try {
                lzVar.b(this.f23281a.c(), 0, 10, false);
                this.f23281a.e(0);
                if (this.f23281a.w() != 4801587) {
                    break;
                }
                this.f23281a.f(3);
                int s4 = this.f23281a.s();
                int i5 = s4 + 10;
                if (wz0Var == null) {
                    byte[] bArr = new byte[i5];
                    System.arraycopy(this.f23281a.c(), 0, bArr, 0, 10);
                    lzVar.b(bArr, 10, s4, false);
                    wz0Var = new yh0(aVar).a(i5, bArr);
                } else {
                    lzVar.a(false, s4);
                }
                i4 += i5;
            } catch (EOFException unused) {
            }
        }
        lzVar.c();
        lzVar.a(false, i4);
        return wz0Var;
    }
}
