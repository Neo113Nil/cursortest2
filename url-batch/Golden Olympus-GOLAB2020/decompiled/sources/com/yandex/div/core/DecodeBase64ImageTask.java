package com.yandex.div.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.PictureDrawable;
import android.util.Base64;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.logging.Severity;
import com.yandex.div.svg.SvgDecoder;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DecodeBase64ImageTask implements Runnable {

    @NotNull
    private final Function1<ImageRepresentation, Unit> onDecoded;

    @NotNull
    private String rawBase64string;
    private final boolean synchronous;

    /* JADX WARN: Multi-variable type inference failed */
    public DecodeBase64ImageTask(@NotNull String rawBase64string, boolean z4, @NotNull Function1<? super ImageRepresentation, Unit> onDecoded) {
        Intrinsics.checkNotNullParameter(rawBase64string, "rawBase64string");
        Intrinsics.checkNotNullParameter(onDecoded, "onDecoded");
        this.rawBase64string = rawBase64string;
        this.synchronous = z4;
        this.onDecoded = onDecoded;
    }

    /* renamed from: asImageRepresentation-9g2PFUk, reason: not valid java name */
    private final PictureDrawable m30asImageRepresentation9g2PFUk(PictureDrawable pictureDrawable) {
        return ImageRepresentation.PictureDrawable.m51constructorimpl(pictureDrawable);
    }

    /* renamed from: asImageRepresentation-Mlk_otY, reason: not valid java name */
    private final Bitmap m31asImageRepresentationMlk_otY(Bitmap bitmap) {
        return ImageRepresentation.Bitmap.m45constructorimpl(bitmap);
    }

    private final Bitmap decodeToBitmap(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (!kLog.isAtLeast(Severity.ERROR)) {
                return null;
            }
            kLog.print(6, "Div", "Problem with decoding base-64 preview image occurred");
            return null;
        }
    }

    private final PictureDrawable decodeToPictureDrawable(byte[] bArr) {
        return new SvgDecoder(false, 1, null).decode(new ByteArrayInputStream(bArr));
    }

    private final String extractFromDataUrl(String str) {
        if (!StringsKt.K(str, "data:", false, 2, null)) {
            return str;
        }
        String substring = str.substring(StringsKt.b0(str, ',', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    private final boolean isSvg(String str) {
        return StringsKt.K(str, "data:image/svg", false, 2, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] bytes = Base64.decode(extractFromDataUrl(this.rawBase64string), 0);
            ImageRepresentation imageRepresentation = null;
            if (isSvg(this.rawBase64string)) {
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                PictureDrawable decodeToPictureDrawable = decodeToPictureDrawable(bytes);
                PictureDrawable m30asImageRepresentation9g2PFUk = decodeToPictureDrawable != null ? m30asImageRepresentation9g2PFUk(decodeToPictureDrawable) : null;
                if (m30asImageRepresentation9g2PFUk != null) {
                    imageRepresentation = ImageRepresentation.PictureDrawable.m50boximpl(m30asImageRepresentation9g2PFUk);
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                Bitmap decodeToBitmap = decodeToBitmap(bytes);
                Bitmap m31asImageRepresentationMlk_otY = decodeToBitmap != null ? m31asImageRepresentationMlk_otY(decodeToBitmap) : null;
                if (m31asImageRepresentationMlk_otY != null) {
                    imageRepresentation = ImageRepresentation.Bitmap.m44boximpl(m31asImageRepresentationMlk_otY);
                }
            }
            if (this.synchronous) {
                this.onDecoded.invoke(imageRepresentation);
            } else {
                UiThreadHandler.INSTANCE.postOnMainThread(new DecodeBase64ImageTask$run$1(this, imageRepresentation));
            }
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.ERROR)) {
                kLog.print(6, "Div", "Bad base-64 image preview");
            }
        }
    }
}
