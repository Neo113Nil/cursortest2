package com.squareup.cash.support.chat.views.transcript;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.common.MediaItem;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.LocalImageLoaderKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda14;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public abstract class DisclaimerViewKt {

    /* renamed from: lambda$-1340150187, reason: not valid java name */
    public static final ComposableLambdaImpl f680lambda$1340150187 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(27), false, -1340150187);

    public static final void ArcadeFileAttachment(ChatAttachmentViewModel.FileAttachmentViewModel fileAttachmentViewModel, Function0 function0, Composer composer, int i) {
        ChatAttachmentViewModel.FileAttachmentViewModel fileAttachmentViewModel2;
        Function0 function02;
        Modifier.Companion companion;
        Modifier modifier;
        boolean z = fileAttachmentViewModel.showCloseButton;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(105311231);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(fileAttachmentViewModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z) {
                modifier = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 20.0f, 18.0f, RecyclerView.DECELERATION_RATE, 9);
                companion = companion2;
            } else {
                companion = companion2;
                modifier = companion;
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.wrapContentWidth$default(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 1.0f, Strings.getColors(gapComposer).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), null, 3), 8.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ChatSurveyKt$$ExternalSyntheticLambda11(4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m298padding3ABfNKs, true, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, semantics);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.m298padding3ABfNKs(SizeKt.m285size3ABfNKs(companion, 48.0f), 4.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), Strings.getColors(gapComposer).semantic.background.subtle, ColorKt.RectangleShape), 8.0f);
            Painter painterResource = Countries.painterResource(R.drawable.icon_document_24, 0, gapComposer);
            String stringResource = Room.stringResource(gapComposer, R.string.support_chat_file_attachment_icon);
            long j = Strings.getColors(gapComposer).semantic.icon.standard;
            Modifier.Companion companion3 = companion;
            ImageKt.Image(painterResource, stringResource, m298padding3ABfNKs2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable, 56);
            gapComposer = gapComposer;
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m300paddingVpY3zN4$default(companion3, 8.0f, RecyclerView.DECELERATION_RATE, 2), false);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            fileAttachmentViewModel2 = fileAttachmentViewModel;
            Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3994, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, fileAttachmentViewModel2.name, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, fileAttachmentViewModel2.fileTypeDescription, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
            if (z) {
                gapComposer.startReplaceGroup(-1047279041);
                function02 = function0;
                MediaItem.DrmConfiguration.DiscardAttachmentButton(i2 & 112, gapComposer, BoxScopeInstance.INSTANCE.align(OffsetKt.m272offsetVpY3zN4(companion3, 18.0f, -20.0f), Alignment.Companion.TopEnd), function02);
                gapComposer.end(false);
            } else {
                function02 = function0;
                gapComposer.startReplaceGroup(-1047115671);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            fileAttachmentViewModel2 = fileAttachmentViewModel;
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1((Object) fileAttachmentViewModel2, function02, i, 19);
        }
    }

    public static final void DisclaimerViewContent(ChatRowViewModel.DisclaimerRowViewModel disclaimerRowViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1160533023);
        int i2 = (gapComposer.changedInstance(disclaimerRowViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier then = SizeKt.fillMaxWidth(companion, 1.0f).then(disclaimerRowViewModel.model.chatUiUpliftEnabled ? SpacerKt.m301paddingqDBjuR0(companion, 8.0f, 28.0f, 8.0f, 8.0f) : SpacerKt.m298padding3ABfNKs(companion, 8.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.disabled;
            String str = disclaimerRowViewModel.model.disclaimerMarkdown;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyXSmall;
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).linkXSmall.spanStyle, 2);
            boolean changedInstance = gapComposer.changedInstance(disclaimerRowViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DisclaimerView$$ExternalSyntheticLambda1(disclaimerRowViewModel, 1, (byte) 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, then, textStyle, j, markdownSpanValues, null, new TextLineBalancing(1), 0, 0, 3, gapComposer, 0, 832);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DisclaimerView$$ExternalSyntheticLambda1(disclaimerRowViewModel, i);
        }
    }

    public static final void ImageAttachment(String str, Composer composer, int i) {
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-666838139);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopEnd, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Crop;
            AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(str, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), contentScale$Companion$Fit$1, gapComposer, (i2 & 14) | 24576, 44);
            str2 = str;
            ImageKt.Image(m1448rememberAsyncImagePainter5jETZwI, Room.stringResource(gapComposer, R.string.support_chat_content_description_image), SizeKt.m285size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 100.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer, 24576, 104);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PastPaySectionKt$$ExternalSyntheticLambda1(str2, i, i3);
        }
    }
}
