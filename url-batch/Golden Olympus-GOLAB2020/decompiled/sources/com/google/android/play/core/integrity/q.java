package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    private Context f13588a;

    private q() {
    }

    public final q a(Context context) {
        context.getClass();
        this.f13588a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        com.google.android.play.integrity.internal.am.a(this.f13588a, Context.class);
        return new s(this.f13588a, null);
    }

    /* synthetic */ q(p pVar) {
    }
}
