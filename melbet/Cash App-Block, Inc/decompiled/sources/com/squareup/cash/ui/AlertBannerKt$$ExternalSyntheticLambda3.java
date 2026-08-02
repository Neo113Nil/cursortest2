package com.squareup.cash.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.Screen;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.transform.CircleCropTransformation;
import coil3.transform.Transformation;
import com.fillr.browsersdk.model.FillrWidgetVersion;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.badging.db.BadgeCountQueries$ForGroupQuery;
import com.squareup.cash.booklet.ui.RealBookletGridScope;
import com.squareup.cash.cdf.booklet.BookletInteractViewScreen;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewModel;
import com.squareup.cash.ui.gcm.RealNotificationDispatcher;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.recycler.CashRecyclerView;
import com.squareup.cash.userjourneys.data.UserJourney;
import com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.wallet.db.CardTabHeroStateQueries$select$2;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.WalletHomePresenter;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTile;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.MultiInstrumentLinkingOptions;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.FieldBinding;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeNextActionHandler;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupState;
import com.stripe.android.view.ActivityHost;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.misnap.iad.Payload;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.json.JSONObject;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class AlertBannerKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda3(GpsConfigQueries gpsConfigQueries) {
        this.$r8$classId = 12;
        CardTabHeroStateQueries$select$2 cardTabHeroStateQueries$select$2 = CardTabHeroStateQueries$select$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final int i2 = 1;
        final int i3 = 0;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                drawScope.mo729drawLineNGM6Ib0(((Colors) obj2).semantic.border.subtle, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - 0.5f) & BodyPartID.bodyIdMax), (BodyPartID.bodyIdMax & Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - 0.5f)) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32), (r23 & 8) != 0 ? 0.0f : 1.0f, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 1:
                AndroidStringManager androidStringManager = ((LinkedAccountsPresenter) obj2).stringManager;
                MultiInstrumentLinkingOptions multiInstrumentLinkingOptions = (MultiInstrumentLinkingOptions) obj;
                multiInstrumentLinkingOptions.getClass();
                String str = multiInstrumentLinkingOptions.sheet_title;
                if (str == null) {
                    str = androidStringManager.get(R.string.linked_accounts_link_accounts_button_label);
                }
                String str2 = multiInstrumentLinkingOptions.button_text;
                if (str2 == null) {
                    str2 = androidStringManager.get(R.string.linked_accounts_link_accounts_button_label);
                }
                return new LinkedAccountsPresenter.InstrumentLinkingOptionsMetadata(str, str2);
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                String str3 = ((LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow) obj2).instrumentCellViewModel.accessibilityLabel;
                if (str3 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str3);
                }
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                return Unit.INSTANCE;
            case 3:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((BadgeCountQueries$ForGroupQuery) obj2).group_name);
                return Unit.INSTANCE;
            case 4:
                CashRecyclerView cashRecyclerView = (CashRecyclerView) obj2;
                cashRecyclerView.setPadding(cashRecyclerView.getPaddingLeft(), cashRecyclerView.getPaddingTop(), cashRecyclerView.getPaddingRight(), ((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 5:
                ImageRequest.Builder builder = (ImageRequest.Builder) obj;
                Context context = ((RealNotificationDispatcher) obj2).context;
                builder.size(context.getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_width), context.getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_height));
                Transformation[] transformationArr = {new CircleCropTransformation()};
                Extras.Key key = ImageRequestsKt.transformationsKey;
                ImageRequestsKt.transformations(builder, ArraysKt___ArraysKt.toList(transformationArr));
                return Unit.INSTANCE;
            case 6:
                AmountConfig.MoneyConfig moneyConfig = (AmountConfig.MoneyConfig) obj2;
                double doubleValue = ((Double) obj).doubleValue();
                CurrencyCode currencyCode = moneyConfig.currency;
                boolean z = moneyConfig.symbolExperimentEnabled;
                if (AmountConfig.MoneyConfig.WhenMappings.$EnumSwitchMapping$1[currencyCode.ordinal()] == 1) {
                    BitcoinDisplayUnits bitcoinDisplayUnits = moneyConfig.bitcoinDisplayUnits;
                    bitcoinDisplayUnits.getClass();
                    int i4 = AmountConfig.MoneyConfig.WhenMappings.$EnumSwitchMapping$0[bitcoinDisplayUnits.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                throw new NotImplementedError(null, 1, null);
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (!z) {
                            return doubleValue == 1.0d ? " sat" : " sats";
                        }
                    } else if (z) {
                        return " BTC";
                    }
                }
                return "";
            case 7:
                UserJourney userJourney = (UserJourney) obj;
                userJourney.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(userJourney.getId(), (UUID) obj2));
            case 8:
                UserJourney$Friction userJourney$Friction = (UserJourney$Friction) obj2;
                UserJourney userJourney2 = (UserJourney) obj;
                userJourney2.getClass();
                Timber.Forest.d("Add friction signal " + userJourney$Friction + " to " + userJourney2.getName().getLabel(), new Object[0]);
                UserJourney$Name name = userJourney2.getName();
                String str4 = userJourney$Friction.value;
                name.getClass();
                str4.getClass();
                return UserJourney.copy$default(userJourney2, null, null, 0L, 0L, null, SetsKt___SetsKt.plus(userJourney2.getFrictionSignals(), userJourney$Friction.value), null, null, null, false, 991, null);
            case 9:
                UserJourney$Friction userJourney$Friction2 = (UserJourney$Friction) obj2;
                UserJourney userJourney3 = (UserJourney) obj;
                userJourney3.getClass();
                Timber.Forest.d("Add frustration signal " + userJourney$Friction2 + " to " + userJourney3.getName().getLabel(), new Object[0]);
                UserJourney$Name name2 = userJourney3.getName();
                String str5 = userJourney$Friction2.value;
                name2.getClass();
                str5.getClass();
                return UserJourney.copy$default(userJourney3, null, null, 0L, 0L, SetsKt___SetsKt.plus(userJourney3.getFrustrationSignals(), userJourney$Friction2.value), null, null, null, null, false, IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO, null);
            case 10:
                ((UserJourney) obj).getClass();
                return Boolean.valueOf(!((LinkedHashMap) obj2).containsKey(r1.getId()));
            case 11:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key);
                return Unit.INSTANCE;
            case 12:
                CardTabHeroStateQueries$select$2 cardTabHeroStateQueries$select$2 = CardTabHeroStateQueries$select$2.INSTANCE;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                ?? bytes = androidCursor.getBytes(2);
                return cardTabHeroStateQueries$select$2.invoke(m, string2, bytes != 0 ? (CardRenderingInfo) ((Local_tab_content.Adapter) gpsConfigQueries.gpsConfigAdapter).responseAdapter.decode(bytes) : null, androidCursor.getBoolean(3), androidCursor.getBoolean(4));
            case 13:
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) obj2;
                ((DisposableEffectScope) obj).getClass();
                cardSchemePresenter.analytics.track(new BookletInteractViewScreen("CARD", null, null, 14), null);
                return new CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1(cardSchemePresenter, 5);
            case 14:
                Screen screen = (Screen) obj;
                screen.getClass();
                ((WalletHomePresenter) obj2).navigator.goTo(screen);
                return Unit.INSTANCE;
            case 15:
                ((PromotedAppletTileViewEvent$Click) obj).getClass();
                ((CardAppletTile) obj2).onPromotedClick.invoke();
                return Unit.INSTANCE;
            case 16:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, ((CardAppletTileViewModel.CardPillViewModel) obj2).contentDescription);
                return Unit.INSTANCE;
            case 17:
                ((Throwable) obj).getClass();
                ((CardNuxState) obj2).engineErrored$delegate.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 18:
                RealBookletGridScope realBookletGridScope = (RealBookletGridScope) obj;
                realBookletGridScope.getClass();
                for (CardSchemeViewModel.CardNullStateBooklet.Grid.Item item : ((CardSchemeViewModel.CardNullStateBooklet.Grid) obj2).items) {
                    realBookletGridScope.gridBlock(item.icon, item.title, item.body);
                }
                return Unit.INSTANCE;
            case 19:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver3, (AnnotatedString) obj2);
                return Unit.INSTANCE;
            case 20:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                String str6 = ((CardSchemeViewModel.Module.StatusModule) obj2).accessibilityText;
                if (str6 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver4, str6);
                }
                return Unit.INSTANCE;
            case 21:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                String str7 = ((CardSchemeViewModel.Module.ListItemModule) ((CardSchemeViewModel.Module) obj2)).accessibilityText;
                if (str7 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver5, str7);
                }
                return Unit.INSTANCE;
            case 22:
                Message.Builder builder2 = (Message.Builder) obj;
                builder2.getClass();
                return ((KotlinConstructorBuilder) builder2).get((WireField) obj2);
            case 23:
                Message.Builder builder3 = (Message.Builder) obj;
                builder3.getClass();
                return ((Field) obj2).get(builder3);
            case 24:
                Message message = (Message) obj;
                message.getClass();
                return ((Method) obj2).invoke(message, null);
            case 25:
                Message message2 = (Message) obj;
                message2.getClass();
                return ((FieldBinding) obj2).messageField.get(message2);
            case 26:
                Uri uri = (Uri) obj;
                int i5 = IntentConfirmationChallengeActivity.$r8$clinit;
                uri.getClass();
                ((IntentConfirmationChallengeActivity) obj2).startActivity(new Intent("android.intent.action.VIEW", uri));
                return Unit.INSTANCE;
            case 27:
                ActivityHost activityHost = (ActivityHost) obj;
                activityHost.getClass();
                ActivityResultLauncher activityResultLauncher = ((IntentConfirmationChallengeNextActionHandler) obj2).intentConfirmationChallengeActivityContractNextActionLauncher;
                return activityResultLauncher != null ? new CustomTabsLauncherModule(activityResultLauncher) : new Payload(activityHost);
            case 28:
                String str8 = (String) obj;
                return new Pair(str8, ((JSONObject) obj2).get(str8).toString());
            default:
                final NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState = (NetworkingLinkLoginWarmupState) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new Function3() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i6 = i3;
                        NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState2 = networkingLinkLoginWarmupState;
                        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj3;
                        Composer composer = (Composer) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        switch (i6) {
                            case 0:
                                lazyItemScopeImpl.getClass();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    FillrWidgetVersion.HeaderSection(networkingLinkLoginWarmupState2.linkBrand, gapComposer, 0);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                lazyItemScopeImpl.getClass();
                                GapComposer gapComposer2 = (GapComposer) composer;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    NetworkingLinkLoginWarmupState.Payload payload = (NetworkingLinkLoginWarmupState.Payload) networkingLinkLoginWarmupState2.payload.invoke();
                                    FillrWidgetVersion.ExistingEmailSection(payload != null ? payload.redactedEmail : "", gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 1685113889), 3);
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new Function3() { // from class: com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i6 = i2;
                        NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState2 = networkingLinkLoginWarmupState;
                        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj3;
                        Composer composer = (Composer) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        switch (i6) {
                            case 0:
                                lazyItemScopeImpl.getClass();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    FillrWidgetVersion.HeaderSection(networkingLinkLoginWarmupState2.linkBrand, gapComposer, 0);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                lazyItemScopeImpl.getClass();
                                GapComposer gapComposer2 = (GapComposer) composer;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    NetworkingLinkLoginWarmupState.Payload payload = (NetworkingLinkLoginWarmupState.Payload) networkingLinkLoginWarmupState2.payload.invoke();
                                    FillrWidgetVersion.ExistingEmailSection(payload != null ? payload.redactedEmail : "", gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 4004632), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda3(Object obj, RealUserJourneySignalProcessor realUserJourneySignalProcessor, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
