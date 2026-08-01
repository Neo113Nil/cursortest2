package com.bytedance.adsdk.ugeno.component.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.adsdk.ugeno.icD.sUS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: FlexboxHelper.java */
/* loaded from: classes.dex */
class Jd {
    static final /* synthetic */ boolean vG = true;
    private final com.bytedance.adsdk.ugeno.component.flexbox.pvs Jd;
    private boolean[] NB;
    long[] icD;
    int[] pvs;
    private long[] sUS;

    int icD(long j) {
        return (int) (j >> 32);
    }

    long icD(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    int pvs(long j) {
        return (int) j;
    }

    Jd(com.bytedance.adsdk.ugeno.component.flexbox.pvs pvsVar) {
        this.Jd = pvsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] pvs(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.Jd.getFlexItemCount();
        List<icD> icD2 = icD(flexItemCount);
        icD icd = new icD();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.component.flexbox.icD)) {
            icd.icD = ((com.bytedance.adsdk.ugeno.component.flexbox.icD) layoutParams).vG();
        } else {
            icd.icD = 1;
        }
        if (i == -1 || i == flexItemCount) {
            icd.pvs = flexItemCount;
        } else if (i < this.Jd.getFlexItemCount()) {
            icd.pvs = i;
            while (i < flexItemCount) {
                icD2.get(i).pvs++;
                i++;
            }
        } else {
            icd.pvs = flexItemCount;
        }
        icD2.add(icd);
        return pvs(flexItemCount + 1, icD2, sparseIntArray);
    }

    int[] pvs(SparseIntArray sparseIntArray) {
        int flexItemCount = this.Jd.getFlexItemCount();
        return pvs(flexItemCount, icD(flexItemCount), sparseIntArray);
    }

    private List<icD> icD(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) this.Jd.pvs(i2).getLayoutParams();
            icD icd2 = new icD();
            icd2.icD = icd.vG();
            icd2.pvs = i2;
            arrayList.add(icd2);
        }
        return arrayList;
    }

    boolean icD(SparseIntArray sparseIntArray) {
        int flexItemCount = this.Jd.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return vG;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View pvs2 = this.Jd.pvs(i);
            if (pvs2 != null && ((com.bytedance.adsdk.ugeno.component.flexbox.icD) pvs2.getLayoutParams()).vG() != sparseIntArray.get(i)) {
                return vG;
            }
        }
        return false;
    }

    private int[] pvs(int i, List<icD> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (icD icd : list) {
            iArr[i2] = icd.pvs;
            sparseIntArray.append(icd.pvs, icd.icD);
            i2++;
        }
        return iArr;
    }

    void pvs(pvs pvsVar, int i, int i2) {
        pvs(pvsVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<vG>) null);
    }

    void icD(pvs pvsVar, int i, int i2) {
        pvs(pvsVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<vG>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void pvs(pvs pvsVar, int i, int i2, int i3, int i4, int i5, List<vG> list) {
        int i6;
        pvs pvsVar2;
        int i7;
        int i8;
        int i9;
        List<vG> list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i;
        int i19 = i2;
        int i20 = i5;
        boolean pvs2 = this.Jd.pvs();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<vG> arrayList = list == null ? new ArrayList() : list;
        pvsVar.pvs = arrayList;
        int i21 = i20 == -1 ? 1 : 0;
        int pvs3 = pvs(pvs2);
        int icD2 = icD(pvs2);
        int vG2 = vG(pvs2);
        int Jd = Jd(pvs2);
        vG vGVar = new vG();
        int i22 = i4;
        vGVar.bNS = i22;
        int i23 = icD2 + pvs3;
        vGVar.NB = i23;
        int flexItemCount = this.Jd.getFlexItemCount();
        int i24 = i21;
        int i25 = Integer.MIN_VALUE;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i22 >= flexItemCount) {
                i6 = i27;
                pvsVar2 = pvsVar;
                break;
            }
            View icD3 = this.Jd.icD(i22);
            if (icD3 == null) {
                if (pvs(i22, flexItemCount, vGVar)) {
                    pvs(arrayList, vGVar, i22, i26);
                }
            } else if (icD3.getVisibility() == 8) {
                vGVar.Mxy++;
                vGVar.so++;
                if (pvs(i22, flexItemCount, vGVar)) {
                    pvs(arrayList, vGVar, i22, i26);
                }
            } else {
                if (icD3 instanceof CompoundButton) {
                    pvs((CompoundButton) icD3);
                }
                com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) icD3.getLayoutParams();
                int i29 = flexItemCount;
                if (icd.sUS() == 4) {
                    vGVar.IP.add(Integer.valueOf(i22));
                }
                int pvs4 = pvs(icd, pvs2);
                if (icd.kj() != -1.0f && mode == 1073741824) {
                    pvs4 = Math.round(size * icd.kj());
                }
                if (pvs2) {
                    int pvs5 = this.Jd.pvs(i18, i23 + vG(icd, vG) + Jd(icd, vG), pvs4);
                    i7 = size;
                    i8 = mode;
                    int icD4 = this.Jd.icD(i19, vG2 + Jd + NB(icd, vG) + sUS(icd, vG) + i26, icD(icd, vG));
                    icD3.measure(pvs5, icD4);
                    pvs(i22, pvs5, icD4, icD3);
                    i9 = pvs5;
                } else {
                    i7 = size;
                    i8 = mode;
                    int pvs6 = this.Jd.pvs(i19, vG2 + Jd + NB(icd, false) + sUS(icd, false) + i26, icD(icd, false));
                    int icD5 = this.Jd.icD(i18, vG(icd, false) + i23 + Jd(icd, false), pvs4);
                    icD3.measure(pvs6, icD5);
                    pvs(i22, pvs6, icD5, icD3);
                    i9 = icD5;
                }
                pvs(icD3, i22);
                i27 = View.combineMeasuredStates(i27, icD3.getMeasuredState());
                int i30 = i26;
                int i31 = i23;
                vG vGVar2 = vGVar;
                int i32 = i22;
                list2 = arrayList;
                int i33 = i9;
                if (pvs(icD3, i8, i7, vGVar.NB, Jd(icd, pvs2) + pvs(icD3, pvs2) + vG(icd, pvs2), icd, i32, i28, arrayList.size())) {
                    if (vGVar2.icD() > 0) {
                        pvs(list2, vGVar2, i32 > 0 ? i32 - 1 : 0, i30);
                        i26 = vGVar2.yiw + i30;
                    } else {
                        i26 = i30;
                    }
                    if (pvs2) {
                        if (icd.icD() == -1) {
                            com.bytedance.adsdk.ugeno.component.flexbox.pvs pvsVar3 = this.Jd;
                            i10 = i2;
                            i22 = i32;
                            view = icD3;
                            view.measure(i33, pvsVar3.icD(i10, pvsVar3.getPaddingTop() + this.Jd.getPaddingBottom() + icd.IP() + icd.mnm() + i26, icd.icD()));
                            pvs(view, i22);
                        } else {
                            i10 = i2;
                            view = icD3;
                            i22 = i32;
                        }
                    } else {
                        i10 = i2;
                        view = icD3;
                        i22 = i32;
                        if (icd.pvs() == -1) {
                            com.bytedance.adsdk.ugeno.component.flexbox.pvs pvsVar4 = this.Jd;
                            view.measure(pvsVar4.pvs(i10, pvsVar4.getPaddingLeft() + this.Jd.getPaddingRight() + icd.Ju() + icd.bNS() + i26, icd.pvs()), i33);
                            pvs(view, i22);
                        }
                    }
                    vGVar = new vG();
                    i12 = 1;
                    vGVar.so = 1;
                    i11 = i31;
                    vGVar.NB = i11;
                    vGVar.bNS = i22;
                    i14 = Integer.MIN_VALUE;
                    i13 = 0;
                } else {
                    i10 = i2;
                    view = icD3;
                    i22 = i32;
                    vGVar = vGVar2;
                    i11 = i31;
                    i12 = 1;
                    vGVar.so++;
                    i13 = i28 + 1;
                    i26 = i30;
                    i14 = i25;
                }
                vGVar.vA = (vGVar.vA ? 1 : 0) | (icd.Jd() != 0.0f ? i12 : 0);
                vGVar.cR = (vGVar.cR ? 1 : 0) | (icd.NB() != 0.0f ? i12 : 0);
                int[] iArr = this.pvs;
                if (iArr != null) {
                    iArr[i22] = list2.size();
                }
                vGVar.NB += pvs(view, pvs2) + vG(icd, pvs2) + Jd(icd, pvs2);
                vGVar.Wyp += icd.Jd();
                vGVar.qh += icd.NB();
                this.Jd.pvs(view, i22, i13, vGVar);
                int max = Math.max(i14, icD(view, pvs2) + NB(icd, pvs2) + sUS(icd, pvs2) + this.Jd.pvs(view));
                vGVar.yiw = Math.max(vGVar.yiw, max);
                if (pvs2) {
                    if (this.Jd.getFlexWrap() != 2) {
                        vGVar.kj = Math.max(vGVar.kj, view.getBaseline() + icd.IP());
                    } else {
                        vGVar.kj = Math.max(vGVar.kj, (view.getMeasuredHeight() - view.getBaseline()) + icd.mnm());
                    }
                }
                i15 = i29;
                if (pvs(i22, i15, vGVar)) {
                    pvs(list2, vGVar, i22, i26);
                    i26 += vGVar.yiw;
                }
                i16 = i5;
                if (i16 == -1 || list2.size() <= 0 || list2.get(list2.size() - i12).mnm < i16 || i22 < i16 || i24 != 0) {
                    i17 = i3;
                } else {
                    i26 = -vGVar.pvs();
                    i17 = i3;
                    i24 = i12;
                }
                if (i26 > i17 && i24 != 0) {
                    pvsVar2 = pvsVar;
                    i6 = i27;
                    break;
                }
                i28 = i13;
                i25 = max;
                i22++;
                i18 = i;
                flexItemCount = i15;
                i19 = i10;
                i23 = i11;
                arrayList = list2;
                size = i7;
                i20 = i16;
                mode = i8;
            }
            i7 = size;
            i8 = mode;
            i10 = i19;
            i16 = i20;
            list2 = arrayList;
            i11 = i23;
            i15 = flexItemCount;
            i22++;
            i18 = i;
            flexItemCount = i15;
            i19 = i10;
            i23 = i11;
            arrayList = list2;
            size = i7;
            i20 = i16;
            mode = i8;
        }
        pvsVar2.icD = i6;
    }

    private void pvs(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) compoundButton.getLayoutParams();
        int yiw = icd.yiw();
        int so = icd.so();
        Drawable pvs2 = com.bytedance.adsdk.ugeno.icD.NB.pvs(compoundButton);
        int minimumWidth = pvs2 == null ? 0 : pvs2.getMinimumWidth();
        int minimumHeight = pvs2 != null ? pvs2.getMinimumHeight() : 0;
        if (yiw == -1) {
            yiw = minimumWidth;
        }
        icd.pvs(yiw);
        if (so == -1) {
            so = minimumHeight;
        }
        icd.icD(so);
    }

    private int pvs(boolean z) {
        if (z) {
            return this.Jd.getPaddingStart();
        }
        return this.Jd.getPaddingTop();
    }

    private int icD(boolean z) {
        if (z) {
            return this.Jd.getPaddingEnd();
        }
        return this.Jd.getPaddingBottom();
    }

    private int vG(boolean z) {
        if (z) {
            return this.Jd.getPaddingTop();
        }
        return this.Jd.getPaddingStart();
    }

    private int Jd(boolean z) {
        if (z) {
            return this.Jd.getPaddingBottom();
        }
        return this.Jd.getPaddingEnd();
    }

    private int pvs(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int icD(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int pvs(com.bytedance.adsdk.ugeno.component.flexbox.icD icd, boolean z) {
        if (z) {
            return icd.pvs();
        }
        return icd.icD();
    }

    private int icD(com.bytedance.adsdk.ugeno.component.flexbox.icD icd, boolean z) {
        if (z) {
            return icd.icD();
        }
        return icd.pvs();
    }

    private int vG(com.bytedance.adsdk.ugeno.component.flexbox.icD icd, boolean z) {
        if (z) {
            return icd.Ju();
        }
        return icd.IP();
    }

    private int Jd(com.bytedance.adsdk.ugeno.component.flexbox.icD icd, boolean z) {
        if (z) {
            return icd.bNS();
        }
        return icd.mnm();
    }

    private int NB(com.bytedance.adsdk.ugeno.component.flexbox.icD icd, boolean z) {
        if (z) {
            return icd.IP();
        }
        return icd.Ju();
    }

    private int sUS(com.bytedance.adsdk.ugeno.component.flexbox.icD icd, boolean z) {
        if (z) {
            return icd.mnm();
        }
        return icd.bNS();
    }

    private boolean pvs(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.component.flexbox.icD icd, int i5, int i6, int i7) {
        if (this.Jd.getFlexWrap() == 0) {
            return false;
        }
        if (icd.qh()) {
            return vG;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.Jd.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int pvs2 = this.Jd.pvs(view, i5, i6);
        if (pvs2 > 0) {
            i4 += pvs2;
        }
        if (i2 < i3 + i4) {
            return vG;
        }
        return false;
    }

    private boolean pvs(int i, int i2, vG vGVar) {
        if (i != i2 - 1 || vGVar.icD() == 0) {
            return false;
        }
        return vG;
    }

    private void pvs(List<vG> list, vG vGVar, int i, int i2) {
        vGVar.Ju = i2;
        this.Jd.pvs(vGVar);
        vGVar.mnm = i;
        list.add(vGVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(View view, int i) {
        boolean z;
        com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int yiw = icd.yiw();
        boolean z2 = vG;
        if (measuredWidth < yiw) {
            measuredWidth = icd.yiw();
        } else if (measuredWidth > icd.Mxy()) {
            measuredWidth = icd.Mxy();
        } else {
            z = false;
            if (measuredHeight >= icd.so()) {
                measuredHeight = icd.so();
            } else if (measuredHeight > icd.Wyp()) {
                measuredHeight = icd.Wyp();
            } else {
                z2 = z;
            }
            if (z2) {
                return;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            pvs(i, makeMeasureSpec, makeMeasureSpec2, view);
            return;
        }
        z = true;
        if (measuredHeight >= icd.so()) {
        }
        if (z2) {
        }
    }

    void pvs(int i, int i2) {
        pvs(i, i2, 0);
    }

    void pvs(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        vG(this.Jd.getFlexItemCount());
        if (i3 >= this.Jd.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.Jd.getFlexDirection();
        int flexDirection2 = this.Jd.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.Jd.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.Jd.getPaddingLeft();
            paddingRight = this.Jd.getPaddingRight();
        } else if (flexDirection2 == 2 || flexDirection2 == 3) {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.Jd.getLargestMainSize();
            }
            paddingLeft = this.Jd.getPaddingTop();
            paddingRight = this.Jd.getPaddingBottom();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.pvs;
        List<vG> flexLinesInternal = this.Jd.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            vG vGVar = flexLinesInternal.get(i5);
            if (vGVar.NB < size && vGVar.vA) {
                pvs(i, i2, vGVar, size, i4, false);
            } else if (vGVar.NB > size && vGVar.cR) {
                icD(i, i2, vGVar, size, i4, false);
            }
        }
    }

    private void vG(int i) {
        boolean[] zArr = this.NB;
        if (zArr == null) {
            this.NB = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.NB = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void pvs(int i, int i2, vG vGVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        double d;
        int i7;
        double d2;
        float f = 0.0f;
        if (vGVar.Wyp <= 0.0f || i3 < vGVar.NB) {
            return;
        }
        int i8 = vGVar.NB;
        float f2 = (i3 - vGVar.NB) / vGVar.Wyp;
        vGVar.NB = i4 + vGVar.sUS;
        if (!z) {
            vGVar.yiw = Integer.MIN_VALUE;
        }
        int i9 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i10 = 0;
        while (i9 < vGVar.so) {
            int i11 = vGVar.bNS + i9;
            View icD2 = this.Jd.icD(i11);
            if (icD2 == null || icD2.getVisibility() == 8) {
                i5 = i8;
            } else {
                com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) icD2.getLayoutParams();
                int flexDirection = this.Jd.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i12 = i8;
                    int measuredWidth = icD2.getMeasuredWidth();
                    long[] jArr = this.sUS;
                    if (jArr != null) {
                        measuredWidth = pvs(jArr[i11]);
                    }
                    int measuredHeight = icD2.getMeasuredHeight();
                    long[] jArr2 = this.sUS;
                    i5 = i12;
                    if (jArr2 != null) {
                        measuredHeight = icD(jArr2[i11]);
                    }
                    if (!this.NB[i11] && icd.Jd() > 0.0f) {
                        float Jd = measuredWidth + (icd.Jd() * f2);
                        if (i9 == vGVar.so - 1) {
                            Jd += f3;
                            f3 = 0.0f;
                        }
                        int round = Math.round(Jd);
                        if (round > icd.Mxy()) {
                            round = icd.Mxy();
                            this.NB[i11] = vG;
                            vGVar.Wyp -= icd.Jd();
                            z2 = true;
                        } else {
                            f3 += Jd - round;
                            double d3 = f3;
                            if (d3 > 1.0d) {
                                round++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                round--;
                                d = d3 + 1.0d;
                            }
                            f3 = (float) d;
                        }
                        int icD3 = icD(i2, icd, vGVar.Ju);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        icD2.measure(makeMeasureSpec, icD3);
                        int measuredWidth2 = icD2.getMeasuredWidth();
                        int measuredHeight2 = icD2.getMeasuredHeight();
                        pvs(i11, makeMeasureSpec, icD3, icD2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, measuredHeight + icd.IP() + icd.mnm() + this.Jd.pvs(icD2));
                    vGVar.NB += measuredWidth + icd.Ju() + icd.bNS();
                    i6 = max;
                } else {
                    int measuredHeight3 = icD2.getMeasuredHeight();
                    long[] jArr3 = this.sUS;
                    if (jArr3 != null) {
                        measuredHeight3 = icD(jArr3[i11]);
                    }
                    int measuredWidth3 = icD2.getMeasuredWidth();
                    long[] jArr4 = this.sUS;
                    if (jArr4 != null) {
                        measuredWidth3 = pvs(jArr4[i11]);
                    }
                    if (this.NB[i11] || icd.Jd() <= f) {
                        i7 = i8;
                    } else {
                        float Jd2 = measuredHeight3 + (icd.Jd() * f2);
                        if (i9 == vGVar.so - 1) {
                            Jd2 += f3;
                            f3 = f;
                        }
                        int round2 = Math.round(Jd2);
                        if (round2 > icd.Wyp()) {
                            round2 = icd.Wyp();
                            this.NB[i11] = vG;
                            vGVar.Wyp -= icd.Jd();
                            i7 = i8;
                            z2 = vG;
                        } else {
                            f3 += Jd2 - round2;
                            i7 = i8;
                            double d4 = f3;
                            if (d4 > 1.0d) {
                                round2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                d2 = d4 + 1.0d;
                            }
                            f3 = (float) d2;
                        }
                        int pvs2 = pvs(i, icd, vGVar.Ju);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        icD2.measure(pvs2, makeMeasureSpec2);
                        measuredWidth3 = icD2.getMeasuredWidth();
                        int measuredHeight4 = icD2.getMeasuredHeight();
                        pvs(i11, pvs2, makeMeasureSpec2, icD2);
                        measuredHeight3 = measuredHeight4;
                    }
                    i6 = Math.max(i10, measuredWidth3 + icd.Ju() + icd.bNS() + this.Jd.pvs(icD2));
                    vGVar.NB += measuredHeight3 + icd.IP() + icd.mnm();
                    i5 = i7;
                }
                vGVar.yiw = Math.max(vGVar.yiw, i6);
                i10 = i6;
            }
            i9++;
            i8 = i5;
            f = 0.0f;
        }
        int i13 = i8;
        if (!z2 || i13 == vGVar.NB) {
            return;
        }
        pvs(i, i2, vGVar, i3, i4, vG);
    }

    private void icD(int i, int i2, vG vGVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7 = vGVar.NB;
        float f = 0.0f;
        if (vGVar.qh <= 0.0f || i3 > vGVar.NB) {
            return;
        }
        float f2 = (vGVar.NB - i3) / vGVar.qh;
        vGVar.NB = i4 + vGVar.sUS;
        if (!z) {
            vGVar.yiw = Integer.MIN_VALUE;
        }
        int i8 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i9 = 0;
        while (i8 < vGVar.so) {
            int i10 = vGVar.bNS + i8;
            View icD2 = this.Jd.icD(i10);
            if (icD2 == null || icD2.getVisibility() == 8) {
                i5 = i8;
            } else {
                com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) icD2.getLayoutParams();
                int flexDirection = this.Jd.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i8;
                    int measuredWidth = icD2.getMeasuredWidth();
                    long[] jArr = this.sUS;
                    if (jArr != null) {
                        measuredWidth = pvs(jArr[i10]);
                    }
                    int measuredHeight = icD2.getMeasuredHeight();
                    long[] jArr2 = this.sUS;
                    if (jArr2 != null) {
                        measuredHeight = icD(jArr2[i10]);
                    }
                    if (!this.NB[i10] && icd.NB() > 0.0f) {
                        float NB = measuredWidth - (icd.NB() * f2);
                        if (i5 == vGVar.so - 1) {
                            NB += f3;
                            f3 = 0.0f;
                        }
                        int round = Math.round(NB);
                        if (round < icd.yiw()) {
                            round = icd.yiw();
                            this.NB[i10] = vG;
                            vGVar.qh -= icd.NB();
                            z2 = true;
                        } else {
                            f3 += NB - round;
                            double d = f3;
                            if (d > 1.0d) {
                                round++;
                                f3 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f3 += 1.0f;
                            }
                        }
                        int icD3 = icD(i2, icd, vGVar.Ju);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        icD2.measure(makeMeasureSpec, icD3);
                        int measuredWidth2 = icD2.getMeasuredWidth();
                        int measuredHeight2 = icD2.getMeasuredHeight();
                        pvs(i10, makeMeasureSpec, icD3, icD2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i9, measuredHeight + icd.IP() + icd.mnm() + this.Jd.pvs(icD2));
                    vGVar.NB += measuredWidth + icd.Ju() + icd.bNS();
                    i6 = max;
                } else {
                    int measuredHeight3 = icD2.getMeasuredHeight();
                    long[] jArr3 = this.sUS;
                    if (jArr3 != null) {
                        measuredHeight3 = icD(jArr3[i10]);
                    }
                    int measuredWidth3 = icD2.getMeasuredWidth();
                    long[] jArr4 = this.sUS;
                    if (jArr4 != null) {
                        measuredWidth3 = pvs(jArr4[i10]);
                    }
                    if (this.NB[i10] || icd.NB() <= f) {
                        i5 = i8;
                    } else {
                        float NB2 = measuredHeight3 - (icd.NB() * f2);
                        if (i8 == vGVar.so - 1) {
                            NB2 += f3;
                            f3 = f;
                        }
                        int round2 = Math.round(NB2);
                        if (round2 < icd.so()) {
                            round2 = icd.so();
                            this.NB[i10] = vG;
                            vGVar.qh -= icd.NB();
                            i5 = i8;
                            z2 = vG;
                        } else {
                            f3 += NB2 - round2;
                            i5 = i8;
                            double d2 = f3;
                            if (d2 > 1.0d) {
                                round2++;
                                f3 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f3 += 1.0f;
                            }
                        }
                        int pvs2 = pvs(i, icd, vGVar.Ju);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        icD2.measure(pvs2, makeMeasureSpec2);
                        measuredWidth3 = icD2.getMeasuredWidth();
                        int measuredHeight4 = icD2.getMeasuredHeight();
                        pvs(i10, pvs2, makeMeasureSpec2, icD2);
                        measuredHeight3 = measuredHeight4;
                    }
                    i6 = Math.max(i9, measuredWidth3 + icd.Ju() + icd.bNS() + this.Jd.pvs(icD2));
                    vGVar.NB += measuredHeight3 + icd.IP() + icd.mnm();
                }
                vGVar.yiw = Math.max(vGVar.yiw, i6);
                i9 = i6;
            }
            i8 = i5 + 1;
            f = 0.0f;
        }
        if (!z2 || i7 == vGVar.NB) {
            return;
        }
        icD(i, i2, vGVar, i3, i4, vG);
    }

    private int pvs(int i, com.bytedance.adsdk.ugeno.component.flexbox.icD icd, int i2) {
        com.bytedance.adsdk.ugeno.component.flexbox.pvs pvsVar = this.Jd;
        int pvs2 = pvsVar.pvs(i, pvsVar.getPaddingLeft() + this.Jd.getPaddingRight() + icd.Ju() + icd.bNS() + i2, icd.pvs());
        int size = View.MeasureSpec.getSize(pvs2);
        if (size > icd.Mxy()) {
            return View.MeasureSpec.makeMeasureSpec(icd.Mxy(), View.MeasureSpec.getMode(pvs2));
        }
        return size < icd.yiw() ? View.MeasureSpec.makeMeasureSpec(icd.yiw(), View.MeasureSpec.getMode(pvs2)) : pvs2;
    }

    private int icD(int i, com.bytedance.adsdk.ugeno.component.flexbox.icD icd, int i2) {
        com.bytedance.adsdk.ugeno.component.flexbox.pvs pvsVar = this.Jd;
        int icD2 = pvsVar.icD(i, pvsVar.getPaddingTop() + this.Jd.getPaddingBottom() + icd.IP() + icd.mnm() + i2, icd.icD());
        int size = View.MeasureSpec.getSize(icD2);
        if (size > icd.Wyp()) {
            return View.MeasureSpec.makeMeasureSpec(icd.Wyp(), View.MeasureSpec.getMode(icD2));
        }
        return size < icd.so() ? View.MeasureSpec.makeMeasureSpec(icd.so(), View.MeasureSpec.getMode(icD2)) : icD2;
    }

    void icD(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.Jd.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        List<vG> flexLinesInternal = this.Jd.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.Jd.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).yiw = i5 - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.Jd.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    vG vGVar = new vG();
                    vGVar.yiw = i7;
                    flexLinesInternal.add(0, vGVar);
                    return;
                }
                if (alignContent == 2) {
                    this.Jd.setFlexLines(pvs(flexLinesInternal, i5, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < i5) {
                        float size2 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size3 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i6 < size3) {
                            arrayList.add(flexLinesInternal.get(i6));
                            if (i6 != flexLinesInternal.size() - 1) {
                                vG vGVar2 = new vG();
                                if (i6 == flexLinesInternal.size() - 2) {
                                    vGVar2.yiw = Math.round(f + size2);
                                    f = 0.0f;
                                } else {
                                    vGVar2.yiw = Math.round(size2);
                                }
                                f += size2 - vGVar2.yiw;
                                if (f > 1.0f) {
                                    vGVar2.yiw++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    vGVar2.yiw--;
                                    f += 1.0f;
                                }
                                arrayList.add(vGVar2);
                            }
                            i6++;
                        }
                        this.Jd.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= i5) {
                        this.Jd.setFlexLines(pvs(flexLinesInternal, i5, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    vG vGVar3 = new vG();
                    vGVar3.yiw = size4;
                    for (vG vGVar4 : flexLinesInternal) {
                        arrayList2.add(vGVar3);
                        arrayList2.add(vGVar4);
                        arrayList2.add(vGVar3);
                    }
                    this.Jd.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < i5) {
                    float size5 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i6 < size6) {
                        vG vGVar5 = flexLinesInternal.get(i6);
                        float f3 = vGVar5.yiw + size5;
                        if (i6 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int round = Math.round(f3);
                        f2 += f3 - round;
                        if (f2 > 1.0f) {
                            round++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            round--;
                            f2 += 1.0f;
                        }
                        vGVar5.yiw = round;
                        i6++;
                    }
                }
            }
        }
    }

    private List<vG> pvs(List<vG> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        vG vGVar = new vG();
        vGVar.yiw = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(vGVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(vGVar);
            }
        }
        return arrayList;
    }

    void pvs() {
        pvs(0);
    }

    void pvs(int i) {
        View icD2;
        if (i >= this.Jd.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.Jd.getFlexDirection();
        if (this.Jd.getAlignItems() == 4) {
            int[] iArr = this.pvs;
            List<vG> flexLinesInternal = this.Jd.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                vG vGVar = flexLinesInternal.get(i2);
                int i3 = vGVar.so;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = vGVar.bNS + i4;
                    if (i4 < this.Jd.getFlexItemCount() && (icD2 = this.Jd.icD(i5)) != null && icD2.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) icD2.getLayoutParams();
                        if (icd.sUS() == -1 || icd.sUS() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                pvs(icD2, vGVar.yiw, i5);
                            } else if (flexDirection == 2 || flexDirection == 3) {
                                icD(icD2, vGVar.yiw, i5);
                            } else {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            }
                        }
                    }
                }
            }
            return;
        }
        for (vG vGVar2 : this.Jd.getFlexLinesInternal()) {
            for (Integer num : vGVar2.IP) {
                View icD3 = this.Jd.icD(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    pvs(icD3, vGVar2.yiw, num.intValue());
                } else if (flexDirection == 2 || flexDirection == 3) {
                    icD(icD3, vGVar2.yiw, num.intValue());
                } else {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                }
            }
        }
    }

    private void pvs(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) view.getLayoutParams();
        int min = Math.min(Math.max(((i - icd.IP()) - icd.mnm()) - this.Jd.pvs(view), icd.so()), icd.Wyp());
        long[] jArr = this.sUS;
        if (jArr != null) {
            measuredWidth = pvs(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        pvs(i2, makeMeasureSpec, makeMeasureSpec2, view);
    }

    private void icD(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) view.getLayoutParams();
        int min = Math.min(Math.max(((i - icd.Ju()) - icd.bNS()) - this.Jd.pvs(view), icd.yiw()), icd.Mxy());
        long[] jArr = this.sUS;
        if (jArr != null) {
            measuredHeight = icD(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        pvs(i2, makeMeasureSpec2, makeMeasureSpec, view);
    }

    void pvs(View view, vG vGVar, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) view.getLayoutParams();
        int alignItems = this.Jd.getAlignItems();
        if (icd.sUS() != -1) {
            alignItems = icd.sUS();
        }
        int i5 = vGVar.yiw;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.Jd.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - icd.mnm(), i3, i6 - icd.mnm());
                    return;
                } else {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + icd.IP(), i3, (i4 - i5) + view.getMeasuredHeight() + icd.IP());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + icd.IP()) - icd.mnm()) / 2;
                if (this.Jd.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.Jd.getFlexWrap() != 2) {
                    int max = Math.max(vGVar.kj - view.getBaseline(), icd.IP());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((vGVar.kj - view.getMeasuredHeight()) + view.getBaseline(), icd.mnm());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.Jd.getFlexWrap() != 2) {
            view.layout(i, i2 + icd.IP(), i3, i4 + icd.IP());
        } else {
            view.layout(i, i2 - icd.mnm(), i3, i4 - icd.mnm());
        }
    }

    void pvs(View view, vG vGVar, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.component.flexbox.icD icd = (com.bytedance.adsdk.ugeno.component.flexbox.icD) view.getLayoutParams();
        int alignItems = this.Jd.getAlignItems();
        if (icd.sUS() != -1) {
            alignItems = icd.sUS();
        }
        int i5 = vGVar.yiw;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - icd.bNS(), i2, ((i3 + i5) - view.getMeasuredWidth()) - icd.bNS(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + icd.Ju(), i2, (i3 - i5) + view.getMeasuredWidth() + icd.Ju(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + sUS.pvs(marginLayoutParams)) - sUS.icD(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + icd.Ju(), i2, i3 + icd.Ju(), i4);
        } else {
            view.layout(i - icd.bNS(), i2, i3 - icd.bNS(), i4);
        }
    }

    private void pvs(int i, int i2, int i3, View view) {
        long[] jArr = this.icD;
        if (jArr != null) {
            jArr[i] = icD(i2, i3);
        }
        long[] jArr2 = this.sUS;
        if (jArr2 != null) {
            jArr2[i] = icD(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* compiled from: FlexboxHelper.java */
    private static class icD implements Comparable<icD> {
        int icD;
        int pvs;

        private icD() {
        }

        @Override // java.lang.Comparable
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public int compareTo(icD icd) {
            int i = this.icD;
            int i2 = icd.icD;
            return i != i2 ? i - i2 : this.pvs - icd.pvs;
        }

        public String toString() {
            return "Order{order=" + this.icD + ", index=" + this.pvs + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* compiled from: FlexboxHelper.java */
    static class pvs {
        int icD;
        List<vG> pvs;

        pvs() {
        }

        void pvs() {
            this.pvs = null;
            this.icD = 0;
        }
    }
}
