package com.unity3d.player;

import android.view.inputmethod.InputMethodSubtype;

/* renamed from: com.unity3d.player.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0047l {
    public static String a(InputMethodSubtype inputMethodSubtype) {
        if (PlatformSupport.NOUGAT_SUPPORT) {
            return inputMethodSubtype.getLanguageTag();
        }
        return inputMethodSubtype.getLocale();
    }
}
