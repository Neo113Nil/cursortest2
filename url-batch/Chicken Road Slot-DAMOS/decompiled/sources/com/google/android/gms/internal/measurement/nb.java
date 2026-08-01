package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class nb implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final Inflater f2576d = new Inflater(true);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2576d.end();
    }
}
