package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import com.ice.fishing.grenza.presentation.navigation.DetailRoute;
import com.ice.fishing.grenza.presentation.navigation.GameRoute;
import com.ice.fishing.grenza.presentation.navigation.HubRoute;
import com.ice.fishing.grenza.presentation.navigation.LaunchRoute;
import com.ice.fishing.grenza.presentation.navigation.MenuRoute;
import com.ice.fishing.grenza.presentation.navigation.RatedRoute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class r3s1LDPKFs1S implements le0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ r3s1LDPKFs1S(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x07a7, code lost:
    
        if (r9 != false) goto L289;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07c2  */
    @Override // defpackage.le0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OPXfSBeufaJ8(Object obj) {
        int i;
        td tdVar;
        float f;
        an0 an0Var;
        boolean z;
        long j;
        ji jiVar;
        m9 m9Var;
        float f2;
        float f3;
        long S2OOm9zPNm0h;
        String concat;
        StringBuilder sb;
        int i2;
        ez0 ez0Var;
        ez0 ez0Var2;
        Bundle bundle;
        Throwable th;
        float f4 = 0.0f;
        final int i3 = 4;
        final int i4 = 3;
        Throwable th2 = null;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return obj == ((QrzZRwfaDlRX) this.OPXfSBeufaJ8) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                kpCQ9veP6n3I kpcq9vep6n3i = (kpCQ9veP6n3I) this.OPXfSBeufaJ8;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == kpcq9vep6n3i ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != kpcq9vep6n3i ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 2:
                n nVar = (n) this.OPXfSBeufaJ8;
                nVar.ZbWwgt3aGe7A.rtx2ld2ELZv4((me2) obj, f2.QrzZRwfaDlRX(nVar, h2.lS5Rgt96tfkO));
                return no2.PxuCJdSBwIXG;
            case 3:
                ((l32) obj).PxuCJdSBwIXG(u22.PxuCJdSBwIXG, new t22(ji0.rtx2ld2ELZv4, ((ef1) this.OPXfSBeufaJ8).PxuCJdSBwIXG(), s22.OPXfSBeufaJ8, true));
                return no2.PxuCJdSBwIXG;
            case 4:
                zn znVar = (zn) this.OPXfSBeufaJ8;
                ((bc) znVar.PxuCJdSBwIXG).Y1f8riQaR6yg(true);
                ((ac) znVar.lS5Rgt96tfkO).a92UlCVFR9N8(true);
                return new fc((w01) obj, znVar, 0);
            case 5:
                return new x2(i4, (ad) this.OPXfSBeufaJ8);
            case 6:
                je jeVar = (je) this.OPXfSBeufaJ8;
                eh ehVar = (eh) obj;
                if (ehVar.lS5Rgt96tfkO() * jeVar.pnx5pC0XzaCw < 0.0f || a62.lS5Rgt96tfkO(ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg()) <= 0.0f) {
                    return ehVar.PxuCJdSBwIXG(new wnqUPcAvl7HT(i3));
                }
                float f5 = jeVar.pnx5pC0XzaCw;
                k10.Companion.getClass();
                final float min = Math.min(k10.lS5Rgt96tfkO(f5, 0.0f) ? 1.0f : (float) Math.ceil(ehVar.lS5Rgt96tfkO() * jeVar.pnx5pC0XzaCw), (float) Math.ceil(a62.lS5Rgt96tfkO(ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg()) / 2.0f));
                final float f6 = min / 2.0f;
                final long floatToRawIntBits = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
                final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg() & 4294967295L)) - min) & 4294967295L);
                float f7 = min * 2.0f;
                boolean z2 = f7 > a62.lS5Rgt96tfkO(ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg());
                th0 PxuCJdSBwIXG = jeVar.e6tOsSdd2EFb.PxuCJdSBwIXG(ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg(), ehVar.rtx2ld2ELZv4.getLayoutDirection(), ehVar);
                if (!(PxuCJdSBwIXG instanceof wh1)) {
                    if (!(PxuCJdSBwIXG instanceof yh1)) {
                        boolean z3 = z2;
                        if (!(PxuCJdSBwIXG instanceof xh1)) {
                            u9.gPXPFXrUH4XX();
                            return null;
                        }
                        final m82 m82Var = jeVar.IAToe7bXGz4N;
                        if (z3) {
                            bf1.Companion.getClass();
                            floatToRawIntBits = 0;
                        }
                        final long j2 = floatToRawIntBits;
                        if (z3) {
                            floatToRawIntBits2 = ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg();
                        }
                        final long j3 = floatToRawIntBits2;
                        final l30 ra2Var = z3 ? u70.PxuCJdSBwIXG : new ra2(min, 0.0f, 0, 0, 30);
                        return ehVar.PxuCJdSBwIXG(new le0() { // from class: ge
                            @Override // defpackage.le0
                            public final Object OPXfSBeufaJ8(Object obj2) {
                                xw0 xw0Var = (xw0) obj2;
                                xw0Var.PxuCJdSBwIXG();
                                k30.wLFCmsViZrNT(xw0Var, m82Var, j2, j3, 0.0f, ra2Var, 104);
                                return no2.PxuCJdSBwIXG;
                            }
                        });
                    }
                    final m82 m82Var2 = jeVar.IAToe7bXGz4N;
                    mx1 mx1Var = ((yh1) PxuCJdSBwIXG).TSizfFm2Yiuu;
                    if (ki0.zf8DYfih6EZu(mx1Var)) {
                        final long j4 = mx1Var.e9gEMXR7LXtO;
                        final ra2 ra2Var2 = new ra2(min, 0.0f, 0, 0, 30);
                        final boolean z4 = z2;
                        return ehVar.PxuCJdSBwIXG(new le0() { // from class: he
                            @Override // defpackage.le0
                            public final Object OPXfSBeufaJ8(Object obj2) {
                                long j5;
                                xw0 xw0Var = (xw0) obj2;
                                xw0Var.PxuCJdSBwIXG();
                                ji jiVar2 = xw0Var.rtx2ld2ELZv4;
                                boolean z5 = z4;
                                uf ufVar = m82Var2;
                                long j6 = j4;
                                if (z5) {
                                    k30.tmVwIGCQF4zR(xw0Var, ufVar, 0L, 0L, j6, null, 246);
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                                    float f8 = f6;
                                    if (intBitsToFloat < f8) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() >> 32));
                                        float f9 = min;
                                        float f10 = intBitsToFloat2 - f9;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() & 4294967295L)) - f9;
                                        pk.Companion.getClass();
                                        m9 m9Var2 = jiVar2.OPXfSBeufaJ8;
                                        long S2OOm9zPNm0h2 = m9Var2.S2OOm9zPNm0h();
                                        m9Var2.gPXPFXrUH4XX().wdg6QnbFHrFF();
                                        try {
                                            ((m9) ((i2) m9Var2.OPXfSBeufaJ8).OPXfSBeufaJ8).gPXPFXrUH4XX().TSizfFm2Yiuu(f9, f9, f10, intBitsToFloat3, 0);
                                            j5 = S2OOm9zPNm0h2;
                                            try {
                                                k30.tmVwIGCQF4zR(xw0Var, ufVar, 0L, 0L, j6, null, 246);
                                                m9Var2.gPXPFXrUH4XX().RAsUl2FVSrh6();
                                                m9Var2.ozEBbv0hFTAB(j5);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                m9Var2.gPXPFXrUH4XX().RAsUl2FVSrh6();
                                                m9Var2.ozEBbv0hFTAB(j5);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            j5 = S2OOm9zPNm0h2;
                                        }
                                    } else {
                                        k30.tmVwIGCQF4zR(xw0Var, ufVar, floatToRawIntBits, floatToRawIntBits2, bs0.tmVwIGCQF4zR(j6, f8), ra2Var2, 208);
                                    }
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                        });
                    }
                    boolean z5 = z2;
                    if (jeVar.ZbWwgt3aGe7A == null) {
                        jeVar.ZbWwgt3aGe7A = new fe();
                    }
                    fe feVar = jeVar.ZbWwgt3aGe7A;
                    feVar.getClass();
                    r4 r4Var = feVar.Y1f8riQaR6yg;
                    r4 r4Var2 = r4Var;
                    if (r4Var == null) {
                        r4 PxuCJdSBwIXG2 = t4.PxuCJdSBwIXG();
                        feVar.Y1f8riQaR6yg = PxuCJdSBwIXG2;
                        r4Var2 = PxuCJdSBwIXG2;
                    }
                    r4Var2.a92UlCVFR9N8();
                    yj1.TSizfFm2Yiuu(r4Var2, mx1Var);
                    if (!z5) {
                        yj1 PxuCJdSBwIXG3 = t4.PxuCJdSBwIXG();
                        yj1.TSizfFm2Yiuu(PxuCJdSBwIXG3, new mx1(min, min, (mx1Var.TSizfFm2Yiuu - mx1Var.PxuCJdSBwIXG) - min, (mx1Var.Y1f8riQaR6yg - mx1Var.lS5Rgt96tfkO) - min, bs0.tmVwIGCQF4zR(mx1Var.e9gEMXR7LXtO, min), bs0.tmVwIGCQF4zR(mx1Var.a92UlCVFR9N8, min), bs0.tmVwIGCQF4zR(mx1Var.RAsUl2FVSrh6, min), bs0.tmVwIGCQF4zR(mx1Var.rtx2ld2ELZv4, min)));
                        zk1.Companion.getClass();
                        r4Var2.e9gEMXR7LXtO(r4Var2, PxuCJdSBwIXG3, 0);
                    }
                    return ehVar.PxuCJdSBwIXG(new e9gEMXR7LXtO(i4, r4Var2, m82Var2));
                }
                m82 m82Var3 = jeVar.IAToe7bXGz4N;
                wh1 wh1Var = (wh1) PxuCJdSBwIXG;
                yj1 yj1Var = wh1Var.TSizfFm2Yiuu;
                if (z2) {
                    return ehVar.PxuCJdSBwIXG(new e9gEMXR7LXtO(i3, wh1Var, m82Var3));
                }
                if (m82Var3 != null) {
                    an0.Companion.getClass();
                    tdVar = il.PxuCJdSBwIXG(jl.Companion, hl.lS5Rgt96tfkO(m82Var3.PxuCJdSBwIXG, 1.0f));
                    i = 1;
                } else {
                    an0.Companion.getClass();
                    i = 0;
                    tdVar = null;
                }
                qt1 Y1f8riQaR6yg = ((r4) yj1Var).Y1f8riQaR6yg();
                float f8 = Y1f8riQaR6yg.lS5Rgt96tfkO;
                float f9 = Y1f8riQaR6yg.PxuCJdSBwIXG;
                if (jeVar.ZbWwgt3aGe7A == null) {
                    jeVar.ZbWwgt3aGe7A = new fe();
                }
                fe feVar2 = jeVar.ZbWwgt3aGe7A;
                feVar2.getClass();
                r4 r4Var3 = feVar2.Y1f8riQaR6yg;
                r4 r4Var4 = r4Var3;
                if (r4Var3 == null) {
                    r4 PxuCJdSBwIXG4 = t4.PxuCJdSBwIXG();
                    feVar2.Y1f8riQaR6yg = PxuCJdSBwIXG4;
                    r4Var4 = PxuCJdSBwIXG4;
                }
                r4Var4.a92UlCVFR9N8();
                yj1.PxuCJdSBwIXG(r4Var4, Y1f8riQaR6yg);
                zk1.Companion.getClass();
                r4Var4.e9gEMXR7LXtO(r4Var4, yj1Var, 0);
                zt1 zt1Var = new zt1();
                long ceil = (((int) Math.ceil(Y1f8riQaR6yg.Y1f8riQaR6yg - f8)) & 4294967295L) | (((int) Math.ceil(Y1f8riQaR6yg.TSizfFm2Yiuu - f9)) << 32);
                fe feVar3 = jeVar.ZbWwgt3aGe7A;
                feVar3.getClass();
                w3 w3Var = feVar3.PxuCJdSBwIXG;
                t0 t0Var = feVar3.lS5Rgt96tfkO;
                if (w3Var != null) {
                    f = 1.0f;
                    an0Var = new an0(w3Var.PxuCJdSBwIXG());
                } else {
                    f = 1.0f;
                    an0Var = null;
                }
                an0.Companion.getClass();
                try {
                    try {
                        if (an0Var == null || an0Var.PxuCJdSBwIXG != 0) {
                            an0 an0Var2 = w3Var != null ? new an0(w3Var.PxuCJdSBwIXG()) : null;
                            if (an0Var2 == null || i != an0Var2.PxuCJdSBwIXG) {
                                z = false;
                                if (w3Var != null || t0Var == null) {
                                    j = ceil;
                                } else {
                                    j = ceil;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg() >> 32));
                                    Bitmap bitmap = w3Var.PxuCJdSBwIXG;
                                    if (intBitsToFloat <= bitmap.getWidth()) {
                                        if (Float.intBitsToFloat((int) (ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg() & 4294967295L)) <= bitmap.getHeight()) {
                                        }
                                    }
                                }
                                w3Var = vi0.PxuCJdSBwIXG((int) (j >> 32), (int) (j & 4294967295L), i);
                                feVar3.PxuCJdSBwIXG = w3Var;
                                t0Var = zv.PxuCJdSBwIXG(w3Var);
                                feVar3.lS5Rgt96tfkO = t0Var;
                                jiVar = feVar3.TSizfFm2Yiuu;
                                if (jiVar == null) {
                                    jiVar = new ji();
                                    feVar3.TSizfFm2Yiuu = jiVar;
                                }
                                m9Var = jiVar.OPXfSBeufaJ8;
                                ii iiVar = jiVar.rtx2ld2ELZv4;
                                long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(j);
                                cw0 layoutDirection = ehVar.rtx2ld2ELZv4.getLayoutDirection();
                                ji jiVar2 = jiVar;
                                hy hyVar = iiVar.PxuCJdSBwIXG;
                                cw0 cw0Var = iiVar.lS5Rgt96tfkO;
                                gi giVar = iiVar.TSizfFm2Yiuu;
                                long j5 = iiVar.Y1f8riQaR6yg;
                                iiVar.PxuCJdSBwIXG = ehVar;
                                iiVar.lS5Rgt96tfkO = layoutDirection;
                                iiVar.TSizfFm2Yiuu = t0Var;
                                iiVar.Y1f8riQaR6yg = gGoUzNp9JO5I;
                                t0Var.wdg6QnbFHrFF();
                                hl.Companion.getClass();
                                long j6 = hl.lS5Rgt96tfkO;
                                sd.Companion.getClass();
                                k30.ozEBbv0hFTAB(jiVar2, j6, gGoUzNp9JO5I, 58);
                                f2 = -f9;
                                f3 = -f8;
                                ((i2) m9Var.OPXfSBeufaJ8).BRwzKIf41E4i(f2, f3);
                                k30.rtx2ld2ELZv4(jiVar2, wh1Var.TSizfFm2Yiuu, m82Var3, 0.0f, new ra2(f7, 0.0f, 0, 0, 30), 52);
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() >> 32)) + f) / Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() >> 32));
                                float intBitsToFloat3 = (Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() & 4294967295L)) + f) / Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() & 4294967295L));
                                t0 t0Var2 = t0Var;
                                r4 r4Var5 = r4Var4;
                                long nxJAScVArhE9 = jiVar2.nxJAScVArhE9();
                                w3 w3Var2 = w3Var;
                                S2OOm9zPNm0h = m9Var.S2OOm9zPNm0h();
                                m9Var.gPXPFXrUH4XX().wdg6QnbFHrFF();
                                ((i2) m9Var.OPXfSBeufaJ8).r3s1LDPKFs1S(intBitsToFloat2, intBitsToFloat3, nxJAScVArhE9);
                                k30.rtx2ld2ELZv4(jiVar2, r4Var5, m82Var3, 0.0f, null, 28);
                                ((i2) m9Var.OPXfSBeufaJ8).BRwzKIf41E4i(-f2, -f3);
                                t0Var2.RAsUl2FVSrh6();
                                iiVar.PxuCJdSBwIXG = hyVar;
                                iiVar.lS5Rgt96tfkO = cw0Var;
                                iiVar.TSizfFm2Yiuu = giVar;
                                iiVar.Y1f8riQaR6yg = j5;
                                w3Var2.PxuCJdSBwIXG.prepareToDraw();
                                zt1Var.rtx2ld2ELZv4 = w3Var2;
                                return ehVar.PxuCJdSBwIXG(new ie(Y1f8riQaR6yg, zt1Var, j, tdVar));
                            }
                        }
                        ((i2) m9Var.OPXfSBeufaJ8).r3s1LDPKFs1S(intBitsToFloat2, intBitsToFloat3, nxJAScVArhE9);
                        k30.rtx2ld2ELZv4(jiVar2, r4Var5, m82Var3, 0.0f, null, 28);
                        ((i2) m9Var.OPXfSBeufaJ8).BRwzKIf41E4i(-f2, -f3);
                        t0Var2.RAsUl2FVSrh6();
                        iiVar.PxuCJdSBwIXG = hyVar;
                        iiVar.lS5Rgt96tfkO = cw0Var;
                        iiVar.TSizfFm2Yiuu = giVar;
                        iiVar.Y1f8riQaR6yg = j5;
                        w3Var2.PxuCJdSBwIXG.prepareToDraw();
                        zt1Var.rtx2ld2ELZv4 = w3Var2;
                        return ehVar.PxuCJdSBwIXG(new ie(Y1f8riQaR6yg, zt1Var, j, tdVar));
                    } finally {
                        m9Var.gPXPFXrUH4XX().RAsUl2FVSrh6();
                        m9Var.ozEBbv0hFTAB(S2OOm9zPNm0h);
                    }
                    k30.rtx2ld2ELZv4(jiVar2, wh1Var.TSizfFm2Yiuu, m82Var3, 0.0f, new ra2(f7, 0.0f, 0, 0, 30), 52);
                    float intBitsToFloat22 = (Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() >> 32)) + f) / Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() >> 32));
                    float intBitsToFloat32 = (Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() & 4294967295L)) + f) / Float.intBitsToFloat((int) (jiVar2.Y1f8riQaR6yg() & 4294967295L));
                    t0 t0Var22 = t0Var;
                    r4 r4Var52 = r4Var4;
                    long nxJAScVArhE92 = jiVar2.nxJAScVArhE9();
                    w3 w3Var22 = w3Var;
                    S2OOm9zPNm0h = m9Var.S2OOm9zPNm0h();
                    m9Var.gPXPFXrUH4XX().wdg6QnbFHrFF();
                } catch (Throwable th3) {
                    ((i2) m9Var.OPXfSBeufaJ8).BRwzKIf41E4i(-f2, -f3);
                    throw th3;
                }
                z = true;
                if (w3Var != null) {
                }
                j = ceil;
                w3Var = vi0.PxuCJdSBwIXG((int) (j >> 32), (int) (j & 4294967295L), i);
                feVar3.PxuCJdSBwIXG = w3Var;
                t0Var = zv.PxuCJdSBwIXG(w3Var);
                feVar3.lS5Rgt96tfkO = t0Var;
                jiVar = feVar3.TSizfFm2Yiuu;
                if (jiVar == null) {
                }
                m9Var = jiVar.OPXfSBeufaJ8;
                ii iiVar2 = jiVar.rtx2ld2ELZv4;
                long gGoUzNp9JO5I2 = kj0.gGoUzNp9JO5I(j);
                cw0 layoutDirection2 = ehVar.rtx2ld2ELZv4.getLayoutDirection();
                ji jiVar22 = jiVar;
                hy hyVar2 = iiVar2.PxuCJdSBwIXG;
                cw0 cw0Var2 = iiVar2.lS5Rgt96tfkO;
                gi giVar2 = iiVar2.TSizfFm2Yiuu;
                long j52 = iiVar2.Y1f8riQaR6yg;
                iiVar2.PxuCJdSBwIXG = ehVar;
                iiVar2.lS5Rgt96tfkO = layoutDirection2;
                iiVar2.TSizfFm2Yiuu = t0Var;
                iiVar2.Y1f8riQaR6yg = gGoUzNp9JO5I2;
                t0Var.wdg6QnbFHrFF();
                hl.Companion.getClass();
                long j62 = hl.lS5Rgt96tfkO;
                sd.Companion.getClass();
                k30.ozEBbv0hFTAB(jiVar22, j62, gGoUzNp9JO5I2, 58);
                f2 = -f9;
                f3 = -f8;
                ((i2) m9Var.OPXfSBeufaJ8).BRwzKIf41E4i(f2, f3);
                break;
            case 7:
                ((fj1) this.OPXfSBeufaJ8).OPXfSBeufaJ8(((Float) obj).floatValue());
                return no2.PxuCJdSBwIXG;
            case 8:
                ((m31) this.OPXfSBeufaJ8).PxuCJdSBwIXG();
                return no2.PxuCJdSBwIXG;
            case 9:
                m40 m40Var = (m40) obj;
                String str = ((m40) this.OPXfSBeufaJ8) == m40Var ? " > " : "   ";
                if (m40Var instanceof mm) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    mm mmVar = (mm) m40Var;
                    sb.append(mmVar.PxuCJdSBwIXG.OPXfSBeufaJ8.length());
                    sb.append(", newCursorPosition=");
                    i2 = mmVar.lS5Rgt96tfkO;
                } else {
                    if (!(m40Var instanceof p42)) {
                        if (m40Var instanceof o42) {
                            concat = ((o42) m40Var).toString();
                        } else if (m40Var instanceof cy) {
                            concat = ((cy) m40Var).toString();
                        } else if (m40Var instanceof dy) {
                            concat = ((dy) m40Var).toString();
                        } else if (m40Var instanceof q42) {
                            concat = ((q42) m40Var).toString();
                        } else if (m40Var instanceof d80) {
                            concat = "FinishComposingTextCommand()";
                        } else if (m40Var instanceof ay) {
                            concat = "DeleteAllCommand()";
                        } else {
                            String TSizfFm2Yiuu = bu1.PxuCJdSBwIXG(m40Var.getClass()).TSizfFm2Yiuu();
                            if (TSizfFm2Yiuu == null) {
                                TSizfFm2Yiuu = "{anonymous EditCommand}";
                            }
                            concat = "Unknown EditCommand: ".concat(TSizfFm2Yiuu);
                        }
                        return str.concat(concat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    p42 p42Var = (p42) m40Var;
                    sb.append(p42Var.PxuCJdSBwIXG.OPXfSBeufaJ8.length());
                    sb.append(", newCursorPosition=");
                    i2 = p42Var.lS5Rgt96tfkO;
                }
                concat = o0.r3s1LDPKFs1S(sb, i2, ')');
                return str.concat(concat);
            case 10:
                f91 f91Var = (f91) this.OPXfSBeufaJ8;
                Object[] objArr = f91Var.rtx2ld2ELZv4;
                int i5 = f91Var.wdg6QnbFHrFF;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((k51) objArr[i6]).lS5Rgt96tfkO();
                }
                return no2.PxuCJdSBwIXG;
            case 11:
                zm2 zm2Var = (zm2) obj;
                return ((qb0) this.OPXfSBeufaJ8).PxuCJdSBwIXG(new zm2(null, zm2Var.lS5Rgt96tfkO, zm2Var.TSizfFm2Yiuu, zm2Var.Y1f8riQaR6yg, zm2Var.e9gEMXR7LXtO)).getValue();
            case 12:
                ((cf0) this.OPXfSBeufaJ8).e9gEMXR7LXtO(((Integer) obj).intValue());
                return no2.PxuCJdSBwIXG;
            case 13:
                bo0 bo0Var = (bo0) this.OPXfSBeufaJ8;
                eh ehVar2 = (eh) obj;
                float lS5Rgt96tfkO = ehVar2.lS5Rgt96tfkO() * ((k10) bo0Var.ozEBbv0hFTAB.Y1f8riQaR6yg()).rtx2ld2ELZv4;
                r4 PxuCJdSBwIXG5 = t4.PxuCJdSBwIXG();
                z42 z42Var = bo0Var.BjEWd04qc7Mw;
                if (z42Var == null) {
                    z42Var = e52.PxuCJdSBwIXG((d52) f2.QrzZRwfaDlRX(bo0Var, e52.PxuCJdSBwIXG), cs0.XL4ISE6Oc65B);
                }
                th0 PxuCJdSBwIXG6 = z42Var.PxuCJdSBwIXG(ehVar2.rtx2ld2ELZv4.Y1f8riQaR6yg(), ehVar2.rtx2ld2ELZv4.getLayoutDirection(), ehVar2);
                if (PxuCJdSBwIXG6 instanceof xh1) {
                    yj1.PxuCJdSBwIXG(PxuCJdSBwIXG5, ((xh1) PxuCJdSBwIXG6).TSizfFm2Yiuu);
                } else if (PxuCJdSBwIXG6 instanceof yh1) {
                    yj1.TSizfFm2Yiuu(PxuCJdSBwIXG5, ((yh1) PxuCJdSBwIXG6).TSizfFm2Yiuu);
                } else {
                    if (!(PxuCJdSBwIXG6 instanceof wh1)) {
                        u9.gPXPFXrUH4XX();
                        return null;
                    }
                    yj1.lS5Rgt96tfkO(PxuCJdSBwIXG5, ((wh1) PxuCJdSBwIXG6).TSizfFm2Yiuu);
                }
                r4 PxuCJdSBwIXG7 = t4.PxuCJdSBwIXG();
                float intBitsToFloat4 = Float.intBitsToFloat((int) (ehVar2.rtx2ld2ELZv4.Y1f8riQaR6yg() & 4294967295L)) - lS5Rgt96tfkO;
                float intBitsToFloat5 = Float.intBitsToFloat((int) (ehVar2.rtx2ld2ELZv4.Y1f8riQaR6yg() >> 32));
                float intBitsToFloat6 = Float.intBitsToFloat((int) (4294967295L & ehVar2.rtx2ld2ELZv4.Y1f8riQaR6yg()));
                if (Float.isNaN(0.0f) || Float.isNaN(intBitsToFloat4) || Float.isNaN(intBitsToFloat5) || Float.isNaN(intBitsToFloat6)) {
                    t4.lS5Rgt96tfkO("Invalid rectangle, make sure no value is NaN");
                }
                if (PxuCJdSBwIXG7.lS5Rgt96tfkO == null) {
                    PxuCJdSBwIXG7.lS5Rgt96tfkO = new RectF();
                }
                RectF rectF = PxuCJdSBwIXG7.lS5Rgt96tfkO;
                rectF.getClass();
                rectF.set(0.0f, intBitsToFloat4, intBitsToFloat5, intBitsToFloat6);
                Path path = PxuCJdSBwIXG7.PxuCJdSBwIXG;
                RectF rectF2 = PxuCJdSBwIXG7.lS5Rgt96tfkO;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                r4 PxuCJdSBwIXG8 = t4.PxuCJdSBwIXG();
                zk1.Companion.getClass();
                PxuCJdSBwIXG8.e9gEMXR7LXtO(PxuCJdSBwIXG7, PxuCJdSBwIXG5, 1);
                return ehVar2.PxuCJdSBwIXG(new e9gEMXR7LXtO(14, PxuCJdSBwIXG8, bo0Var));
            case 14:
                return new x2(6, (by0) this.OPXfSBeufaJ8);
            case 15:
                return new x2(8, (iy0) this.OPXfSBeufaJ8);
            case 16:
                jz0 jz0Var = (jz0) this.OPXfSBeufaJ8;
                float f10 = -((Float) obj).floatValue();
                if ((f10 >= 0.0f || jz0Var.TSizfFm2Yiuu()) && (f10 <= 0.0f || jz0Var.PxuCJdSBwIXG())) {
                    if (Math.abs(jz0Var.rtx2ld2ELZv4) > 0.5f) {
                        hp0.TSizfFm2Yiuu("entered drag with non-zero pending scroll");
                    }
                    jz0Var.Y1f8riQaR6yg = true;
                    float f11 = jz0Var.rtx2ld2ELZv4 + f10;
                    jz0Var.rtx2ld2ELZv4 = f11;
                    if (Math.abs(f11) > 0.5f) {
                        float f12 = jz0Var.rtx2ld2ELZv4;
                        int round = Math.round(f12);
                        ez0 a92UlCVFR9N8 = ((ez0) jz0Var.a92UlCVFR9N8.getValue()).a92UlCVFR9N8(round, !jz0Var.lS5Rgt96tfkO);
                        if (a92UlCVFR9N8 != null && (ez0Var2 = jz0Var.TSizfFm2Yiuu) != null) {
                            ez0 a92UlCVFR9N82 = ez0Var2.a92UlCVFR9N8(round, true);
                            if (a92UlCVFR9N82 != null) {
                                jz0Var.TSizfFm2Yiuu = a92UlCVFR9N82;
                            } else {
                                ez0Var = null;
                                if (ez0Var == null) {
                                    jz0Var.a92UlCVFR9N8(ez0Var, jz0Var.lS5Rgt96tfkO, true);
                                    jz0Var.VhhvGxCb8gfr.setValue(no2.PxuCJdSBwIXG);
                                    jz0Var.rtx2ld2ELZv4(f12 - jz0Var.rtx2ld2ELZv4, ez0Var);
                                } else {
                                    vw0 vw0Var = jz0Var.dgRBjINgWbAK;
                                    if (vw0Var != null) {
                                        vw0Var.dgRBjINgWbAK();
                                    }
                                    jz0Var.rtx2ld2ELZv4(f12 - jz0Var.rtx2ld2ELZv4, jz0Var.RAsUl2FVSrh6());
                                }
                            }
                        }
                        ez0Var = a92UlCVFR9N8;
                        if (ez0Var == null) {
                        }
                    }
                    if (Math.abs(jz0Var.rtx2ld2ELZv4) > 0.5f) {
                        f10 -= jz0Var.rtx2ld2ELZv4;
                        jz0Var.rtx2ld2ELZv4 = 0.0f;
                    }
                    f4 = f10;
                }
                return Float.valueOf(-f4);
            case 17:
                zy1 zy1Var = (zy1) this.OPXfSBeufaJ8;
                return Boolean.valueOf(zy1Var != null ? zy1Var.Y1f8riQaR6yg(obj) : true);
            case 18:
                return ((z41) this.OPXfSBeufaJ8).lS5Rgt96tfkO(((Integer) obj).intValue());
            case 19:
                u51 u51Var = (u51) this.OPXfSBeufaJ8;
                String str2 = (String) obj;
                str2.getClass();
                l92 l92Var = u51Var.Y1f8riQaR6yg;
                l92Var.getClass();
                l92Var.OPXfSBeufaJ8(null, str2);
                return no2.PxuCJdSBwIXG;
            case 20:
                ((r91) this.OPXfSBeufaJ8).lS5Rgt96tfkO(null);
                return no2.PxuCJdSBwIXG;
            case 21:
                final lb1 lb1Var = (lb1) this.OPXfSBeufaJ8;
                fb1 fb1Var = (fb1) obj;
                fb1Var.getClass();
                final int i7 = 0;
                final int i8 = 1;
                th0.x50lh2ztY7Y5(fb1Var, bu1.PxuCJdSBwIXG(LaunchRoute.class), new on(2027206151, true, new re0() { // from class: hb1
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
                    
                        if (r8 == defpackage.fp.lS5Rgt96tfkO) goto L25;
                     */
                    @Override // defpackage.re0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object r3s1LDPKFs1S(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i9 = i7;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        lb1 lb1Var2 = lb1Var;
                        x91 x91Var = (x91) obj3;
                        hp hpVar = (hp) obj4;
                        ((Integer) obj5).getClass();
                        ((s7) obj2).getClass();
                        x91Var.getClass();
                        gg1 gg1Var = mp.PxuCJdSBwIXG;
                        switch (i9) {
                            case 0:
                                tf0 tf0Var = (tf0) hpVar;
                                boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(lb1Var2);
                                Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                                if (!rtx2ld2ELZv4) {
                                    hp.Companion.getClass();
                                    break;
                                }
                                nLZGh9p8gVSu = new dz(lb1Var2, 3);
                                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                                qv0.Y1f8riQaR6yg((ae0) nLZGh9p8gVSu, null, tf0Var, 0);
                                break;
                            case 1:
                                bs0.TSizfFm2Yiuu(lb1Var2, null, hpVar, 0);
                                break;
                            case 2:
                                bs0.Y1f8riQaR6yg(lb1Var2, null, hpVar, 0);
                                break;
                            case 3:
                                cs0.e9gEMXR7LXtO(lb1Var2, null, hpVar, 0);
                                break;
                            case 4:
                                ov2.RAsUl2FVSrh6(lb1Var2, null, hpVar, 0);
                                break;
                            default:
                                ck PxuCJdSBwIXG9 = bu1.PxuCJdSBwIXG(DetailRoute.class);
                                Bundle PxuCJdSBwIXG10 = x91Var.QrzZRwfaDlRX.PxuCJdSBwIXG();
                                if (PxuCJdSBwIXG10 == null) {
                                    PxuCJdSBwIXG10 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                                }
                                Map TSizfFm2Yiuu2 = x91Var.OPXfSBeufaJ8.TSizfFm2Yiuu();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w41.i68hK7ahKtgp(TSizfFm2Yiuu2.size()));
                                for (Map.Entry entry2 : TSizfFm2Yiuu2.entrySet()) {
                                    linkedHashMap.put(entry2.getKey(), ((v91) entry2.getValue()).PxuCJdSBwIXG);
                                }
                                KSerializer serializer = SerializersKt.serializer(PxuCJdSBwIXG9);
                                serializer.getClass();
                                hq0.TSizfFm2Yiuu(((DetailRoute) serializer.deserialize(new sx1(PxuCJdSBwIXG10, linkedHashMap))).PxuCJdSBwIXG, lb1Var2, null, hpVar, 0);
                                gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                break;
                        }
                        return no2Var;
                    }
                }));
                th0.x50lh2ztY7Y5(fb1Var, bu1.PxuCJdSBwIXG(HubRoute.class), new on(817763838, true, new re0() { // from class: hb1
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
                    
                        if (r8 == defpackage.fp.lS5Rgt96tfkO) goto L25;
                     */
                    @Override // defpackage.re0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object r3s1LDPKFs1S(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i9 = i8;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        lb1 lb1Var2 = lb1Var;
                        x91 x91Var = (x91) obj3;
                        hp hpVar = (hp) obj4;
                        ((Integer) obj5).getClass();
                        ((s7) obj2).getClass();
                        x91Var.getClass();
                        gg1 gg1Var = mp.PxuCJdSBwIXG;
                        switch (i9) {
                            case 0:
                                tf0 tf0Var = (tf0) hpVar;
                                boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(lb1Var2);
                                Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                                if (!rtx2ld2ELZv4) {
                                    hp.Companion.getClass();
                                    break;
                                }
                                nLZGh9p8gVSu = new dz(lb1Var2, 3);
                                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                                qv0.Y1f8riQaR6yg((ae0) nLZGh9p8gVSu, null, tf0Var, 0);
                                break;
                            case 1:
                                bs0.TSizfFm2Yiuu(lb1Var2, null, hpVar, 0);
                                break;
                            case 2:
                                bs0.Y1f8riQaR6yg(lb1Var2, null, hpVar, 0);
                                break;
                            case 3:
                                cs0.e9gEMXR7LXtO(lb1Var2, null, hpVar, 0);
                                break;
                            case 4:
                                ov2.RAsUl2FVSrh6(lb1Var2, null, hpVar, 0);
                                break;
                            default:
                                ck PxuCJdSBwIXG9 = bu1.PxuCJdSBwIXG(DetailRoute.class);
                                Bundle PxuCJdSBwIXG10 = x91Var.QrzZRwfaDlRX.PxuCJdSBwIXG();
                                if (PxuCJdSBwIXG10 == null) {
                                    PxuCJdSBwIXG10 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                                }
                                Map TSizfFm2Yiuu2 = x91Var.OPXfSBeufaJ8.TSizfFm2Yiuu();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w41.i68hK7ahKtgp(TSizfFm2Yiuu2.size()));
                                for (Map.Entry entry2 : TSizfFm2Yiuu2.entrySet()) {
                                    linkedHashMap.put(entry2.getKey(), ((v91) entry2.getValue()).PxuCJdSBwIXG);
                                }
                                KSerializer serializer = SerializersKt.serializer(PxuCJdSBwIXG9);
                                serializer.getClass();
                                hq0.TSizfFm2Yiuu(((DetailRoute) serializer.deserialize(new sx1(PxuCJdSBwIXG10, linkedHashMap))).PxuCJdSBwIXG, lb1Var2, null, hpVar, 0);
                                gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                break;
                        }
                        return no2Var;
                    }
                }));
                final int i9 = 2;
                th0.x50lh2ztY7Y5(fb1Var, bu1.PxuCJdSBwIXG(MenuRoute.class), new on(1067042239, true, new re0() { // from class: hb1
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
                    
                        if (r8 == defpackage.fp.lS5Rgt96tfkO) goto L25;
                     */
                    @Override // defpackage.re0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object r3s1LDPKFs1S(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i92 = i9;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        lb1 lb1Var2 = lb1Var;
                        x91 x91Var = (x91) obj3;
                        hp hpVar = (hp) obj4;
                        ((Integer) obj5).getClass();
                        ((s7) obj2).getClass();
                        x91Var.getClass();
                        gg1 gg1Var = mp.PxuCJdSBwIXG;
                        switch (i92) {
                            case 0:
                                tf0 tf0Var = (tf0) hpVar;
                                boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(lb1Var2);
                                Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                                if (!rtx2ld2ELZv4) {
                                    hp.Companion.getClass();
                                    break;
                                }
                                nLZGh9p8gVSu = new dz(lb1Var2, 3);
                                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                                qv0.Y1f8riQaR6yg((ae0) nLZGh9p8gVSu, null, tf0Var, 0);
                                break;
                            case 1:
                                bs0.TSizfFm2Yiuu(lb1Var2, null, hpVar, 0);
                                break;
                            case 2:
                                bs0.Y1f8riQaR6yg(lb1Var2, null, hpVar, 0);
                                break;
                            case 3:
                                cs0.e9gEMXR7LXtO(lb1Var2, null, hpVar, 0);
                                break;
                            case 4:
                                ov2.RAsUl2FVSrh6(lb1Var2, null, hpVar, 0);
                                break;
                            default:
                                ck PxuCJdSBwIXG9 = bu1.PxuCJdSBwIXG(DetailRoute.class);
                                Bundle PxuCJdSBwIXG10 = x91Var.QrzZRwfaDlRX.PxuCJdSBwIXG();
                                if (PxuCJdSBwIXG10 == null) {
                                    PxuCJdSBwIXG10 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                                }
                                Map TSizfFm2Yiuu2 = x91Var.OPXfSBeufaJ8.TSizfFm2Yiuu();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w41.i68hK7ahKtgp(TSizfFm2Yiuu2.size()));
                                for (Map.Entry entry2 : TSizfFm2Yiuu2.entrySet()) {
                                    linkedHashMap.put(entry2.getKey(), ((v91) entry2.getValue()).PxuCJdSBwIXG);
                                }
                                KSerializer serializer = SerializersKt.serializer(PxuCJdSBwIXG9);
                                serializer.getClass();
                                hq0.TSizfFm2Yiuu(((DetailRoute) serializer.deserialize(new sx1(PxuCJdSBwIXG10, linkedHashMap))).PxuCJdSBwIXG, lb1Var2, null, hpVar, 0);
                                gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                break;
                        }
                        return no2Var;
                    }
                }));
                th0.x50lh2ztY7Y5(fb1Var, bu1.PxuCJdSBwIXG(RatedRoute.class), new on(1316320640, true, new re0() { // from class: hb1
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
                    
                        if (r8 == defpackage.fp.lS5Rgt96tfkO) goto L25;
                     */
                    @Override // defpackage.re0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object r3s1LDPKFs1S(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i92 = i4;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        lb1 lb1Var2 = lb1Var;
                        x91 x91Var = (x91) obj3;
                        hp hpVar = (hp) obj4;
                        ((Integer) obj5).getClass();
                        ((s7) obj2).getClass();
                        x91Var.getClass();
                        gg1 gg1Var = mp.PxuCJdSBwIXG;
                        switch (i92) {
                            case 0:
                                tf0 tf0Var = (tf0) hpVar;
                                boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(lb1Var2);
                                Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                                if (!rtx2ld2ELZv4) {
                                    hp.Companion.getClass();
                                    break;
                                }
                                nLZGh9p8gVSu = new dz(lb1Var2, 3);
                                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                                qv0.Y1f8riQaR6yg((ae0) nLZGh9p8gVSu, null, tf0Var, 0);
                                break;
                            case 1:
                                bs0.TSizfFm2Yiuu(lb1Var2, null, hpVar, 0);
                                break;
                            case 2:
                                bs0.Y1f8riQaR6yg(lb1Var2, null, hpVar, 0);
                                break;
                            case 3:
                                cs0.e9gEMXR7LXtO(lb1Var2, null, hpVar, 0);
                                break;
                            case 4:
                                ov2.RAsUl2FVSrh6(lb1Var2, null, hpVar, 0);
                                break;
                            default:
                                ck PxuCJdSBwIXG9 = bu1.PxuCJdSBwIXG(DetailRoute.class);
                                Bundle PxuCJdSBwIXG10 = x91Var.QrzZRwfaDlRX.PxuCJdSBwIXG();
                                if (PxuCJdSBwIXG10 == null) {
                                    PxuCJdSBwIXG10 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                                }
                                Map TSizfFm2Yiuu2 = x91Var.OPXfSBeufaJ8.TSizfFm2Yiuu();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w41.i68hK7ahKtgp(TSizfFm2Yiuu2.size()));
                                for (Map.Entry entry2 : TSizfFm2Yiuu2.entrySet()) {
                                    linkedHashMap.put(entry2.getKey(), ((v91) entry2.getValue()).PxuCJdSBwIXG);
                                }
                                KSerializer serializer = SerializersKt.serializer(PxuCJdSBwIXG9);
                                serializer.getClass();
                                hq0.TSizfFm2Yiuu(((DetailRoute) serializer.deserialize(new sx1(PxuCJdSBwIXG10, linkedHashMap))).PxuCJdSBwIXG, lb1Var2, null, hpVar, 0);
                                gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                break;
                        }
                        return no2Var;
                    }
                }));
                th0.x50lh2ztY7Y5(fb1Var, bu1.PxuCJdSBwIXG(GameRoute.class), new on(1565599041, true, new re0() { // from class: hb1
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
                    
                        if (r8 == defpackage.fp.lS5Rgt96tfkO) goto L25;
                     */
                    @Override // defpackage.re0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object r3s1LDPKFs1S(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i92 = i3;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        lb1 lb1Var2 = lb1Var;
                        x91 x91Var = (x91) obj3;
                        hp hpVar = (hp) obj4;
                        ((Integer) obj5).getClass();
                        ((s7) obj2).getClass();
                        x91Var.getClass();
                        gg1 gg1Var = mp.PxuCJdSBwIXG;
                        switch (i92) {
                            case 0:
                                tf0 tf0Var = (tf0) hpVar;
                                boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(lb1Var2);
                                Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                                if (!rtx2ld2ELZv4) {
                                    hp.Companion.getClass();
                                    break;
                                }
                                nLZGh9p8gVSu = new dz(lb1Var2, 3);
                                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                                qv0.Y1f8riQaR6yg((ae0) nLZGh9p8gVSu, null, tf0Var, 0);
                                break;
                            case 1:
                                bs0.TSizfFm2Yiuu(lb1Var2, null, hpVar, 0);
                                break;
                            case 2:
                                bs0.Y1f8riQaR6yg(lb1Var2, null, hpVar, 0);
                                break;
                            case 3:
                                cs0.e9gEMXR7LXtO(lb1Var2, null, hpVar, 0);
                                break;
                            case 4:
                                ov2.RAsUl2FVSrh6(lb1Var2, null, hpVar, 0);
                                break;
                            default:
                                ck PxuCJdSBwIXG9 = bu1.PxuCJdSBwIXG(DetailRoute.class);
                                Bundle PxuCJdSBwIXG10 = x91Var.QrzZRwfaDlRX.PxuCJdSBwIXG();
                                if (PxuCJdSBwIXG10 == null) {
                                    PxuCJdSBwIXG10 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                                }
                                Map TSizfFm2Yiuu2 = x91Var.OPXfSBeufaJ8.TSizfFm2Yiuu();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w41.i68hK7ahKtgp(TSizfFm2Yiuu2.size()));
                                for (Map.Entry entry2 : TSizfFm2Yiuu2.entrySet()) {
                                    linkedHashMap.put(entry2.getKey(), ((v91) entry2.getValue()).PxuCJdSBwIXG);
                                }
                                KSerializer serializer = SerializersKt.serializer(PxuCJdSBwIXG9);
                                serializer.getClass();
                                hq0.TSizfFm2Yiuu(((DetailRoute) serializer.deserialize(new sx1(PxuCJdSBwIXG10, linkedHashMap))).PxuCJdSBwIXG, lb1Var2, null, hpVar, 0);
                                gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                break;
                        }
                        return no2Var;
                    }
                }));
                final int i10 = 5;
                th0.x50lh2ztY7Y5(fb1Var, bu1.PxuCJdSBwIXG(DetailRoute.class), new on(1814877442, true, new re0() { // from class: hb1
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
                    
                        if (r8 == defpackage.fp.lS5Rgt96tfkO) goto L25;
                     */
                    @Override // defpackage.re0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object r3s1LDPKFs1S(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i92 = i10;
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        lb1 lb1Var2 = lb1Var;
                        x91 x91Var = (x91) obj3;
                        hp hpVar = (hp) obj4;
                        ((Integer) obj5).getClass();
                        ((s7) obj2).getClass();
                        x91Var.getClass();
                        gg1 gg1Var = mp.PxuCJdSBwIXG;
                        switch (i92) {
                            case 0:
                                tf0 tf0Var = (tf0) hpVar;
                                boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(lb1Var2);
                                Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                                if (!rtx2ld2ELZv4) {
                                    hp.Companion.getClass();
                                    break;
                                }
                                nLZGh9p8gVSu = new dz(lb1Var2, 3);
                                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                                qv0.Y1f8riQaR6yg((ae0) nLZGh9p8gVSu, null, tf0Var, 0);
                                break;
                            case 1:
                                bs0.TSizfFm2Yiuu(lb1Var2, null, hpVar, 0);
                                break;
                            case 2:
                                bs0.Y1f8riQaR6yg(lb1Var2, null, hpVar, 0);
                                break;
                            case 3:
                                cs0.e9gEMXR7LXtO(lb1Var2, null, hpVar, 0);
                                break;
                            case 4:
                                ov2.RAsUl2FVSrh6(lb1Var2, null, hpVar, 0);
                                break;
                            default:
                                ck PxuCJdSBwIXG9 = bu1.PxuCJdSBwIXG(DetailRoute.class);
                                Bundle PxuCJdSBwIXG10 = x91Var.QrzZRwfaDlRX.PxuCJdSBwIXG();
                                if (PxuCJdSBwIXG10 == null) {
                                    PxuCJdSBwIXG10 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                                }
                                Map TSizfFm2Yiuu2 = x91Var.OPXfSBeufaJ8.TSizfFm2Yiuu();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(w41.i68hK7ahKtgp(TSizfFm2Yiuu2.size()));
                                for (Map.Entry entry2 : TSizfFm2Yiuu2.entrySet()) {
                                    linkedHashMap.put(entry2.getKey(), ((v91) entry2.getValue()).PxuCJdSBwIXG);
                                }
                                KSerializer serializer = SerializersKt.serializer(PxuCJdSBwIXG9);
                                serializer.getClass();
                                hq0.TSizfFm2Yiuu(((DetailRoute) serializer.deserialize(new sx1(PxuCJdSBwIXG10, linkedHashMap))).PxuCJdSBwIXG, lb1Var2, null, hpVar, 0);
                                gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                break;
                        }
                        return no2Var;
                    }
                }));
                return no2.PxuCJdSBwIXG;
            case 22:
                Bundle bundle2 = (Bundle) obj;
                lb1 QrzZRwfaDlRX = ni0.QrzZRwfaDlRX((Context) this.OPXfSBeufaJ8);
                if (bundle2 != null) {
                    bundle2.setClassLoader(QrzZRwfaDlRX.PxuCJdSBwIXG.getClassLoader());
                }
                la1 la1Var = QrzZRwfaDlRX.lS5Rgt96tfkO;
                LinkedHashMap linkedHashMap = la1Var.cpQdD2nAriOS;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            xi0.ryVscX7ZL4Ux("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    la1Var.Y1f8riQaR6yg = bundle;
                    la1Var.e9gEMXR7LXtO = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) vi0.e6tOsSdd2EFb("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            xi0.ryVscX7ZL4Ux("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            xi0.ryVscX7ZL4Ux("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            int i13 = i12 + 1;
                            Throwable th4 = th2;
                            la1Var.x50lh2ztY7Y5.put(Integer.valueOf(intArray[i11]), !cs0.wdg6QnbFHrFF(stringArrayList.get(i12), "") ? (String) stringArrayList.get(i12) : th4);
                            i11++;
                            i12 = i13;
                            th2 = th4;
                        }
                    }
                    th = th2;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            xi0.ryVscX7ZL4Ux("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                        int size = stringArrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            String str3 = stringArrayList2.get(i14);
                            i14++;
                            String str4 = str3;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str4)) {
                                ArrayList e6tOsSdd2EFb = vi0.e6tOsSdd2EFb("android-support-nav:controller:backStackStates:" + str4, bundle2);
                                da daVar = new da(e6tOsSdd2EFb.size());
                                int size2 = e6tOsSdd2EFb.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    Object obj2 = e6tOsSdd2EFb.get(i15);
                                    i15++;
                                    daVar.addLast(new aa1((Bundle) obj2));
                                }
                                linkedHashMap.put(str4, daVar);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z6 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z6 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z6) : th;
                    QrzZRwfaDlRX.e9gEMXR7LXtO = valueOf != 0 ? valueOf.booleanValue() : false;
                }
                return QrzZRwfaDlRX;
            case 23:
                tc1 tc1Var = (tc1) this.OPXfSBeufaJ8;
                x91 x91Var = (x91) obj;
                x91Var.getClass();
                z91 z91Var = x91Var.QrzZRwfaDlRX;
                za1 za1Var = x91Var.OPXfSBeufaJ8;
                if (za1Var == null) {
                    za1Var = null;
                }
                if (za1Var == null) {
                    return null;
                }
                z91Var.PxuCJdSBwIXG();
                za1 TSizfFm2Yiuu2 = tc1Var.TSizfFm2Yiuu(za1Var);
                if (TSizfFm2Yiuu2 == null) {
                    return null;
                }
                return TSizfFm2Yiuu2.equals(za1Var) ? x91Var : tc1Var.lS5Rgt96tfkO().lS5Rgt96tfkO(TSizfFm2Yiuu2, TSizfFm2Yiuu2.PxuCJdSBwIXG(z91Var.PxuCJdSBwIXG()));
            case 24:
                re1 re1Var = (re1) this.OPXfSBeufaJ8;
                dk dkVar = (dk) obj;
                dkVar.getClass();
                List list = re1Var.lS5Rgt96tfkO;
                list.getClass();
                dkVar.lS5Rgt96tfkO = list;
                return no2.PxuCJdSBwIXG;
            case 25:
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.OPXfSBeufaJ8;
                int intValue = ((Integer) obj).intValue();
                return serialDescriptor.e9gEMXR7LXtO(intValue) + ": " + serialDescriptor.wdg6QnbFHrFF(intValue).lS5Rgt96tfkO();
            case 26:
                ko1 ko1Var = (ko1) this.OPXfSBeufaJ8;
                dk dkVar2 = (dk) obj;
                dkVar2.getClass();
                dk.PxuCJdSBwIXG(dkVar2, "type", BuiltinSerializersKt.serializer(fa2.PxuCJdSBwIXG).getDescriptor());
                dk.PxuCJdSBwIXG(dkVar2, "value", kj0.cpQdD2nAriOS("kotlinx.serialization.Polymorphic<" + ((ck) ko1Var.PxuCJdSBwIXG).TSizfFm2Yiuu() + '>', e42.e9gEMXR7LXtO, new SerialDescriptor[0]));
                dkVar2.lS5Rgt96tfkO = p50.rtx2ld2ELZv4;
                return no2.PxuCJdSBwIXG;
            case 27:
                ((zp) this.OPXfSBeufaJ8).pnx5pC0XzaCw(obj);
                return no2.PxuCJdSBwIXG;
            case 28:
                ht1 ht1Var = (ht1) this.OPXfSBeufaJ8;
                Throwable th5 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th5);
                synchronized (ht1Var.TSizfFm2Yiuu) {
                    try {
                        xs0 xs0Var = ht1Var.Y1f8riQaR6yg;
                        if (xs0Var != null) {
                            l92 l92Var2 = ht1Var.S9EYkSpbGuxq;
                            dt1 dt1Var = dt1.OPXfSBeufaJ8;
                            l92Var2.getClass();
                            l92Var2.OPXfSBeufaJ8(null, dt1Var);
                            xs0Var.a92UlCVFR9N8(cancellationException);
                            ht1Var.XL4ISE6Oc65B = null;
                            xs0Var.aF05bpZJlKEP(new e9gEMXR7LXtO(27, ht1Var, th5));
                        } else {
                            ht1Var.e9gEMXR7LXtO = cancellationException;
                            l92 l92Var3 = ht1Var.S9EYkSpbGuxq;
                            dt1 dt1Var2 = dt1.rtx2ld2ELZv4;
                            l92Var3.getClass();
                            l92Var3.OPXfSBeufaJ8(null, dt1Var2);
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return no2.PxuCJdSBwIXG;
            default:
                ((lt1) this.OPXfSBeufaJ8).PxuCJdSBwIXG((m40) obj);
                return no2.PxuCJdSBwIXG;
        }
    }

    public /* synthetic */ r3s1LDPKFs1S(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }
}
