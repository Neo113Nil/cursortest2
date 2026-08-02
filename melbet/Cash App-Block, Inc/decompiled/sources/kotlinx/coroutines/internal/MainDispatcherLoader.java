package kotlinx.coroutines.internal;

import android.os.Looper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* loaded from: classes3.dex */
public abstract class MainDispatcherLoader {
    public static final HandlerContext dispatcher;

    static {
        String str;
        int i = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.asSequence(Arrays.asList(new AndroidDispatcherFactory()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((AndroidDispatcherFactory) obj).getClass();
                    do {
                        ((AndroidDispatcherFactory) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((AndroidDispatcherFactory) obj) == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                dispatcher = new HandlerContext(HandlerDispatcherKt.asHandler(mainLooper));
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
