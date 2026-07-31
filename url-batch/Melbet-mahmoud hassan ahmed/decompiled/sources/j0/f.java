package j0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import d0.j;

/* loaded from: classes.dex */
public class f extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    private static final String f18067i = j.f("StorageNotLowTracker");

    public f(Context context, n0.a aVar) {
        super(context, aVar);
    }

    @Override // j0.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // j0.c
    public void h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        j.c().a(f18067i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        d(bool);
    }

    @Override // j0.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent registerReceiver = this.f18055b.registerReceiver(null, g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
