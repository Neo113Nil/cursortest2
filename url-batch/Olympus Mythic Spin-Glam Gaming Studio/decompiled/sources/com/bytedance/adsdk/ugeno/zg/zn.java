package com.bytedance.adsdk.ugeno.zg;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes11.dex */
public class zn extends ViewGroup {
    private boolean am;
    private boolean bjh;
    private final Rect bvs;
    private int bxw;
    private btk cd;
    private hhw cn;
    private boolean cud;
    private int cyb;
    private int dgt;
    private int doe;
    private int ev;
    int fb;
    private float fkt;
    private EdgeEffect gn;
    private float hgd;

    /* renamed from: io, reason: collision with root package name */
    private int f3734io;
    private float iqz;
    private int iv;
    private int jy;
    private int kgc;
    private int kjb;
    private ClassLoader klz;
    private boolean kra;
    private int kw;
    private ArrayList<View> lbc;
    private int lt;
    private boolean mhu;
    private Scroller mw;
    private boolean na;
    private final ArrayList<fs> nps;
    private int nqi;
    private float nu;
    private Drawable olo;
    private VelocityTracker oub;
    private float phc;
    private Parcelable rc;
    private final Runnable rje;
    private boolean rp;
    private boolean rt;
    private int so;
    private List<fb> tet;
    private float tf;
    private EdgeEffect uqd;
    private boolean uqh;
    private List<Object> ve;
    private int vlj;
    private int ww;
    private fb xrr;
    private int yj;
    private fb yo;
    private int yof;
    private boolean zak;
    private final fs zg;
    private int zi;
    private int zmn;
    com.bytedance.adsdk.ugeno.zg.fs zn;
    static final int[] fs = {R.attr.layout_gravity};
    private static final Comparator<fs> btk = new Comparator<fs>() { // from class: com.bytedance.adsdk.ugeno.zg.zn.1
        @Override // java.util.Comparator
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public int compare(fs fsVar, fs fsVar2) {
            return fsVar.fs - fsVar2.fs;
        }
    };
    private static final Interpolator hhw = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.zg.zn.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final zg hwg = new zg();

    public interface btk {
        void zmn(View view, float f);
    }

    public interface fb {
        void klz(int i);

        void mw(int i);

        void zmn(int i, float f, int i2);
    }

    static class fs {
        float btk;
        float fb;
        int fs;
        Object zmn;
        boolean zn;

        fs() {
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface zmn {
    }

    public zn(Context context) {
        super(context);
        this.nps = new ArrayList<>();
        this.zg = new fs();
        this.bvs = new Rect();
        this.iv = -1;
        this.rc = null;
        this.klz = null;
        this.iqz = -3.4028235E38f;
        this.phc = Float.MAX_VALUE;
        this.kjb = 1;
        this.ww = -1;
        this.kra = true;
        this.na = false;
        this.rje = new Runnable() { // from class: com.bytedance.adsdk.ugeno.zg.zn.3
            @Override // java.lang.Runnable
            public void run() {
                zn.this.setScrollState(0);
                zn.this.zn();
            }
        };
        this.zi = 0;
        zmn();
    }

    void zmn() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mw = new Scroller(context, hhw);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.ev = viewConfiguration.getScaledPagingTouchSlop();
        this.jy = (int) (400.0f * f);
        this.vlj = viewConfiguration.getScaledMaximumFlingVelocity();
        this.gn = new EdgeEffect(context);
        this.uqd = new EdgeEffect(context);
        this.yof = (int) (25.0f * f);
        this.dgt = (int) (2.0f * f);
        this.yj = (int) (f * 16.0f);
    }

    public void setScroller(Scroller scroller) {
        this.mw = scroller;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.rje);
        Scroller scroller = this.mw;
        if (scroller != null && !scroller.isFinished()) {
            this.mw.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i) {
        if (this.zi == i) {
            return;
        }
        this.zi = i;
        if (this.cd != null) {
            fs(i != 0);
        }
        hhw(i);
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.zg.fs fsVar) {
        com.bytedance.adsdk.ugeno.zg.fs fsVar2 = this.zn;
        if (fsVar2 != null) {
            fsVar2.zmn((DataSetObserver) null);
            for (int i = 0; i < this.nps.size(); i++) {
                fs fsVar3 = this.nps.get(i);
                this.zn.zmn((ViewGroup) this, fsVar3.fs, fsVar3.zmn);
            }
            this.nps.clear();
            hhw();
            this.fb = 0;
            scrollTo(0, 0);
        }
        this.zn = fsVar;
        this.zmn = 0;
        if (fsVar != null) {
            if (this.cn == null) {
                this.cn = new hhw();
            }
            this.zn.zmn((DataSetObserver) this.cn);
            this.rp = false;
            boolean z = this.kra;
            this.kra = true;
            this.zmn = this.zn.zmn();
            int i2 = this.iv;
            if (i2 >= 0) {
                zmn(i2, false, true);
                this.iv = -1;
                this.rc = null;
                this.klz = null;
            } else if (!z) {
                zn();
            } else {
                requestLayout();
            }
        }
        List<Object> list = this.ve;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.ve.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.ve.get(i3);
        }
    }

    private void hhw() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0115zn) getChildAt(i).getLayoutParams()).zmn) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public com.bytedance.adsdk.ugeno.zg.fs getAdapter() {
        return this.zn;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.rp = false;
        zmn(i, !this.kra, false);
    }

    public void zmn(int i, boolean z) {
        this.rp = false;
        zmn(i, z, false);
    }

    public int getCurrentItem() {
        return this.fb;
    }

    void zmn(int i, boolean z, boolean z2) {
        zmn(i, z, z2, 0);
    }

    void zmn(int i, boolean z, boolean z2, int i2) {
        com.bytedance.adsdk.ugeno.zg.fs fsVar = this.zn;
        if (fsVar == null || fsVar.zmn() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.fb == i && this.nps.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.zn.zmn()) {
            i = this.zn.zmn() - 1;
        }
        int i3 = this.kjb;
        int i4 = this.fb;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.nps.size(); i5++) {
                this.nps.get(i5).zn = true;
            }
        }
        boolean z3 = this.fb != i;
        if (this.kra) {
            this.fb = i;
            if (z3) {
                btk(i);
            }
            requestLayout();
            return;
        }
        zmn(i);
        zmn(i, z, i2, z3);
    }

    private void zmn(int i, boolean z, int i2, boolean z2) {
        fs fs2 = fs(i);
        int clientWidth = fs2 != null ? (int) (getClientWidth() * Math.max(this.iqz, Math.min(fs2.btk, this.phc))) : 0;
        if (z) {
            zmn(clientWidth, 0, i2);
            if (z2) {
                btk(i);
                return;
            }
            return;
        }
        if (z2) {
            btk(i);
        }
        zmn(false);
        scrollTo(clientWidth, 0);
        fb(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(fb fbVar) {
        this.yo = fbVar;
    }

    public void zmn(fb fbVar) {
        if (this.tet == null) {
            this.tet = new ArrayList();
        }
        this.tet.add(fbVar);
    }

    public void fs(fb fbVar) {
        List<fb> list = this.tet;
        if (list != null) {
            list.remove(fbVar);
        }
    }

    public void zmn(boolean z, btk btkVar) {
        zmn(z, btkVar, 2);
    }

    public void zmn(boolean z, btk btkVar, int i) {
        boolean z2 = btkVar != null;
        boolean z3 = z2 != (this.cd != null);
        this.cd = btkVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.f3734io = z ? 2 : 1;
            this.lt = i;
        } else {
            this.f3734io = 0;
        }
        if (z3) {
            zn();
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f3734io == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0115zn) this.lbc.get(i2).getLayoutParams()).hhw;
    }

    public int getOffscreenPageLimit() {
        return this.kjb;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.kjb) {
            this.kjb = i;
            zn();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.cyb;
        this.cyb = i;
        int width = getWidth();
        zmn(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.cyb;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.olo = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.olo;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.olo;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    float zmn(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    void zmn(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mw;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.rt ? this.mw.getCurrX() : this.mw.getStartX();
            this.mw.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            zmn(false);
            zn();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float zmn2 = f2 + (zmn(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(zmn2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i5) / ((f * this.zn.zmn(this.fb)) + this.cyb)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.rt = false;
        this.mw.startScroll(i4, scrollY, i5, i6, min);
        postInvalidateOnAnimation();
    }

    fs zmn(int i, int i2) {
        fs fsVar = new fs();
        fsVar.fs = i;
        fsVar.zmn = this.zn.zmn((ViewGroup) this, i);
        fsVar.fb = this.zn.zmn(i);
        if (i2 < 0 || i2 >= this.nps.size()) {
            this.nps.add(fsVar);
        } else {
            this.nps.add(i2, fsVar);
        }
        return fsVar;
    }

    void fs() {
        int zmn2 = this.zn.zmn();
        this.zmn = zmn2;
        boolean z = this.nps.size() < (this.kjb * 2) + 1 && this.nps.size() < zmn2;
        int i = this.fb;
        int i2 = 0;
        while (i2 < this.nps.size()) {
            fs fsVar = this.nps.get(i2);
            int zmn3 = this.zn.zmn(fsVar.zmn);
            if (zmn3 != -1) {
                if (zmn3 == -2) {
                    this.nps.remove(i2);
                    i2--;
                    this.zn.zmn((ViewGroup) this, fsVar.fs, fsVar.zmn);
                    int i3 = this.fb;
                    if (i3 == fsVar.fs) {
                        i = Math.max(0, Math.min(i3, zmn2 - 1));
                    }
                } else {
                    int i4 = fsVar.fs;
                    if (i4 != zmn3) {
                        if (i4 == this.fb) {
                            i = zmn3;
                        }
                        fsVar.fs = zmn3;
                    }
                }
                z = true;
            }
            i2++;
        }
        Collections.sort(this.nps, btk);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0115zn c0115zn = (C0115zn) getChildAt(i5).getLayoutParams();
                if (!c0115zn.zmn) {
                    c0115zn.zn = 0.0f;
                }
            }
            zmn(i, false, true);
            requestLayout();
        }
    }

    void zn() {
        zmn(this.fb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r9 == r10) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void zmn(int i) {
        fs fsVar;
        String hexString;
        fs fsVar2;
        fs zmn2;
        fs fsVar3;
        int i2 = this.fb;
        if (i2 != i) {
            fsVar = fs(i2);
            this.fb = i;
        } else {
            fsVar = null;
        }
        if (this.zn == null) {
            nps();
            return;
        }
        if (this.rp) {
            nps();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.kjb;
        int max = Math.max(0, this.fb - i3);
        int zmn3 = this.zn.zmn();
        int min = Math.min(zmn3 - 1, this.fb + i3);
        if (zmn3 != this.zmn) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.zmn + ", found: " + zmn3 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.zn.getClass());
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.nps.size()) {
                break;
            }
            fsVar2 = this.nps.get(i4);
            int i5 = fsVar2.fs;
            int i6 = this.fb;
            if (i5 < i6) {
                i4++;
            }
        }
        fsVar2 = null;
        if (fsVar2 == null && zmn3 > 0) {
            fsVar2 = zmn(this.fb, i4);
        }
        if (fsVar2 != null) {
            int i7 = i4 - 1;
            fs fsVar4 = i7 >= 0 ? this.nps.get(i7) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fsVar2.fb) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i8 = this.fb - 1; i8 >= 0; i8--) {
                if (f >= paddingLeft && i8 < max) {
                    if (fsVar4 == null) {
                        break;
                    }
                    if (i8 == fsVar4.fs && !fsVar4.zn) {
                        this.nps.remove(i7);
                        this.zn.zmn((ViewGroup) this, i8, fsVar4.zmn);
                        i7--;
                        i4--;
                        if (i7 >= 0) {
                            fsVar3 = this.nps.get(i7);
                            fsVar4 = fsVar3;
                        }
                        fsVar3 = null;
                        fsVar4 = fsVar3;
                    }
                } else if (fsVar4 != null && i8 == fsVar4.fs) {
                    f += fsVar4.fb;
                    i7--;
                    if (i7 >= 0) {
                        fsVar3 = this.nps.get(i7);
                        fsVar4 = fsVar3;
                    }
                    fsVar3 = null;
                    fsVar4 = fsVar3;
                } else {
                    f += zmn(i8, i7 + 1).fb;
                    i4++;
                    if (i7 >= 0) {
                        fsVar3 = this.nps.get(i7);
                        fsVar4 = fsVar3;
                    }
                    fsVar3 = null;
                    fsVar4 = fsVar3;
                }
            }
            float f2 = fsVar2.fb;
            int i9 = i4 + 1;
            if (f2 < 2.0f) {
                fs fsVar5 = i9 < this.nps.size() ? this.nps.get(i9) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i10 = this.fb;
                while (true) {
                    i10++;
                    if (i10 >= zmn3) {
                        break;
                    }
                    if (f2 >= paddingRight && i10 > min) {
                        if (fsVar5 == null) {
                            break;
                        }
                        if (i10 == fsVar5.fs && !fsVar5.zn) {
                            this.nps.remove(i9);
                            this.zn.zmn((ViewGroup) this, i10, fsVar5.zmn);
                            if (i9 < this.nps.size()) {
                                fsVar5 = this.nps.get(i9);
                            }
                        }
                    } else if (fsVar5 != null && i10 == fsVar5.fs) {
                        f2 += fsVar5.fb;
                        i9++;
                        if (i9 < this.nps.size()) {
                            fsVar5 = this.nps.get(i9);
                        }
                    } else {
                        fs zmn4 = zmn(i10, i9);
                        i9++;
                        f2 += zmn4.fb;
                        fsVar5 = i9 < this.nps.size() ? this.nps.get(i9) : null;
                    }
                }
            }
            zmn(fsVar2, i4, fsVar);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0115zn c0115zn = (C0115zn) childAt.getLayoutParams();
            c0115zn.hhw = i11;
            if (!c0115zn.zmn && c0115zn.zn == 0.0f && (zmn2 = zmn(childAt)) != null) {
                c0115zn.zn = zmn2.fb;
                c0115zn.btk = zmn2.fs;
            }
        }
        nps();
        if (hasFocus()) {
            View findFocus = findFocus();
            fs fs2 = findFocus != null ? fs(findFocus) : null;
            if (fs2 == null || fs2.fs != this.fb) {
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    fs zmn5 = zmn(childAt2);
                    if (zmn5 != null && zmn5.fs == this.fb && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    private void nps() {
        if (this.f3734io != 0) {
            ArrayList<View> arrayList = this.lbc;
            if (arrayList == null) {
                this.lbc = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.lbc.add(getChildAt(i));
            }
            Collections.sort(this.lbc, hwg);
        }
    }

    private void zmn(fs fsVar, int i, fs fsVar2) {
        int i2;
        int i3;
        fs fsVar3;
        fs fsVar4;
        int zmn2 = this.zn.zmn();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.cyb / clientWidth : 0.0f;
        if (fsVar2 != null) {
            int i4 = fsVar2.fs;
            int i5 = fsVar.fs;
            if (i4 < i5) {
                float f2 = fsVar2.btk + fsVar2.fb + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= fsVar.fs && i7 < this.nps.size()) {
                    fs fsVar5 = this.nps.get(i7);
                    while (true) {
                        fsVar4 = fsVar5;
                        if (i6 <= fsVar4.fs || i7 >= this.nps.size() - 1) {
                            break;
                        }
                        i7++;
                        fsVar5 = this.nps.get(i7);
                    }
                    while (i6 < fsVar4.fs) {
                        f2 += this.zn.zmn(i6) + f;
                        i6++;
                    }
                    fsVar4.btk = f2;
                    f2 += fsVar4.fb + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.nps.size() - 1;
                float f3 = fsVar2.btk;
                while (true) {
                    i4--;
                    if (i4 < fsVar.fs || size < 0) {
                        break;
                    }
                    fs fsVar6 = this.nps.get(size);
                    while (true) {
                        fsVar3 = fsVar6;
                        if (i4 >= fsVar3.fs || size <= 0) {
                            break;
                        }
                        size--;
                        fsVar6 = this.nps.get(size);
                    }
                    while (i4 > fsVar3.fs) {
                        f3 -= this.zn.zmn(i4) + f;
                        i4--;
                    }
                    f3 -= fsVar3.fb + f;
                    fsVar3.btk = f3;
                }
            }
        }
        int size2 = this.nps.size();
        float f4 = fsVar.btk;
        int i8 = fsVar.fs;
        int i9 = i8 - 1;
        this.iqz = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = zmn2 - 1;
        this.phc = i8 == i10 ? (fsVar.fb + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            fs fsVar7 = this.nps.get(i11);
            while (true) {
                i3 = fsVar7.fs;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.zn.zmn(i9) + f;
                i9--;
            }
            f4 -= fsVar7.fb + f;
            fsVar7.btk = f4;
            if (i3 == 0) {
                this.iqz = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fsVar.btk + fsVar.fb + f;
        int i12 = fsVar.fs + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            fs fsVar8 = this.nps.get(i13);
            while (true) {
                i2 = fsVar8.fs;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.zn.zmn(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.phc = (fsVar8.fb + f5) - 1.0f;
            }
            fsVar8.btk = f5;
            f5 += fsVar8.fb + f;
            i13++;
            i12++;
        }
        this.na = false;
    }

    public static class nps extends com.bytedance.adsdk.ugeno.zg.zmn {
        public static final Parcelable.Creator<nps> CREATOR = new Parcelable.ClassLoaderCreator<nps>() { // from class: com.bytedance.adsdk.ugeno.zg.zn.nps.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public nps createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new nps(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public nps createFromParcel(Parcel parcel) {
                return new nps(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public nps[] newArray(int i) {
                return new nps[i];
            }
        };
        ClassLoader fb;
        int fs;
        Parcelable zn;

        public nps(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // com.bytedance.adsdk.ugeno.zg.zmn, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.fs);
            parcel.writeParcelable(this.zn, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.fs + "}";
        }

        nps(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.fs = parcel.readInt();
            this.zn = parcel.readParcelable(classLoader);
            this.fb = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        nps npsVar = new nps(super.onSaveInstanceState());
        npsVar.fs = this.fb;
        com.bytedance.adsdk.ugeno.zg.fs fsVar = this.zn;
        if (fsVar != null) {
            npsVar.zn = fsVar.fs();
        }
        return npsVar;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nps)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nps npsVar = (nps) parcelable;
        super.onRestoreInstanceState(npsVar.zmn());
        if (this.zn != null) {
            zmn(npsVar.fs, false, true);
            return;
        }
        this.iv = npsVar.fs;
        this.rc = npsVar.zn;
        this.klz = npsVar.fb;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0115zn c0115zn = (C0115zn) layoutParams;
        boolean zn = c0115zn.zmn | zn(view);
        c0115zn.zmn = zn;
        if (!this.uqh) {
            super.addView(view, i, layoutParams);
        } else {
            if (zn) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0115zn.fb = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    private static boolean zn(View view) {
        return view.getClass().getAnnotation(zmn.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.uqh) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    fs zmn(View view) {
        for (int i = 0; i < this.nps.size(); i++) {
            fs fsVar = this.nps.get(i);
            if (this.zn.zmn(view, fsVar.zmn)) {
                return fsVar;
            }
        }
        return null;
    }

    fs fs(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return zmn(view);
            }
        }
    }

    fs fs(int i) {
        for (int i2 = 0; i2 < this.nps.size(); i2++) {
            fs fsVar = this.nps.get(i2);
            if (fsVar.fs == i) {
                return fsVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.kra = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C0115zn c0115zn;
        C0115zn c0115zn2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.so = Math.min(measuredWidth / 10, this.yj);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c0115zn2 = (C0115zn) childAt.getLayoutParams()) != null && c0115zn2.zmn) {
                int i6 = c0115zn2.fs;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c0115zn2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c0115zn2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.doe = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.nqi = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.uqh = true;
        zn();
        this.uqh = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0115zn = (C0115zn) childAt2.getLayoutParams()) == null || !c0115zn.zmn)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0115zn.zn), 1073741824), this.nqi);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.cyb;
            zmn(i, i3, i5, i5);
        }
    }

    private void zmn(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.nps.isEmpty()) {
            if (!this.mw.isFinished()) {
                this.mw.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        fs fs2 = fs(this.fb);
        int min = (int) ((fs2 != null ? Math.min(fs2.btk, this.phc) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            zmn(false);
            scrollTo(min, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        fs zmn2;
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0115zn c0115zn = (C0115zn) childAt.getLayoutParams();
                if (c0115zn.zmn) {
                    int i11 = c0115zn.fs;
                    int i12 = i11 & 7;
                    int i13 = i11 & 112;
                    if (i12 == 1) {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i12 == 3) {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i12 != 5) {
                            i5 = paddingLeft;
                        } else {
                            max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i13 != 16) {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        } else {
                            if (i13 == 48) {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i13 != 80) {
                                i6 = paddingTop;
                            } else {
                                max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i14 = paddingLeft + scrollX;
                            childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, paddingTop + childAt.getMeasuredHeight());
                            i9++;
                            paddingTop = i6;
                            paddingLeft = i5;
                        }
                        int i15 = max2;
                        i6 = paddingTop;
                        paddingTop = i15;
                        int i142 = paddingLeft + scrollX;
                        childAt.layout(i142, paddingTop, childAt.getMeasuredWidth() + i142, paddingTop + childAt.getMeasuredHeight());
                        i9++;
                        paddingTop = i6;
                        paddingLeft = i5;
                    }
                    int i16 = max;
                    i5 = paddingLeft;
                    paddingLeft = i16;
                    if (i13 != 16) {
                    }
                    int i152 = max2;
                    i6 = paddingTop;
                    paddingTop = i152;
                    int i1422 = paddingLeft + scrollX;
                    childAt.layout(i1422, paddingTop, childAt.getMeasuredWidth() + i1422, paddingTop + childAt.getMeasuredHeight());
                    i9++;
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        int i17 = (i7 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                C0115zn c0115zn2 = (C0115zn) childAt2.getLayoutParams();
                if (!c0115zn2.zmn && (zmn2 = zmn(childAt2)) != null) {
                    float f = i17;
                    int i19 = ((int) (zmn2.btk * f)) + paddingLeft;
                    if (c0115zn2.fb) {
                        c0115zn2.fb = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0115zn2.zn), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.kgc = paddingTop;
        this.kw = i8 - paddingBottom;
        this.bxw = i9;
        if (this.kra) {
            z2 = false;
            zmn(this.fb, false, 0, false);
        } else {
            z2 = false;
        }
        this.kra = z2;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.rt = true;
        if (!this.mw.isFinished() && this.mw.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mw.getCurrX();
            int currY = this.mw.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!fb(currX)) {
                    this.mw.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        zmn(true);
    }

    private boolean fb(int i) {
        if (this.nps.size() == 0) {
            if (this.kra) {
                return false;
            }
            this.mhu = false;
            zmn(0, 0.0f, 0);
            if (this.mhu) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        fs bvs = bvs();
        int clientWidth = getClientWidth();
        int i2 = this.cyb;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = bvs.fs;
        float f2 = ((i / f) - bvs.btk) / (bvs.fb + (i2 / f));
        this.mhu = false;
        zmn(i4, f2, (int) (i3 * f2));
        if (this.mhu) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zmn(int i, float f, int i2) {
        int max;
        int i3;
        int left;
        if (this.bxw > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C0115zn c0115zn = (C0115zn) childAt.getLayoutParams();
                if (c0115zn.zmn) {
                    int i5 = c0115zn.fs & 7;
                    if (i5 == 1) {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        fs(i, f, i2);
        if (this.cd != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C0115zn) childAt2.getLayoutParams()).zmn) {
                    this.cd.zmn(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.mhu = true;
    }

    private void fs(int i, float f, int i2) {
        fb fbVar = this.yo;
        if (fbVar != null) {
            fbVar.zmn(i, f, i2);
        }
        List<fb> list = this.tet;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                fb fbVar2 = this.tet.get(i3);
                if (fbVar2 != null) {
                    fbVar2.zmn(i, f, i2);
                }
            }
        }
        fb fbVar3 = this.xrr;
        if (fbVar3 != null) {
            fbVar3.zmn(i, f, i2);
        }
    }

    private void btk(int i) {
        fb fbVar = this.yo;
        if (fbVar != null) {
            fbVar.klz(i);
        }
        List<fb> list = this.tet;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                fb fbVar2 = this.tet.get(i2);
                if (fbVar2 != null) {
                    fbVar2.klz(i);
                }
            }
        }
        fb fbVar3 = this.xrr;
        if (fbVar3 != null) {
            fbVar3.klz(i);
        }
    }

    private void hhw(int i) {
        fb fbVar = this.yo;
        if (fbVar != null) {
            fbVar.mw(i);
        }
        List<fb> list = this.tet;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                fb fbVar2 = this.tet.get(i2);
                if (fbVar2 != null) {
                    fbVar2.mw(i);
                }
            }
        }
        fb fbVar3 = this.xrr;
        if (fbVar3 != null) {
            fbVar3.mw(i);
        }
    }

    private void zmn(boolean z) {
        boolean z2 = this.zi == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mw.isFinished()) {
                this.mw.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mw.getCurrX();
                int currY = this.mw.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        fb(currX);
                    }
                }
            }
        }
        this.rp = false;
        for (int i = 0; i < this.nps.size(); i++) {
            fs fsVar = this.nps.get(i);
            if (fsVar.zn) {
                fsVar.zn = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.rje);
            } else {
                this.rje.run();
            }
        }
    }

    private boolean zmn(float f, float f2) {
        if (f >= this.so || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.so)) && f2 < 0.0f;
        }
        return true;
    }

    private void fs(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.lt : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            zg();
            return false;
        }
        if (action != 0) {
            if (this.zak) {
                return true;
            }
            if (this.am) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.hgd = x;
            this.tf = x;
            float y = motionEvent.getY();
            this.nu = y;
            this.fkt = y;
            this.ww = motionEvent.getPointerId(0);
            this.am = false;
            this.rt = true;
            this.mw.computeScrollOffset();
            if (this.zi == 2 && Math.abs(this.mw.getFinalX() - this.mw.getCurrX()) > this.dgt) {
                this.mw.abortAnimation();
                this.rp = false;
                zn();
                this.zak = true;
                zn(true);
                setScrollState(1);
            } else {
                zmn(false);
                this.zak = false;
            }
        } else if (action == 2) {
            int i = this.ww;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.tf;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.nu);
                if (f != 0.0f && !zmn(this.tf, f) && zmn(this, false, (int) f, (int) x2, (int) y2)) {
                    this.tf = x2;
                    this.fkt = y2;
                    this.am = true;
                    return false;
                }
                int i2 = this.ev;
                if (abs > i2 && abs * 0.5f > abs2) {
                    this.zak = true;
                    zn(true);
                    setScrollState(1);
                    this.tf = f > 0.0f ? this.hgd + this.ev : this.hgd - this.ev;
                    this.fkt = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i2) {
                    this.am = true;
                }
                if (this.zak && fs(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            zmn(motionEvent);
        }
        if (this.oub == null) {
            this.oub = VelocityTracker.obtain();
        }
        this.oub.addMovement(motionEvent);
        return this.zak;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.zg.fs fsVar;
        int findPointerIndex;
        if (this.cud) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (fsVar = this.zn) == null || fsVar.zmn() == 0) {
            return false;
        }
        if (this.oub == null) {
            this.oub = VelocityTracker.obtain();
        }
        this.oub.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mw.abortAnimation();
            this.rp = false;
            zn();
            float x = motionEvent.getX();
            this.hgd = x;
            this.tf = x;
            float y = motionEvent.getY();
            this.nu = y;
            this.fkt = y;
            this.ww = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.zak) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.ww);
                    if (findPointerIndex2 == -1) {
                        z = zg();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex2);
                        float abs = Math.abs(x2 - this.tf);
                        float y2 = motionEvent.getY(findPointerIndex2);
                        float abs2 = Math.abs(y2 - this.fkt);
                        if (abs > this.ev && abs > abs2) {
                            this.zak = true;
                            zn(true);
                            float f = this.hgd;
                            this.tf = x2 - f > 0.0f ? f + this.ev : f - this.ev;
                            this.fkt = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.zak && (findPointerIndex = motionEvent.findPointerIndex(this.ww)) != -1) {
                    z = fs(motionEvent.getX(findPointerIndex));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex != -1) {
                        this.tf = motionEvent.getX(actionIndex);
                        this.ww = motionEvent.getPointerId(actionIndex);
                    }
                } else if (action == 6) {
                    zmn(motionEvent);
                    int findPointerIndex3 = motionEvent.findPointerIndex(this.ww);
                    if (findPointerIndex3 != -1) {
                        this.tf = motionEvent.getX(findPointerIndex3);
                    }
                }
            } else if (this.zak) {
                zmn(this.fb, true, 0, false);
                z = zg();
            }
        } else if (this.zak) {
            VelocityTracker velocityTracker = this.oub;
            velocityTracker.computeCurrentVelocity(1000, this.vlj);
            int xVelocity = (int) velocityTracker.getXVelocity(this.ww);
            this.rp = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            fs bvs = bvs();
            float f2 = clientWidth;
            int i = bvs.fs;
            float f3 = ((scrollX / f2) - bvs.btk) / (bvs.fb + (this.cyb / f2));
            int findPointerIndex4 = motionEvent.findPointerIndex(this.ww);
            if (findPointerIndex4 != -1) {
                zmn(zmn(i, f3, xVelocity, (int) (motionEvent.getX(findPointerIndex4) - this.hgd)), true, true, xVelocity);
                z = zg();
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    private boolean zg() {
        this.ww = -1;
        iv();
        this.gn.onRelease();
        this.uqd.onRelease();
        return this.gn.isFinished() || this.uqd.isFinished();
    }

    private void zn(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean fs(float f) {
        boolean z;
        boolean z2;
        float f2 = this.tf - f;
        this.tf = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.iqz * clientWidth;
        float f4 = this.phc * clientWidth;
        boolean z3 = false;
        fs fsVar = this.nps.get(0);
        ArrayList<fs> arrayList = this.nps;
        fs fsVar2 = arrayList.get(arrayList.size() - 1);
        if (fsVar.fs != 0) {
            f3 = fsVar.btk * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fsVar2.fs != this.zn.zmn() - 1) {
            f4 = fsVar2.btk * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.gn.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.uqd.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.tf += scrollX - i;
        scrollTo(i, getScrollY());
        fb(i);
        return z3;
    }

    private fs bvs() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.cyb / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        fs fsVar = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.nps.size()) {
            fs fsVar2 = this.nps.get(i2);
            if (!z && fsVar2.fs != (i = i3 + 1)) {
                fsVar2 = this.zg;
                fsVar2.btk = f + f3 + f2;
                fsVar2.fs = i;
                fsVar2.fb = this.zn.zmn(i);
                i2--;
            }
            fs fsVar3 = fsVar2;
            f = fsVar3.btk;
            float f4 = fsVar3.fb + f + f2;
            if (!z && scrollX < f) {
                return fsVar;
            }
            if (scrollX < f4 || i2 == this.nps.size() - 1) {
                return fsVar3;
            }
            int i4 = fsVar3.fs;
            float f5 = fsVar3.fb;
            i2++;
            z = false;
            i3 = i4;
            f3 = f5;
            fsVar = fsVar3;
        }
        return fsVar;
    }

    private int zmn(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.yof || Math.abs(i2) <= this.jy) {
            i += (int) (f + (i >= this.fb ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.nps.size() <= 0) {
            return i;
        }
        return Math.max(this.nps.get(0).fs, Math.min(i, this.nps.get(r4.size() - 1).fs));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.zg.fs fsVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (fsVar = this.zn) != null && fsVar.zmn() > 1)) {
            if (!this.gn.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.iqz * width);
                this.gn.setSize(height, width);
                z = this.gn.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.uqd.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.phc + 1.0f)) * width2);
                this.uqd.setSize(height2, width2);
                z |= this.uqd.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.gn.finish();
            this.uqd.finish();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.cyb <= 0 || this.olo == null || this.nps.size() <= 0 || this.zn == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f3 = this.cyb / width;
        int i2 = 0;
        fs fsVar = this.nps.get(0);
        float f4 = fsVar.btk;
        int size = this.nps.size();
        int i3 = fsVar.fs;
        int i4 = this.nps.get(size - 1).fs;
        while (i3 < i4) {
            while (true) {
                i = fsVar.fs;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                fsVar = this.nps.get(i2);
            }
            if (i3 == i) {
                float f5 = fsVar.btk;
                float f6 = fsVar.fb;
                f = (f5 + f6) * width;
                f4 = f5 + f6 + f3;
            } else {
                float zmn2 = this.zn.zmn(i3);
                f = (f4 + zmn2) * width;
                f4 += zmn2 + f3;
            }
            if (this.cyb + f > scrollX) {
                f2 = f3;
                this.olo.setBounds(Math.round(f), this.kgc, Math.round(this.cyb + f), this.kw);
                this.olo.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + r2) {
                return;
            }
            i3++;
            f3 = f2;
        }
    }

    private void zmn(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ww) {
            int i = actionIndex == 0 ? 1 : 0;
            this.tf = motionEvent.getX(i);
            this.ww = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.oub;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void iv() {
        this.zak = false;
        this.am = false;
        VelocityTracker velocityTracker = this.oub;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.oub = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.bjh != z) {
            this.bjh = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.zn == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.iqz)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.phc));
    }

    protected boolean zmn(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && zmn(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || zmn(keyEvent);
    }

    public boolean zmn(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return fb();
                }
                return zn(17);
            }
            if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return btk();
                }
                return zn(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return zn(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return zn(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if (r5 != 2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean zn(int i) {
        View findNextFocus;
        boolean fb2;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i != 17 || i == 1) {
                    fb2 = fb();
                } else {
                    if (i != 66) {
                    }
                    fb2 = btk();
                }
            } else if (i == 17) {
                int i2 = zmn(this.bvs, findNextFocus).left;
                int i3 = zmn(this.bvs, findFocus).left;
                if (findFocus != null && i2 >= i3) {
                    fb2 = fb();
                } else {
                    fb2 = findNextFocus.requestFocus();
                }
            } else {
                if (i == 66) {
                    int i4 = zmn(this.bvs, findNextFocus).left;
                    int i5 = zmn(this.bvs, findFocus).left;
                    if (findFocus == null || i4 > i5) {
                        fb2 = findNextFocus.requestFocus();
                    }
                    fb2 = btk();
                }
                fb2 = false;
            }
            if (fb2) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return fb2;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus != null) {
        }
        if (i != 17) {
        }
        fb2 = fb();
        if (fb2) {
        }
        return fb2;
    }

    private Rect zmn(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    boolean fb() {
        int i = this.fb;
        if (i <= 0) {
            return false;
        }
        zmn(i - 1, true);
        return true;
    }

    boolean btk() {
        com.bytedance.adsdk.ugeno.zg.fs fsVar = this.zn;
        if (fsVar == null || this.fb >= fsVar.zmn() - 1) {
            return false;
        }
        zmn(this.fb + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        fs zmn2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (zmn2 = zmn(childAt)) != null && zmn2.fs == this.fb) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        fs zmn2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (zmn2 = zmn(childAt)) != null && zmn2.fs == this.fb) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        fs zmn2;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (zmn2 = zmn(childAt)) != null && zmn2.fs == this.fb && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        fs zmn2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (zmn2 = zmn(childAt)) != null && zmn2.fs == this.fb && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0115zn();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0115zn) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0115zn(getContext(), attributeSet);
    }

    private class hhw extends DataSetObserver {
        hhw() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            zn.this.fs();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            zn.this.fs();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.zg.zn$zn, reason: collision with other inner class name */
    public static class C0115zn extends ViewGroup.LayoutParams {
        int btk;
        boolean fb;
        public int fs;
        int hhw;
        public boolean zmn;
        float zn;

        public C0115zn() {
            super(-1, -1);
            this.zn = 0.0f;
        }

        public C0115zn(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.zn = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zn.fs);
            this.fs = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    static class zg implements Comparator<View> {
        zg() {
        }

        @Override // java.util.Comparator
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0115zn c0115zn = (C0115zn) view.getLayoutParams();
            C0115zn c0115zn2 = (C0115zn) view2.getLayoutParams();
            boolean z = c0115zn.zmn;
            if (z != c0115zn2.zmn) {
                return z ? 1 : -1;
            }
            return c0115zn.btk - c0115zn2.btk;
        }
    }
}
