package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.PointF;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class olo implements zmn.InterfaceC0104zmn, kw {
    private com.bytedance.adsdk.fs.zn.fs.rt fb;
    private final String fs;
    private final com.bytedance.adsdk.fs.bvs zmn;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zn;

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
    }

    public olo(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.mw mwVar) {
        this.zmn = bvsVar;
        this.fs = mwVar.zmn();
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn = mwVar.fs().zmn();
        this.zn = zmn;
        zmnVar.zmn(zmn);
        zmn.zmn(this);
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        this.zmn.invalidateSelf();
    }

    public com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> fs() {
        return this.zn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r7 == (r0.size() - 1)) goto L27;
     */
    @Override // com.bytedance.adsdk.fs.zmn.zmn.kw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.adsdk.fs.zn.fs.rt zmn(com.bytedance.adsdk.fs.zn.fs.rt rtVar) {
        List<com.bytedance.adsdk.fs.zn.zmn> list;
        List<com.bytedance.adsdk.fs.zn.zmn> zn = rtVar.zn();
        if (zn.size() <= 2) {
            return rtVar;
        }
        float floatValue = this.zn.nps().floatValue();
        if (floatValue == 0.0f) {
            return rtVar;
        }
        com.bytedance.adsdk.fs.zn.fs.rt fs = fs(rtVar);
        fs.zmn(rtVar.zmn().x, rtVar.zmn().y);
        List<com.bytedance.adsdk.fs.zn.zmn> zn2 = fs.zn();
        boolean fs2 = rtVar.fs();
        int i = 0;
        int i2 = 0;
        while (i < zn.size()) {
            com.bytedance.adsdk.fs.zn.zmn zmnVar = zn.get(i);
            com.bytedance.adsdk.fs.zn.zmn zmnVar2 = zn.get(zmn(i - 1, zn.size()));
            com.bytedance.adsdk.fs.zn.zmn zmnVar3 = zn.get(zmn(i - 2, zn.size()));
            PointF zn3 = (i != 0 || fs2) ? zmnVar2.zn() : rtVar.zmn();
            PointF fs3 = (i != 0 || fs2) ? zmnVar2.fs() : zn3;
            PointF zmn = zmnVar.zmn();
            PointF zn4 = zmnVar3.zn();
            PointF zn5 = zmnVar.zn();
            boolean z = !rtVar.fs() && i == 0;
            if (fs3.equals(zn3) && zmn.equals(zn3) && !z) {
                float f = zn3.x;
                float f2 = f - zn4.x;
                float f3 = zn3.y;
                float f4 = f3 - zn4.y;
                float f5 = zn5.x - f;
                float f6 = zn5.y - f3;
                list = zn;
                float hypot = (float) Math.hypot(f2, f4);
                float hypot2 = (float) Math.hypot(f5, f6);
                float min = Math.min(floatValue / hypot, 0.5f);
                float min2 = Math.min(floatValue / hypot2, 0.5f);
                float f7 = zn3.x;
                float f8 = ((zn4.x - f7) * min) + f7;
                float f9 = zn3.y;
                float f10 = ((zn4.y - f9) * min) + f9;
                float f11 = ((zn5.x - f7) * min2) + f7;
                float f12 = ((zn5.y - f9) * min2) + f9;
                float f13 = f8 - ((f8 - f7) * 0.5519f);
                float f14 = f10 - ((f10 - f9) * 0.5519f);
                float f15 = f11 - ((f11 - f7) * 0.5519f);
                float f16 = f12 - ((f12 - f9) * 0.5519f);
                com.bytedance.adsdk.fs.zn.zmn zmnVar4 = zn2.get(zmn(i2 - 1, zn2.size()));
                com.bytedance.adsdk.fs.zn.zmn zmnVar5 = zn2.get(i2);
                zmnVar4.fs(f8, f10);
                zmnVar4.zn(f8, f10);
                if (i == 0) {
                    fs.zmn(f8, f10);
                }
                zmnVar5.zmn(f13, f14);
                com.bytedance.adsdk.fs.zn.zmn zmnVar6 = zn2.get(i2 + 1);
                zmnVar5.fs(f15, f16);
                zmnVar5.zn(f11, f12);
                zmnVar6.zmn(f11, f12);
                i2 += 2;
            } else {
                list = zn;
                com.bytedance.adsdk.fs.zn.zmn zmnVar7 = zn2.get(zmn(i2 - 1, zn2.size()));
                com.bytedance.adsdk.fs.zn.zmn zmnVar8 = zn2.get(i2);
                zmnVar7.fs(zmnVar2.fs().x, zmnVar2.fs().y);
                zmnVar7.zn(zmnVar2.zn().x, zmnVar2.zn().y);
                zmnVar8.zmn(zmnVar.zmn().x, zmnVar.zmn().y);
                i2++;
            }
            i++;
            zn = list;
        }
        return fs;
    }

    private com.bytedance.adsdk.fs.zn.fs.rt fs(com.bytedance.adsdk.fs.zn.fs.rt rtVar) {
        List<com.bytedance.adsdk.fs.zn.zmn> zn = rtVar.zn();
        boolean fs = rtVar.fs();
        int size = zn.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.bytedance.adsdk.fs.zn.zmn zmnVar = zn.get(size);
            com.bytedance.adsdk.fs.zn.zmn zmnVar2 = zn.get(zmn(size - 1, zn.size()));
            PointF zn2 = (size != 0 || fs) ? zmnVar2.zn() : rtVar.zmn();
            i = (((size != 0 || fs) ? zmnVar2.fs() : zn2).equals(zn2) && zmnVar.zmn().equals(zn2) && !(!rtVar.fs() && size == 0 && size == zn.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        com.bytedance.adsdk.fs.zn.fs.rt rtVar2 = this.fb;
        if (rtVar2 == null || rtVar2.zn().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new com.bytedance.adsdk.fs.zn.zmn());
            }
            this.fb = new com.bytedance.adsdk.fs.zn.fs.rt(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.fb.zmn(fs);
        return this.fb;
    }

    private static int zmn(int i, int i2) {
        return i - (fs(i, i2) * i2);
    }

    private static int fs(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
