package com.squareup.cash.storage;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class RealStorage$files$1 extends FunctionReferenceImpl implements Function1 {
    public static final RealStorage$files$1 INSTANCE = new RealStorage$files$1(1, Context.class, "getFilesDir", "getFilesDir()Ljava/io/File;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        return context.getFilesDir();
    }
}
