package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byh {
    public final byd a;
    public final bzk b;
    public int c = 0;
    public final int d;
    public final brn e;

    public byh(bzk bzkVar, byd bydVar, brn brnVar) {
        this.a = bydVar;
        this.b = bzkVar;
        this.e = brnVar;
        this.d = bzkVar.b.size();
    }

    public static Button a(bd bdVar) {
        return (Button) bdVar.J().findViewById(R.id.next_button);
    }

    public static Button b(bd bdVar) {
        return (Button) bdVar.J().findViewById(R.id.prev_button);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0101, code lost:
    
        throw new java.lang.IllegalArgumentException("The region must fit inside the matrix");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        ImageView imageView = (ImageView) this.a.J().findViewById(R.id.export_qr_code_image);
        String uri = new Uri.Builder().scheme("otpauth-migration").authority("offline").appendQueryParameter("data", Base64.encodeToString(((bmu) this.b.b.get(this.c)).f(), 2)).build().toString();
        her herVar = cbm.a;
        try {
            her herVar2 = cbm.a;
            if (uri.isEmpty()) {
                throw new IllegalArgumentException("Found empty contents");
            }
            jph jphVar = jph.L;
            int i = 4;
            if (herVar2 != null) {
                joy joyVar = joy.a;
                if (herVar2.containsKey(joyVar)) {
                    jphVar = (jph) Enum.valueOf(jph.class, herVar2.get(joyVar).toString());
                }
                joy joyVar2 = joy.g;
                if (herVar2.containsKey(joyVar2)) {
                    i = Integer.parseInt(herVar2.get(joyVar2).toString());
                }
            }
            jpl jplVar = jpm.b(uri, jphVar, herVar2).e;
            if (jplVar == null) {
                throw new IllegalStateException();
            }
            int i2 = jplVar.b;
            int i3 = jplVar.c;
            int i4 = i + i;
            int i5 = i2 + i4;
            int i6 = i4 + i3;
            int max = Math.max(600, i5);
            int max2 = Math.max(600, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (i2 * min)) / 2;
            int i8 = (max2 - (i3 * min)) / 2;
            jpb jpbVar = new jpb(max, max2);
            int i9 = 0;
            loop0: while (true) {
                byte b = 1;
                if (i9 >= i3) {
                    boolean z = true;
                    int i10 = jpbVar.a;
                    int i11 = jpbVar.b;
                    int[] iArr = new int[i10 * i11];
                    for (int i12 = 0; i12 < i11; i12++) {
                        int i13 = i12 * i10;
                        int i14 = 0;
                        while (i14 < i10) {
                            boolean z2 = z;
                            iArr[i13 + i14] = z2 != jpbVar.a(i14, i12) ? -1 : -16777216;
                            i14++;
                            z = z2;
                        }
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    createBitmap.setPixels(iArr, 0, i10, 0, 0, i10, i11);
                    imageView.setImageBitmap(createBitmap);
                    return;
                }
                int i15 = i7;
                int i16 = 0;
                while (i16 < i2) {
                    if (jplVar.a(i16, i9) == b) {
                        if (i8 < 0 || i15 < 0) {
                            break loop0;
                        }
                        if (min <= 0) {
                            throw new IllegalArgumentException("Height and width must be at least 1");
                        }
                        int i17 = i15 + min;
                        int i18 = i8 + min;
                        if (i18 > jpbVar.b || i17 > jpbVar.a) {
                            break loop0;
                        }
                        int i19 = i8;
                        while (i19 < i18) {
                            int i20 = jpbVar.c * i19;
                            byte b2 = b;
                            int i21 = i15;
                            while (i21 < i17) {
                                jpl jplVar2 = jplVar;
                                int[] iArr2 = jpbVar.d;
                                int i22 = i20 + (i21 >> 5);
                                iArr2[i22] = iArr2[i22] | (b2 << (i21 & 31));
                                i21++;
                                jplVar = jplVar2;
                            }
                            i19++;
                            b = b2;
                        }
                    }
                    i16++;
                    i15 += min;
                    b = b;
                    jplVar = jplVar;
                }
                i9++;
                i8 += min;
            }
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } catch (joz e) {
            throw new IllegalStateException(e);
        }
    }
}
