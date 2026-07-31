package a3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.b43;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.rr2;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.z43;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e1 {
    public static Point a(MotionEvent motionEvent, View view) {
        int[] j7 = j(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - j7[0], ((int) motionEvent.getRawY()) - j7[1]);
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) sw.c().b(m10.P5)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject c(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e7) {
            e = e7;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", qw.b().b(context, point2.x));
                jSONObject3.put("y", qw.b().b(context, point2.y));
                jSONObject3.put("start_x", qw.b().b(context, point.x));
                jSONObject3.put("start_y", qw.b().b(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e8) {
                io0.e("Error occurred while putting signals into JSON object.", e8);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e9) {
            e = e9;
            jSONObject2 = jSONObject;
            io0.e("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static JSONObject d(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map.Entry<String, WeakReference<View>> entry;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] j7 = j(view);
        Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<View>> next = it.next();
            View view2 = next.getValue().get();
            if (view2 != null) {
                int[] j8 = j(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", qw.b().b(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", qw.b().b(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", qw.b().b(context, j8[0] - j7[0]));
                        jSONObject5.put("y", qw.b().b(context, j8[1] - j7[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = k(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", qw.b().b(context, j8[0] - j7[0]));
                            jSONObject2.put("y", qw.b().b(context, j8[1] - j7[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            entry = next;
                            jSONObject4.put("font_size", textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        } else {
                            entry = next;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                    } catch (JSONException unused) {
                        jSONObject = jSONObject6;
                    }
                } catch (JSONException unused2) {
                    jSONObject = jSONObject3;
                }
                try {
                    jSONObject.put(entry.getKey(), jSONObject4);
                } catch (JSONException unused3) {
                    io0.g("Unable to get asset views information");
                    jSONObject3 = jSONObject;
                    it = it2;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject e(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            y2.t.q();
            jSONObject.put("can_show_on_lock_screen", g2.b0(view));
            y2.t.q();
            jSONObject.put("is_keyguard_locked", g2.h(context));
        } catch (JSONException unused) {
            io0.g("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if ((r1 == null ? -1 : ((android.widget.AdapterView) r1).getPositionForView(r6)) != (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject f(View view) {
        boolean z6;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            z6 = false;
        } catch (Exception unused) {
        }
        if (((Boolean) sw.c().b(m10.M5)).booleanValue()) {
            y2.t.q();
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof ScrollView)) {
                parent = parent.getParent();
            }
            if (parent == null) {
                jSONObject.put("contained_in_scroll_view", z6);
                return jSONObject;
            }
            z6 = true;
            jSONObject.put("contained_in_scroll_view", z6);
            return jSONObject;
        }
        y2.t.q();
        ViewParent parent2 = view.getParent();
        while (parent2 != null && !(parent2 instanceof AdapterView)) {
            parent2 = parent2.getParent();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(10:44|45|21|22|23|(3:25|(1:29)|38)(3:39|(1:41)|38)|30|(1:(2:33|34)(1:36))|37|34)|20|21|22|23|(0)(0)|30|(0)|37|34) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0170, code lost:
    
        com.google.android.gms.internal.ads.io0.e("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0170 -> B:33:0x0175). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject g(Context context, View view) {
        String str;
        int hashCode;
        char c7;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] j7 = j(view);
            int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
            for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                iArr[1] = Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", qw.b().b(context, view.getMeasuredWidth()));
            jSONObject3.put("height", qw.b().b(context, view.getMeasuredHeight()));
            jSONObject3.put("x", qw.b().b(context, j7[0]));
            jSONObject3.put("y", qw.b().b(context, j7[1]));
            jSONObject3.put("maximum_visible_width", qw.b().b(context, iArr[0]));
            jSONObject3.put("maximum_visible_height", qw.b().b(context, iArr[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = k(context, rect);
            } else {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("width", 0);
                jSONObject4.put("height", 0);
                jSONObject4.put("x", qw.b().b(context, j7[0]));
                jSONObject4.put("y", qw.b().b(context, j7[1]));
                jSONObject4.put("relative_to", "window");
                jSONObject = jSONObject4;
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            io0.g("Unable to get native ad view bounding box");
        }
        if (((Boolean) sw.c().b(m10.G4)).booleanValue()) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (String) parent2.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent2, new Object[0]);
                } catch (IllegalAccessException e7) {
                    e = e7;
                    io0.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                    int i7 = 1;
                    if (c7 != 0) {
                    }
                    jSONObject2.put("native_template_type", i7);
                    return jSONObject2;
                } catch (NoSuchMethodException unused2) {
                } catch (SecurityException e8) {
                    e = e8;
                    io0.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                    int i72 = 1;
                    if (c7 != 0) {
                    }
                    jSONObject2.put("native_template_type", i72);
                    return jSONObject2;
                } catch (InvocationTargetException e9) {
                    e = e9;
                    io0.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                    int i722 = 1;
                    if (c7 != 0) {
                    }
                    jSONObject2.put("native_template_type", i722);
                    return jSONObject2;
                }
                hashCode = str.hashCode();
                if (hashCode != -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        c7 = 1;
                    }
                    c7 = 65535;
                } else {
                    if (str.equals("small_template")) {
                        c7 = 0;
                    }
                    c7 = 65535;
                }
                int i7222 = 1;
                if (c7 != 0) {
                    if (c7 != 1) {
                        jSONObject2.put("native_template_type", 0);
                    } else {
                        i7222 = 2;
                    }
                }
                jSONObject2.put("native_template_type", i7222);
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode != -2066603854) {
            }
            int i72222 = 1;
            if (c7 != 0) {
            }
            jSONObject2.put("native_template_type", i72222);
        }
        return jSONObject2;
    }

    public static boolean h(Context context, rr2 rr2Var) {
        if (!rr2Var.K) {
            return false;
        }
        if (((Boolean) sw.c().b(m10.N5)).booleanValue()) {
            return ((Boolean) sw.c().b(m10.Q5)).booleanValue();
        }
        String str = (String) sw.c().b(m10.O5);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator<String> it = z43.c(b43.b(';')).d(str).iterator();
            while (it.hasNext()) {
                if (it.next().equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(int i7) {
        if (((Boolean) sw.c().b(m10.f8195f2)).booleanValue()) {
            return ((Boolean) sw.c().b(m10.f8203g2)).booleanValue() || i7 <= 15299999;
        }
        return true;
    }

    public static int[] j(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject k(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", qw.b().b(context, rect.right - rect.left));
        jSONObject.put("height", qw.b().b(context, rect.bottom - rect.top));
        jSONObject.put("x", qw.b().b(context, rect.left));
        jSONObject.put("y", qw.b().b(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
