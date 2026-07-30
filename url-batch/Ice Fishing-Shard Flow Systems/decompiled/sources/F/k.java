package F;

import android.net.Uri;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f746c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f747d;

    /* renamed from: e, reason: collision with root package name */
    public final String f748e;

    /* renamed from: f, reason: collision with root package name */
    public final int f749f;

    public k(Uri uri, int i2, int i5, boolean z7, String str, int i7) {
        uri.getClass();
        this.f744a = uri;
        this.f745b = i2;
        this.f746c = i5;
        this.f747d = z7;
        this.f748e = str;
        this.f749f = i7;
    }

    public k(String str, String str2) {
        this.f744a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f745b = 0;
        this.f746c = 400;
        this.f747d = false;
        this.f748e = str2;
        this.f749f = 0;
    }
}
