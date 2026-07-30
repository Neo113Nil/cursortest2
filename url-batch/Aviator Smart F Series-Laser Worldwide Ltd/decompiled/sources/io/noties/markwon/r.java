package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class r implements q {
    private final Map<o, Object> values = new HashMap(3);

    r() {
    }

    @Override // io.noties.markwon.q
    public <T> void clear(@NonNull o oVar) {
        this.values.remove(oVar);
    }

    @Override // io.noties.markwon.q
    public void clearAll() {
        this.values.clear();
    }

    @Override // io.noties.markwon.q
    @Nullable
    public <T> T get(@NonNull o oVar) {
        return (T) this.values.get(oVar);
    }

    @Override // io.noties.markwon.q
    public <T> void set(@NonNull o oVar, @Nullable T t7) {
        if (t7 == null) {
            this.values.remove(oVar);
        } else {
            this.values.put(oVar, t7);
        }
    }

    @Override // io.noties.markwon.q
    @NonNull
    public <T> T get(@NonNull o oVar, @NonNull T t7) {
        T t8 = (T) this.values.get(oVar);
        return t8 != null ? t8 : t7;
    }
}
