package sqip.internal.scrubbing;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import sqip.internal.UtilsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lsqip/internal/scrubbing/ExpirationDateScrubber;", "Lsqip/internal/scrubbing/Scrubber;", "()V", "scrub", "", "current", "proposed", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExpirationDateScrubber implements Scrubber {
    @Override // sqip.internal.scrubbing.Scrubber
    public String scrub(String current, String proposed) {
        current.getClass();
        proposed.getClass();
        boolean z = StringsKt__StringsJVMKt.startsWith(current, proposed, false) && proposed.length() == current.length() - 1;
        String stripNonDigits = UtilsKt.stripNonDigits(proposed);
        if (stripNonDigits.length() == 0) {
            return "";
        }
        if (stripNonDigits.length() > 4) {
            stripNonDigits = stripNonDigits.substring(0, 4);
        }
        if (z && !Character.isDigit(current.charAt(current.length() - 1))) {
            stripNonDigits = Boxes$$ExternalSyntheticOutline1.m1148m(1, 0, stripNonDigits);
        }
        StringBuilder sb = new StringBuilder();
        int length = stripNonDigits.length();
        for (int i = 0; i < length; i++) {
            char charAt = stripNonDigits.charAt(i);
            if (sb.length() == 0) {
                if (charAt == '0' || charAt == '1') {
                    sb.append(charAt);
                } else {
                    sb.append('0');
                    sb.append(charAt);
                }
            } else if (sb.length() < 4) {
                sb.append(charAt);
            }
        }
        if (sb.length() >= 2) {
            sb.insert(2, '/');
        }
        return sb.toString();
    }
}
