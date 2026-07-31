package com.bytedance.sdk.component.nps.zmn;

import com.bytedance.sdk.component.nps.fs.zn;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class fs extends zmn {
    public abstract void zmn(zn znVar, IOException iOException, com.bytedance.sdk.component.nps.fs fsVar);

    @Override // com.bytedance.sdk.component.nps.zmn.zmn
    public void zmn(zn znVar, IOException iOException) {
        zmn(znVar, iOException, null);
    }
}
