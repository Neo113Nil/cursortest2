package com.ironsource;

import android.util.Log;
import com.ironsource.j9;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class l9 implements kf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i9 f16999a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<oh, Object> f17000b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final pf f17001c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final q9 f17002d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17003e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private oh f17004f;

    /* renamed from: g, reason: collision with root package name */
    private long f17005g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final fp f17006h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private String f17007i;

    @Metadata
    /* synthetic */ class a extends kotlin.jvm.internal.p implements Function1<Result<? extends oh>, Unit> {
        a(Object obj) {
            super(1, obj, l9.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(@NotNull Object obj) {
            ((l9) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Result) obj).h());
            return Unit.f41027a;
        }
    }

    @Metadata
    /* synthetic */ class b extends kotlin.jvm.internal.p implements Function1<Result<? extends JSONObject>, Unit> {
        b(Object obj) {
            super(1, obj, l9.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(@NotNull Object obj) {
            ((l9) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Result) obj).h());
            return Unit.f41027a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l9(@NotNull i9 config, @NotNull Function1<? super oh, ? extends Object> onFinish, @NotNull pf downloadManager, @NotNull q9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f16999a = config;
        this.f17000b = onFinish;
        this.f17001c = downloadManager;
        this.f17002d = currentTimeProvider;
        this.f17003e = l9.class.getSimpleName();
        this.f17004f = new oh(config.b(), "mobileController_0.html");
        this.f17005g = currentTimeProvider.a();
        this.f17006h = new fp(config.c());
        this.f17007i = "";
    }

    private final k9 a(String str) {
        return new k9(new qv(this.f17006h, str), this.f16999a.b() + "/mobileController_" + str + ".html", this.f17001c, new a(this));
    }

    @Override // com.ironsource.kf
    @NotNull
    public oh b() {
        return this.f17004f;
    }

    @NotNull
    public final q9 c() {
        return this.f17002d;
    }

    @NotNull
    public final Function1<oh, Object> d() {
        return this.f17000b;
    }

    @Override // com.ironsource.kf
    public void a() {
        this.f17005g = this.f17002d.a();
        new C1437c(new C1444d(this.f17006h), this.f16999a.b() + "/temp", this.f17001c, new b(this)).l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        if (Result.f(obj)) {
            oh ohVar = (oh) (Result.m244isFailureimpl(obj) ? null : obj);
            if (!Intrinsics.areEqual(ohVar != null ? ohVar.getAbsolutePath() : null, this.f17004f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f17004f);
                    Intrinsics.checkNotNull(ohVar);
                    f2.i.l(ohVar, this.f17004f, true, 0, 4, null);
                } catch (Exception e4) {
                    o9.d().a(e4);
                    Log.e(this.f17003e, "Unable to copy downloaded mobileController.html to cache folder: " + e4.getMessage());
                }
                Intrinsics.checkNotNull(ohVar);
                this.f17004f = ohVar;
            }
            new j9.b(this.f16999a.d(), this.f17005g, this.f17002d).a();
        } else {
            new j9.a(this.f16999a.d()).a();
        }
        Function1<oh, Object> function1 = this.f17000b;
        if (Result.m244isFailureimpl(obj)) {
            obj = null;
        }
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) {
        if (Result.m244isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null || Intrinsics.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            a("0").l();
            return;
        }
        SDKUtils.updateControllerConfig("abTestMap", jSONObject);
        String string = jSONObject.getString("htmlBuildNumber");
        Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
        this.f17007i = string;
        k9 a4 = a(string);
        if (!a4.h()) {
            a4.l();
            return;
        }
        oh j4 = a4.j();
        this.f17004f = j4;
        this.f17000b.invoke(j4);
    }

    @Override // com.ironsource.kf
    public boolean a(@NotNull oh file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").d(name);
    }
}
