package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.zr;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class zr implements fo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final zr f20581a = new zr();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final cs f20582b = new cs();

    @Metadata
    public static final class a implements rr {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ rr f20583a;

        a(rr rrVar) {
            this.f20583a = rrVar;
        }

        @Override // com.ironsource.rr
        public void a(@NotNull final lr sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            cs csVar = zr.f20582b;
            final rr rrVar = this.f20583a;
            csVar.a(new Runnable() { // from class: com.ironsource.T5
                @Override // java.lang.Runnable
                public final void run() {
                    zr.a.a(lr.this, rrVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(lr sdkConfig, rr listener) {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            zr.f20581a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.rr
        public void a(@NotNull final nr error) {
            Intrinsics.checkNotNullParameter(error, "error");
            cs csVar = zr.f20582b;
            final rr rrVar = this.f20583a;
            csVar.d(new Runnable() { // from class: com.ironsource.S5
                @Override // java.lang.Runnable
                public final void run() {
                    zr.a.a(rr.this, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(rr listener, nr error) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(error, "$error");
            listener.a(error);
        }
    }

    private zr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, sr initRequest, rr listener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        f20581a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, sr initRequest, rr listener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        com.ironsource.mediationsdk.p m4 = com.ironsource.mediationsdk.p.m();
        String d4 = initRequest.d();
        IronSource.AD_UNIT[] ad_unitArr = (IronSource.AD_UNIT[]) initRequest.e().toArray(new IronSource.AD_UNIT[0]);
        List<IronSource.AD_UNIT> validAdUnitsList = m4.a(context, d4, false, (IronSource.AD_UNIT[]) Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        f20581a.a(context, initRequest, listener, true);
    }

    public final void c(@NotNull final Context context, @NotNull final sr initRequest, @NotNull final rr listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f20582b.c(new Runnable() { // from class: com.ironsource.N5
            @Override // java.lang.Runnable
            public final void run() {
                zr.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.fo
    public void onInitFailed(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        f20582b.a(new Runnable() { // from class: com.ironsource.P5
            @Override // java.lang.Runnable
            public final void run() {
                zr.a(IronSourceError.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ms serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        yr.f20466a.a(new tr(serverResponse));
    }

    public final void a(@NotNull final Context context, @NotNull final sr initRequest, @NotNull final rr listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f20582b.c(new Runnable() { // from class: com.ironsource.O5
            @Override // java.lang.Runnable
            public final void run() {
                zr.b(context, initRequest, listener);
            }
        });
    }

    private final void a(Context context, sr srVar, final rr rrVar, boolean z4) {
        String f4 = srVar.f();
        if (f4 == null || f4.length() <= 0) {
            srVar = new sr(srVar.d(), com.ironsource.mediationsdk.p.m().o(), CollectionsKt.toMutableList((Collection) srVar.e()));
        } else {
            com.ironsource.mediationsdk.p.m().t(srVar.f());
        }
        com.ironsource.mediationsdk.p m4 = com.ironsource.mediationsdk.p.m();
        String d4 = srVar.d();
        IronSource.AD_UNIT[] ad_unitArr = (IronSource.AD_UNIT[]) srVar.e().toArray(new IronSource.AD_UNIT[0]);
        final IronSourceError a4 = m4.a(context, d4, z4, null, this, (IronSource.AD_UNIT[]) Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        if (a4 == null || a4.getErrorCode() == 2020) {
            yr.f20466a.a(context, srVar, new a(rrVar));
            return;
        }
        if (a4.getErrorCode() == 2040) {
            ms h4 = com.ironsource.mediationsdk.p.m().h();
            if (h4 != null) {
                a(new lr(new tr(h4)), rrVar);
                return;
            }
        } else if (a4.getErrorCode() == 2030) {
            yr.f20466a.e();
            return;
        }
        f20582b.d(new Runnable() { // from class: com.ironsource.R5
            @Override // java.lang.Runnable
            public final void run() {
                zr.a(rr.this, a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final lr lrVar, final rr rrVar) {
        if (com.ironsource.mediationsdk.p.m().a(false, lrVar.d())) {
            f20582b.d(new Runnable() { // from class: com.ironsource.M5
                @Override // java.lang.Runnable
                public final void run() {
                    zr.a(rr.this, lrVar);
                }
            });
        } else {
            f20582b.d(new Runnable() { // from class: com.ironsource.L5
                @Override // java.lang.Runnable
                public final void run() {
                    zr.a(rr.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        yr.f20466a.b(new nr(error));
    }

    @Override // com.ironsource.fo
    public void a(@NotNull final ms serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        f20582b.a(new Runnable() { // from class: com.ironsource.Q5
            @Override // java.lang.Runnable
            public final void run() {
                zr.b(ms.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(rr listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.a(new nr(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(rr listener, lr sdkInitResponse) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(rr listener, IronSourceError error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullExpressionValue(error, "error");
        listener.a(new nr(error));
    }
}
