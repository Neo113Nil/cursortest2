package u3;

import com.onesignal.core.internal.config.b;
import com.onesignal.core.internal.config.c;
import g2.InterfaceC0391a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692a {
    private final c _configModelStore;
    private final InterfaceC0391a _time;
    private final Map<String, Long> records;

    public C0692a(InterfaceC0391a _time, c _configModelStore) {
        i.e(_time, "_time");
        i.e(_configModelStore, "_configModelStore");
        this._time = _time;
        this._configModelStore = _configModelStore;
        this.records = new LinkedHashMap();
    }

    public final void add(String key) {
        i.e(key, "key");
        this.records.put(key, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(String key) {
        i.e(key, "key");
        Long l7 = this.records.get(key);
        if (l7 != null) {
            return this._time.getCurrentTimeMillis() - l7.longValue() >= ((b) this._configModelStore.getModel()).getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(String key) {
        i.e(key, "key");
        Long l7 = this.records.get(key);
        if (l7 != null) {
            if (this._time.getCurrentTimeMillis() - l7.longValue() <= ((b) this._configModelStore.getModel()).getOpRepoPostCreateRetryUpTo()) {
                return true;
            }
        }
        return false;
    }
}
