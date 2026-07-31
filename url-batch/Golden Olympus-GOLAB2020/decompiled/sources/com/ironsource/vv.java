package com.ironsource;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class vv extends hp {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f20121f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f20122g = "ViewVisibilityTrigger";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f20123d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xv f20124e;

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class b implements so {
        b() {
        }

        @Override // com.ironsource.so
        public void a(boolean z4) {
            vv.this.a(!z4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(@NotNull View view) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(view, "view");
        b bVar = new b();
        this.f20123d = bVar;
        xv xvVar = new xv(bVar);
        this.f20124e = xvVar;
        xvVar.a(view);
        a(!xvVar.c());
    }

    @Override // com.ironsource.hp
    @NotNull
    public String b() {
        return f20122g;
    }

    public final void e() {
        this.f20124e.b();
    }
}
