package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wy implements wx {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public wy(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.wx
    public final xc a() {
        return new xc(new xb(this));
    }

    @Override // defpackage.wx
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.wx
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.wx
    public final void d(Uri uri) {
        this.d = uri;
    }
}
