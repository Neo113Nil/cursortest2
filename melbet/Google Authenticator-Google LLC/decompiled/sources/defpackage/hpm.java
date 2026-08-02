package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpm {
    public static final hnu a;

    static {
        char[][] cArr;
        HashMap hashMap = new HashMap();
        hoq.d('\"', "&quot;", hashMap);
        hoq.d('\'', "&#39;", hashMap);
        hoq.d('&', "&amp;", hashMap);
        hoq.d('<', "&lt;", hashMap);
        hoq.d('>', "&gt;", hashMap);
        if (hashMap.isEmpty()) {
            cArr = hju.a;
        } else {
            char[][] cArr2 = new char[((Character) Collections.max(hashMap.keySet())).charValue() + 1][];
            for (Character ch : hashMap.keySet()) {
                cArr2[ch.charValue()] = ((String) hashMap.get(ch)).toCharArray();
            }
            cArr = cArr2;
        }
        a = new hjv(new hju(cArr));
    }
}
