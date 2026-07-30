package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes4.dex */
class y {
    private static final int BITMAP_DECODE_FINISHED = 2;
    private static final int BITMAP_TRANSFORMED_FINISHED = 3;
    private static final int CACHE_HIT = 0;
    private static final int CACHE_MISS = 1;
    private static final int DOWNLOAD_FINISHED = 4;
    private static final String STATS_THREAD_NAME = "Picasso-Stats";
    long averageDownloadSize;
    long averageOriginalBitmapSize;
    long averageTransformedBitmapSize;
    final d cache;
    long cacheHits;
    long cacheMisses;
    int downloadCount;
    final Handler handler;
    int originalBitmapCount;
    final HandlerThread statsThread;
    long totalDownloadSize;
    long totalOriginalBitmapSize;
    long totalTransformedBitmapSize;
    int transformedBitmapCount;

    private static class a extends Handler {
        private final y stats;

        /* renamed from: com.squareup.picasso.y$a$a, reason: collision with other inner class name */
        class RunnableC0341a implements Runnable {
            final /* synthetic */ Message val$msg;

            RunnableC0341a(Message message) {
                this.val$msg = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.val$msg.what);
            }
        }

        a(Looper looper, y yVar) {
            super(looper);
            this.stats = yVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 0) {
                this.stats.performCacheHit();
                return;
            }
            if (i8 == 1) {
                this.stats.performCacheMiss();
                return;
            }
            if (i8 == 2) {
                this.stats.performBitmapDecoded(message.arg1);
                return;
            }
            if (i8 == 3) {
                this.stats.performBitmapTransformed(message.arg1);
            } else if (i8 != 4) {
                Picasso.HANDLER.post(new RunnableC0341a(message));
            } else {
                this.stats.performDownloadFinished((Long) message.obj);
            }
        }
    }

    y(d dVar) {
        this.cache = dVar;
        HandlerThread handlerThread = new HandlerThread(STATS_THREAD_NAME, 10);
        this.statsThread = handlerThread;
        handlerThread.start();
        d0.flushStackLocalLeaks(handlerThread.getLooper());
        this.handler = new a(handlerThread.getLooper(), this);
    }

    private static long getAverage(int i8, long j8) {
        return j8 / i8;
    }

    private void processBitmap(Bitmap bitmap, int i8) {
        int bitmapBytes = d0.getBitmapBytes(bitmap);
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(i8, bitmapBytes, 0));
    }

    z createSnapshot() {
        return new z(this.cache.maxSize(), this.cache.size(), this.cacheHits, this.cacheMisses, this.totalDownloadSize, this.totalOriginalBitmapSize, this.totalTransformedBitmapSize, this.averageDownloadSize, this.averageOriginalBitmapSize, this.averageTransformedBitmapSize, this.downloadCount, this.originalBitmapCount, this.transformedBitmapCount, System.currentTimeMillis());
    }

    void dispatchBitmapDecoded(Bitmap bitmap) {
        processBitmap(bitmap, 2);
    }

    void dispatchBitmapTransformed(Bitmap bitmap) {
        processBitmap(bitmap, 3);
    }

    void dispatchCacheHit() {
        this.handler.sendEmptyMessage(0);
    }

    void dispatchCacheMiss() {
        this.handler.sendEmptyMessage(1);
    }

    void dispatchDownloadFinished(long j8) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j8)));
    }

    void performBitmapDecoded(long j8) {
        int i8 = this.originalBitmapCount + 1;
        this.originalBitmapCount = i8;
        long j9 = this.totalOriginalBitmapSize + j8;
        this.totalOriginalBitmapSize = j9;
        this.averageOriginalBitmapSize = getAverage(i8, j9);
    }

    void performBitmapTransformed(long j8) {
        this.transformedBitmapCount++;
        long j9 = this.totalTransformedBitmapSize + j8;
        this.totalTransformedBitmapSize = j9;
        this.averageTransformedBitmapSize = getAverage(this.originalBitmapCount, j9);
    }

    void performCacheHit() {
        this.cacheHits++;
    }

    void performCacheMiss() {
        this.cacheMisses++;
    }

    void performDownloadFinished(Long l8) {
        this.downloadCount++;
        long longValue = this.totalDownloadSize + l8.longValue();
        this.totalDownloadSize = longValue;
        this.averageDownloadSize = getAverage(this.downloadCount, longValue);
    }

    void shutdown() {
        this.statsThread.quit();
    }
}
