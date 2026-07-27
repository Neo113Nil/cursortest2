package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class Ca extends K2 {

    /* renamed from: b, reason: collision with root package name */
    public final C1155za f6622b;

    /* renamed from: c, reason: collision with root package name */
    public final C1155za f6623c;

    /* renamed from: d, reason: collision with root package name */
    public final Ba f6624d;

    public Ca(int i2, int i3, int i6) {
        this(i2, new C1155za(i3), new C1155za(i6));
    }

    public Ca(int i2, C1155za c1155za, C1155za c1155za2) {
        super(i2);
        this.f6624d = new Ba();
        this.f6622b = c1155za;
        this.f6623c = c1155za2;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    public final On a(Map<String, String> map) {
        HashMap hashMap;
        int i2;
        int i3 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f6624d);
            int length = entryArr.length;
            i2 = 0;
            int i6 = 0;
            boolean z = false;
            int i7 = 0;
            while (i3 < length) {
                Map.Entry entry = entryArr[i3];
                On a6 = this.f6622b.a((String) entry.getKey());
                On a7 = this.f6623c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a7.f7230a) + StringUtils.getUtf8BytesLength((String) a6.f7230a);
                if (z || utf8BytesLength2 + i7 > this.f7028a) {
                    i6++;
                    i2 += utf8BytesLength;
                    z = true;
                } else {
                    i2 = a7.f7231b.getBytesTruncated() + a6.f7231b.getBytesTruncated() + i2;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a7.f7230a) + StringUtils.getUtf8BytesLength((String) a6.f7230a) + i7;
                    hashMap.put((String) a6.f7230a, (String) a7.f7230a);
                    i7 = utf8BytesLength3;
                }
                i3++;
            }
            i3 = i6;
        } else {
            hashMap = null;
            i2 = 0;
        }
        return new On(hashMap, new C1021u4(i3, i2));
    }
}
