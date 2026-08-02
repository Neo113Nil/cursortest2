package kotlin.io;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ValueElement;
import com.squareup.cash.arcade.treehouse.ChildrenList;
import com.squareup.cash.arcade.treehouse.ChildrenList$reverseIterator$1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UIntArray;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt$sequenceOf$1$1;

/* loaded from: classes9.dex */
public final class LinesSequence implements Sequence {
    public final /* synthetic */ int $r8$classId;
    public final Object reader;

    public LinesSequence() {
        this.$r8$classId = 1;
        this.reader = new ArrayList();
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i = this.$r8$classId;
        Object obj = this.reader;
        switch (i) {
            case 0:
                return new LinesSequence$iterator$1(this);
            case 1:
                return ((ArrayList) obj).iterator();
            case 2:
                return new ChildrenList$reverseIterator$1((ChildrenList) obj);
            case 3:
                ViewGroup viewGroup = (ViewGroup) obj;
                viewGroup.getClass();
                return new UIntArray.Iterator(viewGroup, 2);
            case 4:
                return ArrayIteratorKt.iterator((Object[]) obj);
            case 5:
                return (Iterator) obj;
            default:
                return new SequencesKt__SequencesKt$sequenceOf$1$1(obj, 0);
        }
    }

    public void set(Object obj, String str) {
        ((ArrayList) this.reader).add(new ValueElement(str, obj));
    }

    public /* synthetic */ LinesSequence(Object obj, int i) {
        this.$r8$classId = i;
        this.reader = obj;
    }
}
