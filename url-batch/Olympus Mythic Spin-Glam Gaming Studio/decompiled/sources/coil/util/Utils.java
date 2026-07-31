package coil.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.EventListener;
import coil.base.R$id;
import coil.decode.DataSource;
import coil.disk.DiskCache;
import coil.intercept.Interceptor;
import coil.intercept.RealInterceptorChain;
import coil.request.Parameters;
import coil.request.Tags;
import coil.request.ViewTargetRequestManager;
import coil.size.Dimension;
import coil.size.Scale;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;

/* compiled from: Utils.kt */
/* renamed from: coil.util.-Utils, reason: invalid class name */
/* loaded from: classes14.dex */
public abstract class Utils {
    private static final Bitmap.Config DEFAULT_BITMAP_CONFIG;
    private static final Headers EMPTY_HEADERS;
    private static final Bitmap.Config[] VALID_TRANSFORMATION_CONFIGS;

    /* compiled from: Utils.kt */
    /* renamed from: coil.util.-Utils$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DataSource.values().length];
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            iArr[DataSource.MEMORY.ordinal()] = 2;
            iArr[DataSource.DISK.ordinal()] = 3;
            iArr[DataSource.NETWORK.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            iArr3[Scale.FILL.ordinal()] = 1;
            iArr3[Scale.FIT.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final boolean isMinOrMax(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final int calculateMemoryCacheSize(Context context, double d) {
        int i;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            i = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i = 256;
        }
        double d2 = 1024;
        return (int) (d * i * d2 * d2);
    }

    public static final double defaultMemoryCacheSizePercent(Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final ViewTargetRequestManager getRequestManager(View view) {
        Object tag = view.getTag(R$id.coil_request_manager);
        ViewTargetRequestManager viewTargetRequestManager = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(R$id.coil_request_manager);
                    ViewTargetRequestManager viewTargetRequestManager2 = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                    if (viewTargetRequestManager2 != null) {
                        viewTargetRequestManager = viewTargetRequestManager2;
                    } else {
                        viewTargetRequestManager = new ViewTargetRequestManager(view);
                        view.addOnAttachStateChangeListener(viewTargetRequestManager);
                        view.setTag(R$id.coil_request_manager, viewTargetRequestManager);
                    }
                } finally {
                }
            }
        }
        return viewTargetRequestManager;
    }

    public static final int toPx(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).px;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getWidth(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final int getHeight(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final boolean isVector(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    public static final void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final Scale getScale(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[scaleType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return Scale.FIT;
        }
        return Scale.FILL;
    }

    public static final String getMimeTypeFromUrl(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.substringAfterLast(StringsKt.substringAfterLast$default(StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final String getFirstPathSegment(Uri uri) {
        return (String) CollectionsKt.firstOrNull((List) uri.getPathSegments());
    }

    public static final int getNightMode(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        VALID_TRANSFORMATION_CONFIGS = configArr;
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        DEFAULT_BITMAP_CONFIG = config;
        EMPTY_HEADERS = new Headers.Builder().build();
    }

    public static final Bitmap.Config[] getVALID_TRANSFORMATION_CONFIGS() {
        return VALID_TRANSFORMATION_CONFIGS;
    }

    public static final Bitmap.Config getDEFAULT_BITMAP_CONFIG() {
        return DEFAULT_BITMAP_CONFIG;
    }

    public static final Headers orEmpty(Headers headers) {
        return headers == null ? EMPTY_HEADERS : headers;
    }

    public static final Tags orEmpty(Tags tags) {
        return tags == null ? Tags.EMPTY : tags;
    }

    public static final Parameters orEmpty(Parameters parameters) {
        return parameters == null ? Parameters.EMPTY : parameters;
    }

    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final File getSafeCacheDir(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final int toNonNegativeInt(String str, int i) {
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull == null) {
            return i;
        }
        long longValue = longOrNull.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final void abortQuietly(DiskCache.Editor editor) {
        try {
            editor.abort();
        } catch (Exception unused) {
        }
    }

    public static final boolean isPlaceholderCached(Interceptor.Chain chain) {
        return (chain instanceof RealInterceptorChain) && ((RealInterceptorChain) chain).isPlaceholderCached();
    }

    public static final EventListener getEventListener(Interceptor.Chain chain) {
        return chain instanceof RealInterceptorChain ? ((RealInterceptorChain) chain).getEventListener() : EventListener.NONE;
    }

    public static final boolean isAssetUri(Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), "file") && Intrinsics.areEqual(getFirstPathSegment(uri), "android_asset");
    }

    public static final Headers.Builder addUnsafeNonAscii(Headers.Builder builder, String str) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String substring = str.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String obj = StringsKt.trim(substring).toString();
        String substring2 = str.substring(indexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        builder.addUnsafeNonAscii(obj, substring2);
        return builder;
    }
}
