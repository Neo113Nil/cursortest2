package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import f2.AbstractC2420c;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ii implements ji {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u8 f16718a;

    /* JADX WARN: Multi-variable type inference failed */
    public ii() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object b(String str) {
        Exception exc;
        File file = new File(str);
        if (file.exists()) {
            Drawable createFromPath = Drawable.createFromPath(file.getPath());
            if (createFromPath != null) {
                return Result.m243constructorimpl(createFromPath);
            }
            Result.Companion companion = Result.Companion;
            exc = new Exception("failed to create a drawable");
        } else {
            Result.Companion companion2 = Result.Companion;
            exc = new Exception("file does not exists");
        }
        return Result.m243constructorimpl(ResultKt.createFailure(exc));
    }

    private final Object c(String str) {
        InputStream a4 = this.f16718a.a(str);
        try {
            Drawable createFromStream = Drawable.createFromStream(a4, new File(str).getName());
            AbstractC2420c.a(a4, null);
            if (createFromStream != null) {
                return Result.m243constructorimpl(createFromStream);
            }
            Result.Companion companion = Result.Companion;
            return Result.m243constructorimpl(ResultKt.createFailure(new Exception("failed to create a drawable")));
        } finally {
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.ji
    @NotNull
    public Object a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (Exception e4) {
            o9.d().a(e4);
            Result.Companion companion = Result.Companion;
            return Result.m243constructorimpl(ResultKt.createFailure(e4));
        }
    }

    public ii(@NotNull u8 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.f16718a = connectionFactory;
    }

    public /* synthetic */ ii(u8 u8Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? ia.f16705a : u8Var);
    }
}
