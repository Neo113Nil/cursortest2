package kotlinx.serialization;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.compose.ComposeLocalKt$$ExternalSyntheticLambda14;
import com.mikepenz.markdown.compose.MarkdownExtensionKt;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.compose.components.MarkdownComponentModel;
import com.mikepenz.markdown.compose.elements.MarkdownListKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.elements.MarkdownListKt$$ExternalSyntheticLambda6;
import com.mikepenz.markdown.compose.elements.MarkdownListKt$$ExternalSyntheticLambda8;
import com.mikepenz.markdown.compose.elements.MarkdownListKt$$ExternalSyntheticLambda9;
import com.mikepenz.markdown.model.DefaultMarkdownPadding;
import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import com.nimbusds.jose.util.X509CertUtils;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import net.idrnd.face.iad.capture.internal.s2;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.ast.ASTUtilKt;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;

/* loaded from: classes9.dex */
public abstract class PolymorphicSerializerKt {
    public static final void InvestingFinancialTile(final X509CertUtils x509CertUtils, final Function1 function1, Modifier modifier, Composer composer, final int i) {
        X509CertUtils x509CertUtils2;
        Function1 function12;
        GapComposer gapComposer;
        final Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        int i2;
        x509CertUtils.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-457788468);
        int i3 = i | (gapComposer2.changed(x509CertUtils) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            boolean z = x509CertUtils instanceof InvestingFinancialViewModel$Content;
            final Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (!z) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    function2 = new Function2(x509CertUtils, function1, companion, i, i4) { // from class: com.squareup.cash.investing.components.metrics.InvestingFinancialTileKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ X509CertUtils f$0;
                        public final /* synthetic */ Function1 f$1;
                        public final /* synthetic */ Modifier f$2;

                        {
                            this.$r8$classId = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    PolymorphicSerializerKt.InvestingFinancialTile(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    PolymorphicSerializerKt.InvestingFinancialTile(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            x509CertUtils2 = x509CertUtils;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
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
            InvestingFinancialViewModel$Content investingFinancialViewModel$Content = (InvestingFinancialViewModel$Content) x509CertUtils2;
            function12 = function1;
            ViewfinderDefaults.SectionHeader(investingFinancialViewModel$Content.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            int ordinal = investingFinancialViewModel$Content.selectedButton.ordinal();
            int i5 = i3 & 112;
            boolean z2 = i5 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            int i6 = 14;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new InviteContactsBodyKt$$ExternalSyntheticLambda5(i6, function12);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function1 function13 = (Function1) rememberedValue;
            int i7 = i3 & 14;
            boolean z3 = i7 == 4;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                i2 = 2;
                rememberedValue2 = new TooltipBoxKt$$ExternalSyntheticLambda2(x509CertUtils2, i2);
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                i2 = 2;
            }
            ModalKt.SegmentedControl(ordinal, function13, null, (Function1) rememberedValue2, gapComposer2, 0, 4);
            gapComposer = gapComposer2;
            modifier2 = companion;
            OnUndeliveredElementKt.FinancialBarGraph(investingFinancialViewModel$Content, function12, SpacerKt.m300paddingVpY3zN4$default(modifier2, 16.0f, RecyclerView.DECELERATION_RATE, i2), gapComposer, 384 | i7 | i5);
            gapComposer.end(true);
        } else {
            x509CertUtils2 = x509CertUtils;
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i8 = 1;
            final Function1 function14 = function12;
            final X509CertUtils x509CertUtils3 = x509CertUtils2;
            function2 = new Function2(x509CertUtils3, function14, modifier2, i, i8) { // from class: com.squareup.cash.investing.components.metrics.InvestingFinancialTileKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ X509CertUtils f$0;
                public final /* synthetic */ Function1 f$1;
                public final /* synthetic */ Modifier f$2;

                {
                    this.$r8$classId = i8;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            PolymorphicSerializerKt.InvestingFinancialTile(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            PolymorphicSerializerKt.InvestingFinancialTile(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void MarkdownBulletList(final String str, ASTNodeImpl aSTNodeImpl, final TextStyle textStyle, final int i, Function1 function1, Function1 function12, Composer composer, int i2) {
        Function1 function13;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-616095724);
        int i3 = i2 | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(aSTNodeImpl) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128) | (gapComposer.changed(i) ? 2048 : 1024) | 221184;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer.startDefaults();
            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(8);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function17 = (Function1) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new MarkerKt$$ExternalSyntheticLambda2(9);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                function15 = (Function1) rememberedValue2;
                function16 = function17;
            } else {
                gapComposer.skipToGroupEnd();
                function16 = function1;
                function15 = function12;
            }
            gapComposer.endDefaults();
            final ComposeLocalKt$$ExternalSyntheticLambda14 composeLocalKt$$ExternalSyntheticLambda14 = (ComposeLocalKt$$ExternalSyntheticLambda14) gapComposer.consume(ComposeLocalKt.LocalBulletListHandler);
            final float f = ((DefaultMarkdownPadding) gapComposer.consume(ComposeLocalKt.LocalMarkdownPadding)).listItemBottom;
            MarkdownListItems(str, aSTNodeImpl, i, function16, function15, Expect_jvmKt.rememberComposableLambda(2129160445, new Function5(str, i, textStyle, f) { // from class: com.mikepenz.markdown.compose.elements.MarkdownListKt$MarkdownBulletList$3
                public final /* synthetic */ String $content;
                public final /* synthetic */ float $listItemBottom;
                public final /* synthetic */ TextStyle $style;

                {
                    this.$style = textStyle;
                    this.$listItemBottom = f;
                }

                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i4;
                    int intValue = ((Number) obj2).intValue();
                    int intValue2 = ((Number) obj3).intValue();
                    ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj4;
                    Composer composer2 = (Composer) obj5;
                    int intValue3 = ((Number) obj6).intValue();
                    if ((intValue3 & 6) == 0) {
                        i4 = (((GapComposer) composer2).changed(intValue) ? 4 : 2) | intValue3;
                    } else {
                        i4 = intValue3;
                    }
                    if ((intValue3 & 48) == 0) {
                        i4 |= ((GapComposer) composer2).changed(intValue2) ? 32 : 16;
                    }
                    if ((intValue3 & MLKEMEngine.KyberPolyBytes) == 0) {
                        i4 |= ((GapComposer) composer2).changed(aSTNodeImpl2) ? 256 : 128;
                    }
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
                        MarkdownElementType markdownElementType = MarkdownTokenTypes.LIST_BULLET;
                        if (aSTNodeImpl2 != null) {
                            s2.getUnescapedTextInNode(aSTNodeImpl2, this.$content);
                        }
                        JsonElementBuildersKt.m4211MarkdownBasicTextJAgEBs0(ComposeLocalKt$$ExternalSyntheticLambda14.this.transform(markdownElementType, intValue, intValue2), this.$style, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, this.$listItemBottom, 7), 0L, 0L, 0L, 0L, 0, false, 0, 0, gapComposer2, 0, 131064);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i3 >> 3) & 896) | (i3 & 14) | 196608 | (i3 & 112) | 27648);
            function13 = function16;
            function14 = function15;
        } else {
            gapComposer.skipToGroupEnd();
            function13 = function1;
            function14 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda2(str, aSTNodeImpl, textStyle, i, function13, function14, i2, 1);
        }
    }

    public static final void MarkdownListItem(String str, ASTNodeImpl aSTNodeImpl, ASTNodeImpl aSTNodeImpl2, int i, int i2, int i3, DefaultMarkdownComponents defaultMarkdownComponents, DefaultMarkdownTypography defaultMarkdownTypography, DefaultMarkdownPadding defaultMarkdownPadding, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i4, int i5) {
        int i6;
        int i7;
        DefaultMarkdownComponents defaultMarkdownComponents2;
        int i8;
        String str2 = str;
        DefaultMarkdownTypography defaultMarkdownTypography2 = defaultMarkdownTypography;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1187627634);
        Applier applier = gapComposer.applier;
        if ((i4 & 6) == 0) {
            i6 = (gapComposer.changed(str2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= gapComposer.changed(aSTNodeImpl) ? 32 : 16;
        }
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer.changed(aSTNodeImpl2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= gapComposer.changed(i) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= gapComposer.changed(i2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i4 & 196608) == 0) {
            i6 |= gapComposer.changed(i3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= gapComposer.changed(defaultMarkdownComponents) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= gapComposer.changed(defaultMarkdownTypography2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= gapComposer.changed(defaultMarkdownPadding) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i9 = i6;
        if ((i5 & 6) == 0) {
            i7 = i5 | (gapComposer.changedInstance(function12) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i9 & 1, ((i9 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            ASTNodeImpl aSTNodeImpl3 = (ASTNodeImpl) CollectionsKt.getOrNull(1, aSTNodeImpl.getChildren());
            if (aSTNodeImpl3 == null || !Intrinsics.areEqual(aSTNodeImpl3.f1630type, GFMTokenTypes.CHECK_BOX)) {
                aSTNodeImpl3 = null;
            }
            MarkdownElementType markdownElementType = aSTNodeImpl2.f1630type;
            Object findChildOfType = Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ORDERED_LIST) ? ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.LIST_NUMBER) : Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.UNORDERED_LIST) ? ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.LIST_BULLET) : null;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = findChildOfType;
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i10 = i7;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, true, (Function1) rememberedValue), 1.0f), RecyclerView.DECELERATION_RATE, defaultMarkdownPadding.listItemTop, RecyclerView.DECELERATION_RATE, defaultMarkdownPadding.listItemBottom, 5);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifier = (Modifier) function1.invoke(rowScopeInstance);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (aSTNodeImpl3 != null) {
                gapComposer.startReplaceGroup(-1636008968);
                defaultMarkdownComponents2 = defaultMarkdownComponents;
                i8 = 0;
                defaultMarkdownComponents2.checkbox.invoke(new MarkdownComponentModel(str2, aSTNodeImpl3, defaultMarkdownTypography2, Tags.persistentMapOf(new Pair("markdown_list_depth", Integer.valueOf(i3 + 1)))), gapComposer, 0);
                gapComposer.end(false);
            } else {
                defaultMarkdownComponents2 = defaultMarkdownComponents;
                gapComposer.startReplaceGroup(-1635656746);
                composableLambdaImpl.invoke(Integer.valueOf(i), Integer.valueOf(i2), obj, gapComposer, Integer.valueOf(((i9 >> 9) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i10 << 6) & 7168)));
                i8 = 0;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            Modifier modifier2 = (Modifier) function12.invoke(rowScopeInstance);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, i8);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, modifier2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            gapComposer.startReplaceGroup(1146309990);
            Iterator it = aSTNodeImpl.getChildren().iterator();
            while (it.hasNext()) {
                int i11 = i9 >> 9;
                MarkdownNestedListItem((ASTNodeImpl) it.next(), str2, i3, defaultMarkdownComponents2, defaultMarkdownTypography2, gapComposer, (i11 & 57344) | ((i9 << 3) & 112) | (i11 & 896) | (i11 & 7168));
                str2 = str;
                defaultMarkdownComponents2 = defaultMarkdownComponents;
                defaultMarkdownTypography2 = defaultMarkdownTypography;
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda8(str, aSTNodeImpl, aSTNodeImpl2, i, i2, i3, defaultMarkdownComponents, defaultMarkdownTypography, defaultMarkdownPadding, function1, function12, composableLambdaImpl, i4, i5, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarkdownListItems(String str, ASTNodeImpl aSTNodeImpl, int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        boolean z;
        int i3;
        DefaultMarkdownTypography defaultMarkdownTypography;
        boolean z2;
        DefaultMarkdownPadding defaultMarkdownPadding;
        MarkdownElementType markdownElementType;
        String unescapedTextInNode;
        String str2 = str;
        ASTNodeImpl aSTNodeImpl2 = aSTNodeImpl;
        MarkdownElementType markdownElementType2 = MarkdownTokenTypes.LIST_ITEM;
        str2.getClass();
        aSTNodeImpl2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-782284046);
        int i4 = (i2 & 6) == 0 ? (gapComposer.changed(str2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changed(aSTNodeImpl2) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(i) ? 256 : 128;
        }
        Function1 function13 = function1;
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer.changedInstance(function13) ? 2048 : 1024;
        }
        Function1 function14 = function12;
        if ((i2 & 24576) == 0) {
            i4 |= gapComposer.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked;
        }
        ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
        if ((196608 & i2) == 0) {
            i4 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i5 = i4;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 74899) != 74898)) {
            DefaultMarkdownPadding defaultMarkdownPadding2 = (DefaultMarkdownPadding) gapComposer.consume(ComposeLocalKt.LocalMarkdownPadding);
            DefaultMarkdownComponents defaultMarkdownComponents = (DefaultMarkdownComponents) gapComposer.consume(ComposeLocalKt.LocalMarkdownComponents);
            DefaultMarkdownTypography defaultMarkdownTypography2 = (DefaultMarkdownTypography) gapComposer.consume(ComposeLocalKt.LocalMarkdownTypography);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, defaultMarkdownPadding2.listIndent * i, 4.0f, RecyclerView.DECELERATION_RATE, 4.0f, 4);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            DefaultMarkdownPadding defaultMarkdownPadding3 = defaultMarkdownPadding2;
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ASTNodeImpl findChildOfType = ASTUtilKt.findChildOfType(aSTNodeImpl2, markdownElementType2);
            if (findChildOfType == null || (unescapedTextInNode = s2.getUnescapedTextInNode(findChildOfType, str2)) == null) {
                z = false;
            } else {
                int length = unescapedTextInNode.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        z = false;
                        break;
                    } else {
                        if (!Character.isDigit(unescapedTextInNode.charAt(i6))) {
                            z = false;
                            unescapedTextInNode = unescapedTextInNode.substring(0, i6);
                            break;
                        }
                        i6++;
                    }
                }
                Integer intOrNull = StringsKt.toIntOrNull(unescapedTextInNode);
                if (intOrNull != null) {
                    i3 = intOrNull.intValue();
                    gapComposer.startReplaceGroup(1054034894);
                    int i7 = i3;
                    ?? r3 = z;
                    for (ASTNodeImpl aSTNodeImpl3 : aSTNodeImpl2.getChildren()) {
                        if (Intrinsics.areEqual(aSTNodeImpl3.f1630type, markdownElementType2)) {
                            gapComposer.startReplaceGroup(909500226);
                            z2 = z;
                            defaultMarkdownPadding = defaultMarkdownPadding3;
                            markdownElementType = markdownElementType2;
                            defaultMarkdownTypography = defaultMarkdownTypography2;
                            MarkdownListItem(str2, aSTNodeImpl3, aSTNodeImpl2, r3, i7, i, defaultMarkdownComponents, defaultMarkdownTypography, defaultMarkdownPadding, function13, function14, composableLambdaImpl2, gapComposer, ((i5 << 18) & 1879048192) | (i5 & 14) | ((i5 << 3) & 896) | ((i5 << 9) & 458752), (i5 >> 12) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                            r3++;
                            gapComposer.end(z2);
                        } else {
                            defaultMarkdownTypography = defaultMarkdownTypography2;
                            z2 = z;
                            defaultMarkdownPadding = defaultMarkdownPadding3;
                            markdownElementType = markdownElementType2;
                            gapComposer.startReplaceGroup(910095085);
                            gapComposer.end(z2);
                        }
                        str2 = str;
                        aSTNodeImpl2 = aSTNodeImpl;
                        function13 = function1;
                        function14 = function12;
                        composableLambdaImpl2 = composableLambdaImpl;
                        defaultMarkdownTypography2 = defaultMarkdownTypography;
                        z = z2;
                        markdownElementType2 = markdownElementType;
                        defaultMarkdownPadding3 = defaultMarkdownPadding;
                        r3 = r3;
                    }
                    gapComposer.end(z);
                    gapComposer.end(true);
                }
            }
            i3 = 1;
            gapComposer.startReplaceGroup(1054034894);
            int i72 = i3;
            ?? r32 = z;
            while (r18.hasNext()) {
            }
            gapComposer.end(z);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda6(str, aSTNodeImpl, i, function1, function12, composableLambdaImpl, i2, 0);
        }
    }

    public static final void MarkdownNestedListItem(ASTNodeImpl aSTNodeImpl, String str, int i, DefaultMarkdownComponents defaultMarkdownComponents, DefaultMarkdownTypography defaultMarkdownTypography, Composer composer, int i2) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-878038875);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(aSTNodeImpl) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changed(defaultMarkdownComponents) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer.changed(defaultMarkdownTypography) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            MarkdownElementType markdownElementType = aSTNodeImpl.f1630type;
            if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ORDERED_LIST)) {
                gapComposer.startReplaceGroup(-1305047211);
                defaultMarkdownComponents.orderedList.invoke(new MarkdownComponentModel(str, aSTNodeImpl, defaultMarkdownTypography, Tags.persistentMapOf(new Pair("markdown_list_depth", Integer.valueOf(i + 1)))), gapComposer, 0);
                gapComposer.end(false);
            } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.UNORDERED_LIST)) {
                gapComposer.startReplaceGroup(-1304693997);
                defaultMarkdownComponents.unorderedList.invoke(new MarkdownComponentModel(str, aSTNodeImpl, defaultMarkdownTypography, Tags.persistentMapOf(new Pair("markdown_list_depth", Integer.valueOf(i + 1)))), gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1304352439);
                MarkdownExtensionKt.MarkdownElement(aSTNodeImpl, defaultMarkdownComponents, str, false, gapComposer, (i3 & 14) | 3072 | ((i3 >> 6) & 112) | ((i3 << 3) & 896), 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda9(aSTNodeImpl, str, i, defaultMarkdownComponents, defaultMarkdownTypography, i2, 0);
        }
    }

    public static final void MarkdownOrderedList(final String str, ASTNodeImpl aSTNodeImpl, final TextStyle textStyle, final int i, Function1 function1, Function1 function12, Composer composer, int i2) {
        Function1 function13;
        GapComposer gapComposer;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-930130971);
        int i3 = i2 | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(aSTNodeImpl) ? 32 : 16) | (gapComposer2.changed(textStyle) ? 256 : 128) | (gapComposer2.changed(i) ? 2048 : 1024) | 221184;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(6);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                function15 = (Function1) rememberedValue;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new MarkerKt$$ExternalSyntheticLambda2(7);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                function16 = (Function1) rememberedValue2;
            } else {
                gapComposer2.skipToGroupEnd();
                function15 = function1;
                function16 = function12;
            }
            gapComposer2.endDefaults();
            final ComposeLocalKt$$ExternalSyntheticLambda14 composeLocalKt$$ExternalSyntheticLambda14 = (ComposeLocalKt$$ExternalSyntheticLambda14) gapComposer2.consume(ComposeLocalKt.LocalOrderedListHandler);
            Function1 function17 = function15;
            Function1 function18 = function16;
            MarkdownListItems(str, aSTNodeImpl, i, function17, function18, Expect_jvmKt.rememberComposableLambda(-1726535652, new Function5(str, i, textStyle) { // from class: com.mikepenz.markdown.compose.elements.MarkdownListKt$MarkdownOrderedList$3
                public final /* synthetic */ String $content;
                public final /* synthetic */ TextStyle $style;

                {
                    this.$style = textStyle;
                }

                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i4;
                    int intValue = ((Number) obj2).intValue();
                    int intValue2 = ((Number) obj3).intValue();
                    ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj4;
                    Composer composer2 = (Composer) obj5;
                    int intValue3 = ((Number) obj6).intValue();
                    if ((intValue3 & 6) == 0) {
                        i4 = (((GapComposer) composer2).changed(intValue) ? 4 : 2) | intValue3;
                    } else {
                        i4 = intValue3;
                    }
                    if ((intValue3 & 48) == 0) {
                        i4 |= ((GapComposer) composer2).changed(intValue2) ? 32 : 16;
                    }
                    if ((intValue3 & MLKEMEngine.KyberPolyBytes) == 0) {
                        i4 |= ((GapComposer) composer2).changed(aSTNodeImpl2) ? 256 : 128;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
                        MarkdownElementType markdownElementType = MarkdownTokenTypes.LIST_NUMBER;
                        if (aSTNodeImpl2 != null) {
                            s2.getUnescapedTextInNode(aSTNodeImpl2, this.$content);
                        }
                        JsonElementBuildersKt.m4211MarkdownBasicTextJAgEBs0(ComposeLocalKt$$ExternalSyntheticLambda14.this.transform(markdownElementType, intValue, intValue2), this.$style, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, gapComposer3, 0, 131068);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer2, ((i3 >> 3) & 896) | (i3 & 14) | 196608 | (i3 & 112) | 27648);
            function13 = function17;
            gapComposer = gapComposer2;
            function14 = function18;
        } else {
            gapComposer2.skipToGroupEnd();
            function13 = function1;
            gapComposer = gapComposer2;
            function14 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda2(str, aSTNodeImpl, textStyle, i, function13, function14, i2, 0);
        }
    }

    public static final KSerializer findPolymorphicSerializer(AbstractPolymorphicSerializer abstractPolymorphicSerializer, Encoder encoder, Object obj) {
        abstractPolymorphicSerializer.getClass();
        obj.getClass();
        KSerializer findPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(encoder, obj);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(obj.getClass());
        KClass baseClass = abstractPolymorphicSerializer.getBaseClass();
        baseClass.getClass();
        String simpleName = orCreateKotlinClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(orCreateKotlinClass);
        }
        TuplesKt.throwSubtypeNotRegistered(simpleName, baseClass);
        throw null;
    }

    public static final int getListDepth(MarkdownComponentModel markdownComponentModel) {
        markdownComponentModel.getClass();
        Object obj = markdownComponentModel.extra.get("markdown_list_depth");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final KSerializer findPolymorphicSerializer(AbstractPolymorphicSerializer abstractPolymorphicSerializer, CompositeDecoder compositeDecoder, String str) {
        abstractPolymorphicSerializer.getClass();
        KSerializer findPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(compositeDecoder, str);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        TuplesKt.throwSubtypeNotRegistered(str, abstractPolymorphicSerializer.getBaseClass());
        throw null;
    }
}
