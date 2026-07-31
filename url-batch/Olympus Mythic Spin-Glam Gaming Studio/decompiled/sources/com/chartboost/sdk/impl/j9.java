package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes11.dex */
public interface j9 {
    Object a(Context context, String str, v vVar, Continuation continuation);

    Object a(Context context, Continuation continuation);

    boolean a();

    void b();

    void c();

    public static final class a {
        public static /* synthetic */ Object a(j9 j9Var, Context context, String str, v vVar, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load-BWLJW6A");
            }
            if ((i & 4) != 0) {
                vVar = new v(null, null, 3, null);
            }
            return j9Var.a(context, str, vVar, continuation);
        }
    }
}
