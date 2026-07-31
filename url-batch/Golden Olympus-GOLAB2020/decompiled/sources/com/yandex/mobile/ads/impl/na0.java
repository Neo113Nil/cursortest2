package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.ea0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class na0 {
    @NotNull
    public static PopupMenu a(@NotNull Context context, @NotNull ImageView view, @NotNull List items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(items, "items");
        PopupMenu popupMenu = new PopupMenu(context, view, 5);
        Menu menu = popupMenu.getMenu();
        Iterator it = items.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            menu.add(0, i4, 0, ((ea0.a) it.next()).a());
            i4++;
        }
        return popupMenu;
    }
}
