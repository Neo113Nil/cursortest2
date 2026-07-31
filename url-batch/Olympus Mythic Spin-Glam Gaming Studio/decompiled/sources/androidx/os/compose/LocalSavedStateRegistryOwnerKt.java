package androidx.os.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.os.SavedStateRegistryOwner;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalSavedStateRegistryOwner.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalSavedStateRegistryOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/savedstate/SavedStateRegistryOwner;", "getLocalSavedStateRegistryOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "savedstate-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocalSavedStateRegistryOwnerKt {
    private static final ProvidableCompositionLocal LocalSavedStateRegistryOwner;

    public static final ProvidableCompositionLocal getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    static {
        Object m8023constructorimpl;
        ProvidableCompositionLocal providableCompositionLocal;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = SavedStateRegistryOwner.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
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
            providableCompositionLocal = null;
            m8023constructorimpl = Result.m8023constructorimpl(providableCompositionLocal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        ProvidableCompositionLocal providableCompositionLocal2 = (ProvidableCompositionLocal) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
        if (providableCompositionLocal2 == null) {
            providableCompositionLocal2 = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    SavedStateRegistryOwner LocalSavedStateRegistryOwner$lambda$3$lambda$2;
                    LocalSavedStateRegistryOwner$lambda$3$lambda$2 = LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner$lambda$3$lambda$2();
                    return LocalSavedStateRegistryOwner$lambda$3$lambda$2;
                }
            });
        }
        LocalSavedStateRegistryOwner = providableCompositionLocal2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateRegistryOwner LocalSavedStateRegistryOwner$lambda$3$lambda$2() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }
}
