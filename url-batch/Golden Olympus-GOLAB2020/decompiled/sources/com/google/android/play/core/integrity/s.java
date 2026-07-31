package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f13589a = this;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13590b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13591c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13592d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13593e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13594f;

    /* synthetic */ s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        com.google.android.play.integrity.internal.ak b4 = com.google.android.play.integrity.internal.al.b(context);
        this.f13590b = b4;
        adVar = ac.f13480a;
        com.google.android.play.integrity.internal.an b5 = com.google.android.play.integrity.internal.aj.b(adVar);
        this.f13591c = b5;
        mVar = l.f13582a;
        au auVar = new au(b4, mVar);
        this.f13592d = auVar;
        mVar2 = l.f13582a;
        com.google.android.play.integrity.internal.an b6 = com.google.android.play.integrity.internal.aj.b(new al(b4, b5, auVar, mVar2));
        this.f13593e = b6;
        this.f13594f = com.google.android.play.integrity.internal.aj.b(new ab(b6));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f13594f.a();
    }
}
