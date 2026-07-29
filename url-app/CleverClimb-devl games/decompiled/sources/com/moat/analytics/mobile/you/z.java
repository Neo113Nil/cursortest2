package com.moat.analytics.mobile.you;

import android.app.Activity;
import android.graphics.Rect;
import android.location.Location;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class z {

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f7569c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f7570d;
    private Rect e;
    private JSONObject f;
    private JSONObject g;
    private Location h;
    private Map<String, Object> i = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    String f7567a = "{}";

    /* renamed from: b, reason: collision with root package name */
    private c f7568b = new c();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f7571a = 0;

        /* renamed from: b, reason: collision with root package name */
        final Set<Rect> f7572b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        boolean f7573c = false;

        a() {
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final View f7574a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f7575b;

        b(View view, b bVar) {
            this.f7574a = view;
            this.f7575b = bVar != null ? z.b(view, bVar.f7575b.left, bVar.f7575b.top) : z.k(view);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        Rect f7576a = new Rect(0, 0, 0, 0);

        /* renamed from: b, reason: collision with root package name */
        double f7577b = 0.0d;

        /* renamed from: c, reason: collision with root package name */
        double f7578c = 0.0d;

        c() {
        }
    }

    z() {
    }

    static int a(Rect rect, Set<Rect> set) {
        int i = 0;
        if (set.isEmpty()) {
            return 0;
        }
        ArrayList<Rect> arrayList = new ArrayList();
        arrayList.addAll(set);
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: com.moat.analytics.mobile.you.z.1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Rect rect2, Rect rect3) {
                return Integer.valueOf(rect2.top).compareTo(Integer.valueOf(rect3.top));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Rect rect2 : arrayList) {
            arrayList2.add(Integer.valueOf(rect2.left));
            arrayList2.add(Integer.valueOf(rect2.right));
        }
        Collections.sort(arrayList2);
        int i2 = 0;
        while (i < arrayList2.size() - 1) {
            int i3 = i + 1;
            if (!((Integer) arrayList2.get(i)).equals(arrayList2.get(i3))) {
                Rect rect3 = new Rect(((Integer) arrayList2.get(i)).intValue(), rect.top, ((Integer) arrayList2.get(i3)).intValue(), rect.bottom);
                int i4 = rect.top;
                for (Rect rect4 : arrayList) {
                    if (Rect.intersects(rect4, rect3)) {
                        if (rect4.bottom > i4) {
                            i2 += rect3.width() * (rect4.bottom - Math.max(i4, rect4.top));
                            i4 = rect4.bottom;
                        }
                        if (rect4.bottom == rect3.bottom) {
                            break;
                        }
                    }
                }
            }
            i = i3;
        }
        return i2;
    }

    private static Rect a(DisplayMetrics displayMetrics) {
        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    static Rect a(View view) {
        return view != null ? k(view) : new Rect(0, 0, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        com.moat.analytics.mobile.you.p.a(3, "VisibilityInfo", (java.lang.Object) null, "Short-circuiting cover retrieval, reached max");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static a a(Rect rect, View view) {
        a aVar = new a();
        try {
            ArrayDeque<View> i = i(view);
            if (i != null && !i.isEmpty()) {
                p.b(2, "VisibilityInfo", view, "starting covering rect search");
                b bVar = null;
                loop0: while (true) {
                    if (i.isEmpty()) {
                        break;
                    }
                    View pollLast = i.pollLast();
                    b bVar2 = new b(pollLast, bVar);
                    if (pollLast.getParent() != null && (pollLast.getParent() instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) pollLast.getParent();
                        int childCount = viewGroup.getChildCount();
                        boolean z = false;
                        for (int i2 = 0; i2 < childCount; i2++) {
                            if (aVar.f7571a >= 500) {
                                break loop0;
                            }
                            View childAt = viewGroup.getChildAt(i2);
                            if (childAt == pollLast) {
                                z = true;
                            } else {
                                aVar.f7571a++;
                                if (a(childAt, pollLast, z)) {
                                    b(new b(childAt, bVar), rect, aVar);
                                    if (aVar.f7573c) {
                                        return aVar;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    bVar = bVar2;
                }
            }
            return aVar;
        } catch (Exception e) {
            m.a(e);
        }
        return aVar;
    }

    private static c a(View view, Rect rect, boolean z, boolean z2, boolean z3) {
        c cVar = new c();
        int b2 = b(rect);
        if (view != null && z && z2 && !z3 && b2 > 0) {
            Rect rect2 = new Rect(0, 0, 0, 0);
            if (a(view, rect2)) {
                int b3 = b(rect2);
                if (b3 < b2) {
                    p.b(2, "VisibilityInfo", null, "Ad is clipped");
                }
                if (view.getRootView() instanceof ViewGroup) {
                    cVar.f7576a = rect2;
                    a a2 = a(rect2, view);
                    if (a2.f7573c) {
                        cVar.f7578c = 1.0d;
                    } else {
                        int a3 = a(rect2, a2.f7572b);
                        if (a3 > 0) {
                            double d2 = a3;
                            double d3 = b3;
                            Double.isNaN(d3);
                            Double.isNaN(d2);
                            cVar.f7578c = d2 / (d3 * 1.0d);
                        }
                        double d4 = b3 - a3;
                        double d5 = b2;
                        Double.isNaN(d5);
                        Double.isNaN(d4);
                        cVar.f7577b = d4 / (d5 * 1.0d);
                    }
                }
            }
        }
        return cVar;
    }

    private static Map<String, String> a(Rect rect) {
        HashMap hashMap = new HashMap();
        hashMap.put("x", String.valueOf(rect.left));
        hashMap.put("y", String.valueOf(rect.top));
        hashMap.put("w", String.valueOf(rect.right - rect.left));
        hashMap.put("h", String.valueOf(rect.bottom - rect.top));
        return hashMap;
    }

    private static Map<String, String> a(Rect rect, DisplayMetrics displayMetrics) {
        return a(b(rect, displayMetrics));
    }

    private static JSONObject a(Location location) {
        Map<String, String> b2 = b(location);
        if (b2 == null) {
            return null;
        }
        return new JSONObject(b2);
    }

    private static void a(b bVar, Rect rect, a aVar) {
        Rect rect2 = bVar.f7575b;
        if (rect2.setIntersect(rect, rect2)) {
            if (Build.VERSION.SDK_INT >= 22) {
                Rect rect3 = new Rect(0, 0, 0, 0);
                if (!a(bVar.f7574a, rect3)) {
                    return;
                }
                Rect rect4 = bVar.f7575b;
                if (!rect4.setIntersect(rect3, rect4)) {
                    return;
                } else {
                    rect2 = rect4;
                }
            }
            if (w.a().f7540c) {
                p.b(2, "VisibilityInfo", bVar.f7574a, String.format(Locale.ROOT, "Covered by %s-%s alpha=%f", bVar.f7574a.getClass().getName(), rect2.toString(), Float.valueOf(bVar.f7574a.getAlpha())));
            }
            aVar.f7572b.add(rect2);
            if (rect2.contains(rect)) {
                aVar.f7573c = true;
            }
        }
    }

    private static boolean a(View view, Rect rect) {
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationInWindow(iArr);
        int[] iArr2 = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationOnScreen(iArr2);
        rect.offset(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
        return true;
    }

    private static boolean a(View view, View view2, boolean z) {
        return z ? Build.VERSION.SDK_INT < 21 || view.getZ() >= view2.getZ() : Build.VERSION.SDK_INT >= 21 && view.getZ() > view2.getZ();
    }

    private static int b(Rect rect) {
        return rect.width() * rect.height();
    }

    private static Rect b(Rect rect, DisplayMetrics displayMetrics) {
        float f = displayMetrics.density;
        if (f == 0.0f) {
            return rect;
        }
        return new Rect(Math.round(rect.left / f), Math.round(rect.top / f), Math.round(rect.right / f), Math.round(rect.bottom / f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Rect b(View view, int i, int i2) {
        int left = i + view.getLeft();
        int top = i2 + view.getTop();
        return new Rect(left, top, view.getWidth() + left, view.getHeight() + top);
    }

    private static Map<String, String> b(Location location) {
        if (location == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.toString(location.getLatitude()));
        hashMap.put("longitude", Double.toString(location.getLongitude()));
        hashMap.put(TapjoyConstants.TJC_TIMESTAMP, Long.toString(location.getTime()));
        hashMap.put("horizontalAccuracy", Float.toString(location.getAccuracy()));
        return hashMap;
    }

    private static void b(b bVar, Rect rect, a aVar) {
        boolean z;
        if (h(bVar.f7574a)) {
            if (bVar.f7574a instanceof ViewGroup) {
                z = (ViewGroup.class.equals(bVar.f7574a.getClass().getSuperclass()) && j(bVar.f7574a)) ? false : true;
                ViewGroup viewGroup = (ViewGroup) bVar.f7574a;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    int i2 = aVar.f7571a + 1;
                    aVar.f7571a = i2;
                    if (i2 > 500) {
                        return;
                    }
                    b(new b(viewGroup.getChildAt(i), bVar), rect, aVar);
                    if (aVar.f7573c) {
                        return;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                a(bVar, rect, aVar);
            }
        }
    }

    private static boolean c(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view != null && view.isAttachedToWindow() : (view == null || view.getWindowToken() == null) ? false : true;
    }

    private static boolean d(View view) {
        return view != null && view.hasWindowFocus();
    }

    private static boolean e(View view) {
        return view == null || !view.isShown();
    }

    private static float f(View view) {
        if (view == null) {
            return 0.0f;
        }
        return g(view);
    }

    private static float g(View view) {
        float alpha = view.getAlpha();
        while (view != null && view.getParent() != null && alpha != 0.0d && (view.getParent() instanceof View)) {
            alpha *= ((View) view.getParent()).getAlpha();
            view = (View) view.getParent();
        }
        return alpha;
    }

    private static boolean h(View view) {
        return view.isShown() && ((double) view.getAlpha()) > 0.0d;
    }

    private static ArrayDeque<View> i(View view) {
        ArrayDeque<View> arrayDeque = new ArrayDeque<>();
        int i = 0;
        View view2 = view;
        while (true) {
            if (view2.getParent() == null && view2 != view.getRootView()) {
                break;
            }
            i++;
            if (i <= 50) {
                arrayDeque.add(view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
                view2 = (View) view2.getParent();
            } else {
                p.a(3, "VisibilityInfo", (Object) null, "Short-circuiting chain retrieval, reached max");
                break;
            }
        }
        return arrayDeque;
    }

    private static boolean j(View view) {
        return Build.VERSION.SDK_INT < 19 || view.getBackground() == null || view.getBackground().getAlpha() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Rect k(View view) {
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    private static DisplayMetrics l(View view) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 17 || com.moat.analytics.mobile.you.a.f7450a == null || (activity = com.moat.analytics.mobile.you.a.f7450a.get()) == null) {
            return view.getContext().getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0102 A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:4:0x0009, B:6:0x006f, B:8:0x0079, B:10:0x0085, B:14:0x00a4, B:16:0x00b3, B:18:0x00c9, B:20:0x00cd, B:22:0x00e3, B:24:0x00e7, B:26:0x00f2, B:28:0x0102, B:30:0x0107, B:32:0x0139, B:33:0x0142, B:43:0x014d, B:45:0x00ef, B:46:0x00d5, B:47:0x00bb, B:48:0x0092), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107 A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:4:0x0009, B:6:0x006f, B:8:0x0079, B:10:0x0085, B:14:0x00a4, B:16:0x00b3, B:18:0x00c9, B:20:0x00cd, B:22:0x00e3, B:24:0x00e7, B:26:0x00f2, B:28:0x0102, B:30:0x0107, B:32:0x0139, B:33:0x0142, B:43:0x014d, B:45:0x00ef, B:46:0x00d5, B:47:0x00bb, B:48:0x0092), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d A[Catch: Exception -> 0x0150, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0150, blocks: (B:4:0x0009, B:6:0x006f, B:8:0x0079, B:10:0x0085, B:14:0x00a4, B:16:0x00b3, B:18:0x00c9, B:20:0x00cd, B:22:0x00e3, B:24:0x00e7, B:26:0x00f2, B:28:0x0102, B:30:0x0107, B:32:0x0139, B:33:0x0142, B:43:0x014d, B:45:0x00ef, B:46:0x00d5, B:47:0x00bb, B:48:0x0092), top: B:3:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void a(String str, View view) {
        boolean z;
        Location b2;
        HashMap hashMap = new HashMap();
        String str2 = "{}";
        if (view == null) {
            return;
        }
        try {
            DisplayMetrics l = l(view);
            boolean c2 = c(view);
            boolean d2 = d(view);
            boolean e = e(view);
            float f = f(view);
            hashMap.put("dr", Float.valueOf(l.density));
            hashMap.put("dv", Double.valueOf(s.a()));
            hashMap.put("adKey", str);
            hashMap.put("isAttached", Integer.valueOf(c2 ? 1 : 0));
            hashMap.put("inFocus", Integer.valueOf(d2 ? 1 : 0));
            hashMap.put("isHidden", Integer.valueOf(e ? 1 : 0));
            hashMap.put("opacity", Float.valueOf(f));
            Rect a2 = a(l);
            Rect a3 = a(view);
            c a4 = a(view, a3, c2, d2, e);
            if (this.f7569c != null && a4.f7577b == this.f7568b.f7577b && a4.f7576a.equals(this.f7568b.f7576a) && a4.f7578c == this.f7568b.f7578c) {
                z = false;
                hashMap.put("coveredPercent", Double.valueOf(a4.f7578c));
                if (this.g != null || !a2.equals(this.e)) {
                    this.e = a2;
                    this.g = new JSONObject(a(a2, l));
                    z = true;
                }
                if (this.f != null || !a3.equals(this.f7570d)) {
                    this.f7570d = a3;
                    this.f = new JSONObject(a(a3, l));
                    z = true;
                }
                if (this.i != null || !hashMap.equals(this.i)) {
                    this.i = hashMap;
                    z = true;
                }
                b2 = o.a().b();
                if (!o.a(b2, this.h)) {
                    this.h = b2;
                    z = true;
                }
                if (z) {
                    String str3 = this.f7567a;
                    return;
                }
                JSONObject jSONObject = new JSONObject(this.i);
                jSONObject.accumulate("screen", this.g);
                jSONObject.accumulate(Promotion.ACTION_VIEW, this.f);
                jSONObject.accumulate(TJAdUnitConstants.String.VISIBLE, this.f7569c);
                jSONObject.accumulate("maybe", this.f7569c);
                jSONObject.accumulate("visiblePercent", Double.valueOf(this.f7568b.f7577b));
                if (b2 != null) {
                    jSONObject.accumulate(GooglePlayServicesInterstitial.LOCATION_KEY, a(b2));
                }
                String jSONObject2 = jSONObject.toString();
                try {
                    this.f7567a = jSONObject2;
                    return;
                } catch (Exception e2) {
                    str2 = jSONObject2;
                    e = e2;
                    m.a(e);
                    this.f7567a = str2;
                    return;
                }
            }
            this.f7568b = a4;
            this.f7569c = new JSONObject(a(this.f7568b.f7576a, l));
            z = true;
            hashMap.put("coveredPercent", Double.valueOf(a4.f7578c));
            if (this.g != null) {
            }
            this.e = a2;
            this.g = new JSONObject(a(a2, l));
            z = true;
            if (this.f != null) {
            }
            this.f7570d = a3;
            this.f = new JSONObject(a(a3, l));
            z = true;
            if (this.i != null) {
            }
            this.i = hashMap;
            z = true;
            b2 = o.a().b();
            if (!o.a(b2, this.h)) {
            }
            if (z) {
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
