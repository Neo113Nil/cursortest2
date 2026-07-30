package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, g6.d {
    final /* synthetic */ Menu $this_iterator;
    private int index;

    MenuKt$iterator$1(Menu menu) {
        this.$this_iterator = menu;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_iterator.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        y5.w wVar;
        Menu menu = this.$this_iterator;
        int i8 = this.index - 1;
        this.index = i8;
        MenuItem item = menu.getItem(i8);
        if (item != null) {
            menu.removeItem(item.getItemId());
            wVar = y5.w.INSTANCE;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public MenuItem next() {
        Menu menu = this.$this_iterator;
        int i8 = this.index;
        this.index = i8 + 1;
        MenuItem item = menu.getItem(i8);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }
}
