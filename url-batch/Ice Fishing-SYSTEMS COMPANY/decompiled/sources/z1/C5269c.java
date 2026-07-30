package z1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.j;
import java.io.File;
import java.io.FileNotFoundException;
import s1.h;
import t1.AbstractC5064a;
import y1.C5243r;
import y1.InterfaceC5244s;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5269c implements com.bumptech.glide.load.data.d {

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f42134D = {"_data"};

    /* renamed from: A, reason: collision with root package name */
    public final Class f42135A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f42136B;

    /* renamed from: C, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.d f42137C;

    /* renamed from: n, reason: collision with root package name */
    public final Context f42138n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5244s f42139u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5244s f42140v;

    /* renamed from: w, reason: collision with root package name */
    public final Uri f42141w;

    /* renamed from: x, reason: collision with root package name */
    public final int f42142x;

    /* renamed from: y, reason: collision with root package name */
    public final int f42143y;

    /* renamed from: z, reason: collision with root package name */
    public final h f42144z;

    public C5269c(Context context, InterfaceC5244s interfaceC5244s, InterfaceC5244s interfaceC5244s2, Uri uri, int i, int i4, h hVar, Class cls) {
        this.f42138n = context.getApplicationContext();
        this.f42139u = interfaceC5244s;
        this.f42140v = interfaceC5244s2;
        this.f42141w = uri;
        this.f42142x = i;
        this.f42143y = i4;
        this.f42144z = hVar;
        this.f42135A = cls;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f42135A;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        com.bumptech.glide.load.data.d dVar = this.f42137C;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f42136B = true;
        com.bumptech.glide.load.data.d dVar = this.f42137C;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    public final com.bumptech.glide.load.data.d d() {
        boolean isExternalStorageLegacy;
        C5243r b9;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f42138n;
        h hVar = this.f42144z;
        int i = this.f42143y;
        int i4 = this.f42142x;
        if (!isExternalStorageLegacy) {
            int i9 = Build.VERSION.SDK_INT;
            InterfaceC5244s interfaceC5244s = this.f42140v;
            Uri uri = this.f42141w;
            if (i9 < 30) {
                if (AbstractC5064a.a(uri)) {
                    for (String str : uri.getPathSegments()) {
                        if (str == null || !str.startsWith("picker")) {
                        }
                    }
                }
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(uri);
                }
                b9 = interfaceC5244s.b(uri, i4, i, hVar);
            }
            b9 = interfaceC5244s.b(uri, i4, i, hVar);
            break;
        }
        Uri uri2 = this.f42141w;
        try {
            Cursor query = context.getContentResolver().query(uri2, f42134D, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (TextUtils.isEmpty(string)) {
                            throw new FileNotFoundException("File path was empty in media store for: " + uri2);
                        }
                        File file = new File(string);
                        query.close();
                        b9 = this.f42139u.b(file, i4, i, hVar);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            throw new FileNotFoundException("Failed to media store entry for: " + uri2);
        } catch (Throwable th2) {
            th = th2;
        }
        if (b9 != null) {
            return b9.f41859c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(j jVar, com.bumptech.glide.load.data.c cVar) {
        try {
            com.bumptech.glide.load.data.d d2 = d();
            if (d2 == null) {
                cVar.d(new IllegalArgumentException("Failed to build fetcher for: " + this.f42141w));
            } else {
                this.f42137C = d2;
                if (this.f42136B) {
                    cancel();
                } else {
                    d2.e(jVar, cVar);
                }
            }
        } catch (FileNotFoundException e6) {
            cVar.d(e6);
        }
    }
}
