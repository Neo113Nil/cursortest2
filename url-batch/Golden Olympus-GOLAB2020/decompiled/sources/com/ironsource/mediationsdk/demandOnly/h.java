package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC1493k;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface h extends q {

    @Metadata
    public static abstract class a implements h {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f17458a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f17459b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f17460c;

        public a(@Nullable String str, @Nullable String str2, boolean z4) {
            this.f17458a = str;
            this.f17459b = str2;
            this.f17460c = z4;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String b() {
            return this.f17459b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String c() {
            return this.f17458a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean d() {
            return this.f17460c;
        }
    }

    @Metadata
    public static final class b extends a {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f17461d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private final Activity f17462e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private final ISDemandOnlyBannerLayout f17463f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String adFormat, @Nullable Activity activity, @Nullable String str, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str2, boolean z4) {
            super(str, str2, z4);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f17461d = adFormat;
            this.f17462e = activity;
            this.f17463f = iSDemandOnlyBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError a4 = new q.a(this.f17461d).a(this);
            if (a4 != null) {
                return a4;
            }
            return null;
        }

        @Nullable
        public final Activity f() {
            return this.f17462e;
        }

        @Nullable
        public final ISDemandOnlyBannerLayout g() {
            return this.f17463f;
        }

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i4 & 16) != 0 ? null : str3, (i4 & 32) != 0 ? false : z4);
        }
    }

    @Metadata
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private String f17464a = "";

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private Activity f17465b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String f17466c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17467d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private String f17468e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private ISDemandOnlyBannerLayout f17469f;

        @NotNull
        public final b a() {
            return new b(this.f17464a, this.f17465b, this.f17466c, this.f17469f, this.f17468e, this.f17467d);
        }

        @NotNull
        public final c b(@Nullable String str) {
            this.f17466c = str;
            return this;
        }

        @NotNull
        public final c a(@Nullable Activity activity) {
            this.f17465b = activity;
            return this;
        }

        @NotNull
        public final d b() {
            return new d(this.f17464a, this.f17465b, this.f17466c, this.f17468e, this.f17467d);
        }

        @NotNull
        public final c a(@Nullable Activity activity, @Nullable Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f17465b = activity;
            return this;
        }

        @NotNull
        public final c a(@NotNull IronSource.AD_UNIT adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            String ad_unit = adFormat.toString();
            Intrinsics.checkNotNullExpressionValue(ad_unit, "adFormat.toString()");
            this.f17464a = ad_unit;
            return this;
        }

        @NotNull
        public final c a(@Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f17469f = iSDemandOnlyBannerLayout;
            return this;
        }

        @NotNull
        public final c a(@Nullable String str) {
            this.f17468e = str;
            return this;
        }

        @NotNull
        public final c a(boolean z4) {
            this.f17467d = z4;
            return this;
        }
    }

    @Metadata
    public static final class d extends a implements InterfaceC1493k {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f17470d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private final Activity f17471e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String adFormat, @Nullable Activity activity, @Nullable String str, @Nullable String str2, boolean z4) {
            super(str, str2, z4);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f17470d = adFormat;
            this.f17471e = activity;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError a4 = new q.b(this.f17470d).a(this);
            if (a4 != null) {
                return a4;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC1493k
        @Nullable
        public Activity e() {
            return this.f17471e;
        }

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? false : z4);
        }
    }

    @Nullable
    String b();

    @Nullable
    String c();

    boolean d();
}
