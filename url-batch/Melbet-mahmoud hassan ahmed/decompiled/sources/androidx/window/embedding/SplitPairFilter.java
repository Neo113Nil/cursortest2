package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.i;
import l6.n;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplitPairFilter(ComponentName componentName, ComponentName componentName2, String str) {
        boolean z6;
        boolean z7;
        boolean r7;
        boolean r8;
        Object obj;
        CharSequence charSequence;
        String str2;
        boolean z8;
        int i7;
        boolean z9;
        boolean r9;
        boolean r10;
        i.d(componentName, "primaryActivityName");
        i.d(componentName2, "secondaryActivityName");
        this.primaryActivityName = componentName;
        this.secondaryActivityName = componentName2;
        this.secondaryActivityIntentAction = str;
        String packageName = componentName.getPackageName();
        i.c(packageName, "primaryActivityName.packageName");
        String className = componentName.getClassName();
        i.c(className, "primaryActivityName.className");
        String packageName2 = componentName2.getPackageName();
        i.c(packageName2, "secondaryActivityName.packageName");
        String className2 = componentName2.getClassName();
        i.c(className2, "secondaryActivityName.className");
        boolean z10 = true;
        if (!(packageName.length() == 0)) {
            if (!(packageName2.length() == 0)) {
                z6 = true;
                if (z6) {
                    throw new IllegalArgumentException("Package name must not be empty".toString());
                }
                if (!(className.length() == 0)) {
                    if (!(className2.length() == 0)) {
                        z7 = true;
                        if (z7) {
                            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
                        }
                        r7 = n.r(packageName, "*", false, 2, null);
                        if (!(!r7 || n.A(packageName, "*", 0, false, 6, null) == packageName.length() + (-1))) {
                            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                        }
                        r8 = n.r(className, "*", false, 2, null);
                        if (r8) {
                            obj = null;
                            i7 = 2;
                            charSequence = "*";
                            z8 = false;
                            str2 = className2;
                            if (n.A(className, "*", 0, false, 6, null) != className.length() - 1) {
                                z9 = false;
                                if (z9) {
                                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                                }
                                r9 = n.r(packageName2, charSequence, z8, i7, obj);
                                if (!(!r9 || n.A(packageName2, "*", 0, false, 6, null) == packageName2.length() + (-1))) {
                                    throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                                }
                                r10 = n.r(str2, charSequence, z8, i7, obj);
                                if (r10 && n.A(str2, "*", 0, false, 6, null) != str2.length() - 1) {
                                    z10 = false;
                                }
                                if (!z10) {
                                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                                }
                                return;
                            }
                        } else {
                            obj = null;
                            charSequence = "*";
                            str2 = className2;
                            z8 = false;
                            i7 = 2;
                        }
                        z9 = true;
                        if (z9) {
                        }
                    }
                }
                z7 = false;
                if (z7) {
                }
            }
        }
        z6 = false;
        if (z6) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return i.a(this.primaryActivityName, splitPairFilter.primaryActivityName) && i.a(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && i.a(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int hashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivityIntentPair(Activity activity, Intent intent) {
        i.d(activity, "primaryActivity");
        i.d(intent, "secondaryActivityIntent");
        ComponentName componentName = activity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(intent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || i.a(str, intent.getAction());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (matchesActivityIntentPair(r6, r7) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matchesActivityPair(Activity activity, Activity activity2) {
        i.d(activity, "primaryActivity");
        i.d(activity2, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean z6 = true;
        boolean z7 = matcherUtils.areComponentsMatching$window_release(activity.getComponentName(), this.primaryActivityName) && matcherUtils.areComponentsMatching$window_release(activity2.getComponentName(), this.secondaryActivityName);
        if (activity2.getIntent() == null) {
            return z7;
        }
        if (z7) {
            Intent intent = activity2.getIntent();
            i.c(intent, "secondaryActivity.intent");
        }
        z6 = false;
        return z6;
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
