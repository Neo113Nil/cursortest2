package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cen {
    public Integer a;
    public Map b;
    public Integer c;
    public String d;
    public byte[] e;
    public byte[] f;
    public List g;
    public String h;
    private String i;
    private cem j;
    private long k;
    private long l;
    private byte m;

    public final ceo a() {
        String str;
        cem cemVar;
        Map map;
        if (this.m == 3 && (str = this.i) != null && (cemVar = this.j) != null && (map = this.b) != null) {
            return new ceo(str, this.a, cemVar, this.k, this.l, map, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == null) {
            sb.append(" transportName");
        }
        if (this.j == null) {
            sb.append(" encodedPayload");
        }
        if ((this.m & 1) == 0) {
            sb.append(" eventMillis");
        }
        if ((this.m & 2) == 0) {
            sb.append(" uptimeMillis");
        }
        if (this.b == null) {
            sb.append(" autoMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final Map b() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public final void c(String str, int i) {
        b().put(str, String.valueOf(i));
    }

    public final void d(String str, String str2) {
        b().put(str, str2);
    }

    public final void e(cem cemVar) {
        if (cemVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.j = cemVar;
    }

    public final void f(long j) {
        this.k = j;
        this.m = (byte) (this.m | 1);
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        this.i = str;
    }

    public final void h(long j) {
        this.l = j;
        this.m = (byte) (this.m | 2);
    }
}
