package com.yandex.div.svg;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import f2.AbstractC2419b;
import f2.AbstractC2420c;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.K;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class SvgDivImageLoader implements DivImageLoader {

    @NotNull
    private final Context context;

    @NotNull
    private final InterfaceC3316J coroutineScope;

    @NotNull
    private final OkHttpClient httpClient;

    @NotNull
    private final SvgCacheManager svgCacheManager;

    @NotNull
    private final SvgDecoder svgDecoder;

    public SvgDivImageLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.httpClient = new OkHttpClient.Builder().a();
        this.coroutineScope = K.b();
        this.svgDecoder = new SvgDecoder(false, 1, null);
        this.svgCacheManager = new SvgCacheManager();
    }

    private final Call createCallOrNull(String str) {
        if (!StringsKt.K(str, "http://", false, 2, null) && !StringsKt.K(str, "https://", false, 2, null)) {
            return null;
        }
        return this.httpClient.a(new Request.Builder().i(str).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] downloadImage(Call call) {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ResponseBody m4 = call.execute().m();
            m243constructorimpl = Result.m243constructorimpl(m4 != null ? m4.m() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (byte[]) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getImageData(String str) {
        AssetManager assets;
        InputStream open;
        String v02 = StringsKt.v0(str, "file:///android_asset/");
        Context applicationContext = this.context.getApplicationContext();
        if (applicationContext == null || (assets = applicationContext.getAssets()) == null || (open = assets.open(v02)) == null) {
            return null;
        }
        try {
            byte[] c4 = AbstractC2419b.c(open);
            AbstractC2420c.a(open, null);
            return c4;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$1(Call call) {
        if (call != null) {
            call.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImageBytes$lambda$3(SvgDivImageLoader this$0, String imageUrl, DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageUrl, "$imageUrl");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        this$0.loadImage(imageUrl, callback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Call createCallOrNull = createCallOrNull(imageUrl);
        PictureDrawable pictureDrawable = this.svgCacheManager.get(imageUrl);
        if (pictureDrawable != null) {
            callback.onSuccess(pictureDrawable);
            return new LoadReference() { // from class: N1.a
                @Override // com.yandex.div.core.images.LoadReference
                public final void cancel() {
                    SvgDivImageLoader.loadImage$lambda$0();
                }
            };
        }
        AbstractC3337k.d(this.coroutineScope, null, null, new SvgDivImageLoader$loadImage$2(callback, createCallOrNull, this, imageUrl, null), 3, null);
        return new LoadReference() { // from class: N1.b
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.loadImage$lambda$1(Call.this);
            }
        };
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull final String imageUrl, @NotNull final DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new LoadReference() { // from class: N1.c
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.loadImageBytes$lambda$3(SvgDivImageLoader.this, imageUrl, callback);
            }
        };
    }
}
