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
import b0.C0178i;
import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i extends AccessibilityNodeProvider {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f9421y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f9422a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.f f9423b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f9424c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f9425d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f9426e;
    public final ContentResolver f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f9427g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f9428h;

    /* renamed from: i, reason: collision with root package name */
    public h f9429i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f9430j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f9431k;

    /* renamed from: l, reason: collision with root package name */
    public int f9432l;

    /* renamed from: m, reason: collision with root package name */
    public String f9433m;

    /* renamed from: n, reason: collision with root package name */
    public h f9434n;
    public h o;

    /* renamed from: p, reason: collision with root package name */
    public h f9435p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f9436q;

    /* renamed from: r, reason: collision with root package name */
    public int f9437r;

    /* renamed from: s, reason: collision with root package name */
    public C0178i f9438s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9439t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9440u;
    public final d v;

    /* renamed from: w, reason: collision with root package name */
    public final e f9441w;

    /* renamed from: x, reason: collision with root package name */
    public final E1.q f9442x;

    public i(View view, A0.f fVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.k kVar) {
        int i3;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f9427g = new HashMap();
        this.f9428h = new HashMap();
        this.f9432l = 0;
        this.f9436q = new ArrayList();
        this.f9437r = 0;
        this.f9439t = false;
        this.f9440u = false;
        c cVar = new c(this);
        d dVar = new d(this);
        this.v = dVar;
        E1.q qVar = new E1.q(this, new Handler(), 2);
        this.f9442x = qVar;
        this.f9422a = view;
        this.f9423b = fVar;
        this.f9424c = accessibilityManager;
        this.f = contentResolver;
        this.f9425d = accessibilityViewEmbedder;
        this.f9426e = kVar;
        fVar.f25d = cVar;
        ((FlutterJNI) fVar.f24c).setAccessibilityDelegate(cVar);
        dVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(dVar);
        e eVar = new e(this, accessibilityManager);
        this.f9441w = eVar;
        eVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(eVar);
        this.f9432l |= 128;
        qVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, qVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i3 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i3 == Integer.MAX_VALUE || i3 < 300) {
                this.f9432l &= -9;
            } else {
                this.f9432l |= 8;
            }
            ((FlutterJNI) fVar.f24c).setAccessibilityFeatures(this.f9432l);
        }
        kVar.c(this);
    }

    public static String d(ByteBuffer byteBuffer, String[] strArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        return strArr[i3];
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f9425d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f9431k = recordFlutterId;
            this.f9434n = null;
            return true;
        }
        if (eventType == 128) {
            this.f9435p = null;
            return true;
        }
        if (eventType == 32768) {
            this.f9430j = recordFlutterId;
            this.f9429i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f9431k = null;
        this.f9430j = null;
        return true;
    }

    public final g b(int i3) {
        HashMap hashMap = this.f9428h;
        g gVar = (g) hashMap.get(Integer.valueOf(i3));
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.f9365c = -1;
        gVar2.f9364b = i3;
        gVar2.f9363a = 267386881 + i3;
        hashMap.put(Integer.valueOf(i3), gVar2);
        return gVar2;
    }

    public final h c(int i3) {
        HashMap hashMap = this.f9427g;
        h hVar = (h) hashMap.get(Integer.valueOf(i3));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f9395b = i3;
        hashMap.put(Integer.valueOf(i3), hVar2);
        return hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        boolean z;
        boolean h3;
        String str;
        float parseFloat;
        String str2;
        float parseFloat2;
        int i4;
        int i5;
        j(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f9425d;
        if (i3 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i3);
        }
        HashMap hashMap = this.f9427g;
        View view = this.f9422a;
        if (i3 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        h hVar = (h) hashMap.get(Integer.valueOf(i3));
        if (hVar != null) {
            int i6 = hVar.f9406i;
            io.flutter.plugin.platform.k kVar = this.f9426e;
            if (i6 == -1 || !kVar.f(i6)) {
                AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i3);
                obtain2.setImportantForAccessibility((hVar.h(12) || (h.b(hVar) == null && hVar.f9399d == 0)) ? false : true);
                obtain2.setViewIdResourceName("");
                String str3 = hVar.o;
                if (str3 != null) {
                    obtain2.setViewIdResourceName(str3);
                }
                obtain2.setPackageName(view.getContext().getPackageName());
                obtain2.setClassName("android.view.View");
                obtain2.setSource(view, i3);
                obtain2.setFocusable(hVar.j());
                h hVar2 = this.f9434n;
                if (hVar2 != null) {
                    obtain2.setFocused(hVar2.f9395b == i3);
                }
                h hVar3 = this.f9429i;
                if (hVar3 != null) {
                    obtain2.setAccessibilityFocused(hVar3.f9395b == i3);
                }
                if (hVar.h(5)) {
                    obtain2.setPassword(hVar.h(11));
                    if (!hVar.h(21)) {
                        obtain2.setClassName("android.widget.EditText");
                    }
                    obtain2.setEditable(!hVar.h(21));
                    int i7 = hVar.f9404g;
                    if (i7 != -1 && (i5 = hVar.f9405h) != -1) {
                        obtain2.setTextSelection(i7, i5);
                    }
                    h hVar4 = this.f9429i;
                    if (hVar4 != null && hVar4.f9395b == i3) {
                        obtain2.setLiveRegion(1);
                    }
                    if (h.a(hVar, f.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                        obtain2.addAction(256);
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    if (h.a(hVar, f.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                        obtain2.addAction(512);
                        i4 = 1;
                    }
                    if (h.a(hVar, f.MOVE_CURSOR_FORWARD_BY_WORD)) {
                        obtain2.addAction(256);
                        i4 |= 2;
                    }
                    if (h.a(hVar, f.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                        obtain2.addAction(512);
                        i4 |= 2;
                    }
                    obtain2.setMovementGranularities(i4);
                    z = false;
                    if (hVar.f9401e >= 0) {
                        String str4 = hVar.f9414r;
                        obtain2.setMaxTextLength(((str4 == null ? 0 : str4.length()) - hVar.f) + hVar.f9401e);
                        z = false;
                    }
                } else {
                    z = 0;
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
                if (hVar.h(4)) {
                    h3 = true;
                } else {
                    String str5 = hVar.f9368A;
                    h3 = (str5 == null || str5.isEmpty()) ? hVar.h(23) : z;
                }
                if (h3) {
                    obtain2.setClassName("android.widget.Button");
                }
                if (hVar.h(15)) {
                    obtain2.setClassName("android.widget.ImageView");
                }
                if (M.j.b(M.j.c(33)[hVar.f9372E]) == 23) {
                    obtain2.setClassName("android.widget.ProgressBar");
                    if (hVar.f9414r != null) {
                        String str6 = hVar.f9370C;
                        try {
                            if (str6 != null) {
                                try {
                                    parseFloat = Float.parseFloat(str6);
                                } catch (NumberFormatException unused) {
                                }
                                str2 = hVar.f9371D;
                                if (str2 != null) {
                                    try {
                                        parseFloat2 = Float.parseFloat(str2);
                                    } catch (NumberFormatException unused2) {
                                    }
                                    obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar.f9414r)));
                                }
                                parseFloat2 = Float.POSITIVE_INFINITY;
                                obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar.f9414r)));
                            }
                            obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(hVar.f9414r)));
                        } catch (NumberFormatException unused3) {
                            if (Build.VERSION.SDK_INT >= 36) {
                                obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                            } else {
                                obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                            }
                        }
                        parseFloat = Float.NEGATIVE_INFINITY;
                        str2 = hVar.f9371D;
                        if (str2 != null) {
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                    }
                }
                if (h.a(hVar, f.DISMISS)) {
                    obtain2.setDismissable(true);
                    obtain2.addAction(1048576);
                }
                h hVar5 = hVar.f9388V;
                if (hVar5 != null) {
                    obtain2.setParent(view, hVar5.f9395b);
                } else {
                    obtain2.setParent(view);
                }
                int i8 = hVar.f9374G;
                if (i8 != -1) {
                    obtain2.setTraversalAfter(view, i8);
                }
                Rect rect = hVar.f9403f0;
                h hVar6 = hVar.f9388V;
                if (hVar6 != null) {
                    Rect rect2 = hVar6.f9403f0;
                    Rect rect3 = new Rect(rect);
                    rect3.offset(-rect2.left, -rect2.top);
                    obtain2.setBoundsInParent(rect3);
                } else {
                    obtain2.setBoundsInParent(rect);
                }
                Rect rect4 = new Rect(rect);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect4.offset(iArr[z], iArr[1]);
                obtain2.setBoundsInScreen(rect4);
                obtain2.setVisibleToUser(true);
                obtain2.setEnabled((!hVar.h(7) || hVar.h(8)) ? true : z);
                if (h.a(hVar, f.TAP)) {
                    if (hVar.f9392Z != null) {
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar.f9392Z.f9367e));
                        obtain2.setClickable(true);
                    } else {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                } else if (hVar.h(24)) {
                    obtain2.addAction(16);
                    obtain2.setClickable(true);
                }
                if (h.a(hVar, f.LONG_PRESS)) {
                    if (hVar.f9394a0 != null) {
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar.f9394a0.f9367e));
                        obtain2.setLongClickable(true);
                    } else {
                        obtain2.addAction(32);
                        obtain2.setLongClickable(true);
                    }
                }
                f fVar = f.SCROLL_LEFT;
                boolean a3 = h.a(hVar, fVar);
                f fVar2 = f.SCROLL_RIGHT;
                f fVar3 = f.SCROLL_DOWN;
                f fVar4 = f.SCROLL_UP;
                if (a3 || h.a(hVar, fVar4) || h.a(hVar, fVar2) || h.a(hVar, fVar3)) {
                    obtain2.setScrollable(true);
                    if (hVar.h(19)) {
                        if (h.a(hVar, fVar) || h.a(hVar, fVar2)) {
                            obtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            obtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (k(hVar)) {
                    if (h.a(hVar, fVar) || h.a(hVar, fVar2)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, hVar.f9407j, false));
                        } else {
                            obtain2.setCollectionInfo(io.flutter.plugin.editing.a.i(hVar.f9407j));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar.f9407j, 1, z));
                    } else {
                        obtain2.setCollectionInfo(io.flutter.plugin.editing.a.e(hVar.f9407j));
                    }
                }
                h hVar7 = hVar.f9388V;
                if (hVar7 != null && k(hVar7) && hVar.f9388V.h(19)) {
                    h hVar8 = hVar.f9388V;
                    ArrayList arrayList = hVar8.f9389W;
                    boolean z2 = (h.a(hVar8, fVar) || h.a(hVar8, fVar2)) ? false : true;
                    int indexOf = arrayList.indexOf(hVar);
                    if (z2) {
                        if (Build.VERSION.SDK_INT < 33) {
                            obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, hVar.h(10)));
                        } else {
                            obtain2.setCollectionItemInfo(io.flutter.plugin.editing.a.f(indexOf, hVar.h(10)));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, hVar.h(10)));
                    } else {
                        obtain2.setCollectionItemInfo(io.flutter.plugin.editing.a.j(indexOf, hVar.h(10)));
                    }
                }
                if (h.a(hVar, fVar) || h.a(hVar, fVar4)) {
                    obtain2.addAction(4096);
                }
                if (h.a(hVar, fVar2) || h.a(hVar, fVar3)) {
                    obtain2.addAction(8192);
                }
                f fVar5 = f.INCREASE;
                boolean a4 = h.a(hVar, fVar5);
                f fVar6 = f.DECREASE;
                if (a4 || h.a(hVar, fVar6)) {
                    obtain2.setClassName("android.widget.SeekBar");
                    if (h.a(hVar, fVar5)) {
                        obtain2.addAction(4096);
                    }
                    if (h.a(hVar, fVar6)) {
                        obtain2.addAction(8192);
                    }
                }
                if (hVar.h(16)) {
                    obtain2.setLiveRegion(1);
                }
                if (hVar.h(5)) {
                    B0.p pVar = new B0.p();
                    pVar.f162a = hVar.f9414r;
                    pVar.f163b = hVar.f9415s;
                    pVar.f164c = hVar.d();
                    obtain2.setText(pVar.a());
                    if (Build.VERSION.SDK_INT >= 28) {
                        B0.p pVar2 = new B0.p();
                        pVar2.f162a = hVar.f9412p;
                        pVar2.f163b = hVar.f9413q;
                        pVar2.f165d = hVar.f9368A;
                        pVar2.f164c = hVar.d();
                        SpannableString a5 = pVar2.a();
                        B0.p pVar3 = new B0.p();
                        pVar3.f162a = hVar.f9419x;
                        pVar3.f163b = hVar.f9420y;
                        pVar3.f164c = hVar.d();
                        CharSequence[] charSequenceArr = {a5, pVar3.a()};
                        int i9 = 0;
                        CharSequence charSequence = null;
                        for (int i10 = 2; i9 < i10; i10 = 2) {
                            CharSequence charSequence2 = charSequenceArr[i9];
                            if (charSequence2 != null && charSequence2.length() > 0) {
                                if (charSequence != null && charSequence.length() != 0) {
                                    charSequence2 = TextUtils.concat(charSequence, ", ", charSequence2);
                                }
                                charSequence = charSequence2;
                            }
                            i9++;
                        }
                        obtain2.setHintText(charSequence);
                    }
                } else if (!hVar.h(12)) {
                    CharSequence b3 = h.b(hVar);
                    if (Build.VERSION.SDK_INT < 28 && hVar.z != null) {
                        b3 = ((Object) (b3 != null ? b3 : "")) + IOUtils.LINE_SEPARATOR_UNIX + hVar.z;
                    }
                    if (b3 != null) {
                        obtain2.setContentDescription(b3);
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && (str = hVar.z) != null) {
                    obtain2.setTooltipText(str);
                    if (h.b(hVar) == null) {
                        obtain2.setContentDescription(hVar.z);
                    }
                }
                boolean h4 = hVar.h(1);
                boolean h5 = hVar.h(17);
                obtain2.setCheckable(h4 || h5);
                if (h4) {
                    if (hVar.h(9)) {
                        obtain2.setClassName("android.widget.RadioButton");
                    } else {
                        obtain2.setClassName("android.widget.CheckBox");
                    }
                    if (i11 >= 36) {
                        obtain2.setChecked(hVar.h(26) ? 2 : hVar.h(2) ? 1 : 0);
                    } else {
                        obtain2.setChecked(hVar.h(2));
                    }
                } else if (h5) {
                    obtain2.setClassName("android.widget.Switch");
                    if (i11 >= 36) {
                        obtain2.setChecked(hVar.h(18) ? 1 : 0);
                    } else {
                        obtain2.setChecked(hVar.h(18));
                    }
                }
                obtain2.setSelected(hVar.h(3));
                if (i11 >= 36 && hVar.h(27)) {
                    obtain2.setExpandedState(hVar.h(28) ? 3 : 1);
                    if (h.a(hVar, f.EXPAND)) {
                        obtain2.addAction(262144);
                    }
                    if (h.a(hVar, f.COLLAPSE)) {
                        obtain2.addAction(524288);
                    }
                }
                if (i11 >= 28) {
                    obtain2.setHeading(hVar.f9373F > 0);
                }
                h hVar9 = this.f9429i;
                if (hVar9 == null || hVar9.f9395b != i3) {
                    obtain2.addAction(64);
                } else {
                    obtain2.addAction(128);
                }
                ArrayList arrayList2 = hVar.f9391Y;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        g gVar = (g) it.next();
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(gVar.f9363a, gVar.f9366d));
                    }
                }
                Iterator it2 = hVar.f9389W.iterator();
                while (it2.hasNext()) {
                    h hVar10 = (h) it2.next();
                    if (!hVar10.h(14)) {
                        int i12 = hVar10.f9406i;
                        if (i12 != -1) {
                            View j3 = kVar.j(i12);
                            if (!kVar.f(hVar10.f9406i) && j3 != null) {
                                j3.setImportantForAccessibility(0);
                                obtain2.addChild(j3);
                            }
                        }
                        obtain2.addChild(view, hVar10.f9395b);
                    }
                }
                return obtain2;
            }
            View j4 = kVar.j(hVar.f9406i);
            if (j4 != null) {
                return accessibilityViewEmbedder.getRootNode(j4, hVar.f9395b, hVar.f9403f0);
            }
        }
        return null;
    }

    public final AccessibilityEvent e(int i3, int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        View view = this.f9422a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i3);
        return obtain;
    }

    public final boolean f(MotionEvent motionEvent, boolean z) {
        h i3;
        if (this.f9424c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.f9427g;
            if (!hashMap.isEmpty()) {
                h i4 = ((h) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z);
                if (i4 == null || i4.f9406i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x3 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        if (!hashMap.isEmpty() && (i3 = ((h) hashMap.get(0)).i(new float[]{x3, y3, 0.0f, 1.0f}, z)) != this.f9435p) {
                            if (i3 != null) {
                                h(i3.f9395b, 128);
                            }
                            h hVar = this.f9435p;
                            if (hVar != null) {
                                h(hVar.f9395b, 256);
                            }
                            this.f9435p = i3;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        h hVar2 = this.f9435p;
                        if (hVar2 != null) {
                            h(hVar2.f9395b, 256);
                            this.f9435p = null;
                        }
                    }
                    return true;
                }
                if (!z) {
                    return this.f9425d.onAccessibilityHoverEvent(i4.f9395b, motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        if (i3 == 1) {
            h hVar = this.f9434n;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f9395b);
            }
            Integer num = this.f9431k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i3 != 2) {
            return null;
        }
        h hVar2 = this.f9429i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f9395b);
        }
        Integer num2 = this.f9430j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final boolean g(h hVar, int i3, Bundle bundle, boolean z) {
        int i4;
        int i5 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i6 = hVar.f9404g;
        int i7 = hVar.f9405h;
        if (i7 >= 0 && i6 >= 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 4) {
                        if (i5 == 8 || i5 == 16) {
                            if (z) {
                                hVar.f9405h = hVar.f9414r.length();
                            } else {
                                hVar.f9405h = 0;
                            }
                        }
                    } else if (z && i7 < hVar.f9414r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f9414r.substring(hVar.f9405h));
                        if (matcher.find()) {
                            hVar.f9405h += matcher.start(1);
                        } else {
                            hVar.f9405h = hVar.f9414r.length();
                        }
                    } else if (!z && hVar.f9405h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f9414r.substring(0, hVar.f9405h));
                        if (matcher2.find()) {
                            hVar.f9405h = matcher2.start(1);
                        } else {
                            hVar.f9405h = 0;
                        }
                    }
                } else if (z && i7 < hVar.f9414r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f9414r.substring(hVar.f9405h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f9405h += matcher3.start(1);
                    } else {
                        hVar.f9405h = hVar.f9414r.length();
                    }
                } else if (!z && hVar.f9405h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f9414r.substring(0, hVar.f9405h));
                    if (matcher4.find()) {
                        hVar.f9405h = matcher4.start(1);
                    }
                }
            } else if (z && i7 < hVar.f9414r.length()) {
                hVar.f9405h++;
            } else if (!z && (i4 = hVar.f9405h) > 0) {
                hVar.f9405h = i4 - 1;
            }
            if (!z2) {
                hVar.f9404g = hVar.f9405h;
            }
        }
        if (i6 != hVar.f9404g || i7 != hVar.f9405h) {
            String str = hVar.f9414r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent e3 = e(hVar.f9395b, 8192);
            e3.getText().add(str);
            e3.setFromIndex(hVar.f9404g);
            e3.setToIndex(hVar.f9405h);
            e3.setItemCount(str.length());
            i(e3);
        }
        A0.f fVar = this.f9423b;
        if (i5 == 1) {
            if (z) {
                f fVar2 = f.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (h.a(hVar, fVar2)) {
                    fVar.x(i3, fVar2, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (!z) {
                f fVar3 = f.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (h.a(hVar, fVar3)) {
                    fVar.x(i3, fVar3, Boolean.valueOf(z2));
                    return true;
                }
            }
        } else if (i5 == 2) {
            if (z) {
                f fVar4 = f.MOVE_CURSOR_FORWARD_BY_WORD;
                if (h.a(hVar, fVar4)) {
                    fVar.x(i3, fVar4, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (!z) {
                f fVar5 = f.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (h.a(hVar, fVar5)) {
                    fVar.x(i3, fVar5, Boolean.valueOf(z2));
                    return true;
                }
            }
        } else if (i5 == 4 || i5 == 8 || i5 == 16) {
            return true;
        }
        return false;
    }

    public final void h(int i3, int i4) {
        if (this.f9424c.isEnabled()) {
            i(e(i3, i4));
        }
    }

    public final void i(AccessibilityEvent accessibilityEvent) {
        if (this.f9424c.isEnabled()) {
            View view = this.f9422a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void j(boolean z) {
        if (this.f9439t == z) {
            return;
        }
        this.f9439t = z;
        if (z) {
            this.f9432l |= 1;
        } else {
            this.f9432l &= -2;
        }
        ((FlutterJNI) this.f9423b.f24c).setAccessibilityFeatures(this.f9432l);
    }

    public final boolean k(h hVar) {
        if (hVar.f9407j > 1) {
            h hVar2 = this.f9429i;
            h hVar3 = null;
            if (hVar2 != null) {
                h hVar4 = hVar2.f9388V;
                while (true) {
                    if (hVar4 == null) {
                        hVar4 = null;
                        break;
                    }
                    if (hVar4 == hVar) {
                        break;
                    }
                    hVar4 = hVar4.f9388V;
                }
                if (hVar4 != null) {
                    return true;
                }
            }
            h hVar5 = this.f9429i;
            b bVar = new b();
            if (hVar5 != null) {
                h hVar6 = hVar5.f9388V;
                while (true) {
                    if (hVar6 == null) {
                        break;
                    }
                    if (bVar.test(hVar6)) {
                        hVar3 = hVar6;
                        break;
                    }
                    hVar6 = hVar6.f9388V;
                }
                if (hVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        if (i3 >= 65536) {
            boolean performAction = this.f9425d.performAction(i3, i4, bundle);
            if (performAction && i4 == 128) {
                this.f9430j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f9427g;
        h hVar = (h) hashMap.get(Integer.valueOf(i3));
        if (hVar != null) {
            f fVar = f.INCREASE;
            f fVar2 = f.DECREASE;
            A0.f fVar3 = this.f9423b;
            switch (i4) {
                case 16:
                    fVar3.w(i3, f.TAP);
                    return true;
                case 32:
                    fVar3.w(i3, f.LONG_PRESS);
                    return true;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (this.f9429i == null) {
                        this.f9422a.invalidate();
                    }
                    this.f9429i = hVar;
                    fVar3.w(i3, f.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", "didGainFocus");
                    hashMap2.put("nodeId", Integer.valueOf(hVar.f9395b));
                    ((B0.p) fVar3.f23b).h(hashMap2, null);
                    h(i3, 32768);
                    if (!h.a(hVar, fVar) && !h.a(hVar, fVar2)) {
                        return true;
                    }
                    h(i3, 4);
                    return true;
                case 128:
                    h hVar2 = this.f9429i;
                    if (hVar2 != null && hVar2.f9395b == i3) {
                        this.f9429i = null;
                    }
                    Integer num = this.f9430j;
                    if (num != null && num.intValue() == i3) {
                        this.f9430j = null;
                    }
                    fVar3.w(i3, f.DID_LOSE_ACCESSIBILITY_FOCUS);
                    h(i3, 65536);
                    return true;
                case 256:
                    return g(hVar, i3, bundle, true);
                case 512:
                    return g(hVar, i3, bundle, false);
                case 4096:
                    f fVar4 = f.SCROLL_UP;
                    if (h.a(hVar, fVar4)) {
                        fVar3.w(i3, fVar4);
                        return true;
                    }
                    f fVar5 = f.SCROLL_LEFT;
                    if (h.a(hVar, fVar5)) {
                        fVar3.w(i3, fVar5);
                        return true;
                    }
                    if (h.a(hVar, fVar)) {
                        hVar.f9414r = hVar.f9416t;
                        hVar.f9415s = hVar.f9417u;
                        h(i3, 4);
                        fVar3.w(i3, fVar);
                        return true;
                    }
                    break;
                case 8192:
                    f fVar6 = f.SCROLL_DOWN;
                    if (h.a(hVar, fVar6)) {
                        fVar3.w(i3, fVar6);
                        return true;
                    }
                    f fVar7 = f.SCROLL_RIGHT;
                    if (h.a(hVar, fVar7)) {
                        fVar3.w(i3, fVar7);
                        return true;
                    }
                    if (h.a(hVar, fVar2)) {
                        hVar.f9414r = hVar.v;
                        hVar.f9415s = hVar.f9418w;
                        h(i3, 4);
                        fVar3.w(i3, fVar2);
                        return true;
                    }
                    break;
                case 16384:
                    fVar3.w(i3, f.COPY);
                    return true;
                case 32768:
                    fVar3.w(i3, f.PASTE);
                    return true;
                case 65536:
                    fVar3.w(i3, f.CUT);
                    return true;
                case 131072:
                    HashMap hashMap3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        hashMap3.put("base", Integer.valueOf(hVar.f9405h));
                        hashMap3.put("extent", Integer.valueOf(hVar.f9405h));
                    }
                    fVar3.x(i3, f.SET_SELECTION, hashMap3);
                    h hVar3 = (h) hashMap.get(Integer.valueOf(i3));
                    hVar3.f9404g = ((Integer) hashMap3.get("base")).intValue();
                    hVar3.f9405h = ((Integer) hashMap3.get("extent")).intValue();
                    return true;
                case 262144:
                    fVar3.w(i3, f.EXPAND);
                    return true;
                case 524288:
                    fVar3.w(i3, f.COLLAPSE);
                    return true;
                case 1048576:
                    fVar3.w(i3, f.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    fVar3.x(i3, f.SET_TEXT, string);
                    hVar.f9414r = string;
                    hVar.f9415s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    fVar3.w(i3, f.SHOW_ON_SCREEN);
                    return true;
                default:
                    g gVar = (g) this.f9428h.get(Integer.valueOf(i4 - 267386881));
                    if (gVar != null) {
                        fVar3.x(i3, f.CUSTOM_ACTION, Integer.valueOf(gVar.f9364b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
