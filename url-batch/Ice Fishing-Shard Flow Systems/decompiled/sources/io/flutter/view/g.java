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

/* loaded from: classes.dex */
public final class g extends AccessibilityNodeProvider {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f5878y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f5879a;

    /* renamed from: b, reason: collision with root package name */
    public final D0.j f5880b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f5881c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f5882d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.m f5883e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f5884f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f5885g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f5886h;

    /* renamed from: i, reason: collision with root package name */
    public f f5887i;
    public Integer j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f5888k;

    /* renamed from: l, reason: collision with root package name */
    public int f5889l;

    /* renamed from: m, reason: collision with root package name */
    public String f5890m;

    /* renamed from: n, reason: collision with root package name */
    public f f5891n;

    /* renamed from: o, reason: collision with root package name */
    public f f5892o;

    /* renamed from: p, reason: collision with root package name */
    public f f5893p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f5894q;

    /* renamed from: r, reason: collision with root package name */
    public int f5895r;

    /* renamed from: s, reason: collision with root package name */
    public B.f f5896s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5897t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5898u;

    /* renamed from: v, reason: collision with root package name */
    public final b f5899v;

    /* renamed from: w, reason: collision with root package name */
    public final c f5900w;

    /* renamed from: x, reason: collision with root package name */
    public final M.a f5901x;

    public g(View view, D0.j jVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.m mVar) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f5885g = new HashMap();
        this.f5886h = new HashMap();
        this.f5889l = 0;
        this.f5894q = new ArrayList();
        this.f5895r = 0;
        this.f5897t = false;
        this.f5898u = false;
        a aVar = new a(this);
        b bVar = new b(this);
        this.f5899v = bVar;
        M.a aVar2 = new M.a(this, new Handler(), 2);
        this.f5901x = aVar2;
        this.f5879a = view;
        this.f5880b = jVar;
        this.f5881c = accessibilityManager;
        this.f5884f = contentResolver;
        this.f5882d = accessibilityViewEmbedder;
        this.f5883e = mVar;
        jVar.f332l = aVar;
        ((FlutterJNI) jVar.f331i).setAccessibilityDelegate(aVar);
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        c cVar = new c(this, accessibilityManager);
        this.f5900w = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        this.f5889l |= 128;
        aVar2.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar2);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i2 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f5889l &= -9;
            } else {
                this.f5889l |= 8;
            }
            ((FlutterJNI) jVar.f331i).setAccessibilityFeatures(this.f5889l);
        }
        mVar.d(this);
    }

    public static String d(ByteBuffer byteBuffer, String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        return strArr[i2];
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f5882d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f5888k = recordFlutterId;
            this.f5891n = null;
            return true;
        }
        if (eventType == 128) {
            this.f5893p = null;
            return true;
        }
        if (eventType == 32768) {
            this.j = recordFlutterId;
            this.f5887i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f5888k = null;
        this.j = null;
        return true;
    }

    public final e b(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f5886h;
        e eVar = (e) hashMap.get(valueOf);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.f5819c = -1;
        eVar2.f5818b = i2;
        eVar2.f5817a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), eVar2);
        return eVar2;
    }

    public final f c(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f5885g;
        f fVar = (f) hashMap.get(valueOf);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        fVar2.f5849b = i2;
        hashMap.put(Integer.valueOf(i2), fVar2);
        return fVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05fa  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        boolean h7;
        int i5;
        f fVar;
        ArrayList arrayList;
        int size;
        int i7;
        String str;
        float parseFloat;
        String str2;
        float parseFloat2;
        int i8;
        int i9;
        j(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f5882d;
        if (i2 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f5885g;
        View view = this.f5879a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        f fVar2 = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar2 != null) {
            int i10 = fVar2.f5861i;
            io.flutter.plugin.platform.m mVar = this.f5883e;
            if (i10 == -1 || !mVar.j(i10)) {
                AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
                obtain2.setImportantForAccessibility((fVar2.h(12) || (f.b(fVar2) == null && fVar2.f5853d == 0)) ? false : true);
                obtain2.setViewIdResourceName("");
                String str3 = fVar2.f5866o;
                if (str3 != null) {
                    obtain2.setViewIdResourceName(str3);
                }
                obtain2.setPackageName(view.getContext().getPackageName());
                obtain2.setClassName("android.view.View");
                obtain2.setSource(view, i2);
                obtain2.setFocusable(fVar2.j());
                f fVar3 = this.f5891n;
                if (fVar3 != null) {
                    obtain2.setFocused(fVar3.f5849b == i2);
                }
                f fVar4 = this.f5887i;
                if (fVar4 != null) {
                    obtain2.setAccessibilityFocused(fVar4.f5849b == i2);
                }
                if (fVar2.h(5)) {
                    obtain2.setPassword(fVar2.h(11));
                    if (!fVar2.h(21)) {
                        obtain2.setClassName("android.widget.EditText");
                    }
                    obtain2.setEditable(!fVar2.h(21));
                    int i11 = fVar2.f5859g;
                    if (i11 != -1 && (i9 = fVar2.f5860h) != -1) {
                        obtain2.setTextSelection(i11, i9);
                    }
                    f fVar5 = this.f5887i;
                    if (fVar5 != null && fVar5.f5849b == i2) {
                        obtain2.setLiveRegion(1);
                    }
                    if (f.a(fVar2, d.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                        obtain2.addAction(256);
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    if (f.a(fVar2, d.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                        obtain2.addAction(512);
                        i8 = 1;
                    }
                    if (f.a(fVar2, d.MOVE_CURSOR_FORWARD_BY_WORD)) {
                        obtain2.addAction(256);
                        i8 |= 2;
                    }
                    if (f.a(fVar2, d.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                        obtain2.addAction(512);
                        i8 |= 2;
                    }
                    obtain2.setMovementGranularities(i8);
                    if (fVar2.f5855e >= 0) {
                        String str4 = fVar2.f5869r;
                        obtain2.setMaxTextLength(((str4 == null ? 0 : str4.length()) - fVar2.f5857f) + fVar2.f5855e);
                    }
                }
                if (f.a(fVar2, d.SET_SELECTION)) {
                    obtain2.addAction(131072);
                }
                if (f.a(fVar2, d.COPY)) {
                    obtain2.addAction(16384);
                }
                if (f.a(fVar2, d.CUT)) {
                    obtain2.addAction(65536);
                }
                if (f.a(fVar2, d.PASTE)) {
                    obtain2.addAction(32768);
                }
                if (f.a(fVar2, d.SET_TEXT)) {
                    obtain2.addAction(2097152);
                }
                if (fVar2.h(4)) {
                    h7 = true;
                } else {
                    String str5 = fVar2.f5822A;
                    h7 = (str5 == null || str5.isEmpty()) ? fVar2.h(23) : false;
                }
                if (h7) {
                    obtain2.setClassName("android.widget.Button");
                }
                if (fVar2.h(15)) {
                    obtain2.setClassName("android.widget.ImageView");
                }
                if (S.i.b(S.i.c(33)[fVar2.f5826E]) == 23) {
                    obtain2.setClassName("android.widget.ProgressBar");
                    if (fVar2.f5869r != null) {
                        String str6 = fVar2.f5824C;
                        try {
                            if (str6 != null) {
                                try {
                                    parseFloat = Float.parseFloat(str6);
                                } catch (NumberFormatException unused) {
                                }
                                str2 = fVar2.f5825D;
                                if (str2 != null) {
                                    try {
                                        parseFloat2 = Float.parseFloat(str2);
                                    } catch (NumberFormatException unused2) {
                                    }
                                    obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(fVar2.f5869r)));
                                }
                                parseFloat2 = Float.POSITIVE_INFINITY;
                                obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(fVar2.f5869r)));
                            }
                            obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(fVar2.f5869r)));
                        } catch (NumberFormatException unused3) {
                            if (Build.VERSION.SDK_INT >= 36) {
                                obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                            } else {
                                obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                            }
                        }
                        parseFloat = Float.NEGATIVE_INFINITY;
                        str2 = fVar2.f5825D;
                        if (str2 != null) {
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                    }
                }
                if (f.a(fVar2, d.DISMISS)) {
                    obtain2.setDismissable(true);
                    obtain2.addAction(1048576);
                }
                f fVar6 = fVar2.f5842V;
                if (fVar6 != null) {
                    obtain2.setParent(view, fVar6.f5849b);
                } else {
                    obtain2.setParent(view);
                }
                int i12 = fVar2.f5828G;
                if (i12 != -1) {
                    obtain2.setTraversalAfter(view, i12);
                }
                Rect rect = fVar2.f5858f0;
                f fVar7 = fVar2.f5842V;
                if (fVar7 != null) {
                    Rect rect2 = fVar7.f5858f0;
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
                obtain2.setEnabled(!fVar2.h(7) || fVar2.h(8));
                if (f.a(fVar2, d.TAP)) {
                    if (fVar2.f5846Z != null) {
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, fVar2.f5846Z.f5821e));
                        obtain2.setClickable(true);
                    } else {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                } else if (fVar2.h(24)) {
                    obtain2.addAction(16);
                    obtain2.setClickable(true);
                }
                if (f.a(fVar2, d.LONG_PRESS)) {
                    if (fVar2.f5848a0 != null) {
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, fVar2.f5848a0.f5821e));
                        obtain2.setLongClickable(true);
                    } else {
                        obtain2.addAction(32);
                        obtain2.setLongClickable(true);
                    }
                }
                d dVar = d.SCROLL_LEFT;
                boolean a7 = f.a(fVar2, dVar);
                d dVar2 = d.SCROLL_DOWN;
                d dVar3 = d.SCROLL_UP;
                d dVar4 = d.SCROLL_RIGHT;
                if (a7 || f.a(fVar2, dVar3) || f.a(fVar2, dVar4) || f.a(fVar2, dVar2)) {
                    obtain2.setScrollable(true);
                    if (fVar2.h(19)) {
                        if (f.a(fVar2, dVar) || f.a(fVar2, dVar4)) {
                            obtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            obtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (k(fVar2)) {
                    if (f.a(fVar2, dVar) || f.a(fVar2, dVar4)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, fVar2.j, false));
                        } else {
                            obtain2.setCollectionInfo(Q0.e.n(fVar2.j));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(fVar2.j, 1, false));
                    } else {
                        obtain2.setCollectionInfo(Q0.e.g(fVar2.j));
                    }
                }
                f fVar8 = fVar2.f5842V;
                if ((fVar8 != null && k(fVar8) && fVar2.f5842V.h(19)) != false) {
                    f fVar9 = fVar2.f5842V;
                    ArrayList arrayList2 = fVar9.f5843W;
                    Object[] objArr = (f.a(fVar9, dVar) || f.a(fVar9, dVar4)) ? false : true;
                    int indexOf = arrayList2.indexOf(fVar2);
                    if (objArr == true) {
                        if (Build.VERSION.SDK_INT < 33) {
                            obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, fVar2.h(10)));
                        } else {
                            obtain2.setCollectionItemInfo(Q0.e.h(indexOf, fVar2.h(10)));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, fVar2.h(10)));
                    } else {
                        obtain2.setCollectionItemInfo(Q0.e.o(indexOf, fVar2.h(10)));
                    }
                }
                if (f.a(fVar2, dVar) || f.a(fVar2, dVar3)) {
                    obtain2.addAction(4096);
                }
                if (f.a(fVar2, dVar4) || f.a(fVar2, dVar2)) {
                    obtain2.addAction(8192);
                }
                d dVar5 = d.INCREASE;
                boolean a8 = f.a(fVar2, dVar5);
                d dVar6 = d.DECREASE;
                if (a8 || f.a(fVar2, dVar6)) {
                    obtain2.setClassName("android.widget.SeekBar");
                    if (f.a(fVar2, dVar5)) {
                        obtain2.addAction(4096);
                    }
                    if (f.a(fVar2, dVar6)) {
                        obtain2.addAction(8192);
                    }
                }
                if (fVar2.h(16)) {
                    obtain2.setLiveRegion(1);
                }
                if (fVar2.h(5)) {
                    P0.i iVar = new P0.i();
                    iVar.f2200a = fVar2.f5869r;
                    iVar.f2201b = fVar2.f5870s;
                    iVar.f2202c = fVar2.d();
                    obtain2.setText(iVar.b());
                    if (Build.VERSION.SDK_INT >= 28) {
                        P0.i iVar2 = new P0.i();
                        iVar2.f2200a = fVar2.f5867p;
                        iVar2.f2201b = fVar2.f5868q;
                        iVar2.f2203d = fVar2.f5822A;
                        iVar2.f2202c = fVar2.d();
                        SpannableString b7 = iVar2.b();
                        P0.i iVar3 = new P0.i();
                        iVar3.f2200a = fVar2.f5875x;
                        iVar3.f2201b = fVar2.f5876y;
                        iVar3.f2202c = fVar2.d();
                        CharSequence[] charSequenceArr = {b7, iVar3.b()};
                        int i13 = 0;
                        CharSequence charSequence = null;
                        for (int i14 = 2; i13 < i14; i14 = 2) {
                            CharSequence charSequence2 = charSequenceArr[i13];
                            if (charSequence2 != null && charSequence2.length() > 0) {
                                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                            }
                            i13++;
                        }
                        obtain2.setHintText(charSequence);
                    }
                } else if (!fVar2.h(12)) {
                    CharSequence b8 = f.b(fVar2);
                    if (Build.VERSION.SDK_INT < 28 && fVar2.f5877z != null) {
                        b8 = ((Object) (b8 != null ? b8 : "")) + "\n" + fVar2.f5877z;
                    }
                    if (b8 != null) {
                        obtain2.setContentDescription(b8);
                    }
                }
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 28 && (str = fVar2.f5877z) != null) {
                    obtain2.setTooltipText(str);
                    if (f.b(fVar2) == null) {
                        obtain2.setContentDescription(fVar2.f5877z);
                    }
                }
                boolean h8 = fVar2.h(1);
                boolean h9 = fVar2.h(17);
                obtain2.setCheckable(h8 || h9);
                if (h8) {
                    if (fVar2.h(9)) {
                        obtain2.setClassName("android.widget.RadioButton");
                    } else {
                        obtain2.setClassName("android.widget.CheckBox");
                    }
                    if (i15 >= 36) {
                        obtain2.setChecked(fVar2.h(26) ? 2 : fVar2.h(2) ? 1 : 0);
                    } else {
                        obtain2.setChecked(fVar2.h(2));
                    }
                } else if (h9) {
                    obtain2.setClassName("android.widget.Switch");
                    i5 = 36;
                    if (i15 >= 36) {
                        obtain2.setChecked(fVar2.h(18) ? 1 : 0);
                    } else {
                        obtain2.setChecked(fVar2.h(18));
                    }
                    obtain2.setSelected(fVar2.h(3));
                    if (i15 >= i5 && fVar2.h(27)) {
                        obtain2.setExpandedState(!fVar2.h(28) ? 3 : 1);
                        if (f.a(fVar2, d.EXPAND)) {
                            obtain2.addAction(262144);
                        }
                        if (f.a(fVar2, d.COLLAPSE)) {
                            obtain2.addAction(524288);
                        }
                    }
                    if (i15 >= 28) {
                        obtain2.setHeading(fVar2.f5827F > 0);
                    }
                    fVar = this.f5887i;
                    if (fVar == null && fVar.f5849b == i2) {
                        obtain2.addAction(128);
                    } else {
                        obtain2.addAction(64);
                    }
                    arrayList = fVar2.f5845Y;
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj = arrayList.get(i16);
                            i16++;
                            e eVar = (e) obj;
                            obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(eVar.f5817a, eVar.f5820d));
                        }
                    }
                    ArrayList arrayList3 = fVar2.f5843W;
                    size = arrayList3.size();
                    i7 = 0;
                    while (i7 < size) {
                        Object obj2 = arrayList3.get(i7);
                        i7++;
                        f fVar10 = (f) obj2;
                        if (!fVar10.h(14)) {
                            int i17 = fVar10.f5861i;
                            if (i17 != -1) {
                                View m2 = mVar.m(i17);
                                if (!mVar.j(fVar10.f5861i) && m2 != null) {
                                    m2.setImportantForAccessibility(0);
                                    obtain2.addChild(m2);
                                }
                            }
                            obtain2.addChild(view, fVar10.f5849b);
                        }
                    }
                    return obtain2;
                }
                i5 = 36;
                obtain2.setSelected(fVar2.h(3));
                if (i15 >= i5) {
                    obtain2.setExpandedState(!fVar2.h(28) ? 3 : 1);
                    if (f.a(fVar2, d.EXPAND)) {
                    }
                    if (f.a(fVar2, d.COLLAPSE)) {
                    }
                }
                if (i15 >= 28) {
                }
                fVar = this.f5887i;
                if (fVar == null) {
                }
                obtain2.addAction(64);
                arrayList = fVar2.f5845Y;
                if (arrayList != null) {
                }
                ArrayList arrayList32 = fVar2.f5843W;
                size = arrayList32.size();
                i7 = 0;
                while (i7 < size) {
                }
                return obtain2;
            }
            View m7 = mVar.m(fVar2.f5861i);
            if (m7 != null) {
                return accessibilityViewEmbedder.getRootNode(m7, fVar2.f5849b, fVar2.f5858f0);
            }
        }
        return null;
    }

    public final AccessibilityEvent e(int i2, int i5) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        View view = this.f5879a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i2);
        return obtain;
    }

    public final boolean f(MotionEvent motionEvent, boolean z7) {
        f i2;
        if (this.f5881c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.f5885g;
            if (!hashMap.isEmpty()) {
                f i5 = ((f) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z7);
                if (i5 == null || i5.f5861i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x7 = motionEvent.getX();
                        float y7 = motionEvent.getY();
                        if (!hashMap.isEmpty() && (i2 = ((f) hashMap.get(0)).i(new float[]{x7, y7, 0.0f, 1.0f}, z7)) != this.f5893p) {
                            if (i2 != null) {
                                h(i2.f5849b, 128);
                            }
                            f fVar = this.f5893p;
                            if (fVar != null) {
                                h(fVar.f5849b, 256);
                            }
                            this.f5893p = i2;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        f fVar2 = this.f5893p;
                        if (fVar2 != null) {
                            h(fVar2.f5849b, 256);
                            this.f5893p = null;
                        }
                    }
                    return true;
                }
                if (!z7) {
                    return this.f5882d.onAccessibilityHoverEvent(i5.f5849b, motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            f fVar = this.f5891n;
            if (fVar != null) {
                return createAccessibilityNodeInfo(fVar.f5849b);
            }
            Integer num = this.f5888k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i2 != 2) {
            return null;
        }
        f fVar2 = this.f5887i;
        if (fVar2 != null) {
            return createAccessibilityNodeInfo(fVar2.f5849b);
        }
        Integer num2 = this.j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final boolean g(f fVar, int i2, Bundle bundle, boolean z7) {
        int i5;
        int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z8 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i8 = fVar.f5859g;
        int i9 = fVar.f5860h;
        if (i9 >= 0 && i8 >= 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 == 8 || i7 == 16) {
                            if (z7) {
                                fVar.f5860h = fVar.f5869r.length();
                            } else {
                                fVar.f5860h = 0;
                            }
                        }
                    } else if (z7 && i9 < fVar.f5869r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(fVar.f5869r.substring(fVar.f5860h));
                        if (matcher.find()) {
                            fVar.f5860h += matcher.start(1);
                        } else {
                            fVar.f5860h = fVar.f5869r.length();
                        }
                    } else if (!z7 && fVar.f5860h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(fVar.f5869r.substring(0, fVar.f5860h));
                        if (matcher2.find()) {
                            fVar.f5860h = matcher2.start(1);
                        } else {
                            fVar.f5860h = 0;
                        }
                    }
                } else if (z7 && i9 < fVar.f5869r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(fVar.f5869r.substring(fVar.f5860h));
                    matcher3.find();
                    if (matcher3.find()) {
                        fVar.f5860h += matcher3.start(1);
                    } else {
                        fVar.f5860h = fVar.f5869r.length();
                    }
                } else if (!z7 && fVar.f5860h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(fVar.f5869r.substring(0, fVar.f5860h));
                    if (matcher4.find()) {
                        fVar.f5860h = matcher4.start(1);
                    }
                }
            } else if (z7 && i9 < fVar.f5869r.length()) {
                fVar.f5860h++;
            } else if (!z7 && (i5 = fVar.f5860h) > 0) {
                fVar.f5860h = i5 - 1;
            }
            if (!z8) {
                fVar.f5859g = fVar.f5860h;
            }
        }
        if (i8 != fVar.f5859g || i9 != fVar.f5860h) {
            String str = fVar.f5869r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent e7 = e(fVar.f5849b, 8192);
            e7.getText().add(str);
            e7.setFromIndex(fVar.f5859g);
            e7.setToIndex(fVar.f5860h);
            e7.setItemCount(str.length());
            i(e7);
        }
        D0.j jVar = this.f5880b;
        if (i7 == 1) {
            if (z7) {
                d dVar = d.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (f.a(fVar, dVar)) {
                    jVar.D(i2, dVar, Boolean.valueOf(z8));
                    return true;
                }
            }
            if (!z7) {
                d dVar2 = d.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (f.a(fVar, dVar2)) {
                    jVar.D(i2, dVar2, Boolean.valueOf(z8));
                    return true;
                }
            }
        } else if (i7 == 2) {
            if (z7) {
                d dVar3 = d.MOVE_CURSOR_FORWARD_BY_WORD;
                if (f.a(fVar, dVar3)) {
                    jVar.D(i2, dVar3, Boolean.valueOf(z8));
                    return true;
                }
            }
            if (!z7) {
                d dVar4 = d.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (f.a(fVar, dVar4)) {
                    jVar.D(i2, dVar4, Boolean.valueOf(z8));
                    return true;
                }
            }
        } else if (i7 == 4 || i7 == 8 || i7 == 16) {
            return true;
        }
        return false;
    }

    public final void h(int i2, int i5) {
        if (this.f5881c.isEnabled()) {
            i(e(i2, i5));
        }
    }

    public final void i(AccessibilityEvent accessibilityEvent) {
        if (this.f5881c.isEnabled()) {
            View view = this.f5879a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void j(boolean z7) {
        if (this.f5897t == z7) {
            return;
        }
        this.f5897t = z7;
        if (z7) {
            this.f5889l |= 1;
        } else {
            this.f5889l &= -2;
        }
        ((FlutterJNI) this.f5880b.f331i).setAccessibilityFeatures(this.f5889l);
    }

    public final boolean k(f fVar) {
        if (fVar.j > 1) {
            f fVar2 = this.f5887i;
            f fVar3 = null;
            if (fVar2 != null) {
                f fVar4 = fVar2.f5842V;
                while (true) {
                    if (fVar4 == null) {
                        fVar4 = null;
                        break;
                    }
                    if (fVar4 == fVar) {
                        break;
                    }
                    fVar4 = fVar4.f5842V;
                }
                if (fVar4 != null) {
                    return true;
                }
            }
            f fVar5 = this.f5887i;
            M4.h hVar = new M4.h(1);
            if (fVar5 != null) {
                f fVar6 = fVar5.f5842V;
                while (true) {
                    if (fVar6 == null) {
                        break;
                    }
                    if (hVar.test(fVar6)) {
                        fVar3 = fVar6;
                        break;
                    }
                    fVar6 = fVar6.f5842V;
                }
                if (fVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i5, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.f5882d.performAction(i2, i5, bundle);
            if (performAction && i5 == 128) {
                this.j = null;
            }
            return performAction;
        }
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f5885g;
        f fVar = (f) hashMap.get(valueOf);
        if (fVar != null) {
            d dVar = d.INCREASE;
            d dVar2 = d.DECREASE;
            D0.j jVar = this.f5880b;
            switch (i5) {
                case 16:
                    jVar.C(i2, d.TAP);
                    return true;
                case 32:
                    jVar.C(i2, d.LONG_PRESS);
                    return true;
                case 64:
                    if (this.f5887i == null) {
                        this.f5879a.invalidate();
                    }
                    this.f5887i = fVar;
                    jVar.C(i2, d.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_KEY, "didGainFocus");
                    hashMap2.put("nodeId", Integer.valueOf(fVar.f5849b));
                    ((P0.i) jVar.f330e).l(hashMap2, null);
                    h(i2, 32768);
                    if (!f.a(fVar, dVar) && !f.a(fVar, dVar2)) {
                        return true;
                    }
                    h(i2, 4);
                    return true;
                case 128:
                    f fVar2 = this.f5887i;
                    if (fVar2 != null && fVar2.f5849b == i2) {
                        this.f5887i = null;
                    }
                    Integer num = this.j;
                    if (num != null && num.intValue() == i2) {
                        this.j = null;
                    }
                    jVar.C(i2, d.DID_LOSE_ACCESSIBILITY_FOCUS);
                    h(i2, 65536);
                    return true;
                case 256:
                    return g(fVar, i2, bundle, true);
                case 512:
                    return g(fVar, i2, bundle, false);
                case 4096:
                    d dVar3 = d.SCROLL_UP;
                    if (f.a(fVar, dVar3)) {
                        jVar.C(i2, dVar3);
                        return true;
                    }
                    d dVar4 = d.SCROLL_LEFT;
                    if (f.a(fVar, dVar4)) {
                        jVar.C(i2, dVar4);
                        return true;
                    }
                    if (f.a(fVar, dVar)) {
                        fVar.f5869r = fVar.f5871t;
                        fVar.f5870s = fVar.f5872u;
                        h(i2, 4);
                        jVar.C(i2, dVar);
                        return true;
                    }
                    break;
                case 8192:
                    d dVar5 = d.SCROLL_DOWN;
                    if (f.a(fVar, dVar5)) {
                        jVar.C(i2, dVar5);
                        return true;
                    }
                    d dVar6 = d.SCROLL_RIGHT;
                    if (f.a(fVar, dVar6)) {
                        jVar.C(i2, dVar6);
                        return true;
                    }
                    if (f.a(fVar, dVar2)) {
                        fVar.f5869r = fVar.f5873v;
                        fVar.f5870s = fVar.f5874w;
                        h(i2, 4);
                        jVar.C(i2, dVar2);
                        return true;
                    }
                    break;
                case 16384:
                    jVar.C(i2, d.COPY);
                    return true;
                case 32768:
                    jVar.C(i2, d.PASTE);
                    return true;
                case 65536:
                    jVar.C(i2, d.CUT);
                    return true;
                case 131072:
                    HashMap hashMap3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        hashMap3.put("base", Integer.valueOf(fVar.f5860h));
                        hashMap3.put("extent", Integer.valueOf(fVar.f5860h));
                    }
                    jVar.D(i2, d.SET_SELECTION, hashMap3);
                    f fVar3 = (f) hashMap.get(Integer.valueOf(i2));
                    fVar3.f5859g = ((Integer) hashMap3.get("base")).intValue();
                    fVar3.f5860h = ((Integer) hashMap3.get("extent")).intValue();
                    return true;
                case 262144:
                    jVar.C(i2, d.EXPAND);
                    return true;
                case 524288:
                    jVar.C(i2, d.COLLAPSE);
                    return true;
                case 1048576:
                    jVar.C(i2, d.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    jVar.D(i2, d.SET_TEXT, string);
                    fVar.f5869r = string;
                    fVar.f5870s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    jVar.C(i2, d.SHOW_ON_SCREEN);
                    return true;
                default:
                    e eVar = (e) this.f5886h.get(Integer.valueOf(i5 - 267386881));
                    if (eVar != null) {
                        jVar.D(i2, d.CUSTOM_ACTION, Integer.valueOf(eVar.f5818b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
