package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public ATBaseAdAdapter f14192a;

    /* renamed from: b, reason: collision with root package name */
    private Throwable f14193b;

    public p(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f14192a = aTBaseAdAdapter;
    }

    public final String a(String str) {
        Throwable th = this.f14193b;
        if (th != null && !(th instanceof ClassNotFoundException)) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                return message;
            }
            String message2 = this.f14193b.getCause() != null ? this.f14193b.getCause().getMessage() : "";
            if (!TextUtils.isEmpty(message2)) {
                return message2;
            }
        }
        return str;
    }

    public p(Throwable th) {
        this.f14193b = th;
    }
}
