package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class Q6 implements P6 {

    /* renamed from: a, reason: collision with root package name */
    private final Og f6503a;

    public Q6(Og og) {
        this.f6503a = og;
    }

    @Override // io.appmetrica.analytics.impl.P6
    public File a(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), this.f6503a.a(str));
    }
}
