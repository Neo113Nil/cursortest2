package sqip.internal.scrubbing;

import com.squareup.Card$Brand;
import kotlin.Metadata;
import sqip.internal.UtilsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lsqip/internal/scrubbing/CvvScrubber;", "Lsqip/internal/scrubbing/Scrubber;", "()V", "brand", "Lcom/squareup/Card$Brand;", "getBrand$card_entry_release", "()Lcom/squareup/Card$Brand;", "setBrand$card_entry_release", "(Lcom/squareup/Card$Brand;)V", "scrub", "", "current", "proposed", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CvvScrubber implements Scrubber {
    private Card$Brand brand = Card$Brand.UNKNOWN;

    /* renamed from: getBrand$card_entry_release, reason: from getter */
    public final Card$Brand getBrand() {
        return this.brand;
    }

    @Override // sqip.internal.scrubbing.Scrubber
    public String scrub(String current, String proposed) {
        current.getClass();
        proposed.getClass();
        return proposed.length() > UtilsKt.getMaxCvvLength(this.brand) ? current : proposed;
    }

    public final void setBrand$card_entry_release(Card$Brand card$Brand) {
        card$Brand.getClass();
        this.brand = card$Brand;
    }
}
