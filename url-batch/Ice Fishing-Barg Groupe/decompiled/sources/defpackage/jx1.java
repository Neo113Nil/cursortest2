package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jx1 implements te, gu, jb2, y72, pe, ox, x9, z9, pk2, hs, gt {
    public static jx1 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public static final jx1 wdg6QnbFHrFF = new jx1(1);
    public static final jx1 dgRBjINgWbAK = new jx1(2);
    public static final /* synthetic */ jx1 x50lh2ztY7Y5 = new jx1(3);
    public static final jx1 cpQdD2nAriOS = new jx1(4);
    public static final jx1 r3s1LDPKFs1S = new jx1(5);
    public static final jx1 QrzZRwfaDlRX = new jx1(6);
    public static final /* synthetic */ jx1 gPXPFXrUH4XX = new jx1(7);
    public static final jx1 BRwzKIf41E4i = new jx1(8);
    public static final /* synthetic */ jx1 XL4ISE6Oc65B = new jx1(9);
    public static final jx1 RfyTYNmI9Srp = new jx1(10);
    public static final jx1 EcgxDIVH5in8 = new jx1(11);
    public static final jx1 S9EYkSpbGuxq = new jx1(12);
    public static final jx1 VhhvGxCb8gfr = new jx1(13);
    public static final jx1 S2OOm9zPNm0h = new jx1(14);
    public static final jx1 ZbWwgt3aGe7A = new jx1(15);
    public static final jx1 pnx5pC0XzaCw = new jx1(16);

    public /* synthetic */ jx1(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // defpackage.jb2
    public boolean OPXfSBeufaJ8(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.x9, defpackage.z9
    public float PxuCJdSBwIXG() {
        return 0.0f;
    }

    @Override // defpackage.te
    public Rect RAsUl2FVSrh6(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            te.Companion.getClass();
            Log.w(se.lS5Rgt96tfkO, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (v6yxfmkxNKhL.VhhvGxCb8gfr(obj2)) {
                    displayCutout = v6yxfmkxNKhL.Y1f8riQaR6yg(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                te.Companion.getClass();
                Log.w(se.lS5Rgt96tfkO, e2);
            }
            if (displayCutout != null) {
                int i3 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i3 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i4 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i4 == safeInsetRight) {
                    int i5 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i5;
                }
                int i6 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i6 == safeInsetTop) {
                    rect.top = 0;
                }
                int i7 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i7 == safeInsetBottom) {
                    int i8 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i8;
                }
            }
        }
        return rect;
    }

    @Override // defpackage.y72
    public boolean TSizfFm2Yiuu(Object obj, Object obj2) {
        switch (this.rtx2ld2ELZv4) {
            case 12:
                return obj == obj2;
            default:
                return cs0.wdg6QnbFHrFF(obj, obj2);
        }
    }

    @Override // defpackage.ox
    public h82 Y1f8riQaR6yg(SSLSocket sSLSocket) {
        a6 a6Var = b6.Companion;
        Class<?> cls = sSLSocket.getClass();
        a6Var.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new b6(cls2);
    }

    @Override // defpackage.pe
    public long a92UlCVFR9N8(of0 of0Var, int i) {
        String str = ((ji2) of0Var.e9gEMXR7LXtO).PxuCJdSBwIXG.PxuCJdSBwIXG.OPXfSBeufaJ8;
        return jh0.rtx2ld2ELZv4(kj0.EcgxDIVH5in8(str, i), kj0.RfyTYNmI9Srp(str, i));
    }

    public n61 cpQdD2nAriOS(n61 n61Var, s sVar) {
        return n61Var.TSizfFm2Yiuu(new ve((pd) sVar, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r2 == defpackage.fp.lS5Rgt96tfkO) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dgRBjINgWbAK(Drawable drawable, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(257732500);
        int i2 = (tf0Var.rtx2ld2ELZv4(drawable) ? 4 : 2) | i;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 3) != 2)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            n61 a92UlCVFR9N8 = c62.a92UlCVFR9N8(n61.Companion, ts.e9gEMXR7LXtO);
            boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(drawable);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv4) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new xw1(10, drawable);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            xe.PxuCJdSBwIXG(fx1.ozEBbv0hFTAB(a92UlCVFR9N8, (le0) nLZGh9p8gVSu), tf0Var, 0);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new bf(i, 18, this, drawable);
        }
    }

    @Override // defpackage.jb2
    public void e9gEMXR7LXtO(ib2 ib2Var) {
        ib2Var.clear();
    }

    @Override // defpackage.ox
    public boolean lS5Rgt96tfkO(SSLSocket sSLSocket) {
        return pa2.yQRudnv4La6p(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.x9
    public void rtx2ld2ELZv4(hy hyVar, int i, int[] iArr, cw0 cw0Var, int[] iArr2) {
        if (cw0Var == cw0.rtx2ld2ELZv4) {
            f2.EpkonXwzFgDB(i, iArr, iArr2, false);
        } else {
            f2.EpkonXwzFgDB(i, iArr, iArr2, true);
        }
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 12:
                return "ReferentialEqualityPolicy";
            case 14:
                return "StructuralEqualityPolicy";
            case 21:
                return "Arrangement#SpaceBetween";
            case 23:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.z9
    public void wdg6QnbFHrFF(int i, l51 l51Var, int[] iArr, int[] iArr2) {
        f2.EpkonXwzFgDB(i, iArr, iArr2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r2 == defpackage.fp.lS5Rgt96tfkO) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x50lh2ztY7Y5(final Icon icon, hp hpVar, final int i) {
        zs1 XL4ISE6Oc65B2;
        pe0 pe0Var;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(2116504409);
        int i2 = (tf0Var.rtx2ld2ELZv4(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Context context = (Context) tf0Var.wdg6QnbFHrFF(h2.lS5Rgt96tfkO);
            boolean a92UlCVFR9N8 = tf0Var.a92UlCVFR9N8(icon) | tf0Var.a92UlCVFR9N8(context);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!a92UlCVFR9N8) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = icon.loadDrawable(context);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            Drawable drawable = (Drawable) nLZGh9p8gVSu;
            if (drawable == null) {
                XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
                if (XL4ISE6Oc65B2 != null) {
                    pe0Var = new pe0(this, icon, i, i3) { // from class: xe2
                        public final /* synthetic */ jx1 OPXfSBeufaJ8;
                        public final /* synthetic */ int rtx2ld2ELZv4;
                        public final /* synthetic */ Icon wdg6QnbFHrFF;

                        {
                            this.rtx2ld2ELZv4 = i3;
                            this.OPXfSBeufaJ8 = this;
                        }

                        @Override // defpackage.pe0
                        public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                            int i5 = this.rtx2ld2ELZv4;
                            no2 no2Var = no2.PxuCJdSBwIXG;
                            Icon icon2 = this.wdg6QnbFHrFF;
                            jx1 jx1Var = this.OPXfSBeufaJ8;
                            hp hpVar2 = (hp) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    jx1Var.x50lh2ztY7Y5(icon2, hpVar2, ki0.bEKsvqmvPh2y(49));
                                    break;
                                default:
                                    jx1Var.x50lh2ztY7Y5(icon2, hpVar2, ki0.bEKsvqmvPh2y(49));
                                    break;
                            }
                            return no2Var;
                        }
                    };
                    XL4ISE6Oc65B2.Y1f8riQaR6yg = pe0Var;
                }
                return;
            }
            dgRBjINgWbAK(drawable, tf0Var, 48);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            pe0Var = new pe0(this, icon, i, i4) { // from class: xe2
                public final /* synthetic */ jx1 OPXfSBeufaJ8;
                public final /* synthetic */ int rtx2ld2ELZv4;
                public final /* synthetic */ Icon wdg6QnbFHrFF;

                {
                    this.rtx2ld2ELZv4 = i4;
                    this.OPXfSBeufaJ8 = this;
                }

                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    int i5 = this.rtx2ld2ELZv4;
                    no2 no2Var = no2.PxuCJdSBwIXG;
                    Icon icon2 = this.wdg6QnbFHrFF;
                    jx1 jx1Var = this.OPXfSBeufaJ8;
                    hp hpVar2 = (hp) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            jx1Var.x50lh2ztY7Y5(icon2, hpVar2, ki0.bEKsvqmvPh2y(49));
                            break;
                        default:
                            jx1Var.x50lh2ztY7Y5(icon2, hpVar2, ki0.bEKsvqmvPh2y(49));
                            break;
                    }
                    return no2Var;
                }
            };
            XL4ISE6Oc65B2.Y1f8riQaR6yg = pe0Var;
        }
    }
}
