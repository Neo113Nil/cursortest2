package com.stripe.android.financialconnections.ui.components;

import android.text.Annotation;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.AppBarDefaults;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.DefaultButtonColors;
import androidx.compose.material.DefaultButtonElevation;
import androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.SwipeToDismissBoxKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SweepGradient;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavHostController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda2;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda47;
import com.squareup.cash.bitcoin.views.BitcoinDisplayCurrencyViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.offers.views.OffersFormattedDetailKt$$ExternalSyntheticLambda5;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetKt;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.theme.ColorKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutInfo;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.navigation.NavigationEffectsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public abstract class TextKt {

    /* renamed from: lambda$-1318334173, reason: not valid java name */
    public static final ComposableLambdaImpl f822lambda$1318334173 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda5(20), false, -1318334173);

    /* renamed from: lambda$-1910988991, reason: not valid java name */
    public static final ComposableLambdaImpl f823lambda$1910988991 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda5(21), false, -1910988991);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StringAnnotation.values().length];
            try {
                StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StringAnnotation stringAnnotation2 = StringAnnotation.CLICKABLE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* renamed from: AnnotatedText-rm0N8CA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4020AnnotatedTextrm0N8CA(TextResource textResource, Function1 function1, TextStyle textStyle, Modifier modifier, Map map, int i, int i2, Composer composer, int i3, int i4) {
        int i5;
        Modifier modifier2;
        Map map2;
        int i6;
        int i7;
        Modifier modifier3;
        Map map3;
        int i8;
        RecomposeScopeImpl endRestartGroup;
        Map map4;
        int i9;
        int i10;
        Modifier modifier4;
        Map map5;
        int i11;
        Annotation annotation;
        Map map6;
        int i12;
        int i13;
        int i14;
        Annotation annotation2;
        Object obj;
        TextLinkStyles textLinkStyles;
        int i15;
        textResource.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1670114880);
        if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? gapComposer.changed(textResource) : gapComposer.changedInstance(textResource) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changed(textStyle) ? 256 : 128;
        }
        int i16 = i4 & 8;
        if (i16 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            modifier2 = modifier;
            i5 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            if ((i3 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    map2 = map;
                    if (gapComposer.changedInstance(map2)) {
                        i15 = 16384;
                        i5 |= i15;
                    }
                } else {
                    map2 = map;
                }
                i15 = PKIFailureInfo.certRevoked;
                i5 |= i15;
            } else {
                map2 = map;
            }
            i6 = i5 | 1769472;
            if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) == 599186)) {
                gapComposer.skipToGroupEnd();
                i7 = i;
                modifier3 = modifier2;
                map3 = map2;
                i8 = i2;
            } else {
                gapComposer.startDefaults();
                if ((i3 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    Modifier modifier5 = i16 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i4 & 16) != 0) {
                        map4 = MapsKt__MapsJVMKt.mapOf(new Pair(StringAnnotation.CLICKABLE, SpanStyle.m973copyGSF8kmg$default(textStyle.spanStyle, 0L, null, 0L, 61439)));
                        i6 &= -57345;
                    } else {
                        map4 = map2;
                    }
                    i9 = Integer.MAX_VALUE;
                    i10 = i6;
                    modifier4 = modifier5;
                    map5 = map4;
                    i8 = 1;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i4 & 16) != 0) {
                        i6 &= -57345;
                    }
                    i9 = i;
                    map5 = map2;
                    i10 = i6;
                    modifier4 = modifier2;
                    i8 = i2;
                }
                gapComposer.endDefaults();
                long j = ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault;
                int i17 = i10 >> 6;
                CharSequence text = textResource.toText(gapComposer, ((i10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i17 & 896)) & 14);
                text.getClass();
                map5.getClass();
                SpannedString spannedString = new SpannedString(text);
                String spannedString2 = spannedString.toString();
                spannedString2.getClass();
                AnnotatedString.Builder builder = new AnnotatedString.Builder(spannedString2);
                int i18 = 0;
                Object[] spans = spannedString.getSpans(0, spannedString.length(), Object.class);
                int length = spans.length;
                while (i18 < length) {
                    Object[] objArr = spans;
                    Object obj2 = objArr[i18];
                    int i19 = i18;
                    int spanStart = spannedString.getSpanStart(obj2);
                    int spanEnd = spannedString.getSpanEnd(obj2);
                    Modifier modifier6 = modifier4;
                    if (obj2 instanceof StyleSpan) {
                        int style = ((StyleSpan) obj2).getStyle();
                        if (style == 0 || style != 1) {
                            i11 = i17;
                            annotation = null;
                        } else {
                            StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
                            i11 = i17;
                            annotation = new Annotation("bold", "");
                        }
                    } else {
                        i11 = i17;
                        if (obj2 instanceof URLSpan) {
                            StringAnnotation stringAnnotation2 = StringAnnotation.CLICKABLE;
                            annotation = new Annotation("clickable", ((URLSpan) obj2).getURL());
                        } else {
                            if (obj2 instanceof Annotation) {
                                annotation = (Annotation) obj2;
                            }
                            annotation = null;
                        }
                    }
                    if (annotation != null) {
                        Iterator it = StringAnnotation.$ENTRIES.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                annotation2 = annotation;
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            annotation2 = annotation;
                            Iterator it2 = it;
                            if (((StringAnnotation) obj).value.equals(annotation2.getKey())) {
                                break;
                            }
                            annotation = annotation2;
                            it = it2;
                        }
                        StringAnnotation stringAnnotation3 = (StringAnnotation) obj;
                        SpanStyle spanStyle = (SpanStyle) map5.get(stringAnnotation3);
                        int i20 = stringAnnotation3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stringAnnotation3.ordinal()];
                        if (i20 == -1) {
                            map6 = map5;
                        } else if (i20 == 1) {
                            String value = annotation2.getValue();
                            value.getClass();
                            if (spanStyle != null) {
                                long j2 = j;
                                map6 = map5;
                                i12 = i8;
                                i13 = i9;
                                j = j2;
                                i14 = length;
                                textLinkStyles = new TextLinkStyles(spanStyle, (SpanStyle) null, SpanStyle.m973copyGSF8kmg$default(spanStyle, j2, null, 0L, JpegConstants.COM_MARKER), 6);
                            } else {
                                map6 = map5;
                                i12 = i8;
                                i13 = i9;
                                i14 = length;
                                textLinkStyles = null;
                            }
                            builder.addLink(new LinkAnnotation.Url(value, textLinkStyles, new ReceiptUiKt$$ExternalSyntheticLambda47(function1, value, 2)), spanStart, spanEnd);
                        } else {
                            if (i20 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            map6 = map5;
                        }
                        i12 = i8;
                        i13 = i9;
                        i14 = length;
                        String key = annotation2.getKey();
                        key.getClass();
                        String value2 = annotation2.getValue();
                        value2.getClass();
                        builder.addStringAnnotation(key, spanStart, spanEnd, value2);
                        if (spanStyle != null) {
                            builder.addStyle(spanStyle, spanStart, spanEnd);
                        }
                    } else {
                        map6 = map5;
                        i12 = i8;
                        i13 = i9;
                        i14 = length;
                    }
                    i18 = i19 + 1;
                    spans = objArr;
                    modifier4 = modifier6;
                    i8 = i12;
                    i9 = i13;
                    length = i14;
                    i17 = i11;
                    map5 = map6;
                }
                int i21 = i17;
                Map map7 = map5;
                modifier3 = modifier4;
                BasicTextKt.m346BasicTextCL7eQgs(builder.toAnnotatedString(), modifier3, textStyle, null, i8, true, i9, 0, null, null, gapComposer, (i21 & 112) | 196608 | (i10 & 896) | (i21 & 57344) | ((i10 << 3) & 3670016), 1928);
                i7 = i9;
                map3 = map7;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new FlowLayoutKt$$ExternalSyntheticLambda1(textResource, function1, textStyle, modifier3, map3, i7, i8, i3, i4);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 24576) != 0) {
        }
        i6 = i5 | 1769472;
        if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void BackButton(CoroutineScope coroutineScope, RealWebSocket$connect$1 realWebSocket$connect$1, OnBackPressedDispatcher onBackPressedDispatcher, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1797009785);
        int i2 = (gapComposer.changedInstance(coroutineScope) ? 4 : 2) | i | (gapComposer.changed(realWebSocket$connect$1) ? 32 : 16) | (gapComposer.changedInstance(onBackPressedDispatcher) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(coroutineScope) | ((i2 & 112) == 32) | gapComposer.changedInstance(onBackPressedDispatcher);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda9(18, coroutineScope, realWebSocket$connect$1, onBackPressedDispatcher);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CardKt.IconButton(24576, 14, gapComposer, f822lambda$1318334173, null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TopAppBarKt$$ExternalSyntheticLambda2(coroutineScope, realWebSocket$connect$1, onBackPressedDispatcher, i);
        }
    }

    public static final void CloseButton(CoroutineScope coroutineScope, RealWebSocket$connect$1 realWebSocket$connect$1, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(771534685);
        int i2 = (gapComposer.changedInstance(coroutineScope) ? 4 : 2) | i | (gapComposer.changed(realWebSocket$connect$1) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(coroutineScope) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda9(19, coroutineScope, realWebSocket$connect$1, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CardKt.IconButton(24576, 14, gapComposer, f823lambda$1910988991, null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) coroutineScope, (Object) realWebSocket$connect$1, (Function) function0, i, 24);
        }
    }

    public static final void FinancialConnectionsBottomSheetLayout(StripeBottomSheetState stripeBottomSheetState, Modifier modifier, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Modifier modifier2;
        stripeBottomSheetState.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1648304739);
        int i2 = i | (gapComposer.changedInstance(stripeBottomSheetState) ? 4 : 2) | 48 | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            StripeBottomSheetStateKt.StripeBottomSheetLayout(stripeBottomSheetState, rememberFinancialConnectionsBottomSheetLayoutInfo(gapComposer), function0, composableLambdaImpl, gapComposer, ((i2 << 3) & 7168) | (i2 & 14) | 392 | 24576);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(stripeBottomSheetState, i, modifier2, function0, composableLambdaImpl, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinancialConnectionsButton(final Function0 function0, final Modifier modifier, TextKt textKt, FinancialConnectionsButton$Size$Regular financialConnectionsButton$Size$Regular, boolean z, boolean z2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        TextKt textKt2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        TextKt textKt3;
        GapComposer gapComposer;
        boolean z6;
        FinancialConnectionsButton$Size$Regular financialConnectionsButton$Size$Regular2;
        RecomposeScopeImpl endRestartGroup;
        long j;
        SweepGradient sweepGradient;
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1838012725);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            textKt2 = textKt;
            i3 |= gapComposer2.changed(textKt2) ? 256 : 128;
            i4 = i3 | 3072;
            i5 = i2 & 16;
            if (i5 == 0) {
                i4 = i3 | 27648;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i4 |= gapComposer2.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
                i6 = i2 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i4 |= gapComposer2.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
                    if ((1572864 & i) == 0) {
                        i4 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    if (gapComposer2.shouldExecute(i4 & 1, (599187 & i4) == 599186)) {
                        gapComposer2.skipToGroupEnd();
                        z5 = z3;
                        textKt3 = textKt2;
                        gapComposer = gapComposer2;
                        z6 = z4;
                        financialConnectionsButton$Size$Regular2 = financialConnectionsButton$Size$Regular;
                    } else {
                        FinancialConnectionsButton$Type$Primary financialConnectionsButton$Type$Primary = FinancialConnectionsButton$Type$Primary.INSTANCE;
                        TextKt textKt4 = i7 != 0 ? financialConnectionsButton$Type$Primary : textKt2;
                        final boolean z7 = i5 != 0 ? true : z3;
                        if (i6 != 0) {
                            z4 = false;
                        }
                        final View view = (View) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView);
                        final Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
                        FinancialConnectionsColors financialConnectionsColors = (FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new MultipleEventsCutterImpl();
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        final MultipleEventsCutterImpl multipleEventsCutterImpl = (MultipleEventsCutterImpl) rememberedValue;
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Updater.mutableStateOf$default(new Dp(24.0f));
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        final MutableState mutableState = (MutableState) rememberedValue2;
                        final boolean z8 = z4;
                        final State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z4 ? 1.0f : RecyclerView.DECELERATION_RATE, null, "LoadingIndicatorAlpha", null, gapComposer2, 3072, 22);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        FinancialConnectionsButton$Type$Secondary financialConnectionsButton$Type$Secondary = FinancialConnectionsButton$Type$Secondary.INSTANCE;
                        if (rememberedValue3 == neverEqualPolicy) {
                            if (Intrinsics.areEqual(textKt4, financialConnectionsButton$Type$Primary)) {
                                sweepGradient = new SweepGradient(9205357640488583168L, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(financialConnectionsColors.primary), new Color(financialConnectionsColors.primaryAccent)}));
                            } else {
                                if (!Intrinsics.areEqual(textKt4, financialConnectionsButton$Type$Secondary)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                sweepGradient = new SweepGradient(9205357640488583168L, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(financialConnectionsColors.backgroundSecondary), new Color(financialConnectionsColors.textDefault)}));
                            }
                            rememberedValue3 = sweepGradient;
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        final Brush brush = (Brush) rememberedValue3;
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = RippleKt.LocalRippleConfiguration;
                        if (Intrinsics.areEqual(textKt4, financialConnectionsButton$Type$Primary)) {
                            gapComposer2.startReplaceGroup(-805497355);
                            gapComposer2.end(false);
                            j = ColorKt.Neutral0;
                        } else {
                            if (!Intrinsics.areEqual(textKt4, financialConnectionsButton$Type$Secondary)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -805498332, false);
                            }
                            gapComposer2.startReplaceGroup(-805496168);
                            j = ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).textDefault;
                            gapComposer2.end(false);
                        }
                        DefaultButtonColors buttonColors = textKt4.buttonColors(gapComposer2);
                        gapComposer2.startReplaceGroup(-2133647540);
                        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(buttonColors.contentColor), gapComposer2);
                        gapComposer2.end(false);
                        final TextKt textKt5 = textKt4;
                        Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(new RippleConfiguration(j, ((double) androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(((Color) rememberUpdatedState.getValue()).value)) > 0.5d ? RippleKt.LightThemeHighContrastRippleAlpha : RippleKt.LightThemeLowContrastRippleAlpha)), Expect_jvmKt.rememberComposableLambda(1423326091, new Function2() { // from class: com.stripe.android.financialconnections.ui.components.ButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    TextKt textKt6 = TextKt.this;
                                    DefaultButtonElevation elevation = textKt6.elevation(gapComposer3);
                                    RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f);
                                    PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                                    DefaultButtonColors buttonColors2 = textKt6.buttonColors(gapComposer3);
                                    MultipleEventsCutterImpl multipleEventsCutterImpl2 = multipleEventsCutterImpl;
                                    boolean changedInstance = gapComposer3.changedInstance(multipleEventsCutterImpl2);
                                    boolean z9 = z8;
                                    boolean changed = changedInstance | gapComposer3.changed(z9);
                                    View view2 = view;
                                    boolean changedInstance2 = changed | gapComposer3.changedInstance(view2);
                                    Function0 function02 = function0;
                                    boolean changed2 = changedInstance2 | gapComposer3.changed(function02);
                                    Object rememberedValue4 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue4 == Composer.Companion.Empty) {
                                        ShiftListViewKt$$ExternalSyntheticLambda10 shiftListViewKt$$ExternalSyntheticLambda10 = new ShiftListViewKt$$ExternalSyntheticLambda10(multipleEventsCutterImpl2, z9, view2, function02, 8);
                                        gapComposer3.updateRememberedValue(shiftListViewKt$$ExternalSyntheticLambda10);
                                        rememberedValue4 = shiftListViewKt$$ExternalSyntheticLambda10;
                                    }
                                    CardKt.Button((Function0) rememberedValue4, modifier, z7, elevation, m340RoundedCornerShape0680j_4, buttonColors2, paddingValuesImpl, Expect_jvmKt.rememberComposableLambda(-2052120709, new SwipeToDismissKt$$ExternalSyntheticLambda2((Object) density, composableLambdaImpl, (Object) brush, (Object) animateFloatAsState, mutableState, 19), gapComposer3), gapComposer3, 905969664, 72);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), gapComposer2, 56);
                        gapComposer = gapComposer2;
                        textKt3 = textKt5;
                        z6 = z8;
                        z5 = z7;
                        financialConnectionsButton$Size$Regular2 = FinancialConnectionsButton$Size$Regular.INSTANCE;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new AccountAvatarKt$$ExternalSyntheticLambda2(function0, modifier, textKt3, financialConnectionsButton$Size$Regular2, z5, z6, composableLambdaImpl, i, i2);
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((1572864 & i) == 0) {
                }
                if (gapComposer2.shouldExecute(i4 & 1, (599187 & i4) == 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            z4 = z2;
            if ((1572864 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i4 & 1, (599187 & i4) == 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        textKt2 = textKt;
        i4 = i3 | 3072;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        z4 = z2;
        if ((1572864 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i4 & 1, (599187 & i4) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void FinancialConnectionsModalBottomSheetLayout(BottomSheetNavigator bottomSheetNavigator, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        bottomSheetNavigator.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2032792412);
        int i2 = (gapComposer.changedInstance(bottomSheetNavigator) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            StripeBottomSheetLayoutInfo rememberFinancialConnectionsBottomSheetLayoutInfo = rememberFinancialConnectionsBottomSheetLayoutInfo(gapComposer);
            BottomSheetKt.m4019ModalBottomSheetLayout4erKP6g(bottomSheetNavigator, null, rememberFinancialConnectionsBottomSheetLayoutInfo.sheetShape, RecyclerView.DECELERATION_RATE, rememberFinancialConnectionsBottomSheetLayoutInfo.sheetBackgroundColor, 0L, rememberFinancialConnectionsBottomSheetLayoutInfo.scrimColor, composableLambdaImpl, gapComposer, (i2 & 14) | 12582912);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(bottomSheetNavigator, composableLambdaImpl, i, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinancialConnectionsOutlinedTextField(final String str, final boolean z, Modifier modifier, final Function1 function1, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final Function2 function2, VisualTransformation visualTransformation, Function2 function22, Function2 function23, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        final KeyboardOptions keyboardOptions2;
        int i5;
        int i6;
        int i7;
        Function2 function24;
        int i8;
        int i9;
        int i10;
        boolean z3;
        VisualTransformation visualTransformation2;
        Function2 function25;
        Function2 function26;
        KeyboardActions keyboardActions2;
        RecomposeScopeImpl endRestartGroup;
        float f;
        str.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-644860720);
        if ((i & 6) == 0) {
            i4 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i11 = i4 | 24576;
        int i12 = i3 & 32;
        if (i12 != 0) {
            i11 = 221184 | i4;
        } else if ((196608 & i) == 0) {
            i11 |= gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
            if ((1572864 & i) != 0) {
                keyboardOptions2 = keyboardOptions;
                i11 |= gapComposer.changed(keyboardOptions2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                keyboardOptions2 = keyboardOptions;
            }
            i5 = i3 & 128;
            if (i5 == 0) {
                i11 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i11 |= gapComposer.changed(keyboardActions) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i11 |= gapComposer.changedInstance(function2) ? 67108864 : 33554432;
            }
            i6 = i11 | 805306368;
            i7 = i3 & 1024;
            if (i7 == 0) {
                i8 = i2 | 6;
                function24 = function22;
            } else {
                function24 = function22;
                i8 = i2 | (gapComposer.changedInstance(function24) ? 4 : 2);
            }
            i9 = i3 & 2048;
            if (i9 == 0) {
                i8 |= 48;
                i10 = i9;
            } else if ((i2 & 48) == 0) {
                i10 = i9;
                i8 |= gapComposer.changedInstance(function23) ? 32 : 16;
            } else {
                i10 = i9;
            }
            if (gapComposer.shouldExecute(i6 & 1, (i6 & 306783379) == 306783378 || ((i8 | MLKEMEngine.KyberPolyBytes) & 147) != 146)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
                visualTransformation2 = visualTransformation;
                function25 = function23;
                function26 = function24;
                keyboardActions2 = keyboardActions;
            } else {
                final boolean z4 = i12 != 0 ? false : z2;
                final KeyboardActions keyboardActions3 = i5 != 0 ? KeyboardActions.Default : keyboardActions;
                final Function2 function27 = i7 != 0 ? null : function24;
                final Function2 function28 = i10 != 0 ? null : function23;
                if (z) {
                    gapComposer.startReplaceGroup(-1235839788);
                    long j = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                    f = (!((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight() ? ((double) androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j)) < 0.5d : ((double) androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j)) > 0.5d) ? 0.87f : 1.0f;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1235839048);
                    long j2 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                    if (((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight()) {
                        androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j2);
                    } else {
                        androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j2);
                    }
                    gapComposer.end(false);
                    f = 0.38f;
                }
                final float f2 = f;
                final RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f);
                final Modifier modifier3 = modifier2;
                Updater.CompositionLocalProvider(TextSelectionColorsKt.LocalTextSelectionColors.defaultProvidedValue$runtime(ThemeKt.getTextSelectionColors(gapComposer)), Expect_jvmKt.rememberComposableLambda(1313859984, new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TextFieldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int intValue = ((Integer) obj2).intValue();
                        GapComposer gapComposer2 = (GapComposer) composer2;
                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                            Modifier alpha = AlphaKt.alpha(SizeKt.fillMaxWidth(Modifier.this, 1.0f), f2);
                            RoundedCornerShape roundedCornerShape = m340RoundedCornerShape0680j_4;
                            Modifier m591shadows4CzXII$default = ShadowKt.m591shadows4CzXII$default(alpha, 1.0f, roundedCornerShape, false, 28);
                            long j3 = LayoutKt.getColors(gapComposer2).background;
                            long j4 = LayoutKt.getColors(gapComposer2).border;
                            long j5 = LayoutKt.getColors(gapComposer2).borderNeutral;
                            long j6 = LayoutKt.getColors(gapComposer2).borderNeutral;
                            long j7 = LayoutKt.getColors(gapComposer2).textSubdued;
                            long j8 = LayoutKt.getColors(gapComposer2).textCritical;
                            long j9 = LayoutKt.getColors(gapComposer2).textSubdued;
                            long j10 = LayoutKt.getColors(gapComposer2).textDefault;
                            long j11 = LayoutKt.getColors(gapComposer2).textCritical;
                            long j12 = LayoutKt.getColors(gapComposer2).textCritical;
                            long j13 = LayoutKt.getColors(gapComposer2).textCritical;
                            long j14 = LayoutKt.getColors(gapComposer2).icon;
                            long j15 = LayoutKt.getColors(gapComposer2).icon;
                            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.LocalContentColor;
                            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(((Number) gapComposer2.consume(ContentAlphaKt.LocalContentAlpha)).floatValue(), ((Color) gapComposer2.consume(dynamicProvidableCompositionLocal)).value, 14);
                            long j16 = ((Color) gapComposer2.consume(dynamicProvidableCompositionLocal)).value;
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorsKt.LocalColors;
                            if (((Colors) gapComposer2.consume(staticProvidableCompositionLocal)).isLight()) {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j16);
                            } else {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j16);
                            }
                            long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(0.38f, m675copywmQWz5c$default, 14);
                            long m675copywmQWz5c$default3 = Color.m675copywmQWz5c$default(0.54f, ((Colors) gapComposer2.consume(staticProvidableCompositionLocal)).m484getOnSurface0d7_KjU(), 14);
                            long j17 = ((Color) gapComposer2.consume(dynamicProvidableCompositionLocal)).value;
                            if (((Colors) gapComposer2.consume(staticProvidableCompositionLocal)).isLight()) {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j17);
                            } else {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j17);
                            }
                            long m675copywmQWz5c$default4 = Color.m675copywmQWz5c$default(0.38f, m675copywmQWz5c$default3, 14);
                            long j18 = ((Color) gapComposer2.consume(dynamicProvidableCompositionLocal)).value;
                            if (((Colors) gapComposer2.consume(staticProvidableCompositionLocal)).isLight()) {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j18);
                            } else {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j18);
                            }
                            long m675copywmQWz5c$default5 = Color.m675copywmQWz5c$default(0.38f, j14, 14);
                            long j19 = ((Color) gapComposer2.consume(dynamicProvidableCompositionLocal)).value;
                            if (((Colors) gapComposer2.consume(staticProvidableCompositionLocal)).isLight()) {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j19);
                            } else {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j19);
                            }
                            long m675copywmQWz5c$default6 = Color.m675copywmQWz5c$default(0.38f, j7, 14);
                            long m484getOnSurface0d7_KjU = ((Colors) gapComposer2.consume(staticProvidableCompositionLocal)).m484getOnSurface0d7_KjU();
                            long j20 = ((Color) gapComposer2.consume(dynamicProvidableCompositionLocal)).value;
                            long m675copywmQWz5c$default7 = Color.m675copywmQWz5c$default((!((Colors) gapComposer2.consume(staticProvidableCompositionLocal)).isLight() ? ((double) androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j20)) < 0.5d : ((double) androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j20)) > 0.5d) ? 0.6f : 0.74f, m484getOnSurface0d7_KjU, 14);
                            long j21 = ((Color) gapComposer2.consume(dynamicProvidableCompositionLocal)).value;
                            if (((Colors) gapComposer2.consume(staticProvidableCompositionLocal)).isLight()) {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j21);
                            } else {
                                androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j21);
                            }
                            OutlinedTextFieldKt.OutlinedTextField(str, function1, m591shadows4CzXII$default, z, null, function2, function28, function27, z4, keyboardOptions2, keyboardActions3, 1, 0, roundedCornerShape, new DefaultTextFieldForExposedDropdownMenusColors(m675copywmQWz5c$default, m675copywmQWz5c$default2, j10, j11, j4, j5, j8, j6, m675copywmQWz5c$default3, m675copywmQWz5c$default4, m675copywmQWz5c$default3, j14, j15, m675copywmQWz5c$default5, j13, j3, j9, j7, m675copywmQWz5c$default6, j12, m675copywmQWz5c$default7, Color.m675copywmQWz5c$default(0.38f, m675copywmQWz5c$default7, 14)), gapComposer2, 0);
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 56);
                function25 = function28;
                z3 = z4;
                keyboardActions2 = keyboardActions3;
                function26 = function27;
                visualTransformation2 = VisualTransformation.Companion.None;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new MoneyTabToolbarKt$$ExternalSyntheticLambda3(str, z, modifier, function1, z3, keyboardOptions, keyboardActions2, function2, visualTransformation2, function26, function25, i, i2, i3);
                return;
            }
            return;
        }
        if ((1572864 & i) != 0) {
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i11 | 805306368;
        i7 = i3 & 1024;
        if (i7 == 0) {
        }
        i9 = i3 & 2048;
        if (i9 == 0) {
        }
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 306783379) == 306783378 || ((i8 | MLKEMEngine.KyberPolyBytes) & 147) != 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void FinancialConnectionsScaffold(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1367740500);
        if (gapComposer2.shouldExecute(i & 1, (i & 19) != 18)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            gapComposer = gapComposer2;
            ScaffoldKt.m502Scaffold27mzLpw(null, null, composableLambdaImpl, null, null, null, 0, false, null, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).background, ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).textDefault, composableLambdaImpl2, gapComposer, MLKEMEngine.KyberPolyBytes, 12582912, 32763);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersFormattedDetailKt$$ExternalSyntheticLambda5(composableLambdaImpl, composableLambdaImpl2, i, 2);
        }
    }

    public static final void FinancialConnectionsTopAppBar(boolean z, boolean z2, Theme theme, LinkBrand linkBrand, State state, boolean z3, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Theme theme2;
        LinkBrand linkBrand2;
        GapComposer gapComposer;
        Modifier modifier2;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-185459327);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(z2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(theme.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(linkBrand.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(state) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(z3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i3 = i2 | 12582912;
        if (gapComposer2.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.getCurrent(gapComposer2);
            OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
            NavHostController navHostController = (NavHostController) gapComposer2.consume(FinancialConnectionsSheetNativeActivityKt.LocalNavHostController);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer2.changedInstance(navHostController);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda0(25, navHostController, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue2, gapComposer2);
            RealWebSocket$connect$1 rememberKeyboardController = NavigationEffectsKt.rememberKeyboardController(gapComposer2);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
            if (((Boolean) mutableState.getValue()).booleanValue() && z3) {
                gapComposer2.startReplaceGroup(-1689898412);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-320185195, new TopAppBarKt$$ExternalSyntheticLambda2(coroutineScope, rememberKeyboardController, onBackPressedDispatcher), gapComposer2);
                gapComposer2.end(false);
                composableLambdaImpl = rememberComposableLambda;
            } else {
                gapComposer2.startReplaceGroup(-1689663835);
                gapComposer2.end(false);
                composableLambdaImpl = null;
            }
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            long j = ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).background;
            ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
            long j2 = ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).textAction;
            boolean z4 = (i3 & 57344) == 16384;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda10(state, 27);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier graphicsLayer = androidx.compose.ui.graphics.ColorKt.graphicsLayer(companion, (Function1) rememberedValue4);
            theme2 = theme;
            linkBrand2 = linkBrand;
            gapComposer = gapComposer2;
            AppBarKt.m463TopAppBarxWeB9s(Expect_jvmKt.rememberComposableLambda(-633057475, new TopAppBarKt$$ExternalSyntheticLambda4(z, z2, theme2, linkBrand2), gapComposer2), graphicsLayer, composableLambdaImpl2, Expect_jvmKt.rememberComposableLambda(-1215727694, new BufferedChannel$$ExternalSyntheticLambda4(9, coroutineScope, rememberKeyboardController, function0), gapComposer2), j, j2, RecyclerView.DECELERATION_RATE, gapComposer, 1575942);
            modifier2 = companion;
        } else {
            theme2 = theme;
            linkBrand2 = linkBrand;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissBoxKt$$ExternalSyntheticLambda1(z, z2, theme2, linkBrand2, state, z3, function0, modifier2, i);
        }
    }

    public static final void TestModeBanner(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        Modifier modifier2;
        String str3;
        int i2;
        String stringResource;
        Modifier modifier3;
        float f;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1420994006);
        int i3 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | 11264;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.startDefaults();
            int i4 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i4 == 0 || gapComposer.getDefaultsInvalid()) {
                i2 = i3 & (-57345);
                stringResource = Room.stringResource(gapComposer, R.string.stripe_verification_inTestMode);
                modifier3 = companion;
            } else {
                gapComposer.skipToGroupEnd();
                stringResource = str2;
                i2 = i3 & (-57345);
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            if (z) {
                gapComposer.startReplaceGroup(224368974);
                long j = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                f = (!((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight() ? ((double) androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j)) < 0.5d : ((double) androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j)) > 0.5d) ? 0.87f : 1.0f;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(224369714);
                long j2 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                if (((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight()) {
                    androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j2);
                } else {
                    androidx.compose.ui.graphics.ColorKt.m690luminance8_81llA(j2);
                }
                gapComposer.end(false);
                f = 0.38f;
            }
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier3, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(AlphaKt.alpha(ImageKt.m177backgroundbw27NRU(fillMaxWidth, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).warningLight, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), f), 16.0f, 8.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Painter painterResource = Countries.painterResource(R.drawable.stripe_ic_info, 0, gapComposer);
            long j3 = ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).warning;
            ImageKt.Image(painterResource, null, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(androidx.compose.ui.graphics.ColorKt.m694toArgb8_81llA(j3), androidx.compose.ui.graphics.ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 60);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ThemeKt.LocalTypography;
            TextStyle textStyle = ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal2)).bodyMedium;
            String str4 = stringResource;
            Modifier modifier4 = modifier3;
            androidx.compose.material.TextKt.m509Text4IGK_g(str4, new LayoutWeightElement(1.0f, true), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, gapComposer, 0, 0, 65532);
            long j4 = ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textAction;
            TextStyle textStyle2 = ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal2)).bodyMediumEmphasized;
            Object rememberedValue = gapComposer.rememberedValue();
            int i5 = 14;
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StripeApiRepository$$ExternalSyntheticLambda5(i5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material.TextKt.m509Text4IGK_g(str, ImageKt.m183clickableoSLSa3U$default(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), "test_mode_fill_button"), z, null, null, function0, 14), j4, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle2, gapComposer, (i2 >> 3) & 14, 0, 65528);
            gapComposer = gapComposer;
            gapComposer.end(true);
            str3 = str4;
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            str3 = str2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinDisplayCurrencyViewKt$$ExternalSyntheticLambda15(i, modifier2, str, str3, function0, z);
        }
    }

    public static final void Title(boolean z, boolean z2, Theme theme, LinkBrand linkBrand, Composer composer, int i) {
        boolean z3;
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(571050476);
        int i3 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changed(z2) ? 32 : 16) | (gapComposer.changed(theme.ordinal()) ? 256 : 128) | (gapComposer.changed(linkBrand.ordinal()) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            BlendModeColorFilter blendModeColorFilter = null;
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (z) {
                gapComposer.startReplaceGroup(975650714);
            } else {
                gapComposer.startReplaceGroup(982433979);
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, 20.0f);
                theme.getClass();
                linkBrand.getClass();
                int ordinal = theme.ordinal();
                if (ordinal == 0) {
                    i2 = R.drawable.stripe_logo;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    int i4 = Theme.WhenMappings.$EnumSwitchMapping$1[linkBrand.ordinal()];
                    if (i4 == 1) {
                        i2 = R.drawable.stripe_onelink_logo_monochrome;
                    } else {
                        if (i4 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        i2 = R.drawable.stripe_link_logo_monochrome;
                    }
                }
                Painter painterResource = Countries.painterResource(i2, 0, gapComposer);
                if (ImageKt.isSystemInDarkTheme(gapComposer)) {
                    gapComposer.startReplaceGroup(982668308);
                    long j = ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault;
                    blendModeColorFilter = new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(androidx.compose.ui.graphics.ColorKt.m694toArgb8_81llA(j), androidx.compose.ui.graphics.ColorKt.m693toAndroidBlendModes9anfk8(5)));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(982773646);
                    gapComposer.end(false);
                }
                ImageKt.Image(painterResource, null, m277height3ABfNKs, null, ContentScale.Companion.FillHeight, RecyclerView.DECELERATION_RATE, blendModeColorFilter, gapComposer, Painter.$stable | 25008, 40);
            }
            gapComposer.end(false);
            if (z2) {
                gapComposer.startReplaceGroup(983006549);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new StripeApiRepository$$ExternalSyntheticLambda5(15);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                androidx.compose.material.TextKt.m509Text4IGK_g("Test", SpacerKt.m299paddingVpY3zN4(ClipKt.drawBehind(companion, (Function1) rememberedValue), 4.0f, 2.0f), Color.White, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelMediumEmphasized, gapComposer, 390, 0, 65528);
                gapComposer = gapComposer;
                gapComposer.end(false);
                z3 = true;
            } else {
                z3 = true;
                gapComposer.startReplaceGroup(975650714);
                gapComposer.end(false);
            }
            gapComposer.end(z3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TopAppBarKt$$ExternalSyntheticLambda4(z, z2, theme, linkBrand, i);
        }
    }

    /* renamed from: clickableSingle-XHw0xAI$default, reason: not valid java name */
    public static Modifier m4021clickableSingleXHw0xAI$default(Modifier modifier, boolean z, Role role, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        modifier.getClass();
        function0.getClass();
        return PlatformKt.composed(modifier, new EducationalSheetKt$$ExternalSyntheticLambda8(z, role, function0, 11));
    }

    public static final String pluralStringResource(int i, int i2, int i3, Object[] objArr, Composer composer) {
        if (i3 == 1) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-2037707323);
            String stringResource = Room.stringResource(i, Arrays.copyOf(objArr, objArr.length), gapComposer);
            gapComposer.end(false);
            return stringResource;
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-2037648857);
        String stringResource2 = Room.stringResource(i2, Arrays.copyOf(objArr, objArr.length), gapComposer2);
        gapComposer2.end(false);
        return stringResource2;
    }

    public static final StripeBottomSheetLayoutInfo rememberFinancialConnectionsBottomSheetLayoutInfo(Composer composer) {
        float f = ImageKt.isSystemInDarkTheme(composer) ? 0.48f : 0.32f;
        GapComposer gapComposer = (GapComposer) composer;
        long j = ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).background;
        long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(f, Color.Black, 14);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo = new StripeBottomSheetLayoutInfo(RoundedCornerShapeKt.m342RoundedCornerShapea9UjIt4$default(20.0f, 20.0f, 12), j, m675copywmQWz5c$default);
            gapComposer.updateRememberedValue(stripeBottomSheetLayoutInfo);
            rememberedValue = stripeBottomSheetLayoutInfo;
        }
        return (StripeBottomSheetLayoutInfo) rememberedValue;
    }

    public abstract DefaultButtonColors buttonColors(Composer composer);

    public abstract DefaultButtonElevation elevation(GapComposer gapComposer);

    public static final void FinancialConnectionsTopAppBar(TopAppBarState topAppBarState, Function0 function0, Composer composer, int i) {
        Function0 function02;
        float f;
        topAppBarState.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1366845633);
        int i2 = (gapComposer.changedInstance(topAppBarState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (topAppBarState.allowElevation && topAppBarState.isContentScrolled) {
                PaddingValuesImpl paddingValuesImpl = AppBarDefaults.ContentPadding;
                f = 4.0f;
            } else {
                f = RecyclerView.DECELERATION_RATE;
            }
            function02 = function0;
            FinancialConnectionsTopAppBar(topAppBarState.hideStripeLogo || topAppBarState.forceHideStripeLogo, topAppBarState.isTestMode, topAppBarState.theme, topAppBarState.linkBrand, AnimateAsStateKt.m155animateDpAsStateAjpBEmI(f, null, "TopAppBarElevation", null, gapComposer, MLKEMEngine.KyberPolyBytes, 10), topAppBarState.allowBackNavigation, function02, null, gapComposer, (i2 << 15) & 3670016);
            gapComposer = gapComposer;
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(topAppBarState, function02, i, 20);
        }
    }
}
