package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.ReportFragment;
import android.arch.lifecycle.c;
import android.arch.lifecycle.e;
import android.arch.lifecycle.f;
import android.os.Bundle;
import android.support.v4.util.SimpleArrayMap;

/* loaded from: classes.dex */
public class SupportActivity extends Activity implements e {
    private SimpleArrayMap<Class<? extends ExtraData>, ExtraData> mExtraDataMap = new SimpleArrayMap<>();
    private f mLifecycleRegistry = new f(this);

    public static class ExtraData {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void putExtraData(ExtraData extraData) {
        this.mExtraDataMap.put(extraData.getClass(), extraData);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.a(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.a(c.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public <T extends ExtraData> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    public c getLifecycle() {
        return this.mLifecycleRegistry;
    }
}
