package W0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class a {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int i2 = iconCompat.f5229a;
        String str = null;
        r1 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return (Icon) iconCompat.f5230b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f5230b);
                break;
            case 2:
                if (i2 == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f5230b;
                    if (i4 >= 28) {
                        str = c.b(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                        } catch (NoSuchMethodException e5) {
                            Log.e("IconCompat", "Unable to get icon package", e5);
                        } catch (InvocationTargetException e6) {
                            Log.e("IconCompat", "Unable to get icon package", e6);
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str2 = iconCompat.f5238j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f5230b).split(":", -1)[0] : iconCompat.f5238j;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f5233e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f5230b, iconCompat.f5233e, iconCompat.f5234f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f5230b);
                break;
            case 5:
                createWithBitmap = b.b((Bitmap) iconCompat.f5230b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = d.a(iconCompat.c());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.c());
                    }
                    Uri c4 = iconCompat.c();
                    String scheme = c4.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(c4);
                        } catch (Exception e7) {
                            Log.w("IconCompat", "Unable to load image from URI: " + c4, e7);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f5230b));
                        } catch (FileNotFoundException e8) {
                            Log.w("IconCompat", "Unable to load image from path: " + c4, e8);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.c());
                    }
                    createWithBitmap = b.b(BitmapFactory.decodeStream(openInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.f5235g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f5236h;
        if (mode != IconCompat.f5228k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
