package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j4 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final Object TSizfFm2Yiuu;
    public Object Y1f8riQaR6yg;
    public Object e9gEMXR7LXtO;
    public int lS5Rgt96tfkO;

    public j4(lt0 lt0Var) {
        this.PxuCJdSBwIXG = 1;
        this.TSizfFm2Yiuu = lt0Var;
        this.Y1f8riQaR6yg = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.e9gEMXR7LXtO = iArr;
        this.lS5Rgt96tfkO = -1;
    }

    public void OPXfSBeufaJ8(jl jlVar) {
        this.e9gEMXR7LXtO = jlVar;
        ((Paint) this.TSizfFm2Yiuu).setColorFilter(jlVar != null ? jlVar.PxuCJdSBwIXG : null);
    }

    public int PxuCJdSBwIXG() {
        if (((Paint) this.TSizfFm2Yiuu).isFilterBitmap()) {
            b80.Companion.getClass();
            return 1;
        }
        b80.Companion.getClass();
        return 0;
    }

    public void QrzZRwfaDlRX(int i) {
        Paint paint = (Paint) this.TSizfFm2Yiuu;
        ui1.Companion.getClass();
        paint.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void RAsUl2FVSrh6(int i) {
        if (this.lS5Rgt96tfkO == i) {
            return;
        }
        this.lS5Rgt96tfkO = i;
        Paint paint = (Paint) this.TSizfFm2Yiuu;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(cs0.J54yh1s3n4Aq(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(cs0.xfACYKDMU6Dj(i)));
        }
    }

    public int TSizfFm2Yiuu() {
        Paint.Cap strokeCap = ((Paint) this.TSizfFm2Yiuu).getStrokeCap();
        int i = strokeCap == null ? -1 : k4.PxuCJdSBwIXG[strokeCap.ordinal()];
        if (i == 1) {
            ta2.Companion.getClass();
            return 0;
        }
        if (i == 2) {
            ta2.Companion.getClass();
            return 1;
        }
        if (i != 3) {
            ta2.Companion.getClass();
            return 0;
        }
        ta2.Companion.getClass();
        return 2;
    }

    public int Y1f8riQaR6yg() {
        Paint.Join strokeJoin = ((Paint) this.TSizfFm2Yiuu).getStrokeJoin();
        int i = strokeJoin == null ? -1 : k4.lS5Rgt96tfkO[strokeJoin.ordinal()];
        if (i == 1) {
            va2.Companion.getClass();
            return 0;
        }
        if (i == 2) {
            va2.Companion.getClass();
            return 2;
        }
        if (i != 3) {
            va2.Companion.getClass();
            return 0;
        }
        va2.Companion.getClass();
        return 1;
    }

    public void a92UlCVFR9N8(float f) {
        ((Paint) this.TSizfFm2Yiuu).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void cpQdD2nAriOS(int i) {
        Paint paint = (Paint) this.TSizfFm2Yiuu;
        va2.Companion.getClass();
        paint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void dgRBjINgWbAK(Shader shader) {
        this.Y1f8riQaR6yg = shader;
        ((Paint) this.TSizfFm2Yiuu).setShader(shader);
    }

    public void e9gEMXR7LXtO() {
        int i = this.lS5Rgt96tfkO * 2;
        this.Y1f8riQaR6yg = Arrays.copyOf((Object[]) this.Y1f8riQaR6yg, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        na.rxipThha848g((int[]) this.e9gEMXR7LXtO, iArr, 0, 0, 14);
        this.e9gEMXR7LXtO = iArr;
    }

    public String lS5Rgt96tfkO() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.lS5Rgt96tfkO + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.Y1f8riQaR6yg)[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(serialDescriptor.TSizfFm2Yiuu(), wa2.a92UlCVFR9N8);
                int[] iArr = (int[]) this.e9gEMXR7LXtO;
                if (!wdg6QnbFHrFF) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.e9gEMXR7LXtO(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.e9gEMXR7LXtO)[i2]);
                    sb.append("]");
                }
            } else if (obj == jx1.BRwzKIf41E4i) {
                sb.append("[<debug info disabled>]");
            } else if (obj != ih0.XL4ISE6Oc65B) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void r3s1LDPKFs1S(float f) {
        ((Paint) this.TSizfFm2Yiuu).setStrokeWidth(f);
    }

    public void rtx2ld2ELZv4(long j) {
        ((Paint) this.TSizfFm2Yiuu).setColor(mm2.ngxnMNrpiKat(j));
    }

    public String toString() {
        switch (this.PxuCJdSBwIXG) {
            case 1:
                return lS5Rgt96tfkO();
            default:
                return super.toString();
        }
    }

    public void wdg6QnbFHrFF(int i) {
        Paint paint = (Paint) this.TSizfFm2Yiuu;
        b80.Companion.getClass();
        paint.setFilterBitmap(!(i == 0));
    }

    public void x50lh2ztY7Y5(int i) {
        Paint paint = (Paint) this.TSizfFm2Yiuu;
        ta2.Companion.getClass();
        paint.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public j4(Paint paint) {
        this.PxuCJdSBwIXG = 0;
        this.TSizfFm2Yiuu = paint;
        sd.Companion.getClass();
        this.lS5Rgt96tfkO = 3;
    }
}
