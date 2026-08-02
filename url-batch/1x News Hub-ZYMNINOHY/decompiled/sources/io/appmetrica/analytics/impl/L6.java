package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class L6 implements DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final J6 f6259a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f6260b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f6261c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f6262d = new HashSet();

    public L6(J6 j6) {
        this.f6259a = j6;
        this.f6260b = ((K6) j6).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (!AbstractC0709no.a(bool)) {
                if (this.f6260b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.f6260b = Boolean.valueOf(equals);
            ((K6) this.f6259a).f6228a.c(equals).b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.f6260b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f6260b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(String str) {
        boolean z;
        if (!this.f6261c.contains(str)) {
            z = Boolean.TRUE.equals(this.f6260b);
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f6260b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f6262d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(String str, Boolean bool) {
        try {
            if (!AbstractC0709no.a(bool)) {
                if (!this.f6262d.contains(str) && !this.f6261c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f6262d.add(str);
                this.f6261c.remove(str);
            } else {
                this.f6261c.add(str);
                this.f6262d.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
