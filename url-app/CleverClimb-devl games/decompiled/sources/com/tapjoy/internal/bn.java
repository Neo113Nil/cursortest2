package com.tapjoy.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class bn implements bk, bp {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f7854a;

    public static bn a(InputStream inputStream) {
        return a.a().a(inputStream);
    }

    public static bn b(String str) {
        return a.a().a(str);
    }

    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private static a f7856a;

        public static a a() {
            a aVar = f7856a;
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = bo.f7857a;
            f7856a = aVar2;
            return aVar2;
        }

        public final bn a(InputStream inputStream) {
            return a(new InputStreamReader(inputStream, jn.f8472c));
        }

        public bn a(Reader reader) {
            return a(jz.a(reader));
        }

        public bn a(String str) {
            return a(new ByteArrayInputStream(str.getBytes(jn.f8472c.name())));
        }
    }

    @Override // com.tapjoy.internal.bk
    public final Object a(String str) {
        if (this.f7854a != null) {
            return this.f7854a.get(str);
        }
        return null;
    }

    @Override // com.tapjoy.internal.bk
    public final void a(String str, Object obj) {
        if (this.f7854a == null) {
            this.f7854a = new HashMap();
        }
        this.f7854a.put(str, obj);
    }

    public final boolean a() {
        return k() == bs.BEGIN_OBJECT;
    }

    private boolean t() {
        if (k() != bs.NULL) {
            return false;
        }
        o();
        return true;
    }

    public final String b() {
        if (t()) {
            return null;
        }
        return m();
    }

    public final String c(String str) {
        return t() ? str : m();
    }

    private Object u() {
        bs k = k();
        switch (k) {
            case BEGIN_ARRAY:
                return c();
            case BEGIN_OBJECT:
                return d();
            case NULL:
                o();
                return null;
            case BOOLEAN:
                return Boolean.valueOf(n());
            case NUMBER:
                return new ci(m());
            case STRING:
                return m();
            default:
                throw new IllegalStateException("Expected a value but was " + k);
        }
    }

    public final List c() {
        LinkedList linkedList = new LinkedList();
        a(linkedList);
        return linkedList;
    }

    private void a(List list) {
        f();
        while (j()) {
            list.add(u());
        }
        g();
    }

    public final Map d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap);
        return linkedHashMap;
    }

    public final void a(Map map) {
        h();
        while (j()) {
            map.put(l(), u());
        }
        i();
    }

    @Nullable
    public final Object a(bi biVar) {
        if (t()) {
            return null;
        }
        return biVar.a(this);
    }

    public final void a(List list, bi biVar) {
        f();
        while (j()) {
            list.add(biVar.a(this));
        }
        g();
    }

    private static URI d(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new bv(e);
        }
    }

    public final URL e() {
        URI uri = (URI) a("BASE_URI");
        if (uri != null) {
            return uri.resolve(d(m())).toURL();
        }
        return new URL(m());
    }
}
