package net.idrnd.misnap.iad;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.viewmodels.InvestingAboutContentModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public abstract class Result {

    /* loaded from: classes9.dex */
    public final class Failure extends Result {
        public final Object a;

        public Failure(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.a.equals(((Failure) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(error=", ")", this.a);
        }
    }

    /* loaded from: classes9.dex */
    public final class Success extends Result {
        public final Object a;

        public Success(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.a.equals(((Success) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(value=", ")", this.a);
        }
    }

    public static final void InvestingAboutTile(Modifier modifier, final InvestingAboutContentModel investingAboutContentModel, Composer composer, int i) {
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1605330010);
        int i2 = i | 6 | (gapComposer.changed(investingAboutContentModel) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
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
            ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(-1317145021, new Function2() { // from class: com.squareup.cash.investing.components.stock.details.InvestingAboutTileKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    InvestingAboutContentModel investingAboutContentModel2 = investingAboutContentModel;
                    int i6 = 2;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, investingAboutContentModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str = investingAboutContentModel2.content;
                                Object[] objArr = new Object[0];
                                Object rememberedValue = gapComposer3.rememberedValue();
                                Object obj3 = Composer.Companion.Empty;
                                if (rememberedValue == obj3) {
                                    rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda0(14);
                                    gapComposer3.updateRememberedValue(rememberedValue);
                                }
                                MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer3, 48);
                                Object[] objArr2 = new Object[0];
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (rememberedValue2 == obj3) {
                                    rememberedValue2 = new ClusterItemKt$$ExternalSyntheticLambda0(15);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer3, 48);
                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                if (rememberedValue3 == obj3) {
                                    rememberedValue3 = Updater.mutableStateOf$default(new AnnotatedString(str));
                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                }
                                MutableState mutableState3 = (MutableState) rememberedValue3;
                                String stringResource = Room.stringResource(gapComposer3, R.string.investing_components_read_more);
                                String stringResource2 = Room.stringResource(gapComposer3, R.string.investing_components_show_less_arcade);
                                Boolean bool = (Boolean) mutableState.getValue();
                                bool.booleanValue();
                                boolean changed = gapComposer3.changed(str) | gapComposer3.changed(mutableState) | gapComposer3.changed(stringResource2) | gapComposer3.changed(stringResource) | gapComposer3.changed(mutableState2);
                                Object rememberedValue4 = gapComposer3.rememberedValue();
                                if (changed || rememberedValue4 == obj3) {
                                    rememberedValue4 = new NavHostKt$NavHost$33$1(str, mutableState3, mutableState, stringResource2, stringResource, mutableState2, (Continuation) null, 10);
                                    gapComposer3.updateRememberedValue(rememberedValue4);
                                }
                                Updater.LaunchedEffect(gapComposer3, bool, (Function2) rememberedValue4);
                                boolean changed2 = gapComposer3.changed(str);
                                Object rememberedValue5 = gapComposer3.rememberedValue();
                                if (changed2 || rememberedValue5 == obj3) {
                                    rememberedValue5 = new ClusterItemKt$$ExternalSyntheticLambda3(str, 1);
                                    gapComposer3.updateRememberedValue(rememberedValue5);
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue5);
                                boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                                String str2 = ((Boolean) mutableState.getValue()).booleanValue() ? stringResource2 : stringResource;
                                boolean changed3 = gapComposer3.changed(mutableState);
                                Object rememberedValue6 = gapComposer3.rememberedValue();
                                if (changed3 || rememberedValue6 == obj3) {
                                    rememberedValue6 = new CashMapViewKt$$ExternalSyntheticLambda2(i6, mutableState);
                                    gapComposer3.updateRememberedValue(rememberedValue6);
                                }
                                Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(ImageKt.m183clickableoSLSa3U$default(semantics, booleanValue, str2, null, (Function0) rememberedValue6, 12), null, 3);
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer3, animateContentSize$default, (AnnotatedString) mutableState3.getValue(), textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Modifier) null, (Function2) null, (Function0) null, Expect_jvmKt.rememberComposableLambda(-574327873, new Function2() { // from class: com.squareup.cash.investing.components.stock.details.InvestingAboutTileKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    InvestingAboutContentModel investingAboutContentModel2 = investingAboutContentModel;
                    int i6 = 2;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, investingAboutContentModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str = investingAboutContentModel2.content;
                                Object[] objArr = new Object[0];
                                Object rememberedValue = gapComposer3.rememberedValue();
                                Object obj3 = Composer.Companion.Empty;
                                if (rememberedValue == obj3) {
                                    rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda0(14);
                                    gapComposer3.updateRememberedValue(rememberedValue);
                                }
                                MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer3, 48);
                                Object[] objArr2 = new Object[0];
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (rememberedValue2 == obj3) {
                                    rememberedValue2 = new ClusterItemKt$$ExternalSyntheticLambda0(15);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer3, 48);
                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                if (rememberedValue3 == obj3) {
                                    rememberedValue3 = Updater.mutableStateOf$default(new AnnotatedString(str));
                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                }
                                MutableState mutableState3 = (MutableState) rememberedValue3;
                                String stringResource = Room.stringResource(gapComposer3, R.string.investing_components_read_more);
                                String stringResource2 = Room.stringResource(gapComposer3, R.string.investing_components_show_less_arcade);
                                Boolean bool = (Boolean) mutableState.getValue();
                                bool.booleanValue();
                                boolean changed = gapComposer3.changed(str) | gapComposer3.changed(mutableState) | gapComposer3.changed(stringResource2) | gapComposer3.changed(stringResource) | gapComposer3.changed(mutableState2);
                                Object rememberedValue4 = gapComposer3.rememberedValue();
                                if (changed || rememberedValue4 == obj3) {
                                    rememberedValue4 = new NavHostKt$NavHost$33$1(str, mutableState3, mutableState, stringResource2, stringResource, mutableState2, (Continuation) null, 10);
                                    gapComposer3.updateRememberedValue(rememberedValue4);
                                }
                                Updater.LaunchedEffect(gapComposer3, bool, (Function2) rememberedValue4);
                                boolean changed2 = gapComposer3.changed(str);
                                Object rememberedValue5 = gapComposer3.rememberedValue();
                                if (changed2 || rememberedValue5 == obj3) {
                                    rememberedValue5 = new ClusterItemKt$$ExternalSyntheticLambda3(str, 1);
                                    gapComposer3.updateRememberedValue(rememberedValue5);
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue5);
                                boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                                String str2 = ((Boolean) mutableState.getValue()).booleanValue() ? stringResource2 : stringResource;
                                boolean changed3 = gapComposer3.changed(mutableState);
                                Object rememberedValue6 = gapComposer3.rememberedValue();
                                if (changed3 || rememberedValue6 == obj3) {
                                    rememberedValue6 = new CashMapViewKt$$ExternalSyntheticLambda2(i6, mutableState);
                                    gapComposer3.updateRememberedValue(rememberedValue6);
                                }
                                Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(ImageKt.m183clickableoSLSa3U$default(semantics, booleanValue, str2, null, (Function0) rememberedValue6, 12), null, 3);
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer3, animateContentSize$default, (AnnotatedString) mutableState3.getValue(), textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 24582, 14);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ListUnorderedKt.ListUnordered(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1), (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-903083594, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(investingAboutContentModel, 5), gapComposer), gapComposer, 196608, 30);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(modifier, investingAboutContentModel, i, 8);
        }
    }
}
