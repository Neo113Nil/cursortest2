package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class u implements av {

    /* renamed from: a, reason: collision with root package name */
    private Context f13595a;

    private u() {
    }

    public final u a(Context context) {
        context.getClass();
        this.f13595a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        com.google.android.play.integrity.internal.am.a(this.f13595a, Context.class);
        return new w(this.f13595a, null);
    }

    /* synthetic */ u(t tVar) {
    }
}
