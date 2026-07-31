package com.digitalturbine.ignite.authenticator.decorator;

import android.content.ComponentName;
import android.os.IBinder;

/* loaded from: classes11.dex */
public final class d implements Runnable {
    public final /* synthetic */ ComponentName a;
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ e c;

    public d(e eVar, ComponentName componentName, IBinder iBinder) {
        this.c = eVar;
        this.a = componentName;
        this.b = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b);
    }
}
