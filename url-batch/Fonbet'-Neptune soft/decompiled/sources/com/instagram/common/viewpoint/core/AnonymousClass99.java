package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.extractor.ExtractorsFactory;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.99, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass99 {
    public static byte[] A08;
    public static String[] A09 = {"634gowWrnODsCbHJW3RM2adSB8UjvpNK", "SJrAWOr70TCHX", "EwIuJu9eGNp0k", "E6EVZDT", "sHeITXs", "FXQ6HdUX", "YL7g5rxYaYN1DF5ZV43is2fGGs0zV37S", "j2oNEgxbTlE4krYsb5twTfwtoUHd8Sk9"};
    public InterfaceC0334Ca A02;
    public String A05;
    public final InterfaceC01644w A06;
    public final Object A07;
    public C9U A01 = C9R.A01();
    public InterfaceC0389Ed A03 = new C1635le();
    public int A00 = 1048576;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1754")
    public InterfaceC1506jM<InterfaceExecutorC0411Ez> A04 = new InterfaceC1506jM() { // from class: com.facebook.ads.redexgen.X.mH
        @Override // com.instagram.common.viewpoint.core.InterfaceC1506jM
        public final Object get() {
            return AnonymousClass99.A01();
        }
    };

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A09[7].charAt(23) != 't') {
                throw new RuntimeException();
            }
            A09[4] = "2gbF6ls";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
            i4++;
        }
    }

    public static void A03() {
        A08 = new byte[]{Ascii.DC4, 35, 35, 62, 35, 113, 56, Utf8.REPLACEMENT_BYTE, 34, 37, 48, Utf8.REPLACEMENT_BYTE, 37, 56, 48, 37, 56, Utf8.REPLACEMENT_BYTE, 54, 113, Ascii.NAK, 52, 55, 48, 36, Base64.padSymbol, 37, Ascii.DC4, 41, 37, 35, 48, 50, 37, 62, 35, 34, Ascii.ETB, 48, 50, 37, 62, 35, 40, 106, 102, 100, 39, 111, 104, 106, 108, 107, 102, 102, 98, 39, 104, 109, 122, 39, 104, 103, 109, 123, 102, 96, 109, 113, 39, 100, 108, 109, 96, 104, 58, 39, 108, 113, 125, 123, 104, 106, 125, 102, 123, 39, 77, 108, 111, 104, 124, 101, 125, 76, 113, 125, 123, 104, 106, 125, 102, 123, 122, 79, 104, 106, 125, 102, 123, 112};
    }

    static {
        A03();
    }

    public AnonymousClass99(InterfaceC01644w interfaceC01644w) {
        this.A06 = interfaceC01644w;
    }

    public static /* synthetic */ C1683mR A00(InterfaceC0439Gb interfaceC0439Gb, C02327m c02327m) {
        return new C1683mR(interfaceC0439Gb);
    }

    public static /* synthetic */ InterfaceExecutorC0411Ez A01() {
        return null;
    }

    @MetaExoPlayerCustomization("Custom reflection logic to avoid loading DefaultExtractorsFactory")
    public final AnonymousClass98 A04(Uri uri) {
        String A02 = A02(0, 44, 75);
        if (this.A02 == null) {
            try {
                Constructor<? extends ExtractorsFactory> constructor = Class.forName(A02(44, 67, 19)).asSubclass(InterfaceC0439Gb.class).getConstructor(new Class[0]);
                final InterfaceC0439Gb interfaceC0439Gb = (InterfaceC0439Gb) constructor.newInstance(new Object[0]);
                this.A02 = new InterfaceC0334Ca() { // from class: com.facebook.ads.redexgen.X.mI
                    @Override // com.instagram.common.viewpoint.core.InterfaceC0334Ca
                    public final InterfaceC0335Cb A5P(C02327m c02327m) {
                        return AnonymousClass99.A00(InterfaceC0439Gb.this, c02327m);
                    }
                };
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(A02, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(A02, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(A02, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(A02, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(A02, e5);
            }
        }
        return new AnonymousClass98(new C2I().A00(uri).A02(this.A05).A01(this.A07).A05(), this.A06, this.A02, this.A01, this.A03, this.A00, null);
    }
}
