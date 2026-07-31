package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class Z6 implements DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final X6 f38599a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f38600b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f38601c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f38602d = new HashSet();

    public Z6(@NonNull X6 x6) {
        this.f38599a = x6;
        this.f38600b = ((Y6) x6).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (!AbstractC2713io.a(bool)) {
                if (this.f38600b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.f38600b = Boolean.valueOf(equals);
            ((Y6) this.f38599a).f38551a.c(equals).b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.f38600b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f38600b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f38602d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(@NonNull String str, Boolean bool) {
        try {
            if (!AbstractC2713io.a(bool)) {
                if (!this.f38602d.contains(str) && !this.f38601c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f38602d.add(str);
                this.f38601c.remove(str);
            } else {
                this.f38601c.add(str);
                this.f38602d.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
