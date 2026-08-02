package com.withpersona.sdk2.inquiry.shared.baseFragment;

import android.os.Bundle;
import android.os.Parcelable;
import coil3.size.SizeKt;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class FragmentArgsLazy implements Lazy {
    public final Function0 argumentProducer;
    public Parcelable cached;
    public final KClass navArgsClass;

    public FragmentArgsLazy(KClass kClass, Function0 function0) {
        kClass.getClass();
        this.navArgsClass = kClass;
        this.argumentProducer = function0;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Parcelable parcelable = this.cached;
        if (parcelable != null) {
            return parcelable;
        }
        Object parcelable2 = SizeKt.getParcelable((Bundle) this.argumentProducer.invoke(), "ARGUMENT_ARGS", PapaEvent.getJavaClass(this.navArgsClass));
        parcelable2.getClass();
        Parcelable parcelable3 = (Parcelable) parcelable2;
        this.cached = parcelable3;
        return parcelable3;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.cached != null;
    }
}
