package com.mopub.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.support.v4.util.LruCache;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mopub.common.Constants;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.util.DeviceUtils;
import com.mopub.volley.toolbox.BaseHttpStack;
import com.mopub.volley.toolbox.BasicNetwork;
import com.mopub.volley.toolbox.DiskBasedCache;
import com.mopub.volley.toolbox.HurlStack;
import com.mopub.volley.toolbox.ImageLoader;
import java.io.File;

/* loaded from: classes2.dex */
public class Networking {

    @VisibleForTesting
    static final String CACHE_DIRECTORY_NAME = "mopub-volley-cache";
    private static volatile MaxWidthImageLoader sMaxWidthImageLoader;
    private static volatile MoPubRequestQueue sRequestQueue;
    private static HurlStack.UrlRewriter sUrlRewriter;
    private static volatile String sUserAgent;
    private static final String DEFAULT_USER_AGENT = System.getProperty("http.agent");
    private static boolean sUseHttps = false;

    public static String getScheme() {
        return Constants.HTTPS;
    }

    public static MoPubRequestQueue getRequestQueue() {
        return sRequestQueue;
    }

    public static HurlStack.UrlRewriter getUrlRewriter(Context context) {
        Preconditions.checkNotNull(context);
        if (sUrlRewriter == null) {
            sUrlRewriter = new PlayServicesUrlRewriter();
        }
        return sUrlRewriter;
    }

    public static MoPubRequestQueue getRequestQueue(Context context) {
        MoPubRequestQueue moPubRequestQueue = sRequestQueue;
        if (moPubRequestQueue == null) {
            synchronized (Networking.class) {
                moPubRequestQueue = sRequestQueue;
                if (moPubRequestQueue == null) {
                    BasicNetwork basicNetwork = new BasicNetwork((BaseHttpStack) new RequestQueueHttpStack(getUserAgent(context.getApplicationContext()), getUrlRewriter(context), CustomSSLSocketFactory.getDefault(10000)));
                    File file = new File(context.getCacheDir().getPath() + File.separator + CACHE_DIRECTORY_NAME);
                    MoPubRequestQueue moPubRequestQueue2 = new MoPubRequestQueue(new DiskBasedCache(file, (int) DeviceUtils.diskCacheSizeBytes(file, 10485760L)), basicNetwork);
                    sRequestQueue = moPubRequestQueue2;
                    moPubRequestQueue2.start();
                    moPubRequestQueue = moPubRequestQueue2;
                }
            }
        }
        return moPubRequestQueue;
    }

    public static ImageLoader getImageLoader(Context context) {
        MaxWidthImageLoader maxWidthImageLoader = sMaxWidthImageLoader;
        if (maxWidthImageLoader == null) {
            synchronized (Networking.class) {
                maxWidthImageLoader = sMaxWidthImageLoader;
                if (maxWidthImageLoader == null) {
                    MoPubRequestQueue requestQueue = getRequestQueue(context);
                    final LruCache<String, Bitmap> lruCache = new LruCache<String, Bitmap>(DeviceUtils.memoryCacheSizeBytes(context)) { // from class: com.mopub.network.Networking.1
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // android.support.v4.util.LruCache
                        public int sizeOf(String str, Bitmap bitmap) {
                            if (bitmap != null) {
                                return bitmap.getRowBytes() * bitmap.getHeight();
                            }
                            return super.sizeOf((AnonymousClass1) str, (String) bitmap);
                        }
                    };
                    MaxWidthImageLoader maxWidthImageLoader2 = new MaxWidthImageLoader(requestQueue, context, new ImageLoader.ImageCache() { // from class: com.mopub.network.Networking.2
                        @Override // com.mopub.volley.toolbox.ImageLoader.ImageCache
                        public Bitmap getBitmap(String str) {
                            return (Bitmap) LruCache.this.get(str);
                        }

                        @Override // com.mopub.volley.toolbox.ImageLoader.ImageCache
                        public void putBitmap(String str, Bitmap bitmap) {
                            LruCache.this.put(str, bitmap);
                        }
                    });
                    sMaxWidthImageLoader = maxWidthImageLoader2;
                    maxWidthImageLoader = maxWidthImageLoader2;
                }
            }
        }
        return maxWidthImageLoader;
    }

    public static String getUserAgent(Context context) {
        String str;
        Preconditions.checkNotNull(context);
        String str2 = sUserAgent;
        if (str2 == null) {
            synchronized (Networking.class) {
                str2 = sUserAgent;
                if (str2 == null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 17) {
                            str = WebSettings.getDefaultUserAgent(context);
                        } else if (Looper.myLooper() == Looper.getMainLooper()) {
                            str = new WebView(context).getSettings().getUserAgentString();
                        } else {
                            str = DEFAULT_USER_AGENT;
                        }
                    } catch (Exception unused) {
                        str = DEFAULT_USER_AGENT;
                    }
                    sUserAgent = str;
                    str2 = str;
                }
            }
        }
        return str2;
    }

    public static String getCachedUserAgent() {
        String str = sUserAgent;
        return str == null ? DEFAULT_USER_AGENT : str;
    }

    @VisibleForTesting
    public static synchronized void clearForTesting() {
        synchronized (Networking.class) {
            sRequestQueue = null;
            sMaxWidthImageLoader = null;
            sUserAgent = null;
        }
    }

    @VisibleForTesting
    public static synchronized void setRequestQueueForTesting(MoPubRequestQueue moPubRequestQueue) {
        synchronized (Networking.class) {
            sRequestQueue = moPubRequestQueue;
        }
    }

    @VisibleForTesting
    public static synchronized void setImageLoaderForTesting(MaxWidthImageLoader maxWidthImageLoader) {
        synchronized (Networking.class) {
            sMaxWidthImageLoader = maxWidthImageLoader;
        }
    }

    @VisibleForTesting
    public static synchronized void setUserAgentForTesting(String str) {
        synchronized (Networking.class) {
            sUserAgent = str;
        }
    }

    public static void useHttps(boolean z) {
        sUseHttps = z;
    }

    public static boolean shouldUseHttps() {
        return sUseHttps;
    }

    public static String getBaseUrlScheme() {
        return shouldUseHttps() ? Constants.HTTPS : Constants.HTTP;
    }
}
