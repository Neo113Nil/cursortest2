package com.aiming.mdt.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.aiming.mdt.adt.C0239;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.a.ʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0020 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ ViewOnAttachStateChangeListenerC0021 f0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ Bitmap f1;

    RunnableC0020(ViewOnAttachStateChangeListenerC0021 viewOnAttachStateChangeListenerC0021, Bitmap bitmap) {
        this.f0 = viewOnAttachStateChangeListenerC0021;
        this.f1 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RelativeLayout relativeLayout;
        Context context;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        Context context2;
        try {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout = this.f0.f3;
            relativeLayout.setLayoutParams(layoutParams);
            context = ((C0239) this.f0).f755;
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(this.f1);
            relativeLayout2 = this.f0.f3;
            relativeLayout2.addView(imageView);
            imageView.getLayoutParams().width = -1;
            relativeLayout3 = this.f0.f3;
            int width = relativeLayout3.getWidth();
            if (width == 0) {
                context2 = ((C0239) this.f0).f755;
                width = context2.getResources().getDisplayMetrics().widthPixels;
            }
            imageView.getLayoutParams().height = (width * 100) / 640;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setOnClickListener(this.f0);
            ViewOnAttachStateChangeListenerC0021.m6(this.f0);
            this.f0.m856();
        } catch (Exception e) {
            this.f0.m855(e.getMessage());
            C0076.m232().m236(e);
            C0282.m972("Adt-Banner", e);
        }
    }
}
