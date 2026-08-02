package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcc extends bcg {
    @Override // defpackage.bbu
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.bcg
    protected final /* bridge */ /* synthetic */ Object b(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor e = e(uri);
        if (e != null) {
            return e.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.bcg
    protected final /* synthetic */ void c(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
