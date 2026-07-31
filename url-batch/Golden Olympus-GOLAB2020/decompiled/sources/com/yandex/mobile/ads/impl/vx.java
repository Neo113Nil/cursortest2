package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import com.yandex.mobile.ads.impl.rx;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vx {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fw f33817a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f33818b;

    /* renamed from: c, reason: collision with root package name */
    private final ProgressBar f33819c;

    public vx(@NotNull IntegrationInspectorActivity activity, @NotNull final Function1<? super rx, Unit> onAction, @NotNull ax imageLoader, @NotNull LinearLayoutManager layoutManager, @NotNull fw debugPanelAdapter) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(debugPanelAdapter, "debugPanelAdapter");
        this.f33817a = debugPanelAdapter;
        ImageButton imageButton = (ImageButton) activity.findViewById(R.id.toolbar_navigation_button);
        this.f33818b = (TextView) activity.findViewById(R.id.toolbar_title);
        this.f33819c = (ProgressBar) activity.findViewById(R.id.loading_view);
        RecyclerView recyclerView = (RecyclerView) activity.findViewById(R.id.recycler_view);
        bx bxVar = new bx();
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Vj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vx.a(Function1.this, view);
            }
        });
        recyclerView.setAdapter(debugPanelAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(bxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 onAction, View view) {
        Intrinsics.checkNotNullParameter(onAction, "$onAction");
        onAction.invoke(rx.d.f31463a);
    }

    public final void a(@NotNull ux state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.d()) {
            this.f33817a.submitList(CollectionsKt.emptyList());
            this.f33819c.setVisibility(0);
        } else {
            this.f33817a.submitList(state.c());
            this.f33819c.setVisibility(8);
        }
        this.f33818b.setText(state.a().a());
    }
}
