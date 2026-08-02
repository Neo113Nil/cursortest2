package sqip.internal.contracts;

import com.squareup.Card$Brand;
import kotlin.Metadata;
import sqip.internal.BaseView;
import sqip.internal.presenters.CardImagePresenter;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lsqip/internal/contracts/CardImageContract;", "", "View", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface CardImageContract {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\tH&J\b\u0010\u000f\u001a\u00020\tH&J\b\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH&J\b\u0010\u0013\u001a\u00020\tH&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH&R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lsqip/internal/contracts/CardImageContract$View;", "Lsqip/internal/BaseView;", "Lsqip/internal/presenters/CardImagePresenter;", "isBigCard", "", "()Z", "setBigCard", "(Z)V", "animateCardTransition", "", "oldBrand", "Lcom/squareup/Card$Brand;", "fadeCvvBubbleIn", "fadeCvvBubbleOut", "flipToBack", "flipToFront", "init", "setNewCardAssetsWith", "brand", "showLastFewDigits", "switchCvvDigitFocusedTo", "position", "", "switchExpDotFocusedTo", "switchPanDigitFocusedTo", "updatePaintFor", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface View extends BaseView<CardImagePresenter> {
        void animateCardTransition(Card$Brand oldBrand);

        void fadeCvvBubbleIn();

        void fadeCvvBubbleOut();

        void flipToBack();

        void flipToFront();

        void init();

        /* renamed from: isBigCard */
        boolean getIsBigCard();

        void setBigCard(boolean z);

        void setNewCardAssetsWith(Card$Brand brand);

        void showLastFewDigits();

        void switchCvvDigitFocusedTo(int position);

        void switchExpDotFocusedTo(int position);

        void switchPanDigitFocusedTo(int position);

        void updatePaintFor(Card$Brand brand);
    }
}
