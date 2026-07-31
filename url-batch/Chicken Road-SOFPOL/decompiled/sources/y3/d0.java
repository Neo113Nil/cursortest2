package y3;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class d0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f8856a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f8857b = new AtomicBoolean(false);

    public d0(File file) {
        this.f8856a = file;
    }

    @Override // y3.a
    public final void close() {
        this.f8857b.set(true);
    }
}
