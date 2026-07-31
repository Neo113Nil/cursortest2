package B;

import B.z;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w.AbstractC3482c;

/* loaded from: classes.dex */
public class w {

    /* renamed from: d, reason: collision with root package name */
    private static int f114d;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f115a;

    /* renamed from: b, reason: collision with root package name */
    public int f116b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f117c = -1;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f118A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f119B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f120C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f121D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f122E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f123F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f124G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f125H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f126I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f127J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f128K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f129L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f130M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f131N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f132O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f133P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f134Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f135R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f136S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f137T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f138U;

        /* renamed from: V, reason: collision with root package name */
        public static final a f139V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f140e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f141f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f142g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f143h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f144i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f145j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f146k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f147l = new a(UserVerificationMethods.USER_VERIFY_PATTERN, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f148m = new a(UserVerificationMethods.USER_VERIFY_HANDPRINT, (CharSequence) null, z.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f149n = new a(UserVerificationMethods.USER_VERIFY_NONE, (CharSequence) null, z.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f150o = new a(1024, (CharSequence) null, z.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f151p = new a(com.ironsource.mediationsdk.metadata.a.f17688n, (CharSequence) null, z.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f152q = new a(Base64Utils.IO_BUFFER_SIZE, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f153r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f154s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f155t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f156u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f157v = new a(131072, (CharSequence) null, z.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f158w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f159x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f160y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f161z = new a(2097152, (CharSequence) null, z.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f162a;

        /* renamed from: b, reason: collision with root package name */
        private final int f163b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f164c;

        /* renamed from: d, reason: collision with root package name */
        protected final z f165d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            int i4 = Build.VERSION.SDK_INT;
            f118A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f119B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, z.e.class);
            f120C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f121D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f122E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f123F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f124G = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            if (i4 >= 29) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction = accessibilityAction20;
            } else {
                accessibilityAction = null;
            }
            f125H = new a(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
            if (i4 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction2 = accessibilityAction19;
            } else {
                accessibilityAction2 = null;
            }
            f126I = new a(accessibilityAction2, R.id.accessibilityActionPageLeft, null, null, null);
            if (i4 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction3 = accessibilityAction18;
            } else {
                accessibilityAction3 = null;
            }
            f127J = new a(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
            f128K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f129L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, z.f.class);
            f130M = new a(i4 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, z.d.class);
            f131N = new a(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i4 >= 28) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction4 = accessibilityAction17;
            } else {
                accessibilityAction4 = null;
            }
            f132O = new a(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i4 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction5 = accessibilityAction16;
            } else {
                accessibilityAction5 = null;
            }
            f133P = new a(accessibilityAction5, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i4 >= 30) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction6 = accessibilityAction15;
            } else {
                accessibilityAction6 = null;
            }
            f134Q = new a(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
            if (i4 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction7 = accessibilityAction14;
            } else {
                accessibilityAction7 = null;
            }
            f135R = new a(accessibilityAction7, R.id.accessibilityActionDragStart, null, null, null);
            if (i4 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction8 = accessibilityAction13;
            } else {
                accessibilityAction8 = null;
            }
            f136S = new a(accessibilityAction8, R.id.accessibilityActionDragDrop, null, null, null);
            if (i4 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction9 = accessibilityAction12;
            } else {
                accessibilityAction9 = null;
            }
            f137T = new a(accessibilityAction9, R.id.accessibilityActionDragCancel, null, null, null);
            if (i4 >= 33) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction10 = accessibilityAction11;
            } else {
                accessibilityAction10 = null;
            }
            f138U = new a(accessibilityAction10, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f139V = new a(i4 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i4, CharSequence charSequence) {
            this(null, i4, charSequence, null, null);
        }

        public a a(CharSequence charSequence, z zVar) {
            return new a(null, this.f163b, charSequence, zVar, this.f164c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f162a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f162a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f165d == null) {
                return false;
            }
            Class cls = this.f164c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e4) {
                    Class cls2 = this.f164c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e4);
                }
            }
            return this.f165d.perform(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f162a;
            return obj2 == null ? aVar.f162a == null : obj2.equals(aVar.f162a);
        }

        public int hashCode() {
            Object obj = this.f162a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String i4 = w.i(this.f163b);
            if (i4.equals("ACTION_UNKNOWN") && c() != null) {
                i4 = c().toString();
            }
            sb.append(i4);
            return sb.toString();
        }

        public a(int i4, CharSequence charSequence, z zVar) {
            this(null, i4, charSequence, zVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i4, CharSequence charSequence, Class cls) {
            this(null, i4, charSequence, null, cls);
        }

        a(Object obj, int i4, CharSequence charSequence, z zVar, Class cls) {
            this.f163b = i4;
            this.f165d = zVar;
            if (obj == null) {
                this.f162a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
            } else {
                this.f162a = obj;
            }
            this.f164c = cls;
        }
    }

    private static class b {
        public static Object a(int i4, float f4, float f5, float f6) {
            return new AccessibilityNodeInfo.RangeInfo(i4, f4, f5, f6);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static f a(boolean z4, int i4, int i5, int i6, int i7, boolean z5, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z4).setColumnIndex(i4).setRowIndex(i5).setColumnSpan(i6).setRowSpan(i7).setSelected(z5).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static w b(AccessibilityNodeInfo accessibilityNodeInfo, int i4, int i5) {
            return w.O0(accessibilityNodeInfo.getChild(i4, i5));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static w f(AccessibilityNodeInfo accessibilityNodeInfo, int i4) {
            return w.O0(accessibilityNodeInfo.getParent(i4));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
            accessibilityNodeInfo.setTextSelectable(z4);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z4);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j4) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j4));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z4) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z4);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z4);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        final Object f166a;

        e(Object obj) {
            this.f166a = obj;
        }

        public static e a(int i4, int i5, boolean z4, int i6) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z4, i6));
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final Object f167a;

        f(Object obj) {
            this.f167a = obj;
        }

        public static f a(int i4, int i5, int i6, int i7, boolean z4, boolean z5) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z4, z5));
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        final Object f168a;

        g(Object obj) {
            this.f168a = obj;
        }

        public static g a(int i4, float f4, float f5, float f6) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i4, f4, f5, f6));
        }
    }

    public w(Object obj) {
        this.f115a = (AccessibilityNodeInfo) obj;
    }

    private boolean E() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int F(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i4)).get())) {
                    return sparseArray.keyAt(i4);
                }
            }
        }
        int i5 = f114d;
        f114d = i5 + 1;
        return i5;
    }

    public static w N0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new w(accessibilityNodeInfo);
    }

    static w O0(Object obj) {
        if (obj != null) {
            return new w(obj);
        }
        return null;
    }

    public static w X() {
        return N0(AccessibilityNodeInfo.obtain());
    }

    public static w Y(w wVar) {
        return N0(AccessibilityNodeInfo.obtain(wVar.f115a));
    }

    public static w Z(View view) {
        return N0(AccessibilityNodeInfo.obtain(view));
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i4) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i4));
    }

    private void d0(View view) {
        SparseArray y4 = y(view);
        if (y4 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < y4.size(); i4++) {
                if (((WeakReference) y4.valueAt(i4)).get() == null) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                y4.remove(((Integer) arrayList.get(i5)).intValue());
            }
        }
    }

    private void f() {
        this.f115a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f115a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f115a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f115a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private void f0(int i4, boolean z4) {
        Bundle u4 = u();
        if (u4 != null) {
            int i5 = u4.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i4);
            if (!z4) {
                i4 = 0;
            }
            u4.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i4 | i5);
        }
    }

    private List g(String str) {
        ArrayList<Integer> integerArrayList = this.f115a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f115a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String i(int i4) {
        if (i4 == 1) {
            return "ACTION_FOCUS";
        }
        if (i4 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i4) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case UserVerificationMethods.USER_VERIFY_HANDPRINT /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case UserVerificationMethods.USER_VERIFY_NONE /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case com.ironsource.mediationsdk.metadata.a.f17688n /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case Base64Utils.IO_BUFFER_SIZE /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i4) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i4) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i4) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean k(int i4) {
        Bundle u4 = u();
        return u4 != null && (u4.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i4) == i4;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray w(View view) {
        SparseArray y4 = y(view);
        if (y4 != null) {
            return y4;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC3482c.f46505I, sparseArray);
        return sparseArray;
    }

    private SparseArray y(View view) {
        return (SparseArray) view.getTag(AbstractC3482c.f46505I);
    }

    public CharSequence A() {
        if (!E()) {
            return this.f115a.getText();
        }
        List g4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List g5 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List g6 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List g7 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f115a.getText(), 0, this.f115a.getText().length()));
        for (int i4 = 0; i4 < g4.size(); i4++) {
            spannableString.setSpan(new B.a(((Integer) g7.get(i4)).intValue(), this, u().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) g4.get(i4)).intValue(), ((Integer) g5.get(i4)).intValue(), ((Integer) g6.get(i4)).intValue());
        }
        return spannableString;
    }

    public void A0(View view) {
        this.f116b = -1;
        this.f115a.setParent(view);
    }

    public CharSequence B() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f115a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.f115a.getTooltipText();
        return tooltipText;
    }

    public void B0(View view, int i4) {
        this.f116b = i4;
        this.f115a.setParent(view, i4);
    }

    public String C() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f115a) : this.f115a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void C0(g gVar) {
        this.f115a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f168a);
    }

    public String D() {
        return this.f115a.getViewIdResourceName();
    }

    public void D0(CharSequence charSequence) {
        this.f115a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void E0(boolean z4) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f115a.setScreenReaderFocusable(z4);
        } else {
            f0(1, z4);
        }
    }

    public void F0(boolean z4) {
        this.f115a.setScrollable(z4);
    }

    public boolean G() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f115a) : k(64);
    }

    public void G0(boolean z4) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f115a.setShowingHintText(z4);
        } else {
            f0(4, z4);
        }
    }

    public boolean H() {
        return this.f115a.isCheckable();
    }

    public void H0(View view, int i4) {
        this.f117c = i4;
        this.f115a.setSource(view, i4);
    }

    public boolean I() {
        return this.f115a.isChecked();
    }

    public void I0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f115a, charSequence);
        } else {
            this.f115a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean J() {
        return this.f115a.isClickable();
    }

    public void J0(CharSequence charSequence) {
        this.f115a.setText(charSequence);
    }

    public boolean K() {
        return this.f115a.isContextClickable();
    }

    public void K0(View view) {
        this.f115a.setTraversalAfter(view);
    }

    public boolean L() {
        return this.f115a.isEnabled();
    }

    public void L0(boolean z4) {
        this.f115a.setVisibleToUser(z4);
    }

    public boolean M() {
        return this.f115a.isFocusable();
    }

    public AccessibilityNodeInfo M0() {
        return this.f115a;
    }

    public boolean N() {
        return this.f115a.isFocused();
    }

    public boolean O() {
        return k(67108864);
    }

    public boolean P() {
        return this.f115a.isImportantForAccessibility();
    }

    public boolean Q() {
        return this.f115a.isLongClickable();
    }

    public boolean R() {
        return this.f115a.isPassword();
    }

    public boolean S() {
        return this.f115a.isScrollable();
    }

    public boolean T() {
        return this.f115a.isSelected();
    }

    public boolean U() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return k(4);
        }
        isShowingHintText = this.f115a.isShowingHintText();
        return isShowingHintText;
    }

    public boolean V() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f115a) : k(8388608);
    }

    public boolean W() {
        return this.f115a.isVisibleToUser();
    }

    public void a(int i4) {
        this.f115a.addAction(i4);
    }

    public boolean a0(int i4, Bundle bundle) {
        return this.f115a.performAction(i4, bundle);
    }

    public void b(a aVar) {
        this.f115a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f162a);
    }

    public void c(View view, int i4) {
        this.f115a.addChild(view, i4);
    }

    public boolean c0(a aVar) {
        return this.f115a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f162a);
    }

    public void e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            d0(view);
            ClickableSpan[] q4 = q(charSequence);
            if (q4 == null || q4.length <= 0) {
                return;
            }
            u().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC3482c.f46516a);
            SparseArray w4 = w(view);
            for (int i4 = 0; i4 < q4.length; i4++) {
                int F4 = F(q4[i4], w4);
                w4.put(F4, new WeakReference(q4[i4]));
                d(q4[i4], (Spanned) charSequence, F4);
            }
        }
    }

    public void e0(boolean z4) {
        this.f115a.setAccessibilityFocused(z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f115a;
        if (accessibilityNodeInfo == null) {
            if (wVar.f115a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(wVar.f115a)) {
            return false;
        }
        return this.f117c == wVar.f117c && this.f116b == wVar.f116b;
    }

    public void g0(Rect rect) {
        this.f115a.setBoundsInParent(rect);
    }

    public List h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f115a.getActionList();
        if (actionList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new a(actionList.get(i4)));
        }
        return arrayList;
    }

    public void h0(Rect rect) {
        this.f115a.setBoundsInScreen(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f115a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(boolean z4) {
        this.f115a.setCheckable(z4);
    }

    public int j() {
        return this.f115a.getActions();
    }

    public void j0(boolean z4) {
        this.f115a.setChecked(z4);
    }

    public void k0(CharSequence charSequence) {
        this.f115a.setClassName(charSequence);
    }

    public void l(Rect rect) {
        this.f115a.getBoundsInParent(rect);
    }

    public void l0(boolean z4) {
        this.f115a.setClickable(z4);
    }

    public void m(Rect rect) {
        this.f115a.getBoundsInScreen(rect);
    }

    public void m0(Object obj) {
        this.f115a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f166a);
    }

    public void n(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f115a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f115a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void n0(Object obj) {
        this.f115a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f167a);
    }

    public int o() {
        return this.f115a.getChildCount();
    }

    public void o0(CharSequence charSequence) {
        this.f115a.setContentDescription(charSequence);
    }

    public CharSequence p() {
        return this.f115a.getClassName();
    }

    public void p0(boolean z4) {
        this.f115a.setDismissable(z4);
    }

    public void q0(boolean z4) {
        this.f115a.setEnabled(z4);
    }

    public CharSequence r() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f115a) : this.f115a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void r0(CharSequence charSequence) {
        this.f115a.setError(charSequence);
    }

    public CharSequence s() {
        return this.f115a.getContentDescription();
    }

    public void s0(boolean z4) {
        this.f115a.setFocusable(z4);
    }

    public CharSequence t() {
        return this.f115a.getError();
    }

    public void t0(boolean z4) {
        this.f115a.setFocused(z4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        n(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(x());
        sb.append("; className: ");
        sb.append(p());
        sb.append("; text: ");
        sb.append(A());
        sb.append("; error: ");
        sb.append(t());
        sb.append("; maxTextLength: ");
        sb.append(v());
        sb.append("; stateDescription: ");
        sb.append(z());
        sb.append("; contentDescription: ");
        sb.append(s());
        sb.append("; tooltipText: ");
        sb.append(B());
        sb.append("; viewIdResName: ");
        sb.append(D());
        sb.append("; uniqueId: ");
        sb.append(C());
        sb.append("; checkable: ");
        sb.append(H());
        sb.append("; checked: ");
        sb.append(I());
        sb.append("; focusable: ");
        sb.append(M());
        sb.append("; focused: ");
        sb.append(N());
        sb.append("; selected: ");
        sb.append(T());
        sb.append("; clickable: ");
        sb.append(J());
        sb.append("; longClickable: ");
        sb.append(Q());
        sb.append("; contextClickable: ");
        sb.append(K());
        sb.append("; enabled: ");
        sb.append(L());
        sb.append("; password: ");
        sb.append(R());
        sb.append("; scrollable: " + S());
        sb.append("; containerTitle: ");
        sb.append(r());
        sb.append("; granularScrollingSupported: ");
        sb.append(O());
        sb.append("; importantForAccessibility: ");
        sb.append(P());
        sb.append("; visible: ");
        sb.append(W());
        sb.append("; isTextSelectable: ");
        sb.append(V());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(G());
        sb.append("; [");
        List h4 = h();
        for (int i4 = 0; i4 < h4.size(); i4++) {
            a aVar = (a) h4.get(i4);
            String i5 = i(aVar.b());
            if (i5.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                i5 = aVar.c().toString();
            }
            sb.append(i5);
            if (i4 != h4.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(b9.i.f15552e);
        return sb.toString();
    }

    public Bundle u() {
        return this.f115a.getExtras();
    }

    public void u0(boolean z4) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f115a.setHeading(z4);
        } else {
            f0(2, z4);
        }
    }

    public int v() {
        return this.f115a.getMaxTextLength();
    }

    public void v0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f115a.setHintText(charSequence);
        } else {
            this.f115a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void w0(boolean z4) {
        this.f115a.setImportantForAccessibility(z4);
    }

    public CharSequence x() {
        return this.f115a.getPackageName();
    }

    public void x0(int i4) {
        this.f115a.setMaxTextLength(i4);
    }

    public void y0(CharSequence charSequence) {
        this.f115a.setPackageName(charSequence);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f115a) : this.f115a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void z0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f115a.setPaneTitle(charSequence);
        } else {
            this.f115a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    private w(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f115a = accessibilityNodeInfo;
    }

    public void b0() {
    }
}
