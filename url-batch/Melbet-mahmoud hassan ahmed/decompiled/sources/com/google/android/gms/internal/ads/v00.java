package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class v00 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13059a;

    public v00(Context context) {
        r3.o.j(context, "Context can not be null");
        this.f13059a = context;
    }

    public final boolean a(Intent intent) {
        r3.o.j(intent, "Intent can not be null");
        return !this.f13059a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @TargetApi(14)
    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        return ((Boolean) a3.i1.a(this.f13059a, new u00())).booleanValue() && w3.c.a(this.f13059a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
