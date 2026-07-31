package com.startapp.sdk.internal;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.uimanager.ViewProps;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class ij {

    /* renamed from: a, reason: collision with root package name */
    public static final LruCache f280a = new LruCache(100);
    public static final HashSet b = new HashSet(Arrays.asList(NotDisplayedReason.AD_CLIPPED, NotDisplayedReason.AD_WAS_COVERED));

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r8 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mj a(View view, Point point, BannerOptions bannerOptions, AtomicReference atomicReference, boolean z) {
        NotDisplayedReason notDisplayedReason;
        int i;
        JSONArray jSONArray;
        View view2;
        ViewGroup viewGroup;
        View view3 = view;
        AtomicReference atomicReference2 = atomicReference;
        mj mjVar = new mj();
        float f = 0.0f;
        Rect rect = null;
        if (view3 == null) {
            return new mj(NotDisplayedReason.INTERNAL_ERROR, 0.0f, null, null);
        }
        int width = view3.getWidth();
        if (width <= 0) {
            return new mj(NotDisplayedReason.VIEW_INVALID_SIZE, 0.0f, null, null);
        }
        int height = view3.getHeight();
        if (height <= 0) {
            return new mj(NotDisplayedReason.VIEW_INVALID_SIZE, 0.0f, null, null);
        }
        boolean z2 = true;
        if (bannerOptions.u()) {
            notDisplayedReason = view3.getParent() == null ? NotDisplayedReason.VIEW_NOT_ATTACHED : view3.getRootView() == null ? NotDisplayedReason.VIEW_NOT_ATTACHED : view3.getRootView().getParent() == null ? NotDisplayedReason.VIEW_NOT_ATTACHED : !view3.isShown() ? NotDisplayedReason.VIEW_NOT_VISIBLE : (view3.getWidth() < 1 || view3.getHeight() < 1) ? NotDisplayedReason.VIEW_INVALID_SIZE : null;
        }
        notDisplayedReason = null;
        if (bannerOptions.s() && notDisplayedReason == null && !view3.hasWindowFocus()) {
            notDisplayedReason = NotDisplayedReason.WINDOW_NOT_FOCUSED;
        }
        boolean r = bannerOptions.r();
        if (!r && !z) {
            return mjVar;
        }
        if (point != null) {
            DisplayMetrics displayMetrics = view3.getResources().getDisplayMetrics();
            i = ((int) TypedValue.applyDimension(1, point.x, displayMetrics)) * ((int) TypedValue.applyDimension(1, point.y, displayMetrics));
        } else {
            i = width * height;
        }
        int min = (Math.min(Math.max(1, bannerOptions.h()), 100) * i) / 100;
        Rect rect2 = new Rect();
        if (!view3.getGlobalVisibleRect(rect2) && r && notDisplayedReason == null) {
            notDisplayedReason = NotDisplayedReason.AD_CLIPPED;
        }
        if (rect2.isEmpty() && r && notDisplayedReason == null) {
            notDisplayedReason = NotDisplayedReason.AD_CLIPPED;
        }
        LinkedList linkedList = new LinkedList();
        NotDisplayedReason notDisplayedReason2 = notDisplayedReason == null ? NotDisplayedReason.AD_CLIPPED : notDisplayedReason;
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        view3.getGlobalVisibleRect(rect3);
        Region region = new Region(rect3);
        atomicReference2.set(a(view3, rect2, true));
        while (true) {
            int i2 = 0;
            if (!(view3.getParent() instanceof ViewGroup)) {
                break;
            }
            if (bannerOptions.t() && view3.getVisibility() != 0 && notDisplayedReason2 == NotDisplayedReason.AD_CLIPPED) {
                notDisplayedReason2 = NotDisplayedReason.VIEW_NOT_VISIBLE;
            }
            if (bannerOptions.q() && view3.getAlpha() < 1.0f && notDisplayedReason2 == NotDisplayedReason.AD_CLIPPED) {
                notDisplayedReason2 = NotDisplayedReason.VIEW_TRANSPARENT;
            }
            ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
            JSONObject a2 = a(viewGroup2, ((viewGroup2.getParent() instanceof ViewGroup) || !viewGroup2.getGlobalVisibleRect(rect4)) ? rect : rect4, false);
            float f2 = f;
            JSONObject jSONObject = (JSONObject) atomicReference2.get();
            JSONArray optJSONArray = a2.optJSONArray("children");
            boolean z3 = z2;
            if (optJSONArray == null) {
                jSONArray = new JSONArray();
                try {
                    a2.put("children", jSONArray);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            } else {
                jSONArray = optJSONArray;
            }
            jSONArray.put(jSONObject);
            atomicReference2.set(a2);
            int indexOfChild = viewGroup2.indexOfChild(view3);
            int childCount = viewGroup2.getChildCount();
            while (i2 < childCount) {
                View childAt = viewGroup2.getChildAt(i2);
                if (childAt == view3) {
                    view2 = view3;
                    viewGroup = viewGroup2;
                } else {
                    view2 = view3;
                    viewGroup = viewGroup2;
                    int compare = Float.compare(childAt.getZ(), view2.getZ());
                    if (compare >= 0 && ((compare != 0 || i2 > indexOfChild) && childAt.getVisibility() == 0 && childAt.getAlpha() > f2 && childAt.getGlobalVisibleRect(rect4) && Rect.intersects(rect3, rect4))) {
                        region.op(rect4, Region.Op.DIFFERENCE);
                        linkedList.add(new Rect(rect4));
                        JSONObject a3 = a(childAt, rect4, false);
                        JSONArray optJSONArray2 = a2.optJSONArray("children");
                        if (optJSONArray2 == null) {
                            optJSONArray2 = new JSONArray();
                            try {
                                a2.put("children", optJSONArray2);
                            } catch (JSONException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        optJSONArray2.put(a3);
                        if (notDisplayedReason2 == NotDisplayedReason.AD_CLIPPED && notDisplayedReason != null) {
                            notDisplayedReason2 = NotDisplayedReason.AD_WAS_COVERED;
                        }
                    }
                }
                i2++;
                view3 = view2;
                viewGroup2 = viewGroup;
            }
            atomicReference2 = atomicReference;
            view3 = viewGroup2;
            f = f2;
            z2 = z3;
            rect = null;
        }
        RegionIterator regionIterator = new RegionIterator(region);
        int i3 = 0;
        while (regionIterator.next(rect4)) {
            i3 += (rect4.height() + 1) * (rect4.width() + 1);
        }
        return new mj((i3 >= min && b.contains(notDisplayedReason2) && notDisplayedReason == null) ? null : notDisplayedReason2, i3 / i, region.getBounds(), (Rect[]) linkedList.toArray(new Rect[0]));
    }

    public static String b(View view) {
        String name = view.getClass().getName();
        if (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("com.android.")) {
            return view.getClass().getSimpleName();
        }
        String packageName = view.getContext().getPackageName();
        return name.startsWith(new StringBuilder().append(packageName).append(".").toString()) ? name.substring(packageName.length()) : name;
    }

    public static JSONObject a(View view, Rect rect, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", b(view));
            String a2 = a(view);
            if (a2 != null) {
                jSONObject.put("id", a2);
            }
            if (z) {
                jSONObject.put(TypedValues.Attributes.S_TARGET, true);
            }
            if (view.getAlpha() < 1.0f) {
                jSONObject.put("alpha", view.getAlpha());
            }
            if (rect != null) {
                jSONObject.put(ViewProps.LEFT, rect.left);
                jSONObject.put(ViewProps.TOP, rect.top);
                jSONObject.put(ViewProps.RIGHT, rect.right);
                jSONObject.put(ViewProps.BOTTOM, rect.bottom);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static String a(View view) {
        int id = view.getId();
        if (id == -1 || id == 0) {
            return null;
        }
        LruCache lruCache = f280a;
        synchronized (lruCache) {
            String str = (String) lruCache.get(Integer.valueOf(id));
            if (str != null) {
                return str;
            }
            try {
                return view.getContext().getResources().getResourceName(id);
            } catch (Resources.NotFoundException unused) {
                String str2 = "0x" + Integer.toHexString(id);
                LruCache lruCache2 = f280a;
                synchronized (lruCache2) {
                    lruCache2.put(Integer.valueOf(id), str2);
                    return str2;
                }
            }
        }
    }
}
