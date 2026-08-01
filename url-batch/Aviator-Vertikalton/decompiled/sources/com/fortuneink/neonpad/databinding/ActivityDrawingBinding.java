package com.fortuneink.neonpad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fortuneink.neonpad.DrawingCanvasView;
import com.fortuneink.neonpad.R;
import com.google.android.material.button.MaterialButton;
import i1.m;

/* loaded from: classes.dex */
public final class ActivityDrawingBinding {
    public final LinearLayout actionRow;
    public final ImageButton backButton;
    public final MaterialButton brushMedium;
    public final LinearLayout brushRow;
    public final MaterialButton brushThick;
    public final MaterialButton brushThin;
    public final MaterialButton clearButton;
    public final LinearLayout colorRow;
    public final DrawingCanvasView drawingCanvas;
    private final LinearLayout rootView;
    public final MaterialButton saveButton;
    public final View swatchCyan;
    public final View swatchLime;
    public final View swatchMagenta;
    public final View swatchOrange;
    public final View swatchPurple;
    public final View swatchRed;
    public final View swatchWhite;
    public final View swatchYellow;
    public final TextView titleText;
    public final LinearLayout topBar;

    private ActivityDrawingBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, MaterialButton materialButton, LinearLayout linearLayout3, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, LinearLayout linearLayout4, DrawingCanvasView drawingCanvasView, MaterialButton materialButton5, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, TextView textView, LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.actionRow = linearLayout2;
        this.backButton = imageButton;
        this.brushMedium = materialButton;
        this.brushRow = linearLayout3;
        this.brushThick = materialButton2;
        this.brushThin = materialButton3;
        this.clearButton = materialButton4;
        this.colorRow = linearLayout4;
        this.drawingCanvas = drawingCanvasView;
        this.saveButton = materialButton5;
        this.swatchCyan = view;
        this.swatchLime = view2;
        this.swatchMagenta = view3;
        this.swatchOrange = view4;
        this.swatchPurple = view5;
        this.swatchRed = view6;
        this.swatchWhite = view7;
        this.swatchYellow = view8;
        this.titleText = textView;
        this.topBar = linearLayout5;
    }

    public static ActivityDrawingBinding bind(View view) {
        View h;
        View h2;
        View h3;
        View h4;
        View h5;
        View h6;
        View h7;
        View h8;
        int i = R.id.actionRow;
        LinearLayout linearLayout = (LinearLayout) m.h(view, i);
        if (linearLayout != null) {
            i = R.id.backButton;
            ImageButton imageButton = (ImageButton) m.h(view, i);
            if (imageButton != null) {
                i = R.id.brushMedium;
                MaterialButton materialButton = (MaterialButton) m.h(view, i);
                if (materialButton != null) {
                    i = R.id.brushRow;
                    LinearLayout linearLayout2 = (LinearLayout) m.h(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.brushThick;
                        MaterialButton materialButton2 = (MaterialButton) m.h(view, i);
                        if (materialButton2 != null) {
                            i = R.id.brushThin;
                            MaterialButton materialButton3 = (MaterialButton) m.h(view, i);
                            if (materialButton3 != null) {
                                i = R.id.clearButton;
                                MaterialButton materialButton4 = (MaterialButton) m.h(view, i);
                                if (materialButton4 != null) {
                                    i = R.id.colorRow;
                                    LinearLayout linearLayout3 = (LinearLayout) m.h(view, i);
                                    if (linearLayout3 != null) {
                                        i = R.id.drawingCanvas;
                                        DrawingCanvasView drawingCanvasView = (DrawingCanvasView) m.h(view, i);
                                        if (drawingCanvasView != null) {
                                            i = R.id.saveButton;
                                            MaterialButton materialButton5 = (MaterialButton) m.h(view, i);
                                            if (materialButton5 != null && (h = m.h(view, (i = R.id.swatchCyan))) != null && (h2 = m.h(view, (i = R.id.swatchLime))) != null && (h3 = m.h(view, (i = R.id.swatchMagenta))) != null && (h4 = m.h(view, (i = R.id.swatchOrange))) != null && (h5 = m.h(view, (i = R.id.swatchPurple))) != null && (h6 = m.h(view, (i = R.id.swatchRed))) != null && (h7 = m.h(view, (i = R.id.swatchWhite))) != null && (h8 = m.h(view, (i = R.id.swatchYellow))) != null) {
                                                i = R.id.titleText;
                                                TextView textView = (TextView) m.h(view, i);
                                                if (textView != null) {
                                                    i = R.id.topBar;
                                                    LinearLayout linearLayout4 = (LinearLayout) m.h(view, i);
                                                    if (linearLayout4 != null) {
                                                        return new ActivityDrawingBinding((LinearLayout) view, linearLayout, imageButton, materialButton, linearLayout2, materialButton2, materialButton3, materialButton4, linearLayout3, drawingCanvasView, materialButton5, h, h2, h3, h4, h5, h6, h7, h8, textView, linearLayout4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityDrawingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDrawingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.activity_drawing, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
