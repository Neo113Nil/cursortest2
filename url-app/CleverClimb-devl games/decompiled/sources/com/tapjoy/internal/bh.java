package com.tapjoy.internal;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bh implements bl {

    /* renamed from: a, reason: collision with root package name */
    private final StringWriter f7848a = new StringWriter();

    /* renamed from: b, reason: collision with root package name */
    private final bt f7849b = new bt(this.f7848a);

    public final String toString() {
        try {
            this.f7849b.f7870a.flush();
            return this.f7848a.toString();
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    @Override // com.tapjoy.internal.bl
    public final void a(Writer writer) {
        try {
            this.f7849b.f7870a.flush();
            writer.write(this.f7848a.toString());
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh a() {
        try {
            this.f7849b.a();
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh b() {
        try {
            this.f7849b.b();
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh c() {
        try {
            this.f7849b.c();
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh d() {
        try {
            this.f7849b.d();
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh a(String str) {
        try {
            this.f7849b.a(str);
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh a(bl blVar) {
        try {
            this.f7849b.a(blVar);
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh b(String str) {
        try {
            this.f7849b.b(str);
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh a(long j) {
        try {
            this.f7849b.a(j);
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh a(Number number) {
        try {
            this.f7849b.a(number);
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    private bh b(Object obj) {
        try {
            this.f7849b.a(obj);
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh a(Collection collection) {
        try {
            this.f7849b.a(collection);
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public final bh a(Map map) {
        try {
            this.f7849b.a(map);
            return this;
        } catch (IOException e) {
            throw js.a(e);
        }
    }

    public static String a(Object obj) {
        return new bh().b(obj).toString();
    }
}
