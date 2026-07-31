package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f430a;
    public final s1 b;
    public final Runnable d = new Runnable() { // from class: com.startapp.sdk.internal.t1$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            t1.this.a();
        }
    };
    public final Handler c = new Handler(Looper.getMainLooper());

    public t1(Context context, id idVar) {
        this.f430a = context;
        this.b = new s1(this, idVar);
    }

    public abstract void a();
}
