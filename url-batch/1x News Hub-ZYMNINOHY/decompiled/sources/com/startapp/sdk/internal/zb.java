package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zb {

    /* renamed from: d, reason: collision with root package name */
    public static final zb f4880d = new zb();

    /* renamed from: a, reason: collision with root package name */
    public final String f4881a;

    /* renamed from: b, reason: collision with root package name */
    public final xb f4882b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4883c;

    public zb(Locale primary, LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.j.e(primary, "primary");
        this.f4881a = primary.toString();
        this.f4882b = new xb(linkedHashSet);
        this.f4883c = yb.a(primary, linkedHashSet, ',');
    }

    public zb() {
        this.f4881a = null;
        this.f4882b = null;
        this.f4883c = null;
    }
}
