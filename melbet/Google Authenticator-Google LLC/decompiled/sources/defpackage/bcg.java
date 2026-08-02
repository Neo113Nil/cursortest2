package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bcg implements bbu {
    protected final boolean a;
    private final Uri b;
    private final ContentResolver c;
    private Object d;

    public bcg(ContentResolver contentResolver, Uri uri, boolean z) {
        this.c = contentResolver;
        this.b = uri;
        this.a = z;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected abstract void c(Object obj);

    @Override // defpackage.bbu
    public final void d() {
        Object obj = this.d;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected final AssetFileDescriptor e(Uri uri) {
        return (this.a && afn.i(uri) && afn.h()) ? afn.g(uri, this.c) : this.c.openAssetFileDescriptor(uri, "r");
    }

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        try {
            Object b = b(this.b, this.c);
            this.d = b;
            bbtVar.b(b);
        } catch (FileNotFoundException e) {
            bbtVar.e(e);
        }
    }

    @Override // defpackage.bbu
    public final int g() {
        return 1;
    }

    @Override // defpackage.bbu
    public final void bo() {
    }
}
