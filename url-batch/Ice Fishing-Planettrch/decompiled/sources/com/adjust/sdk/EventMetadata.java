package com.adjust.sdk;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class EventMetadata implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("eventSequence", Map.class)};
    private static final long serialVersionUID = 1;
    private Map<String, Integer> eventSequence = new HashMap();

    private void readObject(ObjectInputStream objectInputStream) {
        this.eventSequence = (Map) Util.readObjectField(objectInputStream.readFields(), "eventSequence", new HashMap());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Util.equalObject(this.eventSequence, ((EventMetadata) obj).eventSequence);
    }

    public int hashCode() {
        return Util.hashObject(this.eventSequence, 17);
    }

    public int incrementSequenceForEvent(String str) {
        Integer num = this.eventSequence.get(str);
        int intValue = (num != null ? num.intValue() : 0) + 1;
        this.eventSequence.put(str, Integer.valueOf(intValue));
        return intValue;
    }
}
