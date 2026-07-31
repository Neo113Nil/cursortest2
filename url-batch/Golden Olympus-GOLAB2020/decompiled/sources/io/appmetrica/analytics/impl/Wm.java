package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Wm extends Z2 {
    public Wm(int i4, @NonNull String str) {
        this(i4, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f38595a;
    }

    public Wm(int i4, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i4, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.In
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i4 = this.f38595a;
            if (length > i4) {
                String substring = str.substring(0, i4);
                this.f38597c.warning("\"%s\" %s size exceeded limit of %d characters", this.f38596b, str, Integer.valueOf(this.f38595a));
                return substring;
            }
        }
        return str;
    }

    @NonNull
    public final String a() {
        return this.f38596b;
    }
}
