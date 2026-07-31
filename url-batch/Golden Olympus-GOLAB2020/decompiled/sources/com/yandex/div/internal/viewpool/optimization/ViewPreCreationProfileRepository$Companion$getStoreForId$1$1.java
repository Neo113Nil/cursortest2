package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ViewPreCreationProfileRepository$Companion$getStoreForId$1$1 extends s implements Function0<File> {
    final /* synthetic */ String $id;
    final /* synthetic */ Context $this_getStoreForId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPreCreationProfileRepository$Companion$getStoreForId$1$1(Context context, String str) {
        super(0);
        this.$this_getStoreForId = context;
        this.$id = str;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final File invoke() {
        File filesDir = this.$this_getStoreForId.getFilesDir();
        String format = String.format("divkit_optimized_viewpool_profile_%s.json", Arrays.copyOf(new Object[]{this.$id}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return new File(filesDir, format);
    }
}
