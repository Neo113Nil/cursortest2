package com.aiming.mdt.adt.interactive;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.aiming.mdt.adt.interactive.ʼʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0210 extends RelativeLayout {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static final AtomicInteger f715 = new AtomicInteger(1);

    /* renamed from: ʻ, reason: contains not printable characters */
    private ImageView f716;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private EnumC0211 f717;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.aiming.mdt.adt.interactive.ʼʽʾ$ʻʽ, reason: contains not printable characters */
    public static final class EnumC0211 {

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public static final EnumC0211 f718 = new EnumC0211("BACK", 0);

        /* renamed from: ʼ, reason: contains not printable characters */
        private static EnumC0211 f719 = new EnumC0211("CLOSE", 1);

        static {
            EnumC0211[] enumC0211Arr = {f718, f719};
        }

        private EnumC0211(String str, int i) {
        }
    }

    public C0210(Context context) {
        super(context);
        this.f716 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f) + 0.5f), (int) (((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f) + 0.5f));
        layoutParams.addRule(13);
        addView(this.f716, layoutParams);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static int m809() {
        int i;
        int i2;
        do {
            i = f715.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f715.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m810(EnumC0211 enumC0211) {
        this.f717 = enumC0211;
        int i = (int) (((getContext().getResources().getDisplayMetrics().densityDpi / 160.0f) * 36.0f) + 0.5f);
        this.f716.getLayoutParams().width = i;
        this.f716.getLayoutParams().height = i;
        ImageView imageView = this.f716;
        byte[] decode = Base64.decode(this.f717.equals(EnumC0211.f718) ? "iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAG1BMVEUAAAAzMzM2NjY0NDQzMzM4ODgzMzM0NDQzMzPciteJAAAACXRSTlMA/lHYGQruYighBah6AAAAS0lEQVRIx2MYBaOApoA1gAhFahmE1TAJihNWpChoSoRBwg5EGGQyatDINSgMYRBhRZRbx6A4atSoUSiFGOXFIaJgJVxEj4JRQEsAAOYOEBOOQ7hTAAAAAElFTkSuQmCC" : "iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAMFBMVEUAAAA0NDQ0NDQ5OTkzMzMzMzMzMzMzMzMzMzMzMzMzMzM1NTU2NjY0NDQ2NjYzMzOtBEhrAAAAD3RSTlMAnc4SX6Rv5t+vh2BHQSGi0fSdAAAArUlEQVRIx+3QsQkCQRBG4TlEYyvQEoTLzK4by7ACsQTtQEuwCQs58EwUxuVnuYvGh8bzogmGb5m1LMv+aHee5u0hWNr34zjbDMHSxZdWa/0dLDXej5B3FrQWJehhFlMIiSJIFEKiCBKFkChBQA2CiCoQNXe/GtV6ORAqp3nP0KsciFDXEKU/KhRB+naERBEkCiFRBIn6ChF1ElSpZ7B0FFSp6L37bZoXK8uy7Pc+RU5X+mkNWt0AAAAASUVORK5CYII=", 0);
        imageView.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }
}
