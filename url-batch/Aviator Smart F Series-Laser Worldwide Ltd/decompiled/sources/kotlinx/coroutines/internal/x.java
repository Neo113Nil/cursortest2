package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.v1;

/* loaded from: classes5.dex */
public abstract class x {
    private static final String FAST_SERVICE_LOADER_PROPERTY_NAME = "kotlinx.coroutines.fast.service.loader";
    private static final boolean SUPPORT_MISSING = false;

    private static final y createMissingDispatcher(Throwable th, String str) {
        if (SUPPORT_MISSING) {
            return new y(th, str);
        }
        if (th != null) {
            throw th;
        }
        throwMissingMainDispatcherException();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ y createMissingDispatcher$default(Throwable th, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        return createMissingDispatcher(th, str);
    }

    private static /* synthetic */ void getSUPPORT_MISSING$annotations() {
    }

    public static final boolean isMissing(v1 v1Var) {
        return v1Var.getImmediate() instanceof y;
    }

    public static final Void throwMissingMainDispatcherException() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final v1 tryCreateDispatcher(v vVar, List<? extends v> list) {
        try {
            return vVar.createDispatcher(list);
        } catch (Throwable th) {
            return createMissingDispatcher(th, vVar.hintOnError());
        }
    }
}
