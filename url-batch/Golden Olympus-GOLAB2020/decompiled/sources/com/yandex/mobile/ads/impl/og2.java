package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class og2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final W1.h f30036a = W1.i.b(a.f30038b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30037b = 0;

    static final class a extends kotlin.jvm.internal.s implements Function0<Handler> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30038b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final void a(@Nullable final ViewGroup viewGroup, final boolean z4) {
        ((Handler) f30036a.getValue()).post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Nb
            @Override // java.lang.Runnable
            public final void run() {
                og2.b(viewGroup, z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ViewGroup viewGroup, boolean z4) {
        int childCount;
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || (childCount = viewGroup.getChildCount() - (!z4 ? 1 : 0)) <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt instanceof AbstractC1883dk) {
                arrayList.add(childAt);
            }
        }
        viewGroup.removeViews(0, childCount);
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC1883dk) arrayList.get(i5)).d();
        }
        arrayList.clear();
    }
}
