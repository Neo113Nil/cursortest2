package com.dancingbogo.skyrolline.ipc;

import android.content.Context;

/* compiled from: AbsIpcProviderHandler.java */
/* loaded from: classes2.dex */
public abstract class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private Context f4583a;

    @Override // com.dancingbogo.skyrolline.ipc.b
    public void a(Context context) {
        this.f4583a = context;
    }

    public Context a() {
        return this.f4583a;
    }
}
