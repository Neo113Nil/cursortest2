package com.crrepa.a1;

import com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback;
import java.io.File;

/* loaded from: classes2.dex */
public class b extends f {
    @Override // com.crrepa.a1.f
    public void a(final File file) {
        startTimer();
        com.crrepa.f0.a.a().a(new CRPJieliDfuPackageLengthCallback() { // from class: com.crrepa.a1.a
            @Override // com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback
            public final void onPackageLength(int i8) {
                b.this.a(file, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, int i8) {
        com.crrepa.f0.a.a().b();
        createFileManager(file, 0);
        setPacketLength(i8);
        if (this.mTransFileManager != null) {
            startTrans();
        } else {
            onError(1, false);
        }
    }
}
