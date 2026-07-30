package y1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* renamed from: y1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5239n implements com.bumptech.glide.load.data.d {

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f41849w = {"_data"};

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41850n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f41851u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f41852v;

    public /* synthetic */ C5239n(int i, Object obj, Object obj2) {
        this.f41850n = i;
        this.f41851u = obj;
        this.f41852v = obj2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f41850n) {
            case 0:
                return File.class;
            default:
                return ((C5221A) this.f41852v).c();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i = this.f41850n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        switch (this.f41850n) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f41850n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        Object wrap;
        switch (this.f41850n) {
            case 0:
                Cursor query = ((Context) this.f41851u).getContentResolver().query((Uri) this.f41852v, f41849w, null, null, null);
                if (query != null) {
                    try {
                        r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(r0)) {
                    cVar.g(new File(r0));
                    return;
                }
                cVar.d(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f41852v)));
                return;
            default:
                C5221A c5221a = (C5221A) this.f41852v;
                byte[] bArr = (byte[]) this.f41851u;
                switch (c5221a.f41813n) {
                    case 1:
                        wrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        wrap = new ByteArrayInputStream(bArr);
                        break;
                }
                cVar.g(wrap);
                return;
        }
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
