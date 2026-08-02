package sqip.internal.contracts;

import kotlin.Metadata;
import sqip.internal.BaseView;
import sqip.internal.presenters.CardImagePresenter;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lsqip/internal/contracts/HelperTextContract;", "", "View", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface HelperTextContract {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lsqip/internal/contracts/HelperTextContract$View;", "Lsqip/internal/BaseView;", "Lsqip/internal/presenters/CardImagePresenter;", "displayCardNumberErrorText", "", "labelFor", "Landroid/view/View;", "displayEnterCardNumberText", "displayEnterExpirationText", "displayEnterFourDigitCvvText", "displayEnterGiftCardNumberText", "displayEnterPostalText", "displayEnterThreeDigitCvvText", "displayExpDateErrorText", "displayFormValidText", "displayProcessingRequestText", "setPresenter", "presenter", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface View extends BaseView<CardImagePresenter> {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void setPresenter(View view, CardImagePresenter cardImagePresenter) {
                cardImagePresenter.getClass();
            }
        }

        void displayCardNumberErrorText(android.view.View labelFor);

        void displayEnterCardNumberText(android.view.View labelFor);

        void displayEnterExpirationText(android.view.View labelFor);

        void displayEnterFourDigitCvvText(android.view.View labelFor);

        void displayEnterGiftCardNumberText(android.view.View labelFor);

        void displayEnterPostalText(android.view.View labelFor);

        void displayEnterThreeDigitCvvText(android.view.View labelFor);

        void displayExpDateErrorText(android.view.View labelFor);

        void displayFormValidText();

        void displayProcessingRequestText();

        void setPresenter(CardImagePresenter presenter);
    }
}
