package androidx.core.graphics.drawable;

import D.c;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.luckyarcade.spinthrow.GameConfig;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1154k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f1156b;

    /* renamed from: j, reason: collision with root package name */
    public String f1162j;

    /* renamed from: a, reason: collision with root package name */
    public int f1155a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1157c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1158d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1159e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1160f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1161g = null;
    public PorterDuff.Mode h = f1154k;
    public String i = null;

    public final String toString() {
        String str;
        int i;
        if (this.f1155a == -1) {
            return String.valueOf(this.f1156b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1155a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case GameConfig.COMBO_EVERY /* 3 */:
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
        switch (this.f1155a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1156b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1156b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1162j);
                sb.append(" id=");
                int i2 = this.f1155a;
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = this.f1156b;
                    if (i3 >= 28) {
                        i = c.a(obj);
                    } else {
                        i = 0;
                        try {
                            i = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i = this.f1159e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i)));
                break;
            case GameConfig.COMBO_EVERY /* 3 */:
                sb.append(" len=");
                sb.append(this.f1159e);
                if (this.f1160f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1160f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1156b);
                break;
        }
        if (this.f1161g != null) {
            sb.append(" tint=");
            sb.append(this.f1161g);
        }
        if (this.h != f1154k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
