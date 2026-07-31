package com.ironsource;

import android.os.Handler;
import com.ironsource.me;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ne {

    @Metadata
    public static final class a implements me.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f18342a;

        a(Handler handler) {
            this.f18342a = handler;
        }

        @Override // com.ironsource.me.a
        public void a(@NotNull Runnable runnable, long j4) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f18342a.postDelayed(runnable, j4);
        }
    }

    @NotNull
    public static final me.a a(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        return new a(handler);
    }
}
