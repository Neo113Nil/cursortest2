package com.yandex.div.core.tooltip;

import O1.Se;
import W1.m;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class TranslateAnimation extends Visibility {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Float percentage;

    @NotNull
    private final Se.c position;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getDefaultTranslation(View view) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            return BaseDivViewExtensionsKt.dpToPxF(10, displayMetrics);
        }

        private Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Se.c.values().length];
            try {
                iArr[Se.c.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Se.c.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Se.c.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Se.c.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Se.c.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Se.c.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Se.c.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Se.c.TOP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Se.c.BOTTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TranslateAnimation(Se.c cVar, Float f4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i4 & 2) != 0 ? null : f4);
    }

    private final float initialDirectionX(Se.c cVar) {
        switch (WhenMappings.$EnumSwitchMapping$0[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 1.0f;
            case 4:
            case 5:
            case 6:
                return -1.0f;
            case 7:
                return 0.5f;
            case 8:
            case 9:
                return 0.0f;
            default:
                throw new m();
        }
    }

    private final float initialDirectionY(Se.c cVar) {
        switch (WhenMappings.$EnumSwitchMapping$0[cVar.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return 1.0f;
            case 2:
            case 5:
                return 0.0f;
            case 3:
            case 6:
            case 9:
                return -1.0f;
            case 7:
                return 0.5f;
            default:
                throw new m();
        }
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(startValues, "startValues");
        Intrinsics.checkNotNullParameter(endValues, "endValues");
        float initialDirectionX = initialDirectionX(this.position);
        float initialDirectionY = initialDirectionY(this.position);
        view.setTranslationX(initialDirectionX * (this.percentage != null ? view.getWidth() * this.percentage.floatValue() : Companion.getDefaultTranslation(view)));
        view.setTranslationY(initialDirectionY * (this.percentage != null ? view.getHeight() * this.percentage.floatValue() : Companion.getDefaultTranslation(view)));
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, view.getTranslationX(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), 0.0f));
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…f\n            )\n        )");
        return ofPropertyValuesHolder;
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(startValues, "startValues");
        Intrinsics.checkNotNullParameter(endValues, "endValues");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f, initialDirectionX(this.position) * (this.percentage != null ? view.getWidth() * this.percentage.floatValue() : Companion.getDefaultTranslation(view))), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, initialDirectionY(this.position) * (this.percentage != null ? view.getHeight() * this.percentage.floatValue() : Companion.getDefaultTranslation(view))));
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…n\n            )\n        )");
        return ofPropertyValuesHolder;
    }

    public TranslateAnimation(@NotNull Se.c position, @Nullable Float f4) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.position = position;
        this.percentage = f4;
    }
}
