package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class me implements yd {

    /* renamed from: d, reason: collision with root package name */
    public boolean f2541d;

    static {
        new AtomicInteger();
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final Object a(xd xdVar) {
        if (this.f2541d) {
            if (xdVar.f2986b.isEmpty()) {
                return xdVar.f2985a.g(xdVar.f2988d);
            }
            throw new androidx.datastore.preferences.protobuf.k("Short circuit would skip transforms.");
        }
        Closeable d10 = hg.d(xdVar);
        try {
            if (!(d10 instanceof fe)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File a9 = ((fe) d10).a();
            if (d10 != null) {
                d10.close();
            }
            return a9;
        } catch (Throwable th) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
