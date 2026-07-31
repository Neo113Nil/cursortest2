package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenuItem;

/* loaded from: classes3.dex */
public final class MenuItemCompat {

    @Deprecated
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    public static MenuItem setActionProvider(MenuItem menuItem, ActionProvider actionProvider) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).setSupportActionProvider(actionProvider);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: androidx.core.view.MenuItemCompat$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    class AnonymousClass1 implements MenuItem.OnActionExpandListener {
        final /* synthetic */ OnActionExpandListener val$listener;

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.val$listener.onMenuItemActionExpand(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.val$listener.onMenuItemActionCollapse(menuItem);
        }
    }

    public static void setContentDescription(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setContentDescription(menuItem, charSequence);
        }
    }

    public static void setTooltipText(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setTooltipText(menuItem, charSequence);
        }
    }

    public static void setNumericShortcut(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setNumericShortcut(menuItem, c, i);
        }
    }

    public static void setAlphabeticShortcut(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setAlphabeticShortcut(menuItem, c, i);
        }
    }

    public static void setIconTintList(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setIconTintList(menuItem, colorStateList);
        }
    }

    public static void setIconTintMode(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setIconTintMode(menuItem, mode);
        }
    }

    @RequiresApi
    static class Api26Impl {
        @DoNotInline
        static MenuItem setContentDescription(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @DoNotInline
        static CharSequence getContentDescription(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @DoNotInline
        static MenuItem setTooltipText(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }

        @DoNotInline
        static CharSequence getTooltipText(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @DoNotInline
        static MenuItem setShortcut(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        @DoNotInline
        static MenuItem setNumericShortcut(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        @DoNotInline
        static int getNumericModifiers(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @DoNotInline
        static MenuItem setAlphabeticShortcut(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        @DoNotInline
        static int getAlphabeticModifiers(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @DoNotInline
        static MenuItem setIconTintList(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @DoNotInline
        static ColorStateList getIconTintList(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @DoNotInline
        static MenuItem setIconTintMode(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @DoNotInline
        static PorterDuff.Mode getIconTintMode(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }
    }
}
