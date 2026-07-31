package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"getLocalPlaceholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "start", "", "end", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultiParagraphIntrinsicsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List getLocalPlaceholders(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            AnnotatedString.Range range = (AnnotatedString.Range) obj;
            if (AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range2 = (AnnotatedString.Range) arrayList.get(i4);
            if (i > range2.getStart() || range2.getEnd() > i2) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new AnnotatedString.Range(range2.getItem(), range2.getStart() - i, range2.getEnd() - i));
        }
        return arrayList2;
    }
}
