package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.wg;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
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
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                int i2 = this.a;
                if (i2 == -1) {
                    Object obj = this.b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = wg.c(obj);
                    } else {
                        try {
                            i = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon resource", e);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.g != null) {
                            }
                            if (this.h != k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.g != null) {
                            }
                            if (this.h != k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.g != null) {
                            }
                            if (this.h != k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i = this.e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
