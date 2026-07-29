package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.mopub.common.Constants;
import java.util.Locale;

/* compiled from: ImageRequest.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private Context f6167a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f6168b;

    /* renamed from: c, reason: collision with root package name */
    private b f6169c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6170d;
    private Object e;

    /* compiled from: ImageRequest.java */
    public interface b {
        void a(p pVar);
    }

    public static Uri a(String str, int i, int i2) {
        ac.a(str, "userId");
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (max == 0 && max2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        Uri.Builder path = new Uri.Builder().scheme(Constants.HTTPS).authority("graph.facebook.com").path(String.format(Locale.US, "%s/picture", str));
        if (max2 != 0) {
            path.appendQueryParameter("height", String.valueOf(max2));
        }
        if (max != 0) {
            path.appendQueryParameter("width", String.valueOf(max));
        }
        path.appendQueryParameter("migration_overrides", "{october_2012:true}");
        return path.build();
    }

    private o(a aVar) {
        this.f6167a = aVar.f6171a;
        this.f6168b = aVar.f6172b;
        this.f6169c = aVar.f6173c;
        this.f6170d = aVar.f6174d;
        this.e = aVar.e == null ? new Object() : aVar.e;
    }

    public Context a() {
        return this.f6167a;
    }

    public Uri b() {
        return this.f6168b;
    }

    public b c() {
        return this.f6169c;
    }

    public boolean d() {
        return this.f6170d;
    }

    public Object e() {
        return this.e;
    }

    /* compiled from: ImageRequest.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f6171a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f6172b;

        /* renamed from: c, reason: collision with root package name */
        private b f6173c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6174d;
        private Object e;

        public a(Context context, Uri uri) {
            ac.a(uri, "imageUri");
            this.f6171a = context;
            this.f6172b = uri;
        }

        public a a(b bVar) {
            this.f6173c = bVar;
            return this;
        }

        public a a(Object obj) {
            this.e = obj;
            return this;
        }

        public a a(boolean z) {
            this.f6174d = z;
            return this;
        }

        public o a() {
            return new o(this);
        }
    }
}
