package com.ironsource;

import android.os.Looper;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1535p4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f18588a = new a(null);

    @Metadata
    /* renamed from: com.ironsource.p4$a */
    public static final class a {
        private a() {
        }

        public final void a() {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void a() {
        f18588a.a();
    }
}
