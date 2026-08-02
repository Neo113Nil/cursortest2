package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.AppIntroData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AppIntroData$Panel$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AppIntroData.Panel.Companion.getClass();
        if (i == 1) {
            return AppIntroData.Panel.PANEL1;
        }
        if (i == 2) {
            return AppIntroData.Panel.PANEL2;
        }
        if (i == 3) {
            return AppIntroData.Panel.PANEL3;
        }
        if (i != 4) {
            return null;
        }
        return AppIntroData.Panel.PANEL4;
    }
}
