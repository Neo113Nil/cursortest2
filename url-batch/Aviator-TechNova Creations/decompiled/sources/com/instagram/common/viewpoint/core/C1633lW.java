package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.lW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1633lW implements FT, DisplayManager.DisplayListener {
    public static byte[] A02;
    public FS A00;
    public final DisplayManager A01;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{Ascii.SI, Ascii.DC4, Ascii.RS, Ascii.ESC, Ascii.ETB, Ascii.FF, 36};
    }

    public C1633lW(DisplayManager displayManager) {
        this.A01 = displayManager;
    }

    private Display A00() {
        return this.A01.getDisplay(0);
    }

    public static C1633lW A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 65));
        if (displayManager != null) {
            return new C1633lW(displayManager);
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.FT
    public final void AGn(FS fs) {
        this.A00 = fs;
        this.A01.registerDisplayListener(this, AbstractC01484a.A0Y());
        fs.ACz(A00());
    }

    @Override // com.instagram.common.viewpoint.core.FT
    public final void AJl() {
        this.A01.unregisterDisplayListener(this);
        this.A00 = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (this.A00 != null && i == 0) {
            this.A00.ACz(A00());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
