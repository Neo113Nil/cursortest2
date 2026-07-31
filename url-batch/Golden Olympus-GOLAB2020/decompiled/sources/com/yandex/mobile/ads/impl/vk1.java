package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vk1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final W1.h f33668a = W1.i.b(a.f33669b);

    static final class a extends kotlin.jvm.internal.s implements Function0<byte[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f33669b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Base64.decode("/9j/2wBDAAUDBAQEAwUEBAQFBQUGBwwIBwcHBw8LCwkMEQ8SEhEPERETFhwXExQaFRERGCEYGh0dHx8fExciJCIeJBweHx7/2wBDAQUFBQcGBw4ICA4eFBEUHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh7/xAAfAAABBQEBAQEBAQAAAAAAAAAAAQIDBAUGBwgJCgv/xAC1EAACAQMDAgQDBQUEBAAAAX0BAgMABBEFEiExQQYTUWEHInEUMoGRoQgjQrHBFVLR8CQzYnKCCQoWFxgZGiUmJygpKjQ1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4eLj5OXm5+jp6vHy8/T19vf4+fr/xAAfAQADAQEBAQEBAQEBAAAAAAAAAQIDBAUGBwgJCgv/xAC1EQACAQIEBAMEBwUEBAABAncAAQIDEQQFITEGEkFRB2FxEyIygQgUQpGhscEJIzNS8BVictEKFiQ04SXxFxgZGiYnKCkqNTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqCg4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2dri4+Tl5ufo6ery8/T19vf4+fo=", 0);
        }
    }

    @Nullable
    public static Bitmap a(@NotNull String previewBase64) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(previewBase64, "previewBase64");
        try {
            Result.Companion companion = Result.Companion;
            byte[] b4 = b(previewBase64);
            m243constructorimpl = Result.m243constructorimpl(!(b4.length == 0) ? BitmapFactory.decodeByteArray(b4, 0, b4.length) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (Bitmap) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }

    private static byte[] b(String str) {
        byte[] decode = Base64.decode(StringsKt.v0(str, "data:image/png;base64,"), 0);
        if (!StringsKt.K(str, "data:image/png;base64,", false, 2, null)) {
            Intrinsics.checkNotNull(decode);
            if (decode.length == 0) {
                decode = new byte[0];
            } else {
                byte[] bArr = (byte[]) f33668a.getValue();
                Intrinsics.checkNotNullExpressionValue(bArr, "access$getPreviewHeader(...)");
                decode = AbstractC3219i.p(bArr, decode);
            }
        }
        Intrinsics.checkNotNull(decode);
        return decode;
    }
}
