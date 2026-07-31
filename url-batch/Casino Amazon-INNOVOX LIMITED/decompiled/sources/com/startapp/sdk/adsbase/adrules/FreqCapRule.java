package com.startapp.sdk.adsbase.adrules;

import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class FreqCapRule extends AdRule implements Serializable {
    private static final long serialVersionUID = 1214675798271840648L;
    private int cap;
    private int time;

    public FreqCapRule() {
        super(true);
    }

    @Override // com.startapp.sdk.adsbase.adrules.AdRule
    public final boolean a(List list) {
        int i;
        if (list == null && this.cap > 0) {
            return true;
        }
        if (this.cap <= 0) {
            return false;
        }
        int i2 = this.time;
        if (i2 == 0) {
            return true;
        }
        if (i2 < 0) {
            i = list.size();
        } else {
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if (System.currentTimeMillis() - ((s) it.next()).f410a <= TimeUnit.SECONDS.toMillis(this.time)) {
                    i3++;
                }
            }
            i = i3;
        }
        return i < this.cap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FreqCapRule freqCapRule = (FreqCapRule) obj;
            if (this.time == freqCapRule.time && this.cap == freqCapRule.cap) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.time), Integer.valueOf(this.cap)};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
