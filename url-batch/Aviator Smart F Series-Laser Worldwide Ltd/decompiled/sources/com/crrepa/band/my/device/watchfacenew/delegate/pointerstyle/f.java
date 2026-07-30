package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.core.graphics.drawable.DrawableCompat;
import com.crrepa.band.my.databinding.LayoutNewWatchFacePointerPreviewBinding;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.ClockPointerModel;
import com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.squareup.picasso.Picasso;
import java.io.File;

/* loaded from: classes2.dex */
public class f implements b {
    private final LayoutNewWatchFacePointerPreviewBinding binding;
    private final boolean isFromHomePage;

    public f(LayoutNewWatchFacePointerPreviewBinding layoutNewWatchFacePointerPreviewBinding, boolean z7) {
        this.binding = layoutNewWatchFacePointerPreviewBinding;
        this.isFromHomePage = z7;
        boolean z8 = !z7;
        layoutNewWatchFacePointerPreviewBinding.includeLabel0.dragLayout.setDragEnabled(z8);
        layoutNewWatchFacePointerPreviewBinding.includeLabel1.dragLayout.setDragEnabled(z8);
        layoutNewWatchFacePointerPreviewBinding.includeLabel2.dragLayout.setDragEnabled(z8);
        layoutNewWatchFacePointerPreviewBinding.includeLabel3.dragLayout.setDragEnabled(z8);
    }

    private void renderIvTint(ImageView imageView, @ColorInt int i8) {
        Drawable drawable;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        DrawableCompat.setTint(DrawableCompat.wrap(drawable).mutate(), i8);
    }

    private void resizeIvLabel(ImageView imageView, int i8) {
        int i9;
        int i10;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        if (i8 == 7) {
            if (this.isFromHomePage) {
                i9 = 42;
                i10 = 12;
            } else {
                i9 = 68;
                i10 = 21;
            }
        } else if (this.isFromHomePage) {
            i9 = 36;
            i10 = 6;
        } else {
            i9 = 48;
            i10 = 9;
        }
        layoutParams.width = com.moyoung.dafit.module.common.utils.o.dp2px(com.moyoung.dafit.module.common.utils.d.get(), i9);
        layoutParams.height = com.moyoung.dafit.module.common.utils.o.dp2px(com.moyoung.dafit.module.common.utils.d.get(), i10);
        imageView.setLayoutParams(layoutParams);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void renderLabelColor(int i8) {
        renderIvTint(this.binding.includeLabel0.ivLabel, i8);
        renderIvTint(this.binding.includeLabel1.ivLabel, i8);
        renderIvTint(this.binding.includeLabel2.ivLabel, i8);
        renderIvTint(this.binding.includeLabel3.ivLabel, i8);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void renderLabelContent(int i8, int i9, int i10) {
        ImageView imageView = i8 == 1 ? this.binding.includeLabel1.ivLabel : i8 == 2 ? this.binding.includeLabel2.ivLabel : i8 == 3 ? this.binding.includeLabel3.ivLabel : this.binding.includeLabel0.ivLabel;
        int gePointerLabelResources = ClockPointerModel.gePointerLabelResources(i9);
        if (gePointerLabelResources < 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageResource(gePointerLabelResources);
        renderIvTint(imageView, i10);
        resizeIvLabel(imageView, i9);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void renderLabelXY(int i8, int i9, int i10, int i11) {
        DraggableLinearLayout draggableLinearLayout = i8 == 1 ? this.binding.includeLabel1.dragLayout : i8 == 2 ? this.binding.includeLabel2.dragLayout : i8 == 3 ? this.binding.includeLabel3.dragLayout : this.binding.includeLabel0.dragLayout;
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            if (i9 == 7) {
                if (this.isFromHomePage) {
                    i10 -= 5;
                    i11 += 8;
                } else {
                    i10 -= 10;
                    i11 += 2;
                }
            } else if (this.isFromHomePage) {
                i10 -= 7;
                i11 += 7;
            }
        } else if (i9 == 7) {
            if (this.isFromHomePage) {
                i10 += 20;
                i11 += 8;
            } else {
                i10 -= 10;
            }
        } else if (this.isFromHomePage) {
            i10 += 20;
        }
        draggableLinearLayout.setPositionInParent(i10, i11);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void renderPointerPreviewImg(File file) {
        if (file == null || !file.exists()) {
            this.binding.ivPointer.setVisibility(8);
        } else {
            this.binding.ivPointer.setVisibility(0);
            Picasso.get().load(file).into(this.binding.ivPointer);
        }
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void showPointerLabel(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo, float f8) {
        renderLabelColor(cRPJieliWatchFaceLayoutInfo.getElementColor());
        showPointerLabel(cRPJieliWatchFaceLayoutInfo, 0, f8);
        showPointerLabel(cRPJieliWatchFaceLayoutInfo, 1, f8);
        showPointerLabel(cRPJieliWatchFaceLayoutInfo, 2, f8);
        showPointerLabel(cRPJieliWatchFaceLayoutInfo, 3, f8);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    public void showPointerLabel(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo, int i8, float f8) {
        int elementColor = cRPJieliWatchFaceLayoutInfo.getElementColor();
        CRPJieliWatchFaceLayoutInfo.ElementBean elementBean = cRPJieliWatchFaceLayoutInfo.getElementArray()[i8];
        renderLabelContent(i8, elementBean.getType(), elementColor);
        renderLabelXY(i8, elementBean.getType(), (int) (elementBean.getX() * f8), (int) (elementBean.getY() * f8));
    }
}
