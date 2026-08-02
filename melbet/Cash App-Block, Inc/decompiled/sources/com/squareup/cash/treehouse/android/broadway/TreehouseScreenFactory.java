package com.squareup.cash.treehouse.android.broadway;

import app.cash.broadway.screen.Screen;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class TreehouseScreenFactory {
    public final Set mappers;

    public TreehouseScreenFactory(Set set) {
        this.mappers = set;
    }

    public static Screen create$default(TreehouseScreenFactory treehouseScreenFactory, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        str.getClass();
        str2.getClass();
        Screen screen = null;
        TreehouseScreen treehouseScreen = new TreehouseScreen(str, str2, null, false);
        Iterator it = treehouseScreenFactory.mappers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Screen map = ((TreehouseScreenMapper) it.next()).map(treehouseScreen);
            if (map != null) {
                screen = map;
                break;
            }
        }
        return screen == null ? treehouseScreen : screen;
    }
}
