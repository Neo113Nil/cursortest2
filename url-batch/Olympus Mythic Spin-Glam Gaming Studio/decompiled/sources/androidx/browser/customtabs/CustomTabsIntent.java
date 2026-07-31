package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Dimension;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import com.safedk.android.utils.Logger;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class CustomTabsIntent {
    public static final int ACTIVITY_HEIGHT_ADJUSTABLE = 1;
    public static final int ACTIVITY_HEIGHT_DEFAULT = 0;
    public static final int ACTIVITY_HEIGHT_FIXED = 2;
    private static final int ACTIVITY_HEIGHT_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DIVIDER = 3;
    private static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_MAX = 3;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_SHADOW = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_END = 2;
    private static final int ACTIVITY_SIDE_SHEET_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_START = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_DEFAULT = 0;
    private static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_TOP = 2;
    public static final int CLOSE_BUTTON_POSITION_DEFAULT = 0;
    public static final int CLOSE_BUTTON_POSITION_END = 2;
    private static final int CLOSE_BUTTON_POSITION_MAX = 2;
    public static final int CLOSE_BUTTON_POSITION_START = 1;
    public static final int COLOR_SCHEME_DARK = 2;
    public static final int COLOR_SCHEME_LIGHT = 1;
    private static final int COLOR_SCHEME_MAX = 2;
    public static final int COLOR_SCHEME_SYSTEM = 0;
    public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final String EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";
    public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final String EXTRA_CLOSE_BUTTON_POSITION = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    @Deprecated
    public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String EXTRA_DISABLE_BACKGROUND_INTERACTION = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";
    public static final String EXTRA_DISABLE_BOOKMARKS_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";
    public static final String EXTRA_DISABLE_DOWNLOAD_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";
    public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final String EXTRA_INITIAL_ACTIVITY_HEIGHT_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final String EXTRA_INITIAL_ACTIVITY_WIDTH_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";
    public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";
    public static final String EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";
    public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";

    @RestrictTo
    public static final String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
    public static final String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
    public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final String EXTRA_TOOLBAR_CORNER_RADIUS_DP = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String EXTRA_TRANSLATE_LANGUAGE_TAG = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";
    private static final String EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS = "android.support.customtabs.extra.user_opt_out";
    private static final String HTTP_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    private static final int MAX_TOOLBAR_CORNER_RADIUS_DP = 16;
    private static final int MAX_TOOLBAR_ITEMS = 5;
    public static final int NO_TITLE = 0;
    public static final int SHARE_STATE_DEFAULT = 0;
    private static final int SHARE_STATE_MAX = 2;
    public static final int SHARE_STATE_OFF = 2;
    public static final int SHARE_STATE_ON = 1;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID = 0;

    @NonNull
    public final Intent intent;

    @Nullable
    public final Bundle startAnimationBundle;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ActivityHeightResizeBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ActivitySideSheetDecorationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ActivitySideSheetPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CloseButtonPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ColorScheme {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShareState {
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    public static void safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(Context p0, Intent p1, Bundle p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V");
        if (p1 == null) {
            return;
        }
        ContextCompat.startActivity(p0, p1, p2);
    }

    public void launchUrl(@NonNull Context context, @NonNull Uri uri) {
        this.intent.setData(uri);
        safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(context, this.intent, this.startAnimationBundle);
    }

    CustomTabsIntent(@NonNull Intent intent, @Nullable Bundle bundle) {
        this.intent = intent;
        this.startAnimationBundle = bundle;
    }

    public static final class Builder {
        private ArrayList mActionButtons;
        private ActivityOptions mActivityOptions;
        private SparseArray mColorSchemeParamBundles;
        private Bundle mDefaultColorSchemeBundle;
        private ArrayList mMenuItems;
        private boolean mShareIdentity;
        private final Intent mIntent = new Intent("android.intent.action.VIEW");
        private final CustomTabColorSchemeParams.Builder mDefaultColorSchemeBuilder = new CustomTabColorSchemeParams.Builder();
        private int mShareState = 0;
        private boolean mInstantAppsEnabled = true;

        public Builder() {
        }

        public Builder(CustomTabsSession customTabsSession) {
            if (customTabsSession != null) {
                setSession(customTabsSession);
            }
        }

        public Builder setSession(CustomTabsSession customTabsSession) {
            this.mIntent.setPackage(customTabsSession.getComponentName().getPackageName());
            setSessionParameters(customTabsSession.getBinder(), customTabsSession.getId());
            return this;
        }

        private void setSessionParameters(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
            }
            this.mIntent.putExtras(bundle);
        }

        public Builder setToolbarColor(int i) {
            this.mDefaultColorSchemeBuilder.setToolbarColor(i);
            return this;
        }

        public Builder setUrlBarHidingEnabled(boolean z) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, z);
            return this;
        }

        public Builder setCloseButtonIcon(Bitmap bitmap) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_CLOSE_BUTTON_ICON, bitmap);
            return this;
        }

        public Builder setShowTitle(boolean z) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_TITLE_VISIBILITY_STATE, z ? 1 : 0);
            return this;
        }

        public Builder setShareState(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.mShareState = i;
            if (i == 1) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, true);
            } else if (i == 2) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, false);
            } else {
                this.mIntent.removeExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM);
            }
            return this;
        }

        public Builder setSecondaryToolbarColor(int i) {
            this.mDefaultColorSchemeBuilder.setSecondaryToolbarColor(i);
            return this;
        }

        public Builder setInstantAppsEnabled(boolean z) {
            this.mInstantAppsEnabled = z;
            return this;
        }

        public Builder setStartAnimations(Context context, int i, int i2) {
            this.mActivityOptions = ActivityOptions.makeCustomAnimation(context, i, i2);
            return this;
        }

        public Builder setExitAnimations(Context context, int i, int i2) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_EXIT_ANIMATION_BUNDLE, ActivityOptionsCompat.makeCustomAnimation(context, i, i2).toBundle());
            return this;
        }

        public Builder setColorSchemeParams(int i, CustomTabColorSchemeParams customTabColorSchemeParams) {
            if (i < 0 || i > 2 || i == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i);
            }
            if (this.mColorSchemeParamBundles == null) {
                this.mColorSchemeParamBundles = new SparseArray();
            }
            this.mColorSchemeParamBundles.put(i, customTabColorSchemeParams.toBundle());
            return this;
        }

        public Builder setDefaultColorSchemeParams(CustomTabColorSchemeParams customTabColorSchemeParams) {
            this.mDefaultColorSchemeBundle = customTabColorSchemeParams.toBundle();
            return this;
        }

        public Builder setInitialActivityHeightPx(int i, int i2) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i2 < 0 || i2 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, i);
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, i2);
            return this;
        }

        public Builder setInitialActivityHeightPx(int i) {
            return setInitialActivityHeightPx(i, 0);
        }

        public Builder setInitialActivityWidthPx(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_WIDTH_PX, i);
            return this;
        }

        public Builder setActivitySideSheetBreakpointDp(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, i);
            return this;
        }

        public Builder setCloseButtonPosition(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_CLOSE_BUTTON_POSITION, i);
            return this;
        }

        public Builder setBookmarksButtonEnabled(boolean z) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_DISABLE_BOOKMARKS_BUTTON, !z);
            return this;
        }

        public Builder setDownloadButtonEnabled(boolean z) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_DISABLE_DOWNLOAD_BUTTON, !z);
            return this;
        }

        public CustomTabsIntent build() {
            if (!this.mIntent.hasExtra(CustomTabsIntent.EXTRA_SESSION)) {
                setSessionParameters(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.mMenuItems;
            if (arrayList != null) {
                this.mIntent.putParcelableArrayListExtra(CustomTabsIntent.EXTRA_MENU_ITEMS, arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.mActionButtons;
            if (arrayList2 != null) {
                this.mIntent.putParcelableArrayListExtra(CustomTabsIntent.EXTRA_TOOLBAR_ITEMS, arrayList2);
            }
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_ENABLE_INSTANT_APPS, this.mInstantAppsEnabled);
            this.mIntent.putExtras(this.mDefaultColorSchemeBuilder.build().toBundle());
            Bundle bundle = this.mDefaultColorSchemeBundle;
            if (bundle != null) {
                this.mIntent.putExtras(bundle);
            }
            if (this.mColorSchemeParamBundles != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(CustomTabsIntent.EXTRA_COLOR_SCHEME_PARAMS, this.mColorSchemeParamBundles);
                this.mIntent.putExtras(bundle2);
            }
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_SHARE_STATE, this.mShareState);
            int i = Build.VERSION.SDK_INT;
            setCurrentLocaleAsDefaultAcceptLanguage();
            if (i >= 34) {
                setShareIdentityEnabled();
            }
            ActivityOptions activityOptions = this.mActivityOptions;
            return new CustomTabsIntent(this.mIntent, activityOptions != null ? activityOptions.toBundle() : null);
        }

        private void setCurrentLocaleAsDefaultAcceptLanguage() {
            String defaultLocale = Api24Impl.getDefaultLocale();
            if (TextUtils.isEmpty(defaultLocale)) {
                return;
            }
            Bundle bundleExtra = this.mIntent.hasExtra("com.android.browser.headers") ? this.mIntent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey(CustomTabsIntent.HTTP_ACCEPT_LANGUAGE)) {
                return;
            }
            bundleExtra.putString(CustomTabsIntent.HTTP_ACCEPT_LANGUAGE, defaultLocale);
            this.mIntent.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void setShareIdentityEnabled() {
            if (this.mActivityOptions == null) {
                this.mActivityOptions = Api23Impl.makeBasicActivityOptions();
            }
            Api34Impl.setShareIdentityEnabled(this.mActivityOptions, this.mShareIdentity);
        }
    }

    @NonNull
    public static Intent setAlwaysUseBrowserUI(@Nullable Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(@NonNull Intent intent) {
        return intent.getBooleanExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, false) && (intent.getFlags() & 268435456) != 0;
    }

    @NonNull
    public static CustomTabColorSchemeParams getColorSchemeParams(@NonNull Intent intent, int i) {
        Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            throw new IllegalArgumentException("Invalid colorScheme: " + i);
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return CustomTabColorSchemeParams.fromBundle(null);
        }
        CustomTabColorSchemeParams fromBundle = CustomTabColorSchemeParams.fromBundle(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(EXTRA_COLOR_SCHEME_PARAMS);
        return (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i)) == null) ? fromBundle : CustomTabColorSchemeParams.fromBundle(bundle).withDefaults(fromBundle);
    }

    public static int getActivityResizeBehavior(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, 0);
    }

    @Dimension
    public static int getInitialActivityHeightPx(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, 0);
    }

    @Dimension
    public static int getInitialActivityWidthPx(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_WIDTH_PX, 0);
    }

    @Dimension
    public static int getActivitySideSheetBreakpointDp(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, 0);
    }

    public static boolean isActivitySideSheetMaximizationEnabled(@NonNull Intent intent) {
        return intent.getBooleanExtra(EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION, false);
    }

    public static int getActivitySideSheetPosition(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_POSITION, 0);
    }

    public static int getActivitySideSheetDecorationType(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE, 0);
    }

    public static int getActivitySideSheetRoundedCornersPosition(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION, 0);
    }

    @Dimension
    public static int getToolbarCornerRadiusDp(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_TOOLBAR_CORNER_RADIUS_DP, 16);
    }

    public static int getCloseButtonPosition(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_CLOSE_BUTTON_POSITION, 0);
    }

    public static boolean isBookmarksButtonEnabled(@NonNull Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BOOKMARKS_BUTTON, false);
    }

    public static boolean isDownloadButtonEnabled(@NonNull Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_DOWNLOAD_BUTTON, false);
    }

    public static boolean isSendToExternalDefaultHandlerEnabled(@NonNull Intent intent) {
        return intent.getBooleanExtra(EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER, false);
    }

    @Nullable
    public static Locale getTranslateLocale(@NonNull Intent intent) {
        return getLocaleForLanguageTag(intent);
    }

    @Nullable
    @RequiresApi
    private static Locale getLocaleForLanguageTag(Intent intent) {
        return Api21Impl.getLocaleForLanguageTag(intent);
    }

    public static boolean isBackgroundInteractionEnabled(@NonNull Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BACKGROUND_INTERACTION, false);
    }

    @Nullable
    public static PendingIntent getSecondaryToolbarSwipeUpGesture(@NonNull Intent intent) {
        return (PendingIntent) intent.getParcelableExtra(EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE);
    }

    @RequiresApi
    private static class Api21Impl {
        @DoNotInline
        static void setLanguageTag(Intent intent, Locale locale) {
            intent.putExtra(CustomTabsIntent.EXTRA_TRANSLATE_LANGUAGE_TAG, locale.toLanguageTag());
        }

        @Nullable
        @DoNotInline
        static Locale getLocaleForLanguageTag(Intent intent) {
            String stringExtra = intent.getStringExtra(CustomTabsIntent.EXTRA_TRANSLATE_LANGUAGE_TAG);
            if (stringExtra != null) {
                return Locale.forLanguageTag(stringExtra);
            }
            return null;
        }
    }

    @RequiresApi
    private static class Api23Impl {
        @DoNotInline
        static ActivityOptions makeBasicActivityOptions() {
            return ActivityOptions.makeBasic();
        }
    }

    @RequiresApi
    private static class Api24Impl {
        @Nullable
        @DoNotInline
        static String getDefaultLocale() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    @RequiresApi
    private static class Api34Impl {
        @DoNotInline
        static void setShareIdentityEnabled(ActivityOptions activityOptions, boolean z) {
            activityOptions.setShareIdentityEnabled(z);
        }
    }
}
