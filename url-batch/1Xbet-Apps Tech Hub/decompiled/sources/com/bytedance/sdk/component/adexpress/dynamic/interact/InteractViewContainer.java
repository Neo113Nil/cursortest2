package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpShakeView;
import com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView;
import com.bytedance.sdk.component.adexpress.widget.RippleView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;

/* loaded from: classes.dex */
public class InteractViewContainer extends FrameLayout implements Mxy {
    private View Jd;
    private DynamicBrushMaskView Ju;
    private int Mxy;
    private so NB;
    private boolean Wyp;
    private DynamicBaseWidget icD;
    private com.bytedance.sdk.component.adexpress.icD.Ju kj;
    private Context pvs;
    private com.bytedance.sdk.component.adexpress.dynamic.vG.Wyp qh;
    private String sUS;
    private View.OnTouchListener so;
    private com.bytedance.sdk.component.adexpress.dynamic.vG.yiw vG;
    private RippleView yiw;

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        super(context);
        this.pvs = context;
        this.icD = dynamicBaseWidget;
        this.vG = yiwVar;
        yiw();
    }

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar, com.bytedance.sdk.component.adexpress.dynamic.vG.Wyp wyp, com.bytedance.sdk.component.adexpress.icD.Ju ju) {
        super(context);
        this.pvs = context;
        this.icD = dynamicBaseWidget;
        this.vG = yiwVar;
        this.qh = wyp;
        this.kj = ju;
        yiw();
    }

    private void yiw() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.sUS = this.vG.jhZ();
        this.Mxy = this.vG.sq();
        this.Wyp = this.vG.thO();
        so pvs = Wyp.pvs(this.pvs, this.icD, this.vG, this.qh, this.kj);
        this.NB = pvs;
        if (pvs != null) {
            this.Jd = pvs.vG();
            if (this.vG.SE()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.sUS, "6")) {
                if (this.vG.qd() && !TextUtils.isEmpty(this.vG.rW())) {
                    this.yiw = new RippleView(this.pvs, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw.pvs(this.vG.rW()));
                } else {
                    this.yiw = new RippleView(this.pvs, Color.parseColor("#99000000"));
                }
                FrameLayout frameLayout = new FrameLayout(this.pvs);
                frameLayout.addView(this.yiw, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.1
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.yiw.icD();
                    }
                });
            }
            if (TextUtils.equals(this.sUS, "20")) {
                this.Ju = (DynamicBrushMaskView) this.NB.vG();
            }
            if (pvs(this.sUS) && com.bytedance.sdk.component.adexpress.Jd.icD()) {
                int parseColor = Color.parseColor("#99000000");
                if (this.vG.qd() && !TextUtils.isEmpty(this.vG.rW())) {
                    try {
                        parseColor = com.bytedance.sdk.component.adexpress.dynamic.vG.yiw.pvs(this.vG.rW());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.pvs);
                view.setBackgroundColor(parseColor);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.NB.vG());
            pvs(this.NB.vG());
            setVisibility(0);
        }
    }

    private boolean pvs(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.so instanceof com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.vG) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void pvs(ViewGroup viewGroup) {
        if (this.Jd == null) {
            return;
        }
        String str = this.sUS;
        str.hashCode();
        switch (str) {
            case "0":
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.NB(this, this.Mxy);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                if (!this.vG.qd() || TextUtils.isEmpty(this.vG.rW())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.sUS(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.icD(this, this);
                break;
            case "5":
                if (this.vG.qd() && !TextUtils.isEmpty(this.vG.rW())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.vG.yiw.pvs(this.vG.rW()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.vG(this);
                this.Jd.setTag(2);
                break;
            case "8":
            case "11":
                this.icD.setClipChildren(false);
                this.icD.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.icD.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.sUS(this);
                break;
            case "9":
            case "17":
                this.Jd.setTag(2);
                break;
            case "10":
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.Jd(this, this.Mxy, this.Wyp);
                break;
            case "12":
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.vG(this);
                this.Jd.setTag(2);
                break;
            case "13":
            case "24":
                if (this.sUS.equals("24") && com.bytedance.sdk.component.adexpress.Jd.icD()) {
                    this.icD.setClipChildren(false);
                    this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.sUS(this);
                    break;
                } else {
                    this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.NB(this, this.Mxy);
                    break;
                }
            case "14":
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.icD(this, this);
                break;
            case "16":
                View view = this.Jd;
                if (view != null && (view instanceof ShakeAnimationView) && ((ShakeAnimationView) view).getShakeLayout() != null) {
                    ((ShakeAnimationView) this.Jd).getShakeLayout().setTag(2);
                }
                this.Jd.setTag(2);
                break;
            case "18":
                View view2 = this.Jd;
                if (view2 != null && (view2 instanceof WriggleGuideAnimationView) && ((WriggleGuideAnimationView) view2).getWriggleLayout() != null) {
                    ((WriggleGuideAnimationView) this.Jd).getWriggleLayout().setTag(2);
                }
                this.Jd.setTag(2);
                break;
            case "20":
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.pvs(this, this.Mxy, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                    this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.so(this, this.Wyp);
                    break;
                } else {
                    this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.yiw(this, this.Mxy, viewGroup);
                    break;
                }
            case "23":
                if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                    this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.sUS(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                    this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.so(this, this.Wyp);
                    break;
                }
                break;
            case "29":
                View view3 = this.Jd;
                if (view3 != null && (view3 instanceof ClickSlideUpShakeView) && ((ClickSlideUpShakeView) view3).getShakeView() != null) {
                    ((ClickSlideUpShakeView) this.Jd).getShakeView().setTag(2);
                }
                this.so = new com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.NB(this, this.Mxy);
                break;
        }
        View.OnTouchListener onTouchListener = this.so;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (so()) {
            this.Jd.setTag(2);
            setOnClickListener((View.OnClickListener) this.icD.getDynamicClickListener());
        }
    }

    private boolean so() {
        return (this.vG.thO() || TextUtils.equals("9", this.sUS) || TextUtils.equals("16", this.sUS) || TextUtils.equals("17", this.sUS) || TextUtils.equals("18", this.sUS) || TextUtils.equals("20", this.sUS) || TextUtils.equals("29", this.sUS) || TextUtils.equals("10", this.sUS)) ? false : true;
    }

    public void vG() {
        so soVar = this.NB;
        if (soVar != null) {
            soVar.pvs();
        }
    }

    public void Jd() {
        so soVar = this.NB;
        if (soVar != null) {
            soVar.icD();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            so soVar = this.NB;
            if (soVar != null) {
                soVar.icD();
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.icD(e.getMessage());
        }
    }

    public void NB() {
        if (this.Jd != null && TextUtils.equals(this.sUS, ExifInterface.GPS_MEASUREMENT_2D)) {
            View view = this.Jd;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).vG();
            }
        }
    }

    public void sUS() {
        if (this.Jd != null && TextUtils.equals(this.sUS, ExifInterface.GPS_MEASUREMENT_2D)) {
            View view = this.Jd;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).Jd();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy
    public void pvs() {
        if (TextUtils.equals(this.sUS, "6")) {
            RippleView rippleView = this.yiw;
            if (rippleView != null) {
                rippleView.vG();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.Mxy();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.sUS, "20")) {
            DynamicBrushMaskView dynamicBrushMaskView = this.Ju;
            if (dynamicBrushMaskView != null) {
                dynamicBrushMaskView.pvs();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.3
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.Mxy();
                    }
                }, 400L);
                return;
            }
            return;
        }
        Mxy();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy
    public void icD() {
        if (so()) {
            setOnClickListener((View.OnClickListener) this.icD.getDynamicClickListener());
            performClick();
            if (this.vG.Wby()) {
                return;
            }
            setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mxy() {
        if (this.so != null) {
            setOnClickListener((View.OnClickListener) this.icD.getDynamicClickListener());
            performClick();
            if (this.vG.Wby()) {
                return;
            }
            setVisibility(8);
        }
    }
}
