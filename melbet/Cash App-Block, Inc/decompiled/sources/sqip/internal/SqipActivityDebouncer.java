package sqip.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0010H\u0007J\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u0015H\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lsqip/internal/SqipActivityDebouncer;", "", "()V", "debouncedActivityIds", "", "", "", "Lsqip/internal/SqipActivityDebouncer$DebounceEntry;", "installed", "", "lifecycleCallbacks", "Lsqip/internal/SqipActivityDebouncer$LifecycleCallbacks;", "getLifecycleCallbacks$sqip_release$annotations", "getLifecycleCallbacks$sqip_release", "()Lsqip/internal/SqipActivityDebouncer$LifecycleCallbacks;", "clear", "", "activity", "Landroid/app/Activity;", "install", "parent", "Landroid/content/Context;", "classname", "", "reset", "findApplication", "Landroid/app/Application;", "DebounceEntry", "LifecycleCallbacks", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SqipActivityDebouncer {
    private static boolean installed;
    public static final SqipActivityDebouncer INSTANCE = new SqipActivityDebouncer();
    private static final Map<Integer, List<DebounceEntry>> debouncedActivityIds = new LinkedHashMap();
    private static final LifecycleCallbacks lifecycleCallbacks = new LifecycleCallbacks();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lsqip/internal/SqipActivityDebouncer$DebounceEntry;", "", "parent", "Landroid/content/Context;", "activityName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "activityId", "", "getActivityId", "()I", "getActivityName", "()Ljava/lang/String;", "getParent", "()Landroid/content/Context;", "equals", "", "other", "hashCode", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DebounceEntry {
        private final int activityId;
        private final String activityName;
        private final Context parent;

        public DebounceEntry(Context context, String str) {
            context.getClass();
            str.getClass();
            this.parent = context;
            this.activityName = str;
            this.activityId = System.identityHashCode(context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!DebounceEntry.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            other.getClass();
            DebounceEntry debounceEntry = (DebounceEntry) other;
            return Intrinsics.areEqual(this.parent, debounceEntry.parent) && Intrinsics.areEqual(this.activityName, debounceEntry.activityName);
        }

        public final int getActivityId() {
            return this.activityId;
        }

        public final String getActivityName() {
            return this.activityName;
        }

        public final Context getParent() {
            return this.parent;
        }

        public int hashCode() {
            return this.activityName.hashCode() + (this.activityId * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lsqip/internal/SqipActivityDebouncer$LifecycleCallbacks;", "Lsqip/internal/ActivityLifecycleCallbacksAdapter;", "()V", "onActivityResumed", "", "activity", "Landroid/app/Activity;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LifecycleCallbacks extends ActivityLifecycleCallbacksAdapter {
        @Override // sqip.internal.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
            SqipActivityDebouncer.INSTANCE.clear(activity);
        }
    }

    private SqipActivityDebouncer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clear(Activity activity) {
        debouncedActivityIds.remove(Integer.valueOf(System.identityHashCode(activity)));
    }

    private final Application findApplication(Context context) {
        boolean z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        while (true) {
            z = applicationContext instanceof Application;
            if (z || !(applicationContext instanceof ContextWrapper)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) applicationContext;
            if (Intrinsics.areEqual(contextWrapper.getBaseContext(), applicationContext)) {
                break;
            }
            applicationContext = contextWrapper.getBaseContext();
        }
        if (z) {
            return (Application) applicationContext;
        }
        return null;
    }

    public static /* synthetic */ void getLifecycleCallbacks$sqip_release$annotations() {
    }

    public final LifecycleCallbacks getLifecycleCallbacks$sqip_release() {
        return lifecycleCallbacks;
    }

    public final boolean install(Context parent, String classname) {
        parent.getClass();
        classname.getClass();
        if (!installed) {
            Application findApplication = findApplication(parent);
            if (findApplication == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Could not find valid application from context");
                return false;
            }
            findApplication.registerActivityLifecycleCallbacks(lifecycleCallbacks);
            installed = true;
        }
        DebounceEntry debounceEntry = new DebounceEntry(parent, classname);
        Map<Integer, List<DebounceEntry>> map = debouncedActivityIds;
        synchronized (map) {
            List<DebounceEntry> list = map.get(Integer.valueOf(debounceEntry.getActivityId()));
            if (list != null && list.contains(debounceEntry)) {
                return false;
            }
            if (list == null) {
                map.put(Integer.valueOf(debounceEntry.getActivityId()), new ArrayList());
            }
            List<DebounceEntry> list2 = map.get(Integer.valueOf(debounceEntry.getActivityId()));
            list2.getClass();
            list2.add(debounceEntry);
            return true;
        }
    }

    public final void reset() {
        installed = false;
        debouncedActivityIds.clear();
    }
}
