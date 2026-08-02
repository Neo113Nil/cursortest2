package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.jn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604jn {

    /* renamed from: a, reason: collision with root package name */
    public final C0944x0 f7685a;

    /* renamed from: b, reason: collision with root package name */
    public final Io f7686b;

    /* renamed from: c, reason: collision with root package name */
    public final C0710o f7687c;

    /* renamed from: d, reason: collision with root package name */
    public final C0396bl f7688d;

    /* renamed from: e, reason: collision with root package name */
    public final L5 f7689e;
    public final C0591ja f;

    public C0604jn(C0944x0 c0944x0, Io io2, C0710o c0710o, C0396bl c0396bl, L5 l5, C0591ja c0591ja) {
        this.f7685a = c0944x0;
        this.f7686b = io2;
        this.f7687c = c0710o;
        this.f7688d = c0396bl;
        this.f7689e = l5;
        this.f = c0591ja;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new Y1.M(19));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C0604jn(C0944x0 c0944x0, Io io2) {
        this(c0944x0, io2, C0585j4.l().a(), C0585j4.l().o(), C0585j4.l().h(), C0585j4.l().k());
    }
}
