package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.dx1;
import com.yandex.mobile.ads.impl.qq1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.yj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2372yj<T> extends op1<T> {

    /* renamed from: v, reason: collision with root package name */
    private static final int f35152v = (int) TimeUnit.SECONDS.toMillis(10);

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final Context f35153s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final a<T> f35154t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    private final yp1 f35155u;

    /* renamed from: com.yandex.mobile.ads.impl.yj$a */
    public interface a<T> extends qq1.b<T>, qq1.a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2372yj(@NotNull Context context, int i4, @NotNull String url, @NotNull a<T> listener, @Nullable yp1 yp1Var) {
        super(i4, url, listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35153s = context;
        this.f35154t = listener;
        this.f35155u = yp1Var;
        q();
        a(new b00(1.0f, f35152v, 0));
    }

    @Override // com.yandex.mobile.ads.impl.op1
    protected final void a(T t4) {
        this.f35154t.a((a<T>) t4);
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @NotNull
    protected hi2 b(@NotNull hi2 volleyError) {
        Intrinsics.checkNotNullParameter(volleyError, "volleyError");
        Intrinsics.checkNotNullExpressionValue(volleyError, "parseNetworkError(...)");
        return volleyError;
    }

    public final void w() {
        yp1 yp1Var = this.f35155u;
        if (yp1Var != null) {
            yp1Var.b();
        }
    }

    protected final void a(@NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        String a4 = cf0.a(headers, bh0.f23775b0);
        if (a4 != null) {
            dx1.a aVar = dx1.f24990a;
            Context context = this.f35153s;
            aVar.getClass();
            dx1.a.a(context).a(a4);
        }
    }

    public /* synthetic */ AbstractC2372yj(Context context, String str, a aVar) {
        this(context, 0, str, aVar, null);
    }
}
