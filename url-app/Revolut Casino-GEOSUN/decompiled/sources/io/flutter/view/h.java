package io.flutter.view;

import D.C0013n;
import L.C0026b;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
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
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h extends AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f2596x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final c0.r f2597a;

    /* renamed from: b, reason: collision with root package name */
    public final C0026b f2598b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f2599c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f2600d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f2601e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f2602f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2603g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f2604h;

    /* renamed from: i, reason: collision with root package name */
    public g f2605i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f2606j;

    /* renamed from: k, reason: collision with root package name */
    public int f2607k;

    /* renamed from: l, reason: collision with root package name */
    public String f2608l;

    /* renamed from: m, reason: collision with root package name */
    public g f2609m;

    /* renamed from: n, reason: collision with root package name */
    public g f2610n;

    /* renamed from: o, reason: collision with root package name */
    public g f2611o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2612p;

    /* renamed from: q, reason: collision with root package name */
    public int f2613q;
    public A.j r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2614s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2615t;

    /* renamed from: u, reason: collision with root package name */
    public final c f2616u;

    /* renamed from: v, reason: collision with root package name */
    public final d f2617v;

    /* renamed from: w, reason: collision with root package name */
    public final B.a f2618w;

    public h(c0.r rVar, C0026b c0026b, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(rVar, 65536);
        this.f2603g = new HashMap();
        this.f2604h = new HashMap();
        this.f2607k = 0;
        this.f2612p = new ArrayList();
        this.f2613q = 0;
        this.f2614s = false;
        this.f2615t = false;
        b bVar = new b(this);
        c cVar = new c(this);
        this.f2616u = cVar;
        B.a aVar = new B.a(this, new Handler(), 2);
        this.f2618w = aVar;
        this.f2597a = rVar;
        this.f2598b = c0026b;
        this.f2599c = accessibilityManager;
        this.f2602f = contentResolver;
        this.f2600d = accessibilityViewEmbedder;
        this.f2601e = hVar;
        c0026b.f522h = bVar;
        ((FlutterJNI) c0026b.f520f).setAccessibilityDelegate(bVar);
        cVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(cVar);
        d dVar = new d(this, accessibilityManager);
        this.f2617v = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        this.f2607k |= 128;
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && rVar != null && rVar.getResources() != null) {
            i2 = rVar.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f2607k &= -9;
            } else {
                this.f2607k |= 8;
            }
            ((FlutterJNI) c0026b.f520f).setAccessibilityFeatures(this.f2607k);
        }
        hVar.c(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        return strArr[i2];
    }

    public final f a(int i2) {
        HashMap hashMap = this.f2604h;
        f fVar = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.f2538c = -1;
        fVar2.f2537b = i2;
        fVar2.f2536a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), fVar2);
        return fVar2;
    }

    public final g b(int i2) {
        HashMap hashMap = this.f2603g;
        g gVar = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        gVar2.f2567b = i2;
        hashMap.put(Integer.valueOf(i2), gVar2);
        return gVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02dd  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        int i3;
        String str;
        boolean K2;
        boolean I2;
        boolean I3;
        int i4;
        g gVar;
        int i5;
        g gVar2;
        boolean I4;
        boolean z2;
        boolean I5;
        e eVar;
        boolean k2;
        e eVar2;
        boolean I6;
        g gVar3;
        e eVar3;
        boolean k3;
        e eVar4;
        boolean I7;
        boolean I8;
        boolean I9;
        String str2;
        String str3;
        int i6;
        boolean I10;
        boolean I11;
        int i7;
        int i8;
        boolean I12;
        boolean I13;
        boolean I14;
        g gVar4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        boolean I15;
        int i9;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList3;
        int i13;
        String str4;
        int i14;
        int i15;
        boolean I16;
        boolean I17;
        boolean I18;
        boolean I19;
        boolean I20;
        boolean I21;
        int i16;
        String str5;
        String str6;
        String str7;
        g gVar5;
        ArrayList arrayList4;
        Object[] objArr;
        boolean I22;
        boolean I23;
        boolean I24;
        boolean I25;
        int i17;
        int i18;
        int i19;
        int i20;
        f fVar;
        f fVar2;
        String str8;
        f fVar3;
        f fVar4;
        String str9;
        boolean I26;
        g gVar6;
        int i21;
        g gVar7;
        int i22;
        String str10;
        String str11;
        String str12;
        float parseFloat;
        String str13;
        String str14;
        float parseFloat2;
        String str15;
        boolean I27;
        boolean I28;
        boolean I29;
        int i23;
        int i24;
        int i25;
        String str16;
        String str17;
        int length;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        String str18;
        int i34;
        int i35;
        i(true);
        if (i2 >= 65536) {
            return this.f2600d.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f2603g;
        View view = this.f2597a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        g gVar8 = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar8 == null) {
            return null;
        }
        i3 = gVar8.f2579i;
        io.flutter.plugin.platform.h hVar = this.f2601e;
        if (i3 != -1) {
            i34 = gVar8.f2579i;
            if (hVar.g(i34)) {
                i35 = gVar8.f2579i;
                hVar.f(i35);
                return null;
            }
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
        obtain2.setImportantForAccessibility((gVar8.I(12) || (g.y(gVar8) == null && gVar8.f2571d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        str = gVar8.f2585o;
        if (str != null) {
            str18 = gVar8.f2585o;
            obtain2.setViewIdResourceName(str18);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        K2 = gVar8.K();
        obtain2.setFocusable(K2);
        g gVar9 = this.f2609m;
        if (gVar9 != null) {
            i33 = gVar9.f2567b;
            obtain2.setFocused(i33 == i2);
        }
        g gVar10 = this.f2605i;
        if (gVar10 != null) {
            i32 = gVar10.f2567b;
            obtain2.setAccessibilityFocused(i32 == i2);
        }
        I2 = gVar8.I(5);
        if (I2) {
            I27 = gVar8.I(11);
            obtain2.setPassword(I27);
            I28 = gVar8.I(21);
            if (!I28) {
                obtain2.setClassName("android.widget.EditText");
            }
            I29 = gVar8.I(21);
            obtain2.setEditable(!I29);
            i23 = gVar8.f2577g;
            if (i23 != -1) {
                i29 = gVar8.f2578h;
                if (i29 != -1) {
                    i30 = gVar8.f2577g;
                    i31 = gVar8.f2578h;
                    obtain2.setTextSelection(i30, i31);
                }
            }
            g gVar11 = this.f2605i;
            if (gVar11 != null) {
                i28 = gVar11.f2567b;
                if (i28 == i2) {
                    obtain2.setLiveRegion(1);
                }
            }
            if (g.k(gVar8, e.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i24 = 1;
            } else {
                i24 = 0;
            }
            if (g.k(gVar8, e.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i24 = 1;
            }
            if (g.k(gVar8, e.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i24 |= 2;
            }
            if (g.k(gVar8, e.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i24 |= 2;
            }
            obtain2.setMovementGranularities(i24);
            i25 = gVar8.f2573e;
            if (i25 >= 0) {
                str16 = gVar8.r;
                if (str16 == null) {
                    length = 0;
                } else {
                    str17 = gVar8.r;
                    length = str17.length();
                }
                i26 = gVar8.f2575f;
                int i36 = length - i26;
                i27 = gVar8.f2573e;
                obtain2.setMaxTextLength(i27 + i36);
            }
        }
        if (g.k(gVar8, e.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (g.k(gVar8, e.COPY)) {
            obtain2.addAction(16384);
        }
        if (g.k(gVar8, e.CUT)) {
            obtain2.addAction(65536);
        }
        if (g.k(gVar8, e.PASTE)) {
            obtain2.addAction(32768);
        }
        if (g.k(gVar8, e.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (g.o(gVar8)) {
            obtain2.setClassName("android.widget.Button");
        }
        I3 = gVar8.I(15);
        if (I3) {
            obtain2.setClassName("android.widget.ImageView");
        }
        int[] _values = F0.h._values();
        i4 = gVar8.f2545E;
        if (F.j.b(_values[i4]) == 23) {
            obtain2.setClassName("android.widget.ProgressBar");
            str10 = gVar8.r;
            if (str10 != null) {
                str11 = gVar8.f2543C;
                try {
                    if (str11 != null) {
                        try {
                            str12 = gVar8.f2543C;
                            parseFloat = Float.parseFloat(str12);
                        } catch (NumberFormatException unused) {
                        }
                        str13 = gVar8.f2544D;
                        if (str13 != null) {
                            try {
                                str14 = gVar8.f2544D;
                                parseFloat2 = Float.parseFloat(str14);
                            } catch (NumberFormatException unused2) {
                            }
                            str15 = gVar8.r;
                            obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(str15)));
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                        str15 = gVar8.r;
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(str15)));
                    }
                    str15 = gVar8.r;
                    obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(str15)));
                } catch (NumberFormatException unused3) {
                    if (Build.VERSION.SDK_INT >= 36) {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                    } else {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                    }
                }
                parseFloat = Float.NEGATIVE_INFINITY;
                str13 = gVar8.f2544D;
                if (str13 != null) {
                }
                parseFloat2 = Float.POSITIVE_INFINITY;
            }
        }
        if (g.k(gVar8, e.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        gVar = gVar8.f2561V;
        if (gVar != null) {
            gVar7 = gVar8.f2561V;
            i22 = gVar7.f2567b;
            obtain2.setParent(view, i22);
        } else {
            obtain2.setParent(view);
        }
        i5 = gVar8.f2547G;
        if (i5 != -1) {
            i21 = gVar8.f2547G;
            obtain2.setTraversalAfter(view, i21);
        }
        Rect f2 = g.f(gVar8);
        gVar2 = gVar8.f2561V;
        if (gVar2 != null) {
            gVar6 = gVar8.f2561V;
            Rect f3 = g.f(gVar6);
            Rect rect = new Rect(f2);
            rect.offset(-f3.left, -f3.top);
            obtain2.setBoundsInParent(rect);
        } else {
            obtain2.setBoundsInParent(f2);
        }
        Rect rect2 = new Rect(f2);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect2);
        obtain2.setVisibleToUser(true);
        I4 = gVar8.I(7);
        if (I4) {
            I26 = gVar8.I(8);
            if (!I26) {
                z2 = false;
                obtain2.setEnabled(z2);
                if (g.k(gVar8, e.TAP)) {
                    I5 = gVar8.I(24);
                    if (I5) {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                } else {
                    fVar3 = gVar8.Z;
                    if (fVar3 != null) {
                        fVar4 = gVar8.Z;
                        str9 = fVar4.f2540e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, str9));
                        obtain2.setClickable(true);
                    } else {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                }
                if (g.k(gVar8, e.LONG_PRESS)) {
                    fVar = gVar8.f2566a0;
                    if (fVar != null) {
                        fVar2 = gVar8.f2566a0;
                        str8 = fVar2.f2540e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, str8));
                        obtain2.setLongClickable(true);
                    } else {
                        obtain2.addAction(32);
                        obtain2.setLongClickable(true);
                    }
                }
                eVar = e.SCROLL_LEFT;
                k2 = g.k(gVar8, eVar);
                eVar2 = e.SCROLL_RIGHT;
                e eVar5 = e.SCROLL_DOWN;
                e eVar6 = e.SCROLL_UP;
                if (!k2 || g.k(gVar8, eVar6) || g.k(gVar8, eVar2) || g.k(gVar8, eVar5)) {
                    obtain2.setScrollable(true);
                    I6 = gVar8.I(19);
                    if (I6) {
                        if (g.k(gVar8, eVar) || g.k(gVar8, eVar2)) {
                            obtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            obtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (j(gVar8)) {
                    if (g.k(gVar8, eVar) || g.k(gVar8, eVar2)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            i18 = gVar8.f2580j;
                            obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, i18, false));
                        } else {
                            F0.h.g();
                            i17 = gVar8.f2580j;
                            obtain2.setCollectionInfo(Y.a.t(i17));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        i20 = gVar8.f2580j;
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i20, 1, false));
                    } else {
                        F0.h.g();
                        i19 = gVar8.f2580j;
                        obtain2.setCollectionInfo(Y.a.k(i19));
                    }
                }
                gVar3 = gVar8.f2561V;
                if (gVar3 != null && j(gVar3) && gVar8.f2561V.I(19)) {
                    gVar5 = gVar8.f2561V;
                    arrayList4 = gVar5.f2562W;
                    objArr = g.k(gVar5, eVar) && !g.k(gVar5, eVar2);
                    int indexOf = arrayList4.indexOf(gVar8);
                    if (objArr == true) {
                        if (Build.VERSION.SDK_INT < 33) {
                            I23 = gVar8.I(10);
                            obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, I23));
                        } else {
                            F0.h.j();
                            I22 = gVar8.I(10);
                            obtain2.setCollectionItemInfo(Y.a.u(indexOf, I22));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        I25 = gVar8.I(10);
                        obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, I25));
                    } else {
                        F0.h.j();
                        I24 = gVar8.I(10);
                        obtain2.setCollectionItemInfo(Y.a.l(indexOf, I24));
                    }
                }
                if (!g.k(gVar8, eVar) || g.k(gVar8, eVar6)) {
                    obtain2.addAction(4096);
                }
                if (!g.k(gVar8, eVar2) || g.k(gVar8, eVar5)) {
                    obtain2.addAction(8192);
                }
                eVar3 = e.INCREASE;
                k3 = g.k(gVar8, eVar3);
                eVar4 = e.DECREASE;
                if (!k3 || g.k(gVar8, eVar4)) {
                    obtain2.setClassName("android.widget.SeekBar");
                    if (g.k(gVar8, eVar3)) {
                        obtain2.addAction(4096);
                    }
                    if (g.k(gVar8, eVar4)) {
                        obtain2.addAction(8192);
                    }
                }
                I7 = gVar8.I(16);
                if (I7) {
                    obtain2.setLiveRegion(1);
                }
                I8 = gVar8.I(5);
                if (I8) {
                    I9 = gVar8.I(12);
                    if (!I9) {
                        CharSequence y2 = g.y(gVar8);
                        if (Build.VERSION.SDK_INT < 28) {
                            str2 = gVar8.f2595z;
                            if (str2 != null) {
                                CharSequence charSequence = y2 != null ? y2 : "";
                                StringBuilder sb = new StringBuilder();
                                sb.append((Object) charSequence);
                                sb.append("\n");
                                str3 = gVar8.f2595z;
                                sb.append(str3);
                                y2 = sb.toString();
                            }
                        }
                        if (y2 != null) {
                            obtain2.setContentDescription(y2);
                        }
                    }
                } else {
                    obtain2.setText(g.w(gVar8));
                    if (Build.VERSION.SDK_INT >= 28) {
                        obtain2.setHintText(g.x(gVar8));
                    }
                }
                i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    str5 = gVar8.f2595z;
                    if (str5 != null) {
                        str6 = gVar8.f2595z;
                        obtain2.setTooltipText(str6);
                        if (g.y(gVar8) == null) {
                            str7 = gVar8.f2595z;
                            obtain2.setContentDescription(str7);
                        }
                    }
                }
                I10 = gVar8.I(1);
                I11 = gVar8.I(17);
                obtain2.setCheckable(!I10 || I11);
                if (I10) {
                    if (I11) {
                        obtain2.setClassName("android.widget.Switch");
                        i7 = 36;
                        if (i6 >= 36) {
                            I13 = gVar8.I(18);
                            obtain2.setChecked(I13 ? 1 : 0);
                        } else {
                            I12 = gVar8.I(18);
                            obtain2.setChecked(I12);
                        }
                    } else {
                        i7 = 36;
                    }
                    i8 = 3;
                } else {
                    I18 = gVar8.I(9);
                    if (I18) {
                        obtain2.setClassName("android.widget.RadioButton");
                    } else {
                        obtain2.setClassName("android.widget.CheckBox");
                    }
                    if (i6 >= 36) {
                        I20 = gVar8.I(26);
                        if (I20) {
                            i16 = 2;
                        } else {
                            I21 = gVar8.I(2);
                            i16 = I21 ? 1 : 0;
                        }
                        obtain2.setChecked(i16);
                    } else {
                        I19 = gVar8.I(2);
                        obtain2.setChecked(I19);
                    }
                    i8 = 3;
                    i7 = 36;
                }
                I14 = gVar8.I(i8);
                obtain2.setSelected(I14);
                if (i6 >= i7) {
                    I16 = gVar8.I(27);
                    if (I16) {
                        I17 = gVar8.I(28);
                        if (!I17) {
                            i8 = 1;
                        }
                        obtain2.setExpandedState(i8);
                        if (g.k(gVar8, e.EXPAND)) {
                            obtain2.addAction(262144);
                        }
                        if (g.k(gVar8, e.COLLAPSE)) {
                            obtain2.addAction(524288);
                        }
                    }
                }
                if (i6 >= 28) {
                    i15 = gVar8.f2546F;
                    obtain2.setHeading(i15 > 0);
                }
                gVar4 = this.f2605i;
                if (gVar4 != null) {
                    i14 = gVar4.f2567b;
                    if (i14 == i2) {
                        obtain2.addAction(128);
                        arrayList = gVar8.f2564Y;
                        if (arrayList != null) {
                            arrayList3 = gVar8.f2564Y;
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                f fVar5 = (f) it2.next();
                                i13 = fVar5.f2536a;
                                str4 = fVar5.f2539d;
                                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(i13, str4));
                            }
                        }
                        arrayList2 = gVar8.f2562W;
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            g gVar12 = (g) it.next();
                            I15 = gVar12.I(14);
                            if (!I15) {
                                i9 = gVar12.f2579i;
                                if (i9 != -1) {
                                    i11 = gVar12.f2579i;
                                    hVar.f(i11);
                                    i12 = gVar12.f2579i;
                                    hVar.g(i12);
                                }
                                i10 = gVar12.f2567b;
                                obtain2.addChild(view, i10);
                            }
                        }
                        return obtain2;
                    }
                }
                obtain2.addAction(64);
                arrayList = gVar8.f2564Y;
                if (arrayList != null) {
                }
                arrayList2 = gVar8.f2562W;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                return obtain2;
            }
        }
        z2 = true;
        obtain2.setEnabled(z2);
        if (g.k(gVar8, e.TAP)) {
        }
        if (g.k(gVar8, e.LONG_PRESS)) {
        }
        eVar = e.SCROLL_LEFT;
        k2 = g.k(gVar8, eVar);
        eVar2 = e.SCROLL_RIGHT;
        e eVar52 = e.SCROLL_DOWN;
        e eVar62 = e.SCROLL_UP;
        if (!k2) {
        }
        obtain2.setScrollable(true);
        I6 = gVar8.I(19);
        if (I6) {
        }
        if (j(gVar8)) {
        }
        gVar3 = gVar8.f2561V;
        if (gVar3 != null) {
            gVar5 = gVar8.f2561V;
            arrayList4 = gVar5.f2562W;
            if (g.k(gVar5, eVar)) {
            }
            int indexOf2 = arrayList4.indexOf(gVar8);
            if (objArr == true) {
            }
        }
        if (!g.k(gVar8, eVar)) {
        }
        obtain2.addAction(4096);
        if (!g.k(gVar8, eVar2)) {
        }
        obtain2.addAction(8192);
        eVar3 = e.INCREASE;
        k3 = g.k(gVar8, eVar3);
        eVar4 = e.DECREASE;
        if (!k3) {
        }
        obtain2.setClassName("android.widget.SeekBar");
        if (g.k(gVar8, eVar3)) {
        }
        if (g.k(gVar8, eVar4)) {
        }
        I7 = gVar8.I(16);
        if (I7) {
        }
        I8 = gVar8.I(5);
        if (I8) {
        }
        i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
        }
        I10 = gVar8.I(1);
        I11 = gVar8.I(17);
        obtain2.setCheckable(!I10 || I11);
        if (I10) {
        }
        I14 = gVar8.I(i8);
        obtain2.setSelected(I14);
        if (i6 >= i7) {
        }
        if (i6 >= 28) {
        }
        gVar4 = this.f2605i;
        if (gVar4 != null) {
        }
        obtain2.addAction(64);
        arrayList = gVar8.f2564Y;
        if (arrayList != null) {
        }
        arrayList2 = gVar8.f2562W;
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        c0.r rVar = this.f2597a;
        obtain.setPackageName(rVar.getContext().getPackageName());
        obtain.setSource(rVar, i2);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        g J2;
        if (!this.f2599c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f2603g;
        if (hashMap.isEmpty()) {
            return false;
        }
        g J3 = ((g) hashMap.get(0)).J(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
        if (J3 != null && J3.f2579i != -1) {
            if (z2) {
                return false;
            }
            return this.f2600d.onAccessibilityHoverEvent(J3.f2567b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (!hashMap.isEmpty() && (J2 = ((g) hashMap.get(0)).J(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f2611o) {
                if (J2 != null) {
                    g(J2.f2567b, 128);
                }
                g gVar = this.f2611o;
                if (gVar != null) {
                    g(gVar.f2567b, 256);
                }
                this.f2611o = J2;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            g gVar2 = this.f2611o;
            if (gVar2 != null) {
                g(gVar2.f2567b, 256);
                this.f2611o = null;
            }
        }
        return true;
    }

    public final boolean f(g gVar, int i2, Bundle bundle, boolean z2) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = gVar.f2577g;
        int i6 = gVar.f2578h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z2) {
                                gVar.f2578h = gVar.r.length();
                            } else {
                                gVar.f2578h = 0;
                            }
                        }
                    } else if (z2 && i6 < gVar.r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(gVar.r.substring(gVar.f2578h));
                        if (matcher.find()) {
                            gVar.f2578h += matcher.start(1);
                        } else {
                            gVar.f2578h = gVar.r.length();
                        }
                    } else if (!z2 && gVar.f2578h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(gVar.r.substring(0, gVar.f2578h));
                        if (matcher2.find()) {
                            gVar.f2578h = matcher2.start(1);
                        } else {
                            gVar.f2578h = 0;
                        }
                    }
                } else if (z2 && i6 < gVar.r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(gVar.r.substring(gVar.f2578h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f2578h += matcher3.start(1);
                    } else {
                        gVar.f2578h = gVar.r.length();
                    }
                } else if (!z2 && gVar.f2578h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.r.substring(0, gVar.f2578h));
                    if (matcher4.find()) {
                        gVar.f2578h = matcher4.start(1);
                    }
                }
            } else if (z2 && i6 < gVar.r.length()) {
                gVar.f2578h++;
            } else if (!z2 && (i3 = gVar.f2578h) > 0) {
                gVar.f2578h = i3 - 1;
            }
            if (!z3) {
                gVar.f2577g = gVar.f2578h;
            }
        }
        if (i5 != gVar.f2577g || i6 != gVar.f2578h) {
            String str = gVar.r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d2 = d(gVar.f2567b, 8192);
            d2.getText().add(str);
            d2.setFromIndex(gVar.f2577g);
            d2.setToIndex(gVar.f2578h);
            d2.setItemCount(str.length());
            h(d2);
        }
        C0026b c0026b = this.f2598b;
        if (i4 == 1) {
            if (z2) {
                e eVar = e.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (g.k(gVar, eVar)) {
                    c0026b.u(i2, eVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar2 = e.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (g.k(gVar, eVar2)) {
                    c0026b.u(i2, eVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z2) {
                e eVar3 = e.MOVE_CURSOR_FORWARD_BY_WORD;
                if (g.k(gVar, eVar3)) {
                    c0026b.u(i2, eVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar4 = e.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (g.k(gVar, eVar4)) {
                    c0026b.u(i2, eVar4, Boolean.valueOf(z3));
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
            g gVar = this.f2609m;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f2567b);
            }
        } else if (i2 != 2) {
            return null;
        }
        g gVar2 = this.f2605i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f2567b);
        }
        Integer num = this.f2606j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f2599c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f2599c.isEnabled()) {
            View view = this.f2597a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f2614s == z2) {
            return;
        }
        this.f2614s = z2;
        if (z2) {
            this.f2607k |= 1;
        } else {
            this.f2607k &= -2;
        }
        ((FlutterJNI) this.f2598b.f520f).setAccessibilityFeatures(this.f2607k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r0 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(g gVar) {
        if (gVar.f2580j <= 1) {
            return false;
        }
        g gVar2 = this.f2605i;
        g gVar3 = null;
        if (gVar2 != null) {
            g gVar4 = gVar2.f2561V;
            while (true) {
                if (gVar4 == null) {
                    gVar4 = null;
                    break;
                }
                if (gVar4 == gVar) {
                    break;
                }
                gVar4 = gVar4.f2561V;
            }
        }
        g gVar5 = this.f2605i;
        a aVar = new a();
        if (gVar5 != null) {
            g gVar6 = gVar5.f2561V;
            while (true) {
                if (gVar6 == null) {
                    break;
                }
                if (aVar.test(gVar6)) {
                    gVar3 = gVar6;
                    break;
                }
                gVar6 = gVar6.f2561V;
            }
            if (gVar3 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.f2600d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f2606j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f2603g;
        g gVar = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar == null) {
            return false;
        }
        e eVar = e.INCREASE;
        e eVar2 = e.DECREASE;
        C0026b c0026b = this.f2598b;
        switch (i3) {
            case 16:
                c0026b.t(i2, e.TAP);
                return true;
            case 32:
                c0026b.t(i2, e.LONG_PRESS);
                return true;
            case 64:
                if (this.f2605i == null) {
                    this.f2597a.invalidate();
                }
                this.f2605i = gVar;
                c0026b.t(i2, e.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(gVar.f2567b));
                ((C0013n) c0026b.f521g).i(hashMap2, null);
                g(i2, 32768);
                if (g.k(gVar, eVar) || g.k(gVar, eVar2)) {
                    g(i2, 4);
                }
                return true;
            case 128:
                g gVar2 = this.f2605i;
                if (gVar2 != null && gVar2.f2567b == i2) {
                    this.f2605i = null;
                }
                Integer num = this.f2606j;
                if (num != null && num.intValue() == i2) {
                    this.f2606j = null;
                }
                c0026b.t(i2, e.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i2, 65536);
                return true;
            case 256:
                return f(gVar, i2, bundle, true);
            case 512:
                return f(gVar, i2, bundle, false);
            case 4096:
                e eVar3 = e.SCROLL_UP;
                if (g.k(gVar, eVar3)) {
                    c0026b.t(i2, eVar3);
                } else {
                    e eVar4 = e.SCROLL_LEFT;
                    if (g.k(gVar, eVar4)) {
                        c0026b.t(i2, eVar4);
                    } else {
                        if (!g.k(gVar, eVar)) {
                            return false;
                        }
                        gVar.r = gVar.f2589t;
                        gVar.f2588s = gVar.f2590u;
                        g(i2, 4);
                        c0026b.t(i2, eVar);
                    }
                }
                return true;
            case 8192:
                e eVar5 = e.SCROLL_DOWN;
                if (g.k(gVar, eVar5)) {
                    c0026b.t(i2, eVar5);
                } else {
                    e eVar6 = e.SCROLL_RIGHT;
                    if (g.k(gVar, eVar6)) {
                        c0026b.t(i2, eVar6);
                    } else {
                        if (!g.k(gVar, eVar2)) {
                            return false;
                        }
                        gVar.r = gVar.f2591v;
                        gVar.f2588s = gVar.f2592w;
                        g(i2, 4);
                        c0026b.t(i2, eVar2);
                    }
                }
                return true;
            case 16384:
                c0026b.t(i2, e.COPY);
                return true;
            case 32768:
                c0026b.t(i2, e.PASTE);
                return true;
            case 65536:
                c0026b.t(i2, e.CUT);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(gVar.f2578h));
                    hashMap3.put("extent", Integer.valueOf(gVar.f2578h));
                }
                c0026b.u(i2, e.SET_SELECTION, hashMap3);
                g gVar3 = (g) hashMap.get(Integer.valueOf(i2));
                gVar3.f2577g = ((Integer) hashMap3.get("base")).intValue();
                gVar3.f2578h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 262144:
                c0026b.t(i2, e.EXPAND);
                return true;
            case 524288:
                c0026b.t(i2, e.COLLAPSE);
                return true;
            case 1048576:
                c0026b.t(i2, e.DISMISS);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                c0026b.u(i2, e.SET_TEXT, string);
                gVar.r = string;
                gVar.f2588s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                c0026b.t(i2, e.SHOW_ON_SCREEN);
                return true;
            default:
                f fVar = (f) this.f2604h.get(Integer.valueOf(i3 - 267386881));
                if (fVar == null) {
                    return false;
                }
                c0026b.u(i2, e.CUSTOM_ACTION, Integer.valueOf(fVar.f2537b));
                return true;
        }
    }
}
