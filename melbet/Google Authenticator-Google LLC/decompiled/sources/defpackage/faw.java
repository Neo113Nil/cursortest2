package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faw implements fbs {
    public final fbc a;

    public faw() {
        this(new fbc());
    }

    @Override // defpackage.fbs
    public final fbc a() {
        return this.a;
    }

    @Override // defpackage.fbs
    public final File b(Uri uri) {
        return exf.h(uri);
    }

    @Override // defpackage.fbs
    public final InputStream c(Uri uri) {
        File h = exf.h(uri);
        return new fbh(new FileInputStream(h), h);
    }

    @Override // defpackage.fbs
    public final OutputStream d(Uri uri) {
        File h = exf.h(uri);
        hqc.a(h);
        return new fbi(new FileOutputStream(h), h);
    }

    @Override // defpackage.fbs
    public final String e() {
        return "file";
    }

    @Override // defpackage.fbs
    public final void f(Uri uri) {
        File h = exf.h(uri);
        if (h.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (h.delete()) {
            return;
        }
        if (!h.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.fbs
    public final void g(Uri uri, Uri uri2) {
        File h = exf.h(uri);
        File h2 = exf.h(uri2);
        hqc.a(h2);
        if (!h.renameTo(h2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.fbs
    public final boolean h(Uri uri) {
        return exf.h(uri).exists();
    }

    public faw(fbc fbcVar) {
        this.a = fbcVar;
    }
}
