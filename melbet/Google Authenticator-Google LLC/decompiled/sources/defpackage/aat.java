package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aat {
    public static void a(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static boolean b(CharSequence charSequence, int i, int i2) {
        return i2 != 0 ? Character.isHighSurrogate(charSequence.charAt(i)) : Character.isLowSurrogate(charSequence.charAt(i));
    }

    public static int c(Context context, String str) {
        boolean areNotificationsEnabled;
        a.v(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        int i = uk.a;
        areNotificationsEnabled = ((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled();
        return areNotificationsEnabled ? 0 : -1;
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        Object obj;
        evt evtVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        ThreadLocal threadLocal = uy.a;
        uv uvVar = new uv(resources, theme2);
        synchronized (uy.c) {
            SparseArray sparseArray = (SparseArray) uy.b.get(uvVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (evtVar = (evt) sparseArray.get(i)) != null) {
                if (!((Configuration) evtVar.b).equals(uvVar.a.getConfiguration()) || (!((theme = uvVar.b) == null && evtVar.a == 0) && (theme == null || evtVar.a != theme.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    obj = evtVar.c;
                }
            }
            obj = null;
        }
        if (obj == null) {
            ThreadLocal threadLocal2 = uy.a;
            TypedValue typedValue = (TypedValue) threadLocal2.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal2.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                try {
                    colorStateList = ut.a(resources, resources.getXml(i), theme2);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList != null) {
                synchronized (uy.c) {
                    WeakHashMap weakHashMap = uy.b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(uvVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(uvVar, sparseArray2);
                    }
                    sparseArray2.append(i, new evt(colorStateList, uvVar.a.getConfiguration(), theme2));
                }
                obj = colorStateList;
            } else {
                obj = resources.getColorStateList(i, theme2);
            }
        }
        return (ColorStateList) obj;
    }
}
