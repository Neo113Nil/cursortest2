package com.withpersona.sdk2.inquiry.shared;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.material.datepicker.DateStrings;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.genericelements.components.components.arcade.ArcadeUtilKt;
import com.squareup.cash.genericelements.viewmodels.DividerComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ContextUtilsKt {
    public static final void GenericComponentWidget(final GenericComponentViewModel genericComponentViewModel, Modifier modifier, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        final Function1 function12;
        Modifier modifier2;
        Modifier.Companion companion;
        genericComponentViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(809367152);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(genericComponentViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ComposableLambdaImpl composableLambdaImpl = null;
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
            if (genericComponentViewModel instanceof GenericComponentViewModel.TwoColumnViewModel) {
                gapComposer.startReplaceGroup(-2108146649);
                RetryKt.TwoColumnWidget((GenericComponentViewModel.TwoColumnViewModel) genericComponentViewModel, null, false, function1, gapComposer, i3 & 7182, 6);
                gapComposer.end(false);
            } else if (genericComponentViewModel instanceof GenericComponentViewModel.FullWidthViewModel) {
                gapComposer.startReplaceGroup(-2108144057);
                MaterialAttributes.FullWidthWidget((GenericComponentViewModel.FullWidthViewModel) genericComponentViewModel, null, function1, gapComposer, ((i3 >> 3) & 896) | (i3 & 14));
                gapComposer.end(false);
            } else {
                if (genericComponentViewModel instanceof GenericComponentViewModel.BaseCardViewModel) {
                    gapComposer.startReplaceGroup(-927868347);
                    DateStrings.BaseCardWidget((GenericComponentViewModel.BaseCardViewModel) genericComponentViewModel, null, z, function1, gapComposer, i3 & 8078);
                    function12 = function1;
                    gapComposer.end(false);
                } else {
                    function12 = function1;
                    if (genericComponentViewModel instanceof GenericComponentViewModel.CompactCardViewModel) {
                        gapComposer.startReplaceGroup(-2108137879);
                        SelfieUtilsKt.CompactCardWidget((GenericComponentViewModel.CompactCardViewModel) genericComponentViewModel, function12, gapComposer, ((i3 >> 6) & 112) | (i3 & 14));
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof GenericComponentViewModel.CompactInfoViewModel) {
                        gapComposer.startReplaceGroup(-2108135159);
                        zzpc.CompactInfoWidget((GenericComponentViewModel.CompactInfoViewModel) genericComponentViewModel, function12, gapComposer, ((i3 >> 6) & 112) | (i3 & 14));
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof GenericComponentViewModel.ValueUnitViewModel) {
                        gapComposer.startReplaceGroup(-2108132505);
                        LeftSheetDelegate.ValueUnitWidget((GenericComponentViewModel.ValueUnitViewModel) genericComponentViewModel, null, function12, gapComposer, ((i3 >> 3) & 896) | (i3 & 14));
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof GenericComponentViewModel.DetailedCardViewModel) {
                        gapComposer.startReplaceGroup(-2108129814);
                        MathUtils.DetailedCardWidget((GenericComponentViewModel.DetailedCardViewModel) genericComponentViewModel, function12, gapComposer, ((i3 >> 6) & 112) | (i3 & 14));
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof GenericComponentViewModel.TwoColumnCardViewModel) {
                        gapComposer.startReplaceGroup(-2108126720);
                        LottieUtilsKt.TwoColumnCardWidget((GenericComponentViewModel.TwoColumnCardViewModel) genericComponentViewModel, function12, gapComposer, ((i3 >> 3) & 896) | (i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof GenericComponentViewModel.TwoColumnRowViewModel) {
                        gapComposer.startReplaceGroup(-927302845);
                        ResToolsKt.TwoColumnRowWidget((GenericComponentViewModel.TwoColumnRowViewModel) genericComponentViewModel, function12, gapComposer, ((i3 >> 3) & 896) | (i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof DividerComponentViewModel.LineDividerViewModel) {
                        gapComposer.startReplaceGroup(-2108119594);
                        MotionUtils.LineDividerWidget((DividerComponentViewModel.LineDividerViewModel) genericComponentViewModel, gapComposer, i3 & 14);
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof DividerComponentViewModel.BlankDividerViewModel) {
                        gapComposer.startReplaceGroup(-2108117449);
                        MotionUtils.BlankDividerWidget((DividerComponentViewModel.BlankDividerViewModel) genericComponentViewModel, gapComposer, i3 & 14);
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof GenericComponentViewModel.SectionHeaderViewModel) {
                        gapComposer.startReplaceGroup(-2108114944);
                        int i6 = i3 >> 3;
                        ArcadeUtilKt.SectionHeaderWidget(companion2, (GenericComponentViewModel.SectionHeaderViewModel) genericComponentViewModel, function12, gapComposer, ((i3 << 3) & 112) | (i6 & 14) | (i6 & 896));
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof GenericComponentViewModel.CellActivityViewModel) {
                        gapComposer.startReplaceGroup(-2108111169);
                        int i7 = i3 >> 3;
                        ArcadeUtilKt.CellActivityWidget((GenericComponentViewModel.CellActivityViewModel) genericComponentViewModel, function12, gapComposer, ((i3 << 3) & 112) | (i7 & 14) | (i7 & 896));
                        gapComposer.end(false);
                    } else if (genericComponentViewModel instanceof GenericComponentViewModel.ButtonCtaGroupViewModel) {
                        gapComposer.startReplaceGroup(-926805977);
                        GenericComponentViewModel.ButtonCtaGroupViewModel buttonCtaGroupViewModel = (GenericComponentViewModel.ButtonCtaGroupViewModel) genericComponentViewModel;
                        int ordinal = buttonCtaGroupViewModel.direction.ordinal();
                        if (ordinal == 0) {
                            gapComposer.startReplaceGroup(-926752502);
                            ButtonCtaGroupOrientation buttonCtaGroupOrientation = ButtonCtaGroupOrientation.AUTOMATIC;
                            String str = buttonCtaGroupViewModel.text;
                            if (str == null) {
                                gapComposer.startReplaceGroup(-926667408);
                            } else {
                                gapComposer.startReplaceGroup(-926667407);
                                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1224052023, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str, 18), gapComposer);
                            }
                            gapComposer.end(false);
                            DimensionKt.ButtonCtaGroup(null, buttonCtaGroupViewModel.showDivider, buttonCtaGroupOrientation, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-2011547556, new Function3() { // from class: com.squareup.cash.genericelements.components.components.GenericComponentWidgetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i8 = i5;
                                    GenericComponentViewModel genericComponentViewModel2 = genericComponentViewModel;
                                    AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    switch (i8) {
                                        case 0:
                                            adaptiveStackScope.getClass();
                                            GapComposer gapComposer2 = (GapComposer) composer2;
                                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                                Iterator it = ((GenericComponentViewModel.ButtonCtaGroupViewModel) genericComponentViewModel2).buttons.iterator();
                                                while (it.hasNext()) {
                                                    CameraUpdateFactory.GenericArcadeButton(null, (GenericBaseViewModel.ArcadeButtonViewModel) it.next(), function12, gapComposer2, 0, 1);
                                                }
                                            } else {
                                                gapComposer2.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            adaptiveStackScope.getClass();
                                            GapComposer gapComposer3 = (GapComposer) composer2;
                                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                                Iterator it2 = ((GenericComponentViewModel.ButtonCtaGroupViewModel) genericComponentViewModel2).buttons.iterator();
                                                while (it2.hasNext()) {
                                                    CameraUpdateFactory.GenericArcadeButton(null, (GenericBaseViewModel.ArcadeButtonViewModel) it2.next(), function12, gapComposer3, 0, 1);
                                                }
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer), gapComposer, 24960, 1);
                            gapComposer = gapComposer;
                            gapComposer.end(false);
                        } else {
                            if (ordinal != 1) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2108106949, false);
                            }
                            gapComposer.startReplaceGroup(-2108094993);
                            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1499970605, new Function3() { // from class: com.squareup.cash.genericelements.components.components.GenericComponentWidgetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i8 = i4;
                                    GenericComponentViewModel genericComponentViewModel2 = genericComponentViewModel;
                                    AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    switch (i8) {
                                        case 0:
                                            adaptiveStackScope.getClass();
                                            GapComposer gapComposer2 = (GapComposer) composer2;
                                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                                Iterator it = ((GenericComponentViewModel.ButtonCtaGroupViewModel) genericComponentViewModel2).buttons.iterator();
                                                while (it.hasNext()) {
                                                    CameraUpdateFactory.GenericArcadeButton(null, (GenericBaseViewModel.ArcadeButtonViewModel) it.next(), function12, gapComposer2, 0, 1);
                                                }
                                            } else {
                                                gapComposer2.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            adaptiveStackScope.getClass();
                                            GapComposer gapComposer3 = (GapComposer) composer2;
                                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                                Iterator it2 = ((GenericComponentViewModel.ButtonCtaGroupViewModel) genericComponentViewModel2).buttons.iterator();
                                                while (it2.hasNext()) {
                                                    CameraUpdateFactory.GenericArcadeButton(null, (GenericBaseViewModel.ArcadeButtonViewModel) it2.next(), function12, gapComposer3, 0, 1);
                                                }
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer), gapComposer, 24576, 15);
                            gapComposer = gapComposer;
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                    } else {
                        if (genericComponentViewModel instanceof GenericComponentViewModel.ListUnorderedViewModel) {
                            gapComposer.startReplaceGroup(-926251945);
                            GenericComponentViewModel.ListUnorderedViewModel listUnorderedViewModel = (GenericComponentViewModel.ListUnorderedViewModel) genericComponentViewModel;
                            ArrayList arrayList = listUnorderedViewModel.items;
                            int ordinal2 = listUnorderedViewModel.style.ordinal();
                            if (ordinal2 == 0) {
                                companion = companion2;
                                gapComposer.startReplaceGroup(-926205662);
                                ListUnorderedKt.ListUnordered(Tags.toImmutableList(ArcadeUtilKt.toArcadeModels(arrayList)), companion, (ListUnorderedState) null, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, (i3 & 112) | 3072, 52);
                                gapComposer = gapComposer;
                                gapComposer.end(false);
                            } else {
                                if (ordinal2 != 1) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2108089077, false);
                                }
                                gapComposer.startReplaceGroup(-926003356);
                                companion = companion2;
                                ListUnorderedKt.ListUnordered(Tags.toImmutableList(ArcadeUtilKt.toArcadeModels(arrayList)), companion, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, (i3 & 112) | 3072, 52);
                                gapComposer = gapComposer;
                                gapComposer.end(false);
                            }
                            gapComposer.end(false);
                        } else {
                            companion = companion2;
                            if (!(genericComponentViewModel instanceof GenericComponentViewModel.CellDefaultViewModel)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2108145780, false);
                            }
                            gapComposer.startReplaceGroup(-2108074114);
                            int i8 = i3 >> 3;
                            ArcadeUtilKt.CellDefaultWidget((GenericComponentViewModel.CellDefaultViewModel) genericComponentViewModel, function12, gapComposer, ((i3 << 3) & 112) | (i8 & 14) | (i8 & 896));
                            gapComposer.end(false);
                        }
                        gapComposer.end(true);
                        modifier2 = companion;
                    }
                }
                companion = companion2;
                gapComposer.end(true);
                modifier2 = companion;
            }
            function12 = function1;
            companion = companion2;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(genericComponentViewModel, modifier2, z, function12, i, 17);
        }
    }

    public static final AppCompatActivity getActivity(Context context) {
        context.getClass();
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return getActivity(baseContext);
    }

    public static final String getApplicationName(Context context) {
        String obj;
        context.getClass();
        int i = context.getApplicationInfo().labelRes;
        if (i == 0) {
            try {
                CharSequence charSequence = context.getApplicationInfo().nonLocalizedLabel;
                return (charSequence == null || (obj = charSequence.toString()) == null) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : obj;
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        }
        String string2 = context.getString(i);
        string2.getClass();
        return string2;
    }

    public static ColorStateList getColorStateList(Context context, GrpcMethod grpcMethod, int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) grpcMethod.requestAdapter;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = Strings.getColorStateList(context, resourceId)) == null) ? grpcMethod.getColorStateList(i) : colorStateList;
    }

    public static int getDimensionPixelSize(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable getDrawable(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawable;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawable = DimensionKt.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawable;
    }

    public static final void hideKeyboard(Context context) {
        View currentFocus;
        context.getClass();
        AppCompatActivity activity = getActivity(context);
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static final boolean isDebugBuild(Context context) {
        context.getClass();
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isFontScaleAtLeast1_3(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean isMicPresent(Context context) {
        context.getClass();
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        } catch (Exception unused) {
            return false;
        }
    }

    public static final AppCompatActivity requireLifecycleOwner(Context context) {
        context.getClass();
        AppCompatActivity activity = getActivity(context);
        if (activity != null) {
            return activity;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }

    public static ColorStateList getColorStateList(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = Strings.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }
}
