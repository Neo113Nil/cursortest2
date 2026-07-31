package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface vt {

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f20120a;

        public final void a() {
            this.f20120a = true;
        }

        public final boolean b() {
            return this.f20120a;
        }
    }

    @NotNull
    a a(@NotNull Runnable runnable, long j4);
}
