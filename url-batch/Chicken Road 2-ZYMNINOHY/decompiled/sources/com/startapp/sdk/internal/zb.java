package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zb {

    /* renamed from: d, reason: collision with root package name */
    public static final zb f8031d = new zb();

    /* renamed from: a, reason: collision with root package name */
    public final String f8032a;

    /* renamed from: b, reason: collision with root package name */
    public final xb f8033b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8034c;

    public zb(Locale primary, LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.i.e(primary, "primary");
        this.f8032a = primary.toString();
        this.f8033b = new xb(linkedHashSet);
        this.f8034c = yb.a(primary, linkedHashSet, ',');
    }

    public zb() {
        this.f8032a = null;
        this.f8033b = null;
        this.f8034c = null;
    }
}
