package com.onesignal;

import D4.E;
import I4.o;
import K4.d;
import f4.AbstractC0432i;
import f4.C0431h;
import java.util.function.Consumer;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class Continue {
    public static final Continue INSTANCE = new Continue();

    private Continue() {
    }

    public static final <R> InterfaceC1218d none() {
        return new InterfaceC1218d() { // from class: com.onesignal.Continue$none$1
            @Override // k4.InterfaceC1218d
            public InterfaceC1223i getContext() {
                d dVar = E.f459a;
                return o.f1316a;
            }

            @Override // k4.InterfaceC1218d
            public void resumeWith(Object obj) {
            }
        };
    }

    public static final <R> InterfaceC1218d with(Consumer<ContinueResult<R>> onFinished) {
        i.e(onFinished, "onFinished");
        return with$default(onFinished, null, 2, null);
    }

    public static InterfaceC1218d with$default(Consumer consumer, InterfaceC1223i interfaceC1223i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            d dVar = E.f459a;
            interfaceC1223i = o.f1316a;
        }
        return with(consumer, interfaceC1223i);
    }

    public static final <R> InterfaceC1218d with(final Consumer<ContinueResult<R>> onFinished, final InterfaceC1223i context) {
        i.e(onFinished, "onFinished");
        i.e(context, "context");
        return new InterfaceC1218d() { // from class: com.onesignal.Continue$with$1
            @Override // k4.InterfaceC1218d
            public InterfaceC1223i getContext() {
                return InterfaceC1223i.this;
            }

            @Override // k4.InterfaceC1218d
            public void resumeWith(Object obj) {
                boolean z = obj instanceof C0431h;
                onFinished.accept(new ContinueResult(!z, z ? null : obj, AbstractC0432i.a(obj)));
            }
        };
    }
}
