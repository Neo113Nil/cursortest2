package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2904a {

    /* renamed from: a, reason: collision with root package name */
    public final int f29138a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f29139b;

    /* renamed from: c, reason: collision with root package name */
    public final C3235g2[] f29140c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f29141d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f29142e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f29143f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC2912a7[] f29144g;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public C2904a(int i, int[] iArr, C3235g2[] c3235g2Arr, long[] jArr, String[] strArr, AbstractC2912a7[] abstractC2912a7Arr) {
        Uri uri;
        int length = iArr.length;
        int length2 = c3235g2Arr.length;
        int i4 = 0;
        PA.n(length == length2);
        PA.n(length == abstractC2912a7Arr.length);
        this.f29138a = i;
        this.f29141d = iArr;
        this.f29140c = c3235g2Arr;
        this.f29142e = jArr;
        this.f29139b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f29139b;
            if (i4 >= uriArr.length) {
                this.f29143f = strArr;
                this.f29144g = abstractC2912a7Arr;
                return;
            }
            C3235g2 c3235g2 = c3235g2Arr[i4];
            if (c3235g2 == null) {
                uri = null;
            } else {
                N0 n02 = c3235g2.f30939b;
                n02.getClass();
                uri = n02.f26409a;
            }
            uriArr[i4] = uri;
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2904a.class == obj.getClass()) {
            C2904a c2904a = (C2904a) obj;
            if (this.f29138a == c2904a.f29138a && Arrays.equals(this.f29140c, c2904a.f29140c) && Arrays.equals(this.f29141d, c2904a.f29141d) && Arrays.equals(this.f29142e, c2904a.f29142e) && Arrays.equals(this.f29143f, c2904a.f29143f) && Arrays.equals(this.f29144g, c2904a.f29144g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f29144g) + ((((Arrays.hashCode(this.f29142e) + ((Arrays.hashCode(this.f29141d) + ((Arrays.hashCode(this.f29140c) + (((this.f29138a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f29143f)) * 31)) * 31;
    }
}
