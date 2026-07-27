package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes.dex */
public final class Cd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6625a;

    /* renamed from: b, reason: collision with root package name */
    public final Ra f6626b;

    /* renamed from: c, reason: collision with root package name */
    public final E9 f6627c;

    /* renamed from: d, reason: collision with root package name */
    public final Ge f6628d;

    /* renamed from: e, reason: collision with root package name */
    public final C0963ro f6629e;

    /* renamed from: f, reason: collision with root package name */
    public volatile IdentifiersResult f6630f;

    public Cd(Context context, Ra ra) {
        this(context, ra, Dd.a(context), new Ge(context), new C0963ro());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f6630f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0963ro c0963ro = this.f6629e;
            String str = identifiersResult.id;
            c0963ro.getClass();
            if (C0963ro.a(str)) {
                return identifiersResult;
            }
        }
        try {
            E9 e9 = this.f6627c;
            e9.f6745a.lock();
            e9.f6746b.a();
            identifiersResult = this.f6630f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0963ro c0963ro2 = this.f6629e;
            String str2 = identifiersResult.id;
            c0963ro2.getClass();
            if (C0963ro.a(str2)) {
                E9 e92 = this.f6627c;
                e92.f6746b.b();
                e92.f6745a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a6 = Qa.a(FileUtils.getFileFromSdkStorage(this.f6628d.f6833a, "uuid.dat"));
        this.f6629e.getClass();
        if (!C0963ro.a(a6)) {
            a6 = this.f6628d.a(this.f6626b.a(this.f6625a));
        }
        this.f6629e.getClass();
        if (C0963ro.a(a6)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a6, IdentifierStatus.OK, null);
            try {
                this.f6630f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        E9 e922 = this.f6627c;
        e922.f6746b.b();
        e922.f6745a.unlock();
        if (identifiersResult == null) {
        }
    }

    public Cd(Context context, Ra ra, E9 e9, Ge ge, C0963ro c0963ro) {
        this.f6625a = context;
        this.f6626b = ra;
        this.f6627c = e9;
        this.f6628d = ge;
        this.f6629e = c0963ro;
        try {
            e9.a();
            ge.a();
            e9.b();
        } catch (Throwable unused) {
            this.f6627c.b();
        }
    }
}
