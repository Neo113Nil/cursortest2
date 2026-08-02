package kotlinx.serialization.encoding;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.mikepenz.markdown.annotator.AnnotatedStringKtxKt;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.compose.MarkdownExtensionKt;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.compose.elements.MarkdownTableKt$$ExternalSyntheticLambda1;
import com.mikepenz.markdown.model.DefaultMarkdownColors;
import com.mikepenz.markdown.model.DefaultMarkdownDimens;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.guava.ListenableFutureKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;
import kotlinx.serialization.json.JsonElementBuildersKt;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.ast.ASTUtilKt;
import org.intellij.markdown.flavours.gfm.GFMElementTypes;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;

/* loaded from: classes9.dex */
public abstract class AbstractDecoder implements Decoder, CompositeDecoder {
    public static final void InvestingNews(InvestingCryptoNewsViewModel investingCryptoNewsViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        investingCryptoNewsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(212189384);
        int i2 = (gapComposer2.changed(investingCryptoNewsViewModel) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, navigationBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            String str = investingCryptoNewsViewModel.title;
            NavigationType navigationType = NavigationType.BACK;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(0, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(str, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 432, 104);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            boolean z2 = (i3 == 32) | ((i2 & 14) == 4);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new InvestingNewsKt$$ExternalSyntheticLambda1(investingCryptoNewsViewModel, function1, 0);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(fillMaxSize, null, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer2, 6, 510);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InvestingNewsKt$$ExternalSyntheticLambda2(investingCryptoNewsViewModel, function1, i);
        }
    }

    public static final void MarkdownTable(final String str, final ASTNodeImpl aSTNodeImpl, final TextStyle textStyle, JWECryptoParts jWECryptoParts, Function6 function6, Function6 function62, Composer composer, int i) {
        GapComposer gapComposer;
        JWECryptoParts jWECryptoParts2;
        Function6 function63;
        Function6 function64;
        int i2;
        final Function6 rememberComposableLambda;
        final Function6 rememberComposableLambda2;
        List children;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1501365898);
        int i3 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(aSTNodeImpl) ? 32 : 16) | (gapComposer2.changed(textStyle) ? 256 : 128) | 222208;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                final JWECryptoParts annotatorSettings = AwaitKt.annotatorSettings(gapComposer2);
                i2 = i3 & (-7169);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-11112877, new Function6() { // from class: com.mikepenz.markdown.compose.elements.MarkdownTableKt$MarkdownTable$1
                    @Override // kotlin.jvm.functions.Function6
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i6;
                        int i7;
                        switch (i4) {
                            case 0:
                                String str2 = (String) obj;
                                ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj2;
                                float f = ((Dp) obj3).value;
                                TextStyle textStyle2 = (TextStyle) obj4;
                                Composer composer2 = (Composer) obj5;
                                int intValue = ((Number) obj6).intValue();
                                str2.getClass();
                                aSTNodeImpl2.getClass();
                                textStyle2.getClass();
                                if ((intValue & 6) == 0) {
                                    i6 = intValue | (((GapComposer) composer2).changed(str2) ? 4 : 2);
                                } else {
                                    i6 = intValue;
                                }
                                if ((intValue & 48) == 0) {
                                    i6 |= ((GapComposer) composer2).changed(aSTNodeImpl2) ? 32 : 16;
                                }
                                if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
                                    i6 |= ((GapComposer) composer2).changed(f) ? 256 : 128;
                                }
                                if ((intValue & 3072) == 0) {
                                    i6 |= ((GapComposer) composer2).changed(textStyle2) ? 2048 : 1024;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(i6 & 1, (i6 & 9363) != 9362)) {
                                    AbstractDecoder.m4203MarkdownTableHeaderOniuKJc(str2, aSTNodeImpl2, f, textStyle2, null, 0, 0, annotatorSettings, gapComposer3, i6 & 8190);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                String str3 = (String) obj;
                                ASTNodeImpl aSTNodeImpl3 = (ASTNodeImpl) obj2;
                                float f2 = ((Dp) obj3).value;
                                TextStyle textStyle3 = (TextStyle) obj4;
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Number) obj6).intValue();
                                str3.getClass();
                                aSTNodeImpl3.getClass();
                                textStyle3.getClass();
                                if ((intValue2 & 6) == 0) {
                                    i7 = intValue2 | (((GapComposer) composer3).changed(str3) ? 4 : 2);
                                } else {
                                    i7 = intValue2;
                                }
                                if ((intValue2 & 48) == 0) {
                                    i7 |= ((GapComposer) composer3).changed(aSTNodeImpl3) ? 32 : 16;
                                }
                                if ((intValue2 & MLKEMEngine.KyberPolyBytes) == 0) {
                                    i7 |= ((GapComposer) composer3).changed(f2) ? 256 : 128;
                                }
                                if ((intValue2 & 3072) == 0) {
                                    i7 |= ((GapComposer) composer3).changed(textStyle3) ? 2048 : 1024;
                                }
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(i7 & 1, (i7 & 9363) != 9362)) {
                                    AbstractDecoder.m4204MarkdownTableRowOniuKJc(str3, aSTNodeImpl3, f2, textStyle3, null, 0, 0, annotatorSettings, gapComposer4, i7 & 8190);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1442034812, new Function6() { // from class: com.mikepenz.markdown.compose.elements.MarkdownTableKt$MarkdownTable$1
                    @Override // kotlin.jvm.functions.Function6
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i6;
                        int i7;
                        switch (i5) {
                            case 0:
                                String str2 = (String) obj;
                                ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj2;
                                float f = ((Dp) obj3).value;
                                TextStyle textStyle2 = (TextStyle) obj4;
                                Composer composer2 = (Composer) obj5;
                                int intValue = ((Number) obj6).intValue();
                                str2.getClass();
                                aSTNodeImpl2.getClass();
                                textStyle2.getClass();
                                if ((intValue & 6) == 0) {
                                    i6 = intValue | (((GapComposer) composer2).changed(str2) ? 4 : 2);
                                } else {
                                    i6 = intValue;
                                }
                                if ((intValue & 48) == 0) {
                                    i6 |= ((GapComposer) composer2).changed(aSTNodeImpl2) ? 32 : 16;
                                }
                                if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
                                    i6 |= ((GapComposer) composer2).changed(f) ? 256 : 128;
                                }
                                if ((intValue & 3072) == 0) {
                                    i6 |= ((GapComposer) composer2).changed(textStyle2) ? 2048 : 1024;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(i6 & 1, (i6 & 9363) != 9362)) {
                                    AbstractDecoder.m4203MarkdownTableHeaderOniuKJc(str2, aSTNodeImpl2, f, textStyle2, null, 0, 0, annotatorSettings, gapComposer3, i6 & 8190);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                String str3 = (String) obj;
                                ASTNodeImpl aSTNodeImpl3 = (ASTNodeImpl) obj2;
                                float f2 = ((Dp) obj3).value;
                                TextStyle textStyle3 = (TextStyle) obj4;
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Number) obj6).intValue();
                                str3.getClass();
                                aSTNodeImpl3.getClass();
                                textStyle3.getClass();
                                if ((intValue2 & 6) == 0) {
                                    i7 = intValue2 | (((GapComposer) composer3).changed(str3) ? 4 : 2);
                                } else {
                                    i7 = intValue2;
                                }
                                if ((intValue2 & 48) == 0) {
                                    i7 |= ((GapComposer) composer3).changed(aSTNodeImpl3) ? 32 : 16;
                                }
                                if ((intValue2 & MLKEMEngine.KyberPolyBytes) == 0) {
                                    i7 |= ((GapComposer) composer3).changed(f2) ? 256 : 128;
                                }
                                if ((intValue2 & 3072) == 0) {
                                    i7 |= ((GapComposer) composer3).changed(textStyle3) ? 2048 : 1024;
                                }
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(i7 & 1, (i7 & 9363) != 9362)) {
                                    AbstractDecoder.m4204MarkdownTableRowOniuKJc(str3, aSTNodeImpl3, f2, textStyle3, null, 0, 0, annotatorSettings, gapComposer4, i7 & 8190);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                jWECryptoParts2 = annotatorSettings;
            } else {
                gapComposer2.skipToGroupEnd();
                i2 = i3 & (-7169);
                jWECryptoParts2 = jWECryptoParts;
                rememberComposableLambda = function6;
                rememberComposableLambda2 = function62;
            }
            gapComposer2.endDefaults();
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ComposeLocalKt.LocalMarkdownDimens;
            ((DefaultMarkdownDimens) gapComposer2.consume(dynamicProvidableCompositionLocal)).getClass();
            ((DefaultMarkdownDimens) gapComposer2.consume(dynamicProvidableCompositionLocal)).getClass();
            float f = ((DefaultMarkdownDimens) gapComposer2.consume(dynamicProvidableCompositionLocal)).tableCornerSize;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                ASTNodeImpl findChildOfType = ASTUtilKt.findChildOfType(aSTNodeImpl, GFMElementTypes.HEADER);
                if (findChildOfType != null && (children = findChildOfType.getChildren()) != null) {
                    List list = children;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((ASTNodeImpl) it.next()).f1630type, GFMTokenTypes.CELL) && (i4 = i4 + 1) < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                                throw null;
                            }
                        }
                    }
                }
                rememberedValue = Integer.valueOf(i4);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final float intValue = ((Number) rememberedValue).intValue() * 160.0f;
            gapComposer = gapComposer2;
            OffsetKt.BoxWithConstraints(SizeKt.m292widthInVpY3zN4$default(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, ((DefaultMarkdownColors) gapComposer2.consume(ComposeLocalKt.LocalMarkdownColors)).tableBackground, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f)), RecyclerView.DECELERATION_RATE, Float.NaN, 1), null, false, Expect_jvmKt.rememberComposableLambda(-1748881184, new Function3() { // from class: com.mikepenz.markdown.compose.elements.MarkdownTableKt$MarkdownTable$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier fillMaxWidth;
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue2 = ((Number) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                        float m259getMaxWidthD9Ej5fM = boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM();
                        float f2 = intValue;
                        int m1036compareTo0680j_4 = Dp.m1036compareTo0680j_4(m259getMaxWidthD9Ej5fM, f2);
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (m1036compareTo0680j_4 <= 0) {
                            gapComposer3.startReplaceGroup(1329022680);
                            fillMaxWidth = SizeKt.m284requiredWidth3ABfNKs(ImageKt.scroll$default(companion, ImageKt.rememberScrollState(gapComposer3), true, false), f2);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-1342597842);
                            gapComposer3.end(false);
                            fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        }
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer3.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m574initimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        gapComposer3.startReplaceGroup(-1525570245);
                        for (ASTNodeImpl aSTNodeImpl2 : aSTNodeImpl.getChildren()) {
                            MarkdownElementType markdownElementType = aSTNodeImpl2.f1630type;
                            boolean areEqual = Intrinsics.areEqual(markdownElementType, GFMElementTypes.HEADER);
                            String str2 = str;
                            TextStyle textStyle2 = textStyle;
                            if (areEqual) {
                                gapComposer3.startReplaceGroup(-395680056);
                                rememberComposableLambda.invoke(str2, aSTNodeImpl2, new Dp(f2), textStyle2, gapComposer3, 0);
                                gapComposer3.end(false);
                            } else if (Intrinsics.areEqual(markdownElementType, GFMElementTypes.ROW)) {
                                gapComposer3.startReplaceGroup(-395677787);
                                rememberComposableLambda2.invoke(str2, aSTNodeImpl2, new Dp(f2), textStyle2, gapComposer3, 0);
                                gapComposer3.end(false);
                            } else if (Intrinsics.areEqual(markdownElementType, GFMTokenTypes.TABLE_SEPARATOR)) {
                                gapComposer3.startReplaceGroup(-395675250);
                                ListenableFutureKt.m4197MarkdownDivideraMcp0Q(null, 0L, RecyclerView.DECELERATION_RATE, gapComposer3, 0, 7);
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(619003333);
                                gapComposer3.end(false);
                            }
                        }
                        gapComposer3.end(false);
                        gapComposer3.end(true);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, 3072, 6);
            function63 = rememberComposableLambda;
            function64 = rememberComposableLambda2;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            jWECryptoParts2 = jWECryptoParts;
            function63 = function6;
            function64 = function62;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(str, aSTNodeImpl, textStyle, jWECryptoParts2, function63, function64, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* renamed from: MarkdownTableBasicText-kKmfEb0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4202MarkdownTableBasicTextkKmfEb0(final String str, final ASTNodeImpl aSTNodeImpl, final TextStyle textStyle, final int i, int i2, final JWECryptoParts jWECryptoParts, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        GapComposer gapComposer;
        final int i7;
        RecomposeScopeImpl endRestartGroup;
        int i8;
        str.getClass();
        textStyle.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2102856305);
        if ((i3 & 6) == 0) {
            i5 = (gapComposer2.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= gapComposer2.changed(aSTNodeImpl) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changed(textStyle) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= gapComposer2.changed(i) ? 2048 : 1024;
        }
        int i9 = i4 & 16;
        if (i9 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i6 = i2;
            i5 |= gapComposer2.changed(i6) ? 16384 : PKIFailureInfo.certRevoked;
            if ((196608 & i3) == 0) {
                i5 |= gapComposer2.changed(jWECryptoParts) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if (gapComposer2.shouldExecute(i5 & 1, (74899 & i5) == 74898)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                i7 = i6;
            } else {
                gapComposer2.startDefaults();
                if ((i3 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    i8 = i9 == 0 ? i6 : 2;
                } else {
                    gapComposer2.skipToGroupEnd();
                    i8 = i6;
                }
                gapComposer2.endDefaults();
                jWECryptoParts.getClass();
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                builder.pushStyle(textStyle.spanStyle);
                AnnotatedStringKtxKt.buildMarkdownAnnotatedString(builder, str, aSTNodeImpl, jWECryptoParts);
                builder.pop();
                gapComposer = gapComposer2;
                JsonElementBuildersKt.m4212MarkdownBasicTexteIOHA4g(builder.toAnnotatedString(), textStyle, null, 0L, 0L, 0L, 0L, i8, false, i, 0, null, null, gapComposer, (i5 >> 3) & 112, ((i5 >> 6) & 896) | ((i5 << 3) & 57344), 241660);
                i7 = i8;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.mikepenz.markdown.compose.elements.MarkdownTableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractDecoder.m4202MarkdownTableBasicTextkKmfEb0(str, aSTNodeImpl, textStyle, i, i7, jWECryptoParts, (Composer) obj, Updater.updateChangedFlags(i3 | 1), i4);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        i6 = i2;
        if ((196608 & i3) == 0) {
        }
        if (gapComposer2.shouldExecute(i5 & 1, (74899 & i5) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: MarkdownTableHeader-OniuKJc, reason: not valid java name */
    public static final void m4203MarkdownTableHeaderOniuKJc(String str, ASTNodeImpl aSTNodeImpl, float f, TextStyle textStyle, BiasAlignment.Vertical vertical, int i, int i2, JWECryptoParts jWECryptoParts, Composer composer, int i3) {
        BiasAlignment.Vertical vertical2;
        int i4;
        int i5;
        BiasAlignment.Vertical vertical3;
        int i6;
        int i7;
        Modifier.Companion companion;
        boolean z;
        int i8;
        float f2;
        DefaultMarkdownComponents defaultMarkdownComponents;
        int i9;
        int i10;
        str.getClass();
        aSTNodeImpl.getClass();
        textStyle.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-592188021);
        Applier applier = gapComposer.applier;
        String str2 = str;
        int i11 = (i3 & 6) == 0 ? (gapComposer.changed(str2) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i11 |= gapComposer.changed(aSTNodeImpl) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i11 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i11 |= gapComposer.changed(textStyle) ? 2048 : 1024;
        }
        int i12 = i11 | 1794048;
        JWECryptoParts jWECryptoParts2 = jWECryptoParts;
        if ((12582912 & i3) == 0) {
            i12 |= gapComposer.changed(jWECryptoParts2) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i12 & 1, (4793491 & i12) != 4793490)) {
            gapComposer.startDefaults();
            if ((i3 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                vertical3 = Alignment.Companion.CenterVertically;
                i6 = 2;
                i7 = 1;
            } else {
                gapComposer.skipToGroupEnd();
                vertical3 = vertical;
                i7 = i;
                i6 = i2;
            }
            gapComposer.endDefaults();
            DefaultMarkdownComponents defaultMarkdownComponents2 = (DefaultMarkdownComponents) gapComposer.consume(ComposeLocalKt.LocalMarkdownComponents);
            float f3 = ((DefaultMarkdownDimens) gapComposer.consume(ComposeLocalKt.LocalMarkdownDimens)).tableCellPadding;
            DefaultMarkdownComponents defaultMarkdownComponents3 = defaultMarkdownComponents2;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier height = OffsetKt.height(SizeKt.m292widthInVpY3zN4$default(companion2, f, RecyclerView.DECELERATION_RATE, 2), IntrinsicSize.Max);
            int i13 = i12 >> 6;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical3, gapComposer, ((i13 & 896) >> 3) & 112);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, height);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            int i14 = i12;
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1548954047);
            List children = aSTNodeImpl.getChildren();
            ArrayList arrayList = new ArrayList();
            for (Object obj : children) {
                if (Intrinsics.areEqual(((ASTNodeImpl) obj).f1630type, GFMTokenTypes.CELL)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) it.next();
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m298padding3ABfNKs(companion2, f3), true);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                Iterator it2 = it;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                List children2 = aSTNodeImpl2.getChildren();
                if (!(children2 instanceof Collection) || !children2.isEmpty()) {
                    Iterator it3 = children2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.areEqual(((ASTNodeImpl) it3.next()).f1630type, MarkdownTokenTypes.IMAGE)) {
                            gapComposer.startReplaceGroup(79338401);
                            companion = companion2;
                            z = true;
                            i8 = i13;
                            DefaultMarkdownComponents defaultMarkdownComponents4 = defaultMarkdownComponents3;
                            f2 = f3;
                            MarkdownExtensionKt.MarkdownElement(aSTNodeImpl2, defaultMarkdownComponents4, str2, false, gapComposer, ((i14 << 6) & 896) | 3072, 0);
                            defaultMarkdownComponents = defaultMarkdownComponents4;
                            gapComposer.end(false);
                            i9 = i7;
                            i10 = i6;
                            break;
                        }
                        str2 = str;
                    }
                }
                defaultMarkdownComponents = defaultMarkdownComponents3;
                i8 = i13;
                companion = companion2;
                f2 = f3;
                z = true;
                gapComposer.startReplaceGroup(79493897);
                i9 = i7;
                GapComposer gapComposer2 = gapComposer;
                int i15 = i6;
                m4202MarkdownTableBasicTextkKmfEb0(str, aSTNodeImpl2, TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, FontWeight.Bold, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), i9, i15, jWECryptoParts2, gapComposer2, (i14 & 14) | (i8 & 7168) | (57344 & i8) | (458752 & i8), 0);
                i10 = i15;
                gapComposer = gapComposer2;
                gapComposer.end(false);
                gapComposer.end(z);
                str2 = str;
                jWECryptoParts2 = jWECryptoParts;
                i6 = i10;
                f3 = f2;
                i13 = i8;
                i7 = i9;
                defaultMarkdownComponents3 = defaultMarkdownComponents;
                it = it2;
                companion2 = companion;
            }
            int i16 = i7;
            gapComposer.end(false);
            gapComposer.end(true);
            i5 = i6;
            vertical2 = vertical3;
            i4 = i16;
        } else {
            gapComposer.skipToGroupEnd();
            vertical2 = vertical;
            i4 = i;
            i5 = i2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownTableKt$$ExternalSyntheticLambda1(str, aSTNodeImpl, f, textStyle, vertical2, i4, i5, jWECryptoParts, i3, 0);
        }
    }

    /* renamed from: MarkdownTableRow-OniuKJc, reason: not valid java name */
    public static final void m4204MarkdownTableRowOniuKJc(String str, ASTNodeImpl aSTNodeImpl, float f, TextStyle textStyle, BiasAlignment.Vertical vertical, int i, int i2, JWECryptoParts jWECryptoParts, Composer composer, int i3) {
        BiasAlignment.Vertical vertical2;
        int i4;
        int i5;
        BiasAlignment.Vertical vertical3;
        int i6;
        int i7;
        Modifier.Companion companion;
        boolean z;
        int i8;
        float f2;
        DefaultMarkdownComponents defaultMarkdownComponents;
        int i9;
        int i10;
        str.getClass();
        aSTNodeImpl.getClass();
        textStyle.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-740311018);
        Applier applier = gapComposer.applier;
        String str2 = str;
        int i11 = (i3 & 6) == 0 ? (gapComposer.changed(str2) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i11 |= gapComposer.changed(aSTNodeImpl) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i11 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i11 |= gapComposer.changed(textStyle) ? 2048 : 1024;
        }
        int i12 = i11 | 1794048;
        JWECryptoParts jWECryptoParts2 = jWECryptoParts;
        if ((12582912 & i3) == 0) {
            i12 |= gapComposer.changed(jWECryptoParts2) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i12 & 1, (4793491 & i12) != 4793490)) {
            gapComposer.startDefaults();
            if ((i3 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                vertical3 = Alignment.Companion.CenterVertically;
                i6 = 2;
                i7 = 1;
            } else {
                gapComposer.skipToGroupEnd();
                vertical3 = vertical;
                i7 = i;
                i6 = i2;
            }
            gapComposer.endDefaults();
            DefaultMarkdownComponents defaultMarkdownComponents2 = (DefaultMarkdownComponents) gapComposer.consume(ComposeLocalKt.LocalMarkdownComponents);
            float f3 = ((DefaultMarkdownDimens) gapComposer.consume(ComposeLocalKt.LocalMarkdownDimens)).tableCellPadding;
            DefaultMarkdownComponents defaultMarkdownComponents3 = defaultMarkdownComponents2;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(companion2, f, RecyclerView.DECELERATION_RATE, 2);
            int i13 = i12 >> 6;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical3, gapComposer, ((i13 & 896) >> 3) & 112);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m292widthInVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            int i14 = i12;
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-103887751);
            List children = aSTNodeImpl.getChildren();
            ArrayList arrayList = new ArrayList();
            for (Object obj : children) {
                if (Intrinsics.areEqual(((ASTNodeImpl) obj).f1630type, GFMTokenTypes.CELL)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) it.next();
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m298padding3ABfNKs(companion2, f3), true);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                Iterator it2 = it;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                List children2 = aSTNodeImpl2.getChildren();
                if (!(children2 instanceof Collection) || !children2.isEmpty()) {
                    Iterator it3 = children2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.areEqual(((ASTNodeImpl) it3.next()).f1630type, MarkdownTokenTypes.IMAGE)) {
                            gapComposer.startReplaceGroup(976528612);
                            companion = companion2;
                            z = true;
                            i8 = i13;
                            DefaultMarkdownComponents defaultMarkdownComponents4 = defaultMarkdownComponents3;
                            f2 = f3;
                            MarkdownExtensionKt.MarkdownElement(aSTNodeImpl2, defaultMarkdownComponents4, str2, false, gapComposer, ((i14 << 6) & 896) | 3072, 0);
                            defaultMarkdownComponents = defaultMarkdownComponents4;
                            gapComposer.end(false);
                            i9 = i7;
                            i10 = i6;
                            break;
                        }
                        str2 = str;
                    }
                }
                defaultMarkdownComponents = defaultMarkdownComponents3;
                i8 = i13;
                companion = companion2;
                f2 = f3;
                z = true;
                gapComposer.startReplaceGroup(976677877);
                i9 = i7;
                GapComposer gapComposer2 = gapComposer;
                int i15 = i6;
                m4202MarkdownTableBasicTextkKmfEb0(str, aSTNodeImpl2, textStyle, i9, i15, jWECryptoParts2, gapComposer2, (i14 & 14) | ((i14 >> 3) & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8), 0);
                i10 = i15;
                gapComposer = gapComposer2;
                gapComposer.end(false);
                gapComposer.end(z);
                str2 = str;
                jWECryptoParts2 = jWECryptoParts;
                i6 = i10;
                f3 = f2;
                i13 = i8;
                i7 = i9;
                defaultMarkdownComponents3 = defaultMarkdownComponents;
                it = it2;
                companion2 = companion;
            }
            int i16 = i7;
            gapComposer.end(false);
            gapComposer.end(true);
            i5 = i6;
            vertical2 = vertical3;
            i4 = i16;
        } else {
            gapComposer.skipToGroupEnd();
            vertical2 = vertical;
            i4 = i;
            i5 = i2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownTableKt$$ExternalSyntheticLambda1(str, aSTNodeImpl, f, textStyle, vertical2, i4, i5, jWECryptoParts, i3, 1);
        }
    }

    public static final void NewsArticle(InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel, int i, Function1 function1, Composer composer, int i2) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-64639582);
        int i3 = (gapComposer2.changedInstance(investingCryptoNewsArticleViewModel) ? 4 : 2) | i2 | (gapComposer2.changed(i) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            String str = investingCryptoNewsArticleViewModel.provider;
            String str2 = investingCryptoNewsArticleViewModel.headline;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-358130264, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(investingCryptoNewsArticleViewModel, r11), gapComposer2);
            boolean changedInstance = gapComposer2.changedInstance(investingCryptoNewsArticleViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TooltipBoxKt$$ExternalSyntheticLambda2(investingCryptoNewsArticleViewModel, 3);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            int i4 = ((i3 & 896) == 256 ? 1 : 0) | (gapComposer2.changedInstance(investingCryptoNewsArticleViewModel) ? 1 : 0) | ((i3 & 112) != 32 ? 0 : 1);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (i4 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Http2Connection$$ExternalSyntheticLambda3(function1, investingCryptoNewsArticleViewModel, i, 6);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3389CellActivityGZm5OLo(rememberComposableLambda, str, function12, (Function0) rememberedValue2, null, null, str2, null, false, 0, 0L, gapComposer, 6, 1968);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(investingCryptoNewsArticleViewModel, i, function1, i2);
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        decodeValue();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public boolean decodeBooleanElement(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return decodeBoolean();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte decodeByte();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public byte decodeByteElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i) {
        primitiveArrayDescriptor.getClass();
        return decodeByte();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        decodeValue();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public char decodeCharElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i) {
        primitiveArrayDescriptor.getClass();
        return decodeChar();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        decodeValue();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public double decodeDoubleElement(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return decodeDouble();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        decodeValue();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        decodeValue();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public float decodeFloatElement(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return decodeFloat();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Decoder decodeInlineElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i) {
        primitiveArrayDescriptor.getClass();
        return decodeInline(primitiveArrayDescriptor.getElementDescriptor(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int decodeInt();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeIntElement(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return decodeInt();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long decodeLong();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public long decodeLongElement(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return decodeLong();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        if (kSerializer.getDescriptor().isNullable() || decodeNotNullMark()) {
            return decodeSerializableValue$1(kSerializer);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        return decodeSerializableValue$1(kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short decodeShort();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public short decodeShortElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i) {
        primitiveArrayDescriptor.getClass();
        return decodeShort();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        decodeValue();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public String decodeStringElement(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return decodeString();
    }

    public void decodeValue() {
        throw new SerializationException(Reflection.factory.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }
}
