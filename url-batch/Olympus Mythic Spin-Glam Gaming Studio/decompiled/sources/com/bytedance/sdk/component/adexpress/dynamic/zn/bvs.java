package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hhw.bjh;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class bvs extends FrameLayout implements zg {
    private nps btk;
    private int bvs;
    private View fb;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk fs;
    private String hhw;
    private boolean iv;
    private com.bytedance.sdk.component.adexpress.fs.mw klz;
    private com.bytedance.sdk.component.adexpress.hhw.olo nps;
    private com.bytedance.sdk.component.adexpress.dynamic.fb.iv rc;
    private View.OnTouchListener zg;
    private Context zmn;
    private com.bytedance.sdk.component.adexpress.dynamic.fb.nps zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public bvs(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        super(context);
        this.zmn = context;
        this.fs = btkVar;
        this.zn = npsVar;
        nps();
    }

    public bvs(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar, com.bytedance.sdk.component.adexpress.dynamic.fb.iv ivVar, com.bytedance.sdk.component.adexpress.fs.mw mwVar) {
        super(context);
        this.zmn = context;
        this.fs = btkVar;
        this.zn = npsVar;
        this.rc = ivVar;
        this.klz = mwVar;
        nps();
    }

    private void nps() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.hhw = this.zn.vlj();
        this.bvs = this.zn.cud();
        this.iv = this.zn.yo();
        nps zmn = iv.zmn(this.zmn, this.fs, this.zn, this.rc, this.klz);
        this.btk = zmn;
        if (zmn != null) {
            this.fb = zmn.zn();
            if (this.zn.yof()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.hhw, "6")) {
                if (this.zn.xrr() && !TextUtils.isEmpty(this.zn.ve())) {
                    this.nps = new com.bytedance.sdk.component.adexpress.hhw.olo(this.zmn, com.bytedance.sdk.component.adexpress.dynamic.fb.nps.zmn(this.zn.ve()));
                } else {
                    this.nps = new com.bytedance.sdk.component.adexpress.hhw.olo(this.zmn, Color.parseColor("#99000000"));
                }
                FrameLayout frameLayout = new FrameLayout(this.zmn);
                frameLayout.addView(this.nps, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zn.bvs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        bvs.this.nps.fs();
                    }
                });
            }
            if (zmn(this.hhw) && com.bytedance.sdk.component.adexpress.fb.fs()) {
                int parseColor = Color.parseColor("#99000000");
                if (this.zn.xrr() && !TextUtils.isEmpty(this.zn.ve())) {
                    try {
                        parseColor = com.bytedance.sdk.component.adexpress.dynamic.fb.nps.zmn(this.zn.ve());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.zmn);
                view.setBackgroundColor(parseColor);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.btk.zn());
            zmn(this.btk.zn());
            setVisibility(0);
        }
    }

    private boolean zmn(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zg instanceof com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.zn) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void zmn(ViewGroup viewGroup) {
        if (this.fb == null) {
            return;
        }
        String str = this.hhw;
        str.hashCode();
        switch (str) {
            case "0":
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.btk(this, this.bvs);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                if (!this.zn.xrr() || TextUtils.isEmpty(this.zn.ve())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.hhw(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.fs(this, this);
                break;
            case "5":
                if (this.zn.xrr() && !TextUtils.isEmpty(this.zn.ve())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.fb.nps.zmn(this.zn.ve()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.zn(this);
                this.fb.setTag(2);
                break;
            case "8":
            case "11":
                this.fs.setClipChildren(false);
                this.fs.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.fs.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.hhw(this);
                break;
            case "9":
            case "17":
                this.fb.setTag(2);
                break;
            case "10":
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.fb(this, this.bvs, this.iv);
                break;
            case "12":
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.zn(this);
                this.fb.setTag(2);
                break;
            case "13":
            case "24":
                if (this.hhw.equals("24") && com.bytedance.sdk.component.adexpress.fb.fs()) {
                    this.fs.setClipChildren(false);
                    this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.hhw(this);
                    break;
                } else {
                    this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.btk(this, this.bvs);
                    break;
                }
            case "14":
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.fs(this, this);
                break;
            case "16":
                View view = this.fb;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.hhw.kgc) && ((com.bytedance.sdk.component.adexpress.hhw.kgc) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.hhw.kgc) this.fb).getShakeLayout().setTag(2);
                }
                this.fb.setTag(2);
                break;
            case "18":
                View view2 = this.fb;
                if (view2 != null && (view2 instanceof bjh) && ((bjh) view2).getWriggleLayout() != null) {
                    ((bjh) this.fb).getWriggleLayout().setTag(2);
                }
                this.fb.setTag(2);
                break;
            case "20":
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.zmn(this, this.bvs, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                    this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.zg(this, this.iv);
                    break;
                } else {
                    this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.nps(this, this.bvs, viewGroup);
                    break;
                }
            case "23":
                if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                    this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.hhw(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                    this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.zg(this, this.iv);
                    break;
                }
                break;
            case "29":
                View view3 = this.fb;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.hhw.hhw) && ((com.bytedance.sdk.component.adexpress.hhw.hhw) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.hhw.hhw) this.fb).getShakeView().setTag(2);
                }
                this.zg = new com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.btk(this, this.bvs);
                break;
        }
        View.OnTouchListener onTouchListener = this.zg;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (zg()) {
            this.fb.setTag(2);
            setOnClickListener((View.OnClickListener) this.fs.getDynamicClickListener());
        }
    }

    private boolean zg() {
        return (this.zn.yo() || TextUtils.equals("9", this.hhw) || TextUtils.equals("16", this.hhw) || TextUtils.equals("17", this.hhw) || TextUtils.equals("18", this.hhw) || TextUtils.equals("20", this.hhw) || TextUtils.equals("29", this.hhw) || TextUtils.equals("10", this.hhw)) ? false : true;
    }

    public void zn() {
        nps npsVar = this.btk;
        if (npsVar != null) {
            npsVar.zmn();
        }
    }

    public void fb() {
        nps npsVar = this.btk;
        if (npsVar != null) {
            npsVar.fs();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            nps npsVar = this.btk;
            if (npsVar != null) {
                npsVar.fs();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void btk() {
        if (this.fb != null && TextUtils.equals(this.hhw, "2")) {
            View view = this.fb;
            if (view instanceof com.bytedance.sdk.component.adexpress.hhw.zn) {
                ((com.bytedance.sdk.component.adexpress.hhw.zn) view).zn();
            }
        }
    }

    public void hhw() {
        if (this.fb != null && TextUtils.equals(this.hhw, "2")) {
            View view = this.fb;
            if (view instanceof com.bytedance.sdk.component.adexpress.hhw.zn) {
                ((com.bytedance.sdk.component.adexpress.hhw.zn) view).fb();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.zg
    public void zmn() {
        if (TextUtils.equals(this.hhw, "6")) {
            com.bytedance.sdk.component.adexpress.hhw.olo oloVar = this.nps;
            if (oloVar != null) {
                oloVar.zn();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zn.bvs.2
                    @Override // java.lang.Runnable
                    public void run() {
                        bvs.this.bvs();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.hhw, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zn.bvs.3
                @Override // java.lang.Runnable
                public void run() {
                    bvs.this.bvs();
                }
            }, 400L);
        } else {
            bvs();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.zg
    public void fs() {
        if (zg()) {
            setOnClickListener((View.OnClickListener) this.fs.getDynamicClickListener());
            performClick();
            if (this.zn.skn()) {
                return;
            }
            setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bvs() {
        if (this.zg != null) {
            setOnClickListener((View.OnClickListener) this.fs.getDynamicClickListener());
            performClick();
            if (this.zn.skn()) {
                return;
            }
            setVisibility(8);
        }
    }
}
