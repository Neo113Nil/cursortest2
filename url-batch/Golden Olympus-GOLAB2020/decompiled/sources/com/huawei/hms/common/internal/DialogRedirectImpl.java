package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public class DialogRedirectImpl extends DialogRedirect {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f14077a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14078b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f14079c;

    DialogRedirectImpl(Intent intent, Activity activity, int i4) {
        this.f14079c = intent;
        this.f14077a = activity;
        this.f14078b = i4;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Activity activity;
        Intent intent = this.f14079c;
        if (intent == null || (activity = this.f14077a) == null) {
            return;
        }
        activity.startActivityForResult(intent, this.f14078b);
    }
}
