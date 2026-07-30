package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class Ww extends AbstractC3551lx {

    /* renamed from: c, reason: collision with root package name */
    public final long f28533c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f28534d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f28535e;

    public Ww(int i, long j9) {
        super(i, 0);
        this.f28533c = j9;
        this.f28534d = new ArrayList();
        this.f28535e = new ArrayList();
    }

    public final C3443jx i(int i) {
        ArrayList arrayList = this.f28534d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C3443jx c3443jx = (C3443jx) arrayList.get(i4);
            if (c3443jx.f32624b == i) {
                return c3443jx;
            }
        }
        return null;
    }

    public final Ww j(int i) {
        ArrayList arrayList = this.f28535e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Ww ww = (Ww) arrayList.get(i4);
            if (ww.f32624b == i) {
                return ww;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3551lx
    public final String toString() {
        ArrayList arrayList = this.f28534d;
        String g9 = AbstractC3551lx.g(this.f32624b);
        String arrays = Arrays.toString(arrayList.toArray());
        String arrays2 = Arrays.toString(this.f28535e.toArray());
        int length = g9.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        AbstractC5051n.j(sb, g9, " leaves: ", arrays, " containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
