package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2859oe implements InterfaceC2895po {

    /* renamed from: a, reason: collision with root package name */
    public final String f39573a;

    public C2859oe(@NonNull String str) {
        this.f39573a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new C2843no(this, true, "");
        }
        return new C2843no(this, false, this.f39573a + " is empty.");
    }
}
