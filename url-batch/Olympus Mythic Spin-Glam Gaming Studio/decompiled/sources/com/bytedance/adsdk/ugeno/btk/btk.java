package com.bytedance.adsdk.ugeno.btk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.btk.fb;
import com.bytedance.adsdk.ugeno.nps.nps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class btk extends ViewGroup implements com.bytedance.adsdk.ugeno.btk.zmn {
    private int btk;
    private int bvs;
    private fb cn;
    private List<zn> cyb;
    private int fb;
    private int fs;
    private int hhw;
    private int iv;
    private fb.zmn kgc;
    private int klz;
    private int[] mw;
    private Drawable nps;
    private com.bytedance.adsdk.ugeno.fb olo;
    private int rc;
    private SparseIntArray rt;
    private Drawable zg;
    private int zmn;
    private int zn;

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int zmn(View view) {
        return 0;
    }

    public btk(Context context) {
        super(context, null);
        this.hhw = -1;
        this.cn = new fb(this);
        this.cyb = new ArrayList();
        this.kgc = new fb.zmn();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.fb fbVar = this.olo;
        if (fbVar != null) {
            int[] zmn2 = fbVar.zmn(i, i2);
            zmn(zmn2[0], zmn2[1]);
        } else {
            zmn(i, i2);
        }
        com.bytedance.adsdk.ugeno.fb fbVar2 = this.olo;
        if (fbVar2 != null) {
            fbVar2.btk();
        }
    }

    private void zmn(int i, int i2) {
        if (this.rt == null) {
            this.rt = new SparseIntArray(getChildCount());
        }
        if (this.cn.fs(this.rt)) {
            this.mw = this.cn.zmn(this.rt);
        }
        int i3 = this.zmn;
        if (i3 == 0 || i3 == 1) {
            fs(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            zn(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.zmn);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public View zmn(int i) {
        return getChildAt(i);
    }

    public View zn(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.mw;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public View fs(int i) {
        return zn(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.rt == null) {
            this.rt = new SparseIntArray(getChildCount());
        }
        this.mw = this.cn.zmn(view, i, layoutParams, this.rt);
        super.addView(view, i, layoutParams);
    }

    private void fs(int i, int i2) {
        this.cyb.clear();
        this.kgc.zmn();
        this.cn.zmn(this.kgc, i, i2);
        this.cyb = this.kgc.zmn;
        this.cn.zmn(i, i2);
        if (this.fb == 3) {
            for (zn znVar : this.cyb) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < znVar.zg; i4++) {
                    View zn = zn(znVar.cn + i4);
                    if (zn != null && zn.getVisibility() != 8) {
                        zmn zmnVar = (zmn) zn.getLayoutParams();
                        if (this.fs != 2) {
                            i3 = Math.max(i3, zn.getMeasuredHeight() + Math.max(znVar.klz - zn.getBaseline(), ((ViewGroup.MarginLayoutParams) zmnVar).topMargin) + ((ViewGroup.MarginLayoutParams) zmnVar).bottomMargin);
                        } else {
                            i3 = Math.max(i3, zn.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zmnVar).topMargin + Math.max((znVar.klz - zn.getMeasuredHeight()) + zn.getBaseline(), ((ViewGroup.MarginLayoutParams) zmnVar).bottomMargin));
                        }
                    }
                }
                znVar.nps = i3;
            }
        }
        this.cn.fs(i, i2, getPaddingTop() + getPaddingBottom());
        this.cn.zmn();
        zmn(this.zmn, i, i2, this.kgc.fs);
    }

    private void zn(int i, int i2) {
        this.cyb.clear();
        this.kgc.zmn();
        this.cn.fs(this.kgc, i, i2);
        this.cyb = this.kgc.zmn;
        this.cn.zmn(i, i2);
        this.cn.fs(i, i2, getPaddingLeft() + getPaddingRight());
        this.cn.zmn();
        zmn(this.zmn, i, i2, this.kgc.fs);
    }

    private void zmn(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int getLargestMainSize() {
        Iterator<zn> it = this.cyb.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i = Math.max(i, it.next().btk);
        }
        return i;
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.cyb.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            zn znVar = this.cyb.get(i4);
            if (fb(i4)) {
                if (zmn()) {
                    i2 = this.rc;
                } else {
                    i2 = this.klz;
                }
                i3 += i2;
            }
            if (hhw(i4)) {
                if (zmn()) {
                    i = this.rc;
                } else {
                    i = this.klz;
                }
                i3 += i;
            }
            i3 += znVar.nps;
        }
        return i3;
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public boolean zmn() {
        int i = this.zmn;
        return i == 0 || i == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.bytedance.adsdk.ugeno.fb fbVar = this.olo;
        if (fbVar != null) {
            fbVar.hhw();
        }
        int zmn2 = nps.zmn(this);
        int i5 = this.zmn;
        if (i5 == 0) {
            zmn(zmn2 == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            zmn(zmn2 != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = zmn2 == 1;
            zmn(this.fs == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = zmn2 == 1;
            zmn(this.fs == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.zmn);
        }
        com.bytedance.adsdk.ugeno.fb fbVar2 = this.olo;
        if (fbVar2 != null) {
            fbVar2.zmn(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zmn(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        int i6;
        int i7;
        int i8;
        char c;
        float f4;
        int i9;
        char c2;
        int i10;
        zmn zmnVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.cyb.size();
        int i12 = 0;
        while (i12 < size) {
            zn znVar = this.cyb.get(i12);
            if (fb(i12)) {
                int i13 = this.rc;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = this.zn;
            char c3 = 4;
            int i15 = 1;
            if (i14 == 0) {
                f = paddingLeft;
                f2 = i11 - paddingRight;
            } else if (i14 == 1) {
                int i16 = znVar.btk;
                f2 = i16 - paddingLeft;
                f = (i11 - i16) + paddingRight;
            } else if (i14 == 2) {
                int i17 = znVar.btk;
                f = paddingLeft + ((i11 - i17) / 2.0f);
                f2 = (i11 - paddingRight) - ((i11 - i17) / 2.0f);
            } else {
                if (i14 == 3) {
                    f = paddingLeft;
                    f3 = (i11 - znVar.btk) / (znVar.fs() != 1 ? r10 - 1 : 1.0f);
                    f2 = i11 - paddingRight;
                } else if (i14 == 4) {
                    int fs = znVar.fs();
                    f3 = fs != 0 ? (i11 - znVar.btk) / fs : 0.0f;
                    float f5 = f3 / 2.0f;
                    f = paddingLeft + f5;
                    f2 = (i11 - paddingRight) - f5;
                } else if (i14 == 5) {
                    f3 = znVar.fs() != 0 ? (i11 - znVar.btk) / (r7 + 1) : 0.0f;
                    f = paddingLeft + f3;
                    f2 = (i11 - paddingRight) - f3;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.zn);
                }
                float max = Math.max(f3, 0.0f);
                i5 = 0;
                while (i5 < znVar.zg) {
                    int i18 = znVar.cn + i5;
                    View zn = zn(i18);
                    if (zn == null) {
                        i6 = paddingLeft;
                        i7 = i15;
                        i8 = i5;
                        c = c3;
                    } else if (zn.getVisibility() != 8) {
                        zmn zmnVar2 = (zmn) zn.getLayoutParams();
                        float f6 = f + ((ViewGroup.MarginLayoutParams) zmnVar2).leftMargin;
                        float f7 = f2 - ((ViewGroup.MarginLayoutParams) zmnVar2).rightMargin;
                        if (fb(i18, i5)) {
                            int i19 = this.klz;
                            float f8 = i19;
                            f6 += f8;
                            i9 = i19;
                            f4 = f7 - f8;
                        } else {
                            f4 = f7;
                            i9 = 0;
                        }
                        if (i5 == znVar.zg - i15) {
                            c2 = 4;
                            if ((this.iv & 4) > 0) {
                                i10 = this.klz;
                                if (this.fs == 2) {
                                    i6 = paddingLeft;
                                    i7 = i15;
                                    i8 = i5;
                                    zmnVar = zmnVar2;
                                    c = c2;
                                    if (z) {
                                        this.cn.zmn(zn, znVar, Math.round(f4) - zn.getMeasuredWidth(), paddingTop, Math.round(f4), paddingTop + zn.getMeasuredHeight());
                                    } else {
                                        this.cn.zmn(zn, znVar, Math.round(f6), paddingTop, Math.round(f6) + zn.getMeasuredWidth(), paddingTop + zn.getMeasuredHeight());
                                    }
                                } else if (z) {
                                    i7 = i15;
                                    i8 = i5;
                                    i6 = paddingLeft;
                                    zmnVar = zmnVar2;
                                    c = c2;
                                    this.cn.zmn(zn, znVar, Math.round(f4) - zn.getMeasuredWidth(), paddingBottom - zn.getMeasuredHeight(), Math.round(f4), paddingBottom);
                                } else {
                                    i6 = paddingLeft;
                                    i7 = i15;
                                    i8 = i5;
                                    zmnVar = zmnVar2;
                                    c = c2;
                                    this.cn.zmn(zn, znVar, Math.round(f6), paddingBottom - zn.getMeasuredHeight(), Math.round(f6) + zn.getMeasuredWidth(), paddingBottom);
                                }
                                f = f6 + zn.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) zmnVar).rightMargin;
                                float measuredWidth = f4 - ((zn.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) zmnVar).leftMargin);
                                if (!z) {
                                    znVar.zmn(zn, i10, 0, i9, 0);
                                } else {
                                    znVar.zmn(zn, i9, 0, i10, 0);
                                }
                                f2 = measuredWidth;
                            }
                        } else {
                            c2 = 4;
                        }
                        i10 = 0;
                        if (this.fs == 2) {
                        }
                        f = f6 + zn.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) zmnVar).rightMargin;
                        float measuredWidth2 = f4 - ((zn.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) zmnVar).leftMargin);
                        if (!z) {
                        }
                        f2 = measuredWidth2;
                    } else {
                        i6 = paddingLeft;
                        i7 = i15;
                        i8 = i5;
                        c = 4;
                    }
                    i5 = i8 + 1;
                    c3 = c;
                    i15 = i7;
                    paddingLeft = i6;
                }
                int i20 = paddingLeft;
                int i21 = znVar.nps;
                paddingTop += i21;
                paddingBottom -= i21;
                i12++;
                paddingLeft = i20;
            }
            f3 = 0.0f;
            float max2 = Math.max(f3, 0.0f);
            i5 = 0;
            while (i5 < znVar.zg) {
            }
            int i202 = paddingLeft;
            int i212 = znVar.nps;
            paddingTop += i212;
            paddingBottom -= i212;
            i12++;
            paddingLeft = i202;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zmn(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        int i6;
        int i7;
        boolean z3;
        char c;
        float f4;
        float f5;
        int i8;
        char c2;
        int i9;
        zmn zmnVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.cyb.size();
        for (int i12 = 0; i12 < size; i12++) {
            zn znVar = this.cyb.get(i12);
            if (fb(i12)) {
                int i13 = this.klz;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = this.zn;
            char c3 = 4;
            boolean z4 = true;
            if (i14 == 0) {
                f = paddingTop;
                i5 = i10 - paddingBottom;
            } else if (i14 == 1) {
                int i15 = znVar.btk;
                f = (i10 - i15) + paddingBottom;
                i5 = i15 - paddingTop;
            } else if (i14 == 2) {
                int i16 = znVar.btk;
                f2 = (i10 - paddingBottom) - ((i10 - i16) / 2.0f);
                f = paddingTop + ((i10 - i16) / 2.0f);
                f3 = 0.0f;
                float max = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < znVar.zg) {
                }
                int i17 = znVar.nps;
                paddingLeft += i17;
                i11 -= i17;
            } else {
                if (i14 == 3) {
                    f = paddingTop;
                    f3 = (i10 - znVar.btk) / (znVar.fs() != 1 ? r7 - 1 : 1.0f);
                    f2 = i10 - paddingBottom;
                } else if (i14 == 4) {
                    int fs = znVar.fs();
                    f3 = fs != 0 ? (i10 - znVar.btk) / fs : 0.0f;
                    float f6 = f3 / 2.0f;
                    f = paddingTop + f6;
                    f2 = (i10 - paddingBottom) - f6;
                } else if (i14 == 5) {
                    f3 = znVar.fs() != 0 ? (i10 - znVar.btk) / (r10 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i10 - paddingBottom) - f3;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.zn);
                }
                float max2 = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < znVar.zg) {
                    int i18 = znVar.cn + i6;
                    View zn = zn(i18);
                    if (zn == null) {
                        i7 = i6;
                        z3 = z4;
                        c = c3;
                    } else if (zn.getVisibility() != 8) {
                        zmn zmnVar2 = (zmn) zn.getLayoutParams();
                        float f7 = f + ((ViewGroup.MarginLayoutParams) zmnVar2).topMargin;
                        float f8 = f2 - ((ViewGroup.MarginLayoutParams) zmnVar2).bottomMargin;
                        if (fb(i18, i6)) {
                            int i19 = this.rc;
                            float f9 = i19;
                            f4 = f7 + f9;
                            i8 = i19;
                            f5 = f8 - f9;
                        } else {
                            f4 = f7;
                            f5 = f8;
                            i8 = 0;
                        }
                        if (i6 == znVar.zg - 1) {
                            c2 = 4;
                            if ((this.bvs & 4) > 0) {
                                i9 = this.rc;
                                if (z) {
                                    i7 = i6;
                                    z3 = true;
                                    zmnVar = zmnVar2;
                                    c = c2;
                                    if (z2) {
                                        this.cn.zmn(zn, znVar, false, paddingLeft, Math.round(f5) - zn.getMeasuredHeight(), paddingLeft + zn.getMeasuredWidth(), Math.round(f5));
                                    } else {
                                        this.cn.zmn(zn, znVar, false, paddingLeft, Math.round(f4), paddingLeft + zn.getMeasuredWidth(), Math.round(f4) + zn.getMeasuredHeight());
                                    }
                                } else if (z2) {
                                    i7 = i6;
                                    z3 = true;
                                    zmnVar = zmnVar2;
                                    c = c2;
                                    this.cn.zmn(zn, znVar, true, i11 - zn.getMeasuredWidth(), Math.round(f5) - zn.getMeasuredHeight(), i11, Math.round(f5));
                                } else {
                                    i7 = i6;
                                    z3 = true;
                                    zmnVar = zmnVar2;
                                    c = c2;
                                    this.cn.zmn(zn, znVar, true, i11 - zn.getMeasuredWidth(), Math.round(f4), i11, Math.round(f4) + zn.getMeasuredHeight());
                                }
                                zmn zmnVar3 = zmnVar;
                                float measuredHeight = f4 + zn.getMeasuredHeight() + max2 + ((ViewGroup.MarginLayoutParams) zmnVar3).bottomMargin;
                                float measuredHeight2 = f5 - ((zn.getMeasuredHeight() + max2) + ((ViewGroup.MarginLayoutParams) zmnVar3).topMargin);
                                if (!z2) {
                                    znVar.zmn(zn, 0, i9, 0, i8);
                                } else {
                                    znVar.zmn(zn, 0, i8, 0, i9);
                                }
                                f = measuredHeight;
                                f2 = measuredHeight2;
                            }
                        } else {
                            c2 = 4;
                        }
                        i9 = 0;
                        if (z) {
                        }
                        zmn zmnVar32 = zmnVar;
                        float measuredHeight3 = f4 + zn.getMeasuredHeight() + max2 + ((ViewGroup.MarginLayoutParams) zmnVar32).bottomMargin;
                        float measuredHeight22 = f5 - ((zn.getMeasuredHeight() + max2) + ((ViewGroup.MarginLayoutParams) zmnVar32).topMargin);
                        if (!z2) {
                        }
                        f = measuredHeight3;
                        f2 = measuredHeight22;
                    } else {
                        i7 = i6;
                        z3 = true;
                        c = 4;
                    }
                    i6 = i7 + 1;
                    z4 = z3;
                    c3 = c;
                }
                int i172 = znVar.nps;
                paddingLeft += i172;
                i11 -= i172;
            }
            f2 = i5;
            f3 = 0.0f;
            float max22 = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < znVar.zg) {
            }
            int i1722 = znVar.nps;
            paddingLeft += i1722;
            i11 -= i1722;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.zg == null && this.nps == null) {
            return;
        }
        if (this.bvs == 0 && this.iv == 0) {
            return;
        }
        int zmn2 = nps.zmn(this);
        int i = this.zmn;
        if (i == 0) {
            zmn(canvas, zmn2 == 1, this.fs == 2);
            return;
        }
        if (i == 1) {
            zmn(canvas, zmn2 != 1, this.fs == 2);
            return;
        }
        if (i == 2) {
            boolean z = zmn2 == 1;
            if (this.fs == 2) {
                z = !z;
            }
            fs(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = zmn2 == 1;
        if (this.fs == 2) {
            z2 = !z2;
        }
        fs(canvas, z2, true);
    }

    private void zmn(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.cyb.size();
        for (int i3 = 0; i3 < size; i3++) {
            zn znVar = this.cyb.get(i3);
            for (int i4 = 0; i4 < znVar.zg; i4++) {
                int i5 = znVar.cn + i4;
                View zn = zn(i5);
                if (zn != null && zn.getVisibility() != 8) {
                    zmn zmnVar = (zmn) zn.getLayoutParams();
                    if (fb(i5, i4)) {
                        if (z) {
                            left = zn.getRight() + ((ViewGroup.MarginLayoutParams) zmnVar).rightMargin;
                        } else {
                            left = (zn.getLeft() - ((ViewGroup.MarginLayoutParams) zmnVar).leftMargin) - this.klz;
                        }
                        zmn(canvas, left, znVar.fs, znVar.nps);
                    }
                    if (i4 == znVar.zg - 1 && (this.iv & 4) > 0) {
                        if (z) {
                            right = (zn.getLeft() - ((ViewGroup.MarginLayoutParams) zmnVar).leftMargin) - this.klz;
                        } else {
                            right = zn.getRight() + ((ViewGroup.MarginLayoutParams) zmnVar).rightMargin;
                        }
                        zmn(canvas, right, znVar.fs, znVar.nps);
                    }
                }
            }
            if (fb(i3)) {
                if (z2) {
                    i2 = znVar.fb;
                } else {
                    i2 = znVar.fs - this.rc;
                }
                fs(canvas, paddingLeft, i2, max);
            }
            if (hhw(i3) && (this.bvs & 4) > 0) {
                if (z2) {
                    i = znVar.fs - this.rc;
                } else {
                    i = znVar.fb;
                }
                fs(canvas, paddingLeft, i, max);
            }
        }
    }

    private void fs(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.cyb.size();
        for (int i3 = 0; i3 < size; i3++) {
            zn znVar = this.cyb.get(i3);
            for (int i4 = 0; i4 < znVar.zg; i4++) {
                int i5 = znVar.cn + i4;
                View zn = zn(i5);
                if (zn != null && zn.getVisibility() != 8) {
                    zmn zmnVar = (zmn) zn.getLayoutParams();
                    if (fb(i5, i4)) {
                        if (z2) {
                            top = zn.getBottom() + ((ViewGroup.MarginLayoutParams) zmnVar).bottomMargin;
                        } else {
                            top = (zn.getTop() - ((ViewGroup.MarginLayoutParams) zmnVar).topMargin) - this.rc;
                        }
                        fs(canvas, znVar.zmn, top, znVar.nps);
                    }
                    if (i4 == znVar.zg - 1 && (this.bvs & 4) > 0) {
                        if (z2) {
                            bottom = (zn.getTop() - ((ViewGroup.MarginLayoutParams) zmnVar).topMargin) - this.rc;
                        } else {
                            bottom = zn.getBottom() + ((ViewGroup.MarginLayoutParams) zmnVar).bottomMargin;
                        }
                        fs(canvas, znVar.zmn, bottom, znVar.nps);
                    }
                }
            }
            if (fb(i3)) {
                if (z) {
                    i2 = znVar.zn;
                } else {
                    i2 = znVar.zmn - this.klz;
                }
                zmn(canvas, i2, paddingTop, max);
            }
            if (hhw(i3) && (this.iv & 4) > 0) {
                if (z) {
                    i = znVar.zmn - this.klz;
                } else {
                    i = znVar.zn;
                }
                zmn(canvas, i, paddingTop, max);
            }
        }
    }

    private void zmn(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.zg;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.klz + i, i3 + i2);
        this.zg.draw(canvas);
    }

    private void fs(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.nps;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.rc + i2);
        this.nps.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zmn;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof zmn) {
            return new zmn((zmn) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new zmn((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new zmn(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int getFlexDirection() {
        return this.zmn;
    }

    public void setFlexDirection(int i) {
        if (this.zmn != i) {
            this.zmn = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int getFlexWrap() {
        return this.fs;
    }

    public void setFlexWrap(int i) {
        if (this.fs != i) {
            this.fs = i;
            requestLayout();
        }
    }

    public int getJustifyContent() {
        return this.zn;
    }

    public void setJustifyContent(int i) {
        if (this.zn != i) {
            this.zn = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int getAlignItems() {
        return this.fb;
    }

    public void setAlignItems(int i) {
        if (this.fb != i) {
            this.fb = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int getAlignContent() {
        return this.btk;
    }

    public void setAlignContent(int i) {
        if (this.btk != i) {
            this.btk = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int getMaxLine() {
        return this.hhw;
    }

    public void setMaxLine(int i) {
        if (this.hhw != i) {
            this.hhw = i;
            requestLayout();
        }
    }

    public List<zn> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.cyb.size());
        for (zn znVar : this.cyb) {
            if (znVar.fs() != 0) {
                arrayList.add(znVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int zmn(View view, int i, int i2) {
        int i3;
        int i4;
        if (zmn()) {
            i3 = fb(i, i2) ? this.klz : 0;
            if ((this.iv & 4) <= 0) {
                return i3;
            }
            i4 = this.klz;
        } else {
            i3 = fb(i, i2) ? this.rc : 0;
            if ((this.bvs & 4) <= 0) {
                return i3;
            }
            i4 = this.rc;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public void zmn(zn znVar) {
        if (zmn()) {
            if ((this.iv & 4) > 0) {
                int i = znVar.btk;
                int i2 = this.klz;
                znVar.btk = i + i2;
                znVar.hhw += i2;
                return;
            }
            return;
        }
        if ((this.bvs & 4) > 0) {
            int i3 = znVar.btk;
            int i4 = this.rc;
            znVar.btk = i3 + i4;
            znVar.hhw += i4;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int zmn(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public int fs(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public void zmn(View view, int i, int i2, zn znVar) {
        if (fb(i, i2)) {
            if (zmn()) {
                int i3 = znVar.btk;
                int i4 = this.klz;
                znVar.btk = i3 + i4;
                znVar.hhw += i4;
                return;
            }
            int i5 = znVar.btk;
            int i6 = this.rc;
            znVar.btk = i5 + i6;
            znVar.hhw += i6;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public void setFlexLines(List<zn> list) {
        this.cyb = list;
    }

    @Override // com.bytedance.adsdk.ugeno.btk.zmn
    public List<zn> getFlexLinesInternal() {
        return this.cyb;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.nps;
    }

    public Drawable getDividerDrawableVertical() {
        return this.zg;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.nps) {
            return;
        }
        this.nps = drawable;
        if (drawable != null) {
            this.rc = drawable.getIntrinsicHeight();
        } else {
            this.rc = 0;
        }
        fs();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.zg) {
            return;
        }
        this.zg = drawable;
        if (drawable != null) {
            this.klz = drawable.getIntrinsicWidth();
        } else {
            this.klz = 0;
        }
        fs();
        requestLayout();
    }

    public int getShowDividerVertical() {
        return this.iv;
    }

    public int getShowDividerHorizontal() {
        return this.bvs;
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.iv) {
            this.iv = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.bvs) {
            this.bvs = i;
            requestLayout();
        }
    }

    private void fs() {
        if (this.nps == null && this.zg == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean fb(int i, int i2) {
        return btk(i, i2) ? zmn() ? (this.iv & 1) != 0 : (this.bvs & 1) != 0 : zmn() ? (this.iv & 2) != 0 : (this.bvs & 2) != 0;
    }

    private boolean btk(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View zn = zn(i - i3);
            if (zn != null && zn.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean fb(int i) {
        if (i >= 0 && i < this.cyb.size()) {
            if (btk(i)) {
                return zmn() ? (this.bvs & 1) != 0 : (this.iv & 1) != 0;
            }
            if (zmn()) {
                return (this.bvs & 2) != 0;
            }
            if ((this.iv & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean btk(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.cyb.get(i2).fs() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean hhw(int i) {
        if (i >= 0 && i < this.cyb.size()) {
            for (int i2 = i + 1; i2 < this.cyb.size(); i2++) {
                if (this.cyb.get(i2).fs() > 0) {
                    return false;
                }
            }
            if (zmn()) {
                return (this.bvs & 4) != 0;
            }
            if ((this.iv & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public static class zmn extends ViewGroup.MarginLayoutParams implements fs {
        public static final Parcelable.Creator<zmn> CREATOR = new Parcelable.Creator<zmn>() { // from class: com.bytedance.adsdk.ugeno.btk.btk.zmn.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public zmn createFromParcel(Parcel parcel) {
                return new zmn(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public zmn[] newArray(int i) {
                return new zmn[i];
            }
        };
        private float btk;
        private int bvs;
        private int fb;
        private float fs;
        private int hhw;
        private boolean iv;
        private int nps;
        private int zg;
        private int zmn;
        private float zn;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public zmn(zmn zmnVar) {
            super((ViewGroup.MarginLayoutParams) zmnVar);
            this.zmn = 1;
            this.fs = 0.0f;
            this.zn = 0.0f;
            this.fb = -1;
            this.btk = -1.0f;
            this.hhw = -1;
            this.nps = -1;
            this.zg = 16777215;
            this.bvs = 16777215;
            this.zmn = zmnVar.zmn;
            this.fs = zmnVar.fs;
            this.zn = zmnVar.zn;
            this.fb = zmnVar.fb;
            this.btk = zmnVar.btk;
            this.hhw = zmnVar.hhw;
            this.nps = zmnVar.nps;
            this.zg = zmnVar.zg;
            this.bvs = zmnVar.bvs;
            this.iv = zmnVar.iv;
        }

        public zmn(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.zmn = 1;
            this.fs = 0.0f;
            this.zn = 0.0f;
            this.fb = -1;
            this.btk = -1.0f;
            this.hhw = -1;
            this.nps = -1;
            this.zg = 16777215;
            this.bvs = 16777215;
        }

        public zmn(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.zmn = 1;
            this.fs = 0.0f;
            this.zn = 0.0f;
            this.fb = -1;
            this.btk = -1.0f;
            this.hhw = -1;
            this.nps = -1;
            this.zg = 16777215;
            this.bvs = 16777215;
        }

        public zmn(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.zmn = 1;
            this.fs = 0.0f;
            this.zn = 0.0f;
            this.fb = -1;
            this.btk = -1.0f;
            this.hhw = -1;
            this.nps = -1;
            this.zg = 16777215;
            this.bvs = 16777215;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int zmn() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int fs() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int zn() {
            return this.zmn;
        }

        public void zn(int i) {
            this.zmn = i;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public float fb() {
            return this.fs;
        }

        public void zmn(float f) {
            this.fs = f;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public float btk() {
            return this.zn;
        }

        public void fs(float f) {
            this.zn = f;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int hhw() {
            return this.fb;
        }

        public void fb(int i) {
            this.fb = i;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int nps() {
            return this.hhw;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public void zmn(int i) {
            this.hhw = i;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int zg() {
            return this.nps;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public void fs(int i) {
            this.nps = i;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int bvs() {
            return this.zg;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int iv() {
            return this.bvs;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public boolean rc() {
            return this.iv;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public float klz() {
            return this.btk;
        }

        public void zn(float f) {
            this.btk = f;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int mw() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int rt() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int cn() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.btk.fs
        public int cyb() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.zmn);
            parcel.writeFloat(this.fs);
            parcel.writeFloat(this.zn);
            parcel.writeInt(this.fb);
            parcel.writeFloat(this.btk);
            parcel.writeInt(this.hhw);
            parcel.writeInt(this.nps);
            parcel.writeInt(this.zg);
            parcel.writeInt(this.bvs);
            parcel.writeByte(this.iv ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        protected zmn(Parcel parcel) {
            super(0, 0);
            this.zmn = 1;
            this.fs = 0.0f;
            this.zn = 0.0f;
            this.fb = -1;
            this.btk = -1.0f;
            this.hhw = -1;
            this.nps = -1;
            this.zg = 16777215;
            this.bvs = 16777215;
            this.zmn = parcel.readInt();
            this.fs = parcel.readFloat();
            this.zn = parcel.readFloat();
            this.fb = parcel.readInt();
            this.btk = parcel.readFloat();
            this.hhw = parcel.readInt();
            this.nps = parcel.readInt();
            this.zg = parcel.readInt();
            this.bvs = parcel.readInt();
            this.iv = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        this.olo = znVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.fb fbVar = this.olo;
        if (fbVar != null) {
            fbVar.nps();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.fb fbVar = this.olo;
        if (fbVar != null) {
            fbVar.zg();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.fb fbVar = this.olo;
        if (fbVar != null) {
            fbVar.fs(i, i2, i3, i4);
        }
    }
}
