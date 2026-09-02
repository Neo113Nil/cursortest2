package d1;

import W.t;
import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f8207b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8208c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f8209d;

    /* renamed from: e, reason: collision with root package name */
    public int f8210e;

    /* renamed from: f, reason: collision with root package name */
    public int f8211f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f8212g;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8206a = new int[4];

    /* renamed from: h, reason: collision with root package name */
    public int f8213h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f8214i = -1;

    public static int a(int[] iArr, int i4) {
        return (i4 < 0 || i4 >= iArr.length) ? iArr[0] : iArr[i4];
    }

    public static int c(int i4, int i5) {
        return (i4 & 16777215) | ((i5 * 17) << 24);
    }

    public final void b(t tVar, boolean z, Rect rect, int[] iArr) {
        int i4;
        int i5;
        int width = rect.width();
        int height = rect.height();
        int i6 = !z ? 1 : 0;
        int i7 = i6 * width;
        while (true) {
            int i8 = 0;
            do {
                int i9 = 0;
                for (int i10 = 1; i9 < i10 && i10 <= 64; i10 <<= 2) {
                    if (tVar.b() < 4) {
                        i4 = -1;
                        i5 = 0;
                        break;
                    }
                    i9 = (i9 << 4) | tVar.i(4);
                }
                i4 = i9 & 3;
                i5 = i9 < 4 ? width : i9 >> 2;
                int min = Math.min(i5, width - i8);
                if (min > 0) {
                    int i11 = i7 + min;
                    Arrays.fill(iArr, i7, i11, this.f8206a[i4]);
                    i8 += min;
                    i7 = i11;
                }
            } while (i8 < width);
            i6 += 2;
            if (i6 >= height) {
                return;
            }
            i7 = i6 * width;
            tVar.c();
        }
    }
}
