package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class gse implements guq {
    private final guq a;
    private final UUID b;
    private final String c;
    private final String d;
    private Thread e;
    private hrz f;

    public gse(String str, guq guqVar, gun gunVar) {
        str.getClass();
        this.d = str;
        this.a = guqVar;
        this.b = guqVar.f();
        this.c = guqVar.d();
        hrz hrzVar = gunVar.f;
        if (hrzVar == null) {
            this.f = null;
            this.e = Thread.currentThread();
        } else {
            this.f = hrzVar;
            this.e = null;
        }
        if (this.f == guqVar.g()) {
            guqVar.e();
        }
    }

    public static String bK(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.guq
    public final guq a() {
        return this.a;
    }

    @Override // defpackage.guq
    public final String c() {
        return this.d;
    }

    @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        gta.n(this);
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.guq
    public final String d() {
        return this.c;
    }

    @Override // defpackage.guq
    public Thread e() {
        return this.e;
    }

    @Override // defpackage.guq
    public final UUID f() {
        return this.b;
    }

    @Override // defpackage.guq
    public hrz g() {
        return this.f;
    }

    public final String toString() {
        return gta.m(this);
    }

    public gse(String str, UUID uuid, String str2, gun gunVar) {
        str.getClass();
        this.d = str;
        Thread thread = null;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        hrz hrzVar = gunVar.f;
        if (hrzVar == null) {
            this.f = null;
            thread = Thread.currentThread();
        } else {
            this.f = hrzVar;
        }
        this.e = thread;
    }
}
