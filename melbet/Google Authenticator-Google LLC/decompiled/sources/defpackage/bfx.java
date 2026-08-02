package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfx {
    public static final Map a;
    private static final String b;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if (charAt <= 31) {
                    if (charAt == '\t') {
                        charAt = '\t';
                    }
                    sb.append('?');
                }
                if (charAt < 127) {
                    sb.append(charAt);
                }
                sb.append('?');
            }
            property = sb.toString();
        }
        b = property;
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new bfy(property)));
        }
        a = DesugarCollections.unmodifiableMap(hashMap);
    }
}
