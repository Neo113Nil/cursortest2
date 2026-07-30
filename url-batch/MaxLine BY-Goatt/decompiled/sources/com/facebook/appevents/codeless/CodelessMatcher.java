package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.CodelessLoggingEventListener;
import com.facebook.appevents.codeless.RCTCodelessLoggingEventListener;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ParameterComponent;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.k3;
import defpackage.tp2;
import defpackage.up2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CodelessMatcher {
    private static final String CURRENT_CLASS_NAME = ".";
    private static final String PARENT_CLASS_NAME = "..";
    private static CodelessMatcher codelessMatcher;
    private final Set<Activity> activitiesSet;
    private final HashMap<Integer, HashSet<String>> activityToListenerMap;
    private HashSet<String> listenerSet;
    private final Handler uiThreadHandler;
    private final Set<ViewMatcher> viewMatchers;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = CodelessMatcher.class.getCanonicalName();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class MatchedView {
        private final WeakReference<View> view;
        private final String viewMapKey;

        public MatchedView(View view, String str) {
            view.getClass();
            str.getClass();
            this.view = new WeakReference<>(view);
            this.viewMapKey = str;
        }

        public final View getView() {
            WeakReference<View> weakReference = this.view;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final String getViewMapKey() {
            return this.viewMapKey;
        }
    }

    private CodelessMatcher() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        newSetFromMap.getClass();
        this.activitiesSet = newSetFromMap;
        this.viewMatchers = new LinkedHashSet();
        this.listenerSet = new HashSet<>();
        this.activityToListenerMap = new HashMap<>();
    }

    public static final /* synthetic */ CodelessMatcher access$getCodelessMatcher$cp() {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return null;
        }
        try {
            return codelessMatcher;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setCodelessMatcher$cp(CodelessMatcher codelessMatcher2) {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return;
        }
        try {
            codelessMatcher = codelessMatcher2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
        }
    }

    public static final synchronized CodelessMatcher getInstance() {
        synchronized (CodelessMatcher.class) {
            if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
                return null;
            }
            try {
                return Companion.getInstance();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
                return null;
            }
        }
    }

    public static final Bundle getParameters(EventBinding eventBinding, View view, View view2) {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return null;
        }
        try {
            return Companion.getParameters(eventBinding, view, view2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
            return null;
        }
    }

    private final void matchViews() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            for (Activity activity : this.activitiesSet) {
                if (activity != null) {
                    this.viewMatchers.add(new ViewMatcher(AppEventUtility.getRootView(activity), this.uiThreadHandler, this.listenerSet, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void startTracking() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                matchViews();
            } else {
                this.uiThreadHandler.post(new k3(8, this));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTracking$lambda$1(CodelessMatcher codelessMatcher2) {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return;
        }
        try {
            codelessMatcher2.getClass();
            codelessMatcher2.matchViews();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
        }
    }

    public final void add(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            activity.getClass();
            if (InternalSettings.isUnityApp()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.add(activity);
            this.listenerSet.clear();
            HashSet<String> hashSet = this.activityToListenerMap.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.listenerSet = hashSet;
            }
            startTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void destroy(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            activity.getClass();
            this.activityToListenerMap.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void remove(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            activity.getClass();
            if (InternalSettings.isUnityApp()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.remove(activity);
            this.viewMatchers.clear();
            HashMap<Integer, HashSet<String>> hashMap = this.activityToListenerMap;
            Integer valueOf = Integer.valueOf(activity.hashCode());
            Object clone = this.listenerSet.clone();
            clone.getClass();
            hashMap.put(valueOf, (HashSet) clone);
            this.listenerSet.clear();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class ViewMatcher implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        public static final Companion Companion = new Companion(null);
        private final String activityName;
        private List<EventBinding> eventBindings;
        private final Handler handler;
        private final HashSet<String> listenerSet;
        private final WeakReference<View> rootView;

        public ViewMatcher(View view, Handler handler, HashSet<String> hashSet, String str) {
            handler.getClass();
            hashSet.getClass();
            str.getClass();
            this.rootView = new WeakReference<>(view);
            this.handler = handler;
            this.listenerSet = hashSet;
            this.activityName = str;
            handler.postDelayed(this, 200L);
        }

        private final void attachListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            if (eventBinding == null) {
                return;
            }
            try {
                View view2 = matchedView.getView();
                if (view2 == null) {
                    return;
                }
                View findRCTRootView = ViewHierarchy.findRCTRootView(view2);
                if (findRCTRootView != null && ViewHierarchy.INSTANCE.isRCTButton(view2, findRCTRootView)) {
                    attachRCTListener(matchedView, view, eventBinding);
                    return;
                }
                if (tp2.o(view2.getClass().getName(), "com.facebook.react", false)) {
                    return;
                }
                if (!(view2 instanceof AdapterView)) {
                    attachOnClickListener(matchedView, view, eventBinding);
                } else if (view2 instanceof ListView) {
                    attachOnItemClickListener(matchedView, view, eventBinding);
                }
            } catch (Exception e) {
                Utility.logd(CodelessMatcher.access$getTAG$cp(), e);
            }
        }

        private final void attachOnClickListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            View view2 = matchedView.getView();
            if (view2 == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            View.OnClickListener existingOnClickListener = ViewHierarchy.getExistingOnClickListener(view2);
            boolean z = (existingOnClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnClickListener) && ((CodelessLoggingEventListener.AutoLoggingOnClickListener) existingOnClickListener).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z) {
                return;
            }
            view2.setOnClickListener(CodelessLoggingEventListener.getOnClickListener(eventBinding, view, view2));
            this.listenerSet.add(viewMapKey);
        }

        private final void attachOnItemClickListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            AdapterView adapterView = (AdapterView) matchedView.getView();
            if (adapterView == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean z = (onItemClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnItemClickListener) && ((CodelessLoggingEventListener.AutoLoggingOnItemClickListener) onItemClickListener).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z) {
                return;
            }
            adapterView.setOnItemClickListener(CodelessLoggingEventListener.getOnItemClickListener(eventBinding, view, adapterView));
            this.listenerSet.add(viewMapKey);
        }

        private final void attachRCTListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            View view2 = matchedView.getView();
            if (view2 == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            View.OnTouchListener existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(view2);
            boolean z = (existingOnTouchListener instanceof RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) && ((RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) existingOnTouchListener).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z) {
                return;
            }
            view2.setOnTouchListener(RCTCodelessLoggingEventListener.getOnTouchListener(eventBinding, view, view2));
            this.listenerSet.add(viewMapKey);
        }

        private final void findView(EventBinding eventBinding, View view) {
            if (eventBinding == null || view == null) {
                return;
            }
            String activityName = eventBinding.getActivityName();
            if (activityName == null || activityName.length() == 0 || Intrinsics.b(eventBinding.getActivityName(), this.activityName)) {
                List<PathComponent> viewPath = eventBinding.getViewPath();
                if (viewPath.size() > 25) {
                    return;
                }
                Iterator<MatchedView> it = Companion.findViewByPath(eventBinding, view, viewPath, 0, -1, this.activityName).iterator();
                while (it.hasNext()) {
                    attachListener(it.next(), view, eventBinding);
                }
            }
        }

        public static final List<MatchedView> findViewByPath(EventBinding eventBinding, View view, List<PathComponent> list, int i, int i2, String str) {
            return Companion.findViewByPath(eventBinding, view, list, i, i2, str);
        }

        private final void startMatch() {
            List<EventBinding> list = this.eventBindings;
            if (list == null || this.rootView.get() == null) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                findView(list.get(i), this.rootView.get());
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            startMatch();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            startMatch();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
                    if (appSettingsWithoutQuery != null && appSettingsWithoutQuery.getCodelessEventsEnabled()) {
                        List<EventBinding> parseArray = EventBinding.Companion.parseArray(appSettingsWithoutQuery.getEventBindings());
                        this.eventBindings = parseArray;
                        if (parseArray != null && (view = this.rootView.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            startMatch();
                        }
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final List<View> findVisibleChildren(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
            
                if (r5.getClass().getSimpleName().equals((java.lang.String) r4.get(r4.size() - 1)) == false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.b(r4, r3) == false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00dd, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.b(r4, r3) == false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.b(r4, r3) == false) goto L56;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final boolean isTheSameView(View view, PathComponent pathComponent, int i) {
                if (pathComponent.getIndex() == -1 || i == pathComponent.getIndex()) {
                    if (!Intrinsics.b(view.getClass().getCanonicalName(), pathComponent.getClassName())) {
                        if (new Regex(".*android\\..*").a(pathComponent.getClassName())) {
                            List F = up2.F(0, 6, pathComponent.getClassName(), new String[]{CodelessMatcher.CURRENT_CLASS_NAME});
                            if (!F.isEmpty()) {
                            }
                        }
                    }
                    if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.ID.getValue()) <= 0 || pathComponent.getId() == view.getId()) {
                        if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.TEXT.getValue()) > 0) {
                            String text = pathComponent.getText();
                            String textOfView = ViewHierarchy.getTextOfView(view);
                            String coerceValueIfNullOrEmpty = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(textOfView), BuildConfig.FLAVOR);
                            if (!Intrinsics.b(text, textOfView)) {
                            }
                        }
                        if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                            String description = pathComponent.getDescription();
                            String obj = view.getContentDescription() == null ? BuildConfig.FLAVOR : view.getContentDescription().toString();
                            String coerceValueIfNullOrEmpty2 = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(obj), BuildConfig.FLAVOR);
                            if (!Intrinsics.b(description, obj)) {
                            }
                        }
                        if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) > 0) {
                            String hint = pathComponent.getHint();
                            String hintOfView = ViewHierarchy.getHintOfView(view);
                            String coerceValueIfNullOrEmpty3 = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(hintOfView), BuildConfig.FLAVOR);
                            if (!Intrinsics.b(hint, hintOfView)) {
                            }
                        }
                        if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                            String tag = pathComponent.getTag();
                            String obj2 = view.getTag() == null ? BuildConfig.FLAVOR : view.getTag().toString();
                            String coerceValueIfNullOrEmpty4 = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(obj2), BuildConfig.FLAVOR);
                            if (Intrinsics.b(tag, obj2) || Intrinsics.b(tag, coerceValueIfNullOrEmpty4)) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            }

            public final List<MatchedView> findViewByPath(EventBinding eventBinding, View view, List<PathComponent> list, int i, int i2, String str) {
                EventBinding eventBinding2;
                List<PathComponent> list2;
                Companion companion;
                list.getClass();
                str.getClass();
                String str2 = str + '.' + i2;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (i >= list.size()) {
                        arrayList.add(new MatchedView(view, str2));
                        eventBinding2 = eventBinding;
                        list2 = list;
                        companion = this;
                    } else {
                        PathComponent pathComponent = list.get(i);
                        if (Intrinsics.b(pathComponent.getClassName(), CodelessMatcher.PARENT_CLASS_NAME)) {
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                List<View> findVisibleChildren = findVisibleChildren((ViewGroup) parent);
                                int size = findVisibleChildren.size();
                                int i3 = 0;
                                while (i3 < size) {
                                    Companion companion2 = this;
                                    EventBinding eventBinding3 = eventBinding;
                                    arrayList.addAll(companion2.findViewByPath(eventBinding3, findVisibleChildren.get(i3), list, i + 1, i3, str2));
                                    i3++;
                                    this = companion2;
                                    eventBinding = eventBinding3;
                                }
                            }
                        } else {
                            eventBinding2 = eventBinding;
                            list2 = list;
                            companion = this;
                            if (Intrinsics.b(pathComponent.getClassName(), CodelessMatcher.CURRENT_CLASS_NAME)) {
                                arrayList.add(new MatchedView(view, str2));
                                return arrayList;
                            }
                            if (companion.isTheSameView(view, pathComponent, i2)) {
                                if (i == list2.size() - 1) {
                                    arrayList.add(new MatchedView(view, str2));
                                }
                            }
                        }
                    }
                    if (view instanceof ViewGroup) {
                        List<View> findVisibleChildren2 = companion.findVisibleChildren((ViewGroup) view);
                        int size2 = findVisibleChildren2.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Companion companion3 = companion;
                            arrayList.addAll(companion3.findViewByPath(eventBinding2, findVisibleChildren2.get(i4), list2, i + 1, i4, str2));
                            i4++;
                            companion = companion3;
                        }
                    }
                }
                return arrayList;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized CodelessMatcher getInstance() {
            CodelessMatcher access$getCodelessMatcher$cp;
            try {
                if (CodelessMatcher.access$getCodelessMatcher$cp() == null) {
                    CodelessMatcher.access$setCodelessMatcher$cp(new CodelessMatcher(null));
                }
                access$getCodelessMatcher$cp = CodelessMatcher.access$getCodelessMatcher$cp();
                access$getCodelessMatcher$cp.getClass();
            } catch (Throwable th) {
                throw th;
            }
            return access$getCodelessMatcher$cp;
        }

        public final Bundle getParameters(EventBinding eventBinding, View view, View view2) {
            List<ParameterComponent> viewParameters;
            EventBinding eventBinding2;
            View view3;
            List<MatchedView> findViewByPath;
            view.getClass();
            view2.getClass();
            Bundle bundle = new Bundle();
            if (eventBinding != null && (viewParameters = eventBinding.getViewParameters()) != null) {
                for (ParameterComponent parameterComponent : viewParameters) {
                    if (parameterComponent.getValue() != null && parameterComponent.getValue().length() > 0) {
                        bundle.putString(parameterComponent.getName(), parameterComponent.getValue());
                    } else if (parameterComponent.getPath().size() > 0) {
                        if (Intrinsics.b(parameterComponent.getPathType(), Constants.PATH_TYPE_RELATIVE)) {
                            EventBinding eventBinding3 = eventBinding;
                            findViewByPath = ViewMatcher.Companion.findViewByPath(eventBinding3, view2, parameterComponent.getPath(), 0, -1, view2.getClass().getSimpleName());
                            eventBinding2 = eventBinding3;
                            view3 = view;
                        } else {
                            eventBinding2 = eventBinding;
                            view3 = view;
                            findViewByPath = ViewMatcher.Companion.findViewByPath(eventBinding2, view3, parameterComponent.getPath(), 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator<MatchedView> it = findViewByPath.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MatchedView next = it.next();
                            if (next.getView() != null) {
                                String textOfView = ViewHierarchy.getTextOfView(next.getView());
                                if (textOfView.length() > 0) {
                                    bundle.putString(parameterComponent.getName(), textOfView);
                                    break;
                                }
                            }
                        }
                        eventBinding = eventBinding2;
                        view = view3;
                    }
                }
            }
            return bundle;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CodelessMatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
