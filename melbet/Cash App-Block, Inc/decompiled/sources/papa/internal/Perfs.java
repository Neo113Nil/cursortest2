package papa.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Printer;
import android.view.JavaViewSpy;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.work.impl.Processor$$ExternalSyntheticLambda1;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import curtains.Curtains;
import curtains.DispatchState;
import curtains.OnRootViewAddedListener;
import curtains.TouchEventInterceptor;
import curtains.WindowsKt;
import curtains.internal.RootViewsSpy;
import curtains.internal.WindowCallbackWrapper;
import curtains.internal.WindowCallbackWrapper$dispatchKeyEvent$dispatch$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import okhttp3.internal.Tags;
import okio.Okio;
import okio.Utf8;
import papa.AppStart$AppStartData;
import papa.AppUpdateData;
import papa.AppVisibilityState;
import papa.Choreographers;
import papa.Choreographers$$ExternalSyntheticLambda1;
import papa.Handlers;
import papa.Handlers$$ExternalSyntheticLambda1;
import papa.MainThreadMessageSpy;
import papa.OnFrameRenderedListener;
import papa.PapaEvent;
import papa.PapaEventListener;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes3.dex */
public abstract class Perfs {
    public static volatile AppStart$AppStartData appStartData;
    public static Long applicationInstantiatedUptimeMillis;
    public static final long classInitUptimeMillis = SystemClock.uptimeMillis();
    public static Long classLoaderInstantiatedUptimeMillis;
    public static boolean firstPostApplicationComponentInstantiated;
    public static Long firstPostUptimeMillis;
    public static volatile boolean initialized;
    public static boolean isTracingLaunch;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void init$papa_release(Context context) {
        Okio myProcess$ErrorRetrievingMyProcessData;
        Okio okio2;
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Lazy lazy = Handlers.mainThreadHandler$delegate;
        if (Looper.getMainLooper() != Looper.myLooper() || initialized) {
            return;
        }
        if (!(context instanceof Application)) {
            context.getClass().toString();
            return;
        }
        try {
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            ActivityManager activityManager = (ActivityManager) systemService;
            try {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (next.pid == myPid) {
                                List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                                appTasks.getClass();
                                okio2 = new MyProcess$MyProcessData(next, Tags.readProcessStartRealtimeMillis(myPid), DurationKt.toAppTasks(appTasks));
                                break;
                            }
                        } else {
                            List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((ActivityManager.RunningAppProcessInfo) it2.next()).pid));
                            }
                            okio2 = new MyProcess$ErrorRetrievingMyProcessData(new RuntimeException("ActivityManager.getRunningAppProcesses() returned " + arrayList + ", no process matching myPid() " + myPid));
                        }
                    }
                } else {
                    okio2 = new MyProcess$ErrorRetrievingMyProcessData(new RuntimeException("ActivityManager.getRunningAppProcesses() returned null"));
                }
            } catch (SecurityException e) {
                myProcess$ErrorRetrievingMyProcessData = new MyProcess$ErrorRetrievingMyProcessData(e);
                okio2 = myProcess$ErrorRetrievingMyProcessData;
                if (!(okio2 instanceof MyProcess$ErrorRetrievingMyProcessData)) {
                }
            }
        } catch (Throwable th) {
            myProcess$ErrorRetrievingMyProcessData = new MyProcess$ErrorRetrievingMyProcessData(th);
        }
        if (!(okio2 instanceof MyProcess$ErrorRetrievingMyProcessData)) {
            ((MyProcess$ErrorRetrievingMyProcessData) okio2).throwable.getMessage();
            return;
        }
        if (!(okio2 instanceof MyProcess$MyProcessData)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        MyProcess$MyProcessData myProcess$MyProcessData = (MyProcess$MyProcessData) okio2;
        initialized = true;
        Application application = (Application) context;
        boolean z = myProcess$MyProcessData.info.importance == 100;
        TuplesKt.application = application;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == Looper.myLooper()) {
            Utf8.enableOnMainThread();
        } else {
            new Handler(mainLooper).post(new Perfs$$ExternalSyntheticLambda0(5));
        }
        if (z) {
            SafeTrace.beginAsyncSection("App Launch", 0);
        }
        Resources resources = application.getResources();
        if (resources.getBoolean(R.bool.papa_track_input_events)) {
            Handler handler = InputTracker.handler;
            ((RootViewsSpy) Curtains.rootViewsSpy$delegate.getValue()).listeners.add(InputTracker.listener);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ((RootViewsSpy) Curtains.rootViewsSpy$delegate.getValue()).listeners.add(new OnRootViewAddedListener() { // from class: papa.internal.FrozenFrameOnTouchDetector$install$1
            @Override // curtains.OnRootViewAddedListener
            public final void onRootViewsChanged(View view, boolean z2) {
                view.getClass();
                if (z2) {
                    view.getClass();
                    final Window phoneWindow = WindowsKt.getPhoneWindow(view);
                    if (phoneWindow == null || JavaViewSpy.windowAttachCount(view) != 0) {
                        return;
                    }
                    Lazy lazy2 = WindowCallbackWrapper.jetpackWrapperClass$delegate;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) PapaEvent.getListeners(phoneWindow).socket;
                    final Ref$ObjectRef ref$ObjectRef3 = Ref$ObjectRef.this;
                    final Ref$IntRef ref$IntRef2 = ref$IntRef;
                    final Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
                    copyOnWriteArrayList.add(new TouchEventInterceptor() { // from class: papa.internal.FrozenFrameOnTouchDetector$install$1$$ExternalSyntheticLambda0
                        @Override // curtains.TouchEventInterceptor
                        public final DispatchState intercept(MotionEvent motionEvent, WindowCallbackWrapper$dispatchKeyEvent$dispatch$1 windowCallbackWrapper$dispatchKeyEvent$dispatch$1) {
                            String str;
                            String str2;
                            String str3;
                            motionEvent.getClass();
                            int action = motionEvent.getAction();
                            final Ref$ObjectRef ref$ObjectRef5 = Ref$ObjectRef.this;
                            final Ref$IntRef ref$IntRef3 = ref$IntRef2;
                            Window window = phoneWindow;
                            final Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef4;
                            int i = 0;
                            if (action == 0) {
                                if (ref$ObjectRef5.element != null) {
                                    ref$IntRef3.element++;
                                } else {
                                    final long uptimeMillis2 = SystemClock.uptimeMillis();
                                    if (uptimeMillis2 - motionEvent.getEventTime() > 700) {
                                        String obj = window.getAttributes().getTitle().toString();
                                        final String substringAfter = StringsKt.substringAfter(obj, "/", obj);
                                        ref$ObjectRef5.element = MotionEvent.obtain(motionEvent);
                                        Choreographers choreographers = Choreographers.INSTANCE;
                                        OnFrameRenderedListener onFrameRenderedListener = new OnFrameRenderedListener() { // from class: papa.internal.FrozenFrameOnTouchDetector$install$1$1$1$1
                                            @Override // papa.OnFrameRenderedListener
                                            /* renamed from: onFrameRendered-LRDsOJo */
                                            public final void mo4370onFrameRenderedLRDsOJo(long j) {
                                                Ref$ObjectRef ref$ObjectRef7 = Ref$ObjectRef.this;
                                                Object obj2 = ref$ObjectRef7.element;
                                                obj2.getClass();
                                                MotionEvent motionEvent2 = (MotionEvent) obj2;
                                                long eventTime = motionEvent2.getEventTime();
                                                long j2 = uptimeMillis2;
                                                long j3 = j2 - eventTime;
                                                long m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(j) - j2;
                                                PapaEventListener.Companion companion = PapaEventListener.Companion;
                                                Ref$IntRef ref$IntRef4 = ref$IntRef3;
                                                int i2 = ref$IntRef4.element;
                                                Ref$ObjectRef ref$ObjectRef8 = ref$ObjectRef6;
                                                PapaEvent.FrozenFrameOnTouch frozenFrameOnTouch = new PapaEvent.FrozenFrameOnTouch(substringAfter, i2, j3, m4167getInWholeMillisecondsimpl, (String) ref$ObjectRef8.element);
                                                companion.getClass();
                                                PapaEventListener.Companion.sendEvent$papa_release(frozenFrameOnTouch);
                                                motionEvent2.recycle();
                                                ref$ObjectRef7.element = null;
                                                ref$IntRef4.element = 0;
                                                ref$ObjectRef8.element = null;
                                            }
                                        };
                                        choreographers.getClass();
                                        AppUpdateData.onNextPreDraw(window, new Choreographers$$ExternalSyntheticLambda1(onFrameRenderedListener, i));
                                    }
                                }
                            }
                            DispatchState dispatchState = (DispatchState) windowCallbackWrapper$dispatchKeyEvent$dispatch$1.invoke(motionEvent);
                            int action2 = motionEvent.getAction();
                            Object obj2 = ref$ObjectRef5.element;
                            boolean z3 = obj2 != null && action2 == 0 && ref$IntRef3.element == 0;
                            if (obj2 != null && action2 == 1) {
                                long downTime = motionEvent.getDownTime();
                                Object obj3 = ref$ObjectRef5.element;
                                obj3.getClass();
                                if (downTime == ((MotionEvent) obj3).getEventTime()) {
                                    i = 1;
                                }
                            }
                            if (z3 || i != 0) {
                                View decorView = window.getDecorView();
                                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                                View findPressedView$papa_release = viewGroup != null ? UnsignedKt.findPressedView$papa_release(viewGroup) : null;
                                if (findPressedView$papa_release != null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(findPressedView$papa_release.getClass().getName());
                                    sb.append(' ');
                                    int id = findPressedView$papa_release.getId();
                                    if (id == -1) {
                                        str3 = "NO_ID";
                                    } else {
                                        Resources resources2 = findPressedView$papa_release.getResources();
                                        if (resources2 == null) {
                                            str2 = "UNKNOWN_ID_NO_RESOURCES ";
                                        } else if (id <= 0) {
                                            str2 = "UNKNOWN_ID_NEGATIVE ";
                                        } else if ((id >>> 24) == 0) {
                                            str2 = "UNKNOWN_ID_NO_PACKAGE ";
                                        } else {
                                            int i2 = (-16777216) & id;
                                            if (i2 == 16777216) {
                                                str = "android";
                                            } else if (i2 != 2130706432) {
                                                try {
                                                    str = resources2.getResourcePackageName(id);
                                                } catch (Resources.NotFoundException unused) {
                                                    str2 = "UNKNOWN_ID_NOT_FOUND ";
                                                }
                                            } else {
                                                str = "app";
                                            }
                                            str3 = str + ':' + resources2.getResourceTypeName(id) + '/' + resources2.getResourceEntryName(id);
                                        }
                                        str3 = Recorder$$ExternalSyntheticOutline1.m(id, JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(id, str2, " #"));
                                    }
                                    sb.append(str3);
                                    ref$ObjectRef6.element = sb.toString();
                                }
                            }
                            return dispatchState;
                        }
                    });
                }
            }
        });
        if (resources.getBoolean(R.bool.papa_spy_main_thread_messages)) {
            CopyOnWriteArrayList copyOnWriteArrayList = MainThreadMessageSpy.tracers;
            Handlers.checkOnMainThread();
            MainThreadMessageSpy.enabled = true;
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = true;
            Looper.getMainLooper().setMessageLogging(new Printer() { // from class: papa.MainThreadMessageSpy$$ExternalSyntheticLambda1
                @Override // android.util.Printer
                public final void println(String str) {
                    if (MainThreadMessageSpy.enabled) {
                        Ref$BooleanRef ref$BooleanRef2 = Ref$BooleanRef.this;
                        if (ref$BooleanRef2.element) {
                            MainThreadMessageSpy.currentMessageAsString = str;
                        }
                        Iterator it3 = MainThreadMessageSpy.tracers.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            MainThreadMessageSpy.Tracer tracer = (MainThreadMessageSpy.Tracer) it3.next();
                            str.getClass();
                            tracer.onMessageDispatch(str, ref$BooleanRef2.element);
                        }
                        boolean z2 = ref$BooleanRef2.element;
                        if (!z2) {
                            MainThreadMessageSpy.currentMessageAsString = null;
                        }
                        ref$BooleanRef2.element = !z2;
                    }
                }
            });
        }
        if (resources.getBoolean(R.bool.papa_track_main_thread_triggers)) {
            MainThreadMessageSpy.addTracer(new MainThreadTriggerTracer$$ExternalSyntheticLambda0(0, new Ref$ObjectRef()));
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - (SystemClock.elapsedRealtime() - myProcess$MyProcessData.processStartRealtimeMillis);
        Long valueOf = Long.valueOf(Process.getStartUptimeMillis() - uptimeMillis2);
        new Handler(Looper.getMainLooper()).post(new Perfs$$ExternalSyntheticLambda0(0));
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable unused) {
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            SharedPreferences sharedPreferences = application.getSharedPreferences("Perfs", 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            String string2 = sharedPreferences.getString("lastResumedState", null);
            AppVisibilityState appVisibilityState = string2 != null ? string2.equals("VISIBLE") ? AppVisibilityState.VISIBLE : AppVisibilityState.INVISIBLE : null;
            long j = sharedPreferences.getLong("lastResumedCurrentMillis", -1L);
            Long valueOf2 = j == -1 ? null : Long.valueOf(currentTimeMillis - j);
            long j2 = 0;
            if (Build.VERSION.SDK_INT >= 30) {
                Object systemService2 = application.getSystemService("activity");
                systemService2.getClass();
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) systemService2).getHistoricalProcessExitReasons(null, 0, 0);
                historicalProcessExitReasons.getClass();
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) CollectionsKt.firstOrNull((List) historicalProcessExitReasons);
                if (applicationExitInfo != null) {
                    j2 = currentTimeMillis - applicationExitInfo.getTimestamp();
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = myProcess$MyProcessData.info;
            long j3 = myProcess$MyProcessData.processStartRealtimeMillis;
            long j4 = classInitUptimeMillis - uptimeMillis2;
            long j5 = uptimeMillis - uptimeMillis2;
            int i = runningAppProcessInfo2.importance;
            int i2 = runningAppProcessInfo.importance;
            int i3 = runningAppProcessInfo2.importanceReasonCode;
            int i4 = runningAppProcessInfo2.importanceReasonPid;
            ComponentName componentName = runningAppProcessInfo2.importanceReasonComponent;
            String shortString = componentName != null ? componentName.toShortString() : null;
            Long valueOf3 = Long.valueOf(j2);
            ArrayList arrayList2 = myProcess$MyProcessData.appTasks;
            Long l = classLoaderInstantiatedUptimeMillis;
            Long valueOf4 = l != null ? Long.valueOf(l.longValue() - uptimeMillis2) : null;
            Long l2 = applicationInstantiatedUptimeMillis;
            Long valueOf5 = l2 != null ? Long.valueOf(l2.longValue() - uptimeMillis2) : null;
            AppUpdateData.NoAppUpdateDataYet noAppUpdateDataYet = AppUpdateData.NoAppUpdateDataYet.INSTANCE;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            appStartData = new AppStart$AppStartData(j3, uptimeMillis2, valueOf, j4, j5, i, i2, i3, i4, shortString, appVisibilityState, valueOf2, valueOf3, arrayList2, valueOf4, valueOf5, null, noAppUpdateDataYet, null, null, null, null, null, null, null, null, null, null, null, null, emptyMap);
            Looper.myQueue().addIdleHandler(new Perfs$$ExternalSyntheticLambda1());
            application.registerActivityLifecycleCallbacks(new PerfsActivityLifecycleCallbacks(new Perfs$$ExternalSyntheticLambda4(0), new Perfs$$ExternalSyntheticLambda2(sharedPreferences, 0), new Perfs$$ExternalSyntheticLambda3(j, appVisibilityState, uptimeMillis, elapsedRealtime)));
            Perfs$$ExternalSyntheticLambda4 perfs$$ExternalSyntheticLambda4 = new Perfs$$ExternalSyntheticLambda4(19);
            OkHttpCall.AnonymousClass1 anonymousClass1 = new OkHttpCall.AnonymousClass1(application);
            Executors.newSingleThreadExecutor(new AppUpdateDetector$Companion$$ExternalSyntheticLambda0()).execute(new Processor$$ExternalSyntheticLambda1(6, anonymousClass1, new Handler(Looper.getMainLooper()), perfs$$ExternalSyntheticLambda4));
            Thread.setDefaultUncaughtExceptionHandler(new CashApp$$ExternalSyntheticLambda0(anonymousClass1, Thread.getDefaultUncaughtExceptionHandler(), 1));
            Handlers.onCurrentMainThreadMessageFinished(new Handlers$$ExternalSyntheticLambda1(14));
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }
}
