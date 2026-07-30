package defpackage;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xw2 extends Fragment implements m01 {
    public final Map rtx2ld2ELZv4 = Collections.synchronizedMap(new ka(0));

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.rtx2ld2ELZv4.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.rtx2ld2ELZv4.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry entry : this.rtx2ld2ELZv4.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle.getBundle((String) entry.getKey());
            }
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator it = this.rtx2ld2ELZv4.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Iterator it = this.rtx2ld2ELZv4.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.rtx2ld2ELZv4.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).getClass();
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Iterator it = this.rtx2ld2ELZv4.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        Iterator it = this.rtx2ld2ELZv4.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }
}
