package androidx.lifecycle.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalLifecycleOwner.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/lifecycle/LifecycleOwner;", "LocalLifecycleOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLifecycleOwner$annotations", "()V", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalLifecycleOwnerKt {
    private static final ProvidableCompositionLocal LocalLifecycleOwner;

    public static final ProvidableCompositionLocal getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = null;
     */
    static {
        Object m8023constructorimpl;
        ProvidableCompositionLocal providableCompositionLocal;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = LifecycleOwner.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (annotations[i] instanceof Deprecated) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    Object invoke = method.invoke(null, null);
                    if (invoke instanceof ProvidableCompositionLocal) {
                        providableCompositionLocal = (ProvidableCompositionLocal) invoke;
                    }
                }
            }
            m8023constructorimpl = Result.m8023constructorimpl(providableCompositionLocal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        ProvidableCompositionLocal providableCompositionLocal2 = (ProvidableCompositionLocal) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
        if (providableCompositionLocal2 == null) {
            providableCompositionLocal2 = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.lifecycle.compose.LocalLifecycleOwnerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    LifecycleOwner LocalLifecycleOwner$lambda$0$1;
                    LocalLifecycleOwner$lambda$0$1 = LocalLifecycleOwnerKt.LocalLifecycleOwner$lambda$0$1();
                    return LocalLifecycleOwner$lambda$0$1;
                }
            });
        }
        LocalLifecycleOwner = providableCompositionLocal2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleOwner LocalLifecycleOwner$lambda$0$1() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }
}
