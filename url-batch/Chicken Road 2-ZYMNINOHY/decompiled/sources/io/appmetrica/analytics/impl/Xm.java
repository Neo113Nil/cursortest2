package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Xm extends M2 {
    public Xm(int i4, String str) {
        this(i4, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f10619a;
    }

    public Xm(int i4, String str, PublicLogger publicLogger) {
        super(i4, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i4 = this.f10619a;
            if (length > i4) {
                String substring = str.substring(0, i4);
                this.f10621c.warning("\"%s\" %s size exceeded limit of %d characters", this.f10620b, str, Integer.valueOf(this.f10619a));
                return substring;
            }
        }
        return str;
    }

    public final String a() {
        return this.f10620b;
    }
}
