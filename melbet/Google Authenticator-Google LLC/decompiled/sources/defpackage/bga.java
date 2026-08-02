package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bga implements bbu {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public bga(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.bbu
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        if (query != null) {
            try {
                r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(r0)) {
            bbtVar.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            bbtVar.b(new File(r0));
        }
    }

    @Override // defpackage.bbu
    public final int g() {
        return 1;
    }

    @Override // defpackage.bbu
    public final void bo() {
    }

    @Override // defpackage.bbu
    public final void d() {
    }
}
