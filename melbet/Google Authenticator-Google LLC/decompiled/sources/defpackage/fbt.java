package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class fbt implements fbs {
    @Override // defpackage.fbs
    public final fbc a() {
        return ((faw) j()).a;
    }

    @Override // defpackage.fbs
    public /* synthetic */ File b(Uri uri) {
        throw null;
    }

    @Override // defpackage.fbs
    public InputStream c(Uri uri) {
        throw null;
    }

    @Override // defpackage.fbs
    public final OutputStream d(Uri uri) {
        return j().d(i(uri));
    }

    @Override // defpackage.fbs
    public final void f(Uri uri) {
        j().f(i(uri));
    }

    @Override // defpackage.fbs
    public final void g(Uri uri, Uri uri2) {
        j().g(i(uri), i(uri2));
    }

    @Override // defpackage.fbs
    public boolean h(Uri uri) {
        throw null;
    }

    protected Uri i(Uri uri) {
        throw null;
    }

    protected abstract fbs j();
}
