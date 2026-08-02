package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxs implements fbs {
    public final hac a;
    private final fbc b;

    public cxs(Context context) {
        fbc fbcVar = new fbc();
        this.a = new haf(new ddw(context.getApplicationContext(), (byte[]) null));
        this.b = fbcVar;
    }

    private final ParcelFileDescriptor i(Uri uri, int i) {
        return (ParcelFileDescriptor) j("open file", new ghl(this, uri, i, 1));
    }

    private static final Object j(String str, Callable callable) {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof cmm) {
                cmm cmmVar = (cmm) cause;
                String str2 = cmmVar.a.g;
                if (cmmVar.a() == 33500) {
                    throw new FileNotFoundException("Unable to " + str + " because " + str2);
                }
                if (cmmVar.a() == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    throw new FileNotFoundException("Unable to " + str + " because " + str2);
                }
            }
            throw new IOException("Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException("Unable to ".concat(str), e3);
        }
    }

    @Override // defpackage.fbs
    public final fbc a() {
        return this.b;
    }

    @Override // defpackage.fbs
    public final /* synthetic */ File b(Uri uri) {
        throw new fbg("Cannot convert uri to file android ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.fbs
    public final InputStream c(Uri uri) {
        return new cxq(i(uri, 0));
    }

    @Override // defpackage.fbs
    public final OutputStream d(Uri uri) {
        return new cxr(i(uri, 1));
    }

    @Override // defpackage.fbs
    public final String e() {
        return "android";
    }

    @Override // defpackage.fbs
    public final void f(Uri uri) {
        j("delete file", new bsp(this, uri, 7, null));
    }

    @Override // defpackage.fbs
    public final void g(Uri uri, Uri uri2) {
        j("rename file", new bqi(this, uri, uri2, 2));
    }

    @Override // defpackage.fbs
    public final boolean h(Uri uri) {
        try {
            ParcelFileDescriptor i = i(uri, 0);
            if (i == null) {
                return true;
            }
            i.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }
}
