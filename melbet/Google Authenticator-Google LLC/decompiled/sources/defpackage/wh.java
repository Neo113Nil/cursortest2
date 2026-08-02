package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wh {
    public final int a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final Object f;

    public wh(String str, String str2) {
        this.f = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.a = 0;
        this.b = 400;
        this.c = false;
        this.d = str2;
        this.e = 0;
    }

    public final boolean a() {
        return Objects.equals(((Uri) this.f).getScheme(), "systemfont");
    }

    public wh(Uri uri, int i, int i2, boolean z, String str, int i3) {
        tw.F(uri);
        this.f = uri;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = i3;
    }

    public wh(String str, int i, boolean z, String str2, int i2, int i3) {
        this.f = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.a = i2;
        this.e = i3;
    }
}
