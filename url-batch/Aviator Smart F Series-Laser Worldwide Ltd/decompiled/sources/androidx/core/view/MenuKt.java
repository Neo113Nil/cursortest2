package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MenuKt {
    public static final boolean contains(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (kotlin.jvm.internal.s.areEqual(menu.getItem(i8), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, f6.l lVar) {
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            lVar.invoke(menu.getItem(i8));
        }
    }

    public static final void forEachIndexed(Menu menu, f6.p pVar) {
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            pVar.invoke(Integer.valueOf(i8), menu.getItem(i8));
        }
    }

    public static final MenuItem get(Menu menu, int i8) {
        return menu.getItem(i8);
    }

    public static final kotlin.sequences.m getChildren(final Menu menu) {
        return new kotlin.sequences.m() { // from class: androidx.core.view.MenuKt$children$1
            @Override // kotlin.sequences.m
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i8) {
        y5.w wVar;
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
}
