package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgx implements ImageDecoder$OnHeaderDecodedListener {
    private final big a = big.a();
    private final int b;
    private final int c;
    private final baw d;
    private final bhu e;
    private final boolean f;
    private final bbm g;

    public bgx(int i, int i2, bbl bblVar) {
        this.b = i;
        this.c = i2;
        this.d = (baw) bblVar.b(bhx.a);
        this.e = (bhu) bblVar.b(bhu.g);
        bbk bbkVar = bhx.d;
        boolean z = false;
        if (bblVar.b(bbkVar) != null && ((Boolean) bblVar.b(bbkVar)).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.g = (bbm) bblVar.b(bhx.b);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        boolean isWideGamut;
        big bigVar = this.a;
        int i = this.b;
        int i2 = this.c;
        if (bigVar.b(i, i2, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == baw.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new bgw());
        size = imageInfo.getSize();
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float a = this.e.a(size.getWidth(), size.getHeight(), i, i2);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * a), Math.round(a * size.getHeight()));
        bbm bbmVar = this.g;
        if (bbmVar != null) {
            if (bbmVar == bbm.b) {
                colorSpace2 = imageInfo.getColorSpace();
                if (colorSpace2 != null) {
                    colorSpace3 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace3.isWideGamut();
                    if (isWideGamut) {
                        named = ColorSpace.Named.DISPLAY_P3;
                        colorSpace = ColorSpace.get(named);
                        imageDecoder.setTargetColorSpace(colorSpace);
                    }
                }
            }
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            imageDecoder.setTargetColorSpace(colorSpace);
        }
    }
}
