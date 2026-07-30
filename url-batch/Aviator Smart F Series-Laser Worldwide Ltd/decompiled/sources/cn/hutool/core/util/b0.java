package cn.hutool.core.util;

import cn.hutool.core.exceptions.UtilException;
import java.util.Hashtable;
import java.util.Map;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

/* loaded from: classes.dex */
public class b0 {
    public static InitialContext createInitialContext(Map<String, String> map) {
        try {
            return cn.hutool.core.map.h1.isEmpty(map) ? new InitialContext() : new InitialContext((Hashtable) cn.hutool.core.convert.d.convert(Hashtable.class, (Object) map));
        } catch (NamingException e8) {
            throw new UtilException((Throwable) e8);
        }
    }

    public static InitialDirContext createInitialDirContext(Map<String, String> map) {
        try {
            return cn.hutool.core.map.h1.isEmpty(map) ? new InitialDirContext() : new InitialDirContext((Hashtable) cn.hutool.core.convert.d.convert(Hashtable.class, (Object) map));
        } catch (NamingException e8) {
            throw new UtilException((Throwable) e8);
        }
    }

    public static Attributes getAttributes(String str, String... strArr) {
        try {
            return createInitialDirContext(null).getAttributes(str, strArr);
        } catch (NamingException e8) {
            throw new UtilException((Throwable) e8);
        }
    }
}
