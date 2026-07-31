package com.bytedance.adsdk.fs.zn.zn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.fs.iqz;
import com.bytedance.adsdk.fs.iv;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class zn extends fb {
    private final LinearLayout.LayoutParams bvs;
    private final List<String> iv;
    private String klz;
    private final List<TextView> rc;
    private LinearLayout zg;

    public zn(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar, Context context) {
        super(bvsVar, btkVar);
        List<iv.zmn> zn;
        this.bvs = new LinearLayout.LayoutParams(-2, -2);
        this.iv = new ArrayList();
        this.rc = new ArrayList();
        com.bytedance.adsdk.fs.iv ivVar = ((fb) this).nps;
        if (ivVar == null || (zn = ivVar.zn()) == null || zn.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.zg = linearLayout;
        int i = 0;
        linearLayout.setOrientation(0);
        fs(zn.get(0).nps);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.zg.addView(linearLayout2);
        List<String> klz = klz();
        while (i < zn.size()) {
            iv.zmn zmnVar = zn.get(i);
            TextView textView = new TextView(context);
            zmn(textView, zmnVar, (klz == null || i >= klz.size()) ? "" : klz.get(i));
            int i2 = zmnVar.hhw;
            if (i2 != 0) {
                this.bvs.bottomMargin = (int) (i2 * com.bytedance.adsdk.fs.hhw.hhw.zmn());
                linearLayout2.addView(textView, this.bvs);
            } else {
                linearLayout2.addView(textView);
            }
            i++;
        }
        float zmn = com.bytedance.adsdk.fs.hhw.hhw.zmn();
        zmn(this.zg, (int) (((fb) this).nps.zmn() * zmn), (int) (((fb) this).nps.fs() * zmn));
    }

    private void fs(String str) {
        if (TextUtils.isEmpty(str)) {
            this.zg.setGravity(17);
            return;
        }
        str.hashCode();
        if (str.equals("left")) {
            this.zg.setGravity(3);
        } else if (str.equals("right")) {
            this.zg.setGravity(5);
        } else {
            this.zg.setGravity(17);
        }
    }

    private void zmn(TextView textView, iv.zmn zmnVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            textView.setText("");
        }
        if (!TextUtils.isEmpty(zmnVar.zn)) {
            textView.setTextColor(Color.parseColor(zmnVar.zn));
        }
        if (!TextUtils.isEmpty(zmnVar.fb)) {
            textView.setBackgroundColor(Color.parseColor(zmnVar.fb));
        }
        textView.setGravity(17);
        textView.setTextSize(zmnVar.btk);
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.fb, com.bytedance.adsdk.fs.zn.zn.zmn
    public void fs(Canvas canvas, Matrix matrix, int i) {
        if (this.zg != null) {
            canvas.save();
            canvas.concat(matrix);
            zmn(i);
            zn(hhw());
            this.zg.draw(canvas);
            canvas.restore();
            return;
        }
        super.fs(canvas, matrix, i);
    }

    private void zn(float f) {
        List<iv.zmn> zn;
        com.bytedance.adsdk.fs.iv ivVar = ((fb) this).nps;
        if (ivVar == null || (zn = ivVar.zn()) == null || zn.size() <= 0) {
            return;
        }
        this.zg.setOrientation(0);
        this.zg.setGravity(17);
        if (this.zg.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.zg.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.zg.removeAllViews();
        if (linearLayout.getChildCount() != zn.size()) {
            return;
        }
        List<String> klz = klz();
        this.rc.clear();
        int i = 0;
        while (i < zn.size()) {
            iv.zmn zmnVar = zn.get(i);
            TextView textView = (TextView) linearLayout.getChildAt(i);
            this.rc.add(textView);
            zmn(textView, zmnVar, (klz == null || i >= klz.size()) ? "" : klz.get(i));
            i++;
        }
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < zn.size(); i2++) {
            iv.zmn zmnVar2 = zn.get(i2);
            TextView textView2 = this.rc.get(i2);
            textView2.setAlpha(f);
            linearLayout.setAlpha(f);
            int i3 = zmnVar2.hhw;
            if (i3 != 0) {
                this.bvs.bottomMargin = (int) (i3 * com.bytedance.adsdk.fs.hhw.hhw.zmn());
                linearLayout.addView(textView2, this.bvs);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.zg.setAlpha(f);
        this.zg.addView(linearLayout);
        float zmn = com.bytedance.adsdk.fs.hhw.hhw.zmn();
        zmn(this.zg, (int) (((fb) this).nps.zmn() * zmn), (int) (((fb) this).nps.fs() * zmn));
    }

    private List<String> klz() {
        com.bytedance.adsdk.fs.bvs bvsVar;
        iqz uqh;
        List<iv.zmn> zn;
        if (((fb) this).nps == null || (bvsVar = this.fs) == null || (uqh = bvsVar.uqh()) == null) {
            return null;
        }
        String fb = ((fb) this).nps.fb();
        if ((!TextUtils.isEmpty(fb) || !TextUtils.isEmpty(this.klz)) && (zn = ((fb) this).nps.zn()) != null) {
            String str = this.klz;
            if (TextUtils.isEmpty(str)) {
                str = uqh.zmn(fb);
            }
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                this.iv.clear();
                for (int i = 0; i < zn.size(); i++) {
                    iv.zmn zmnVar = zn.get(i);
                    int i2 = zmnVar.zmn;
                    int i3 = zmnVar.fs;
                    if (i2 < 0) {
                        i2 = Math.max(i2 + length, 0);
                    }
                    if (i3 < 0) {
                        i3 = Math.max(i3 + length, 0);
                    }
                    if (i2 + i3 > length) {
                        this.iv.add("");
                    } else {
                        if (zn.size() == 1 && i2 == 0 && i3 == 0) {
                            i3 = length;
                        }
                        this.iv.add(str.substring(i2, i3 + i2));
                    }
                }
                return this.iv;
            }
        }
        return null;
    }

    private static void zmn(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void zmn(String str) {
        this.klz = str;
    }
}
