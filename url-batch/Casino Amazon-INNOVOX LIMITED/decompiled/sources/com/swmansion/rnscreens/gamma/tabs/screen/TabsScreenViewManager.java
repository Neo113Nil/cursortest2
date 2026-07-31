package com.swmansion.rnscreens.gamma.tabs.screen;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerDelegate;
import com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface;
import com.swmansion.rnscreens.gamma.helpers.EventHelpersKt;
import com.swmansion.rnscreens.gamma.helpers.ImageLoaderKt;
import com.swmansion.rnscreens.gamma.tabs.appearance.ItemStateAppearance;
import com.swmansion.rnscreens.gamma.tabs.appearance.TabsAppearance;
import com.swmansion.rnscreens.gamma.tabs.screen.event.TabsScreenDidAppearEvent;
import com.swmansion.rnscreens.gamma.tabs.screen.event.TabsScreenDidDisappearEvent;
import com.swmansion.rnscreens.gamma.tabs.screen.event.TabsScreenWillAppearEvent;
import com.swmansion.rnscreens.gamma.tabs.screen.event.TabsScreenWillDisappearEvent;
import com.swmansion.rnscreens.utils.RNSLog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TabsScreenViewManager.kt */
@ReactModule(name = TabsScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000bH\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u001a\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010%\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010&\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010'\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001eH\u0002J\u0014\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010\u001eH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006/"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/screen/TabsScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/tabs/screen/TabsScreen;", "Lcom/facebook/react/viewmanagers/RNSTabsScreenAndroidManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "setContext", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "createViewInstance", "reactContext", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "addEventEmitters", "", "view", "setScreenKey", "value", "setBadgeValue", "setTitle", "setSpecialEffects", "Lcom/facebook/react/bridge/ReadableMap;", "setPreventNativeSelection", "", "setTabBarItemTestID", "setTabBarItemAccessibilityLabel", "setDrawableIconResourceName", "setSelectedDrawableIconResourceName", "setImageIconResource", "setSelectedImageIconResource", "setStandardAppearance", "parseAndroidTabsAppearance", "Lcom/swmansion/rnscreens/gamma/tabs/appearance/TabsAppearance;", "appearance", "parseItemStateAppearance", "Lcom/swmansion/rnscreens/gamma/tabs/appearance/ItemStateAppearance;", "itemStateAppearance", "Companion", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TabsScreenViewManager extends ViewGroupManager<TabsScreen> implements RNSTabsScreenAndroidManagerInterface<TabsScreen> {
    public static final String REACT_CLASS = "RNSTabsScreenAndroid";
    public static final String TAG = "TabsScreenViewManager";
    private ThemedReactContext context;
    private final ViewManagerDelegate<TabsScreen> delegate;

    public TabsScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSTabsScreenAndroidManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public final ThemedReactContext getContext() {
        return this.context;
    }

    public final void setContext(ThemedReactContext themedReactContext) {
        this.context = themedReactContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public TabsScreen createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        RNSLog.INSTANCE.d(REACT_CLASS, "createViewInstance");
        return new TabsScreen(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<TabsScreen> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(EventHelpersKt.makeEventRegistrationInfo(TabsScreenWillAppearEvent.INSTANCE), EventHelpersKt.makeEventRegistrationInfo(TabsScreenDidAppearEvent.INSTANCE), EventHelpersKt.makeEventRegistrationInfo(TabsScreenWillDisappearEvent.INSTANCE), EventHelpersKt.makeEventRegistrationInfo(TabsScreenDidDisappearEvent.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext reactContext, TabsScreen view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, (ThemedReactContext) view);
        view.onViewManagerAddEventEmitters$react_native_screens_release();
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setScreenKey(TabsScreen view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScreenKey(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setBadgeValue(TabsScreen view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBadgeValue(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setTitle(TabsScreen view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabTitle(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setSpecialEffects(TabsScreen view, ReadableMap value) {
        boolean z;
        ReadableMap map;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z2 = true;
        if (!(value != null ? value.hasKey("repeatedTabSelection") : false) || (map = value.getMap("repeatedTabSelection")) == null) {
            z = true;
        } else {
            z = map.hasKey("scrollToTop") ? map.getBoolean("scrollToTop") : true;
            if (map.hasKey("popToRoot")) {
                z2 = map.getBoolean("popToRoot");
            }
        }
        view.setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(z2);
        view.setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(z);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setPreventNativeSelection(TabsScreen view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPreventNativeSelection(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setTabBarItemTestID(TabsScreen view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemTestID(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setTabBarItemAccessibilityLabel(TabsScreen view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemAccessibilityLabel(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setDrawableIconResourceName(TabsScreen view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawableIconResourceName(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setSelectedDrawableIconResourceName(TabsScreen view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSelectedDrawableIconResourceName(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setImageIconResource(final TabsScreen view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string = value != null ? value.getString("uri") : null;
        if (string != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageLoaderKt.loadImage(context, string, new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.screen.TabsScreenViewManager$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit imageIconResource$lambda$1;
                    imageIconResource$lambda$1 = TabsScreenViewManager.setImageIconResource$lambda$1(TabsScreen.this, (Drawable) obj);
                    return imageIconResource$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setImageIconResource$lambda$1(TabsScreen tabsScreen, Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        tabsScreen.setIcon(drawable);
        return Unit.INSTANCE;
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setSelectedImageIconResource(final TabsScreen view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string = value != null ? value.getString("uri") : null;
        if (string != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageLoaderKt.loadImage(context, string, new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.screen.TabsScreenViewManager$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit selectedImageIconResource$lambda$2;
                    selectedImageIconResource$lambda$2 = TabsScreenViewManager.setSelectedImageIconResource$lambda$2(TabsScreen.this, (Drawable) obj);
                    return selectedImageIconResource$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSelectedImageIconResource$lambda$2(TabsScreen tabsScreen, Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        tabsScreen.setSelectedIcon(drawable);
        return Unit.INSTANCE;
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setStandardAppearance(TabsScreen view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            view.setAppearance$react_native_screens_release(null);
        } else {
            view.setAppearance$react_native_screens_release(parseAndroidTabsAppearance(value));
        }
    }

    private final TabsAppearance parseAndroidTabsAppearance(ReadableMap appearance) {
        Integer optionalColor;
        Integer optionalColor2;
        String optionalString;
        Integer optionalColor3;
        Boolean optionalBoolean;
        String optionalString2;
        Float optionalFloat;
        Float optionalFloat2;
        String optionalString3;
        String optionalString4;
        Integer optionalColor4;
        Integer optionalColor5;
        optionalColor = TabsScreenViewManagerKt.getOptionalColor(appearance, "tabBarBackgroundColor");
        optionalColor2 = TabsScreenViewManagerKt.getOptionalColor(appearance, "tabBarItemRippleColor");
        optionalString = TabsScreenViewManagerKt.getOptionalString(appearance, "tabBarItemLabelVisibilityMode");
        ItemStateAppearance parseItemStateAppearance = appearance.hasKey("normal") ? parseItemStateAppearance(appearance.getMap("normal")) : null;
        ItemStateAppearance parseItemStateAppearance2 = appearance.hasKey("selected") ? parseItemStateAppearance(appearance.getMap("selected")) : null;
        ItemStateAppearance parseItemStateAppearance3 = appearance.hasKey("focused") ? parseItemStateAppearance(appearance.getMap("focused")) : null;
        ItemStateAppearance parseItemStateAppearance4 = appearance.hasKey("disabled") ? parseItemStateAppearance(appearance.getMap("disabled")) : null;
        optionalColor3 = TabsScreenViewManagerKt.getOptionalColor(appearance, "tabBarItemActiveIndicatorColor");
        optionalBoolean = TabsScreenViewManagerKt.getOptionalBoolean(appearance, "tabBarItemActiveIndicatorEnabled");
        optionalString2 = TabsScreenViewManagerKt.getOptionalString(appearance, "tabBarItemTitleFontFamily");
        optionalFloat = TabsScreenViewManagerKt.getOptionalFloat(appearance, "tabBarItemTitleSmallLabelFontSize");
        optionalFloat2 = TabsScreenViewManagerKt.getOptionalFloat(appearance, "tabBarItemTitleLargeLabelFontSize");
        optionalString3 = TabsScreenViewManagerKt.getOptionalString(appearance, "tabBarItemTitleFontWeight");
        optionalString4 = TabsScreenViewManagerKt.getOptionalString(appearance, "tabBarItemTitleFontStyle");
        optionalColor4 = TabsScreenViewManagerKt.getOptionalColor(appearance, "tabBarItemBadgeBackgroundColor");
        optionalColor5 = TabsScreenViewManagerKt.getOptionalColor(appearance, "tabBarItemBadgeTextColor");
        return new TabsAppearance(optionalColor, optionalColor2, optionalString, parseItemStateAppearance, parseItemStateAppearance2, parseItemStateAppearance3, parseItemStateAppearance4, optionalColor3, optionalBoolean, optionalString2, optionalFloat, optionalFloat2, optionalString3, optionalString4, optionalColor4, optionalColor5);
    }

    private final ItemStateAppearance parseItemStateAppearance(ReadableMap itemStateAppearance) {
        Integer optionalColor;
        Integer optionalColor2;
        if (itemStateAppearance == null) {
            return null;
        }
        optionalColor = TabsScreenViewManagerKt.getOptionalColor(itemStateAppearance, "tabBarItemIconColor");
        optionalColor2 = TabsScreenViewManagerKt.getOptionalColor(itemStateAppearance, "tabBarItemTitleFontColor");
        return new ItemStateAppearance(optionalColor, optionalColor2);
    }
}
