package n3;

import android.net.Uri;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5359a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5360b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5361c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5362d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5363e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5364f;

    public h(Uri uri, int i, int i8, boolean z3, int i9) {
        uri.getClass();
        this.f5359a = uri;
        this.f5360b = i;
        this.f5361c = i8;
        this.f5362d = z3;
        this.f5363e = null;
        this.f5364f = i9;
    }

    public h(String str, String str2) {
        this.f5359a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f5360b = 0;
        this.f5361c = 400;
        this.f5362d = false;
        this.f5363e = str2;
        this.f5364f = 0;
    }
}
