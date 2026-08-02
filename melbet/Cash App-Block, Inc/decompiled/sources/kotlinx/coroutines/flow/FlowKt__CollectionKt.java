package kotlinx.coroutines.flow;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TooltipKt$TooltipBox$3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.elements.ComposableSingletons$MarkdownCodeKt;
import com.mikepenz.markdown.compose.elements.MarkdownCodeKt$$ExternalSyntheticLambda0;
import com.mikepenz.markdown.compose.elements.MarkdownCodeKt$$ExternalSyntheticLambda4;
import com.mikepenz.markdown.compose.elements.MarkdownCodeKt$MarkdownCodeBackground$2$1;
import com.mikepenz.markdown.model.DefaultMarkdownColors;
import com.mikepenz.markdown.model.DefaultMarkdownDimens;
import com.mikepenz.markdown.model.DefaultMarkdownPadding;
import com.squareup.cash.investing.components.families.DependentInvestingActivityView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.families.DependentActivityViewModel;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.text.StringsKt__IndentKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.ast.ASTUtilKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class FlowKt__CollectionKt {
    public static final void DependentInvestingActivity(DependentActivityViewModel dependentActivityViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1225458498);
        int i2 = (gapComposer.changedInstance(dependentActivityViewModel) ? 4 : 2) | i;
        byte b = 0;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1438758247, new DependentInvestingActivityView$$ExternalSyntheticLambda1(dependentActivityViewModel, i3, b), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DependentInvestingActivityView$$ExternalSyntheticLambda1(dependentActivityViewModel, i);
        }
    }

    public static final void MarkdownCode(String str, String str2, TextStyle textStyle, Composer composer, int i) {
        int i2;
        String str3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1425841556);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= gapComposer.changed(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(textStyle) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            long j = ((DefaultMarkdownColors) gapComposer.consume(ComposeLocalKt.LocalMarkdownColors)).codeBackground;
            float f = ((DefaultMarkdownDimens) gapComposer.consume(ComposeLocalKt.LocalMarkdownDimens)).codeBackgroundCornerSize;
            PaddingValuesImpl paddingValuesImpl = ((DefaultMarkdownPadding) gapComposer.consume(ComposeLocalKt.LocalMarkdownPadding)).codeBlock;
            m4196MarkdownCodeBackgroundymN66Js(j, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f), str3, str, Expect_jvmKt.rememberComposableLambda(-244661877, new TooltipKt$TooltipBox$3(5, str, textStyle, paddingValuesImpl), gapComposer), gapComposer, ((i3 << 21) & 29360128) | (458752 & (i3 << 6)) | 100663344 | ((i3 << 15) & 3670016));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(str, str2, textStyle, i, 17);
        }
    }

    /* renamed from: MarkdownCodeBackground-ymN66Js, reason: not valid java name */
    public static final void m4196MarkdownCodeBackgroundymN66Js(long j, Modifier modifier, Shape shape, String str, String str2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        String str3;
        String str4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1963323770);
        Applier applier = gapComposer.applier;
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(shape) ? 256 : 128;
        }
        int i4 = i2 | 27648;
        if ((196608 & i) == 0) {
            i4 |= gapComposer.changed(false) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            str3 = str;
            i4 |= gapComposer.changed(str3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            str3 = str;
        }
        if ((12582912 & i) == 0) {
            str4 = str2;
            i4 |= gapComposer.changed(str4) ? 8388608 : 4194304;
        } else {
            str4 = str2;
        }
        if ((100663296 & i) == 0) {
            i4 |= gapComposer.changedInstance(composableLambdaImpl) ? 67108864 : 33554432;
        }
        if (gapComposer.shouldExecute(i4 & 1, (38347923 & i4) != 38347922)) {
            Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(ShadowKt.m591shadows4CzXII$default(modifier, RecyclerView.DECELERATION_RATE, shape, false, 24).then(Modifier.Companion.$$INSTANCE), j, shape), shape);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(clip, false, (Function1) rememberedValue);
            Unit unit = Unit.INSTANCE;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = MarkdownCodeKt$MarkdownCodeBackground$2$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics, unit, (PointerInputEventHandler) rememberedValue2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pointerInput);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1260679041);
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i4 >> 24) & 14));
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownCodeKt$$ExternalSyntheticLambda4(j, modifier, shape, str3, str4, composableLambdaImpl, i);
        }
    }

    public static final void MarkdownCodeBlock(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, Function5 function5, Composer composer, int i) {
        Function5 function52;
        Function5 function53;
        CharSequence textInNode;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1394309178);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(aSTNodeImpl) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                function53 = ComposableSingletons$MarkdownCodeKt.lambda$591785369;
            } else {
                gapComposer.skipToGroupEnd();
                function53 = function5;
            }
            gapComposer.endDefaults();
            int i3 = ((ASTNodeImpl) aSTNodeImpl.getChildren().get(0)).startOffset;
            int i4 = ((ASTNodeImpl) aSTNodeImpl.getChildren().get(aSTNodeImpl.getChildren().size() - 1)).endOffset;
            ASTNodeImpl findChildOfType = ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.FENCE_LANG);
            Function5 function54 = function53;
            function54.invoke(StringsKt__IndentKt.replaceIndent(str.subSequence(i3, i4).toString()), (findChildOfType == null || (textInNode = ASTUtilKt.getTextInNode(findChildOfType, str)) == null) ? null : textInNode.toString(), textStyle, gapComposer, Integer.valueOf(i2 & 8064));
            function52 = function54;
        } else {
            gapComposer.skipToGroupEnd();
            function52 = function5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownCodeKt$$ExternalSyntheticLambda0(str, aSTNodeImpl, textStyle, function52, i, 1);
        }
    }

    public static final void MarkdownCodeFence(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, Function5 function5, Composer composer, int i) {
        Function5 function52;
        Function5 function53;
        Function5 function54;
        CharSequence textInNode;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1859183210);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(aSTNodeImpl) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                function53 = ComposableSingletons$MarkdownCodeKt.f96lambda$449689539;
            } else {
                gapComposer.skipToGroupEnd();
                function53 = function5;
            }
            gapComposer.endDefaults();
            ASTNodeImpl findChildOfType = ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.FENCE_LANG);
            String obj = (findChildOfType == null || (textInNode = ASTUtilKt.getTextInNode(findChildOfType, str)) == null) ? null : textInNode.toString();
            if (aSTNodeImpl.getChildren().size() >= 3) {
                gapComposer.startReplaceGroup(-970475737);
                int i3 = ((ASTNodeImpl) aSTNodeImpl.getChildren().get(2)).startOffset;
                int i4 = (obj == null || aSTNodeImpl.getChildren().size() <= 3) ? 2 : 3;
                List children = aSTNodeImpl.getChildren();
                int size = aSTNodeImpl.getChildren().size() - 2;
                if (size >= i4) {
                    i4 = size;
                }
                String replaceIndent = StringsKt__IndentKt.replaceIndent(str.subSequence(i3, ((ASTNodeImpl) children.get(i4)).endOffset).toString());
                Integer valueOf = Integer.valueOf(i2 & 8064);
                function54 = function53;
                function54.invoke(replaceIndent, obj, textStyle, gapComposer, valueOf);
                gapComposer.end(false);
            } else {
                function54 = function53;
                gapComposer.startReplaceGroup(-970144471);
                gapComposer.end(false);
            }
            function52 = function54;
        } else {
            gapComposer.skipToGroupEnd();
            function52 = function5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownCodeKt$$ExternalSyntheticLambda0(str, aSTNodeImpl, textStyle, function52, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toCollection(Flow flow, ArrayList arrayList, ContinuationImpl continuationImpl) {
        FlowKt__CollectionKt$toCollection$1 flowKt__CollectionKt$toCollection$1;
        int i;
        if (continuationImpl instanceof FlowKt__CollectionKt$toCollection$1) {
            flowKt__CollectionKt$toCollection$1 = (FlowKt__CollectionKt$toCollection$1) continuationImpl;
            int i2 = flowKt__CollectionKt$toCollection$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowKt__CollectionKt$toCollection$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = flowKt__CollectionKt$toCollection$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__CollectionKt$toCollection$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowKt__CollectionKt$toCollection$2 = new FlowKt__CollectionKt$toCollection$2(arrayList, 0);
                    flowKt__CollectionKt$toCollection$1.L$1 = arrayList;
                    flowKt__CollectionKt$toCollection$1.label = 1;
                    return flow.collect(flowKt__CollectionKt$toCollection$2, flowKt__CollectionKt$toCollection$1) == obj2 ? obj2 : arrayList;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList2 = flowKt__CollectionKt$toCollection$1.L$1;
                SafeTrace.throwOnFailure(obj);
                return arrayList2;
            }
        }
        flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(continuationImpl);
        Object obj3 = flowKt__CollectionKt$toCollection$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__CollectionKt$toCollection$1.label;
        if (i != 0) {
        }
    }
}
