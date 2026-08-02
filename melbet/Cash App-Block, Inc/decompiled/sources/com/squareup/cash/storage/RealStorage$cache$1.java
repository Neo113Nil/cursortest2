package com.squareup.cash.storage;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class RealStorage$cache$1 extends FunctionReferenceImpl implements Function1 {
    public static final RealStorage$cache$1 INSTANCE = new RealStorage$cache$1(1, Context.class, "getCacheDir", "getCacheDir()Ljava/io/File;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        return context.getCacheDir();
    }
}
