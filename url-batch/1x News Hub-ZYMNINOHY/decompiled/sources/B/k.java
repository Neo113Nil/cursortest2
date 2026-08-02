package B;

import android.net.Uri;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f103a;

    /* renamed from: b, reason: collision with root package name */
    public final int f104b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f106d;

    /* renamed from: e, reason: collision with root package name */
    public final String f107e;
    public final int f;

    public k(Uri uri, int i3, int i4, boolean z, int i5) {
        uri.getClass();
        this.f103a = uri;
        this.f104b = i3;
        this.f105c = i4;
        this.f106d = z;
        this.f107e = null;
        this.f = i5;
    }

    public k(String str, String str2) {
        this.f103a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f104b = 0;
        this.f105c = 400;
        this.f106d = false;
        this.f107e = str2;
        this.f = 0;
    }
}
