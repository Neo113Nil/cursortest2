package l3;

import android.net.Uri;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5855c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5856d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5857e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5858f;

    public h(String str, String str2) {
        this.f5853a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f5854b = 0;
        this.f5855c = 400;
        this.f5856d = false;
        this.f5857e = str2;
        this.f5858f = 0;
    }

    public h(Uri uri, int i3, int i10, boolean z10, String str, int i11) {
        uri.getClass();
        this.f5853a = uri;
        this.f5854b = i3;
        this.f5855c = i10;
        this.f5856d = z10;
        this.f5857e = str;
        this.f5858f = i11;
    }
}
