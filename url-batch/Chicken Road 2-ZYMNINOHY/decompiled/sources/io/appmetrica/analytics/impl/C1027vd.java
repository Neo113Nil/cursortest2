package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027vd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12887a;

    /* renamed from: b, reason: collision with root package name */
    public final Ka f12888b;

    /* renamed from: c, reason: collision with root package name */
    public final C1075x9 f12889c;

    /* renamed from: d, reason: collision with root package name */
    public final Ae f12890d;

    /* renamed from: e, reason: collision with root package name */
    public final C0883po f12891e;

    /* renamed from: f, reason: collision with root package name */
    public volatile IdentifiersResult f12892f;

    public C1027vd(Context context, Ka ka) {
        this(context, ka, AbstractC1053wd.a(context), new Ae(context), new C0883po());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f12892f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0883po c0883po = this.f12891e;
            String str = identifiersResult.id;
            c0883po.getClass();
            if (C0883po.a(str)) {
                return identifiersResult;
            }
        }
        try {
            C1075x9 c1075x9 = this.f12889c;
            c1075x9.f13020a.lock();
            c1075x9.f13021b.a();
            identifiersResult = this.f12892f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0883po c0883po2 = this.f12891e;
            String str2 = identifiersResult.id;
            c0883po2.getClass();
            if (C0883po.a(str2)) {
                C1075x9 c1075x92 = this.f12889c;
                c1075x92.f13021b.b();
                c1075x92.f13020a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a3 = Ja.a(FileUtils.getFileFromSdkStorage(this.f12890d.f10046a, "uuid.dat"));
        this.f12891e.getClass();
        if (!C0883po.a(a3)) {
            a3 = this.f12890d.a(this.f12888b.a(this.f12887a));
        }
        this.f12891e.getClass();
        if (C0883po.a(a3)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a3, IdentifierStatus.OK, null);
            try {
                this.f12892f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        C1075x9 c1075x922 = this.f12889c;
        c1075x922.f13021b.b();
        c1075x922.f13020a.unlock();
        if (identifiersResult == null) {
        }
    }

    public C1027vd(Context context, Ka ka, C1075x9 c1075x9, Ae ae, C0883po c0883po) {
        this.f12887a = context;
        this.f12888b = ka;
        this.f12889c = c1075x9;
        this.f12890d = ae;
        this.f12891e = c0883po;
        try {
            c1075x9.a();
            ae.a();
            c1075x9.b();
        } catch (Throwable unused) {
            this.f12889c.b();
        }
    }
}
