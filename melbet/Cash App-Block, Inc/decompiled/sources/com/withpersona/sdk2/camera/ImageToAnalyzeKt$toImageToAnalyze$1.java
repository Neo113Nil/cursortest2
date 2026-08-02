package com.withpersona.sdk2.camera;

import android.media.Image;
import com.google.mlkit.vision.common.InputImage;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ImageToAnalyzeKt$toImageToAnalyze$1 {
    public final /* synthetic */ Image $image;
    public final /* synthetic */ int $rotationDegrees;
    public final Lazy bitmap$delegate;
    public final int height;
    public final Image image;
    public final Lazy inputImage$delegate;
    public final int rotationDegrees;
    public final int width;

    public ImageToAnalyzeKt$toImageToAnalyze$1(final Image image, final int i) {
        this.$image = image;
        this.$rotationDegrees = i;
        this.image = image;
        final int i2 = 0;
        this.inputImage$delegate = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                int i4 = i;
                Image image2 = image;
                switch (i3) {
                    case 0:
                        return InputImage.fromMediaImage(image2, i4);
                    default:
                        return ImageToAnalyzeKt.toBitmap(image2, i4, null);
                }
            }
        });
        final int i3 = 1;
        this.bitmap$delegate = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                int i4 = i;
                Image image2 = image;
                switch (i32) {
                    case 0:
                        return InputImage.fromMediaImage(image2, i4);
                    default:
                        return ImageToAnalyzeKt.toBitmap(image2, i4, null);
                }
            }
        });
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.rotationDegrees = i;
    }

    public final InputImage getInputImage() {
        return (InputImage) this.inputImage$delegate.getValue();
    }
}
