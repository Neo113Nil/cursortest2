package com.bytedance.sdk.openadsdk.rt.zmn.fs;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.core.hhw.btk;
import com.bytedance.sdk.openadsdk.core.hhw.zg;
import com.bytedance.sdk.openadsdk.core.hhw.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes12.dex */
public class zmn extends zn {
    private btk fs;
    private Context zmn;
    private InterfaceC0205zmn zn;

    /* renamed from: com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0205zmn {
        void fs();

        void zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zmn(@NonNull Context context) {
        super(context);
        this.zmn = context;
        fs();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void fs() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        btk btkVar = new btk(this.zmn);
        this.fs = btkVar;
        btkVar.setOrientation(1);
        this.fs.setGravity(80);
        this.fs.setPadding(zmn(0.0f), 0, zmn(0.0f), zmn(34.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(zmn(16.0f));
        gradientDrawable.setColor(-1);
        this.fs.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = zmn(16.0f);
        this.fs.setLayoutParams(layoutParams);
        btk btkVar2 = new btk(this.zmn);
        btkVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, zmn(52.0f)));
        btkVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rt/zmn/fs/zmn$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_zmn$1_onClick_bb9b34a3732e5ddb8908c62a818e4208(view);
            }

            public void safedk_zmn$1_onClick_bb9b34a3732e5ddb8908c62a818e4208(View p0) {
                if (zmn.this.zn != null) {
                    zmn.this.zn.zmn();
                }
            }
        });
        Context context = this.zmn;
        String string = context.getString(doe.fs(context, "tt_history_delete_all"));
        zg zgVar = new zg(this.zmn);
        zgVar.setText(string);
        zgVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        zgVar.setTextColor(-65536);
        zgVar.setTextSize(2, 15.0f);
        zgVar.setGravity(17);
        btkVar2.addView(zgVar);
        btkVar2.setGravity(17);
        this.fs.addView(btkVar2);
        btk btkVar3 = new btk(this.zmn);
        btkVar3.setLayoutParams(new LinearLayout.LayoutParams(-1, zmn(8.0f)));
        btkVar3.setBackgroundColor(Color.argb(8, 22, 24, 35));
        this.fs.addView(btkVar3);
        btk btkVar4 = new btk(this.zmn);
        btkVar4.setLayoutParams(new LinearLayout.LayoutParams(-1, zmn(52.0f)));
        btkVar4.setGravity(17);
        btkVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rt/zmn/fs/zmn$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_zmn$2_onClick_716aed11d9695e42c5167dfbbb7169bd(view);
            }

            public void safedk_zmn$2_onClick_716aed11d9695e42c5167dfbbb7169bd(View p0) {
                if (zmn.this.zn != null) {
                    zmn.this.zn.fs();
                }
            }
        });
        zg zgVar2 = new zg(this.zmn);
        Context context2 = this.zmn;
        zgVar2.setText(context2.getString(doe.fs(context2, "tt_history_cancel")));
        zgVar2.setTextAppearance(R.style.TextAppearance.Material.Medium);
        zgVar2.setTextColor(Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
        zgVar2.setTextSize(2, 15.0f);
        zgVar2.setGravity(17);
        btkVar4.addView(zgVar2);
        this.fs.addView(btkVar4);
        addView(this.fs);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rt/zmn/fs/zmn$3;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                return safedk_zmn$3_onTouch_2579e4d7519a6af60335294abbbcd00c(view, motionEvent);
            }

            public boolean safedk_zmn$3_onTouch_2579e4d7519a6af60335294abbbcd00c(View p0, MotionEvent p1) {
                if (p1.getAction() == 1) {
                    Rect rect = new Rect();
                    zmn.this.fs.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) p1.getRawX(), (int) p1.getRawY())) {
                        zmn.this.zmn();
                    }
                }
                return true;
            }
        });
    }

    public void zmn(View view) {
        View findViewById = view.getRootView().findViewById(R.id.content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        if (getParent() == null) {
            ((ViewGroup) findViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    public void zmn() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC0205zmn interfaceC0205zmn) {
        this.zn = interfaceC0205zmn;
    }

    private int zmn(float f) {
        return jy.fs(this.zmn, f);
    }
}
