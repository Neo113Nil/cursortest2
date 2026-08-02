package com.squareup.cash.work.service.real;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.CookieManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.PreconditionsKt;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadm;
import com.google.crypto.tink.subtle.Hkdf;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.instruments.backend.api.PaymentInstrument;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.views.plugins.CellActionCardKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.multiplatform.bitcoin.parsers.encoding.Base58;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.RealSolanaAddressParser$parse$1;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.RealSolanaAddressParser$tryParseBase58Address$1;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddressParser;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.out.core.models.FailureReason;
import com.squareup.cash.p2p.engine.api.v1.PaymentStateCode;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.supportarticles.app.v1.SupportArticle;
import com.squareup.cash.ui.PaymentPasscodeActivity;
import com.squareup.protos.cash.cashapproxy.api.SemanticColor;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.scannerview.SizeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Function;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class WorkCookieJar implements ClientRenderableUi, SolanaAddressParser, Saver, CookieJar {
    public final /* synthetic */ int $r8$classId;

    public WorkCookieJar(Navigator navigator) {
        this.$r8$classId = 8;
        navigator.getClass();
    }

    public static PaymentScreens.QuickPay buildQuickPay$default(WorkCookieJar workCookieJar, Screen screen, Screen screen2, Orientation orientation, CurrencyCode currencyCode, List list, AppCreationActivity appCreationActivity, String str, String str2, Money money, String str3, PaymentScreens.QuickPay.QuickPayAnalytics quickPayAnalytics, BlockersData.MoneybotContext moneybotContext, int i) {
        Screen screen3;
        Screen screen4 = (i & 1) != 0 ? null : screen;
        String str4 = (i & 64) != 0 ? null : str;
        Money money2 = (i & 256) != 0 ? null : money;
        String str5 = (i & 512) != 0 ? "" : str3;
        BlockersData.MoneybotContext moneybotContext2 = (i & PKIFailureInfo.certRevoked) != 0 ? null : moneybotContext;
        workCookieJar.getClass();
        orientation.getClass();
        currencyCode.getClass();
        list.getClass();
        appCreationActivity.getClass();
        Screen screen5 = PaymentScreens$HomeScreens$Home.INSTANCE;
        Screen screen6 = screen4 == null ? screen5 : screen4;
        if (screen4 == null) {
            if (screen2 != null) {
                screen5 = screen2;
            }
            screen3 = screen5;
        } else {
            screen3 = screen4;
        }
        if (money2 == null) {
            money2 = new Money((Long) 0L, currencyCode, 4);
        }
        return new PaymentScreens.QuickPay(screen6, screen3, orientation, list, money2, appCreationActivity, str4, str2, new RedactedString(str5), quickPayAnalytics, true, true, moneybotContext2);
    }

    public static Intent createIntent(Context context, String str, PaymentInstrument paymentInstrument, String str2, InstrumentType instrumentType, String str3, Intent intent) {
        context.getClass();
        str.getClass();
        Intent intent2 = new Intent(context, (Class<?>) PaymentPasscodeActivity.class);
        intent2.setData(Uri.fromParts("payment", str, null));
        intent2.putExtra("payment-token", str);
        intent2.putExtra("instrument-token", Hkdf.token(paymentInstrument));
        intent2.putExtra("verification-instrument-token", str2);
        if (instrumentType != null) {
            intent2.putExtra("verification-instrument-type", instrumentType.ordinal());
        }
        intent2.putExtra("verification-instrument-suffix", str3);
        intent2.putExtra("details-intent", intent);
        return intent2;
    }

    public static FailureReason fromValue(int i) {
        if (i == 0) {
            return FailureReason.IDV_FAILURE;
        }
        if (i == 1) {
            return FailureReason.RETRY_EXPIRED;
        }
        if (i == 2) {
            return FailureReason.UNUSABLE_PREPAID_CARD;
        }
        if (i == 3) {
            return FailureReason.UNSUPPORTED_RATE_PLAN;
        }
        if (i == 4) {
            return FailureReason.UNEXPECTED_ACCEPTED_FEE;
        }
        if (i == 5) {
            return FailureReason.CUSTOMER_HAS_MONEY_MOVEMENT_BLOCK;
        }
        if (i == 100) {
            return FailureReason.INSTRUMENT_MONTHLY_SENDING_LIMIT_EXCEEDED;
        }
        if (i == 101) {
            return FailureReason.INSTRUMENT_MONTHLY_RECEIVING_LIMIT_EXCEEDED;
        }
        if (i == 120) {
            return FailureReason.LIMITS_TIMEOUT;
        }
        if (i == 121) {
            return FailureReason.LIMITS_NO_RESULT;
        }
        switch (i) {
            case 20:
                return FailureReason.UNKNOWN_LIMITS_FAILURE;
            case 21:
                return FailureReason.TRANSACTION_AMOUNT_BELOW_MINIMUM;
            case 22:
                return FailureReason.TRANSACTION_AMOUNT_EXCEEDS_MAXIMUM;
            case 23:
                return FailureReason.TRANSACTION_AMOUNT_BELOW_MINIMUM_BUSINESS;
            case 24:
                return FailureReason.TRANSACTION_AMOUNT_BELOW_MINIMUM_NOT_FULL_BALANCE;
            default:
                if (i == 30) {
                    return FailureReason.CUSTOMER_DAILY_BANK_TRANSFER_LIMIT_EXCEEDED;
                }
                if (i == 60) {
                    return FailureReason.CUSTOMER_OUTSTANDING_BILLS_LIMIT_EXCEEDED;
                }
                if (i == 70) {
                    return FailureReason.CUSTOMER_BALANCE_LIMIT_EXCEEDED;
                }
                if (i == 80) {
                    return FailureReason.INSTRUMENT_DAILY_BANK_TRANSFER_LIMIT_EXCEEDED;
                }
                if (i == 110) {
                    return FailureReason.PER_TRANSACTION_BANK_TRANSFER_LIMIT_EXCEEDED;
                }
                if (i == 310) {
                    return FailureReason.RATE_LIMITED;
                }
                if (i == 320) {
                    return FailureReason.MISSING_CUSTOMER_INSTRUMENTS;
                }
                switch (i) {
                    case 200:
                        return FailureReason.UNKNOWN_MONEY_TRANSFER_FAILURE;
                    case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
                        return FailureReason.UNSUPPORTED_INSTRUMENT;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                        return FailureReason.INSUFFICIENT_FUNDS;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                        return FailureReason.INVALID_INSTRUMENT;
                    case SDK_ASSET_ICON_CLEARED_REC_VALUE:
                        return FailureReason.INSTRUMENT_EXPIRED;
                    case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                        return FailureReason.INVALID_CVV_OR_EXPIRATION_DATE;
                    case SDK_ASSET_ICON_CLOCK_VALUE:
                        return FailureReason.TRANSFER_DECLINED;
                    case SDK_ASSET_ICON_COMMENT_VALUE:
                        return FailureReason.INVALID_ROUTING_NUMBER;
                    case SDK_ASSET_ICON_INCOME_VALUE:
                        return FailureReason.MONEY_TRANSFER_SUSPECTED_FRAUD;
                    case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                        return FailureReason.ACCOUNT_FROZEN;
                    case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                        return FailureReason.INSTRUMENT_DISABLED;
                    case 211:
                        return FailureReason.UNSUPPORTED_CURRENCY;
                    case SDK_ASSET_ICON_OVERRIDE_VALUE:
                        return FailureReason.MONEY_TRANSFER_OVER_LIMIT;
                    case SDK_ASSET_ICON_PAUSE_VALUE:
                        return FailureReason.UNSUPPORTED_COUNTRY;
                    case SDK_ASSET_ICON_PIN_VALUE:
                        return FailureReason.RESTRICTED_CARD;
                    case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                        return FailureReason.TRANSACTION_NOT_PERMITTED;
                    case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                        return FailureReason.OTHER_MONEY_TRANSFER_FAILURE;
                    case SDK_ASSET_ICON_PROGRESS_VALUE:
                        return FailureReason.CUSTOMER_CHARGEBACK;
                    case SDK_ASSET_ICON_QUESTION_VALUE:
                        return FailureReason.DO_NOT_HONOR;
                    case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                        return FailureReason.MISSING_MONEY_TRANSFER_FAILURE;
                    case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                        return FailureReason.CARD_LOST_OR_STOLEN;
                    case SDK_ASSET_ICON_SUBMIT_VALUE:
                        return FailureReason.TARGET_INSTRUMENT_IS_DENYLISTED;
                    case SDK_ASSET_ICON_SUBTRACT_VALUE:
                        return FailureReason.DUPLICATE_TRANSACTION;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                        return FailureReason.FAILED_TO_REACH_ISSUER;
                    case 224:
                        return FailureReason.GENERIC_FAILURE;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE:
                        return FailureReason.TRANSPORT_ERROR;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                        return FailureReason.INVALID_AMOUNT;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                        return FailureReason.INVALID_AVS;
                    case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                        return FailureReason.INVALID_PIN;
                    case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                        return FailureReason.CANCELED;
                    default:
                        switch (i) {
                            case 330:
                                return FailureReason.ONCALL_MANUAL_FAILURE;
                            case 331:
                                return FailureReason.ONCALL_INTENTIONAL_FAILURE;
                            case 332:
                                return FailureReason.AUTOMATIC_FAILURE;
                            default:
                                switch (i) {
                                    case 340:
                                        return FailureReason.VERIFY_PASSCODE_TOO_MANY_ATTEMPTS;
                                    case 341:
                                        return FailureReason.VERIFY_PASSCODE_UNKNOWN_FAILURE;
                                    case 342:
                                        return FailureReason.CUSTOMER_DAILY_CASH_OUT_LIMIT_EXCEEDED;
                                    case 343:
                                        return FailureReason.INSTRUMENT_DAILY_CASH_OUT_LIMIT_EXCEEDED;
                                    case 344:
                                        return FailureReason.INSTRUMENT_NOT_FOUND;
                                    default:
                                        switch (i) {
                                            case 40:
                                                return FailureReason.CUSTOMER_WEEKLY_SENDING_LIMIT_EXCEEDED;
                                            case 41:
                                                return FailureReason.CUSTOMER_WEEKLY_SENDING_PRO_LIMIT_EXCEEDED;
                                            case 42:
                                                return FailureReason.CUSTOMER_WEEKLY_SENDING_XBORDER_AMOUNT_EXCEEDED;
                                            case 43:
                                                return FailureReason.CUSTOMER_WEEKLY_RECEIVING_AMOUNT_EXCEEDED;
                                            case 44:
                                                return FailureReason.CUSTOMER_WEEKLY_RECEIVING_XBORDER_AMOUNT_EXCEEDED;
                                            default:
                                                switch (i) {
                                                    case 50:
                                                        return FailureReason.CUSTOMER_MONTHLY_SENDING_LIMIT_EXCEEDED;
                                                    case 51:
                                                        return FailureReason.CUSTOMER_MONTHLY_RECEIVING_LIMIT_EXCEEDED;
                                                    case 52:
                                                        return FailureReason.CUSTOMER_MONTHLY_RECEIVING_COUNT_EXCEEDED;
                                                    default:
                                                        switch (i) {
                                                            case 90:
                                                                return FailureReason.INSTRUMENT_WEEKLY_SENDING_LIMIT_EXCEEDED;
                                                            case 91:
                                                                return FailureReason.INSTRUMENT_WEEKLY_SENDING_PRO_LIMIT_EXCEEDED;
                                                            case 92:
                                                                return FailureReason.INSTRUMENT_WEEKLY_RECEIVING_LIMIT_EXCEEDED;
                                                            case 93:
                                                                return FailureReason.INSTRUMENT_WEEKLY_CASH_OUT_LIMIT_EXCEEDED;
                                                            default:
                                                                switch (i) {
                                                                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                                                                        return FailureReason.RISK_DECLINED;
                                                                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                                                                        return FailureReason.UNKNOWN_RISK_FAILURE;
                                                                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                                                                        return FailureReason.GENERAL_RISK_ERROR;
                                                                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                                                                        return FailureReason.RISK_INVALID_REQUEST;
                                                                    case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                                                                        return FailureReason.RISK_EVALUATION_TIMEOUT;
                                                                    case 255:
                                                                        return FailureReason.PLAID_INVALID_ACCESS_TOKEN;
                                                                    case 256:
                                                                        return FailureReason.PLAID_ITEM_LOGIN_REQUIRED;
                                                                    case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                                                                        return FailureReason.TOO_MANY_CUSTOMERS_CASHED_OUT_TO_INSTRUMENT;
                                                                    case SDK_ASSET_HEADER_BOLT_VALUE:
                                                                        return FailureReason.BANK_VALIDATION_FAILED;
                                                                    default:
                                                                        switch (i) {
                                                                            case SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE:
                                                                                return FailureReason.ASYNC_CASH_OUT_BLOCKED;
                                                                            case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                                                                                return FailureReason.ASYNC_CASH_OUT_BLOCKED_AFTER_ERROR;
                                                                            case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE:
                                                                                return FailureReason.RETRY_EXPIRED_AFTER_ERROR;
                                                                            default:
                                                                                return null;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public void Content(TemplateCardViewModel templateCardViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1382696468);
        int i2 = (gapComposer.changedInstance(templateCardViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TextCardKt.TemplateCard(templateCardViewModel, null, function1, gapComposer, ((i2 << 3) & 896) | (i2 & 14));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) templateCardViewModel, (Function) function1, i, 9);
        }
    }

    @Override // okhttp3.CookieJar
    public List loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList;
        httpUrl.getClass();
        String cookie = CookieManager.getInstance().getCookie(httpUrl.url);
        if (cookie != null) {
            List<String> split = new Regex("[,;]").split(0, cookie);
            arrayList = new ArrayList();
            for (String str : split) {
                Pattern pattern = Cookie.YEAR_PATTERN;
                Cookie parse = Cookie.Companion.parse(httpUrl, StringsKt.trim(str).toString());
                if (parse != null) {
                    arrayList.add(parse);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object parse(String str, ContinuationImpl continuationImpl) {
        RealSolanaAddressParser$parse$1 realSolanaAddressParser$parse$1;
        int i;
        SizeMap sizeMap;
        SolanaAddress solanaAddress;
        String str2 = str;
        if (continuationImpl instanceof RealSolanaAddressParser$parse$1) {
            realSolanaAddressParser$parse$1 = (RealSolanaAddressParser$parse$1) continuationImpl;
            int i2 = realSolanaAddressParser$parse$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSolanaAddressParser$parse$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSolanaAddressParser$parse$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSolanaAddressParser$parse$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!StringsKt.isBlank(str2)) {
                        String replaceFirst = StringsKt__StringsJVMKt.startsWith(str2, "solana://", true) ? str2 : StringsKt__StringsJVMKt.startsWith(str2, "solana:", true) ? StringsKt__StringsJVMKt.replaceFirst(str2, "solana:", "solana://", true) : null;
                        if (replaceFirst == null) {
                            realSolanaAddressParser$parse$1.L$0 = null;
                            realSolanaAddressParser$parse$1.label = 1;
                            Object tryParseBase58Address = tryParseBase58Address(str2, realSolanaAddressParser$parse$1);
                            if (tryParseBase58Address != obj2) {
                                return tryParseBase58Address;
                            }
                        } else {
                            SizeMap sizeMap2 = new SizeMap(replaceFirst);
                            Uri uri = (Uri) sizeMap2.mRatios;
                            String host = uri != null ? uri.getHost() : null;
                            if (host != null) {
                                realSolanaAddressParser$parse$1.L$0 = str2;
                                realSolanaAddressParser$parse$1.L$2 = sizeMap2;
                                realSolanaAddressParser$parse$1.label = 2;
                                obj = tryParseBase58Address(host, realSolanaAddressParser$parse$1);
                                if (obj != obj2) {
                                    sizeMap = sizeMap2;
                                }
                            }
                        }
                        return obj2;
                    }
                    return null;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sizeMap = realSolanaAddressParser$parse$1.L$2;
                str2 = realSolanaAddressParser$parse$1.L$0;
                SafeTrace.throwOnFailure(obj);
                String str3 = str2;
                solanaAddress = (SolanaAddress) obj;
                if (solanaAddress != null) {
                    return new SolanaAddress(solanaAddress.address, str3, zzadm.getUriQueryParam(sizeMap, AnnotatedPrivateKey.LABEL), zzadm.getUriQueryParam(sizeMap, "message"), zzadm.getUriQueryParam(sizeMap, "memo"), zzadm.getUriQueryParam(sizeMap, "spl-token"), zzadm.getUriQueryParam(sizeMap, "amount"), true);
                }
                return null;
            }
        }
        realSolanaAddressParser$parse$1 = new RealSolanaAddressParser$parse$1(this, continuationImpl);
        Object obj3 = realSolanaAddressParser$parse$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSolanaAddressParser$parse$1.label;
        if (i != 0) {
        }
        String str32 = str2;
        solanaAddress = (SolanaAddress) obj3;
        if (solanaAddress != null) {
        }
        return null;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public Object mo380restore(Object obj) {
        AnimationVector animationVector;
        AnimationVector animationVector2;
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
        Function1 function1 = twoWayConverterImpl.convertToVector;
        Float valueOf = Float.valueOf(0.001f);
        Object obj3 = list.get(1);
        obj3.getClass();
        Animatable animatable = new Animatable((Float) obj2, twoWayConverterImpl, valueOf, (String) obj3);
        Float f = (Float) list.get(2);
        Float f2 = (Float) list.get(3);
        if (f == null || (animationVector = (AnimationVector) function1.invoke(f)) == null) {
            animationVector = animatable.negativeInfinityBounds;
        }
        if (f2 == null || (animationVector2 = (AnimationVector) function1.invoke(f2)) == null) {
            animationVector2 = animatable.positiveInfinityBounds;
        }
        int size$animation_core = animationVector.getSize$animation_core();
        for (int i = 0; i < size$animation_core; i++) {
            if (animationVector.get$animation_core(i) > animationVector2.get$animation_core(i)) {
                PreconditionsKt.throwIllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + animationVector + " is greater than upper bound " + animationVector2 + " on index " + i);
            }
        }
        animatable.lowerBoundVector = animationVector;
        animatable.upperBoundVector = animationVector2;
        animatable.upperBound = f2;
        animatable.lowerBound = f;
        if (!animatable.isRunning()) {
            Object clampToBounds = animatable.clampToBounds(animatable.getValue());
            if (!Intrinsics.areEqual(clampToBounds, animatable.getValue())) {
                animatable.internalState.value$delegate.setValue(clampToBounds);
            }
        }
        return animatable;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public Object save(SaveableHolder saveableHolder, Object obj) {
        Animatable animatable = (Animatable) obj;
        saveableHolder.getClass();
        animatable.getClass();
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.add(animatable.targetValue$delegate.getValue());
        createListBuilder.add(animatable.label);
        createListBuilder.add(animatable.lowerBound);
        createListBuilder.add(animatable.upperBound);
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List list) {
        httpUrl.getClass();
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cookieManager.setCookie(httpUrl.url, ((Cookie) it.next()).toString());
        }
        cookieManager.flush();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|14|(1:16)(1:18)))|27|6|7|(0)(0)|12|13|14|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryParseBase58Address(String str, ContinuationImpl continuationImpl) {
        RealSolanaAddressParser$tryParseBase58Address$1 realSolanaAddressParser$tryParseBase58Address$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RealSolanaAddressParser$tryParseBase58Address$1) {
            realSolanaAddressParser$tryParseBase58Address$1 = (RealSolanaAddressParser$tryParseBase58Address$1) continuationImpl;
            int i2 = realSolanaAddressParser$tryParseBase58Address$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSolanaAddressParser$tryParseBase58Address$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realSolanaAddressParser$tryParseBase58Address$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSolanaAddressParser$tryParseBase58Address$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Base58 base58 = Base58.INSTANCE;
                    realSolanaAddressParser$tryParseBase58Address$1.L$0 = str;
                    realSolanaAddressParser$tryParseBase58Address$1.label = 1;
                    obj = Base58.decode(str);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realSolanaAddressParser$tryParseBase58Address$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                String str2 = str;
                SolanaAddress solanaAddress = new SolanaAddress(str2, str2, null, null, null, null, null, false);
                if (((byte[]) obj).length != 32) {
                    return solanaAddress;
                }
                return null;
            }
        }
        realSolanaAddressParser$tryParseBase58Address$1 = new RealSolanaAddressParser$tryParseBase58Address$1(this, continuationImpl);
        obj = realSolanaAddressParser$tryParseBase58Address$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSolanaAddressParser$tryParseBase58Address$1.label;
        if (i != 0) {
        }
        String str22 = str;
        SolanaAddress solanaAddress2 = new SolanaAddress(str22, str22, null, null, null, null, null, false);
        if (((byte[]) obj).length != 32) {
        }
    }

    public /* synthetic */ WorkCookieJar(int i) {
        this.$r8$classId = i;
    }

    public void Content(CellActionCardViewModel cellActionCardViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1569908910);
        int i2 = (gapComposer.changedInstance(cellActionCardViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CellActionCardKt.CellActionCard(cellActionCardViewModel, null, function1, gapComposer, ((i2 << 3) & 896) | (i2 & 14));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) cellActionCardViewModel, (Function) function1, i, 3);
        }
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderableUi
    public void Content(Object obj, Function1 function1, Composer composer) {
        switch (this.$r8$classId) {
            case 1:
                Content((CellActionCardViewModel) obj, function1, composer, 0);
                break;
            case 2:
                Content((TemplateCardViewModel) obj, function1, composer, 0);
                break;
            default:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1537918112);
                TextCardKt.SuggestionList((SuggestionListViewModel) obj, function1, null, gapComposer, 0);
                gapComposer.end(false);
                break;
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static SemanticColor m3797fromValue(int i) {
        if (i == 1) {
            return SemanticColor.SEMANTIC_COLOR_LABEL;
        }
        if (i == 2) {
            return SemanticColor.SEMANTIC_COLOR_SECONDARY_LABEL;
        }
        if (i == 3) {
            return SemanticColor.SEMANTIC_COLOR_ERROR;
        }
        if (i == 4) {
            return SemanticColor.SEMANTIC_COLOR_TERTIARY_LABEL;
        }
        if (i != 5) {
            return null;
        }
        return SemanticColor.SEMANTIC_COLOR_VERIFICATION_TINT;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static GetProfileDetailsContext m3799fromValue(int i) {
        switch (i) {
            case 1:
                return GetProfileDetailsContext.UNKNOWN;
            case 2:
                return GetProfileDetailsContext.PAYMENT_FLOW;
            case 3:
                return GetProfileDetailsContext.BTC_PAYMENT_FLOW;
            case 4:
                return GetProfileDetailsContext.PROFILE_DIRECTORY;
            case 5:
                return GetProfileDetailsContext.LAUNCHER;
            case 6:
                return GetProfileDetailsContext.ACTIVITY_PAYMENT_REQUEST_SENDER;
            case 7:
                return GetProfileDetailsContext.ACTIVITY_PAYMENT_REQUEST_RECEIVER;
            case 8:
                return GetProfileDetailsContext.ACTIVITY_PAYMENT_PUSH_SENDER;
            case 9:
                return GetProfileDetailsContext.ACTIVITY_PAYMENT_PUSH_RECEIVER;
            case 10:
                return GetProfileDetailsContext.ACTIVITY_OTHER;
            case 11:
                return GetProfileDetailsContext.INVEST_PAYMENT_FLOW;
            case 12:
                return GetProfileDetailsContext.GIFT_CARD;
            case 13:
                return GetProfileDetailsContext.GLOBAL_SEARCH;
            case 14:
                return GetProfileDetailsContext.POOLS;
            default:
                return null;
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static PaymentStateCode m3795fromValue(int i) {
        switch (i) {
            case 0:
                return PaymentStateCode.PAYMENT_STATE_CODE_UNSPECIFIED;
            case 1:
                return PaymentStateCode.PAYMENT_STATE_CODE_SCHEDULED;
            case 2:
                return PaymentStateCode.PAYMENT_STATE_CODE_VALIDATING;
            case 3:
                return PaymentStateCode.PAYMENT_STATE_CODE_VALIDATED;
            case 4:
                return PaymentStateCode.PAYMENT_STATE_CODE_WAITING_ON_SENDER;
            case 5:
                return PaymentStateCode.PAYMENT_STATE_CODE_CAPTURING;
            case 6:
                return PaymentStateCode.PAYMENT_STATE_CODE_CAPTURED;
            case 7:
                return PaymentStateCode.PAYMENT_STATE_CODE_WAITING_ON_RECIPIENT;
            case 8:
                return PaymentStateCode.PAYMENT_STATE_CODE_WAITING_ON_RISK;
            case 9:
                return PaymentStateCode.PAYMENT_STATE_CODE_PAYING_OUT;
            case 10:
                return PaymentStateCode.PAYMENT_STATE_CODE_PAID_OUT;
            case 11:
                return PaymentStateCode.PAYMENT_STATE_CODE_REFUNDING;
            case 12:
                return PaymentStateCode.PAYMENT_STATE_CODE_PULLING_REFUND;
            case 13:
                return PaymentStateCode.PAYMENT_STATE_CODE_WAITING_TO_REFUND;
            case 14:
                return PaymentStateCode.PAYMENT_STATE_CODE_FAILED;
            case 15:
                return PaymentStateCode.PAYMENT_STATE_CODE_CREATED;
            case 16:
                return PaymentStateCode.PAYMENT_STATE_CODE_WAITING_ON_COMPLIANCE_REVIEW;
            case 17:
                return PaymentStateCode.PAYMENT_STATE_CODE_FREEZING;
            case 18:
                return PaymentStateCode.PAYMENT_STATE_CODE_WAITING_ON_INTERNAL;
            case 19:
                return PaymentStateCode.PAYMENT_STATE_CODE_WAITING_ON_SPONSOR;
            default:
                return null;
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static FavoriteOrigin m3801fromValue(int i) {
        if (i == 0) {
            return FavoriteOrigin.FAVORITE_ORIGIN_UNSPECIFIED;
        }
        if (i == 1) {
            return FavoriteOrigin.FAVORITE_ORIGIN_CUSTOMER_PROFILE;
        }
        if (i == 2) {
            return FavoriteOrigin.FAVORITE_ORIGIN_BLOCKED;
        }
        if (i == 3) {
            return FavoriteOrigin.FAVORITE_ORIGIN_FAVORITES_MANAGEMENT;
        }
        if (i != 4) {
            return null;
        }
        return FavoriteOrigin.FAVORITE_ORIGIN_BUSINESS_PROFILE;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static KybEligibilityWarning.RestrictedFeature m3798fromValue(int i) {
        switch (i) {
            case 0:
                return KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_UNSPECIFIED;
            case 1:
                return KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_INVESTING;
            case 2:
                return KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_BTC;
            case 3:
                return KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_MONEY;
            case 4:
                return KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_FAMILIES;
            case 5:
                return KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_CARD;
            case 6:
                return KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_DIRECT_DEPOSIT;
            case 7:
                return KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_PAYCHECKS;
            case 8:
                return KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_TAX;
            default:
                return null;
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static SupportArticle.Channel m3796fromValue(int i) {
        if (i == 0) {
            return SupportArticle.Channel.CHANNEL_UNSPECIFIED;
        }
        if (i == 1) {
            return SupportArticle.Channel.CHANNEL_CHAT;
        }
        if (i == 2) {
            return SupportArticle.Channel.CHANNEL_EMAIL;
        }
        if (i == 3) {
            return SupportArticle.Channel.CHANNEL_PHONE;
        }
        if (i != 4) {
            return null;
        }
        return SupportArticle.Channel.CHANNEL_IN_APP_PHONE;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static ContextWrapper.Origin.OriginType m3800fromValue(int i) {
        switch (i) {
            case 1:
                return ContextWrapper.Origin.OriginType.ACTIVITY_TAB;
            case 2:
                return ContextWrapper.Origin.OriginType.DISCOVER_TAB;
            case 3:
                return ContextWrapper.Origin.OriginType.ACCOUNT_LINK;
            case 4:
                return ContextWrapper.Origin.OriginType.OFFER_DEEP_LINK;
            case 5:
                return ContextWrapper.Origin.OriginType.DISCOVER_SEARCH;
            case 6:
                return ContextWrapper.Origin.OriginType.MERCHANT_PROFILE;
            case 7:
                return ContextWrapper.Origin.OriginType.BLOCKED_BUSINESSES;
            case 8:
                return ContextWrapper.Origin.OriginType.GLOBAL_SEARCH;
            case 9:
                return ContextWrapper.Origin.OriginType.BILLS_AND_SUBSCRIPTIONS;
            default:
                return null;
        }
    }
}
