package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.i;
import l6.m;
import l6.n;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean wildcardMatch(String str, String str2) {
        boolean r7;
        boolean z6;
        boolean o7;
        boolean k7;
        r7 = n.r(str2, "*", false, 2, null);
        if (!r7) {
            return false;
        }
        if (i.a(str2, "*")) {
            return true;
        }
        if (n.A(str2, "*", 0, false, 6, null) == n.F(str2, "*", 0, false, 6, null)) {
            k7 = m.k(str2, "*", false, 2, null);
            if (k7) {
                z6 = true;
                if (z6) {
                    throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
                }
                String substring = str2.substring(0, str2.length() - 1);
                i.c(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                o7 = m.o(str, substring, false, 2, null);
                return o7;
            }
        }
        z6 = false;
        if (z6) {
        }
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName componentName) {
        ComponentName component;
        i.d(activity, "activity");
        i.d(componentName, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), componentName)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, componentName);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean areComponentsMatching$window_release(ComponentName componentName, ComponentName componentName2) {
        boolean r7;
        boolean z6;
        boolean z7;
        i.d(componentName2, "ruleComponent");
        if (componentName == null) {
            return i.a(componentName2.getPackageName(), "*") && i.a(componentName2.getClassName(), "*");
        }
        String componentName3 = componentName.toString();
        i.c(componentName3, "activityComponent.toString()");
        r7 = n.r(componentName3, "*", false, 2, null);
        if (!(!r7)) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
        }
        if (!i.a(componentName.getPackageName(), componentName2.getPackageName())) {
            String packageName = componentName.getPackageName();
            i.c(packageName, "activityComponent.packageName");
            String packageName2 = componentName2.getPackageName();
            i.c(packageName2, "ruleComponent.packageName");
            if (!wildcardMatch(packageName, packageName2)) {
                z6 = false;
                if (!i.a(componentName.getClassName(), componentName2.getClassName())) {
                    String className = componentName.getClassName();
                    i.c(className, "activityComponent.className");
                    String className2 = componentName2.getClassName();
                    i.c(className2, "ruleComponent.className");
                    if (!wildcardMatch(className, className2)) {
                        z7 = false;
                        return !z6 && z7;
                    }
                }
                z7 = true;
                if (z6) {
                }
            }
        }
        z6 = true;
        if (!i.a(componentName.getClassName(), componentName2.getClassName())) {
        }
        z7 = true;
        if (z6) {
        }
    }
}
