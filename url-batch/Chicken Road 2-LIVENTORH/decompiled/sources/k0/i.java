package k0;

import android.net.Uri;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2150a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2152c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2153e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2154f;

    public i(Uri uri, int i, int i4, boolean z3, int i5) {
        uri.getClass();
        this.f2150a = uri;
        this.f2151b = i;
        this.f2152c = i4;
        this.d = z3;
        this.f2153e = null;
        this.f2154f = i5;
    }

    public i(String str, String str2) {
        this.f2150a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f2151b = 0;
        this.f2152c = 400;
        this.d = false;
        this.f2153e = str2;
        this.f2154f = 0;
    }
}
