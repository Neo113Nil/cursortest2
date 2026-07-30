package com.drake.net.utils;

import android.os.Handler;
import android.os.Looper;
import f6.p;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.t0;

/* loaded from: classes3.dex */
public abstract class f {
    public static final void runMain(final f6.a block) {
        s.checkNotNullParameter(block, "block");
        if (s.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.drake.net.utils.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.m160runMain$lambda0(f6.a.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runMain$lambda-0, reason: not valid java name */
    public static final void m160runMain$lambda0(f6.a block) {
        s.checkNotNullParameter(block, "$block");
        block.invoke();
    }

    public static final <T> Object withDefault(p pVar, kotlin.coroutines.c cVar) {
        return kotlinx.coroutines.g.withContext(t0.getDefault(), pVar, cVar);
    }

    public static final <T> Object withIO(p pVar, kotlin.coroutines.c cVar) {
        return kotlinx.coroutines.g.withContext(t0.getIO(), pVar, cVar);
    }

    public static final <T> Object withMain(p pVar, kotlin.coroutines.c cVar) {
        return kotlinx.coroutines.g.withContext(t0.getMain(), pVar, cVar);
    }

    public static final <T> Object withUnconfined(p pVar, kotlin.coroutines.c cVar) {
        return kotlinx.coroutines.g.withContext(t0.getUnconfined(), pVar, cVar);
    }
}
