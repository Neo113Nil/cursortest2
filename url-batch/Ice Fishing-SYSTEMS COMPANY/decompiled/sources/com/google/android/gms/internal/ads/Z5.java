package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Z5 implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f28968n;

    public Z5(boolean z8) {
        this.f28968n = z8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec A[RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int length;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = 0;
        int i4 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        int i12 = iArr[4];
        int i13 = iArr[5];
        int i14 = iArr[6];
        int i15 = iArr[7];
        int g9 = com.anythink.basead.b.c.i.g((i9 & (~i4)) | i10, (i4 & i11) | i12, i13, i14);
        int i16 = i15 % 496612959;
        C3020c6 c3020c6 = (C3020c6) obj;
        C3020c6 c3020c62 = (C3020c6) obj2;
        int i17 = c3020c6.f29644g;
        if (i17 != c3020c62.f29644g) {
            throw new IllegalArgumentException();
        }
        int i18 = i16 ^ g9;
        try {
            if (i17 == 0) {
                throw null;
            }
            int i19 = i17 + i18;
            boolean z8 = this.f28968n;
            switch (i19) {
                case 1:
                    if (z8) {
                        return c3020c6.l() != c3020c62.l() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(c3020c6.m(), c3020c62.m());
                case 3:
                    J5 n9 = c3020c6.n();
                    J5 n10 = c3020c62.n();
                    int i20 = 0;
                    while (true) {
                        length = n9.f25735a.length;
                        if (i < length && i20 < n10.f25735a.length) {
                            int compare = Integer.compare(J5.f(n9.b(i)), J5.f(n10.b(i20)));
                            if (compare != 0) {
                                return compare;
                            }
                            i++;
                            i20++;
                        }
                    }
                    return Integer.compare(length, n10.f25735a.length);
                case 4:
                    List o9 = c3020c6.o();
                    List o10 = c3020c62.o();
                    Iterator it = ((ArrayList) o9).iterator();
                    Iterator it2 = ((ArrayList) o10).iterator();
                    while (it.hasNext()) {
                        if (it2.hasNext()) {
                            int compare2 = compare(it.next(), it2.next());
                            if (compare2 != 0) {
                                return compare2;
                            }
                        }
                    }
                    if (it2.hasNext()) {
                        return -1;
                    }
                    break;
                case 5:
                    if (z8) {
                        if (c3020c6.p() != c3020c62.p()) {
                        }
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(c3020c6.q(), c3020c62.q());
            }
        } catch (C2911a6 e6) {
            throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e6);
        }
    }
}
