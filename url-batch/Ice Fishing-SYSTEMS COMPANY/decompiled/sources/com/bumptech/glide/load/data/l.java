package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l implements d {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f23595n;

    /* renamed from: u, reason: collision with root package name */
    public final Uri f23596u;

    /* renamed from: v, reason: collision with root package name */
    public final ContentResolver f23597v;

    /* renamed from: w, reason: collision with root package name */
    public Object f23598w;

    public l(ContentResolver contentResolver, Uri uri, boolean z8) {
        this.f23597v = contentResolver;
        this.f23596u = uri;
        this.f23595n = z8;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f23598w;
        if (obj != null) {
            try {
                d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    public abstract void d(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, c cVar) {
        try {
            Object f6 = f(this.f23597v, this.f23596u);
            this.f23598w = f6;
            cVar.g(f6);
        } catch (FileNotFoundException e6) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e6);
            }
            cVar.d(e6);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}
