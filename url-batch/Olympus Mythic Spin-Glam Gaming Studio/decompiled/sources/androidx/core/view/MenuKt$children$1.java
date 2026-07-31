package androidx.core.view;

import android.view.Menu;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/core/view/MenuKt$children$1", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MenuKt$children$1 implements Sequence {
    final /* synthetic */ Menu $this_children;

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return MenuKt.iterator(this.$this_children);
    }
}
