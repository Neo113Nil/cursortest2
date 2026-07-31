package com.bytedance.sdk.openadsdk.nqi;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class olo {
    private final List<iv> fs;
    private final bvs zmn;

    public olo(bvs bvsVar) {
        this.zmn = bvsVar;
        ArrayList arrayList = new ArrayList();
        this.fs = arrayList;
        arrayList.add(new iv(bvsVar, new int[]{1}));
    }

    private iv zmn(int i) {
        if (i >= this.fs.size()) {
            List<iv> list = this.fs;
            iv ivVar = list.get(list.size() - 1);
            for (int size = this.fs.size(); size <= i; size++) {
                bvs bvsVar = this.zmn;
                ivVar = ivVar.fs(new iv(bvsVar, new int[]{1, bvsVar.zmn((size - 1) + bvsVar.fs())}));
                this.fs.add(ivVar);
            }
        }
        return this.fs.get(i);
    }

    public void zmn(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        iv zmn = zmn(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] zmn2 = new iv(this.zmn, iArr2).zmn(i, 1).zn(zmn)[1].zmn();
        int length2 = i - zmn2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(zmn2, 0, iArr, length + length2, zmn2.length);
    }
}
