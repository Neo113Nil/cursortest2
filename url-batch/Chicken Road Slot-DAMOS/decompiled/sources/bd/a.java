package bd;

import com.onesignal.core.internal.config.b;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    private final b _configModelStore;
    private final sa.a _time;
    private final Map<String, Long> records;

    public a(sa.a aVar, b bVar) {
        aVar.getClass();
        bVar.getClass();
        this._time = aVar;
        this._configModelStore = bVar;
        this.records = new LinkedHashMap();
    }

    public final void add(String str) {
        str.getClass();
        this.records.put(str, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(String str) {
        str.getClass();
        Long l10 = this.records.get(str);
        if (l10 != null) {
            return this._time.getCurrentTimeMillis() - l10.longValue() >= ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(String str) {
        str.getClass();
        Long l10 = this.records.get(str);
        if (l10 != null) {
            if (this._time.getCurrentTimeMillis() - l10.longValue() <= ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getOpRepoPostCreateRetryUpTo()) {
                return true;
            }
        }
        return false;
    }
}
