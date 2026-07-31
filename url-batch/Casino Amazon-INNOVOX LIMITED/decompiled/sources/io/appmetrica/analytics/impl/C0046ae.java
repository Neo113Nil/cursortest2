package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.ae, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0046ae implements to {

    /* renamed from: a, reason: collision with root package name */
    public final String f1165a;

    public C0046ae(String str) {
        this.f1165a = str;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(String str) {
        return TextUtils.isEmpty(str) ? new ro(this, false, this.f1165a + " is empty.") : new ro(this, true, "");
    }
}
