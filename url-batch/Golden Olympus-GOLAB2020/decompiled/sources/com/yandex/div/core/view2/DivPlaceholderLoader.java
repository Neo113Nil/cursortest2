package com.yandex.div.core.view2;

import android.graphics.drawable.Drawable;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivPlaceholderLoader {

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final Div2ImageStubProvider imageStubProvider;

    public DivPlaceholderLoader(@NotNull Div2ImageStubProvider imageStubProvider, @NotNull ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(imageStubProvider, "imageStubProvider");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.imageStubProvider = imageStubProvider;
        this.executorService = executorService;
    }

    private Future<?> decodeBase64(String str, boolean z4, Function1<? super ImageRepresentation, Unit> function1) {
        DecodeBase64ImageTask decodeBase64ImageTask = new DecodeBase64ImageTask(str, z4, function1);
        if (!z4) {
            return this.executorService.submit(decodeBase64ImageTask);
        }
        decodeBase64ImageTask.run();
        return null;
    }

    private void enqueueDecoding(String str, LoadableImage loadableImage, boolean z4, Function1<? super ImageRepresentation, Unit> function1) {
        Future<?> loadingTask = loadableImage.getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        Future<?> decodeBase64 = decodeBase64(str, z4, new DivPlaceholderLoader$enqueueDecoding$future$1(function1, loadableImage));
        if (decodeBase64 != null) {
            loadableImage.saveLoadingTask(decodeBase64);
        }
    }

    public void applyPlaceholder(@NotNull LoadableImage imageView, @NotNull ErrorCollector errorCollector, @Nullable String str, int i4, boolean z4, @NotNull Function1<? super Drawable, Unit> onSetPlaceholder, @NotNull Function1<? super ImageRepresentation, Unit> onSetPreview) {
        DivPlaceholderLoader divPlaceholderLoader;
        int i5;
        Function1<? super Drawable, Unit> function1;
        Unit unit;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        Intrinsics.checkNotNullParameter(onSetPlaceholder, "onSetPlaceholder");
        Intrinsics.checkNotNullParameter(onSetPreview, "onSetPreview");
        if (str != null) {
            divPlaceholderLoader = this;
            i5 = i4;
            function1 = onSetPlaceholder;
            enqueueDecoding(str, imageView, z4, new DivPlaceholderLoader$applyPlaceholder$1$1(errorCollector, function1, divPlaceholderLoader, i5, onSetPreview));
            unit = Unit.f41027a;
        } else {
            divPlaceholderLoader = this;
            i5 = i4;
            function1 = onSetPlaceholder;
            unit = null;
        }
        if (unit == null) {
            function1.invoke(divPlaceholderLoader.imageStubProvider.getImageStubDrawable(i5));
        }
    }
}
