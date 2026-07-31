package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.q9;
import com.ironsource.yh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ds implements yh, yh.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final es f15916a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vr f15917b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q9 f15918c;

    /* renamed from: d, reason: collision with root package name */
    private int f15919d;

    /* renamed from: e, reason: collision with root package name */
    private long f15920e;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f15921a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f15922b = -1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f15923c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final long f15924d = -1;

        private a() {
        }
    }

    public ds(@NotNull es storage, @NotNull vr initResponseStorage, @NotNull q9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f15916a = storage;
        this.f15917b = initResponseStorage;
        this.f15918c = currentTimeProvider;
        this.f15919d = -1;
        this.f15920e = -1L;
    }

    private final int b(Context context, es esVar) {
        int b4 = esVar.b(context, 0) + 1;
        esVar.a(context, b4);
        return b4;
    }

    @Override // com.ironsource.yh
    public long a() {
        return this.f15920e;
    }

    @Override // com.ironsource.yh
    public int c() {
        return this.f15919d;
    }

    public /* synthetic */ ds(es esVar, vr vrVar, q9 q9Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(esVar, (i4 & 2) != 0 ? new wr() : vrVar, (i4 & 4) != 0 ? new q9.a() : q9Var);
    }

    private final long a(Context context, es esVar) {
        long a4 = esVar.a(context, -1L);
        if (this.f15917b.a(context) || a4 != -1) {
            return a4;
        }
        long a5 = this.f15918c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + a5);
        esVar.b(context, a5);
        return a5;
    }

    @Override // com.ironsource.yh
    @NotNull
    public String b() {
        String sessionId = IronSourceUtils.getSessionId();
        Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId()");
        return sessionId;
    }

    @Override // com.ironsource.yh.a
    public void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15919d = b(context, this.f15916a);
        this.f15920e = a(context, this.f15916a);
    }
}
