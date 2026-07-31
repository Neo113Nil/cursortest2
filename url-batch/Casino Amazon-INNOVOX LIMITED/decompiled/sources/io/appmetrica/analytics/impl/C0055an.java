package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.an, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0055an implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    public final byte[] a(O8 o8, C0333lh c0333lh) {
        return !TextUtils.isEmpty(o8.b) ? StringUtils.getUTF8Bytes(o8.b) : new byte[0];
    }
}
