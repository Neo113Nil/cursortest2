package com.baidu.ar.arrender;

import com.baidu.ar.u;

/* loaded from: classes.dex */
public class c extends u {

    /* renamed from: f, reason: collision with root package name */
    public String f1746f;

    /* renamed from: g, reason: collision with root package name */
    public String f1747g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1748h;

    /* renamed from: i, reason: collision with root package name */
    public a f1749i;

    public enum a {
        INT,
        FLOAT,
        FLOAT_ARRAY,
        STRING
    }

    public void a(Object obj) {
        this.f1748h = obj;
        b(obj);
    }

    public final void b(Object obj) {
        a aVar;
        if ((obj instanceof Float) || (obj instanceof Double)) {
            aVar = a.FLOAT;
        } else if (obj instanceof String) {
            aVar = a.STRING;
        } else if (obj instanceof Integer) {
            aVar = a.INT;
        } else if (!(obj instanceof float[])) {
            return;
        } else {
            aVar = a.FLOAT_ARRAY;
        }
        this.f1749i = aVar;
    }

    public void c(String str) {
        this.f1746f = str;
    }

    public String f() {
        return this.f1747g;
    }

    public Object g() {
        return this.f1748h;
    }

    public a h() {
        return this.f1749i;
    }

    public String i() {
        return this.f1746f;
    }

    public void b(String str) {
        this.f1747g = str;
    }
}
