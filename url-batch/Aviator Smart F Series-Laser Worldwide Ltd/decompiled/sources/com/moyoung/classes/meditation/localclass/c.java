package com.moyoung.classes.meditation.localclass;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class c {
    public static final float MAX_BLUR_RADIUS = 25.0f;

    public static Bitmap bitmap2Blur(View view, float f8) {
        return bitmap2Blur(view.getContext(), getBitmapByView(view), f8);
    }

    private static Bitmap getBitmapByView(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static void imageViewBlurEffect(ImageView imageView, float f8) {
        RenderEffect createBlurEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            createBlurEffect = RenderEffect.createBlurEffect(f8, f8, Shader.TileMode.CLAMP);
            imageView.setRenderEffect(createBlurEffect);
            return;
        }
        try {
            imageView.setBackground(new BitmapDrawable(imageView.getResources(), bitmap2Blur(imageView, f8)));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static Bitmap bitmap2Blur(Context context, Bitmap bitmap, float f8) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        RenderScript create = RenderScript.create(context);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        create2.setRadius(f8);
        createFromBitmap2.copyTo(createBitmap);
        create.destroy();
        return createBitmap;
    }
}
