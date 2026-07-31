package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1437c implements hb<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xc f15656a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f15657b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final pf f15658c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Result<? extends JSONObject>, Unit> f15659d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private oh f15660e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1437c(@NotNull xc fileUrl, @NotNull String destinationPath, @NotNull pf downloadManager, @NotNull Function1<? super Result<? extends JSONObject>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f15656a = fileUrl;
        this.f15657b = destinationPath;
        this.f15658c = downloadManager;
        this.f15659d = onFinish;
        this.f15660e = new oh(b(), b9.f15270h);
    }

    @Override // com.ironsource.qo
    public void a(@NotNull oh file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Intrinsics.areEqual(file.getName(), b9.f15270h)) {
            try {
                i().invoke(Result.a(Result.m243constructorimpl(c(file))));
            } catch (Exception e4) {
                o9.d().a(e4);
                Function1<Result<? extends JSONObject>, Unit> i4 = i();
                Result.Companion companion = Result.Companion;
                i4.invoke(Result.a(Result.m243constructorimpl(ResultKt.createFailure(e4))));
            }
        }
    }

    @Override // com.ironsource.hb
    @NotNull
    public String b() {
        return this.f15657b;
    }

    @Override // com.ironsource.hb
    @NotNull
    public xc c() {
        return this.f15656a;
    }

    @Override // com.ironsource.hb
    @NotNull
    public Function1<Result<? extends JSONObject>, Unit> i() {
        return this.f15659d;
    }

    @Override // com.ironsource.hb
    @NotNull
    public oh j() {
        return this.f15660e;
    }

    @Override // com.ironsource.hb
    @NotNull
    public pf k() {
        return this.f15658c;
    }

    private final JSONObject c(oh ohVar) {
        return new JSONObject(IronSourceStorageUtils.readFile(ohVar));
    }

    @Override // com.ironsource.qo
    public void a(@Nullable oh ohVar, @NotNull gh error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends JSONObject>, Unit> i4 = i();
        Result.Companion companion = Result.Companion;
        i4.invoke(Result.a(Result.m243constructorimpl(ResultKt.createFailure(new Exception("Unable to download abTestMap.json: " + error.b())))));
    }

    @Override // com.ironsource.hb
    public void b(@NotNull oh ohVar) {
        Intrinsics.checkNotNullParameter(ohVar, "<set-?>");
        this.f15660e = ohVar;
    }
}
