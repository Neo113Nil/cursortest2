package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class rh extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18911a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private a f18912b;

    @Metadata
    public interface a {
        void a(@NotNull uv uvVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18911a = "ISNNativeAdContainer";
    }

    private final uv a() {
        return new uv(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    @Nullable
    public final a getListener$mediationsdk_release() {
        return this.f18912b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i4) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        Logger.i(this.f18911a, "onVisibilityChanged: " + i4);
        a aVar = this.f18912b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i4) {
        Logger.i(this.f18911a, "onWindowVisibilityChanged: " + i4);
        a aVar = this.f18912b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(@Nullable a aVar) {
        this.f18912b = aVar;
    }
}
