package com.squareup.cash.support.chat.views.transcript;

import android.view.ContextThemeWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda1;

/* loaded from: classes7.dex */
public final class ImageAttachmentView extends AbstractComposeView {
    public final ParcelableSnapshotMutableState currentUri$delegate;
    public final RealImageLoader imageLoader;
    public final ChatView$$ExternalSyntheticLambda1 onClick;

    public ImageAttachmentView(ContextThemeWrapper contextThemeWrapper, RealImageLoader realImageLoader, ChatView$$ExternalSyntheticLambda1 chatView$$ExternalSyntheticLambda1) {
        super(contextThemeWrapper, null, 6, 0);
        this.imageLoader = realImageLoader;
        this.onClick = chatView$$ExternalSyntheticLambda1;
        this.currentUri$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        RecomposeScopeImpl recomposeScopeImpl;
        ImageAttachmentView$$ExternalSyntheticLambda0 imageAttachmentView$$ExternalSyntheticLambda0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1680311856);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (((String) this.currentUri$delegate.getValue()) == null || this.onClick == null) {
                recomposeScopeImpl = gapComposer.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    imageAttachmentView$$ExternalSyntheticLambda0 = new ImageAttachmentView$$ExternalSyntheticLambda0(this, i, 0);
                    recomposeScopeImpl.block = imageAttachmentView$$ExternalSyntheticLambda0;
                }
                return;
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(815742608, new ImageAttachmentView$$ExternalSyntheticLambda0(this, 1), gapComposer), gapComposer, 56);
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            imageAttachmentView$$ExternalSyntheticLambda0 = new ImageAttachmentView$$ExternalSyntheticLambda0(this, i, 2);
            recomposeScopeImpl.block = imageAttachmentView$$ExternalSyntheticLambda0;
        }
    }

    public final void setUri(String str) {
        this.currentUri$delegate.setValue(str);
    }
}
