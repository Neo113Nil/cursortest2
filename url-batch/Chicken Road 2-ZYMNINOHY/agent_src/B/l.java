package B;

import android.net.Uri;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f178a;

    /* renamed from: b, reason: collision with root package name */
    public final int f179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f181d;

    /* renamed from: e, reason: collision with root package name */
    public final String f182e;

    /* renamed from: f, reason: collision with root package name */
    public final int f183f;

    public l(Uri uri, int i4, int i5, boolean z, int i6) {
        uri.getClass();
        this.f178a = uri;
        this.f179b = i4;
        this.f180c = i5;
        this.f181d = z;
        this.f182e = null;
        this.f183f = i6;
    }

    public l(String str, String str2) {
        this.f178a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f179b = 0;
        this.f180c = 400;
        this.f181d = false;
        this.f182e = str2;
        this.f183f = 0;
    }
}
