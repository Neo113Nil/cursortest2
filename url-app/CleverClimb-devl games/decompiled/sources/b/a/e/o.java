package b.a.e;

import java.io.IOException;

/* compiled from: StreamResetException.java */
/* loaded from: classes.dex */
public final class o extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final b f1996a;

    public o(b bVar) {
        super("stream was reset: " + bVar);
        this.f1996a = bVar;
    }
}
