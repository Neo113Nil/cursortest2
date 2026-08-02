package kotlinx.coroutines;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.mikepenz.markdown.annotator.AnnotatorSettingsKt$$ExternalSyntheticLambda0;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.model.DefaultMarkdownAnnotator;
import com.mikepenz.markdown.model.DefaultMarkdownColors;
import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import com.mikepenz.markdown.model.ReferenceLinkHandlerImpl;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewModel;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.TransitionsKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.AwaitAll;
import kotlinx.coroutines.AwaitAll.AwaitAllNode;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public abstract class AwaitKt {
    public static final void DependentWelcomeNullStateContent(DependentWelcomeViewModel dependentWelcomeViewModel, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1423457691);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changed(dependentWelcomeViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16) | (gapComposer2.changedInstance(function02) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = Strings.getColors(gapComposer2).isLight ? R.drawable.investing_components_nux_hero_light : R.drawable.investing_components_nux_hero_dark;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(companion), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            gapComposer2.startReusableNode();
            int i4 = i3;
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.TitleBarSub(dependentWelcomeViewModel.toolbarTitle, NavigationType.CLOSE, SizeKt.fillMaxWidth(companion, 1.0f), (DynamicColorConfiguration) null, function0, (Modifier) null, (Function3) null, gapComposer2, ((i2 << 9) & 57344) | 432, 104);
            Painter painterResource = Countries.painterResource(i4, 0, gapComposer2);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            TransitionsKt.NullStateWidgetView(painterResource, dependentWelcomeViewModel.title, SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 1.0f), SizeKt.fillMaxWidth(companion, 1.0f), dependentWelcomeViewModel.subTitle, gapComposer2, Painter.$stable | 3072, 0);
            SpacerKt.Spacer(gapComposer2, new LayoutWeightElement(1.0f, true));
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(962368733, new MoneyTabBookletKt$$ExternalSyntheticLambda4(19, function02, dependentWelcomeViewModel), gapComposer2), gapComposer2, 24576, 15);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) dependentWelcomeViewModel, (Object) function0, (Function) function02, i, 22);
        }
    }

    public static final JWECryptoParts annotatorSettings(Composer composer) {
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ComposeLocalKt.LocalMarkdownTypography;
        TextLinkStyles textLinkStyles = ((DefaultMarkdownTypography) ((GapComposer) composer).consume(dynamicProvidableCompositionLocal)).textLink;
        GapComposer gapComposer = (GapComposer) composer;
        DefaultMarkdownTypography defaultMarkdownTypography = (DefaultMarkdownTypography) gapComposer.consume(dynamicProvidableCompositionLocal);
        defaultMarkdownTypography.getClass();
        SpanStyle spanStyle = TextStyle.m994copyp1EtxEg$default(defaultMarkdownTypography.inlineCode, 0L, 0L, null, null, 0L, null, ((DefaultMarkdownColors) gapComposer.consume(ComposeLocalKt.LocalMarkdownColors)).inlineCodeBackground, null, null, null, 0, 0L, null, null, 0, 16775167).spanStyle;
        DefaultMarkdownAnnotator defaultMarkdownAnnotator = (DefaultMarkdownAnnotator) ((GapComposer) composer).consume(ComposeLocalKt.LocalMarkdownAnnotator);
        ReferenceLinkHandlerImpl referenceLinkHandlerImpl = (ReferenceLinkHandlerImpl) ((GapComposer) composer).consume(ComposeLocalKt.LocalReferenceLinkHandler);
        UriHandler uriHandler = (UriHandler) ((GapComposer) composer).consume(CompositionLocalsKt.LocalUriHandler);
        GapComposer gapComposer2 = (GapComposer) composer;
        boolean changedInstance = ((GapComposer) composer).changedInstance(referenceLinkHandlerImpl) | gapComposer2.changedInstance(uriHandler);
        Object rememberedValue = gapComposer2.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new AnnotatorSettingsKt$$ExternalSyntheticLambda0(0, referenceLinkHandlerImpl, uriHandler);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        spanStyle.getClass();
        defaultMarkdownAnnotator.getClass();
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.header = textLinkStyles;
        jWECryptoParts.encryptedKey = spanStyle;
        jWECryptoParts.iv = defaultMarkdownAnnotator;
        jWECryptoParts.cipherText = referenceLinkHandlerImpl;
        jWECryptoParts.authenticationTag = (LinkInteractionListener) rememberedValue;
        return jWECryptoParts;
    }

    public static final Object awaitAll(Collection collection, ContinuationImpl continuationImpl) {
        if (collection.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        Deferred[] deferredArr = (Deferred[]) collection.toArray(new Deferred[0]);
        AwaitAll awaitAll = new AwaitAll(deferredArr);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
        cancellableContinuationImpl.initCancellability();
        int length = deferredArr.length;
        AwaitAll.AwaitAllNode[] awaitAllNodeArr = new AwaitAll.AwaitAllNode[length];
        for (int i = 0; i < length; i++) {
            Deferred deferred = deferredArr[i];
            deferred.start();
            AwaitAll.AwaitAllNode awaitAllNode = awaitAll.new AwaitAllNode(cancellableContinuationImpl);
            awaitAllNode.handle = JobKt.invokeOnCompletion$default(deferred, awaitAllNode);
            awaitAllNodeArr[i] = awaitAllNode;
        }
        AwaitAll.DisposeHandlersOnCancel disposeHandlersOnCancel = new AwaitAll.DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i2 = 0; i2 < length; i2++) {
            awaitAllNodeArr[i2].setDisposer(disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl.isCompleted()) {
            disposeHandlersOnCancel.disposeAll();
        } else {
            cancellableContinuationImpl.invokeOnCancellationImpl(disposeHandlersOnCancel);
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:10:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinAll(Job[] jobArr, ContinuationImpl continuationImpl) {
        AwaitKt$joinAll$1 awaitKt$joinAll$1;
        int i;
        int i2;
        Job[] jobArr2;
        int length;
        int i3;
        if (continuationImpl instanceof AwaitKt$joinAll$1) {
            awaitKt$joinAll$1 = (AwaitKt$joinAll$1) continuationImpl;
            int i4 = awaitKt$joinAll$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                awaitKt$joinAll$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = awaitKt$joinAll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = awaitKt$joinAll$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    i2 = 0;
                    jobArr2 = jobArr;
                    length = jobArr.length;
                    i3 = 0;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = awaitKt$joinAll$1.I$2;
                    i2 = awaitKt$joinAll$1.I$1;
                    i3 = awaitKt$joinAll$1.I$0;
                    Job[] jobArr3 = (Job[]) awaitKt$joinAll$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    jobArr2 = jobArr3;
                    i2++;
                    if (i2 < length) {
                        Job job = jobArr2[i2];
                        awaitKt$joinAll$1.L$1 = jobArr2;
                        awaitKt$joinAll$1.I$0 = i3;
                        awaitKt$joinAll$1.I$1 = i2;
                        awaitKt$joinAll$1.I$2 = length;
                        awaitKt$joinAll$1.label = 1;
                        if (job.join(awaitKt$joinAll$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i2++;
                        if (i2 < length) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        awaitKt$joinAll$1 = new AwaitKt$joinAll$1(continuationImpl);
        Object obj2 = awaitKt$joinAll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = awaitKt$joinAll$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinAll(Collection collection, Continuation continuation) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        int i;
        Iterator it;
        int i2;
        if (continuation instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) continuation;
            int i3 = awaitKt$joinAll$3.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                awaitKt$joinAll$3.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = awaitKt$joinAll$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = awaitKt$joinAll$3.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    it = collection.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = awaitKt$joinAll$3.I$0;
                    it = awaitKt$joinAll$3.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    Job job = (Job) it.next();
                    awaitKt$joinAll$3.L$2 = it;
                    awaitKt$joinAll$3.I$0 = i2;
                    awaitKt$joinAll$3.label = 1;
                    if (job.join(awaitKt$joinAll$3) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
        Object obj2 = awaitKt$joinAll$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = awaitKt$joinAll$3.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
