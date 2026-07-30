package me.yokeyword.fragmentation.helper.internal;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class b {
    public ArrayList<a> sharedElementList;
    public String tag;
    public int targetFragmentEnter = Integer.MIN_VALUE;
    public int currentFragmentPopExit = Integer.MIN_VALUE;
    public int currentFragmentPopEnter = Integer.MIN_VALUE;
    public int targetFragmentExit = Integer.MIN_VALUE;
    public boolean dontAddToBackStack = false;

    public static class a {
        public View sharedElement;
        public String sharedName;

        public a(View view, String str) {
            this.sharedElement = view;
            this.sharedName = str;
        }
    }
}
