package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.fb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1922fb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2203rb f25727a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hq0 f25728b;

    /* renamed from: com.yandex.mobile.ads.impl.fb$a */
    private static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Dialog f25729a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final hq0 f25730b;

        public a(@NotNull Dialog dialog, @NotNull hq0 keyboardUtils) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(keyboardUtils, "keyboardUtils");
            this.f25729a = dialog;
            this.f25730b = keyboardUtils;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f25730b.getClass();
            hq0.a(view);
            c10.a(this.f25729a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fb$b */
    private static final class b implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f25731a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Dialog f25732b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final hq0 f25733c;

        /* renamed from: d, reason: collision with root package name */
        private float f25734d;

        public b(@NotNull ViewGroup adTuneContainer, @NotNull Dialog dialog, @NotNull hq0 keyboardUtils) {
            Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(keyboardUtils, "keyboardUtils");
            this.f25731a = adTuneContainer;
            this.f25732b = dialog;
            this.f25733c = keyboardUtils;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            float rawY = event.getRawY();
            int action = event.getAction();
            if (action == 0) {
                this.f25734d = rawY;
                return true;
            }
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                float f4 = this.f25734d;
                if (rawY > f4) {
                    this.f25731a.setTranslationY(rawY - f4);
                } else {
                    this.f25731a.setTranslationY(0.0f);
                }
            } else if (rawY > this.f25734d) {
                this.f25733c.getClass();
                hq0.a(view);
                c10.a(this.f25732b);
            }
            return true;
        }
    }

    public /* synthetic */ C1922fb() {
        this(new C2203rb(), new hq0());
    }

    public final void a(@NotNull ViewGroup adTuneContainer, @NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f25727a.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        View findViewById = adTuneContainer.findViewById(R.id.adtune_drag_view_container);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new b(adTuneContainer, dialog, this.f25728b));
        }
        this.f25727a.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ViewGroup viewGroup = (ViewGroup) adTuneContainer.findViewById(R.id.adtune_background_view);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new a(dialog, this.f25728b));
        }
    }

    public C1922fb(@NotNull C2203rb adtuneViewProvider, @NotNull hq0 keyboardUtils) {
        Intrinsics.checkNotNullParameter(adtuneViewProvider, "adtuneViewProvider");
        Intrinsics.checkNotNullParameter(keyboardUtils, "keyboardUtils");
        this.f25727a = adtuneViewProvider;
        this.f25728b = keyboardUtils;
    }
}
