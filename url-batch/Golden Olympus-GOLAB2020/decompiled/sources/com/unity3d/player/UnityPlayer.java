package com.unity3d.player;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.InputEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import h1.C2449j;
import h1.C2451l;
import h1.C2456q;
import h1.C2457s;
import h1.RunnableC2453n;
import h1.RunnableC2455p;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.KotlinVersion;
import org.fmod.FmodAndroidAudioManager;

/* loaded from: classes2.dex */
public abstract class UnityPlayer implements IUnityPlayerLifecycleEvents {
    private static final String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
    private static final String AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME = "unity.auto-report-fully-drawn";
    private static final String AUTO_SET_GAME_STATE_ENABLE_METADATA_NAME = "unity.auto-set-game-state";
    private static final String LAUNCH_FULLSCREEN = "unity.launch-fullscreen";
    private static final String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
    private static final String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
    public static Activity currentActivity;
    public static Context currentContext;
    Activity mActivity;
    Context mContext;
    private h1.N mContextType;
    private int mInitialScreenOrientation;
    boolean mQuitting;
    private C1733c1 mVideoPlayerProxy;
    private ClipboardManager m_ClipboardManager;
    private FrameLayout m_FrameLayout;
    private HashMap m_PermissionRequests;
    private C2449j m_SplashScreen;
    TelephonyManager m_TelephonyManager;
    protected IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents;
    Window m_Window;
    private Configuration prevConfig;
    Handler mHandler = new Handler();
    private boolean mIsFullscreen = true;
    C2457s mState = new C2457s();
    private OrientationEventListener mOrientationListener = null;
    int mNaturalOrientation = -1;
    boolean m_AddPhoneCallListener = false;
    a m_PhoneCallListener = new a();
    private GoogleARCoreApi m_ARCoreApi = null;
    private C1762m0 m_FakeListener = new C1762m0();
    private Camera2Wrapper m_Camera2Wrapper = null;
    private HFPStatus m_HFPStatus = null;
    private AudioVolumeHandler m_AudioVolumeHandler = null;
    private OrientationLockListener m_OrientationLockListener = null;
    private FmodAndroidAudioManager m_FmodAndroidAudioManager = null;
    private h1.V m_NetworkConnectivity = null;
    private h1.X m_OnBackPressedDispatcher = null;
    private C2456q m_Cursor = null;
    private UnityAccessibilityDelegate m_AccessibilityDelegate = null;
    private final ConcurrentLinkedQueue m_MainThreadJobs = new ConcurrentLinkedQueue();
    private Thread m_UIThread = Thread.currentThread();

    public class a extends PhoneStateListener {

        /* renamed from: a, reason: collision with root package name */
        public int f22095a = 0;

        public a() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int i4, String str) {
            this.f22095a = i4;
            UnityPlayer.this.nativeMuteMasterAudio(i4 == 1);
        }
    }

    public abstract class b implements Runnable {
        public b() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (UnityPlayer.this.isFinishing()) {
                return;
            }
            a();
        }
    }

    static {
        h1.r rVar = new h1.r();
        synchronized (rVar) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler == rVar) {
                return;
            }
            rVar.f36755a = defaultUncaughtExceptionHandler;
            rVar.f36756b = "Unknown";
            Thread.setDefaultUncaughtExceptionHandler(rVar);
        }
    }

    protected UnityPlayer(Context context, h1.N n4, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        this.mInitialScreenOrientation = -1;
        this.m_UnityPlayerLifecycleEvents = null;
        this.mContext = context;
        this.mContextType = n4;
        this.m_UnityPlayerLifecycleEvents = iUnityPlayerLifecycleEvents == null ? this : iUnityPlayerLifecycleEvents;
        String unityNativeLibraryPath = getUnityNativeLibraryPath(context);
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof h1.r) {
            h1.r rVar = (h1.r) defaultUncaughtExceptionHandler;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                int indexOf = unityNativeLibraryPath.indexOf(47, i4 + 1);
                if (indexOf == -1) {
                    break;
                }
                i5 = i4;
                i4 = indexOf;
            }
            rVar.f36756b = i5 < 0 ? "Unknown" : unityNativeLibraryPath.substring(i5 + 1);
        }
        currentContext = context;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.mActivity = activity;
            currentActivity = activity;
            this.mInitialScreenOrientation = activity.getRequestedOrientation();
        }
    }

    private void EarlyEnableFullScreenIfEnabled() {
        Activity activity = this.mActivity;
        if (activity != null && activity.getWindow() != null && (getLaunchFullscreen() || this.mActivity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false))) {
            applyWindowUIChanges(true);
        }
        DisplayCutoutSupport.setLayoutCutoutMode(this.mActivity);
    }

    private String GetGlViewContentDescription(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName()));
    }

    public static void UnitySendMessage(String str, String str2, String str3) {
        byte[] bytes;
        if (C2457s.f36757e) {
            if (str3 == null) {
                bytes = null;
            } else {
                try {
                    bytes = str3.getBytes("UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            }
            nativeUnitySendMessage(str, str2, bytes);
            return;
        }
        h1.T.a(5, "Native libraries not loaded - dropping message for " + str + "." + str2);
    }

    private void applyWindowInsets() {
        Activity activity = this.mActivity;
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        runOnUiThread(new RunnableC1726a0(this));
    }

    private void applyWindowUIChanges(boolean z4) {
        Activity activity = this.mActivity;
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        runOnUiThread(new Z(this, z4));
    }

    private void developmentPlayerInitialize() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchFrameLayoutPadding() {
        View viewForPadding = getViewForPadding();
        if (!C2457s.f36757e || viewForPadding == null) {
            return;
        }
        nativeViewPaddingChanged(0, viewForPadding.getPaddingLeft(), viewForPadding.getPaddingTop(), viewForPadding.getPaddingRight(), viewForPadding.getPaddingBottom());
    }

    private boolean getARCoreEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(ARCORE_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private ActivityInfo getActivityInfo() {
        return this.mActivity.getPackageManager().getActivityInfo(this.mActivity.getComponentName(), UserVerificationMethods.USER_VERIFY_PATTERN);
    }

    private boolean getLaunchFullscreen() {
        try {
            return getApplicationInfo().metaData.getBoolean(LAUNCH_FULLSCREEN);
        } catch (Exception unused) {
            return false;
        }
    }

    private int getNaturalOrientation(int i4) {
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if ((rotation == 0 || rotation == 2) && i4 == 2) {
            return 0;
        }
        return ((rotation == 1 || rotation == 3) && i4 == 1) ? 0 : 1;
    }

    private String getProcessName() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.mContext.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    private float getScreenBrightness() {
        Window window = this.m_Window;
        if (window == null) {
            return 1.0f;
        }
        float f4 = window.getAttributes().screenBrightness;
        if (f4 >= 0.0f) {
            return f4;
        }
        int i4 = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness", KotlinVersion.MAX_COMPONENT_VALUE);
        return PlatformSupport.PIE_SUPPORT ? (float) Math.max(0.0d, Math.min(1.0d, ((Math.log(i4) * 19.811d) - 9.411d) / 100.0d)) : i4 / 255.0f;
    }

    private static String getUnityNativeLibraryPath(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    private void hideStatusBar() {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.getWindow().setFlags(1024, 1024);
        }
    }

    private final native void initJni(Context context, int i4, String str);

    private boolean isWindowTranslucent() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return false;
        }
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
        boolean z4 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z4;
    }

    private static String loadNative(String str) {
        String str2 = str + "/libmain.so";
        try {
            try {
                try {
                    System.load(str2);
                } catch (UnsatisfiedLinkError e4) {
                    return logLoadLibMainError(str2, e4.toString());
                }
            } catch (SecurityException e5) {
                return logLoadLibMainError(str2, e5.toString());
            }
        } catch (UnsatisfiedLinkError unused) {
            System.loadLibrary(b9.h.f15466Z);
        }
        if (NativeLoader.load(str)) {
            C2457s.f36757e = true;
            return "";
        }
        h1.T.a(6, "NativeLoader.load failure, Unity libraries were not loaded.");
        return "NativeLoader.load failure, Unity libraries were not loaded.";
    }

    private static String logLoadLibMainError(String str, String str2) {
        String str3 = "Failed to load 'libmain.so'\n\n" + str2;
        h1.T.a(6, str3);
        return str3;
    }

    private final native void nativeApplicationUnload();

    private final native void nativeHidePreservedContent();

    private final native boolean nativeInjectEvent(InputEvent inputEvent, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeIsAutorotationOn();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetLaunchURL(String str);

    private static native void nativeUnitySendMessage(String str, String str2, byte[] bArr);

    private final native void nativeViewPaddingChanged(int i4, int i5, int i6, int i7, int i8);

    private void pauseJavaAndCallUnloadCallback() {
        runOnUiThread(new Y(this));
    }

    static native void permissionResponseToNative(long j4, boolean z4);

    private static void preloadJavaPlugins() {
        try {
            Class.forName("com.unity3d.JavaPluginPreloader");
        } catch (ClassNotFoundException unused) {
        } catch (LinkageError e4) {
            h1.T.a(6, "Java class preloading failed: " + e4.getMessage());
        }
    }

    private void releasePointerCapture() {
        C2456q c2456q = this.m_Cursor;
        c2456q.getClass();
        if (PlatformSupport.OREO_SUPPORT) {
            c2456q.f36754a.runOnUiThread(new RunnableC2455p(c2456q));
        }
    }

    private void requestPointerCapture() {
        C2456q c2456q = this.m_Cursor;
        c2456q.getClass();
        if (PlatformSupport.OREO_SUPPORT) {
            c2456q.f36754a.runOnUiThread(new RunnableC2453n(c2456q));
        }
    }

    private void requestUserAuthorization(String str, long j4) {
        Activity activity;
        if (str == null || str.isEmpty() || (activity = this.mActivity) == null) {
            return;
        }
        UnityPermissions.requestUserPermissions(activity, new String[]{str}, j4 != 0 ? new C1767o0(j4, this) : null);
    }

    private boolean runningOnUIThread() {
        return Thread.currentThread() == this.m_UIThread;
    }

    private void setBackButtonLeavesApp(boolean z4) {
        h1.X x4 = this.m_OnBackPressedDispatcher;
        if (x4 != null) {
            if (z4) {
                x4.unregisterOnBackPressedCallback();
            } else {
                x4.registerOnBackPressedCallback();
            }
        }
    }

    private void setScreenBrightness(float f4) {
        float max = Math.max(0.04f, f4);
        if (this.m_Window == null || getScreenBrightness() == max) {
            return;
        }
        runOnUiThread(new RunnableC1759l0(this, max));
    }

    private void startActivityIndicator(int i4) {
        postOnUiThread(new RunnableC1729b0(this, i4));
    }

    private void stopActivityIndicator() {
        postOnUiThread(new RunnableC1732c0());
    }

    private boolean supportsWindowInsetController() {
        return PlatformSupport.RED_VELVET_CAKE_SUPPORT;
    }

    private void swapViews(View view, View view2) {
        boolean z4;
        ViewParent parent;
        if (this.mState.f36760c) {
            z4 = false;
        } else {
            setupUnityToBePaused();
            z4 = true;
        }
        FrameLayout frameLayout = getFrameLayout();
        if (frameLayout != null) {
            if (view != null && (parent = view.getParent()) != frameLayout) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                frameLayout.addView(view);
                frameLayout.bringChildToFront(view);
                view.setVisibility(0);
            }
            if (view2 != null && view2.getParent() == frameLayout) {
                view2.setVisibility(8);
                frameLayout.removeView(view2);
            }
        }
        if (z4) {
            setupUnityToBeResumed();
        }
    }

    private static void unloadNative() {
        if (C2457s.f36757e) {
            if (!NativeLoader.unload()) {
                throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
            }
            C2457s.f36757e = false;
        }
    }

    public synchronized void addPermissionRequest(PermissionRequest permissionRequest) {
        Integer valueOf;
        try {
            if (this.m_PermissionRequests == null) {
                this.m_PermissionRequests = new HashMap();
            }
            int i4 = 1;
            while (true) {
                valueOf = Integer.valueOf(i4);
                if (!this.m_PermissionRequests.containsKey(valueOf)) {
                    break;
                } else {
                    i4++;
                }
            }
            this.m_PermissionRequests.put(valueOf, permissionRequest);
            if (this.m_PermissionRequests.size() == 1) {
                requestPermissionsFromActivity(permissionRequest.getPermissionNames(), i4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    protected void addPhoneCallListener() {
        this.m_AddPhoneCallListener = true;
        this.m_TelephonyManager.listen(this.m_PhoneCallListener, 32);
    }

    public boolean addViewToPlayer(View view, boolean z4) {
        FrameLayout frameLayout = getFrameLayout();
        boolean z5 = false;
        if (frameLayout == null) {
            return false;
        }
        View view2 = getView();
        swapViews(view, z4 ? view2 : null);
        boolean z6 = view.getParent() == frameLayout;
        boolean z7 = z4 && view2.getParent() == null;
        boolean z8 = view2.getParent() == frameLayout;
        if (z6 && (z7 || z8)) {
            z5 = true;
        }
        if (!z5) {
            if (!z6) {
                h1.T.a(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!z7 && !z8) {
                h1.T.a(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return z5;
    }

    protected void applySurfaceViewSettings(SurfaceView surfaceView) {
        if (!isWindowTranslucent()) {
            surfaceView.getHolder().setFormat(-1);
        } else {
            surfaceView.getHolder().setFormat(-3);
            surfaceView.setZOrderOnTop(true);
        }
    }

    protected boolean canPauseUnity() {
        C2457s c2457s = this.mState;
        return c2457s.f36759b || !c2457s.f36760c;
    }

    protected boolean canResumeUnity() {
        Activity activity = this.mActivity;
        boolean isInMultiWindowMode = activity != null ? MultiWindowSupport.isInMultiWindowMode(activity) : false;
        C2457s c2457s = this.mState;
        if (!C2457s.f36757e) {
            c2457s.getClass();
        } else if ((isInMultiWindowMode || c2457s.f36758a) && !c2457s.f36760c && !c2457s.f36759b) {
            return true;
        }
        return false;
    }

    abstract void cleanupResourcesForDestroy();

    public void configurationChanged(Configuration configuration) {
        int diff = this.prevConfig.diff(configuration);
        if ((diff & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 || (diff & 1024) != 0 || (diff & com.ironsource.mediationsdk.metadata.a.f17688n) != 0 || (diff & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            nativeHidePreservedContent();
        }
        this.prevConfig = new Configuration(configuration);
        C1733c1 c1733c1 = this.mVideoPlayerProxy;
        if (c1733c1 != null) {
            c1733c1.f22154e.lock();
            VideoPlayer videoPlayer = c1733c1.f22155f;
            if (videoPlayer != null) {
                videoPlayer.updateVideoLayout();
            }
            c1733c1.f22154e.unlock();
        }
        UnityAccessibilityDelegate unityAccessibilityDelegate = this.m_AccessibilityDelegate;
        if (unityAccessibilityDelegate != null) {
            unityAccessibilityDelegate.a(configuration);
        }
    }

    public void destroy() {
        Camera2Wrapper camera2Wrapper = this.m_Camera2Wrapper;
        if (camera2Wrapper != null) {
            camera2Wrapper.closeCamera2();
            this.m_Camera2Wrapper = null;
        }
        HFPStatus hFPStatus = this.m_HFPStatus;
        if (hFPStatus != null) {
            hFPStatus.b();
            this.m_HFPStatus = null;
        }
        FmodAndroidAudioManager fmodAndroidAudioManager = this.m_FmodAndroidAudioManager;
        if (fmodAndroidAudioManager != null) {
            fmodAndroidAudioManager.setActivity(null);
        }
        h1.V v4 = this.m_NetworkConnectivity;
        if (v4 != null) {
            v4.a();
            this.m_NetworkConnectivity = null;
        }
        h1.X x4 = this.m_OnBackPressedDispatcher;
        if (x4 != null) {
            x4.unregisterOnBackPressedCallback();
            this.m_OnBackPressedDispatcher = null;
        }
        this.mQuitting = true;
        if (!this.mState.f36760c) {
            setupUnityToBePaused();
        }
        cleanupResourcesForDestroy();
        unloadNative();
    }

    protected void disableLogger() {
        h1.T.f36718a = true;
    }

    void disableStaticSplashScreen() {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new RunnableC1741f0(this));
    }

    protected void executeMainThreadJobs() {
        while (true) {
            Runnable runnable = (Runnable) this.m_MainThreadJobs.poll();
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    void finish() {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.finish();
    }

    Activity getActivity() {
        return this.mActivity;
    }

    ApplicationInfo getApplicationInfo() {
        return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
    }

    boolean getAutoReportFullyDrawnEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    boolean getAutoSetGameStateEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(AUTO_SET_GAME_STATE_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    protected String getClipboardText() {
        ClipData primaryClip = this.m_ClipboardManager.getPrimaryClip();
        return primaryClip != null ? primaryClip.getItemAt(0).coerceToText(this.mContext).toString() : "";
    }

    public Context getContext() {
        return this.mContext;
    }

    h1.N getContextType() {
        return this.mContextType;
    }

    public FrameLayout getFrameLayout() {
        return this.m_FrameLayout;
    }

    protected String getKeyboardLayout() {
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) this.mContext.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null) {
            return null;
        }
        String a4 = h1.S.a(currentInputMethodSubtype);
        if (a4 != null && !a4.equals("")) {
            return a4;
        }
        return currentInputMethodSubtype.getMode() + " " + currentInputMethodSubtype.getExtraValue();
    }

    protected String getLaunchURL() {
        Uri data;
        Activity activity = this.mActivity;
        if (activity == null || (data = activity.getIntent().getData()) == null) {
            return null;
        }
        return data.toString();
    }

    protected int getNetworkConnectivity() {
        h1.V v4 = this.m_NetworkConnectivity;
        if (v4 != null) {
            return v4.f36721b;
        }
        h1.V v5 = new h1.V(this.mContext);
        this.m_NetworkConnectivity = v5;
        return v5.f36721b;
    }

    public String getNetworkProxySettings(String str) {
        String str2;
        String str3;
        if (!str.startsWith("http:")) {
            if (str.startsWith("https:")) {
                str2 = "https.proxyHost";
                str3 = "https.proxyPort";
            }
            return null;
        }
        str2 = "http.proxyHost";
        str3 = "http.proxyPort";
        String property = System.getProperties().getProperty(str2);
        if (property != null && !"".equals(property)) {
            StringBuilder sb = new StringBuilder(property);
            String property2 = System.getProperties().getProperty(str3);
            if (property2 != null && !"".equals(property2)) {
                sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb.append(property2);
            }
            String property3 = System.getProperties().getProperty("http.nonProxyHosts");
            if (property3 != null && !"".equals(property3)) {
                sb.append('\n');
                sb.append(property3);
            }
            return sb.toString();
        }
        return null;
    }

    boolean getSplashEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(SPLASH_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    protected int getSplashMode() {
        try {
            return getApplicationInfo().metaData.getInt(SPLASH_MODE_METADATA_NAME);
        } catch (Exception unused) {
            return 0;
        }
    }

    String getState() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mState.toString() + "\n");
        sb.append(String.format("m_AudioVolumeHandler = %b", this.m_AudioVolumeHandler).concat("\n"));
        sb.append(String.format("m_OrientationLockListener = %b", this.m_OrientationLockListener).concat("\n"));
        return sb.toString();
    }

    public abstract SurfaceView getSurfaceView();

    protected int getUaaLLaunchProcessType() {
        String processName = getProcessName();
        return (processName == null || processName.equals(this.mContext.getPackageName())) ? 0 : 1;
    }

    public abstract View getView();

    abstract View getViewForPadding();

    abstract boolean handleFocus(boolean z4);

    abstract void hidePreservedContent();

    protected void initialize(FrameLayout frameLayout) {
        initialize(frameLayout, "");
    }

    protected boolean initializeGoogleAr() {
        if (this.m_ARCoreApi != null || this.mActivity == null || !getARCoreEnabled()) {
            return false;
        }
        GoogleARCoreApi googleARCoreApi = new GoogleARCoreApi();
        this.m_ARCoreApi = googleARCoreApi;
        googleARCoreApi.initializeARCore(this.mActivity);
        if (this.mState.f36760c) {
            return false;
        }
        this.m_ARCoreApi.resumeARCore();
        return false;
    }

    public boolean injectEvent(InputEvent inputEvent, int i4) {
        if (C2457s.f36757e) {
            return nativeInjectEvent(inputEvent, i4);
        }
        return false;
    }

    public void invokeOnMainThread(Runnable runnable) {
        if (C2457s.f36757e) {
            if (runningOnUIThread() || !runningOnMainThread()) {
                this.m_MainThreadJobs.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    protected boolean isFinishing() {
        if (this.mQuitting) {
            return true;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            this.mQuitting = activity.isFinishing();
        }
        return this.mQuitting;
    }

    boolean isNativeInitialized() {
        return C2457s.f36757e && this.mState.f36761d;
    }

    protected boolean isUaaLUseCase() {
        String callingPackage;
        Activity activity = this.mActivity;
        return (activity == null || (callingPackage = activity.getCallingPackage()) == null || !callingPackage.equals(this.mContext.getPackageName())) ? false : true;
    }

    protected void kill() {
        h1.T.a(4, "Quitting process");
        Process.killProcess(Process.myPid());
    }

    protected boolean loadLibrary(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Exception | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public final native void nativeCrashNow();

    protected final native int nativeGetMainWindowIndex();

    protected final native void nativeMuteMasterAudio(boolean z4);

    public void newIntent(Intent intent) {
        setLaunchURL(intent.getData());
    }

    abstract void onOrientationChanged(int i4, int i5);

    public void onPause() {
        MultiWindowSupport.saveMultiWindowMode(this.mActivity);
        if (MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        setupUnityToBePaused();
    }

    public void onResume() {
        if (!MultiWindowSupport.isInMultiWindowMode(this.mActivity) || MultiWindowSupport.isMultiWindowModeChangedToTrue(this.mActivity)) {
            setupUnityToBeResumed();
        }
    }

    public void onStart() {
        if (MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            setupUnityToBeResumed();
        }
    }

    public void onStop() {
        if (MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            setupUnityToBePaused();
        }
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    public void pause() {
        setupUnityToBePaused();
    }

    void pauseUnity() {
        C2457s c2457s = this.mState;
        c2457s.f36759b = false;
        c2457s.f36760c = true;
    }

    public synchronized void permissionResponse(Activity activity, int i4, String[] strArr, int[] iArr) {
        int i5;
        try {
            if (this.m_PermissionRequests != null) {
                Integer valueOf = Integer.valueOf(i4);
                PermissionRequest permissionRequest = (PermissionRequest) this.m_PermissionRequests.get(valueOf);
                if (permissionRequest != null) {
                    this.m_PermissionRequests.remove(valueOf);
                    String[] permissionNames = permissionRequest.getPermissionNames();
                    int[] iArr2 = new int[permissionNames.length];
                    for (int i6 = 0; i6 < strArr.length; i6++) {
                        String str = strArr[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= permissionNames.length) {
                                i7 = -1;
                                break;
                            } else if (str.equals(permissionNames[i7])) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 < 0) {
                            h1.T.a(6, "Permission not found in request: " + str);
                        } else {
                            if (iArr[i6] == 0) {
                                i5 = 1;
                            } else {
                                if (Build.VERSION.SDK_INT < 30 && !UnityPermissions.shouldShowRequestPermissionRationale(activity, str)) {
                                    i5 = 3;
                                }
                                i5 = 2;
                            }
                            iArr2[i7] = i5;
                        }
                    }
                    invokeOnMainThread(new RunnableC1744g0(permissionRequest, permissionNames, iArr2));
                    triggerNextPermissionRequest();
                }
            }
        } finally {
        }
    }

    void postOnUiThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public void removeViewFromPlayer(View view) {
        FrameLayout frameLayout = getFrameLayout();
        if (frameLayout == null) {
            return;
        }
        View view2 = getView();
        swapViews(view2, view);
        boolean z4 = view.getParent() == null;
        boolean z5 = view2.getParent() == frameLayout;
        if (z4 && z5) {
            return;
        }
        if (!z4) {
            h1.T.a(6, "removeViewFromPlayer: Failure removing view from hierarchy");
        }
        if (z5) {
            return;
        }
        h1.T.a(6, "removeViewFromPlayer: Failure adding old view to hierarchy");
    }

    public void reportError(String str, String str2) {
        h1.T.a(6, str + ": " + str2);
    }

    void reportFullyDrawn() {
        this.mActivity.reportFullyDrawn();
    }

    public void requestPermissionsFromActivity(String[] strArr, int i4) {
        this.mActivity.requestPermissions(strArr, i4);
    }

    public void resume() {
        setupUnityToBeResumed();
    }

    void resumeUnity() {
        this.mState.f36759b = true;
    }

    void runOnAnonymousThread(Runnable runnable) {
        new Thread(runnable).start();
    }

    void runOnUiThread(Runnable runnable) {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public abstract boolean runningOnMainThread();

    protected void saveFocusState(boolean z4) {
        this.mState.f36758a = z4;
    }

    protected void setAccessibilityDelegate(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.m_AccessibilityDelegate = unityAccessibilityDelegate;
    }

    protected void setClipboardText(String str) {
        this.m_ClipboardManager.setPrimaryClip(ClipData.newPlainText("Text", str));
    }

    void setLaunchURL(Uri uri) {
        invokeOnMainThread(new RunnableC1747h0(uri != null ? uri.toString() : null));
    }

    public abstract void setMainSurfaceViewAspectRatio(float f4);

    protected void setupUnityToBePaused() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.pauseARCore();
        }
        C1733c1 c1733c1 = this.mVideoPlayerProxy;
        if (c1733c1 != null) {
            c1733c1.f22154e.lock();
            VideoPlayer videoPlayer = c1733c1.f22155f;
            if (videoPlayer != null) {
                if (c1733c1.f22156g == 0) {
                    videoPlayer.cancelOnPrepare();
                } else if (c1733c1.f22158i) {
                    boolean isPaused = videoPlayer.isPaused();
                    c1733c1.f22157h = isPaused;
                    if (!isPaused) {
                        c1733c1.f22155f.pause();
                    }
                }
            }
            c1733c1.f22154e.unlock();
        }
        AudioVolumeHandler audioVolumeHandler = this.m_AudioVolumeHandler;
        if (audioVolumeHandler != null) {
            h1.D d4 = audioVolumeHandler.f21994a;
            if (d4.f36708c != null) {
                d4.f36706a.getContentResolver().unregisterContentObserver(d4.f36708c);
                d4.f36708c = null;
            }
            audioVolumeHandler.f21994a = null;
            this.m_AudioVolumeHandler = null;
        }
        OrientationLockListener orientationLockListener = this.m_OrientationLockListener;
        if (orientationLockListener != null) {
            C2451l c2451l = orientationLockListener.f22061a;
            if (c2451l.f36751b != null) {
                c2451l.f36750a.getContentResolver().unregisterContentObserver(c2451l.f36751b);
                c2451l.f36751b = null;
            }
            orientationLockListener.f22061a = null;
            this.m_OrientationLockListener = null;
        }
        h1.X x4 = this.m_OnBackPressedDispatcher;
        if (x4 != null) {
            x4.f36726c = x4.f36724a != null;
            x4.unregisterOnBackPressedCallback();
        }
        if (canPauseUnity()) {
            pauseUnity();
        }
    }

    protected void setupUnityToBeResumed() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.resumeARCore();
        }
        this.mState.f36760c = false;
        C1733c1 c1733c1 = this.mVideoPlayerProxy;
        if (c1733c1 != null) {
            c1733c1.f22154e.lock();
            VideoPlayer videoPlayer = c1733c1.f22155f;
            if (videoPlayer != null && c1733c1.f22158i && !c1733c1.f22157h) {
                videoPlayer.start();
            }
            c1733c1.f22154e.unlock();
        }
        if (canResumeUnity()) {
            resumeUnity();
        }
        if (this.m_AudioVolumeHandler == null) {
            this.m_AudioVolumeHandler = new AudioVolumeHandler(this.mContext);
        }
        if (this.m_OrientationLockListener == null && C2457s.f36757e) {
            this.m_OrientationLockListener = new OrientationLockListener(this.mContext);
        }
        h1.X x4 = this.m_OnBackPressedDispatcher;
        if (x4 == null || !x4.f36726c) {
            return;
        }
        x4.registerOnBackPressedCallback();
    }

    boolean shouldReportFullyDrawn() {
        if (this.mActivity == null) {
            return false;
        }
        return getAutoReportFullyDrawnEnabled();
    }

    boolean shouldSetGameState() {
        return (!PlatformSupport.TIRAMISU_SUPPORT || this.mActivity == null || isUaaLUseCase() || !getAutoSetGameStateEnabled() || UnityGameManager.getGameManager(currentContext) == null) ? false : true;
    }

    protected boolean showVideoPlayer(String str, int i4, int i5, int i6, boolean z4, int i7, int i8) {
        if (this.mVideoPlayerProxy == null) {
            this.mVideoPlayerProxy = new C1733c1(this);
        }
        C1733c1 c1733c1 = this.mVideoPlayerProxy;
        Context context = this.mContext;
        C1750i0 c1750i0 = new C1750i0(this);
        c1733c1.f22154e.lock();
        c1733c1.f22152c = c1750i0;
        c1733c1.f22151b = context;
        c1733c1.f22153d.drainPermits();
        c1733c1.f22156g = 2;
        c1733c1.runOnUiThread(new Y0(c1733c1, str, i4, i5, i6, z4, i7, i8));
        boolean z5 = false;
        try {
            c1733c1.f22154e.unlock();
            c1733c1.f22153d.acquire();
            c1733c1.f22154e.lock();
            if (c1733c1.f22156g != 2) {
                z5 = true;
            }
        } catch (InterruptedException unused) {
        }
        c1733c1.runOnUiThread(new Z0(c1733c1));
        if (!z5 || c1733c1.f22156g == 3) {
            c1733c1.runOnUiThread(new RunnableC1730b1(c1733c1));
        } else {
            c1733c1.runOnUiThread(new RunnableC1727a1(c1733c1));
        }
        c1733c1.f22154e.unlock();
        if (z5) {
            runOnUiThread(new RunnableC1753j0(this));
        }
        return z5;
    }

    void shutdown() {
        this.mState.f36761d = false;
    }

    protected boolean skipPermissionsDialog() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return UnityPermissions.skipPermissionsDialog(activity);
        }
        return false;
    }

    public boolean startOrientationListener(int i4) {
        if (this.mOrientationListener != null) {
            h1.T.a(5, "Orientation Listener already started.");
            return false;
        }
        C1756k0 c1756k0 = new C1756k0(this, this.mContext, i4);
        this.mOrientationListener = c1756k0;
        if (c1756k0.canDetectOrientation()) {
            this.mOrientationListener.enable();
            return true;
        }
        h1.T.a(5, "Orientation Listener cannot detect orientation.");
        return false;
    }

    public boolean stopOrientationListener() {
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener == null) {
            h1.T.a(5, "Orientation Listener was not started.");
            return false;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        return true;
    }

    protected void toggleGyroscopeSensor(boolean z4) {
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (z4) {
            sensorManager.registerListener(this.m_FakeListener, defaultSensor, 1);
        } else {
            sensorManager.unregisterListener(this.m_FakeListener);
        }
    }

    public synchronized void triggerNextPermissionRequest() {
        Iterator it;
        HashMap hashMap = this.m_PermissionRequests;
        if (hashMap == null || (it = hashMap.entrySet().iterator()) == null || !it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        requestPermissionsFromActivity(((PermissionRequest) entry.getValue()).getPermissionNames(), ((Integer) entry.getKey()).intValue());
    }

    public void unload() {
        nativeApplicationUnload();
    }

    public void windowFocusChanged(boolean z4) {
        saveFocusState(z4);
        if (handleFocus(z4) && canResumeUnity()) {
            resumeUnity();
        }
    }

    protected void initialize(FrameLayout frameLayout, String str) {
        if (frameLayout != null) {
            this.m_FrameLayout = frameLayout;
            EarlyEnableFullScreenIfEnabled();
        }
        Configuration configuration = this.mContext.getResources().getConfiguration();
        this.prevConfig = configuration;
        this.mNaturalOrientation = getNaturalOrientation(configuration.orientation);
        if (this.mActivity != null && getSplashEnabled()) {
            C2449j c2449j = new C2449j(this.mContext, h1.E.b(3)[getSplashMode()]);
            this.m_SplashScreen = c2449j;
            this.m_FrameLayout.addView(c2449j);
            this.m_FrameLayout.bringChildToFront(this.m_SplashScreen);
        }
        preloadJavaPlugins();
        String loadNative = loadNative(getUnityNativeLibraryPath(this.mContext));
        if (!C2457s.f36757e) {
            h1.T.a(6, "Your hardware does not support this application.");
            AlertDialog create = new AlertDialog.Builder(this.mContext).setTitle("Failure to initialize!").setPositiveButton("OK", new DialogInterfaceOnClickListenerC1735d0(this)).setMessage("Your hardware does not support this application.\n\n" + loadNative + "\n\n Press OK to quit.").create();
            create.setCancelable(false);
            create.show();
            return;
        }
        initJni(this.mContext, this.mContextType.f36715b, str);
        this.mState.f36761d = true;
        this.mQuitting = false;
        developmentPlayerInitialize();
        hideStatusBar();
        this.m_TelephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        this.m_ClipboardManager = (ClipboardManager) this.mContext.getSystemService("clipboard");
        this.m_Camera2Wrapper = new Camera2Wrapper(this.mContext);
        this.m_HFPStatus = new HFPStatus(this.mContext);
        this.m_Cursor = new C2456q(this);
        FmodAndroidAudioManager fmodAndroidAudioManager = FmodAndroidAudioManager.getInstance();
        this.m_FmodAndroidAudioManager = fmodAndroidAudioManager;
        fmodAndroidAudioManager.setActivity(this.mActivity);
        this.m_OnBackPressedDispatcher = C1770q.a(getContext(), 1, new RunnableC1738e0(this));
        Activity activity = this.mActivity;
        if (activity != null) {
            this.m_Window = activity.getWindow();
        }
    }

    public boolean injectEvent(InputEvent inputEvent) {
        return injectEvent(inputEvent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeOnMainThread(b bVar) {
        if (isFinishing()) {
            return;
        }
        invokeOnMainThread((Runnable) bVar);
    }
}
