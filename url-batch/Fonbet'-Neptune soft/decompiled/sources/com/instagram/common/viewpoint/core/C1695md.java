package com.instagram.common.viewpoint.core;

import android.database.Cursor;

/* renamed from: com.facebook.ads.redexgen.X.md, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1695md implements BC {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return BB.A00(this);
    }

    public C1695md(Cursor cursor) {
        this.A00 = cursor;
    }

    public final B8 A00() {
        B8 A01;
        A01 = C9H.A01(this.A00);
        return A01;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.instagram.common.viewpoint.core.BC
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.instagram.common.viewpoint.core.BC
    public final boolean moveToPosition(int i) {
        return this.A00.moveToPosition(i);
    }
}
