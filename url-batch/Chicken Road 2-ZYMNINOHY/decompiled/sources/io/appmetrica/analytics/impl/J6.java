package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class J6 implements I6 {

    /* renamed from: a, reason: collision with root package name */
    private final Jg f10471a;

    public J6(Jg jg) {
        this.f10471a = jg;
    }

    @Override // io.appmetrica.analytics.impl.I6
    public File a(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), this.f10471a.a(str));
    }
}
