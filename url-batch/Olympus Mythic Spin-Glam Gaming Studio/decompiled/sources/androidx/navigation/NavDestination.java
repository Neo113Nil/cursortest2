package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public class NavDestination {
    private static final HashMap sClasses = new HashMap();
    private SparseArrayCompat mActions;
    private HashMap mArguments;
    private ArrayList mDeepLinks;
    private int mId;
    private String mIdName;
    private CharSequence mLabel;
    private final String mNavigatorName;
    private NavGraph mParent;

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface ClassType {
    }

    boolean supportsActions() {
        return true;
    }

    static class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination mDestination;
        private final boolean mHasMatchingAction;
        private final boolean mIsExactDeepLink;
        private final Bundle mMatchingArgs;
        private final int mMimeTypeMatchLevel;

        DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z, boolean z2, int i) {
            this.mDestination = navDestination;
            this.mMatchingArgs = bundle;
            this.mIsExactDeepLink = z;
            this.mHasMatchingAction = z2;
            this.mMimeTypeMatchLevel = i;
        }

        NavDestination getDestination() {
            return this.mDestination;
        }

        Bundle getMatchingArgs() {
            return this.mMatchingArgs;
        }

        @Override // java.lang.Comparable
        public int compareTo(DeepLinkMatch deepLinkMatch) {
            boolean z = this.mIsExactDeepLink;
            if (z && !deepLinkMatch.mIsExactDeepLink) {
                return 1;
            }
            if (!z && deepLinkMatch.mIsExactDeepLink) {
                return -1;
            }
            Bundle bundle = this.mMatchingArgs;
            if (bundle != null && deepLinkMatch.mMatchingArgs == null) {
                return 1;
            }
            if (bundle == null && deepLinkMatch.mMatchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - deepLinkMatch.mMatchingArgs.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.mHasMatchingAction;
            if (z2 && !deepLinkMatch.mHasMatchingAction) {
                return 1;
            }
            if (z2 || !deepLinkMatch.mHasMatchingAction) {
                return this.mMimeTypeMatchLevel - deepLinkMatch.mMimeTypeMatchLevel;
            }
            return -1;
        }
    }

    static String getDisplayName(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    public final Map getArguments() {
        HashMap hashMap = this.mArguments;
        return hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(hashMap);
    }

    public NavDestination(Navigator navigator) {
        this(NavigatorProvider.getNameForNavigator(navigator.getClass()));
    }

    public NavDestination(String str) {
        this.mNavigatorName = str;
    }

    public void onInflate(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.Navigator);
        setId(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.Navigator_android_id, 0));
        this.mIdName = getDisplayName(context, this.mId);
        setLabel(obtainAttributes.getText(androidx.navigation.common.R.styleable.Navigator_android_label));
        obtainAttributes.recycle();
    }

    final void setParent(NavGraph navGraph) {
        this.mParent = navGraph;
    }

    public final NavGraph getParent() {
        return this.mParent;
    }

    public final int getId() {
        return this.mId;
    }

    public final void setId(int i) {
        this.mId = i;
        this.mIdName = null;
    }

    public String getDisplayName() {
        if (this.mIdName == null) {
            this.mIdName = Integer.toString(this.mId);
        }
        return this.mIdName;
    }

    public final void setLabel(CharSequence charSequence) {
        this.mLabel = charSequence;
    }

    public final CharSequence getLabel() {
        return this.mLabel;
    }

    public final String getNavigatorName() {
        return this.mNavigatorName;
    }

    public final void addDeepLink(NavDeepLink navDeepLink) {
        if (this.mDeepLinks == null) {
            this.mDeepLinks = new ArrayList();
        }
        this.mDeepLinks.add(navDeepLink);
    }

    DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        ArrayList arrayList = this.mDeepLinks;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        DeepLinkMatch deepLinkMatch = null;
        while (it.hasNext()) {
            NavDeepLink navDeepLink = (NavDeepLink) it.next();
            Uri uri = navDeepLinkRequest.getUri();
            Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, getArguments()) : null;
            String action = navDeepLinkRequest.getAction();
            boolean z = action != null && action.equals(navDeepLink.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
            if (matchingArguments != null || z || mimeTypeMatchRating > -1) {
                DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, matchingArguments, navDeepLink.isExactDeepLink(), z, mimeTypeMatchRating);
                if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                    deepLinkMatch = deepLinkMatch2;
                }
            }
        }
        return deepLinkMatch;
    }

    int[] buildDeepLinkIds() {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavDestination navDestination = this;
        while (true) {
            NavGraph parent = navDestination.getParent();
            if (parent == null || parent.getStartDestination() != navDestination.getId()) {
                arrayDeque.addFirst(navDestination);
            }
            if (parent == null) {
                break;
            }
            navDestination = parent;
        }
        int[] iArr = new int[arrayDeque.size()];
        Iterator it = arrayDeque.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((NavDestination) it.next()).getId();
            i++;
        }
        return iArr;
    }

    public final NavAction getAction(int i) {
        SparseArrayCompat sparseArrayCompat = this.mActions;
        NavAction navAction = sparseArrayCompat == null ? null : (NavAction) sparseArrayCompat.get(i);
        if (navAction != null) {
            return navAction;
        }
        if (getParent() != null) {
            return getParent().getAction(i);
        }
        return null;
    }

    public final void putAction(int i, NavAction navAction) {
        if (supportsActions()) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            if (this.mActions == null) {
                this.mActions = new SparseArrayCompat();
            }
            this.mActions.put(i, navAction);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void addArgument(String str, NavArgument navArgument) {
        if (this.mArguments == null) {
            this.mArguments = new HashMap();
        }
        this.mArguments.put(str, navArgument);
    }

    Bundle addInDefaultArgs(Bundle bundle) {
        HashMap hashMap;
        if (bundle == null && ((hashMap = this.mArguments) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap hashMap2 = this.mArguments;
        if (hashMap2 != null) {
            for (Map.Entry entry : hashMap2.entrySet()) {
                ((NavArgument) entry.getValue()).putDefaultValue((String) entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap hashMap3 = this.mArguments;
            if (hashMap3 != null) {
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    if (!((NavArgument) entry2.getValue()).verify((String) entry2.getKey(), bundle2)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + ((String) entry2.getKey()) + "' in argument bundle. " + ((NavArgument) entry2.getValue()).getType().getName() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.mIdName;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.mId));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.mLabel != null) {
            sb.append(" label=");
            sb.append(this.mLabel);
        }
        return sb.toString();
    }
}
