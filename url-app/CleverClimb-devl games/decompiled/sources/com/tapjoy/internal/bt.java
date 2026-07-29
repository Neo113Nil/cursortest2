package com.tapjoy.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bt implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final Writer f7870a;

    /* renamed from: b, reason: collision with root package name */
    private final List f7871b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f7872c;

    /* renamed from: d, reason: collision with root package name */
    private String f7873d;
    private boolean e;

    public bt(Writer writer) {
        this.f7871b.add(bq.EMPTY_DOCUMENT);
        this.f7873d = ":";
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f7870a = writer;
    }

    public final bt a() {
        return a(bq.EMPTY_ARRAY, "[");
    }

    public final bt b() {
        return a(bq.EMPTY_ARRAY, bq.NONEMPTY_ARRAY, "]");
    }

    public final bt c() {
        return a(bq.EMPTY_OBJECT, "{");
    }

    public final bt d() {
        return a(bq.EMPTY_OBJECT, bq.NONEMPTY_OBJECT, "}");
    }

    private bt a(bq bqVar, String str) {
        a(true);
        this.f7871b.add(bqVar);
        this.f7870a.write(str);
        return this;
    }

    private bt a(bq bqVar, bq bqVar2, String str) {
        bq e = e();
        if (e != bqVar2 && e != bqVar) {
            throw new IllegalStateException("Nesting problem: " + this.f7871b);
        }
        this.f7871b.remove(this.f7871b.size() - 1);
        if (e == bqVar2) {
            g();
        }
        this.f7870a.write(str);
        return this;
    }

    private bq e() {
        return (bq) this.f7871b.get(this.f7871b.size() - 1);
    }

    private void a(bq bqVar) {
        this.f7871b.set(this.f7871b.size() - 1, bqVar);
    }

    public final bt b(String str) {
        if (str == null) {
            return f();
        }
        a(false);
        c(str);
        return this;
    }

    private bt f() {
        a(false);
        this.f7870a.write("null");
        return this;
    }

    public final bt a(long j) {
        a(false);
        this.f7870a.write(Long.toString(j));
        return this;
    }

    public final bt a(Number number) {
        if (number == null) {
            return f();
        }
        String obj = number.toString();
        if (!this.e && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        a(false);
        this.f7870a.append((CharSequence) obj);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7870a.close();
        if (e() != bq.NONEMPTY_DOCUMENT) {
            throw new IOException("Incomplete document");
        }
    }

    private void c(String str) {
        this.f7870a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\b':
                    this.f7870a.write("\\b");
                    continue;
                case '\t':
                    this.f7870a.write("\\t");
                    continue;
                case '\n':
                    this.f7870a.write("\\n");
                    continue;
                case '\f':
                    this.f7870a.write("\\f");
                    continue;
                case '\r':
                    this.f7870a.write("\\r");
                    continue;
                case '\"':
                case '\\':
                    this.f7870a.write(92);
                    break;
                case 8232:
                case 8233:
                    this.f7870a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                    continue;
                default:
                    if (charAt <= 31) {
                        this.f7870a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                        break;
                    }
                    break;
            }
            this.f7870a.write(charAt);
        }
        this.f7870a.write("\"");
    }

    private void g() {
        if (this.f7872c == null) {
            return;
        }
        this.f7870a.write("\n");
        for (int i = 1; i < this.f7871b.size(); i++) {
            this.f7870a.write(this.f7872c);
        }
    }

    private void a(boolean z) {
        switch (e()) {
            case EMPTY_DOCUMENT:
                if (!this.e && !z) {
                    throw new IllegalStateException("JSON must start with an array or an object.");
                }
                a(bq.NONEMPTY_DOCUMENT);
                return;
            case EMPTY_ARRAY:
                a(bq.NONEMPTY_ARRAY);
                g();
                return;
            case NONEMPTY_ARRAY:
                this.f7870a.append(',');
                g();
                return;
            case DANGLING_NAME:
                this.f7870a.append((CharSequence) this.f7873d);
                a(bq.NONEMPTY_OBJECT);
                return;
            case NONEMPTY_DOCUMENT:
                throw new IllegalStateException("JSON must have only one top-level value.");
            default:
                throw new IllegalStateException("Nesting problem: " + this.f7871b);
        }
    }

    public final bt a(Object obj) {
        if (obj == null) {
            return f();
        }
        if (obj instanceof br) {
            if (this.f7871b.size() == this.f7871b.size()) {
                return this;
            }
            throw new IllegalStateException(obj.getClass().getName() + ".writeToJson(JsonWriter) wrote incomplete value");
        }
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            a(false);
            this.f7870a.write(booleanValue ? "true" : "false");
            return this;
        }
        if (obj instanceof Number) {
            if (obj instanceof Long) {
                return a(((Number) obj).longValue());
            }
            if (obj instanceof Double) {
                double doubleValue = ((Number) obj).doubleValue();
                if (!this.e && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
                }
                a(false);
                this.f7870a.append((CharSequence) Double.toString(doubleValue));
                return this;
            }
            return a((Number) obj);
        }
        if (obj instanceof String) {
            return b((String) obj);
        }
        if (obj instanceof bl) {
            return a((bl) obj);
        }
        if (obj instanceof Collection) {
            return a((Collection) obj);
        }
        if (obj instanceof Map) {
            return a((Map) obj);
        }
        if (obj instanceof Date) {
            Date date = (Date) obj;
            if (date == null) {
                return f();
            }
            return b(w.a(date));
        }
        if (obj instanceof Object[]) {
            return a((Object[]) obj);
        }
        throw new IllegalArgumentException("Unknown type: " + obj.getClass().getName());
    }

    private bt a(Object[] objArr) {
        if (objArr == null) {
            return f();
        }
        a();
        for (Object obj : objArr) {
            a(obj);
        }
        b();
        return this;
    }

    public final bt a(bl blVar) {
        a(false);
        blVar.a(this.f7870a);
        return this;
    }

    public final bt a(Collection collection) {
        if (collection == null) {
            return f();
        }
        a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        b();
        return this;
    }

    public final bt a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        bq e = e();
        if (e == bq.NONEMPTY_OBJECT) {
            this.f7870a.write(44);
        } else if (e != bq.EMPTY_OBJECT) {
            throw new IllegalStateException("Nesting problem: " + this.f7871b);
        }
        g();
        a(bq.DANGLING_NAME);
        c(str);
        return this;
    }

    public final bt a(Map map) {
        if (map == null) {
            return f();
        }
        c();
        for (Map.Entry entry : map.entrySet()) {
            a(String.valueOf(entry.getKey()));
            a(entry.getValue());
        }
        d();
        return this;
    }
}
