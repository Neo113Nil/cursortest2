package com.yandex.varioqub.flutter;

import D2.a;
import D2.b;
import com.yandex.varioqub.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public class VarioqubPlugin implements b {
    @Override // D2.b
    public void onAttachedToEngine(a aVar) {
        Pigeon.VarioqubPigeon.setup(aVar.f435c, new VarioqubImpl(aVar.f433a));
    }

    @Override // D2.b
    public void onDetachedFromEngine(a aVar) {
    }
}
