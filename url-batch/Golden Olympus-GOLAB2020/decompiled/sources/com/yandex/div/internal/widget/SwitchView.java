package com.yandex.div.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.U;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import e.AbstractC2405a;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class SwitchView extends FrameLayout {

    @NotNull
    private static final int[] CHECKED;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final int[] DEFAULT;

    @NotNull
    private static final int[] DISABLED;

    @NotNull
    private static final int[][] STATES_ARRAY;

    @Nullable
    private Integer colorOn;

    /* renamed from: switch, reason: not valid java name */
    @NotNull
    private final U f4switch;

    @NotNull
    private final int[] thumbTintColors;

    @NotNull
    private final int[] trackTintColors;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        int[] iArr = {-16842910};
        DISABLED = iArr;
        int[] iArr2 = {R.attr.state_checked};
        CHECKED = iArr2;
        int[] iArr3 = new int[0];
        DEFAULT = iArr3;
        STATES_ARRAY = new int[][]{iArr, iArr2, iArr3};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        U u4 = new U(context);
        this.f4switch = u4;
        this.trackTintColors = new int[3];
        this.thumbTintColors = new int[3];
        u4.setShowText(false);
        u4.setBackground(NoOpDrawable.INSTANCE);
        addView(u4, new FrameLayout.LayoutParams(-2, -2, 17));
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwitchView._init_$lambda$1(SwitchView.this, view);
            }
        });
        fillDefaultColors();
        updateTints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SwitchView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.forwardClicksToSwitch();
    }

    private final int applyAlpha(int i4, float f4) {
        return setAlpha(i4, (int) (Color.alpha(i4) * f4));
    }

    private final void changeTints() {
        Integer num = this.colorOn;
        if (num != null) {
            int intValue = num.intValue();
            this.thumbTintColors[1] = intValue;
            this.trackTintColors[1] = applyAlpha(intValue, 0.3f);
            updateTints();
        }
    }

    private final void fillDefaultColors() {
        TypedValue typedValue = new TypedValue();
        int colorFromTheme = getColorFromTheme(R.attr.colorForeground, typedValue, false);
        int colorFromTheme2 = getColorFromTheme(R.attr.colorControlActivated, typedValue, false);
        int colorFromTheme3 = getColorFromTheme(AbstractC2405a.f36208v, typedValue, true);
        this.trackTintColors[1] = applyAlpha(colorFromTheme2, 0.3f);
        this.trackTintColors[2] = setAlpha(colorFromTheme, 0.3f);
        this.trackTintColors[0] = setAlpha(colorFromTheme, 0.1f);
        int[] iArr = this.thumbTintColors;
        iArr[1] = colorFromTheme2;
        iArr[2] = colorFromTheme3;
        iArr[0] = lightenColor(colorFromTheme3, 0.5f);
    }

    private final void forwardClicksToSwitch() {
        if (isEnabled()) {
            this.f4switch.performClick();
        }
    }

    private final int getColorFromTheme(int i4, TypedValue typedValue, boolean z4) {
        if (getContext().getTheme().resolveAttribute(i4, typedValue, true)) {
            return (!z4 || typedValue.resourceId == 0) ? typedValue.data : androidx.core.content.a.d(getContext(), typedValue.resourceId);
        }
        return 0;
    }

    public static /* synthetic */ void getThumbTintList$div_release$annotations() {
    }

    public static /* synthetic */ void getTrackTintList$div_release$annotations() {
    }

    private final int lightenColor(int i4, float f4) {
        return androidx.core.graphics.a.c(i4, -1, f4);
    }

    private final int setAlpha(int i4, int i5) {
        return Color.argb(i5, Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCheckedChangeListener$lambda$2(Function1 listener, CompoundButton compoundButton, boolean z4) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.invoke(Boolean.valueOf(z4));
    }

    private final void updateTints() {
        U u4 = this.f4switch;
        int[][] iArr = STATES_ARRAY;
        u4.setTrackTintList(new ColorStateList(iArr, this.trackTintColors));
        this.f4switch.setThumbTintList(new ColorStateList(iArr, this.thumbTintColors));
    }

    @Nullable
    public final Integer getColorOn() {
        return this.colorOn;
    }

    @Nullable
    public final ColorStateList getThumbTintList$div_release() {
        return this.f4switch.getThumbTintList();
    }

    @Nullable
    public final ColorStateList getTrackTintList$div_release() {
        return this.f4switch.getTrackTintList();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f4switch.isEnabled();
    }

    public final void setChecked(boolean z4) {
        this.f4switch.setChecked(z4);
    }

    public final void setColorOn(@Nullable Integer num) {
        this.colorOn = num;
        changeTints();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        this.f4switch.setEnabled(z4);
    }

    public final void setOnCheckedChangeListener(@NotNull final Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f4switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.div.internal.widget.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                SwitchView.setOnCheckedChangeListener$lambda$2(Function1.this, compoundButton, z4);
            }
        });
    }

    private final int setAlpha(int i4, float f4) {
        return setAlpha(i4, (int) (f4 * KotlinVersion.MAX_COMPONENT_VALUE));
    }
}
