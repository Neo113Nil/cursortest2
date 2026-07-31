package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* loaded from: classes.dex */
public final class uv0 extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private Activity f12994a;

    /* renamed from: b, reason: collision with root package name */
    private Context f12995b;

    /* renamed from: c, reason: collision with root package name */
    private Context f12996c;

    public uv0(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Activity a() {
        return this.f12994a;
    }

    public final Context b() {
        return this.f12996c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f12996c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f12995b = applicationContext;
        this.f12994a = context instanceof Activity ? (Activity) context : null;
        this.f12996c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f12994a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f12995b.startActivity(intent);
        }
    }
}
