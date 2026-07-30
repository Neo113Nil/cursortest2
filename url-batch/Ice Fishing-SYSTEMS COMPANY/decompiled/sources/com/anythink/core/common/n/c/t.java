package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    static final long f16078a = 65536;

    /* renamed from: b, reason: collision with root package name */
    static s f16079b;

    /* renamed from: c, reason: collision with root package name */
    static long f16080c;

    private t() {
    }

    public static s a() {
        synchronized (t.class) {
            s sVar = f16079b;
            if (sVar == null) {
                return new s();
            }
            f16079b = sVar.f16077h;
            sVar.f16077h = null;
            f16080c -= 8192;
            return sVar;
        }
    }

    public static void a(s sVar) {
        if (sVar.f16077h == null && sVar.i == null) {
            if (sVar.f16075f) {
                return;
            }
            synchronized (t.class) {
                try {
                    long j9 = f16080c;
                    if (j9 + 8192 > f16078a) {
                        return;
                    }
                    f16080c = j9 + 8192;
                    sVar.f16077h = f16079b;
                    sVar.f16074e = 0;
                    sVar.f16073d = 0;
                    f16079b = sVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
