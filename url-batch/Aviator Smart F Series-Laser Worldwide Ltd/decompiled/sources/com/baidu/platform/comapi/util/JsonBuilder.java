package com.baidu.platform.comapi.util;

import com.baidu.ar.util.SystemInfoUtil;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JsonBuilder {

    /* renamed from: a, reason: collision with root package name */
    private StringBuilder f9810a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private boolean f9811b = false;

    private void a() {
        if (this.f9811b) {
            this.f9810a.append(SystemInfoUtil.COMMA);
        }
    }

    private void b() {
        this.f9811b = true;
    }

    private void c() {
        this.f9811b = false;
    }

    public JsonBuilder arrayValue() {
        a();
        this.f9810a.append("[");
        c();
        return this;
    }

    public JsonBuilder endArrayValue() {
        this.f9810a.append("]");
        b();
        return this;
    }

    public JsonBuilder endObject() {
        this.f9810a.append("}");
        b();
        return this;
    }

    public String getJson() {
        return this.f9810a.toString();
    }

    public JsonBuilder key(String str) {
        a();
        this.f9810a.append(JSONObject.quote(str));
        this.f9810a.append(":");
        c();
        return this;
    }

    public JsonBuilder object() {
        a();
        this.f9810a.append("{");
        c();
        return this;
    }

    public JsonBuilder objectValue(String str) {
        a();
        this.f9810a.append(str);
        b();
        return this;
    }

    public JsonBuilder putObjectValue(String str, String str2) {
        if (str2 != null) {
            key(str).objectValue(str2);
        }
        return this;
    }

    public JsonBuilder putStringValue(String str, String str2) {
        if (str2 != null) {
            key(str).value(str2);
        }
        return this;
    }

    public void reset() {
        this.f9810a.setLength(0);
        this.f9811b = false;
    }

    public String toString() {
        return getJson();
    }

    public JsonBuilder value(boolean z7) {
        a();
        this.f9810a.append(z7);
        b();
        return this;
    }

    public JsonBuilder valueDirect(String str) {
        a();
        this.f9810a.append(str);
        b();
        return this;
    }

    public JsonBuilder value(int i8) {
        a();
        this.f9810a.append(i8);
        b();
        return this;
    }

    public JsonBuilder value(long j8) {
        a();
        this.f9810a.append(j8);
        b();
        return this;
    }

    public JsonBuilder value(double d8) {
        a();
        this.f9810a.append(String.valueOf(d8));
        b();
        return this;
    }

    public JsonBuilder value(String str) {
        a();
        this.f9810a.append(JSONObject.quote(str));
        b();
        return this;
    }

    public JsonBuilder value(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (obj instanceof Byte) {
                return value((int) number.byteValue());
            }
            if (obj instanceof Short) {
                return value((int) number.shortValue());
            }
            if (obj instanceof Integer) {
                return value(number.intValue());
            }
            if (obj instanceof Long) {
                return value(number.longValue());
            }
            if (obj instanceof Float) {
                return value(number.floatValue());
            }
            if (obj instanceof Double) {
                return value(number.doubleValue());
            }
        }
        return value(obj.toString());
    }
}
