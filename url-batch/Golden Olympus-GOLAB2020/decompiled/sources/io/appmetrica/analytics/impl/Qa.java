package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Qa extends O2 {

    /* renamed from: b, reason: collision with root package name */
    public final Na f38160b;

    /* renamed from: c, reason: collision with root package name */
    public final Na f38161c;

    /* renamed from: d, reason: collision with root package name */
    public final Pa f38162d;

    public Qa(int i4, int i5, int i6) {
        this(i4, new Na(i5), new Na(i6));
    }

    public Qa(int i4, @NonNull Na na, @NonNull Na na2) {
        super(i4);
        this.f38162d = new Pa();
        this.f38160b = na;
        this.f38161c = na2;
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Oa
    @NonNull
    public final Jn a(Map<String, String> map) {
        HashMap hashMap;
        int i4;
        int i5 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f38162d);
            int length = entryArr.length;
            i4 = 0;
            int i6 = 0;
            boolean z4 = false;
            int i7 = 0;
            while (i5 < length) {
                Map.Entry entry = entryArr[i5];
                Jn a4 = this.f38160b.a((String) entry.getKey());
                Jn a5 = this.f38161c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a5.f37851a) + StringUtils.getUtf8BytesLength((String) a4.f37851a);
                if (z4 || utf8BytesLength2 + i7 > this.f38045a) {
                    i6++;
                    i4 += utf8BytesLength;
                    z4 = true;
                } else {
                    i4 = a5.f37852b.getBytesTruncated() + a4.f37852b.getBytesTruncated() + i4;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a5.f37851a) + StringUtils.getUtf8BytesLength((String) a4.f37851a) + i7;
                    hashMap.put((String) a4.f37851a, (String) a5.f37851a);
                    i7 = utf8BytesLength3;
                }
                i5++;
            }
            i5 = i6;
        } else {
            hashMap = null;
            i4 = 0;
        }
        return new Jn(hashMap, new I4(i5, i4));
    }
}
