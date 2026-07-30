package com.drake.net.internal;

import android.content.Context;
import androidx.startup.Initializer;
import com.drake.net.NetConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import y5.w;

/* loaded from: classes3.dex */
public final class NetInitializer implements Initializer<w> {
    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ w create(Context context) {
        create2(context);
        return w.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return new ArrayList();
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        s.checkNotNullParameter(context, "context");
        NetConfig.INSTANCE.setApp(context);
    }
}
