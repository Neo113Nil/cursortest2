package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1024va extends C2 {

    /* renamed from: b, reason: collision with root package name */
    public final C0946sa f12884b;

    /* renamed from: c, reason: collision with root package name */
    public final C0946sa f12885c;

    /* renamed from: d, reason: collision with root package name */
    public final C0998ua f12886d;

    public C1024va(int i4, int i5, int i6) {
        this(i4, new C0946sa(i5), new C0946sa(i6));
    }

    public C1024va(int i4, C0946sa c0946sa, C0946sa c0946sa2) {
        super(i4);
        this.f12886d = new C0998ua();
        this.f12884b = c0946sa;
        this.f12885c = c0946sa2;
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0972ta
    public final Mn a(Map<String, String> map) {
        HashMap hashMap;
        int i4;
        int i5 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f12886d);
            int length = entryArr.length;
            i4 = 0;
            int i6 = 0;
            boolean z = false;
            int i7 = 0;
            while (i5 < length) {
                Map.Entry entry = entryArr[i5];
                Mn a3 = this.f12884b.a((String) entry.getKey());
                Mn a4 = this.f12885c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a4.f10676a) + StringUtils.getUtf8BytesLength((String) a3.f10676a);
                if (z || utf8BytesLength2 + i7 > this.f10150a) {
                    i6++;
                    i4 += utf8BytesLength;
                    z = true;
                } else {
                    i4 = a4.f10677b.getBytesTruncated() + a3.f10677b.getBytesTruncated() + i4;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a4.f10676a) + StringUtils.getUtf8BytesLength((String) a3.f10676a) + i7;
                    hashMap.put((String) a3.f10676a, (String) a4.f10676a);
                    i7 = utf8BytesLength3;
                }
                i5++;
            }
            i5 = i6;
        } else {
            hashMap = null;
            i4 = 0;
        }
        return new Mn(hashMap, new C0811n4(i5, i4));
    }
}
