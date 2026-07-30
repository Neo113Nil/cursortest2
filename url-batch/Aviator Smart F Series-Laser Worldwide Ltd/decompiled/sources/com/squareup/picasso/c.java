package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.j0;
import okio.x0;

/* loaded from: classes4.dex */
class c implements Runnable {
    com.squareup.picasso.a action;
    List<com.squareup.picasso.a> actions;
    final d cache;
    final u data;
    final i dispatcher;
    Exception exception;
    int exifOrientation;
    Future<?> future;
    final String key;
    Picasso.LoadedFrom loadedFrom;
    final int memoryPolicy;
    int networkPolicy;
    final Picasso picasso;
    Picasso.Priority priority;
    final w requestHandler;
    Bitmap result;
    int retryCount;
    final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
    final y stats;
    private static final Object DECODE_LOCK = new Object();
    private static final ThreadLocal<StringBuilder> NAME_BUILDER = new a();
    private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
    private static final w ERRORING_HANDLER = new b();

    static class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    static class b extends w {
        b() {
        }

        @Override // com.squareup.picasso.w
        public boolean canHandleRequest(u uVar) {
            return true;
        }

        @Override // com.squareup.picasso.w
        public w.a load(u uVar, int i8) {
            throw new IllegalStateException("Unrecognized type of request: " + uVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    static class RunnableC0340c implements Runnable {
        final /* synthetic */ RuntimeException val$e;
        final /* synthetic */ c0 val$transformation;

        RunnableC0340c(c0 c0Var, RuntimeException runtimeException) {
            this.val$e = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            new StringBuilder().append("Transformation ");
            throw null;
        }
    }

    c(Picasso picasso, i iVar, d dVar, y yVar, com.squareup.picasso.a aVar, w wVar) {
        this.picasso = picasso;
        this.dispatcher = iVar;
        this.cache = dVar;
        this.stats = yVar;
        this.action = aVar;
        this.key = aVar.getKey();
        this.data = aVar.getRequest();
        this.priority = aVar.getPriority();
        this.memoryPolicy = aVar.getMemoryPolicy();
        this.networkPolicy = aVar.getNetworkPolicy();
        this.requestHandler = wVar;
        this.retryCount = wVar.getRetryCount();
    }

    static Bitmap applyCustomTransformations(List<c0> list, Bitmap bitmap) {
        if (list.size() <= 0) {
            return bitmap;
        }
        cn.hutool.core.convert.impl.s.a(list.get(0));
        try {
            throw null;
        } catch (RuntimeException e8) {
            Picasso.HANDLER.post(new RunnableC0340c(null, e8));
            return null;
        }
    }

    private Picasso.Priority computeNewPriority() {
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<com.squareup.picasso.a> list = this.actions;
        boolean z7 = (list == null || list.isEmpty()) ? false : true;
        com.squareup.picasso.a aVar = this.action;
        if (aVar == null && !z7) {
            return priority;
        }
        if (aVar != null) {
            priority = aVar.getPriority();
        }
        if (z7) {
            int size = this.actions.size();
            for (int i8 = 0; i8 < size; i8++) {
                Picasso.Priority priority2 = this.actions.get(i8).getPriority();
                if (priority2.ordinal() > priority.ordinal()) {
                    priority = priority2;
                }
            }
        }
        return priority;
    }

    static Bitmap decodeStream(x0 x0Var, u uVar) {
        okio.e buffer = j0.buffer(x0Var);
        boolean isWebPFile = d0.isWebPFile(buffer);
        boolean z7 = uVar.purgeable;
        BitmapFactory.Options createBitmapOptions = w.createBitmapOptions(uVar);
        boolean requiresInSampleSize = w.requiresInSampleSize(createBitmapOptions);
        if (isWebPFile) {
            byte[] readByteArray = buffer.readByteArray();
            if (requiresInSampleSize) {
                BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, createBitmapOptions);
                w.calculateInSampleSize(uVar.targetWidth, uVar.targetHeight, createBitmapOptions, uVar);
            }
            return BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, createBitmapOptions);
        }
        InputStream inputStream = buffer.inputStream();
        if (requiresInSampleSize) {
            p pVar = new p(inputStream);
            pVar.allowMarksToExpire(false);
            long savePosition = pVar.savePosition(1024);
            BitmapFactory.decodeStream(pVar, null, createBitmapOptions);
            w.calculateInSampleSize(uVar.targetWidth, uVar.targetHeight, createBitmapOptions, uVar);
            pVar.reset(savePosition);
            pVar.allowMarksToExpire(true);
            inputStream = pVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, createBitmapOptions);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static c forRequest(Picasso picasso, i iVar, d dVar, y yVar, com.squareup.picasso.a aVar) {
        u request = aVar.getRequest();
        List<w> requestHandlers = picasso.getRequestHandlers();
        int size = requestHandlers.size();
        for (int i8 = 0; i8 < size; i8++) {
            w wVar = requestHandlers.get(i8);
            if (wVar.canHandleRequest(request)) {
                return new c(picasso, iVar, dVar, yVar, aVar, wVar);
            }
        }
        return new c(picasso, iVar, dVar, yVar, aVar, ERRORING_HANDLER);
    }

    static int getExifRotation(int i8) {
        switch (i8) {
            case 3:
            case 4:
                return com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int getExifTranslation(int i8) {
        return (i8 == 2 || i8 == 7 || i8 == 4 || i8 == 5) ? -1 : 1;
    }

    private static boolean shouldResize(boolean z7, int i8, int i9, int i10, int i11) {
        return !z7 || (i10 != 0 && i8 > i10) || (i11 != 0 && i9 > i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Bitmap transformResult(u uVar, Bitmap bitmap, int i8) {
        int i9;
        int i10;
        boolean z7;
        Matrix matrix;
        int i11;
        int i12;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i13;
        int i14;
        float f16;
        float f17;
        float f18;
        int i15;
        int i16;
        float f19;
        boolean z8;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z9 = uVar.onlyScaleDown;
        Matrix matrix2 = new Matrix();
        if (uVar.needsMatrixTransform() || i8 != 0) {
            int i23 = uVar.targetWidth;
            int i24 = uVar.targetHeight;
            float f20 = uVar.rotationDegrees;
            if (f20 != 0.0f) {
                double d8 = f20;
                double cos = Math.cos(Math.toRadians(d8));
                double sin = Math.sin(Math.toRadians(d8));
                if (uVar.hasRotationPivot) {
                    matrix2.setRotate(f20, uVar.rotationPivotX, uVar.rotationPivotY);
                    float f21 = uVar.rotationPivotX;
                    double d9 = 1.0d - cos;
                    float f22 = uVar.rotationPivotY;
                    i10 = height;
                    z7 = z9;
                    double d10 = (f21 * d9) + (f22 * sin);
                    double d11 = (f22 * d9) - (f21 * sin);
                    int i25 = uVar.targetWidth;
                    double d12 = (i25 * cos) + d10;
                    double d13 = (i25 * sin) + d11;
                    int i26 = uVar.targetHeight;
                    i9 = width;
                    double d14 = (d10 + (i25 * cos)) - (i26 * sin);
                    double d15 = (i25 * sin) + d11 + (i26 * cos);
                    double d16 = d10 - (i26 * sin);
                    double d17 = (i26 * cos) + d11;
                    double max = Math.max(d16, Math.max(d14, Math.max(d10, d12)));
                    double min = Math.min(d16, Math.min(d14, Math.min(d10, d12)));
                    double max2 = Math.max(d17, Math.max(d15, Math.max(d11, d13)));
                    double min2 = Math.min(d17, Math.min(d15, Math.min(d11, d13)));
                    i23 = (int) Math.floor(max - min);
                    i24 = (int) Math.floor(max2 - min2);
                    matrix = matrix2;
                } else {
                    i9 = width;
                    i10 = height;
                    z7 = z9;
                    matrix = matrix2;
                    matrix.setRotate(f20);
                    int i27 = uVar.targetWidth;
                    double d18 = i27 * cos;
                    double d19 = i27 * sin;
                    int i28 = uVar.targetHeight;
                    double d20 = (i27 * cos) - (i28 * sin);
                    double d21 = (i27 * sin) + (i28 * cos);
                    double d22 = -(i28 * sin);
                    double d23 = i28 * cos;
                    double max3 = Math.max(d22, Math.max(d20, Math.max(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, d18)));
                    double min3 = Math.min(d22, Math.min(d20, Math.min(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, d18)));
                    double max4 = Math.max(d23, Math.max(d21, Math.max(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, d19)));
                    double min4 = Math.min(d23, Math.min(d21, Math.min(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, d19)));
                    int floor = (int) Math.floor(max3 - min3);
                    i24 = (int) Math.floor(max4 - min4);
                    i23 = floor;
                }
            } else {
                i9 = width;
                i10 = height;
                z7 = z9;
                matrix = matrix2;
            }
            if (i8 != 0) {
                int exifRotation = getExifRotation(i8);
                int exifTranslation = getExifTranslation(i8);
                if (exifRotation != 0) {
                    matrix.preRotate(exifRotation);
                    if (exifRotation == 90 || exifRotation == 270) {
                        int i29 = i24;
                        i24 = i23;
                        i23 = i29;
                    }
                }
                if (exifTranslation != 1) {
                    matrix.postScale(exifTranslation, 1.0f);
                }
            }
            if (uVar.centerCrop) {
                if (i23 != 0) {
                    i13 = i9;
                    f16 = i23 / i13;
                    i14 = i10;
                } else {
                    i13 = i9;
                    i14 = i10;
                    f16 = i24 / i14;
                }
                if (i24 != 0) {
                    f17 = i24;
                    f18 = i14;
                } else {
                    f17 = i23;
                    f18 = i13;
                }
                float f23 = f17 / f18;
                if (f16 > f23) {
                    int ceil = (int) Math.ceil(i14 * (f23 / f16));
                    int i30 = uVar.centerCropGravity;
                    f19 = i24 / ceil;
                    i16 = ceil;
                    z8 = z7;
                    i18 = 0;
                    i17 = (i30 & 48) == 48 ? 0 : (i30 & 80) == 80 ? i14 - ceil : (i14 - ceil) / 2;
                    i15 = i13;
                } else if (f16 < f23) {
                    int ceil2 = (int) Math.ceil(i13 * (f16 / f23));
                    int i31 = uVar.centerCropGravity;
                    i18 = (i31 & 3) == 3 ? 0 : (i31 & 5) == 5 ? i13 - ceil2 : (i13 - ceil2) / 2;
                    i15 = ceil2;
                    i16 = i14;
                    f16 = i23 / ceil2;
                    z8 = z7;
                    f19 = f23;
                    i17 = 0;
                } else {
                    i15 = i13;
                    i16 = i14;
                    f16 = f23;
                    f19 = f16;
                    z8 = z7;
                    i17 = 0;
                    i18 = 0;
                }
                if (shouldResize(z8, i13, i14, i23, i24)) {
                    matrix.preScale(f16, f19);
                }
                i19 = i17;
                i20 = i16;
                i21 = i18;
                i22 = i15;
                createBitmap = Bitmap.createBitmap(bitmap, i21, i19, i22, i20, matrix, true);
                if (createBitmap != bitmap) {
                    return bitmap;
                }
                bitmap.recycle();
                return createBitmap;
            }
            i11 = i10;
            boolean z10 = z7;
            i12 = i9;
            if (uVar.centerInside) {
                if (i23 != 0) {
                    f12 = i23;
                    f13 = i12;
                } else {
                    f12 = i24;
                    f13 = i11;
                }
                float f24 = f12 / f13;
                if (i24 != 0) {
                    f14 = i24;
                    f15 = i11;
                } else {
                    f14 = i23;
                    f15 = i12;
                }
                float f25 = f14 / f15;
                if (f24 >= f25) {
                    f24 = f25;
                }
                if (shouldResize(z10, i12, i11, i23, i24)) {
                    matrix.preScale(f24, f24);
                }
            } else if ((i23 != 0 || i24 != 0) && (i23 != i12 || i24 != i11)) {
                if (i23 != 0) {
                    f8 = i23;
                    f9 = i12;
                } else {
                    f8 = i24;
                    f9 = i11;
                }
                float f26 = f8 / f9;
                if (i24 != 0) {
                    f10 = i24;
                    f11 = i11;
                } else {
                    f10 = i23;
                    f11 = i12;
                }
                float f27 = f10 / f11;
                if (shouldResize(z10, i12, i11, i23, i24)) {
                    matrix.preScale(f26, f27);
                }
            }
        } else {
            i12 = width;
            i11 = height;
            matrix = matrix2;
        }
        i22 = i12;
        i20 = i11;
        i21 = 0;
        i19 = 0;
        createBitmap = Bitmap.createBitmap(bitmap, i21, i19, i22, i20, matrix, true);
        if (createBitmap != bitmap) {
        }
    }

    static void updateThreadName(u uVar) {
        String name = uVar.getName();
        StringBuilder sb = NAME_BUILDER.get();
        sb.ensureCapacity(name.length() + 8);
        sb.replace(8, sb.length(), name);
        Thread.currentThread().setName(sb.toString());
    }

    void attach(com.squareup.picasso.a aVar) {
        boolean z7 = this.picasso.loggingEnabled;
        u uVar = aVar.request;
        if (this.action == null) {
            this.action = aVar;
            if (z7) {
                List<com.squareup.picasso.a> list = this.actions;
                if (list == null || list.isEmpty()) {
                    d0.log("Hunter", "joined", uVar.logId(), "to empty hunter");
                    return;
                } else {
                    d0.log("Hunter", "joined", uVar.logId(), d0.getLogIdsForHunter(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.actions == null) {
            this.actions = new ArrayList(3);
        }
        this.actions.add(aVar);
        if (z7) {
            d0.log("Hunter", "joined", uVar.logId(), d0.getLogIdsForHunter(this, "to "));
        }
        Picasso.Priority priority = aVar.getPriority();
        if (priority.ordinal() > this.priority.ordinal()) {
            this.priority = priority;
        }
    }

    boolean cancel() {
        Future<?> future;
        if (this.action != null) {
            return false;
        }
        List<com.squareup.picasso.a> list = this.actions;
        return (list == null || list.isEmpty()) && (future = this.future) != null && future.cancel(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0010, code lost:
    
        if (r0.remove(r4) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void detach(com.squareup.picasso.a aVar) {
        if (this.action != aVar) {
            List<com.squareup.picasso.a> list = this.actions;
            if (list != null) {
            }
            if (this.picasso.loggingEnabled) {
                return;
            }
            d0.log("Hunter", "removed", aVar.request.logId(), d0.getLogIdsForHunter(this, "from "));
            return;
        }
        this.action = null;
        if (aVar.getPriority() == this.priority) {
            this.priority = computeNewPriority();
        }
        if (this.picasso.loggingEnabled) {
        }
    }

    com.squareup.picasso.a getAction() {
        return this.action;
    }

    List<com.squareup.picasso.a> getActions() {
        return this.actions;
    }

    u getData() {
        return this.data;
    }

    Exception getException() {
        return this.exception;
    }

    String getKey() {
        return this.key;
    }

    Picasso.LoadedFrom getLoadedFrom() {
        return this.loadedFrom;
    }

    int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    Picasso getPicasso() {
        return this.picasso;
    }

    Picasso.Priority getPriority() {
        return this.priority;
    }

    Bitmap getResult() {
        return this.result;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:43:0x009a, B:45:0x00a2, B:48:0x00c4, B:50:0x00cc, B:52:0x00da, B:53:0x00e9, B:57:0x00a9, B:59:0x00b7), top: B:42:0x009a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Bitmap hunt() {
        Bitmap bitmap;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy)) {
            bitmap = this.cache.get(this.key);
            if (bitmap != null) {
                this.stats.dispatchCacheHit();
                this.loadedFrom = Picasso.LoadedFrom.MEMORY;
                if (this.picasso.loggingEnabled) {
                    d0.log("Hunter", "decoded", this.data.logId(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i8 = this.retryCount == 0 ? NetworkPolicy.OFFLINE.index : this.networkPolicy;
        this.networkPolicy = i8;
        w.a load = this.requestHandler.load(this.data, i8);
        if (load != null) {
            this.loadedFrom = load.getLoadedFrom();
            this.exifOrientation = load.getExifOrientation();
            bitmap = load.getBitmap();
            if (bitmap == null) {
                x0 source = load.getSource();
                try {
                    bitmap = decodeStream(source, this.data);
                } finally {
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.picasso.loggingEnabled) {
                d0.log("Hunter", "decoded", this.data.logId());
            }
            this.stats.dispatchBitmapDecoded(bitmap);
            if (this.data.needsTransformation() || this.exifOrientation != 0) {
                synchronized (DECODE_LOCK) {
                    try {
                        if (!this.data.needsMatrixTransform()) {
                            if (this.exifOrientation != 0) {
                            }
                            if (this.data.hasCustomTransformations()) {
                                bitmap = applyCustomTransformations(this.data.transformations, bitmap);
                                if (this.picasso.loggingEnabled) {
                                    d0.log("Hunter", "transformed", this.data.logId(), "from custom transformations");
                                }
                            }
                        }
                        bitmap = transformResult(this.data, bitmap, this.exifOrientation);
                        if (this.picasso.loggingEnabled) {
                            d0.log("Hunter", "transformed", this.data.logId());
                        }
                        if (this.data.hasCustomTransformations()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmap != null) {
                    this.stats.dispatchBitmapTransformed(bitmap);
                }
            }
        }
        return bitmap;
    }

    boolean isCancelled() {
        Future<?> future = this.future;
        return future != null && future.isCancelled();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        updateThreadName(this.data);
                        if (this.picasso.loggingEnabled) {
                            d0.log("Hunter", "executing", d0.getLogIdsForHunter(this));
                        }
                        Bitmap hunt = hunt();
                        this.result = hunt;
                        if (hunt == null) {
                            this.dispatcher.dispatchFailed(this);
                        } else {
                            this.dispatcher.dispatchComplete(this);
                        }
                    } catch (IOException e8) {
                        this.exception = e8;
                        this.dispatcher.dispatchRetry(this);
                    }
                } catch (NetworkRequestHandler.ResponseException e9) {
                    if (!NetworkPolicy.isOfflineOnly(e9.networkPolicy) || e9.code != 504) {
                        this.exception = e9;
                    }
                    this.dispatcher.dispatchFailed(this);
                }
            } catch (Exception e10) {
                this.exception = e10;
                this.dispatcher.dispatchFailed(this);
            } catch (OutOfMemoryError e11) {
                StringWriter stringWriter = new StringWriter();
                this.stats.createSnapshot().dump(new PrintWriter(stringWriter));
                this.exception = new RuntimeException(stringWriter.toString(), e11);
                this.dispatcher.dispatchFailed(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    boolean shouldRetry(boolean z7, NetworkInfo networkInfo) {
        int i8 = this.retryCount;
        if (i8 <= 0) {
            return false;
        }
        this.retryCount = i8 - 1;
        return this.requestHandler.shouldRetry(z7, networkInfo);
    }

    boolean supportsReplay() {
        return this.requestHandler.supportsReplay();
    }
}
