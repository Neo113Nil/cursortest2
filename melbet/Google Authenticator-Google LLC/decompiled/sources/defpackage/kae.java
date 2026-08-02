package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kae {
    public final kad a;
    public final String b;
    public final String c;
    public final kac d;
    public final kac e;
    public final boolean f;

    public kae(kad kadVar, String str, kac kacVar, kac kacVar2, boolean z) {
        new AtomicReferenceArray(2);
        kadVar.getClass();
        this.a = kadVar;
        str.getClass();
        this.b = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        kacVar.getClass();
        this.d = kacVar;
        kacVar2.getClass();
        this.e = kacVar2;
        this.f = z;
    }

    public static String b(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public static kab c() {
        kab kabVar = new kab();
        kabVar.a = null;
        kabVar.b = null;
        return kabVar;
    }

    public final InputStream a(Object obj) {
        return this.d.a(obj);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("fullMethodName", this.b);
        T.b("type", this.a);
        T.g("idempotent", false);
        T.g("safe", false);
        T.g("sampledToLocalTracing", this.f);
        T.b("requestMarshaller", this.d);
        T.b("responseMarshaller", this.e);
        T.b("schemaDescriptor", null);
        T.d();
        return T.toString();
    }
}
