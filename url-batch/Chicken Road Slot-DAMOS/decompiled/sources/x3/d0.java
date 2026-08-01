package x3;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f10347a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10348b = new AtomicBoolean(false);

    public d0(File file) {
        this.f10347a = file;
    }

    @Override // x3.a
    public final void close() {
        this.f10348b.set(true);
    }
}
