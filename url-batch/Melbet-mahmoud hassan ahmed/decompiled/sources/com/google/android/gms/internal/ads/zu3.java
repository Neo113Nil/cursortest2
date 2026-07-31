package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zu3 extends cv3 {

    /* renamed from: a, reason: collision with root package name */
    final Logger f15267a;

    public zu3(String str) {
        this.f15267a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.cv3
    public final void a(String str) {
        this.f15267a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
