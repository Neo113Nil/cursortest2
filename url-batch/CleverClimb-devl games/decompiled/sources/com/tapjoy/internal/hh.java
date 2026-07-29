package com.tapjoy.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class hh {

    /* renamed from: c, reason: collision with root package name */
    long f8277c;

    /* renamed from: d, reason: collision with root package name */
    boolean f8278d;
    public gt e;
    public String f;
    fr g;

    public abstract void a(hb hbVar, fx fxVar);

    public abstract void b();

    public boolean c() {
        return true;
    }

    static void a(Context context, @Nullable String str) {
        if (jr.c(str)) {
            return;
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
        }
    }
}
