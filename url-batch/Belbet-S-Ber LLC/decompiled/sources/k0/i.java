package k0;

import android.net.Uri;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2298a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2299b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2300c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2301e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2302f;

    public i(Uri uri, int i, int i4, boolean z4, String str, int i5) {
        uri.getClass();
        this.f2298a = uri;
        this.f2299b = i;
        this.f2300c = i4;
        this.d = z4;
        this.f2301e = str;
        this.f2302f = i5;
    }

    public i(String str, String str2) {
        this.f2298a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f2299b = 0;
        this.f2300c = 400;
        this.d = false;
        this.f2301e = str2;
        this.f2302f = 0;
    }
}
