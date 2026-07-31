package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata
/* renamed from: io.appmetrica.analytics.impl.e7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2591e7 implements InterfaceC2565d7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Wg f38916a;

    public C2591e7(@NotNull Wg wg) {
        this.f38916a = wg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2565d7
    @NotNull
    public File a(@NotNull Context context, @NotNull String str) {
        return new File(context.getNoBackupFilesDir(), this.f38916a.a(str));
    }
}
