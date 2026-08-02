package com.squareup.cash.ui.widget.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.SchemaInfoUtilKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.common.ui.R$styleable;
import com.squareup.cash.mooncake.themes.widget.LineHeightReceiver;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public class FigmaTextView extends AppCompatTextView implements LineHeightReceiver {
    public Integer lineHeight;
    public int paddingFudge;
    public SchemaInfoUtilKt userSetPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FigmaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        DimensionKt.initialize(context);
        this.userSetPadding = new FigmaTextView$Padding$PaddingRelative(0, 0, 0, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FigmaTextView);
        obtainStyledAttributes.getClass();
        if (obtainStyledAttributes.hasValue(0)) {
            if (!obtainStyledAttributes.hasValue(0)) {
                a$$ExternalSyntheticBUOutline0.m$3("Attribute not defined in set.");
                throw null;
            }
            setLineHeight(Integer.valueOf(obtainStyledAttributes.getInt(0, 0)));
        }
        obtainStyledAttributes.recycle();
    }

    public final void applyLineHeight(boolean z) {
        Integer num = this.lineHeight;
        if (num == null && z) {
            setLineSpacing(RecyclerView.DECELERATION_RATE, 1.0f);
            updatePaddingFudge();
        } else if (num != null) {
            int fontMetrics = (int) getPaint().getFontMetrics(null);
            if (fontMetrics != num.intValue()) {
                int intValue = num.intValue() - fontMetrics;
                if (intValue < 0) {
                    intValue = 0;
                }
                setLineSpacing(intValue, 1.0f);
            }
            updatePaddingFudge();
        }
    }

    @Override // com.squareup.cash.mooncake.themes.widget.LineHeightReceiver
    public void setLineHeight(Integer num) {
        if (Intrinsics.areEqual(this.lineHeight, num)) {
            return;
        }
        this.lineHeight = num;
        applyLineHeight(true);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.userSetPadding = new FigmaTextView$Padding$PaddingLR(i2, i4, i, i3);
        int i5 = this.paddingFudge;
        super.setPadding(i, i2 + i5, i3, i4 + i5);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        this.userSetPadding = new FigmaTextView$Padding$PaddingRelative(i2, i4, i, i3);
        int i5 = this.paddingFudge;
        super.setPaddingRelative(i, i2 + i5, i3, i4 + i5);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        applyLineHeight(false);
    }

    public final void updatePaddingFudge() {
        this.paddingFudge = (int) (getLineSpacingExtra() / 2.0f);
        SchemaInfoUtilKt schemaInfoUtilKt = this.userSetPadding;
        if (schemaInfoUtilKt instanceof FigmaTextView$Padding$PaddingLR) {
            FigmaTextView$Padding$PaddingLR figmaTextView$Padding$PaddingLR = (FigmaTextView$Padding$PaddingLR) schemaInfoUtilKt;
            setPadding(figmaTextView$Padding$PaddingLR.left, figmaTextView$Padding$PaddingLR.top, figmaTextView$Padding$PaddingLR.right, figmaTextView$Padding$PaddingLR.bottom);
        } else if (!(schemaInfoUtilKt instanceof FigmaTextView$Padding$PaddingRelative)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            FigmaTextView$Padding$PaddingRelative figmaTextView$Padding$PaddingRelative = (FigmaTextView$Padding$PaddingRelative) schemaInfoUtilKt;
            setPaddingRelative(figmaTextView$Padding$PaddingRelative.start, figmaTextView$Padding$PaddingRelative.top, figmaTextView$Padding$PaddingRelative.end, figmaTextView$Padding$PaddingRelative.bottom);
        }
    }

    public /* synthetic */ FigmaTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
