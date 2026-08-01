package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1114bg<ModelType, StateType> {
    public static byte[] A06;
    public static String[] A07 = {"K3IBH5IY5D9A1s0otTNJJ1EDvo1qLs", "HR7iyfZ1MOS5huP42RSdRpCkeBunQMOf", "", "bEqFTGguyIKgMYqaAFudqvCpFKGvMgpm", "3wGEEC73gwsSkVWXWqLxZk", "wIAJ3aMEmj6qTKsV0aDgjtipvoJzkW0C", "SCvpsyQDnQo4JnEbtI83SB", "GSqpB1BwT3x"};
    public static final C1114bg A08;
    public boolean A00;
    public final C1114bg A01;
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public final List<InterfaceC1117bj<ModelType, StateType>> A05;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{81, 89, 92, 96, 101};
    }

    static {
        A02();
        A08 = new C1114bg(null, null, A01(0, 5, 123), Collections.emptyList(), A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bh != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1114bg(C1115bh<ModelType, StateType> c1115bh) {
        this(r1, r2, r3, r4, r5);
        Object obj;
        Object obj2;
        String str;
        List list;
        List list2;
        C1114bg c1114bg;
        obj = c1115bh.A02;
        obj2 = c1115bh.A03;
        str = c1115bh.A04;
        list = c1115bh.A01;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = c1115bh.A01;
        }
        c1114bg = c1115bh.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C1114bg(ModelType model, StateType state, String str, List<InterfaceC1117bj<ModelType, StateType>> list, C1114bg c1114bg) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
        this.A01 = c1114bg;
        this.A00 = false;
        this.A05 = list;
    }

    public static <ModelType, StateType> C1115bh<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C1115bh<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bj != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final void A03(InterfaceC1103bV interfaceC1103bV) {
        Iterator<InterfaceC1117bj<ModelType, StateType>> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().A5X(this, interfaceC1103bV);
        }
        EnumC1104bW A8A = interfaceC1103bV.A8A(this);
        String[] strArr = A07;
        if (strArr[1].charAt(23) == strArr[3].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "xMDdEaQw2xH";
        strArr2[2] = "";
        if (A8A == EnumC1104bW.A02) {
            this.A00 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A00;
    }
}
