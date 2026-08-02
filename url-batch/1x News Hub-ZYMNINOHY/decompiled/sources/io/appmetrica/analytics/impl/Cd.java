package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes.dex */
public final class Cd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5843a;

    /* renamed from: b, reason: collision with root package name */
    public final Ra f5844b;

    /* renamed from: c, reason: collision with root package name */
    public final E9 f5845c;

    /* renamed from: d, reason: collision with root package name */
    public final Ge f5846d;

    /* renamed from: e, reason: collision with root package name */
    public final C0812ro f5847e;
    public volatile IdentifiersResult f;

    public Cd(Context context, Ra ra) {
        this(context, ra, Dd.a(context), new Ge(context), new C0812ro());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0812ro c0812ro = this.f5847e;
            String str = identifiersResult.id;
            c0812ro.getClass();
            if (C0812ro.a(str)) {
                return identifiersResult;
            }
        }
        try {
            E9 e9 = this.f5845c;
            e9.f5956a.lock();
            e9.f5957b.a();
            identifiersResult = this.f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0812ro c0812ro2 = this.f5847e;
            String str2 = identifiersResult.id;
            c0812ro2.getClass();
            if (C0812ro.a(str2)) {
                E9 e92 = this.f5845c;
                e92.f5957b.b();
                e92.f5956a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a3 = Qa.a(FileUtils.getFileFromSdkStorage(this.f5846d.f6040a, "uuid.dat"));
        this.f5847e.getClass();
        if (!C0812ro.a(a3)) {
            a3 = this.f5846d.a(this.f5844b.a(this.f5843a));
        }
        this.f5847e.getClass();
        if (C0812ro.a(a3)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a3, IdentifierStatus.OK, null);
            try {
                this.f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        E9 e922 = this.f5845c;
        e922.f5957b.b();
        e922.f5956a.unlock();
        if (identifiersResult == null) {
        }
    }

    public Cd(Context context, Ra ra, E9 e9, Ge ge, C0812ro c0812ro) {
        this.f5843a = context;
        this.f5844b = ra;
        this.f5845c = e9;
        this.f5846d = ge;
        this.f5847e = c0812ro;
        try {
            e9.a();
            ge.a();
            e9.b();
        } catch (Throwable unused) {
            this.f5845c.b();
        }
    }
}
