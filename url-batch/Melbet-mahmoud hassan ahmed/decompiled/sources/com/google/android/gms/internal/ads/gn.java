package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class gn {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f5689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5690b;

    private gn(List<byte[]> list, int i7) {
        this.f5689a = list;
        this.f5690b = i7;
    }

    public static gn a(rm rmVar) {
        try {
            rmVar.w(21);
            int g7 = rmVar.g() & 3;
            int g8 = rmVar.g();
            int c7 = rmVar.c();
            int i7 = 0;
            for (int i8 = 0; i8 < g8; i8++) {
                rmVar.w(1);
                int j7 = rmVar.j();
                for (int i9 = 0; i9 < j7; i9++) {
                    int j8 = rmVar.j();
                    i7 += j8 + 4;
                    rmVar.w(j8);
                }
            }
            rmVar.v(c7);
            byte[] bArr = new byte[i7];
            int i10 = 0;
            for (int i11 = 0; i11 < g8; i11++) {
                rmVar.w(1);
                int j9 = rmVar.j();
                for (int i12 = 0; i12 < j9; i12++) {
                    int j10 = rmVar.j();
                    System.arraycopy(pm.f10272a, 0, bArr, i10, 4);
                    int i13 = i10 + 4;
                    System.arraycopy(rmVar.f11225a, rmVar.c(), bArr, i13, j10);
                    i10 = i13 + j10;
                    rmVar.w(j10);
                }
            }
            return new gn(i7 == 0 ? null : Collections.singletonList(bArr), g7 + 1);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw new af("Error parsing HEVC config", e7);
        }
    }
}
