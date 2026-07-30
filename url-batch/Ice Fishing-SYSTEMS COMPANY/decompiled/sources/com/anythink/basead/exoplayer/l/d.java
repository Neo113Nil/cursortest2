package com.anythink.basead.exoplayer.l;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f8726a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8727b;

    private d(List<byte[]> list, int i) {
        this.f8726a = list;
        this.f8727b = i;
    }

    public static d a(s sVar) {
        try {
            sVar.d(21);
            int d2 = sVar.d() & 3;
            int d3 = sVar.d();
            int c4 = sVar.c();
            int i = 0;
            for (int i4 = 0; i4 < d3; i4++) {
                sVar.d(1);
                int e6 = sVar.e();
                for (int i9 = 0; i9 < e6; i9++) {
                    int e9 = sVar.e();
                    i += e9 + 4;
                    sVar.d(e9);
                }
            }
            sVar.c(c4);
            byte[] bArr = new byte[i];
            int i10 = 0;
            for (int i11 = 0; i11 < d3; i11++) {
                sVar.d(1);
                int e10 = sVar.e();
                for (int i12 = 0; i12 < e10; i12++) {
                    int e11 = sVar.e();
                    byte[] bArr2 = p.f8629a;
                    System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                    int length = i10 + bArr2.length;
                    System.arraycopy(sVar.f8659a, sVar.c(), bArr, length, e11);
                    i10 = length + e11;
                    sVar.d(e11);
                }
            }
            return new d(i == 0 ? null : Collections.singletonList(bArr), d2 + 1);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw new t("Error parsing HEVC config", e12);
        }
    }
}
