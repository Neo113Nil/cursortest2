package kotlinx.coroutines.internal;

import v5.k;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f18352a;

    static {
        Object a7;
        try {
            k.a aVar = v5.k.f22832f;
            a7 = v5.k.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            k.a aVar2 = v5.k.f22832f;
            a7 = v5.k.a(v5.l.a(th));
        }
        f18352a = v5.k.d(a7);
    }

    public static final boolean a() {
        return f18352a;
    }
}
