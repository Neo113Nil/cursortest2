package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class ij extends bz {
    @Override // com.tapjoy.internal.ca
    public final String b() {
        return "POST";
    }

    @Override // com.tapjoy.internal.ca
    public final String d() {
        return "application/json";
    }

    @Override // com.tapjoy.internal.ca
    public Map e() {
        Map e = super.e();
        ha a2 = ha.a();
        e.put("sdk_ver", a2.m + "/Android");
        e.put(TapjoyConstants.TJC_API_KEY, a2.l);
        if (gx.f8223a) {
            e.put("debug", true);
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.ca
    public Object f() {
        try {
            return super.f();
        } catch (Exception e) {
            new Object[1][0] = this;
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.bz
    @Nullable
    public Object a(bn bnVar) {
        bnVar.s();
        return null;
    }
}
