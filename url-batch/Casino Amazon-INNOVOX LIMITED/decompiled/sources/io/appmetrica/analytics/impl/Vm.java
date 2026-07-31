package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class Vm extends N2 {
    public Vm(int i, String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f962a;
    }

    public Vm(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.Mn
    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(CharEncoding.UTF_8);
            int length = bytes.length;
            int i = this.f962a;
            if (length <= i) {
                return str;
            }
            String str2 = new String(bytes, 0, i, CharEncoding.UTF_8);
            try {
                this.c.warning("\"%s\" %s exceeded limit of %d bytes", this.b, str, Integer.valueOf(this.f962a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
