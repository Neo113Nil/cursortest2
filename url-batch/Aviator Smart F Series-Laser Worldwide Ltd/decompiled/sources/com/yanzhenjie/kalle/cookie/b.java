package com.yanzhenjie.kalle.cookie;

import java.net.HttpCookie;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public interface b {
    public static final b DEFAULT = new a();

    static class a implements b {
        a() {
        }

        @Override // com.yanzhenjie.kalle.cookie.b
        public void add(URI uri, HttpCookie httpCookie) {
        }

        @Override // com.yanzhenjie.kalle.cookie.b
        public void clear() {
        }

        @Override // com.yanzhenjie.kalle.cookie.b
        public List<HttpCookie> get(URI uri) {
            return Collections.emptyList();
        }

        @Override // com.yanzhenjie.kalle.cookie.b
        public void remove(HttpCookie httpCookie) {
        }
    }

    void add(URI uri, HttpCookie httpCookie);

    void clear();

    List<HttpCookie> get(URI uri);

    void remove(HttpCookie httpCookie);
}
