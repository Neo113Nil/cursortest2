package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class Um extends M2 {
    public Um(int i4, String str) {
        this(i4, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f10619a;
    }

    public Um(int i4, String str, PublicLogger publicLogger) {
        super(i4, str, publicLogger);
    }

    public final String a() {
        return this.f10620b;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(CharEncoding.UTF_8);
            int length = bytes.length;
            int i4 = this.f10619a;
            if (length <= i4) {
                return str;
            }
            String str2 = new String(bytes, 0, i4, CharEncoding.UTF_8);
            try {
                this.f10621c.warning("\"%s\" %s exceeded limit of %d bytes", this.f10620b, str, Integer.valueOf(this.f10619a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
