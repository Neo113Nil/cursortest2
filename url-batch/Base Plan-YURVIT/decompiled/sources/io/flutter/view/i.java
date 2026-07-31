package io.flutter.view;

import B0.C0008i;
import B0.E;
import F.C0032n;
import a0.AbstractC0087a;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i extends AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f2595x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f2596a;

    /* renamed from: b, reason: collision with root package name */
    public final C0008i f2597b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f2598c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f2599d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f2600e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f2601f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2602g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f2603h;

    /* renamed from: i, reason: collision with root package name */
    public h f2604i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f2605j;

    /* renamed from: k, reason: collision with root package name */
    public int f2606k;

    /* renamed from: l, reason: collision with root package name */
    public String f2607l;

    /* renamed from: m, reason: collision with root package name */
    public h f2608m;

    /* renamed from: n, reason: collision with root package name */
    public h f2609n;

    /* renamed from: o, reason: collision with root package name */
    public h f2610o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2611p;

    /* renamed from: q, reason: collision with root package name */
    public int f2612q;

    /* renamed from: r, reason: collision with root package name */
    public E f2613r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2614s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final d f2615u;

    /* renamed from: v, reason: collision with root package name */
    public final e f2616v;

    /* renamed from: w, reason: collision with root package name */
    public final D.a f2617w;

    public i(View view, C0008i c0008i, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f2602g = new HashMap();
        this.f2603h = new HashMap();
        this.f2606k = 0;
        this.f2611p = new ArrayList();
        this.f2612q = 0;
        this.f2614s = false;
        this.t = false;
        c cVar = new c(this);
        d dVar = new d(this);
        this.f2615u = dVar;
        D.a aVar = new D.a(this, new Handler(), 1);
        this.f2617w = aVar;
        this.f2596a = view;
        this.f2597b = c0008i;
        this.f2598c = accessibilityManager;
        this.f2601f = contentResolver;
        this.f2599d = accessibilityViewEmbedder;
        this.f2600e = hVar;
        c0008i.f86h = cVar;
        ((FlutterJNI) c0008i.f85g).setAccessibilityDelegate(cVar);
        dVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(dVar);
        e eVar = new e(this, accessibilityManager);
        this.f2616v = eVar;
        eVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(eVar);
        this.f2606k |= 128;
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i2 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f2606k &= -9;
            } else {
                this.f2606k |= 8;
            }
            ((FlutterJNI) c0008i.f85g).setAccessibilityFeatures(this.f2606k);
        }
        hVar.a(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        return strArr[i2];
    }

    public final g a(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f2603h;
        g gVar = (g) hashMap.get(valueOf);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.f2541c = -1;
        gVar2.f2540b = i2;
        gVar2.f2539a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), gVar2);
        return gVar2;
    }

    public final h b(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f2602g;
        h hVar = (h) hashMap.get(valueOf);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f2570b = i2;
        hashMap.put(Integer.valueOf(i2), hVar2);
        return hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        boolean g2;
        boolean z2;
        String str;
        int i3;
        int i4;
        i(true);
        if (i2 >= 65536) {
            return this.f2599d.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f2602g;
        View view = this.f2596a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        h hVar = (h) hashMap.get(Integer.valueOf(i2));
        if (hVar == null) {
            return null;
        }
        int i5 = hVar.f2578i;
        io.flutter.plugin.platform.h hVar2 = this.f2600e;
        if (i5 != -1 && hVar2.e(i5)) {
            hVar2.f(hVar.f2578i);
            return null;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
        obtain2.setImportantForAccessibility((hVar.g(12) || (h.b(hVar) == null && hVar.f2573d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        String str2 = hVar.f2584o;
        if (str2 != null) {
            obtain2.setViewIdResourceName(str2);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        obtain2.setFocusable(hVar.i());
        h hVar3 = this.f2608m;
        if (hVar3 != null) {
            obtain2.setFocused(hVar3.f2570b == i2);
        }
        h hVar4 = this.f2604i;
        if (hVar4 != null) {
            obtain2.setAccessibilityFocused(hVar4.f2570b == i2);
        }
        if (hVar.g(5)) {
            obtain2.setPassword(hVar.g(11));
            if (!hVar.g(21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!hVar.g(21));
            int i6 = hVar.f2576g;
            if (i6 != -1 && (i4 = hVar.f2577h) != -1) {
                obtain2.setTextSelection(i6, i4);
            }
            h hVar5 = this.f2604i;
            if (hVar5 != null && hVar5.f2570b == i2) {
                obtain2.setLiveRegion(1);
            }
            if (h.a(hVar, f.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (h.a(hVar, f.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i3 = 1;
            }
            if (h.a(hVar, f.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i3 |= 2;
            }
            if (h.a(hVar, f.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i3 |= 2;
            }
            obtain2.setMovementGranularities(i3);
            if (hVar.f2574e >= 0) {
                String str3 = hVar.f2587r;
                obtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - hVar.f2575f) + hVar.f2574e);
            }
        }
        if (h.a(hVar, f.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (h.a(hVar, f.COPY)) {
            obtain2.addAction(16384);
        }
        if (h.a(hVar, f.CUT)) {
            obtain2.addAction(65536);
        }
        if (h.a(hVar, f.PASTE)) {
            obtain2.addAction(32768);
        }
        if (h.a(hVar, f.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (hVar.g(4)) {
            g2 = true;
        } else {
            String str4 = hVar.f2544A;
            g2 = (str4 == null || str4.isEmpty()) ? hVar.g(23) : false;
        }
        if (g2) {
            obtain2.setClassName("android.widget.Button");
        }
        if (hVar.g(15)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (h.a(hVar, f.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        h hVar6 = hVar.f2561S;
        if (hVar6 != null) {
            obtain2.setParent(view, hVar6.f2570b);
        } else {
            obtain2.setParent(view);
        }
        int i7 = hVar.f2547D;
        if (i7 != -1) {
            obtain2.setTraversalAfter(view, i7);
        }
        Rect rect = hVar.f2572c0;
        h hVar7 = hVar.f2561S;
        if (hVar7 != null) {
            Rect rect2 = hVar7.f2572c0;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            obtain2.setBoundsInParent(rect3);
        } else {
            obtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect4);
        obtain2.setVisibleToUser(true);
        obtain2.setEnabled(!hVar.g(7) || hVar.g(8));
        if (h.a(hVar, f.TAP)) {
            if (hVar.f2564W != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar.f2564W.f2543e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (hVar.g(24)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (h.a(hVar, f.LONG_PRESS)) {
            if (hVar.f2565X != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar.f2565X.f2543e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        f fVar = f.SCROLL_LEFT;
        boolean a2 = h.a(hVar, fVar);
        f fVar2 = f.SCROLL_DOWN;
        f fVar3 = f.SCROLL_UP;
        f fVar4 = f.SCROLL_RIGHT;
        if (a2 || h.a(hVar, fVar3) || h.a(hVar, fVar4) || h.a(hVar, fVar2)) {
            obtain2.setScrollable(true);
            if (hVar.g(19)) {
                if (h.a(hVar, fVar) || h.a(hVar, fVar4)) {
                    obtain2.setClassName("android.widget.HorizontalScrollView");
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
        }
        if (j(hVar)) {
            if (h.a(hVar, fVar) || h.a(hVar, fVar4)) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, hVar.f2579j, false));
                } else {
                    obtain2.setCollectionInfo(AbstractC0087a.t(hVar.f2579j));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar.f2579j, 1, false));
            } else {
                obtain2.setCollectionInfo(AbstractC0087a.k(hVar.f2579j));
            }
        }
        h hVar8 = hVar.f2561S;
        if (hVar8 != null && j(hVar8) && hVar.f2561S.g(19)) {
            h hVar9 = hVar.f2561S;
            ArrayList arrayList = hVar9.f2562T;
            boolean z3 = (h.a(hVar9, fVar) || h.a(hVar9, fVar4)) ? false : true;
            int indexOf = arrayList.indexOf(hVar);
            if (z3) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, hVar.g(10)));
                } else {
                    obtain2.setCollectionItemInfo(AbstractC0087a.l(indexOf, hVar.g(10)));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, hVar.g(10)));
            } else {
                obtain2.setCollectionItemInfo(AbstractC0087a.u(indexOf, hVar.g(10)));
            }
        }
        if (h.a(hVar, fVar) || h.a(hVar, fVar3)) {
            obtain2.addAction(4096);
        }
        if (h.a(hVar, fVar4) || h.a(hVar, fVar2)) {
            obtain2.addAction(8192);
        }
        f fVar5 = f.INCREASE;
        boolean a3 = h.a(hVar, fVar5);
        f fVar6 = f.DECREASE;
        if (a3 || h.a(hVar, fVar6)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (h.a(hVar, fVar5)) {
                obtain2.addAction(4096);
            }
            if (h.a(hVar, fVar6)) {
                obtain2.addAction(8192);
            }
        }
        if (hVar.g(16)) {
            obtain2.setLiveRegion(1);
        }
        if (hVar.g(5)) {
            C0032n c0032n = new C0032n();
            c0032n.f409a = hVar.f2587r;
            c0032n.f411c = hVar.f2588s;
            c0032n.f410b = hVar.d();
            obtain2.setText(c0032n.a());
            if (Build.VERSION.SDK_INT >= 28) {
                C0032n c0032n2 = new C0032n();
                c0032n2.f409a = hVar.f2585p;
                c0032n2.f411c = hVar.f2586q;
                c0032n2.f412d = hVar.f2544A;
                c0032n2.f410b = hVar.d();
                SpannableString a4 = c0032n2.a();
                C0032n c0032n3 = new C0032n();
                c0032n3.f409a = hVar.f2592x;
                c0032n3.f411c = hVar.f2593y;
                c0032n3.f410b = hVar.d();
                CharSequence[] charSequenceArr = {a4, c0032n3.a()};
                int i8 = 0;
                CharSequence charSequence = null;
                for (int i9 = 2; i8 < i9; i9 = 2) {
                    CharSequence charSequence2 = charSequenceArr[i8];
                    if (charSequence2 != null && charSequence2.length() > 0) {
                        charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                    }
                    i8++;
                }
                z2 = false;
                obtain2.setHintText(charSequence);
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
            if (!hVar.g(12)) {
                CharSequence b2 = h.b(hVar);
                if (Build.VERSION.SDK_INT < 28 && hVar.f2594z != null) {
                    b2 = ((Object) (b2 != null ? b2 : "")) + "\n" + hVar.f2594z;
                }
                if (b2 != null) {
                    obtain2.setContentDescription(b2);
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28 && (str = hVar.f2594z) != null) {
            obtain2.setTooltipText(str);
            if (h.b(hVar) == null) {
                obtain2.setContentDescription(hVar.f2594z);
            }
        }
        boolean g3 = hVar.g(1);
        boolean g4 = hVar.g(17);
        obtain2.setCheckable((g3 || g4) ? true : z2);
        if (g3) {
            obtain2.setChecked(hVar.g(2));
            if (hVar.g(9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (g4) {
            obtain2.setChecked(hVar.g(18));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(hVar.g(3));
        if (i10 >= 36 && hVar.g(27)) {
            obtain2.setExpandedState(hVar.g(28) ? 3 : 1);
            if (h.a(hVar, f.EXPAND)) {
                obtain2.addAction(262144);
            }
            if (h.a(hVar, f.COLLAPSE)) {
                obtain2.addAction(524288);
            }
        }
        if (i10 >= 28) {
            obtain2.setHeading(hVar.f2546C > 0 ? true : z2);
        }
        h hVar10 = this.f2604i;
        if (hVar10 == null || hVar10.f2570b != i2) {
            obtain2.addAction(64);
        } else {
            obtain2.addAction(128);
        }
        ?? r1 = hVar.V;
        if (r1 != 0) {
            int size = r1.size();
            for (?? r7 = z2; r7 < size; r7++) {
                g gVar = (g) r1.get(r7);
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(gVar.f2539a, gVar.f2542d));
            }
        }
        ?? r12 = hVar.f2562T;
        int size2 = r12.size();
        ?? r72 = z2;
        while (r72 < size2) {
            Object obj = r12.get(r72);
            r72++;
            h hVar11 = (h) obj;
            if (!hVar11.g(14)) {
                int i11 = hVar11.f2578i;
                if (i11 != -1) {
                    hVar2.f(i11);
                    hVar2.e(hVar11.f2578i);
                }
                obtain2.addChild(view, hVar11.f2570b);
            }
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        View view = this.f2596a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i2);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        h h2;
        if (this.f2598c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.f2602g;
            if (!hashMap.isEmpty()) {
                h h3 = ((h) hashMap.get(0)).h(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
                if (h3 == null || h3.f2578i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (!hashMap.isEmpty() && (h2 = ((h) hashMap.get(0)).h(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f2610o) {
                            if (h2 != null) {
                                g(h2.f2570b, 128);
                            }
                            h hVar = this.f2610o;
                            if (hVar != null) {
                                g(hVar.f2570b, 256);
                            }
                            this.f2610o = h2;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        h hVar2 = this.f2610o;
                        if (hVar2 != null) {
                            g(hVar2.f2570b, 256);
                            this.f2610o = null;
                        }
                    }
                    return true;
                }
                if (!z2) {
                    return this.f2599d.onAccessibilityHoverEvent(h3.f2570b, motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean f(h hVar, int i2, Bundle bundle, boolean z2) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = hVar.f2576g;
        int i6 = hVar.f2577h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z2) {
                                hVar.f2577h = hVar.f2587r.length();
                            } else {
                                hVar.f2577h = 0;
                            }
                        }
                    } else if (z2 && i6 < hVar.f2587r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f2587r.substring(hVar.f2577h));
                        if (matcher.find()) {
                            hVar.f2577h += matcher.start(1);
                        } else {
                            hVar.f2577h = hVar.f2587r.length();
                        }
                    } else if (!z2 && hVar.f2577h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f2587r.substring(0, hVar.f2577h));
                        if (matcher2.find()) {
                            hVar.f2577h = matcher2.start(1);
                        } else {
                            hVar.f2577h = 0;
                        }
                    }
                } else if (z2 && i6 < hVar.f2587r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f2587r.substring(hVar.f2577h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f2577h += matcher3.start(1);
                    } else {
                        hVar.f2577h = hVar.f2587r.length();
                    }
                } else if (!z2 && hVar.f2577h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f2587r.substring(0, hVar.f2577h));
                    if (matcher4.find()) {
                        hVar.f2577h = matcher4.start(1);
                    }
                }
            } else if (z2 && i6 < hVar.f2587r.length()) {
                hVar.f2577h++;
            } else if (!z2 && (i3 = hVar.f2577h) > 0) {
                hVar.f2577h = i3 - 1;
            }
            if (!z3) {
                hVar.f2576g = hVar.f2577h;
            }
        }
        if (i5 != hVar.f2576g || i6 != hVar.f2577h) {
            String str = hVar.f2587r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d2 = d(hVar.f2570b, 8192);
            d2.getText().add(str);
            d2.setFromIndex(hVar.f2576g);
            d2.setToIndex(hVar.f2577h);
            d2.setItemCount(str.length());
            h(d2);
        }
        C0008i c0008i = this.f2597b;
        if (i4 == 1) {
            if (z2) {
                f fVar = f.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (h.a(hVar, fVar)) {
                    c0008i.s(i2, fVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                f fVar2 = f.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (h.a(hVar, fVar2)) {
                    c0008i.s(i2, fVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z2) {
                f fVar3 = f.MOVE_CURSOR_FORWARD_BY_WORD;
                if (h.a(hVar, fVar3)) {
                    c0008i.s(i2, fVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                f fVar4 = f.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (h.a(hVar, fVar4)) {
                    c0008i.s(i2, fVar4, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 4 || i4 == 8 || i4 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            h hVar = this.f2608m;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f2570b);
            }
        } else if (i2 != 2) {
            return null;
        }
        h hVar2 = this.f2604i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f2570b);
        }
        Integer num = this.f2605j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f2598c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f2598c.isEnabled()) {
            View view = this.f2596a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f2614s == z2) {
            return;
        }
        this.f2614s = z2;
        if (z2) {
            this.f2606k |= 1;
        } else {
            this.f2606k &= -2;
        }
        ((FlutterJNI) this.f2597b.f85g).setAccessibilityFeatures(this.f2606k);
    }

    public final boolean j(h hVar) {
        if (hVar.f2579j > 1) {
            h hVar2 = this.f2604i;
            h hVar3 = null;
            if (hVar2 != null) {
                h hVar4 = hVar2.f2561S;
                while (true) {
                    if (hVar4 == null) {
                        hVar4 = null;
                        break;
                    }
                    if (hVar4 == hVar) {
                        break;
                    }
                    hVar4 = hVar4.f2561S;
                }
                if (hVar4 != null) {
                    return true;
                }
            }
            h hVar5 = this.f2604i;
            b bVar = new b();
            if (hVar5 != null) {
                h hVar6 = hVar5.f2561S;
                while (true) {
                    if (hVar6 == null) {
                        break;
                    }
                    if (bVar.test(hVar6)) {
                        hVar3 = hVar6;
                        break;
                    }
                    hVar6 = hVar6.f2561S;
                }
                if (hVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.f2599d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f2605j = null;
            }
            return performAction;
        }
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f2602g;
        h hVar = (h) hashMap.get(valueOf);
        if (hVar != null) {
            f fVar = f.INCREASE;
            f fVar2 = f.DECREASE;
            C0008i c0008i = this.f2597b;
            switch (i3) {
                case 16:
                    c0008i.i(i2, f.TAP);
                    return true;
                case 32:
                    c0008i.i(i2, f.LONG_PRESS);
                    return true;
                case 64:
                    if (this.f2604i == null) {
                        this.f2596a.invalidate();
                    }
                    this.f2604i = hVar;
                    c0008i.i(i2, f.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", "didGainFocus");
                    hashMap2.put("nodeId", Integer.valueOf(hVar.f2570b));
                    ((C0032n) c0008i.f84f).i(hashMap2, null);
                    g(i2, 32768);
                    if (!h.a(hVar, fVar) && !h.a(hVar, fVar2)) {
                        return true;
                    }
                    g(i2, 4);
                    return true;
                case 128:
                    h hVar2 = this.f2604i;
                    if (hVar2 != null && hVar2.f2570b == i2) {
                        this.f2604i = null;
                    }
                    Integer num = this.f2605j;
                    if (num != null && num.intValue() == i2) {
                        this.f2605j = null;
                    }
                    c0008i.i(i2, f.DID_LOSE_ACCESSIBILITY_FOCUS);
                    g(i2, 65536);
                    return true;
                case 256:
                    return f(hVar, i2, bundle, true);
                case 512:
                    return f(hVar, i2, bundle, false);
                case 4096:
                    f fVar3 = f.SCROLL_UP;
                    if (h.a(hVar, fVar3)) {
                        c0008i.i(i2, fVar3);
                        return true;
                    }
                    f fVar4 = f.SCROLL_LEFT;
                    if (h.a(hVar, fVar4)) {
                        c0008i.i(i2, fVar4);
                        return true;
                    }
                    if (h.a(hVar, fVar)) {
                        hVar.f2587r = hVar.t;
                        hVar.f2588s = hVar.f2589u;
                        g(i2, 4);
                        c0008i.i(i2, fVar);
                        return true;
                    }
                    break;
                case 8192:
                    f fVar5 = f.SCROLL_DOWN;
                    if (h.a(hVar, fVar5)) {
                        c0008i.i(i2, fVar5);
                        return true;
                    }
                    f fVar6 = f.SCROLL_RIGHT;
                    if (h.a(hVar, fVar6)) {
                        c0008i.i(i2, fVar6);
                        return true;
                    }
                    if (h.a(hVar, fVar2)) {
                        hVar.f2587r = hVar.f2590v;
                        hVar.f2588s = hVar.f2591w;
                        g(i2, 4);
                        c0008i.i(i2, fVar2);
                        return true;
                    }
                    break;
                case 16384:
                    c0008i.i(i2, f.COPY);
                    return true;
                case 32768:
                    c0008i.i(i2, f.PASTE);
                    return true;
                case 65536:
                    c0008i.i(i2, f.CUT);
                    return true;
                case 131072:
                    HashMap hashMap3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        hashMap3.put("base", Integer.valueOf(hVar.f2577h));
                        hashMap3.put("extent", Integer.valueOf(hVar.f2577h));
                    }
                    c0008i.s(i2, f.SET_SELECTION, hashMap3);
                    h hVar3 = (h) hashMap.get(Integer.valueOf(i2));
                    hVar3.f2576g = ((Integer) hashMap3.get("base")).intValue();
                    hVar3.f2577h = ((Integer) hashMap3.get("extent")).intValue();
                    return true;
                case 262144:
                    c0008i.i(i2, f.EXPAND);
                    return true;
                case 524288:
                    c0008i.i(i2, f.COLLAPSE);
                    return true;
                case 1048576:
                    c0008i.i(i2, f.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    c0008i.s(i2, f.SET_TEXT, string);
                    hVar.f2587r = string;
                    hVar.f2588s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    c0008i.i(i2, f.SHOW_ON_SCREEN);
                    return true;
                default:
                    g gVar = (g) this.f2603h.get(Integer.valueOf(i3 - 267386881));
                    if (gVar != null) {
                        c0008i.s(i2, f.CUSTOM_ACTION, Integer.valueOf(gVar.f2540b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
