package coil.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import coil.ImageLoader;
import coil.decode.Decoder;
import coil.decode.ImageSource;
import coil.fetch.SourceResult;
import coil.request.Options;
import coil.size.Size;
import coil.size.Sizes;
import coil.util.Bitmaps;
import coil.util.Utils;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* compiled from: BitmapFactoryDecoder.kt */
/* loaded from: classes.dex */
public final class BitmapFactoryDecoder implements Decoder {
    public static final Companion Companion = new Companion(null);
    private final ExifOrientationPolicy exifOrientationPolicy;
    private final Options options;
    private final Semaphore parallelismLock;
    private final ImageSource source;

    public BitmapFactoryDecoder(ImageSource imageSource, Options options, Semaphore semaphore, ExifOrientationPolicy exifOrientationPolicy) {
        this.source = imageSource;
        this.options = options;
        this.parallelismLock = semaphore;
        this.exifOrientationPolicy = exifOrientationPolicy;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // coil.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object decode(Continuation continuation) {
        BitmapFactoryDecoder$decode$1 bitmapFactoryDecoder$decode$1;
        Object coroutine_suspended;
        int i;
        Semaphore semaphore;
        final BitmapFactoryDecoder bitmapFactoryDecoder;
        Semaphore semaphore2;
        Throwable th;
        Object runInterruptible$default;
        try {
            if (continuation instanceof BitmapFactoryDecoder$decode$1) {
                bitmapFactoryDecoder$decode$1 = (BitmapFactoryDecoder$decode$1) continuation;
                int i2 = bitmapFactoryDecoder$decode$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bitmapFactoryDecoder$decode$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = bitmapFactoryDecoder$decode$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bitmapFactoryDecoder$decode$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        semaphore = this.parallelismLock;
                        bitmapFactoryDecoder$decode$1.L$0 = this;
                        bitmapFactoryDecoder$decode$1.L$1 = semaphore;
                        bitmapFactoryDecoder$decode$1.label = 1;
                        if (semaphore.acquire(bitmapFactoryDecoder$decode$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bitmapFactoryDecoder = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            semaphore2 = (Semaphore) bitmapFactoryDecoder$decode$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                DecodeResult decodeResult = (DecodeResult) obj;
                                semaphore2.release();
                                return decodeResult;
                            } catch (Throwable th2) {
                                th = th2;
                                semaphore2.release();
                                throw th;
                            }
                        }
                        Semaphore semaphore3 = (Semaphore) bitmapFactoryDecoder$decode$1.L$1;
                        bitmapFactoryDecoder = (BitmapFactoryDecoder) bitmapFactoryDecoder$decode$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        semaphore = semaphore3;
                    }
                    Function0 function0 = new Function0() { // from class: coil.decode.BitmapFactoryDecoder$decode$2$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final DecodeResult mo4828invoke() {
                            DecodeResult decode;
                            decode = BitmapFactoryDecoder.this.decode(new BitmapFactory.Options());
                            return decode;
                        }
                    };
                    bitmapFactoryDecoder$decode$1.L$0 = semaphore;
                    bitmapFactoryDecoder$decode$1.L$1 = null;
                    bitmapFactoryDecoder$decode$1.label = 2;
                    runInterruptible$default = InterruptibleKt.runInterruptible$default(null, function0, bitmapFactoryDecoder$decode$1, 1, null);
                    if (runInterruptible$default != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    semaphore2 = semaphore;
                    obj = runInterruptible$default;
                    DecodeResult decodeResult2 = (DecodeResult) obj;
                    semaphore2.release();
                    return decodeResult2;
                }
            }
            Function0 function02 = new Function0() { // from class: coil.decode.BitmapFactoryDecoder$decode$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final DecodeResult mo4828invoke() {
                    DecodeResult decode;
                    decode = BitmapFactoryDecoder.this.decode(new BitmapFactory.Options());
                    return decode;
                }
            };
            bitmapFactoryDecoder$decode$1.L$0 = semaphore;
            bitmapFactoryDecoder$decode$1.L$1 = null;
            bitmapFactoryDecoder$decode$1.label = 2;
            runInterruptible$default = InterruptibleKt.runInterruptible$default(null, function02, bitmapFactoryDecoder$decode$1, 1, null);
            if (runInterruptible$default != coroutine_suspended) {
            }
        } catch (Throwable th3) {
            semaphore2 = semaphore;
            th = th3;
            semaphore2.release();
            throw th;
        }
        bitmapFactoryDecoder$decode$1 = new BitmapFactoryDecoder$decode$1(this, continuation);
        Object obj2 = bitmapFactoryDecoder$decode$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bitmapFactoryDecoder$decode$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DecodeResult decode(BitmapFactory.Options options) {
        ExceptionCatchingSource exceptionCatchingSource = new ExceptionCatchingSource(this.source.source());
        BufferedSource buffer = Okio.buffer(exceptionCatchingSource);
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(buffer.peek().inputStream(), null, options);
        Exception exception = exceptionCatchingSource.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        ExifUtils exifUtils = ExifUtils.INSTANCE;
        ExifData exifData = exifUtils.getExifData(options.outMimeType, buffer, this.exifOrientationPolicy);
        Exception exception2 = exceptionCatchingSource.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.options.getColorSpace() != null) {
            options.inPreferredColorSpace = this.options.getColorSpace();
        }
        options.inPremultiplied = this.options.getPremultipliedAlpha();
        configureConfig(options, exifData);
        configureScale(options, exifData);
        BufferedSource bufferedSource = buffer;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(bufferedSource.inputStream(), null, options);
            CloseableKt.closeFinally(bufferedSource, null);
            Exception exception3 = exceptionCatchingSource.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (decodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            decodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.options.getContext().getResources(), exifUtils.reverseTransformations(decodeStream, exifData));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z = false;
            }
            return new DecodeResult(bitmapDrawable, z);
        } finally {
        }
    }

    private final void configureConfig(BitmapFactory.Options options, ExifData exifData) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config config4 = this.options.getConfig();
        if (exifData.isFlipped() || ExifUtilsKt.isRotated(exifData)) {
            config4 = Bitmaps.toSoftware(config4);
        }
        if (this.options.getAllowRgb565() && config4 == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            config4 = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            config = options.outConfig;
            config2 = Bitmap.Config.RGBA_F16;
            if (config == config2) {
                config3 = Bitmap.Config.HARDWARE;
                if (config4 != config3) {
                    config4 = Bitmap.Config.RGBA_F16;
                }
            }
        }
        options.inPreferredConfig = config4;
    }

    private final void configureScale(BitmapFactory.Options options, ExifData exifData) {
        ImageSource.Metadata metadata = this.source.getMetadata();
        if ((metadata instanceof ResourceMetadata) && Sizes.isOriginal(this.options.getSize())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((ResourceMetadata) metadata).getDensity();
            options.inTargetDensity = this.options.getContext().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i = ExifUtilsKt.isSwapped(exifData) ? options.outHeight : options.outWidth;
        int i2 = ExifUtilsKt.isSwapped(exifData) ? options.outWidth : options.outHeight;
        Size size = this.options.getSize();
        int px = Sizes.isOriginal(size) ? i : Utils.toPx(size.getWidth(), this.options.getScale());
        Size size2 = this.options.getSize();
        int px2 = Sizes.isOriginal(size2) ? i2 : Utils.toPx(size2.getHeight(), this.options.getScale());
        int calculateInSampleSize = DecodeUtils.calculateInSampleSize(i, i2, px, px2, this.options.getScale());
        options.inSampleSize = calculateInSampleSize;
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(i / calculateInSampleSize, i2 / calculateInSampleSize, px, px2, this.options.getScale());
        if (this.options.getAllowInexactSize()) {
            computeSizeMultiplier = RangesKt.coerceAtMost(computeSizeMultiplier, 1.0d);
        }
        boolean z = computeSizeMultiplier == 1.0d;
        options.inScaled = !z;
        if (z) {
            return;
        }
        if (computeSizeMultiplier > 1.0d) {
            options.inDensity = MathKt.roundToInt(Integer.MAX_VALUE / computeSizeMultiplier);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = MathKt.roundToInt(Integer.MAX_VALUE * computeSizeMultiplier);
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    public static final class Factory implements Decoder.Factory {
        private final ExifOrientationPolicy exifOrientationPolicy;
        private final Semaphore parallelismLock;

        public Factory(int i, ExifOrientationPolicy exifOrientationPolicy) {
            this.exifOrientationPolicy = exifOrientationPolicy;
            this.parallelismLock = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        }

        @Override // coil.decode.Decoder.Factory
        public Decoder create(SourceResult sourceResult, Options options, ImageLoader imageLoader) {
            return new BitmapFactoryDecoder(sourceResult.getSource(), options, this.parallelismLock, this.exifOrientationPolicy);
        }

        public boolean equals(Object obj) {
            return obj instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    private static final class ExceptionCatchingSource extends ForwardingSource {
        private Exception exception;

        public ExceptionCatchingSource(Source source) {
            super(source);
        }

        public final Exception getException() {
            return this.exception;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j) {
            try {
                return super.read(buffer, j);
            } catch (Exception e) {
                this.exception = e;
                throw e;
            }
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
