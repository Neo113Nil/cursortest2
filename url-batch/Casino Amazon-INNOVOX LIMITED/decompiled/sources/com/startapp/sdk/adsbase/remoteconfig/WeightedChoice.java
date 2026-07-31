package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.wh;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class WeightedChoice implements Serializable {
    private static final long serialVersionUID = 8011948312180032586L;
    private final String[] keys;
    private final int[] weights;

    /* compiled from: Sta */
    public static class Parser implements TypeParser<WeightedChoice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.json.TypeParser
        public WeightedChoice parse(Class<WeightedChoice> cls, Object obj) {
            if (obj instanceof String) {
                return new WeightedChoice(new String[]{(String) obj}, new int[]{1});
            }
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            String[] strArr = new String[length];
            int[] iArr = new int[length];
            Iterator<String> keys = jSONObject.keys();
            int i = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                strArr[i] = next;
                iArr[i] = jSONObject.optInt(next, 0);
                i++;
            }
            return new WeightedChoice(strArr, iArr);
        }
    }

    public WeightedChoice(String[] strArr, int[] iArr) {
        this.keys = strArr;
        this.weights = iArr;
    }

    public final String a() {
        int[] iArr = this.weights;
        WeakHashMap weakHashMap = zh.f528a;
        int length = iArr.length;
        wh whVar = zh.e;
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i4 > 0) {
                i += i4;
                i2++;
                iArr2[i2] = i - 1;
                iArr3[i2] = i3;
            }
        }
        for (int i5 = i2 + 1; i5 < length; i5++) {
            iArr2[i5] = ((i + i5) - i2) - 1;
            iArr3[i5] = -1;
        }
        whVar.getClass();
        int binarySearch = Arrays.binarySearch(iArr2, ((Random) zh.d.a()).nextInt(i));
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        int i6 = iArr3[binarySearch];
        if (i6 < 0) {
            return null;
        }
        String[] strArr = this.keys;
        if (i6 < strArr.length) {
            return strArr[i6];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WeightedChoice weightedChoice = (WeightedChoice) obj;
            if (Arrays.equals(this.keys, weightedChoice.keys) && Arrays.equals(this.weights, weightedChoice.weights)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.keys, this.weights};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
