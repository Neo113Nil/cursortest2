package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518ge implements InterfaceC0890uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f7401a;

    public C0518ge(String str) {
        this.f7401a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(String str) {
        return TextUtils.isEmpty(str) ? new C0838so(this, false, AbstractC0033i.m(new StringBuilder(), this.f7401a, " is empty.")) : new C0838so(this, true, "");
    }
}
