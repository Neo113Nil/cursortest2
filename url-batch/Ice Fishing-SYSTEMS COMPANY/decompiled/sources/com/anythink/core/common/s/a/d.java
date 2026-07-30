package com.anythink.core.common.s.a;

import android.util.Log;

/* loaded from: classes.dex */
final class d implements com.anythink.core.common.s.a.a.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16484a = "FastKV";

    @Override // com.anythink.core.common.s.a.a.c
    public final void a(String str, String str2) {
        Log.i(f16484a, str + " " + str2);
    }

    @Override // com.anythink.core.common.s.a.a.c
    public final void b(String str, Exception exc) {
        Log.e(f16484a, str, exc);
    }

    @Override // com.anythink.core.common.s.a.a.c
    public final void a(String str, Exception exc) {
        Log.w(f16484a, str, exc);
    }
}
