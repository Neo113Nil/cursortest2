package com.realsil.sdk.dfu.c;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.ImageVersionInfo;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f15717a = RtkDfu.DEBUG_ENABLE;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f15718b = RtkDfu.VDBG;

    public static boolean a(int i8) {
        if (i8 == 4 || i8 == 6 || i8 == 7 || i8 == 8 || i8 == 13 || i8 == 10) {
            return true;
        }
        ZLogger.v(f15718b, String.format("not support section size check for ic:0x%02X", Integer.valueOf(i8)));
        return false;
    }

    public static boolean a(BaseBinInputStream baseBinInputStream, ImageVersionInfo imageVersionInfo) {
        if (imageVersionInfo == null) {
            return true;
        }
        int imageSize = baseBinInputStream.getImageSize();
        if (imageVersionInfo.getSectionSize() > 0 && imageSize > imageVersionInfo.getSectionSize()) {
            ZLogger.w(String.format(Locale.US, "image size(%d) is exceed the limit of section size(%d)", Integer.valueOf(imageSize), Integer.valueOf(imageVersionInfo.getSectionSize())));
            return false;
        }
        ZLogger.v(f15718b, "section size validate ok: " + imageSize);
        return true;
    }
}
