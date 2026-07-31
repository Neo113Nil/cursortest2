package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class i3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f271a;

    public i3(Context context) {
        this.f271a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new m9(new af(this.f271a.getSharedPreferences("StartApp-54ff24db2aee60b9", 0)));
    }
}
