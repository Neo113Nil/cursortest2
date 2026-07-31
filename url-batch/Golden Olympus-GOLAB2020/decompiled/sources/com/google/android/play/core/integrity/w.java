package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f13596a = this;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13597b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13598c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13599d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13600e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13601f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13602g;

    /* synthetic */ w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        com.google.android.play.integrity.internal.ak b4 = com.google.android.play.integrity.internal.al.b(context);
        this.f13597b = b4;
        bcVar = bb.f13533a;
        com.google.android.play.integrity.internal.an b5 = com.google.android.play.integrity.internal.aj.b(bcVar);
        this.f13598c = b5;
        oVar = n.f13587a;
        au auVar = new au(b4, oVar);
        this.f13599d = auVar;
        oVar2 = n.f13587a;
        com.google.android.play.integrity.internal.an b6 = com.google.android.play.integrity.internal.aj.b(new bp(b4, b5, auVar, oVar2));
        this.f13600e = b6;
        com.google.android.play.integrity.internal.an b7 = com.google.android.play.integrity.internal.aj.b(new bu(b6));
        this.f13601f = b7;
        this.f13602g = com.google.android.play.integrity.internal.aj.b(new ba(b6, b7));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f13602g.a();
    }
}
