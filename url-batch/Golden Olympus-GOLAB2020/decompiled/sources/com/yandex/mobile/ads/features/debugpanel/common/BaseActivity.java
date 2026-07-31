package com.yandex.mobile.ads.features.debugpanel.common;

import android.app.Activity;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.fu;
import com.yandex.mobile.ads.impl.xg2;
import com.yandex.mobile.ads.impl.yg2;
import kotlin.Metadata;
import o2.InterfaceC3316J;
import o2.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class BaseActivity<T extends xg2> extends Activity {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f22439a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f22440b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private T f22441c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final Object f22442a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final xg2 f22443b;

        public a() {
            this(0);
        }

        @Nullable
        public final Object a() {
            return this.f22442a;
        }

        @Nullable
        public final xg2 b() {
            return this.f22443b;
        }

        public a(@Nullable Object obj, @Nullable xg2 xg2Var) {
            this.f22442a = obj;
            this.f22443b = xg2Var;
        }

        public /* synthetic */ a(int i4) {
            this(null, null);
        }
    }

    public BaseActivity() {
        InterfaceC3316J b4;
        b4 = fu.b(null);
        this.f22439a = b4;
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        a aVar = lastNonConfigurationInstance instanceof a ? (a) lastNonConfigurationInstance : null;
        this.f22440b = aVar != null ? aVar.a() : null;
    }

    @NotNull
    protected final InterfaceC3316J a() {
        return this.f22439a;
    }

    @NotNull
    protected final T b() {
        T t4 = this.f22441c;
        if (t4 != null) {
            return t4;
        }
        T a4 = c().a();
        this.f22441c = a4;
        return a4;
    }

    @NotNull
    public abstract yg2<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.yandex.mobile.ads.impl.xg2] */
    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        a aVar = lastNonConfigurationInstance instanceof a ? (a) lastNonConfigurationInstance : null;
        if (aVar != null) {
            ?? b4 = aVar.b();
            this.f22441c = b4 != 0 ? b4 : null;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        T t4;
        super.onDestroy();
        K.f(this.f22439a, null, 1, null);
        if (isChangingConfigurations() || (t4 = this.f22441c) == null) {
            return;
        }
        t4.a();
    }

    @Override // android.app.Activity
    @NotNull
    public final Object onRetainNonConfigurationInstance() {
        return new a(null, b());
    }
}
