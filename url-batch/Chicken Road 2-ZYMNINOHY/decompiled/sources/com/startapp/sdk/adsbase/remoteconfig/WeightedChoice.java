package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.pi;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WeightedChoice implements Serializable {
    private static final long serialVersionUID = 8011948312180032586L;
    private final String[] keys;
    private final int[] weights;

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
            int i4 = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                strArr[i4] = next;
                iArr[i4] = jSONObject.optInt(next, 0);
                i4++;
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
        WeakHashMap weakHashMap = si.f7575a;
        int length = iArr.length;
        pi piVar = si.f7579e;
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i4 = 0;
        int i5 = -1;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr[i6];
            if (i7 > 0) {
                i4 += i7;
                i5++;
                iArr2[i5] = i4 - 1;
                iArr3[i5] = i6;
            }
        }
        for (int i8 = i5 + 1; i8 < length; i8++) {
            iArr2[i8] = ((i4 + i8) - i5) - 1;
            iArr3[i8] = -1;
        }
        piVar.getClass();
        int binarySearch = Arrays.binarySearch(iArr2, ((Random) si.f7578d.a()).nextInt(i4));
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        int i9 = iArr3[binarySearch];
        if (i9 < 0) {
            return null;
        }
        String[] strArr = this.keys;
        if (i9 < strArr.length) {
            return strArr[i9];
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
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }
}
