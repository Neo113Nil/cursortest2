package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ww implements wx {
    private final ContentInfo.Builder a;

    public ww(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.wx
    public final xc a() {
        ContentInfo build;
        build = this.a.build();
        return new xc(new wz(build));
    }

    @Override // defpackage.wx
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.wx
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.wx
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
