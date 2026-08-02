package io.flutter.view;

import B0.C0031i;
import I.C0079n;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k extends AccessibilityNodeProvider {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2788z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f2789a;

    /* renamed from: b, reason: collision with root package name */
    public final C0031i f2790b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f2791c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f2792d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.o f2793e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f2794f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2795g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f2796h;

    /* renamed from: i, reason: collision with root package name */
    public h f2797i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f2798j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f2799k;

    /* renamed from: l, reason: collision with root package name */
    public int f2800l;

    /* renamed from: m, reason: collision with root package name */
    public h f2801m;

    /* renamed from: n, reason: collision with root package name */
    public h f2802n;

    /* renamed from: o, reason: collision with root package name */
    public h f2803o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2804p;

    /* renamed from: q, reason: collision with root package name */
    public int f2805q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f2806r;

    /* renamed from: s, reason: collision with root package name */
    public B.m f2807s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2808t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2809u;
    public final b v;

    /* renamed from: w, reason: collision with root package name */
    public final c f2810w;

    /* renamed from: x, reason: collision with root package name */
    public final d f2811x;

    /* renamed from: y, reason: collision with root package name */
    public final G.a f2812y;

    public k(View view, C0031i c0031i, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.o oVar) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f2795g = new HashMap();
        this.f2796h = new HashMap();
        this.f2800l = 0;
        this.f2804p = new ArrayList();
        this.f2805q = 0;
        this.f2806r = 0;
        this.f2808t = false;
        this.f2809u = false;
        this.v = new b(this);
        c cVar = new c(this);
        this.f2810w = cVar;
        G.a aVar = new G.a(this, new Handler(), 1);
        this.f2812y = aVar;
        this.f2789a = view;
        this.f2790b = c0031i;
        this.f2791c = accessibilityManager;
        this.f2794f = contentResolver;
        this.f2792d = accessibilityViewEmbedder;
        this.f2793e = oVar;
        cVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(cVar);
        d dVar = new d(this, accessibilityManager);
        this.f2811x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i2 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f2800l &= -9;
            } else {
                this.f2800l |= 8;
            }
            ((FlutterJNI) c0031i.f155g).setAccessibilityFeatures(this.f2800l);
        }
        oVar.f2662h.f2622a = this;
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f2792d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f2799k = recordFlutterId;
            this.f2801m = null;
            return true;
        }
        if (eventType == 128) {
            this.f2803o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f2798j = recordFlutterId;
            this.f2797i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f2799k = null;
        this.f2798j = null;
        return true;
    }

    public final f b(int i2) {
        HashMap hashMap = this.f2796h;
        f fVar = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.f2732c = -1;
        fVar2.f2731b = i2;
        fVar2.f2730a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), fVar2);
        return fVar2;
    }

    public final h c(int i2) {
        HashMap hashMap = this.f2795g;
        h hVar = (h) hashMap.get(Integer.valueOf(i2));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f2761b = i2;
        hashMap.put(Integer.valueOf(i2), hVar2);
        return hVar2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        String str;
        int i3;
        int i4;
        int i5;
        i(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f2792d;
        if (i2 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f2795g;
        View view = this.f2789a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                obtain.setImportantForAccessibility(false);
            }
            return obtain;
        }
        h hVar = (h) hashMap.get(Integer.valueOf(i2));
        if (hVar == null) {
            return null;
        }
        int i6 = hVar.f2768i;
        io.flutter.plugin.platform.o oVar = this.f2793e;
        if (i6 != -1 && oVar.m(i6)) {
            View g2 = oVar.g(hVar.f2768i);
            if (g2 == null) {
                return null;
            }
            return accessibilityViewEmbedder.getRootNode(g2, hVar.f2761b, hVar.f2759Y);
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            obtain2.setImportantForAccessibility((hVar.h(12) || (h.b(hVar) == null && hVar.f2763d == 0)) ? false : true);
        }
        obtain2.setViewIdResourceName("");
        String str2 = hVar.f2774o;
        if (str2 != null) {
            obtain2.setViewIdResourceName(str2);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        obtain2.setFocusable(hVar.j());
        h hVar2 = this.f2801m;
        if (hVar2 != null) {
            obtain2.setFocused(hVar2.f2761b == i2);
        }
        h hVar3 = this.f2797i;
        if (hVar3 != null) {
            obtain2.setAccessibilityFocused(hVar3.f2761b == i2);
        }
        if (hVar.h(5)) {
            obtain2.setPassword(hVar.h(11));
            if (!hVar.h(21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!hVar.h(21));
            int i8 = hVar.f2766g;
            if (i8 != -1 && (i5 = hVar.f2767h) != -1) {
                obtain2.setTextSelection(i8, i5);
            }
            h hVar4 = this.f2797i;
            if (hVar4 != null && hVar4.f2761b == i2) {
                obtain2.setLiveRegion(1);
            }
            if (h.a(hVar, e.f2718o)) {
                obtain2.addAction(256);
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (h.a(hVar, e.f2719p)) {
                obtain2.addAction(512);
                i4 = 1;
            }
            if (h.a(hVar, e.f2727y)) {
                obtain2.addAction(256);
                i4 |= 2;
            }
            if (h.a(hVar, e.f2728z)) {
                obtain2.addAction(512);
                i4 |= 2;
            }
            obtain2.setMovementGranularities(i4);
            if (hVar.f2764e >= 0) {
                String str3 = hVar.f2777r;
                obtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - hVar.f2765f) + hVar.f2764e);
            }
        }
        if (h.a(hVar, e.f2720q)) {
            obtain2.addAction(131072);
        }
        if (h.a(hVar, e.f2721r)) {
            obtain2.addAction(16384);
        }
        if (h.a(hVar, e.f2722s)) {
            obtain2.addAction(65536);
        }
        if (h.a(hVar, e.f2723t)) {
            obtain2.addAction(32768);
        }
        if (h.a(hVar, e.f2707A)) {
            obtain2.addAction(2097152);
        }
        if (hVar.h(4) || hVar.h(23)) {
            obtain2.setClassName("android.widget.Button");
        }
        if (hVar.h(15)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (h.a(hVar, e.f2726x)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        h hVar5 = hVar.f2749O;
        if (hVar5 != null) {
            obtain2.setParent(view, hVar5.f2761b);
        } else {
            obtain2.setParent(view);
        }
        int i9 = hVar.f2736A;
        if (i9 != -1 && i7 >= 22) {
            obtain2.setTraversalAfter(view, i9);
        }
        Rect rect = hVar.f2759Y;
        h hVar6 = hVar.f2749O;
        if (hVar6 != null) {
            Rect rect2 = hVar6.f2759Y;
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
        obtain2.setEnabled(!hVar.h(7) || hVar.h(8));
        if (h.a(hVar, e.f2709f)) {
            if (hVar.f2753S != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar.f2753S.f2734e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (hVar.h(24)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (h.a(hVar, e.f2710g)) {
            if (hVar.f2754T != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar.f2754T.f2734e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        e eVar = e.f2711h;
        boolean a2 = h.a(hVar, eVar);
        e eVar2 = e.f2714k;
        e eVar3 = e.f2713j;
        e eVar4 = e.f2712i;
        if (a2 || h.a(hVar, eVar3) || h.a(hVar, eVar4) || h.a(hVar, eVar2)) {
            obtain2.setScrollable(true);
            if (hVar.h(19)) {
                if (h.a(hVar, eVar) || h.a(hVar, eVar4)) {
                    if (j(hVar)) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, hVar.f2769j, false));
                    } else {
                        obtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (j(hVar)) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar.f2769j, 0, false));
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (h.a(hVar, eVar) || h.a(hVar, eVar3)) {
                obtain2.addAction(4096);
            }
            if (h.a(hVar, eVar4) || h.a(hVar, eVar2)) {
                obtain2.addAction(8192);
            }
        }
        e eVar5 = e.f2715l;
        boolean a3 = h.a(hVar, eVar5);
        e eVar6 = e.f2716m;
        if (a3 || h.a(hVar, eVar6)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (h.a(hVar, eVar5)) {
                obtain2.addAction(4096);
            }
            if (h.a(hVar, eVar6)) {
                obtain2.addAction(8192);
            }
        }
        if (hVar.h(16)) {
            obtain2.setLiveRegion(1);
        }
        if (hVar.h(5)) {
            obtain2.setText(h.e(hVar.f2777r, hVar.f2778s));
            if (i7 >= 28) {
                CharSequence[] charSequenceArr = {h.e(hVar.f2775p, hVar.f2776q), h.e(hVar.f2782x, hVar.f2783y)};
                int i10 = 0;
                CharSequence charSequence = null;
                for (int i11 = 2; i10 < i11; i11 = 2) {
                    CharSequence charSequence2 = charSequenceArr[i10];
                    if (charSequence2 == null || charSequence2.length() <= 0) {
                        i3 = 1;
                    } else {
                        if (charSequence == null || charSequence.length() == 0) {
                            i3 = 1;
                        } else {
                            i3 = 1;
                            charSequence2 = TextUtils.concat(charSequence, ", ", charSequence2);
                        }
                        charSequence = charSequence2;
                    }
                    i10 += i3;
                }
                obtain2.setHintText(charSequence);
            }
        } else if (!hVar.h(12)) {
            CharSequence b2 = h.b(hVar);
            if (i7 < 28 && hVar.f2784z != null) {
                b2 = ((Object) (b2 != null ? b2 : "")) + "\n" + hVar.f2784z;
            }
            if (b2 != null) {
                obtain2.setContentDescription(b2);
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28 && (str = hVar.f2784z) != null) {
            obtain2.setTooltipText(str);
        }
        boolean z2 = true;
        boolean h2 = hVar.h(1);
        boolean h3 = hVar.h(17);
        if (!h2 && !h3) {
            z2 = false;
        }
        obtain2.setCheckable(z2);
        if (h2) {
            obtain2.setChecked(hVar.h(2));
            if (hVar.h(9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (h3) {
            obtain2.setChecked(hVar.h(18));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(hVar.h(3));
        if (i12 >= 28) {
            obtain2.setHeading(hVar.h(10));
        }
        h hVar7 = this.f2797i;
        if (hVar7 == null || hVar7.f2761b != i2) {
            obtain2.addAction(64);
        } else {
            obtain2.addAction(128);
        }
        ArrayList arrayList = hVar.f2752R;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(fVar.f2730a, fVar.f2733d));
            }
        }
        Iterator it2 = hVar.f2750P.iterator();
        while (it2.hasNext()) {
            h hVar8 = (h) it2.next();
            if (!hVar8.h(14)) {
                int i13 = hVar8.f2768i;
                if (i13 != -1) {
                    View g3 = oVar.g(i13);
                    if (!oVar.m(hVar8.f2768i)) {
                        obtain2.addChild(g3);
                    }
                }
                obtain2.addChild(view, hVar8.f2761b);
            }
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        View view = this.f2789a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i2);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        h i2;
        if (!this.f2791c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f2795g;
        if (hashMap.isEmpty()) {
            return false;
        }
        h i3 = ((h) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
        if (i3 != null && i3.f2768i != -1) {
            if (z2) {
                return false;
            }
            return this.f2792d.onAccessibilityHoverEvent(i3.f2761b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (!hashMap.isEmpty() && (i2 = ((h) hashMap.get(0)).i(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f2803o) {
                if (i2 != null) {
                    g(i2.f2761b, 128);
                }
                h hVar = this.f2803o;
                if (hVar != null) {
                    g(hVar.f2761b, 256);
                }
                this.f2803o = i2;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            h hVar2 = this.f2803o;
            if (hVar2 != null) {
                g(hVar2.f2761b, 256);
                this.f2803o = null;
            }
        }
        return true;
    }

    public final boolean f(h hVar, int i2, Bundle bundle, boolean z2) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = hVar.f2766g;
        int i6 = hVar.f2767h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z2) {
                                hVar.f2767h = hVar.f2777r.length();
                            } else {
                                hVar.f2767h = 0;
                            }
                        }
                    } else if (z2 && i6 < hVar.f2777r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f2777r.substring(hVar.f2767h));
                        if (matcher.find()) {
                            hVar.f2767h += matcher.start(1);
                        } else {
                            hVar.f2767h = hVar.f2777r.length();
                        }
                    } else if (!z2 && hVar.f2767h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f2777r.substring(0, hVar.f2767h));
                        if (matcher2.find()) {
                            hVar.f2767h = matcher2.start(1);
                        } else {
                            hVar.f2767h = 0;
                        }
                    }
                } else if (z2 && i6 < hVar.f2777r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f2777r.substring(hVar.f2767h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f2767h += matcher3.start(1);
                    } else {
                        hVar.f2767h = hVar.f2777r.length();
                    }
                } else if (!z2 && hVar.f2767h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f2777r.substring(0, hVar.f2767h));
                    if (matcher4.find()) {
                        hVar.f2767h = matcher4.start(1);
                    }
                }
            } else if (z2 && i6 < hVar.f2777r.length()) {
                hVar.f2767h++;
            } else if (!z2 && (i3 = hVar.f2767h) > 0) {
                hVar.f2767h = i3 - 1;
            }
            if (!z3) {
                hVar.f2766g = hVar.f2767h;
            }
        }
        if (i5 != hVar.f2766g || i6 != hVar.f2767h) {
            String str = hVar.f2777r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d2 = d(hVar.f2761b, 8192);
            d2.getText().add(str);
            d2.setFromIndex(hVar.f2766g);
            d2.setToIndex(hVar.f2767h);
            d2.setItemCount(str.length());
            h(d2);
        }
        C0031i c0031i = this.f2790b;
        if (i4 == 1) {
            if (z2) {
                e eVar = e.f2718o;
                if (h.a(hVar, eVar)) {
                    c0031i.w(i2, eVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar2 = e.f2719p;
                if (h.a(hVar, eVar2)) {
                    c0031i.w(i2, eVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z2) {
                e eVar3 = e.f2727y;
                if (h.a(hVar, eVar3)) {
                    c0031i.w(i2, eVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar4 = e.f2728z;
                if (h.a(hVar, eVar4)) {
                    c0031i.w(i2, eVar4, Boolean.valueOf(z3));
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
            h hVar = this.f2801m;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f2761b);
            }
            Integer num = this.f2799k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i2 != 2) {
            return null;
        }
        h hVar2 = this.f2797i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f2761b);
        }
        Integer num2 = this.f2798j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f2791c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f2791c.isEnabled()) {
            View view = this.f2789a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f2808t == z2) {
            return;
        }
        this.f2808t = z2;
        if (z2) {
            this.f2800l |= 1;
        } else {
            this.f2800l &= -2;
        }
        ((FlutterJNI) this.f2790b.f155g).setAccessibilityFeatures(this.f2800l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(h hVar) {
        if (hVar.f2769j > 0) {
            h hVar2 = this.f2797i;
            h hVar3 = null;
            if (hVar2 != null) {
                h hVar4 = hVar2.f2749O;
                while (true) {
                    if (hVar4 == null) {
                        hVar4 = null;
                        break;
                    }
                    if (hVar4 == hVar) {
                        break;
                    }
                    hVar4 = hVar4.f2749O;
                }
            }
            h hVar5 = this.f2797i;
            if (hVar5 != null) {
                h hVar6 = hVar5.f2749O;
                while (true) {
                    if (hVar6 == null) {
                        break;
                    }
                    if (hVar6.h(19)) {
                        hVar3 = hVar6;
                        break;
                    }
                    hVar6 = hVar6.f2749O;
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
            boolean performAction = this.f2792d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f2798j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f2795g;
        h hVar = (h) hashMap.get(Integer.valueOf(i2));
        if (hVar == null) {
            return false;
        }
        e eVar = e.f2715l;
        e eVar2 = e.f2716m;
        C0031i c0031i = this.f2790b;
        switch (i3) {
            case 16:
                c0031i.v(i2, e.f2709f);
                return true;
            case 32:
                c0031i.v(i2, e.f2710g);
                return true;
            case 64:
                if (this.f2797i == null) {
                    this.f2789a.invalidate();
                }
                this.f2797i = hVar;
                c0031i.v(i2, e.f2724u);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(hVar.f2761b));
                ((C0079n) c0031i.f154f).h(hashMap2, null);
                g(i2, 32768);
                if (h.a(hVar, eVar) || h.a(hVar, eVar2)) {
                    g(i2, 4);
                }
                return true;
            case 128:
                h hVar2 = this.f2797i;
                if (hVar2 != null && hVar2.f2761b == i2) {
                    this.f2797i = null;
                }
                Integer num = this.f2798j;
                if (num != null && num.intValue() == i2) {
                    this.f2798j = null;
                }
                c0031i.v(i2, e.v);
                g(i2, 65536);
                return true;
            case 256:
                return f(hVar, i2, bundle, true);
            case 512:
                return f(hVar, i2, bundle, false);
            case 4096:
                e eVar3 = e.f2713j;
                if (h.a(hVar, eVar3)) {
                    c0031i.v(i2, eVar3);
                } else {
                    e eVar4 = e.f2711h;
                    if (h.a(hVar, eVar4)) {
                        c0031i.v(i2, eVar4);
                    } else {
                        if (!h.a(hVar, eVar)) {
                            return false;
                        }
                        hVar.f2777r = hVar.f2779t;
                        hVar.f2778s = hVar.f2780u;
                        g(i2, 4);
                        c0031i.v(i2, eVar);
                    }
                }
                return true;
            case 8192:
                e eVar5 = e.f2714k;
                if (h.a(hVar, eVar5)) {
                    c0031i.v(i2, eVar5);
                } else {
                    e eVar6 = e.f2712i;
                    if (h.a(hVar, eVar6)) {
                        c0031i.v(i2, eVar6);
                    } else {
                        if (!h.a(hVar, eVar2)) {
                            return false;
                        }
                        hVar.f2777r = hVar.v;
                        hVar.f2778s = hVar.f2781w;
                        g(i2, 4);
                        c0031i.v(i2, eVar2);
                    }
                }
                return true;
            case 16384:
                c0031i.v(i2, e.f2721r);
                return true;
            case 32768:
                c0031i.v(i2, e.f2723t);
                return true;
            case 65536:
                c0031i.v(i2, e.f2722s);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(hVar.f2767h));
                    hashMap3.put("extent", Integer.valueOf(hVar.f2767h));
                }
                c0031i.w(i2, e.f2720q, hashMap3);
                h hVar3 = (h) hashMap.get(Integer.valueOf(i2));
                hVar3.f2766g = ((Integer) hashMap3.get("base")).intValue();
                hVar3.f2767h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 1048576:
                c0031i.v(i2, e.f2726x);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                c0031i.w(i2, e.f2707A, string);
                hVar.f2777r = string;
                hVar.f2778s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                c0031i.v(i2, e.f2717n);
                return true;
            default:
                f fVar = (f) this.f2796h.get(Integer.valueOf(i3 - 267386881));
                if (fVar == null) {
                    return false;
                }
                c0031i.w(i2, e.f2725w, Integer.valueOf(fVar.f2731b));
                return true;
        }
    }
}
