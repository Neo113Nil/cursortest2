package w;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import cn.hutool.core.io.file.c;
import com.airbnb.lottie.j0;
import com.airbnb.lottie.utils.f;
import com.airbnb.lottie.utils.j;
import com.baidu.location.BDLocation;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    private static final Object bitmapHashLock = new Object();
    private final Context context;

    @Nullable
    private com.airbnb.lottie.b delegate;
    private final Map<String, j0> imageAssets;
    private final String imagesFolder;

    public b(Drawable.Callback callback, String str, com.airbnb.lottie.b bVar, Map<String, j0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.imagesFolder = str;
        } else {
            this.imagesFolder = str + c.UNIX_SEPARATOR;
        }
        if (callback instanceof View) {
            this.context = ((View) callback).getContext();
            this.imageAssets = map;
            setDelegate(bVar);
        } else {
            f.warning("LottieDrawable must be inside of a view for images to work.");
            this.imageAssets = new HashMap();
            this.context = null;
        }
    }

    private Bitmap putBitmap(String str, @Nullable Bitmap bitmap) {
        synchronized (bitmapHashLock) {
            this.imageAssets.get(str).setBitmap(bitmap);
        }
        return bitmap;
    }

    @Nullable
    public Bitmap bitmapForId(String str) {
        j0 j0Var = this.imageAssets.get(str);
        if (j0Var == null) {
            return null;
        }
        Bitmap bitmap = j0Var.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        String fileName = j0Var.getFileName();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = BDLocation.TypeCoarseLocation;
        if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                return putBitmap(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e8) {
                f.warning("data URL did not have correct base64 format.", e8);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.imagesFolder)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                return putBitmap(str, j.resizeBitmapIfNeeded(BitmapFactory.decodeStream(this.context.getAssets().open(this.imagesFolder + fileName), null, options), j0Var.getWidth(), j0Var.getHeight()));
            } catch (IllegalArgumentException e9) {
                f.warning("Unable to decode image.", e9);
                return null;
            }
        } catch (IOException e10) {
            f.warning("Unable to open asset.", e10);
            return null;
        }
    }

    @Nullable
    public j0 getImageAssetById(String str) {
        return this.imageAssets.get(str);
    }

    public boolean hasSameContext(Context context) {
        return (context == null && this.context == null) || this.context.equals(context);
    }

    public void setDelegate(@Nullable com.airbnb.lottie.b bVar) {
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmap2 = this.imageAssets.get(str).getBitmap();
            putBitmap(str, bitmap);
            return bitmap2;
        }
        j0 j0Var = this.imageAssets.get(str);
        Bitmap bitmap3 = j0Var.getBitmap();
        j0Var.setBitmap(null);
        return bitmap3;
    }
}
