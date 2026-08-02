package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class E6 implements DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final C6 f10241a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f10242b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f10243c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f10244d = new HashSet();

    public E6(C6 c6) {
        this.f10241a = c6;
        this.f10242b = ((D6) c6).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (!AbstractC0779lo.a(bool)) {
                if (this.f10242b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.f10242b = Boolean.valueOf(equals);
            ((D6) this.f10241a).f10177a.c(equals).b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.f10242b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f10242b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(String str) {
        boolean z;
        if (!this.f10243c.contains(str)) {
            z = Boolean.TRUE.equals(this.f10242b);
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f10242b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f10244d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(String str, Boolean bool) {
        try {
            if (!AbstractC0779lo.a(bool)) {
                if (!this.f10244d.contains(str) && !this.f10243c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f10244d.add(str);
                this.f10243c.remove(str);
            } else {
                this.f10243c.add(str);
                this.f10244d.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
