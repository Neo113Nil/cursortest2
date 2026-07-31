package coil.util;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Contexts.kt */
/* renamed from: coil.util.-Contexts, reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class Contexts {
    public static final Drawable getDrawableCompat(Context context, int i) {
        Drawable drawable = AppCompatResources.getDrawable(context, i);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    public static final Drawable getDrawableCompat(Resources resources, int i, Resources.Theme theme) {
        Drawable drawable = ResourcesCompat.getDrawable(resources, i, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    public static final Drawable getXmlDrawableCompat(Context context, Resources resources, int i) {
        XmlResourceParser xml = resources.getXml(i);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found.");
        }
        return getDrawableCompat(resources, i, context.getTheme());
    }

    public static final Lifecycle getLifecycle(Context context) {
        Object obj = context;
        while (!(obj instanceof LifecycleOwner)) {
            if (!(obj instanceof ContextWrapper)) {
                return null;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return ((LifecycleOwner) obj).getLifecycleRegistry();
    }

    public static final boolean isPermissionGranted(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
