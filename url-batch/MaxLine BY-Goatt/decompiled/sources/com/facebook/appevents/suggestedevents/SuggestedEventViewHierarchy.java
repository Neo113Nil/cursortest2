package com.facebook.appevents.suggestedevents;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.qv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class SuggestedEventViewHierarchy {
    public static final SuggestedEventViewHierarchy INSTANCE = new SuggestedEventViewHierarchy();
    private static final List<Class<? extends View>> blacklistedViews = qv.g(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    private SuggestedEventViewHierarchy() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r5.isClickable() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r5 = com.facebook.appevents.codeless.internal.ViewHierarchy.getChildrenOfView(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r5.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        r1.addAll(getAllClickableViews(r5.next()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<View> getAllClickableViews(View view) {
        if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = blacklistedViews.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().isInstance(view)) {
                    break;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SuggestedEventViewHierarchy.class);
            return null;
        }
    }

    public static final JSONObject getDictionaryOfView(View view, View view2) {
        if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
            return null;
        }
        try {
            view.getClass();
            view2.getClass();
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put(ViewHierarchyConstants.IS_INTERACTED_KEY, true);
                } catch (JSONException unused) {
                }
            }
            updateBasicInfo(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<View> it = ViewHierarchy.getChildrenOfView(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(getDictionaryOfView(it.next(), view2));
            }
            jSONObject.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SuggestedEventViewHierarchy.class);
            return null;
        }
    }

    private final List<String> getTextOfChildren(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : ViewHierarchy.getChildrenOfView(view)) {
                String textOfView = ViewHierarchy.getTextOfView(view2);
                if (textOfView.length() > 0) {
                    arrayList.add(textOfView);
                }
                arrayList.addAll(getTextOfChildren(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final String getTextOfViewRecursively(View view) {
        if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
            return null;
        }
        try {
            view.getClass();
            String textOfView = ViewHierarchy.getTextOfView(view);
            if (textOfView.length() > 0) {
                return textOfView;
            }
            String join = TextUtils.join(" ", INSTANCE.getTextOfChildren(view));
            join.getClass();
            return join;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SuggestedEventViewHierarchy.class);
            return null;
        }
    }

    public static final void updateBasicInfo(View view, JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
            return;
        }
        try {
            view.getClass();
            jSONObject.getClass();
            try {
                String textOfView = ViewHierarchy.getTextOfView(view);
                String hintOfView = ViewHierarchy.getHintOfView(view);
                jSONObject.put(ViewHierarchyConstants.CLASS_NAME_KEY, view.getClass().getSimpleName());
                jSONObject.put(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY, ViewHierarchy.getClassTypeBitmask(view));
                if (textOfView.length() > 0) {
                    jSONObject.put("text", textOfView);
                }
                if (hintOfView.length() > 0) {
                    jSONObject.put(ViewHierarchyConstants.HINT_KEY, hintOfView);
                }
                if (view instanceof EditText) {
                    jSONObject.put(ViewHierarchyConstants.INPUT_TYPE_KEY, ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SuggestedEventViewHierarchy.class);
        }
    }
}
