package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes2.dex */
public abstract class j {
    public boolean i() {
        return this instanceof g;
    }

    public boolean j() {
        return this instanceof m;
    }

    public boolean k() {
        return this instanceof o;
    }

    public boolean l() {
        return this instanceof l;
    }

    public m m() {
        if (j()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public g n() {
        if (i()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public o o() {
        if (k()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    Boolean p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            com.google.gson.c.c cVar = new com.google.gson.c.c(stringWriter);
            cVar.b(true);
            com.google.gson.internal.j.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
