package kotlinx.coroutines;

import y5.g;

/* loaded from: classes.dex */
public interface CoroutineExceptionHandler extends g.b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f18312b = a.f18313f;

    public static final class a implements g.c<CoroutineExceptionHandler> {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ a f18313f = new a();

        private a() {
        }
    }

    void handleException(g gVar, Throwable th);
}
