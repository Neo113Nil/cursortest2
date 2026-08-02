package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Zd implements InterfaceC0960so {

    /* renamed from: a, reason: collision with root package name */
    public final String f11373a;

    public Zd(String str) {
        this.f11373a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(String str) {
        return TextUtils.isEmpty(str) ? new C0909qo(this, false, AbstractC0005f.q(new StringBuilder(), this.f11373a, " is empty.")) : new C0909qo(this, true, "");
    }
}
