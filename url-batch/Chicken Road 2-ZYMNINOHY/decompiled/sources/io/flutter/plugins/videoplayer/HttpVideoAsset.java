package io.flutter.plugins.videoplayer;

import E1.C0035k;
import T.C;
import T.C0101t;
import T.C0102u;
import T.C0103v;
import T.C0104w;
import T.C0105x;
import T.C0107z;
import T.b0;
import T.r;
import Y.m;
import android.content.Context;
import android.net.Uri;
import io.flutter.plugins.videoplayer.VideoAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l2.e;
import q0.C1374p;
import q0.InterfaceC1352A;
import v2.a0;

/* loaded from: classes.dex */
final class HttpVideoAsset extends VideoAsset {
    private final Map<String, String> httpHeaders;
    private final VideoAsset.StreamingFormat streamingFormat;
    private final String userAgent;

    /* renamed from: io.flutter.plugins.videoplayer.HttpVideoAsset$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat;

        static {
            int[] iArr = new int[VideoAsset.StreamingFormat.values().length];
            $SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat = iArr;
            try {
                iArr[VideoAsset.StreamingFormat.SMOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat[VideoAsset.StreamingFormat.DYNAMIC_ADAPTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat[VideoAsset.StreamingFormat.HTTP_LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HttpVideoAsset(String str, VideoAsset.StreamingFormat streamingFormat, Map<String, String> map, String str2) {
        super(str);
        this.streamingFormat = streamingFormat;
        this.httpHeaders = map;
        this.userAgent = str2;
    }

    private static void unstableUpdateDataSourceFactory(m mVar, Map<String, String> map, String str) {
        mVar.f3721b = str;
        mVar.f3724e = true;
        if (map.isEmpty()) {
            return;
        }
        e eVar = mVar.f3720a;
        synchronized (eVar) {
            eVar.f14271c = null;
            ((HashMap) eVar.f14270b).clear();
            ((HashMap) eVar.f14270b).putAll(map);
        }
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
        int i4 = AnonymousClass1.$SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat[this.streamingFormat.ordinal()];
        String str2 = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : "application/x-mpegURL" : "application/dash+xml" : "application/vnd.ms-sstr+xml";
        if (str2 == null) {
            str2 = null;
        }
        return new C0107z("", new C0101t(rVar), parse != null ? new C0104w(parse, str2, null, list, a0Var, -9223372036854775807L) : null, new C0103v(c0102u), C.f2631B, c0105x);
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    public InterfaceC1352A getMediaSourceFactory(Context context) {
        return getMediaSourceFactory(context, new m());
    }

    public InterfaceC1352A getMediaSourceFactory(Context context, m mVar) {
        unstableUpdateDataSourceFactory(mVar, this.httpHeaders, this.userAgent);
        e eVar = new e(context, mVar);
        C1374p c1374p = new C1374p(context);
        c1374p.f15053b = eVar;
        C0035k c0035k = c1374p.f15052a;
        if (eVar != ((e) c0035k.f628e)) {
            c0035k.f628e = eVar;
            ((HashMap) c0035k.f626c).clear();
            ((HashMap) c0035k.f627d).clear();
        }
        return c1374p;
    }
}
