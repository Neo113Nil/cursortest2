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
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u0.C0679i;

/* loaded from: classes.dex */
public final class i extends AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f4695x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f4696a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.c f4697b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f4698c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f4699d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.i f4700e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f4701f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f4702g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f4703h;

    /* renamed from: i, reason: collision with root package name */
    public h f4704i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f4705j;

    /* renamed from: k, reason: collision with root package name */
    public int f4706k;

    /* renamed from: l, reason: collision with root package name */
    public String f4707l;

    /* renamed from: m, reason: collision with root package name */
    public h f4708m;

    /* renamed from: n, reason: collision with root package name */
    public h f4709n;

    /* renamed from: o, reason: collision with root package name */
    public h f4710o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f4711p;

    /* renamed from: q, reason: collision with root package name */
    public int f4712q;

    /* renamed from: r, reason: collision with root package name */
    public J1.c f4713r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4714s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4715t;

    /* renamed from: u, reason: collision with root package name */
    public final d f4716u;

    /* renamed from: v, reason: collision with root package name */
    public final e f4717v;

    /* renamed from: w, reason: collision with root package name */
    public final D3.q f4718w;

    public i(View view, B0.c cVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.i iVar) {
        int i7;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f4702g = new HashMap();
        this.f4703h = new HashMap();
        this.f4706k = 0;
        this.f4711p = new ArrayList();
        this.f4712q = 0;
        this.f4714s = false;
        this.f4715t = false;
        c cVar2 = new c(this);
        d dVar = new d(this);
        this.f4716u = dVar;
        D3.q qVar = new D3.q(this, new Handler(), 2);
        this.f4718w = qVar;
        this.f4696a = view;
        this.f4697b = cVar;
        this.f4698c = accessibilityManager;
        this.f4701f = contentResolver;
        this.f4699d = accessibilityViewEmbedder;
        this.f4700e = iVar;
        cVar.f71g = cVar2;
        ((FlutterJNI) cVar.f73i).setAccessibilityDelegate(cVar2);
        dVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(dVar);
        e eVar = new e(this, accessibilityManager);
        this.f4717v = eVar;
        eVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(eVar);
        this.f4706k |= 128;
        qVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, qVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i7 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i7 == Integer.MAX_VALUE || i7 < 300) {
                this.f4706k &= -9;
            } else {
                this.f4706k |= 8;
            }
            ((FlutterJNI) cVar.f73i).setAccessibilityFeatures(this.f4706k);
        }
        iVar.c(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i7 = byteBuffer.getInt();
        if (i7 == -1) {
            return null;
        }
        return strArr[i7];
    }

    public final g a(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f4703h;
        g gVar = (g) hashMap.get(valueOf);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.f4636c = -1;
        gVar2.f4635b = i7;
        gVar2.f4634a = 267386881 + i7;
        hashMap.put(Integer.valueOf(i7), gVar2);
        return gVar2;
    }

    public final h b(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f4702g;
        h hVar = (h) hashMap.get(valueOf);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f4667b = i7;
        hashMap.put(Integer.valueOf(i7), hVar2);
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
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        boolean h7;
        boolean z5;
        int i8;
        h hVar;
        ?? r12;
        int size;
        ?? r7;
        String str;
        float parseFloat;
        String str2;
        float parseFloat2;
        int i9;
        int i10;
        i(true);
        if (i7 >= 65536) {
            return this.f4699d.createAccessibilityNodeInfo(i7);
        }
        HashMap hashMap = this.f4702g;
        View view = this.f4696a;
        if (i7 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        h hVar2 = (h) hashMap.get(Integer.valueOf(i7));
        if (hVar2 == null) {
            return null;
        }
        int i11 = hVar2.f4678i;
        io.flutter.plugin.platform.i iVar = this.f4700e;
        if (i11 != -1 && iVar.g(i11)) {
            iVar.i(hVar2.f4678i);
            return null;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i7);
        obtain2.setImportantForAccessibility((hVar2.h(12) || (h.b(hVar2) == null && hVar2.f4671d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        String str3 = hVar2.f4684o;
        if (str3 != null) {
            obtain2.setViewIdResourceName(str3);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i7);
        obtain2.setFocusable(hVar2.j());
        h hVar3 = this.f4708m;
        if (hVar3 != null) {
            obtain2.setFocused(hVar3.f4667b == i7);
        }
        h hVar4 = this.f4704i;
        if (hVar4 != null) {
            obtain2.setAccessibilityFocused(hVar4.f4667b == i7);
        }
        if (hVar2.h(5)) {
            obtain2.setPassword(hVar2.h(11));
            if (!hVar2.h(21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!hVar2.h(21));
            int i12 = hVar2.f4676g;
            if (i12 != -1 && (i10 = hVar2.f4677h) != -1) {
                obtain2.setTextSelection(i12, i10);
            }
            h hVar5 = this.f4704i;
            if (hVar5 != null && hVar5.f4667b == i7) {
                obtain2.setLiveRegion(1);
            }
            if (h.a(hVar2, f.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (h.a(hVar2, f.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i9 = 1;
            }
            if (h.a(hVar2, f.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i9 |= 2;
            }
            if (h.a(hVar2, f.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i9 |= 2;
            }
            obtain2.setMovementGranularities(i9);
            if (hVar2.f4673e >= 0) {
                String str4 = hVar2.f4687r;
                obtain2.setMaxTextLength(((str4 == null ? 0 : str4.length()) - hVar2.f4674f) + hVar2.f4673e);
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
            h7 = true;
        } else {
            String str5 = hVar2.f4639A;
            h7 = (str5 == null || str5.isEmpty()) ? hVar2.h(23) : false;
        }
        if (h7) {
            obtain2.setClassName("android.widget.Button");
        }
        if (hVar2.h(15)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (N.p.c(N.p.d(33)[hVar2.f4643E]) == 23) {
            obtain2.setClassName("android.widget.ProgressBar");
            if (hVar2.f4687r != null) {
                String str6 = hVar2.f4641C;
                try {
                    if (str6 != null) {
                        try {
                            parseFloat = Float.parseFloat(str6);
                        } catch (NumberFormatException unused) {
                        }
                        str2 = hVar2.f4642D;
                        if (str2 != null) {
                            try {
                                parseFloat2 = Float.parseFloat(str2);
                            } catch (NumberFormatException unused2) {
                            }
                            obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar2.f4687r)));
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar2.f4687r)));
                    }
                    obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar2.f4687r)));
                } catch (NumberFormatException unused3) {
                    if (Build.VERSION.SDK_INT >= 36) {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                    } else {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                    }
                }
                parseFloat = Float.NEGATIVE_INFINITY;
                str2 = hVar2.f4642D;
                if (str2 != null) {
                }
                parseFloat2 = Float.POSITIVE_INFINITY;
            }
        }
        if (h.a(hVar2, f.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        h hVar6 = hVar2.f4660V;
        if (hVar6 != null) {
            obtain2.setParent(view, hVar6.f4667b);
        } else {
            obtain2.setParent(view);
        }
        int i13 = hVar2.f4645G;
        if (i13 != -1) {
            obtain2.setTraversalAfter(view, i13);
        }
        Rect rect = hVar2.f4675f0;
        h hVar7 = hVar2.f4660V;
        if (hVar7 != null) {
            Rect rect2 = hVar7.f4675f0;
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
            if (hVar2.f4664Z != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar2.f4664Z.f4638e));
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
            if (hVar2.f4666a0 != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar2.f4666a0.f4638e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        f fVar = f.SCROLL_LEFT;
        boolean a7 = h.a(hVar2, fVar);
        f fVar2 = f.SCROLL_DOWN;
        f fVar3 = f.SCROLL_UP;
        f fVar4 = f.SCROLL_RIGHT;
        if (a7 || h.a(hVar2, fVar3) || h.a(hVar2, fVar4) || h.a(hVar2, fVar2)) {
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
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, hVar2.f4679j, false));
                } else {
                    obtain2.setCollectionInfo(b.k(hVar2.f4679j));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar2.f4679j, 1, false));
            } else {
                obtain2.setCollectionInfo(b.g(hVar2.f4679j));
            }
        }
        h hVar8 = hVar2.f4660V;
        if (hVar8 != null && j(hVar8) && hVar2.f4660V.h(19)) {
            h hVar9 = hVar2.f4660V;
            ArrayList arrayList = hVar9.f4661W;
            boolean z6 = (h.a(hVar9, fVar) || h.a(hVar9, fVar4)) ? false : true;
            int indexOf = arrayList.indexOf(hVar2);
            if (z6) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, hVar2.h(10)));
                } else {
                    obtain2.setCollectionItemInfo(b.h(indexOf, hVar2.h(10)));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, hVar2.h(10)));
            } else {
                obtain2.setCollectionItemInfo(b.l(indexOf, hVar2.h(10)));
            }
        }
        if (h.a(hVar2, fVar) || h.a(hVar2, fVar3)) {
            obtain2.addAction(4096);
        }
        if (h.a(hVar2, fVar4) || h.a(hVar2, fVar2)) {
            obtain2.addAction(8192);
        }
        f fVar5 = f.INCREASE;
        boolean a8 = h.a(hVar2, fVar5);
        f fVar6 = f.DECREASE;
        if (a8 || h.a(hVar2, fVar6)) {
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
            C0679i c0679i = new C0679i();
            c0679i.f5981f = hVar2.f4687r;
            c0679i.f5982g = hVar2.f4688s;
            c0679i.f5983h = hVar2.d();
            obtain2.setText(c0679i.a());
            if (Build.VERSION.SDK_INT >= 28) {
                C0679i c0679i2 = new C0679i();
                c0679i2.f5981f = hVar2.f4685p;
                c0679i2.f5982g = hVar2.f4686q;
                c0679i2.f5984i = hVar2.f4639A;
                c0679i2.f5983h = hVar2.d();
                SpannableString a9 = c0679i2.a();
                C0679i c0679i3 = new C0679i();
                c0679i3.f5981f = hVar2.f4693x;
                c0679i3.f5982g = hVar2.y;
                c0679i3.f5983h = hVar2.d();
                CharSequence[] charSequenceArr = {a9, c0679i3.a()};
                int i14 = 0;
                CharSequence charSequence = null;
                for (int i15 = 2; i14 < i15; i15 = 2) {
                    CharSequence charSequence2 = charSequenceArr[i14];
                    if (charSequence2 != null && charSequence2.length() > 0) {
                        charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                    }
                    i14++;
                }
                z5 = false;
                obtain2.setHintText(charSequence);
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
            if (!hVar2.h(12)) {
                CharSequence b7 = h.b(hVar2);
                if (Build.VERSION.SDK_INT < 28 && hVar2.f4694z != null) {
                    b7 = ((Object) (b7 != null ? b7 : "")) + "\n" + hVar2.f4694z;
                }
                if (b7 != null) {
                    obtain2.setContentDescription(b7);
                }
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 28 && (str = hVar2.f4694z) != null) {
            obtain2.setTooltipText(str);
            if (h.b(hVar2) == null) {
                obtain2.setContentDescription(hVar2.f4694z);
            }
        }
        boolean h8 = hVar2.h(1);
        boolean h9 = hVar2.h(17);
        obtain2.setCheckable((h8 || h9) ? true : z5);
        if (h8) {
            if (hVar2.h(9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
            if (i16 >= 36) {
                obtain2.setChecked((int) (hVar2.h(26) ? 2 : hVar2.h(2) ? 1 : z5));
            } else {
                obtain2.setChecked(hVar2.h(2));
            }
        } else if (h9) {
            obtain2.setClassName("android.widget.Switch");
            i8 = 36;
            if (i16 >= 36) {
                obtain2.setChecked(hVar2.h(18) ? 1 : 0);
            } else {
                obtain2.setChecked(hVar2.h(18));
            }
            obtain2.setSelected(hVar2.h(3));
            if (i16 >= i8 && hVar2.h(27)) {
                obtain2.setExpandedState(!hVar2.h(28) ? 3 : 1);
                if (h.a(hVar2, f.EXPAND)) {
                    obtain2.addAction(262144);
                }
                if (h.a(hVar2, f.COLLAPSE)) {
                    obtain2.addAction(524288);
                }
            }
            if (i16 >= 28) {
                obtain2.setHeading(hVar2.f4644F > 0 ? true : z5);
            }
            hVar = this.f4704i;
            if (hVar == null && hVar.f4667b == i7) {
                obtain2.addAction(128);
            } else {
                obtain2.addAction(64);
            }
            r12 = hVar2.f4663Y;
            if (r12 != 0) {
                int size2 = r12.size();
                for (?? r32 = z5; r32 < size2; r32++) {
                    g gVar = (g) r12.get(r32);
                    obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(gVar.f4634a, gVar.f4637d));
                }
            }
            ?? r13 = hVar2.f4661W;
            size = r13.size();
            r7 = z5;
            while (r7 < size) {
                Object obj = r13.get(r7);
                r7++;
                h hVar10 = (h) obj;
                if (!hVar10.h(14)) {
                    int i17 = hVar10.f4678i;
                    if (i17 != -1) {
                        iVar.i(i17);
                        iVar.g(hVar10.f4678i);
                    }
                    obtain2.addChild(view, hVar10.f4667b);
                }
            }
            return obtain2;
        }
        i8 = 36;
        obtain2.setSelected(hVar2.h(3));
        if (i16 >= i8) {
            obtain2.setExpandedState(!hVar2.h(28) ? 3 : 1);
            if (h.a(hVar2, f.EXPAND)) {
            }
            if (h.a(hVar2, f.COLLAPSE)) {
            }
        }
        if (i16 >= 28) {
        }
        hVar = this.f4704i;
        if (hVar == null) {
        }
        obtain2.addAction(64);
        r12 = hVar2.f4663Y;
        if (r12 != 0) {
        }
        ?? r132 = hVar2.f4661W;
        size = r132.size();
        r7 = z5;
        while (r7 < size) {
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i7, int i8) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        View view = this.f4696a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i7);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z5) {
        h i7;
        if (this.f4698c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.f4702g;
            if (!hashMap.isEmpty()) {
                h i8 = ((h) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z5);
                if (i8 == null || i8.f4678i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x6 = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (!hashMap.isEmpty() && (i7 = ((h) hashMap.get(0)).i(new float[]{x6, y, 0.0f, 1.0f}, z5)) != this.f4710o) {
                            if (i7 != null) {
                                g(i7.f4667b, 128);
                            }
                            h hVar = this.f4710o;
                            if (hVar != null) {
                                g(hVar.f4667b, 256);
                            }
                            this.f4710o = i7;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        h hVar2 = this.f4710o;
                        if (hVar2 != null) {
                            g(hVar2.f4667b, 256);
                            this.f4710o = null;
                        }
                    }
                    return true;
                }
                if (!z5) {
                    return this.f4699d.onAccessibilityHoverEvent(i8.f4667b, motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean f(h hVar, int i7, Bundle bundle, boolean z5) {
        int i8;
        int i9 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z6 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i10 = hVar.f4676g;
        int i11 = hVar.f4677h;
        if (i11 >= 0 && i10 >= 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        if (i9 == 8 || i9 == 16) {
                            if (z5) {
                                hVar.f4677h = hVar.f4687r.length();
                            } else {
                                hVar.f4677h = 0;
                            }
                        }
                    } else if (z5 && i11 < hVar.f4687r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f4687r.substring(hVar.f4677h));
                        if (matcher.find()) {
                            hVar.f4677h += matcher.start(1);
                        } else {
                            hVar.f4677h = hVar.f4687r.length();
                        }
                    } else if (!z5 && hVar.f4677h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f4687r.substring(0, hVar.f4677h));
                        if (matcher2.find()) {
                            hVar.f4677h = matcher2.start(1);
                        } else {
                            hVar.f4677h = 0;
                        }
                    }
                } else if (z5 && i11 < hVar.f4687r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f4687r.substring(hVar.f4677h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f4677h += matcher3.start(1);
                    } else {
                        hVar.f4677h = hVar.f4687r.length();
                    }
                } else if (!z5 && hVar.f4677h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f4687r.substring(0, hVar.f4677h));
                    if (matcher4.find()) {
                        hVar.f4677h = matcher4.start(1);
                    }
                }
            } else if (z5 && i11 < hVar.f4687r.length()) {
                hVar.f4677h++;
            } else if (!z5 && (i8 = hVar.f4677h) > 0) {
                hVar.f4677h = i8 - 1;
            }
            if (!z6) {
                hVar.f4676g = hVar.f4677h;
            }
        }
        if (i10 != hVar.f4676g || i11 != hVar.f4677h) {
            String str = hVar.f4687r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d7 = d(hVar.f4667b, 8192);
            d7.getText().add(str);
            d7.setFromIndex(hVar.f4676g);
            d7.setToIndex(hVar.f4677h);
            d7.setItemCount(str.length());
            h(d7);
        }
        B0.c cVar = this.f4697b;
        if (i9 == 1) {
            if (z5) {
                f fVar = f.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (h.a(hVar, fVar)) {
                    cVar.i(i7, fVar, Boolean.valueOf(z6));
                    return true;
                }
            }
            if (!z5) {
                f fVar2 = f.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (h.a(hVar, fVar2)) {
                    cVar.i(i7, fVar2, Boolean.valueOf(z6));
                    return true;
                }
            }
        } else if (i9 == 2) {
            if (z5) {
                f fVar3 = f.MOVE_CURSOR_FORWARD_BY_WORD;
                if (h.a(hVar, fVar3)) {
                    cVar.i(i7, fVar3, Boolean.valueOf(z6));
                    return true;
                }
            }
            if (!z5) {
                f fVar4 = f.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (h.a(hVar, fVar4)) {
                    cVar.i(i7, fVar4, Boolean.valueOf(z6));
                    return true;
                }
            }
        } else if (i9 == 4 || i9 == 8 || i9 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        if (i7 == 1) {
            h hVar = this.f4708m;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f4667b);
            }
        } else if (i7 != 2) {
            return null;
        }
        h hVar2 = this.f4704i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f4667b);
        }
        Integer num = this.f4705j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i7, int i8) {
        if (this.f4698c.isEnabled()) {
            h(d(i7, i8));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f4698c.isEnabled()) {
            View view = this.f4696a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z5) {
        if (this.f4714s == z5) {
            return;
        }
        this.f4714s = z5;
        if (z5) {
            this.f4706k |= 1;
        } else {
            this.f4706k &= -2;
        }
        ((FlutterJNI) this.f4697b.f73i).setAccessibilityFeatures(this.f4706k);
    }

    public final boolean j(h hVar) {
        if (hVar.f4679j > 1) {
            h hVar2 = this.f4704i;
            h hVar3 = null;
            if (hVar2 != null) {
                h hVar4 = hVar2.f4660V;
                while (true) {
                    if (hVar4 == null) {
                        hVar4 = null;
                        break;
                    }
                    if (hVar4 == hVar) {
                        break;
                    }
                    hVar4 = hVar4.f4660V;
                }
                if (hVar4 != null) {
                    return true;
                }
            }
            h hVar5 = this.f4704i;
            I4.g gVar = new I4.g(2);
            if (hVar5 != null) {
                h hVar6 = hVar5.f4660V;
                while (true) {
                    if (hVar6 == null) {
                        break;
                    }
                    if (gVar.test(hVar6)) {
                        hVar3 = hVar6;
                        break;
                    }
                    hVar6 = hVar6.f4660V;
                }
                if (hVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i8, Bundle bundle) {
        if (i7 >= 65536) {
            boolean performAction = this.f4699d.performAction(i7, i8, bundle);
            if (performAction && i8 == 128) {
                this.f4705j = null;
            }
            return performAction;
        }
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f4702g;
        h hVar = (h) hashMap.get(valueOf);
        if (hVar != null) {
            f fVar = f.INCREASE;
            f fVar2 = f.DECREASE;
            B0.c cVar = this.f4697b;
            switch (i8) {
                case 16:
                    cVar.g(i7, f.TAP);
                    return true;
                case 32:
                    cVar.g(i7, f.LONG_PRESS);
                    return true;
                case 64:
                    if (this.f4704i == null) {
                        this.f4696a.invalidate();
                    }
                    this.f4704i = hVar;
                    cVar.g(i7, f.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, "didGainFocus");
                    hashMap2.put("nodeId", Integer.valueOf(hVar.f4667b));
                    ((B0.c) cVar.f72h).z(hashMap2, null);
                    g(i7, 32768);
                    if (!h.a(hVar, fVar) && !h.a(hVar, fVar2)) {
                        return true;
                    }
                    g(i7, 4);
                    return true;
                case 128:
                    h hVar2 = this.f4704i;
                    if (hVar2 != null && hVar2.f4667b == i7) {
                        this.f4704i = null;
                    }
                    Integer num = this.f4705j;
                    if (num != null && num.intValue() == i7) {
                        this.f4705j = null;
                    }
                    cVar.g(i7, f.DID_LOSE_ACCESSIBILITY_FOCUS);
                    g(i7, 65536);
                    return true;
                case 256:
                    return f(hVar, i7, bundle, true);
                case 512:
                    return f(hVar, i7, bundle, false);
                case 4096:
                    f fVar3 = f.SCROLL_UP;
                    if (h.a(hVar, fVar3)) {
                        cVar.g(i7, fVar3);
                        return true;
                    }
                    f fVar4 = f.SCROLL_LEFT;
                    if (h.a(hVar, fVar4)) {
                        cVar.g(i7, fVar4);
                        return true;
                    }
                    if (h.a(hVar, fVar)) {
                        hVar.f4687r = hVar.f4689t;
                        hVar.f4688s = hVar.f4690u;
                        g(i7, 4);
                        cVar.g(i7, fVar);
                        return true;
                    }
                    break;
                case 8192:
                    f fVar5 = f.SCROLL_DOWN;
                    if (h.a(hVar, fVar5)) {
                        cVar.g(i7, fVar5);
                        return true;
                    }
                    f fVar6 = f.SCROLL_RIGHT;
                    if (h.a(hVar, fVar6)) {
                        cVar.g(i7, fVar6);
                        return true;
                    }
                    if (h.a(hVar, fVar2)) {
                        hVar.f4687r = hVar.f4691v;
                        hVar.f4688s = hVar.f4692w;
                        g(i7, 4);
                        cVar.g(i7, fVar2);
                        return true;
                    }
                    break;
                case 16384:
                    cVar.g(i7, f.COPY);
                    return true;
                case 32768:
                    cVar.g(i7, f.PASTE);
                    return true;
                case 65536:
                    cVar.g(i7, f.CUT);
                    return true;
                case 131072:
                    HashMap hashMap3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        hashMap3.put("base", Integer.valueOf(hVar.f4677h));
                        hashMap3.put("extent", Integer.valueOf(hVar.f4677h));
                    }
                    cVar.i(i7, f.SET_SELECTION, hashMap3);
                    h hVar3 = (h) hashMap.get(Integer.valueOf(i7));
                    hVar3.f4676g = ((Integer) hashMap3.get("base")).intValue();
                    hVar3.f4677h = ((Integer) hashMap3.get("extent")).intValue();
                    return true;
                case 262144:
                    cVar.g(i7, f.EXPAND);
                    return true;
                case 524288:
                    cVar.g(i7, f.COLLAPSE);
                    return true;
                case 1048576:
                    cVar.g(i7, f.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    cVar.i(i7, f.SET_TEXT, string);
                    hVar.f4687r = string;
                    hVar.f4688s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    cVar.g(i7, f.SHOW_ON_SCREEN);
                    return true;
                default:
                    g gVar = (g) this.f4703h.get(Integer.valueOf(i8 - 267386881));
                    if (gVar != null) {
                        cVar.i(i7, f.CUSTOM_ACTION, Integer.valueOf(gVar.f4635b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
