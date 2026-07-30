package com.facebook.appevents.aam;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.up2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MetadataMatcher {
    public static final MetadataMatcher INSTANCE = new MetadataMatcher();
    private static final int MAX_INDICATOR_LENGTH = 100;

    private MetadataMatcher() {
    }

    public static final List<String> getAroundViewIndicators(View view) {
        if (CrashShieldHandler.isObjectCrashing(MetadataMatcher.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList arrayList = new ArrayList();
            ViewGroup parentOfView = ViewHierarchy.getParentOfView(view);
            if (parentOfView != null) {
                for (View view2 : ViewHierarchy.getChildrenOfView(parentOfView)) {
                    if (view != view2) {
                        arrayList.addAll(INSTANCE.getTextIndicators(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataMatcher.class);
            return null;
        }
    }

    public static final List<String> getCurrentViewIndicators(View view) {
        if (CrashShieldHandler.isObjectCrashing(MetadataMatcher.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ViewHierarchy.getHintOfView(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            int i = 0;
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    resourceName.getClass();
                    String[] strArr = (String[]) new Regex("/").b(resourceName).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                if (str.length() > 0 && str.length() <= MAX_INDICATOR_LENGTH) {
                    String lowerCase = str.toLowerCase();
                    lowerCase.getClass();
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataMatcher.class);
            return null;
        }
    }

    private final List<String> getTextIndicators(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() <= 0) {
                    return arrayList;
                }
                if (obj.length() < MAX_INDICATOR_LENGTH) {
                    String lowerCase = obj.toLowerCase();
                    lowerCase.getClass();
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator<View> it = ViewHierarchy.getChildrenOfView(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(getTextIndicators(it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final boolean matchIndicator(List<String> list, List<String> list2) {
        if (CrashShieldHandler.isObjectCrashing(MetadataMatcher.class)) {
            return false;
        }
        try {
            list.getClass();
            list2.getClass();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (INSTANCE.matchIndicator(it.next(), list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataMatcher.class);
            return false;
        }
    }

    public static final boolean matchValue(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(MetadataMatcher.class)) {
            return false;
        }
        try {
            str.getClass();
            str2.getClass();
            return new Regex(str2).a(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataMatcher.class);
            return false;
        }
    }

    private final boolean matchIndicator(String str, List<String> list) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (up2.q(str, it.next())) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return false;
            }
        }
        return false;
    }
}
