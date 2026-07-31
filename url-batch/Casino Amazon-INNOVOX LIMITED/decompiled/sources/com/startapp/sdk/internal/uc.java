package com.startapp.sdk.internal;

import com.startapp.sdk.common.SDKException;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.Typography;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class uc extends be {
    public final LinkedHashMap b;

    public uc(Set set) {
        super(set);
        this.b = new LinkedHashMap();
    }

    @Override // com.startapp.sdk.internal.be
    public final void a(String str, Object obj, boolean z, boolean z2) {
        if (this.f185a.contains(str)) {
            return;
        }
        try {
            String b = obj instanceof ae ? ((ae) obj).b() : obj != null ? obj.toString() : null;
            if (b == null) {
                if (z) {
                    throw new SDKException(str);
                }
            } else {
                if (z2) {
                    b = URLEncoder.encode(b, CharEncoding.UTF_8);
                }
                this.b.put(str, b);
            }
        } catch (UnsupportedEncodingException e) {
            if (z) {
                throw new SDKException(str, e);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        for (Map.Entry entry : this.b.entrySet()) {
            if (entry.getValue() instanceof String) {
                sb.append((String) entry.getKey()).append('=').append(entry.getValue()).append(Typography.amp);
            } else if (entry.getValue() instanceof Set) {
                for (Object obj : (Set) entry.getValue()) {
                    if (obj instanceof String) {
                        sb.append((String) entry.getKey()).append('=').append(obj).append(Typography.amp);
                    }
                }
            }
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString().replace("+", "%20");
    }

    @Override // com.startapp.sdk.internal.be
    public final void a(String str, Set set) {
        if (this.f185a.contains(str) || set == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(URLEncoder.encode((String) it.next(), CharEncoding.UTF_8));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.b.put(str, hashSet);
    }
}
