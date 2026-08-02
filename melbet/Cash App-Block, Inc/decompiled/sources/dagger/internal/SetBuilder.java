package dagger.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class SetBuilder {
    public final Object contributions;

    public SetBuilder(int i) {
        this.contributions = new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public void add(Object obj) {
        ArrayList arrayList = (ArrayList) this.contributions;
        if (obj != null) {
            arrayList.add(obj);
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Set contributions cannot be null");
        }
    }

    public void put$dagger$internal$AbstractMapFactory$Builder(Serializable serializable, Provider provider) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.contributions;
        if (provider != null) {
            linkedHashMap.put(serializable, provider);
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("provider");
        }
    }

    public SetBuilder() {
        this.contributions = new ArrayList(9);
    }
}
