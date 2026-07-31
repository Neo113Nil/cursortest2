package com.yandex.div.svg;

import a2.AbstractC1241b;
import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.images.DivImageDownloadCallback;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3313G;
import o2.AbstractC3333i;
import o2.InterfaceC3316J;
import o2.Z;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@f(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2", f = "SvgDivImageLoader.kt", l = {36}, m = "invokeSuspend")
@Metadata
/* loaded from: classes2.dex */
final class SvgDivImageLoader$loadImage$2 extends l implements Function2<InterfaceC3316J, d, Object> {
    final /* synthetic */ Call $call;
    final /* synthetic */ DivImageDownloadCallback $callback;
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ SvgDivImageLoader this$0;

    @f(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1", f = "SvgDivImageLoader.kt", l = {}, m = "invokeSuspend")
    @Metadata
    /* renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements Function2<InterfaceC3316J, d, Object> {
        final /* synthetic */ Call $call;
        final /* synthetic */ String $imageUrl;
        int label;
        final /* synthetic */ SvgDivImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Call call, SvgDivImageLoader svgDivImageLoader, String str, d dVar) {
            super(2, dVar);
            this.$call = call;
            this.this$0 = svgDivImageLoader;
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d create(@Nullable Object obj, @NotNull d dVar) {
            return new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SvgDecoder svgDecoder;
            SvgCacheManager svgCacheManager;
            AbstractC1241b.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
            Call call = this.$call;
            byte[] imageData = call == null ? this.this$0.getImageData(this.$imageUrl) : this.this$0.downloadImage(call);
            if (imageData == null) {
                return null;
            }
            svgDecoder = this.this$0.svgDecoder;
            PictureDrawable decode = svgDecoder.decode(new ByteArrayInputStream(imageData));
            if (decode == null) {
                return null;
            }
            svgCacheManager = this.this$0.svgCacheManager;
            svgCacheManager.set(this.$imageUrl, decode);
            return decode;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC3316J interfaceC3316J, @Nullable d dVar) {
            return ((AnonymousClass1) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SvgDivImageLoader$loadImage$2(DivImageDownloadCallback divImageDownloadCallback, Call call, SvgDivImageLoader svgDivImageLoader, String str, d dVar) {
        super(2, dVar);
        this.$callback = divImageDownloadCallback;
        this.$call = call;
        this.this$0 = svgDivImageLoader;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final d create(@Nullable Object obj, @NotNull d dVar) {
        return new SvgDivImageLoader$loadImage$2(this.$callback, this.$call, this.this$0, this.$imageUrl, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f4 = AbstractC1241b.f();
        int i4 = this.label;
        Unit unit = null;
        if (i4 == 0) {
            ResultKt.a(obj);
            AbstractC3313G b4 = Z.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, null);
            this.label = 1;
            obj = AbstractC3333i.g(b4, anonymousClass1, this);
            if (obj == f4) {
                return f4;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
        }
        PictureDrawable pictureDrawable = (PictureDrawable) obj;
        if (pictureDrawable != null) {
            this.$callback.onSuccess(pictureDrawable);
            unit = Unit.f41027a;
        }
        if (unit == null) {
            this.$callback.onError();
        }
        return Unit.f41027a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC3316J interfaceC3316J, @Nullable d dVar) {
        return ((SvgDivImageLoader$loadImage$2) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
    }
}
