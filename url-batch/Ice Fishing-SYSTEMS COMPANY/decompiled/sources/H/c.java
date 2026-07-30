package H;

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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class c {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        } catch (NoSuchMethodException e9) {
            Log.e("IconCompat", "Unable to get icon uri", e9);
            return null;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int i = iconCompat.f4804a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.f4805b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f4805b);
                break;
            case 2:
                if (i == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f4805b;
                    if (i4 >= 28) {
                        str = e.b(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException e6) {
                            Log.e("IconCompat", "Unable to get icon package", e6);
                        } catch (NoSuchMethodException e9) {
                            Log.e("IconCompat", "Unable to get icon package", e9);
                        } catch (InvocationTargetException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str2 = iconCompat.f4812j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f4805b).split(":", -1)[0] : iconCompat.f4812j;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f4808e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f4805b, iconCompat.f4808e, iconCompat.f4809f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f4805b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f4805b, false));
                    break;
                } else {
                    createWithBitmap = d.b((Bitmap) iconCompat.f4805b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = f.a(iconCompat.e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.e());
                    }
                    Uri e11 = iconCompat.e();
                    String scheme = e11.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(e11);
                        } catch (Exception e12) {
                            Log.w("IconCompat", "Unable to load image from URI: " + e11, e12);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f4805b));
                        } catch (FileNotFoundException e13) {
                            Log.w("IconCompat", "Unable to load image from path: " + e11, e13);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = d.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.f4810g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f4811h;
        if (mode != IconCompat.f4803k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
