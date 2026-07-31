package com.applovin.impl;

import android.text.SpannedString;
import com.applovin.impl.r2;

/* loaded from: classes10.dex */
public class v4 extends r2 {
    public v4(String str) {
        super(r2.c.SECTION);
        this.c = new SpannedString(str);
    }

    public String toString() {
        return "SectionListItemViewModel{text=" + ((Object) this.c) + "}";
    }
}
