package com.ironsource;

import android.os.OutcomeReceiver;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1567t3 {

    @Metadata
    /* renamed from: com.ironsource.t3$a */
    public static final class a implements OutcomeReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f19684a;

        a(kotlin.coroutines.d dVar) {
            this.f19684a = dVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            kotlin.coroutines.d dVar = this.f19684a;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(error)));
        }

        public void onResult(@Nullable Object obj) {
            kotlin.coroutines.d dVar = this.f19684a;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m243constructorimpl(Unit.f41027a));
        }
    }

    @NotNull
    public static final OutcomeReceiver a(@NotNull kotlin.coroutines.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new a(dVar);
    }
}
