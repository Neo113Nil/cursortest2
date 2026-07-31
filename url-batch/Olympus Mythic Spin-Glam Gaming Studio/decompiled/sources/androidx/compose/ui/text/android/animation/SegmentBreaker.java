package androidx.compose.ui.text.android.animation;

import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;

/* compiled from: SegmentBreaker.kt */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SegmentBreaker {
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    /* compiled from: SegmentBreaker.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            iArr[SegmentType.Document.ordinal()] = 1;
            iArr[SegmentType.Paragraph.ordinal()] = 2;
            iArr[SegmentType.Line.ordinal()] = 3;
            iArr[SegmentType.Word.ordinal()] = 4;
            iArr[SegmentType.Character.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }
}
