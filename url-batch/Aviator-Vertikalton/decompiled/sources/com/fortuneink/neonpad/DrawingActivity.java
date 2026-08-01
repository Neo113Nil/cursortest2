package com.fortuneink.neonpad;

import K0.k;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.G;
import c.AbstractC0096c;
import com.fortuneink.neonpad.databinding.ActivityDrawingBinding;
import com.google.android.material.button.MaterialButton;
import g.AbstractActivityC0158k;
import java.util.List;

/* loaded from: classes.dex */
public final class DrawingActivity extends AbstractActivityC0158k {
    private final N0.b binding$delegate;
    private final N0.b brushButtons$delegate;
    private final AbstractC0096c permissionLauncher = registerForActivityResult(new G(2), new k(this));
    private MaterialButton selectedBrush;
    private View selectedSwatch;
    private final N0.b swatchViews$delegate;

    public DrawingActivity() {
        final int i = 0;
        this.binding$delegate = new N0.d(new W0.a(this) { // from class: com.fortuneink.neonpad.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrawingActivity f1707b;

            {
                this.f1707b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityDrawingBinding binding_delegate$lambda$0;
                List swatchViews_delegate$lambda$1;
                List brushButtons_delegate$lambda$2;
                switch (i) {
                    case 0:
                        binding_delegate$lambda$0 = DrawingActivity.binding_delegate$lambda$0(this.f1707b);
                        return binding_delegate$lambda$0;
                    case 1:
                        swatchViews_delegate$lambda$1 = DrawingActivity.swatchViews_delegate$lambda$1(this.f1707b);
                        return swatchViews_delegate$lambda$1;
                    default:
                        brushButtons_delegate$lambda$2 = DrawingActivity.brushButtons_delegate$lambda$2(this.f1707b);
                        return brushButtons_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        this.swatchViews$delegate = new N0.d(new W0.a(this) { // from class: com.fortuneink.neonpad.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrawingActivity f1707b;

            {
                this.f1707b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityDrawingBinding binding_delegate$lambda$0;
                List swatchViews_delegate$lambda$1;
                List brushButtons_delegate$lambda$2;
                switch (i2) {
                    case 0:
                        binding_delegate$lambda$0 = DrawingActivity.binding_delegate$lambda$0(this.f1707b);
                        return binding_delegate$lambda$0;
                    case 1:
                        swatchViews_delegate$lambda$1 = DrawingActivity.swatchViews_delegate$lambda$1(this.f1707b);
                        return swatchViews_delegate$lambda$1;
                    default:
                        brushButtons_delegate$lambda$2 = DrawingActivity.brushButtons_delegate$lambda$2(this.f1707b);
                        return brushButtons_delegate$lambda$2;
                }
            }
        });
        final int i3 = 2;
        this.brushButtons$delegate = new N0.d(new W0.a(this) { // from class: com.fortuneink.neonpad.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrawingActivity f1707b;

            {
                this.f1707b = this;
            }

            @Override // W0.a
            public final Object a() {
                ActivityDrawingBinding binding_delegate$lambda$0;
                List swatchViews_delegate$lambda$1;
                List brushButtons_delegate$lambda$2;
                switch (i3) {
                    case 0:
                        binding_delegate$lambda$0 = DrawingActivity.binding_delegate$lambda$0(this.f1707b);
                        return binding_delegate$lambda$0;
                    case 1:
                        swatchViews_delegate$lambda$1 = DrawingActivity.swatchViews_delegate$lambda$1(this.f1707b);
                        return swatchViews_delegate$lambda$1;
                    default:
                        brushButtons_delegate$lambda$2 = DrawingActivity.brushButtons_delegate$lambda$2(this.f1707b);
                        return brushButtons_delegate$lambda$2;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptSave() {
        if (!getBinding().drawingCanvas.hasContent()) {
            Toast.makeText(this, R.string.nothing_to_save, 0).show();
        } else if (Build.VERSION.SDK_INT > 28 || q1.d.k(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            performSave();
        } else {
            this.permissionLauncher.a("android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityDrawingBinding binding_delegate$lambda$0(DrawingActivity drawingActivity) {
        return ActivityDrawingBinding.inflate(drawingActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List brushButtons_delegate$lambda$2(DrawingActivity drawingActivity) {
        return O0.i.c0(new N0.c(drawingActivity.getBinding().brushThin, Float.valueOf(4.0f)), new N0.c(drawingActivity.getBinding().brushMedium, Float.valueOf(8.0f)), new N0.c(drawingActivity.getBinding().brushThick, Float.valueOf(16.0f)));
    }

    private final ActivityDrawingBinding getBinding() {
        return (ActivityDrawingBinding) ((N0.d) this.binding$delegate).a();
    }

    private final List<N0.c> getBrushButtons() {
        return (List) ((N0.d) this.brushButtons$delegate).a();
    }

    private final List<N0.c> getSwatchViews() {
        return (List) ((N0.d) this.swatchViews$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9(DrawingActivity drawingActivity, View view) {
        drawingActivity.getBinding().drawingCanvas.clearCanvas();
    }

    private final void performSave() {
        Bitmap renderToBitmap = getBinding().drawingCanvas.renderToBitmap();
        boolean saveBitmap = GalleryHelper.INSTANCE.saveBitmap(this, renderToBitmap);
        renderToBitmap.recycle();
        if (saveBitmap) {
            Toast.makeText(this, R.string.saved_to_gallery, 0).show();
        } else {
            Toast.makeText(this, R.string.save_failed, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void permissionLauncher$lambda$3(DrawingActivity drawingActivity, boolean z2) {
        if (z2) {
            drawingActivity.performSave();
        } else {
            Toast.makeText(drawingActivity, R.string.permission_required, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectBrush(MaterialButton materialButton, float f2) {
        MaterialButton materialButton2 = this.selectedBrush;
        if (materialButton2 != null) {
            materialButton2.setSelected(false);
        }
        materialButton.setSelected(true);
        this.selectedBrush = materialButton;
        getBinding().drawingCanvas.setStrokeWidth(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectSwatch(View view, int i) {
        View view2 = this.selectedSwatch;
        if (view2 != null) {
            view2.setSelected(false);
        }
        view.setSelected(true);
        this.selectedSwatch = view;
        getBinding().drawingCanvas.setStrokeColor(A.b.a(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List swatchViews_delegate$lambda$1(DrawingActivity drawingActivity) {
        return O0.i.c0(new N0.c(drawingActivity.getBinding().swatchCyan, Integer.valueOf(R.color.neon_cyan)), new N0.c(drawingActivity.getBinding().swatchMagenta, Integer.valueOf(R.color.neon_magenta)), new N0.c(drawingActivity.getBinding().swatchLime, Integer.valueOf(R.color.neon_lime)), new N0.c(drawingActivity.getBinding().swatchYellow, Integer.valueOf(R.color.neon_yellow)), new N0.c(drawingActivity.getBinding().swatchRed, Integer.valueOf(R.color.neon_red)), new N0.c(drawingActivity.getBinding().swatchPurple, Integer.valueOf(R.color.neon_purple)), new N0.c(drawingActivity.getBinding().swatchOrange, Integer.valueOf(R.color.neon_orange)), new N0.c(drawingActivity.getBinding().swatchWhite, Integer.valueOf(R.color.white)));
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getBinding().getRoot());
        final int i = 0;
        getBinding().backButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.fortuneink.neonpad.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrawingActivity f1709b;

            {
                this.f1709b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f1709b.finish();
                        break;
                    case 1:
                        DrawingActivity.onCreate$lambda$9(this.f1709b, view);
                        break;
                    default:
                        this.f1709b.attemptSave();
                        break;
                }
            }
        });
        for (N0.c cVar : getSwatchViews()) {
            Object obj = cVar.f670a;
            X0.f.d(obj, "component1(...)");
            final View view = (View) obj;
            final int intValue = ((Number) cVar.f671b).intValue();
            view.setOnClickListener(new View.OnClickListener() { // from class: com.fortuneink.neonpad.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DrawingActivity.this.selectSwatch(view, intValue);
                }
            });
        }
        View view2 = getBinding().swatchCyan;
        X0.f.d(view2, "swatchCyan");
        selectSwatch(view2, R.color.neon_cyan);
        for (N0.c cVar2 : getBrushButtons()) {
            Object obj2 = cVar2.f670a;
            X0.f.d(obj2, "component1(...)");
            final MaterialButton materialButton = (MaterialButton) obj2;
            final float floatValue = ((Number) cVar2.f671b).floatValue();
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.fortuneink.neonpad.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DrawingActivity.this.selectBrush(materialButton, floatValue);
                }
            });
        }
        MaterialButton materialButton2 = getBinding().brushMedium;
        X0.f.d(materialButton2, "brushMedium");
        selectBrush(materialButton2, 8.0f);
        final int i2 = 1;
        getBinding().clearButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.fortuneink.neonpad.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrawingActivity f1709b;

            {
                this.f1709b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i2) {
                    case 0:
                        this.f1709b.finish();
                        break;
                    case 1:
                        DrawingActivity.onCreate$lambda$9(this.f1709b, view3);
                        break;
                    default:
                        this.f1709b.attemptSave();
                        break;
                }
            }
        });
        final int i3 = 2;
        getBinding().saveButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.fortuneink.neonpad.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrawingActivity f1709b;

            {
                this.f1709b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i3) {
                    case 0:
                        this.f1709b.finish();
                        break;
                    case 1:
                        DrawingActivity.onCreate$lambda$9(this.f1709b, view3);
                        break;
                    default:
                        this.f1709b.attemptSave();
                        break;
                }
            }
        });
    }
}
