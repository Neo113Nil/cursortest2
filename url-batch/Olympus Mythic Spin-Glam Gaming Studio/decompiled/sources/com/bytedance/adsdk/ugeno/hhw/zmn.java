package com.bytedance.adsdk.ugeno.hhw;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.zg.zn;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public abstract class zmn<T> extends FrameLayout implements zn.fb {
    private static final Interpolator am = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.hhw.zmn.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private C0111zmn bjh;
    private int btk;
    private int bvs;
    private boolean cn;
    private boolean cyb;
    private int doe;
    private int fb;
    protected com.bytedance.adsdk.ugeno.zg.zn fs;
    private int hhw;
    private int iqz;
    private int iv;
    private boolean kgc;
    private Scroller kjb;
    private float klz;
    private int kw;
    private boolean mw;
    private int nps;
    private FrameLayout nqi;
    private boolean olo;
    private int phc;
    private String rc;
    private com.bytedance.adsdk.ugeno.hhw.zn rp;
    private boolean rt;
    private final Runnable so;
    private com.bytedance.adsdk.ugeno.hhw.zmn.zmn uqh;
    private final Runnable yj;
    private boolean zak;
    private int zg;
    protected List<T> zmn;
    protected Context zn;

    public abstract View rc(int i);

    public zmn(Context context) {
        super(context);
        this.zmn = new CopyOnWriteArrayList();
        this.fb = -1;
        this.btk = 2000;
        this.hhw = 500;
        this.nps = 500;
        this.zg = 0;
        this.bvs = -1;
        this.iv = -1;
        this.rc = Constants.NORMAL;
        this.klz = 1.0f;
        this.mw = true;
        this.rt = true;
        this.cn = true;
        this.cyb = true;
        this.kw = 0;
        this.iqz = 0;
        this.phc = 0;
        this.doe = 0;
        this.zak = true;
        this.yj = new Runnable() { // from class: com.bytedance.adsdk.ugeno.hhw.zmn.2
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = zmn.this.fs.getCurrentItem() + 1;
                if (zmn.this.cn) {
                    if (currentItem >= 1024) {
                        zmn.this.fs.zmn(512, false);
                        return;
                    } else {
                        zmn.this.fs.zmn(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.zg.fs adapter = zmn.this.fs.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.zmn()) {
                        zmn.this.fs.zmn(0, false);
                    } else {
                        zmn.this.fs.zmn(currentItem, true);
                    }
                }
            }
        };
        this.so = new Runnable() { // from class: com.bytedance.adsdk.ugeno.hhw.zmn.3
            @Override // java.lang.Runnable
            public void run() {
                if (zmn.this.rt) {
                    zmn.this.zak = false;
                    int currentItem = zmn.this.fs.getCurrentItem() + 1;
                    if (zmn.this.cn) {
                        if (currentItem >= 1024) {
                            zmn.this.fs.zmn(512, false);
                        } else {
                            zmn.this.fs.zmn(currentItem, true);
                        }
                        zmn zmnVar = zmn.this;
                        zmnVar.postDelayed(zmnVar.so, zmn.this.btk);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.zg.fs adapter = zmn.this.fs.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.zmn()) {
                            zmn.this.fs.zmn(0, false);
                            zmn zmnVar2 = zmn.this;
                            zmnVar2.postDelayed(zmnVar2.so, zmn.this.btk);
                        } else {
                            zmn.this.fs.zmn(currentItem, true);
                            zmn zmnVar3 = zmn.this;
                            zmnVar3.postDelayed(zmnVar3.so, zmn.this.btk);
                        }
                    }
                }
            }
        };
        this.zn = context;
        this.nqi = new FrameLayout(context);
        this.fs = zmn();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.nqi.addView(this.fs, layoutParams);
        addView(this.nqi);
    }

    public com.bytedance.adsdk.ugeno.zg.zn zmn() {
        return new zn(getContext());
    }

    public zmn zmn(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.uqh = new com.bytedance.adsdk.ugeno.hhw.zmn.zn(this.zn);
        } else {
            this.uqh = new com.bytedance.adsdk.ugeno.hhw.zmn.fs(this.zn);
        }
        addView(this.uqh, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public zmn zmn(float f) {
        this.uqh.setIndicatorWidth((int) f);
        return this;
    }

    public zmn fs(float f) {
        this.uqh.setIndicatorHeight((int) f);
        return this;
    }

    public zmn zn(float f) {
        this.uqh.setIndicatorX(f);
        return this;
    }

    public zmn fb(float f) {
        this.uqh.setIndicatorY(f);
        return this;
    }

    public zmn fs() {
        this.uqh.zmn();
        return this;
    }

    public zmn fs(String str) {
        this.uqh.setIndicatorDirection(str);
        return this;
    }

    public zmn zmn(int i) {
        this.doe = i;
        return this;
    }

    public zmn zmn(boolean z) {
        this.rt = z;
        btk();
        return this;
    }

    public zmn fs(int i) {
        this.hhw = i;
        return this;
    }

    public zmn zn(int i) {
        this.nps = i;
        if (this.kjb == null) {
            this.kjb = new fs(this.zn, am);
        }
        this.fs.setScroller(this.kjb);
        return this;
    }

    public zmn fb(int i) {
        this.btk = i;
        btk();
        return this;
    }

    public zmn btk(int i) {
        if (i < 0) {
            i = this.btk;
        }
        this.fb = i;
        btk();
        return this;
    }

    public zmn fs(boolean z) {
        this.cyb = z;
        return this;
    }

    public zmn zn(boolean z) {
        this.mw = z;
        return this;
    }

    public zmn hhw(int i) {
        this.uqh.setSelectedColor(i);
        return this;
    }

    public zmn nps(int i) {
        this.uqh.setUnSelectedColor(i);
        return this;
    }

    public zmn fb(boolean z) {
        this.uqh.setLoop(z);
        if (this.cn != z) {
            int zmn = fb.zmn(z, this.fs.getCurrentItem(), this.zmn.size());
            this.cn = z;
            C0111zmn c0111zmn = this.bjh;
            if (c0111zmn != null) {
                c0111zmn.zn();
                this.fs.setCurrentItem(zmn);
            }
        }
        return this;
    }

    public zmn btk(float f) {
        this.klz = f;
        return this;
    }

    public zmn zn(String str) {
        this.rc = str;
        zmn(str, this.zg, this.bvs, this.iv, true);
        return this;
    }

    public zmn zg(int i) {
        this.zg = i;
        zmn(this.rc, i, this.bvs, this.iv, true);
        return this;
    }

    public zmn<T> bvs(int i) {
        this.bvs = i;
        zmn(this.rc, this.zg, i, this.iv, true);
        return this;
    }

    public zmn iv(int i) {
        this.iv = i;
        zmn(this.rc, this.zg, this.bvs, i, true);
        return this;
    }

    public zmn btk(boolean z) {
        this.olo = z;
        return this;
    }

    public void zmn(String str, int i, int i2, int i3, boolean z) {
        C0111zmn c0111zmn = this.bjh;
        if (c0111zmn != null) {
            c0111zmn.zn();
        }
        this.fs.setPageMargin(i);
        if (i2 > 0 || i3 > 0) {
            if (this.doe == 1) {
                this.fs.setPadding(0, i2 + i, 0, i3 + i);
            } else {
                this.fs.setPadding(i2 + i, 0, i3 + i, 0);
            }
            this.nqi.setClipChildren(false);
            this.fs.setClipChildren(false);
            this.fs.setClipToPadding(false);
        }
        if (this.doe == 1) {
            com.bytedance.adsdk.ugeno.hhw.fs.fb fbVar = new com.bytedance.adsdk.ugeno.hhw.fs.fb();
            fbVar.zmn(str);
            this.fs.zmn(true, (zn.btk) fbVar);
            this.fs.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.fs.zmn(false, (zn.btk) new com.bytedance.adsdk.ugeno.hhw.fs.zn());
        } else if (TextUtils.equals(str, "cube")) {
            this.fs.zmn(false, (zn.btk) new com.bytedance.adsdk.ugeno.hhw.fs.zmn());
        } else if (TextUtils.equals(str, "fade")) {
            this.fs.zmn(false, (zn.btk) new com.bytedance.adsdk.ugeno.hhw.fs.fs());
        } else {
            this.fs.zmn(false, (zn.btk) null);
        }
        this.fs.setOffscreenPageLimit((int) this.klz);
    }

    public void zn() {
        int i;
        zmn(this.rc, this.zg, this.bvs, this.iv, true);
        if (this.bjh == null) {
            this.bjh = new C0111zmn();
            this.fs.zmn((zn.fb) this);
            this.fs.setAdapter(this.bjh);
        }
        int i2 = this.kw;
        if (i2 < 0 || i2 >= this.zmn.size()) {
            this.kw = 0;
        }
        if (this.cn) {
            i = this.kw + 512;
        } else {
            i = this.kw;
        }
        this.fs.zmn(i, true);
        if (!this.cn) {
            klz(i);
        }
        if (this.rt) {
            btk();
        }
    }

    public void setTwoItems(boolean z) {
        this.kgc = z;
    }

    public void fb() {
        hhw();
        if (this.bjh != null) {
            this.fs.fs((zn.fb) this);
            this.fs.setAdapter(null);
            this.bjh = null;
            this.fs.removeAllViews();
            this.zmn.clear();
            this.uqh.zn();
        }
    }

    public View zmn(int i, int i2) {
        if (this.zmn.size() == 0) {
            return new View(getContext());
        }
        View rc = rc(i2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (rc instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (nps()) {
            rc.setTag("two_items_tag");
        }
        if (rc.getParent() instanceof ViewGroup) {
            ((ViewGroup) rc.getParent()).removeView(rc);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(rc, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (nps()) {
            frameLayout.setTag(Integer.valueOf(i));
        }
        return frameLayout;
    }

    public zmn<T> zmn(T t) {
        if (t != null) {
            this.zmn.add(t);
            if (this.mw) {
                this.uqh.fs();
            }
        }
        C0111zmn c0111zmn = this.bjh;
        if (c0111zmn != null) {
            c0111zmn.zn();
            this.uqh.zmn(this.kw, this.fs.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.zg.zn.fb
    public void zmn(int i, float f, int i2) {
        com.bytedance.adsdk.ugeno.hhw.zn znVar = this.rp;
        if (znVar != null) {
            boolean z = this.cn;
            znVar.zmn(z, fb.zmn(z, i, this.zmn.size()), f, i2);
        }
        if (nps()) {
            zmn(i, findViewWithTag(Integer.valueOf(i)));
            if (f > 0.0f) {
                int i3 = i + 1;
                zmn(i3, findViewWithTag(Integer.valueOf(i3)));
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zg.zn.fb
    public void klz(int i) {
        if (this.rp != null) {
            int zmn = fb.zmn(this.cn, i, this.zmn.size());
            this.rp.zmn(this.cn, zmn, i, zmn == 0, zmn == this.zmn.size() - 1);
        }
        if (this.mw) {
            this.uqh.zmn(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zg.zn.fb
    public void mw(int i) {
        if (i == 1 && this.olo) {
            hhw();
        }
        com.bytedance.adsdk.ugeno.hhw.zn znVar = this.rp;
        if (znVar != null) {
            znVar.zmn(this.cn, i);
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.hhw.zmn$zmn, reason: collision with other inner class name */
    class C0111zmn extends com.bytedance.adsdk.ugeno.zg.fs {
        @Override // com.bytedance.adsdk.ugeno.zg.fs
        public int zmn(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.zg.fs
        public boolean zmn(View view, Object obj) {
            return view == obj;
        }

        C0111zmn() {
        }

        @Override // com.bytedance.adsdk.ugeno.zg.fs
        public int zmn() {
            if (zmn.this.cn) {
                return 1024;
            }
            return zmn.this.zmn.size();
        }

        @Override // com.bytedance.adsdk.ugeno.zg.fs
        public Object zmn(ViewGroup viewGroup, int i) {
            View zmn = zmn.this.zmn(i, fb.zmn(zmn.this.cn, i, zmn.this.zmn.size()));
            viewGroup.addView(zmn);
            return zmn;
        }

        @Override // com.bytedance.adsdk.ugeno.zg.fs
        public void zmn(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.zg.fs
        public float zmn(int i) {
            if (zmn.this.klz <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / zmn.this.klz;
        }
    }

    public void btk() {
        int i;
        removeCallbacks(this.so);
        int i2 = this.btk;
        if (this.zak && (i = this.fb) > 0) {
            i2 = i;
        }
        postDelayed(this.so, i2);
    }

    public void hhw() {
        removeCallbacks(this.so);
    }

    public void rt(int i) {
        zmn(this.rc, this.zg, this.bvs, this.iv, true);
        if (this.bjh == null) {
            this.bjh = new C0111zmn();
            this.fs.zmn((zn.fb) this);
            this.fs.setAdapter(this.bjh);
        }
        if (this.cn) {
            if (i >= 1024) {
                this.fs.zmn(512, false);
                return;
            } else {
                this.fs.zmn(i, true);
                return;
            }
        }
        if (i < 0 || i >= this.zmn.size()) {
            return;
        }
        this.fs.zmn(i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.rt) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.olo) {
                    btk();
                }
            } else if (action == 0) {
                hhw();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentItem() {
        return this.fs.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.zg.fs getAdapter() {
        return this.fs.getAdapter();
    }

    public com.bytedance.adsdk.ugeno.zg.zn getViewPager() {
        return this.fs;
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.hhw.zn znVar) {
        this.rp = znVar;
    }

    public class zn extends com.bytedance.adsdk.ugeno.zg.zn {
        public zn(Context context) {
            super(context);
        }

        @Override // com.bytedance.adsdk.ugeno.zg.zn, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!zmn.this.cyb) {
                return false;
            }
            try {
                if (zmn.this.doe == 1) {
                    boolean onInterceptTouchEvent = super.onInterceptTouchEvent(zmn(motionEvent));
                    zmn(motionEvent);
                    return onInterceptTouchEvent;
                }
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.zg.zn, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!zmn.this.cyb) {
                return false;
            }
            try {
                if (zmn.this.doe == 1) {
                    return super.onTouchEvent(zmn(motionEvent));
                }
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        private MotionEvent zmn(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }
    }

    private class fs extends Scroller {
        public fs(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, zmn.this.nps);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, zmn.this.nps);
        }
    }

    private void zmn(int i, View view) {
        View findViewWithTag;
        if ((view instanceof ViewGroup) && (findViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t = this.zmn.get(fb.zmn(true, i, this.zmn.size()));
            if (t == null) {
                return;
            }
            if (t instanceof com.bytedance.adsdk.ugeno.fs.zn) {
                findViewWithTag = ((com.bytedance.adsdk.ugeno.fs.zn) t).rc();
            } else if (t instanceof View) {
                findViewWithTag = (View) t;
            }
            if (findViewWithTag == null) {
                return;
            }
            if (findViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) findViewWithTag.getParent()).removeView(findViewWithTag);
            }
            ((ViewGroup) view).addView(findViewWithTag);
        }
    }

    private boolean nps() {
        return this.zmn.size() <= 2 && this.cn;
    }
}
