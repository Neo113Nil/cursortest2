package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;

/* loaded from: classes.dex */
public class RNSScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1937389126:
                if (str.equals("homeIndicatorHidden")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1734097646:
                if (str.equals("hideKeyboardOnSwipe")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1349152186:
                if (str.equals("sheetCornerRadius")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1322084375:
                if (str.equals("navigationBarHidden")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1150711358:
                if (str.equals("stackPresentation")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1047235902:
                if (str.equals("activityState")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -973702878:
                if (str.equals("statusBarColor")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -958765200:
                if (str.equals("statusBarStyle")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -952227806:
                if (str.equals("fullScreenSwipeShadowEnabled")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -577711652:
                if (str.equals("stackAnimation")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -462720700:
                if (str.equals("navigationBarColor")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -381571779:
                if (str.equals("sheetInitialDetent")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -274098190:
                if (str.equals("sheetAllowedDetents")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -257141968:
                if (str.equals("replaceAnimation")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -166356101:
                if (str.equals("preventNativeDismiss")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 17337291:
                if (str.equals("statusBarHidden")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 129956386:
                if (str.equals("fullScreenSwipeEnabled")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 187703999:
                if (str.equals("gestureResponseDistance")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 227582404:
                if (str.equals("screenOrientation")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 241896530:
                if (str.equals("sheetLargestUndimmedDetent")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1082157413:
                if (str.equals("swipeDirection")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1110843912:
                if (str.equals("customAnimationOnSwipe")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1116050554:
                if (str.equals("navigationBarTranslucent")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1269009342:
                if (str.equals("sheetElevation")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1357942638:
                if (str.equals("sheetGrabberVisible")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1387359683:
                if (str.equals("statusBarAnimation")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1729091548:
                if (str.equals("nativeBackButtonDismissalEnabled")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 2097450072:
                if (str.equals("sheetExpandsWhenScrolledToEdge")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ((RNSScreenManagerInterface) this.mViewManager).setHomeIndicatorHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSScreenManagerInterface) this.mViewManager).setGestureEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 2:
                ((RNSScreenManagerInterface) this.mViewManager).setHideKeyboardOnSwipe(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetCornerRadius(t, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 4:
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((RNSScreenManagerInterface) this.mViewManager).setStackPresentation(t, (String) obj);
                break;
            case 7:
                ((RNSScreenManagerInterface) this.mViewManager).setActivityState(t, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case '\b':
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case '\t':
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarStyle(t, obj != null ? (String) obj : null);
                break;
            case '\n':
                ((RNSScreenManagerInterface) this.mViewManager).setFullScreenSwipeShadowEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((RNSScreenManagerInterface) this.mViewManager).setStackAnimation(t, (String) obj);
                break;
            case '\f':
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case '\r':
                ((RNSScreenManagerInterface) this.mViewManager).setSheetInitialDetent(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 14:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetAllowedDetents(t, (ReadableArray) obj);
                break;
            case 15:
                ((RNSScreenManagerInterface) this.mViewManager).setReplaceAnimation(t, (String) obj);
                break;
            case 16:
                ((RNSScreenManagerInterface) this.mViewManager).setPreventNativeDismiss(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 18:
                ((RNSScreenManagerInterface) this.mViewManager).setFullScreenSwipeEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 19:
                ((RNSScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t, (ReadableMap) obj);
                break;
            case 20:
                ((RNSScreenManagerInterface) this.mViewManager).setScreenOrientation(t, obj != null ? (String) obj : null);
                break;
            case 21:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetLargestUndimmedDetent(t, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 22:
                ((RNSScreenManagerInterface) this.mViewManager).setTransitionDuration(t, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case 23:
                ((RNSScreenManagerInterface) this.mViewManager).setSwipeDirection(t, (String) obj);
                break;
            case 24:
                ((RNSScreenManagerInterface) this.mViewManager).setCustomAnimationOnSwipe(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 25:
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 26:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetElevation(t, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case 27:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetGrabberVisible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 28:
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarAnimation(t, obj != null ? (String) obj : null);
                break;
            case 29:
                ((RNSScreenManagerInterface) this.mViewManager).setNativeBackButtonDismissalEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetExpandsWhenScrolledToEdge(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t, str, obj);
                break;
        }
    }
}
