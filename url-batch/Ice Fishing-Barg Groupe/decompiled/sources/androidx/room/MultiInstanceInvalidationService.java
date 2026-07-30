package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.p71;
import defpackage.q71;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int rtx2ld2ELZv4;
    public final LinkedHashMap OPXfSBeufaJ8 = new LinkedHashMap();
    public final q71 wdg6QnbFHrFF = new q71(this);
    public final p71 dgRBjINgWbAK = new p71(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.dgRBjINgWbAK;
    }
}
