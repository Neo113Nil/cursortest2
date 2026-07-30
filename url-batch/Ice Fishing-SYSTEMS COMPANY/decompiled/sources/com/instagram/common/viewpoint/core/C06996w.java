package com.instagram.common.viewpoint.core;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.6w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06996w extends C1908hq {
    public static String[] A01 = {"5vbH5h", "J", "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ C06986v A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.C1908hq
    public final int A0O(View view, int i) {
        int i4;
        R2 A08 = A08();
        if (!A08.A22()) {
            return 0;
        }
        R3 r32 = (R3) view.getLayoutParams();
        int A0N = A0N(A08.A0m(view) - r32.leftMargin, A08.A0p(view) + r32.rightMargin, A08.A0g(), A08.A0j() - A08.A0h(), i);
        i4 = this.A00.A02;
        int i9 = A0N + i4;
        if (A01[0].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
        strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
        return i9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06996w(C06986v c06986v, C1839gi c1839gi) {
        super(c1839gi);
        this.A00 = c06986v;
    }

    @Override // com.instagram.common.viewpoint.core.C1908hq
    public final float A0J(DisplayMetrics displayMetrics) {
        float f6;
        f6 = this.A00.A00;
        return f6 / displayMetrics.densityDpi;
    }

    @Override // com.instagram.common.viewpoint.core.C1908hq
    public final int A0K() {
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.C1908hq
    public final PointF A0P(int i) {
        return this.A00.A56(i);
    }
}
