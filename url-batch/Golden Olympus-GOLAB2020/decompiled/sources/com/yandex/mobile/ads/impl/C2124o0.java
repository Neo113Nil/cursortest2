package com.yandex.mobile.ads.impl;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2124o0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f29825a;

    /* renamed from: com.yandex.mobile.ads.impl.o0$a */
    static final class a extends kotlin.jvm.internal.s implements Function1<WeakReference<Activity>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f29826b = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            WeakReference it = (WeakReference) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            Activity activity = (Activity) it.get();
            return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.o0$b */
    static final class b extends kotlin.jvm.internal.s implements Function1<WeakReference<Activity>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f29827b = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            WeakReference it = (WeakReference) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            Activity activity = (Activity) it.get();
            return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
        }
    }

    public C2124o0(@Nullable Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f29825a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        synchronized (this) {
            try {
                ArrayList arrayList = this.f29825a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        if (Intrinsics.areEqual(((WeakReference) obj).get(), activity)) {
                            break;
                        }
                    }
                }
                this.f29825a.add(new WeakReference(activity));
                Objects.toString(activity);
                ap0.a(new Object[0]);
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Activity b() {
        Activity activity;
        synchronized (this) {
            CollectionsKt.removeAll((List) this.f29825a, (Function1) b.f29827b);
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.f29825a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    public final void b(@NotNull Activity activity) {
        Object obj;
        Intrinsics.checkNotNullParameter(activity, "activity");
        synchronized (this) {
            try {
                ArrayList arrayList = this.f29825a;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i4);
                    i4++;
                    if (Intrinsics.areEqual(((WeakReference) obj).get(), activity)) {
                        break;
                    }
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    this.f29825a.remove(weakReference);
                    Objects.toString(activity);
                    ap0.a(new Object[0]);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Activity a() {
        Activity activity;
        synchronized (this) {
            CollectionsKt.removeAll((List) this.f29825a, (Function1) a.f29826b);
            WeakReference weakReference = (WeakReference) CollectionsKt.firstOrNull((List) this.f29825a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }
}
