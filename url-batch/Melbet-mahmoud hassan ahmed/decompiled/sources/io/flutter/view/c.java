package io.flutter.view;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.view.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l5.a;

/* loaded from: classes.dex */
public class c extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    private final View f17841a;

    /* renamed from: b, reason: collision with root package name */
    private final l5.a f17842b;

    /* renamed from: c, reason: collision with root package name */
    private final AccessibilityManager f17843c;

    /* renamed from: d, reason: collision with root package name */
    private final AccessibilityViewEmbedder f17844d;

    /* renamed from: e, reason: collision with root package name */
    private final io.flutter.plugin.platform.i f17845e;

    /* renamed from: f, reason: collision with root package name */
    private final ContentResolver f17846f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, l> f17847g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Integer, h> f17848h;

    /* renamed from: i, reason: collision with root package name */
    private l f17849i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f17850j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f17851k;

    /* renamed from: l, reason: collision with root package name */
    private int f17852l;

    /* renamed from: m, reason: collision with root package name */
    private l f17853m;

    /* renamed from: n, reason: collision with root package name */
    private l f17854n;

    /* renamed from: o, reason: collision with root package name */
    private l f17855o;

    /* renamed from: p, reason: collision with root package name */
    private final List<Integer> f17856p;

    /* renamed from: q, reason: collision with root package name */
    private int f17857q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f17858r;

    /* renamed from: s, reason: collision with root package name */
    private k f17859s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f17860t;

    /* renamed from: u, reason: collision with root package name */
    private final a.b f17861u;

    /* renamed from: v, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f17862v;

    /* renamed from: w, reason: collision with root package name */
    @TargetApi(19)
    private final AccessibilityManager.TouchExplorationStateChangeListener f17863w;

    /* renamed from: x, reason: collision with root package name */
    private final ContentObserver f17864x;

    /* renamed from: y, reason: collision with root package name */
    private static final int f17839y = ((g.SCROLL_RIGHT.f17900f | g.SCROLL_LEFT.f17900f) | g.SCROLL_UP.f17900f) | g.SCROLL_DOWN.f17900f;

    /* renamed from: z, reason: collision with root package name */
    private static final int f17840z = ((((((((((i.HAS_CHECKED_STATE.f17926f | i.IS_CHECKED.f17926f) | i.IS_SELECTED.f17926f) | i.IS_TEXT_FIELD.f17926f) | i.IS_FOCUSED.f17926f) | i.HAS_ENABLED_STATE.f17926f) | i.IS_ENABLED.f17926f) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f17926f) | i.HAS_TOGGLED_STATE.f17926f) | i.IS_TOGGLED.f17926f) | i.IS_FOCUSABLE.f17926f) | i.IS_SLIDER.f17926f;
    private static int A = 267386881;

    class a implements a.b {
        a() {
        }

        @Override // l5.a.b
        public void a(String str) {
            c.this.f17841a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            c.this.X(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.W(byteBuffer, strArr);
        }

        @Override // l5.a.b
        public void d(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent G = c.this.G(0, 32);
            G.getText().add(str);
            c.this.Q(G);
        }

        @Override // l5.a.b
        public void e(int i7) {
            c.this.P(i7, 2);
        }

        @Override // l5.a.b
        public void f(int i7) {
            c.this.P(i7, 1);
        }
    }

    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z6) {
            if (c.this.f17860t) {
                return;
            }
            l5.a aVar = c.this.f17842b;
            if (z6) {
                aVar.g(c.this.f17861u);
                c.this.f17842b.e();
            } else {
                aVar.g(null);
                c.this.f17842b.d();
            }
            if (c.this.f17859s != null) {
                c.this.f17859s.a(z6, c.this.f17843c.isTouchExplorationEnabled());
            }
        }
    }

    /* renamed from: io.flutter.view.c$c, reason: collision with other inner class name */
    class C0078c extends ContentObserver {
        C0078c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            onChange(z6, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6, Uri uri) {
            if (c.this.f17860t) {
                return;
            }
            String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(c.this.f17846f, "transition_animation_scale");
            if (string != null && string.equals("0")) {
                c.f(c.this, f.DISABLE_ANIMATIONS.f17879f);
            } else {
                c.e(c.this, f.DISABLE_ANIMATIONS.f17879f ^ (-1));
            }
            c.this.R();
        }
    }

    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f17868a;

        d(AccessibilityManager accessibilityManager) {
            this.f17868a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z6) {
            if (c.this.f17860t) {
                return;
            }
            c cVar = c.this;
            if (z6) {
                c.f(cVar, f.ACCESSIBLE_NAVIGATION.f17879f);
            } else {
                cVar.J();
                c.e(c.this, f.ACCESSIBLE_NAVIGATION.f17879f ^ (-1));
            }
            c.this.R();
            if (c.this.f17859s != null) {
                c.this.f17859s.a(this.f17868a.isEnabled(), z6);
            }
        }
    }

    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17870a;

        static {
            int[] iArr = new int[o.values().length];
            f17870a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17870a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);


        /* renamed from: f, reason: collision with root package name */
        final int f17879f;

        f(int i7) {
            this.f17879f = i7;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);


        /* renamed from: f, reason: collision with root package name */
        public final int f17900f;

        g(int i7) {
            this.f17900f = i7;
        }
    }

    private static class h {

        /* renamed from: a, reason: collision with root package name */
        private int f17901a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f17902b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f17903c = -1;

        /* renamed from: d, reason: collision with root package name */
        private String f17904d;

        /* renamed from: e, reason: collision with root package name */
        private String f17905e;

        h() {
        }
    }

    enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216);


        /* renamed from: f, reason: collision with root package name */
        final int f17926f;

        i(int i7) {
            this.f17926f = i7;
        }
    }

    private static class j extends n {

        /* renamed from: d, reason: collision with root package name */
        String f17927d;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z6, boolean z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class l {
        private p A;
        private int C;
        private int D;
        private int E;
        private int F;
        private float G;
        private float H;
        private float I;
        private String J;
        private String K;
        private float L;
        private float M;
        private float N;
        private float O;
        private float[] P;
        private l Q;
        private List<h> T;
        private h U;
        private h V;
        private float[] X;
        private float[] Z;

        /* renamed from: a, reason: collision with root package name */
        final c f17928a;

        /* renamed from: a0, reason: collision with root package name */
        private Rect f17929a0;

        /* renamed from: c, reason: collision with root package name */
        private int f17931c;

        /* renamed from: d, reason: collision with root package name */
        private int f17932d;

        /* renamed from: e, reason: collision with root package name */
        private int f17933e;

        /* renamed from: f, reason: collision with root package name */
        private int f17934f;

        /* renamed from: g, reason: collision with root package name */
        private int f17935g;

        /* renamed from: h, reason: collision with root package name */
        private int f17936h;

        /* renamed from: i, reason: collision with root package name */
        private int f17937i;

        /* renamed from: j, reason: collision with root package name */
        private int f17938j;

        /* renamed from: k, reason: collision with root package name */
        private int f17939k;

        /* renamed from: l, reason: collision with root package name */
        private float f17940l;

        /* renamed from: m, reason: collision with root package name */
        private float f17941m;

        /* renamed from: n, reason: collision with root package name */
        private float f17942n;

        /* renamed from: o, reason: collision with root package name */
        private String f17943o;

        /* renamed from: p, reason: collision with root package name */
        private List<n> f17944p;

        /* renamed from: q, reason: collision with root package name */
        private String f17945q;

        /* renamed from: r, reason: collision with root package name */
        private List<n> f17946r;

        /* renamed from: s, reason: collision with root package name */
        private String f17947s;

        /* renamed from: t, reason: collision with root package name */
        private List<n> f17948t;

        /* renamed from: u, reason: collision with root package name */
        private String f17949u;

        /* renamed from: v, reason: collision with root package name */
        private List<n> f17950v;

        /* renamed from: w, reason: collision with root package name */
        private String f17951w;

        /* renamed from: x, reason: collision with root package name */
        private List<n> f17952x;

        /* renamed from: y, reason: collision with root package name */
        private String f17953y;

        /* renamed from: b, reason: collision with root package name */
        private int f17930b = -1;

        /* renamed from: z, reason: collision with root package name */
        private int f17954z = -1;
        private boolean B = false;
        private List<l> R = new ArrayList();
        private List<l> S = new ArrayList();
        private boolean W = true;
        private boolean Y = true;

        l(c cVar) {
            this.f17928a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(List<l> list) {
            if (p0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator<l> it = this.R.iterator();
            while (it.hasNext()) {
                it.next().c0(list);
            }
        }

        @TargetApi(21)
        private SpannableString d0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n nVar : list) {
                    int i7 = e.f17870a[nVar.f17957c.ordinal()];
                    if (i7 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f17955a, nVar.f17956b, 0);
                    } else if (i7 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f17927d)), nVar.f17955a, nVar.f17956b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e0() {
            String str;
            String str2 = this.f17943o;
            if (str2 == null && this.K == null) {
                return false;
            }
            return str2 == null || (str = this.K) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f0() {
            return (Float.isNaN(this.f17940l) || Float.isNaN(this.G) || this.G == this.f17940l) ? false : true;
        }

        private void g0() {
            if (this.W) {
                this.W = false;
                if (this.X == null) {
                    this.X = new float[16];
                }
                if (Matrix.invertM(this.X, 0, this.P, 0)) {
                    return;
                }
                Arrays.fill(this.X, 0.0f);
            }
        }

        private l h0(u5.d<l> dVar) {
            for (l lVar = this.Q; lVar != null; lVar = lVar.Q) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect i0() {
            return this.f17929a0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String j0() {
            String str;
            if (p0(i.NAMES_ROUTE) && (str = this.f17943o) != null && !str.isEmpty()) {
                return this.f17943o;
            }
            Iterator<l> it = this.R.iterator();
            while (it.hasNext()) {
                String j02 = it.next().j0();
                if (j02 != null && !j02.isEmpty()) {
                    return j02;
                }
            }
            return null;
        }

        private List<n> k0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i7 = byteBuffer.getInt();
            a aVar = null;
            if (i7 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = byteBuffer.getInt();
                int i10 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i11 = e.f17870a[oVar.ordinal()];
                if (i11 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(aVar);
                    mVar.f17955a = i9;
                    mVar.f17956b = i10;
                    mVar.f17957c = oVar;
                    arrayList.add(mVar);
                } else if (i11 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(aVar);
                    jVar.f17955a = i9;
                    jVar.f17956b = i10;
                    jVar.f17957c = oVar;
                    jVar.f17927d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence l0() {
            CharSequence charSequence = null;
            for (CharSequence charSequence2 : Build.VERSION.SDK_INT < 21 ? new CharSequence[]{this.f17945q, this.f17943o, this.f17951w} : new CharSequence[]{d0(this.f17945q, this.f17946r), d0(this.f17943o, this.f17944p), d0(this.f17951w, this.f17952x)}) {
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        static /* synthetic */ int m(l lVar, int i7) {
            int i8 = lVar.f17936h + i7;
            lVar.f17936h = i8;
            return i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean m0(g gVar) {
            return (gVar.f17900f & this.D) != 0;
        }

        static /* synthetic */ int n(l lVar, int i7) {
            int i8 = lVar.f17936h - i7;
            lVar.f17936h = i8;
            return i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean n0(i iVar) {
            return (iVar.f17926f & this.C) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o0(g gVar) {
            return (gVar.f17900f & this.f17932d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p0(i iVar) {
            return (iVar.f17926f & this.f17931c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l q0(float[] fArr) {
            float f7 = fArr[3];
            float f8 = fArr[0] / f7;
            float f9 = fArr[1] / f7;
            if (f8 < this.L || f8 >= this.N || f9 < this.M || f9 >= this.O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.S) {
                if (!lVar.p0(i.IS_HIDDEN)) {
                    lVar.g0();
                    Matrix.multiplyMV(fArr2, 0, lVar.X, 0, fArr, 0);
                    l q02 = lVar.q0(fArr2);
                    if (q02 != null) {
                        return q02;
                    }
                }
            }
            if (r0()) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean r0() {
            String str;
            String str2;
            String str3;
            if (p0(i.SCOPES_ROUTE)) {
                return false;
            }
            return (!p0(i.IS_FOCUSABLE) && (this.f17932d & (c.f17839y ^ (-1))) == 0 && (this.f17931c & c.f17840z) == 0 && ((str = this.f17943o) == null || str.isEmpty()) && (((str2 = this.f17945q) == null || str2.isEmpty()) && ((str3 = this.f17951w) == null || str3.isEmpty()))) ? false : true;
        }

        private float s0(float f7, float f8, float f9, float f10) {
            return Math.max(f7, Math.max(f8, Math.max(f9, f10)));
        }

        private float t0(float f7, float f8, float f9, float f10) {
            return Math.min(f7, Math.min(f8, Math.min(f9, f10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean u0(l lVar, u5.d<l> dVar) {
            return (lVar == null || lVar.h0(dVar) == null) ? false : true;
        }

        private void v0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f7 = fArr[3];
            fArr[0] = fArr[0] / f7;
            fArr[1] = fArr[1] / f7;
            fArr[2] = fArr[2] / f7;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w0(float[] fArr, Set<l> set, boolean z6) {
            set.add(this);
            if (this.Y) {
                z6 = true;
            }
            if (z6) {
                if (this.Z == null) {
                    this.Z = new float[16];
                }
                Matrix.multiplyMM(this.Z, 0, fArr, 0, this.P, 0);
                float[] fArr2 = {this.L, this.M, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                v0(fArr3, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.M;
                v0(fArr4, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.O;
                v0(fArr5, this.Z, fArr2);
                fArr2[0] = this.L;
                fArr2[1] = this.O;
                v0(fArr6, this.Z, fArr2);
                if (this.f17929a0 == null) {
                    this.f17929a0 = new Rect();
                }
                this.f17929a0.set(Math.round(t0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(t0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(s0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(s0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Y = false;
            }
            int i7 = -1;
            for (l lVar : this.R) {
                lVar.f17954z = i7;
                i7 = lVar.f17930b;
                lVar.w0(this.Z, set, z6);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.B = true;
            this.J = this.f17945q;
            this.K = this.f17943o;
            this.C = this.f17931c;
            this.D = this.f17932d;
            this.E = this.f17935g;
            this.F = this.f17936h;
            this.G = this.f17940l;
            this.H = this.f17941m;
            this.I = this.f17942n;
            this.f17931c = byteBuffer.getInt();
            this.f17932d = byteBuffer.getInt();
            this.f17933e = byteBuffer.getInt();
            this.f17934f = byteBuffer.getInt();
            this.f17935g = byteBuffer.getInt();
            this.f17936h = byteBuffer.getInt();
            this.f17937i = byteBuffer.getInt();
            this.f17938j = byteBuffer.getInt();
            this.f17939k = byteBuffer.getInt();
            this.f17940l = byteBuffer.getFloat();
            this.f17941m = byteBuffer.getFloat();
            this.f17942n = byteBuffer.getFloat();
            int i7 = byteBuffer.getInt();
            this.f17943o = i7 == -1 ? null : strArr[i7];
            this.f17944p = k0(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            this.f17945q = i8 == -1 ? null : strArr[i8];
            this.f17946r = k0(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            this.f17947s = i9 == -1 ? null : strArr[i9];
            this.f17948t = k0(byteBuffer, byteBufferArr);
            int i10 = byteBuffer.getInt();
            this.f17949u = i10 == -1 ? null : strArr[i10];
            this.f17950v = k0(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            this.f17951w = i11 == -1 ? null : strArr[i11];
            this.f17952x = k0(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.f17953y = i12 == -1 ? null : strArr[i12];
            this.A = p.b(byteBuffer.getInt());
            this.L = byteBuffer.getFloat();
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            if (this.P == null) {
                this.P = new float[16];
            }
            for (int i13 = 0; i13 < 16; i13++) {
                this.P[i13] = byteBuffer.getFloat();
            }
            this.W = true;
            this.Y = true;
            int i14 = byteBuffer.getInt();
            this.R.clear();
            this.S.clear();
            for (int i15 = 0; i15 < i14; i15++) {
                l z6 = this.f17928a.z(byteBuffer.getInt());
                z6.Q = this;
                this.R.add(z6);
            }
            for (int i16 = 0; i16 < i14; i16++) {
                l z7 = this.f17928a.z(byteBuffer.getInt());
                z7.Q = this;
                this.S.add(z7);
            }
            int i17 = byteBuffer.getInt();
            if (i17 == 0) {
                this.T = null;
                return;
            }
            List<h> list = this.T;
            if (list == null) {
                this.T = new ArrayList(i17);
            } else {
                list.clear();
            }
            for (int i18 = 0; i18 < i17; i18++) {
                h y6 = this.f17928a.y(byteBuffer.getInt());
                if (y6.f17903c == g.TAP.f17900f) {
                    this.U = y6;
                } else if (y6.f17903c == g.LONG_PRESS.f17900f) {
                    this.V = y6;
                } else {
                    this.T.add(y6);
                }
                this.T.add(y6);
            }
        }
    }

    private static class m extends n {
        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static class n {

        /* renamed from: a, reason: collision with root package name */
        int f17955a;

        /* renamed from: b, reason: collision with root package name */
        int f17956b;

        /* renamed from: c, reason: collision with root package name */
        o f17957c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private enum o {
        SPELLOUT,
        LOCALE
    }

    private enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p b(int i7) {
            return i7 != 1 ? i7 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public c(View view, l5.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.i iVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), iVar);
    }

    public c(View view, l5.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.i iVar) {
        this.f17847g = new HashMap();
        this.f17848h = new HashMap();
        this.f17852l = 0;
        this.f17856p = new ArrayList();
        this.f17857q = 0;
        this.f17858r = 0;
        this.f17860t = false;
        this.f17861u = new a();
        b bVar = new b();
        this.f17862v = bVar;
        C0078c c0078c = new C0078c(new Handler());
        this.f17864x = c0078c;
        this.f17841a = view;
        this.f17842b = aVar;
        this.f17843c = accessibilityManager;
        this.f17846f = contentResolver;
        this.f17844d = accessibilityViewEmbedder;
        this.f17845e = iVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 19) {
            d dVar = new d(accessibilityManager);
            this.f17863w = dVar;
            dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        } else {
            this.f17863w = null;
        }
        if (i7 >= 17) {
            c0078c.onChange(false);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, c0078c);
        }
        iVar.a(this);
    }

    private l A() {
        return this.f17847g.get(0);
    }

    private void B(float f7, float f8) {
        l q02;
        if (this.f17847g.isEmpty() || (q02 = A().q0(new float[]{f7, f8, 0.0f, 1.0f})) == this.f17855o) {
            return;
        }
        if (q02 != null) {
            P(q02.f17930b, 128);
        }
        l lVar = this.f17855o;
        if (lVar != null) {
            P(lVar.f17930b, 256);
        }
        this.f17855o = q02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean E(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean F(l lVar) {
        return lVar.p0(i.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent G(int i7, int i8) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        obtain.setPackageName(this.f17841a.getContext().getPackageName());
        obtain.setSource(this.f17841a, i7);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        l lVar = this.f17855o;
        if (lVar != null) {
            P(lVar.f17930b, 256);
            this.f17855o = null;
        }
    }

    private void K(l lVar) {
        String j02 = lVar.j0();
        if (j02 == null) {
            j02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            T(j02);
            return;
        }
        AccessibilityEvent G = G(lVar.f17930b, 32);
        G.getText().add(j02);
        Q(G);
    }

    @TargetApi(18)
    private boolean L(l lVar, int i7, Bundle bundle, boolean z6) {
        int i8 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z7 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i9 = lVar.f17935g;
        int i10 = lVar.f17936h;
        N(lVar, i8, z6, z7);
        if (i9 != lVar.f17935g || i10 != lVar.f17936h) {
            String str = lVar.f17945q != null ? lVar.f17945q : "";
            AccessibilityEvent G = G(lVar.f17930b, 8192);
            G.getText().add(str);
            G.setFromIndex(lVar.f17935g);
            G.setToIndex(lVar.f17936h);
            G.setItemCount(str.length());
            Q(G);
        }
        if (i8 == 1) {
            if (z6) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.o0(gVar)) {
                    this.f17842b.c(i7, gVar, Boolean.valueOf(z7));
                    return true;
                }
            }
            if (z6) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.o0(gVar2)) {
                return false;
            }
            this.f17842b.c(i7, gVar2, Boolean.valueOf(z7));
            return true;
        }
        if (i8 != 2) {
            return i8 == 4 || i8 == 8 || i8 == 16;
        }
        if (z6) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (lVar.o0(gVar3)) {
                this.f17842b.c(i7, gVar3, Boolean.valueOf(z7));
                return true;
            }
        }
        if (z6) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!lVar.o0(gVar4)) {
            return false;
        }
        this.f17842b.c(i7, gVar4, Boolean.valueOf(z7));
        return true;
    }

    @TargetApi(21)
    private boolean M(l lVar, int i7, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f17842b.c(i7, g.SET_TEXT, string);
        lVar.f17945q = string;
        lVar.f17946r = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        r5 = r4.f17945q.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        r4.f17936h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r4.f17936h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        io.flutter.view.c.l.m(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void N(l lVar, int i7, boolean z6, boolean z7) {
        Matcher matcher;
        Matcher matcher2;
        if (lVar.f17936h < 0 || lVar.f17935g < 0) {
            return;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 == 8 || i7 == 16) {
                    }
                } else if (z6 && lVar.f17936h < lVar.f17945q.length()) {
                    matcher2 = Pattern.compile("(?!^)(\\n)").matcher(lVar.f17945q.substring(lVar.f17936h));
                } else if (!z6 && lVar.f17936h > 0) {
                    matcher = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.f17945q.substring(0, lVar.f17936h));
                }
            } else if (z6 && lVar.f17936h < lVar.f17945q.length()) {
                matcher2 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.f17945q.substring(lVar.f17936h));
                matcher2.find();
            } else if (!z6 && lVar.f17936h > 0) {
                matcher = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.f17945q.substring(0, lVar.f17936h));
            }
        } else if (z6 && lVar.f17936h < lVar.f17945q.length()) {
            l.m(lVar, 1);
        } else if (!z6 && lVar.f17936h > 0) {
            l.n(lVar, 1);
        }
        if (z7) {
            return;
        }
        lVar.f17935g = lVar.f17936h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(int i7, int i8) {
        if (this.f17843c.isEnabled()) {
            Q(G(i7, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(AccessibilityEvent accessibilityEvent) {
        if (this.f17843c.isEnabled()) {
            this.f17841a.getParent().requestSendAccessibilityEvent(this.f17841a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        this.f17842b.f(this.f17852l);
    }

    private void S(int i7) {
        AccessibilityEvent G = G(i7, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            G.setContentChangeTypes(1);
        }
        Q(G);
    }

    @TargetApi(28)
    private void T(String str) {
        this.f17841a.setAccessibilityPaneTitle(str);
    }

    private boolean V(final l lVar) {
        return lVar.f17938j > 0 && (l.u0(this.f17849i, new u5.d() { // from class: io.flutter.view.a
            @Override // u5.d
            public final boolean test(Object obj) {
                boolean E;
                E = c.E(c.l.this, (c.l) obj);
                return E;
            }
        }) || !l.u0(this.f17849i, new u5.d() { // from class: io.flutter.view.b
            @Override // u5.d
            public final boolean test(Object obj) {
                boolean F;
                F = c.F((c.l) obj);
                return F;
            }
        }));
    }

    @TargetApi(19)
    private void Y(l lVar) {
        View c7;
        Integer num;
        lVar.Q = null;
        if (lVar.f17937i != -1 && (num = this.f17850j) != null && this.f17844d.platformViewOfNode(num.intValue()) == this.f17845e.c(lVar.f17937i)) {
            P(this.f17850j.intValue(), 65536);
            this.f17850j = null;
        }
        if (lVar.f17937i != -1 && (c7 = this.f17845e.c(lVar.f17937i)) != null) {
            c7.setImportantForAccessibility(4);
        }
        l lVar2 = this.f17849i;
        if (lVar2 == lVar) {
            P(lVar2.f17930b, 65536);
            this.f17849i = null;
        }
        if (this.f17853m == lVar) {
            this.f17853m = null;
        }
        if (this.f17855o == lVar) {
            this.f17855o = null;
        }
    }

    static /* synthetic */ int e(c cVar, int i7) {
        int i8 = i7 & cVar.f17852l;
        cVar.f17852l = i8;
        return i8;
    }

    static /* synthetic */ int f(c cVar, int i7) {
        int i8 = i7 | cVar.f17852l;
        cVar.f17852l = i8;
        return i8;
    }

    private AccessibilityEvent u(int i7, String str, String str2) {
        AccessibilityEvent G = G(i7, 16);
        G.setBeforeText(str);
        G.getText().add(str2);
        int i8 = 0;
        while (i8 < str.length() && i8 < str2.length() && str.charAt(i8) == str2.charAt(i8)) {
            i8++;
        }
        if (i8 >= str.length() && i8 >= str2.length()) {
            return null;
        }
        G.setFromIndex(i8);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i8 && length2 >= i8 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        G.setRemovedCount((length - i8) + 1);
        G.setAddedCount((length2 - i8) + 1);
        return G;
    }

    @TargetApi(28)
    private boolean v() {
        Activity e7 = u5.h.e(this.f17841a.getContext());
        if (e7 == null || e7.getWindow() == null) {
            return false;
        }
        int i7 = e7.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i7 == 2 || i7 == 0;
    }

    private Rect x(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f17841a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h y(int i7) {
        h hVar = this.f17848h.get(Integer.valueOf(i7));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f17902b = i7;
        hVar2.f17901a = A + i7;
        this.f17848h.put(Integer.valueOf(i7), hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l z(int i7) {
        l lVar = this.f17847g.get(Integer.valueOf(i7));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f17930b = i7;
        this.f17847g.put(Integer.valueOf(i7), lVar2);
        return lVar2;
    }

    public boolean C() {
        return this.f17843c.isEnabled();
    }

    public boolean D() {
        return this.f17843c.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo H(View view, int i7) {
        return AccessibilityNodeInfo.obtain(view, i7);
    }

    public boolean I(MotionEvent motionEvent) {
        if (!this.f17843c.isTouchExplorationEnabled() || this.f17847g.isEmpty()) {
            return false;
        }
        l q02 = A().q0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
        if (q02 != null && q02.f17937i != -1) {
            return this.f17844d.onAccessibilityHoverEvent(q02.f17930b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            B(motionEvent.getX(), motionEvent.getY());
        } else {
            if (motionEvent.getAction() != 10) {
                z4.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            J();
        }
        return true;
    }

    public void O() {
        this.f17860t = true;
        this.f17845e.d();
        U(null);
        this.f17843c.removeAccessibilityStateChangeListener(this.f17862v);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f17843c.removeTouchExplorationStateChangeListener(this.f17863w);
        }
        this.f17846f.unregisterContentObserver(this.f17864x);
        this.f17842b.g(null);
    }

    public void U(k kVar) {
        this.f17859s = kVar;
    }

    void W(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h y6 = y(byteBuffer.getInt());
            y6.f17903c = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            String str = null;
            y6.f17904d = i7 == -1 ? null : strArr[i7];
            int i8 = byteBuffer.getInt();
            if (i8 != -1) {
                str = strArr[i8];
            }
            y6.f17905e = str;
        }
    }

    void X(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f7;
        float f8;
        WindowInsets rootWindowInsets;
        View c7;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l z6 = z(byteBuffer.getInt());
            z6.x0(byteBuffer, strArr, byteBufferArr);
            if (!z6.p0(i.IS_HIDDEN)) {
                if (z6.p0(i.IS_FOCUSED)) {
                    this.f17853m = z6;
                }
                if (z6.B) {
                    arrayList.add(z6);
                }
                if (z6.f17937i != -1 && !this.f17845e.b(z6.f17937i) && (c7 = this.f17845e.c(z6.f17937i)) != null) {
                    c7.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l A2 = A();
        ArrayList<l> arrayList2 = new ArrayList();
        if (A2 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 23) {
                if ((i7 >= 28 ? v() : true) && (rootWindowInsets = this.f17841a.getRootWindowInsets()) != null) {
                    if (!this.f17858r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                        A2.Y = true;
                        A2.W = true;
                    }
                    this.f17858r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                    Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
                }
            }
            A2.w0(fArr, hashSet, false);
            A2.c0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f17856p.contains(Integer.valueOf(lVar4.f17930b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f17930b != this.f17857q || arrayList2.size() != this.f17856p.size())) {
            this.f17857q = lVar3.f17930b;
            K(lVar3);
        }
        this.f17856p.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f17856p.add(Integer.valueOf(((l) it.next()).f17930b));
        }
        Iterator<Map.Entry<Integer, l>> it2 = this.f17847g.entrySet().iterator();
        while (it2.hasNext()) {
            l value = it2.next().getValue();
            if (!hashSet.contains(value)) {
                Y(value);
                it2.remove();
            }
        }
        S(0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l lVar5 = (l) it3.next();
            if (lVar5.f0()) {
                AccessibilityEvent G = G(lVar5.f17930b, 4096);
                float f9 = lVar5.f17940l;
                float f10 = lVar5.f17941m;
                if (Float.isInfinite(lVar5.f17941m)) {
                    if (f9 > 70000.0f) {
                        f9 = 70000.0f;
                    }
                    f10 = 100000.0f;
                }
                if (Float.isInfinite(lVar5.f17942n)) {
                    f7 = f10 + 100000.0f;
                    if (f9 < -70000.0f) {
                        f9 = -70000.0f;
                    }
                    f8 = f9 + 100000.0f;
                } else {
                    f7 = f10 - lVar5.f17942n;
                    f8 = f9 - lVar5.f17942n;
                }
                if (lVar5.m0(g.SCROLL_UP) || lVar5.m0(g.SCROLL_DOWN)) {
                    G.setScrollY((int) f8);
                    G.setMaxScrollY((int) f7);
                } else if (lVar5.m0(g.SCROLL_LEFT) || lVar5.m0(g.SCROLL_RIGHT)) {
                    G.setScrollX((int) f8);
                    G.setMaxScrollX((int) f7);
                }
                if (lVar5.f17938j > 0) {
                    G.setItemCount(lVar5.f17938j);
                    G.setFromIndex(lVar5.f17939k);
                    Iterator it4 = lVar5.S.iterator();
                    int i8 = 0;
                    while (it4.hasNext()) {
                        if (!((l) it4.next()).p0(i.IS_HIDDEN)) {
                            i8++;
                        }
                    }
                    G.setToIndex((lVar5.f17939k + i8) - 1);
                }
                Q(G);
            }
            if (lVar5.p0(i.IS_LIVE_REGION) && lVar5.e0()) {
                S(lVar5.f17930b);
            }
            l lVar6 = this.f17849i;
            if (lVar6 != null && lVar6.f17930b == lVar5.f17930b) {
                i iVar = i.IS_SELECTED;
                if (!lVar5.n0(iVar) && lVar5.p0(iVar)) {
                    AccessibilityEvent G2 = G(lVar5.f17930b, 4);
                    G2.getText().add(lVar5.f17943o);
                    Q(G2);
                }
            }
            l lVar7 = this.f17853m;
            if (lVar7 != null && lVar7.f17930b == lVar5.f17930b && ((lVar2 = this.f17854n) == null || lVar2.f17930b != this.f17853m.f17930b)) {
                this.f17854n = this.f17853m;
                Q(G(lVar5.f17930b, 8));
            } else if (this.f17853m == null) {
                this.f17854n = null;
            }
            l lVar8 = this.f17853m;
            if (lVar8 != null && lVar8.f17930b == lVar5.f17930b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar5.n0(iVar2) && lVar5.p0(iVar2) && ((lVar = this.f17849i) == null || lVar.f17930b == this.f17853m.f17930b)) {
                    String str = lVar5.J != null ? lVar5.J : "";
                    String str2 = lVar5.f17945q != null ? lVar5.f17945q : "";
                    AccessibilityEvent u6 = u(lVar5.f17930b, str, str2);
                    if (u6 != null) {
                        Q(u6);
                    }
                    if (lVar5.E != lVar5.f17935g || lVar5.F != lVar5.f17936h) {
                        AccessibilityEvent G3 = G(lVar5.f17930b, 8192);
                        G3.getText().add(str2);
                        G3.setFromIndex(lVar5.f17935g);
                        G3.setToIndex(lVar5.f17936h);
                        G3.setItemCount(str2.length());
                        Q(G3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0455 A[LOOP:0: B:188:0x044f->B:190:0x0455, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x047a  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        boolean z6;
        String str;
        int i8;
        l lVar;
        if (i7 >= 65536) {
            return this.f17844d.createAccessibilityNodeInfo(i7);
        }
        if (i7 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f17841a);
            this.f17841a.onInitializeAccessibilityNodeInfo(obtain);
            if (this.f17847g.containsKey(0)) {
                obtain.addChild(this.f17841a, 0);
            }
            return obtain;
        }
        l lVar2 = this.f17847g.get(Integer.valueOf(i7));
        if (lVar2 == null) {
            return null;
        }
        if (lVar2.f17937i != -1 && this.f17845e.b(lVar2.f17937i)) {
            View c7 = this.f17845e.c(lVar2.f17937i);
            if (c7 == null) {
                return null;
            }
            return this.f17844d.getRootNode(c7, lVar2.f17930b, lVar2.i0());
        }
        AccessibilityNodeInfo H = H(this.f17841a, i7);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 18) {
            H.setViewIdResourceName("");
        }
        H.setPackageName(this.f17841a.getContext().getPackageName());
        H.setClassName("android.view.View");
        H.setSource(this.f17841a, i7);
        H.setFocusable(lVar2.r0());
        l lVar3 = this.f17853m;
        if (lVar3 != null) {
            H.setFocused(lVar3.f17930b == i7);
        }
        l lVar4 = this.f17849i;
        if (lVar4 != null) {
            H.setAccessibilityFocused(lVar4.f17930b == i7);
        }
        i iVar = i.IS_TEXT_FIELD;
        if (lVar2.p0(iVar)) {
            H.setPassword(lVar2.p0(i.IS_OBSCURED));
            if (!lVar2.p0(i.IS_READ_ONLY)) {
                H.setClassName("android.widget.EditText");
            }
            if (i9 >= 18) {
                H.setEditable(!lVar2.p0(r12));
                if (lVar2.f17935g != -1 && lVar2.f17936h != -1) {
                    H.setTextSelection(lVar2.f17935g, lVar2.f17936h);
                }
                if (i9 > 18 && (lVar = this.f17849i) != null && lVar.f17930b == i7) {
                    H.setLiveRegion(1);
                }
            }
            if (lVar2.o0(g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                H.addAction(256);
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (lVar2.o0(g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                H.addAction(512);
                i8 |= 1;
            }
            if (lVar2.o0(g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                H.addAction(256);
                i8 |= 2;
            }
            if (lVar2.o0(g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                H.addAction(512);
                i8 |= 2;
            }
            H.setMovementGranularities(i8);
            if (i9 >= 21 && lVar2.f17933e >= 0) {
                int length = lVar2.f17945q == null ? 0 : lVar2.f17945q.length();
                int unused = lVar2.f17934f;
                int unused2 = lVar2.f17933e;
                H.setMaxTextLength((length - lVar2.f17934f) + lVar2.f17933e);
            }
        }
        if (i9 > 18) {
            if (lVar2.o0(g.SET_SELECTION)) {
                H.addAction(131072);
            }
            if (lVar2.o0(g.COPY)) {
                H.addAction(16384);
            }
            if (lVar2.o0(g.CUT)) {
                H.addAction(65536);
            }
            if (lVar2.o0(g.PASTE)) {
                H.addAction(32768);
            }
        }
        if (i9 >= 21 && lVar2.o0(g.SET_TEXT)) {
            H.addAction(2097152);
        }
        if (lVar2.p0(i.IS_BUTTON) || lVar2.p0(i.IS_LINK)) {
            H.setClassName("android.widget.Button");
        }
        if (lVar2.p0(i.IS_IMAGE)) {
            H.setClassName("android.widget.ImageView");
        }
        if (i9 > 18 && lVar2.o0(g.DISMISS)) {
            H.setDismissable(true);
            H.addAction(1048576);
        }
        if (lVar2.Q != null) {
            H.setParent(this.f17841a, lVar2.Q.f17930b);
        } else {
            H.setParent(this.f17841a);
        }
        if (lVar2.f17954z != -1 && i9 >= 22) {
            H.setTraversalAfter(this.f17841a, lVar2.f17954z);
        }
        Rect i02 = lVar2.i0();
        if (lVar2.Q != null) {
            Rect i03 = lVar2.Q.i0();
            Rect rect = new Rect(i02);
            rect.offset(-i03.left, -i03.top);
            H.setBoundsInParent(rect);
        } else {
            H.setBoundsInParent(i02);
        }
        H.setBoundsInScreen(x(i02));
        H.setVisibleToUser(true);
        H.setEnabled(!lVar2.p0(i.HAS_ENABLED_STATE) || lVar2.p0(i.IS_ENABLED));
        if (lVar2.o0(g.TAP)) {
            if (i9 < 21 || lVar2.U == null) {
                H.addAction(16);
            } else {
                H.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar2.U.f17905e));
            }
            H.setClickable(true);
        }
        if (lVar2.o0(g.LONG_PRESS)) {
            if (i9 < 21 || lVar2.V == null) {
                H.addAction(32);
            } else {
                H.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar2.V.f17905e));
            }
            H.setLongClickable(true);
        }
        g gVar = g.SCROLL_LEFT;
        if (lVar2.o0(gVar) || lVar2.o0(g.SCROLL_UP) || lVar2.o0(g.SCROLL_RIGHT) || lVar2.o0(g.SCROLL_DOWN)) {
            H.setScrollable(true);
            if (lVar2.p0(i.HAS_IMPLICIT_SCROLLING)) {
                if (lVar2.o0(gVar) || lVar2.o0(g.SCROLL_RIGHT)) {
                    if (i9 <= 19 || !V(lVar2)) {
                        z6 = false;
                        H.setClassName("android.widget.HorizontalScrollView");
                    } else {
                        z6 = false;
                        H.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar2.f17938j, false));
                    }
                    if (!lVar2.o0(gVar) || lVar2.o0(g.SCROLL_UP)) {
                        H.addAction(4096);
                    }
                    if (!lVar2.o0(g.SCROLL_RIGHT) || lVar2.o0(g.SCROLL_DOWN)) {
                        H.addAction(8192);
                    }
                } else if (i9 <= 18 || !V(lVar2)) {
                    H.setClassName("android.widget.ScrollView");
                } else {
                    H.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar2.f17938j, 0, false));
                }
            }
            z6 = false;
            if (!lVar2.o0(gVar)) {
            }
            H.addAction(4096);
            if (!lVar2.o0(g.SCROLL_RIGHT)) {
            }
            H.addAction(8192);
        } else {
            z6 = false;
        }
        g gVar2 = g.INCREASE;
        if (lVar2.o0(gVar2) || lVar2.o0(g.DECREASE)) {
            H.setClassName("android.widget.SeekBar");
            if (lVar2.o0(gVar2)) {
                H.addAction(4096);
            }
            if (lVar2.o0(g.DECREASE)) {
                H.addAction(8192);
            }
        }
        if (lVar2.p0(i.IS_LIVE_REGION) && i9 > 18) {
            H.setLiveRegion(1);
        }
        if (lVar2.p0(iVar)) {
            H.setText(lVar2.l0());
        } else if (!lVar2.p0(i.SCOPES_ROUTE)) {
            CharSequence l02 = lVar2.l0();
            if (i9 < 28 && lVar2.f17953y != null) {
                l02 = ((Object) (l02 != null ? l02 : "")) + "\n" + lVar2.f17953y;
            }
            if (l02 != null) {
                H.setContentDescription(l02);
            }
        }
        if (i9 >= 28 && lVar2.f17953y != null) {
            H.setTooltipText(lVar2.f17953y);
        }
        boolean p02 = lVar2.p0(i.HAS_CHECKED_STATE);
        boolean p03 = lVar2.p0(i.HAS_TOGGLED_STATE);
        if (p02 || p03) {
            z6 = true;
        }
        H.setCheckable(z6);
        if (!p02) {
            if (p03) {
                H.setChecked(lVar2.p0(i.IS_TOGGLED));
                str = "android.widget.Switch";
            }
            H.setSelected(lVar2.p0(i.IS_SELECTED));
            if (i9 >= 28) {
                H.setHeading(lVar2.p0(i.IS_HEADER));
            }
            l lVar5 = this.f17849i;
            H.addAction((lVar5 == null && lVar5.f17930b == i7) ? 128 : 64);
            if (i9 >= 21 && lVar2.T != null) {
                for (h hVar : lVar2.T) {
                    H.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.f17901a, hVar.f17904d));
                }
            }
            for (l lVar6 : lVar2.R) {
                if (!lVar6.p0(i.IS_HIDDEN)) {
                    if (lVar6.f17937i != -1) {
                        View c8 = this.f17845e.c(lVar6.f17937i);
                        if (!this.f17845e.b(lVar6.f17937i)) {
                            H.addChild(c8);
                        }
                    }
                    H.addChild(this.f17841a, lVar6.f17930b);
                }
            }
            return H;
        }
        H.setChecked(lVar2.p0(i.IS_CHECKED));
        str = lVar2.p0(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP) ? "android.widget.RadioButton" : "android.widget.CheckBox";
        H.setClassName(str);
        H.setSelected(lVar2.p0(i.IS_SELECTED));
        if (i9 >= 28) {
        }
        l lVar52 = this.f17849i;
        H.addAction((lVar52 == null && lVar52.f17930b == i7) ? 128 : 64);
        if (i9 >= 21) {
            while (r1.hasNext()) {
            }
        }
        while (r1.hasNext()) {
        }
        return H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0016, code lost:
    
        if (r2 != null) goto L14;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo findFocus(int i7) {
        l lVar;
        Integer num;
        int i8;
        if (i7 == 1) {
            lVar = this.f17853m;
            if (lVar == null) {
                num = this.f17851k;
            }
            i8 = lVar.f17930b;
            return createAccessibilityNodeInfo(i8);
        }
        if (i7 != 2) {
            return null;
        }
        lVar = this.f17849i;
        if (lVar == null) {
            num = this.f17850j;
            if (num == null) {
                return null;
            }
            i8 = num.intValue();
            return createAccessibilityNodeInfo(i8);
        }
        i8 = lVar.f17930b;
        return createAccessibilityNodeInfo(i8);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i7, int i8, Bundle bundle) {
        int i9;
        if (i7 >= 65536) {
            boolean performAction = this.f17844d.performAction(i7, i8, bundle);
            if (performAction && i8 == 128) {
                this.f17850j = null;
            }
            return performAction;
        }
        l lVar = this.f17847g.get(Integer.valueOf(i7));
        boolean z6 = false;
        if (lVar == null) {
            return false;
        }
        switch (i8) {
            case 16:
                this.f17842b.b(i7, g.TAP);
                return true;
            case 32:
                this.f17842b.b(i7, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f17849i == null) {
                    this.f17841a.invalidate();
                }
                this.f17849i = lVar;
                this.f17842b.b(i7, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                P(i7, 32768);
                if (lVar.o0(g.INCREASE) || lVar.o0(g.DECREASE)) {
                    P(i7, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f17849i;
                if (lVar2 != null && lVar2.f17930b == i7) {
                    this.f17849i = null;
                }
                Integer num = this.f17850j;
                if (num != null && num.intValue() == i7) {
                    this.f17850j = null;
                }
                this.f17842b.b(i7, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                P(i7, 65536);
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return L(lVar, i7, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return L(lVar, i7, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.o0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.o0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.o0(gVar)) {
                            return false;
                        }
                        lVar.f17945q = lVar.f17947s;
                        lVar.f17946r = lVar.f17948t;
                        P(i7, 4);
                    }
                }
                this.f17842b.b(i7, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.o0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.o0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.o0(gVar2)) {
                            return false;
                        }
                        lVar.f17945q = lVar.f17949u;
                        lVar.f17946r = lVar.f17950v;
                        P(i7, 4);
                    }
                }
                this.f17842b.b(i7, gVar2);
                return true;
            case 16384:
                this.f17842b.b(i7, g.COPY);
                return true;
            case 32768:
                this.f17842b.b(i7, g.PASTE);
                return true;
            case 65536:
                this.f17842b.b(i7, g.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z6 = true;
                }
                if (z6) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i9 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f17936h));
                    i9 = lVar.f17936h;
                }
                hashMap.put("extent", Integer.valueOf(i9));
                this.f17842b.c(i7, g.SET_SELECTION, hashMap);
                l lVar3 = this.f17847g.get(Integer.valueOf(i7));
                lVar3.f17935g = ((Integer) hashMap.get("base")).intValue();
                lVar3.f17936h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f17842b.b(i7, g.DISMISS);
                return true;
            case 2097152:
                if (Build.VERSION.SDK_INT < 21) {
                    return false;
                }
                return M(lVar, i7, bundle);
            case R.id.accessibilityActionShowOnScreen:
                this.f17842b.b(i7, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f17848h.get(Integer.valueOf(i8 - A));
                if (hVar == null) {
                    return false;
                }
                this.f17842b.c(i7, g.CUSTOM_ACTION, Integer.valueOf(hVar.f17902b));
                return true;
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean w(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f17844d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f17844d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f17851k = recordFlutterId;
            this.f17853m = null;
            return true;
        }
        if (eventType == 128) {
            this.f17855o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f17850j = recordFlutterId;
            this.f17849i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f17851k = null;
        this.f17850j = null;
        return true;
    }
}
