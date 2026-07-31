package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class w93 {

    /* renamed from: b, reason: collision with root package name */
    static final w93 f13774b = new w93(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    final Throwable f13775a;

    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    w93(Throwable th) {
        Objects.requireNonNull(th);
        this.f13775a = th;
    }
}
