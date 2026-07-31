package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.jvm.internal.i;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> list, boolean z6) {
        i.d(list, "activities");
        this.activities = list;
        this.isEmpty = z6;
    }

    public /* synthetic */ ActivityStack(List list, boolean z6, int i7, kotlin.jvm.internal.e eVar) {
        this(list, (i7 & 2) != 0 ? false : z6);
    }

    public final boolean contains(Activity activity) {
        i.d(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return (i.a(this.activities, activityStack.activities) || this.isEmpty == activityStack.isEmpty) ? false : true;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(i.i("activities=", getActivities$window_release()));
        sb.append("isEmpty=" + this.isEmpty + '}');
        String sb2 = sb.toString();
        i.c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
