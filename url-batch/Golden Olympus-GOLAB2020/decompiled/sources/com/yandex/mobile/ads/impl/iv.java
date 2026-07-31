package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface iv extends fv {

    public interface a {
        iv a();
    }

    long a(mv mvVar);

    void a(s62 s62Var);

    void close();

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();
}
