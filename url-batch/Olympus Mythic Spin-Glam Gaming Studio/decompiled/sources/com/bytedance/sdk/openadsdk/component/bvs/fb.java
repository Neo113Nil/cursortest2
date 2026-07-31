package com.bytedance.sdk.openadsdk.component.bvs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.cyb;
import com.bytedance.sdk.openadsdk.core.widget.olo;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes14.dex */
public class fb extends zn {
    private final com.bytedance.sdk.openadsdk.core.hhw.zg cn;
    private final com.bytedance.sdk.openadsdk.core.hhw.fb cyb;
    private final com.bytedance.sdk.openadsdk.core.hhw.zn mw;
    private final com.bytedance.sdk.openadsdk.core.hhw.btk olo;
    private final cyb rt;

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn, com.bytedance.sdk.openadsdk.core.hhw.nps, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn, com.bytedance.sdk.openadsdk.core.hhw.nps, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public fb(Context context, nqi nqiVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int fs = jy.fs(context, 8.0f);
        int fs2 = jy.fs(context, 9.0f);
        int fs3 = jy.fs(context, 10.0f);
        int fs4 = jy.fs(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.zn znVar = new com.bytedance.sdk.openadsdk.core.widget.zn(context);
        this.klz = znVar;
        znVar.setPadding(fs2, 0, fs2, 0);
        this.klz.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(jy.fs(context, 32.0f), jy.fs(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, fs3, fs3);
        this.klz.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        this.mw = znVar2;
        znVar2.setBackgroundColor(-1);
        znVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, jy.fs(context, 107.0f));
        layoutParams2.addRule(12);
        znVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setOrientation(0);
        btkVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        btkVar.setLayoutParams(layoutParams3);
        znVar2.addView(btkVar);
        olo oloVar = new olo(context);
        this.hhw = oloVar;
        oloVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(fs4, fs4);
        layoutParams4.rightMargin = fs;
        layoutParams4.setMarginEnd(fs);
        this.hhw.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.nps = zgVar;
        zgVar.setId(520093761);
        this.nps.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = this.nps;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar2.setEllipsize(truncateAt);
        this.nps.setMaxLines(2);
        this.nps.setTextColor(Color.parseColor("#161823"));
        this.nps.setTextSize(30.0f);
        btkVar.addView(this.hhw);
        btkVar.addView(this.nps);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, znVar2.getId());
        layoutParams5.addRule(10);
        znVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        this.zmn = fbVar;
        fbVar.setId(520093754);
        this.zmn.setScaleType(ImageView.ScaleType.CENTER_CROP);
        znVar3.addView(this.zmn, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        this.fs = znVar4;
        znVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        znVar3.addView(this.fs, layoutParams6);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        this.zn = fbVar2;
        fbVar2.setId(520093756);
        znVar3.addView(this.zn, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.btk = zgVar3;
        zgVar3.setId(520093717);
        this.btk.setBackground(rc.zmn(context, Color.parseColor("#b3000000"), 24));
        this.btk.setEllipsize(truncateAt);
        this.btk.setGravity(17);
        this.btk.setSingleLine(true);
        this.btk.setText(doe.zmn(context, "tt_video_download_apk"));
        this.btk.setTextColor(-1);
        this.btk.setTextSize(1, 16.0f);
        this.btk.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(jy.fs(context, 236.0f), jy.fs(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = jy.fs(context, 32.0f);
        znVar3.addView(this.btk, layoutParams7);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        this.olo = btkVar2;
        btkVar2.setOrientation(0);
        btkVar2.setGravity(16);
        btkVar2.setBackground(new zmn(context));
        btkVar2.setPadding(jy.fs(context, 16.0f), jy.fs(context, 8.0f), jy.fs(context, 16.0f), jy.fs(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = jy.fs(context, 90.0f);
        btkVar2.setLayoutParams(layoutParams8);
        olo oloVar2 = new olo(context);
        this.cyb = oloVar2;
        btkVar2.addView(oloVar2, new LinearLayout.LayoutParams(jy.fs(context, 36.0f), jy.fs(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar3 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = jy.fs(context, 8.0f);
        btkVar2.addView(btkVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.cn = zgVar4;
        zgVar4.setTextColor(-1);
        btkVar3.addView(zgVar4, new LinearLayout.LayoutParams(-2, -2));
        cyb cybVar = new cyb(context, true);
        this.rt = cybVar;
        btkVar3.addView(cybVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, nqiVar);
        this.fb = createPAGLogoViewByMaterial;
        createPAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, jy.fs(context, 14.0f));
        layoutParams10.gravity = 83;
        znVar3.addView(this.fb, layoutParams10);
        addView(znVar3);
        addView(this.klz);
        addView(znVar2);
        addView(this.zg);
        addView(btkVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public View getUserInfo() {
        return this.mw;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public com.bytedance.sdk.openadsdk.core.hhw.zg getAdTitleTextView() {
        return this.cn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public com.bytedance.sdk.openadsdk.core.hhw.fb getAdIconView() {
        return this.cyb;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public cyb getScoreBar() {
        return this.rt;
    }

    private static final class zmn extends Drawable {
        private static final int btk = Color.parseColor("#b0000000");
        private static final int hhw = Color.parseColor("#40000000");
        private final boolean fb;
        private final RectF zmn = new RectF();
        private final Paint fs = new Paint();
        private final Path zn = new Path();

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }

        public zmn(Context context) {
            this.fb = com.bytedance.sdk.component.adexpress.fb.fs.zmn(context);
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(@NonNull Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.zmn.set(rect);
            this.zn.reset();
            int height = rect.height() / 2;
            Path path = this.zn;
            RectF rectF = this.zmn;
            if (this.fb) {
                float f = height;
                fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
            } else {
                float f2 = height;
                fArr = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f3 = rect.right;
            boolean z = this.fb;
            this.fs.setShader(new LinearGradient(0.0f, 0.0f, f3, 0.0f, new int[]{z ? hhw : btk, z ? btk : hhw}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            canvas.drawPath(this.zn, this.fs);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public com.bytedance.sdk.openadsdk.core.hhw.btk getOverlayLayout() {
        return this.olo;
    }
}
