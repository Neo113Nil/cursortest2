package com.squareup.protos.binfo.api;

import android.security.keystore.KeyGenParameterSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel;
import com.squareup.cash.moneybot.views.plugins.ActionCardKt;
import com.squareup.cash.moneybot.views.plugins.SlottedCardKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.observability.backend.real.RealDatadogSpanTracking;
import com.squareup.cash.supportarticles.app.v1.Glyph;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.appthemes.AppThemeName;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.PaymentActivity;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.opentelemetry.api.trace.PropagatedSpan;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.ArrayBasedContext;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.LazyStorage;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;

/* loaded from: classes7.dex */
public enum CardProduct implements WireEnum {
    DEFAULT_CARD_PRODUCT_DO_NOT_USE(1),
    INTERNATIONAL_MAESTRO(2),
    DINERS_CLUB(3),
    DISCOVER(4),
    INTERAC(5),
    JCB(6),
    MASTERCARD(7),
    PIN_ONLY(8),
    VISA(9),
    AMEX(10),
    GE_CAPITAL(11),
    PRIVATE_LABEL(12),
    SQUARE_GIFT_CARD_V2(13),
    UNION_PAY(14),
    SQUARE_CAPITAL_CARD(15),
    EFTPOS(16),
    FELICA_ID(17),
    FELICA_TRANSPORTATION(18),
    FELICA_QP(19),
    ALIPAY(20),
    CASH_APP(21),
    EBT(22),
    PAYPAY(23),
    AFTERPAY(24),
    SQUARE_ACCOUNT_BALANCE(25),
    PAYPAL(26),
    AU_PAY(27),
    WECHAT_PAY(28),
    D_BARAI(29),
    MERPAY(30),
    RAKUTEN_PAY(31),
    STORED_VALUE(32),
    CASH_LOCAL(33),
    LOCAL_CASH(34),
    CARNET(35);

    public final int value;
    public static final Companion Companion = new Companion(0);
    public static final CardProduct$Companion$ADAPTER$1 ADAPTER = new CardProduct$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CardProduct.class), Syntax.PROTO_2, null);

    CardProduct(int i) {
        this.value = i;
    }

    public static final CardProduct fromValue(int i) {
        Companion.getClass();
        return Companion.m3832fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion implements ClientRenderableUi {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Companion(int i) {
            this.$r8$classId = i;
        }

        public static KeyGenParameterSpec build() {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, -7);
            Date time = calendar.getTime();
            calendar.add(5, 365);
            KeyGenParameterSpec.Builder keyValidityEnd = new KeyGenParameterSpec.Builder("TTP-wrapping-key", 32).setDigests("SHA-256").setEncryptionPaddings("OAEPPadding").setBlockModes("ECB").setIsStrongBoxBacked(false).setKeySize(2048).setKeyValidityStart(time).setKeyValidityEnd(calendar.getTime());
            String date = time.toString();
            date.getClass();
            byte[] bytes = date.getBytes(Charsets.UTF_8);
            bytes.getClass();
            KeyGenParameterSpec build = keyValidityEnd.setAttestationChallenge(bytes).build();
            build.getClass();
            return build;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CardProduct m3832fromValue(int i) {
            switch (i) {
                case 1:
                    return CardProduct.DEFAULT_CARD_PRODUCT_DO_NOT_USE;
                case 2:
                    return CardProduct.INTERNATIONAL_MAESTRO;
                case 3:
                    return CardProduct.DINERS_CLUB;
                case 4:
                    return CardProduct.DISCOVER;
                case 5:
                    return CardProduct.INTERAC;
                case 6:
                    return CardProduct.JCB;
                case 7:
                    return CardProduct.MASTERCARD;
                case 8:
                    return CardProduct.PIN_ONLY;
                case 9:
                    return CardProduct.VISA;
                case 10:
                    return CardProduct.AMEX;
                case 11:
                    return CardProduct.GE_CAPITAL;
                case 12:
                    return CardProduct.PRIVATE_LABEL;
                case 13:
                    return CardProduct.SQUARE_GIFT_CARD_V2;
                case 14:
                    return CardProduct.UNION_PAY;
                case 15:
                    return CardProduct.SQUARE_CAPITAL_CARD;
                case 16:
                    return CardProduct.EFTPOS;
                case 17:
                    return CardProduct.FELICA_ID;
                case 18:
                    return CardProduct.FELICA_TRANSPORTATION;
                case 19:
                    return CardProduct.FELICA_QP;
                case 20:
                    return CardProduct.ALIPAY;
                case 21:
                    return CardProduct.CASH_APP;
                case 22:
                    return CardProduct.EBT;
                case 23:
                    return CardProduct.PAYPAY;
                case 24:
                    return CardProduct.AFTERPAY;
                case 25:
                    return CardProduct.SQUARE_ACCOUNT_BALANCE;
                case 26:
                    return CardProduct.PAYPAL;
                case 27:
                    return CardProduct.AU_PAY;
                case 28:
                    return CardProduct.WECHAT_PAY;
                case 29:
                    return CardProduct.D_BARAI;
                case 30:
                    return CardProduct.MERPAY;
                case 31:
                    return CardProduct.RAKUTEN_PAY;
                case 32:
                    return CardProduct.STORED_VALUE;
                case 33:
                    return CardProduct.CASH_LOCAL;
                case 34:
                    return CardProduct.LOCAL_CASH;
                case 35:
                    return CardProduct.CARNET;
                default:
                    return null;
            }
        }

        public static RealDatadogSpanTracking startTrackingSpan$real$default(Tracer tracer, String str, String str2, SpanContext spanContext, Map map, Long l, int i) {
            if ((i & 8) != 0) {
                spanContext = null;
            }
            boolean z = (i & 64) == 0;
            tracer.getClass();
            str.getClass();
            SpanBuilder spanBuilder = tracer.spanBuilder(str);
            if (spanContext != null) {
                Context current = LazyStorage.storage.current();
                if (current == null) {
                    current = ArrayBasedContext.ROOT;
                }
                spanBuilder = spanBuilder.setParent(current.with(new PropagatedSpan(spanContext)));
            } else if (z) {
                spanBuilder = spanBuilder.setNoParent();
            }
            if (l != null) {
                spanBuilder = spanBuilder.setStartTimestamp(l.longValue());
            }
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    spanBuilder = spanBuilder.setAttribute((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (str2 == null) {
                UUID.randomUUID().toString().getClass();
            }
            Span startSpan = spanBuilder.startSpan();
            startSpan.getClass();
            return new RealDatadogSpanTracking(tracer, startSpan);
        }

        public void Content(ActionCardViewModel actionCardViewModel, Function1 function1, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-1860124240);
            int i2 = (gapComposer.changedInstance(actionCardViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                ActionCardKt.ActionCard(actionCardViewModel, null, function1, gapComposer, ((i2 << 3) & 896) | (i2 & 14));
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) actionCardViewModel, (Function) function1, i, 1);
            }
        }

        @Override // com.squareup.cash.moneybot.components.api.ClientRenderableUi
        public /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, Composer composer) {
            switch (this.$r8$classId) {
                case 1:
                    Content((ActionCardViewModel) obj, function1, composer, 0);
                    break;
                default:
                    Content((SlottedCardViewModel) obj, function1, composer, 0);
                    break;
            }
        }

        public void Content(SlottedCardViewModel slottedCardViewModel, Function1 function1, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-2120899193);
            int i2 = (gapComposer.changedInstance(slottedCardViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                SlottedCardKt.SlottedCard(slottedCardViewModel, null, function1, gapComposer, ((i2 << 3) & 896) | (i2 & 14));
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) slottedCardViewModel, (Function) function1, i, 7);
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Glyph m3831fromValue(int i) {
            switch (i) {
                case 0:
                    return Glyph.GLYPH_UNSPECIFIED;
                case 1:
                    return Glyph.GLYPH_CARD;
                case 2:
                    return Glyph.GLYPH_BITCOIN;
                case 3:
                    return Glyph.GLYPH_INVESTING;
                case 4:
                    return Glyph.GLYPH_STAR;
                case 5:
                    return Glyph.GLYPH_DEPOSIT;
                case 6:
                    return Glyph.GLYPH_LIMITS;
                case 7:
                    return Glyph.GLYPH_PERSONAL;
                case 8:
                    return Glyph.GLYPH_BOOST;
                case 9:
                    return Glyph.GLYPH_BORROW;
                case 10:
                    return Glyph.GLYPH_PAY_WITH_CASH;
                case 11:
                    return Glyph.GLYPH_BUSINESS_ACCOUNT;
                case 12:
                    return Glyph.GLYPH_TAXES;
                case 13:
                    return Glyph.GLYPH_ADD;
                case 14:
                    return Glyph.GLYPH_WITHDRAW;
                case 15:
                    return Glyph.GLYPH_PEOPLE;
                case 16:
                    return Glyph.GLYPH_DEFAULT;
                case 17:
                    return Glyph.GLYPH_INFO;
                case 18:
                    return Glyph.GLYPH_PAYMENT_PLAN;
                case 19:
                    return Glyph.GLYPH_SAVINGS;
                case 20:
                    return Glyph.GLYPH_AFTERPAY;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static AppThemeName m3834fromValue(int i) {
            if (i == 0) {
                return AppThemeName.UNKNOWN_NAME;
            }
            if (i == 1) {
                return AppThemeName.PINK;
            }
            if (i == 2) {
                return AppThemeName.GLITTER;
            }
            if (i == 3) {
                return AppThemeName.TORTOISE;
            }
            if (i == 4) {
                return AppThemeName.MOOD;
            }
            if (i != 5) {
                return null;
            }
            return AppThemeName.BRAT;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Error.Category m3833fromValue(int i) {
            switch (i) {
                case 1:
                    return Error.Category.API_ERROR;
                case 2:
                    return Error.Category.AUTHENTICATION_ERROR;
                case 3:
                    return Error.Category.INVALID_REQUEST_ERROR;
                case 4:
                    return Error.Category.RATE_LIMIT_ERROR;
                case 5:
                    return Error.Category.PAYMENT_PROCESSING_ERROR;
                case 6:
                default:
                    return null;
                case 7:
                    return Error.Category.MERCHANT_ERROR;
                case 8:
                    return Error.Category.BRAND_ERROR;
                case 9:
                    return Error.Category.DISPUTE_ERROR;
                case 10:
                    return Error.Category.GRANT_ERROR;
                case 11:
                    return Error.Category.API_KEY_ERROR;
                case 12:
                    return Error.Category.WEBHOOK_ERROR;
                case 13:
                    return Error.Category.ORDER_ERROR;
                case 14:
                    return Error.Category.MESSAGE_ERROR;
                case 15:
                    return Error.Category.OFFER_ERROR;
                case 16:
                    return Error.Category.CUSTOMER_ERROR;
                case 17:
                    return Error.Category.REQUEST_CHAINING_ERROR;
                case 18:
                    return Error.Category.BANK_ACCOUNT_ERROR;
                case 19:
                    return Error.Category.PAYOUT_PROCESSING_ERROR;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PaymentActivity.State m3835fromValue(int i) {
            if (i == 0) {
                return PaymentActivity.State.STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return PaymentActivity.State.PROCESSING;
            }
            if (i == 2) {
                return PaymentActivity.State.COMPLETED;
            }
            if (i == 3) {
                return PaymentActivity.State.FAILED;
            }
            if (i != 4) {
                return null;
            }
            return PaymentActivity.State.REFUNDED;
        }

        public static ComposePlatform.Color.NamedColor fromValue(int i) {
            switch (i) {
                case 0:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_UNSPECIFIED;
                case 1:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_PRIMARY;
                case 2:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ON_PRIMARY;
                case 3:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_PRIMARY_CONTAINER;
                case 4:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ON_PRIMARY_CONTAINER;
                case 5:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_SECONDARY;
                case 6:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ON_SECONDARY;
                case 7:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_SECONDARY_CONTAINER;
                case 8:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ON_SECONDARY_CONTAINER;
                case 9:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_TERTIARY;
                case 10:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ON_TERTIARY;
                case 11:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_BACKGROUND;
                case 12:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ON_BACKGROUND;
                case 13:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_SURFACE;
                case 14:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ON_SURFACE;
                case 15:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_SURFACE_VARIANT;
                case 16:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ON_SURFACE_VARIANT;
                case 17:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ERROR;
                case 18:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_ON_ERROR;
                case 19:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_OUTLINE;
                case 20:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_RED;
                case 21:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_GREEN;
                case 22:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_BLUE;
                case 23:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_BLACK;
                case 24:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_WHITE;
                case 25:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_GRAY;
                case 26:
                    return ComposePlatform.Color.NamedColor.NAMED_COLOR_TRANSPARENT;
                default:
                    return null;
            }
        }
    }
}
