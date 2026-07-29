package com.facebook.share.internal;

import android.os.Bundle;

/* compiled from: ResultProcessor.java */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private com.facebook.h f6358a;

    public abstract void a(com.facebook.internal.a aVar, Bundle bundle);

    public i(com.facebook.h hVar) {
        this.f6358a = hVar;
    }

    public void a(com.facebook.internal.a aVar) {
        if (this.f6358a != null) {
            this.f6358a.a();
        }
    }

    public void a(com.facebook.internal.a aVar, com.facebook.j jVar) {
        if (this.f6358a != null) {
            this.f6358a.a(jVar);
        }
    }
}
