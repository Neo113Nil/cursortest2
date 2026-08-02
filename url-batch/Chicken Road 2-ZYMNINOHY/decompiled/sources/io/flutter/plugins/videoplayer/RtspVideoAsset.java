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
import U.i;
import a0.C0144j;
import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import m0.C1286H;
import m0.u;
import q0.AbstractC1359a;
import q0.InterfaceC1352A;
import v2.a0;

/* loaded from: classes.dex */
final class RtspVideoAsset extends VideoAsset {
    public RtspVideoAsset(String str) {
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
        return new InterfaceC1352A() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

            /* renamed from: a, reason: collision with root package name */
            public final SocketFactory f5104a = SocketFactory.getDefault();

            @Override // q0.InterfaceC1352A
            public final AbstractC1359a a(C0107z c0107z) {
                c0107z.f2900b.getClass();
                C0104w c0104w = c0107z.f2900b;
                c0104w.getClass();
                String scheme = c0104w.f2893a.getScheme();
                return new u(c0107z, (scheme == null || !i.h("rtspt", scheme)) ? new C0144j(24, false) : new C1286H(), this.f5104a);
            }
        };
    }
}
