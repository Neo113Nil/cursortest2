package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ie extends ke implements fe {

    /* renamed from: d, reason: collision with root package name */
    public final FileOutputStream f2408d;

    /* renamed from: e, reason: collision with root package name */
    public final File f2409e;

    public ie(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f2408d = fileOutputStream;
        this.f2409e = file;
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public final File a() {
        return this.f2409e;
    }
}
