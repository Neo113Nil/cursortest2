package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bgu implements bbu {
    private static final String[] a = {"_data"};
    private final Context b;
    private final bge c;
    private final bge d;
    private final Uri e;
    private final int f;
    private final int g;
    private final bbl h;
    private final Class i;
    private volatile boolean j;
    private volatile bbu k;

    public bgu(Context context, bge bgeVar, bge bgeVar2, Uri uri, int i, int i2, bbl bblVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = bgeVar;
        this.d = bgeVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = bblVar;
        this.i = cls;
    }

    @Override // defpackage.bbu
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.bbu
    public final void bo() {
        this.j = true;
        bbu bbuVar = this.k;
        if (bbuVar != null) {
            bbuVar.bo();
        }
    }

    @Override // defpackage.bbu
    public final void d() {
        bbu bbuVar = this.k;
        if (bbuVar != null) {
            bbuVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [bbu] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        boolean isExternalStorageLegacy;
        bvw b;
        Throwable th;
        try {
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            if (!isExternalStorageLegacy) {
                if (Build.VERSION.SDK_INT < 30) {
                    Uri uri = this.e;
                    if (afn.i(uri)) {
                        for (String str : uri.getPathSegments()) {
                            if (str == null || !str.startsWith("picker")) {
                            }
                        }
                    }
                    if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        uri = MediaStore.setRequireOriginal(uri);
                    }
                    b = this.d.b(uri, this.f, this.g, this.h);
                }
                b = this.d.b(this.e, this.f, this.g, this.h);
                break;
            }
            bge bgeVar = this.c;
            Uri uri2 = this.e;
            try {
                Cursor query = this.b.getContentResolver().query(uri2, a, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + String.valueOf(uri2));
                            }
                            File file = new File(string);
                            query.close();
                            b = bgeVar.b(file, this.f, this.g, this.h);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + String.valueOf(uri2));
            } catch (Throwable th3) {
                th = th3;
            }
            ?? r3 = b != null ? b.b : 0;
            if (r3 == 0) {
                bbtVar.e(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = r3;
            if (this.j) {
                bo();
            } else {
                r3.f(azwVar, bbtVar);
            }
        } catch (FileNotFoundException e) {
            bbtVar.e(e);
        }
    }

    @Override // defpackage.bbu
    public final int g() {
        return 1;
    }
}
