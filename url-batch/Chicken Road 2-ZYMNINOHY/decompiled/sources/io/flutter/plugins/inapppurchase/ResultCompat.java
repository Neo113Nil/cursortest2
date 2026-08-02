package io.flutter.plugins.inapppurchase;

import c3.C0293e;
import c3.C0294f;
import c3.C0297i;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class ResultCompat<T> {
    public static final Companion Companion = new Companion(null);
    private final Throwable exception;
    private final boolean isFailure;
    private final boolean isSuccess;
    private final Object result;
    private final T value;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i asCompatCallback$lambda$0(InterfaceC1339l interfaceC1339l, C0294f c0294f) {
            interfaceC1339l.invoke(new ResultCompat(c0294f.f5727a));
            return C0297i.f5732a;
        }

        public final <T> InterfaceC1339l asCompatCallback(InterfaceC1339l result) {
            i.e(result, "result");
            return new b(9, result);
        }

        public final <T> void success(T t4, Object callback) {
            i.e(callback, "callback");
            s.a(1, callback);
            ((InterfaceC1339l) callback).invoke(new C0294f(t4));
        }

        private Companion() {
        }
    }

    public ResultCompat(Object obj) {
        this.result = obj;
        boolean z = obj instanceof C0293e;
        this.value = z ? null : (T) obj;
        this.exception = C0294f.a(obj);
        this.isSuccess = !z;
        this.isFailure = z;
    }

    public static final <T> InterfaceC1339l asCompatCallback(InterfaceC1339l interfaceC1339l) {
        return Companion.asCompatCallback(interfaceC1339l);
    }

    public static final <T> void success(T t4, Object obj) {
        Companion.success(t4, obj);
    }

    public final Throwable exceptionOrNull() {
        return this.exception;
    }

    public final T getOrNull() {
        return this.value;
    }

    public final boolean isFailure() {
        return this.isFailure;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
