package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class he extends je implements fe {

    /* renamed from: d, reason: collision with root package name */
    public final File f2381d;

    public he(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f2381d = file;
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public final File a() {
        return this.f2381d;
    }
}
