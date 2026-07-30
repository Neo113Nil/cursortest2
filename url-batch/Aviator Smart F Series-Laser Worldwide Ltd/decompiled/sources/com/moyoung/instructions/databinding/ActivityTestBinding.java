package com.moyoung.instructions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.instructions.R$id;
import com.moyoung.instructions.R$layout;

/* loaded from: classes4.dex */
public final class ActivityTestBinding implements ViewBinding {

    @NonNull
    public final Button btn1;

    @NonNull
    public final Button btn2;

    @NonNull
    public final Button btn3;

    @NonNull
    public final Button btn4;

    @NonNull
    public final Button btn5;

    @NonNull
    public final Button btn6;

    @NonNull
    public final Button btn7;

    @NonNull
    public final Button btn8;

    @NonNull
    public final Button btn9;

    @NonNull
    public final LinearLayout main;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvMain;

    @NonNull
    public final TextView title;

    private ActivityTestBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull Button button5, @NonNull Button button6, @NonNull Button button7, @NonNull Button button8, @NonNull Button button9, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.btn1 = button;
        this.btn2 = button2;
        this.btn3 = button3;
        this.btn4 = button4;
        this.btn5 = button5;
        this.btn6 = button6;
        this.btn7 = button7;
        this.btn8 = button8;
        this.btn9 = button9;
        this.main = linearLayout2;
        this.rvMain = recyclerView;
        this.title = textView;
    }

    @NonNull
    public static ActivityTestBinding bind(@NonNull View view) {
        int i8 = R$id.btn_1;
        Button button = (Button) ViewBindings.findChildViewById(view, i8);
        if (button != null) {
            i8 = R$id.btn_2;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i8);
            if (button2 != null) {
                i8 = R$id.btn_3;
                Button button3 = (Button) ViewBindings.findChildViewById(view, i8);
                if (button3 != null) {
                    i8 = R$id.btn_4;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, i8);
                    if (button4 != null) {
                        i8 = R$id.btn_5;
                        Button button5 = (Button) ViewBindings.findChildViewById(view, i8);
                        if (button5 != null) {
                            i8 = R$id.btn_6;
                            Button button6 = (Button) ViewBindings.findChildViewById(view, i8);
                            if (button6 != null) {
                                i8 = R$id.btn_7;
                                Button button7 = (Button) ViewBindings.findChildViewById(view, i8);
                                if (button7 != null) {
                                    i8 = R$id.btn_8;
                                    Button button8 = (Button) ViewBindings.findChildViewById(view, i8);
                                    if (button8 != null) {
                                        i8 = R$id.btn_9;
                                        Button button9 = (Button) ViewBindings.findChildViewById(view, i8);
                                        if (button9 != null) {
                                            LinearLayout linearLayout = (LinearLayout) view;
                                            i8 = R$id.rv_main;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
                                            if (recyclerView != null) {
                                                i8 = R$id.title;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                                                if (textView != null) {
                                                    return new ActivityTestBinding(linearLayout, button, button2, button3, button4, button5, button6, button7, button8, button9, linearLayout, recyclerView, textView);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityTestBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTestBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_test, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
