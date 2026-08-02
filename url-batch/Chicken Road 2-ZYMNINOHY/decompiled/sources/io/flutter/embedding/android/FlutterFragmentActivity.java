package io.flutter.embedding.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.C0193a;
import androidx.fragment.app.K;
import androidx.fragment.app.f0;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlutterFragmentActivity extends K implements FlutterEngineProvider, FlutterEngineConfigurator {
    public static final int FRAGMENT_CONTAINER_ID = View.generateViewId();
    private static final String TAG = "FlutterFragmentActivity";
    private static final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";
    private FlutterFragment flutterFragment;

    public static class CachedEngineIntentBuilder {
        private final Class<? extends FlutterFragmentActivity> activityClass;
        private final String cachedEngineId;
        private boolean destroyEngineWithActivity = false;
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public CachedEngineIntentBuilder(Class<? extends FlutterFragmentActivity> cls, String str) {
            this.activityClass = cls;
            this.cachedEngineId = str;
        }

        public CachedEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public Intent build(Context context) {
            return new Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode);
        }

        public CachedEngineIntentBuilder destroyEngineWithActivity(boolean z) {
            this.destroyEngineWithActivity = z;
            return this;
        }
    }

    public static class NewEngineInGroupIntentBuilder {
        private final Class<? extends FlutterFragmentActivity> activityClass;
        private final String cachedEngineGroupId;
        private String dartEntrypoint = "main";
        private String initialRoute = "/";
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineInGroupIntentBuilder(Class<? extends FlutterFragmentActivity> cls, String str) {
            this.activityClass = cls;
            this.cachedEngineGroupId = str;
        }

        public NewEngineInGroupIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public Intent build(Context context) {
            return new Intent(context, this.activityClass).putExtra("dart_entrypoint", this.dartEntrypoint).putExtra("route", this.initialRoute).putExtra("cached_engine_group_id", this.cachedEngineGroupId).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
        }

        public NewEngineInGroupIntentBuilder dartEntrypoint(String str) {
            this.dartEntrypoint = str;
            return this;
        }

        public NewEngineInGroupIntentBuilder initialRoute(String str) {
            this.initialRoute = str;
            return this;
        }
    }

    public static class NewEngineIntentBuilder {
        private final Class<? extends FlutterFragmentActivity> activityClass;
        private List<String> dartEntrypointArgs;
        private String initialRoute = "/";
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineIntentBuilder(Class<? extends FlutterFragmentActivity> cls) {
            this.activityClass = cls;
        }

        public NewEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public Intent build(Context context) {
            Intent putExtra = new Intent(context, this.activityClass).putExtra("route", this.initialRoute).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
            if (this.dartEntrypointArgs != null) {
                putExtra.putExtra("dart_entrypoint_args", new ArrayList(this.dartEntrypointArgs));
            }
            return putExtra;
        }

        public NewEngineIntentBuilder dartEntrypointArgs(List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public NewEngineIntentBuilder initialRoute(String str) {
            this.initialRoute = str;
            return this;
        }
    }

    @Deprecated
    private void configureStatusBarForFullscreenFlutterExperience() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT < 35) {
            window.setStatusBarColor(1073741824);
        }
        window.getDecorView().setSystemUiVisibility(PlatformPlugin.DEFAULT_SYSTEM_UI);
    }

    private void configureWindowForTransparency() {
        if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public static Intent createDefaultIntent(Context context) {
        return withNewEngine().build(context);
    }

    private View createFragmentContainer() {
        FrameLayout provideRootLayout = provideRootLayout(this);
        provideRootLayout.setId(FRAGMENT_CONTAINER_ID);
        provideRootLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return provideRootLayout;
    }

    private void ensureFlutterFragmentCreated() {
        if (this.flutterFragment == null) {
            this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        }
        if (this.flutterFragment == null) {
            this.flutterFragment = createFlutterFragment();
            f0 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C0193a c0193a = new C0193a(supportFragmentManager);
            c0193a.e(FRAGMENT_CONTAINER_ID, this.flutterFragment, TAG_FLUTTER_FRAGMENT);
            c0193a.d(false);
        }
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void switchLaunchThemeForNormalTheme() {
        try {
            Bundle metaData = getMetaData();
            if (metaData == null) {
                Log.v(TAG, "Using the launch theme as normal theme.");
                return;
            }
            int i4 = metaData.getInt("io.flutter.embedding.android.NormalTheme", -1);
            if (i4 != -1) {
                setTheme(i4);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
    }

    public static CachedEngineIntentBuilder withCachedEngine(String str) {
        return new CachedEngineIntentBuilder(FlutterFragmentActivity.class, str);
    }

    public static NewEngineIntentBuilder withNewEngine() {
        return new NewEngineIntentBuilder(FlutterFragmentActivity.class);
    }

    public static NewEngineInGroupIntentBuilder withNewEngineInGroup(String str) {
        return new NewEngineInGroupIntentBuilder(FlutterFragmentActivity.class, str);
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        FlutterFragment flutterFragment = this.flutterFragment;
        if (flutterFragment == null) {
            flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        }
        if (flutterFragment == null || !flutterFragment.isFlutterEngineInjected()) {
            GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
        }
    }

    public FlutterFragment createFlutterFragment() {
        FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = getBackgroundMode();
        RenderMode renderMode = getRenderMode();
        TransparencyMode transparencyMode = backgroundMode == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
        boolean z = renderMode == RenderMode.surface;
        if (getCachedEngineId() != null) {
            Log.v(TAG, "Creating FlutterFragment with cached engine:\nCached engine ID: " + getCachedEngineId() + "\nWill destroy engine when Activity is destroyed: " + shouldDestroyEngineWithHost() + "\nBackground transparency mode: " + backgroundMode + "\nWill attach FlutterEngine to Activity: " + shouldAttachEngineToActivity());
            return FlutterFragment.withCachedEngine(getCachedEngineId()).renderMode(renderMode).transparencyMode(transparencyMode).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).destroyEngineWithFragment(shouldDestroyEngineWithHost()).shouldDelayFirstAndroidViewDraw(z).shouldAutomaticallyHandleOnBackPressed(true).build();
        }
        StringBuilder sb = new StringBuilder("Creating FlutterFragment with new engine:\nCached engine group ID: ");
        sb.append(getCachedEngineGroupId());
        sb.append("\nBackground transparency mode: ");
        sb.append(backgroundMode);
        sb.append("\nDart entrypoint: ");
        sb.append(getDartEntrypointFunctionName());
        sb.append("\nDart entrypoint library uri: ");
        sb.append(getDartEntrypointLibraryUri() != null ? getDartEntrypointLibraryUri() : "\"\"");
        sb.append("\nInitial route: ");
        sb.append(getInitialRoute());
        sb.append("\nApp bundle path: ");
        sb.append(getAppBundlePath());
        sb.append("\nWill attach FlutterEngine to Activity: ");
        sb.append(shouldAttachEngineToActivity());
        Log.v(TAG, sb.toString());
        return getCachedEngineGroupId() != null ? FlutterFragment.withNewEngineInGroup(getCachedEngineGroupId()).dartEntrypoint(getDartEntrypointFunctionName()).initialRoute(getInitialRoute()).handleDeeplinking(shouldHandleDeeplinking()).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z).shouldAutomaticallyHandleOnBackPressed(true).build() : FlutterFragment.withNewEngine().dartEntrypoint(getDartEntrypointFunctionName()).dartLibraryUri(getDartEntrypointLibraryUri()).dartEntrypointArgs(getDartEntrypointArgs()).initialRoute(getInitialRoute()).appBundlePath(getAppBundlePath()).flutterShellArgs(FlutterShellArgs.fromIntent(getIntent())).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z).shouldAutomaticallyHandleOnBackPressed(true).build();
    }

    public String getAppBundlePath() {
        String dataString;
        if (isDebuggable() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    public FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        return getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    public String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    public String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public List<String> getDartEntrypointArgs() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public String getDartEntrypointFunctionName() {
        String string;
        try {
            Bundle metaData = getMetaData();
            string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return string != null ? string : "main";
    }

    public String getDartEntrypointLibraryUri() {
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public FlutterEngine getFlutterEngine() {
        return this.flutterFragment.getFlutterEngine();
    }

    public String getInitialRoute() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public Bundle getMetaData() throws PackageManager.NameNotFoundException {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public RenderMode getRenderMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    @Override // androidx.fragment.app.K, b.AbstractActivityC0253n, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        this.flutterFragment.onActivityResult(i4, i5, intent);
    }

    @Override // b.AbstractActivityC0253n, android.app.Activity
    public void onBackPressed() {
        this.flutterFragment.onBackPressed();
    }

    @Override // androidx.fragment.app.K, b.AbstractActivityC0253n, t.AbstractActivityC1415c, android.app.Activity
    public void onCreate(Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        super.onCreate(bundle);
        configureWindowForTransparency();
        setContentView(createFragmentContainer());
        configureStatusBarForFullscreenFlutterExperience();
        ensureFlutterFragmentCreated();
    }

    @Override // b.AbstractActivityC0253n, android.app.Activity
    public void onNewIntent(Intent intent) {
        this.flutterFragment.onNewIntent(intent);
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.K, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.flutterFragment.onPostResume();
    }

    @Override // androidx.fragment.app.K, b.AbstractActivityC0253n, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        this.flutterFragment.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // b.AbstractActivityC0253n, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        this.flutterFragment.onTrimMemory(i4);
    }

    @Override // b.AbstractActivityC0253n, android.app.Activity
    public void onUserLeaveHint() {
        this.flutterFragment.onUserLeaveHint();
    }

    @Override // io.flutter.embedding.android.FlutterEngineProvider
    public FlutterEngine provideFlutterEngine(Context context) {
        return null;
    }

    public FrameLayout provideRootLayout(Context context) {
        return new FrameLayout(context);
    }

    public FlutterFragment retrieveExistingFlutterFragmentIfPossible() {
        return (FlutterFragment) getSupportFragmentManager().C(TAG_FLUTTER_FRAGMENT);
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    public boolean shouldDestroyEngineWithHost() {
        return getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    }

    public boolean shouldHandleDeeplinking() {
        try {
            return FlutterActivityLaunchConfigs.deepLinkEnabled(getMetaData());
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
