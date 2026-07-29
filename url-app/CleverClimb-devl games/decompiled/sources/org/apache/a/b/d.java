package org.apache.a.b;

import java.io.IOException;

/* compiled from: ClientProtocolException.java */
/* loaded from: classes2.dex */
public class d extends IOException {
    public d() {
    }

    public d(String str) {
        super(str);
    }

    public d(Throwable th) {
        initCause(th);
    }
}
