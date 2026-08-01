package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CacheByClass.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"useClassValue", "", "createCache", "Lkotlin/reflect/jvm/internal/CacheByClass;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "compute", "Lkotlin/Function1;", "Ljava/lang/Class;", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CacheByClassKt {
    private static final boolean useClassValue;

    static {
        Object m788constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m788constructorimpl = Result.m788constructorimpl(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m788constructorimpl = Result.m788constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m795isSuccessimpl(m788constructorimpl)) {
            Result.Companion companion3 = Result.INSTANCE;
            m788constructorimpl = true;
        }
        Object m788constructorimpl2 = Result.m788constructorimpl(m788constructorimpl);
        if (Result.m794isFailureimpl(m788constructorimpl2)) {
            m788constructorimpl2 = false;
        }
        useClassValue = ((Boolean) m788constructorimpl2).booleanValue();
    }

    public static final <V> CacheByClass<V> createCache(Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return useClassValue ? new ClassValueCache<>(compute) : new ConcurrentHashMapCache<>(compute);
    }
}
