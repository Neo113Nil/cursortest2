package cn.hutool.core.io;

import cn.hutool.core.collection.CollUtil;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class t extends ObjectInputStream {
    private Set<String> blackClassSet;
    private Set<String> whiteClassSet;

    public t(InputStream inputStream, Class<?>... clsArr) {
        super(inputStream);
        accept(clsArr);
    }

    private void validateClassName(String str) {
        if (CollUtil.isNotEmpty((Collection<?>) this.blackClassSet) && this.blackClassSet.contains(str)) {
            throw new InvalidClassException("Unauthorized deserialization attempt by black list", str);
        }
        if (!CollUtil.isEmpty((Collection<?>) this.whiteClassSet) && !str.startsWith("java.") && !this.whiteClassSet.contains(str)) {
            throw new InvalidClassException("Unauthorized deserialization attempt", str);
        }
    }

    public void accept(Class<?>... clsArr) {
        if (this.whiteClassSet == null) {
            this.whiteClassSet = new HashSet();
        }
        for (Class<?> cls : clsArr) {
            this.whiteClassSet.add(cls.getName());
        }
    }

    public void refuse(Class<?>... clsArr) {
        if (this.blackClassSet == null) {
            this.blackClassSet = new HashSet();
        }
        for (Class<?> cls : clsArr) {
            this.blackClassSet.add(cls.getName());
        }
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        validateClassName(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }
}
