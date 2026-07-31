package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0479re implements J6 {

    /* renamed from: a, reason: collision with root package name */
    public final File f1467a;
    public final Kg b;

    public C0479re(File file, Kg kg) {
        this.f1467a = file;
        this.b = kg;
    }

    @Override // io.appmetrica.analytics.impl.J6
    public final File a(Context context, String str) {
        return new File(this.f1467a, this.b.a(str));
    }
}
