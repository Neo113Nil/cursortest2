package defpackage;

import java.io.IOException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class u9 implements di, f10, z30, q52 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ u9(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    public static /* synthetic */ void BRwzKIf41E4i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void EcgxDIVH5in8(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void OPXfSBeufaJ8(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    public static /* synthetic */ void QrzZRwfaDlRX(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void RAsUl2FVSrh6(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void RfyTYNmI9Srp() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void S2OOm9zPNm0h(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void S9EYkSpbGuxq(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void VhhvGxCb8gfr() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void XL4ISE6Oc65B(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void Y1f8riQaR6yg() {
        throw new tm();
    }

    public static /* synthetic */ void a92UlCVFR9N8(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void cpQdD2nAriOS(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void dgRBjINgWbAK(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void e9gEMXR7LXtO(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void gPXPFXrUH4XX() {
        throw new tm();
    }

    public static /* synthetic */ void r3s1LDPKFs1S(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void rtx2ld2ELZv4(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void wdg6QnbFHrFF(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void x50lh2ztY7Y5(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    @Override // defpackage.q52
    public boolean PxuCJdSBwIXG() {
        return false;
    }

    @Override // defpackage.f10
    public double TSizfFm2Yiuu(double d) {
        switch (this.rtx2ld2ELZv4) {
            case 7:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 8:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 9:
                float[] fArr = wl.PxuCJdSBwIXG;
                return wl.lS5Rgt96tfkO(wl.TSizfFm2Yiuu, d);
            case 10:
                float[] fArr2 = wl.PxuCJdSBwIXG;
                return wl.PxuCJdSBwIXG(wl.TSizfFm2Yiuu, d);
            case 11:
                float[] fArr3 = wl.PxuCJdSBwIXG;
                return wl.Y1f8riQaR6yg(wl.Y1f8riQaR6yg, d);
            default:
                float[] fArr4 = wl.PxuCJdSBwIXG;
                return wl.TSizfFm2Yiuu(wl.Y1f8riQaR6yg, d);
        }
    }

    @Override // defpackage.di
    public void cancel() {
    }

    @Override // defpackage.z30
    public float lS5Rgt96tfkO(float f) {
        return f;
    }
}
