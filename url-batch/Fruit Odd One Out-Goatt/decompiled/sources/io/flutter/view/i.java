package io.flutter.view;

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
import e0.h0;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class i extends AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f600x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f601a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f602b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f603c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f604d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f605e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f606f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f607g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f608h;

    /* renamed from: i, reason: collision with root package name */
    public h f609i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f610j;

    /* renamed from: k, reason: collision with root package name */
    public int f611k;

    /* renamed from: l, reason: collision with root package name */
    public String f612l;
    public h m;

    /* renamed from: n, reason: collision with root package name */
    public h f613n;

    /* renamed from: o, reason: collision with root package name */
    public h f614o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f615p;

    /* renamed from: q, reason: collision with root package name */
    public int f616q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.n f617r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f618s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f619t;
    public final d u;
    public final e v;

    /* renamed from: w, reason: collision with root package name */
    public final e0.r f620w;

    public i(View view, h0 h0Var, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f607g = new HashMap();
        this.f608h = new HashMap();
        this.f611k = 0;
        this.f615p = new ArrayList();
        this.f616q = 0;
        this.f618s = false;
        this.f619t = false;
        c cVar = new c(this);
        d dVar = new d(this);
        this.u = dVar;
        e0.r rVar = new e0.r(this, new Handler(), 1);
        this.f620w = rVar;
        this.f601a = view;
        this.f602b = h0Var;
        this.f603c = accessibilityManager;
        this.f606f = contentResolver;
        this.f604d = accessibilityViewEmbedder;
        this.f605e = hVar;
        h0Var.f153c = cVar;
        ((FlutterJNI) h0Var.f152b).setAccessibilityDelegate(cVar);
        dVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(dVar);
        e eVar = new e(this, accessibilityManager);
        this.v = eVar;
        eVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(eVar);
        this.f611k |= 128;
        rVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, rVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i2 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f611k &= -9;
            } else {
                this.f611k |= 8;
            }
            ((FlutterJNI) h0Var.f152b).setAccessibilityFeatures(this.f611k);
        }
        hVar.e(this);
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
        HashMap hashMap = this.f608h;
        g gVar = (g) hashMap.get(valueOf);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.f569c = -1;
        gVar2.f568b = i2;
        gVar2.f567a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), gVar2);
        return gVar2;
    }

    public final h b(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f607g;
        h hVar = (h) hashMap.get(valueOf);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f574b = i2;
        hashMap.put(Integer.valueOf(i2), hVar2);
        return hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05ff  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [int] */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        boolean h2;
        boolean z2;
        int i3;
        h hVar;
        ?? r1;
        int size;
        ?? r7;
        String str;
        float parseFloat;
        String str2;
        float parseFloat2;
        int i4;
        int i5;
        i(true);
        if (i2 >= 65536) {
            return this.f604d.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f607g;
        View view = this.f601a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        h hVar2 = (h) hashMap.get(Integer.valueOf(i2));
        if (hVar2 == null) {
            return null;
        }
        int i6 = hVar2.f585i;
        io.flutter.plugin.platform.h hVar3 = this.f605e;
        if (i6 != -1 && hVar3.k(i6)) {
            hVar3.q(hVar2.f585i);
            return null;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
        obtain2.setImportantForAccessibility((hVar2.h(12) || (h.b(hVar2) == null && hVar2.f577d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        String str3 = hVar2.f590o;
        if (str3 != null) {
            obtain2.setViewIdResourceName(str3);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        obtain2.setFocusable(hVar2.j());
        h hVar4 = this.m;
        if (hVar4 != null) {
            obtain2.setFocused(hVar4.f574b == i2);
        }
        h hVar5 = this.f609i;
        if (hVar5 != null) {
            obtain2.setAccessibilityFocused(hVar5.f574b == i2);
        }
        if (hVar2.h(5)) {
            obtain2.setPassword(hVar2.h(11));
            if (!hVar2.h(21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!hVar2.h(21));
            int i7 = hVar2.f583g;
            if (i7 != -1 && (i5 = hVar2.f584h) != -1) {
                obtain2.setTextSelection(i7, i5);
            }
            h hVar6 = this.f609i;
            if (hVar6 != null && hVar6.f574b == i2) {
                obtain2.setLiveRegion(1);
            }
            if (h.a(hVar2, f.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (h.a(hVar2, f.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i4 = 1;
            }
            if (h.a(hVar2, f.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i4 |= 2;
            }
            if (h.a(hVar2, f.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i4 |= 2;
            }
            obtain2.setMovementGranularities(i4);
            if (hVar2.f579e >= 0) {
                String str4 = hVar2.f593r;
                obtain2.setMaxTextLength(((str4 == null ? 0 : str4.length()) - hVar2.f581f) + hVar2.f579e);
            }
        }
        if (h.a(hVar2, f.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (h.a(hVar2, f.COPY)) {
            obtain2.addAction(16384);
        }
        if (h.a(hVar2, f.CUT)) {
            obtain2.addAction(65536);
        }
        if (h.a(hVar2, f.PASTE)) {
            obtain2.addAction(32768);
        }
        if (h.a(hVar2, f.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (hVar2.h(4)) {
            h2 = true;
        } else {
            String str5 = hVar2.A;
            h2 = (str5 == null || str5.isEmpty()) ? hVar2.h(23) : false;
        }
        if (h2) {
            obtain2.setClassName("android.widget.Button");
        }
        if (hVar2.h(15)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (o.d.a(o.d.b(33)[hVar2.E]) == 23) {
            obtain2.setClassName("android.widget.ProgressBar");
            if (hVar2.f593r != null) {
                String str6 = hVar2.C;
                try {
                    if (str6 != null) {
                        try {
                            parseFloat = Float.parseFloat(str6);
                        } catch (NumberFormatException unused) {
                        }
                        str2 = hVar2.D;
                        if (str2 != null) {
                            try {
                                parseFloat2 = Float.parseFloat(str2);
                            } catch (NumberFormatException unused2) {
                            }
                            obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar2.f593r)));
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar2.f593r)));
                    }
                    obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar2.f593r)));
                } catch (NumberFormatException unused3) {
                    if (Build.VERSION.SDK_INT >= 36) {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                    } else {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                    }
                }
                parseFloat = Float.NEGATIVE_INFINITY;
                str2 = hVar2.D;
                if (str2 != null) {
                }
                parseFloat2 = Float.POSITIVE_INFINITY;
            }
        }
        if (h.a(hVar2, f.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        h hVar7 = hVar2.V;
        if (hVar7 != null) {
            obtain2.setParent(view, hVar7.f574b);
        } else {
            obtain2.setParent(view);
        }
        int i8 = hVar2.G;
        if (i8 != -1) {
            obtain2.setTraversalAfter(view, i8);
        }
        Rect rect = hVar2.f582f0;
        h hVar8 = hVar2.V;
        if (hVar8 != null) {
            Rect rect2 = hVar8.f582f0;
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
        obtain2.setEnabled(!hVar2.h(7) || hVar2.h(8));
        if (h.a(hVar2, f.TAP)) {
            if (hVar2.Z != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar2.Z.f571e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (hVar2.h(24)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (h.a(hVar2, f.LONG_PRESS)) {
            if (hVar2.f573a0 != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar2.f573a0.f571e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        f fVar = f.SCROLL_LEFT;
        boolean a2 = h.a(hVar2, fVar);
        f fVar2 = f.SCROLL_DOWN;
        f fVar3 = f.SCROLL_UP;
        f fVar4 = f.SCROLL_RIGHT;
        if (a2 || h.a(hVar2, fVar3) || h.a(hVar2, fVar4) || h.a(hVar2, fVar2)) {
            obtain2.setScrollable(true);
            if (hVar2.h(19)) {
                if (h.a(hVar2, fVar) || h.a(hVar2, fVar4)) {
                    obtain2.setClassName("android.widget.HorizontalScrollView");
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
        }
        if (j(hVar2)) {
            if (h.a(hVar2, fVar) || h.a(hVar2, fVar4)) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, hVar2.f586j, false));
                } else {
                    obtain2.setCollectionInfo(a0.a.t(hVar2.f586j));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar2.f586j, 1, false));
            } else {
                obtain2.setCollectionInfo(a0.a.k(hVar2.f586j));
            }
        }
        h hVar9 = hVar2.V;
        if (hVar9 != null && j(hVar9) && hVar2.V.h(19)) {
            h hVar10 = hVar2.V;
            ArrayList arrayList = hVar10.W;
            boolean z3 = (h.a(hVar10, fVar) || h.a(hVar10, fVar4)) ? false : true;
            int indexOf = arrayList.indexOf(hVar2);
            if (z3) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, hVar2.h(10)));
                } else {
                    obtain2.setCollectionItemInfo(a0.a.u(indexOf, hVar2.h(10)));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, hVar2.h(10)));
            } else {
                obtain2.setCollectionItemInfo(a0.a.l(indexOf, hVar2.h(10)));
            }
        }
        if (h.a(hVar2, fVar) || h.a(hVar2, fVar3)) {
            obtain2.addAction(4096);
        }
        if (h.a(hVar2, fVar4) || h.a(hVar2, fVar2)) {
            obtain2.addAction(8192);
        }
        f fVar5 = f.INCREASE;
        boolean a3 = h.a(hVar2, fVar5);
        f fVar6 = f.DECREASE;
        if (a3 || h.a(hVar2, fVar6)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (h.a(hVar2, fVar5)) {
                obtain2.addAction(4096);
            }
            if (h.a(hVar2, fVar6)) {
                obtain2.addAction(8192);
            }
        }
        if (hVar2.h(16)) {
            obtain2.setLiveRegion(1);
        }
        if (hVar2.h(5)) {
            c0.e eVar = new c0.e();
            eVar.f70a = hVar2.f593r;
            eVar.f71b = hVar2.f594s;
            eVar.f72c = hVar2.d();
            obtain2.setText(eVar.a());
            if (Build.VERSION.SDK_INT >= 28) {
                c0.e eVar2 = new c0.e();
                eVar2.f70a = hVar2.f591p;
                eVar2.f71b = hVar2.f592q;
                eVar2.f73d = hVar2.A;
                eVar2.f72c = hVar2.d();
                SpannableString a4 = eVar2.a();
                c0.e eVar3 = new c0.e();
                eVar3.f70a = hVar2.f597x;
                eVar3.f71b = hVar2.f598y;
                eVar3.f72c = hVar2.d();
                CharSequence[] charSequenceArr = {a4, eVar3.a()};
                int i9 = 0;
                CharSequence charSequence = null;
                for (int i10 = 2; i9 < i10; i10 = 2) {
                    CharSequence charSequence2 = charSequenceArr[i9];
                    if (charSequence2 != null && charSequence2.length() > 0) {
                        charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                    }
                    i9++;
                }
                z2 = false;
                obtain2.setHintText(charSequence);
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
            if (!hVar2.h(12)) {
                CharSequence b2 = h.b(hVar2);
                if (Build.VERSION.SDK_INT < 28 && hVar2.f599z != null) {
                    b2 = ((Object) (b2 != null ? b2 : "")) + "\n" + hVar2.f599z;
                }
                if (b2 != null) {
                    obtain2.setContentDescription(b2);
                }
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28 && (str = hVar2.f599z) != null) {
            obtain2.setTooltipText(str);
            if (h.b(hVar2) == null) {
                obtain2.setContentDescription(hVar2.f599z);
            }
        }
        boolean h3 = hVar2.h(1);
        boolean h4 = hVar2.h(17);
        obtain2.setCheckable((h3 || h4) ? true : z2);
        if (h3) {
            if (hVar2.h(9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
            if (i11 >= 36) {
                obtain2.setChecked((int) (hVar2.h(26) ? 2 : hVar2.h(2) ? 1 : z2));
            } else {
                obtain2.setChecked(hVar2.h(2));
            }
        } else if (h4) {
            obtain2.setClassName("android.widget.Switch");
            i3 = 36;
            if (i11 >= 36) {
                obtain2.setChecked(hVar2.h(18) ? 1 : 0);
            } else {
                obtain2.setChecked(hVar2.h(18));
            }
            obtain2.setSelected(hVar2.h(3));
            if (i11 >= i3 && hVar2.h(27)) {
                obtain2.setExpandedState(!hVar2.h(28) ? 3 : 1);
                if (h.a(hVar2, f.EXPAND)) {
                    obtain2.addAction(262144);
                }
                if (h.a(hVar2, f.COLLAPSE)) {
                    obtain2.addAction(524288);
                }
            }
            if (i11 >= 28) {
                obtain2.setHeading(hVar2.F > 0 ? true : z2);
            }
            hVar = this.f609i;
            if (hVar == null && hVar.f574b == i2) {
                obtain2.addAction(128);
            } else {
                obtain2.addAction(64);
            }
            r1 = hVar2.Y;
            if (r1 != 0) {
                int size2 = r1.size();
                for (?? r3 = z2; r3 < size2; r3++) {
                    g gVar = (g) r1.get(r3);
                    obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(gVar.f567a, gVar.f570d));
                }
            }
            ?? r12 = hVar2.W;
            size = r12.size();
            r7 = z2;
            while (r7 < size) {
                Object obj = r12.get(r7);
                r7++;
                h hVar11 = (h) obj;
                if (!hVar11.h(14)) {
                    int i12 = hVar11.f585i;
                    if (i12 != -1) {
                        hVar3.q(i12);
                        hVar3.k(hVar11.f585i);
                    }
                    obtain2.addChild(view, hVar11.f574b);
                }
            }
            return obtain2;
        }
        i3 = 36;
        obtain2.setSelected(hVar2.h(3));
        if (i11 >= i3) {
            obtain2.setExpandedState(!hVar2.h(28) ? 3 : 1);
            if (h.a(hVar2, f.EXPAND)) {
            }
            if (h.a(hVar2, f.COLLAPSE)) {
            }
        }
        if (i11 >= 28) {
        }
        hVar = this.f609i;
        if (hVar == null) {
        }
        obtain2.addAction(64);
        r1 = hVar2.Y;
        if (r1 != 0) {
        }
        ?? r122 = hVar2.W;
        size = r122.size();
        r7 = z2;
        while (r7 < size) {
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        View view = this.f601a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i2);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        h i2;
        if (this.f603c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.f607g;
            if (!hashMap.isEmpty()) {
                h i3 = ((h) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
                if (i3 == null || i3.f585i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (!hashMap.isEmpty() && (i2 = ((h) hashMap.get(0)).i(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f614o) {
                            if (i2 != null) {
                                g(i2.f574b, 128);
                            }
                            h hVar = this.f614o;
                            if (hVar != null) {
                                g(hVar.f574b, 256);
                            }
                            this.f614o = i2;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        h hVar2 = this.f614o;
                        if (hVar2 != null) {
                            g(hVar2.f574b, 256);
                            this.f614o = null;
                        }
                    }
                    return true;
                }
                if (!z2) {
                    return this.f604d.onAccessibilityHoverEvent(i3.f574b, motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean f(h hVar, int i2, Bundle bundle, boolean z2) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = hVar.f583g;
        int i6 = hVar.f584h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z2) {
                                hVar.f584h = hVar.f593r.length();
                            } else {
                                hVar.f584h = 0;
                            }
                        }
                    } else if (z2 && i6 < hVar.f593r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f593r.substring(hVar.f584h));
                        if (matcher.find()) {
                            hVar.f584h += matcher.start(1);
                        } else {
                            hVar.f584h = hVar.f593r.length();
                        }
                    } else if (!z2 && hVar.f584h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f593r.substring(0, hVar.f584h));
                        if (matcher2.find()) {
                            hVar.f584h = matcher2.start(1);
                        } else {
                            hVar.f584h = 0;
                        }
                    }
                } else if (z2 && i6 < hVar.f593r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f593r.substring(hVar.f584h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f584h += matcher3.start(1);
                    } else {
                        hVar.f584h = hVar.f593r.length();
                    }
                } else if (!z2 && hVar.f584h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f593r.substring(0, hVar.f584h));
                    if (matcher4.find()) {
                        hVar.f584h = matcher4.start(1);
                    }
                }
            } else if (z2 && i6 < hVar.f593r.length()) {
                hVar.f584h++;
            } else if (!z2 && (i3 = hVar.f584h) > 0) {
                hVar.f584h = i3 - 1;
            }
            if (!z3) {
                hVar.f583g = hVar.f584h;
            }
        }
        if (i5 != hVar.f583g || i6 != hVar.f584h) {
            String str = hVar.f593r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d2 = d(hVar.f574b, 8192);
            d2.getText().add(str);
            d2.setFromIndex(hVar.f583g);
            d2.setToIndex(hVar.f584h);
            d2.setItemCount(str.length());
            h(d2);
        }
        h0 h0Var = this.f602b;
        if (i4 == 1) {
            if (z2) {
                f fVar = f.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (h.a(hVar, fVar)) {
                    h0Var.b(i2, fVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                f fVar2 = f.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (h.a(hVar, fVar2)) {
                    h0Var.b(i2, fVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z2) {
                f fVar3 = f.MOVE_CURSOR_FORWARD_BY_WORD;
                if (h.a(hVar, fVar3)) {
                    h0Var.b(i2, fVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                f fVar4 = f.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (h.a(hVar, fVar4)) {
                    h0Var.b(i2, fVar4, Boolean.valueOf(z3));
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
            h hVar = this.m;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f574b);
            }
        } else if (i2 != 2) {
            return null;
        }
        h hVar2 = this.f609i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f574b);
        }
        Integer num = this.f610j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f603c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f603c.isEnabled()) {
            View view = this.f601a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f618s == z2) {
            return;
        }
        this.f618s = z2;
        int i2 = this.f611k;
        if (z2) {
            this.f611k = i2 | 1;
        } else {
            this.f611k = i2 & (-2);
        }
        ((FlutterJNI) this.f602b.f152b).setAccessibilityFeatures(this.f611k);
    }

    public final boolean j(h hVar) {
        if (hVar.f586j > 1) {
            h hVar2 = this.f609i;
            h hVar3 = null;
            if (hVar2 != null) {
                h hVar4 = hVar2.V;
                while (true) {
                    if (hVar4 == null) {
                        hVar4 = null;
                        break;
                    }
                    if (hVar4 == hVar) {
                        break;
                    }
                    hVar4 = hVar4.V;
                }
                if (hVar4 != null) {
                    return true;
                }
            }
            h hVar5 = this.f609i;
            b bVar = new b();
            if (hVar5 != null) {
                h hVar6 = hVar5.V;
                while (true) {
                    if (hVar6 == null) {
                        break;
                    }
                    if (bVar.test(hVar6)) {
                        hVar3 = hVar6;
                        break;
                    }
                    hVar6 = hVar6.V;
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
            boolean performAction = this.f604d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f610j = null;
            }
            return performAction;
        }
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f607g;
        h hVar = (h) hashMap.get(valueOf);
        if (hVar != null) {
            f fVar = f.INCREASE;
            f fVar2 = f.DECREASE;
            h0 h0Var = this.f602b;
            switch (i3) {
                case 16:
                    h0Var.a(i2, f.TAP);
                    return true;
                case 32:
                    h0Var.a(i2, f.LONG_PRESS);
                    return true;
                case 64:
                    if (this.f609i == null) {
                        this.f601a.invalidate();
                    }
                    this.f609i = hVar;
                    h0Var.a(i2, f.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", "didGainFocus");
                    hashMap2.put("nodeId", Integer.valueOf(hVar.f574b));
                    ((h0) h0Var.f151a).g(hashMap2, null);
                    g(i2, 32768);
                    if (!h.a(hVar, fVar) && !h.a(hVar, fVar2)) {
                        return true;
                    }
                    g(i2, 4);
                    return true;
                case 128:
                    h hVar2 = this.f609i;
                    if (hVar2 != null && hVar2.f574b == i2) {
                        this.f609i = null;
                    }
                    Integer num = this.f610j;
                    if (num != null && num.intValue() == i2) {
                        this.f610j = null;
                    }
                    h0Var.a(i2, f.DID_LOSE_ACCESSIBILITY_FOCUS);
                    g(i2, 65536);
                    return true;
                case 256:
                    return f(hVar, i2, bundle, true);
                case 512:
                    return f(hVar, i2, bundle, false);
                case 4096:
                    f fVar3 = f.SCROLL_UP;
                    if (h.a(hVar, fVar3)) {
                        h0Var.a(i2, fVar3);
                        return true;
                    }
                    f fVar4 = f.SCROLL_LEFT;
                    if (h.a(hVar, fVar4)) {
                        h0Var.a(i2, fVar4);
                        return true;
                    }
                    if (h.a(hVar, fVar)) {
                        hVar.f593r = hVar.f595t;
                        hVar.f594s = hVar.u;
                        g(i2, 4);
                        h0Var.a(i2, fVar);
                        return true;
                    }
                    break;
                case 8192:
                    f fVar5 = f.SCROLL_DOWN;
                    if (h.a(hVar, fVar5)) {
                        h0Var.a(i2, fVar5);
                        return true;
                    }
                    f fVar6 = f.SCROLL_RIGHT;
                    if (h.a(hVar, fVar6)) {
                        h0Var.a(i2, fVar6);
                        return true;
                    }
                    if (h.a(hVar, fVar2)) {
                        hVar.f593r = hVar.v;
                        hVar.f594s = hVar.f596w;
                        g(i2, 4);
                        h0Var.a(i2, fVar2);
                        return true;
                    }
                    break;
                case 16384:
                    h0Var.a(i2, f.COPY);
                    return true;
                case 32768:
                    h0Var.a(i2, f.PASTE);
                    return true;
                case 65536:
                    h0Var.a(i2, f.CUT);
                    return true;
                case 131072:
                    HashMap hashMap3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        hashMap3.put("base", Integer.valueOf(hVar.f584h));
                        hashMap3.put("extent", Integer.valueOf(hVar.f584h));
                    }
                    h0Var.b(i2, f.SET_SELECTION, hashMap3);
                    h hVar3 = (h) hashMap.get(Integer.valueOf(i2));
                    hVar3.f583g = ((Integer) hashMap3.get("base")).intValue();
                    hVar3.f584h = ((Integer) hashMap3.get("extent")).intValue();
                    return true;
                case 262144:
                    h0Var.a(i2, f.EXPAND);
                    return true;
                case 524288:
                    h0Var.a(i2, f.COLLAPSE);
                    return true;
                case 1048576:
                    h0Var.a(i2, f.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    h0Var.b(i2, f.SET_TEXT, string);
                    hVar.f593r = string;
                    hVar.f594s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    h0Var.a(i2, f.SHOW_ON_SCREEN);
                    return true;
                default:
                    g gVar = (g) this.f608h.get(Integer.valueOf(i3 - 267386881));
                    if (gVar != null) {
                        h0Var.b(i2, f.CUSTOM_ACTION, Integer.valueOf(gVar.f568b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
