package io.flutter.plugin.platform;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class h {
    private final P1.k createArgsCodec;

    public h(P1.t tVar) {
        this.createArgsCodec = tVar;
    }

    public abstract g create(Context context, int i3, Object obj);

    public final P1.k getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
