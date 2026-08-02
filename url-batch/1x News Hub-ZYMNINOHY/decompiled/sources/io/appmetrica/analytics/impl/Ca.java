package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class Ca extends K2 {

    /* renamed from: b, reason: collision with root package name */
    public final C1004za f5840b;

    /* renamed from: c, reason: collision with root package name */
    public final C1004za f5841c;

    /* renamed from: d, reason: collision with root package name */
    public final Ba f5842d;

    public Ca(int i3, int i4, int i5) {
        this(i3, new C1004za(i4), new C1004za(i5));
    }

    public Ca(int i3, C1004za c1004za, C1004za c1004za2) {
        super(i3);
        this.f5842d = new Ba();
        this.f5840b = c1004za;
        this.f5841c = c1004za2;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    public final On a(Map<String, String> map) {
        HashMap hashMap;
        int i3;
        int i4 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f5842d);
            int length = entryArr.length;
            i3 = 0;
            int i5 = 0;
            boolean z = false;
            int i6 = 0;
            while (i4 < length) {
                Map.Entry entry = entryArr[i4];
                On a3 = this.f5840b.a((String) entry.getKey());
                On a4 = this.f5841c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a4.f6419a) + StringUtils.getUtf8BytesLength((String) a3.f6419a);
                if (z || utf8BytesLength2 + i6 > this.f6225a) {
                    i5++;
                    i3 += utf8BytesLength;
                    z = true;
                } else {
                    i3 = a4.f6420b.getBytesTruncated() + a3.f6420b.getBytesTruncated() + i3;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a4.f6419a) + StringUtils.getUtf8BytesLength((String) a3.f6419a) + i6;
                    hashMap.put((String) a3.f6419a, (String) a4.f6419a);
                    i6 = utf8BytesLength3;
                }
                i4++;
            }
            i4 = i5;
        } else {
            hashMap = null;
            i3 = 0;
        }
        return new On(hashMap, new C0870u4(i4, i3));
    }
}
