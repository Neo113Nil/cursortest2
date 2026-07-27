package androidx.datastore.preferences.protobuf;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum r0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0212g.f4436c),
    ENUM(null),
    MESSAGE(null);

    r0(Serializable serializable) {
    }
}
