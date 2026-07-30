package com.chicken.road.cerman.fixs.roost;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoostSky.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostSky;", "", "<init>", "()V", "initialize", "", "app", "Landroid/app/Application;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoostSky {
    public static final int $stable = 0;
    public static final RoostSky INSTANCE = new RoostSky();

    private RoostSky() {
    }

    public final void initialize(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        try {
            Result.Companion companion = Result.INSTANCE;
            RoostSky roostSky = this;
            Result.m6819constructorimpl(FirebaseApp.initializeApp(app));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
    }
}
