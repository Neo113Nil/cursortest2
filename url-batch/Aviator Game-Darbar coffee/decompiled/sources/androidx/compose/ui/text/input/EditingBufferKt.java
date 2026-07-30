package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m7134updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m6966getLengthimpl;
        int m6968getMinimpl = TextRange.m6968getMinimpl(j);
        int m6967getMaximpl = TextRange.m6967getMaximpl(j);
        if (TextRange.m6972intersects5zctL8(j2, j)) {
            if (TextRange.m6960contains5zctL8(j2, j)) {
                m6968getMinimpl = TextRange.m6968getMinimpl(j2);
                m6967getMaximpl = m6968getMinimpl;
            } else {
                if (TextRange.m6960contains5zctL8(j, j2)) {
                    m6966getLengthimpl = TextRange.m6966getLengthimpl(j2);
                } else if (TextRange.m6961containsimpl(j2, m6968getMinimpl)) {
                    m6968getMinimpl = TextRange.m6968getMinimpl(j2);
                    m6966getLengthimpl = TextRange.m6966getLengthimpl(j2);
                } else {
                    m6967getMaximpl = TextRange.m6968getMinimpl(j2);
                }
                m6967getMaximpl -= m6966getLengthimpl;
            }
        } else if (m6967getMaximpl > TextRange.m6968getMinimpl(j2)) {
            m6968getMinimpl -= TextRange.m6966getLengthimpl(j2);
            m6966getLengthimpl = TextRange.m6966getLengthimpl(j2);
            m6967getMaximpl -= m6966getLengthimpl;
        }
        return TextRangeKt.TextRange(m6968getMinimpl, m6967getMaximpl);
    }
}
