package com.bytedance.adsdk.fs.zn.zn;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.fs.iqz;
import com.bytedance.adsdk.fs.zmn.fs.cn;
import com.bytedance.adsdk.fs.zn.fs;
import com.bytedance.adsdk.fs.zn.fs.cyb;
import com.bytedance.adsdk.fs.zn.zmn.rc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class bvs extends com.bytedance.adsdk.fs.zn.zn.zmn {
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> bjh;
    private final Matrix bvs;
    private final cn cn;
    private final com.bytedance.adsdk.fs.bvs cyb;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> doe;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> iqz;
    private final Paint iv;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> kgc;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Typeface, Typeface> kjb;
    private final Map<com.bytedance.adsdk.fs.zn.fb, List<com.bytedance.adsdk.fs.zmn.zmn.fb>> klz;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> kw;
    private final LongSparseArray<String> mw;
    private final StringBuilder nps;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> nqi;
    private final com.bytedance.adsdk.fs.nps olo;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> phc;
    private final Paint rc;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> rp;
    private final List<zmn> rt;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> uqh;
    private final RectF zg;

    bvs(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar) {
        super(bvsVar, btkVar);
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar2;
        com.bytedance.adsdk.fs.zn.zmn.zmn zmnVar;
        com.bytedance.adsdk.fs.zn.zmn.zmn zmnVar2;
        this.nps = new StringBuilder(2);
        this.zg = new RectF();
        this.bvs = new Matrix();
        int i = 1;
        this.iv = new Paint(i) { // from class: com.bytedance.adsdk.fs.zn.zn.bvs.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.rc = new Paint(i) { // from class: com.bytedance.adsdk.fs.zn.zn.bvs.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.klz = new HashMap();
        this.mw = new LongSparseArray<>();
        this.rt = new ArrayList();
        this.cyb = bvsVar;
        this.olo = btkVar.zmn();
        cn zmn2 = btkVar.kw().zmn();
        this.cn = zmn2;
        zmn2.zmn(this);
        zmn(zmn2);
        rc iqz = btkVar.iqz();
        if (iqz != null && (zmnVar2 = iqz.zmn) != null) {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmn3 = zmnVar2.zmn();
            this.kgc = zmn3;
            zmn3.zmn(this);
            zmn(this.kgc);
        }
        if (iqz != null && (zmnVar = iqz.fs) != null) {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmn4 = zmnVar.zmn();
            this.iqz = zmn4;
            zmn4.zmn(this);
            zmn(this.iqz);
        }
        if (iqz != null && (fsVar2 = iqz.zn) != null) {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn5 = fsVar2.zmn();
            this.doe = zmn5;
            zmn5.zmn(this);
            zmn(this.doe);
        }
        if (iqz == null || (fsVar = iqz.fb) == null) {
            return;
        }
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn6 = fsVar.zmn();
        this.uqh = zmn6;
        zmn6.zmn(this);
        zmn(this.uqh);
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn, com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        super.zmn(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.olo.fb().width(), this.olo.fb().height());
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public void fs(Canvas canvas, Matrix matrix, int i) {
        super.fs(canvas, matrix, i);
        com.bytedance.adsdk.fs.zn.fs nps = this.cn.nps();
        com.bytedance.adsdk.fs.zn.zn znVar = this.olo.cn().get(nps.fs);
        if (znVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        zmn(nps, matrix);
        if (this.cyb.bjh()) {
            zmn(nps, matrix, znVar, canvas);
        } else {
            zmn(nps, znVar, canvas);
        }
        canvas.restore();
    }

    private void zmn(com.bytedance.adsdk.fs.zn.fs fsVar, Matrix matrix) {
        com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar = this.kw;
        if (zmnVar != null) {
            this.iv.setColor(zmnVar.nps().intValue());
        } else {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar2 = this.kgc;
            if (zmnVar2 != null) {
                this.iv.setColor(zmnVar2.nps().intValue());
            } else {
                this.iv.setColor(fsVar.zg);
            }
        }
        com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar3 = this.phc;
        if (zmnVar3 != null) {
            this.rc.setColor(zmnVar3.nps().intValue());
        } else {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmnVar4 = this.iqz;
            if (zmnVar4 != null) {
                this.rc.setColor(zmnVar4.nps().intValue());
            } else {
                this.rc.setColor(fsVar.bvs);
            }
        }
        int intValue = ((this.fb.zmn() == null ? 100 : this.fb.zmn().nps().intValue()) * 255) / 100;
        this.iv.setAlpha(intValue);
        this.rc.setAlpha(intValue);
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar5 = this.nqi;
        if (zmnVar5 != null) {
            this.rc.setStrokeWidth(zmnVar5.nps().floatValue());
            return;
        }
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar6 = this.doe;
        if (zmnVar6 != null) {
            this.rc.setStrokeWidth(zmnVar6.nps().floatValue());
        } else {
            this.rc.setStrokeWidth(fsVar.iv * com.bytedance.adsdk.fs.hhw.hhw.zmn());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zmn(com.bytedance.adsdk.fs.zn.fs fsVar, Matrix matrix, com.bytedance.adsdk.fs.zn.zn znVar, Canvas canvas) {
        float f;
        float floatValue;
        int i;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar = this.rp;
        if (zmnVar != null) {
            f = zmnVar.nps().floatValue();
        } else {
            f = fsVar.zn;
        }
        float f2 = f / 100.0f;
        float zmn2 = com.bytedance.adsdk.fs.hhw.hhw.zmn(matrix);
        List<String> zmn3 = zmn(fsVar.zmn);
        int size = zmn3.size();
        float f3 = fsVar.btk / 10.0f;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar2 = this.bjh;
        if (zmnVar2 != null) {
            floatValue = zmnVar2.nps().floatValue();
        } else {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar3 = this.uqh;
            if (zmnVar3 != null) {
                floatValue = zmnVar3.nps().floatValue();
            }
            float f4 = f3;
            int i2 = -1;
            i = 0;
            while (i < size) {
                String str = zmn3.get(i);
                PointF pointF = fsVar.mw;
                int i3 = i;
                List<zmn> zmn4 = zmn(str, pointF == null ? 0.0f : pointF.x, znVar, f2, f4, true);
                int i4 = 0;
                while (i4 < zmn4.size()) {
                    zmn zmnVar4 = zmn4.get(i4);
                    int i5 = i2 + 1;
                    canvas.save();
                    zmn(canvas, fsVar, i5, zmnVar4.fs);
                    zmn(zmnVar4.zmn, fsVar, znVar, canvas, zmn2, f2, f4);
                    canvas.restore();
                    i4++;
                    zmn4 = zmn4;
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

    private void zmn(String str, com.bytedance.adsdk.fs.zn.fs fsVar, com.bytedance.adsdk.fs.zn.zn znVar, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            com.bytedance.adsdk.fs.zn.fb fbVar = this.olo.rt().get(com.bytedance.adsdk.fs.zn.fb.zmn(str.charAt(i), znVar.zmn(), znVar.zn()));
            if (fbVar != null) {
                zmn(fbVar, f2, fsVar, canvas);
                canvas.translate((((float) fbVar.fs()) * f2 * com.bytedance.adsdk.fs.hhw.hhw.zmn()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zmn(com.bytedance.adsdk.fs.zn.fs fsVar, com.bytedance.adsdk.fs.zn.zn znVar, Canvas canvas) {
        float f;
        float floatValue;
        int size;
        int i;
        Typeface zmn2 = zmn(znVar);
        if (zmn2 == null) {
            return;
        }
        String str = fsVar.zmn;
        iqz uqh = this.cyb.uqh();
        if (uqh != null) {
            str = uqh.fs(bvs(), str);
        }
        this.iv.setTypeface(zmn2);
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar = this.rp;
        if (zmnVar != null) {
            f = zmnVar.nps().floatValue();
        } else {
            f = fsVar.zn;
        }
        this.iv.setTextSize(com.bytedance.adsdk.fs.hhw.hhw.zmn() * f);
        this.rc.setTypeface(this.iv.getTypeface());
        this.rc.setTextSize(this.iv.getTextSize());
        float f2 = fsVar.btk / 10.0f;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar2 = this.bjh;
        if (zmnVar2 != null) {
            floatValue = zmnVar2.nps().floatValue();
        } else {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar3 = this.uqh;
            if (zmnVar3 != null) {
                floatValue = zmnVar3.nps().floatValue();
            }
            float zmn3 = ((f2 * com.bytedance.adsdk.fs.hhw.hhw.zmn()) * f) / 100.0f;
            List<String> zmn4 = zmn(str);
            size = zmn4.size();
            int i2 = -1;
            i = 0;
            while (i < size) {
                String str2 = zmn4.get(i);
                PointF pointF = fsVar.mw;
                int i3 = i;
                List<zmn> zmn5 = zmn(str2, pointF == null ? 0.0f : pointF.x, znVar, 0.0f, zmn3, false);
                for (int i4 = 0; i4 < zmn5.size(); i4++) {
                    zmn zmnVar4 = zmn5.get(i4);
                    i2++;
                    canvas.save();
                    zmn(canvas, fsVar, i2, zmnVar4.fs);
                    zmn(zmnVar4.zmn, fsVar, canvas, zmn3);
                    canvas.restore();
                }
                i = i3 + 1;
            }
        }
        f2 += floatValue;
        float zmn32 = ((f2 * com.bytedance.adsdk.fs.hhw.hhw.zmn()) * f) / 100.0f;
        List<String> zmn42 = zmn(str);
        size = zmn42.size();
        int i22 = -1;
        i = 0;
        while (i < size) {
        }
    }

    private void zmn(Canvas canvas, com.bytedance.adsdk.fs.zn.fs fsVar, int i, float f) {
        PointF pointF = fsVar.klz;
        PointF pointF2 = fsVar.mw;
        float zmn2 = com.bytedance.adsdk.fs.hhw.hhw.zmn();
        float f2 = (i * fsVar.hhw * zmn2) + (pointF == null ? 0.0f : (fsVar.hhw * 0.6f * zmn2) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = AnonymousClass3.zmn[fsVar.fb.ordinal()];
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

    /* renamed from: com.bytedance.adsdk.fs.zn.zn.bvs$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[fs.zmn.values().length];
            zmn = iArr;
            try {
                iArr[fs.zmn.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[fs.zmn.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[fs.zmn.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Typeface zmn(com.bytedance.adsdk.fs.zn.zn znVar) {
        Typeface nps;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Typeface, Typeface> zmnVar = this.kjb;
        if (zmnVar != null && (nps = zmnVar.nps()) != null) {
            return nps;
        }
        Typeface zmn2 = this.cyb.zmn(znVar);
        return zmn2 != null ? zmn2 : znVar.fb();
    }

    private List<String> zmn(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void zmn(String str, com.bytedance.adsdk.fs.zn.fs fsVar, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String zmn2 = zmn(str, i);
            i += zmn2.length();
            zmn(zmn2, fsVar, canvas);
            canvas.translate(this.iv.measureText(zmn2) + f, 0.0f);
        }
    }

    private List<zmn> zmn(String str, float f, com.bytedance.adsdk.fs.zn.zn znVar, float f2, float f3, boolean z) {
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
                com.bytedance.adsdk.fs.zn.fb fbVar = this.olo.rt().get(com.bytedance.adsdk.fs.zn.fb.zmn(charAt, znVar.zmn(), znVar.zn()));
                if (fbVar != null) {
                    measureText = ((float) fbVar.fs()) * f2 * com.bytedance.adsdk.fs.hhw.hhw.zmn();
                }
            } else {
                measureText = this.iv.measureText(str.substring(i4, i4 + 1));
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
                zmn fs = fs(i);
                if (i3 == i2) {
                    fs.zmn(str.substring(i2, i4).trim(), (f4 - f7) - ((r9.length() - r7.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    fs.zmn(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((r7.length() - r13.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            fs(i).zmn(str.substring(i2), f4);
        }
        return this.rt.subList(0, i);
    }

    private zmn fs(int i) {
        for (int size = this.rt.size(); size < i; size++) {
            this.rt.add(new zmn());
        }
        return this.rt.get(i - 1);
    }

    private void zmn(com.bytedance.adsdk.fs.zn.fb fbVar, float f, com.bytedance.adsdk.fs.zn.fs fsVar, Canvas canvas) {
        List<com.bytedance.adsdk.fs.zmn.zmn.fb> zmn2 = zmn(fbVar);
        for (int i = 0; i < zmn2.size(); i++) {
            Path fb = zmn2.get(i).fb();
            fb.computeBounds(this.zg, false);
            this.bvs.reset();
            this.bvs.preTranslate(0.0f, (-fsVar.nps) * com.bytedance.adsdk.fs.hhw.hhw.zmn());
            this.bvs.preScale(f, f);
            fb.transform(this.bvs);
            if (fsVar.rc) {
                zmn(fb, this.iv, canvas);
                zmn(fb, this.rc, canvas);
            } else {
                zmn(fb, this.rc, canvas);
                zmn(fb, this.iv, canvas);
            }
        }
    }

    private void zmn(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void zmn(String str, com.bytedance.adsdk.fs.zn.fs fsVar, Canvas canvas) {
        if (fsVar.rc) {
            zmn(str, this.iv, canvas);
            zmn(str, this.rc, canvas);
        } else {
            zmn(str, this.rc, canvas);
            zmn(str, this.iv, canvas);
        }
    }

    private void zmn(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.fs.zmn.zmn.fb> zmn(com.bytedance.adsdk.fs.zn.fb fbVar) {
        if (this.klz.containsKey(fbVar)) {
            return this.klz.get(fbVar);
        }
        List<cyb> zmn2 = fbVar.zmn();
        int size = zmn2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new com.bytedance.adsdk.fs.zmn.zmn.fb(this.cyb, this, zmn2.get(i), this.olo));
        }
        this.klz.put(fbVar, arrayList);
        return arrayList;
    }

    private String zmn(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!zn(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.mw.indexOfKey(j) >= 0) {
            return this.mw.get(j);
        }
        this.nps.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.nps.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.nps.toString();
        this.mw.put(j, sb);
        return sb;
    }

    private boolean zn(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    private static class zmn {
        private float fs;
        private String zmn;

        private zmn() {
            this.zmn = "";
            this.fs = 0.0f;
        }

        void zmn(String str, float f) {
            this.zmn = str;
            this.fs = f;
        }
    }
}
