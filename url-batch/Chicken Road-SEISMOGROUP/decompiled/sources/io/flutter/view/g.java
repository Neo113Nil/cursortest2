package io.flutter.view;

import E.t;
import E.v;
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
public final class g extends AccessibilityNodeProvider {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f829y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f830a;

    /* renamed from: b, reason: collision with root package name */
    public final D.b f831b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f832c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f833d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f834e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f835f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f836g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f837h;

    /* renamed from: i, reason: collision with root package name */
    public f f838i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f839j;

    /* renamed from: k, reason: collision with root package name */
    public int f840k;

    /* renamed from: l, reason: collision with root package name */
    public String f841l;

    /* renamed from: m, reason: collision with root package name */
    public f f842m;

    /* renamed from: n, reason: collision with root package name */
    public f f843n;

    /* renamed from: o, reason: collision with root package name */
    public f f844o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f845p;

    /* renamed from: q, reason: collision with root package name */
    public int f846q;

    /* renamed from: r, reason: collision with root package name */
    public B.k f847r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f848s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final a f849u;

    /* renamed from: v, reason: collision with root package name */
    public final b f850v;

    /* renamed from: w, reason: collision with root package name */
    public final c f851w;

    /* renamed from: x, reason: collision with root package name */
    public final t f852x;

    public g(v vVar, D.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(vVar, 65536);
        this.f836g = new HashMap();
        this.f837h = new HashMap();
        this.f840k = 0;
        this.f845p = new ArrayList();
        this.f846q = 0;
        this.f848s = false;
        this.t = false;
        this.f849u = new a(this);
        b bVar2 = new b(this);
        this.f850v = bVar2;
        t tVar = new t(this, new Handler(), 1);
        this.f852x = tVar;
        this.f830a = vVar;
        this.f831b = bVar;
        this.f832c = accessibilityManager;
        this.f835f = contentResolver;
        this.f833d = accessibilityViewEmbedder;
        this.f834e = hVar;
        bVar2.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar2);
        c cVar = new c(this, accessibilityManager);
        this.f851w = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        this.f840k |= 128;
        tVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, tVar);
        if (Build.VERSION.SDK_INT >= 31 && vVar != null && vVar.getResources() != null) {
            i2 = vVar.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f840k &= -9;
            } else {
                this.f840k |= 8;
            }
            ((FlutterJNI) bVar.f100b).setAccessibilityFeatures(this.f840k);
        }
        hVar.d(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        return strArr[i2];
    }

    public final e a(int i2) {
        HashMap hashMap = this.f837h;
        e eVar = (e) hashMap.get(Integer.valueOf(i2));
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.f778c = -1;
        eVar2.f777b = i2;
        eVar2.f776a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), eVar2);
        return eVar2;
    }

    public final f b(int i2) {
        HashMap hashMap = this.f836g;
        f fVar = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        fVar2.f805b = i2;
        hashMap.put(Integer.valueOf(i2), fVar2);
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0279  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        int i3;
        String str;
        boolean F2;
        boolean D2;
        boolean D3;
        boolean D4;
        f fVar;
        int i4;
        f fVar2;
        boolean D5;
        boolean z;
        boolean D6;
        d dVar;
        boolean j2;
        d dVar2;
        boolean D7;
        int i5;
        int i6;
        d dVar3;
        boolean j3;
        d dVar4;
        boolean D8;
        boolean D9;
        boolean D10;
        String str2;
        String str3;
        boolean D11;
        boolean D12;
        boolean D13;
        boolean D14;
        f fVar3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        boolean D15;
        int i7;
        int i8;
        int i9;
        int i10;
        ArrayList arrayList3;
        int i11;
        String str4;
        int i12;
        int i13;
        boolean D16;
        boolean D17;
        boolean D18;
        boolean D19;
        String str5;
        String str6;
        String str7;
        e eVar;
        e eVar2;
        String str8;
        e eVar3;
        e eVar4;
        String str9;
        boolean D20;
        f fVar4;
        int i14;
        f fVar5;
        int i15;
        boolean D21;
        boolean D22;
        boolean D23;
        int i16;
        int i17;
        int i18;
        String str10;
        String str11;
        int length;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        String str12;
        int i27;
        int i28;
        i(true);
        if (i2 >= 65536) {
            return this.f833d.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f836g;
        View view = this.f830a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        f fVar6 = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar6 == null) {
            return null;
        }
        i3 = fVar6.f813i;
        io.flutter.plugin.platform.h hVar = this.f834e;
        if (i3 != -1) {
            i27 = fVar6.f813i;
            if (hVar.h(i27)) {
                i28 = fVar6.f813i;
                hVar.f(i28);
                return null;
            }
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
        int i29 = Build.VERSION.SDK_INT;
        obtain2.setImportantForAccessibility((fVar6.D(12) || (f.t(fVar6) == null && fVar6.f808d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        str = fVar6.f819o;
        if (str != null) {
            str12 = fVar6.f819o;
            obtain2.setViewIdResourceName(str12);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        F2 = fVar6.F();
        obtain2.setFocusable(F2);
        f fVar7 = this.f842m;
        if (fVar7 != null) {
            i26 = fVar7.f805b;
            obtain2.setFocused(i26 == i2);
        }
        f fVar8 = this.f838i;
        if (fVar8 != null) {
            i25 = fVar8.f805b;
            obtain2.setAccessibilityFocused(i25 == i2);
        }
        D2 = fVar6.D(5);
        if (D2) {
            D21 = fVar6.D(11);
            obtain2.setPassword(D21);
            D22 = fVar6.D(21);
            if (!D22) {
                obtain2.setClassName("android.widget.EditText");
            }
            D23 = fVar6.D(21);
            obtain2.setEditable(!D23);
            i16 = fVar6.f811g;
            if (i16 != -1) {
                i22 = fVar6.f812h;
                if (i22 != -1) {
                    i23 = fVar6.f811g;
                    i24 = fVar6.f812h;
                    obtain2.setTextSelection(i23, i24);
                }
            }
            f fVar9 = this.f838i;
            if (fVar9 != null) {
                i21 = fVar9.f805b;
                if (i21 == i2) {
                    obtain2.setLiveRegion(1);
                }
            }
            if (f.j(fVar6, d.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i17 = 1;
            } else {
                i17 = 0;
            }
            if (f.j(fVar6, d.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i17 = 1;
            }
            if (f.j(fVar6, d.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i17 |= 2;
            }
            if (f.j(fVar6, d.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i17 |= 2;
            }
            obtain2.setMovementGranularities(i17);
            i18 = fVar6.f809e;
            if (i18 >= 0) {
                str10 = fVar6.f822r;
                if (str10 == null) {
                    length = 0;
                } else {
                    str11 = fVar6.f822r;
                    length = str11.length();
                }
                i19 = fVar6.f810f;
                int i30 = length - i19;
                i20 = fVar6.f809e;
                obtain2.setMaxTextLength(i20 + i30);
            }
        }
        if (f.j(fVar6, d.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (f.j(fVar6, d.COPY)) {
            obtain2.addAction(16384);
        }
        if (f.j(fVar6, d.CUT)) {
            obtain2.addAction(65536);
        }
        if (f.j(fVar6, d.PASTE)) {
            obtain2.addAction(32768);
        }
        if (f.j(fVar6, d.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        D3 = fVar6.D(4);
        if (D3) {
            obtain2.setClassName("android.widget.Button");
        }
        D4 = fVar6.D(15);
        if (D4) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (f.j(fVar6, d.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        fVar = fVar6.R;
        if (fVar != null) {
            fVar5 = fVar6.R;
            i15 = fVar5.f805b;
            obtain2.setParent(view, i15);
        } else {
            obtain2.setParent(view);
        }
        i4 = fVar6.f784D;
        if (i4 != -1) {
            i14 = fVar6.f784D;
            obtain2.setTraversalAfter(view, i14);
        }
        Rect d2 = f.d(fVar6);
        fVar2 = fVar6.R;
        if (fVar2 != null) {
            fVar4 = fVar6.R;
            Rect d3 = f.d(fVar4);
            Rect rect = new Rect(d2);
            rect.offset(-d3.left, -d3.top);
            obtain2.setBoundsInParent(rect);
        } else {
            obtain2.setBoundsInParent(d2);
        }
        Rect rect2 = new Rect(d2);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect2);
        obtain2.setVisibleToUser(true);
        D5 = fVar6.D(7);
        if (D5) {
            D20 = fVar6.D(8);
            if (!D20) {
                z = false;
                obtain2.setEnabled(z);
                if (f.j(fVar6, d.TAP)) {
                    D6 = fVar6.D(24);
                    if (D6) {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                } else {
                    eVar3 = fVar6.f798V;
                    if (eVar3 != null) {
                        eVar4 = fVar6.f798V;
                        str9 = eVar4.f780e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, str9));
                        obtain2.setClickable(true);
                    } else {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                }
                if (f.j(fVar6, d.LONG_PRESS)) {
                    eVar = fVar6.f799W;
                    if (eVar != null) {
                        eVar2 = fVar6.f799W;
                        str8 = eVar2.f780e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, str8));
                        obtain2.setLongClickable(true);
                    } else {
                        obtain2.addAction(32);
                        obtain2.setLongClickable(true);
                    }
                }
                dVar = d.SCROLL_LEFT;
                j2 = f.j(fVar6, dVar);
                d dVar5 = d.SCROLL_DOWN;
                d dVar6 = d.SCROLL_UP;
                dVar2 = d.SCROLL_RIGHT;
                if (!j2 || f.j(fVar6, dVar6) || f.j(fVar6, dVar2) || f.j(fVar6, dVar5)) {
                    obtain2.setScrollable(true);
                    D7 = fVar6.D(19);
                    if (D7) {
                        if (f.j(fVar6, dVar) || f.j(fVar6, dVar2)) {
                            if (j(fVar6)) {
                                i5 = fVar6.f814j;
                                obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, i5, false));
                            } else {
                                obtain2.setClassName("android.widget.HorizontalScrollView");
                            }
                        } else if (j(fVar6)) {
                            i6 = fVar6.f814j;
                            obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i6, 0, false));
                        } else {
                            obtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                    if (!f.j(fVar6, dVar) || f.j(fVar6, dVar6)) {
                        obtain2.addAction(4096);
                    }
                    if (!f.j(fVar6, dVar2) || f.j(fVar6, dVar5)) {
                        obtain2.addAction(8192);
                    }
                }
                dVar3 = d.INCREASE;
                j3 = f.j(fVar6, dVar3);
                dVar4 = d.DECREASE;
                if (!j3 || f.j(fVar6, dVar4)) {
                    obtain2.setClassName("android.widget.SeekBar");
                    if (f.j(fVar6, dVar3)) {
                        obtain2.addAction(4096);
                    }
                    if (f.j(fVar6, dVar4)) {
                        obtain2.addAction(8192);
                    }
                }
                D8 = fVar6.D(16);
                if (D8) {
                    obtain2.setLiveRegion(1);
                }
                D9 = fVar6.D(5);
                if (D9) {
                    D10 = fVar6.D(12);
                    if (!D10) {
                        CharSequence t = f.t(fVar6);
                        if (i29 < 28) {
                            str2 = fVar6.z;
                            if (str2 != null) {
                                CharSequence charSequence = t != null ? t : "";
                                StringBuilder sb = new StringBuilder();
                                sb.append((Object) charSequence);
                                sb.append("\n");
                                str3 = fVar6.z;
                                sb.append(str3);
                                t = sb.toString();
                            }
                        }
                        if (t != null) {
                            obtain2.setContentDescription(t);
                        }
                    }
                } else {
                    obtain2.setText(f.r(fVar6));
                    if (i29 >= 28) {
                        obtain2.setHintText(f.s(fVar6));
                    }
                }
                if (i29 >= 28) {
                    str5 = fVar6.z;
                    if (str5 != null) {
                        str6 = fVar6.z;
                        obtain2.setTooltipText(str6);
                        if (f.t(fVar6) == null) {
                            str7 = fVar6.z;
                            obtain2.setContentDescription(str7);
                        }
                    }
                }
                D11 = fVar6.D(1);
                D12 = fVar6.D(17);
                obtain2.setCheckable(!D11 || D12);
                if (!D11) {
                    D18 = fVar6.D(2);
                    obtain2.setChecked(D18);
                    D19 = fVar6.D(9);
                    if (D19) {
                        obtain2.setClassName("android.widget.RadioButton");
                    } else {
                        obtain2.setClassName("android.widget.CheckBox");
                    }
                } else if (D12) {
                    D13 = fVar6.D(18);
                    obtain2.setChecked(D13);
                    obtain2.setClassName("android.widget.Switch");
                }
                D14 = fVar6.D(3);
                obtain2.setSelected(D14);
                if (i29 >= 36) {
                    D16 = fVar6.D(27);
                    if (D16) {
                        D17 = fVar6.D(28);
                        obtain2.setExpandedState(D17 ? 3 : 1);
                        if (f.j(fVar6, d.EXPAND)) {
                            obtain2.addAction(262144);
                        }
                        if (f.j(fVar6, d.COLLAPSE)) {
                            obtain2.addAction(524288);
                        }
                    }
                }
                if (i29 >= 28) {
                    i13 = fVar6.f783C;
                    obtain2.setHeading(i13 > 0);
                }
                fVar3 = this.f838i;
                if (fVar3 != null) {
                    i12 = fVar3.f805b;
                    if (i12 == i2) {
                        obtain2.addAction(128);
                        arrayList = fVar6.f797U;
                        if (arrayList != null) {
                            arrayList3 = fVar6.f797U;
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                e eVar5 = (e) it2.next();
                                i11 = eVar5.f776a;
                                str4 = eVar5.f779d;
                                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(i11, str4));
                            }
                        }
                        arrayList2 = fVar6.f795S;
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            f fVar10 = (f) it.next();
                            D15 = fVar10.D(14);
                            if (!D15) {
                                i7 = fVar10.f813i;
                                if (i7 != -1) {
                                    i9 = fVar10.f813i;
                                    hVar.f(i9);
                                    i10 = fVar10.f813i;
                                    if (!hVar.h(i10)) {
                                        throw null;
                                    }
                                }
                                i8 = fVar10.f805b;
                                obtain2.addChild(view, i8);
                            }
                        }
                        return obtain2;
                    }
                }
                obtain2.addAction(64);
                arrayList = fVar6.f797U;
                if (arrayList != null) {
                }
                arrayList2 = fVar6.f795S;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                return obtain2;
            }
        }
        z = true;
        obtain2.setEnabled(z);
        if (f.j(fVar6, d.TAP)) {
        }
        if (f.j(fVar6, d.LONG_PRESS)) {
        }
        dVar = d.SCROLL_LEFT;
        j2 = f.j(fVar6, dVar);
        d dVar52 = d.SCROLL_DOWN;
        d dVar62 = d.SCROLL_UP;
        dVar2 = d.SCROLL_RIGHT;
        if (!j2) {
        }
        obtain2.setScrollable(true);
        D7 = fVar6.D(19);
        if (D7) {
        }
        if (!f.j(fVar6, dVar)) {
        }
        obtain2.addAction(4096);
        if (!f.j(fVar6, dVar2)) {
        }
        obtain2.addAction(8192);
        dVar3 = d.INCREASE;
        j3 = f.j(fVar6, dVar3);
        dVar4 = d.DECREASE;
        if (!j3) {
        }
        obtain2.setClassName("android.widget.SeekBar");
        if (f.j(fVar6, dVar3)) {
        }
        if (f.j(fVar6, dVar4)) {
        }
        D8 = fVar6.D(16);
        if (D8) {
        }
        D9 = fVar6.D(5);
        if (D9) {
        }
        if (i29 >= 28) {
        }
        D11 = fVar6.D(1);
        D12 = fVar6.D(17);
        obtain2.setCheckable(!D11 || D12);
        if (!D11) {
        }
        D14 = fVar6.D(3);
        obtain2.setSelected(D14);
        if (i29 >= 36) {
        }
        if (i29 >= 28) {
        }
        fVar3 = this.f838i;
        if (fVar3 != null) {
        }
        obtain2.addAction(64);
        arrayList = fVar6.f797U;
        if (arrayList != null) {
        }
        arrayList2 = fVar6.f795S;
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        v vVar = this.f830a;
        obtain.setPackageName(vVar.getContext().getPackageName());
        obtain.setSource(vVar, i2);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z) {
        f E2;
        if (!this.f832c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f836g;
        if (hashMap.isEmpty()) {
            return false;
        }
        f E3 = ((f) hashMap.get(0)).E(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z);
        if (E3 != null && E3.f813i != -1) {
            if (z) {
                return false;
            }
            return this.f833d.onAccessibilityHoverEvent(E3.f805b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (!hashMap.isEmpty() && (E2 = ((f) hashMap.get(0)).E(new float[]{x2, y2, 0.0f, 1.0f}, z)) != this.f844o) {
                if (E2 != null) {
                    g(E2.f805b, 128);
                }
                f fVar = this.f844o;
                if (fVar != null) {
                    g(fVar.f805b, 256);
                }
                this.f844o = E2;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            f fVar2 = this.f844o;
            if (fVar2 != null) {
                g(fVar2.f805b, 256);
                this.f844o = null;
            }
        }
        return true;
    }

    public final boolean f(f fVar, int i2, Bundle bundle, boolean z) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = fVar.f811g;
        int i6 = fVar.f812h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z) {
                                fVar.f812h = fVar.f822r.length();
                            } else {
                                fVar.f812h = 0;
                            }
                        }
                    } else if (z && i6 < fVar.f822r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(fVar.f822r.substring(fVar.f812h));
                        if (matcher.find()) {
                            fVar.f812h += matcher.start(1);
                        } else {
                            fVar.f812h = fVar.f822r.length();
                        }
                    } else if (!z && fVar.f812h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(fVar.f822r.substring(0, fVar.f812h));
                        if (matcher2.find()) {
                            fVar.f812h = matcher2.start(1);
                        } else {
                            fVar.f812h = 0;
                        }
                    }
                } else if (z && i6 < fVar.f822r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(fVar.f822r.substring(fVar.f812h));
                    matcher3.find();
                    if (matcher3.find()) {
                        fVar.f812h += matcher3.start(1);
                    } else {
                        fVar.f812h = fVar.f822r.length();
                    }
                } else if (!z && fVar.f812h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(fVar.f822r.substring(0, fVar.f812h));
                    if (matcher4.find()) {
                        fVar.f812h = matcher4.start(1);
                    }
                }
            } else if (z && i6 < fVar.f822r.length()) {
                fVar.f812h++;
            } else if (!z && (i3 = fVar.f812h) > 0) {
                fVar.f812h = i3 - 1;
            }
            if (!z2) {
                fVar.f811g = fVar.f812h;
            }
        }
        if (i5 != fVar.f811g || i6 != fVar.f812h) {
            String str = fVar.f822r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d2 = d(fVar.f805b, 8192);
            d2.getText().add(str);
            d2.setFromIndex(fVar.f811g);
            d2.setToIndex(fVar.f812h);
            d2.setItemCount(str.length());
            h(d2);
        }
        D.b bVar = this.f831b;
        if (i4 == 1) {
            if (z) {
                d dVar = d.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (f.j(fVar, dVar)) {
                    bVar.c(i2, dVar, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (!z) {
                d dVar2 = d.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (f.j(fVar, dVar2)) {
                    bVar.c(i2, dVar2, Boolean.valueOf(z2));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z) {
                d dVar3 = d.MOVE_CURSOR_FORWARD_BY_WORD;
                if (f.j(fVar, dVar3)) {
                    bVar.c(i2, dVar3, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (!z) {
                d dVar4 = d.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (f.j(fVar, dVar4)) {
                    bVar.c(i2, dVar4, Boolean.valueOf(z2));
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
            f fVar = this.f842m;
            if (fVar != null) {
                return createAccessibilityNodeInfo(fVar.f805b);
            }
        } else if (i2 != 2) {
            return null;
        }
        f fVar2 = this.f838i;
        if (fVar2 != null) {
            return createAccessibilityNodeInfo(fVar2.f805b);
        }
        Integer num = this.f839j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f832c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f832c.isEnabled()) {
            View view = this.f830a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z) {
        if (this.f848s == z) {
            return;
        }
        this.f848s = z;
        if (z) {
            this.f840k |= 1;
        } else {
            this.f840k &= -2;
        }
        ((FlutterJNI) this.f831b.f100b).setAccessibilityFeatures(this.f840k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(f fVar) {
        if (fVar.f814j > 0) {
            f fVar2 = this.f838i;
            f fVar3 = null;
            if (fVar2 != null) {
                f fVar4 = fVar2.R;
                while (true) {
                    if (fVar4 == null) {
                        fVar4 = null;
                        break;
                    }
                    if (fVar4 == fVar) {
                        break;
                    }
                    fVar4 = fVar4.R;
                }
            }
            f fVar5 = this.f838i;
            if (fVar5 != null) {
                f fVar6 = fVar5.R;
                while (true) {
                    if (fVar6 == null) {
                        break;
                    }
                    if (fVar6.D(19)) {
                        fVar3 = fVar6;
                        break;
                    }
                    fVar6 = fVar6.R;
                }
                if (fVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.f833d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f839j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f836g;
        f fVar = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar == null) {
            return false;
        }
        d dVar = d.INCREASE;
        d dVar2 = d.DECREASE;
        D.b bVar = this.f831b;
        switch (i3) {
            case 16:
                bVar.b(i2, d.TAP);
                return true;
            case 32:
                bVar.b(i2, d.LONG_PRESS);
                return true;
            case 64:
                if (this.f838i == null) {
                    this.f830a.invalidate();
                }
                this.f838i = fVar;
                bVar.b(i2, d.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(fVar.f805b));
                ((A.e) bVar.f99a).j(hashMap2, null);
                g(i2, 32768);
                if (f.j(fVar, dVar) || f.j(fVar, dVar2)) {
                    g(i2, 4);
                }
                return true;
            case 128:
                f fVar2 = this.f838i;
                if (fVar2 != null && fVar2.f805b == i2) {
                    this.f838i = null;
                }
                Integer num = this.f839j;
                if (num != null && num.intValue() == i2) {
                    this.f839j = null;
                }
                bVar.b(i2, d.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i2, 65536);
                return true;
            case 256:
                return f(fVar, i2, bundle, true);
            case 512:
                return f(fVar, i2, bundle, false);
            case 4096:
                d dVar3 = d.SCROLL_UP;
                if (f.j(fVar, dVar3)) {
                    bVar.b(i2, dVar3);
                } else {
                    d dVar4 = d.SCROLL_LEFT;
                    if (f.j(fVar, dVar4)) {
                        bVar.b(i2, dVar4);
                    } else {
                        if (!f.j(fVar, dVar)) {
                            return false;
                        }
                        fVar.f822r = fVar.t;
                        fVar.f823s = fVar.f824u;
                        g(i2, 4);
                        bVar.b(i2, dVar);
                    }
                }
                return true;
            case 8192:
                d dVar5 = d.SCROLL_DOWN;
                if (f.j(fVar, dVar5)) {
                    bVar.b(i2, dVar5);
                } else {
                    d dVar6 = d.SCROLL_RIGHT;
                    if (f.j(fVar, dVar6)) {
                        bVar.b(i2, dVar6);
                    } else {
                        if (!f.j(fVar, dVar2)) {
                            return false;
                        }
                        fVar.f822r = fVar.f825v;
                        fVar.f823s = fVar.f826w;
                        g(i2, 4);
                        bVar.b(i2, dVar2);
                    }
                }
                return true;
            case 16384:
                bVar.b(i2, d.COPY);
                return true;
            case 32768:
                bVar.b(i2, d.PASTE);
                return true;
            case 65536:
                bVar.b(i2, d.CUT);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(fVar.f812h));
                    hashMap3.put("extent", Integer.valueOf(fVar.f812h));
                }
                bVar.c(i2, d.SET_SELECTION, hashMap3);
                f fVar3 = (f) hashMap.get(Integer.valueOf(i2));
                fVar3.f811g = ((Integer) hashMap3.get("base")).intValue();
                fVar3.f812h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 262144:
                bVar.b(i2, d.EXPAND);
                return true;
            case 524288:
                bVar.b(i2, d.COLLAPSE);
                return true;
            case 1048576:
                bVar.b(i2, d.DISMISS);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                bVar.c(i2, d.SET_TEXT, string);
                fVar.f822r = string;
                fVar.f823s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                bVar.b(i2, d.SHOW_ON_SCREEN);
                return true;
            default:
                e eVar = (e) this.f837h.get(Integer.valueOf(i3 - 267386881));
                if (eVar == null) {
                    return false;
                }
                bVar.c(i2, d.CUSTOM_ACTION, Integer.valueOf(eVar.f777b));
                return true;
        }
    }
}
