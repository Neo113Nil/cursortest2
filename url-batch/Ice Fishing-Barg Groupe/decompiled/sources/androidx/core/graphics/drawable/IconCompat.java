package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.k00;
import defpackage.u9;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode dgRBjINgWbAK = PorterDuff.Mode.SRC_IN;
    public String OPXfSBeufaJ8;
    public int PxuCJdSBwIXG;
    public ColorStateList RAsUl2FVSrh6;
    public byte[] TSizfFm2Yiuu;
    public Parcelable Y1f8riQaR6yg;
    public int a92UlCVFR9N8;
    public int e9gEMXR7LXtO;
    public Object lS5Rgt96tfkO;
    public PorterDuff.Mode rtx2ld2ELZv4;
    public String wdg6QnbFHrFF;

    public static IconCompat PxuCJdSBwIXG(int i) {
        if (i == 0) {
            u9.XL4ISE6Oc65B("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.TSizfFm2Yiuu = null;
        iconCompat.Y1f8riQaR6yg = null;
        iconCompat.a92UlCVFR9N8 = 0;
        iconCompat.RAsUl2FVSrh6 = null;
        iconCompat.rtx2ld2ELZv4 = dgRBjINgWbAK;
        iconCompat.OPXfSBeufaJ8 = null;
        iconCompat.PxuCJdSBwIXG = 2;
        iconCompat.e9gEMXR7LXtO = i;
        iconCompat.lS5Rgt96tfkO = "";
        iconCompat.wdg6QnbFHrFF = "";
        return iconCompat;
    }

    public final Uri TSizfFm2Yiuu() {
        int i = this.PxuCJdSBwIXG;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.lS5Rgt96tfkO);
            }
            u9.EcgxDIVH5in8(this, "called getUri() on ");
            return null;
        }
        Object obj = this.lS5Rgt96tfkO;
        if (Build.VERSION.SDK_INT >= 28) {
            return k00.wdg6QnbFHrFF(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public final int lS5Rgt96tfkO() {
        int i = this.PxuCJdSBwIXG;
        if (i != -1) {
            if (i == 2) {
                return this.e9gEMXR7LXtO;
            }
            u9.EcgxDIVH5in8(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.lS5Rgt96tfkO;
        if (Build.VERSION.SDK_INT >= 28) {
            return k00.TSizfFm2Yiuu(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public final String toString() {
        String str;
        if (this.PxuCJdSBwIXG == -1) {
            return String.valueOf(this.lS5Rgt96tfkO);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.PxuCJdSBwIXG) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.PxuCJdSBwIXG) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.lS5Rgt96tfkO).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.lS5Rgt96tfkO).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.wdg6QnbFHrFF);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(lS5Rgt96tfkO())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e9gEMXR7LXtO);
                if (this.a92UlCVFR9N8 != 0) {
                    sb.append(" off=");
                    sb.append(this.a92UlCVFR9N8);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.lS5Rgt96tfkO);
                break;
        }
        if (this.RAsUl2FVSrh6 != null) {
            sb.append(" tint=");
            sb.append(this.RAsUl2FVSrh6);
        }
        if (this.rtx2ld2ELZv4 != dgRBjINgWbAK) {
            sb.append(" mode=");
            sb.append(this.rtx2ld2ELZv4);
        }
        sb.append(")");
        return sb.toString();
    }
}
