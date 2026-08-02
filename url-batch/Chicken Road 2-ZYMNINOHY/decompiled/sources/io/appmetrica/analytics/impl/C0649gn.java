package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649gn {

    /* renamed from: a, reason: collision with root package name */
    public final C1118z0 f11952a;

    /* renamed from: b, reason: collision with root package name */
    public final Ho f11953b;

    /* renamed from: c, reason: collision with root package name */
    public final C0832o f11954c;

    /* renamed from: d, reason: collision with root package name */
    public final Wk f11955d;

    /* renamed from: e, reason: collision with root package name */
    public final E5 f11956e;

    /* renamed from: f, reason: collision with root package name */
    public final C0533ca f11957f;

    public C0649gn(C1118z0 c1118z0, Ho ho, C0832o c0832o, Wk wk, E5 e5, C0533ca c0533ca) {
        this.f11952a = c1118z0;
        this.f11953b = ho;
        this.f11954c = c0832o;
        this.f11955d = wk;
        this.f11956e = e5;
        this.f11957f = c0533ca;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new b0.c(29));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C0649gn(C1118z0 c1118z0, Ho ho) {
        this(c1118z0, ho, C0501b4.l().a(), C0501b4.l().o(), C0501b4.l().h(), C0501b4.l().k());
    }
}
