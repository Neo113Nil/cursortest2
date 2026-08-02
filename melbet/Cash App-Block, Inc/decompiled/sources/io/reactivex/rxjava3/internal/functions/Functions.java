package io.reactivex.rxjava3.internal.functions;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.Fillr;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.reflect.full.KClasses$$Lambda$1;
import net.idrnd.face.iad.capture.Plane;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public abstract class Functions {
    public static final Plane IDENTITY = new Plane(22);
    public static final Fillr.AnonymousClass3 EMPTY_RUNNABLE = new Fillr.AnonymousClass3(6);
    public static final KClasses$$Lambda$1 EMPTY_ACTION = new KClasses$$Lambda$1(21);
    public static final POPMatchingFactory EMPTY_CONSUMER = new POPMatchingFactory(22);

    public final class ArrayListCapacityCallable implements Supplier {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new ArrayList(16);
        }
    }

    public final class JustValue implements Callable, Supplier, Function {
        public final Object value;

        public JustValue(Object obj) {
            this.value = obj;
        }

        @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
        /* renamed from: apply */
        public final Object mo39apply(Object obj) {
            return this.value;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return this.value;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return this.value;
        }
    }

    public static void verifyPositive(int i, String str) {
        if (i > 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i, str, " > 0 required but it was "));
    }
}
