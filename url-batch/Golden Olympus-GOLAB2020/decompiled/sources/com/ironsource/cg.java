package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.BasePlacement;
import com.ironsource.pp;

/* loaded from: classes2.dex */
public interface cg {

    public interface a {
        void a(Context context, String str, IronSource.AD_UNIT ad_unit);

        void c(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit);
    }

    pp.b a(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit);

    boolean b(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit);
}
