package io.flutter.plugins.videoplayer;

import T.C;
import T.C0101t;
import T.C0102u;
import T.C0103v;
import T.C0104w;
import T.C0105x;
import T.C0107z;
import T.b0;
import T.r;
import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import q0.C1374p;
import q0.InterfaceC1352A;
import v2.a0;

/* loaded from: classes.dex */
final class LocalVideoAsset extends VideoAsset {
    public LocalVideoAsset(String str) {
        super(str);
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    public C0107z getMediaItem() {
        r rVar = new r();
        new b0();
        List list = Collections.EMPTY_LIST;
        a0 a0Var = a0.f15605e;
        C0102u c0102u = new C0102u();
        C0105x c0105x = C0105x.f2898a;
        String str = this.assetUrl;
        Uri parse = str == null ? null : Uri.parse(str);
        return new C0107z("", new C0101t(rVar), parse != null ? new C0104w(parse, null, null, list, a0Var, -9223372036854775807L) : null, new C0103v(c0102u), C.f2631B, c0105x);
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    public InterfaceC1352A getMediaSourceFactory(Context context) {
        return new C1374p(context);
    }
}
