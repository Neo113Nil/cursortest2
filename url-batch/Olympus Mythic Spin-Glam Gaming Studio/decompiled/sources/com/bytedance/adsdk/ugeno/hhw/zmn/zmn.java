package com.bytedance.adsdk.ugeno.hhw.zmn;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.hhw.fb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zmn extends LinearLayout {
    private int btk;
    private int bvs;
    private List<View> fb;
    protected int fs;
    private int hhw;
    private float iv;
    private String klz;
    private int nps;
    private float rc;
    private boolean zg;
    protected Context zmn;
    protected int zn;

    public abstract Drawable fs(int i);

    public zmn(Context context) {
        super(context);
        this.btk = -65536;
        this.hhw = -16776961;
        this.nps = 5;
        this.fs = 40;
        this.zn = 20;
        this.klz = "row";
        this.zmn = context;
        this.fb = new ArrayList();
        setOrientation(0);
    }

    public void setIndicatorX(float f) {
        this.iv = f;
    }

    public void setIndicatorY(float f) {
        this.rc = f;
    }

    public void setIndicatorDirection(String str) {
        this.klz = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorWidth(int i) {
        this.fs = i;
    }

    public void setIndicatorHeight(int i) {
        this.zn = i;
    }

    public void zmn(int i, int i2) {
        Iterator<View> it = this.fb.iterator();
        while (it.hasNext()) {
            it.next().setBackground(fs(this.hhw));
        }
        if (i < 0 || i >= this.fb.size()) {
            i = 0;
        }
        if (this.fb.size() > 0) {
            this.fb.get(i).setBackground(fs(this.btk));
            this.bvs = i2;
        }
    }

    public int getSize() {
        return this.fb.size();
    }

    public void zmn() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.hhw.zmn.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                zmn.this.fb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((getHeight() * this.rc) / 100.0f));
        layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * this.iv) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public void setSelectedColor(int i) {
        this.btk = i;
    }

    public void setLoop(boolean z) {
        this.zg = z;
    }

    public void setUnSelectedColor(int i) {
        this.hhw = i;
    }

    public void zmn(int i) {
        if (this instanceof fs) {
            this.zn = this.fs;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.fs, this.zn);
        if (getOrientation() == 1) {
            int i2 = this.nps;
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
        } else {
            int i3 = this.nps;
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.fs, this.zn);
        if (getOrientation() == 1) {
            int i4 = this.nps;
            layoutParams2.topMargin = i4;
            layoutParams2.bottomMargin = i4;
        } else {
            int i5 = this.nps;
            layoutParams2.leftMargin = i5;
            layoutParams2.rightMargin = i5;
        }
        int zmn = fb.zmn(this.zg, this.bvs, this.fb.size());
        int zmn2 = fb.zmn(this.zg, i, this.fb.size());
        if (this.fb.size() == 0) {
            zmn2 = 0;
        }
        if (!this.fb.isEmpty() && fb.zmn(zmn, this.fb) && fb.zmn(zmn2, this.fb)) {
            this.fb.get(zmn).setBackground(fs(this.hhw));
            this.fb.get(zmn).setLayoutParams(layoutParams2);
            this.fb.get(zmn2).setBackground(fs(this.btk));
            this.fb.get(zmn2).setLayoutParams(layoutParams);
            this.bvs = i;
        }
    }

    public void fs() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof fs) {
            this.zn = this.fs;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.fs, this.zn);
        if (getOrientation() == 1) {
            int i = this.nps;
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i;
        } else {
            int i2 = this.nps;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
        }
        addView(view, layoutParams);
        view.setBackground(fs(this.hhw));
        this.fb.add(view);
    }

    public void zn() {
        this.fb.clear();
        removeAllViews();
    }
}
