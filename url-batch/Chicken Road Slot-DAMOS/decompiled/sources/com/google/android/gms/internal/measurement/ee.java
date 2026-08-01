package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ee implements oe {
    @Override // com.google.android.gms.internal.measurement.oe
    public final he a(Uri uri) {
        File b10 = ia.b(uri);
        return new he(new FileInputStream(b10), b10);
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final boolean b(Uri uri) {
        return ia.b(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final OutputStream c(Uri uri) {
        File b10 = ia.b(uri);
        g8.b.t(b10);
        return new ie(new FileOutputStream(b10), b10);
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final void d(Uri uri) {
        File b10 = ia.b(uri);
        if (b10.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (b10.delete()) {
            return;
        }
        if (!b10.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final void e(Uri uri, Uri uri2) {
        File b10 = ia.b(uri);
        File b11 = ia.b(uri2);
        g8.b.t(b11);
        if (!b10.renameTo(b11)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final String f() {
        return "file";
    }

    @Override // com.google.android.gms.internal.measurement.oe
    public final File g(Uri uri) {
        return ia.b(uri);
    }
}
