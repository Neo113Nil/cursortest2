package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.35, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass35 {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public HashMap<C1802oH, C1797oC> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0P();
    }

    public static String A0H(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0R, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{Utf8.REPLACEMENT_BYTE, Base64.padSymbol, 44, 40, 53, 51, 50, 53, 50, 59};
    }

    @Deprecated
    public AnonymousClass35() {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = MetaExoPlayerCustomizedCollections.A01();
        this.A0D = 0;
        this.A0L = MetaExoPlayerCustomizedCollections.A01();
        this.A0I = MetaExoPlayerCustomizedCollections.A01();
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = MetaExoPlayerCustomizedCollections.A01();
        this.A0K = MetaExoPlayerCustomizedCollections.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public AnonymousClass35(Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public AnonymousClass35(Bundle bundle) {
        List A01;
        this.A06 = bundle.getInt(C1795oA.A0e, C1795oA.A0U.A06);
        this.A05 = bundle.getInt(C1795oA.A0d, C1795oA.A0U.A05);
        this.A04 = bundle.getInt(C1795oA.A0c, C1795oA.A0U.A04);
        this.A03 = bundle.getInt(C1795oA.A0b, C1795oA.A0U.A03);
        this.A0A = bundle.getInt(C1795oA.A0i, C1795oA.A0U.A0A);
        this.A09 = bundle.getInt(C1795oA.A0h, C1795oA.A0U.A09);
        this.A08 = bundle.getInt(C1795oA.A0n(), C1795oA.A0U.A08);
        this.A07 = bundle.getInt(C1795oA.A0f, C1795oA.A0U.A07);
        this.A0F = bundle.getInt(C1795oA.A0v, C1795oA.A0U.A0F);
        this.A0E = bundle.getInt(C1795oA.A0t, C1795oA.A0U.A0E);
        this.A0Q = bundle.getBoolean(C1795oA.A0u, C1795oA.A0U.A0Q);
        this.A0M = AbstractC0303Am.A07((String[]) AbstractC1493j1.A00(bundle.getStringArray(C1795oA.A0p), new String[0]));
        this.A0D = bundle.getInt(C1795oA.A0q, C1795oA.A0U.A0D);
        String[] preferredVideoLanguages1 = (String[]) AbstractC1493j1.A00(bundle.getStringArray(C1795oA.A0o), new String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        String[] preferredVideoLanguages12 = new String[0];
        this.A0I = A0G((String[]) AbstractC1493j1.A00(bundle.getStringArray(C1795oA.A0j), preferredVideoLanguages12));
        this.A0B = bundle.getInt(C1795oA.A0l, C1795oA.A0U.A0B);
        this.A02 = bundle.getInt(C1795oA.A0a, C1795oA.A0U.A02);
        this.A01 = bundle.getInt(C1795oA.A0Z, C1795oA.A0U.A01);
        String[] preferredVideoLanguages13 = new String[0];
        this.A0J = AbstractC0303Am.A07((String[]) AbstractC1493j1.A00(bundle.getStringArray(C1795oA.A0k), preferredVideoLanguages13));
        String[] preferredVideoLanguages14 = new String[0];
        this.A0K = A0G((String[]) AbstractC1493j1.A00(bundle.getStringArray(C1795oA.A0m), preferredVideoLanguages14));
        this.A0C = bundle.getInt(C1795oA.A0n, C1795oA.A0U.A0C);
        this.A00 = bundle.getInt(C1795oA.A0e(), C1795oA.A0U.A00);
        this.A0P = bundle.getBoolean(C1795oA.A0s, C1795oA.A0U.A0P);
        this.A0O = bundle.getBoolean(C1795oA.A0X, C1795oA.A0U.A0O);
        this.A0N = bundle.getBoolean(C1795oA.A0W, C1795oA.A0U.A0N);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C1795oA.A0r);
        if (parcelableArrayList == null) {
            A01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = C3S.A01(C1797oC.A02, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i = 0; i < A01.size(); i++) {
            C1797oC c1797oC = (C1797oC) A01.get(i);
            this.A0G.put(c1797oC.A00, c1797oC);
        }
        int[] iArr = (int[]) AbstractC1493j1.A00(bundle.getIntArray(C1795oA.A0V), new int[0]);
        this.A0H = new HashSet<>();
        for (int i2 : iArr) {
            this.A0H.add(Integer.valueOf(i2));
        }
    }

    public AnonymousClass35(C1795oA c1795oA) {
        A0R(c1795oA);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static AbstractC0303Am<String> A0G(String[] strArr) {
        C00791h A01 = AbstractC0303Am.A01();
        for (String str : (String[]) C3M.A01(strArr)) {
            A01.A04(AbstractC01484a.A0k((String) C3M.A01(str)));
        }
        return A01.A05();
    }

    private void A0Q(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC01484a.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0H(0, 10, 126))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = AbstractC0303Am.A04(AbstractC01484a.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(C1795oA c1795oA) {
        this.A06 = c1795oA.A06;
        this.A05 = c1795oA.A05;
        this.A04 = c1795oA.A04;
        this.A03 = c1795oA.A03;
        this.A0A = c1795oA.A0A;
        this.A09 = c1795oA.A09;
        this.A08 = c1795oA.A08;
        this.A07 = c1795oA.A07;
        this.A0F = c1795oA.A0F;
        this.A0E = c1795oA.A0E;
        this.A0Q = c1795oA.A0Q;
        this.A0M = c1795oA.A0M;
        this.A0D = c1795oA.A0D;
        this.A0L = c1795oA.A0L;
        this.A0I = c1795oA.A0I;
        this.A0B = c1795oA.A0B;
        this.A02 = c1795oA.A02;
        this.A01 = c1795oA.A01;
        this.A0J = c1795oA.A0J;
        this.A0K = c1795oA.A0K;
        this.A0C = c1795oA.A0C;
        this.A00 = c1795oA.A00;
        this.A0P = c1795oA.A0P;
        this.A0O = c1795oA.A0O;
        this.A0N = c1795oA.A0N;
        this.A0H = new HashSet<>(c1795oA.A0H);
        this.A0G = new HashMap<>(c1795oA.A0G);
    }

    public AnonymousClass35 A0W(C1795oA c1795oA) {
        A0R(c1795oA);
        return this;
    }

    public AnonymousClass35 A0m(int i, int i2, boolean z) {
        this.A0F = i;
        this.A0E = i2;
        this.A0Q = z;
        return this;
    }

    public AnonymousClass35 A0n(Context context) {
        if (AbstractC01484a.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public AnonymousClass35 A0o(Context context, boolean z) {
        Point viewportSize = AbstractC01484a.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z);
    }

    public C1795oA A0p() {
        return new C1795oA(this);
    }
}
