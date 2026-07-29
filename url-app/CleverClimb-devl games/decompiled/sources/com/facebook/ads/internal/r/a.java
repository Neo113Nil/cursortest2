package com.facebook.ads.internal.r;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.ads.internal.q.a.r;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.q.a.w;
import com.facebook.ads.internal.q.a.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5472a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final View f5473b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5474c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5475d;
    private final Handler e;
    private final WeakReference<AbstractC0350a> f;
    private final boolean g;
    private Runnable h;
    private int i;
    private int j;
    private boolean k;
    private com.facebook.ads.internal.r.b l;
    private Map<String, Integer> m;
    private long n;
    private int o;

    /* renamed from: com.facebook.ads.internal.r.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0350a {
        public abstract void a();

        public void b() {
        }
    }

    private static final class b extends w<a> {
        b(a aVar) {
            super(aVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            a a2 = a();
            if (a2 == null) {
                return;
            }
            View view = a2.f5473b;
            AbstractC0350a abstractC0350a = (AbstractC0350a) a2.f.get();
            if (view == null || abstractC0350a == null) {
                return;
            }
            com.facebook.ads.internal.r.b a3 = a.a(view, a2.f5474c);
            if (a3.a()) {
                a.d(a2);
            } else {
                a2.o = 0;
            }
            boolean z = a2.o > a2.f5475d;
            boolean z2 = a2.l != null && a2.l.a();
            if (z || !a3.a()) {
                a2.l = a3;
            }
            String valueOf = String.valueOf(a3.b());
            synchronized (a2) {
                a2.m.put(valueOf, Integer.valueOf((a2.m.containsKey(valueOf) ? ((Integer) a2.m.get(valueOf)).intValue() : 0) + 1));
            }
            if (z && !z2) {
                a2.n = System.currentTimeMillis();
                abstractC0350a.a();
                if (!a2.g) {
                    return;
                }
            } else if (!z && z2) {
                abstractC0350a.b();
            }
            if (a2.k || a2.h == null) {
                return;
            }
            a2.e.postDelayed(a2.h, a2.j);
        }
    }

    public a(View view, int i, int i2, boolean z, AbstractC0350a abstractC0350a) {
        this.e = new Handler();
        this.i = 0;
        this.j = 1000;
        this.k = true;
        this.l = new com.facebook.ads.internal.r.b(c.UNKNOWN);
        this.m = new HashMap();
        this.n = 0L;
        this.o = 0;
        this.f5473b = view;
        if (view.getId() == -1) {
            v.a(view);
        }
        this.f5474c = i;
        this.f = new WeakReference<>(abstractC0350a);
        this.g = z;
        this.f5475d = i2 < 0 ? 0 : i2;
    }

    public a(View view, int i, AbstractC0350a abstractC0350a) {
        this(view, i, 0, false, abstractC0350a);
    }

    public a(View view, int i, boolean z, AbstractC0350a abstractC0350a) {
        this(view, i, 0, z, abstractC0350a);
    }

    private static int a(Vector<Rect> vector) {
        int size = vector.size();
        int i = size * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) boolean.class, i, i);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            Rect elementAt = vector.elementAt(i2);
            int i5 = i3 + 1;
            iArr[i3] = elementAt.left;
            int i6 = i4 + 1;
            iArr2[i4] = elementAt.bottom;
            int i7 = i5 + 1;
            iArr[i5] = elementAt.right;
            int i8 = i6 + 1;
            iArr2[i6] = elementAt.top;
            i2++;
            i3 = i7;
            i4 = i8;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (int i9 = 0; i9 < size; i9++) {
            Rect elementAt2 = vector.elementAt(i9);
            int a2 = a(iArr, elementAt2.left);
            int a3 = a(iArr, elementAt2.right);
            int a4 = a(iArr2, elementAt2.top);
            int a5 = a(iArr2, elementAt2.bottom);
            for (int i10 = a2 + 1; i10 <= a3; i10++) {
                for (int i11 = a4 + 1; i11 <= a5; i11++) {
                    zArr[i10][i11] = true;
                }
            }
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            int i14 = i13;
            for (int i15 = 0; i15 < i; i15++) {
                i14 += zArr[i12][i15] ? (iArr[i12] - iArr[i12 - 1]) * (iArr2[i15] - iArr2[i15 - 1]) : 0;
            }
            i12++;
            i13 = i14;
        }
        return i13;
    }

    private static int a(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = ((length - i2) / 2) + i2;
            if (iArr[i3] == i) {
                return i3;
            }
            if (iArr[i3] > i) {
                length = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.internal.r.b a(View view, int i) {
        DisplayMetrics displayMetrics;
        int measuredHeight;
        float f;
        float f2;
        if (view == null) {
            a(null, false, "adView is null.");
            return new com.facebook.ads.internal.r.b(c.AD_IS_NULL);
        }
        if (view.getParent() == null) {
            a(view, false, "adView has no parent.");
            return new com.facebook.ads.internal.r.b(c.INVALID_PARENT);
        }
        if (!view.isShown()) {
            a(view, false, "adView parent is not set to VISIBLE.");
            return new com.facebook.ads.internal.r.b(c.INVALID_PARENT);
        }
        if (view.getWindowVisibility() != 0) {
            a(view, false, "adView window is not set to VISIBLE.");
            return new com.facebook.ads.internal.r.b(c.INVALID_WINDOW);
        }
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            a(view, false, "adView has invisible dimensions (w=" + view.getMeasuredWidth() + ", h=" + view.getMeasuredHeight());
            return new com.facebook.ads.internal.r.b(c.INVALID_DIMENSIONS);
        }
        if (view.getAlpha() < 0.9f) {
            a(view, false, "adView is too transparent.");
            return new com.facebook.ads.internal.r.b(c.AD_IS_TRANSPARENT);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                return new com.facebook.ads.internal.r.b(c.AD_IS_NOT_VISIBLE);
            }
            Context context = view.getContext();
            if (Build.VERSION.SDK_INT >= 17) {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                displayMetrics = context.getResources().getDisplayMetrics();
            }
            if (com.facebook.ads.internal.l.a.p(context)) {
                if (!new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels).intersect(iArr[0], iArr[1], iArr[0] + width, iArr[1] + height)) {
                    f2 = 0.0f;
                    float o = com.facebook.ads.internal.l.a.o(context) / 100.0f;
                    if (com.facebook.ads.internal.l.a.n(context)) {
                        if (iArr[0] < 0 || displayMetrics.widthPixels - iArr[0] < width) {
                            a(view, false, "adView is not fully on screen horizontally.");
                            return new com.facebook.ads.internal.r.b(c.AD_OFFSCREEN_HORIZONTALLY, f2);
                        }
                        double d2 = height;
                        double d3 = i;
                        Double.isNaN(d3);
                        Double.isNaN(d2);
                        int i2 = (int) ((d2 * (100.0d - d3)) / 100.0d);
                        if (iArr[1] < 0 && Math.abs(iArr[1]) > i2) {
                            a(view, false, "adView is not visible from the top.");
                            return new com.facebook.ads.internal.r.b(c.AD_OFFSCREEN_TOP, f2);
                        }
                        if ((iArr[1] + height) - displayMetrics.heightPixels > i2) {
                            a(view, false, "adView is not visible from the bottom.");
                            return new com.facebook.ads.internal.r.b(c.AD_OFFSCREEN_BOTTOM, f2);
                        }
                    } else if (f2 < o) {
                        a(view, false, String.format(Locale.US, "adView visible area is too small [%.2f%% visible, current threshold %.2f%%]", Float.valueOf(f2), Float.valueOf(o)));
                        return new com.facebook.ads.internal.r.b(c.AD_INSUFFICIENT_VISIBLE_AREA, f2);
                    }
                    if (com.facebook.ads.internal.q.e.a.b(context)) {
                        a(view, false, "Screen is not interactive.");
                        return new com.facebook.ads.internal.r.b(c.SCREEN_NOT_INTERACTIVE, f2);
                    }
                    Map<String, String> a2 = com.facebook.ads.internal.q.e.b.a(context);
                    if (x.b(a2)) {
                        a(view, false, "Keyguard is obstructing view.");
                        return new com.facebook.ads.internal.r.b(c.AD_IS_OBSTRUCTED_BY_KEYGUARD, f2);
                    }
                    if (com.facebook.ads.internal.l.a.c(context) && x.a(a2)) {
                        a(view, false, "Ad is on top of the Lockscreen.");
                        return new com.facebook.ads.internal.r.b(c.AD_IN_LOCKSCREEN, f2, a2);
                    }
                    Float a3 = com.facebook.ads.internal.l.a.q(context) ? d.a(view) : null;
                    if (a3 != null) {
                        if (a3.floatValue() == -1.0f) {
                            a(view, false, "adView is not in the top activity");
                            return new com.facebook.ads.internal.r.b(c.AD_IS_NOT_IN_ACTIVITY);
                        }
                        if (a3.floatValue() == 0.0f) {
                            a(view, false, "adView is not visible");
                            return new com.facebook.ads.internal.r.b(c.AD_IS_NOT_VISIBLE);
                        }
                    }
                    if (!com.facebook.ads.internal.l.a.r(context) || a3 == null || a3.floatValue() >= o) {
                        a(view, true, "adView is visible.");
                        return new com.facebook.ads.internal.r.b(c.IS_VIEWABLE, f2, a2);
                    }
                    a(view, false, String.format(Locale.US, "adView visible area is too small [%.2f%% visible, current threshold %.2f%%]", a3, Float.valueOf(o)));
                    return new com.facebook.ads.internal.r.b(c.AD_INSUFFICIENT_VISIBLE_AREA, f2, a2);
                }
                f = r7.width() * r7.height() * 1.0f;
                measuredHeight = width * height;
            } else {
                Vector<Rect> a4 = a(view);
                int a5 = a(a4);
                a4.add(rect);
                int a6 = a(a4) - a5;
                measuredHeight = view.getMeasuredHeight() * view.getMeasuredWidth();
                f = a6 * 1.0f;
            }
            f2 = f / measuredHeight;
            float o2 = com.facebook.ads.internal.l.a.o(context) / 100.0f;
            if (com.facebook.ads.internal.l.a.n(context)) {
            }
            if (com.facebook.ads.internal.q.e.a.b(context)) {
            }
        } catch (NullPointerException unused) {
            a(view, false, "Cannot get location on screen.");
            return new com.facebook.ads.internal.r.b(c.INVALID_DIMENSIONS);
        }
    }

    private static Vector<Rect> a(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(view);
        while (true) {
            indexOfChild++;
            if (indexOfChild >= viewGroup.getChildCount()) {
                vector.addAll(a(viewGroup));
                return vector;
            }
            vector.addAll(b(viewGroup.getChildAt(indexOfChild)));
        }
    }

    private static void a(View view, boolean z, String str) {
    }

    private static Vector<Rect> b(View view) {
        Vector<Rect> vector = new Vector<>();
        if (view.isShown() && (Build.VERSION.SDK_INT < 11 || view.getAlpha() > 0.0f)) {
            if ((view instanceof ViewGroup) && c(view)) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    vector.addAll(b(viewGroup.getChildAt(i)));
                }
                return vector;
            }
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                vector.add(rect);
            }
        }
        return vector;
    }

    private static boolean c(View view) {
        return view.getBackground() == null || (Build.VERSION.SDK_INT >= 19 && view.getBackground().getAlpha() <= 0);
    }

    static /* synthetic */ int d(a aVar) {
        int i = aVar.o;
        aVar.o = i + 1;
        return i;
    }

    public synchronized void a() {
        if (this.h != null) {
            b();
        }
        this.h = new b(this);
        this.e.postDelayed(this.h, this.i);
        this.k = false;
        this.o = 0;
        this.l = new com.facebook.ads.internal.r.b(c.UNKNOWN);
        this.m = new HashMap();
    }

    public void a(int i) {
        this.i = i;
    }

    public synchronized void a(Map<String, String> map) {
        map.put("vrc", String.valueOf(this.l.b()));
        map.put("vp", String.valueOf(this.l.c()));
        map.put("vh", new JSONObject(this.m).toString());
        map.put("vt", r.a(this.n));
        map.putAll(this.l.d());
    }

    public synchronized void b() {
        this.e.removeCallbacks(this.h);
        this.h = null;
        this.k = true;
        this.o = 0;
    }

    public void b(int i) {
        this.j = i;
    }

    public synchronized String c() {
        return c.values()[this.l.b()].toString() + String.format(" (%.1f%%)", Float.valueOf(this.l.c() * 100.0f));
    }
}
