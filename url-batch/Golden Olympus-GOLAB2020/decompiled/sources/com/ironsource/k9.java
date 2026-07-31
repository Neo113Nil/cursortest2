package com.ironsource;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class k9 implements hb<oh> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xc f16918a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16919b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final pf f16920c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Result<? extends oh>, Unit> f16921d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private oh f16922e;

    /* JADX WARN: Multi-variable type inference failed */
    public k9(@NotNull xc fileUrl, @NotNull String destinationPath, @NotNull pf downloadManager, @NotNull Function1<? super Result<? extends oh>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f16918a = fileUrl;
        this.f16919b = destinationPath;
        this.f16920c = downloadManager;
        this.f16921d = onFinish;
        this.f16922e = new oh(b());
    }

    @Override // com.ironsource.qo
    public void a(@NotNull oh file) {
        Intrinsics.checkNotNullParameter(file, "file");
        i().invoke(Result.a(Result.m243constructorimpl(file)));
    }

    @Override // com.ironsource.hb
    @NotNull
    public String b() {
        return this.f16919b;
    }

    @Override // com.ironsource.hb
    @NotNull
    public xc c() {
        return this.f16918a;
    }

    @Override // com.ironsource.hb
    @NotNull
    public Function1<Result<? extends oh>, Unit> i() {
        return this.f16921d;
    }

    @Override // com.ironsource.hb
    @NotNull
    public oh j() {
        return this.f16922e;
    }

    @Override // com.ironsource.hb
    @NotNull
    public pf k() {
        return this.f16920c;
    }

    @Override // com.ironsource.qo
    public void a(@Nullable oh ohVar, @NotNull gh error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends oh>, Unit> i4 = i();
        Result.Companion companion = Result.Companion;
        i4.invoke(Result.a(Result.m243constructorimpl(ResultKt.createFailure(new Exception("Unable to download mobileController.html: " + error.b())))));
    }

    @Override // com.ironsource.hb
    public void b(@NotNull oh ohVar) {
        Intrinsics.checkNotNullParameter(ohVar, "<set-?>");
        this.f16922e = ohVar;
    }
}
