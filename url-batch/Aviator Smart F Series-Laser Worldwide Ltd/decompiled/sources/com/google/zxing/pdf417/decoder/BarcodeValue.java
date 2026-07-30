package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class BarcodeValue {
    private final Map<Integer, Integer> values = new HashMap();

    BarcodeValue() {
    }

    Integer getConfidence(int i8) {
        return this.values.get(Integer.valueOf(i8));
    }

    int[] getValue() {
        ArrayList arrayList = new ArrayList();
        int i8 = -1;
        for (Map.Entry<Integer, Integer> entry : this.values.entrySet()) {
            if (entry.getValue().intValue() > i8) {
                i8 = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i8) {
                arrayList.add(entry.getKey());
            }
        }
        return PDF417Common.toIntArray(arrayList);
    }

    void setValue(int i8) {
        Integer num = this.values.get(Integer.valueOf(i8));
        if (num == null) {
            num = 0;
        }
        this.values.put(Integer.valueOf(i8), Integer.valueOf(num.intValue() + 1));
    }
}
