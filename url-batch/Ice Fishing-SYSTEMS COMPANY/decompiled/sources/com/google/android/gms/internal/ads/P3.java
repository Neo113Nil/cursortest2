package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class P3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f26827d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26828e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f26829f;

    /* renamed from: g, reason: collision with root package name */
    public int f26830g;

    /* renamed from: h, reason: collision with root package name */
    public int f26831h;
    public Rect i;

    /* renamed from: b, reason: collision with root package name */
    public long f26825b = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: c, reason: collision with root package name */
    public long f26826c = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f26824a = new int[4];

    /* renamed from: j, reason: collision with root package name */
    public int f26832j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f26833k = -1;

    public static int a(int i, int i4) {
        return (i & 16777215) | ((i4 * 17) << 24);
    }

    public final void b(Er er, boolean z8, Rect rect, int[] iArr) {
        int i;
        int i4;
        int i9 = !z8 ? 1 : 0;
        int width = rect.width();
        int i10 = i9 * width;
        int height = rect.height();
        while (true) {
            int i11 = 0;
            do {
                int i12 = 0;
                for (int i13 = 1; i12 < i13 && i13 <= 64; i13 <<= 2) {
                    if (er.b() < 4) {
                        i = -1;
                        i4 = 0;
                        break;
                    }
                    i12 = (i12 << 4) | er.h(4);
                }
                i = i12 & 3;
                i4 = i12 < 4 ? width : i12 >> 2;
                int min = Math.min(i4, width - i11);
                if (min > 0) {
                    int i14 = i10 + min;
                    Arrays.fill(iArr, i10, i14, this.f26824a[i]);
                    i11 += min;
                    i10 = i14;
                }
            } while (i11 < width);
            i9 += 2;
            if (i9 >= height) {
                return;
            }
            i10 = i9 * width;
            er.k();
        }
    }
}
