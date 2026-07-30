package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.os.TraceCompat;
import java.io.File;

/* loaded from: classes.dex */
public class c {
    public static boolean DBG = false;
    private static final int MAX_DEPTH = 20;
    public static final String TAG = "LOTTIE";
    private static com.airbnb.lottie.network.d cacheProvider = null;
    private static int depthPastMaxDepth = 0;
    private static com.airbnb.lottie.network.e fetcher = null;
    private static volatile com.airbnb.lottie.network.f networkCache = null;
    private static volatile com.airbnb.lottie.network.g networkFetcher = null;
    private static String[] sections = null;
    private static long[] startTimeNs = null;
    private static int traceDepth = 0;
    private static boolean traceEnabled = false;

    class a implements com.airbnb.lottie.network.d {
        final /* synthetic */ Context val$appContext;

        a(Context context) {
            this.val$appContext = context;
        }

        @Override // com.airbnb.lottie.network.d
        @NonNull
        public File getCacheDir() {
            return new File(this.val$appContext.getCacheDir(), "lottie_network_cache");
        }
    }

    private c() {
    }

    public static void beginSection(String str) {
        if (traceEnabled) {
            int i8 = traceDepth;
            if (i8 == 20) {
                depthPastMaxDepth++;
                return;
            }
            sections[i8] = str;
            startTimeNs[i8] = System.nanoTime();
            TraceCompat.beginSection(str);
            traceDepth++;
        }
    }

    public static float endSection(String str) {
        int i8 = depthPastMaxDepth;
        if (i8 > 0) {
            depthPastMaxDepth = i8 - 1;
            return 0.0f;
        }
        if (!traceEnabled) {
            return 0.0f;
        }
        int i9 = traceDepth - 1;
        traceDepth = i9;
        if (i9 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(sections[i9])) {
            TraceCompat.endSection();
            return (System.nanoTime() - startTimeNs[traceDepth]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + sections[traceDepth] + ".");
    }

    @NonNull
    public static com.airbnb.lottie.network.f networkCache(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.f fVar = networkCache;
        if (fVar == null) {
            synchronized (com.airbnb.lottie.network.f.class) {
                try {
                    fVar = networkCache;
                    if (fVar == null) {
                        com.airbnb.lottie.network.d dVar = cacheProvider;
                        if (dVar == null) {
                            dVar = new a(applicationContext);
                        }
                        fVar = new com.airbnb.lottie.network.f(dVar);
                        networkCache = fVar;
                    }
                } finally {
                }
            }
        }
        return fVar;
    }

    @NonNull
    public static com.airbnb.lottie.network.g networkFetcher(@NonNull Context context) {
        com.airbnb.lottie.network.g gVar = networkFetcher;
        if (gVar == null) {
            synchronized (com.airbnb.lottie.network.g.class) {
                try {
                    gVar = networkFetcher;
                    if (gVar == null) {
                        com.airbnb.lottie.network.f networkCache2 = networkCache(context);
                        com.airbnb.lottie.network.e eVar = fetcher;
                        if (eVar == null) {
                            eVar = new com.airbnb.lottie.network.b();
                        }
                        gVar = new com.airbnb.lottie.network.g(networkCache2, eVar);
                        networkFetcher = gVar;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }

    public static void setCacheProvider(com.airbnb.lottie.network.d dVar) {
        cacheProvider = dVar;
    }

    public static void setFetcher(com.airbnb.lottie.network.e eVar) {
        fetcher = eVar;
    }

    public static void setTraceEnabled(boolean z7) {
        if (traceEnabled == z7) {
            return;
        }
        traceEnabled = z7;
        if (z7) {
            sections = new String[20];
            startTimeNs = new long[20];
        }
    }
}
