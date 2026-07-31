package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0600wa extends D2 {
    public final C0525ta b;
    public final C0525ta c;
    public final C0575va d;

    public C0600wa(int i, int i2, int i3) {
        this(i, new C0525ta(i2), new C0525ta(i3));
    }

    public C0600wa(int i, C0525ta c0525ta, C0525ta c0525ta2) {
        super(i);
        this.d = new C0575va();
        this.b = c0525ta;
        this.c = c0525ta2;
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC0550ua
    public final Nn a(Map<String, String> map) {
        HashMap hashMap;
        int i;
        int i2 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.d);
            int length = entryArr.length;
            i = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            while (i2 < length) {
                Map.Entry entry = entryArr[i2];
                Nn a2 = this.b.a((String) entry.getKey());
                Nn a3 = this.c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a3.f977a) + StringUtils.getUtf8BytesLength((String) a2.f977a);
                if (z || utf8BytesLength2 + i4 > this.f805a) {
                    i3++;
                    i += utf8BytesLength;
                    z = true;
                } else {
                    i = a3.b.getBytesTruncated() + a2.b.getBytesTruncated() + i;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a3.f977a) + StringUtils.getUtf8BytesLength((String) a2.f977a) + i4;
                    hashMap.put((String) a2.f977a, (String) a3.f977a);
                    i4 = utf8BytesLength3;
                }
                i2++;
            }
            i2 = i3;
        } else {
            hashMap = null;
            i = 0;
        }
        return new Nn(hashMap, new C0395o4(i2, i));
    }
}
