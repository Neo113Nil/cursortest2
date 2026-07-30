package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2121lZ implements InterfaceC1003Jj {
    public static String[] A03 = {"LK8mEMUSnifSCT0YT0fQtLG", "zQWICugnqrmXEq8sMdeIuA9JBPwrta0k", "lKxJonOWK2Axk83UnpUnbJJcLxj", "3DYuz", "CNQNHGpRGAv1E31EB6wcq1FAARNpDgXE", "DpJK", "NUJ585yfBdIWgF7XcRLbZeMVqrhzmgk", "1sPINCYISeoO6PXpnzvAKZkikus6bvvY"};
    public final List<C1025Kf> A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Incorrect condition in loop: B:3:0x001d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2121lZ(List<C1025Kf> list) {
        this.A00 = Collections.unmodifiableList(new ArrayList(list));
        this.A01 = new long[list.size() * 2];
        for (int i = 0; i < cueIndex; i++) {
            C1025Kf c1025Kf = list.get(i);
            int i4 = i * 2;
            this.A01[i4] = c1025Kf.A01;
            int arrayIndex = i4 + 1;
            this.A01[arrayIndex] = c1025Kf.A00;
        }
        this.A02 = Arrays.copyOf(this.A01, this.A01.length);
        Arrays.sort(this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final List<C2349pT> A7X(long j9) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.A00.size(); i++) {
            if (this.A01[i * 2] <= j9) {
                long j10 = this.A01[(i * 2) + 1];
                if (A03[2].length() == 27) {
                    A03[5] = "FOcCQTOovqYXamkXPEg";
                    if (j9 < j10) {
                        C1025Kf c1025Kf = this.A00.get(i);
                        if (c1025Kf.A02.A01 == -3.4028235E38f) {
                            arrayList2.add(c1025Kf);
                        } else {
                            C2349pT c2349pT = c1025Kf.A02;
                            String[] strArr = A03;
                            if (strArr[6].length() != strArr[0].length()) {
                                String[] strArr2 = A03;
                                strArr2[4] = "KriihMM2RWcrEfyoWolOk5PIi1Nv3YmO";
                                strArr2[1] = "gocQSZMmm3PjEWFg0RBonPYHqyNHFxQo";
                                arrayList.add(c2349pT);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                throw new RuntimeException();
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Kp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Long.compare(((C1025Kf) obj).A01, ((C1025Kf) obj2).A01);
                return compare;
            }
        });
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            arrayList.add(((C1025Kf) arrayList2.get(i4)).A02.A02().A07((-1) - i4, 1).A0H());
        }
        return arrayList;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final long A83(int i) {
        boolean z8 = true;
        AbstractC06233y.A07(i >= 0);
        if (i >= this.A02.length) {
            z8 = false;
        }
        AbstractC06233y.A07(z8);
        return this.A02[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final int A84() {
        return this.A02.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1003Jj
    public final int A8a(long j9) {
        int A0K = C5C.A0K(this.A02, j9, false, false);
        int index = this.A02.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
