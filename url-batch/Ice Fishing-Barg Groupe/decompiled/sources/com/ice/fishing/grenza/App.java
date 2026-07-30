package com.ice.fishing.grenza;

import android.app.Application;
import defpackage.i2;
import defpackage.jg0;
import defpackage.o9;
import defpackage.q9;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class App extends Application implements jg0 {
    public boolean rtx2ld2ELZv4 = false;
    public final q9 OPXfSBeufaJ8 = new q9(new i2(13, this));

    @Override // defpackage.jg0
    public final Object Y1f8riQaR6yg() {
        return this.OPXfSBeufaJ8.Y1f8riQaR6yg();
    }

    @Override // android.app.Application
    public final void onCreate() {
        if (!this.rtx2ld2ELZv4) {
            this.rtx2ld2ELZv4 = true;
            ((o9) this.OPXfSBeufaJ8.Y1f8riQaR6yg()).getClass();
        }
        super.onCreate();
    }
}
