package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
public final class bp implements com.google.android.play.integrity.internal.ak {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13566a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13567b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13568c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13569d;

    public bp(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2, com.google.android.play.integrity.internal.an anVar3, com.google.android.play.integrity.internal.an anVar4) {
        this.f13566a = anVar;
        this.f13567b = anVar2;
        this.f13568c = anVar3;
        this.f13569d = anVar4;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f13566a.a(), (com.google.android.play.integrity.internal.s) this.f13567b.a(), ((au) this.f13568c).a(), new j());
    }
}
