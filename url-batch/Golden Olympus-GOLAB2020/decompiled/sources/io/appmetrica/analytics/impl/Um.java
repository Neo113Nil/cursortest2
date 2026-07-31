package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class Um extends Z2 {
    public Um(int i4, @NonNull String str) {
        this(i4, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f38595a;
    }

    public Um(int i4, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i4, str, publicLogger);
    }

    @NonNull
    public final String a() {
        return this.f38596b;
    }

    @Override // io.appmetrica.analytics.impl.In
    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i4 = this.f38595a;
            if (length <= i4) {
                return str;
            }
            String str2 = new String(bytes, 0, i4, "UTF-8");
            try {
                this.f38597c.warning("\"%s\" %s exceeded limit of %d bytes", this.f38596b, str, Integer.valueOf(this.f38595a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
