package com.baidu.platform.comapi.h.h.f;

import com.baidu.ar.util.SystemInfoUtil;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private StringBuilder f9114a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private boolean f9115b = false;

    private void b() {
        this.f9115b = true;
    }

    private void c() {
        this.f9115b = false;
    }

    public a a(String str) {
        a();
        this.f9114a.append(JSONObject.quote(str));
        this.f9114a.append(":");
        c();
        return this;
    }

    public a d() {
        this.f9114a.append("}");
        b();
        return this;
    }

    public String e() {
        return this.f9114a.toString();
    }

    public a f() {
        a();
        this.f9114a.append("{");
        c();
        return this;
    }

    public String toString() {
        return e();
    }

    public a b(String str) {
        a();
        this.f9114a.append(JSONObject.quote(str));
        b();
        return this;
    }

    public a a(boolean z7) {
        a();
        this.f9114a.append(z7);
        b();
        return this;
    }

    public a a(int i8) {
        a();
        this.f9114a.append(i8);
        b();
        return this;
    }

    public a a(long j8) {
        a();
        this.f9114a.append(j8);
        b();
        return this;
    }

    public a a(double d8) {
        a();
        this.f9114a.append(String.format("%f", Double.valueOf(d8)));
        b();
        return this;
    }

    public a a(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (obj instanceof Byte) {
                return a((int) number.byteValue());
            }
            if (obj instanceof Short) {
                return a((int) number.shortValue());
            }
            if (obj instanceof Integer) {
                return a(number.intValue());
            }
            if (obj instanceof Long) {
                return a(number.longValue());
            }
            if (obj instanceof Float) {
                return a(number.floatValue());
            }
            if (obj instanceof Double) {
                return a(number.doubleValue());
            }
        }
        return b(obj.toString());
    }

    private void a() {
        if (this.f9115b) {
            this.f9114a.append(SystemInfoUtil.COMMA);
        }
    }
}
