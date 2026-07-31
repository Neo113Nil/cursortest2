package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes3.dex */
public final class Kd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37885a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2622fb f37886b;

    /* renamed from: c, reason: collision with root package name */
    public final S9 f37887c;

    /* renamed from: d, reason: collision with root package name */
    public final Oe f37888d;

    /* renamed from: e, reason: collision with root package name */
    public final C2817mo f37889e;

    /* renamed from: f, reason: collision with root package name */
    public volatile IdentifiersResult f37890f;

    public Kd(Context context, InterfaceC2622fb interfaceC2622fb) {
        this(context, interfaceC2622fb, Ld.a(context), new Oe(context), new C2817mo());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f37890f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C2817mo c2817mo = this.f37889e;
            String str = identifiersResult.id;
            c2817mo.getClass();
            if (C2817mo.a(str)) {
                return identifiersResult;
            }
        }
        try {
            S9 s9 = this.f37887c;
            s9.f38250a.lock();
            s9.f38251b.a();
            identifiersResult = this.f37890f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C2817mo c2817mo2 = this.f37889e;
            String str2 = identifiersResult.id;
            c2817mo2.getClass();
            if (C2817mo.a(str2)) {
                S9 s92 = this.f37887c;
                s92.f38251b.b();
                s92.f38250a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a4 = AbstractC2595eb.a(FileUtils.getFileFromSdkStorage(this.f37888d.f38078a, "uuid.dat"));
        this.f37889e.getClass();
        if (!C2817mo.a(a4)) {
            a4 = this.f37888d.a(this.f37886b.a(this.f37885a));
        }
        this.f37889e.getClass();
        if (C2817mo.a(a4)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a4, IdentifierStatus.OK, null);
            try {
                this.f37890f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        S9 s922 = this.f37887c;
        s922.f38251b.b();
        s922.f38250a.unlock();
        if (identifiersResult == null) {
        }
    }

    public Kd(Context context, InterfaceC2622fb interfaceC2622fb, S9 s9, Oe oe, C2817mo c2817mo) {
        this.f37885a = context;
        this.f37886b = interfaceC2622fb;
        this.f37887c = s9;
        this.f37888d = oe;
        this.f37889e = c2817mo;
        try {
            s9.a();
            oe.a();
            s9.b();
        } catch (Throwable unused) {
            this.f37887c.b();
        }
    }
}
