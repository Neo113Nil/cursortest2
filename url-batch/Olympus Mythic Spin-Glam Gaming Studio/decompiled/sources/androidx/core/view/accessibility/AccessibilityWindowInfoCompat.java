package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;

/* loaded from: classes9.dex */
public class AccessibilityWindowInfoCompat {
    private final Object mInfo;

    static AccessibilityWindowInfoCompat wrapNonNullInstance(Object obj) {
        if (obj != null) {
            return new AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    private AccessibilityWindowInfoCompat(Object obj) {
        this.mInfo = obj;
    }

    public int getType() {
        return Api21Impl.getType((AccessibilityWindowInfo) this.mInfo);
    }

    public int getLayer() {
        return Api21Impl.getLayer((AccessibilityWindowInfo) this.mInfo);
    }

    public AccessibilityWindowInfoCompat getParent() {
        return wrapNonNullInstance(Api21Impl.getParent((AccessibilityWindowInfo) this.mInfo));
    }

    public int getId() {
        return Api21Impl.getId((AccessibilityWindowInfo) this.mInfo);
    }

    public void getBoundsInScreen(Rect rect) {
        Api21Impl.getBoundsInScreen((AccessibilityWindowInfo) this.mInfo, rect);
    }

    public boolean isActive() {
        return Api21Impl.isActive((AccessibilityWindowInfo) this.mInfo);
    }

    public boolean isFocused() {
        return Api21Impl.isFocused((AccessibilityWindowInfo) this.mInfo);
    }

    public int getChildCount() {
        return Api21Impl.getChildCount((AccessibilityWindowInfo) this.mInfo);
    }

    public long getTransitionTimeMillis() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getTransitionTimeMillis((AccessibilityWindowInfo) this.mInfo);
        }
        return 0L;
    }

    public LocaleListCompat getLocales() {
        if (Build.VERSION.SDK_INT >= 34) {
            return LocaleListCompat.wrap(Api34Impl.getLocales((AccessibilityWindowInfo) this.mInfo));
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    public int hashCode() {
        Object obj = this.mInfo;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (AccessibilityWindowInfoCompat) obj;
        Object obj2 = this.mInfo;
        if (obj2 == null) {
            return accessibilityWindowInfoCompat.mInfo == null;
        }
        return obj2.equals(accessibilityWindowInfoCompat.mInfo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        getBoundsInScreen(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(getId());
        sb.append(", type=");
        sb.append(typeToString(getType()));
        sb.append(", layer=");
        sb.append(getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(isFocused());
        sb.append(", active=");
        sb.append(isActive());
        sb.append(", hasParent=");
        sb.append(getParent() != null);
        sb.append(", hasChildren=");
        sb.append(getChildCount() > 0);
        sb.append(", transitionTime=");
        sb.append(getTransitionTimeMillis());
        sb.append(", locales=");
        sb.append(getLocales());
        sb.append(']');
        return sb.toString();
    }

    private static String typeToString(int i) {
        if (i == 1) {
            return "TYPE_APPLICATION";
        }
        if (i == 2) {
            return "TYPE_INPUT_METHOD";
        }
        if (i == 3) {
            return "TYPE_SYSTEM";
        }
        if (i == 4) {
            return "TYPE_ACCESSIBILITY_OVERLAY";
        }
        return "<UNKNOWN>";
    }

    @RequiresApi
    private static class Api21Impl {
        @DoNotInline
        static void getBoundsInScreen(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @DoNotInline
        static AccessibilityWindowInfo getChild(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        @DoNotInline
        static int getChildCount(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @DoNotInline
        static int getId(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @DoNotInline
        static int getLayer(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @DoNotInline
        static AccessibilityWindowInfo getParent(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @DoNotInline
        static AccessibilityNodeInfo getRoot(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @DoNotInline
        static int getType(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @DoNotInline
        static boolean isAccessibilityFocused(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @DoNotInline
        static boolean isActive(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @DoNotInline
        static boolean isFocused(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @DoNotInline
        static AccessibilityWindowInfo obtain() {
            return AccessibilityWindowInfo.obtain();
        }

        @DoNotInline
        static AccessibilityWindowInfo obtain(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    @RequiresApi
    private static class Api24Impl {
        @DoNotInline
        static AccessibilityNodeInfo getAnchor(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @DoNotInline
        static CharSequence getTitle(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    @RequiresApi
    private static class Api26Impl {
        @DoNotInline
        static boolean isInPictureInPictureMode(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    @RequiresApi
    private static class Api30Impl {
        @DoNotInline
        static AccessibilityWindowInfo instantiateAccessibilityWindowInfo() {
            return new AccessibilityWindowInfo();
        }
    }

    @RequiresApi
    private static class Api33Impl {
        @DoNotInline
        static int getDisplayId(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @DoNotInline
        static void getRegionInScreen(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @DoNotInline
        public static AccessibilityNodeInfoCompat getRoot(Object obj, int i) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(((AccessibilityWindowInfo) obj).getRoot(i));
        }
    }

    @RequiresApi
    private static class Api34Impl {
        @DoNotInline
        public static long getTransitionTimeMillis(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }

        @DoNotInline
        static LocaleList getLocales(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }
    }
}
