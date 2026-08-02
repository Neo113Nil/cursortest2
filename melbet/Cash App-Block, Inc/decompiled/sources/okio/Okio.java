package okio;

import coil3.request.OneShotDisposable;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.UnsignedKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Charsets;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.tasks.DirectExecutor;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;
import okhttp3.ConnectionPool;
import okhttp3.MediaType;

/* loaded from: classes3.dex */
public abstract class Okio {
    public static final Object awaitImpl(Task task, OneShotDisposable oneShotDisposable, ContinuationImpl continuationImpl) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                throw exception;
            }
            if (!task.isCanceled()) {
                return task.getResult();
            }
            throw new CancellationException("Task " + task + " was cancelled normally.");
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
        cancellableContinuationImpl.initCancellability();
        task.addOnCompleteListener(DirectExecutor.INSTANCE, new ConnectionPool(cancellableContinuationImpl));
        if (oneShotDisposable != null) {
            cancellableContinuationImpl.invokeOnCancellation(new TasksKt$awaitImpl$2$2(oneShotDisposable, 0));
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final Boolean boxBoolean(boolean z) {
        return Boolean.valueOf(z);
    }

    public static final Integer boxInt(int i) {
        return new Integer(i);
    }

    public static final RealBufferedSink buffer(Sink sink) {
        sink.getClass();
        return new RealBufferedSink(sink);
    }

    public static final Pair chooseCharset(MediaType mediaType) {
        Charset charset = Charsets.UTF_8;
        if (mediaType != null) {
            Charset charset$default = MediaType.charset$default(mediaType);
            if (charset$default == null) {
                try {
                    mediaType = UnsignedKt.get(mediaType + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    mediaType = null;
                }
            } else {
                charset = charset$default;
            }
        }
        return new Pair(charset, mediaType);
    }

    public static final long infinityOfSign(long j) {
        if (j < 0) {
            Duration.Companion.getClass();
            return Duration.NEG_INFINITE;
        }
        Duration.Companion.getClass();
        return Duration.INFINITE;
    }

    public static final long saturatingFiniteDiff(long j, long j2) {
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return DurationKt.toDuration(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m4179unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        long j4 = (j / 1000000) - (j2 / 1000000);
        long j5 = (j % 1000000) - (j2 % 1000000);
        Duration.Companion companion = Duration.Companion;
        return Duration.m4173plusLRDsOJo(DurationKt.toDuration(j4, durationUnit2), DurationKt.toDuration(j5, durationUnit));
    }

    public static Pipe$sink$1 sink$default(File file) {
        file.getClass();
        return new Pipe$sink$1(new FileOutputStream(file, false), new Timeout());
    }

    public static final InputStreamSource source(InputStream inputStream) {
        inputStream.getClass();
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final RealBufferedSource buffer(Source source) {
        source.getClass();
        return new RealBufferedSource(source);
    }
}
