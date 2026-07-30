package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import com.ice.fishing.grenza.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r1 extends ViewGroup implements ei1, rr2, uw, vh1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, ma0 {
    public static b1 HiC8volkyM7b;
    public static Method P6VAkUObIv30;
    public static Method ctD2u3GUHhtA;
    public static Method kRWHK87H9qm4;
    public static Class vfcx0XMziUg4;
    public final z0 BRwzKIf41E4i;
    public final g32 BjEWd04qc7Mw;
    public final int[] D0aTLcX6Uhyo;
    public final z0 EP3hG58ROvHh;
    public final qa0 EcgxDIVH5in8;
    public final v3 EpkonXwzFgDB;
    public boolean FT2GK7JK5Ma2;
    public final yi0 GlTbNTgfSMqy;
    public final cr1 HGgCfDnf0ga9;
    public final o61 HqMwxkFaipxD;
    public final ki IAToe7bXGz4N;
    public final x0 IXK6ba3ucyzm;
    public long IxJ9cAW40yOk;
    public final n0 J54yh1s3n4Aq;
    public final hi1 JHNfcAUfKc4G;
    public final mj1 JLGWdXyAxbxj;
    public final float[] JTxCbbCwomzt;
    public boolean KUoIVIumpKat;
    public float KZw9XyiywG4x;
    public final o1 MBpAROcyNHKN;
    public boolean MDTGUQSX7PXD;
    public le0 Nlhe969cAGO8;
    public long OPXfSBeufaJ8;
    public MotionEvent OYiFbU3x63rc;
    public final mj1 POWyO8hTM6YC;
    public final y61 Pf0ThKz3j5YS;
    public final float[] PsecLrZVVK61;
    public zv1 QrzZRwfaDlRX;
    public final View RfyTYNmI9Srp;
    public final rz0 S2OOm9zPNm0h;
    public hu S9EYkSpbGuxq;
    public View TVHukqbqS4tB;
    public final g3 VhhvGxCb8gfr;
    public final float[] VzNxmvWisHL1;
    public boolean W7ceZOzvrRuI;
    public final ic X1HMmH2Ks65g;
    public final mj1 XL4ISE6Oc65B;
    public float Y2PHjkwWz56c;
    public final mh Yadk4uqlxLy8;
    public final mj1 ZbWwgt3aGe7A;
    public final vw0 aF05bpZJlKEP;
    public boolean amuv7NJvPxHu;
    public boolean bEKsvqmvPh2y;
    public final lb0 cJeY36nTk9tz;
    public t01 cpQdD2nAriOS;
    public do0 dgRBjINgWbAK;
    public ci2 e4HgwifUDUCA;
    public final z6 e6tOsSdd2EFb;
    public final mj1 fRTaYY6FBZcX;
    public final h1 fkblLSN2bAgv;
    public final uj gGoUzNp9JO5I;
    public final da gPXPFXrUH4XX;
    public boolean hVNtCUZb4tYH;
    public final d91 hnJvRxDXo0hm;
    public final ty i68hK7ahKtgp;
    public final m1 i6zQx8Kd7UPU;
    public final AtomicReference iSxsmagYqzHM;
    public long jJwa0q7P5wHq;
    public final xp0 jyegZNwi31qc;
    public final c81 kpCQ9veP6n3I;
    public final tp0 mFd1aGiJX24N;
    public final p81 nLZGh9p8gVSu;
    public b7 ngxnMNrpiKat;
    public final y0 nxJAScVArhE9;
    public final x1 ozEBbv0hFTAB;
    public final ty pnx5pC0XzaCw;
    public final i2 qYgDo2Ye5PY7;
    public final g51 qudtW7lwm99e;
    public u01 r3s1LDPKFs1S;
    public final st1 rZjpSjn4zoMv;
    public final mj1 rtx2ld2ELZv4;
    public long rxipThha848g;
    public p81 ryVscX7ZL4Ux;
    public o2 tmVwIGCQF4zR;
    public final q6 twy4zb2fCtqq;
    public ai2 uURZJOrwXbxn;
    public long uVlwi32qvXeJ;
    public wx uy1Qfkdvj4xZ;
    public final ty v6yxfmkxNKhL;
    public final r0 wLFCmsViZrNT;
    public final boolean wdg6QnbFHrFF;
    public final p81 wnqUPcAvl7HT;
    public final xw0 x50lh2ztY7Y5;
    public boolean xbgXKYA2cIfu;
    public final ob xfACYKDMU6Dj;
    public rr yQRudnv4La6p;
    public final e0 zf8DYfih6EZu;
    public static final c1 Companion = new c1();
    public static final p81 BUo4iHFctTZi = new p81();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(Context context, dp dpVar) {
        super(context);
        r0 r0Var;
        int i;
        r1 r1Var = this;
        r1Var.rtx2ld2ELZv4 = sj0.tmVwIGCQF4zR(dpVar);
        bf1.Companion.getClass();
        r1Var.OPXfSBeufaJ8 = 9205357640488583168L;
        int i2 = 1;
        r1Var.wdg6QnbFHrFF = true;
        r1Var.x50lh2ztY7Y5 = dpVar.XL4ISE6Oc65B;
        r1Var.QrzZRwfaDlRX = ih0.gPXPFXrUH4XX;
        r1Var.gPXPFXrUH4XX = new da();
        int i3 = 0;
        r1Var.BRwzKIf41E4i = new z0(r1Var, i3);
        r1Var.XL4ISE6Oc65B = new mj1(f2.lS5Rgt96tfkO(context), jx1.S9EYkSpbGuxq);
        r1Var.EcgxDIVH5in8 = new qa0(r1Var, r1Var);
        r1Var.S9EYkSpbGuxq = dpVar.lS5Rgt96tfkO.wdg6QnbFHrFF();
        r1Var.VhhvGxCb8gfr = new g3();
        r1Var.S2OOm9zPNm0h = new rz0();
        r1Var.ZbWwgt3aGe7A = sj0.tmVwIGCQF4zR(Boolean.FALSE);
        r1Var.pnx5pC0XzaCw = sj0.RfyTYNmI9Srp(new h1(r1Var, i3));
        r1Var.IAToe7bXGz4N = dpVar.EcgxDIVH5in8;
        r1Var.e6tOsSdd2EFb = dpVar.BRwzKIf41E4i;
        r1Var.jyegZNwi31qc = new xp0();
        int i4 = 3;
        vw0 vw0Var = new vw0(3);
        vw0Var.jJwa0q7P5wHq(ix1.TSizfFm2Yiuu);
        vw0Var.yQRudnv4La6p(r1Var.getDensity());
        vw0Var.PsecLrZVVK61(r1Var.getViewConfiguration());
        vw0Var.D0aTLcX6Uhyo(new p1(r1Var).TSizfFm2Yiuu(((qa0) r1Var.getFocusOwner()).e9gEMXR7LXtO).TSizfFm2Yiuu(r1Var.m16getDragAndDropManager().TSizfFm2Yiuu));
        r1Var.aF05bpZJlKEP = vw0Var;
        c81 c81Var = uq0.PxuCJdSBwIXG;
        r1Var.kpCQ9veP6n3I = new c81();
        r1Var.m17getLayoutNodes();
        r1Var.rZjpSjn4zoMv = new st1(r1Var);
        r1Var.BjEWd04qc7Mw = new g32(r1Var.getRoot(), new r50(), r1Var.m17getLayoutNodes());
        x1 x1Var = new x1(r1Var);
        r1Var.ozEBbv0hFTAB = x1Var;
        r1Var.tmVwIGCQF4zR = new o2(r1Var, new g1(0, r1Var, f2.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 0));
        r1Var.J54yh1s3n4Aq = dpVar.wdg6QnbFHrFF;
        r1Var.EpkonXwzFgDB = new v3(r1Var);
        r1Var.xfACYKDMU6Dj = new ob();
        r1Var.nLZGh9p8gVSu = new p81();
        r1Var.Pf0ThKz3j5YS = new y61();
        vw0 root = r1Var.getRoot();
        uj ujVar = new uj();
        ujVar.lS5Rgt96tfkO = root;
        ujVar.TSizfFm2Yiuu = new wj0(root.nLZGh9p8gVSu.TSizfFm2Yiuu);
        ujVar.Y1f8riQaR6yg = new i2(23, (byte) 0);
        ujVar.e9gEMXR7LXtO = new zj0();
        r1Var.gGoUzNp9JO5I = ujVar;
        r1Var.POWyO8hTM6YC = sj0.tmVwIGCQF4zR(new Configuration(context.getResources().getConfiguration()));
        r1Var.i68hK7ahKtgp = sj0.RfyTYNmI9Srp(new h1(r1Var, i2));
        r1Var.zf8DYfih6EZu = RAsUl2FVSrh6() ? new e0(r1Var, r1Var.getAutofillTree()) : null;
        if (RAsUl2FVSrh6()) {
            AutofillManager RAsUl2FVSrh6 = Nlhe969cAGO8.RAsUl2FVSrh6(context.getSystemService(Nlhe969cAGO8.x50lh2ztY7Y5()));
            if (RAsUl2FVSrh6 == null) {
                throw o0.a92UlCVFR9N8("Autofill service could not be located.");
            }
            r1Var = this;
            r0Var = new r0(new i2(21, RAsUl2FVSrh6), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            r0Var = null;
        }
        r1Var.wLFCmsViZrNT = r0Var;
        r1Var.nxJAScVArhE9 = dpVar.x50lh2ztY7Y5;
        r1Var.IXK6ba3ucyzm = dpVar.cpQdD2nAriOS;
        r1Var.JHNfcAUfKc4G = new hi1(new l1(r1Var, i2));
        r1Var.qudtW7lwm99e = new g51(r1Var.getRoot());
        r1Var.jJwa0q7P5wHq = 9223372034707292159L;
        r1Var.D0aTLcX6Uhyo = new int[]{0, 0};
        float[] PxuCJdSBwIXG = d51.PxuCJdSBwIXG();
        r1Var.PsecLrZVVK61 = PxuCJdSBwIXG;
        r1Var.JTxCbbCwomzt = d51.PxuCJdSBwIXG();
        r1Var.VzNxmvWisHL1 = d51.PxuCJdSBwIXG();
        r1Var.rxipThha848g = -1L;
        r1Var.uVlwi32qvXeJ = 9187343241974906880L;
        r1Var.fRTaYY6FBZcX = sj0.tmVwIGCQF4zR(null);
        r1Var.v6yxfmkxNKhL = sj0.RfyTYNmI9Srp(new h1(r1Var, i4));
        r1Var.iSxsmagYqzHM = new AtomicReference(null);
        r1Var.cJeY36nTk9tz = dpVar.r3s1LDPKFs1S;
        r1Var.hnJvRxDXo0hm = dpVar.QrzZRwfaDlRX;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = ka0.PxuCJdSBwIXG;
        cw0 cw0Var = cw0.rtx2ld2ELZv4;
        cw0 cw0Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : cw0.OPXfSBeufaJ8 : cw0Var;
        r1Var.JLGWdXyAxbxj = sj0.tmVwIGCQF4zR(cw0Var2 != null ? cw0Var2 : cw0Var);
        r1Var.GlTbNTgfSMqy = dpVar.gPXPFXrUH4XX;
        int i5 = 2;
        if (r1Var.isInTouchMode()) {
            rp0.Companion.getClass();
            i = 1;
        } else {
            rp0.Companion.getClass();
            i = 2;
        }
        r1Var.mFd1aGiJX24N = new tp0(i);
        o61 o61Var = new o61();
        new f91(new mc[16]);
        new f91(new th0[16]);
        new f91(new vw0[16]);
        new f91(new th0[16]);
        r1Var.HqMwxkFaipxD = o61Var;
        q6 q6Var = new q6();
        new fb0(new y4(i2, q6Var));
        r1Var.twy4zb2fCtqq = q6Var;
        r1Var.HGgCfDnf0ga9 = new cr1(10);
        r1Var.wnqUPcAvl7HT = new p81();
        r1Var.MBpAROcyNHKN = new o1(i3, r1Var);
        r1Var.EP3hG58ROvHh = new z0(r1Var, i2);
        r1Var.X1HMmH2Ks65g = new ic(context, new l1(r1Var, i3));
        r1Var.fkblLSN2bAgv = new h1(r1Var, i5);
        int i6 = Build.VERSION.SDK_INT;
        r1Var.Yadk4uqlxLy8 = i6 < 29 ? new nh(PxuCJdSBwIXG) : new oh();
        r1Var.addOnAttachStateChangeListener(r1Var.tmVwIGCQF4zR);
        r1Var.setWillNotDraw(false);
        r1Var.setFocusable(true);
        if (i6 >= 26) {
            e2.PxuCJdSBwIXG.PxuCJdSBwIXG(r1Var, 1, false);
        }
        r1Var.setFocusableInTouchMode(true);
        r1Var.setClipChildren(false);
        int i7 = rq2.PxuCJdSBwIXG;
        if (r1Var.getImportantForAccessibility() == 0) {
            r1Var.setImportantForAccessibility(1);
        }
        r1Var.setAccessibilityDelegate(x1Var.OPXfSBeufaJ8);
        rr2.Companion.getClass();
        r1Var.setOnDragListener(r1Var.m16getDragAndDropManager());
        r1Var.getRoot().Y1f8riQaR6yg(r1Var);
        if (i6 >= 29) {
            z1.PxuCJdSBwIXG.PxuCJdSBwIXG(r1Var);
        }
        if (BRwzKIf41E4i()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            r1Var.RfyTYNmI9Srp = view;
            r1Var.addView(view, -1);
        }
        r1Var.qYgDo2Ye5PY7 = i6 >= 31 ? new i2(28, (byte) 0) : null;
        r1Var.i6zQx8Kd7UPU = new m1(r1Var);
    }

    public static boolean BRwzKIf41E4i() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static void QrzZRwfaDlRX(vw0 vw0Var) {
        vw0Var.rZjpSjn4zoMv();
        f91 pnx5pC0XzaCw = vw0Var.pnx5pC0XzaCw();
        Object[] objArr = pnx5pC0XzaCw.rtx2ld2ELZv4;
        int i = pnx5pC0XzaCw.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            QrzZRwfaDlRX((vw0) objArr[i2]);
        }
    }

    public static boolean RAsUl2FVSrh6() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean XL4ISE6Oc65B(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !z61.PxuCJdSBwIXG.PxuCJdSBwIXG(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public static View dgRBjINgWbAK(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (cs0.wdg6QnbFHrFF(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View dgRBjINgWbAK = dgRBjINgWbAK(viewGroup.getChildAt(i2), i);
                    if (dgRBjINgWbAK != null) {
                        return dgRBjINgWbAK;
                    }
                }
            }
        }
        return null;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.pnx5pC0XzaCw.getValue()).booleanValue();
    }

    private final ci2 getLegacyTextInputServiceAndroid() {
        ci2 ci2Var = this.e4HgwifUDUCA;
        if (ci2Var != null) {
            return ci2Var;
        }
        ci2 ci2Var2 = new ci2(getView(), this);
        this.e4HgwifUDUCA = ci2Var2;
        return ci2Var2;
    }

    private final dp get_composeViewContext() {
        return (dp) this.rtx2ld2ELZv4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f1 get_viewTreeOwners() {
        o0.ZbWwgt3aGe7A(this.fRTaYY6FBZcX.getValue());
        return null;
    }

    public static void rtx2ld2ELZv4(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof r1) {
                ((r1) childAt).pnx5pC0XzaCw();
            } else if (childAt instanceof ViewGroup) {
                rtx2ld2ELZv4((ViewGroup) childAt);
            }
        }
    }

    private final void setAttached(boolean z) {
        this.ZbWwgt3aGe7A.setValue(Boolean.valueOf(z));
    }

    private void setDensity(hy hyVar) {
        this.XL4ISE6Oc65B.setValue(hyVar);
    }

    private void setFontFamilyResolver(ob0 ob0Var) {
        this.hnJvRxDXo0hm.setValue(ob0Var);
    }

    private void setLayoutDirection(cw0 cw0Var) {
        this.JLGWdXyAxbxj.setValue(cw0Var);
    }

    private final void set_composeViewContext(dp dpVar) {
        this.rtx2ld2ELZv4.setValue(dpVar);
    }

    private final void set_viewTreeOwners(f1 f1Var) {
        this.fRTaYY6FBZcX.setValue(f1Var);
    }

    public static long wdg6QnbFHrFF(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public final boolean BjEWd04qc7Mw() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final boolean EcgxDIVH5in8(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.OYiFbU3x63rc) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void EpkonXwzFgDB(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long VhhvGxCb8gfr = VhhvGxCb8gfr((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (VhhvGxCb8gfr >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (VhhvGxCb8gfr & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        op0 TSizfFm2Yiuu = this.Pf0ThKz3j5YS.TSizfFm2Yiuu(obtain, this);
        TSizfFm2Yiuu.getClass();
        this.gGoUzNp9JO5I.lS5Rgt96tfkO(TSizfFm2Yiuu, this, true);
        obtain.recycle();
    }

    public final void IAToe7bXGz4N(vw0 vw0Var) {
        x1 x1Var = this.ozEBbv0hFTAB;
        x1Var.rZjpSjn4zoMv = true;
        if (x1Var.r3s1LDPKFs1S()) {
            x1Var.QrzZRwfaDlRX(vw0Var);
        }
        o2 o2Var = this.tmVwIGCQF4zR;
        o2Var.r3s1LDPKFs1S = true;
        if (o2Var.e9gEMXR7LXtO()) {
            o2Var.QrzZRwfaDlRX.Y1f8riQaR6yg(no2.PxuCJdSBwIXG);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int J54yh1s3n4Aq(MotionEvent motionEvent) {
        Object obj;
        co1 co1Var;
        int lS5Rgt96tfkO;
        if (this.MDTGUQSX7PXD) {
            this.MDTGUQSX7PXD = false;
            rz0 rz0Var = getComposeViewContext().RfyTYNmI9Srp;
            int metaState = motionEvent.getMetaState();
            rz0Var.getClass();
            ks2.Companion.getClass();
            ks2.PxuCJdSBwIXG.setValue(new fo1(metaState));
        }
        y61 y61Var = this.Pf0ThKz3j5YS;
        op0 TSizfFm2Yiuu = y61Var.TSizfFm2Yiuu(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        uj ujVar = this.gGoUzNp9JO5I;
        if (TSizfFm2Yiuu == null) {
            if (!ujVar.PxuCJdSBwIXG) {
                ((p31) ((i2) ujVar.Y1f8riQaR6yg).OPXfSBeufaJ8).PxuCJdSBwIXG();
                ((wj0) ujVar.TSizfFm2Yiuu).TSizfFm2Yiuu();
            }
            return 0;
        }
        List list = (List) TSizfFm2Yiuu.OPXfSBeufaJ8;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((co1) obj).e9gEMXR7LXtO && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            co1Var = (co1) obj;
            if (co1Var != null) {
                this.OPXfSBeufaJ8 = co1Var.Y1f8riQaR6yg;
            }
            lS5Rgt96tfkO = ujVar.lS5Rgt96tfkO(TSizfFm2Yiuu, this, RfyTYNmI9Srp(motionEvent));
            TSizfFm2Yiuu.wdg6QnbFHrFF = null;
            if ((actionMasked == 0 && actionMasked != 5) || (lS5Rgt96tfkO & 1) != 0) {
                return lS5Rgt96tfkO;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            y61Var.TSizfFm2Yiuu.delete(pointerId);
            y61Var.lS5Rgt96tfkO.delete(pointerId);
            return lS5Rgt96tfkO;
        }
        obj = null;
        co1Var = (co1) obj;
        if (co1Var != null) {
        }
        lS5Rgt96tfkO = ujVar.lS5Rgt96tfkO(TSizfFm2Yiuu, this, RfyTYNmI9Srp(motionEvent));
        TSizfFm2Yiuu.wdg6QnbFHrFF = null;
        if (actionMasked == 0) {
        }
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        y61Var.TSizfFm2Yiuu.delete(pointerId2);
        y61Var.lS5Rgt96tfkO.delete(pointerId2);
        return lS5Rgt96tfkO;
    }

    @Override // defpackage.uw
    public final void OPXfSBeufaJ8(o01 o01Var) {
        di diVar;
        if (Build.VERSION.SDK_INT < 30) {
            Companion.getClass();
            setShowLayoutBounds(c1.PxuCJdSBwIXG());
        }
        u01 u01Var = this.r3s1LDPKFs1S;
        if (u01Var != null) {
            t01 t01Var = this.cpQdD2nAriOS;
            t01Var.getClass();
            i2 i2Var = u01Var.PxuCJdSBwIXG;
            j41 j41Var = (j41) i2Var.OPXfSBeufaJ8;
            if (!j41Var.rtx2ld2ELZv4 || j41Var.wdg6QnbFHrFF) {
                return;
            }
            try {
                diVar = ((bv2) t01Var).PxuCJdSBwIXG.RfyTYNmI9Srp(new y4(8, u01Var));
            } catch (CancellationException unused) {
                j41 j41Var2 = (j41) i2Var.OPXfSBeufaJ8;
                if (!j41Var2.OPXfSBeufaJ8) {
                    if (j41Var2.wdg6QnbFHrFF) {
                        hp1.PxuCJdSBwIXG("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    j41Var2.PxuCJdSBwIXG();
                    j41Var2.wdg6QnbFHrFF = true;
                }
                diVar = null;
            }
            di diVar2 = u01Var.Y1f8riQaR6yg;
            if (diVar2 != null) {
                diVar2.cancel();
            }
            u01Var.Y1f8riQaR6yg = diVar;
        }
    }

    public final boolean RfyTYNmI9Srp(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final void S2OOm9zPNm0h(boolean z) {
        h1 h1Var;
        g51 g51Var = this.qudtW7lwm99e;
        if (g51Var.lS5Rgt96tfkO.pnx5pC0XzaCw() || g51Var.e9gEMXR7LXtO.PxuCJdSBwIXG.wdg6QnbFHrFF != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    h1Var = this.fkblLSN2bAgv;
                } finally {
                    Trace.endSection();
                }
            } else {
                h1Var = null;
            }
            if (g51Var.x50lh2ztY7Y5(h1Var)) {
                requestLayout();
            }
            g51Var.lS5Rgt96tfkO(false);
            getRectManager().PxuCJdSBwIXG();
        }
    }

    public final void S9EYkSpbGuxq(float[] fArr) {
        kpCQ9veP6n3I();
        d51.e9gEMXR7LXtO(fArr, this.JTxCbbCwomzt);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.uVlwi32qvXeJ >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.uVlwi32qvXeJ & 4294967295L));
        float[] fArr2 = this.PsecLrZVVK61;
        d51.Y1f8riQaR6yg(fArr2);
        d51.a92UlCVFR9N8(fArr2, intBitsToFloat, intBitsToFloat2);
        f2.nLZGh9p8gVSu(fArr, fArr2);
    }

    @Override // defpackage.ma0
    public final void TSizfFm2Yiuu(ab0 ab0Var, ab0 ab0Var2) {
        kd1 kd1Var;
        boolean z;
        kd1 kd1Var2;
        boolean z2;
        if (ab0Var != null) {
            ab0 ab0Var3 = ab0Var;
            if (!ab0Var3.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
            }
            m61 m61Var = ab0Var3.rtx2ld2ELZv4;
            vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(ab0Var);
            w81 w81Var = null;
            ArrayList arrayList = null;
            while (zf8DYfih6EZu != null) {
                if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 2097152) != 0) {
                    while (m61Var != null) {
                        if ((m61Var.wdg6QnbFHrFF & 2097152) != 0) {
                            m61 m61Var2 = m61Var;
                            f91 f91Var = null;
                            while (m61Var2 != null) {
                                if (m61Var2 instanceof qo0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(m61Var2);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (m61Var2.wdg6QnbFHrFF & 2097152) != 0 && (m61Var2 instanceof ux)) {
                                    int i = 0;
                                    for (m61 m61Var3 = ((ux) m61Var2).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                        if ((m61Var3.wdg6QnbFHrFF & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                m61Var2 = m61Var3;
                                            } else {
                                                if (f91Var == null) {
                                                    f91Var = new f91(new m61[16]);
                                                }
                                                if (m61Var2 != null) {
                                                    f91Var.lS5Rgt96tfkO(m61Var2);
                                                    m61Var2 = null;
                                                }
                                                f91Var.lS5Rgt96tfkO(m61Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                m61Var2 = zv.dgRBjINgWbAK(f91Var);
                            }
                        }
                        m61Var = m61Var.x50lh2ztY7Y5;
                    }
                }
                zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                m61Var = (zf8DYfih6EZu == null || (kd1Var2 = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var2.e9gEMXR7LXtO;
            }
            if (arrayList == null) {
                return;
            }
            if (ab0Var2 != null) {
                if (!ab0Var2.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                }
                m61 m61Var4 = ab0Var2.rtx2ld2ELZv4;
                vw0 zf8DYfih6EZu2 = zv.zf8DYfih6EZu(ab0Var2);
                w81 w81Var2 = null;
                while (zf8DYfih6EZu2 != null) {
                    if ((zf8DYfih6EZu2.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 2097152) != 0) {
                        while (m61Var4 != null) {
                            if ((m61Var4.wdg6QnbFHrFF & 2097152) != 0) {
                                m61 m61Var5 = m61Var4;
                                f91 f91Var2 = null;
                                while (m61Var5 != null) {
                                    if (m61Var5 instanceof qo0) {
                                        if (w81Var2 == null) {
                                            w81 w81Var3 = d02.PxuCJdSBwIXG;
                                            w81Var2 = new w81();
                                        }
                                        w81Var2.PxuCJdSBwIXG(m61Var5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (m61Var5.wdg6QnbFHrFF & 2097152) != 0 && (m61Var5 instanceof ux)) {
                                        int i2 = 0;
                                        for (m61 m61Var6 = ((ux) m61Var5).S2OOm9zPNm0h; m61Var6 != null; m61Var6 = m61Var6.cpQdD2nAriOS) {
                                            if ((m61Var6.wdg6QnbFHrFF & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    m61Var5 = m61Var6;
                                                } else {
                                                    if (f91Var2 == null) {
                                                        f91Var2 = new f91(new m61[16]);
                                                    }
                                                    if (m61Var5 != null) {
                                                        f91Var2.lS5Rgt96tfkO(m61Var5);
                                                        m61Var5 = null;
                                                    }
                                                    f91Var2.lS5Rgt96tfkO(m61Var6);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    m61Var5 = zv.dgRBjINgWbAK(f91Var2);
                                }
                            }
                            m61Var4 = m61Var4.x50lh2ztY7Y5;
                        }
                    }
                    zf8DYfih6EZu2 = zf8DYfih6EZu2.S9EYkSpbGuxq();
                    m61Var4 = (zf8DYfih6EZu2 == null || (kd1Var = zf8DYfih6EZu2.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
                }
                w81Var = w81Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                qo0 qo0Var = (qo0) arrayList.get(i3);
                if (!(w81Var != null ? w81Var.TSizfFm2Yiuu(qo0Var) : false)) {
                    qo0Var.aF05bpZJlKEP();
                }
            }
        }
    }

    public final long VhhvGxCb8gfr(long j) {
        kpCQ9veP6n3I();
        long lS5Rgt96tfkO = d51.lS5Rgt96tfkO(j, this.JTxCbbCwomzt);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.uVlwi32qvXeJ >> 32)) + Float.intBitsToFloat((int) (lS5Rgt96tfkO >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.uVlwi32qvXeJ & 4294967295L)) + Float.intBitsToFloat((int) (lS5Rgt96tfkO & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final void ZbWwgt3aGe7A(vw0 vw0Var, long j) {
        g51 g51Var = this.qudtW7lwm99e;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            g51Var.cpQdD2nAriOS(vw0Var, j);
            if (!g51Var.lS5Rgt96tfkO.pnx5pC0XzaCw()) {
                g51Var.lS5Rgt96tfkO(false);
                getRectManager().PxuCJdSBwIXG();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void aF05bpZJlKEP() {
        x1 x1Var = this.ozEBbv0hFTAB;
        x1Var.rZjpSjn4zoMv = true;
        Handler handler = x1Var.dgRBjINgWbAK.getHandler();
        if (x1Var.r3s1LDPKFs1S() && !x1Var.gGoUzNp9JO5I && handler != null) {
            x1Var.gGoUzNp9JO5I = true;
            handler.post(x1Var.i68hK7ahKtgp);
        }
        o2 o2Var = this.tmVwIGCQF4zR;
        o2Var.r3s1LDPKFs1S = true;
        Handler handler2 = o2Var.rtx2ld2ELZv4.getHandler();
        if (!o2Var.e9gEMXR7LXtO() || o2Var.EcgxDIVH5in8 || handler2 == null) {
            return;
        }
        o2Var.EcgxDIVH5in8 = true;
        handler2.post(o2Var.S9EYkSpbGuxq);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ab0 ab0Var = ((qa0) getFocusOwner()).TSizfFm2Yiuu;
        if (!ab0Var.S9EYkSpbGuxq) {
            return;
        }
        if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitSubtreeIf called on an unattached node");
        }
        f91 f91Var = new f91(new m61[16]);
        m61 m61Var = ab0Var.rtx2ld2ELZv4;
        m61 m61Var2 = m61Var.cpQdD2nAriOS;
        if (m61Var2 == null) {
            zv.OPXfSBeufaJ8(f91Var, m61Var);
        } else {
            f91Var.lS5Rgt96tfkO(m61Var2);
        }
        while (true) {
            int i3 = f91Var.wdg6QnbFHrFF;
            if (i3 == 0) {
                return;
            }
            m61 m61Var3 = (m61) f91Var.dgRBjINgWbAK(i3 - 1);
            if ((m61Var3.dgRBjINgWbAK & 1024) != 0) {
                for (m61 m61Var4 = m61Var3; m61Var4 != null && m61Var4.S9EYkSpbGuxq; m61Var4 = m61Var4.cpQdD2nAriOS) {
                    if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                        m61 m61Var5 = m61Var4;
                        f91 f91Var2 = null;
                        while (m61Var5 != null) {
                            int i4 = 0;
                            if (m61Var5 instanceof ab0) {
                                ab0 ab0Var2 = (ab0) m61Var5;
                                if (ab0Var2.S9EYkSpbGuxq && ab0Var2.fkblLSN2bAgv().PxuCJdSBwIXG) {
                                    super.addFocusables(arrayList, i, i2);
                                    ab0 ab0Var3 = ((qa0) getFocusOwner()).TSizfFm2Yiuu;
                                    if (ab0Var3.S9EYkSpbGuxq) {
                                        if (!ab0Var3.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                                            ep0.lS5Rgt96tfkO("visitSubtreeIf called on an unattached node");
                                        }
                                        f91 f91Var3 = new f91(new m61[16]);
                                        m61 m61Var6 = ab0Var3.rtx2ld2ELZv4;
                                        m61 m61Var7 = m61Var6.cpQdD2nAriOS;
                                        if (m61Var7 == null) {
                                            zv.OPXfSBeufaJ8(f91Var3, m61Var6);
                                        } else {
                                            f91Var3.lS5Rgt96tfkO(m61Var7);
                                        }
                                        while (true) {
                                            int i5 = f91Var3.wdg6QnbFHrFF;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            m61 m61Var8 = (m61) f91Var3.dgRBjINgWbAK(i5 - 1);
                                            if ((m61Var8.dgRBjINgWbAK & 1024) != 0) {
                                                for (m61 m61Var9 = m61Var8; m61Var9 != null && m61Var9.S9EYkSpbGuxq; m61Var9 = m61Var9.cpQdD2nAriOS) {
                                                    if ((m61Var9.wdg6QnbFHrFF & 1024) != 0) {
                                                        m61 m61Var10 = m61Var9;
                                                        f91 f91Var4 = null;
                                                        while (m61Var10 != null) {
                                                            if (m61Var10 instanceof ab0) {
                                                                ab0 ab0Var4 = (ab0) m61Var10;
                                                                if (ab0Var4.S9EYkSpbGuxq) {
                                                                    ta0 fkblLSN2bAgv = ab0Var4.fkblLSN2bAgv();
                                                                    if (ab0Var4.S9EYkSpbGuxq && fkblLSN2bAgv.PxuCJdSBwIXG) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((m61Var10.wdg6QnbFHrFF & 1024) != 0 && (m61Var10 instanceof ux)) {
                                                                int i6 = 0;
                                                                for (m61 m61Var11 = ((ux) m61Var10).S2OOm9zPNm0h; m61Var11 != null; m61Var11 = m61Var11.cpQdD2nAriOS) {
                                                                    if ((m61Var11.wdg6QnbFHrFF & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            m61Var10 = m61Var11;
                                                                        } else {
                                                                            if (f91Var4 == null) {
                                                                                f91Var4 = new f91(new m61[16]);
                                                                            }
                                                                            if (m61Var10 != null) {
                                                                                f91Var4.lS5Rgt96tfkO(m61Var10);
                                                                                m61Var10 = null;
                                                                            }
                                                                            f91Var4.lS5Rgt96tfkO(m61Var11);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            m61Var10 = zv.dgRBjINgWbAK(f91Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            zv.OPXfSBeufaJ8(f91Var3, m61Var8);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((m61Var5.wdg6QnbFHrFF & 1024) != 0 && (m61Var5 instanceof ux)) {
                                for (m61 m61Var12 = ((ux) m61Var5).S2OOm9zPNm0h; m61Var12 != null; m61Var12 = m61Var12.cpQdD2nAriOS) {
                                    if ((m61Var12.wdg6QnbFHrFF & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            m61Var5 = m61Var12;
                                        } else {
                                            if (f91Var2 == null) {
                                                f91Var2 = new f91(new m61[16]);
                                            }
                                            if (m61Var5 != null) {
                                                f91Var2.lS5Rgt96tfkO(m61Var5);
                                                m61Var5 = null;
                                            }
                                            f91Var2.lS5Rgt96tfkO(m61Var12);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            m61Var5 = zv.dgRBjINgWbAK(f91Var2);
                        }
                    }
                }
            }
            zv.OPXfSBeufaJ8(f91Var, m61Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public final void amuv7NJvPxHu(float f) {
        if (BRwzKIf41E4i()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.KZw9XyiywG4x) || f > this.KZw9XyiywG4x) {
                    this.KZw9XyiywG4x = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.Y2PHjkwWz56c) || f < this.Y2PHjkwWz56c) {
                    this.Y2PHjkwWz56c = f;
                }
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        z22 S2OOm9zPNm0h;
        le0 le0Var;
        le0 le0Var2;
        CharSequence textValue2;
        if (RAsUl2FVSrh6()) {
            r0 r0Var = this.wLFCmsViZrNT;
            if (r0Var != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    AutofillValue rtx2ld2ELZv4 = Nlhe969cAGO8.rtx2ld2ELZv4(sparseArray.get(keyAt));
                    vw0 vw0Var = (vw0) r0Var.OPXfSBeufaJ8.TSizfFm2Yiuu.lS5Rgt96tfkO(keyAt);
                    if (vw0Var != null && (S2OOm9zPNm0h = vw0Var.S2OOm9zPNm0h()) != null) {
                        v81 v81Var = S2OOm9zPNm0h.rtx2ld2ELZv4;
                        Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(y22.RAsUl2FVSrh6);
                        if (RAsUl2FVSrh6 == null) {
                            RAsUl2FVSrh6 = null;
                        }
                        nxJAScVArhE9 nxjascvarhe9 = (nxJAScVArhE9) RAsUl2FVSrh6;
                        if (nxjascvarhe9 != null && (le0Var2 = (le0) nxjascvarhe9.lS5Rgt96tfkO) != null) {
                            textValue2 = rtx2ld2ELZv4.getTextValue();
                        }
                        Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(y22.rtx2ld2ELZv4);
                        nxJAScVArhE9 nxjascvarhe92 = (nxJAScVArhE9) (RAsUl2FVSrh62 != null ? RAsUl2FVSrh62 : null);
                        if (nxjascvarhe92 != null && (le0Var = (le0) nxjascvarhe92.lS5Rgt96tfkO) != null) {
                        }
                    }
                }
            }
            e0 e0Var = this.zf8DYfih6EZu;
            if (e0Var != null) {
                ob obVar = (ob) e0Var.wdg6QnbFHrFF;
                if (obVar.PxuCJdSBwIXG.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int keyAt2 = sparseArray.keyAt(i2);
                    AutofillValue rtx2ld2ELZv42 = Nlhe969cAGO8.rtx2ld2ELZv4(sparseArray.get(keyAt2));
                    isText = rtx2ld2ELZv42.isText();
                    if (isText) {
                        textValue = rtx2ld2ELZv42.getTextValue();
                        textValue.toString();
                        if (obVar.PxuCJdSBwIXG.get(Integer.valueOf(keyAt2)) != null) {
                            u9.VhhvGxCb8gfr();
                            return;
                        }
                    } else {
                        isDate = rtx2ld2ELZv42.isDate();
                        if (isDate) {
                            throw new ce1("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        isList = rtx2ld2ELZv42.isList();
                        if (isList) {
                            throw new ce1("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        isToggle = rtx2ld2ELZv42.isToggle();
                        if (isToggle) {
                            throw new ce1("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.ozEBbv0hFTAB.e9gEMXR7LXtO(false, i, this.OPXfSBeufaJ8);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.ozEBbv0hFTAB.e9gEMXR7LXtO(true, i, this.OPXfSBeufaJ8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p81 p81Var = this.nLZGh9p8gVSu;
        if (!isAttachedToWindow()) {
            QrzZRwfaDlRX(getRoot());
        }
        S2OOm9zPNm0h(true);
        j72.Companion.getClass();
        s72.OPXfSBeufaJ8().cpQdD2nAriOS();
        this.amuv7NJvPxHu = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            ki kiVar = this.IAToe7bXGz4N;
            t0 t0Var = kiVar.PxuCJdSBwIXG;
            Canvas canvas2 = t0Var.PxuCJdSBwIXG;
            t0Var.PxuCJdSBwIXG = canvas;
            getRoot().OPXfSBeufaJ8(t0Var, null);
            kiVar.PxuCJdSBwIXG.PxuCJdSBwIXG = canvas2;
            if (p81Var.OPXfSBeufaJ8()) {
                int i = p81Var.lS5Rgt96tfkO;
                for (int i2 = 0; i2 < i; i2++) {
                    ((uh0) ((ci1) p81Var.a92UlCVFR9N8(i2))).RAsUl2FVSrh6();
                }
            }
            ar2.Companion.getClass();
            p81Var.Y1f8riQaR6yg();
            this.amuv7NJvPxHu = false;
            Trace.endSection();
            p81 p81Var2 = this.ryVscX7ZL4Ux;
            if (p81Var2 != null) {
                p81Var.lS5Rgt96tfkO(p81Var2);
                p81Var2.Y1f8riQaR6yg();
            }
            if (BRwzKIf41E4i()) {
                h9.PxuCJdSBwIXG(this, this.KZw9XyiywG4x);
                View view = this.RfyTYNmI9Srp;
                if (view != null) {
                    h9.PxuCJdSBwIXG(view, this.Y2PHjkwWz56c);
                    if (!Float.isNaN(this.Y2PHjkwWz56c)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.KZw9XyiywG4x = Float.NaN;
                this.Y2PHjkwWz56c = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0812  */
    /* JADX WARN: Type inference failed for: r0v12, types: [m61] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18, types: [gd2] */
    /* JADX WARN: Type inference failed for: r0v33, types: [m61] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v41, types: [gd2] */
    /* JADX WARN: Type inference failed for: r2v46, types: [m61] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v51, types: [gd2] */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v82, types: [gd2] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [qo0, tx] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [m61] */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v32, types: [f91] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [f91] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [qo0, tx] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53, types: [m61] */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, m61] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [m61] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v65, types: [f91] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69, types: [f91] */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [f91] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [f91] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, m61] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39, types: [m61] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [f91] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [f91] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Throwable th;
        int i;
        String str;
        int i2;
        x3 x3Var;
        String str2;
        long j;
        do0 do0Var;
        long j2;
        long j3;
        int i3;
        char c;
        int i4;
        long j4;
        m61 m61Var;
        kd1 kd1Var;
        boolean z;
        ux uxVar;
        kd1 kd1Var2;
        Object dgRBjINgWbAK;
        m61 m61Var2;
        boolean z2;
        int size;
        int size2;
        kd1 kd1Var3;
        boolean z3;
        ux uxVar2;
        kd1 kd1Var4;
        Object dgRBjINgWbAK2;
        boolean z4;
        e1 e1Var;
        int size3;
        kd1 kd1Var5;
        boolean z5;
        m61 m61Var3;
        kd1 kd1Var6;
        if (this.W7ceZOzvrRuI) {
            z0 z0Var = this.EP3hG58ROvHh;
            removeCallbacks(z0Var);
            if (motionEvent.getActionMasked() == 8) {
                this.W7ceZOzvrRuI = false;
            } else {
                z0Var.run();
            }
        }
        if (XL4ISE6Oc65B(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int i5 = -1;
        int i6 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (r3s1LDPKFs1S(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            Context context = getContext();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                Method method = wq2.PxuCJdSBwIXG;
                vl.RAsUl2FVSrh6(viewConfiguration);
            } else {
                wq2.PxuCJdSBwIXG(viewConfiguration, context);
            }
            Context context2 = getContext();
            if (i7 >= 26) {
                vl.a92UlCVFR9N8(viewConfiguration);
            } else {
                wq2.PxuCJdSBwIXG(viewConfiguration, context2);
            }
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            qa0 qa0Var = (qa0) getFocusOwner();
            if (qa0Var.Y1f8riQaR6yg.e9gEMXR7LXtO) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            ab0 BRwzKIf41E4i = zv.BRwzKIf41E4i(qa0Var.TSizfFm2Yiuu);
            if (BRwzKIf41E4i != null) {
                if (!BRwzKIf41E4i.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                }
                m61 m61Var4 = BRwzKIf41E4i.rtx2ld2ELZv4;
                vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(BRwzKIf41E4i);
                loop0: while (true) {
                    if (zf8DYfih6EZu == null) {
                        m61Var3 = null;
                        break;
                    }
                    if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 16384) != 0) {
                        while (m61Var4 != null) {
                            if ((m61Var4.wdg6QnbFHrFF & 16384) != 0) {
                                m61Var3 = m61Var4;
                                f91 f91Var = null;
                                while (m61Var3 != null) {
                                    if (m61Var3 instanceof e1) {
                                        break loop0;
                                    }
                                    if ((m61Var3.wdg6QnbFHrFF & 16384) != 0 && (m61Var3 instanceof ux)) {
                                        int i8 = 0;
                                        for (m61 m61Var5 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var5 != null; m61Var5 = m61Var5.cpQdD2nAriOS) {
                                            if ((m61Var5.wdg6QnbFHrFF & 16384) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    m61Var3 = m61Var5;
                                                } else {
                                                    if (f91Var == null) {
                                                        f91Var = new f91(new m61[16]);
                                                    }
                                                    if (m61Var3 != null) {
                                                        f91Var.lS5Rgt96tfkO(m61Var3);
                                                        m61Var3 = null;
                                                    }
                                                    f91Var.lS5Rgt96tfkO(m61Var5);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    m61Var3 = zv.dgRBjINgWbAK(f91Var);
                                }
                            }
                            m61Var4 = m61Var4.x50lh2ztY7Y5;
                        }
                    }
                    zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                    m61Var4 = (zf8DYfih6EZu == null || (kd1Var6 = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var6.e9gEMXR7LXtO;
                }
                e1Var = (e1) m61Var3;
            } else {
                e1Var = null;
            }
            if (e1Var != null) {
                if (!e1Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                }
                m61 m61Var6 = e1Var.rtx2ld2ELZv4.x50lh2ztY7Y5;
                vw0 zf8DYfih6EZu2 = zv.zf8DYfih6EZu(e1Var);
                ArrayList arrayList = null;
                while (zf8DYfih6EZu2 != null) {
                    if ((zf8DYfih6EZu2.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 16384) != 0) {
                        while (m61Var6 != null) {
                            if ((m61Var6.wdg6QnbFHrFF & 16384) != 0) {
                                m61 m61Var7 = m61Var6;
                                f91 f91Var2 = null;
                                while (m61Var7 != null) {
                                    if (m61Var7 instanceof e1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(m61Var7);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (m61Var7.wdg6QnbFHrFF & 16384) != 0 && (m61Var7 instanceof ux)) {
                                        int i9 = 0;
                                        for (m61 m61Var8 = ((ux) m61Var7).S2OOm9zPNm0h; m61Var8 != null; m61Var8 = m61Var8.cpQdD2nAriOS) {
                                            if ((m61Var8.wdg6QnbFHrFF & 16384) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    m61Var7 = m61Var8;
                                                } else {
                                                    if (f91Var2 == null) {
                                                        f91Var2 = new f91(new m61[16]);
                                                    }
                                                    if (m61Var7 != null) {
                                                        f91Var2.lS5Rgt96tfkO(m61Var7);
                                                        m61Var7 = null;
                                                    }
                                                    f91Var2.lS5Rgt96tfkO(m61Var8);
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                    m61Var7 = zv.dgRBjINgWbAK(f91Var2);
                                }
                            }
                            m61Var6 = m61Var6.x50lh2ztY7Y5;
                        }
                    }
                    zf8DYfih6EZu2 = zf8DYfih6EZu2.S9EYkSpbGuxq();
                    m61Var6 = (zf8DYfih6EZu2 == null || (kd1Var5 = zf8DYfih6EZu2.nLZGh9p8gVSu) == null) ? null : kd1Var5.e9gEMXR7LXtO;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i10 = size3 - 1;
                        ((e1) arrayList.get(size3)).getClass();
                        if (i10 < 0) {
                            break;
                        }
                        size3 = i10;
                    }
                }
                m61 m61Var9 = e1Var.rtx2ld2ELZv4;
                f91 f91Var3 = null;
                while (m61Var9 != null) {
                    if (!(m61Var9 instanceof e1) && (m61Var9.wdg6QnbFHrFF & 16384) != 0 && (m61Var9 instanceof ux)) {
                        int i11 = 0;
                        for (m61 m61Var10 = ((ux) m61Var9).S2OOm9zPNm0h; m61Var10 != null; m61Var10 = m61Var10.cpQdD2nAriOS) {
                            if ((m61Var10.wdg6QnbFHrFF & 16384) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    m61Var9 = m61Var10;
                                } else {
                                    if (f91Var3 == null) {
                                        f91Var3 = new f91(new m61[16]);
                                    }
                                    if (m61Var9 != null) {
                                        f91Var3.lS5Rgt96tfkO(m61Var9);
                                        m61Var9 = null;
                                    }
                                    f91Var3.lS5Rgt96tfkO(m61Var10);
                                }
                            }
                        }
                        if (i11 == 1) {
                        }
                    }
                    m61Var9 = zv.dgRBjINgWbAK(f91Var3);
                }
                if (!super.dispatchGenericMotionEvent(motionEvent)) {
                    m61 m61Var11 = e1Var.rtx2ld2ELZv4;
                    f91 f91Var4 = null;
                    while (m61Var11 != null) {
                        if (!(m61Var11 instanceof e1) && (m61Var11.wdg6QnbFHrFF & 16384) != 0 && (m61Var11 instanceof ux)) {
                            int i12 = 0;
                            for (m61 m61Var12 = ((ux) m61Var11).S2OOm9zPNm0h; m61Var12 != null; m61Var12 = m61Var12.cpQdD2nAriOS) {
                                if ((m61Var12.wdg6QnbFHrFF & 16384) != 0) {
                                    i12++;
                                    if (i12 == 1) {
                                        m61Var11 = m61Var12;
                                    } else {
                                        if (f91Var4 == null) {
                                            f91Var4 = new f91(new m61[16]);
                                        }
                                        if (m61Var11 != null) {
                                            f91Var4.lS5Rgt96tfkO(m61Var11);
                                            m61Var11 = null;
                                        }
                                        f91Var4.lS5Rgt96tfkO(m61Var12);
                                    }
                                }
                            }
                            if (i12 == 1) {
                            }
                        }
                        m61Var11 = zv.dgRBjINgWbAK(f91Var4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            ((e1) arrayList.get(i13)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        do0 do0Var2 = this.dgRBjINgWbAK;
        y61 y61Var = this.Pf0ThKz3j5YS;
        p31 p31Var = y61Var.e9gEMXR7LXtO;
        SparseLongArray sparseLongArray = y61Var.lS5Rgt96tfkO;
        int actionMasked = motionEvent.getActionMasked();
        y61Var.lS5Rgt96tfkO(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            y61Var.TSizfFm2Yiuu.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            x3Var = null;
            th = null;
        } else {
            y61Var.PxuCJdSBwIXG(motionEvent);
            if (actionMasked != 1) {
                if (actionMasked == 6) {
                    i5 = motionEvent.getActionIndex();
                }
                th = null;
            } else {
                th = null;
                i5 = 0;
            }
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i14 = 0;
            while (i14 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i14);
                int i15 = i6;
                int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (indexOfKey >= 0) {
                    str2 = str3;
                    j = sparseLongArray.valueAt(indexOfKey);
                    do0Var = do0Var2;
                } else {
                    str2 = str3;
                    j = y61Var.PxuCJdSBwIXG;
                    do0Var = do0Var2;
                    y61Var.PxuCJdSBwIXG = j + 1;
                    sparseLongArray.put(pointerId, j);
                }
                y61 y61Var2 = y61Var;
                long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX(i14)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i14)) & 4294967295L);
                ?? r33 = i14 != i5 ? i15 : 0;
                x61 x61Var = (x61) p31Var.lS5Rgt96tfkO(j);
                if (i14 == i5) {
                    p31Var.e9gEMXR7LXtO(j);
                    j2 = j;
                    j3 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z6) {
                        long eventTime = 1 | ((motionEvent.getEventTime() & 2147483647L) << i15);
                        j3 = 2147483647L;
                        short intBitsToFloat = (short) Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                        i3 = 65535;
                        short intBitsToFloat2 = (short) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                        x61.Companion.getClass();
                        x61 x61Var2 = new x61(eventTime | (((intBitsToFloat2 & 65535) | (intBitsToFloat << 16)) << 32));
                        j2 = j;
                        p31Var.Y1f8riQaR6yg(j2, x61Var2);
                    } else {
                        j2 = j;
                        j3 = 2147483647L;
                        i3 = 65535;
                    }
                    c = ' ';
                }
                long eventTime2 = motionEvent.getEventTime();
                float pressure = motionEvent.getPressure(i14);
                int i16 = i3;
                int i17 = i5;
                long eventTime3 = x61Var != null ? (x61Var.PxuCJdSBwIXG >> i15) & j3 : motionEvent.getEventTime();
                if (x61Var != null) {
                    int i18 = (int) (x61Var.PxuCJdSBwIXG >>> c);
                    x61.Companion.getClass();
                    float f = (short) (i18 >>> 16);
                    i4 = i17;
                    j4 = (Float.floatToRawIntBits((short) (i18 & i16)) & 4294967295L) | (Float.floatToRawIntBits(f) << c);
                } else {
                    i4 = i17;
                    j4 = floatToRawIntBits;
                }
                arrayList2.add(new go0(j2, eventTime2, floatToRawIntBits, r33, pressure, eventTime3, j4, x61Var != null ? (x61Var.PxuCJdSBwIXG & 1) != 0 ? i15 : 0 : 0));
                i14++;
                y61Var = y61Var2;
                i6 = i15;
                str3 = str2;
                do0Var2 = do0Var;
                i5 = i4;
            }
            do0 do0Var3 = do0Var2;
            str = str3;
            int i19 = i6;
            y61Var.e9gEMXR7LXtO(motionEvent);
            if (do0Var3 != null) {
                i2 = do0Var3.PxuCJdSBwIXG;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    u9.XL4ISE6Oc65B("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i19);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 != null && motionRange == null) {
                            do0.Companion.getClass();
                        } else if (motionRange != null && motionRange2 != null) {
                            float range = motionRange.getRange();
                            float range2 = motionRange2.getRange();
                            if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                                do0.Companion.getClass();
                            } else if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                                do0.Companion.getClass();
                            }
                        }
                        i2 = 2;
                    } else {
                        do0.Companion.getClass();
                    }
                    i2 = 1;
                }
                do0.Companion.getClass();
                i2 = 0;
            }
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        fo0.Companion.getClass();
                    } else if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            fo0.Companion.getClass();
                        }
                    }
                    x3Var = new x3();
                    x3Var.lS5Rgt96tfkO = arrayList2;
                    x3Var.PxuCJdSBwIXG = i2;
                    x3Var.TSizfFm2Yiuu = motionEvent;
                    if (arrayList2.isEmpty()) {
                        u9.XL4ISE6Oc65B("changes cannot be empty");
                        throw th;
                    }
                }
                fo0.Companion.getClass();
                x3Var = new x3();
                x3Var.lS5Rgt96tfkO = arrayList2;
                x3Var.PxuCJdSBwIXG = i2;
                x3Var.TSizfFm2Yiuu = motionEvent;
                if (arrayList2.isEmpty()) {
                }
            }
            fo0.Companion.getClass();
            x3Var = new x3();
            x3Var.lS5Rgt96tfkO = arrayList2;
            x3Var.PxuCJdSBwIXG = i2;
            x3Var.TSizfFm2Yiuu = motionEvent;
            if (arrayList2.isEmpty()) {
            }
        }
        ic icVar = this.X1HMmH2Ks65g;
        if (x3Var == null) {
            ab0 a92UlCVFR9N8 = ((qa0) getFocusOwner()).a92UlCVFR9N8();
            if (a92UlCVFR9N8 != null) {
                if (!a92UlCVFR9N8.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO(str);
                }
                ?? r2 = a92UlCVFR9N8.rtx2ld2ELZv4;
                vw0 zf8DYfih6EZu3 = zv.zf8DYfih6EZu(a92UlCVFR9N8);
                loop26: while (true) {
                    if (zf8DYfih6EZu3 == null) {
                        uxVar = th;
                        break;
                    }
                    int i20 = 2097152;
                    if ((zf8DYfih6EZu3.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 2097152) != 0) {
                        for (m61 m61Var13 = r2; m61Var13 != null; m61Var13 = m61Var13.x50lh2ztY7Y5) {
                            if ((m61Var13.wdg6QnbFHrFF & i20) != 0) {
                                uxVar = m61Var13;
                                Throwable th2 = th;
                                while (uxVar != 0) {
                                    if (uxVar instanceof qo0) {
                                        break loop26;
                                    }
                                    ?? r4 = th2;
                                    if ((uxVar.wdg6QnbFHrFF & i20) != 0) {
                                        r4 = th2;
                                        if (uxVar instanceof ux) {
                                            m61 m61Var14 = uxVar.S2OOm9zPNm0h;
                                            int i21 = 0;
                                            dgRBjINgWbAK = uxVar;
                                            r4 = th2;
                                            while (m61Var14 != null) {
                                                if ((m61Var14.wdg6QnbFHrFF & i20) != 0) {
                                                    i21++;
                                                    r4 = r4;
                                                    if (i21 == 1) {
                                                        dgRBjINgWbAK = m61Var14;
                                                    } else {
                                                        if (r4 == 0) {
                                                            r4 = new f91(new m61[16]);
                                                        }
                                                        if (dgRBjINgWbAK != null) {
                                                            r4.lS5Rgt96tfkO(dgRBjINgWbAK);
                                                            dgRBjINgWbAK = th;
                                                        }
                                                        r4.lS5Rgt96tfkO(m61Var14);
                                                    }
                                                }
                                                m61Var14 = m61Var14.cpQdD2nAriOS;
                                                i20 = 2097152;
                                                dgRBjINgWbAK = dgRBjINgWbAK;
                                                r4 = r4;
                                            }
                                            r4 = r4;
                                            if (i21 == 1) {
                                                i20 = 2097152;
                                                uxVar = dgRBjINgWbAK;
                                                th2 = r4;
                                            }
                                        }
                                    }
                                    dgRBjINgWbAK = zv.dgRBjINgWbAK(r4);
                                    i20 = 2097152;
                                    uxVar = dgRBjINgWbAK;
                                    th2 = r4;
                                }
                            }
                            i20 = 2097152;
                        }
                    }
                    zf8DYfih6EZu3 = zf8DYfih6EZu3.S9EYkSpbGuxq();
                    r2 = (zf8DYfih6EZu3 == null || (kd1Var2 = zf8DYfih6EZu3.nLZGh9p8gVSu) == null) ? th : kd1Var2.e9gEMXR7LXtO;
                }
                m61Var = (qo0) uxVar;
            } else {
                m61Var = th;
            }
            if (m61Var != 0) {
                m61 m61Var15 = m61Var;
                if (!m61Var15.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO(str);
                }
                ?? r0 = m61Var15.rtx2ld2ELZv4.x50lh2ztY7Y5;
                vw0 zf8DYfih6EZu4 = zv.zf8DYfih6EZu(m61Var);
                ?? r42 = th;
                while (zf8DYfih6EZu4 != null) {
                    int i22 = 2097152;
                    m61 m61Var16 = r0;
                    r42 = r42;
                    if ((zf8DYfih6EZu4.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 2097152) != 0) {
                        while (m61Var16 != null) {
                            if ((m61Var16.wdg6QnbFHrFF & i22) != 0) {
                                ux uxVar3 = m61Var16;
                                ?? r6 = th;
                                while (uxVar3 != 0) {
                                    ArrayList arrayList3 = r42;
                                    if (uxVar3 instanceof qo0) {
                                        if (r42 == 0) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(uxVar3);
                                        z = false;
                                        r42 = arrayList3;
                                    } else {
                                        z = true;
                                        r42 = r42;
                                    }
                                    if (z) {
                                        if ((uxVar3.wdg6QnbFHrFF & 2097152) != 0 && (uxVar3 instanceof ux)) {
                                            m61 m61Var17 = uxVar3.S2OOm9zPNm0h;
                                            int i23 = 0;
                                            uxVar3 = uxVar3;
                                            r6 = r6;
                                            while (m61Var17 != null) {
                                                uxVar3 = uxVar3;
                                                if ((m61Var17.wdg6QnbFHrFF & 2097152) != 0) {
                                                    i23++;
                                                    if (i23 == 1) {
                                                        uxVar3 = m61Var17;
                                                    } else {
                                                        r6 = r6 == 0 ? new f91(new m61[16]) : r6;
                                                        if (uxVar3 != 0) {
                                                            r6.lS5Rgt96tfkO(uxVar3);
                                                            uxVar3 = th;
                                                        }
                                                        r6.lS5Rgt96tfkO(m61Var17);
                                                        m61Var17 = m61Var17.cpQdD2nAriOS;
                                                        uxVar3 = uxVar3;
                                                        r6 = r6;
                                                    }
                                                }
                                                m61Var17 = m61Var17.cpQdD2nAriOS;
                                                uxVar3 = uxVar3;
                                                r6 = r6;
                                            }
                                            if (i23 == 1) {
                                            }
                                        }
                                    }
                                    uxVar3 = zv.dgRBjINgWbAK(r6);
                                }
                            }
                            i22 = 2097152;
                            m61Var16 = m61Var16.x50lh2ztY7Y5;
                            r42 = r42;
                        }
                    }
                    zf8DYfih6EZu4 = zf8DYfih6EZu4.S9EYkSpbGuxq();
                    r0 = (zf8DYfih6EZu4 == null || (kd1Var = zf8DYfih6EZu4.nLZGh9p8gVSu) == null) ? th : kd1Var.e9gEMXR7LXtO;
                }
                m61Var.aF05bpZJlKEP();
                if (r42 != 0) {
                    int size5 = r42.size();
                    for (int i24 = 0; i24 < size5; i24++) {
                        ((qo0) r42.get(i24)).aF05bpZJlKEP();
                    }
                }
            }
            icVar.getClass();
            do0.Companion.getClass();
            icVar.lS5Rgt96tfkO = 0;
            icVar.TSizfFm2Yiuu = true;
            return true;
        }
        qa0 qa0Var2 = (qa0) getFocusOwner();
        if (qa0Var2.Y1f8riQaR6yg.e9gEMXR7LXtO) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            ab0 a92UlCVFR9N82 = qa0Var2.a92UlCVFR9N8();
            if (a92UlCVFR9N82 != null) {
                if (!a92UlCVFR9N82.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO(str);
                }
                m61 m61Var18 = a92UlCVFR9N82.rtx2ld2ELZv4;
                vw0 zf8DYfih6EZu5 = zv.zf8DYfih6EZu(a92UlCVFR9N82);
                m61 m61Var19 = m61Var18;
                loop14: while (true) {
                    if (zf8DYfih6EZu5 == null) {
                        uxVar2 = th;
                        break;
                    }
                    int i25 = 2097152;
                    if ((zf8DYfih6EZu5.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 2097152) != 0) {
                        for (m61 m61Var20 = m61Var19; m61Var20 != null; m61Var20 = m61Var20.x50lh2ztY7Y5) {
                            if ((m61Var20.wdg6QnbFHrFF & i25) != 0) {
                                uxVar2 = m61Var20;
                                Throwable th3 = th;
                                while (uxVar2 != 0) {
                                    if (uxVar2 instanceof qo0) {
                                        break loop14;
                                    }
                                    ?? r5 = th3;
                                    if ((uxVar2.wdg6QnbFHrFF & i25) != 0) {
                                        r5 = th3;
                                        if (uxVar2 instanceof ux) {
                                            m61 m61Var21 = uxVar2.S2OOm9zPNm0h;
                                            int i26 = 0;
                                            dgRBjINgWbAK2 = uxVar2;
                                            r5 = th3;
                                            while (m61Var21 != null) {
                                                if ((m61Var21.wdg6QnbFHrFF & i25) != 0) {
                                                    i26++;
                                                    r5 = r5;
                                                    if (i26 == 1) {
                                                        dgRBjINgWbAK2 = m61Var21;
                                                    } else {
                                                        if (r5 == 0) {
                                                            r5 = new f91(new m61[i]);
                                                        }
                                                        if (dgRBjINgWbAK2 != null) {
                                                            r5.lS5Rgt96tfkO(dgRBjINgWbAK2);
                                                            dgRBjINgWbAK2 = th;
                                                        }
                                                        r5.lS5Rgt96tfkO(m61Var21);
                                                    }
                                                }
                                                m61Var21 = m61Var21.cpQdD2nAriOS;
                                                i = 16;
                                                i25 = 2097152;
                                                dgRBjINgWbAK2 = dgRBjINgWbAK2;
                                                r5 = r5;
                                            }
                                            r5 = r5;
                                            if (i26 == 1) {
                                                i = 16;
                                                i25 = 2097152;
                                                uxVar2 = dgRBjINgWbAK2;
                                                th3 = r5;
                                            }
                                        }
                                    }
                                    dgRBjINgWbAK2 = zv.dgRBjINgWbAK(r5);
                                    i = 16;
                                    i25 = 2097152;
                                    uxVar2 = dgRBjINgWbAK2;
                                    th3 = r5;
                                }
                            }
                            i = 16;
                            i25 = 2097152;
                        }
                    }
                    zf8DYfih6EZu5 = zf8DYfih6EZu5.S9EYkSpbGuxq();
                    i = 16;
                    m61Var19 = (zf8DYfih6EZu5 == null || (kd1Var4 = zf8DYfih6EZu5.nLZGh9p8gVSu) == null) ? th : kd1Var4.e9gEMXR7LXtO;
                }
                m61Var2 = (qo0) uxVar2;
            } else {
                m61Var2 = th;
            }
            if (m61Var2 != 0) {
                m61 m61Var22 = m61Var2;
                if (!m61Var22.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO(str);
                }
                ?? r02 = m61Var22.rtx2ld2ELZv4.x50lh2ztY7Y5;
                vw0 zf8DYfih6EZu6 = zv.zf8DYfih6EZu(m61Var2);
                ?? r52 = th;
                while (zf8DYfih6EZu6 != null) {
                    int i27 = 2097152;
                    m61 m61Var23 = r02;
                    r52 = r52;
                    if ((zf8DYfih6EZu6.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 2097152) != 0) {
                        while (m61Var23 != null) {
                            if ((m61Var23.wdg6QnbFHrFF & i27) != 0) {
                                ux uxVar4 = m61Var23;
                                ?? r7 = th;
                                while (uxVar4 != 0) {
                                    ArrayList arrayList4 = r52;
                                    if (uxVar4 instanceof qo0) {
                                        if (r52 == 0) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(uxVar4);
                                        z3 = false;
                                        r52 = arrayList4;
                                    } else {
                                        z3 = true;
                                        r52 = r52;
                                    }
                                    if (z3) {
                                        int i28 = 2097152;
                                        if ((uxVar4.wdg6QnbFHrFF & 2097152) != 0 && (uxVar4 instanceof ux)) {
                                            m61 m61Var24 = uxVar4.S2OOm9zPNm0h;
                                            int i29 = 0;
                                            uxVar4 = uxVar4;
                                            r7 = r7;
                                            while (m61Var24 != null) {
                                                if ((m61Var24.wdg6QnbFHrFF & i28) != 0) {
                                                    i29++;
                                                    r7 = r7;
                                                    if (i29 == 1) {
                                                        uxVar4 = m61Var24;
                                                    } else {
                                                        if (r7 == 0) {
                                                            r7 = new f91(new m61[16]);
                                                        }
                                                        if (uxVar4 != 0) {
                                                            r7.lS5Rgt96tfkO(uxVar4);
                                                            uxVar4 = th;
                                                        }
                                                        r7.lS5Rgt96tfkO(m61Var24);
                                                    }
                                                }
                                                m61Var24 = m61Var24.cpQdD2nAriOS;
                                                i28 = 2097152;
                                                uxVar4 = uxVar4;
                                                r7 = r7;
                                            }
                                            if (i29 == 1) {
                                            }
                                        }
                                    }
                                    uxVar4 = zv.dgRBjINgWbAK(r7);
                                }
                            }
                            i27 = 2097152;
                            m61Var23 = m61Var23.x50lh2ztY7Y5;
                            r52 = r52;
                        }
                    }
                    zf8DYfih6EZu6 = zf8DYfih6EZu6.S9EYkSpbGuxq();
                    r02 = (zf8DYfih6EZu6 == null || (kd1Var3 = zf8DYfih6EZu6.nLZGh9p8gVSu) == null) ? th : kd1Var3.e9gEMXR7LXtO;
                }
                rn1 rn1Var = rn1.rtx2ld2ELZv4;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i30 = size2 - 1;
                        ((qo0) r52.get(size2)).BjEWd04qc7Mw(x3Var, rn1Var);
                        if (i30 < 0) {
                            break;
                        }
                        size2 = i30;
                    }
                }
                m61Var2.BjEWd04qc7Mw(x3Var, rn1Var);
                rn1 rn1Var2 = rn1.OPXfSBeufaJ8;
                m61Var2.BjEWd04qc7Mw(x3Var, rn1Var2);
                if (r52 != 0) {
                    int size6 = r52.size();
                    for (int i31 = 0; i31 < size6; i31++) {
                        ((qo0) r52.get(i31)).BjEWd04qc7Mw(x3Var, rn1Var2);
                    }
                }
                rn1 rn1Var3 = rn1.wdg6QnbFHrFF;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i32 = size - 1;
                        ((qo0) r52.get(size)).BjEWd04qc7Mw(x3Var, rn1Var3);
                        if (i32 < 0) {
                            break;
                        }
                        size = i32;
                    }
                }
                m61Var2.BjEWd04qc7Mw(x3Var, rn1Var3);
            }
            ArrayList arrayList5 = (ArrayList) x3Var.lS5Rgt96tfkO;
            int size7 = arrayList5.size();
            for (int i33 = 0; i33 < size7; i33++) {
                if (((go0) arrayList5.get(i33)).OPXfSBeufaJ8) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        icVar.getClass();
        MotionEvent motionEvent2 = (MotionEvent) x3Var.TSizfFm2Yiuu;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && z2) {
                do0.Companion.getClass();
                icVar.lS5Rgt96tfkO = 0;
                icVar.TSizfFm2Yiuu = true;
            }
        } else {
            z4 = true;
            icVar.lS5Rgt96tfkO = x3Var.PxuCJdSBwIXG;
            icVar.TSizfFm2Yiuu = false;
        }
        ((GestureDetector) icVar.e9gEMXR7LXtO).onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        r5.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(r20);
        r4 = r2.x50lh2ztY7Y5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
    
        if (r4 != r14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0100, code lost:
    
        r2.x50lh2ztY7Y5 = r14;
        defpackage.x1.S2OOm9zPNm0h(r2, r14, 128, null, 12);
        defpackage.x1.S2OOm9zPNm0h(r2, r4, 256, null, 12);
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.W7ceZOzvrRuI;
        z0 z0Var = this.EP3hG58ROvHh;
        if (z) {
            removeCallbacks(z0Var);
            z0Var.run();
        }
        if (XL4ISE6Oc65B(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        x1 x1Var = this.ozEBbv0hFTAB;
        r1 r1Var = x1Var.dgRBjINgWbAK;
        AccessibilityManager accessibilityManager = x1Var.r3s1LDPKFs1S;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                r1Var.S2OOm9zPNm0h(true);
                zj0 zj0Var = new zj0();
                vw0 root = r1Var.getRoot();
                long floatToRawIntBits = Float.floatToRawIntBits(x);
                ho1.Companion.getClass();
                root.e6tOsSdd2EFb((Float.floatToRawIntBits(y) & 4294967295L) | (floatToRawIntBits << 32), zj0Var, true);
                p81 p81Var = zj0Var.rtx2ld2ELZv4;
                int i2 = p81Var.lS5Rgt96tfkO - 1;
                while (true) {
                    if (-1 >= i2) {
                        i = Integer.MIN_VALUE;
                        break;
                    }
                    Object a92UlCVFR9N8 = p81Var.a92UlCVFR9N8(i2);
                    a92UlCVFR9N8.getClass();
                    vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu((m61) a92UlCVFR9N8);
                    if (r1Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(zf8DYfih6EZu) != null) {
                        u9.VhhvGxCb8gfr();
                        return false;
                    }
                    if (zf8DYfih6EZu.nLZGh9p8gVSu.Y1f8riQaR6yg(8)) {
                        int RfyTYNmI9Srp = x1Var.RfyTYNmI9Srp(zf8DYfih6EZu.OPXfSBeufaJ8);
                        d32 rtx2ld2ELZv4 = ki0.rtx2ld2ELZv4(zf8DYfih6EZu, false);
                        if (bs0.pnx5pC0XzaCw(rtx2ld2ELZv4)) {
                            if (!rtx2ld2ELZv4.dgRBjINgWbAK().rtx2ld2ELZv4.TSizfFm2Yiuu(h32.jyegZNwi31qc)) {
                                i = RfyTYNmI9Srp;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2--;
                }
            } else if (action == 10) {
                int i3 = x1Var.x50lh2ztY7Y5;
                if (i3 == Integer.MIN_VALUE) {
                    r1Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                } else if (i3 != Integer.MIN_VALUE) {
                    x1Var.x50lh2ztY7Y5 = Integer.MIN_VALUE;
                    x1.S2OOm9zPNm0h(x1Var, Integer.MIN_VALUE, 128, null, 12);
                    x1.S2OOm9zPNm0h(x1Var, i3, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && RfyTYNmI9Srp(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.OYiFbU3x63rc;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.OYiFbU3x63rc = MotionEvent.obtainNoHistory(motionEvent);
                this.W7ceZOzvrRuI = true;
                postDelayed(z0Var, 8L);
                return false;
            }
        } else if (!EcgxDIVH5in8(motionEvent)) {
            return false;
        }
        return (r3s1LDPKFs1S(motionEvent) & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((qa0) getFocusOwner()).Y1f8riQaR6yg(keyEvent, new i1(i, this, keyEvent));
        }
        rz0 rz0Var = getComposeViewContext().RfyTYNmI9Srp;
        int metaState = keyEvent.getMetaState();
        rz0Var.getClass();
        ks2.Companion.getClass();
        ks2.PxuCJdSBwIXG.setValue(new fo1(metaState));
        return ((qa0) getFocusOwner()).Y1f8riQaR6yg(keyEvent, dq.gPXPFXrUH4XX) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        kd1 kd1Var;
        if (isFocused()) {
            qa0 qa0Var = (qa0) getFocusOwner();
            if (qa0Var.Y1f8riQaR6yg.e9gEMXR7LXtO) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                ab0 BRwzKIf41E4i = zv.BRwzKIf41E4i(qa0Var.TSizfFm2Yiuu);
                if (BRwzKIf41E4i != null) {
                    if (!BRwzKIf41E4i.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                        ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                    }
                    m61 m61Var = BRwzKIf41E4i.rtx2ld2ELZv4;
                    vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(BRwzKIf41E4i);
                    while (zf8DYfih6EZu != null) {
                        if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 131072) != 0) {
                            while (m61Var != null) {
                                if ((m61Var.wdg6QnbFHrFF & 131072) != 0) {
                                    m61 m61Var2 = m61Var;
                                    f91 f91Var = null;
                                    while (m61Var2 != null) {
                                        if ((m61Var2.wdg6QnbFHrFF & 131072) != 0 && (m61Var2 instanceof ux)) {
                                            int i = 0;
                                            for (m61 m61Var3 = ((ux) m61Var2).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                                if ((m61Var3.wdg6QnbFHrFF & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        m61Var2 = m61Var3;
                                                    } else {
                                                        if (f91Var == null) {
                                                            f91Var = new f91(new m61[16]);
                                                        }
                                                        if (m61Var2 != null) {
                                                            f91Var.lS5Rgt96tfkO(m61Var2);
                                                            m61Var2 = null;
                                                        }
                                                        f91Var.lS5Rgt96tfkO(m61Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        m61Var2 = zv.dgRBjINgWbAK(f91Var);
                                    }
                                }
                                m61Var = m61Var.x50lh2ztY7Y5;
                            }
                        }
                        zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                        m61Var = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            y1.PxuCJdSBwIXG.PxuCJdSBwIXG(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object fbVar;
        ab0 a92UlCVFR9N8;
        if (this.W7ceZOzvrRuI) {
            z0 z0Var = this.EP3hG58ROvHh;
            removeCallbacks(z0Var);
            MotionEvent motionEvent2 = this.OYiFbU3x63rc;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.W7ceZOzvrRuI = false;
            } else {
                z0Var.run();
            }
        }
        if (!XL4ISE6Oc65B(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || EcgxDIVH5in8(motionEvent))) {
            int r3s1LDPKFs1S = r3s1LDPKFs1S(motionEvent);
            if ((r3s1LDPKFs1S & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (fbVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    fb.Companion.getClass();
                    fbVar = new fb(1);
                }
                fb.Companion.getClass();
                if (fbVar.equals(new fb(1)) && (a92UlCVFR9N8 = ((qa0) getFocusOwner()).a92UlCVFR9N8()) != null) {
                    pd1 i68hK7ahKtgp = zv.i68hK7ahKtgp(a92UlCVFR9N8);
                    if (!kj0.ZbWwgt3aGe7A(i68hK7ahKtgp).nLZGh9p8gVSu(i68hK7ahKtgp, true).PxuCJdSBwIXG((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        qa0 qa0Var = (qa0) getFocusOwner();
                        qa0Var.getClass();
                        ga0.Companion.getClass();
                        qa0Var.lS5Rgt96tfkO(8, false, true);
                    }
                }
            }
            if ((r3s1LDPKFs1S & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void e6tOsSdd2EFb(vw0 vw0Var, boolean z, boolean z2, boolean z3) {
        vw0 S9EYkSpbGuxq;
        vw0 S9EYkSpbGuxq2;
        g51 g51Var = this.qudtW7lwm99e;
        if (!z) {
            if (g51Var.XL4ISE6Oc65B(vw0Var, z2) && z3) {
                ozEBbv0hFTAB(vw0Var);
                return;
            }
            return;
        }
        m9 m9Var = g51Var.lS5Rgt96tfkO;
        vw0 vw0Var2 = vw0Var.QrzZRwfaDlRX;
        zw0 zw0Var = vw0Var.ryVscX7ZL4Ux;
        if (vw0Var2 == null) {
            ep0.lS5Rgt96tfkO("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = zw0Var.Y1f8riQaR6yg.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    u9.gPXPFXrUH4XX();
                    return;
                }
                if (!zw0Var.e9gEMXR7LXtO || z2) {
                    zw0Var.e9gEMXR7LXtO = true;
                    zw0Var.gPXPFXrUH4XX.jyegZNwi31qc = true;
                    if (vw0Var.xbgXKYA2cIfu) {
                        return;
                    }
                    if ((cs0.wdg6QnbFHrFF(vw0Var.xfACYKDMU6Dj(), Boolean.TRUE) || g51.OPXfSBeufaJ8(vw0Var)) && ((S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq()) == null || !S9EYkSpbGuxq.ryVscX7ZL4Ux.e9gEMXR7LXtO)) {
                        m9Var.PxuCJdSBwIXG(vw0Var, js0.rtx2ld2ELZv4);
                    } else if ((vw0Var.EpkonXwzFgDB() || g51.wdg6QnbFHrFF(vw0Var)) && ((S9EYkSpbGuxq2 = vw0Var.S9EYkSpbGuxq()) == null || !S9EYkSpbGuxq2.BRwzKIf41E4i())) {
                        m9Var.PxuCJdSBwIXG(vw0Var, js0.wdg6QnbFHrFF);
                    }
                    if (g51Var.Y1f8riQaR6yg || !z3) {
                        return;
                    }
                    ozEBbv0hFTAB(vw0Var);
                    return;
                }
                return;
            }
        }
        g51Var.rtx2ld2ELZv4.lS5Rgt96tfkO(new f51(vw0Var, true, z2));
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return dgRBjINgWbAK(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        qt1 PxuCJdSBwIXG;
        int i2;
        if (view == null || this.qudtW7lwm99e.TSizfFm2Yiuu) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus != null && !findNextFocus.equals(this)) {
            for (ViewParent parent = findNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
        }
        findNextFocus = null;
        if (view == this) {
            ab0 BRwzKIf41E4i = zv.BRwzKIf41E4i(((qa0) getFocusOwner()).TSizfFm2Yiuu);
            PxuCJdSBwIXG = BRwzKIf41E4i != null ? zv.XL4ISE6Oc65B(BRwzKIf41E4i) : null;
            if (PxuCJdSBwIXG == null) {
                PxuCJdSBwIXG = ka0.PxuCJdSBwIXG(view, this);
            }
        } else {
            PxuCJdSBwIXG = ka0.PxuCJdSBwIXG(view, this);
        }
        ga0 lS5Rgt96tfkO = ka0.lS5Rgt96tfkO(i);
        if (lS5Rgt96tfkO != null) {
            i2 = lS5Rgt96tfkO.PxuCJdSBwIXG;
        } else {
            ga0.Companion.getClass();
            i2 = 6;
        }
        zt1 zt1Var = new zt1();
        if (((qa0) getFocusOwner()).e9gEMXR7LXtO(i2, PxuCJdSBwIXG, new j1(0, zt1Var)) == null) {
            return view;
        }
        if (zt1Var.rtx2ld2ELZv4 != null) {
            if (findNextFocus == null || ov2.tmVwIGCQF4zR(i2) || ki0.gGoUzNp9JO5I(zv.XL4ISE6Oc65B((ab0) zt1Var.rtx2ld2ELZv4), ka0.PxuCJdSBwIXG(findNextFocus, this), PxuCJdSBwIXG, i2)) {
                return this;
            }
        } else if (findNextFocus == null) {
            return super.focusSearch(view, i);
        }
        return findNextFocus;
    }

    public final void gPXPFXrUH4XX(vw0 vw0Var) {
        this.qudtW7lwm99e.XL4ISE6Oc65B(vw0Var, false);
        f91 pnx5pC0XzaCw = vw0Var.pnx5pC0XzaCw();
        Object[] objArr = pnx5pC0XzaCw.rtx2ld2ELZv4;
        int i = pnx5pC0XzaCw.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            gPXPFXrUH4XX((vw0) objArr[i2]);
        }
    }

    public final b7 getAndroidViewsHandler$ui() {
        if (this.ngxnMNrpiKat == null) {
            b7 b7Var = new b7(getContext());
            this.ngxnMNrpiKat = b7Var;
            addView(b7Var, -1);
            requestLayout();
        }
        b7 b7Var2 = this.ngxnMNrpiKat;
        b7Var2.getClass();
        return b7Var2;
    }

    public hb getAutofill() {
        return this.zf8DYfih6EZu;
    }

    public nb getAutofillManager() {
        return this.wLFCmsViZrNT;
    }

    public ob getAutofillTree() {
        return this.xfACYKDMU6Dj;
    }

    public final dp getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.FT2GK7JK5Ma2;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.POWyO8hTM6YC.getValue();
    }

    public final o2 getContentCaptureManager$ui() {
        return this.tmVwIGCQF4zR;
    }

    public hu getCoroutineContext() {
        return this.S9EYkSpbGuxq;
    }

    public hy getDensity() {
        return (hy) this.XL4ISE6Oc65B.getValue();
    }

    public qt1 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            ab0 BRwzKIf41E4i = zv.BRwzKIf41E4i(((qa0) getFocusOwner()).TSizfFm2Yiuu);
            if (BRwzKIf41E4i != null) {
                return zv.XL4ISE6Oc65B(BRwzKIf41E4i);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return ka0.PxuCJdSBwIXG(findFocus, this);
        }
        return null;
    }

    public na0 getFocusOwner() {
        return this.EcgxDIVH5in8;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        qt1 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.PxuCJdSBwIXG);
            rect.top = Math.round(embeddedViewFocusRect.lS5Rgt96tfkO);
            rect.right = Math.round(embeddedViewFocusRect.TSizfFm2Yiuu);
            rect.bottom = Math.round(embeddedViewFocusRect.Y1f8riQaR6yg);
            return;
        }
        na0 focusOwner = getFocusOwner();
        ga0.Companion.getClass();
        if (cs0.wdg6QnbFHrFF(((qa0) focusOwner).e9gEMXR7LXtO(6, null, k1.wdg6QnbFHrFF), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public ob0 getFontFamilyResolver() {
        return (ob0) this.hnJvRxDXo0hm.getValue();
    }

    public lb0 getFontLoader() {
        return this.cJeY36nTk9tz;
    }

    public final t01 getFrameEndScheduler$ui() {
        return this.cpQdD2nAriOS;
    }

    public nh0 getGraphicsContext() {
        return this.EpkonXwzFgDB;
    }

    public yi0 getHapticFeedBack() {
        return this.GlTbNTgfSMqy;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.qudtW7lwm99e.lS5Rgt96tfkO.pnx5pC0XzaCw() || !this.gPXPFXrUH4XX.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public sp0 getInputModeManager() {
        return this.mFd1aGiJX24N;
    }

    public final xp0 getInsetsListener() {
        return this.jyegZNwi31qc;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.rxipThha848g;
    }

    @Override // android.view.View, android.view.ViewParent
    public cw0 getLayoutDirection() {
        return (cw0) this.JLGWdXyAxbxj.getValue();
    }

    public p21 getLocaleList() {
        return (p21) this.i68hK7ahKtgp.getValue();
    }

    public long getMeasureIteration() {
        g51 g51Var = this.qudtW7lwm99e;
        if (!g51Var.TSizfFm2Yiuu) {
            ep0.PxuCJdSBwIXG("measureIteration should be only used during the measure/layout pass");
        }
        return g51Var.RAsUl2FVSrh6;
    }

    public o61 getModifierLocalManager() {
        return this.HqMwxkFaipxD;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public r1 m18getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public dm1 getPlacementScope() {
        int i = fm1.lS5Rgt96tfkO;
        return new v31(1, this);
    }

    public zn1 getPointerIconService() {
        return this.i6zQx8Kd7UPU;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final do0 m11getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.dgRBjINgWbAK;
    }

    public st1 getRectManager() {
        return this.rZjpSjn4zoMv;
    }

    public zv1 getRetainedValuesStore() {
        return this.QrzZRwfaDlRX;
    }

    public vw0 getRoot() {
        return this.aF05bpZJlKEP;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        i2 i2Var;
        if (Build.VERSION.SDK_INT < 31 || (i2Var = this.qYgDo2Ye5PY7) == null) {
            return false;
        }
        return ((Boolean) ((mj1) i2Var.OPXfSBeufaJ8).getValue()).booleanValue();
    }

    public g32 getSemanticsOwner() {
        return this.BjEWd04qc7Mw;
    }

    public xw0 getSharedDrawScope() {
        return this.x50lh2ztY7Y5;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? c9.PxuCJdSBwIXG.PxuCJdSBwIXG(this) : this.bEKsvqmvPh2y;
    }

    public hi1 getSnapshotObserver() {
        return this.JHNfcAUfKc4G;
    }

    public j82 getSoftwareKeyboardController() {
        wx wxVar = this.uy1Qfkdvj4xZ;
        if (wxVar != null) {
            return wxVar;
        }
        wx wxVar2 = new wx(getTextInputService());
        this.uy1Qfkdvj4xZ = wxVar2;
        return wxVar2;
    }

    public ai2 getTextInputService() {
        ai2 ai2Var = this.uURZJOrwXbxn;
        if (ai2Var != null) {
            return ai2Var;
        }
        ai2 ai2Var2 = new ai2(getLegacyTextInputServiceAndroid());
        this.uURZJOrwXbxn = ai2Var2;
        return ai2Var2;
    }

    public ej2 getTextToolbar() {
        return this.twy4zb2fCtqq;
    }

    public final gx1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public vq2 getViewConfiguration() {
        return this.e6tOsSdd2EFb;
    }

    public final f1 getViewTreeOwners() {
        o0.ZbWwgt3aGe7A(this.v6yxfmkxNKhL.getValue());
        return null;
    }

    public is2 getWindowInfo() {
        return getComposeViewContext().RfyTYNmI9Srp;
    }

    public final r0 get_autofillManager$ui() {
        return this.wLFCmsViZrNT;
    }

    public final void jyegZNwi31qc(vw0 vw0Var, boolean z, boolean z2) {
        zw0 zw0Var = vw0Var.ryVscX7ZL4Ux;
        js0 js0Var = js0.dgRBjINgWbAK;
        g51 g51Var = this.qudtW7lwm99e;
        if (!z) {
            g51Var.getClass();
            int ordinal = zw0Var.Y1f8riQaR6yg.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                u9.gPXPFXrUH4XX();
                return;
            }
            vw0 S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
            boolean z3 = S9EYkSpbGuxq == null || S9EYkSpbGuxq.EpkonXwzFgDB();
            if (!z2) {
                if (vw0Var.BRwzKIf41E4i()) {
                    return;
                }
                if (vw0Var.gPXPFXrUH4XX() && vw0Var.EpkonXwzFgDB() == z3 && vw0Var.EpkonXwzFgDB() == zw0Var.gPXPFXrUH4XX.e6tOsSdd2EFb) {
                    return;
                }
            }
            i51 i51Var = zw0Var.gPXPFXrUH4XX;
            i51Var.aF05bpZJlKEP = true;
            i51Var.kpCQ9veP6n3I = true;
            if (!vw0Var.xbgXKYA2cIfu && i51Var.e6tOsSdd2EFb && z3) {
                if ((S9EYkSpbGuxq == null || !S9EYkSpbGuxq.gPXPFXrUH4XX()) && (S9EYkSpbGuxq == null || !S9EYkSpbGuxq.BRwzKIf41E4i())) {
                    g51Var.lS5Rgt96tfkO.PxuCJdSBwIXG(vw0Var, js0Var);
                }
                if (g51Var.Y1f8riQaR6yg) {
                    return;
                }
                ozEBbv0hFTAB(null);
                return;
            }
            return;
        }
        m9 m9Var = g51Var.lS5Rgt96tfkO;
        int ordinal2 = zw0Var.Y1f8riQaR6yg.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    u9.gPXPFXrUH4XX();
                    return;
                }
            }
        }
        if ((zw0Var.e9gEMXR7LXtO || zw0Var.a92UlCVFR9N8) && !z2) {
            return;
        }
        zw0Var.a92UlCVFR9N8 = true;
        zw0Var.RAsUl2FVSrh6 = true;
        i51 i51Var2 = zw0Var.gPXPFXrUH4XX;
        i51Var2.aF05bpZJlKEP = true;
        i51Var2.kpCQ9veP6n3I = true;
        if (vw0Var.xbgXKYA2cIfu) {
            return;
        }
        vw0 S9EYkSpbGuxq2 = vw0Var.S9EYkSpbGuxq();
        if (cs0.wdg6QnbFHrFF(vw0Var.xfACYKDMU6Dj(), Boolean.TRUE) && ((S9EYkSpbGuxq2 == null || !S9EYkSpbGuxq2.ryVscX7ZL4Ux.e9gEMXR7LXtO) && (S9EYkSpbGuxq2 == null || !S9EYkSpbGuxq2.ryVscX7ZL4Ux.a92UlCVFR9N8))) {
            m9Var.PxuCJdSBwIXG(vw0Var, js0.OPXfSBeufaJ8);
        } else if (vw0Var.EpkonXwzFgDB() && ((S9EYkSpbGuxq2 == null || !S9EYkSpbGuxq2.gPXPFXrUH4XX()) && (S9EYkSpbGuxq2 == null || !S9EYkSpbGuxq2.BRwzKIf41E4i()))) {
            m9Var.PxuCJdSBwIXG(vw0Var, js0Var);
        }
        if (g51Var.Y1f8riQaR6yg) {
            return;
        }
        ozEBbv0hFTAB(null);
    }

    public final void kpCQ9veP6n3I() {
        if (this.hVNtCUZb4tYH) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.rxipThha848g) {
            this.rxipThha848g = currentAnimationTimeMillis;
            mh mhVar = this.Yadk4uqlxLy8;
            float[] fArr = this.JTxCbbCwomzt;
            mhVar.PxuCJdSBwIXG(this, fArr);
            jh0.S2OOm9zPNm0h(fArr, this.VzNxmvWisHL1);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.D0aTLcX6Uhyo;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.uVlwi32qvXeJ = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    @Override // defpackage.uw
    public final void lS5Rgt96tfkO(o01 o01Var) {
        u01 u01Var = this.r3s1LDPKFs1S;
        if (u01Var != null) {
            j41 j41Var = (j41) u01Var.PxuCJdSBwIXG.OPXfSBeufaJ8;
            if (j41Var.rtx2ld2ELZv4 && !j41Var.wdg6QnbFHrFF) {
                di diVar = u01Var.Y1f8riQaR6yg;
                if (diVar != null) {
                    diVar.cancel();
                }
                u01Var.Y1f8riQaR6yg = null;
                return;
            }
            if (j41Var.OPXfSBeufaJ8) {
                return;
            }
            if (!j41Var.wdg6QnbFHrFF) {
                hp1.PxuCJdSBwIXG("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!j41Var.dgRBjINgWbAK.OPXfSBeufaJ8()) {
                hp1.PxuCJdSBwIXG("Attempted to start retaining exited values with pending exited values");
            }
            j41Var.wdg6QnbFHrFF = false;
        }
    }

    public final void nLZGh9p8gVSu(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (cs0.wdg6QnbFHrFF(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(f2.lS5Rgt96tfkO(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.S2OOm9zPNm0h.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        zv1 zv1Var;
        Object obj;
        e0 e0Var;
        super.onAttachedToWindow();
        int i = 1;
        setAttached(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            Companion.getClass();
            setShowLayoutBounds(c1.PxuCJdSBwIXG());
        }
        this.jyegZNwi31qc.onViewAttachedToWindow(this);
        Companion.getClass();
        int i3 = 0;
        if (i2 > 28) {
            if (HiC8volkyM7b == null) {
                b1 b1Var = new b1();
                HiC8volkyM7b = b1Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (vfcx0XMziUg4 == null) {
                        vfcx0XMziUg4 = Class.forName("android.os.SystemProperties");
                    }
                    if (kRWHK87H9qm4 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = vfcx0XMziUg4;
                        kRWHK87H9qm4 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = kRWHK87H9qm4;
                    if (method != null) {
                        method.invoke(null, b1Var);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            p81 p81Var = BUo4iHFctTZi;
            synchronized (p81Var) {
                p81Var.PxuCJdSBwIXG(this);
            }
        }
        if (!this.FT2GK7JK5Ma2) {
            getComposeViewContext().TSizfFm2Yiuu();
        }
        this.FT2GK7JK5Ma2 = false;
        gPXPFXrUH4XX(getRoot());
        QrzZRwfaDlRX(getRoot());
        f82 f82Var = getSnapshotObserver().PxuCJdSBwIXG;
        i72 i72Var = j72.Companion;
        l4 l4Var = f82Var.Y1f8riQaR6yg;
        i72Var.getClass();
        f82Var.rtx2ld2ELZv4 = i72.Y1f8riQaR6yg(l4Var);
        if (RAsUl2FVSrh6() && (e0Var = this.zf8DYfih6EZu) != null) {
            jb jbVar = jb.PxuCJdSBwIXG;
            jbVar.getClass();
            ((AutofillManager) e0Var.dgRBjINgWbAK).registerCallback(Nlhe969cAGO8.a92UlCVFR9N8(jbVar));
        }
        o01 o01Var = getComposeViewContext().TSizfFm2Yiuu;
        pr2 pr2Var = getComposeViewContext().e9gEMXR7LXtO;
        t01 t01Var = this.cpQdD2nAriOS;
        if (o01Var == null || pr2Var == null || t01Var == null) {
            zv1Var = null;
        } else {
            v01 v01Var = (v01) ir2.PxuCJdSBwIXG(nr2.Companion, pr2Var.RAsUl2FVSrh6(), new mr2()).PxuCJdSBwIXG(bu1.PxuCJdSBwIXG(v01.class));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            c81 c81Var = v01Var.lS5Rgt96tfkO;
            Object lS5Rgt96tfkO = c81Var.lS5Rgt96tfkO(id);
            if (lS5Rgt96tfkO == null) {
                lS5Rgt96tfkO = new p81(1);
                c81Var.rtx2ld2ELZv4(id, lS5Rgt96tfkO);
            }
            p81 p81Var2 = (p81) lS5Rgt96tfkO;
            Object[] objArr = p81Var2.PxuCJdSBwIXG;
            int i4 = p81Var2.lS5Rgt96tfkO;
            while (true) {
                if (i3 >= i4) {
                    obj = null;
                    break;
                }
                obj = objArr[i3];
                if (!((u01) obj).TSizfFm2Yiuu) {
                    break;
                } else {
                    i3++;
                }
            }
            u01 u01Var = (u01) obj;
            if (u01Var == null) {
                u01Var = new u01();
                p81Var2.PxuCJdSBwIXG(u01Var);
            }
            u01Var.TSizfFm2Yiuu = true;
            this.r3s1LDPKFs1S = u01Var;
            zv1Var = u01Var.lS5Rgt96tfkO;
        }
        if (zv1Var == null) {
            zv1Var = ih0.gPXPFXrUH4XX;
        }
        this.QrzZRwfaDlRX = zv1Var;
        le0 le0Var = this.Nlhe969cAGO8;
        if (le0Var != null) {
            le0Var.OPXfSBeufaJ8(getComposeViewContext());
            this.Nlhe969cAGO8 = null;
        }
        s01 rtx2ld2ELZv4 = getComposeViewContext().TSizfFm2Yiuu.rtx2ld2ELZv4();
        rtx2ld2ELZv4.PxuCJdSBwIXG(this);
        rtx2ld2ELZv4.PxuCJdSBwIXG(this.tmVwIGCQF4zR);
        tp0 tp0Var = this.mFd1aGiJX24N;
        if (isInTouchMode()) {
            rp0.Companion.getClass();
        } else {
            rp0.Companion.getClass();
            i = 2;
        }
        tp0Var.PxuCJdSBwIXG.setValue(new rp0(i));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            c2.PxuCJdSBwIXG.lS5Rgt96tfkO(this);
        }
        r0 r0Var = this.wLFCmsViZrNT;
        if (r0Var != null) {
            ((qa0) getFocusOwner()).RAsUl2FVSrh6.PxuCJdSBwIXG(r0Var);
            getSemanticsOwner().Y1f8riQaR6yg.PxuCJdSBwIXG(r0Var);
        }
        ((qa0) getFocusOwner()).RAsUl2FVSrh6.PxuCJdSBwIXG(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        l42 l42Var = (l42) this.iSxsmagYqzHM.get();
        a5 a5Var = (a5) (l42Var != null ? l42Var.lS5Rgt96tfkO : null);
        if (a5Var == null) {
            return getLegacyTextInputServiceAndroid().Y1f8riQaR6yg;
        }
        l42 l42Var2 = (l42) a5Var.dgRBjINgWbAK.get();
        pp0 pp0Var = (pp0) (l42Var2 != null ? l42Var2.lS5Rgt96tfkO : null);
        return pp0Var != null && (pp0Var.e9gEMXR7LXtO ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nLZGh9p8gVSu(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        l42 l42Var = (l42) this.iSxsmagYqzHM.get();
        a5 a5Var = (a5) (l42Var != null ? l42Var.lS5Rgt96tfkO : null);
        if (a5Var == null) {
            ci2 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.Y1f8riQaR6yg) {
                ln0 ln0Var = legacyTextInputServiceAndroid.rtx2ld2ELZv4;
                oh2 oh2Var = legacyTextInputServiceAndroid.RAsUl2FVSrh6;
                int i2 = ln0Var.Y1f8riQaR6yg;
                jn0.Companion.getClass();
                if (i2 == 1) {
                    i = 0;
                } else if (i2 == 0) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else if (i2 == 6) {
                    i = 5;
                } else if (i2 == 5) {
                    i = 7;
                } else if (i2 == 3) {
                    i = 3;
                } else if (i2 == 4) {
                    i = 4;
                } else {
                    if (i2 != 7) {
                        u9.rtx2ld2ELZv4("invalid ImeAction");
                        return null;
                    }
                    i = 6;
                }
                editorInfo.imeOptions = i;
                int i3 = ln0Var.TSizfFm2Yiuu;
                hv0.Companion.getClass();
                if (i3 == 1) {
                    editorInfo.inputType = 1;
                } else if (i3 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions |= Integer.MIN_VALUE;
                } else if (i3 == 3) {
                    editorInfo.inputType = 2;
                } else if (i3 == 4) {
                    editorInfo.inputType = 3;
                } else if (i3 == 5) {
                    editorInfo.inputType = 17;
                } else if (i3 == 6) {
                    editorInfo.inputType = 33;
                } else if (i3 == 7) {
                    editorInfo.inputType = 129;
                } else if (i3 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i3 != 9) {
                        u9.rtx2ld2ELZv4("Invalid Keyboard Type");
                        return null;
                    }
                    editorInfo.inputType = 8194;
                }
                int i4 = editorInfo.inputType;
                if ((i4 & 1) == 1) {
                    editorInfo.inputType = i4 | 131072;
                    if (ln0Var.Y1f8riQaR6yg == 1) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                if ((editorInfo.inputType & 1) == 1) {
                    int i5 = ln0Var.PxuCJdSBwIXG;
                    dv0.Companion.getClass();
                    if (i5 == 1) {
                        editorInfo.inputType |= 4096;
                    } else if (i5 == 2) {
                        editorInfo.inputType |= 8192;
                    } else if (i5 == 3) {
                        editorInfo.inputType |= 16384;
                    }
                    if (ln0Var.lS5Rgt96tfkO) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j = oh2Var.lS5Rgt96tfkO;
                ui2 ui2Var = vi2.Companion;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                hq0.POWyO8hTM6YC(editorInfo, oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8);
                editorInfo.imeOptions |= 33554432;
                if (x40.Y1f8riQaR6yg()) {
                    x40.PxuCJdSBwIXG().RAsUl2FVSrh6(editorInfo);
                }
                kt1 kt1Var = new kt1(legacyTextInputServiceAndroid.RAsUl2FVSrh6, new b42(10, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.rtx2ld2ELZv4.lS5Rgt96tfkO);
                legacyTextInputServiceAndroid.OPXfSBeufaJ8.add(new WeakReference(kt1Var));
                return kt1Var;
            }
        } else {
            l42 l42Var2 = (l42) a5Var.dgRBjINgWbAK.get();
            pp0 pp0Var = (pp0) (l42Var2 != null ? l42Var2.lS5Rgt96tfkO : null);
            if (pp0Var != null) {
                synchronized (pp0Var.TSizfFm2Yiuu) {
                    if (pp0Var.e9gEMXR7LXtO) {
                        return null;
                    }
                    lt1 PxuCJdSBwIXG = pp0Var.PxuCJdSBwIXG.PxuCJdSBwIXG(editorInfo);
                    y yVar = new y(15, pp0Var);
                    int i6 = Build.VERSION.SDK_INT;
                    InputConnection le1Var = i6 >= 34 ? new le1(PxuCJdSBwIXG, yVar) : i6 >= 25 ? new ke1(PxuCJdSBwIXG, yVar) : new je1(PxuCJdSBwIXG, yVar);
                    pp0Var.Y1f8riQaR6yg.lS5Rgt96tfkO(new zr2(le1Var));
                    return le1Var;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        d32 d32Var;
        AutofillId autofillId;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        o2 o2Var = this.tmVwIGCQF4zR;
        o2Var.getClass();
        for (long j : jArr) {
            f32 f32Var = (f32) o2Var.Y1f8riQaR6yg().lS5Rgt96tfkO((int) j);
            if (f32Var != null && (d32Var = f32Var.PxuCJdSBwIXG) != null) {
                b2.XL4ISE6Oc65B();
                autofillId = o2Var.rtx2ld2ELZv4.getAutofillId();
                ViewTranslationRequest.Builder r3s1LDPKFs1S = b2.r3s1LDPKFs1S(autofillId, d32Var.a92UlCVFR9N8);
                Object RAsUl2FVSrh6 = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.aF05bpZJlKEP);
                if (RAsUl2FVSrh6 == null) {
                    RAsUl2FVSrh6 = null;
                }
                List list = (List) RAsUl2FVSrh6;
                if (list != null) {
                    forText = TranslationRequestValue.forText(new v8(c21.PxuCJdSBwIXG(list, "\n", null, 62)));
                    r3s1LDPKFs1S.setValue("android:text", forText);
                    build = r3s1LDPKFs1S.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        e0 e0Var;
        super.onDetachedFromWindow();
        setAttached(false);
        this.jyegZNwi31qc.onViewDetachedFromWindow(this);
        View view = this.RfyTYNmI9Srp;
        if (BRwzKIf41E4i() && view != null) {
            removeView(view);
        }
        Companion.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            p81 p81Var = BUo4iHFctTZi;
            synchronized (p81Var) {
                p81Var.wdg6QnbFHrFF(this);
            }
        }
        getComposeViewContext().lS5Rgt96tfkO();
        f82 f82Var = getSnapshotObserver().PxuCJdSBwIXG;
        rf1 rf1Var = f82Var.rtx2ld2ELZv4;
        if (rf1Var != null) {
            rf1Var.lS5Rgt96tfkO();
        }
        f82Var.PxuCJdSBwIXG();
        s01 rtx2ld2ELZv4 = getComposeViewContext().TSizfFm2Yiuu.rtx2ld2ELZv4();
        rtx2ld2ELZv4.a92UlCVFR9N8(this.tmVwIGCQF4zR);
        rtx2ld2ELZv4.a92UlCVFR9N8(this);
        if (RAsUl2FVSrh6() && (e0Var = this.zf8DYfih6EZu) != null) {
            jb jbVar = jb.PxuCJdSBwIXG;
            jbVar.getClass();
            ((AutofillManager) e0Var.dgRBjINgWbAK).unregisterCallback(Nlhe969cAGO8.a92UlCVFR9N8(jbVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        u01 u01Var = this.r3s1LDPKFs1S;
        if (u01Var != null) {
            u01Var.TSizfFm2Yiuu = false;
        }
        this.r3s1LDPKFs1S = null;
        if (i >= 31) {
            c2.PxuCJdSBwIXG.PxuCJdSBwIXG(this);
        }
        r0 r0Var = this.wLFCmsViZrNT;
        if (r0Var != null) {
            getSemanticsOwner().Y1f8riQaR6yg.wdg6QnbFHrFF(r0Var);
            ((qa0) getFocusOwner()).RAsUl2FVSrh6.wdg6QnbFHrFF(r0Var);
        }
        st1 rectManager = getRectManager();
        uj2 uj2Var = rectManager.TSizfFm2Yiuu;
        wq0.Companion.getClass();
        rectManager.a92UlCVFR9N8 = uj2Var.lS5Rgt96tfkO(0L, 0L, null, 0, 0);
        getRectManager().PxuCJdSBwIXG();
        st1 rectManager2 = getRectManager();
        a1 a1Var = rectManager2.rtx2ld2ELZv4;
        if (a1Var != null) {
            rectManager2.PxuCJdSBwIXG.removeCallbacks(a1Var);
            rectManager2.rtx2ld2ELZv4 = null;
        }
        ((qa0) getFocusOwner()).RAsUl2FVSrh6.wdg6QnbFHrFF(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        qa0 qa0Var = (qa0) getFocusOwner();
        f2.cpQdD2nAriOS(qa0Var.TSizfFm2Yiuu, true);
        if (qa0Var.a92UlCVFR9N8() != null) {
            ab0 a92UlCVFR9N8 = qa0Var.a92UlCVFR9N8();
            qa0Var.OPXfSBeufaJ8(null);
            if (a92UlCVFR9N8 != null) {
                a92UlCVFR9N8.X1HMmH2Ks65g(za0.rtx2ld2ELZv4, za0.wdg6QnbFHrFF);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.rxipThha848g = 0L;
        ryVscX7ZL4Ux();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        nLZGh9p8gVSu(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.rxipThha848g = 0L;
            this.qudtW7lwm99e.x50lh2ztY7Y5(this.fkblLSN2bAgv);
            this.yQRudnv4La6p = null;
            ryVscX7ZL4Ux();
            if (this.ngxnMNrpiKat != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        g51 g51Var = this.qudtW7lwm99e;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                gPXPFXrUH4XX(getRoot());
            }
            long wdg6QnbFHrFF = wdg6QnbFHrFF(i);
            long wdg6QnbFHrFF2 = wdg6QnbFHrFF(i2);
            rr.Companion.getClass();
            long PxuCJdSBwIXG = qr.PxuCJdSBwIXG((int) (wdg6QnbFHrFF >>> 32), (int) (wdg6QnbFHrFF & 4294967295L), (int) (wdg6QnbFHrFF2 >>> 32), (int) (4294967295L & wdg6QnbFHrFF2));
            rr rrVar = this.yQRudnv4La6p;
            if (rrVar == null) {
                this.yQRudnv4La6p = new rr(PxuCJdSBwIXG);
                this.KUoIVIumpKat = false;
            } else if (!rr.lS5Rgt96tfkO(rrVar.PxuCJdSBwIXG, PxuCJdSBwIXG)) {
                this.KUoIVIumpKat = true;
            }
            g51Var.RfyTYNmI9Srp(PxuCJdSBwIXG);
            g51Var.r3s1LDPKFs1S();
            setMeasuredDimension(getRoot().ryVscX7ZL4Ux.gPXPFXrUH4XX.rtx2ld2ELZv4, getRoot().ryVscX7ZL4Ux.gPXPFXrUH4XX.OPXfSBeufaJ8);
            if (this.ngxnMNrpiKat != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().ryVscX7ZL4Ux.gPXPFXrUH4XX.rtx2ld2ELZv4, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().ryVscX7ZL4Ux.gPXPFXrUH4XX.OPXfSBeufaJ8, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!RAsUl2FVSrh6() || viewStructure == null) {
            return;
        }
        r0 r0Var = this.wLFCmsViZrNT;
        if (r0Var != null) {
            vw0 vw0Var = r0Var.OPXfSBeufaJ8.PxuCJdSBwIXG;
            AutofillId autofillId = r0Var.r3s1LDPKFs1S;
            String str = r0Var.x50lh2ztY7Y5;
            st1 st1Var = r0Var.dgRBjINgWbAK;
            ng0.aF05bpZJlKEP(viewStructure, vw0Var, autofillId, str, st1Var);
            Object[] objArr = pe1.PxuCJdSBwIXG;
            p81 p81Var = new p81(2);
            p81Var.PxuCJdSBwIXG(vw0Var);
            p81Var.PxuCJdSBwIXG(viewStructure);
            while (p81Var.OPXfSBeufaJ8()) {
                Object dgRBjINgWbAK = p81Var.dgRBjINgWbAK(p81Var.lS5Rgt96tfkO - 1);
                dgRBjINgWbAK.getClass();
                ViewStructure viewStructure2 = (ViewStructure) dgRBjINgWbAK;
                Object dgRBjINgWbAK2 = p81Var.dgRBjINgWbAK(p81Var.lS5Rgt96tfkO - 1);
                dgRBjINgWbAK2.getClass();
                n81 n81Var = (n81) ((vw0) dgRBjINgWbAK2).r3s1LDPKFs1S();
                int i2 = ((f91) n81Var.OPXfSBeufaJ8).wdg6QnbFHrFF;
                for (int i3 = 0; i3 < i2; i3++) {
                    vw0 vw0Var2 = (vw0) n81Var.get(i3);
                    if (!vw0Var2.xbgXKYA2cIfu && vw0Var2.J54yh1s3n4Aq() && vw0Var2.EpkonXwzFgDB()) {
                        z22 S2OOm9zPNm0h = vw0Var2.S2OOm9zPNm0h();
                        if (S2OOm9zPNm0h != null) {
                            v81 v81Var = S2OOm9zPNm0h.rtx2ld2ELZv4;
                            if (v81Var.lS5Rgt96tfkO(y22.RAsUl2FVSrh6) || v81Var.lS5Rgt96tfkO(y22.rtx2ld2ELZv4) || v81Var.lS5Rgt96tfkO(h32.XL4ISE6Oc65B) || v81Var.lS5Rgt96tfkO(h32.RfyTYNmI9Srp)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                ng0.aF05bpZJlKEP(newChild, vw0Var2, r0Var.r3s1LDPKFs1S, str, st1Var);
                                p81Var.PxuCJdSBwIXG(vw0Var2);
                                p81Var.PxuCJdSBwIXG(newChild);
                            }
                        }
                        p81Var.PxuCJdSBwIXG(vw0Var2);
                        p81Var.PxuCJdSBwIXG(viewStructure2);
                    }
                }
            }
        }
        e0 e0Var = this.zf8DYfih6EZu;
        if (e0Var != null) {
            ob obVar = (ob) e0Var.wdg6QnbFHrFF;
            LinkedHashMap linkedHashMap = obVar.PxuCJdSBwIXG;
            LinkedHashMap linkedHashMap2 = obVar.PxuCJdSBwIXG;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    u9.VhhvGxCb8gfr();
                    return;
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId((AutofillId) e0Var.x50lh2ztY7Y5, intValue);
                newChild2.setId(intValue, ((r1) e0Var.OPXfSBeufaJ8).getContext().getPackageName(), null, null);
                bs.Companion.getClass();
                newChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        yn1 yn1Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (yn1Var = ((m1) getPointerIconService()).PxuCJdSBwIXG) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return yn1Var instanceof b5 ? PointerIcon.getSystemIcon(context, ((b5) yn1Var).PxuCJdSBwIXG) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.wdg6QnbFHrFF) {
            int[] iArr = ka0.PxuCJdSBwIXG;
            cw0 cw0Var = cw0.rtx2ld2ELZv4;
            cw0 cw0Var2 = i != 0 ? i != 1 ? null : cw0.OPXfSBeufaJ8 : cw0Var;
            if (cw0Var2 != null) {
                cw0Var = cw0Var2;
            }
            setLayoutDirection(cw0Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        i2 i2Var;
        if (Build.VERSION.SDK_INT < 31 || (i2Var = this.qYgDo2Ye5PY7) == null) {
            return;
        }
        g32 semanticsOwner = getSemanticsOwner();
        hu coroutineContext = getCoroutineContext();
        f91 f91Var = new f91(new j02[16]);
        ni0.bEKsvqmvPh2y(semanticsOwner.PxuCJdSBwIXG(), 0, new i02(1, 8, f91.class, f91Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(f91Var.rtx2ld2ELZv4, 0, f91Var.wdg6QnbFHrFF, new om(0, new le0[]{gi1.BRwzKIf41E4i, gi1.XL4ISE6Oc65B}));
        int i = f91Var.wdg6QnbFHrFF;
        j02 j02Var = (j02) (i == 0 ? null : f91Var.rtx2ld2ELZv4[i - 1]);
        if (j02Var == null) {
            return;
        }
        dr0 dr0Var = j02Var.TSizfFm2Yiuu;
        qo qoVar = new qo(j02Var.PxuCJdSBwIXG, dr0Var, cs0.Y1f8riQaR6yg(coroutineContext), i2Var, this);
        pd1 pd1Var = j02Var.Y1f8riQaR6yg;
        long j = (dr0Var.PxuCJdSBwIXG << 32) | (dr0Var.lS5Rgt96tfkO & 4294967295L);
        ScrollCaptureTarget OPXfSBeufaJ8 = b2.OPXfSBeufaJ8(this, vi0.IXK6ba3ucyzm(xi0.wLFCmsViZrNT(kj0.ZbWwgt3aGe7A(pd1Var).nLZGh9p8gVSu(pd1Var, true))), new Point((int) (j >> 32), (int) (j & 4294967295L)), qoVar);
        OPXfSBeufaJ8.setScrollBounds(vi0.IXK6ba3ucyzm(dr0Var));
        consumer.accept(OPXfSBeufaJ8);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ryVscX7ZL4Ux();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        int i;
        if (z) {
            rp0.Companion.getClass();
            i = 1;
        } else {
            rp0.Companion.getClass();
            i = 2;
        }
        this.mFd1aGiJX24N.PxuCJdSBwIXG.setValue(new rp0(i));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        o2 o2Var = this.tmVwIGCQF4zR;
        o2Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (cs0.wdg6QnbFHrFF(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            ov2.IAToe7bXGz4N(o2Var, longSparseArray);
        } else {
            o2Var.rtx2ld2ELZv4.post(new l2(0, o2Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        this.MDTGUQSX7PXD = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30) {
            return;
        }
        Companion.getClass();
        boolean PxuCJdSBwIXG = c1.PxuCJdSBwIXG();
        if (getShowLayoutBounds() != PxuCJdSBwIXG) {
            setShowLayoutBounds(PxuCJdSBwIXG);
            QrzZRwfaDlRX(getRoot());
        }
    }

    public final void ozEBbv0hFTAB(vw0 vw0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (vw0Var != null) {
            while (vw0Var != null && vw0Var.XL4ISE6Oc65B() == tw0.rtx2ld2ELZv4) {
                if (!this.KUoIVIumpKat) {
                    vw0 S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
                    if (S9EYkSpbGuxq == null) {
                        break;
                    }
                    long j = S9EYkSpbGuxq.nLZGh9p8gVSu.TSizfFm2Yiuu.dgRBjINgWbAK;
                    if (rr.a92UlCVFR9N8(j) && rr.e9gEMXR7LXtO(j)) {
                        break;
                    }
                }
                vw0Var = vw0Var.S9EYkSpbGuxq();
            }
            if (vw0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void pnx5pC0XzaCw() {
        p81 p81Var;
        r0 r0Var;
        Object[] objArr;
        if (this.xbgXKYA2cIfu) {
            f82 f82Var = getSnapshotObserver().PxuCJdSBwIXG;
            synchronized (f82Var.RAsUl2FVSrh6) {
                try {
                    f91 f91Var = f82Var.a92UlCVFR9N8;
                    int i = f91Var.wdg6QnbFHrFF;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = f91Var.rtx2ld2ELZv4;
                        if (i2 >= i) {
                            break;
                        }
                        e82 e82Var = (e82) objArr[i2];
                        e82Var.Y1f8riQaR6yg();
                        if (!e82Var.a92UlCVFR9N8.wdg6QnbFHrFF()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = f91Var.rtx2ld2ELZv4;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    f91Var.wdg6QnbFHrFF = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.xbgXKYA2cIfu = false;
        }
        b7 b7Var = this.ngxnMNrpiKat;
        if (b7Var != null) {
            rtx2ld2ELZv4(b7Var);
        }
        if (RAsUl2FVSrh6() && (r0Var = this.wLFCmsViZrNT) != null) {
            d81 d81Var = r0Var.QrzZRwfaDlRX;
            if (d81Var.Y1f8riQaR6yg == 0 && r0Var.gPXPFXrUH4XX) {
                ((AutofillManager) r0Var.rtx2ld2ELZv4.OPXfSBeufaJ8).commit();
                r0Var.gPXPFXrUH4XX = false;
            }
            if (d81Var.Y1f8riQaR6yg != 0) {
                r0Var.gPXPFXrUH4XX = true;
            }
        }
        while (this.wnqUPcAvl7HT.OPXfSBeufaJ8() && this.wnqUPcAvl7HT.a92UlCVFR9N8(0) != null) {
            int i5 = this.wnqUPcAvl7HT.lS5Rgt96tfkO;
            int i6 = 0;
            while (true) {
                p81Var = this.wnqUPcAvl7HT;
                if (i6 < i5) {
                    ae0 ae0Var = (ae0) p81Var.a92UlCVFR9N8(i6);
                    this.wnqUPcAvl7HT.r3s1LDPKFs1S(i6, null);
                    if (ae0Var != null) {
                        ae0Var.PxuCJdSBwIXG();
                    }
                    i6++;
                }
            }
            p81Var.x50lh2ztY7Y5(0, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:103:0x0056, B:109:0x0062, B:112:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r3s1LDPKFs1S(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        r1 r1Var;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        wj0 wj0Var;
        removeCallbacks(this.MBpAROcyNHKN);
        try {
            rZjpSjn4zoMv(motionEvent);
            this.hVNtCUZb4tYH = true;
            S2OOm9zPNm0h(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.OYiFbU3x63rc;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                uj ujVar = this.gGoUzNp9JO5I;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!ujVar.PxuCJdSBwIXG) {
                                        ((p31) ((i2) ujVar.Y1f8riQaR6yg).OPXfSBeufaJ8).PxuCJdSBwIXG();
                                        ((wj0) ujVar.TSizfFm2Yiuu).TSizfFm2Yiuu();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    EpkonXwzFgDB(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && RfyTYNmI9Srp(motionEvent)) {
                                    r1Var = this;
                                    r1Var.EpkonXwzFgDB(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    r1Var = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = r1Var.OYiFbU3x63rc;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = r1Var.OYiFbU3x63rc;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    y61 y61Var = r1Var.Pf0ThKz3j5YS;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = r1Var.OYiFbU3x63rc;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = r1Var.OYiFbU3x63rc;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = r1Var.OYiFbU3x63rc;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    y61Var.TSizfFm2Yiuu.delete(pointerId);
                                                    y61Var.lS5Rgt96tfkO.delete(pointerId);
                                                }
                                                wj0Var = (wj0) ujVar.TSizfFm2Yiuu;
                                                if (wj0Var.Y1f8riQaR6yg) {
                                                    wj0Var.RAsUl2FVSrh6.PxuCJdSBwIXG.RAsUl2FVSrh6();
                                                } else {
                                                    wj0Var.Y1f8riQaR6yg = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        y61Var.TSizfFm2Yiuu.delete(pointerId);
                                        y61Var.lS5Rgt96tfkO.delete(pointerId);
                                    }
                                }
                                r1Var.OYiFbU3x63rc = MotionEvent.obtainNoHistory(motionEvent);
                                int J54yh1s3n4Aq = J54yh1s3n4Aq(motionEvent);
                                Trace.endSection();
                                r1Var.hVNtCUZb4tYH = false;
                                return J54yh1s3n4Aq;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z3) {
                }
                r1Var = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = r1Var.OYiFbU3x63rc;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = r1Var.OYiFbU3x63rc;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    y61 y61Var2 = r1Var.Pf0ThKz3j5YS;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = r1Var.OYiFbU3x63rc;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = r1Var.OYiFbU3x63rc;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = r1Var.OYiFbU3x63rc;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        wj0Var = (wj0) ujVar.TSizfFm2Yiuu;
                        if (wj0Var.Y1f8riQaR6yg) {
                        }
                    }
                }
                r1Var.OYiFbU3x63rc = MotionEvent.obtainNoHistory(motionEvent);
                int J54yh1s3n4Aq2 = J54yh1s3n4Aq(motionEvent);
                Trace.endSection();
                r1Var.hVNtCUZb4tYH = false;
                return J54yh1s3n4Aq2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.hVNtCUZb4tYH = false;
            throw th3;
        }
    }

    public final void rZjpSjn4zoMv(MotionEvent motionEvent) {
        this.rxipThha848g = AnimationUtils.currentAnimationTimeMillis();
        mh mhVar = this.Yadk4uqlxLy8;
        float[] fArr = this.JTxCbbCwomzt;
        mhVar.PxuCJdSBwIXG(this, fArr);
        jh0.S2OOm9zPNm0h(fArr, this.VzNxmvWisHL1);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long lS5Rgt96tfkO = d51.lS5Rgt96tfkO((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (lS5Rgt96tfkO >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (lS5Rgt96tfkO & 4294967295L));
        this.uVlwi32qvXeJ = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        int i3 = 1;
        if (!isFocused()) {
            ga0 lS5Rgt96tfkO = ka0.lS5Rgt96tfkO(i);
            if (lS5Rgt96tfkO != null) {
                i2 = lS5Rgt96tfkO.PxuCJdSBwIXG;
            } else {
                ga0.Companion.getClass();
                i2 = 7;
            }
            Boolean e9gEMXR7LXtO = ((qa0) getFocusOwner()).e9gEMXR7LXtO(i2, rect != null ? new qt1(rect.left, rect.top, rect.right, rect.bottom) : null, new n1(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!cs0.wdg6QnbFHrFF(e9gEMXR7LXtO, bool)) {
                if (!cs0.wdg6QnbFHrFF(((qa0) getFocusOwner()).e9gEMXR7LXtO(i2, null, new n1(i2, i3)), bool)) {
                    if (hasFocus() && ov2.tmVwIGCQF4zR(i2)) {
                        return ((qa0) getFocusOwner()).rtx2ld2ELZv4(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ryVscX7ZL4Ux() {
        boolean z;
        View view;
        float[] fArr;
        int i;
        int[] iArr = this.D0aTLcX6Uhyo;
        getLocationOnScreen(iArr);
        long j = this.jJwa0q7P5wHq;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.rxipThha848g < 0) {
            this.jJwa0q7P5wHq = (4294967295L & iArr[1]) | (i4 << 32);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                f91 pnx5pC0XzaCw = getRoot().pnx5pC0XzaCw();
                Object[] objArr = pnx5pC0XzaCw.rtx2ld2ELZv4;
                int i5 = pnx5pC0XzaCw.wdg6QnbFHrFF;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((vw0) objArr[i6]).ryVscX7ZL4Ux.gPXPFXrUH4XX.OYiFbU3x63rc();
                }
                z = true;
                kpCQ9veP6n3I();
                view = this.TVHukqbqS4tB;
                if (view == null) {
                    view = getRootView();
                    this.TVHukqbqS4tB = view;
                }
                st1 rectManager = getRectManager();
                long j2 = this.jJwa0q7P5wHq;
                long wLFCmsViZrNT = vi0.wLFCmsViZrNT(this.uVlwi32qvXeJ);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.JTxCbbCwomzt;
                if (fArr.length >= 16) {
                    i = 0;
                } else {
                    i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
                }
                uj2 uj2Var = rectManager.TSizfFm2Yiuu;
                if ((i & 2) != 0) {
                    fArr = null;
                }
                rectManager.a92UlCVFR9N8 = !uj2Var.lS5Rgt96tfkO(j2, wLFCmsViZrNT, fArr, width, height) || rectManager.a92UlCVFR9N8;
                this.qudtW7lwm99e.lS5Rgt96tfkO(z);
                getRectManager().PxuCJdSBwIXG();
            }
        }
        z = false;
        kpCQ9veP6n3I();
        view = this.TVHukqbqS4tB;
        if (view == null) {
        }
        st1 rectManager2 = getRectManager();
        long j22 = this.jJwa0q7P5wHq;
        long wLFCmsViZrNT2 = vi0.wLFCmsViZrNT(this.uVlwi32qvXeJ);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.JTxCbbCwomzt;
        if (fArr.length >= 16) {
        }
        uj2 uj2Var2 = rectManager2.TSizfFm2Yiuu;
        if ((i & 2) != 0) {
        }
        rectManager2.a92UlCVFR9N8 = !uj2Var2.lS5Rgt96tfkO(j22, wLFCmsViZrNT2, fArr, width2, height2) || rectManager2.a92UlCVFR9N8;
        this.qudtW7lwm99e.lS5Rgt96tfkO(z);
        getRectManager().PxuCJdSBwIXG();
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.ozEBbv0hFTAB.QrzZRwfaDlRX = j;
    }

    public final void setComposeViewContext(dp dpVar) {
        if (getCoroutineContext() != dpVar.lS5Rgt96tfkO.wdg6QnbFHrFF() && !((n81) getRoot().r3s1LDPKFs1S()).isEmpty()) {
            ep0.PxuCJdSBwIXG("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        j72.Companion.getClass();
        j72 PxuCJdSBwIXG = i72.PxuCJdSBwIXG();
        le0 e9gEMXR7LXtO = PxuCJdSBwIXG != null ? PxuCJdSBwIXG.e9gEMXR7LXtO() : null;
        j72 lS5Rgt96tfkO = i72.lS5Rgt96tfkO(PxuCJdSBwIXG);
        try {
            dp dpVar2 = get_composeViewContext();
            if (dpVar != dpVar2) {
                if (isAttachedToWindow()) {
                    dpVar2.lS5Rgt96tfkO();
                    dpVar.TSizfFm2Yiuu();
                }
                set_composeViewContext(dpVar);
                setCoroutineContext(dpVar.lS5Rgt96tfkO.wdg6QnbFHrFF());
            }
        } finally {
            i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.FT2GK7JK5Ma2 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.POWyO8hTM6YC.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(o2 o2Var) {
        this.tmVwIGCQF4zR = o2Var;
    }

    public void setCoroutineContext(hu huVar) {
        this.S9EYkSpbGuxq = huVar;
    }

    public final void setFrameEndScheduler$ui(t01 t01Var) {
        this.cpQdD2nAriOS = t01Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.rxipThha848g = j;
    }

    public final void setOnReadyForComposition(le0 le0Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.FT2GK7JK5Ma2) {
            le0Var.OPXfSBeufaJ8(getComposeViewContext());
        } else {
            this.Nlhe969cAGO8 = le0Var;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m12setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(do0 do0Var) {
        this.dgRBjINgWbAK = do0Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.bEKsvqmvPh2y = z;
    }

    public void setUncaughtExceptionHandler(gx1 gx1Var) {
        this.qudtW7lwm99e.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long tmVwIGCQF4zR(long j) {
        kpCQ9veP6n3I();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.uVlwi32qvXeJ >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.uVlwi32qvXeJ & 4294967295L));
        return d51.lS5Rgt96tfkO((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.VzNxmvWisHL1);
    }

    public final void x50lh2ztY7Y5(vw0 vw0Var, boolean z) {
        this.qudtW7lwm99e.RAsUl2FVSrh6(vw0Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void xfACYKDMU6Dj(pe0 pe0Var, ct ctVar) {
        q1 q1Var;
        int i;
        if (ctVar instanceof q1) {
            q1Var = (q1) ctVar;
            int i2 = q1Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q1Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                Object obj = q1Var.dgRBjINgWbAK;
                i = q1Var.cpQdD2nAriOS;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l1 l1Var = new l1(this, 2);
                    q1Var.cpQdD2nAriOS = 1;
                    if (cs0.XL4ISE6Oc65B(new e4(l1Var, this.iSxsmagYqzHM, pe0Var, null, 11), q1Var) == su.rtx2ld2ELZv4) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                u9.Y1f8riQaR6yg();
            }
        }
        q1Var = new q1(this, ctVar);
        Object obj2 = q1Var.dgRBjINgWbAK;
        i = q1Var.cpQdD2nAriOS;
        if (i != 0) {
        }
        u9.Y1f8riQaR6yg();
    }

    public n0 getAccessibilityManager() {
        return this.J54yh1s3n4Aq;
    }

    public x0 getClipboard() {
        return this.IXK6ba3ucyzm;
    }

    public y0 getClipboardManager() {
        return this.nxJAScVArhE9;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public g3 m16getDragAndDropManager() {
        return this.VhhvGxCb8gfr;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public c81 m17getLayoutNodes() {
        return this.kpCQ9veP6n3I;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @ny
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m10getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @ny
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public hx1 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(gx1 gx1Var) {
    }
}
