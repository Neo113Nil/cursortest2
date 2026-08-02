package com.squareup.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.activity.compose.LocalFullyDrawnReporterOwner;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.LruHashMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.CrossfadeKt$Crossfade$5$1;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityWithConverter;
import androidx.compose.ui.unit.LinearFontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat$Api26Impl;
import androidx.core.content.ContextCompat$Api33Impl;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda7;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.DatabaseConfiguration;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.work.Data;
import androidx.work.Data_Kt;
import androidx.work.Logger$LogcatLogger;
import app.cash.badging.backend.Badger;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.presenters.LocalPresenterFactory;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$MemoizingSupplier;
import com.google.common.base.Suppliers$NonSerializableMemoizingSupplier;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.AccountPresenter;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonColors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleConfiguration;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.pdp.ProductDetailsPageKt$$ExternalSyntheticLambda4;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.mooncake.compose_ui.components.LoadableContentKt$$ExternalSyntheticLambda11;
import com.squareup.cash.mooncake.themes.Dimen$Sp;
import com.squareup.cash.mooncake.themes.LetterSpacing$Companion$Em;
import com.squareup.cash.mooncake.themes.widget.LineHeightReceiver;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.protos.cash.clients.Version;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.workflow1.TimerWorker$run$1;
import com.stripe.android.uicore.elements.PlaceHolderKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.FileSystem$commonDeleteRecursively$sequence$1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class Strings {
    public static final long DISK_CACHE_SIZE = 50000000;

    public static final DensityWithConverter Density(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter forScale = FontScaleConverterFactory.forScale(f);
        if (forScale == null) {
            forScale = new LinearFontScaleConverter(f);
        }
        return new DensityWithConverter(f2, f, forScale);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadableFullScreenContent(final Object obj, boolean z, Modifier modifier, Function1 function1, String str, final Function4 function4, Composer composer, final int i, final int i2) {
        final int i3;
        final boolean z2;
        Modifier modifier2;
        int i4;
        Function1 function12;
        int i5;
        final String str2;
        final Modifier modifier3;
        final Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        Function1 function14;
        function4.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1620736479);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(obj) : gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked;
                    if ((196608 & i) == 0) {
                        i3 |= gapComposer.changedInstance(function4) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                        gapComposer.skipToGroupEnd();
                        str2 = str;
                        modifier3 = modifier2;
                        function13 = function12;
                    } else {
                        modifier3 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (i4 != 0) {
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (rememberedValue == neverEqualPolicy) {
                                rememberedValue = new Matcher$$ExternalSyntheticLambda9(14);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            function14 = (Function1) rememberedValue;
                        } else {
                            function14 = function12;
                        }
                        str2 = i5 != 0 ? null : str;
                        Modifier fillMaxSize = SizeKt.fillMaxSize(modifier3, 1.0f);
                        Pair pair = new Pair(obj, Boolean.valueOf(z2));
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new Matcher$$ExternalSyntheticLambda9(15);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        AnimatedContentKt.AnimatedContent(pair, fillMaxSize, function14, null, "LoadableContent", (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(-1962221230, new Function4() { // from class: com.squareup.cash.common.composeui.widgets.LoadableContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj2;
                                Pair pair2 = (Pair) obj3;
                                Composer composer2 = (Composer) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                animatedContentScopeImpl.getClass();
                                pair2.getClass();
                                Object obj6 = pair2.first;
                                if (((Boolean) pair2.second).booleanValue()) {
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    gapComposer2.startReplaceGroup(-2027676142);
                                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                                    gapComposer2.startReplaceGroup(-1003410150);
                                    gapComposer2.startReplaceGroup(212064437);
                                    gapComposer2.end(false);
                                    Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                                    Object rememberedValue3 = gapComposer2.rememberedValue();
                                    Object obj7 = Composer.Companion.Empty;
                                    if (rememberedValue3 == obj7) {
                                        rememberedValue3 = new Measurer2(density);
                                        gapComposer2.updateRememberedValue(rememberedValue3);
                                    }
                                    Measurer2 measurer2 = (Measurer2) rememberedValue3;
                                    Object rememberedValue4 = gapComposer2.rememberedValue();
                                    if (rememberedValue4 == obj7) {
                                        rememberedValue4 = new ConstraintLayoutScope();
                                        gapComposer2.updateRememberedValue(rememberedValue4);
                                    }
                                    ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue4;
                                    Object rememberedValue5 = gapComposer2.rememberedValue();
                                    if (rememberedValue5 == obj7) {
                                        rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                                        gapComposer2.updateRememberedValue(rememberedValue5);
                                    }
                                    MutableState mutableState = (MutableState) rememberedValue5;
                                    Object rememberedValue6 = gapComposer2.rememberedValue();
                                    if (rememberedValue6 == obj7) {
                                        rememberedValue6 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                        gapComposer2.updateRememberedValue(rememberedValue6);
                                    }
                                    ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue6;
                                    Object rememberedValue7 = gapComposer2.rememberedValue();
                                    if (rememberedValue7 == obj7) {
                                        Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
                                        gapComposer2.updateRememberedValue(parcelableSnapshotMutableState);
                                        rememberedValue7 = parcelableSnapshotMutableState;
                                    }
                                    MutableState mutableState2 = (MutableState) rememberedValue7;
                                    boolean changedInstance = gapComposer2.changedInstance(measurer2) | gapComposer2.changed(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                    Object rememberedValue8 = gapComposer2.rememberedValue();
                                    if (changedInstance || rememberedValue8 == obj7) {
                                        rememberedValue8 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2(mutableState2, measurer2, constraintSetForInlineDsl, mutableState, 2);
                                        gapComposer2.updateRememberedValue(rememberedValue8);
                                    }
                                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue8;
                                    Object rememberedValue9 = gapComposer2.rememberedValue();
                                    if (rememberedValue9 == obj7) {
                                        rememberedValue9 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3(mutableState, constraintSetForInlineDsl, 2);
                                        gapComposer2.updateRememberedValue(rememberedValue9);
                                    }
                                    Function0 function0 = (Function0) rememberedValue9;
                                    boolean changedInstance2 = gapComposer2.changedInstance(measurer2);
                                    Object rememberedValue10 = gapComposer2.rememberedValue();
                                    if (changedInstance2 || rememberedValue10 == obj7) {
                                        rememberedValue10 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 2);
                                        gapComposer2.updateRememberedValue(rememberedValue10);
                                    }
                                    RulerKt.MultiMeasureLayout(SemanticsModifierKt.semantics(fillMaxSize2, false, (Function1) rememberedValue10), Expect_jvmKt.rememberComposableLambda(1200550679, new CrossfadeKt$Crossfade$5$1(mutableState2, constraintLayoutScope, function0, str2, 1), gapComposer2), measurePolicy, gapComposer2, 48);
                                    gapComposer2.end(false);
                                    gapComposer2.end(false);
                                } else {
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    gapComposer3.startReplaceGroup(-2026902227);
                                    function4.invoke(animatedContentScopeImpl, obj6, gapComposer3, Integer.valueOf((intValue & 14) | ((i3 & 8) << 3)));
                                    gapComposer3.end(false);
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 1794048 | (i3 & 8) | ((i3 >> 3) & 896), 8);
                        function13 = function14;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.common.composeui.widgets.LoadableContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                Strings.LoadableFullScreenContent(obj, z2, modifier3, function13, str2, function4, (Composer) obj2, Updater.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                if ((196608 & i) == 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0075  */
    /* renamed from: LoadableSheetContent-osbwsH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3984LoadableSheetContentosbwsH8(Object obj, boolean z, final float f, Modifier modifier, Function1 function1, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        final int i3;
        boolean z2;
        Modifier modifier2;
        int i4;
        Function1 function12;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1648019105);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(obj) : gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(f) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function12 = function1;
                i3 |= gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i) == 0) {
                    i3 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (i4 != 0) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new SyncRangeQueries$$ExternalSyntheticLambda1(28);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function12 = (Function1) rememberedValue;
                    }
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(modifier3, 1.0f), f, RecyclerView.DECELERATION_RATE, 2);
                    Pair pair = new Pair(obj, Boolean.valueOf(z2));
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new SyncRangeQueries$$ExternalSyntheticLambda1(29);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    AnimatedContentKt.AnimatedContent(pair, m279heightInVpY3zN4$default, function12, null, "LoadableContent", (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(439984590, new Function4() { // from class: com.squareup.cash.common.composeui.widgets.LoadableContentKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj2;
                            Pair pair2 = (Pair) obj3;
                            Composer composer2 = (Composer) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            animatedContentScopeImpl.getClass();
                            pair2.getClass();
                            Object obj6 = pair2.first;
                            if (((Boolean) pair2.second).booleanValue()) {
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                gapComposer2.startReplaceGroup(-659197694);
                                Modifier m279heightInVpY3zN4$default2 = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), f, RecyclerView.DECELERATION_RATE, 2);
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m279heightInVpY3zN4$default2);
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
                                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                ProgressCircularKt.ProgressCircular(0, 1, gapComposer2, null);
                                gapComposer2.end(true);
                                gapComposer2.end(false);
                            } else {
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                gapComposer3.startReplaceGroup(-659019599);
                                composableLambdaImpl.invoke(animatedContentScopeImpl, obj6, gapComposer3, Integer.valueOf((intValue & 14) | ((i3 & 8) << 3)));
                                gapComposer3.end(false);
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1794048 | (i3 & 8) | ((i3 >> 6) & 896), 8);
                    modifier2 = modifier3;
                } else {
                    gapComposer.skipToGroupEnd();
                }
                Function1 function13 = function12;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ProductDetailsPageKt$$ExternalSyntheticLambda4(obj, z2, f, modifier2, function13, composableLambdaImpl, i, i2);
                    return;
                }
                return;
            }
            function12 = function1;
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            Function1 function132 = function12;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        Function1 function1322 = function12;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: Paragraph-Ul8oQg4$default, reason: not valid java name */
    public static AndroidParagraph m3985ParagraphUl8oQg4$default(String str, TextStyle textStyle, long j, Density density, FontFamilyResolverImpl fontFamilyResolverImpl, List list, int i, int i2) {
        if ((i2 & 32) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list2 = list;
        EmptyList emptyList = EmptyList.INSTANCE;
        if ((i2 & 128) != 0) {
            i = Integer.MAX_VALUE;
        }
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list2, emptyList, fontFamilyResolverImpl, density), i, 1, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static final void ReportDrawnWhen(final Function0 function0, Composer composer, final int i) {
        RecomposeScopeImpl recomposeScopeImpl;
        Function2 function2;
        FullyDrawnReporter fullyDrawnReporter;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2047119994);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            FullyDrawnReporterOwner fullyDrawnReporterOwner = (FullyDrawnReporterOwner) gapComposer.consume(LocalFullyDrawnReporterOwner.LocalFullyDrawnReporterOwner);
            FullyDrawnReporterOwner fullyDrawnReporterOwner2 = null;
            if (fullyDrawnReporterOwner == null) {
                gapComposer.startReplaceGroup(-571362883);
                View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
                view.getClass();
                while (true) {
                    if (view == null) {
                        fullyDrawnReporterOwner = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.report_drawn);
                    FullyDrawnReporterOwner fullyDrawnReporterOwner3 = tag instanceof FullyDrawnReporterOwner ? (FullyDrawnReporterOwner) tag : null;
                    if (fullyDrawnReporterOwner3 != null) {
                        fullyDrawnReporterOwner = fullyDrawnReporterOwner3;
                        break;
                    } else {
                        ?? parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(view);
                        view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
                    }
                }
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-571365177);
                gapComposer.end(false);
            }
            if (fullyDrawnReporterOwner == null) {
                gapComposer.startReplaceGroup(-571361040);
                Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof FullyDrawnReporterOwner) {
                        fullyDrawnReporterOwner2 = context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                fullyDrawnReporterOwner = fullyDrawnReporterOwner2;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-571365101);
                gapComposer.end(false);
            }
            if (fullyDrawnReporterOwner == null || (fullyDrawnReporter = fullyDrawnReporterOwner.getFullyDrawnReporter()) == null) {
                recomposeScopeImpl = gapComposer.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    function2 = new Function2(function0, i, r4) { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ Function0 f$0;

                        {
                            this.$r8$classId = r3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    Strings.ReportDrawnWhen(this.f$0, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    Strings.ReportDrawnWhen(this.f$0, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    recomposeScopeImpl.block = function2;
                }
                return;
            }
            int i5 = (gapComposer.changedInstance(fullyDrawnReporter) ? 1 : 0) | ((i3 & 14) == 4 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i5 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Recomposer$$ExternalSyntheticLambda4(i2, fullyDrawnReporter, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(fullyDrawnReporter, function0, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            function2 = new Function2(function0, i, i4) { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ Function0 f$0;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            Strings.ReportDrawnWhen(this.f$0, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            Strings.ReportDrawnWhen(this.f$0, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            recomposeScopeImpl.block = function2;
        }
    }

    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & BodyPartID.bodyIdMax);
        return new RoundRect(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m3986RoundRectZAM2FJo(Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.left, rect.top, rect.right, rect.bottom, j, j2, j3, j4);
    }

    public static final TextThemeInfo TextThemeInfo(Dimen$Sp dimen$Sp, int i, Dimen$Sp dimen$Sp2, float f) {
        return new TextThemeInfo(null, dimen$Sp, i, dimen$Sp2, new LetterSpacing$Companion$Em(f));
    }

    public static final void TouchRecordingLayout(final TouchRecorder touchRecorder, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        touchRecorder.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2140545228);
        int i4 = (gapComposer.changedInstance(touchRecorder) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (gapComposer.changed(modifier) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            final View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(touchRecorder) | gapComposer.changedInstance(view);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PointerInputEventHandler() { // from class: com.squareup.cash.securitysignals.ui.TouchRecordingKt$TouchRecordingLayout$1$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                        Object awaitPointerEventScope = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new FileSystem$commonDeleteRecursively$sequence$1(TouchRecorder.this, view, null, 6), continuation);
                        return awaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitPointerEventScope : Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, unit, (PointerInputEventHandler) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pointerInput);
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
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleEffectKt$$ExternalSyntheticLambda7(touchRecorder, modifier2, composableLambdaImpl, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyStyle(TextView textView, TextThemeInfo textThemeInfo) {
        textView.getClass();
        textThemeInfo.getClass();
        Context context = textView.getContext();
        context.getClass();
        textView.setTypeface(ResourcesCompat.getFont(context, textThemeInfo.font));
        Integer num = textThemeInfo.textColor;
        if (num != null) {
            int intValue = num.intValue();
            textView.setTextColor(intValue);
            textView.setLinkTextColor(intValue);
        }
        Dimen$Sp dimen$Sp = textThemeInfo.textSize;
        Context context2 = textView.getContext();
        context2.getClass();
        dimen$Sp.getClass();
        textView.setTextSize(0, Views.sp(context2, dimen$Sp.value));
        Context context3 = textView.getContext();
        context3.getClass();
        textView.setLetterSpacing(DBUtil.calculateLetterSpacingEm(context3, textThemeInfo));
        Dimen$Sp dimen$Sp2 = textThemeInfo.lineHeight;
        Context context4 = textView.getContext();
        context4.getClass();
        int sp = (int) Views.sp(context4, dimen$Sp2.value);
        if (textView instanceof LineHeightReceiver) {
            ((LineHeightReceiver) textView).setLineHeight(Integer.valueOf(sp));
        } else {
            PlatformKt.setLineHeight(textView, sp);
        }
    }

    public static final ContentTransform backwardLoadingTransition(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        animatedContentTransitionScopeImpl.getClass();
        return (ContentTransform) new OffersHomeQueries$$ExternalSyntheticLambda1(7).invoke(animatedContentTransitionScopeImpl);
    }

    public static final Preferences.Key booleanKey(String str) {
        str.getClass();
        return new Preferences.Key(str);
    }

    public static int checkSelfPermission(Context context, String str) {
        Room.requireNonNull(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    public static AccountPresenter.MetroFactory create(Badger.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealPasscodeFlowStarter.MetroFactory metroFactory2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, DoubleCheck doubleCheck4, RealBrazeConfigurator.MetroFactory metroFactory3, DelegateFactory delegateFactory, MoneyUiFactory.MetroFactory metroFactory4, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider, RealReferralManager.MetroFactory metroFactory5, RealLocalBrandSyncer.MetroFactory metroFactory6, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, RealChatManager.MetroFactory metroFactory7, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, RealFileDownloader.MetroFactory metroFactory8, BreadcrumbListener.MetroFactory metroFactory9, RealPasscodeFlowStarter.MetroFactory metroFactory10, Provider provider, RealMessageSigner.MetroFactory metroFactory11, TreehouseFlows.MetroFactory metroFactory12, InstanceFactory instanceFactory4) {
        metroFactory.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        doubleCheck3.getClass();
        instanceFactory.getClass();
        doubleCheck4.getClass();
        metroFactory3.getClass();
        delegateFactory.getClass();
        metroFactory4.getClass();
        doubleCheck5.getClass();
        lambdaProvider.getClass();
        metroFactory5.getClass();
        metroFactory6.getClass();
        instanceFactory2.getClass();
        lambdaProvider2.getClass();
        lambdaProvider3.getClass();
        arcadeModule$ProvideHapticVibratorMetroFactory.getClass();
        metroFactory8.getClass();
        metroFactory9.getClass();
        metroFactory10.getClass();
        provider.getClass();
        metroFactory11.getClass();
        metroFactory12.getClass();
        instanceFactory4.getClass();
        return new AccountPresenter.MetroFactory(metroFactory, doubleCheck, doubleCheck2, metroFactory2, doubleCheck3, instanceFactory, doubleCheck4, metroFactory3, delegateFactory, metroFactory4, doubleCheck5, lambdaProvider, metroFactory5, metroFactory6, instanceFactory2, instanceFactory3, lambdaProvider2, lambdaProvider3, metroFactory7, arcadeModule$ProvideHapticVibratorMetroFactory, metroFactory8, metroFactory9, metroFactory10, provider, metroFactory11, metroFactory12, instanceFactory4);
    }

    public static Version decode(String str) {
        if (str.equals("-")) {
            return null;
        }
        List split$default = StringsKt.split$default(str, new char[]{'.'}, 6);
        if (split$default.size() < 3) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) "Invalid version string: ".concat(str));
            return null;
        }
        Version.Builder builder = new Version.Builder();
        builder.major = Integer.valueOf(Integer.parseInt((String) split$default.get(0)));
        builder.minor = Integer.valueOf(Integer.parseInt((String) split$default.get(1)));
        builder.patch = Integer.valueOf(Integer.parseInt((String) split$default.get(2)));
        return new Version(builder.major, builder.minor, builder.patch, builder.buildUnknownFields());
    }

    public static final Preferences.Key doubleKey(String str) {
        str.getClass();
        return new Preferences.Key(str);
    }

    public static final String emptyAsNull(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final ContentTransform fadeAndScaleLoadingTransition(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        animatedContentTransitionScopeImpl.getClass();
        return (ContentTransform) new OffersHomeQueries$$ExternalSyntheticLambda1(5).invoke(animatedContentTransitionScopeImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e A[EDGE_INSN: B:48:0x008e->B:32:0x008e BREAK  A[LOOP:0: B:10:0x0014->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List findMigrationPath(LruHashMap lruHashMap, int i, int i2) {
        Pair pair;
        boolean z;
        lruHashMap.getClass();
        if (i == i2) {
            return EmptyList.INSTANCE;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap = lruHashMap.map;
                if (z2) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap != null) {
                        pair = new Pair(treeMap, treeMap.keySet());
                        if (pair != null) {
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 != null) {
                        pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                        if (pair != null) {
                            break;
                        }
                        Map map = (Map) pair.first;
                        Iterator it = ((Iterable) pair.second).iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i2 <= intValue && intValue < i) {
                                    Object obj = map.get(Integer.valueOf(intValue));
                                    obj.getClass();
                                    arrayList.add(obj);
                                    z = true;
                                    i = intValue;
                                    break;
                                    break;
                                }
                            } else if (i + 1 <= intValue && intValue <= i2) {
                                Object obj2 = map.get(Integer.valueOf(intValue));
                                obj2.getClass();
                                arrayList.add(obj2);
                                z = true;
                                i = intValue;
                                break;
                            }
                        }
                        z = false;
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
            } else {
                if (i <= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap2 = lruHashMap.map;
                if (z2) {
                }
            }
        } while (z);
        return null;
    }

    public static final Preferences.Key floatKey(String str) {
        str.getClass();
        return new Preferences.Key(str);
    }

    public static final ContentTransform forwardLoadingTransition(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        animatedContentTransitionScopeImpl.getClass();
        boolean booleanValue = ((Boolean) ((Pair) animatedContentTransitionScopeImpl.getTargetState()).second).booleanValue();
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new LoadableContentKt$$ExternalSyntheticLambda11(booleanValue, 0)), EnterExitTransitionKt.slideOutHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new LoadableContentKt$$ExternalSyntheticLambda11(booleanValue, 1)));
    }

    public static Data fromByteArray(byte[] bArr) {
        String str;
        String str2;
        ByteArrayInputStream byteArrayInputStream;
        int i;
        boolean z;
        bArr.getClass();
        if (bArr.length > 10240) {
            a$$ExternalSyntheticBUOutline0.m$1("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return Data.EMPTY;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            i = 0;
            z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
        } catch (IOException e) {
            str2 = Data_Kt.TAG;
            Logger$LogcatLogger.get().error(str2, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            str = Data_Kt.TAG;
            Logger$LogcatLogger.get().error(str, "Error in Data#fromByteArray: ", e2);
        }
        if (z) {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                while (i < readInt) {
                    linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    i++;
                }
                objectInputStream.close();
                return new Data(linkedHashMap);
            } finally {
            }
        } else {
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            try {
                short readShort = dataInputStream.readShort();
                if (readShort == -21521) {
                    short readShort2 = dataInputStream.readShort();
                    if (readShort2 != 1) {
                        Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readShort2, "Unsupported version number: "));
                    }
                } else {
                    Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readShort, "Magic number doesn't match: "));
                }
                int readInt2 = dataInputStream.readInt();
                while (i < readInt2) {
                    linkedHashMap.put(dataInputStream.readUTF(), fromByteArray$readValue(dataInputStream, dataInputStream.readByte()));
                    i++;
                }
                dataInputStream.close();
                return new Data(linkedHashMap);
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable fromByteArray$readValue(DataInputStream dataInputStream, byte b) {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i < readInt) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i < readInt2) {
                r02[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r02;
        }
        if (b == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i < readInt3) {
                r03[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r03;
        }
        if (b == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i < readInt4) {
                r04[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r04;
        }
        if (b == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i < readInt5) {
                r05[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r05;
        }
        if (b == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i < readInt6) {
                r06[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r06;
        }
        if (b != 14) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(b, "Unsupported type "));
            return null;
        }
        int readInt7 = dataInputStream.readInt();
        ?? r1 = new String[readInt7];
        while (i < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (Intrinsics.areEqual(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r1[i] = readUTF;
            i++;
        }
        return r1;
    }

    public static final ViewModelStoreOwner get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            ViewModelStoreOwner viewModelStoreOwner = tag instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) tag : null;
            if (viewModelStoreOwner != null) {
                return viewModelStoreOwner;
            }
            Object parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return ResourcesCompat.getColorStateList(context.getResources(), i, context.getTheme());
    }

    public static Colors getColors(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            return re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        }
        gapComposer.startReplaceGroup(-1762997739);
        gapComposer.end(false);
        return colors;
    }

    public static long getCurrentTextColor(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1044898235);
        long j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalTextColor)).value;
        if (j == 16) {
            j = getColors(gapComposer).semantic.text.standard;
        }
        gapComposer.end(false);
        return j;
    }

    public static TextStyle getCurrentTextStyle(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        TextStyle textStyle = (TextStyle) gapComposer.consume(ArcadeThemeKt.LocalTextStyle);
        if (textStyle == null) {
            gapComposer.startReplaceGroup(-1100573765);
            textStyle = getTypography(gapComposer).labelMedium;
        } else {
            gapComposer.startReplaceGroup(-1100574912);
        }
        gapComposer.end(false);
        return textStyle;
    }

    public static DefaultSizes getSizes(Composer composer) {
        return (DefaultSizes) ((GapComposer) composer).consume(ArcadeThemeKt.LocalSizes);
    }

    public static Typography getTypography(Composer composer) {
        return (Typography) ((GapComposer) composer).consume(ArcadeThemeKt.LocalTypography);
    }

    public static final ContentTransform inPlaceLoadingTransition(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        animatedContentTransitionScopeImpl.getClass();
        return (ContentTransform) new OffersHomeQueries$$ExternalSyntheticLambda1(4).invoke(animatedContentTransitionScopeImpl);
    }

    public static final Preferences.Key intKey(String str) {
        str.getClass();
        return new Preferences.Key(str);
    }

    /* renamed from: isFromSoftKeyboard-ZmokQxo, reason: not valid java name */
    public static final boolean m3987isFromSoftKeyboardZmokQxo(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final boolean isMigrationRequired(DatabaseConfiguration databaseConfiguration, int i, int i2) {
        databaseConfiguration.getClass();
        if (i > i2 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set set = databaseConfiguration.migrationNotRequiredFrom;
        return databaseConfiguration.requireMigration && (set == null || !set.contains(Integer.valueOf(i)));
    }

    public static boolean isNotTrailingByte(byte b) {
        return b > -65;
    }

    public static final boolean isSimple(RoundRect roundRect) {
        long j = roundRect.topLeftCornerRadius;
        return (j >>> 32) == (BodyPartID.bodyIdMax & j) && j == roundRect.topRightCornerRadius && j == roundRect.bottomRightCornerRadius && j == roundRect.bottomLeftCornerRadius;
    }

    public static final Preferences.Key longKey(String str) {
        str.getClass();
        return new Preferences.Key(str);
    }

    public static Supplier memoize(final Supplier supplier) {
        return ((supplier instanceof Suppliers$NonSerializableMemoizingSupplier) || (supplier instanceof Suppliers$MemoizingSupplier)) ? supplier : supplier instanceof Serializable ? new Suppliers$MemoizingSupplier(supplier) : new Supplier(supplier) { // from class: com.google.common.base.Suppliers$NonSerializableMemoizingSupplier
            public static final Suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0 SUCCESSFULLY_COMPUTED = new Suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0();
            public volatile Supplier delegate;
            public final Object lock = new Object();
            public Object value;

            {
                supplier.getClass();
                this.delegate = supplier;
            }

            @Override // com.google.common.base.Supplier
            public final Object get() {
                Supplier supplier2 = this.delegate;
                Suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0 suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0 = SUCCESSFULLY_COMPUTED;
                if (supplier2 != suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0) {
                    synchronized (this.lock) {
                        try {
                            if (this.delegate != suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0) {
                                Object obj = this.delegate.get();
                                this.value = obj;
                                this.delegate = suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0;
                                return obj;
                            }
                        } finally {
                        }
                    }
                }
                return this.value;
            }

            public final String toString() {
                Object obj = this.delegate;
                StringBuilder sb = new StringBuilder("Suppliers.memoize(");
                if (obj == SUCCESSFULLY_COMPUTED) {
                    obj = Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("<supplier that returned "), this.value, ">");
                }
                return Recorder$$ExternalSyntheticOutline1.m(sb, obj, ")");
            }
        };
    }

    public static final MutableState receiveValueAsState(StateFlow stateFlow, Composer composer) {
        stateFlow.getClass();
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startMovableGroup(-1329371890, stateFlow);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(emptyCoroutineContext, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            JobKt.launch(coroutineScope, emptyCoroutineContext, CoroutineStart.UNDISPATCHED, new TimerWorker$run$1(stateFlow, ref$ObjectRef, null, 19));
            Object obj = ref$ObjectRef.element;
            if (obj == null) {
                a$$ExternalSyntheticBUOutline0.m("Dispatch occurred before observing first item on ", stateFlow, ". This is probably caused by application of a misbehaving operator.");
                return null;
            }
            rememberedValue2 = (MutableState) obj;
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        gapComposer.end(false);
        return mutableState;
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i2 == 0 || (i & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? ContextCompat$Api33Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, i) : ContextCompat$Api26Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, i);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        return null;
    }

    public static ButtonColors standard(Composer composer) {
        return new ButtonColors(getColors(composer).component.button.standard.text.f165default, getColors(composer).component.button.standard.text.disabled, getColors(composer).component.button.standard.background.f163default, getColors(composer).component.button.standard.background.disabled, getColors(composer).component.button.standard.icon.f164default, getColors(composer).component.button.standard.icon.disabled, getColors(composer).semantic.icon.prominent, (RippleConfiguration) ((GapComposer) composer).consume(RippleKt.LocalRippleConfiguration));
    }

    public static final Preferences.Key stringKey(String str) {
        str.getClass();
        return new Preferences.Key(str);
    }

    public static byte[] toByteArrayInternalV1(Data data) {
        String str;
        data.getClass();
        HashMap hashMap = data.values;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    toByteArrayInternalV1$writeEntry(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            str = Data_Kt.TAG;
            Logger$LogcatLogger.get().error(str, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                Path$$ExternalSyntheticBUOutline0.m(Reflection.factory.getOrCreateKotlinClass(obj.getClass()).getSimpleName(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            ReflectionFactory reflectionFactory = Reflection.factory;
            KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(cls);
            if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Boolean[].class))) {
                i = 8;
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Byte[].class))) {
                i = 9;
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Integer[].class))) {
                i = 10;
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Long[].class))) {
                i = 11;
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Float[].class))) {
                i = 12;
            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Double[].class))) {
                i = 13;
            } else {
                if (!orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(String[].class))) {
                    Path$$ExternalSyntheticBUOutline0.m(reflectionFactory.getOrCreateKotlinClass(objArr.getClass()).getQualifiedName(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : RecyclerView.DECELERATION_RATE);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static void zza(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = PlaceHolderKt.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                zza = PlaceHolderKt.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
    }

    public static void zzc(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zze(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zze(i2, i3, "end index") : PlaceHolderKt.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zze(int i, int i2, String str) {
        if (i < 0) {
            return PlaceHolderKt.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return PlaceHolderKt.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    public abstract long getServerTimestampMillis();

    public abstract void hide(int i);

    public abstract boolean isAppearanceLightStatusBars();

    public abstract void setAppearanceLightNavigationBars(boolean z);

    public abstract void setAppearanceLightStatusBars(boolean z);

    public abstract void show(int i);

    public static LocalPresenterFactory.MetroFactory create(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25, InstanceFactory instanceFactory26, InstanceFactory instanceFactory27, InstanceFactory instanceFactory28, InstanceFactory instanceFactory29, InstanceFactory instanceFactory30) {
        instanceFactory.getClass();
        instanceFactory15.getClass();
        return new LocalPresenterFactory.MetroFactory(instanceFactory, instanceFactory2, instanceFactory3, instanceFactory4, instanceFactory5, instanceFactory6, instanceFactory7, instanceFactory8, instanceFactory9, instanceFactory10, instanceFactory11, instanceFactory12, instanceFactory13, instanceFactory14, instanceFactory15, instanceFactory16, instanceFactory17, instanceFactory18, instanceFactory19, instanceFactory20, instanceFactory21, instanceFactory22, instanceFactory23, instanceFactory24, instanceFactory25, instanceFactory26, instanceFactory27, instanceFactory28, instanceFactory29, instanceFactory30);
    }

    public static PaymentActionHandler.MetroFactory create(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, RealBrazeManager.MetroFactory metroFactory, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, RealFileDownloader.MetroFactory metroFactory2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory3, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealGlobalConfigDataSource.MetroFactory metroFactory4, LambdaProvider lambdaProvider5, RealPasscodeFlowStarter.MetroFactory metroFactory5, RealGlobalConfigManager.MetroFactory metroFactory6, IntentLauncher.MetroFactory metroFactory7, LambdaProvider lambdaProvider6, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider7, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider8, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory2) {
        lambdaProvider.getClass();
        lambdaProvider2.getClass();
        lambdaProvider3.getClass();
        metroFactory.getClass();
        broadwayModule$ProvideBroadwayMetroFactory.getClass();
        metroFactory2.getClass();
        musicViewFactory$MetroFactory.getClass();
        doubleCheck.getClass();
        metroFactory3.getClass();
        lambdaProvider4.getClass();
        doubleCheck2.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        metroFactory4.getClass();
        lambdaProvider5.getClass();
        metroFactory5.getClass();
        metroFactory7.getClass();
        lambdaProvider6.getClass();
        instanceFactory.getClass();
        instanceFactory2.getClass();
        lambdaProvider7.getClass();
        doubleCheck5.getClass();
        lambdaProvider8.getClass();
        musicViewFactory$MetroFactory2.getClass();
        return new PaymentActionHandler.MetroFactory((Provider) lambdaProvider, (Provider) lambdaProvider2, (Provider) lambdaProvider3, (Provider) metroFactory, (Provider) broadwayModule$ProvideBroadwayMetroFactory, (Provider) metroFactory2, (Provider) musicViewFactory$MetroFactory, (Provider) doubleCheck, (Provider) metroFactory3, (Provider) lambdaProvider4, (Provider) doubleCheck2, (Provider) doubleCheck3, (Provider) doubleCheck4, (Provider) metroFactory4, (Provider) lambdaProvider5, (Provider) metroFactory5, metroFactory6, (Provider) metroFactory7, (Provider) lambdaProvider6, (Provider) instanceFactory, (Provider) instanceFactory2, (Provider) lambdaProvider7, (Provider) doubleCheck5, (Provider) lambdaProvider8, (Provider) musicViewFactory$MetroFactory2);
    }
}
