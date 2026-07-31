package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m7838updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m7666getLengthimpl;
        int m7668getMinimpl = TextRange.m7668getMinimpl(j);
        int m7667getMaximpl = TextRange.m7667getMaximpl(j);
        if (TextRange.m7672intersects5zctL8(j2, j)) {
            if (TextRange.m7660contains5zctL8(j2, j)) {
                m7668getMinimpl = TextRange.m7668getMinimpl(j2);
                m7667getMaximpl = m7668getMinimpl;
            } else {
                if (TextRange.m7660contains5zctL8(j, j2)) {
                    m7666getLengthimpl = TextRange.m7666getLengthimpl(j2);
                } else if (TextRange.m7661containsimpl(j2, m7668getMinimpl)) {
                    m7668getMinimpl = TextRange.m7668getMinimpl(j2);
                    m7666getLengthimpl = TextRange.m7666getLengthimpl(j2);
                } else {
                    m7667getMaximpl = TextRange.m7668getMinimpl(j2);
                }
                m7667getMaximpl -= m7666getLengthimpl;
            }
        } else if (m7667getMaximpl > TextRange.m7668getMinimpl(j2)) {
            m7668getMinimpl -= TextRange.m7666getLengthimpl(j2);
            m7666getLengthimpl = TextRange.m7666getLengthimpl(j2);
            m7667getMaximpl -= m7666getLengthimpl;
        }
        return TextRangeKt.TextRange(m7668getMinimpl, m7667getMaximpl);
    }
}
