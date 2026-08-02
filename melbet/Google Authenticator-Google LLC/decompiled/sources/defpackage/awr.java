package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awr extends awn {
    @Override // defpackage.awn
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r4.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L18;
     */
    @Override // defpackage.awp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object b() {
        Intent registerReceiver = this.a.registerReceiver(null, a());
        boolean z = true;
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (hashCode == -730838620) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.awn
    public final void c(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        asq.a();
        int i = aws.a;
        intent.getAction();
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    f(false);
                }
            } else if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                f(true);
            }
        }
    }
}
