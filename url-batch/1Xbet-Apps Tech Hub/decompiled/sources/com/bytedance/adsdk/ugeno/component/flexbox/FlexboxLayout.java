package com.bytedance.adsdk.ugeno.component.flexbox;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.component.flexbox.Jd;
import com.bytedance.adsdk.ugeno.icD.yiw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements com.bytedance.adsdk.ugeno.component.flexbox.pvs {
    private SparseIntArray IP;
    private int Jd;
    private int[] Ju;
    private int Mxy;
    private int NB;
    private int Wyp;
    private Jd bNS;
    private Jd.pvs cR;
    private int icD;
    private int kj;
    private List<vG> mnm;
    private int pvs;
    private int qh;
    private int sUS;
    private Drawable so;
    private com.bytedance.adsdk.ugeno.icD vA;
    private int vG;
    private Drawable yiw;

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int pvs(View view) {
        return 0;
    }

    public FlexboxLayout(Context context) {
        super(context, null);
        this.sUS = -1;
        this.bNS = new Jd(this);
        this.mnm = new ArrayList();
        this.cR = new Jd.pvs();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.icD icd = this.vA;
        if (icd != null) {
            int[] pvs2 = icd.pvs(i, i2);
            pvs(pvs2[0], pvs2[1]);
        } else {
            pvs(i, i2);
        }
        com.bytedance.adsdk.ugeno.icD icd2 = this.vA;
        if (icd2 != null) {
            icd2.Jd();
        }
    }

    private void pvs(int i, int i2) {
        if (this.IP == null) {
            this.IP = new SparseIntArray(getChildCount());
        }
        if (this.bNS.icD(this.IP)) {
            this.Ju = this.bNS.pvs(this.IP);
        }
        int i3 = this.pvs;
        if (i3 == 0 || i3 == 1) {
            icD(i, i2);
        } else {
            if (i3 == 2 || i3 == 3) {
                vG(i, i2);
                return;
            }
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.pvs);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public View pvs(int i) {
        return getChildAt(i);
    }

    public View vG(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.Ju;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public View icD(int i) {
        return vG(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.IP == null) {
            this.IP = new SparseIntArray(getChildCount());
        }
        this.Ju = this.bNS.pvs(view, i, layoutParams, this.IP);
        super.addView(view, i, layoutParams);
    }

    private void icD(int i, int i2) {
        this.mnm.clear();
        this.cR.pvs();
        this.bNS.pvs(this.cR, i, i2);
        this.mnm = this.cR.pvs;
        this.bNS.pvs(i, i2);
        if (this.Jd == 3) {
            for (vG vGVar : this.mnm) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < vGVar.so; i4++) {
                    View vG = vG(vGVar.bNS + i4);
                    if (vG != null && vG.getVisibility() != 8) {
                        pvs pvsVar = (pvs) vG.getLayoutParams();
                        if (this.icD != 2) {
                            i3 = Math.max(i3, vG.getMeasuredHeight() + Math.max(vGVar.kj - vG.getBaseline(), pvsVar.topMargin) + pvsVar.bottomMargin);
                        } else {
                            i3 = Math.max(i3, vG.getMeasuredHeight() + pvsVar.topMargin + Math.max((vGVar.kj - vG.getMeasuredHeight()) + vG.getBaseline(), pvsVar.bottomMargin));
                        }
                    }
                }
                vGVar.yiw = i3;
            }
        }
        this.bNS.icD(i, i2, getPaddingTop() + getPaddingBottom());
        this.bNS.pvs();
        pvs(this.pvs, i, i2, this.cR.icD);
    }

    private void vG(int i, int i2) {
        this.mnm.clear();
        this.cR.pvs();
        this.bNS.icD(this.cR, i, i2);
        this.mnm = this.cR.pvs;
        this.bNS.pvs(i, i2);
        this.bNS.icD(i, i2, getPaddingLeft() + getPaddingRight());
        this.bNS.pvs();
        pvs(this.pvs, i, i2, this.cR.icD);
    }

    private void pvs(int i, int i2, int i3, int i4) {
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

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int getLargestMainSize() {
        Iterator<vG> it = this.mnm.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i = Math.max(i, it.next().NB);
        }
        return i;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.mnm.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            vG vGVar = this.mnm.get(i4);
            if (Jd(i4)) {
                if (pvs()) {
                    i2 = this.qh;
                } else {
                    i2 = this.kj;
                }
                i3 += i2;
            }
            if (sUS(i4)) {
                if (pvs()) {
                    i = this.qh;
                } else {
                    i = this.kj;
                }
                i3 += i;
            }
            i3 += vGVar.yiw;
        }
        return i3;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public boolean pvs() {
        int i = this.pvs;
        return i == 0 || i == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.bytedance.adsdk.ugeno.icD icd = this.vA;
        if (icd != null) {
            icd.NB();
        }
        int pvs2 = yiw.pvs(this);
        int i5 = this.pvs;
        if (i5 == 0) {
            pvs(pvs2 == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            pvs(pvs2 != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = pvs2 == 1;
            pvs(this.icD == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = pvs2 == 1;
            pvs(this.icD == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.pvs);
        }
        com.bytedance.adsdk.ugeno.icD icd2 = this.vA;
        if (icd2 != null) {
            icd2.pvs(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        char c;
        float f4;
        int i10;
        char c2;
        int i11;
        pvs pvsVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i12 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mnm.size();
        int i13 = 0;
        while (i13 < size) {
            vG vGVar = this.mnm.get(i13);
            if (Jd(i13)) {
                int i14 = this.qh;
                paddingBottom -= i14;
                paddingTop += i14;
            }
            int i15 = this.vG;
            char c3 = 4;
            int i16 = 1;
            if (i15 == 0) {
                f = paddingLeft;
                i5 = i12 - paddingRight;
            } else if (i15 == 1) {
                f = (i12 - vGVar.NB) + paddingRight;
                i5 = vGVar.NB - paddingLeft;
            } else if (i15 == 2) {
                f = paddingLeft + ((i12 - vGVar.NB) / 2.0f);
                f2 = (i12 - paddingRight) - ((i12 - vGVar.NB) / 2.0f);
                f3 = 0.0f;
                float max = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < vGVar.so) {
                }
                paddingTop += vGVar.yiw;
                paddingBottom -= vGVar.yiw;
                i13++;
                paddingLeft = paddingLeft;
            } else {
                if (i15 == 3) {
                    f = paddingLeft;
                    f3 = (i12 - vGVar.NB) / (vGVar.icD() != 1 ? r10 - 1 : 1.0f);
                    f2 = i12 - paddingRight;
                } else if (i15 == 4) {
                    int icD = vGVar.icD();
                    f3 = icD != 0 ? (i12 - vGVar.NB) / icD : 0.0f;
                    float f5 = f3 / 2.0f;
                    f = paddingLeft + f5;
                    f2 = (i12 - paddingRight) - f5;
                } else if (i15 == 5) {
                    f3 = vGVar.icD() != 0 ? (i12 - vGVar.NB) / (r7 + 1) : 0.0f;
                    f = paddingLeft + f3;
                    f2 = (i12 - paddingRight) - f3;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.vG);
                }
                float max2 = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < vGVar.so) {
                    int i17 = vGVar.bNS + i6;
                    View vG = vG(i17);
                    if (vG == null) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i6;
                        c = c3;
                    } else if (vG.getVisibility() != 8) {
                        pvs pvsVar2 = (pvs) vG.getLayoutParams();
                        float f6 = f + pvsVar2.leftMargin;
                        float f7 = f2 - pvsVar2.rightMargin;
                        if (Jd(i17, i6)) {
                            int i18 = this.kj;
                            float f8 = i18;
                            f6 += f8;
                            i10 = i18;
                            f4 = f7 - f8;
                        } else {
                            f4 = f7;
                            i10 = 0;
                        }
                        if (i6 == vGVar.so - i16) {
                            c2 = 4;
                            if ((this.Wyp & 4) > 0) {
                                i11 = this.kj;
                                if (this.icD == 2) {
                                    i7 = paddingLeft;
                                    i8 = i16;
                                    i9 = i6;
                                    pvsVar = pvsVar2;
                                    c = c2;
                                    if (z) {
                                        this.bNS.pvs(vG, vGVar, Math.round(f4) - vG.getMeasuredWidth(), paddingTop, Math.round(f4), paddingTop + vG.getMeasuredHeight());
                                    } else {
                                        this.bNS.pvs(vG, vGVar, Math.round(f6), paddingTop, Math.round(f6) + vG.getMeasuredWidth(), paddingTop + vG.getMeasuredHeight());
                                    }
                                } else if (z) {
                                    i8 = i16;
                                    i9 = i6;
                                    i7 = paddingLeft;
                                    pvsVar = pvsVar2;
                                    c = c2;
                                    this.bNS.pvs(vG, vGVar, Math.round(f4) - vG.getMeasuredWidth(), paddingBottom - vG.getMeasuredHeight(), Math.round(f4), paddingBottom);
                                } else {
                                    i7 = paddingLeft;
                                    i8 = i16;
                                    i9 = i6;
                                    pvsVar = pvsVar2;
                                    c = c2;
                                    this.bNS.pvs(vG, vGVar, Math.round(f6), paddingBottom - vG.getMeasuredHeight(), Math.round(f6) + vG.getMeasuredWidth(), paddingBottom);
                                }
                                f = f6 + vG.getMeasuredWidth() + max2 + pvsVar.rightMargin;
                                float measuredWidth = f4 - ((vG.getMeasuredWidth() + max2) + pvsVar.leftMargin);
                                if (!z) {
                                    vGVar.pvs(vG, i11, 0, i10, 0);
                                } else {
                                    vGVar.pvs(vG, i10, 0, i11, 0);
                                }
                                f2 = measuredWidth;
                            }
                        } else {
                            c2 = 4;
                        }
                        i11 = 0;
                        if (this.icD == 2) {
                        }
                        f = f6 + vG.getMeasuredWidth() + max2 + pvsVar.rightMargin;
                        float measuredWidth2 = f4 - ((vG.getMeasuredWidth() + max2) + pvsVar.leftMargin);
                        if (!z) {
                        }
                        f2 = measuredWidth2;
                    } else {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i6;
                        c = 4;
                    }
                    i6 = i9 + 1;
                    paddingLeft = i7;
                    i16 = i8;
                    c3 = c;
                }
                paddingTop += vGVar.yiw;
                paddingBottom -= vGVar.yiw;
                i13++;
                paddingLeft = paddingLeft;
            }
            f2 = i5;
            f3 = 0.0f;
            float max22 = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < vGVar.so) {
            }
            paddingTop += vGVar.yiw;
            paddingBottom -= vGVar.yiw;
            i13++;
            paddingLeft = paddingLeft;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(boolean z, boolean z2, int i, int i2, int i3, int i4) {
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
        pvs pvsVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.mnm.size();
        for (int i12 = 0; i12 < size; i12++) {
            vG vGVar = this.mnm.get(i12);
            if (Jd(i12)) {
                int i13 = this.kj;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = this.vG;
            char c3 = 4;
            boolean z4 = true;
            if (i14 == 0) {
                f = paddingTop;
                i5 = i10 - paddingBottom;
            } else if (i14 == 1) {
                f = (i10 - vGVar.NB) + paddingBottom;
                i5 = vGVar.NB - paddingTop;
            } else if (i14 == 2) {
                f = ((i10 - vGVar.NB) / 2.0f) + paddingTop;
                f2 = (i10 - paddingBottom) - ((i10 - vGVar.NB) / 2.0f);
                f3 = 0.0f;
                float max = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < vGVar.so) {
                }
                paddingLeft += vGVar.yiw;
                i11 -= vGVar.yiw;
            } else {
                if (i14 == 3) {
                    f = paddingTop;
                    f3 = (i10 - vGVar.NB) / (vGVar.icD() != 1 ? r7 - 1 : 1.0f);
                    f2 = i10 - paddingBottom;
                } else if (i14 == 4) {
                    int icD = vGVar.icD();
                    f3 = icD != 0 ? (i10 - vGVar.NB) / icD : 0.0f;
                    float f6 = f3 / 2.0f;
                    f = paddingTop + f6;
                    f2 = (i10 - paddingBottom) - f6;
                } else if (i14 == 5) {
                    f3 = vGVar.icD() != 0 ? (i10 - vGVar.NB) / (r10 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i10 - paddingBottom) - f3;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.vG);
                }
                float max2 = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < vGVar.so) {
                    int i15 = vGVar.bNS + i6;
                    View vG = vG(i15);
                    if (vG == null) {
                        i7 = i6;
                        z3 = z4;
                        c = c3;
                    } else if (vG.getVisibility() != 8) {
                        pvs pvsVar2 = (pvs) vG.getLayoutParams();
                        float f7 = f + pvsVar2.topMargin;
                        float f8 = f2 - pvsVar2.bottomMargin;
                        if (Jd(i15, i6)) {
                            int i16 = this.qh;
                            float f9 = i16;
                            f4 = f7 + f9;
                            i8 = i16;
                            f5 = f8 - f9;
                        } else {
                            f4 = f7;
                            f5 = f8;
                            i8 = 0;
                        }
                        if (i6 == vGVar.so - 1) {
                            c2 = 4;
                            if ((this.Mxy & 4) > 0) {
                                i9 = this.qh;
                                if (z) {
                                    i7 = i6;
                                    z3 = true;
                                    pvsVar = pvsVar2;
                                    c = c2;
                                    if (z2) {
                                        this.bNS.pvs(vG, vGVar, false, paddingLeft, Math.round(f5) - vG.getMeasuredHeight(), paddingLeft + vG.getMeasuredWidth(), Math.round(f5));
                                    } else {
                                        this.bNS.pvs(vG, vGVar, false, paddingLeft, Math.round(f4), paddingLeft + vG.getMeasuredWidth(), Math.round(f4) + vG.getMeasuredHeight());
                                    }
                                } else if (z2) {
                                    i7 = i6;
                                    z3 = true;
                                    pvsVar = pvsVar2;
                                    c = c2;
                                    this.bNS.pvs(vG, vGVar, true, i11 - vG.getMeasuredWidth(), Math.round(f5) - vG.getMeasuredHeight(), i11, Math.round(f5));
                                } else {
                                    i7 = i6;
                                    z3 = true;
                                    pvsVar = pvsVar2;
                                    c = c2;
                                    this.bNS.pvs(vG, vGVar, true, i11 - vG.getMeasuredWidth(), Math.round(f4), i11, Math.round(f4) + vG.getMeasuredHeight());
                                }
                                pvs pvsVar3 = pvsVar;
                                float measuredHeight = f4 + vG.getMeasuredHeight() + max2 + pvsVar3.bottomMargin;
                                float measuredHeight2 = f5 - ((vG.getMeasuredHeight() + max2) + pvsVar3.topMargin);
                                if (!z2) {
                                    vGVar.pvs(vG, 0, i9, 0, i8);
                                } else {
                                    vGVar.pvs(vG, 0, i8, 0, i9);
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
                        pvs pvsVar32 = pvsVar;
                        float measuredHeight3 = f4 + vG.getMeasuredHeight() + max2 + pvsVar32.bottomMargin;
                        float measuredHeight22 = f5 - ((vG.getMeasuredHeight() + max2) + pvsVar32.topMargin);
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
                paddingLeft += vGVar.yiw;
                i11 -= vGVar.yiw;
            }
            f2 = i5;
            f3 = 0.0f;
            float max22 = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < vGVar.so) {
            }
            paddingLeft += vGVar.yiw;
            i11 -= vGVar.yiw;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.so == null && this.yiw == null) {
            return;
        }
        if (this.Mxy == 0 && this.Wyp == 0) {
            return;
        }
        int pvs2 = yiw.pvs(this);
        int i = this.pvs;
        if (i == 0) {
            pvs(canvas, pvs2 == 1, this.icD == 2);
            return;
        }
        if (i == 1) {
            pvs(canvas, pvs2 != 1, this.icD == 2);
            return;
        }
        if (i == 2) {
            boolean z = pvs2 == 1;
            if (this.icD == 2) {
                z = !z;
            }
            icD(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = pvs2 == 1;
        if (this.icD == 2) {
            z2 = !z2;
        }
        icD(canvas, z2, true);
    }

    private void pvs(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mnm.size();
        for (int i3 = 0; i3 < size; i3++) {
            vG vGVar = this.mnm.get(i3);
            for (int i4 = 0; i4 < vGVar.so; i4++) {
                int i5 = vGVar.bNS + i4;
                View vG = vG(i5);
                if (vG != null && vG.getVisibility() != 8) {
                    pvs pvsVar = (pvs) vG.getLayoutParams();
                    if (Jd(i5, i4)) {
                        if (z) {
                            left = vG.getRight() + pvsVar.rightMargin;
                        } else {
                            left = (vG.getLeft() - pvsVar.leftMargin) - this.kj;
                        }
                        pvs(canvas, left, vGVar.icD, vGVar.yiw);
                    }
                    if (i4 == vGVar.so - 1 && (this.Wyp & 4) > 0) {
                        if (z) {
                            right = (vG.getLeft() - pvsVar.leftMargin) - this.kj;
                        } else {
                            right = vG.getRight() + pvsVar.rightMargin;
                        }
                        pvs(canvas, right, vGVar.icD, vGVar.yiw);
                    }
                }
            }
            if (Jd(i3)) {
                if (z2) {
                    i2 = vGVar.Jd;
                } else {
                    i2 = vGVar.icD - this.qh;
                }
                icD(canvas, paddingLeft, i2, max);
            }
            if (sUS(i3) && (this.Mxy & 4) > 0) {
                if (z2) {
                    i = vGVar.icD - this.qh;
                } else {
                    i = vGVar.Jd;
                }
                icD(canvas, paddingLeft, i, max);
            }
        }
    }

    private void icD(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mnm.size();
        for (int i3 = 0; i3 < size; i3++) {
            vG vGVar = this.mnm.get(i3);
            for (int i4 = 0; i4 < vGVar.so; i4++) {
                int i5 = vGVar.bNS + i4;
                View vG = vG(i5);
                if (vG != null && vG.getVisibility() != 8) {
                    pvs pvsVar = (pvs) vG.getLayoutParams();
                    if (Jd(i5, i4)) {
                        if (z2) {
                            top = vG.getBottom() + pvsVar.bottomMargin;
                        } else {
                            top = (vG.getTop() - pvsVar.topMargin) - this.qh;
                        }
                        icD(canvas, vGVar.pvs, top, vGVar.yiw);
                    }
                    if (i4 == vGVar.so - 1 && (this.Mxy & 4) > 0) {
                        if (z2) {
                            bottom = (vG.getTop() - pvsVar.topMargin) - this.qh;
                        } else {
                            bottom = vG.getBottom() + pvsVar.bottomMargin;
                        }
                        icD(canvas, vGVar.pvs, bottom, vGVar.yiw);
                    }
                }
            }
            if (Jd(i3)) {
                if (z) {
                    i2 = vGVar.vG;
                } else {
                    i2 = vGVar.pvs - this.kj;
                }
                pvs(canvas, i2, paddingTop, max);
            }
            if (sUS(i3) && (this.Wyp & 4) > 0) {
                if (z) {
                    i = vGVar.pvs - this.kj;
                } else {
                    i = vGVar.vG;
                }
                pvs(canvas, i, paddingTop, max);
            }
        }
    }

    private void pvs(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.so;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.kj + i, i3 + i2);
        this.so.draw(canvas);
    }

    private void icD(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.yiw;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.qh + i2);
        this.yiw.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pvs;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof pvs) {
            return new pvs((pvs) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new pvs((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new pvs(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int getFlexDirection() {
        return this.pvs;
    }

    public void setFlexDirection(int i) {
        if (this.pvs != i) {
            this.pvs = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int getFlexWrap() {
        return this.icD;
    }

    public void setFlexWrap(int i) {
        if (this.icD != i) {
            this.icD = i;
            requestLayout();
        }
    }

    public int getJustifyContent() {
        return this.vG;
    }

    public void setJustifyContent(int i) {
        if (this.vG != i) {
            this.vG = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int getAlignItems() {
        return this.Jd;
    }

    public void setAlignItems(int i) {
        if (this.Jd != i) {
            this.Jd = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int getAlignContent() {
        return this.NB;
    }

    public void setAlignContent(int i) {
        if (this.NB != i) {
            this.NB = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int getMaxLine() {
        return this.sUS;
    }

    public void setMaxLine(int i) {
        if (this.sUS != i) {
            this.sUS = i;
            requestLayout();
        }
    }

    public List<vG> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mnm.size());
        for (vG vGVar : this.mnm) {
            if (vGVar.icD() != 0) {
                arrayList.add(vGVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int pvs(View view, int i, int i2) {
        int i3;
        int i4;
        if (pvs()) {
            i3 = Jd(i, i2) ? 0 + this.kj : 0;
            if ((this.Wyp & 4) <= 0) {
                return i3;
            }
            i4 = this.kj;
        } else {
            i3 = Jd(i, i2) ? 0 + this.qh : 0;
            if ((this.Mxy & 4) <= 0) {
                return i3;
            }
            i4 = this.qh;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public void pvs(vG vGVar) {
        if (pvs()) {
            if ((this.Wyp & 4) > 0) {
                vGVar.NB += this.kj;
                vGVar.sUS += this.kj;
                return;
            }
            return;
        }
        if ((this.Mxy & 4) > 0) {
            vGVar.NB += this.qh;
            vGVar.sUS += this.qh;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int pvs(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public int icD(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public void pvs(View view, int i, int i2, vG vGVar) {
        if (Jd(i, i2)) {
            if (pvs()) {
                vGVar.NB += this.kj;
                vGVar.sUS += this.kj;
            } else {
                vGVar.NB += this.qh;
                vGVar.sUS += this.qh;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public void setFlexLines(List<vG> list) {
        this.mnm = list;
    }

    @Override // com.bytedance.adsdk.ugeno.component.flexbox.pvs
    public List<vG> getFlexLinesInternal() {
        return this.mnm;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.yiw;
    }

    public Drawable getDividerDrawableVertical() {
        return this.so;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.yiw) {
            return;
        }
        this.yiw = drawable;
        if (drawable != null) {
            this.qh = drawable.getIntrinsicHeight();
        } else {
            this.qh = 0;
        }
        icD();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.so) {
            return;
        }
        this.so = drawable;
        if (drawable != null) {
            this.kj = drawable.getIntrinsicWidth();
        } else {
            this.kj = 0;
        }
        icD();
        requestLayout();
    }

    public int getShowDividerVertical() {
        return this.Wyp;
    }

    public int getShowDividerHorizontal() {
        return this.Mxy;
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.Wyp) {
            this.Wyp = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.Mxy) {
            this.Mxy = i;
            requestLayout();
        }
    }

    private void icD() {
        if (this.yiw == null && this.so == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean Jd(int i, int i2) {
        return NB(i, i2) ? pvs() ? (this.Wyp & 1) != 0 : (this.Mxy & 1) != 0 : pvs() ? (this.Wyp & 2) != 0 : (this.Mxy & 2) != 0;
    }

    private boolean NB(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View vG = vG(i - i3);
            if (vG != null && vG.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean Jd(int i) {
        if (i >= 0 && i < this.mnm.size()) {
            if (NB(i)) {
                return pvs() ? (this.Mxy & 1) != 0 : (this.Wyp & 1) != 0;
            }
            if (pvs()) {
                return (this.Mxy & 2) != 0;
            }
            if ((this.Wyp & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean NB(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.mnm.get(i2).icD() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean sUS(int i) {
        if (i >= 0 && i < this.mnm.size()) {
            for (int i2 = i + 1; i2 < this.mnm.size(); i2++) {
                if (this.mnm.get(i2).icD() > 0) {
                    return false;
                }
            }
            if (pvs()) {
                return (this.Mxy & 4) != 0;
            }
            if ((this.Wyp & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public static class pvs extends ViewGroup.MarginLayoutParams implements icD {
        public static final Parcelable.Creator<pvs> CREATOR = new Parcelable.Creator<pvs>() { // from class: com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout.pvs.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public pvs createFromParcel(Parcel parcel) {
                return new pvs(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public pvs[] newArray(int i) {
                return new pvs[i];
            }
        };
        private int Jd;
        private int Mxy;
        private float NB;
        private boolean Wyp;
        private float icD;
        private int pvs;
        private int sUS;
        private int so;
        private float vG;
        private int yiw;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public pvs(pvs pvsVar) {
            super((ViewGroup.MarginLayoutParams) pvsVar);
            this.pvs = 1;
            this.icD = 0.0f;
            this.vG = 0.0f;
            this.Jd = -1;
            this.NB = -1.0f;
            this.sUS = -1;
            this.yiw = -1;
            this.so = ViewCompat.MEASURED_SIZE_MASK;
            this.Mxy = ViewCompat.MEASURED_SIZE_MASK;
            this.pvs = pvsVar.pvs;
            this.icD = pvsVar.icD;
            this.vG = pvsVar.vG;
            this.Jd = pvsVar.Jd;
            this.NB = pvsVar.NB;
            this.sUS = pvsVar.sUS;
            this.yiw = pvsVar.yiw;
            this.so = pvsVar.so;
            this.Mxy = pvsVar.Mxy;
            this.Wyp = pvsVar.Wyp;
        }

        public pvs(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.pvs = 1;
            this.icD = 0.0f;
            this.vG = 0.0f;
            this.Jd = -1;
            this.NB = -1.0f;
            this.sUS = -1;
            this.yiw = -1;
            this.so = ViewCompat.MEASURED_SIZE_MASK;
            this.Mxy = ViewCompat.MEASURED_SIZE_MASK;
        }

        public pvs(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.pvs = 1;
            this.icD = 0.0f;
            this.vG = 0.0f;
            this.Jd = -1;
            this.NB = -1.0f;
            this.sUS = -1;
            this.yiw = -1;
            this.so = ViewCompat.MEASURED_SIZE_MASK;
            this.Mxy = ViewCompat.MEASURED_SIZE_MASK;
        }

        public pvs(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.pvs = 1;
            this.icD = 0.0f;
            this.vG = 0.0f;
            this.Jd = -1;
            this.NB = -1.0f;
            this.sUS = -1;
            this.yiw = -1;
            this.so = ViewCompat.MEASURED_SIZE_MASK;
            this.Mxy = ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int pvs() {
            return this.width;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int icD() {
            return this.height;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int vG() {
            return this.pvs;
        }

        public void vG(int i) {
            this.pvs = i;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public float Jd() {
            return this.icD;
        }

        public void pvs(float f) {
            this.icD = f;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public float NB() {
            return this.vG;
        }

        public void icD(float f) {
            this.vG = f;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int sUS() {
            return this.Jd;
        }

        public void Jd(int i) {
            this.Jd = i;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int yiw() {
            return this.sUS;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public void pvs(int i) {
            this.sUS = i;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int so() {
            return this.yiw;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public void icD(int i) {
            this.yiw = i;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int Mxy() {
            return this.so;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int Wyp() {
            return this.Mxy;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public boolean qh() {
            return this.Wyp;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public float kj() {
            return this.NB;
        }

        public void vG(float f) {
            this.NB = f;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int Ju() {
            return this.leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int IP() {
            return this.topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int bNS() {
            return this.rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.component.flexbox.icD
        public int mnm() {
            return this.bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.pvs);
            parcel.writeFloat(this.icD);
            parcel.writeFloat(this.vG);
            parcel.writeInt(this.Jd);
            parcel.writeFloat(this.NB);
            parcel.writeInt(this.sUS);
            parcel.writeInt(this.yiw);
            parcel.writeInt(this.so);
            parcel.writeInt(this.Mxy);
            parcel.writeByte(this.Wyp ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected pvs(Parcel parcel) {
            super(0, 0);
            this.pvs = 1;
            this.icD = 0.0f;
            this.vG = 0.0f;
            this.Jd = -1;
            this.NB = -1.0f;
            this.sUS = -1;
            this.yiw = -1;
            this.so = ViewCompat.MEASURED_SIZE_MASK;
            this.Mxy = ViewCompat.MEASURED_SIZE_MASK;
            this.pvs = parcel.readInt();
            this.icD = parcel.readFloat();
            this.vG = parcel.readFloat();
            this.Jd = parcel.readInt();
            this.NB = parcel.readFloat();
            this.sUS = parcel.readInt();
            this.yiw = parcel.readInt();
            this.so = parcel.readInt();
            this.Mxy = parcel.readInt();
            this.Wyp = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public void pvs(com.bytedance.adsdk.ugeno.component.icD icd) {
        this.vA = icd;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.icD icd = this.vA;
        if (icd != null) {
            icd.sUS();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.icD icd = this.vA;
        if (icd != null) {
            icd.yiw();
        }
    }
}
