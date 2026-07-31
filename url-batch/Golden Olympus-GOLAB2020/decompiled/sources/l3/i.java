package l3;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements Closeable, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final int f41352b;

    /* renamed from: c, reason: collision with root package name */
    private final String f41353c;

    /* renamed from: d, reason: collision with root package name */
    private final j f41354d;

    public i(int i4, String message, j jVar) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f41352b = i4;
        this.f41353c = message;
        this.f41354d = jVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j jVar = this.f41354d;
        if (jVar != null) {
            jVar.close();
        }
    }

    public final j m() {
        return this.f41354d;
    }

    public final String n() {
        return this.f41353c;
    }

    public final int o() {
        return this.f41352b;
    }
}
