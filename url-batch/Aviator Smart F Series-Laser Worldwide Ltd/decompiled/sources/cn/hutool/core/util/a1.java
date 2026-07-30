package cn.hutool.core.util;

import cn.hutool.core.io.IORuntimeException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes.dex */
public class a1 {
    public static <T> T clone(T t7) {
        if (t7 instanceof Serializable) {
            return (T) deserialize(serialize(t7), new Class[0]);
        }
        return null;
    }

    public static <T> T deserialize(byte[] bArr, Class<?>... clsArr) {
        try {
            return (T) cn.hutool.core.io.n.readObj(new cn.hutool.core.io.t(new ByteArrayInputStream(bArr), clsArr));
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static <T> byte[] serialize(T t7) {
        if (!(t7 instanceof Serializable)) {
            return null;
        }
        cn.hutool.core.io.d dVar = new cn.hutool.core.io.d();
        cn.hutool.core.io.n.writeObjects(dVar, false, (Serializable) t7);
        return dVar.toByteArray();
    }
}
