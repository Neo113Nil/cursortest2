package com.aiming.mdt.a;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.aiming.mdt.a.ʻʾʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0086 extends RelativeLayout {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String f215 = "AdMarketView";

    public C0086(Context context) {
        super(context);
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        int i = (int) (((getContext().getResources().getDisplayMetrics().densityDpi / 160.0f) * 15.0f) + 0.5f);
        imageView.getLayoutParams().width = i;
        imageView.getLayoutParams().height = i;
        byte[] decode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAACQAAAAkCAMAAADW3miqAAAAolBMVEUAAAAAAAD9/f3s7OzKysr4+PiEhIT8/Pzz8/Otra0zMzMZGRn+/v7g4ODY2Ni3t7eZmZlgYGDw8PDW1taQkJBVVVX+/v719fXp6enNzc2Xl5fu7u7q6uoAAAD5+fn19fXU1NTJycmmpqaHh4clJSUAAADi4uLc3NzIyMi7u7u5ubl9fX1GRkYAAAAAAAAAAADl5eXQ0NDBwcFtbW0AAAD///+0S2RyAAAANXRSTlNNAPnare949+eRWlP+yLyahWjiuoBk/OrVr4Pb10Px67erjXpVG8nBq56cdV9KNCvNs6RuGTtgcKgAAAFiSURBVDjLzZPpdoIwEIVDCIJCReuKiPtS1673/V+tDXPMJFIP/dn7h5M5X8gsd8S/V0NNAymDqWo8RJoRjKLmr8jABzD0e0ot/CEAf1Bl1jNgnrbo0ErnwKzyZl8iUTGfY5VA9l2mG0J23FBHIuw6ER+YiDtNAN+pC1DlDxe73RPpIIQC7BojjGKdSAjWz3GEyOohkOrvChg9l5prSKQAV6iQlLWPEcbmmu5EAmWgMWV4BtqCdAKonrGBAvQE/X19az9BPQQGkljSvZk479tabwS9QNoQ3V6IDUgMuc8dylo+O1of/JybeG5FBpy43QIdf2dPUAuGUG4z28CJ58bNdMdSEY+FB3wnHjBbJalaJUEuSBdjupXLrCzTFca+yDaMbDJY9r3eTB4CwfG2CMcACNniW2PznFZqme3Llcotg3vFH5bT29prntGaZ9RDhrxXUSuPqFrI+yrqoFLba3F5zHwDIdYwMTtbGdcAAAAASUVORK5CYII=", 0);
        imageView.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
        imageView.bringToFront();
        imageView.setOnClickListener(new ViewOnClickListenerC0074(this));
    }
}
