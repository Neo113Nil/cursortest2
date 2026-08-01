package com.bytedance.adsdk.lottie.vG.vG;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.pvs.icD.bNS;
import com.bytedance.adsdk.lottie.vG.icD;
import com.bytedance.adsdk.lottie.vG.icD.mnm;
import com.bytedance.adsdk.lottie.vG.pvs.qh;
import com.bytedance.adsdk.lottie.zM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public class so extends com.bytedance.adsdk.lottie.vG.vG.pvs {
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Typeface, Typeface> CvL;
    private final List<pvs> IP;
    private final LongSparseArray<String> Ju;
    private final Matrix Mxy;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> OT;
    private final Paint Wyp;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> ZhG;
    private final bNS bNS;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> cR;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> dX;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> dyT;
    private final Map<com.bytedance.adsdk.lottie.vG.Jd, List<com.bytedance.adsdk.lottie.pvs.pvs.Jd>> kj;
    private final com.bytedance.adsdk.lottie.so mnm;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> ny;
    private final Paint qh;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> rCZ;
    private final RectF so;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> uc;
    private final com.bytedance.adsdk.lottie.sUS vA;
    private final StringBuilder yiw;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> zM;

    so(com.bytedance.adsdk.lottie.so soVar, Jd jd) {
        super(soVar, jd);
        this.yiw = new StringBuilder(2);
        this.so = new RectF();
        this.Mxy = new Matrix();
        int i = 1;
        this.Wyp = new Paint(i) { // from class: com.bytedance.adsdk.lottie.vG.vG.so.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.qh = new Paint(i) { // from class: com.bytedance.adsdk.lottie.vG.vG.so.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.kj = new HashMap();
        this.Ju = new LongSparseArray<>();
        this.IP = new ArrayList();
        this.mnm = soVar;
        this.vA = jd.pvs();
        bNS pvs2 = jd.zM().pvs();
        this.bNS = pvs2;
        pvs2.pvs(this);
        pvs(pvs2);
        qh uc = jd.uc();
        if (uc != null && uc.pvs != null) {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvs3 = uc.pvs.pvs();
            this.cR = pvs3;
            pvs3.pvs(this);
            pvs(this.cR);
        }
        if (uc != null && uc.icD != null) {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvs4 = uc.icD.pvs();
            this.uc = pvs4;
            pvs4.pvs(this);
            pvs(this.uc);
        }
        if (uc != null && uc.vG != null) {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs5 = uc.vG.pvs();
            this.OT = pvs5;
            pvs5.pvs(this);
            pvs(this.OT);
        }
        if (uc == null || uc.Jd == null) {
            return;
        }
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs6 = uc.Jd.pvs();
        this.ZhG = pvs6;
        pvs6.pvs(this);
        pvs(this.ZhG);
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs, com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        super.pvs(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.vA.Jd().width(), this.vA.Jd().height());
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs
    void icD(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.lottie.vG.icD yiw = this.bNS.yiw();
        com.bytedance.adsdk.lottie.vG.vG vGVar = this.vA.qh().get(yiw.icD);
        if (vGVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        pvs(yiw, matrix);
        if (this.mnm.rCZ()) {
            pvs(yiw, matrix, vGVar, canvas);
        } else {
            pvs(yiw, vGVar, canvas);
        }
        canvas.restore();
    }

    private void pvs(com.bytedance.adsdk.lottie.vG.icD icd, Matrix matrix) {
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar = this.zM;
        if (pvsVar != null) {
            this.Wyp.setColor(pvsVar.yiw().intValue());
        } else {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar2 = this.cR;
            if (pvsVar2 != null) {
                this.Wyp.setColor(pvsVar2.yiw().intValue());
            } else {
                this.Wyp.setColor(icd.so);
            }
        }
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar3 = this.rCZ;
        if (pvsVar3 != null) {
            this.qh.setColor(pvsVar3.yiw().intValue());
        } else {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvsVar4 = this.uc;
            if (pvsVar4 != null) {
                this.qh.setColor(pvsVar4.yiw().intValue());
            } else {
                this.qh.setColor(icd.Mxy);
            }
        }
        int intValue = ((this.Jd.pvs() == null ? 100 : this.Jd.pvs().yiw().intValue()) * 255) / 100;
        this.Wyp.setAlpha(intValue);
        this.qh.setAlpha(intValue);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar5 = this.ny;
        if (pvsVar5 != null) {
            this.qh.setStrokeWidth(pvsVar5.yiw().floatValue());
            return;
        }
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar6 = this.OT;
        if (pvsVar6 != null) {
            this.qh.setStrokeWidth(pvsVar6.yiw().floatValue());
        } else {
            this.qh.setStrokeWidth(icd.Wyp * com.bytedance.adsdk.lottie.sUS.sUS.pvs());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(com.bytedance.adsdk.lottie.vG.icD icd, Matrix matrix, com.bytedance.adsdk.lottie.vG.vG vGVar, Canvas canvas) {
        float f;
        float floatValue;
        int i;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar = this.dX;
        if (pvsVar != null) {
            f = pvsVar.yiw().floatValue();
        } else {
            f = icd.vG;
        }
        float f2 = f / 100.0f;
        float pvs2 = com.bytedance.adsdk.lottie.sUS.sUS.pvs(matrix);
        List<String> pvs3 = pvs(icd.pvs);
        int size = pvs3.size();
        float f3 = icd.NB / 10.0f;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar2 = this.dyT;
        if (pvsVar2 != null) {
            floatValue = pvsVar2.yiw().floatValue();
        } else {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar3 = this.ZhG;
            if (pvsVar3 != null) {
                floatValue = pvsVar3.yiw().floatValue();
            }
            float f4 = f3;
            int i2 = -1;
            i = 0;
            while (i < size) {
                int i3 = i;
                List<pvs> pvs4 = pvs(pvs3.get(i), icd.Ju == null ? 0.0f : icd.Ju.x, vGVar, f2, f4, true);
                int i4 = 0;
                while (i4 < pvs4.size()) {
                    pvs pvsVar4 = pvs4.get(i4);
                    int i5 = i2 + 1;
                    canvas.save();
                    pvs(canvas, icd, i5, pvsVar4.icD);
                    pvs(pvsVar4.pvs, icd, vGVar, canvas, pvs2, f2, f4);
                    canvas.restore();
                    i4++;
                    pvs4 = pvs4;
                    i2 = i5;
                }
                i = i3 + 1;
            }
        }
        f3 += floatValue;
        float f42 = f3;
        int i22 = -1;
        i = 0;
        while (i < size) {
        }
    }

    private void pvs(String str, com.bytedance.adsdk.lottie.vG.icD icd, com.bytedance.adsdk.lottie.vG.vG vGVar, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            com.bytedance.adsdk.lottie.vG.Jd jd = this.vA.Wyp().get(com.bytedance.adsdk.lottie.vG.Jd.pvs(str.charAt(i), vGVar.pvs(), vGVar.vG()));
            if (jd != null) {
                pvs(jd, f2, icd, canvas);
                canvas.translate((((float) jd.icD()) * f2 * com.bytedance.adsdk.lottie.sUS.sUS.pvs()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(com.bytedance.adsdk.lottie.vG.icD icd, com.bytedance.adsdk.lottie.vG.vG vGVar, Canvas canvas) {
        float f;
        float floatValue;
        int size;
        int i;
        Typeface pvs2 = pvs(vGVar);
        if (pvs2 == null) {
            return;
        }
        String str = icd.pvs;
        zM uc = this.mnm.uc();
        if (uc != null) {
            str = uc.icD(NB(), str);
        }
        this.Wyp.setTypeface(pvs2);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar = this.dX;
        if (pvsVar != null) {
            f = pvsVar.yiw().floatValue();
        } else {
            f = icd.vG;
        }
        this.Wyp.setTextSize(com.bytedance.adsdk.lottie.sUS.sUS.pvs() * f);
        this.qh.setTypeface(this.Wyp.getTypeface());
        this.qh.setTextSize(this.Wyp.getTextSize());
        float f2 = icd.NB / 10.0f;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar2 = this.dyT;
        if (pvsVar2 != null) {
            floatValue = pvsVar2.yiw().floatValue();
        } else {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar3 = this.ZhG;
            if (pvsVar3 != null) {
                floatValue = pvsVar3.yiw().floatValue();
            }
            float pvs3 = ((f2 * com.bytedance.adsdk.lottie.sUS.sUS.pvs()) * f) / 100.0f;
            List<String> pvs4 = pvs(str);
            size = pvs4.size();
            int i2 = -1;
            i = 0;
            while (i < size) {
                int i3 = i;
                List<pvs> pvs5 = pvs(pvs4.get(i), icd.Ju == null ? 0.0f : icd.Ju.x, vGVar, 0.0f, pvs3, false);
                for (int i4 = 0; i4 < pvs5.size(); i4++) {
                    pvs pvsVar4 = pvs5.get(i4);
                    i2++;
                    canvas.save();
                    pvs(canvas, icd, i2, pvsVar4.icD);
                    pvs(pvsVar4.pvs, icd, canvas, pvs3);
                    canvas.restore();
                }
                i = i3 + 1;
            }
        }
        f2 += floatValue;
        float pvs32 = ((f2 * com.bytedance.adsdk.lottie.sUS.sUS.pvs()) * f) / 100.0f;
        List<String> pvs42 = pvs(str);
        size = pvs42.size();
        int i22 = -1;
        i = 0;
        while (i < size) {
        }
    }

    private void pvs(Canvas canvas, com.bytedance.adsdk.lottie.vG.icD icd, int i, float f) {
        PointF pointF = icd.kj;
        PointF pointF2 = icd.Ju;
        float pvs2 = com.bytedance.adsdk.lottie.sUS.sUS.pvs();
        float f2 = (i * icd.sUS * pvs2) + (pointF == null ? 0.0f : (icd.sUS * 0.6f * pvs2) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = AnonymousClass3.pvs[icd.Jd.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
    }

    /* compiled from: TextLayer.java */
    /* renamed from: com.bytedance.adsdk.lottie.vG.vG.so$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[icD.pvs.values().length];
            pvs = iArr;
            try {
                iArr[icD.pvs.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[icD.pvs.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pvs[icD.pvs.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Typeface pvs(com.bytedance.adsdk.lottie.vG.vG vGVar) {
        Typeface yiw;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Typeface, Typeface> pvsVar = this.CvL;
        if (pvsVar != null && (yiw = pvsVar.yiw()) != null) {
            return yiw;
        }
        Typeface pvs2 = this.mnm.pvs(vGVar);
        return pvs2 != null ? pvs2 : vGVar.Jd();
    }

    private List<String> pvs(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void pvs(String str, com.bytedance.adsdk.lottie.vG.icD icd, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String pvs2 = pvs(str, i);
            i += pvs2.length();
            pvs(pvs2, icd, canvas);
            canvas.translate(this.Wyp.measureText(pvs2) + f, 0.0f);
        }
    }

    private List<pvs> pvs(String str, float f, com.bytedance.adsdk.lottie.vG.vG vGVar, float f2, float f3, boolean z) {
        float measureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                com.bytedance.adsdk.lottie.vG.Jd jd = this.vA.Wyp().get(com.bytedance.adsdk.lottie.vG.Jd.pvs(charAt, vGVar.pvs(), vGVar.vG()));
                if (jd != null) {
                    measureText = ((float) jd.icD()) * f2 * com.bytedance.adsdk.lottie.sUS.sUS.pvs();
                }
            } else {
                measureText = this.Wyp.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                pvs pvs2 = pvs(i);
                if (i3 == i2) {
                    pvs2.pvs(str.substring(i2, i4).trim(), (f4 - f7) - ((r9.length() - r7.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    pvs2.pvs(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((r7.length() - r13.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            pvs(i).pvs(str.substring(i2), f4);
        }
        return this.IP.subList(0, i);
    }

    private pvs pvs(int i) {
        for (int size = this.IP.size(); size < i; size++) {
            this.IP.add(new pvs());
        }
        return this.IP.get(i - 1);
    }

    private void pvs(com.bytedance.adsdk.lottie.vG.Jd jd, float f, com.bytedance.adsdk.lottie.vG.icD icd, Canvas canvas) {
        List<com.bytedance.adsdk.lottie.pvs.pvs.Jd> pvs2 = pvs(jd);
        for (int i = 0; i < pvs2.size(); i++) {
            Path Jd = pvs2.get(i).Jd();
            Jd.computeBounds(this.so, false);
            this.Mxy.reset();
            this.Mxy.preTranslate(0.0f, (-icd.yiw) * com.bytedance.adsdk.lottie.sUS.sUS.pvs());
            this.Mxy.preScale(f, f);
            Jd.transform(this.Mxy);
            if (icd.qh) {
                pvs(Jd, this.Wyp, canvas);
                pvs(Jd, this.qh, canvas);
            } else {
                pvs(Jd, this.qh, canvas);
                pvs(Jd, this.Wyp, canvas);
            }
        }
    }

    private void pvs(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void pvs(String str, com.bytedance.adsdk.lottie.vG.icD icd, Canvas canvas) {
        if (icd.qh) {
            pvs(str, this.Wyp, canvas);
            pvs(str, this.qh, canvas);
        } else {
            pvs(str, this.qh, canvas);
            pvs(str, this.Wyp, canvas);
        }
    }

    private void pvs(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.lottie.pvs.pvs.Jd> pvs(com.bytedance.adsdk.lottie.vG.Jd jd) {
        if (this.kj.containsKey(jd)) {
            return this.kj.get(jd);
        }
        List<mnm> pvs2 = jd.pvs();
        int size = pvs2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new com.bytedance.adsdk.lottie.pvs.pvs.Jd(this.mnm, this, pvs2.get(i), this.vA));
        }
        this.kj.put(jd, arrayList);
        return arrayList;
    }

    private String pvs(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!icD(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.Ju.indexOfKey(j) >= 0) {
            return this.Ju.get(j);
        }
        this.yiw.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.yiw.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.yiw.toString();
        this.Ju.put(j, sb);
        return sb;
    }

    private boolean icD(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    /* compiled from: TextLayer.java */
    private static class pvs {
        private float icD;
        private String pvs;

        private pvs() {
            this.pvs = "";
            this.icD = 0.0f;
        }

        void pvs(String str, float f) {
            this.pvs = str;
            this.icD = f;
        }
    }
}
