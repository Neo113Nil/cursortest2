package l4;

import android.content.Context;
import kotlin.jvm.internal.h;
import q7.C4942k;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C4942k f39053a = com.bumptech.glide.e.q(f.f39052n);

    public static r4.b a() {
        c cVar = (c) f39053a.getValue();
        h.c(cVar, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (r4.b) cVar;
    }

    public static final Object b(Context context, AbstractC5219c abstractC5219c) {
        return ((c) f39053a.getValue()).initWithContext(context, abstractC5219c);
    }
}
