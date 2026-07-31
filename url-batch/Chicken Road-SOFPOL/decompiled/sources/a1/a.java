package a1;

import a0.a0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d0;
import androidx.lifecycle.o;
import androidx.lifecycle.w;
import c6.m;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import d4.v;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import o.t0;
import o.x;
import u2.p;
import x.v0;
import x1.t;
import z5.k;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f188e;

    public /* synthetic */ a(int i, Object obj) {
        this.f187d = i;
        this.f188e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0335 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i8;
        boolean z3;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z7;
        boolean z8 = false;
        switch (this.f187d) {
            case 0:
                h hVar = (h) this.f188e;
                boolean h8 = hVar.h();
                t tVar = hVar.f201d;
                if (h8) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        tVar.s(true);
                        x xVar = hVar.f211o;
                        int[] iArr = xVar.f5495b;
                        long[] jArr = xVar.f5494a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i9 = 0;
                            while (true) {
                                long j7 = jArr[i9];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8;
                                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                                    int i12 = 0;
                                    while (i12 < i11) {
                                        if ((255 & j7) < 128) {
                                            int i13 = iArr[(i9 << 3) + i12];
                                            if (!hVar.g().a(i13)) {
                                                i = i10;
                                                i8 = i12;
                                                hVar.f204g.add(new i(i13, hVar.f210n, j.f220e, null));
                                                hVar.f207k.t(m.f1757a);
                                                j7 >>= i;
                                                i12 = i8 + 1;
                                                i10 = i;
                                            }
                                        }
                                        i = i10;
                                        i8 = i12;
                                        j7 >>= i;
                                        i12 = i8 + 1;
                                        i10 = i;
                                    }
                                    if (i11 != i10) {
                                    }
                                }
                                if (i9 != length) {
                                    i9++;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        hVar.j(tVar.getSemanticsOwner().a(), hVar.f212p);
                        Trace.endSection();
                        hVar.f(hVar.g());
                        hVar.n();
                        hVar.f213q = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            case 1:
                d0 d0Var = (d0) this.f188e;
                w wVar = d0Var.i;
                if (d0Var.f817e == 0) {
                    z3 = true;
                    d0Var.f818f = true;
                    wVar.d(o.ON_PAUSE);
                } else {
                    z3 = true;
                }
                if (d0Var.f816d == 0 && d0Var.f818f) {
                    wVar.d(o.ON_STOP);
                    d0Var.f819g = z3;
                    return;
                }
                return;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                b.j jVar = (b.j) this.f188e;
                Runnable runnable = jVar.f977e;
                if (runnable != null) {
                    runnable.run();
                    jVar.f977e = null;
                    return;
                }
                return;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                p.d((p) this.f188e);
                return;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                c4.c cVar = (c4.c) ((c4.c) this.f188e).f1617c.f1050e;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = cVar.f1616b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i14 = 0;
                while (i14 < arrayList3.size()) {
                    c4.f fVar = (c4.f) arrayList3.get(i14);
                    if (fVar != null) {
                        t0 t0Var = cVar.f1615a;
                        Long l3 = (Long) t0Var.get(fVar);
                        if (l3 != null) {
                            if (l3.longValue() < uptimeMillis2) {
                                t0Var.remove(fVar);
                            }
                        }
                        long j8 = fVar.f1637f;
                        if (j8 == 0) {
                            fVar.f1637f = uptimeMillis;
                            fVar.c(fVar.f1633b);
                        } else {
                            long j9 = uptimeMillis - j8;
                            fVar.f1637f = uptimeMillis;
                            float f6 = c4.f.b().f1621g;
                            long j10 = f6 == 0.0f ? 2147483647L : (long) (j9 / f6);
                            if (fVar.f1642l) {
                                float f8 = fVar.f1641k;
                                if (f8 != Float.MAX_VALUE) {
                                    arrayList2 = arrayList3;
                                    fVar.f1640j.i = f8;
                                    fVar.f1641k = Float.MAX_VALUE;
                                } else {
                                    arrayList2 = arrayList3;
                                }
                                fVar.f1633b = (float) fVar.f1640j.i;
                                fVar.f1632a = 0.0f;
                                fVar.f1642l = z8;
                            } else {
                                arrayList2 = arrayList3;
                                if (fVar.f1641k != Float.MAX_VALUE) {
                                    long j11 = j10 / 2;
                                    c4.e a8 = fVar.f1640j.a(fVar.f1633b, fVar.f1632a, j11);
                                    c4.g gVar = fVar.f1640j;
                                    gVar.i = fVar.f1641k;
                                    fVar.f1641k = Float.MAX_VALUE;
                                    c4.e a9 = gVar.a(a8.f1624a, a8.f1625b, j11);
                                    fVar.f1633b = a9.f1624a;
                                    fVar.f1632a = a9.f1625b;
                                } else {
                                    c4.e a10 = fVar.f1640j.a(fVar.f1633b, fVar.f1632a, j10);
                                    fVar.f1633b = a10.f1624a;
                                    fVar.f1632a = a10.f1625b;
                                }
                                float max = Math.max(fVar.f1633b, -3.4028235E38f);
                                fVar.f1633b = max;
                                fVar.f1633b = Math.min(max, Float.MAX_VALUE);
                                float f9 = fVar.f1632a;
                                c4.g gVar2 = fVar.f1640j;
                                gVar2.getClass();
                                if (Math.abs(f9) >= gVar2.f1647e || Math.abs(r2 - ((float) gVar2.i)) >= gVar2.f1646d) {
                                    z7 = false;
                                    float min = Math.min(fVar.f1633b, Float.MAX_VALUE);
                                    fVar.f1633b = min;
                                    float max2 = Math.max(min, -3.4028235E38f);
                                    fVar.f1633b = max2;
                                    fVar.c(max2);
                                    if (z7) {
                                        continue;
                                    } else {
                                        ArrayList arrayList4 = fVar.f1639h;
                                        fVar.f1636e = false;
                                        c4.c b8 = c4.f.b();
                                        b8.f1615a.remove(fVar);
                                        ArrayList arrayList5 = b8.f1616b;
                                        int indexOf = arrayList5.indexOf(fVar);
                                        if (indexOf >= 0) {
                                            arrayList5.set(indexOf, null);
                                            b8.f1620f = true;
                                        }
                                        fVar.f1637f = 0L;
                                        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                            if (arrayList4.get(i15) != null) {
                                                arrayList4.get(i15).getClass();
                                                throw new ClassCastException();
                                            }
                                        }
                                        for (int size = arrayList4.size() - 1; size >= 0; size--) {
                                            if (arrayList4.get(size) == null) {
                                                arrayList4.remove(size);
                                            }
                                        }
                                    }
                                    i14++;
                                    arrayList3 = arrayList2;
                                    z8 = false;
                                } else {
                                    fVar.f1633b = (float) fVar.f1640j.i;
                                    fVar.f1632a = 0.0f;
                                }
                            }
                            z7 = true;
                            float min2 = Math.min(fVar.f1633b, Float.MAX_VALUE);
                            fVar.f1633b = min2;
                            float max22 = Math.max(min2, -3.4028235E38f);
                            fVar.f1633b = max22;
                            fVar.c(max22);
                            if (z7) {
                            }
                            i14++;
                            arrayList3 = arrayList2;
                            z8 = false;
                        }
                    }
                    arrayList2 = arrayList3;
                    i14++;
                    arrayList3 = arrayList2;
                    z8 = false;
                }
                ArrayList arrayList6 = arrayList3;
                if (cVar.f1620f) {
                    int size2 = arrayList6.size() - 1;
                    while (size2 >= 0) {
                        ArrayList arrayList7 = arrayList6;
                        if (arrayList7.get(size2) == null) {
                            arrayList7.remove(size2);
                        }
                        size2--;
                        arrayList6 = arrayList7;
                    }
                    arrayList = arrayList6;
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        a0 a0Var = cVar.f1622h;
                        ValueAnimator.unregisterDurationScaleChangeListener((c4.a) a0Var.f11e);
                        a0Var.f11e = null;
                    }
                    cVar.f1620f = false;
                } else {
                    arrayList = arrayList6;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) cVar.f1619e.f11e).postFrameCallback(new c4.b(cVar.f1618d));
                    return;
                }
                return;
            case 5:
                v vVar = (v) this.f188e;
                synchronized (vVar.f2294d) {
                    try {
                        if (vVar.f2298h == null) {
                            return;
                        }
                        try {
                            n3.h c8 = vVar.c();
                            int i16 = c8.f5364f;
                            if (i16 == 2) {
                                synchronized (vVar.f2294d) {
                                }
                            }
                            if (i16 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i16 + ")");
                            }
                            try {
                                int i17 = m3.b.f5221a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                w5.f fVar2 = vVar.f2293c;
                                Context context = vVar.f2291a;
                                fVar2.getClass();
                                n3.h[] hVarArr = {c8};
                                h0.a aVar = i3.g.f3428a;
                                a.a.e("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface t3 = i3.g.f3428a.t(context, hVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer H = m.a.H(vVar.f2291a, c8.f5359a);
                                    if (H == null || t3 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        c5.x xVar2 = new c5.x(t3, a.a.w(H));
                                        Trace.endSection();
                                        synchronized (vVar.f2294d) {
                                            try {
                                                a.a aVar2 = vVar.f2298h;
                                                if (aVar2 != null) {
                                                    aVar2.u(xVar2);
                                                }
                                            } finally {
                                            }
                                        }
                                        vVar.b();
                                        return;
                                    } finally {
                                        int i18 = m3.b.f5221a;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th2) {
                            synchronized (vVar.f2294d) {
                                try {
                                    a.a aVar3 = vVar.f2298h;
                                    if (aVar3 != null) {
                                        aVar3.t(th2);
                                    }
                                    vVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 6:
                i0.e.setRippleState$lambda$2((i0.e) this.f188e);
                return;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                MaterialButton.a((MaterialButton) this.f188e);
                return;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                ((CarouselLayoutManager) this.f188e).W();
                return;
            case v0.f8304b /* 9 */:
                View view = (View) this.f188e;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case v0.f8306d /* 10 */:
                t tVar2 = (t) this.f188e;
                tVar2.B0 = false;
                MotionEvent motionEvent = tVar2.f8576t0;
                q6.i.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                tVar2.F(motionEvent);
                return;
            case 11:
                d1.o oVar = (d1.o) this.f188e;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    oVar.b();
                    return;
                } finally {
                }
            case 12:
                x1.a0 a0Var2 = (x1.a0) this.f188e;
                Trace.beginSection("measureAndLayout");
                try {
                    a0Var2.f8330d.s(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        a0Var2.n();
                        Trace.endSection();
                        a0Var2.L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 13:
                h4.a aVar4 = (h4.a) this.f188e;
                aVar4.f3165c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) aVar4.f3167e;
                x3.c cVar2 = sideSheetBehavior.i;
                if (cVar2 != null && cVar2.f()) {
                    aVar4.a(aVar4.f3164b);
                    return;
                } else {
                    if (sideSheetBehavior.f1943h == 2) {
                        sideSheetBehavior.r(aVar4.f3164b);
                        return;
                    }
                    return;
                }
            case 14:
                ((z5.e) this.f188e).s(true);
                return;
            case v0.f8308f /* 15 */:
                k kVar = (k) this.f188e;
                boolean isPopupShowing = kVar.f9201h.isPopupShowing();
                kVar.s(isPopupShowing);
                kVar.f9205m = isPopupShowing;
                return;
            default:
                ((TextInputLayout) this.f188e).f1974h.requestLayout();
                return;
        }
    }
}
