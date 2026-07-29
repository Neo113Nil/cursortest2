package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import java.io.InputStream;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class bz extends ca {
    public abstract Object a(bn bnVar);

    @Override // com.tapjoy.internal.ca
    public final Map a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Accept", "application/json");
        return linkedHashMap;
    }

    @Override // com.tapjoy.internal.ca
    public final Object a(URI uri, InputStream inputStream) {
        bn a2 = bn.a(inputStream);
        a2.a("BASE_URI", uri);
        int i = 0;
        try {
            a2.h();
            Object obj = null;
            String str = null;
            while (a2.j()) {
                String l = a2.l();
                if ("status".equals(l)) {
                    i = a2.r();
                } else if (TJAdUnitConstants.String.MESSAGE.equals(l)) {
                    str = a2.m();
                } else if ("data".equals(l)) {
                    obj = a(a2);
                } else {
                    a2.s();
                }
            }
            a2.i();
            if (i == 200) {
                return obj;
            }
            throw new cb(i, str);
        } finally {
            a2.close();
        }
    }
}
