package x;

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
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0724b {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (InvocationTargetException e8) {
            Log.e("IconCompat", "Unable to get icon uri", e8);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int i7 = iconCompat.f3407a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i7) {
            case -1:
                return (Icon) iconCompat.f3408b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3408b);
                break;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                if (i7 == -1) {
                    int i8 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f3408b;
                    if (i8 >= 28) {
                        str = d.b(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                        } catch (NoSuchMethodException e7) {
                            Log.e("IconCompat", "Unable to get icon package", e7);
                        } catch (InvocationTargetException e8) {
                            Log.e("IconCompat", "Unable to get icon package", e8);
                        }
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str2 = iconCompat.f3416j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f3408b).split(":", -1)[0] : iconCompat.f3416j;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f3411e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f3408b, iconCompat.f3411e, iconCompat.f3412f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f3408b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f3408b, false));
                    break;
                } else {
                    createWithBitmap = c.b((Bitmap) iconCompat.f3408b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = e.a(iconCompat.e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.e());
                    }
                    Uri e9 = iconCompat.e();
                    String scheme = e9.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(e9);
                        } catch (Exception e10) {
                            Log.w("IconCompat", "Unable to load image from URI: " + e9, e10);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f3408b));
                        } catch (FileNotFoundException e11) {
                            Log.w("IconCompat", "Unable to load image from path: " + e9, e11);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = c.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.f3413g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f3414h;
        if (mode != IconCompat.f3406k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
