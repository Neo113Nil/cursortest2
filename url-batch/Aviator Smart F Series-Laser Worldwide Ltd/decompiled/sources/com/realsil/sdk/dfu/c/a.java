package com.realsil.sdk.dfu.c;

import com.realsil.sdk.dfu.image.BinIndicator;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class a extends com.realsil.sdk.dfu.d.c {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f15707a;

    static {
        ArrayList arrayList = new ArrayList();
        f15707a = arrayList;
        arrayList.add(new BinIndicator(0, "Patch (Both MP and OTA)", "", -1, true, 7));
        arrayList.add(new BinIndicator(1, "App bank 0 image (Both MP and OTA)", "", -1, true, 7));
        arrayList.add(new BinIndicator(2, "APP bank 1 image (OTA)", "", -1, true, 7));
        arrayList.add(new BinIndicator(3, "User data (MP)", (String) null, -1, true, 7));
        arrayList.add(new BinIndicator(4, "Patch extension image (Both MP and OTA)", "", -1, true, 7));
        arrayList.add(new BinIndicator(5, "Config file (MP)", "", -1, true, 7));
        arrayList.add(new BinIndicator(6, "External Flash (MP)", "", -1, true, 7));
    }

    public static BinIndicator a(int i8) {
        ArrayList arrayList = f15707a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            BinIndicator binIndicator = (BinIndicator) obj;
            if (binIndicator.bitNumber == i8) {
                return binIndicator;
            }
        }
        return null;
    }

    public static BinIndicator b(int i8) {
        ArrayList arrayList = f15707a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            BinIndicator binIndicator = (BinIndicator) obj;
            if (binIndicator.imageId == i8) {
                return binIndicator;
            }
        }
        return null;
    }
}
