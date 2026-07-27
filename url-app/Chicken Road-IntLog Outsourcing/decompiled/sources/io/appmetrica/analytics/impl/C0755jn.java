package io.appmetrica.analytics.impl;

import E.C0028c;
import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.jn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755jn {

    /* renamed from: a, reason: collision with root package name */
    public final C1095x0 f8584a;

    /* renamed from: b, reason: collision with root package name */
    public final Io f8585b;

    /* renamed from: c, reason: collision with root package name */
    public final C0861o f8586c;

    /* renamed from: d, reason: collision with root package name */
    public final C0547bl f8587d;

    /* renamed from: e, reason: collision with root package name */
    public final L5 f8588e;

    /* renamed from: f, reason: collision with root package name */
    public final C0742ja f8589f;

    public C0755jn(C1095x0 c1095x0, Io io2, C0861o c0861o, C0547bl c0547bl, L5 l52, C0742ja c0742ja) {
        this.f8584a = c1095x0;
        this.f8585b = io2;
        this.f8586c = c0861o;
        this.f8587d = c0547bl;
        this.f8588e = l52;
        this.f8589f = c0742ja;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new C0028c(29));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C0755jn(C1095x0 c1095x0, Io io2) {
        this(c1095x0, io2, C0736j4.l().a(), C0736j4.l().o(), C0736j4.l().h(), C0736j4.l().k());
    }
}
