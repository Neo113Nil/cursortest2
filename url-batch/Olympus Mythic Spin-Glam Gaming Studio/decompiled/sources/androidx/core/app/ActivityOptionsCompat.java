package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes8.dex */
public class ActivityOptionsCompat {
    public Bundle toBundle() {
        return null;
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int i2) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    private static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        private final ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }
    }

    protected ActivityOptionsCompat() {
    }

    @RequiresApi
    static class Api23Impl {
        @DoNotInline
        static ActivityOptions makeClipRevealAnimation(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4);
        }

        @DoNotInline
        static ActivityOptions makeBasic() {
            return ActivityOptions.makeBasic();
        }

        @DoNotInline
        static void requestUsageTimeReport(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static ActivityOptions makeSceneTransitionAnimation(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @DoNotInline
        static ActivityOptions makeSceneTransitionAnimation(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @DoNotInline
        static ActivityOptions makeTaskLaunchBehind() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static ActivityOptions setLaunchBounds(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }

        @DoNotInline
        static Rect getLaunchBounds(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }
    }

    @RequiresApi
    static class Api34Impl {
        @DoNotInline
        static ActivityOptions setShareIdentityEnabled(ActivityOptions activityOptions, boolean z) {
            return activityOptions.setShareIdentityEnabled(z);
        }
    }
}
