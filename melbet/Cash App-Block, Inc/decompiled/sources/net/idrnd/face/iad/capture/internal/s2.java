package net.idrnd.face.iad.capture.internal;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.utils.EntityConverter;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt;
import com.squareup.cash.investing.components.search.InvestingSearchViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.search.FilterGroupCarousel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$4$1$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.ast.ASTUtilKt;
import org.intellij.markdown.ast.CompositeASTNode;
import org.intellij.markdown.ast.LeafASTNode;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;

/* loaded from: classes6.dex */
public abstract class s2 {
    public static byte[] a;

    public static final void InvestingSearch(String str, InvestingSearchViewModel investingSearchViewModel, Function1 function1, Function1 function12, RealImageLoader realImageLoader, Function0 function0, Function1 function13, FocusRequester focusRequester, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1361426569);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(investingSearchViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function12) ? 2048 : 1024) | (gapComposer.changedInstance(realImageLoader) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function13) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z = investingSearchViewModel.showKeypad;
            FilterGroupCarousel filterGroupCarousel = investingSearchViewModel.filterGroupCarousel;
            int i3 = i2 >> 3;
            int i4 = i3 & 112;
            int i5 = (i2 & 14) | i4 | (i3 & 896);
            int i6 = i2 >> 9;
            SearchToolBar(str, function1, function12, function13, focusRequester, z, gapComposer, i5 | (i6 & 7168) | 24576);
            gapComposer = gapComposer;
            if (filterGroupCarousel.filterGroups.isEmpty()) {
                gapComposer.startReplaceGroup(-571205963);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-571298219);
                InvestingCategoryDetailKt.InvestingFilterGroupCarousel(filterGroupCarousel, function1, gapComposer, 8 | i4);
                gapComposer.end(false);
            }
            SearchResults(investingSearchViewModel.results, function1, function0, realImageLoader, gapComposer, i4 | (i6 & 896) | (i3 & 7168));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(str, investingSearchViewModel, function1, function12, realImageLoader, function0, function13, focusRequester, i);
        }
    }

    public static final void SearchResults(List list, Function1 function1, Function0 function0, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2115374072);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            boolean isScrollInProgress = rememberLazyListState.scrollableState.isScrollInProgress();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (isScrollInProgress) {
                gapComposer.startReplaceGroup(946390765);
                Unit unit = Unit.INSTANCE;
                boolean z = (i2 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new CardTransitionKt$sceneCache$4$1$1(function0, null, 3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(946434010);
                gapComposer.end(false);
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            boolean changedInstance = gapComposer.changedInstance(list) | ((i2 & 112) == 32) | gapComposer.changedInstance(realImageLoader);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new InvestingSearchViewKt$$ExternalSyntheticLambda1(list, function1, realImageLoader);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(m302paddingqDBjuR0$default, rememberLazyListState, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, 6, 508);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(list, function1, function0, realImageLoader, i);
        }
    }

    public static final void SearchToolBar(String str, Function1 function1, Function1 function12, Function1 function13, FocusRequester focusRequester, boolean z, Composer composer, int i) {
        Function1 function14;
        Function1 function15;
        GapComposer gapComposer;
        Function1 function16 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(279982520);
        int i2 = 4;
        int i3 = (gapComposer2.changed(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function16) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function14 = function12;
            i3 |= gapComposer2.changedInstance(function14) ? 256 : 128;
        } else {
            function14 = function12;
        }
        if ((i & 3072) == 0) {
            function15 = function13;
            i3 |= gapComposer2.changedInstance(function15) ? 2048 : 1024;
        } else {
            function15 = function13;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changed(focusRequester) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i4 = (gapComposer2.changed(z) ? 131072 : 65536) | i3;
        if (gapComposer2.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            Unit unit = Unit.INSTANCE;
            boolean z2 = ((57344 & i4) == 16384) | ((458752 & i4) == 131072);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealBadger2$scheduleBadgeClearingWork$3(z, focusRequester, (Continuation) null, i2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue);
            CashMapViewKt$$ExternalSyntheticLambda15 cashMapViewKt$$ExternalSyntheticLambda15 = new CashMapViewKt$$ExternalSyntheticLambda15(5, focusRequester, str, function14, function15, function16);
            function16 = function16;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2061331608, cashMapViewKt$$ExternalSyntheticLambda15, gapComposer2);
            NavigationIconType navigationIconType = NavigationIconType.BACK;
            boolean z3 = (i4 & 112) == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(7, function16);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            KeypadKt.m3653Toolbar7ZsnBMk(rememberComposableLambda, null, navigationIconType, 0L, (Function0) rememberedValue2, null, gapComposer, 3078, EnumC0170g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(str, function16, function12, function13, focusRequester, z, i, 7);
        }
    }

    public static final ASTNodeImpl findChildOfTypeRecursive(ASTNodeImpl aSTNodeImpl, MarkdownElementType markdownElementType) {
        aSTNodeImpl.getClass();
        markdownElementType.getClass();
        for (ASTNodeImpl aSTNodeImpl2 : aSTNodeImpl.getChildren()) {
            if (Intrinsics.areEqual(aSTNodeImpl2.f1630type, markdownElementType)) {
                return aSTNodeImpl2;
            }
            ASTNodeImpl findChildOfTypeRecursive = findChildOfTypeRecursive(aSTNodeImpl2, markdownElementType);
            if (findChildOfTypeRecursive != null) {
                return findChildOfTypeRecursive;
            }
        }
        return null;
    }

    public static final String getUnescapedTextInNode(ASTNodeImpl aSTNodeImpl, CharSequence charSequence) {
        aSTNodeImpl.getClass();
        charSequence.getClass();
        String obj = ASTUtilKt.getTextInNode(aSTNodeImpl, charSequence).toString();
        Regex regex = EntityConverter.REGEX_ESCAPES;
        obj.getClass();
        return EntityConverter.REGEX_ESCAPES.replace(obj, new MarkerKt$$ExternalSyntheticLambda2(13));
    }

    public static final List innerList(List list) {
        list.getClass();
        return list.subList(1, list.size() - 1);
    }

    public static void lookupLinkDefinition$default(LinkedHashMap linkedHashMap, ASTNodeImpl aSTNodeImpl, String str, boolean z, int i) {
        Object obj;
        String unescapedTextInNode;
        MarkdownElementType markdownElementType = MarkdownTokenTypes.AUTOLINK$1;
        boolean z2 = true;
        if ((i & 8) != 0) {
            z = true;
        }
        aSTNodeImpl.getClass();
        str.getClass();
        MarkdownElementType markdownElementType2 = aSTNodeImpl.f1630type;
        String str2 = null;
        if (Intrinsics.areEqual(markdownElementType2, MarkdownTokenTypes.LINK_DEFINITION)) {
            ASTNodeImpl findChildOfType = ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.LINK_LABEL);
            if (findChildOfType != null) {
                unescapedTextInNode = getUnescapedTextInNode(findChildOfType, str);
                z2 = false;
            }
            z2 = false;
            unescapedTextInNode = null;
        } else {
            if (Intrinsics.areEqual(markdownElementType2, MarkdownTokenTypes.INLINE_LINK)) {
                ASTNodeImpl findChildOfType2 = ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.LINK_TEXT);
                if (findChildOfType2 != null) {
                    unescapedTextInNode = getUnescapedTextInNode(findChildOfType2, str);
                    z2 = false;
                }
            } else if (Intrinsics.areEqual(markdownElementType2, markdownElementType)) {
                Iterator it = aSTNodeImpl.getChildren().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.areEqual(((ASTNodeImpl) obj).f1630type.name, markdownElementType.name)) {
                            break;
                        }
                    }
                }
                ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj;
                if (aSTNodeImpl2 == null) {
                    aSTNodeImpl2 = aSTNodeImpl;
                }
                unescapedTextInNode = getUnescapedTextInNode(aSTNodeImpl2, str);
            }
            z2 = false;
            unescapedTextInNode = null;
        }
        if (unescapedTextInNode != null) {
            if (z2) {
                str2 = unescapedTextInNode;
            } else {
                ASTNodeImpl findChildOfType3 = ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.LINK_DESTINATION);
                if (findChildOfType3 != null) {
                    str2 = getUnescapedTextInNode(findChildOfType3, str);
                }
            }
            linkedHashMap.put(unescapedTextInNode, str2);
        }
        if (z) {
            Iterator it2 = aSTNodeImpl.getChildren().iterator();
            while (it2.hasNext()) {
                lookupLinkDefinition$default(linkedHashMap, (ASTNodeImpl) it2.next(), str, false, 24);
            }
        }
    }

    public static final ArrayList mapAutoLinkToType(List list, MarkdownElementType markdownElementType) {
        ASTNodeImpl compositeASTNode;
        list.getClass();
        markdownElementType.getClass();
        List<ASTNodeImpl> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (ASTNodeImpl aSTNodeImpl : list2) {
            if (aSTNodeImpl instanceof LeafASTNode) {
                aSTNodeImpl = (LeafASTNode) aSTNodeImpl;
                MarkdownElementType markdownElementType2 = aSTNodeImpl.f1630type;
                if (Intrinsics.areEqual(markdownElementType2, GFMTokenTypes.GFM_AUTOLINK) || Intrinsics.areEqual(markdownElementType2, MarkdownTokenTypes.AUTOLINK$1)) {
                    compositeASTNode = new LeafASTNode(markdownElementType, aSTNodeImpl.startOffset, aSTNodeImpl.endOffset);
                    aSTNodeImpl = compositeASTNode;
                }
            } else if (aSTNodeImpl instanceof CompositeASTNode) {
                CompositeASTNode compositeASTNode2 = (CompositeASTNode) aSTNodeImpl;
                compositeASTNode = new CompositeASTNode(mapAutoLinkToType(compositeASTNode2.children, markdownElementType), compositeASTNode2.f1630type);
                aSTNodeImpl = compositeASTNode;
            }
            arrayList.add(aSTNodeImpl);
        }
        return arrayList;
    }
}
