package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818nb implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0714jb apply(File file) {
        String a3 = Ja.a(file);
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        try {
            return new C0714jb(a3);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
