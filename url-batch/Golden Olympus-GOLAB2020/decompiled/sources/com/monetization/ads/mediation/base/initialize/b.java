package com.monetization.ads.mediation.base.initialize;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@f(c = "com.monetization.ads.mediation.base.initialize.MediatedNetworksSdksInitializer", f = "MediatedNetworksSdksInitializer.kt", l = {IronSourceConstants.SET_USER_ID}, m = "initializeNetworks")
/* loaded from: classes2.dex */
final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    a f20758b;

    /* renamed from: c, reason: collision with root package name */
    Context f20759c;

    /* renamed from: d, reason: collision with root package name */
    Iterator f20760d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f20761e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ a f20762f;

    /* renamed from: g, reason: collision with root package name */
    int f20763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f20762f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object a4;
        this.f20761e = obj;
        this.f20763g |= Integer.MIN_VALUE;
        a4 = this.f20762f.a((Context) null, (ArrayList) null, this);
        return a4;
    }
}
