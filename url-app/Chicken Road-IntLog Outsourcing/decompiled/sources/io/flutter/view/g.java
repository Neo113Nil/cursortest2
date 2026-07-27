package io.flutter.view;

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
import b2.AbstractC0279e;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import f2.t;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g extends AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f10356x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final w2.m f10357a;

    /* renamed from: b, reason: collision with root package name */
    public final B4.i f10358b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f10359c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f10360d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.i f10361e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f10362f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f10363g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f10364h;

    /* renamed from: i, reason: collision with root package name */
    public f f10365i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f10366j;

    /* renamed from: k, reason: collision with root package name */
    public int f10367k;

    /* renamed from: l, reason: collision with root package name */
    public String f10368l;

    /* renamed from: m, reason: collision with root package name */
    public f f10369m;

    /* renamed from: n, reason: collision with root package name */
    public f f10370n;

    /* renamed from: o, reason: collision with root package name */
    public f f10371o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f10372p;

    /* renamed from: q, reason: collision with root package name */
    public int f10373q;

    /* renamed from: r, reason: collision with root package name */
    public V0.j f10374r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10375s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10376t;

    /* renamed from: u, reason: collision with root package name */
    public final b f10377u;

    /* renamed from: v, reason: collision with root package name */
    public final c f10378v;

    /* renamed from: w, reason: collision with root package name */
    public final J.a f10379w;

    public g(w2.m mVar, B4.i iVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.i iVar2) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(mVar, 65536);
        this.f10363g = new HashMap();
        this.f10364h = new HashMap();
        this.f10367k = 0;
        this.f10372p = new ArrayList();
        this.f10373q = 0;
        this.f10375s = false;
        this.f10376t = false;
        a aVar = new a(this);
        b bVar = new b(this);
        this.f10377u = bVar;
        J.a aVar2 = new J.a(this, new Handler(), 1);
        this.f10379w = aVar2;
        this.f10357a = mVar;
        this.f10358b = iVar;
        this.f10359c = accessibilityManager;
        this.f10362f = contentResolver;
        this.f10360d = accessibilityViewEmbedder;
        this.f10361e = iVar2;
        iVar.f313d = aVar;
        ((FlutterJNI) iVar.f312c).setAccessibilityDelegate(aVar);
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        c cVar = new c(this, accessibilityManager);
        this.f10378v = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        this.f10367k |= 128;
        aVar2.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar2);
        if (Build.VERSION.SDK_INT >= 31 && mVar != null && mVar.getResources() != null) {
            i2 = mVar.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f10367k &= -9;
            } else {
                this.f10367k |= 8;
            }
            ((FlutterJNI) iVar.f312c).setAccessibilityFeatures(this.f10367k);
        }
        iVar2.b(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        return strArr[i2];
    }

    public final e a(int i2) {
        HashMap hashMap = this.f10364h;
        e eVar = (e) hashMap.get(Integer.valueOf(i2));
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.f10297c = -1;
        eVar2.f10296b = i2;
        eVar2.f10295a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), eVar2);
        return eVar2;
    }

    public final f b(int i2) {
        HashMap hashMap = this.f10363g;
        f fVar = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        fVar2.f10327b = i2;
        hashMap.put(Integer.valueOf(i2), fVar2);
        return fVar2;
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
        boolean K5;
        boolean I5;
        boolean I6;
        int i6;
        f fVar;
        int i7;
        f fVar2;
        boolean I7;
        boolean z;
        boolean I8;
        d dVar;
        boolean k3;
        d dVar2;
        boolean I9;
        f fVar3;
        d dVar3;
        boolean k6;
        d dVar4;
        boolean I10;
        boolean I11;
        boolean I12;
        String str2;
        String str3;
        int i8;
        boolean I13;
        boolean I14;
        int i9;
        int i10;
        boolean I15;
        boolean I16;
        boolean I17;
        f fVar4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        boolean I18;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList3;
        int i15;
        String str4;
        int i16;
        int i17;
        boolean I19;
        boolean I20;
        boolean I21;
        boolean I22;
        boolean I23;
        boolean I24;
        int i18;
        String str5;
        String str6;
        String str7;
        f fVar5;
        ArrayList arrayList4;
        Object[] objArr;
        boolean I25;
        boolean I26;
        boolean I27;
        boolean I28;
        int i19;
        int i20;
        int i21;
        int i22;
        e eVar;
        e eVar2;
        String str8;
        e eVar3;
        e eVar4;
        String str9;
        boolean I29;
        f fVar6;
        int i23;
        f fVar7;
        int i24;
        String str10;
        String str11;
        String str12;
        float parseFloat;
        String str13;
        String str14;
        float parseFloat2;
        String str15;
        boolean I30;
        boolean I31;
        boolean I32;
        int i25;
        int i26;
        int i27;
        String str16;
        String str17;
        int length;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        String str18;
        int i36;
        int i37;
        i(true);
        if (i2 >= 65536) {
            return this.f10360d.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f10363g;
        View view = this.f10357a;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        f fVar8 = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar8 == null) {
            return null;
        }
        i3 = fVar8.f10339i;
        io.flutter.plugin.platform.i iVar = this.f10361e;
        if (i3 != -1) {
            i36 = fVar8.f10339i;
            if (iVar.c(i36)) {
                i37 = fVar8.f10339i;
                iVar.d(i37);
                return null;
            }
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
        obtain2.setImportantForAccessibility((fVar8.I(12) || (f.y(fVar8) == null && fVar8.f10331d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        str = fVar8.f10345o;
        if (str != null) {
            str18 = fVar8.f10345o;
            obtain2.setViewIdResourceName(str18);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        K5 = fVar8.K();
        obtain2.setFocusable(K5);
        f fVar9 = this.f10369m;
        if (fVar9 != null) {
            i35 = fVar9.f10327b;
            obtain2.setFocused(i35 == i2);
        }
        f fVar10 = this.f10365i;
        if (fVar10 != null) {
            i34 = fVar10.f10327b;
            obtain2.setAccessibilityFocused(i34 == i2);
        }
        I5 = fVar8.I(5);
        if (I5) {
            I30 = fVar8.I(11);
            obtain2.setPassword(I30);
            I31 = fVar8.I(21);
            if (!I31) {
                obtain2.setClassName("android.widget.EditText");
            }
            I32 = fVar8.I(21);
            obtain2.setEditable(!I32);
            i25 = fVar8.f10337g;
            if (i25 != -1) {
                i31 = fVar8.f10338h;
                if (i31 != -1) {
                    i32 = fVar8.f10337g;
                    i33 = fVar8.f10338h;
                    obtain2.setTextSelection(i32, i33);
                }
            }
            f fVar11 = this.f10365i;
            if (fVar11 != null) {
                i30 = fVar11.f10327b;
                if (i30 == i2) {
                    obtain2.setLiveRegion(1);
                }
            }
            if (f.k(fVar8, d.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i26 = 1;
            } else {
                i26 = 0;
            }
            if (f.k(fVar8, d.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i26 = 1;
            }
            if (f.k(fVar8, d.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i26 |= 2;
            }
            if (f.k(fVar8, d.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i26 |= 2;
            }
            obtain2.setMovementGranularities(i26);
            i27 = fVar8.f10333e;
            if (i27 >= 0) {
                str16 = fVar8.f10348r;
                if (str16 == null) {
                    length = 0;
                } else {
                    str17 = fVar8.f10348r;
                    length = str17.length();
                }
                i28 = fVar8.f10335f;
                int i38 = length - i28;
                i29 = fVar8.f10333e;
                obtain2.setMaxTextLength(i29 + i38);
            }
        }
        if (f.k(fVar8, d.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (f.k(fVar8, d.COPY)) {
            obtain2.addAction(16384);
        }
        if (f.k(fVar8, d.CUT)) {
            obtain2.addAction(65536);
        }
        if (f.k(fVar8, d.PASTE)) {
            obtain2.addAction(32768);
        }
        if (f.k(fVar8, d.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (f.o(fVar8)) {
            obtain2.setClassName("android.widget.Button");
        }
        I6 = fVar8.I(15);
        if (I6) {
            obtain2.setClassName("android.widget.ImageView");
        }
        int[] _values = AbstractC0279e._values();
        i6 = fVar8.f10304E;
        if (O.j.b(_values[i6]) == 23) {
            obtain2.setClassName("android.widget.ProgressBar");
            str10 = fVar8.f10348r;
            if (str10 != null) {
                str11 = fVar8.f10302C;
                try {
                    if (str11 != null) {
                        try {
                            str12 = fVar8.f10302C;
                            parseFloat = Float.parseFloat(str12);
                        } catch (NumberFormatException unused) {
                        }
                        str13 = fVar8.f10303D;
                        if (str13 != null) {
                            try {
                                str14 = fVar8.f10303D;
                                parseFloat2 = Float.parseFloat(str14);
                            } catch (NumberFormatException unused2) {
                            }
                            str15 = fVar8.f10348r;
                            obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(str15)));
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                        str15 = fVar8.f10348r;
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(str15)));
                    }
                    str15 = fVar8.f10348r;
                    obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, Float.parseFloat(str15)));
                } catch (NumberFormatException unused3) {
                    if (Build.VERSION.SDK_INT >= 36) {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                    } else {
                        obtain2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                    }
                }
                parseFloat = Float.NEGATIVE_INFINITY;
                str13 = fVar8.f10303D;
                if (str13 != null) {
                }
                parseFloat2 = Float.POSITIVE_INFINITY;
            }
        }
        if (f.k(fVar8, d.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        fVar = fVar8.f10320V;
        if (fVar != null) {
            fVar7 = fVar8.f10320V;
            i24 = fVar7.f10327b;
            obtain2.setParent(view, i24);
        } else {
            obtain2.setParent(view);
        }
        i7 = fVar8.f10306G;
        if (i7 != -1) {
            i23 = fVar8.f10306G;
            obtain2.setTraversalAfter(view, i23);
        }
        Rect f3 = f.f(fVar8);
        fVar2 = fVar8.f10320V;
        if (fVar2 != null) {
            fVar6 = fVar8.f10320V;
            Rect f6 = f.f(fVar6);
            Rect rect = new Rect(f3);
            rect.offset(-f6.left, -f6.top);
            obtain2.setBoundsInParent(rect);
        } else {
            obtain2.setBoundsInParent(f3);
        }
        Rect rect2 = new Rect(f3);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect2);
        obtain2.setVisibleToUser(true);
        I7 = fVar8.I(7);
        if (I7) {
            I29 = fVar8.I(8);
            if (!I29) {
                z = false;
                obtain2.setEnabled(z);
                if (f.k(fVar8, d.TAP)) {
                    I8 = fVar8.I(24);
                    if (I8) {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                } else {
                    eVar3 = fVar8.f10324Z;
                    if (eVar3 != null) {
                        eVar4 = fVar8.f10324Z;
                        str9 = eVar4.f10299e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, str9));
                        obtain2.setClickable(true);
                    } else {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                }
                if (f.k(fVar8, d.LONG_PRESS)) {
                    eVar = fVar8.f10326a0;
                    if (eVar != null) {
                        eVar2 = fVar8.f10326a0;
                        str8 = eVar2.f10299e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, str8));
                        obtain2.setLongClickable(true);
                    } else {
                        obtain2.addAction(32);
                        obtain2.setLongClickable(true);
                    }
                }
                dVar = d.SCROLL_LEFT;
                k3 = f.k(fVar8, dVar);
                dVar2 = d.SCROLL_RIGHT;
                d dVar5 = d.SCROLL_DOWN;
                d dVar6 = d.SCROLL_UP;
                if (!k3 || f.k(fVar8, dVar6) || f.k(fVar8, dVar2) || f.k(fVar8, dVar5)) {
                    obtain2.setScrollable(true);
                    I9 = fVar8.I(19);
                    if (I9) {
                        if (f.k(fVar8, dVar) || f.k(fVar8, dVar2)) {
                            obtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            obtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (j(fVar8)) {
                    if (f.k(fVar8, dVar) || f.k(fVar8, dVar2)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            i20 = fVar8.f10340j;
                            obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, i20, false));
                        } else {
                            AbstractC0279e.j();
                            i19 = fVar8.f10340j;
                            obtain2.setCollectionInfo(io.flutter.plugin.editing.a.p(i19));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        i22 = fVar8.f10340j;
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i22, 1, false));
                    } else {
                        AbstractC0279e.j();
                        i21 = fVar8.f10340j;
                        obtain2.setCollectionInfo(io.flutter.plugin.editing.a.i(i21));
                    }
                }
                fVar3 = fVar8.f10320V;
                if (fVar3 != null && j(fVar3) && fVar8.f10320V.I(19)) {
                    fVar5 = fVar8.f10320V;
                    arrayList4 = fVar5.f10321W;
                    objArr = f.k(fVar5, dVar) && !f.k(fVar5, dVar2);
                    int indexOf = arrayList4.indexOf(fVar8);
                    if (objArr == true) {
                        if (Build.VERSION.SDK_INT < 33) {
                            I26 = fVar8.I(10);
                            obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, I26));
                        } else {
                            AbstractC0279e.p();
                            I25 = fVar8.I(10);
                            obtain2.setCollectionItemInfo(io.flutter.plugin.editing.a.q(indexOf, I25));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        I28 = fVar8.I(10);
                        obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, I28));
                    } else {
                        AbstractC0279e.p();
                        I27 = fVar8.I(10);
                        obtain2.setCollectionItemInfo(io.flutter.plugin.editing.a.j(indexOf, I27));
                    }
                }
                if (!f.k(fVar8, dVar) || f.k(fVar8, dVar6)) {
                    obtain2.addAction(Base64Utils.IO_BUFFER_SIZE);
                }
                if (!f.k(fVar8, dVar2) || f.k(fVar8, dVar5)) {
                    obtain2.addAction(8192);
                }
                dVar3 = d.INCREASE;
                k6 = f.k(fVar8, dVar3);
                dVar4 = d.DECREASE;
                if (!k6 || f.k(fVar8, dVar4)) {
                    obtain2.setClassName("android.widget.SeekBar");
                    if (f.k(fVar8, dVar3)) {
                        obtain2.addAction(Base64Utils.IO_BUFFER_SIZE);
                    }
                    if (f.k(fVar8, dVar4)) {
                        obtain2.addAction(8192);
                    }
                }
                I10 = fVar8.I(16);
                if (I10) {
                    obtain2.setLiveRegion(1);
                }
                I11 = fVar8.I(5);
                if (I11) {
                    I12 = fVar8.I(12);
                    if (!I12) {
                        CharSequence y5 = f.y(fVar8);
                        if (Build.VERSION.SDK_INT < 28) {
                            str2 = fVar8.z;
                            if (str2 != null) {
                                CharSequence charSequence = y5 != null ? y5 : "";
                                StringBuilder sb = new StringBuilder();
                                sb.append((Object) charSequence);
                                sb.append("\n");
                                str3 = fVar8.z;
                                sb.append(str3);
                                y5 = sb.toString();
                            }
                        }
                        if (y5 != null) {
                            obtain2.setContentDescription(y5);
                        }
                    }
                } else {
                    obtain2.setText(f.w(fVar8));
                    if (Build.VERSION.SDK_INT >= 28) {
                        obtain2.setHintText(f.x(fVar8));
                    }
                }
                i8 = Build.VERSION.SDK_INT;
                if (i8 >= 28) {
                    str5 = fVar8.z;
                    if (str5 != null) {
                        str6 = fVar8.z;
                        obtain2.setTooltipText(str6);
                        if (f.y(fVar8) == null) {
                            str7 = fVar8.z;
                            obtain2.setContentDescription(str7);
                        }
                    }
                }
                I13 = fVar8.I(1);
                I14 = fVar8.I(17);
                obtain2.setCheckable(!I13 || I14);
                if (I13) {
                    if (I14) {
                        obtain2.setClassName("android.widget.Switch");
                        i9 = 36;
                        if (i8 >= 36) {
                            I16 = fVar8.I(18);
                            obtain2.setChecked(I16 ? 1 : 0);
                        } else {
                            I15 = fVar8.I(18);
                            obtain2.setChecked(I15);
                        }
                    } else {
                        i9 = 36;
                    }
                    i10 = 3;
                } else {
                    I21 = fVar8.I(9);
                    if (I21) {
                        obtain2.setClassName("android.widget.RadioButton");
                    } else {
                        obtain2.setClassName("android.widget.CheckBox");
                    }
                    if (i8 >= 36) {
                        I23 = fVar8.I(26);
                        if (I23) {
                            i18 = 2;
                        } else {
                            I24 = fVar8.I(2);
                            i18 = I24 ? 1 : 0;
                        }
                        obtain2.setChecked(i18);
                    } else {
                        I22 = fVar8.I(2);
                        obtain2.setChecked(I22);
                    }
                    i10 = 3;
                    i9 = 36;
                }
                I17 = fVar8.I(i10);
                obtain2.setSelected(I17);
                if (i8 >= i9) {
                    I19 = fVar8.I(27);
                    if (I19) {
                        I20 = fVar8.I(28);
                        if (!I20) {
                            i10 = 1;
                        }
                        obtain2.setExpandedState(i10);
                        if (f.k(fVar8, d.EXPAND)) {
                            obtain2.addAction(262144);
                        }
                        if (f.k(fVar8, d.COLLAPSE)) {
                            obtain2.addAction(524288);
                        }
                    }
                }
                if (i8 >= 28) {
                    i17 = fVar8.f10305F;
                    obtain2.setHeading(i17 > 0);
                }
                fVar4 = this.f10365i;
                if (fVar4 != null) {
                    i16 = fVar4.f10327b;
                    if (i16 == i2) {
                        obtain2.addAction(128);
                        arrayList = fVar8.f10323Y;
                        if (arrayList != null) {
                            arrayList3 = fVar8.f10323Y;
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                e eVar5 = (e) it2.next();
                                i15 = eVar5.f10295a;
                                str4 = eVar5.f10298d;
                                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(i15, str4));
                            }
                        }
                        arrayList2 = fVar8.f10321W;
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            f fVar12 = (f) it.next();
                            I18 = fVar12.I(14);
                            if (!I18) {
                                i11 = fVar12.f10339i;
                                if (i11 != -1) {
                                    i13 = fVar12.f10339i;
                                    iVar.d(i13);
                                    i14 = fVar12.f10339i;
                                    iVar.c(i14);
                                }
                                i12 = fVar12.f10327b;
                                obtain2.addChild(view, i12);
                            }
                        }
                        return obtain2;
                    }
                }
                obtain2.addAction(64);
                arrayList = fVar8.f10323Y;
                if (arrayList != null) {
                }
                arrayList2 = fVar8.f10321W;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                return obtain2;
            }
        }
        z = true;
        obtain2.setEnabled(z);
        if (f.k(fVar8, d.TAP)) {
        }
        if (f.k(fVar8, d.LONG_PRESS)) {
        }
        dVar = d.SCROLL_LEFT;
        k3 = f.k(fVar8, dVar);
        dVar2 = d.SCROLL_RIGHT;
        d dVar52 = d.SCROLL_DOWN;
        d dVar62 = d.SCROLL_UP;
        if (!k3) {
        }
        obtain2.setScrollable(true);
        I9 = fVar8.I(19);
        if (I9) {
        }
        if (j(fVar8)) {
        }
        fVar3 = fVar8.f10320V;
        if (fVar3 != null) {
            fVar5 = fVar8.f10320V;
            arrayList4 = fVar5.f10321W;
            if (f.k(fVar5, dVar)) {
            }
            int indexOf2 = arrayList4.indexOf(fVar8);
            if (objArr == true) {
            }
        }
        if (!f.k(fVar8, dVar)) {
        }
        obtain2.addAction(Base64Utils.IO_BUFFER_SIZE);
        if (!f.k(fVar8, dVar2)) {
        }
        obtain2.addAction(8192);
        dVar3 = d.INCREASE;
        k6 = f.k(fVar8, dVar3);
        dVar4 = d.DECREASE;
        if (!k6) {
        }
        obtain2.setClassName("android.widget.SeekBar");
        if (f.k(fVar8, dVar3)) {
        }
        if (f.k(fVar8, dVar4)) {
        }
        I10 = fVar8.I(16);
        if (I10) {
        }
        I11 = fVar8.I(5);
        if (I11) {
        }
        i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
        }
        I13 = fVar8.I(1);
        I14 = fVar8.I(17);
        obtain2.setCheckable(!I13 || I14);
        if (I13) {
        }
        I17 = fVar8.I(i10);
        obtain2.setSelected(I17);
        if (i8 >= i9) {
        }
        if (i8 >= 28) {
        }
        fVar4 = this.f10365i;
        if (fVar4 != null) {
        }
        obtain2.addAction(64);
        arrayList = fVar8.f10323Y;
        if (arrayList != null) {
        }
        arrayList2 = fVar8.f10321W;
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        w2.m mVar = this.f10357a;
        obtain.setPackageName(mVar.getContext().getPackageName());
        obtain.setSource(mVar, i2);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z) {
        f J4;
        if (!this.f10359c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f10363g;
        if (hashMap.isEmpty()) {
            return false;
        }
        f J5 = ((f) hashMap.get(0)).J(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z);
        if (J5 != null && J5.f10339i != -1) {
            if (z) {
                return false;
            }
            return this.f10360d.onAccessibilityHoverEvent(J5.f10327b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            if (!hashMap.isEmpty() && (J4 = ((f) hashMap.get(0)).J(new float[]{x5, y5, 0.0f, 1.0f}, z)) != this.f10371o) {
                if (J4 != null) {
                    g(J4.f10327b, 128);
                }
                f fVar = this.f10371o;
                if (fVar != null) {
                    g(fVar.f10327b, 256);
                }
                this.f10371o = J4;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            f fVar2 = this.f10371o;
            if (fVar2 != null) {
                g(fVar2.f10327b, 256);
                this.f10371o = null;
            }
        }
        return true;
    }

    public final boolean f(f fVar, int i2, Bundle bundle, boolean z) {
        int i3;
        int i6 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i7 = fVar.f10337g;
        int i8 = fVar.f10338h;
        if (i8 >= 0 && i7 >= 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 4) {
                        if (i6 == 8 || i6 == 16) {
                            if (z) {
                                fVar.f10338h = fVar.f10348r.length();
                            } else {
                                fVar.f10338h = 0;
                            }
                        }
                    } else if (z && i8 < fVar.f10348r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(fVar.f10348r.substring(fVar.f10338h));
                        if (matcher.find()) {
                            fVar.f10338h += matcher.start(1);
                        } else {
                            fVar.f10338h = fVar.f10348r.length();
                        }
                    } else if (!z && fVar.f10338h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(fVar.f10348r.substring(0, fVar.f10338h));
                        if (matcher2.find()) {
                            fVar.f10338h = matcher2.start(1);
                        } else {
                            fVar.f10338h = 0;
                        }
                    }
                } else if (z && i8 < fVar.f10348r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(fVar.f10348r.substring(fVar.f10338h));
                    matcher3.find();
                    if (matcher3.find()) {
                        fVar.f10338h += matcher3.start(1);
                    } else {
                        fVar.f10338h = fVar.f10348r.length();
                    }
                } else if (!z && fVar.f10338h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(fVar.f10348r.substring(0, fVar.f10338h));
                    if (matcher4.find()) {
                        fVar.f10338h = matcher4.start(1);
                    }
                }
            } else if (z && i8 < fVar.f10348r.length()) {
                fVar.f10338h++;
            } else if (!z && (i3 = fVar.f10338h) > 0) {
                fVar.f10338h = i3 - 1;
            }
            if (!z5) {
                fVar.f10337g = fVar.f10338h;
            }
        }
        if (i7 != fVar.f10337g || i8 != fVar.f10338h) {
            String str = fVar.f10348r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d6 = d(fVar.f10327b, 8192);
            d6.getText().add(str);
            d6.setFromIndex(fVar.f10337g);
            d6.setToIndex(fVar.f10338h);
            d6.setItemCount(str.length());
            h(d6);
        }
        B4.i iVar = this.f10358b;
        if (i6 == 1) {
            if (z) {
                d dVar = d.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (f.k(fVar, dVar)) {
                    iVar.A(i2, dVar, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z) {
                d dVar2 = d.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (f.k(fVar, dVar2)) {
                    iVar.A(i2, dVar2, Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 2) {
            if (z) {
                d dVar3 = d.MOVE_CURSOR_FORWARD_BY_WORD;
                if (f.k(fVar, dVar3)) {
                    iVar.A(i2, dVar3, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z) {
                d dVar4 = d.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (f.k(fVar, dVar4)) {
                    iVar.A(i2, dVar4, Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 4 || i6 == 8 || i6 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            f fVar = this.f10369m;
            if (fVar != null) {
                return createAccessibilityNodeInfo(fVar.f10327b);
            }
        } else if (i2 != 2) {
            return null;
        }
        f fVar2 = this.f10365i;
        if (fVar2 != null) {
            return createAccessibilityNodeInfo(fVar2.f10327b);
        }
        Integer num = this.f10366j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f10359c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f10359c.isEnabled()) {
            View view = this.f10357a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z) {
        if (this.f10375s == z) {
            return;
        }
        this.f10375s = z;
        if (z) {
            this.f10367k |= 1;
        } else {
            this.f10367k &= -2;
        }
        ((FlutterJNI) this.f10358b.f312c).setAccessibilityFeatures(this.f10367k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r0 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(f fVar) {
        if (fVar.f10340j <= 1) {
            return false;
        }
        f fVar2 = this.f10365i;
        f fVar3 = null;
        if (fVar2 != null) {
            f fVar4 = fVar2.f10320V;
            while (true) {
                if (fVar4 == null) {
                    fVar4 = null;
                    break;
                }
                if (fVar4 == fVar) {
                    break;
                }
                fVar4 = fVar4.f10320V;
            }
        }
        f fVar5 = this.f10365i;
        D3.f fVar6 = new D3.f(2);
        if (fVar5 != null) {
            f fVar7 = fVar5.f10320V;
            while (true) {
                if (fVar7 == null) {
                    break;
                }
                if (fVar6.test(fVar7)) {
                    fVar3 = fVar7;
                    break;
                }
                fVar7 = fVar7.f10320V;
            }
            if (fVar3 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.f10360d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f10366j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f10363g;
        f fVar = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar == null) {
            return false;
        }
        d dVar = d.INCREASE;
        d dVar2 = d.DECREASE;
        B4.i iVar = this.f10358b;
        switch (i3) {
            case 16:
                iVar.z(i2, d.TAP);
                return true;
            case 32:
                iVar.z(i2, d.LONG_PRESS);
                return true;
            case 64:
                if (this.f10365i == null) {
                    this.f10357a.invalidate();
                }
                this.f10365i = fVar;
                iVar.z(i2, d.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(WebViewManager.EVENT_TYPE_KEY, "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(fVar.f10327b));
                ((t) iVar.f311b).g(hashMap2, null);
                g(i2, 32768);
                if (f.k(fVar, dVar) || f.k(fVar, dVar2)) {
                    g(i2, 4);
                }
                return true;
            case 128:
                f fVar2 = this.f10365i;
                if (fVar2 != null && fVar2.f10327b == i2) {
                    this.f10365i = null;
                }
                Integer num = this.f10366j;
                if (num != null && num.intValue() == i2) {
                    this.f10366j = null;
                }
                iVar.z(i2, d.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i2, 65536);
                return true;
            case 256:
                return f(fVar, i2, bundle, true);
            case 512:
                return f(fVar, i2, bundle, false);
            case Base64Utils.IO_BUFFER_SIZE /* 4096 */:
                d dVar3 = d.SCROLL_UP;
                if (f.k(fVar, dVar3)) {
                    iVar.z(i2, dVar3);
                } else {
                    d dVar4 = d.SCROLL_LEFT;
                    if (f.k(fVar, dVar4)) {
                        iVar.z(i2, dVar4);
                    } else {
                        if (!f.k(fVar, dVar)) {
                            return false;
                        }
                        fVar.f10348r = fVar.f10350t;
                        fVar.f10349s = fVar.f10351u;
                        g(i2, 4);
                        iVar.z(i2, dVar);
                    }
                }
                return true;
            case 8192:
                d dVar5 = d.SCROLL_DOWN;
                if (f.k(fVar, dVar5)) {
                    iVar.z(i2, dVar5);
                } else {
                    d dVar6 = d.SCROLL_RIGHT;
                    if (f.k(fVar, dVar6)) {
                        iVar.z(i2, dVar6);
                    } else {
                        if (!f.k(fVar, dVar2)) {
                            return false;
                        }
                        fVar.f10348r = fVar.f10352v;
                        fVar.f10349s = fVar.f10353w;
                        g(i2, 4);
                        iVar.z(i2, dVar2);
                    }
                }
                return true;
            case 16384:
                iVar.z(i2, d.COPY);
                return true;
            case 32768:
                iVar.z(i2, d.PASTE);
                return true;
            case 65536:
                iVar.z(i2, d.CUT);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(fVar.f10338h));
                    hashMap3.put("extent", Integer.valueOf(fVar.f10338h));
                }
                iVar.A(i2, d.SET_SELECTION, hashMap3);
                f fVar3 = (f) hashMap.get(Integer.valueOf(i2));
                fVar3.f10337g = ((Integer) hashMap3.get("base")).intValue();
                fVar3.f10338h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 262144:
                iVar.z(i2, d.EXPAND);
                return true;
            case 524288:
                iVar.z(i2, d.COLLAPSE);
                return true;
            case 1048576:
                iVar.z(i2, d.DISMISS);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                iVar.A(i2, d.SET_TEXT, string);
                fVar.f10348r = string;
                fVar.f10349s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                iVar.z(i2, d.SHOW_ON_SCREEN);
                return true;
            default:
                e eVar = (e) this.f10364h.get(Integer.valueOf(i3 - 267386881));
                if (eVar == null) {
                    return false;
                }
                iVar.A(i2, d.CUSTOM_ACTION, Integer.valueOf(eVar.f10296b));
                return true;
        }
    }
}
