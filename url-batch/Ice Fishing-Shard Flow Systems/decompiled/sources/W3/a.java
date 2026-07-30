package W3;

import com.onesignal.core.internal.config.b;
import com.onesignal.core.internal.config.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {
    private final c _configModelStore;
    private final I2.a _time;
    private final Map<String, Long> records;

    public a(I2.a _time, c _configModelStore) {
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._time = _time;
        this._configModelStore = _configModelStore;
        this.records = new LinkedHashMap();
    }

    public final void add(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.records.put(key, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long l7 = this.records.get(key);
        if (l7 != null) {
            return this._time.getCurrentTimeMillis() - l7.longValue() >= ((b) this._configModelStore.getModel()).getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long l7 = this.records.get(key);
        if (l7 != null) {
            if (this._time.getCurrentTimeMillis() - l7.longValue() <= ((b) this._configModelStore.getModel()).getOpRepoPostCreateRetryUpTo()) {
                return true;
            }
        }
        return false;
    }
}
