package androidx.core.graphics.drawable;

import a4.i;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import j3.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f613k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f615b;

    /* renamed from: j, reason: collision with root package name */
    public String f622j;

    /* renamed from: a, reason: collision with root package name */
    public int f614a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f616c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f617d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f618e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f619f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f620g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f621h = f613k;
    public String i = null;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        int i;
        if (this.f614a == -1) {
            return String.valueOf(this.f615b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f614a) {
            case 1:
                str = "BITMAP";
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
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
        switch (this.f614a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f615b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f615b).getHeight());
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f622j);
                sb.append(" id=");
                int i8 = this.f614a;
                if (i8 == -1) {
                    int i9 = Build.VERSION.SDK_INT;
                    Object obj = this.f615b;
                    if (i9 >= 28) {
                        i = a.d(obj);
                    } else {
                        try {
                            i = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e8) {
                            Log.e("IconCompat", "Unable to get icon resource", e8);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.f620g != null) {
                            }
                            if (this.f621h != f613k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (NoSuchMethodException e9) {
                            Log.e("IconCompat", "Unable to get icon resource", e9);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.f620g != null) {
                            }
                            if (this.f621h != f613k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        } catch (InvocationTargetException e10) {
                            Log.e("IconCompat", "Unable to get icon resource", e10);
                            i = 0;
                            sb.append(String.format("0x%08x", Integer.valueOf(i)));
                            if (this.f620g != null) {
                            }
                            if (this.f621h != f613k) {
                            }
                            sb.append(")");
                            return sb.toString();
                        }
                    }
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i = this.f618e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i)));
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f618e);
                if (this.f619f != 0) {
                    sb.append(" off=");
                    sb.append(this.f619f);
                    break;
                }
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                sb.append(" uri=");
                sb.append(this.f615b);
                break;
        }
        if (this.f620g != null) {
            sb.append(" tint=");
            sb.append(this.f620g);
        }
        if (this.f621h != f613k) {
            sb.append(" mode=");
            sb.append(this.f621h);
        }
        sb.append(")");
        return sb.toString();
    }
}
