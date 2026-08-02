package com.squareup.util.cash;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.icu.text.MessageFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidContentType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathParserKt;
import androidx.compose.ui.graphics.vector.VectorGroup;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPath;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorResources;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.compose.ui.res.ResourceResolutionException;
import androidx.compose.ui.text.font.AndroidFontResolveInterceptor;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontWeightAdjustmentHelperApi31;
import androidx.compose.ui.unit.Dp;
import androidx.core.os.BundleKt;
import androidx.core.provider.FontRequest;
import androidx.core.view.ViewKt;
import androidx.customview.poolingcontainer.PoolingContainerListenerHolder;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.glance.appwidget.MyPackageReplacedReceiver$onReceive$1;
import androidx.paging.CachedPagingDataKt$cachedIn$2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.badging.backend.RealBadger2;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.ui.compose.UiScopeKt$$ExternalSyntheticLambda1;
import app.cash.local.views.LocalViewFactory;
import app.cash.molecule.PlatformKt;
import app.cash.paraphrase.FormattedResource;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.datatransport.AutoValue_Event;
import com.google.android.datatransport.AutoValue_ProductData;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.runtime.TransportFactoryImpl;
import com.google.android.datatransport.runtime.TransportImpl;
import com.google.android.gms.common.internal.zzae;
import com.google.android.play.integrity.internal.ax;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFutureState;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.analytics.ParametersBuilder;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.RealActivityItemPresenterFactory;
import com.squareup.cash.aiedge.MLKitTitleGenerator$MetroFactory;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.header.PageHeaderKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt$$ExternalSyntheticLambda6;
import com.squareup.cash.bitcoin.presenters.BitcoinPresenterFactory;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.crypto.backend.balance.CryptoBalanceRepoKt$asMoney$$inlined$map$1;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.db.GetActiveLink;
import com.squareup.cash.db.GetLinkForAccount;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.db.StorageLinkQueries$getActiveLink$2;
import com.squareup.cash.db.StorageLinkQueries$getLinkForAccount$2;
import com.squareup.cash.db.Storage_link;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.StorageLinkQueriesKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.util.country.SupportedCountryConfig;
import com.squareup.cash.util.country.UtilKt;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.SetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceBuilderIterator;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import okhttp3.Cache;
import okhttp3.internal.http.StatusLine;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;
import papa.internal.LaunchTracker;
import timber.log.Timber;

/* loaded from: classes.dex */
public abstract class Countries {
    public static final AndroidContentType ContentType(String str) {
        return new AndroidContentType(SetsKt__SetsJVMKt.setOf(str));
    }

    public static final long IntSize(int i, int i2) {
        return (i2 & BodyPartID.bodyIdMax) | (i << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PageHeader(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, Function2 function22, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function2 function24;
        Function2 function25;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-840826711);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                Function2 function26 = function2;
                i3 |= gapComposer.changedInstance(function26) ? 256 : 128;
                function23 = function26;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function24 = function22;
                    i3 |= gapComposer.changedInstance(function24) ? 2048 : 1024;
                    int i7 = 1;
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                        gapComposer.skipToGroupEnd();
                        function25 = function23;
                    } else {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (i6 != 0) {
                            modifier2 = companion;
                        }
                        if (i4 != 0) {
                            function23 = null;
                        }
                        if (i5 != 0) {
                            function24 = null;
                        }
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier2, ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                        if (function23 != null) {
                            gapComposer.startReplaceGroup(-788763031);
                            function23.invoke(gapComposer, Integer.valueOf((i3 >> 6) & 14));
                            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-788695761);
                            gapComposer.end(false);
                        }
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                        ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).pageTitle);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(462936371, new UiScopeKt$$ExternalSyntheticLambda1(composableLambdaImpl), gapComposer), gapComposer, 56);
                        if (function24 != null) {
                            re$$ExternalSyntheticOutline0.m(gapComposer, -788469399, companion, 16.0f, gapComposer);
                            Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(1722579873, new ContextKt$$ExternalSyntheticLambda0(i7, function24), gapComposer), gapComposer, 56);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-788217617);
                            gapComposer.end(false);
                        }
                        gapComposer.end(true);
                        function25 = function23;
                    }
                    Modifier modifier3 = modifier2;
                    Function2 function27 = function25;
                    Function2 function28 = function24;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new ArcadeThemeKt$$ExternalSyntheticLambda6(composableLambdaImpl, modifier3, function27, function28, i, i2, 2);
                        return;
                    }
                    return;
                }
                function24 = function22;
                int i72 = 1;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                }
                Modifier modifier32 = modifier2;
                Function2 function272 = function25;
                Function2 function282 = function24;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function24 = function22;
            int i722 = 1;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
            }
            Modifier modifier322 = modifier2;
            Function2 function2722 = function25;
            Function2 function2822 = function24;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function24 = function22;
        int i7222 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        Modifier modifier3222 = modifier2;
        Function2 function27222 = function25;
        Function2 function28222 = function24;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final CryptoBalanceRepoKt$asMoney$$inlined$map$1 asMoney(Flow flow) {
        flow.getClass();
        return new CryptoBalanceRepoKt$asMoney$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(flow, 24), 0);
    }

    public static long calculateNextRunTime(boolean z, int i, BackoffPolicy backoffPolicy, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        backoffPolicy.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long scalb = backoffPolicy == BackoffPolicy.LINEAR ? j * i : (long) Math.scalb(j, i - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j2 + scalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static final void callPoolingContainerOnRelease(View view) {
        view.getClass();
        SequenceBuilderIterator it = SequencesKt__SequenceBuilderKt.iterator((Function2) ViewKt.getAllViews(view).$this_lineSequence$inlined);
        while (it.hasNext()) {
            ArrayList arrayList = getPoolingContainerListenerHolder((View) it.next()).listeners;
            for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList); -1 < lastIndex; lastIndex--) {
                ((ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0) arrayList.get(lastIndex)).f$0.disposeComposition();
            }
        }
    }

    public static final MutableState collectIsFocusedAsState(MutableInteractionSourceImpl mutableInteractionSourceImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        int i2 = 0;
        boolean z = (((i & 14) ^ 6) > 4 && gapComposer.changed(mutableInteractionSourceImpl)) || (i & 6) == 4;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (z || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new FocusInteractionKt$collectIsFocusedAsState$1$1(mutableInteractionSourceImpl, mutableState, null, i2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, mutableInteractionSourceImpl, (Function2) rememberedValue2);
        return mutableState;
    }

    public static PaymentActionHandler.MetroFactory create(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealRecipientRepository.MetroFactory metroFactory, LambdaProvider lambdaProvider, DelegateFactory delegateFactory, LocalViewFactory.MetroFactory metroFactory2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealSessionFlags.MetroFactory metroFactory3, RealSessionFlags.MetroFactory metroFactory4, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, LambdaProvider lambdaProvider2, IntentLauncher.MetroFactory metroFactory5, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck5, RealBadger2.MetroFactory metroFactory6, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, RealMessageSigner.MetroFactory metroFactory7, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, DoubleCheck doubleCheck6, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, IntentLauncher.MetroFactory metroFactory8, TemporaryStorage.MetroFactory metroFactory9) {
        doubleCheck.getClass();
        doubleCheck2.getClass();
        metroFactory.getClass();
        lambdaProvider.getClass();
        delegateFactory.getClass();
        metroFactory2.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        metroFactory3.getClass();
        metroFactory4.getClass();
        walletUiFactory$MetroFactory.getClass();
        lambdaProvider2.getClass();
        metroFactory5.getClass();
        lambdaProvider3.getClass();
        lambdaProvider4.getClass();
        doubleCheck5.getClass();
        metroFactory6.getClass();
        metroFactory7.getClass();
        realDrawerOpener$MetroFactory.getClass();
        doubleCheck6.getClass();
        attestedKeyMetrics$MetroFactory.getClass();
        metroFactory8.getClass();
        metroFactory9.getClass();
        return new PaymentActionHandler.MetroFactory(doubleCheck, doubleCheck2, metroFactory, lambdaProvider, delegateFactory, metroFactory2, doubleCheck3, doubleCheck4, metroFactory3, metroFactory4, walletUiFactory$MetroFactory, lambdaProvider2, metroFactory5, lambdaProvider3, lambdaProvider4, doubleCheck5, metroFactory6, broadwayModule$ProvideBroadwayMetroFactory, metroFactory7, realDrawerOpener$MetroFactory, doubleCheck6, attestedKeyMetrics$MetroFactory, musicViewFactory$MetroFactory, metroFactory8, metroFactory9);
    }

    public static final FontFamilyResolverImpl createFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new ax(context), new AndroidFontResolveInterceptor(Build.VERSION.SDK_INT >= 31 ? FontWeightAdjustmentHelperApi31.INSTANCE.fontWeightAdjustment(context) : 0));
    }

    public static boolean deliveryMetricsExportToBigQueryEnabled() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.getInstance();
            FirebaseApp firebaseApp = FirebaseApp.getInstance();
            firebaseApp.checkNotDeleted();
            Context context = firebaseApp.applicationContext;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final String displayName(Country country) {
        country.getClass();
        String displayName = new Locale("", country.name()).getDisplayName();
        displayName.getClass();
        return displayName;
    }

    public static final SavedStateRegistryOwner get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            SavedStateRegistryOwner savedStateRegistryOwner = tag instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) tag : null;
            if (savedStateRegistryOwner != null) {
                return savedStateRegistryOwner;
            }
            Object parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final String[] getContentHints(ContentType contentType) {
        contentType.getClass();
        return (String[]) ((AndroidContentType) contentType).androidAutofillHints.toArray(new String[0]);
    }

    public static final StorageLink.Sandboxed getOrCreateOnboardingLink(SessionQueries sessionQueries) {
        sessionQueries.getClass();
        Storage_link storage_link = (Storage_link) TransactorKt.transactionWithResult$default(sessionQueries, new StorageLinkQueriesKt$$ExternalSyntheticLambda0(sessionQueries, 1));
        return new StorageLink.Sandboxed(storage_link.id, storage_link.signin_group_id, storage_link.created_at_ms);
    }

    public static final PoolingContainerListenerHolder getPoolingContainerListenerHolder(View view) {
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
        view.setTag(R.id.pooling_container_listener_holder_tag, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }

    public static final StorageLink getRawActiveLink(SessionQueries sessionQueries) {
        sessionQueries.getClass();
        StorageLinkQueries$getActiveLink$2 storageLinkQueries$getActiveLink$2 = StorageLinkQueries$getActiveLink$2.INSTANCE;
        SqlDriver sqlDriver = sessionQueries.driver;
        Matcher$$ExternalSyntheticLambda9 matcher$$ExternalSyntheticLambda9 = new Matcher$$ExternalSyntheticLambda9(27);
        sqlDriver.getClass();
        GetActiveLink getActiveLink = (GetActiveLink) new SimpleQuery(-2108979043, new String[]{"storage_link", "active_storage_link"}, sqlDriver, "StorageLink.sq", "getActiveLink", "SELECT storage_link.account_token, storage_link.id, storage_link.signin_group_id, storage_link.created_at_ms FROM active_storage_link\nLEFT OUTER JOIN storage_link ON active_storage_link.storage_link_id = storage_link.id\nWHERE active_storage_link.id = 1", matcher$$ExternalSyntheticLambda9).executeAsOneOrNull();
        Long l = getActiveLink != null ? getActiveLink.id : null;
        Long l2 = getActiveLink != null ? getActiveLink.signin_group_id : null;
        Long l3 = getActiveLink != null ? getActiveLink.created_at_ms : null;
        if (getActiveLink == null) {
            return null;
        }
        return (l == null || l2 == null || l3 == null) ? StorageLink.Legacy.INSTANCE : new StorageLink.Sandboxed(l.longValue(), l2.longValue(), l3.longValue());
    }

    public static final StorageLink getStorageLink(SessionQueries sessionQueries, String str) {
        sessionQueries.getClass();
        if (str == null) {
            return getOrCreateOnboardingLink(sessionQueries);
        }
        StorageLinkQueries$getLinkForAccount$2 storageLinkQueries$getLinkForAccount$2 = StorageLinkQueries$getLinkForAccount$2.INSTANCE;
        GetLinkForAccount getLinkForAccount = (GetLinkForAccount) new RewardQueries.ForIdsQuery(sessionQueries, str, new SessionQueries$$ExternalSyntheticLambda1(10), 14).executeAsOneOrNull();
        if (getLinkForAccount != null) {
            return new StorageLink.Sandboxed(getLinkForAccount.getId(), getLinkForAccount.getSignin_group_id(), getLinkForAccount.getCreated_at_ms());
        }
        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No sandboxed link found for ", str, ", using a legacy link"), new Object[0]);
        return StorageLink.Legacy.INSTANCE;
    }

    public static final String getString(Resources resources, FormattedResource formattedResource) {
        resources.getClass();
        formattedResource.getClass();
        String format2 = new MessageFormat(resources.getString(formattedResource.id)).format(formattedResource.arguments);
        format2.getClass();
        return format2;
    }

    public static boolean isUserUnlocked(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void linkAccountToStorage(SessionQueries sessionQueries, String str, StorageLink.Sandboxed sandboxed) {
        sessionQueries.getClass();
        str.getClass();
        long j = sandboxed.id;
        sessionQueries.driver.execute(396594067, "UPDATE storage_link\nSET account_token = ?\nWHERE id = ?", new StorageLinkQueries$$ExternalSyntheticLambda13(str, j, 0));
        sessionQueries.notifyQueries(396594067, new SessionQueries$$ExternalSyntheticLambda1(9, null == true ? 1 : 0));
        Timber.Forest.d("Linked account %s to storage with id %d", str, Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void logNotificationReceived(Intent intent) {
        int parseInt;
        Object[] objArr;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        long parseLong;
        String str;
        String str2;
        if (shouldUploadScionMetrics(intent)) {
            logToScion(intent.getExtras(), "_nr");
        }
        int i = 0;
        if ((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : deliveryMetricsExportToBigQueryEnabled()) {
            TransportFactory transportFactory = FirebaseMessaging.getTransportFactory();
            if (transportFactory == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            MessagingClientEvent messagingClientEvent = null;
            r3 = null;
            String str3 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                MessagingClientEvent.Builder newBuilder = MessagingClientEvent.newBuilder();
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    parseInt = 0;
                }
                newBuilder.setTtl(parseInt);
                newBuilder.setEvent();
                String string7 = extras.getString("google.to");
                if (TextUtils.isEmpty(string7)) {
                    try {
                        string7 = (String) Room.await(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
                    } catch (InterruptedException | ExecutionException e) {
                        a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                        return;
                    }
                }
                newBuilder.setInstanceId(string7);
                FirebaseApp firebaseApp = FirebaseApp.getInstance();
                firebaseApp.checkNotDeleted();
                newBuilder.setPackageName(firebaseApp.applicationContext.getPackageName());
                newBuilder.setSdkPlatform();
                newBuilder.setMessageType(ParametersBuilder.isNotification(extras) ? MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION : MessagingClientEvent.MessageType.DATA_MESSAGE);
                String string8 = extras.getString("google.delivered_priority");
                if (string8 == null) {
                    if (!"1".equals(extras.getString("google.priority_reduced"))) {
                        string8 = extras.getString("google.priority");
                    }
                    objArr = 2;
                    if (objArr != 2) {
                        i = 5;
                    } else if (objArr == 1) {
                        i = 10;
                    }
                    newBuilder.setPriority(i);
                    string2 = extras.getString("google.message_id");
                    if (string2 == null) {
                        string2 = extras.getString("message_id");
                    }
                    if (string2 != null) {
                        newBuilder.setMessageId(string2);
                    }
                    string3 = extras.getString("from");
                    if (string3 != null && string3.startsWith("/topics/")) {
                        str3 = string3;
                    }
                    if (str3 != null) {
                        newBuilder.setTopic(str3);
                    }
                    string4 = extras.getString("collapse_key");
                    if (string4 != null) {
                        newBuilder.setCollapseKey(string4);
                    }
                    string5 = extras.getString("google.c.a.m_l");
                    if (string5 != null) {
                        newBuilder.setAnalyticsLabel(string5);
                    }
                    string6 = extras.getString("google.c.a.c_l");
                    if (string6 != null) {
                        newBuilder.setComposerLabel(string6);
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e2) {
                            Log.w("FirebaseMessaging", "error parsing project number", e2);
                        }
                        if (parseLong > 0) {
                            newBuilder.setProjectNumber(parseLong);
                        }
                        messagingClientEvent = newBuilder.build();
                    }
                    FirebaseApp firebaseApp2 = FirebaseApp.getInstance();
                    FirebaseOptions firebaseOptions = firebaseApp2.options;
                    firebaseApp2.checkNotDeleted();
                    str = firebaseOptions.gcmSenderId;
                    if (str != null) {
                        try {
                            parseLong = Long.parseLong(str);
                        } catch (NumberFormatException e3) {
                            Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                        }
                        if (parseLong > 0) {
                        }
                        messagingClientEvent = newBuilder.build();
                    }
                    firebaseApp2.checkNotDeleted();
                    str2 = firebaseOptions.applicationId;
                    if (str2.startsWith("1:")) {
                        try {
                            parseLong = Long.parseLong(str2);
                        } catch (NumberFormatException e4) {
                            Log.w("FirebaseMessaging", "error parsing app ID", e4);
                        }
                    } else {
                        String[] split = str2.split(":");
                        if (split.length >= 2) {
                            String str4 = split[1];
                            if (!str4.isEmpty()) {
                                try {
                                    parseLong = Long.parseLong(str4);
                                } catch (NumberFormatException e5) {
                                    Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                }
                            }
                        }
                        parseLong = 0;
                    }
                    if (parseLong > 0) {
                    }
                    messagingClientEvent = newBuilder.build();
                }
                if ("high".equals(string8)) {
                    objArr = 1;
                } else {
                    if (!"normal".equals(string8)) {
                        objArr = 0;
                    }
                    objArr = 2;
                }
                if (objArr != 2) {
                }
                newBuilder.setPriority(i);
                string2 = extras.getString("google.message_id");
                if (string2 == null) {
                }
                if (string2 != null) {
                }
                string3 = extras.getString("from");
                if (string3 != null) {
                    str3 = string3;
                }
                if (str3 != null) {
                }
                string4 = extras.getString("collapse_key");
                if (string4 != null) {
                }
                string5 = extras.getString("google.c.a.m_l");
                if (string5 != null) {
                }
                string6 = extras.getString("google.c.a.c_l");
                if (string6 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                FirebaseApp firebaseApp22 = FirebaseApp.getInstance();
                FirebaseOptions firebaseOptions2 = firebaseApp22.options;
                firebaseApp22.checkNotDeleted();
                str = firebaseOptions2.gcmSenderId;
                if (str != null) {
                }
                firebaseApp22.checkNotDeleted();
                str2 = firebaseOptions2.applicationId;
                if (str2.startsWith("1:")) {
                }
                if (parseLong > 0) {
                }
                messagingClientEvent = newBuilder.build();
            }
            if (messagingClientEvent == null) {
                return;
            }
            try {
                AutoValue_ProductData withProductId = AutoValue_ProductData.withProductId(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                TransportImpl transport = ((TransportFactoryImpl) transportFactory).getTransport("FCM_CLIENT_EVENT_LOGGING", Encoding.of(), new AesGcmSiv$$ExternalSyntheticLambda0(12));
                SizeMap newBuilder2 = MessagingClientEventExtension.newBuilder();
                newBuilder2.setMessagingClientEvent(messagingClientEvent);
                transport.send(AutoValue_Event.ofData(newBuilder2.build(), withProductId));
            } catch (RuntimeException e6) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
            }
        }
    }

    public static void logToScion(Bundle bundle, String str) {
        try {
            FirebaseApp.getInstance();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string2 = bundle.getString("google.c.a.c_id");
            if (string2 != null) {
                bundle2.putString("_nmid", string2);
            }
            String string3 = bundle.getString("google.c.a.c_l");
            if (string3 != null) {
                bundle2.putString("_nmn", string3);
            }
            String string4 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString(AnnotatedPrivateKey.LABEL, string4);
            }
            String string5 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string5)) {
                bundle2.putString("message_channel", string5);
            }
            String string6 = bundle.getString("from");
            if (string6 == null || !string6.startsWith("/topics/")) {
                string6 = null;
            }
            if (string6 != null) {
                bundle2.putString("_nt", string6);
            }
            String string7 = bundle.getString("google.c.a.ts");
            if (string7 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string7));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string8 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string8 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string8));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = ParametersBuilder.isNotification(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            FirebaseApp firebaseApp = FirebaseApp.getInstance();
            firebaseApp.checkNotDeleted();
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) firebaseApp.componentRuntime.get(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                ((AnalyticsConnectorImpl) analyticsConnector).logEvent(bundle2, str);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final DerivedStateFlow observeState(KeyValue keyValue) {
        keyValue.getClass();
        return new DerivedStateFlow(new AppUpdateDetector$$ExternalSyntheticLambda0(keyValue, 8), keyValue.observe());
    }

    public static final void onCurrentSandboxComponentExt(Context context, ContextScope contextScope, SetupTeardown setupTeardown) {
        context.getClass();
        contextScope.getClass();
        Continuation continuation = null;
        StateFlow stateFlow = (StateFlow) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new MyPackageReplacedReceiver$onReceive$1(context, continuation, 1));
        LaunchTracker.launch$default(new LaunchTracker((Function1) new ContextKt$$ExternalSyntheticLambda1(stateFlow, 0), setupTeardown, (CoroutineScope) contextScope), new CachedPagingDataKt$cachedIn$2(stateFlow, continuation, 4), 1);
    }

    public static final void onEachSandboxComponentExt(Context context, CoroutineScope coroutineScope, Function2 function2) {
        context.getClass();
        coroutineScope.getClass();
        StateFlow stateFlow = (StateFlow) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new CashApp$onCreate$4$1$1(context, null, 11));
        ContextKt$$ExternalSyntheticLambda0 contextKt$$ExternalSyntheticLambda0 = new ContextKt$$ExternalSyntheticLambda0(0, function2);
        stateFlow.getClass();
        StateFlowKt.stateInScoped(stateFlow, coroutineScope, new ComposerKt$$ExternalSyntheticLambda0(contextKt$$ExternalSyntheticLambda0, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Painter painterResource(int i, int i2, Composer composer) {
        TypedValue typedValue;
        int i3;
        long j;
        int i4;
        int i5;
        int eventType;
        int i6;
        AndroidVectorParser androidVectorParser;
        int i7;
        List list;
        List list2;
        int i8;
        int namedInt;
        int i9;
        Shader shader;
        Brush solidColor;
        GapComposer gapComposer = (GapComposer) composer;
        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        Resources resources = (Resources) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalResources);
        ResourceIdCache resourceIdCache = (ResourceIdCache) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalResourceIdCache);
        synchronized (resourceIdCache) {
            typedValue = (TypedValue) resourceIdCache.resIdPathMap.get(i);
            i3 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                resourceIdCache.resIdPathMap.put(i, typedValue);
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !kotlin.text.StringsKt.endsWith$default(charSequence, ".xml")) {
            gapComposer.startReplaceGroup(-1771643000);
            boolean changed = gapComposer.changed(context.getTheme()) | gapComposer.changed(charSequence) | ((((i2 & 14) ^ 6) > 4 && gapComposer.changed(i)) || (i2 & 6) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                try {
                    rememberedValue = ImageResources_androidKt.imageResource(resources, i);
                    gapComposer.updateRememberedValue(rememberedValue);
                } catch (Exception e) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            BitmapPainter bitmapPainter = new BitmapPainter((AndroidImageBitmap) rememberedValue);
            gapComposer.end(false);
            return bitmapPainter;
        }
        gapComposer.startReplaceGroup(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i10 = typedValue.changingConfigurations;
        ImageVectorCache imageVectorCache = (ImageVectorCache) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalImageVectorCache);
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i);
        WeakReference weakReference = (WeakReference) imageVectorCache.map.get(key);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = weakReference != null ? (ImageVectorCache.ImageVectorEntry) weakReference.get() : null;
        if (imageVectorEntry == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.areEqual(xml.getName(), "vector")) {
                a$$ExternalSyntheticBUOutline0.m$3("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            AndroidVectorParser androidVectorParser2 = new AndroidVectorParser(xml);
            TypedArray obtainAttributes = DimensionKt.obtainAttributes(resources, theme, asAttributeSet, AndroidVectorResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
            androidVectorParser2.updateConfig(obtainAttributes.getChangingConfigurations());
            boolean z = !DimensionKt.hasAttribute(xml, "autoMirrored") ? false : obtainAttributes.getBoolean(5, false);
            androidVectorParser2.updateConfig(obtainAttributes.getChangingConfigurations());
            float namedFloat = androidVectorParser2.getNamedFloat(obtainAttributes, "viewportWidth", 7, RecyclerView.DECELERATION_RATE);
            float namedFloat2 = androidVectorParser2.getNamedFloat(obtainAttributes, "viewportHeight", 8, RecyclerView.DECELERATION_RATE);
            if (namedFloat <= RecyclerView.DECELERATION_RATE) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (namedFloat2 <= RecyclerView.DECELERATION_RATE) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = obtainAttributes.getDimension(3, RecyclerView.DECELERATION_RATE);
            androidVectorParser2.updateConfig(obtainAttributes.getChangingConfigurations());
            float dimension2 = obtainAttributes.getDimension(2, RecyclerView.DECELERATION_RATE);
            androidVectorParser2.updateConfig(obtainAttributes.getChangingConfigurations());
            if (obtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                obtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    j = Color.Unspecified;
                } else {
                    ColorStateList namedColorStateList = DimensionKt.getNamedColorStateList(obtainAttributes, xml, theme);
                    androidVectorParser2.updateConfig(obtainAttributes.getChangingConfigurations());
                    j = namedColorStateList != null ? ColorKt.Color(namedColorStateList.getDefaultColor()) : Color.Unspecified;
                }
            } else {
                j = Color.Unspecified;
            }
            long j2 = j;
            int i11 = obtainAttributes.getInt(6, -1);
            androidVectorParser2.updateConfig(obtainAttributes.getChangingConfigurations());
            if (i11 != -1) {
                if (i11 == 3) {
                    i4 = 3;
                } else if (i11 != 5) {
                    if (i11 != 9) {
                        switch (i11) {
                            case 14:
                                i4 = 13;
                                break;
                            case 15:
                                i4 = 14;
                                break;
                            case 16:
                                i4 = 12;
                                break;
                        }
                    } else {
                        i4 = 9;
                    }
                }
                float f = dimension / resources.getDisplayMetrics().density;
                float f2 = dimension2 / resources.getDisplayMetrics().density;
                obtainAttributes.recycle();
                ImageVector.Builder builder = new ImageVector.Builder(null, f, f2, namedFloat, namedFloat2, j2, i4, z, 1);
                i5 = 0;
                for (int i12 = 3; xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i12); i12 = 3) {
                    XmlPullParser xmlPullParser = androidVectorParser2.xmlParser;
                    int i13 = i3;
                    WorkLauncherImpl workLauncherImpl = androidVectorParser2.pathParser;
                    XmlResourceParser xmlResourceParser = xml;
                    eventType = xmlPullParser.getEventType();
                    int i14 = i10;
                    if (eventType == 2) {
                        if (eventType != i12) {
                            i6 = i5;
                            androidVectorParser = androidVectorParser2;
                            i7 = i13;
                        } else if ("group".equals(xmlPullParser.getName())) {
                            int i15 = i5 + 1;
                            int i16 = 0;
                            while (i16 < i15) {
                                ArrayList arrayList = builder.nodes;
                                if (builder.isConsumed) {
                                    InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ImageVector.Builder.GroupParams groupParams = (ImageVector.Builder.GroupParams) arrayList.remove(arrayList.size() - 1);
                                ((ImageVector.Builder.GroupParams) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i13, arrayList)).children.add(new VectorGroup(groupParams.name, groupParams.rotate, groupParams.pivotX, groupParams.pivotY, groupParams.scaleX, groupParams.scaleY, groupParams.translationX, groupParams.translationY, groupParams.clipPathData, groupParams.children));
                                i16++;
                                i13 = 1;
                            }
                            androidVectorParser = androidVectorParser2;
                            i7 = 1;
                            i6 = 0;
                        }
                        xmlResourceParser.next();
                        i3 = i7;
                        androidVectorParser2 = androidVectorParser;
                        xml = xmlResourceParser;
                        i10 = i14;
                        i5 = i6;
                    } else {
                        String name = xmlPullParser.getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            if (hashCode != -1649314686) {
                                i6 = i5;
                                if (hashCode != 3433509) {
                                    if (hashCode == 98629247 && name.equals("group")) {
                                        TypedArray obtainAttributes2 = DimensionKt.obtainAttributes(resources, theme, asAttributeSet, AndroidVectorResources.STYLEABLE_VECTOR_DRAWABLE_GROUP);
                                        androidVectorParser2.updateConfig(obtainAttributes2.getChangingConfigurations());
                                        float namedFloat3 = androidVectorParser2.getNamedFloat(obtainAttributes2, "rotation", 5, RecyclerView.DECELERATION_RATE);
                                        float f3 = obtainAttributes2.getFloat(1, RecyclerView.DECELERATION_RATE);
                                        androidVectorParser2.updateConfig(obtainAttributes2.getChangingConfigurations());
                                        float f4 = obtainAttributes2.getFloat(2, RecyclerView.DECELERATION_RATE);
                                        androidVectorParser2.updateConfig(obtainAttributes2.getChangingConfigurations());
                                        float namedFloat4 = androidVectorParser2.getNamedFloat(obtainAttributes2, "scaleX", 3, 1.0f);
                                        float namedFloat5 = androidVectorParser2.getNamedFloat(obtainAttributes2, "scaleY", 4, 1.0f);
                                        float namedFloat6 = androidVectorParser2.getNamedFloat(obtainAttributes2, "translateX", 6, RecyclerView.DECELERATION_RATE);
                                        float namedFloat7 = androidVectorParser2.getNamedFloat(obtainAttributes2, "translateY", 7, RecyclerView.DECELERATION_RATE);
                                        String string2 = obtainAttributes2.getString(0);
                                        androidVectorParser2.updateConfig(obtainAttributes2.getChangingConfigurations());
                                        String str = string2 == null ? "" : string2;
                                        obtainAttributes2.recycle();
                                        EmptyList emptyList = VectorKt.EmptyPath;
                                        if (builder.isConsumed) {
                                            InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        builder.nodes.add(new ImageVector.Builder.GroupParams(str, namedFloat3, f3, f4, namedFloat4, namedFloat5, namedFloat6, namedFloat7, emptyList, 512));
                                    }
                                } else if (name.equals("path")) {
                                    TypedArray obtainAttributes3 = DimensionKt.obtainAttributes(resources, theme, asAttributeSet, AndroidVectorResources.STYLEABLE_VECTOR_DRAWABLE_PATH);
                                    androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("No path data available");
                                        return null;
                                    }
                                    String string3 = obtainAttributes3.getString(0);
                                    androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                    String str2 = string3 == null ? "" : string3;
                                    String string4 = obtainAttributes3.getString(2);
                                    androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                    if (string4 == null) {
                                        list2 = VectorKt.EmptyPath;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        workLauncherImpl.pathStringToNodes(string4, arrayList2);
                                        list2 = arrayList2;
                                    }
                                    List list3 = list2;
                                    StatusLine namedComplexColor = DimensionKt.getNamedComplexColor(obtainAttributes3, androidVectorParser2.xmlParser, theme, "fillColor", 1);
                                    androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                    float namedFloat8 = androidVectorParser2.getNamedFloat(obtainAttributes3, "fillAlpha", 12, 1.0f);
                                    int namedInt2 = DimensionKt.getNamedInt(obtainAttributes3, androidVectorParser2.xmlParser, "strokeLineCap", 8, -1);
                                    androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                    if (namedInt2 != 0) {
                                        if (namedInt2 == 1) {
                                            i8 = 1;
                                        } else if (namedInt2 == 2) {
                                            i8 = 2;
                                        }
                                        namedInt = DimensionKt.getNamedInt(obtainAttributes3, androidVectorParser2.xmlParser, "strokeLineJoin", 9, -1);
                                        androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                        if (namedInt != 0) {
                                            if (namedInt == 1) {
                                                i9 = 1;
                                            } else if (namedInt == 2) {
                                                i9 = 2;
                                            }
                                            float namedFloat9 = androidVectorParser2.getNamedFloat(obtainAttributes3, "strokeMiterLimit", 10, 4.0f);
                                            StatusLine namedComplexColor2 = DimensionKt.getNamedComplexColor(obtainAttributes3, androidVectorParser2.xmlParser, theme, "strokeColor", 3);
                                            androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                            float namedFloat10 = androidVectorParser2.getNamedFloat(obtainAttributes3, "strokeAlpha", 11, 1.0f);
                                            float namedFloat11 = androidVectorParser2.getNamedFloat(obtainAttributes3, "strokeWidth", 4, 1.0f);
                                            float namedFloat12 = androidVectorParser2.getNamedFloat(obtainAttributes3, "trimPathEnd", 6, 1.0f);
                                            float namedFloat13 = androidVectorParser2.getNamedFloat(obtainAttributes3, "trimPathOffset", 7, RecyclerView.DECELERATION_RATE);
                                            float namedFloat14 = androidVectorParser2.getNamedFloat(obtainAttributes3, "trimPathStart", 5, RecyclerView.DECELERATION_RATE);
                                            int namedInt3 = DimensionKt.getNamedInt(obtainAttributes3, androidVectorParser2.xmlParser, "fillType", 13, 0);
                                            androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                            obtainAttributes3.recycle();
                                            shader = (Shader) namedComplexColor.protocol;
                                            if (shader == null && namedComplexColor.code == 0) {
                                                androidVectorParser = androidVectorParser2;
                                                solidColor = null;
                                            } else if (shader != null) {
                                                solidColor = BrushKt.ShaderBrush(shader);
                                                androidVectorParser = androidVectorParser2;
                                            } else {
                                                androidVectorParser = androidVectorParser2;
                                                solidColor = new SolidColor(ColorKt.Color(namedComplexColor.code));
                                            }
                                            Shader shader2 = (Shader) namedComplexColor2.protocol;
                                            Brush ShaderBrush = (shader2 == null && namedComplexColor2.code == 0) ? null : shader2 == null ? BrushKt.ShaderBrush(shader2) : new SolidColor(ColorKt.Color(namedComplexColor2.code));
                                            int i17 = namedInt3 == 0 ? 0 : 1;
                                            if (builder.isConsumed) {
                                                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            ((ImageVector.Builder.GroupParams) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, builder.nodes)).children.add(new VectorPath(str2, list3, i17, solidColor, namedFloat8, ShaderBrush, namedFloat10, namedFloat11, i8, i9, namedFloat9, namedFloat14, namedFloat12, namedFloat13));
                                        }
                                        i9 = 0;
                                        float namedFloat92 = androidVectorParser2.getNamedFloat(obtainAttributes3, "strokeMiterLimit", 10, 4.0f);
                                        StatusLine namedComplexColor22 = DimensionKt.getNamedComplexColor(obtainAttributes3, androidVectorParser2.xmlParser, theme, "strokeColor", 3);
                                        androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                        float namedFloat102 = androidVectorParser2.getNamedFloat(obtainAttributes3, "strokeAlpha", 11, 1.0f);
                                        float namedFloat112 = androidVectorParser2.getNamedFloat(obtainAttributes3, "strokeWidth", 4, 1.0f);
                                        float namedFloat122 = androidVectorParser2.getNamedFloat(obtainAttributes3, "trimPathEnd", 6, 1.0f);
                                        float namedFloat132 = androidVectorParser2.getNamedFloat(obtainAttributes3, "trimPathOffset", 7, RecyclerView.DECELERATION_RATE);
                                        float namedFloat142 = androidVectorParser2.getNamedFloat(obtainAttributes3, "trimPathStart", 5, RecyclerView.DECELERATION_RATE);
                                        int namedInt32 = DimensionKt.getNamedInt(obtainAttributes3, androidVectorParser2.xmlParser, "fillType", 13, 0);
                                        androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                        obtainAttributes3.recycle();
                                        shader = (Shader) namedComplexColor.protocol;
                                        if (shader == null) {
                                            androidVectorParser = androidVectorParser2;
                                            solidColor = null;
                                            Shader shader22 = (Shader) namedComplexColor22.protocol;
                                            if (shader22 == null) {
                                                if (namedInt32 == 0) {
                                                }
                                                if (builder.isConsumed) {
                                                }
                                                ((ImageVector.Builder.GroupParams) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, builder.nodes)).children.add(new VectorPath(str2, list3, i17, solidColor, namedFloat8, ShaderBrush, namedFloat102, namedFloat112, i8, i9, namedFloat92, namedFloat142, namedFloat122, namedFloat132));
                                            }
                                            if (namedInt32 == 0) {
                                            }
                                            if (builder.isConsumed) {
                                            }
                                            ((ImageVector.Builder.GroupParams) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, builder.nodes)).children.add(new VectorPath(str2, list3, i17, solidColor, namedFloat8, ShaderBrush, namedFloat102, namedFloat112, i8, i9, namedFloat92, namedFloat142, namedFloat122, namedFloat132));
                                        }
                                        if (shader != null) {
                                        }
                                        Shader shader222 = (Shader) namedComplexColor22.protocol;
                                        if (shader222 == null) {
                                        }
                                        if (namedInt32 == 0) {
                                        }
                                        if (builder.isConsumed) {
                                        }
                                        ((ImageVector.Builder.GroupParams) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, builder.nodes)).children.add(new VectorPath(str2, list3, i17, solidColor, namedFloat8, ShaderBrush, namedFloat102, namedFloat112, i8, i9, namedFloat92, namedFloat142, namedFloat122, namedFloat132));
                                    }
                                    i8 = 0;
                                    namedInt = DimensionKt.getNamedInt(obtainAttributes3, androidVectorParser2.xmlParser, "strokeLineJoin", 9, -1);
                                    androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                    if (namedInt != 0) {
                                    }
                                    i9 = 0;
                                    float namedFloat922 = androidVectorParser2.getNamedFloat(obtainAttributes3, "strokeMiterLimit", 10, 4.0f);
                                    StatusLine namedComplexColor222 = DimensionKt.getNamedComplexColor(obtainAttributes3, androidVectorParser2.xmlParser, theme, "strokeColor", 3);
                                    androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                    float namedFloat1022 = androidVectorParser2.getNamedFloat(obtainAttributes3, "strokeAlpha", 11, 1.0f);
                                    float namedFloat1122 = androidVectorParser2.getNamedFloat(obtainAttributes3, "strokeWidth", 4, 1.0f);
                                    float namedFloat1222 = androidVectorParser2.getNamedFloat(obtainAttributes3, "trimPathEnd", 6, 1.0f);
                                    float namedFloat1322 = androidVectorParser2.getNamedFloat(obtainAttributes3, "trimPathOffset", 7, RecyclerView.DECELERATION_RATE);
                                    float namedFloat1422 = androidVectorParser2.getNamedFloat(obtainAttributes3, "trimPathStart", 5, RecyclerView.DECELERATION_RATE);
                                    int namedInt322 = DimensionKt.getNamedInt(obtainAttributes3, androidVectorParser2.xmlParser, "fillType", 13, 0);
                                    androidVectorParser2.updateConfig(obtainAttributes3.getChangingConfigurations());
                                    obtainAttributes3.recycle();
                                    shader = (Shader) namedComplexColor.protocol;
                                    if (shader == null) {
                                    }
                                    if (shader != null) {
                                    }
                                    Shader shader2222 = (Shader) namedComplexColor222.protocol;
                                    if (shader2222 == null) {
                                    }
                                    if (namedInt322 == 0) {
                                    }
                                    if (builder.isConsumed) {
                                    }
                                    ((ImageVector.Builder.GroupParams) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, builder.nodes)).children.add(new VectorPath(str2, list3, i17, solidColor, namedFloat8, ShaderBrush, namedFloat1022, namedFloat1122, i8, i9, namedFloat922, namedFloat1422, namedFloat1222, namedFloat1322));
                                }
                                androidVectorParser = androidVectorParser2;
                                i7 = 1;
                                xmlResourceParser.next();
                                i3 = i7;
                                androidVectorParser2 = androidVectorParser;
                                xml = xmlResourceParser;
                                i10 = i14;
                                i5 = i6;
                            } else {
                                i6 = i5;
                                androidVectorParser = androidVectorParser2;
                                if (name.equals("clip-path")) {
                                    TypedArray obtainAttributes4 = DimensionKt.obtainAttributes(resources, theme, asAttributeSet, AndroidVectorResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH);
                                    androidVectorParser.updateConfig(obtainAttributes4.getChangingConfigurations());
                                    String string5 = obtainAttributes4.getString(0);
                                    androidVectorParser.updateConfig(obtainAttributes4.getChangingConfigurations());
                                    String str3 = string5 == null ? "" : string5;
                                    i7 = 1;
                                    String string6 = obtainAttributes4.getString(1);
                                    androidVectorParser.updateConfig(obtainAttributes4.getChangingConfigurations());
                                    if (string6 == null) {
                                        list = VectorKt.EmptyPath;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        workLauncherImpl.pathStringToNodes(string6, arrayList3);
                                        list = arrayList3;
                                    }
                                    obtainAttributes4.recycle();
                                    if (builder.isConsumed) {
                                        InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    builder.nodes.add(new ImageVector.Builder.GroupParams(str3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, list, 512));
                                    i6++;
                                    xmlResourceParser.next();
                                    i3 = i7;
                                    androidVectorParser2 = androidVectorParser;
                                    xml = xmlResourceParser;
                                    i10 = i14;
                                    i5 = i6;
                                }
                            }
                            i7 = 1;
                            xmlResourceParser.next();
                            i3 = i7;
                            androidVectorParser2 = androidVectorParser;
                            xml = xmlResourceParser;
                            i10 = i14;
                            i5 = i6;
                        }
                    }
                    i6 = i5;
                    androidVectorParser = androidVectorParser2;
                    i7 = 1;
                    xmlResourceParser.next();
                    i3 = i7;
                    androidVectorParser2 = androidVectorParser;
                    xml = xmlResourceParser;
                    i10 = i14;
                    i5 = i6;
                }
                imageVectorEntry = new ImageVectorCache.ImageVectorEntry(builder.build(), i10 | androidVectorParser2.config);
                imageVectorCache.map.put(key, new WeakReference(imageVectorEntry));
            }
            i4 = 5;
            float f5 = dimension / resources.getDisplayMetrics().density;
            float f22 = dimension2 / resources.getDisplayMetrics().density;
            obtainAttributes.recycle();
            ImageVector.Builder builder2 = new ImageVector.Builder(null, f5, f22, namedFloat, namedFloat2, j2, i4, z, 1);
            i5 = 0;
            while (xml.getEventType() != i3) {
                XmlPullParser xmlPullParser2 = androidVectorParser2.xmlParser;
                int i132 = i3;
                WorkLauncherImpl workLauncherImpl2 = androidVectorParser2.pathParser;
                XmlResourceParser xmlResourceParser2 = xml;
                eventType = xmlPullParser2.getEventType();
                int i142 = i10;
                if (eventType == 2) {
                }
                i6 = i5;
                androidVectorParser = androidVectorParser2;
                i7 = 1;
                xmlResourceParser2.next();
                i3 = i7;
                androidVectorParser2 = androidVectorParser;
                xml = xmlResourceParser2;
                i10 = i142;
                i5 = i6;
            }
            imageVectorEntry = new ImageVectorCache.ImageVectorEntry(builder2.build(), i10 | androidVectorParser2.config);
            imageVectorCache.map.put(key, new WeakReference(imageVectorEntry));
        }
        VectorPainter rememberVectorPainter = PathParserKt.rememberVectorPainter(imageVectorEntry.imageVector, gapComposer);
        gapComposer.end(false);
        return rememberVectorPainter;
    }

    public static final void putSafe(LinkedHashMap linkedHashMap, String str, Object obj) {
        if (obj != null) {
            linkedHashMap.put(str, StringsKt___StringsKt.take(4096, obj.toString()));
        }
    }

    /* renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m3989roundToIntSizeuvyYCjk(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static byte[] signatureFromZipEntry(ZipFile zipFile, ZipEntry zipEntry) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            byte[] bArr = new byte[32];
            byte[] bArr2 = null;
            if (inputStream.read(bArr, 0, 32) == 32 && (bArr[0] & 255) == 100 && (bArr[1] & 255) == 101 && (bArr[2] & 255) == 120 && (bArr[3] & 255) == 10 && (bArr[7] & 255) == 0) {
                bArr2 = ArraysKt___ArraysJvmKt.copyOfRange(bArr, 12, 32);
            }
            inputStream.close();
            return bArr2;
        } finally {
        }
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m3990toIntSizeuvyYCjk(long j) {
        return (((int) Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (((int) Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final Region toRegion(Country country) {
        Region region;
        country.getClass();
        SupportedCountryConfig supportedCountryConfig = (SupportedCountryConfig) UtilKt.SUPPORTED_COUNTRY_MAP.get(country);
        return (supportedCountryConfig == null || (region = supportedCountryConfig.region) == null) ? Region.USA : region;
    }

    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m3991toSizeozmzZPI(long j) {
        float f = (int) (j >> 32);
        float f2 = (int) (j & BodyPartID.bodyIdMax);
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    public static byte[] unsafeGenerateBuildId(ApplicationInfo applicationInfo) {
        byte[] signatureFromZipEntry;
        File file = new File(applicationInfo.sourceDir);
        ZipFile zipFile = null;
        if (!file.canRead()) {
            return null;
        }
        try {
            ZipFile zipFile2 = new ZipFile(file, 1);
            try {
                ZipEntry entry = zipFile2.getEntry("classes.dex");
                if (entry == null) {
                    zipFile2.close();
                    return null;
                }
                byte[] signatureFromZipEntry2 = signatureFromZipEntry(zipFile2, entry);
                if (signatureFromZipEntry2 == null) {
                    zipFile2.close();
                    return null;
                }
                int i = 2;
                while (true) {
                    ZipEntry entry2 = zipFile2.getEntry("classes" + i + ".dex");
                    if (entry2 == null || (signatureFromZipEntry = signatureFromZipEntry(zipFile2, entry2)) == null) {
                        break;
                    }
                    int length = signatureFromZipEntry2.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        signatureFromZipEntry2[i2] = (byte) (signatureFromZipEntry2[i2] ^ signatureFromZipEntry[i2]);
                    }
                    i++;
                }
                zipFile2.close();
                return signatureFromZipEntry2;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                if (zipFile != null) {
                    zipFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int varint32Size$wire_runtime(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int varint64Size$wire_runtime(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static String zza(Context context, String str) {
        zzae.checkNotNull(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = PlatformKt.zza(context);
        }
        int identifier = resources.getIdentifier("google_app_id", InquiryField.StringField.TYPE, str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String zzc(String[] strArr, String str, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public abstract void bind(SQLiteStatement sQLiteStatement, Object obj);

    public abstract boolean casListeners(AbstractFuture abstractFuture, AbstractFuture.Listener listener, AbstractFuture.Listener listener2);

    public abstract boolean casValue(AbstractFutureState abstractFutureState, Object obj, Object obj2);

    public abstract boolean casWaiters(AbstractFutureState abstractFutureState, AbstractFutureState.Waiter waiter, AbstractFutureState.Waiter waiter2);

    public abstract String createQuery();

    public abstract AbstractFuture.Listener gasListeners(AbstractFuture abstractFuture);

    public abstract AbstractFutureState.Waiter gasWaiters(AbstractFuture abstractFuture);

    public void insert(SQLiteConnection sQLiteConnection, Object obj) {
        sQLiteConnection.getClass();
        if (obj == null) {
            return;
        }
        SQLiteStatement prepare = sQLiteConnection.prepare(createQuery());
        try {
            bind(prepare, obj);
            prepare.step();
            Cache.Companion.closeFinally(prepare, null);
        } finally {
        }
    }

    public abstract void putNext(AbstractFutureState.Waiter waiter, AbstractFutureState.Waiter waiter2);

    public abstract void putThread(AbstractFutureState.Waiter waiter, Thread thread);

    public static final String getString(Context context, FormattedResource formattedResource) {
        context.getClass();
        formattedResource.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        return getString(resources, formattedResource);
    }

    public static void zza(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "at index "));
                return;
            }
        }
    }

    public static PaymentActionHandler.MetroFactory create(LambdaProvider lambdaProvider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, InstanceFactory instanceFactory, RealChatManager.MetroFactory metroFactory, DoubleCheck doubleCheck, RealMessageSigner.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider4, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, MLKitTitleGenerator$MetroFactory mLKitTitleGenerator$MetroFactory, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, FillrInitializer.MetroFactory metroFactory3, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory, DoubleCheck doubleCheck6, InstanceFactory instanceFactory2, DoubleCheck doubleCheck7, RealActivityItemPresenterFactory.MetroFactory metroFactory4, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, LambdaProvider lambdaProvider5) {
        lambdaProvider.getClass();
        musicViewFactory$MetroFactory.getClass();
        instanceFactory.getClass();
        metroFactory.getClass();
        doubleCheck.getClass();
        metroFactory2.getClass();
        lambdaProvider2.getClass();
        lambdaProvider3.getClass();
        doubleCheck2.getClass();
        doubleCheck3.getClass();
        lambdaProvider4.getClass();
        broadwayModule$ProvideBroadwayMetroFactory.getClass();
        walletUiFactory$MetroFactory.getClass();
        doubleCheck4.getClass();
        doubleCheck5.getClass();
        metroFactory3.getClass();
        doubleCheck6.getClass();
        doubleCheck7.getClass();
        metroFactory4.getClass();
        lambdaProvider5.getClass();
        return new PaymentActionHandler.MetroFactory(lambdaProvider, musicViewFactory$MetroFactory, instanceFactory, metroFactory, doubleCheck, metroFactory2, lambdaProvider2, lambdaProvider3, doubleCheck2, doubleCheck3, lambdaProvider4, broadwayModule$ProvideBroadwayMetroFactory, mLKitTitleGenerator$MetroFactory, walletUiFactory$MetroFactory, doubleCheck4, doubleCheck5, metroFactory3, realMerchantProfileRepo$MetroFactory, doubleCheck6, instanceFactory2, doubleCheck7, metroFactory4, instanceFactory3, instanceFactory4, lambdaProvider5);
    }

    public static BitcoinPresenterFactory.MetroFactory create(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25, InstanceFactory instanceFactory26, InstanceFactory instanceFactory27, InstanceFactory instanceFactory28, InstanceFactory instanceFactory29, InstanceFactory instanceFactory30, InstanceFactory instanceFactory31, InstanceFactory instanceFactory32, InstanceFactory instanceFactory33, InstanceFactory instanceFactory34, InstanceFactory instanceFactory35, InstanceFactory instanceFactory36, InstanceFactory instanceFactory37) {
        instanceFactory3.getClass();
        return new BitcoinPresenterFactory.MetroFactory(instanceFactory, instanceFactory2, (Provider) instanceFactory3, instanceFactory4, instanceFactory5, instanceFactory6, instanceFactory7, instanceFactory8, instanceFactory9, instanceFactory10, instanceFactory11, instanceFactory12, instanceFactory13, instanceFactory14, instanceFactory15, instanceFactory16, instanceFactory17, instanceFactory18, instanceFactory19, instanceFactory20, instanceFactory21, instanceFactory22, instanceFactory23, instanceFactory24, instanceFactory25, instanceFactory26, instanceFactory27, instanceFactory28, instanceFactory29, instanceFactory30, instanceFactory31, instanceFactory32, instanceFactory33, instanceFactory34, instanceFactory35, instanceFactory36, instanceFactory37);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FontRequestEmojiCompatConfig create(Context context) {
        ProviderInfo providerInfo;
        FontRequest fontRequest;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        TransactorKt.checkNotNull(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                fontRequest = new FontRequest(str, str2, "emojicompat-emoji-font", null, null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (fontRequest != null) {
                return null;
            }
            return new FontRequestEmojiCompatConfig(context, fontRequest);
        }
        fontRequest = null;
        if (fontRequest != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PageHeader(String str, Modifier modifier, Function2 function2, String str2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Function2 function22;
        String str3;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2090395027);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(str2) ? 2048 : 1024;
            int i7 = 0;
            int i8 = 1;
            if (!gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                ComposableLambdaImpl composableLambdaImpl = null;
                Function2 function23 = i5 != 0 ? null : function2;
                String str4 = i6 != 0 ? null : str2;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(175208490, new PageHeaderKt$$ExternalSyntheticLambda0(str, i7), gapComposer);
                if (str4 != null) {
                    gapComposer.startReplaceGroup(-2067281745);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(2081187148, new PageHeaderKt$$ExternalSyntheticLambda0(str4, i8), gapComposer);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-2067244359);
                    gapComposer.end(false);
                }
                PageHeader(rememberComposableLambda, modifier3, function23, composableLambdaImpl, gapComposer, (i3 & 112) | 6 | (i3 & 896), 0);
                str3 = str4;
                modifier2 = modifier3;
                function22 = function23;
            } else {
                gapComposer.skipToGroupEnd();
                modifier2 = modifier;
                function22 = function2;
                str3 = str2;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ArcadeThemeKt$$ExternalSyntheticLambda6(str, modifier2, function22, str3, i, i2, 1);
                return;
            }
            return;
        }
        int i72 = 0;
        int i82 = 1;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
