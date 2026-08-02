package sqip.internal;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.properties.Delegates;
import kotlin.properties.NotNullVar;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import sqip.Callback;
import sqip.CardEntryActivityResult;
import sqip.internal.BaseCardEntryActivity;
import sqip.internal.CardEntryResult;
import sqip.internal.event.EventLogger;
import sqip.internal.nonce.CardEntryActivityControllerFactory;
import sqip.internal.nonce.CardEntryResultParcelable;
import sqip.internal.nonce.CreateCardNonceRequestHandler;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0004H\u0002J\b\u0010\"\u001a\u00020\u0004H\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006-"}, d2 = {"Lsqip/internal/CardEntryActivity;", "Lsqip/internal/BaseCardEntryActivity;", "()V", "<set-?>", "", "bigCardHeight", "getBigCardHeight", "()I", "setBigCardHeight", "(I)V", "bigCardHeight$delegate", "Lkotlin/properties/ReadWriteProperty;", "bigCardHorizontalEndMargin", "getBigCardHorizontalEndMargin", "setBigCardHorizontalEndMargin", "bigCardHorizontalEndMargin$delegate", "bigCardTopPadding", "getBigCardTopPadding", "setBigCardTopPadding", "bigCardTopPadding$delegate", "bigCardWidth", "getBigCardWidth", "setBigCardWidth", "bigCardWidth$delegate", "cardEditorTopMargin", "getCardEditorTopMargin", "setCardEditorTopMargin", "cardEditorTopMargin$delegate", "helperTextTopMargin", "getHelperTextTopMargin", "setHelperTextTopMargin", "helperTextTopMargin$delegate", "calculateMinBigCardHeight", "calculateMinBigCardHorizontalHeight", "calculateMinBigCardHorizontalWidth", "doSetContentView", "", "getLayoutMode", "Lsqip/internal/BaseCardEntryActivity$LayoutMode;", "makeControllerFactory", "Lsqip/internal/nonce/CardEntryActivityControllerFactory;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardEntryActivity extends BaseCardEntryActivity {
    static final /* synthetic */ KProperty[] $$delegatedProperties;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: bigCardHeight$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty bigCardHeight;

    /* renamed from: bigCardHorizontalEndMargin$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty bigCardHorizontalEndMargin;

    /* renamed from: bigCardTopPadding$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty bigCardTopPadding;

    /* renamed from: bigCardWidth$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty bigCardWidth;

    /* renamed from: cardEditorTopMargin$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty cardEditorTopMargin;

    /* renamed from: helperTextTopMargin$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty helperTextTopMargin;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(CardEntryActivity.class, "bigCardHeight", "getBigCardHeight()I", 0);
        ReflectionFactory reflectionFactory = Reflection.factory;
        $$delegatedProperties = new KProperty[]{reflectionFactory.mutableProperty1(mutablePropertyReference1Impl), Fragment$5$$ExternalSyntheticOutline0.m(CardEntryActivity.class, "bigCardWidth", "getBigCardWidth()I", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(CardEntryActivity.class, "cardEditorTopMargin", "getCardEditorTopMargin()I", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(CardEntryActivity.class, "helperTextTopMargin", "getHelperTextTopMargin()I", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(CardEntryActivity.class, "bigCardTopPadding", "getBigCardTopPadding()I", 0, reflectionFactory), Fragment$5$$ExternalSyntheticOutline0.m(CardEntryActivity.class, "bigCardHorizontalEndMargin", "getBigCardHorizontalEndMargin()I", 0, reflectionFactory)};
        INSTANCE = new Companion(null);
    }

    public CardEntryActivity() {
        Delegates delegates = Delegates.INSTANCE;
        delegates.getClass();
        this.bigCardHeight = new NotNullVar();
        delegates.getClass();
        this.bigCardWidth = new NotNullVar();
        delegates.getClass();
        this.cardEditorTopMargin = new NotNullVar();
        delegates.getClass();
        this.helperTextTopMargin = new NotNullVar();
        delegates.getClass();
        this.bigCardTopPadding = new NotNullVar();
        delegates.getClass();
        this.bigCardHorizontalEndMargin = new NotNullVar();
    }

    private final int calculateMinBigCardHeight() {
        int height = findViewById(sqip.cardentry.R.id.helper_text_switcher).getHeight();
        int height2 = findViewById(sqip.cardentry.R.id.save_button).getHeight();
        return getBigCardHeight() + getCardEditorTopMargin() + getHelperTextTopMargin() + getBigCardTopPadding() + height + height2 + findViewById(sqip.cardentry.R.id.card_editor).getHeight();
    }

    private final int calculateMinBigCardHorizontalHeight() {
        return (getBigCardTopPadding() * 2) + getBigCardHeight() + findViewById(sqip.cardentry.R.id.save_button).getHeight();
    }

    private final int calculateMinBigCardHorizontalWidth() {
        return (getBigCardTopPadding() * 2) + getBigCardWidth() + getBigCardHorizontalEndMargin() + findViewById(sqip.cardentry.R.id.card_editor).getWidth();
    }

    private final int getBigCardHeight() {
        return ((Number) this.bigCardHeight.getValue(this, $$delegatedProperties[0])).intValue();
    }

    private final int getBigCardHorizontalEndMargin() {
        return ((Number) this.bigCardHorizontalEndMargin.getValue(this, $$delegatedProperties[5])).intValue();
    }

    private final int getBigCardTopPadding() {
        return ((Number) this.bigCardTopPadding.getValue(this, $$delegatedProperties[4])).intValue();
    }

    private final int getBigCardWidth() {
        return ((Number) this.bigCardWidth.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final int getCardEditorTopMargin() {
        return ((Number) this.cardEditorTopMargin.getValue(this, $$delegatedProperties[2])).intValue();
    }

    private final int getHelperTextTopMargin() {
        return ((Number) this.helperTextTopMargin.getValue(this, $$delegatedProperties[3])).intValue();
    }

    private final void setBigCardHeight(int i) {
        this.bigCardHeight.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    private final void setBigCardHorizontalEndMargin(int i) {
        this.bigCardHorizontalEndMargin.setValue(this, $$delegatedProperties[5], Integer.valueOf(i));
    }

    private final void setBigCardTopPadding(int i) {
        this.bigCardTopPadding.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    private final void setBigCardWidth(int i) {
        this.bigCardWidth.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    private final void setCardEditorTopMargin(int i) {
        this.cardEditorTopMargin.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    private final void setHelperTextTopMargin(int i) {
        this.helperTextTopMargin.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
    }

    @Override // sqip.internal.BaseCardEntryActivity
    public void doSetContentView() {
        setContentView(getCardEditorState().getCollectOnlyGiftCard() ? sqip.cardentry.R.layout.sqip_activity_gift_card_entry_small_card_constraints : sqip.cardentry.R.layout.sqip_activity_card_entry);
    }

    @Override // sqip.internal.BaseCardEntryActivity
    public BaseCardEntryActivity.LayoutMode getLayoutMode() {
        if (getCardEditorState().getCollectOnlyGiftCard()) {
            return BaseCardEntryActivity.LayoutMode.SMALL_CARD;
        }
        int width = getCardEntryLayout().getWidth();
        int height = getCardEntryLayout().getHeight();
        return (width <= calculateMinBigCardHorizontalWidth() || height <= calculateMinBigCardHorizontalHeight() || !(getResources().getConfiguration().orientation == 2)) ? height < calculateMinBigCardHeight() ? BaseCardEntryActivity.LayoutMode.SMALL_CARD : BaseCardEntryActivity.LayoutMode.BIG_CARD_VERTICAL : BaseCardEntryActivity.LayoutMode.BIG_CARD_HORIZONTAL;
    }

    @Override // sqip.internal.BaseCardEntryActivity
    public CardEntryActivityControllerFactory makeControllerFactory() {
        return new CardEntryActivityControllerFactory() { // from class: sqip.internal.CardEntryActivity$makeControllerFactory$1
            @Override // sqip.internal.nonce.CardEntryActivityControllerFactory
            public IapCardEntryActivityController makeController(CreateCardNonceRequestHandler cardNonceRequestHandler, EventLogger eventLogger, Resources resources) {
                cardNonceRequestHandler.getClass();
                eventLogger.getClass();
                resources.getClass();
                return new IapCardEntryActivityController(cardNonceRequestHandler, eventLogger, resources);
            }
        };
    }

    @Override // sqip.internal.BaseCardEntryActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources resources = getResources();
        setBigCardHeight(resources.getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_big_card_height));
        setBigCardWidth(resources.getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_big_card_width));
        setCardEditorTopMargin(resources.getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_big_card_editor_margin_top));
        setBigCardTopPadding(resources.getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_big_card_top_padding));
        setHelperTextTopMargin(resources.getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_helper_text_margin_top));
        setBigCardHorizontalEndMargin(resources.getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_big_card_horizontal_margin_end));
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0014"}, d2 = {"Lsqip/internal/CardEntryActivity$Companion;", "", "()V", "onActivityResult", "", "data", "Landroid/content/Intent;", "callback", "Lsqip/Callback;", "Lsqip/CardEntryActivityResult;", "start", "activity", "Landroid/app/Activity;", "collectPostal", "", "requestCode", "", "startActivity", "giftCard", "startGiftCardFlow", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BaseCardEntryActivity.BaseCardEntryActivityResult.values().length];
                try {
                    iArr[BaseCardEntryActivity.BaseCardEntryActivityResult.ACTIVITY_RESULT_SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BaseCardEntryActivity.BaseCardEntryActivityResult.ACTIVITY_RESULT_FAILURE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BaseCardEntryActivity.BaseCardEntryActivityResult.ACTIVITY_RESULT_TIMEOUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void startActivity(Activity activity, boolean collectPostal, int requestCode, boolean giftCard) {
            SqipActivityDebouncer sqipActivityDebouncer = SqipActivityDebouncer.INSTANCE;
            String simpleName = Reflection.factory.getOrCreateKotlinClass(CardEntryActivity.class).getSimpleName();
            simpleName.getClass();
            if (sqipActivityDebouncer.install(activity, simpleName)) {
                Intent intent = new Intent(activity, (Class<?>) CardEntryActivity.class);
                intent.setPackage(activity.getPackageName());
                if (giftCard) {
                    intent.putExtra(BaseCardEntryActivity.COLLECT_GIFT_CARD, giftCard);
                } else {
                    intent.putExtra(BaseCardEntryActivity.COLLECT_POSTAL_KEY, collectPostal);
                }
                intent.putExtra(BaseCardEntryActivity.MASK_CARD_NUMBER_EXTRA, false);
                if (UtilsKt.isLaunchedFrom("io.flutter.app.FlutterActivity", activity) || UtilsKt.isLaunchedFrom("com.facebook.react.ReactActivity", activity)) {
                    intent.putExtra(BaseCardEntryActivity.PROCESS_DEATH_EXTRA, BaseCardEntryActivity.PROCESS_DEATH_EXTRA);
                }
                activity.startActivityForResult(intent, requestCode);
            }
        }

        public final void onActivityResult(Intent data, Callback<CardEntryActivityResult> callback) {
            CardEntryActivityResult success;
            callback.getClass();
            if (data == null || !data.hasExtra(BaseCardEntryActivity.ACTIVITY_RESULT)) {
                return;
            }
            String stringExtra = data.getStringExtra(BaseCardEntryActivity.ACTIVITY_RESULT);
            stringExtra.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[BaseCardEntryActivity.BaseCardEntryActivityResult.valueOf(stringExtra).ordinal()];
            if (i == 1) {
                CardEntryResultParcelable cardEntryResultParcelable = (CardEntryResultParcelable) data.getParcelableExtra(BaseCardEntryActivity.CARD_ENTRY_RESULT);
                CardEntryResult result = cardEntryResultParcelable != null ? cardEntryResultParcelable.getResult() : null;
                result.getClass();
                CardEntryResult.CardAndNonceResult cardAndNonceResult = (CardEntryResult.CardAndNonceResult) result;
                success = new CardEntryActivityResult.Success(cardAndNonceResult.getNonce(), cardAndNonceResult.getCard());
            } else {
                if (i != 2 && i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                success = CardEntryActivityResult.Canceled.INSTANCE;
            }
            callback.onResult(success);
        }

        public final void start(Activity activity, boolean collectPostal, int requestCode) {
            activity.getClass();
            startActivity(activity, collectPostal, requestCode, false);
        }

        public final void startGiftCardFlow(Activity activity, int requestCode) {
            activity.getClass();
            startActivity(activity, false, requestCode, true);
        }

        private Companion() {
        }
    }
}
