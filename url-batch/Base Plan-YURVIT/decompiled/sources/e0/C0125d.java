package e0;

import B0.C0000a;
import B0.C0008i;
import B0.E;
import F0.i;
import P0.h;
import a.AbstractC0086a;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import androidx.datastore.preferences.protobuf.k0;
import com.crane.slab.beam.R;
import e.AbstractC0121a;
import g0.C0131a;
import g0.C0132b;
import h0.ServiceConnectionC0145a;
import i.AbstractC0178z;
import i.C0168o;
import i.P;
import i.h0;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r.AbstractC0222a;
import u.AbstractC0228a;
import u0.k;
import y0.C0278a;

/* renamed from: e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125d implements InterfaceC0124c {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1858b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1859c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1860d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1861e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1862f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1863g;

    public C0125d(int i2) {
        switch (i2) {
            case 1:
                this.f1858b = new int[]{2131165267, 2131165265, 2131165184};
                this.f1859c = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
                this.f1860d = new int[]{2131165264, 2131165266, 2131165201, R.drawable.abc_text_cursor_material, 2131165258, 2131165260, 2131165262, 2131165259, 2131165261, 2131165263};
                this.f1861e = new int[]{2131165239, R.drawable.abc_cab_background_internal_bg, 2131165238};
                this.f1862f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f1863g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            default:
                E e2 = new E(16);
                E e3 = new E(18);
                C0000a c0000a = new C0000a(20);
                C0000a c0000a2 = new C0000a(19);
                C0000a c0000a3 = new C0000a(21);
                this.f1858b = e2;
                this.f1859c = e3;
                this.f1860d = c0000a;
                this.f1861e = c0000a2;
                this.f1862f = c0000a3;
                break;
        }
    }

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i2) {
        int b2 = h0.b(context, R.attr.colorControlHighlight);
        int a2 = h0.a(context, R.attr.colorButtonNormal);
        int[] iArr = h0.f2221b;
        int[] iArr2 = h0.f2223d;
        int a3 = AbstractC0222a.a(b2, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, h0.f2222c, h0.f2225f}, new int[]{a2, a3, AbstractC0222a.a(b2, i2), i2});
    }

    public static void i(Drawable drawable, int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        if (AbstractC0178z.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0168o.f2275b;
        }
        PorterDuff.Mode mode2 = C0168o.f2275b;
        synchronized (C0168o.class) {
            e2 = P.e(i2, mode);
        }
        drawable.setColorFilter(e2);
    }

    public void b() {
        ComponentName componentName;
        ComponentName componentName2;
        ComponentName componentName3;
        ResolveInfo resolveService;
        PackageManager.ResolveInfoFlags of;
        Activity activity = (Activity) this.f1863g;
        if (activity == null) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) p.b.b(activity, ActivityManager.class);
        ComponentName componentName4 = new ComponentName(activity, activity.getClass());
        if (activityManager == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Iterator<ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            componentName = taskInfo.baseActivity;
            if (componentName4.equals(componentName)) {
                componentName2 = taskInfo.topActivity;
                if (componentName2 == null) {
                    continue;
                } else {
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    componentName3 = taskInfo.topActivity;
                    Intent intent2 = intent.setPackage(componentName3 != null ? componentName3.getPackageName() : null);
                    h.d(intent2, "setPackage(...)");
                    PackageManager packageManager = activity.getPackageManager();
                    h.d(packageManager, "getPackageManager(...)");
                    if (Build.VERSION.SDK_INT >= 33) {
                        of = PackageManager.ResolveInfoFlags.of(0);
                        resolveService = packageManager.resolveService(intent2, of);
                    } else {
                        resolveService = packageManager.resolveService(intent2, 0);
                    }
                    if (resolveService != null) {
                        try {
                            Intent flags = new Intent(activity, activity.getClass()).setFlags(603979776);
                            h.d(flags, "setFlags(...)");
                            activity.startActivity(flags);
                            return;
                        } catch (ActivityNotFoundException unused) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public ColorStateList d(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0121a.f1852a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i2 == 2131165254) {
            Object obj2 = AbstractC0121a.f1852a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i2 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c2 = h0.c(context, R.attr.colorSwitchThumbNormal);
            if (c2 == null || !c2.isStateful()) {
                iArr[0] = h0.f2221b;
                iArr2[0] = h0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = h0.f2224e;
                iArr2[1] = h0.b(context, R.attr.colorControlActivated);
                iArr[2] = h0.f2225f;
                iArr2[2] = h0.b(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = h0.f2221b;
                iArr[0] = iArr3;
                iArr2[0] = c2.getColorForState(iArr3, 0);
                iArr[1] = h0.f2224e;
                iArr2[1] = h0.b(context, R.attr.colorControlActivated);
                iArr[2] = h0.f2225f;
                iArr2[2] = c2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
            return c(context, h0.b(context, R.attr.colorButtonNormal));
        }
        if (i2 == R.drawable.abc_btn_borderless_material) {
            return c(context, 0);
        }
        if (i2 == R.drawable.abc_btn_colored_material) {
            return c(context, h0.b(context, R.attr.colorAccent));
        }
        if (i2 == 2131165251 || i2 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0121a.f1852a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (a((int[]) this.f1859c, i2)) {
            return h0.c(context, R.attr.colorControlNormal);
        }
        if (a((int[]) this.f1862f, i2)) {
            Object obj4 = AbstractC0121a.f1852a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (a((int[]) this.f1863g, i2)) {
            Object obj5 = AbstractC0121a.f1852a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i2 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0121a.f1852a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123 A[Catch: ActivityNotFoundException -> 0x0132, TryCatch #1 {ActivityNotFoundException -> 0x0132, blocks: (B:27:0x00d5, B:32:0x00ec, B:34:0x010c, B:41:0x0123, B:43:0x0117, B:44:0x0134, B:45:0x013b), top: B:26:0x00d5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(String str, boolean z2, Map map) {
        boolean z3;
        List<ResolveInfo> queryIntentActivities;
        List<ResolveInfo> queryIntentActivities2;
        PackageManager.ResolveInfoFlags of;
        PackageManager.ResolveInfoFlags of2;
        E e2 = (E) this.f1858b;
        Activity activity = (Activity) this.f1863g;
        if (activity == null) {
            throw new C0127f("Launching a Custom Tab requires a foreground activity.");
        }
        Uri parse = Uri.parse(str);
        if (z2) {
            ((C0000a) this.f1860d).getClass();
            h.e(parse, "uri");
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                Intent addFlags = new Intent("android.intent.action.VIEW", parse).addCategory("android.intent.category.BROWSABLE").addFlags(268436480);
                h.d(addFlags, "addFlags(...)");
                try {
                    activity.startActivity(addFlags);
                    return;
                } catch (ActivityNotFoundException unused) {
                }
            } else {
                PackageManager packageManager = activity.getPackageManager();
                Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts(parse.getScheme(), "", null));
                h.d(data, "setData(...)");
                h.b(packageManager);
                if (i2 >= 33) {
                    of2 = PackageManager.ResolveInfoFlags.of(131072);
                    queryIntentActivities = packageManager.queryIntentActivities(data, of2);
                    h.b(queryIntentActivities);
                } else {
                    queryIntentActivities = packageManager.queryIntentActivities(data, 131072);
                    h.b(queryIntentActivities);
                }
                i e3 = C0000a.e(queryIntentActivities);
                Intent addCategory = new Intent("android.intent.action.VIEW", parse).addCategory("android.intent.category.BROWSABLE");
                h.d(addCategory, "addCategory(...)");
                i iVar = new i(new F0.f(8));
                if (i2 >= 33) {
                    of = PackageManager.ResolveInfoFlags.of(131072);
                    queryIntentActivities2 = packageManager.queryIntentActivities(addCategory, of);
                    h.b(queryIntentActivities2);
                } else {
                    queryIntentActivities2 = packageManager.queryIntentActivities(addCategory, 131072);
                    h.b(queryIntentActivities2);
                }
                iVar.addAll(C0000a.e(queryIntentActivities2));
                iVar.removeAll(e3);
                if (!AbstractC0086a.d(iVar).f494e.isEmpty()) {
                    addCategory.addFlags(268435456);
                    activity.startActivity(addCategory);
                    return;
                }
            }
        }
        try {
            e2.getClass();
            C0132b x2 = E.x(map);
            ((C0000a) this.f1861e).getClass();
            if (C0000a.h(activity, parse, x2)) {
                return;
            }
            if (x2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            N.P w2 = e2.w(activity, x2, (E) this.f1859c);
            ((C0000a) this.f1862f).getClass();
            Intent intent = (Intent) w2.f698f;
            h.d(intent, "intent");
            if (!intent.hasExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX") && !intent.hasExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX")) {
                z3 = false;
                if (z3) {
                    Intent intent2 = (Intent) w2.f698f;
                    intent2.setData(parse);
                    activity.startActivity(intent2, (Bundle) w2.f699g);
                    return;
                }
                return;
            }
            intent.setData(parse);
            activity.startActivityForResult(intent, 1001);
            z3 = true;
            if (z3) {
            }
        } catch (ActivityNotFoundException e4) {
            throw new C0127f(e4.getMessage());
        }
    }

    public void f(String str, List list) {
        E e2 = (E) this.f1859c;
        e2.getClass();
        ServiceConnectionC0145a serviceConnectionC0145a = (ServiceConnectionC0145a) ((LinkedHashMap) e2.f20f).get(str);
        if (serviceConnectionC0145a == null) {
            return;
        }
        C0008i c0008i = serviceConnectionC0145a.f2091d;
        if (c0008i == null) {
            Log.w("CustomTabsAndroid", "Custom Tab session is null. Cannot may launch URL(s).");
            return;
        }
        if (list.isEmpty()) {
            Log.w("CustomTabsAndroid", "URLs is empty. Cannot may launch URL(s).");
            return;
        }
        if (list.size() == 1) {
            c0008i.C(Uri.parse((String) list.get(0)), null);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            D0.c[] cVarArr = {new D0.c("android.support.customtabs.otherurls.URL", Uri.parse((String) it.next()))};
            Bundle bundle = new Bundle(1);
            D0.c cVar = cVarArr[0];
            String str2 = (String) cVar.f199e;
            Object obj = cVar.f200f;
            if (obj == null) {
                bundle.putString(str2, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str2, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str2, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str2, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str2, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str2, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str2, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str2, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str2, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str2, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str2, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str2, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str2, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str2, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str2, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str2, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str2, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                h.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str2, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str2, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                    }
                    bundle.putSerializable(str2, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str2, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str2, (IBinder) obj);
            } else if (obj instanceof Size) {
                AbstractC0228a.a(bundle, str2, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                }
                AbstractC0228a.b(bundle, str2, (SizeF) obj);
            }
            arrayList.add(bundle);
        }
        c0008i.C(null, arrayList);
    }

    public boolean g(int i2, int i3, Intent intent) {
        Iterator it = new HashSet((HashSet) this.f1859c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((C0278a) it.next()).f3165h;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((k) hashMap.remove(Integer.valueOf(i2))).d(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }

    public void h(Activity activity) {
        for (ServiceConnectionC0145a serviceConnectionC0145a : ((LinkedHashMap) ((E) this.f1859c).f20f).values()) {
            if (activity == null) {
                Context context = serviceConnectionC0145a.f2090c;
                if (context != null) {
                    context.unbindService(serviceConnectionC0145a);
                }
                serviceConnectionC0145a.f2091d = null;
                serviceConnectionC0145a.f2092e = false;
            } else {
                serviceConnectionC0145a.a(activity);
            }
        }
        this.f1863g = activity;
    }

    public String j(Map map) {
        Set T2;
        Boolean bool;
        ServiceConnectionC0145a serviceConnectionC0145a;
        E e2 = (E) this.f1859c;
        Activity activity = (Activity) this.f1863g;
        if (activity != null) {
            e2.getClass();
            if (map == null) {
                bool = null;
                T2 = null;
            } else {
                Boolean bool2 = (Boolean) map.get("prefersDefaultBrowser");
                List list = (List) map.get("fallbackCustomTabs");
                T2 = list != null ? E0.f.T(list) : null;
                bool = bool2;
            }
            C0131a c0131a = new C0131a(null, bool, T2, null, null);
            LinkedHashMap linkedHashMap = (LinkedHashMap) e2.f20f;
            String t = k0.t(activity, !h.a(bool, Boolean.TRUE), c0131a.a(activity));
            if (t == null) {
                serviceConnectionC0145a = null;
            } else {
                serviceConnectionC0145a = (ServiceConnectionC0145a) linkedHashMap.get(t);
                if (serviceConnectionC0145a == null) {
                    serviceConnectionC0145a = new ServiceConnectionC0145a(t);
                    linkedHashMap.put(t, serviceConnectionC0145a);
                }
            }
            if (serviceConnectionC0145a != null && serviceConnectionC0145a.a(activity)) {
                return serviceConnectionC0145a.f2089b;
            }
        }
        return null;
    }

    public C0125d(Activity activity, androidx.lifecycle.f fVar) {
        this.f1858b = new HashSet();
        this.f1859c = new HashSet();
        this.f1860d = new HashSet();
        this.f1861e = new HashSet();
        new HashSet();
        this.f1862f = new HashSet();
        this.f1863g = activity;
        new HiddenLifecycleReference(fVar);
    }
}
