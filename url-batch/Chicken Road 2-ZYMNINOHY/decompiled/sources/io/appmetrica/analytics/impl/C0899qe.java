package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899qe implements I6 {

    /* renamed from: a, reason: collision with root package name */
    public final File f12614a;

    /* renamed from: b, reason: collision with root package name */
    public final Jg f12615b;

    public C0899qe(File file, Jg jg) {
        this.f12614a = file;
        this.f12615b = jg;
    }

    @Override // io.appmetrica.analytics.impl.I6
    public final File a(Context context, String str) {
        return new File(this.f12614a, this.f12615b.a(str));
    }
}
