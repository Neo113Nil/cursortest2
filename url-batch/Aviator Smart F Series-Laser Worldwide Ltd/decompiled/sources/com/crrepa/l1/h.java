package com.crrepa.l1;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class h {
    public abstract h a();

    public BigDecimal b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public g j() {
        if (r()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public i k() {
        if (s()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public j l() {
        if (t()) {
            return (j) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public k m() {
        if (u()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number o() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean r() {
        return this instanceof g;
    }

    public boolean s() {
        return this instanceof i;
    }

    public boolean t() {
        return this instanceof j;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            com.crrepa.t1.b bVar = new com.crrepa.t1.b(stringWriter);
            bVar.b(true);
            com.crrepa.n1.l.a(this, bVar);
            return stringWriter.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public boolean u() {
        return this instanceof k;
    }
}
