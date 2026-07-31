package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;

@RestrictTo
/* loaded from: classes5.dex */
public interface MenuItemHoverListener {
    void onItemHoverEnter(MenuBuilder menuBuilder, MenuItem menuItem);

    void onItemHoverExit(MenuBuilder menuBuilder, MenuItem menuItem);
}
