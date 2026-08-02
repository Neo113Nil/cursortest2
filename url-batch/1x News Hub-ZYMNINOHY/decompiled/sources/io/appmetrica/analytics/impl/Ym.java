package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class Ym extends U2 {
    public Ym(int i3, String str) {
        this(i3, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f6744a;
    }

    public Ym(int i3, String str, PublicLogger publicLogger) {
        super(i3, str, publicLogger);
    }

    public final String a() {
        return this.f6745b;
    }

    @Override // io.appmetrica.analytics.impl.Nn
    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(CharEncoding.UTF_8);
            int length = bytes.length;
            int i3 = this.f6744a;
            if (length <= i3) {
                return str;
            }
            String str2 = new String(bytes, 0, i3, CharEncoding.UTF_8);
            try {
                this.f6746c.warning("\"%s\" %s exceeded limit of %d bytes", this.f6745b, str, Integer.valueOf(this.f6744a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
