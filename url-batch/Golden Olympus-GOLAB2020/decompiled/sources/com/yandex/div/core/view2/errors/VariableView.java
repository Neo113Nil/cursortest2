package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.div.R$drawable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
final class VariableView extends LinearLayout {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final TextView nameText;

    @NotNull
    private Function1<? super String, Unit> onEnterAction;

    @NotNull
    private final TextView typeText;

    @NotNull
    private final EditText valueText;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextView createCell = createCell();
        this.nameText = createCell;
        TextView createCell2 = createCell();
        this.typeText = createCell2;
        EditText createEditableCell = createEditableCell();
        this.valueText = createEditableCell;
        this.onEnterAction = VariableView$onEnterAction$1.INSTANCE;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        addCell(createCell, 200);
        addCell(createCell2, 60);
        addView(createEditableCell, new LinearLayout.LayoutParams(-2, -2, 1.0f));
    }

    private final void addCell(TextView textView, int i4) {
        Integer valueOf = Integer.valueOf(i4);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        addView(textView, new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(valueOf, displayMetrics), -1));
    }

    private final void configureCommon(TextView textView) {
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(8, displayMetrics);
        textView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        textView.setTextColor(-1);
        textView.setBackgroundResource(R$drawable.table_cell_background);
        textView.setHorizontallyScrolling(true);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setMaxLines(1);
    }

    private final TextView createCell() {
        TextView textView = new TextView(getContext());
        configureCommon(textView);
        return textView;
    }

    private final EditText createEditableCell() {
        final EditText editText = new EditText(getContext());
        configureCommon(editText);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.errors.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                boolean createEditableCell$lambda$2$lambda$1;
                createEditableCell$lambda$2$lambda$1 = VariableView.createEditableCell$lambda$2$lambda$1(VariableView.this, editText, textView, i4, keyEvent);
                return createEditableCell$lambda$2$lambda$1;
            }
        });
        return editText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createEditableCell$lambda$2$lambda$1(VariableView this$0, EditText this_apply, TextView textView, int i4, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if ((keyEvent != null && keyEvent.getAction() != 0) || i4 != 6) {
            return false;
        }
        this$0.onEnterAction.invoke(this_apply.getText().toString());
        return true;
    }

    @NotNull
    public final TextView getNameText() {
        return this.nameText;
    }

    @NotNull
    public final TextView getTypeText() {
        return this.typeText;
    }

    @NotNull
    public final EditText getValueText() {
        return this.valueText;
    }

    public final void setOnEnterAction(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onEnterAction = function1;
    }
}
