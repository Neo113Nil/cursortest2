package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSModalScreenManagerInterface;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public class RNSModalScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSModalScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSModalScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2035671681:
                if (str.equals("synchronousShadowStateUpdatesEnabled")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1991728986:
                if (str.equals("bottomScrollEdgeEffect")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1937389126:
                if (str.equals("homeIndicatorHidden")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1871891504:
                if (str.equals("topScrollEdgeEffect")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1791070590:
                if (str.equals("leftScrollEdgeEffect")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1734097646:
                if (str.equals("hideKeyboardOnSwipe")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1628518761:
                if (str.equals("rightScrollEdgeEffect")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1349152186:
                if (str.equals("sheetCornerRadius")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1322084375:
                if (str.equals("navigationBarHidden")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1150711358:
                if (str.equals("stackPresentation")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1047235902:
                if (str.equals("activityState")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -973702878:
                if (str.equals("statusBarColor")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -958765200:
                if (str.equals("statusBarStyle")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -952227806:
                if (str.equals("fullScreenSwipeShadowEnabled")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -577711652:
                if (str.equals("stackAnimation")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -462720700:
                if (str.equals("navigationBarColor")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -411607385:
                if (str.equals("screenId")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -381571779:
                if (str.equals("sheetInitialDetent")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -274098190:
                if (str.equals("sheetAllowedDetents")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -257141968:
                if (str.equals("replaceAnimation")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -166356101:
                if (str.equals("preventNativeDismiss")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 17337291:
                if (str.equals("statusBarHidden")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 129956386:
                if (str.equals("fullScreenSwipeEnabled")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 187703999:
                if (str.equals("gestureResponseDistance")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 227582404:
                if (str.equals("screenOrientation")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 241896530:
                if (str.equals("sheetLargestUndimmedDetent")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 658632444:
                if (str.equals("sheetShouldOverflowTopInset")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1082157413:
                if (str.equals("swipeDirection")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1110843912:
                if (str.equals("customAnimationOnSwipe")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1116050554:
                if (str.equals("navigationBarTranslucent")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1269009342:
                if (str.equals("sheetElevation")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1287164531:
                if (str.equals("sheetDefaultResizeAnimationEnabled")) {
                    c = Typography.quote;
                    break;
                }
                c = 65535;
                break;
            case 1357942638:
                if (str.equals("sheetGrabberVisible")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1387359683:
                if (str.equals("statusBarAnimation")) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case 1729091548:
                if (str.equals("nativeBackButtonDismissalEnabled")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 2097450072:
                if (str.equals("sheetExpandsWhenScrolledToEdge")) {
                    c = Typography.amp;
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
                ((RNSModalScreenManagerInterface) this.mViewManager).setSynchronousShadowStateUpdatesEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSModalScreenManagerInterface) this.mViewManager).setBottomScrollEdgeEffect(t, (String) obj);
                break;
            case 2:
                ((RNSModalScreenManagerInterface) this.mViewManager).setHomeIndicatorHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNSModalScreenManagerInterface) this.mViewManager).setTopScrollEdgeEffect(t, (String) obj);
                break;
            case 4:
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 5:
                ((RNSModalScreenManagerInterface) this.mViewManager).setLeftScrollEdgeEffect(t, (String) obj);
                break;
            case 6:
                ((RNSModalScreenManagerInterface) this.mViewManager).setHideKeyboardOnSwipe(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((RNSModalScreenManagerInterface) this.mViewManager).setRightScrollEdgeEffect(t, (String) obj);
                break;
            case '\b':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetCornerRadius(t, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case '\t':
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\n':
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackPresentation(t, (String) obj);
                break;
            case '\f':
                ((RNSModalScreenManagerInterface) this.mViewManager).setActivityState(t, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case '\r':
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 14:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarStyle(t, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeShadowEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 16:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackAnimation(t, (String) obj);
                break;
            case 17:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 18:
                ((RNSModalScreenManagerInterface) this.mViewManager).setScreenId(t, obj == null ? "" : (String) obj);
                break;
            case 19:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetInitialDetent(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 20:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetAllowedDetents(t, (ReadableArray) obj);
                break;
            case 21:
                ((RNSModalScreenManagerInterface) this.mViewManager).setReplaceAnimation(t, (String) obj);
                break;
            case 22:
                ((RNSModalScreenManagerInterface) this.mViewManager).setPreventNativeDismiss(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 23:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 24:
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeEnabled(t, (String) obj);
                break;
            case 25:
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t, (ReadableMap) obj);
                break;
            case 26:
                ((RNSModalScreenManagerInterface) this.mViewManager).setScreenOrientation(t, obj != null ? (String) obj : null);
                break;
            case 27:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetLargestUndimmedDetent(t, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 28:
                ((RNSModalScreenManagerInterface) this.mViewManager).setTransitionDuration(t, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case 29:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetShouldOverflowTopInset(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSwipeDirection(t, (String) obj);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                ((RNSModalScreenManagerInterface) this.mViewManager).setCustomAnimationOnSwipe(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ' ':
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarTranslucent(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '!':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetElevation(t, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case '\"':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetDefaultResizeAnimationEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '#':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetGrabberVisible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '$':
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarAnimation(t, obj != null ? (String) obj : null);
                break;
            case '%':
                ((RNSModalScreenManagerInterface) this.mViewManager).setNativeBackButtonDismissalEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '&':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetExpandsWhenScrolledToEdge(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
