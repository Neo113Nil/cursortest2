package defpackage;

import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvh {
    private final Object a;
    private volatile Object b;
    private final Object c;

    public hvh(Class cls) {
        this.c = new hak();
        this.a = cls.getName();
    }

    public static jzt b(jzw jzwVar) {
        Object obj = jzwVar.c;
        return (jzt) (jzt.class.isInstance(obj) ? jzt.class.cast(obj) : null);
    }

    public final Logger a() {
        Object obj = this.b;
        if (obj != null) {
            return (Logger) obj;
        }
        synchronized (this.c) {
            Object obj2 = this.b;
            if (obj2 != null) {
                return (Logger) obj2;
            }
            Logger logger = Logger.getLogger((String) this.a);
            this.b = logger;
            return logger;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jzt] */
    public final InputStream c() {
        return this.c.a(this.a);
    }

    public final byte[] d() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = kaa.l(c());
                }
            }
        }
        return (byte[]) this.b;
    }

    public hvh(jzt jztVar, Object obj) {
        this.c = jztVar;
        this.a = obj;
    }
}
