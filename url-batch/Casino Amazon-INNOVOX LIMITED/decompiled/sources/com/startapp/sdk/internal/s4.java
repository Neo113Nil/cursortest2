package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class s4 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f415a;

    public s4(Context context) {
        this.f415a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new af(this.f415a.getSharedPreferences("com.startapp.sdk", 0));
    }
}
