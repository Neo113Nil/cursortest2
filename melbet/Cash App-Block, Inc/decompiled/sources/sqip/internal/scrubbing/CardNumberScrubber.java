package sqip.internal.scrubbing;

import com.squareup.Card$Brand;
import kotlin.Metadata;
import sqip.internal.UtilsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lsqip/internal/scrubbing/CardNumberScrubber;", "Lsqip/internal/scrubbing/Scrubber;", "()V", "brand", "Lcom/squareup/Card$Brand;", "getBrand$card_entry_release", "()Lcom/squareup/Card$Brand;", "setBrand$card_entry_release", "(Lcom/squareup/Card$Brand;)V", "insertSpace", "", "digitCount", "", "scrub", "", "current", "proposed", "Companion", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardNumberScrubber implements Scrubber {
    private static final char SPACE_CHAR = ' ';
    private Card$Brand brand = Card$Brand.UNKNOWN;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Card$Brand.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[11] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[13] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[15] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[0] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean insertSpace(int digitCount) {
        switch (WhenMappings.$EnumSwitchMapping$0[this.brand.ordinal()]) {
            case 1:
            case 2:
                return digitCount == 4 || digitCount == 10;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return digitCount > 0 && digitCount % 4 == 0;
            default:
                return digitCount > 0 && digitCount % 4 == 0;
        }
    }

    /* renamed from: getBrand$card_entry_release, reason: from getter */
    public final Card$Brand getBrand() {
        return this.brand;
    }

    @Override // sqip.internal.scrubbing.Scrubber
    public String scrub(String current, String proposed) {
        current.getClass();
        proposed.getClass();
        StringBuilder sb = new StringBuilder();
        int length = proposed.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = proposed.charAt(i2);
            if (Character.isDigit(charAt)) {
                if (insertSpace(i)) {
                    sb.append(SPACE_CHAR);
                }
                sb.append(charAt);
                i++;
            }
            if (UtilsKt.isMobileCommerceMaxLength(this.brand, i)) {
                break;
            }
        }
        return sb.toString();
    }

    public final void setBrand$card_entry_release(Card$Brand card$Brand) {
        card$Brand.getClass();
        this.brand = card$Brand;
    }
}
