package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.MenuKt;
import androidx.core.view.ViewGroupKt;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.PixelUtil;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: TabsHostAppearanceApplicator.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceApplicator;", "", "context", "Landroidx/appcompat/view/ContextThemeWrapper;", "bottomNavigationView", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "<init>", "(Landroidx/appcompat/view/ContextThemeWrapper;Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V", "resolveColorAttr", "", "attr", "updateSharedAppearance", "", "tabsHost", "Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;", "updateFontStyles", "updateMenuItemAppearance", "menuItem", "Landroid/view/MenuItem;", "tabScreen", "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;", "updateBadgeAppearance", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TabsHostAppearanceApplicator {
    private final BottomNavigationView bottomNavigationView;
    private final ContextThemeWrapper context;

    public TabsHostAppearanceApplicator(ContextThemeWrapper context, BottomNavigationView bottomNavigationView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        this.context = context;
        this.bottomNavigationView = bottomNavigationView;
    }

    private final int resolveColorAttr(int attr) {
        TypedValue typedValue = new TypedValue();
        this.context.getTheme().resolveAttribute(attr, typedValue, true);
        return typedValue.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        if (r0.equals("selected") != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateSharedAppearance(TabsHost tabsHost) {
        Intrinsics.checkNotNullParameter(tabsHost, "tabsHost");
        int i = 0;
        this.bottomNavigationView.setVisibility(0);
        BottomNavigationView bottomNavigationView = this.bottomNavigationView;
        Integer tabBarBackgroundColor = tabsHost.getTabBarBackgroundColor();
        bottomNavigationView.setBackgroundColor(tabBarBackgroundColor != null ? tabBarBackgroundColor.intValue() : resolveColorAttr(R.attr.colorSurfaceContainer));
        int[][] iArr = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
        Integer tabBarItemTitleFontColor = tabsHost.getTabBarItemTitleFontColor();
        int intValue = tabBarItemTitleFontColor != null ? tabBarItemTitleFontColor.intValue() : resolveColorAttr(R.attr.colorOnSurfaceVariant);
        Integer tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColorActive();
        this.bottomNavigationView.setItemTextColor(new ColorStateList(iArr, new int[]{intValue, (tabBarItemTitleFontColorActive == null && (tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColor()) == null) ? resolveColorAttr(R.attr.colorSecondary) : tabBarItemTitleFontColorActive.intValue()}));
        Integer tabBarItemIconColor = tabsHost.getTabBarItemIconColor();
        int intValue2 = tabBarItemIconColor != null ? tabBarItemIconColor.intValue() : resolveColorAttr(R.attr.colorOnSurfaceVariant);
        Integer tabBarItemIconColorActive = tabsHost.getTabBarItemIconColorActive();
        this.bottomNavigationView.setItemIconTintList(new ColorStateList(iArr, new int[]{intValue2, (tabBarItemIconColorActive == null && (tabBarItemIconColorActive = tabsHost.getTabBarItemIconColor()) == null) ? resolveColorAttr(R.attr.colorOnSecondaryContainer) : tabBarItemIconColorActive.intValue()}));
        String tabBarItemLabelVisibilityMode = tabsHost.getTabBarItemLabelVisibilityMode();
        if (tabBarItemLabelVisibilityMode != null) {
            int hashCode = tabBarItemLabelVisibilityMode.hashCode();
            if (hashCode != -63201645) {
                if (hashCode != 1191572123) {
                    if (hashCode == 1648599514 && tabBarItemLabelVisibilityMode.equals("unlabeled")) {
                        i = 2;
                    }
                }
            } else if (tabBarItemLabelVisibilityMode.equals("labeled")) {
                i = 1;
            }
            this.bottomNavigationView.setLabelVisibilityMode(i);
            Integer tabBarItemRippleColor = tabsHost.getTabBarItemRippleColor();
            this.bottomNavigationView.setItemRippleColor(ColorStateList.valueOf(tabBarItemRippleColor == null ? tabBarItemRippleColor.intValue() : resolveColorAttr(R.attr.itemRippleColor)));
            Integer tabBarItemActiveIndicatorColor = tabsHost.getTabBarItemActiveIndicatorColor();
            int intValue3 = tabBarItemActiveIndicatorColor == null ? tabBarItemActiveIndicatorColor.intValue() : resolveColorAttr(R.attr.colorSecondaryContainer);
            this.bottomNavigationView.setItemActiveIndicatorEnabled(tabsHost.isTabBarItemActiveIndicatorEnabled());
            this.bottomNavigationView.setItemActiveIndicatorColor(ColorStateList.valueOf(intValue3));
        }
        i = -1;
        this.bottomNavigationView.setLabelVisibilityMode(i);
        Integer tabBarItemRippleColor2 = tabsHost.getTabBarItemRippleColor();
        this.bottomNavigationView.setItemRippleColor(ColorStateList.valueOf(tabBarItemRippleColor2 == null ? tabBarItemRippleColor2.intValue() : resolveColorAttr(R.attr.itemRippleColor)));
        Integer tabBarItemActiveIndicatorColor2 = tabsHost.getTabBarItemActiveIndicatorColor();
        if (tabBarItemActiveIndicatorColor2 == null) {
        }
        this.bottomNavigationView.setItemActiveIndicatorEnabled(tabsHost.isTabBarItemActiveIndicatorEnabled());
        this.bottomNavigationView.setItemActiveIndicatorColor(ColorStateList.valueOf(intValue3));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateFontStyles(TabsHost tabsHost) {
        int intValue;
        Integer intOrNull;
        float dimension;
        Float tabBarItemTitleFontSizeActive;
        float dimension2;
        Intrinsics.checkNotNullParameter(tabsHost, "tabsHost");
        View childAt = this.bottomNavigationView.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view : ViewGroupKt.getChildren((ViewGroup) childAt)) {
            TextView textView = (TextView) view.findViewById(R.id.navigation_bar_item_large_label_view);
            TextView textView2 = (TextView) view.findViewById(R.id.navigation_bar_item_small_label_view);
            boolean areEqual = Intrinsics.areEqual(tabsHost.getTabBarItemTitleFontStyle(), "italic");
            if (Intrinsics.areEqual(tabsHost.getTabBarItemTitleFontWeight(), "bold")) {
                intValue = ReactFontManager.TypefaceStyle.BOLD;
            } else {
                String tabBarItemTitleFontWeight = tabsHost.getTabBarItemTitleFontWeight();
                intValue = (tabBarItemTitleFontWeight == null || (intOrNull = StringsKt.toIntOrNull(tabBarItemTitleFontWeight)) == null) ? 400 : intOrNull.intValue();
            }
            ReactFontManager companion = ReactFontManager.INSTANCE.getInstance();
            String tabBarItemTitleFontFamily = tabsHost.getTabBarItemTitleFontFamily();
            if (tabBarItemTitleFontFamily == null) {
                tabBarItemTitleFontFamily = "";
            }
            Typeface typeface = companion.getTypeface(tabBarItemTitleFontFamily, intValue, areEqual, this.context.getAssets());
            Float tabBarItemTitleFontSize = tabsHost.getTabBarItemTitleFontSize();
            if (tabBarItemTitleFontSize != null) {
                if (tabBarItemTitleFontSize.floatValue() <= 0.0f) {
                    tabBarItemTitleFontSize = null;
                }
                if (tabBarItemTitleFontSize != null) {
                    dimension = PixelUtil.toPixelFromSP$default(tabBarItemTitleFontSize.floatValue(), 0.0f, 2, null);
                    tabBarItemTitleFontSizeActive = tabsHost.getTabBarItemTitleFontSizeActive();
                    if (tabBarItemTitleFontSizeActive != null) {
                        if (tabBarItemTitleFontSizeActive.floatValue() <= 0.0f) {
                            tabBarItemTitleFontSizeActive = null;
                        }
                        if (tabBarItemTitleFontSizeActive != null) {
                            dimension2 = PixelUtil.toPixelFromSP$default(tabBarItemTitleFontSizeActive.floatValue(), 0.0f, 2, null);
                            textView2.setTextSize(0, dimension);
                            textView2.setTypeface(typeface);
                            textView.setTextSize(0, dimension2);
                            textView.setTypeface(typeface);
                        }
                    }
                    dimension2 = this.context.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
                    textView2.setTextSize(0, dimension);
                    textView2.setTypeface(typeface);
                    textView.setTextSize(0, dimension2);
                    textView.setTypeface(typeface);
                }
            }
            dimension = this.context.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
            tabBarItemTitleFontSizeActive = tabsHost.getTabBarItemTitleFontSizeActive();
            if (tabBarItemTitleFontSizeActive != null) {
            }
            dimension2 = this.context.getResources().getDimension(R.dimen.design_bottom_navigation_text_size);
            textView2.setTextSize(0, dimension);
            textView2.setTypeface(typeface);
            textView.setTextSize(0, dimension2);
            textView.setTypeface(typeface);
        }
    }

    public final void updateMenuItemAppearance(MenuItem menuItem, TabScreen tabScreen) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        if (!Intrinsics.areEqual(menuItem.getTitle(), tabScreen.getTabTitle())) {
            menuItem.setTitle(tabScreen.getTabTitle());
        }
        if (Intrinsics.areEqual(menuItem.getIcon(), tabScreen.getIcon())) {
            return;
        }
        menuItem.setIcon(tabScreen.getIcon());
    }

    public final void updateBadgeAppearance(MenuItem menuItem, TabScreen tabScreen) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        Menu menu = this.bottomNavigationView.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        int indexOf = SequencesKt.indexOf(MenuKt.getChildren(menu), menuItem);
        String badgeValue = tabScreen.getBadgeValue();
        if (badgeValue == null) {
            BadgeDrawable badge = this.bottomNavigationView.getBadge(indexOf);
            if (badge != null) {
                badge.setVisible(false);
                return;
            }
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull(badgeValue);
        BadgeDrawable orCreateBadge = this.bottomNavigationView.getOrCreateBadge(indexOf);
        Intrinsics.checkNotNullExpressionValue(orCreateBadge, "getOrCreateBadge(...)");
        orCreateBadge.setVisible(true);
        orCreateBadge.clearText();
        orCreateBadge.clearNumber();
        if (intOrNull != null) {
            orCreateBadge.setNumber(intOrNull.intValue());
        } else if (!Intrinsics.areEqual(badgeValue, "")) {
            orCreateBadge.setText(badgeValue);
        }
        Integer tabBarItemBadgeTextColor = tabScreen.getTabBarItemBadgeTextColor();
        orCreateBadge.setBadgeTextColor(tabBarItemBadgeTextColor != null ? tabBarItemBadgeTextColor.intValue() : resolveColorAttr(R.attr.colorOnError));
        Integer tabBarItemBadgeBackgroundColor = tabScreen.getTabBarItemBadgeBackgroundColor();
        orCreateBadge.setBackgroundColor(tabBarItemBadgeBackgroundColor != null ? tabBarItemBadgeBackgroundColor.intValue() : resolveColorAttr(androidx.appcompat.R.attr.colorError));
    }
}
