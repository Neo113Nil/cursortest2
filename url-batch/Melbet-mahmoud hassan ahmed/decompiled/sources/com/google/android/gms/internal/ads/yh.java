package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class yh extends ai {
    public final long P0;
    public final List<zh> Q0;
    public final List<yh> R0;

    public yh(int i7, long j7) {
        super(i7);
        this.P0 = j7;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
    }

    public final yh d(int i7) {
        int size = this.R0.size();
        for (int i8 = 0; i8 < size; i8++) {
            yh yhVar = this.R0.get(i8);
            if (yhVar.f2825a == i7) {
                return yhVar;
            }
        }
        return null;
    }

    public final zh e(int i7) {
        int size = this.Q0.size();
        for (int i8 = 0; i8 < size; i8++) {
            zh zhVar = this.Q0.get(i8);
            if (zhVar.f2825a == i7) {
                return zhVar;
            }
        }
        return null;
    }

    public final void f(yh yhVar) {
        this.R0.add(yhVar);
    }

    public final void g(zh zhVar) {
        this.Q0.add(zhVar);
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final String toString() {
        String c7 = ai.c(this.f2825a);
        String arrays = Arrays.toString(this.Q0.toArray());
        String arrays2 = Arrays.toString(this.R0.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(c7.length() + 22 + length + String.valueOf(arrays2).length());
        sb.append(c7);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
