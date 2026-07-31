package com.bytedance.adsdk.ugeno.btk;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes13.dex */
class fb {
    static final /* synthetic */ boolean zn = true;
    private boolean[] btk;
    private final com.bytedance.adsdk.ugeno.btk.zmn fb;
    long[] fs;
    private long[] hhw;
    int[] zmn;

    int fs(long j) {
        return (int) (j >> 32);
    }

    long fs(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    int zmn(long j) {
        return (int) j;
    }

    fb(com.bytedance.adsdk.ugeno.btk.zmn zmnVar) {
        this.fb = zmnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] zmn(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.fb.getFlexItemCount();
        List<fs> fs2 = fs(flexItemCount);
        fs fsVar = new fs();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.btk.fs)) {
            fsVar.fs = ((com.bytedance.adsdk.ugeno.btk.fs) layoutParams).zn();
        } else {
            fsVar.fs = 1;
        }
        if (i == -1 || i == flexItemCount) {
            fsVar.zmn = flexItemCount;
        } else if (i < this.fb.getFlexItemCount()) {
            fsVar.zmn = i;
            while (i < flexItemCount) {
                fs2.get(i).zmn++;
                i++;
            }
        } else {
            fsVar.zmn = flexItemCount;
        }
        fs2.add(fsVar);
        return zmn(flexItemCount + 1, fs2, sparseIntArray);
    }

    int[] zmn(SparseIntArray sparseIntArray) {
        int flexItemCount = this.fb.getFlexItemCount();
        return zmn(flexItemCount, fs(flexItemCount), sparseIntArray);
    }

    private List<fs> fs(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) this.fb.zmn(i2).getLayoutParams();
            fs fsVar2 = new fs();
            fsVar2.fs = fsVar.zn();
            fsVar2.zmn = i2;
            arrayList.add(fsVar2);
        }
        return arrayList;
    }

    boolean fs(SparseIntArray sparseIntArray) {
        int flexItemCount = this.fb.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View zmn2 = this.fb.zmn(i);
            if (zmn2 != null && ((com.bytedance.adsdk.ugeno.btk.fs) zmn2.getLayoutParams()).zn() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    private int[] zmn(int i, List<fs> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (fs fsVar : list) {
            int i3 = fsVar.zmn;
            iArr[i2] = i3;
            sparseIntArray.append(i3, fsVar.fs);
            i2++;
        }
        return iArr;
    }

    void zmn(zmn zmnVar, int i, int i2) {
        zmn(zmnVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<zn>) null);
    }

    void fs(zmn zmnVar, int i, int i2) {
        zmn(zmnVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<zn>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void zmn(zmn zmnVar, int i, int i2, int i3, int i4, int i5, List<zn> list) {
        int i6;
        zmn zmnVar2;
        int i7;
        int i8;
        int i9;
        List<zn> list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i;
        int i20 = i2;
        int i21 = i5;
        boolean zmn2 = this.fb.zmn();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<zn> arrayList = list == null ? new ArrayList() : list;
        zmnVar.zmn = arrayList;
        int i22 = i21 == -1 ? 1 : 0;
        int zmn3 = zmn(zmn2);
        int fs2 = fs(zmn2);
        int zn2 = zn(zmn2);
        int fb = fb(zmn2);
        zn znVar = new zn();
        int i23 = i4;
        znVar.cn = i23;
        int i24 = fs2 + zmn3;
        znVar.btk = i24;
        int flexItemCount = this.fb.getFlexItemCount();
        int i25 = i22;
        int i26 = Integer.MIN_VALUE;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            if (i23 >= flexItemCount) {
                i6 = i28;
                zmnVar2 = zmnVar;
                break;
            }
            View fs3 = this.fb.fs(i23);
            if (fs3 == null) {
                if (zmn(i23, flexItemCount, znVar)) {
                    zmn(arrayList, znVar, i23, i27);
                }
            } else if (fs3.getVisibility() == 8) {
                znVar.bvs++;
                znVar.zg++;
                if (zmn(i23, flexItemCount, znVar)) {
                    zmn(arrayList, znVar, i23, i27);
                }
            } else {
                if (fs3 instanceof CompoundButton) {
                    zmn((CompoundButton) fs3);
                }
                com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) fs3.getLayoutParams();
                int i30 = flexItemCount;
                if (fsVar.hhw() == 4) {
                    znVar.rt.add(Integer.valueOf(i23));
                }
                int zmn4 = zmn(fsVar, zmn2);
                if (fsVar.klz() != -1.0f && mode == 1073741824) {
                    zmn4 = Math.round(size * fsVar.klz());
                }
                if (zmn2) {
                    int zmn5 = this.fb.zmn(i19, i24 + zn(fsVar, true) + fb(fsVar, true), zmn4);
                    i7 = size;
                    i8 = mode;
                    int fs4 = this.fb.fs(i20, zn2 + fb + btk(fsVar, true) + hhw(fsVar, true) + i27, fs(fsVar, true));
                    fs3.measure(zmn5, fs4);
                    zmn(i23, zmn5, fs4, fs3);
                    i9 = zmn5;
                } else {
                    i7 = size;
                    i8 = mode;
                    int zmn6 = this.fb.zmn(i20, zn2 + fb + btk(fsVar, false) + hhw(fsVar, false) + i27, fs(fsVar, false));
                    int fs5 = this.fb.fs(i19, zn(fsVar, false) + i24 + fb(fsVar, false), zmn4);
                    fs3.measure(zmn6, fs5);
                    zmn(i23, zmn6, fs5, fs3);
                    i9 = fs5;
                }
                zmn(fs3, i23);
                i28 = View.combineMeasuredStates(i28, fs3.getMeasuredState());
                int i31 = i27;
                int i32 = i24;
                zn znVar2 = znVar;
                int i33 = i23;
                list2 = arrayList;
                int i34 = i9;
                if (zmn(fs3, i8, i7, znVar.btk, fb(fsVar, zmn2) + zmn(fs3, zmn2) + zn(fsVar, zmn2), fsVar, i33, i29, arrayList.size())) {
                    i23 = i33;
                    if (znVar2.fs() > 0) {
                        zmn(list2, znVar2, i23 > 0 ? i23 - 1 : 0, i31);
                        i27 = znVar2.nps + i31;
                    } else {
                        i27 = i31;
                    }
                    if (zmn2) {
                        if (fsVar.fs() == -1) {
                            com.bytedance.adsdk.ugeno.btk.zmn zmnVar3 = this.fb;
                            i10 = i2;
                            i11 = -1;
                            view = fs3;
                            view.measure(i34, zmnVar3.fs(i10, zmnVar3.getPaddingTop() + this.fb.getPaddingBottom() + fsVar.rt() + fsVar.cyb() + i27, fsVar.fs()));
                            zmn(view, i23);
                        } else {
                            i10 = i2;
                            view = fs3;
                            i11 = -1;
                        }
                    } else {
                        i10 = i2;
                        view = fs3;
                        i11 = -1;
                        if (fsVar.zmn() == -1) {
                            com.bytedance.adsdk.ugeno.btk.zmn zmnVar4 = this.fb;
                            view.measure(zmnVar4.zmn(i10, zmnVar4.getPaddingLeft() + this.fb.getPaddingRight() + fsVar.mw() + fsVar.cn() + i27, fsVar.zmn()), i34);
                            zmn(view, i23);
                        }
                    }
                    znVar = new zn();
                    i13 = 1;
                    znVar.zg = 1;
                    i12 = i32;
                    znVar.btk = i12;
                    znVar.cn = i23;
                    i15 = Integer.MIN_VALUE;
                    i14 = 0;
                } else {
                    i10 = i2;
                    i23 = i33;
                    view = fs3;
                    i11 = -1;
                    znVar = znVar2;
                    i12 = i32;
                    i13 = 1;
                    znVar.zg++;
                    i14 = i29 + 1;
                    i27 = i31;
                    i15 = i26;
                }
                znVar.olo = (znVar.olo ? 1 : 0) | (fsVar.fb() != 0.0f ? i13 : 0);
                znVar.kgc = (znVar.kgc ? 1 : 0) | (fsVar.btk() != 0.0f ? i13 : 0);
                int[] iArr = this.zmn;
                if (iArr != null) {
                    iArr[i23] = list2.size();
                }
                znVar.btk += zmn(view, zmn2) + zn(fsVar, zmn2) + fb(fsVar, zmn2);
                znVar.iv += fsVar.fb();
                znVar.rc += fsVar.btk();
                this.fb.zmn(view, i23, i14, znVar);
                int max = Math.max(i15, fs(view, zmn2) + btk(fsVar, zmn2) + hhw(fsVar, zmn2) + this.fb.zmn(view));
                znVar.nps = Math.max(znVar.nps, max);
                if (zmn2) {
                    if (this.fb.getFlexWrap() != 2) {
                        znVar.klz = Math.max(znVar.klz, view.getBaseline() + fsVar.rt());
                    } else {
                        znVar.klz = Math.max(znVar.klz, (view.getMeasuredHeight() - view.getBaseline()) + fsVar.cyb());
                    }
                }
                i16 = i30;
                if (zmn(i23, i16, znVar)) {
                    zmn(list2, znVar, i23, i27);
                    i27 += znVar.nps;
                }
                i17 = i5;
                if (i17 == i11 || list2.size() <= 0 || list2.get(list2.size() - i13).cyb < i17 || i23 < i17 || i25 != 0) {
                    i18 = i3;
                } else {
                    i27 = -znVar.zmn();
                    i18 = i3;
                    i25 = i13;
                }
                if (i27 > i18 && i25 != 0) {
                    zmnVar2 = zmnVar;
                    i6 = i28;
                    break;
                }
                i29 = i14;
                i26 = max;
                i23++;
                i19 = i;
                flexItemCount = i16;
                i20 = i10;
                i24 = i12;
                arrayList = list2;
                size = i7;
                mode = i8;
                i21 = i17;
            }
            i7 = size;
            i8 = mode;
            i10 = i20;
            i17 = i21;
            i12 = i24;
            list2 = arrayList;
            i16 = flexItemCount;
            i23++;
            i19 = i;
            flexItemCount = i16;
            i20 = i10;
            i24 = i12;
            arrayList = list2;
            size = i7;
            mode = i8;
            i21 = i17;
        }
        zmnVar2.fs = i6;
    }

    private void zmn(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) compoundButton.getLayoutParams();
        int nps = fsVar.nps();
        int zg = fsVar.zg();
        Drawable zmn2 = com.bytedance.adsdk.ugeno.nps.btk.zmn(compoundButton);
        int minimumWidth = zmn2 == null ? 0 : zmn2.getMinimumWidth();
        int minimumHeight = zmn2 != null ? zmn2.getMinimumHeight() : 0;
        if (nps == -1) {
            nps = minimumWidth;
        }
        fsVar.zmn(nps);
        if (zg == -1) {
            zg = minimumHeight;
        }
        fsVar.fs(zg);
    }

    private int zmn(boolean z) {
        if (z) {
            return this.fb.getPaddingStart();
        }
        return this.fb.getPaddingTop();
    }

    private int fs(boolean z) {
        if (z) {
            return this.fb.getPaddingEnd();
        }
        return this.fb.getPaddingBottom();
    }

    private int zn(boolean z) {
        if (z) {
            return this.fb.getPaddingTop();
        }
        return this.fb.getPaddingStart();
    }

    private int fb(boolean z) {
        if (z) {
            return this.fb.getPaddingBottom();
        }
        return this.fb.getPaddingEnd();
    }

    private int zmn(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int fs(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int zmn(com.bytedance.adsdk.ugeno.btk.fs fsVar, boolean z) {
        if (z) {
            return fsVar.zmn();
        }
        return fsVar.fs();
    }

    private int fs(com.bytedance.adsdk.ugeno.btk.fs fsVar, boolean z) {
        if (z) {
            return fsVar.fs();
        }
        return fsVar.zmn();
    }

    private int zn(com.bytedance.adsdk.ugeno.btk.fs fsVar, boolean z) {
        if (z) {
            return fsVar.mw();
        }
        return fsVar.rt();
    }

    private int fb(com.bytedance.adsdk.ugeno.btk.fs fsVar, boolean z) {
        if (z) {
            return fsVar.cn();
        }
        return fsVar.cyb();
    }

    private int btk(com.bytedance.adsdk.ugeno.btk.fs fsVar, boolean z) {
        if (z) {
            return fsVar.rt();
        }
        return fsVar.mw();
    }

    private int hhw(com.bytedance.adsdk.ugeno.btk.fs fsVar, boolean z) {
        if (z) {
            return fsVar.cyb();
        }
        return fsVar.cn();
    }

    private boolean zmn(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.btk.fs fsVar, int i5, int i6, int i7) {
        if (this.fb.getFlexWrap() == 0) {
            return false;
        }
        if (fsVar.rc()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.fb.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int zmn2 = this.fb.zmn(view, i5, i6);
        if (zmn2 > 0) {
            i4 += zmn2;
        }
        return i2 < i3 + i4;
    }

    private boolean zmn(int i, int i2, zn znVar) {
        return i == i2 - 1 && znVar.fs() != 0;
    }

    private void zmn(List<zn> list, zn znVar, int i, int i2) {
        znVar.mw = i2;
        this.fb.zmn(znVar);
        znVar.cyb = i;
        list.add(znVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zmn(View view, int i) {
        boolean z;
        com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < fsVar.nps()) {
            measuredWidth = fsVar.nps();
        } else if (measuredWidth > fsVar.bvs()) {
            measuredWidth = fsVar.bvs();
        } else {
            z = false;
            if (measuredHeight >= fsVar.zg()) {
                measuredHeight = fsVar.zg();
            } else if (measuredHeight > fsVar.iv()) {
                measuredHeight = fsVar.iv();
            } else {
                z2 = z;
            }
            if (z2) {
                return;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            zmn(i, makeMeasureSpec, makeMeasureSpec2, view);
            return;
        }
        z = true;
        if (measuredHeight >= fsVar.zg()) {
        }
        if (z2) {
        }
    }

    void zmn(int i, int i2) {
        zmn(i, i2, 0);
    }

    void zmn(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        zn(this.fb.getFlexItemCount());
        if (i3 >= this.fb.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.fb.getFlexDirection();
        int flexDirection2 = this.fb.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.fb.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.fb.getPaddingLeft();
            paddingRight = this.fb.getPaddingRight();
        } else if (flexDirection2 == 2 || flexDirection2 == 3) {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.fb.getLargestMainSize();
            }
            paddingLeft = this.fb.getPaddingTop();
            paddingRight = this.fb.getPaddingBottom();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.zmn;
        List<zn> flexLinesInternal = this.fb.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            zn znVar = flexLinesInternal.get(i5);
            int i6 = znVar.btk;
            if (i6 < size && znVar.olo) {
                zmn(i, i2, znVar, size, i4, false);
            } else if (i6 > size && znVar.kgc) {
                fs(i, i2, znVar, size, i4, false);
            }
        }
    }

    private void zn(int i) {
        boolean[] zArr = this.btk;
        if (zArr == null) {
            this.btk = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.btk = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void zmn(int i, int i2, zn znVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        float f = znVar.iv;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 < (i5 = znVar.btk)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        znVar.btk = i4 + znVar.hhw;
        if (!z) {
            znVar.nps = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f4 = 0.0f;
        while (i9 < znVar.zg) {
            int i11 = znVar.cn + i9;
            View fs2 = this.fb.fs(i11);
            if (fs2 == null || fs2.getVisibility() == 8) {
                i6 = i5;
            } else {
                com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) fs2.getLayoutParams();
                int flexDirection = this.fb.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i12 = i5;
                    int measuredWidth = fs2.getMeasuredWidth();
                    long[] jArr = this.hhw;
                    if (jArr != null) {
                        measuredWidth = zmn(jArr[i11]);
                    }
                    int measuredHeight = fs2.getMeasuredHeight();
                    long[] jArr2 = this.hhw;
                    i6 = i12;
                    if (jArr2 != null) {
                        measuredHeight = fs(jArr2[i11]);
                    }
                    if (!this.btk[i11] && fsVar.fb() > 0.0f) {
                        float fb = measuredWidth + (fsVar.fb() * f3);
                        if (i9 == znVar.zg - 1) {
                            fb += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(fb);
                        if (round > fsVar.bvs()) {
                            round = fsVar.bvs();
                            this.btk[i11] = true;
                            znVar.iv -= fsVar.fb();
                            z2 = true;
                        } else {
                            f4 += fb - round;
                            double d3 = f4;
                            if (d3 > 1.0d) {
                                round++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                round--;
                                d = d3 + 1.0d;
                            }
                            f4 = (float) d;
                        }
                        int fs3 = fs(i2, fsVar, znVar.mw);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        fs2.measure(makeMeasureSpec, fs3);
                        int measuredWidth2 = fs2.getMeasuredWidth();
                        int measuredHeight2 = fs2.getMeasuredHeight();
                        zmn(i11, makeMeasureSpec, fs3, fs2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, measuredHeight + fsVar.rt() + fsVar.cyb() + this.fb.zmn(fs2));
                    znVar.btk += measuredWidth + fsVar.mw() + fsVar.cn();
                    i7 = max;
                } else {
                    int measuredHeight3 = fs2.getMeasuredHeight();
                    long[] jArr3 = this.hhw;
                    if (jArr3 != null) {
                        measuredHeight3 = fs(jArr3[i11]);
                    }
                    int measuredWidth3 = fs2.getMeasuredWidth();
                    long[] jArr4 = this.hhw;
                    if (jArr4 != null) {
                        measuredWidth3 = zmn(jArr4[i11]);
                    }
                    if (this.btk[i11] || fsVar.fb() <= f2) {
                        i8 = i5;
                    } else {
                        float fb2 = measuredHeight3 + (fsVar.fb() * f3);
                        if (i9 == znVar.zg - 1) {
                            fb2 += f4;
                            f4 = f2;
                        }
                        int round2 = Math.round(fb2);
                        if (round2 > fsVar.iv()) {
                            round2 = fsVar.iv();
                            this.btk[i11] = true;
                            znVar.iv -= fsVar.fb();
                            i8 = i5;
                            z2 = true;
                        } else {
                            f4 += fb2 - round2;
                            i8 = i5;
                            double d4 = f4;
                            if (d4 > 1.0d) {
                                round2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                d2 = d4 + 1.0d;
                            }
                            f4 = (float) d2;
                        }
                        int zmn2 = zmn(i, fsVar, znVar.mw);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        fs2.measure(zmn2, makeMeasureSpec2);
                        measuredWidth3 = fs2.getMeasuredWidth();
                        int measuredHeight4 = fs2.getMeasuredHeight();
                        zmn(i11, zmn2, makeMeasureSpec2, fs2);
                        measuredHeight3 = measuredHeight4;
                    }
                    i7 = Math.max(i10, measuredWidth3 + fsVar.mw() + fsVar.cn() + this.fb.zmn(fs2));
                    znVar.btk += measuredHeight3 + fsVar.rt() + fsVar.cyb();
                    i6 = i8;
                }
                znVar.nps = Math.max(znVar.nps, i7);
                i10 = i7;
            }
            i9++;
            i5 = i6;
            f2 = 0.0f;
        }
        int i13 = i5;
        if (!z2 || i13 == znVar.btk) {
            return;
        }
        zmn(i, i2, znVar, i3, i4, true);
    }

    private void fs(int i, int i2, zn znVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8 = znVar.btk;
        float f = znVar.rc;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 > i8) {
            return;
        }
        float f3 = (i8 - i3) / f;
        znVar.btk = i4 + znVar.hhw;
        if (!z) {
            znVar.nps = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f4 = 0.0f;
        while (i9 < znVar.zg) {
            int i11 = znVar.cn + i9;
            View fs2 = this.fb.fs(i11);
            if (fs2 == null || fs2.getVisibility() == 8) {
                i5 = i8;
                i6 = i9;
            } else {
                com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) fs2.getLayoutParams();
                int flexDirection = this.fb.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i8;
                    int i12 = i9;
                    int measuredWidth = fs2.getMeasuredWidth();
                    long[] jArr = this.hhw;
                    if (jArr != null) {
                        measuredWidth = zmn(jArr[i11]);
                    }
                    int measuredHeight = fs2.getMeasuredHeight();
                    long[] jArr2 = this.hhw;
                    if (jArr2 != null) {
                        measuredHeight = fs(jArr2[i11]);
                    }
                    if (this.btk[i11] || fsVar.btk() <= 0.0f) {
                        i6 = i12;
                    } else {
                        float btk = measuredWidth - (fsVar.btk() * f3);
                        i6 = i12;
                        if (i6 == znVar.zg - 1) {
                            btk += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(btk);
                        if (round < fsVar.nps()) {
                            round = fsVar.nps();
                            this.btk[i11] = true;
                            znVar.rc -= fsVar.btk();
                            z2 = true;
                        } else {
                            f4 += btk - round;
                            double d = f4;
                            if (d > 1.0d) {
                                round++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f4 += 1.0f;
                            }
                        }
                        int fs3 = fs(i2, fsVar, znVar.mw);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        fs2.measure(makeMeasureSpec, fs3);
                        int measuredWidth2 = fs2.getMeasuredWidth();
                        int measuredHeight2 = fs2.getMeasuredHeight();
                        zmn(i11, makeMeasureSpec, fs3, fs2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, measuredHeight + fsVar.rt() + fsVar.cyb() + this.fb.zmn(fs2));
                    znVar.btk += measuredWidth + fsVar.mw() + fsVar.cn();
                    i7 = max;
                } else {
                    int measuredHeight3 = fs2.getMeasuredHeight();
                    long[] jArr3 = this.hhw;
                    if (jArr3 != null) {
                        measuredHeight3 = fs(jArr3[i11]);
                    }
                    int measuredWidth3 = fs2.getMeasuredWidth();
                    long[] jArr4 = this.hhw;
                    if (jArr4 != null) {
                        measuredWidth3 = zmn(jArr4[i11]);
                    }
                    if (this.btk[i11] || fsVar.btk() <= f2) {
                        i5 = i8;
                        i6 = i9;
                    } else {
                        float btk2 = measuredHeight3 - (fsVar.btk() * f3);
                        if (i9 == znVar.zg - 1) {
                            btk2 += f4;
                            f4 = f2;
                        }
                        int round2 = Math.round(btk2);
                        if (round2 < fsVar.zg()) {
                            round2 = fsVar.zg();
                            this.btk[i11] = true;
                            znVar.rc -= fsVar.btk();
                            i5 = i8;
                            i6 = i9;
                            z2 = true;
                        } else {
                            f4 += btk2 - round2;
                            i5 = i8;
                            i6 = i9;
                            double d2 = f4;
                            if (d2 > 1.0d) {
                                round2++;
                                f4 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f4 += 1.0f;
                            }
                        }
                        int zmn2 = zmn(i, fsVar, znVar.mw);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        fs2.measure(zmn2, makeMeasureSpec2);
                        measuredWidth3 = fs2.getMeasuredWidth();
                        int measuredHeight4 = fs2.getMeasuredHeight();
                        zmn(i11, zmn2, makeMeasureSpec2, fs2);
                        measuredHeight3 = measuredHeight4;
                    }
                    i7 = Math.max(i10, measuredWidth3 + fsVar.mw() + fsVar.cn() + this.fb.zmn(fs2));
                    znVar.btk += measuredHeight3 + fsVar.rt() + fsVar.cyb();
                }
                znVar.nps = Math.max(znVar.nps, i7);
                i10 = i7;
            }
            i9 = i6 + 1;
            i8 = i5;
            f2 = 0.0f;
        }
        int i13 = i8;
        if (!z2 || i13 == znVar.btk) {
            return;
        }
        fs(i, i2, znVar, i3, i4, true);
    }

    private int zmn(int i, com.bytedance.adsdk.ugeno.btk.fs fsVar, int i2) {
        com.bytedance.adsdk.ugeno.btk.zmn zmnVar = this.fb;
        int zmn2 = zmnVar.zmn(i, zmnVar.getPaddingLeft() + this.fb.getPaddingRight() + fsVar.mw() + fsVar.cn() + i2, fsVar.zmn());
        int size = View.MeasureSpec.getSize(zmn2);
        if (size > fsVar.bvs()) {
            return View.MeasureSpec.makeMeasureSpec(fsVar.bvs(), View.MeasureSpec.getMode(zmn2));
        }
        return size < fsVar.nps() ? View.MeasureSpec.makeMeasureSpec(fsVar.nps(), View.MeasureSpec.getMode(zmn2)) : zmn2;
    }

    private int fs(int i, com.bytedance.adsdk.ugeno.btk.fs fsVar, int i2) {
        com.bytedance.adsdk.ugeno.btk.zmn zmnVar = this.fb;
        int fs2 = zmnVar.fs(i, zmnVar.getPaddingTop() + this.fb.getPaddingBottom() + fsVar.rt() + fsVar.cyb() + i2, fsVar.fs());
        int size = View.MeasureSpec.getSize(fs2);
        if (size > fsVar.iv()) {
            return View.MeasureSpec.makeMeasureSpec(fsVar.iv(), View.MeasureSpec.getMode(fs2));
        }
        return size < fsVar.zg() ? View.MeasureSpec.makeMeasureSpec(fsVar.zg(), View.MeasureSpec.getMode(fs2)) : fs2;
    }

    void fs(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.fb.getFlexDirection();
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
        List<zn> flexLinesInternal = this.fb.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.fb.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).nps = i5 - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.fb.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    zn znVar = new zn();
                    znVar.nps = i7;
                    flexLinesInternal.add(0, znVar);
                    return;
                }
                if (alignContent == 2) {
                    this.fb.setFlexLines(zmn(flexLinesInternal, i5, sumOfCrossSize));
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
                                zn znVar2 = new zn();
                                if (i6 == flexLinesInternal.size() - 2) {
                                    znVar2.nps = Math.round(f + size2);
                                    f = 0.0f;
                                } else {
                                    znVar2.nps = Math.round(size2);
                                }
                                int i8 = znVar2.nps;
                                f += size2 - i8;
                                if (f > 1.0f) {
                                    znVar2.nps = i8 + 1;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    znVar2.nps = i8 - 1;
                                    f += 1.0f;
                                }
                                arrayList.add(znVar2);
                            }
                            i6++;
                        }
                        this.fb.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= i5) {
                        this.fb.setFlexLines(zmn(flexLinesInternal, i5, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    zn znVar3 = new zn();
                    znVar3.nps = size4;
                    for (zn znVar4 : flexLinesInternal) {
                        arrayList2.add(znVar3);
                        arrayList2.add(znVar4);
                        arrayList2.add(znVar3);
                    }
                    this.fb.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < i5) {
                    float size5 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i6 < size6) {
                        zn znVar5 = flexLinesInternal.get(i6);
                        float f3 = znVar5.nps + size5;
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
                        znVar5.nps = round;
                        i6++;
                    }
                }
            }
        }
    }

    private List<zn> zmn(List<zn> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        zn znVar = new zn();
        znVar.nps = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(znVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(znVar);
            }
        }
        return arrayList;
    }

    void zmn() {
        zmn(0);
    }

    void zmn(int i) {
        View fs2;
        if (i >= this.fb.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.fb.getFlexDirection();
        if (this.fb.getAlignItems() == 4) {
            int[] iArr = this.zmn;
            List<zn> flexLinesInternal = this.fb.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                zn znVar = flexLinesInternal.get(i2);
                int i3 = znVar.zg;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = znVar.cn + i4;
                    if (i4 < this.fb.getFlexItemCount() && (fs2 = this.fb.fs(i5)) != null && fs2.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) fs2.getLayoutParams();
                        if (fsVar.hhw() == -1 || fsVar.hhw() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                zmn(fs2, znVar.nps, i5);
                            } else if (flexDirection == 2 || flexDirection == 3) {
                                fs(fs2, znVar.nps, i5);
                            } else {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            }
                        }
                    }
                }
            }
            return;
        }
        for (zn znVar2 : this.fb.getFlexLinesInternal()) {
            for (Integer num : znVar2.rt) {
                View fs3 = this.fb.fs(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    zmn(fs3, znVar2.nps, num.intValue());
                } else if (flexDirection == 2 || flexDirection == 3) {
                    fs(fs3, znVar2.nps, num.intValue());
                } else {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                }
            }
        }
    }

    private void zmn(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) view.getLayoutParams();
        int min = Math.min(Math.max(((i - fsVar.rt()) - fsVar.cyb()) - this.fb.zmn(view), fsVar.zg()), fsVar.iv());
        long[] jArr = this.hhw;
        if (jArr != null) {
            measuredWidth = zmn(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        zmn(i2, makeMeasureSpec, makeMeasureSpec2, view);
    }

    private void fs(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) view.getLayoutParams();
        int min = Math.min(Math.max(((i - fsVar.mw()) - fsVar.cn()) - this.fb.zmn(view), fsVar.nps()), fsVar.bvs());
        long[] jArr = this.hhw;
        if (jArr != null) {
            measuredHeight = fs(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        zmn(i2, makeMeasureSpec2, makeMeasureSpec, view);
    }

    void zmn(View view, zn znVar, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) view.getLayoutParams();
        int alignItems = this.fb.getAlignItems();
        if (fsVar.hhw() != -1) {
            alignItems = fsVar.hhw();
        }
        int i5 = znVar.nps;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.fb.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - fsVar.cyb(), i3, i6 - fsVar.cyb());
                    return;
                } else {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + fsVar.rt(), i3, (i4 - i5) + view.getMeasuredHeight() + fsVar.rt());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + fsVar.rt()) - fsVar.cyb()) / 2;
                if (this.fb.getFlexWrap() != 2) {
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
                if (this.fb.getFlexWrap() != 2) {
                    int max = Math.max(znVar.klz - view.getBaseline(), fsVar.rt());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((znVar.klz - view.getMeasuredHeight()) + view.getBaseline(), fsVar.cyb());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.fb.getFlexWrap() != 2) {
            view.layout(i, i2 + fsVar.rt(), i3, i4 + fsVar.rt());
        } else {
            view.layout(i, i2 - fsVar.cyb(), i3, i4 - fsVar.cyb());
        }
    }

    void zmn(View view, zn znVar, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.btk.fs fsVar = (com.bytedance.adsdk.ugeno.btk.fs) view.getLayoutParams();
        int alignItems = this.fb.getAlignItems();
        if (fsVar.hhw() != -1) {
            alignItems = fsVar.hhw();
        }
        int i5 = znVar.nps;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - fsVar.cn(), i2, ((i3 + i5) - view.getMeasuredWidth()) - fsVar.cn(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + fsVar.mw(), i2, (i3 - i5) + view.getMeasuredWidth() + fsVar.mw(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.nps.hhw.zmn(marginLayoutParams)) - com.bytedance.adsdk.ugeno.nps.hhw.fs(marginLayoutParams)) / 2;
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
            view.layout(i + fsVar.mw(), i2, i3 + fsVar.mw(), i4);
        } else {
            view.layout(i - fsVar.cn(), i2, i3 - fsVar.cn(), i4);
        }
    }

    private void zmn(int i, int i2, int i3, View view) {
        long[] jArr = this.fs;
        if (jArr != null) {
            jArr[i] = fs(i2, i3);
        }
        long[] jArr2 = this.hhw;
        if (jArr2 != null) {
            jArr2[i] = fs(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static class fs implements Comparable<fs> {
        int fs;
        int zmn;

        private fs() {
        }

        @Override // java.lang.Comparable
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public int compareTo(fs fsVar) {
            int i = this.fs;
            int i2 = fsVar.fs;
            return i != i2 ? i - i2 : this.zmn - fsVar.zmn;
        }

        public String toString() {
            return "Order{order=" + this.fs + ", index=" + this.zmn + '}';
        }
    }

    static class zmn {
        int fs;
        List<zn> zmn;

        zmn() {
        }

        void zmn() {
            this.zmn = null;
            this.fs = 0;
        }
    }
}
